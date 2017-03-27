package test;

import algorith.ListNode;
import algorith.ReverseListByNumber;

public class testReverse {

	static ListNode  head=null;
	public static void main(String[] args) {
		int[] input=new int[]{1,2,3,3,4,4,5};
		ListNode listNode=ListNode.buildListNode(input);
		ListNode.printLinkList(listNode);
		head=listNode;
		int k=3;
		listNode=ReverseListByNumber.reverseKGroup(listNode, k);
		System.out.println("after reverse list group by K");
		ListNode.printLinkList(listNode);
	}
}
