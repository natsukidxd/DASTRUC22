public class CircularQueueNode {

    MyNode head, tail;

    public CircularQueueNode() {
        head = null;
        tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public boolean enqueue(Object item) {
        MyNode newNode = new MyNode();
        newNode.item = item;
        if(!isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        return true;
    }
    public boolean dequeue() {
        if(!isEmpty()) {
            if(head != null && head.next == null) {
                head = null;
                tail = null;
            } else {
                head = tail.next;
            }
            return true;
        }
        return false;
    }
    public String toString() {
        String result = "";
        if(!isEmpty()) {
            MyNode tempHead = head;
            while(tempHead.next != null && tempHead.next != head.item) {
                result += "[" + tempHead.item + "] =>";
            }
            return result;
        }
        return null;
    }
}