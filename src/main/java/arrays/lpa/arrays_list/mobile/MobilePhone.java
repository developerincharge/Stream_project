package arrays.lpa.arrays_list.mobile;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;
    private Scanner scanner;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void startPhone() {
        System.out.println("Phone starting...");
        System.out.println("Owner number: " + myNumber);
        printMenu();
    }

    private void printMenu() {
        System.out.println("\nAvailable actions:");
        System.out.println("0 - Shutdown");
        System.out.println("1 - Print contacts");
        System.out.println("2 - Add new contact");
        System.out.println("3 - Update existing contact");
        System.out.println("4 - Remove contact");
        System.out.println("5 - Search for contact");
        System.out.print("Choose your action: ");
    }

    public void processMenu() {
        boolean quit = false;
        while (!quit) {
            printMenu();
            int choice = getIntInput("Enter your choice: ");
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContactFromConsole();
                    break;
                case 3:
                    updateContactFromConsole();
                    break;
                case 4:
                    removeContactFromConsole();
                    break;
                case 5:
                    searchContactFromConsole();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addNewContactFromConsole() {
        System.out.println("\nAdd new contact");
        String name = getStringInput("Enter contact name: ");
        String phone = getStringInput("Enter phone number: ");
        
        if (addNewContact(Contact.createContact(name, phone))) {
            System.out.println("Contact added successfully.");
        } else {
            System.out.println("Contact already exists.");
        }
    }

    private void updateContactFromConsole() {
        System.out.println("\nUpdate contact");
        String name = getStringInput("Enter contact name to update: ");
        Contact existingContact = queryContact(name);
        
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        
        System.out.println("Updating: " + existingContact.getName() + " -> " + existingContact.getPhoneNumber());
        String newName = getStringInput("Enter new name (leave blank to keep current): ");
        String newPhone = getStringInput("Enter new phone number (leave blank to keep current): ");
        
        // Keep current values if blank
        if (newName.trim().isEmpty()) newName = existingContact.getName();
        if (newPhone.trim().isEmpty()) newPhone = existingContact.getPhoneNumber();
        
        if (updateContact(existingContact, Contact.createContact(newName, newPhone))) {
            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Error updating contact.");
        }
    }

    private void removeContactFromConsole() {
        System.out.println("\nRemove contact");
        String name = getStringInput("Enter contact name to remove: ");
        Contact contact = queryContact(name);
        
        if (contact == null) {
            System.out.println("Contact not found.");
            return;
        }
        
        if (removeContact(contact)) {
            System.out.println("Contact removed successfully.");
        } else {
            System.out.println("Error removing contact.");
        }
    }

    private void searchContactFromConsole() {
        System.out.println("\nSearch contact");
        String name = getStringInput("Enter contact name to search: ");
        Contact contact = queryContact(name);
        
        if (contact != null) {
            System.out.println("Contact found:");
            System.out.println(contact.getName() + " -> " + contact.getPhoneNumber());
        } else {
            System.out.println("Contact not found.");
        }
    }

    private String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    // Original MobilePhone methods (unchanged)
    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position < 0) {
            return false;
        }
        myContacts.set(position, newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position < 0) {
            return false;
        }
        myContacts.remove(position);
        return true;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        if (myContacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println((i + 1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}