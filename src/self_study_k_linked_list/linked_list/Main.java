package self_study_k_linked_list.linked_list;

public class Main {
    public static void main(String[] args) {
        ListNode head = null;

        head = addFront(head, -4);
        head = addFront(head, 17);
        head = addFront(head, 5);
        head = addFront(head, 12);
        head = addBack(head, 8);

        print(head);
    }

    private static void print(ListNode head) {
        ListNode current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    private static ListNode addFront(ListNode head, int value) {
        ListNode node = new ListNode();
        node.data = value;
        node.next = head;
        return node;
    }

    private static ListNode addBack(ListNode head, int value) {
        ListNode node = new ListNode();
        node.data = value;
        //node.next = null;  null wird als default Wert beim erstellen eines neuen ListNode gesetzt

        //Spezialfall wenn Liste leer ist.
        if(head == null){
            return node;
        }

        //Suche nach dem letzten Node
        ListNode last = head;
        while(last.next != null) {
            last = last.next;
        }

        //Der aktuelle letzte Node zeigt dann auf unseren neuen Node
        last.next = node;

        return head;
    }
}
