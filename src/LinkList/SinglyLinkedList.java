package LinkList;

class SinglyLinkedList {

  private Node head, tail;

  boolean insertNode(Node node) {
    if (head == null) {
      head = tail = node;
      return true;
    }
    if (search(node.getData()) != null)
      return false;
    tail.setNext(node);
    tail = node;
    return true;
  }

  boolean deleteNode(int key) {
    Node temp = head, prev = null;

    if (temp != null && temp.getData() == key) {
      head = temp.getNext();
      return true;
    }

    while (temp != null && temp.getData() != key) {
      prev = temp;
      temp = temp.getNext();
    }

    if (temp == null) return false;
    prev.setNext(temp.getNext());
    return false;
  }

  boolean insertAfter(Node prev_node, Node node) {
    if (search(prev_node.getData()) != null) {
      node.setNext(prev_node.getNext());
      prev_node.setNext(node);
      return true;
    }
    return false;
  }

  boolean insertAtFront(Node node) {
    if (head == null) {
      head = node;
      return true;
    }
    node.setNext(head);
    head = node;
    return true;
  }

  Node search(int key) {
    Node current = head;
    while (current != null) {
      if (current.getData() == key) {
        return current;
      }
      current = current.getNext();
    }
    return null;
  }

}
