package LinkList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DoublyLinkedListTest {
  private DoublyLinkedList<Integer> list;

  @BeforeEach
  void setUp() {
    list = new DoublyLinkedList<>();
  }

  @Test
  void insertNode() {
    assertTrue(list.insertNode(10));
  }

  @Test
  void deleteNode() {
    list.insertNode(10);
    assertTrue(list.deleteNode(10));
  }
}