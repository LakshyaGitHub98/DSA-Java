class Node{
 int data;
 Node next;
 Node prev;
 Node(int data){
    this.data=data;
    this.next=null;
    this.prev=null;
 }   
}
class linked_list{
    Node head;
    public void insert_h(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;

        }
    }
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void insert_n(int data,int n){
        Node newNode=new Node(data);
        if(n==1){
            insert_h(data);
        }
        else{
            Node temp=head;
            for(int i=1;i<n-1 && temp!=null;i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next.prev=newNode;
            temp.next=newNode;
            newNode.prev=temp;            
        }
    }
    public int delete_h(){
        if(head==null){
            return -1;           
        }
        else{
            int data=head.data;
            head=head.next;
            head.prev=null;
            return data;
        }
    }
    public int delete_t(){
        if(head==null){
            return -1;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            int data=temp.data;
            temp.prev.next=null;
            temp.prev=null;
            return data;
        }
    }
    int ll_length(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public int delete(int n){
        if(head==null){
            return -1;
        }
        else{
            if(n==1){
                int data=delete_h();
                return data;
            }
            else if(n==ll_length()){
                int data=delete_t();
                return data;
            }
            else{
                Node temp=head;
                int i=1;
                while(i<n-1 && temp!=null){
                    temp=temp.next;
                    i++;
                }
                if(temp==null){
                    return -1;
                }
                else{
                    int data=temp.next.data;
                    temp.next=temp.next.next;
                    temp.next.prev=temp;
                    return data;
                }
            }
        }
    }

}
public class Doubly_LL {
    public static void main(String[] args) {
        linked_list ll = new linked_list();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert_h(5);
        ll.insert_n(15, 2);
        ll.display();
        System.out.println("Deleted element from head : "+ll.delete_h());
        System.out.println("Deleted element from tail : "+ll.delete_t());
        System.out.println("Deleted element (n:3) : "+ll.delete(3));
        ll.display();   
    }    
    
}
