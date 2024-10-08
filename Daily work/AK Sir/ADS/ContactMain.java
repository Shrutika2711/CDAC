package org.AKSirProject;

import java.util.Scanner;
class Contact {
    String name;
    String phone;
    Contact next; 

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Name: \n" + name + "Phone: " +phone; 
    }
}
class ContactList {
    private Contact head; 
    public void addContact(String name, String phone) {
        Contact newContact = new Contact(name, phone);
        newContact.next = head; 
        head = newContact;      
        System.out.println("Contact added: " + newContact);
    }

    public void removeContact(String name) {
        if (head == null) {
            System.out.println("No contacts available");
            return;
        }//if head reomved
        if (head.name.equalsIgnoreCase(name)) {
            head = head.next; 
            System.out.println("Contact removed: " + name);
            return;
        }
        Contact current = head;
        while (current.next != null && !current.next.name.equalsIgnoreCase(name)) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Contact not found: " + name);
        } else {
            current.next = current.next.next; 
            System.out.println("Contact removed: " + name);
        }
    }
    public void searchContact(String name) {
        Contact current = head;
        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {
                System.out.println("Contact found: " + current);
                return;
            }
            current = current.next;
        }
        System.out.println("Contact not found: " + name);
    }
    public void display() {
        if (head == null) {
            System.out.println("No contacts available.");
            return;
        }

        Contact current = head; 
        System.out.println("Contacts List:");
        while (current != null) {
            System.out.println(current);
            current = current.next; 
        }
    }
}


public class ContactMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactList contactList = new ContactList();

        while (true) {
            
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact by Name");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name1 = scanner.nextLine();
                    System.out.print("Phone: ");
                    String phone1 = scanner.nextLine();
                    contactList.addContact(name1, phone1);
                    break;
                case 2:
                    System.out.print("Enter contact name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    contactList.removeContact(nameToRemove);
                    break;
                case 3:
                    System.out.print("Enter contact name to search: ");
                    String nameToSearch = scanner.nextLine();
                    contactList.searchContact(nameToSearch);
                    break;
                case 4:
                    contactList.display();
                    break;
                case 5:
                    System.out.println("Exit");
                    scanner.close();
                    return; 
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}

