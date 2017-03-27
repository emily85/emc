package algorith;

public class ListNode {
	int val;
	ListNode next;

	ListNode(int x){
	val = x;
	next = null;
	}
	
	public static ListNode buildListNode(int[] input){
        ListNode first = null,last = null,newNode;
        int num;
        if(input.length>0){
            for(int i=0;i<input.length;i++){
                newNode=new ListNode(input[i]);
                newNode.next=null;
                if(first==null){
                    first=newNode;
                    last=newNode;
                }
                else{
                    last.next=newNode;
                    last=newNode;
                }

            }
        }
        return first;
    }
	
	public static void printLinkList(ListNode head)
	{
		while(head.next!=null)
		{
			System.out.print(head.val + "->");
			head=head.next;
		}
		System.out.println(head.val);
	}
}
