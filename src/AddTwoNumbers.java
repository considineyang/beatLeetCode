public class AddTwoNumbers {



        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode result = new ListNode();
            ListNode tt = result;
            ListNode tw = result;
            int flag = 0;
            while (l1 != null && l2 != null) {
                int temp = 0;
                if ((l1.val + l2.val + flag) >= 10) {
                    temp = (l1.val + l2.val + flag) % 10;
                    flag = 1;
                } else {
                    temp = (l1.val + l2.val + flag);
                    flag = 0;
                }
                result.val = temp;
                l1 = l1.next;
                l2 = l2.next;
                result.next = new ListNode();
                tw = result;
                result = result.next;
            }
            while (l1 != null) {
                int temp = 0;
                if ((l1.val + flag) >= 10) {

                    temp = (l1.val + flag) % 10;
                    flag = 1;
                } else {

                    temp = l1.val + flag;
                    flag = 0;
                }
                result.val = temp;
                result.next = new ListNode();
                l1 = l1.next;
                tw = result;
                result = result.next;
            }
            while (l2 != null) {
                int temp = 0;
                if ((l2.val + flag) >= 10) {

                    temp = (l2.val + flag) % 10;
                    flag = 1;
                } else {

                    temp = l2.val + flag;
                    flag = 0;
                }
                result.val = temp;
                result.next = new ListNode();
                l2 = l2.next;
                tw = result;
                result = result.next;
            }

            if (flag == 1) {
                result.val = 1;
            }

            if (result.val == 0){
                tw.next = null;
            }

            return tt;
        }


    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);

        ListNode result =addTwoNumbers.addTwoNumbers(l1,l2);
        while (result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }

}

 class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}