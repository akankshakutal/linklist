package LinkList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class NodeTest {

  @Test
  void getData() {
    assertEquals(10,new  Node(10).getData());
  }

  @Test
  void getNext() {
    assertNull(new Node(20).getNext());
  }

  @Test
  void setNext() {
    Node node = new Node(10);
    Node node1 = new Node(20);
    node.setNext(node1);
    assertEquals(node1,node.getNext());
  }
}