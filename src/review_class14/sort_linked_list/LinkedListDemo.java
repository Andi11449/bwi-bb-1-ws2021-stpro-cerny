package review_class14.sort_linked_list;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        addBack(list, 12);
        addFront(list, 5);
        addFront(list, 17);
        addBack(list, -4);
        insert(list, 13, 2);
        insert(list, 13, 1);
        addBack(list, 13);

        print(list);

        bubble(list);

        print(list);




    }

    public static void bubble(LinkedList list) {
        boolean swapped;
        int i=0;
        do {
            swapped = false;
            for (int j = 1; j < list.size - i; j++){
                //if (list[j - 1] > list[j]) {
                ListNode first = getNode(list, j - 1);
                ListNode second = getNode(list, j);
                if (first.data < second.data) {
                    //swap(list, j - 1, j);
                    int tmp = first.data;
                    first.data = second.data;
                    second.data = tmp;
                    swapped = true;
                }
            }
            i++;
        } while (swapped);
    }

    /*public static void swap(LinkedList list, int i, int j) {
        ListNode first = getNode(list, i);
        ListNode second = getNode(list, j);

        int tmp = first.data;
        first.data = second.data;
        second.data = tmp;
    }*/

    private static void setValue(LinkedList list, int value, int pos) {
        ListNode node = getNode(list, pos);
        node.data = value;
    }

    private static ListNode getNode(LinkedList list, int pos) {
        if(pos < 0 || pos >= list.size)
            return null;

        ListNode current = list.head;
        for(int i = 0; i < pos; i++){
            current = current.next;
        }

        return current;
    }

    private static int getValue(LinkedList list, int pos) {
        //ListNode current = list.head;
        //for(int i = 0; i < pos; i++){
        //    current = current.next;
        //}
        return getNode(list, pos).data;
    }

    private static void insert(LinkedList list, int value, int pos) {
        if(pos == 0) {
            addFront(list, value);
            return;
        }
        if(pos == list.size-1) {
            addBack(list, value);
            return;
        }

        ListNode current = list.head;
        for(int i = 0; i < pos - 1; i++){
            current = current.next;
        }

        ListNode newNode = new ListNode();
        newNode.data = value;
        newNode.next = current.next;
        current.next = newNode;

        list.size++;
    }

    private static void print(LinkedList list) {
        ListNode current = list.head;
        while(current != null) {
            System.out.printf("%3d ", current.data);
            current = current.next;
        }
        System.out.println();
    }

    private static void addFront(LinkedList list, int value) {
        ListNode newNode = new ListNode();
        newNode.data = value;
        newNode.next = list.head;
        list.size++;

        if(list.head == null)
            list.tail = newNode;


        list.head = newNode;
    }

    private static void addBack(LinkedList list, int value) {
        ListNode newNode = new ListNode();
        newNode.data = value;
        list.size++;

        if(list.head == null){
            list.head = newNode;
            list.tail = newNode;
        }
        else {
            list.tail.next = newNode;
            list.tail = newNode;
        }
    }
}
