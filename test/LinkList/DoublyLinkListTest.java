package LinkList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkListTest {
  @Test
  void insertNode() {
    DoublyLinkList list = new DoublyLinkList();
    assertTrue(list.insertNode(10));
  }
}