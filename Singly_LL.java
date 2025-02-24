class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class linked_list{
    Node head;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void delete_t(){
        Node temp=head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
    public void delete_h(){
        if(head!=null && head.next!=null){
            head = head.next;
        }
    }
    public void delete_t(int data){
        if(head.data == data){
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp.next.data != data){
            temp = temp.next;
        }
        temp.next= temp.next.next;
    }
}
public class Singly_LL {
    public static void main(String[] args) {
        linked_list ll = new linked_list();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.display();
        System.out.println("After deleting tail node : ");
        ll.delete_t();
        ll.display();
        System.out.println("After deleting head node : ");
        ll.delete_h();
        ll.display();
        System.out.println("After deleting node with data 30 : ");
        ll.delete_t(20);
        ll.display();
    }
    
}
