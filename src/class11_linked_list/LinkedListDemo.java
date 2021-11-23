package class11_linked_list;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list2 = new LinkedList();

        addBack(list, 12);
        addFront(list, 5);
        addFront(list, 17);
        addBack(list, -4);
        insert(list, 13, 2);

        addBack(list2, 4);
        addBack(list2, 100);
        addBack(list2, 98);

        print(list);
        print(list2);

        //int size = count(list);

        System.out.printf("List size: %d\n", list.size);
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

    private static int count(LinkedList list) {
        ListNode current = list.head;
        int cnt = 0;
        while(current != null) {
            cnt++;
            current = current.next;
        }

        return cnt;
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

        list.tail.next = newNode;
        list.tail = newNode;
    }
}
