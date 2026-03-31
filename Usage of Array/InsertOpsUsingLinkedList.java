import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedLists {
    Node head;

    LinkedLists() {
        this.head = null;
    }

    // Insert at Beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at End
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {   
            current = current.next;
        }
        current.next = newNode;
    }

    // Insert at Position
    public void insertAtPosition(int pos, int data) {
        if (pos < 0) {
            throw new IllegalArgumentException("Position cannot be negative");
        }

        if (pos == 0) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;

        for (int i = 0; i < pos - 1; i++) {
            if (current == null) {   
                throw new IllegalArgumentException("Position not found");
            }
            current = current.next;
        }

        if (current == null) {
            throw new IllegalArgumentException("Position not found");
        }

        newNode.next = current.next;   
        current.next = newNode;
    }

    
    public void printList() {
        Node current = head;
        while (current != null) {   
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class InsertOpsUsingLinkedList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedLists l = new LinkedLists();   

        System.out.print("Enter number of elements: ");
        int n = s.nextInt();

        // Insert at Beginning
        System.out.println("Enter elements (Insert at Beginning):");
        for (int i = 0; i < n; i++) {
            l.insertAtBeginning(s.nextInt());
        }
        System.out.print("List: ");
        l.printList();

        // Insert at End
        System.out.println("Enter elements (Insert at End):");
        for (int i = 0; i < n; i++) {
            l.insertAtEnd(s.nextInt());
        }
        System.out.print("List: ");
        l.printList();

        // Insert at Position
        System.out.print("Enter position and value to insert: ");
        int pos = s.nextInt();
        int val = s.nextInt();
        l.insertAtPosition(pos, val);

        System.out.print("Final List: ");
        l.printList();

        s.close();
    }
}