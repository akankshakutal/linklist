package LinkList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkListTest {
  private SinglyLinkList list;
  private Node node;

  @BeforeEach
  void setUp() {
    list = new SinglyLinkList();
    node = new Node(100);
    list.insertNode(node);
  }

  @Test
  void insertNode() {
    assertTrue(list.insertNode(new Node(10)));
    assertFalse(list.insertNode(new Node(10)));
  }

  @Test
  void deleteNode() {
    assertTrue(list.deleteNode(100));
    assertFalse(list.deleteNode(500));
  }

  @Test
  void insertAfter() {
    assertTrue(list.insertAfter(node, new Node(150)));
    assertFalse(list.insertAfter(new Node(10), new Node(150)));
  }

  @Test
  void insertAtFront() {
    assertTrue(list.insertAtFront(new Node(50)));
  }

  @Test
  void search() {
    Node node = new Node(10);
    list.insertNode(node);
    assertEquals(node, list.search(10));

  }
}