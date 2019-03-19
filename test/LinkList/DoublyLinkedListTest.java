package LinkList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {
  @Test
  void insertNode() {
    DoublyLinkedList list = new DoublyLinkedList();
    assertTrue(list.insertNode(10));
  }
}