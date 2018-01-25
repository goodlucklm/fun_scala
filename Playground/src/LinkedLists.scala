class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}

class LinkedLists {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    def myAddTwoNumbers(l1: ListNode, l2: ListNode, carry: Option[Int] = None): ListNode = {
      (l1, l2) match {
        case (null, null) => carry.map(new ListNode(_)).orNull
        case _ =>
          val sum = (if (l1 == null) 0 else l1.x) + (if (l2 == null) 0 else l2.x) + carry.getOrElse(0)
          val next = new ListNode(sum % 10)
          next.next = myAddTwoNumbers(
            if (l1 == null) null else l1.next,
            if (l2 == null) null else l2.next,
            if (sum >= 10) Some(1) else None
          )
        next
      }
    }
    myAddTwoNumbers(l1, l2, None)
  }
}
