public class Main {
    
    public static void main(String[] args) {
        
       // Integer List example
       SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
       
       for(int i = 0; i < 8; ++i) list.insert(i);
       
       System.out.println(list);
       list.reverse();
       System.out.println(list);
       
       // String List example
       SinglyLinkedList<String> list2 = new SinglyLinkedList<String>();
       list2.insert("One");
       list2.insert("Two");
       list2.insert("Three");
       list2.insert("Four");
       
       System.out.println(list2);
       list2.reverse();
       System.out.println(list2);
    }
}

class Node<T> {
    
    public T value;
    public Node<T> next;
    
    public Node(T value) {
        this.value = value;
    }
    
}

class SinglyLinkedList<T> {
    
    public Node<T> head;
    
    public SinglyLinkedList() {}
    
    /*
        Linked List insertion is done at the head of the list
    */
    public void insert(T value) {
        Node<T> new_node = new Node<T>(value);
        
        if(this.head == null) {
            this.head = new_node;
        } else {
            Node<T> temp = this.head;
            this.head = new_node;
            this.head.next = temp;
        }
    }
    
    
    /*
        Reverses the ordering of the linked list
    */
    public void reverse() {
        Node<T> prev = null, next = null;
        while(this.head != null) {
            next = this.head.next;
            this.head.next = prev;
            prev = this.head;
            this.head = next;
        }
        
        this.head = prev;
    }
    
    /*
        Formats the list into a String
    */
    @Override
    public String toString() {
        Node<T> temp = this.head;
        String output = "";
        while(temp.next != null) {
            output = output + temp.value.toString() + "->"; 
            temp = temp.next;
        }
        
        output += temp.value;
        return output;
    }
}
