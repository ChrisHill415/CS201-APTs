public class ListsEqual {
      public int equal (ListNode a1, ListNode a2) {
          
        if(a1 == null && a2 == null)
            return 1;
        if(a1 == null)
            return 0;
        if(a2 == null)
            return 0;
        if(a1.info == a2.info)
            return equal(a1.next,a2.next);
        return 0;
      }
  }