package LinkList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {
  private SinglyLinkedList<Integer> list;

  @BeforeEach
  void setUp() {
    list = new SinglyLinkedList<>();
    list.insertNode(10);
  }

  @Test
  void insertNode() {
    assertTrue(list.insertNode(20));
    assertFalse(list.insertNode(10));
  }

  @Test
  void deleteNode() {
    assertTrue(list.deleteNode(10));
    assertFalse(list.deleteNode(500));
  }

  @Test
  void insertAfter() {
    assertTrue(list.insertAfter(10,20));
    assertFalse(list.insertAfter(150,30));
  }

  @Test
  void insertAtFront() {
    assertTrue(list.insertAtFront(5));
  }


  @Test
  void insertString() {
    SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
    singlyLinkedList.insertNode("Omkar");
    singlyLinkedList.insertNode("Akanksha");
    singlyLinkedList.insertNode("Pratiksha");

  }
}