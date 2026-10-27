public class ListCount {
      public int count (ListNode list) {
        if(list == null)
            return 0;
        return 1 + count(list.next);
      }
  }