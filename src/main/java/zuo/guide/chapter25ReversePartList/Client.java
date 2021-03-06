package zuo.guide.chapter25ReversePartList;

/**
 * 反转部分单向链表
 * 给定一个链表的头节点head,以及两个整数from 和 to ，
 * 在单向链表中把第from 和 to 的这个节点一部分进行反转。
 */
public class Client {

    public static void main(String[] args) {

    }


    /**
     * 1：先判断是否满足1<=from<=to<=N，如果不满足，直接返回原来的头节点
     *
     * 2：找到第from-1个节点pre和第to+1个节点pos，pre即是要反转部分的前一个节点，
     *      pos即是反转部分的后一个节点，把反转的部分先反转，然后正确的连接pre和pos。
     *
     * 3：如果pre为null，说明反转的部分是含有头节点的，则返回的新的节点，即是反转前的最后一个节点，也是反转后的第一个节点，
     *      如果pre不为null，则直接返回旧的头节点。
     *
     * @param head
     * @param from
     * @param to
     * @return
     */
    public Node reversePart(Node head,int from ,int to){
        int count=0;
        //代表to节点的下一个节点
        Node toNext=null;
        //代表form节点的前一个节点
        Node fromPre=null;
        Node cur =head;
        while(cur!=null){
            count++;
            fromPre=count==from-1?cur:fromPre;//如果在len++的过程中，找到了from前一个，那就将pre定为此时累加到的这个节点
            toNext=count==to+1?cur:toNext; //同理，如果在len++过程中找到了to后面的一个，就赋值为当前点，否则均为null
            cur=cur.next;
        }
        if(from>to||from<1||to>count){
            return head;
        }
        cur=fromPre==null?head:fromPre.next;
        Node prev=toNext;
        Node next;
        while(cur!=toNext){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        //头结点不用反转的情况,将不用反转的链表和已经反转后的链表链接起来
        if(fromPre!=null){
            fromPre.next=prev;
            return  head;
        }
        //头结点需要反转的情况，返回新的头结点
        return prev;
    }
}
