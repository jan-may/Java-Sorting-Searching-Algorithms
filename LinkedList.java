public class LinkedList {

    public static void main(String []args) {
        // Write your code here:

    }

    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToHead(String data) {
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }

    public void addToTail(String data) {
        Node tail = this.head;
        if (tail == null) {
            this.head = new Node(data);
        } else {
            while (tail.getNextNode() != null) {
                tail = tail.getNextNode();
            }
            tail.setNextNode(new Node(data));
        }
    }

    public String removeHead() {
        Node removedHead = this.head;
        if (removedHead == null) {
            return null;
        }
        this.head = removedHead.getNextNode();
        return removedHead.data;
    }

    public String printList() {
        String output = "<head> ";
        Node currentNode = this.head;
        while (currentNode != null) {
            output += currentNode.data + " ";
            currentNode = currentNode.getNextNode();
        }
        output += "<tail>";
        System.out.println(output);
        return output;
    }

    public static void swapNodes(LinkedList list, String data1, String data2) {
        System.out.println("Swapping " + data1 + " with " + data2);
        Node node1Prev = null;
        Node node2Prev = null;
        Node node1 = list.head;
        Node node2 = list.head;

        if (data1 == data2) {
            System.out.println("Elements are the same - no swap to be made");
            return;
        }

        while (node1 != null) {
            if (node1.data == data1) {
                break;
            }
            node1Prev = node1;
            node1 = node1.getNextNode();
        }

        while (node2 != null) {
            if (node2.data == data2) {
                break;
            }
            node2Prev = node2;
            node2 = node2.getNextNode();
        }

        if (node1 == null || node2 == null) {
            System.out.println("Swap not possible - one or more element is not in the list");
            return;
        }

        if (node1Prev == null) {
            list.head = node2;
        } else {
            node1Prev.setNextNode(node2);
        }

        if (node2Prev == null) {
            list.head = node1;
        } else {
            node2Prev.setNextNode(node1);
        }

        Node temp = node1.getNextNode();
        node1.setNextNode(node2.getNextNode());
        node2.setNextNode(temp);
    }

    public static Node nthLastNode(LinkedList list, int n) {
        Node current = null;
        Node tailSeeker = list.head;
        int count = 0;
        while (tailSeeker != null) {
            tailSeeker = tailSeeker.getNextNode();
            if (count >= n) {
                if (current == null) {
                    current = list.head;
                }
                current = current.getNextNode();
            }
            count++;
        }
        return current;
    }

    public static Node findMiddle(LinkedList linkedList) {
        // Create your function here:
        Node slowPointer = linkedList.head;
        Node fastPointer = linkedList.head;

        while (fastPointer != null) {
            fastPointer = fastPointer.getNextNode();
            if (fastPointer != null) {
                fastPointer = fastPointer.getNextNode();
                slowPointer = slowPointer.getNextNode();
            }
        }
        return slowPointer;
    }


}