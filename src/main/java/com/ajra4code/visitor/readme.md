# Visitor Pattern

Let's start by describing the scenario and demonstrate what are the problems we are facing.
We are building a html editor in which we have a set of objects collaborating with each others.

- HTMNode : HeadingNode, AnchorNode, NavNode ...
- Document: container of all nodes

Each HTMLNode can perform a set of operations. The problem if in the future we wanna add
more operations such converting the HTMLDocument into a text we need to add the operation
of converting the HTMLNode into text to each one of HTMLNode in the document
which violates the open closed principle 

```

public interface HTMLNode {

public void highlight()
 

}

public class AnchorNode implements HTMLNode{
// code

}

public class HeadingNode implements HTMLNode{
// code

}

public class HTMLDocument{

 private List<HTMLNode> nodes = new ArrayList();
 
 
 public add(HTMLNode node) {
  // code
 }
 
 public void hightlight() {
 
    nodes.foreach(node -> node.highlight())
 }

}
```

## Solution



