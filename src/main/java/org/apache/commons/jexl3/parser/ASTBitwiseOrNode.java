/* Generated By:JJTree: Do not edit this line. ASTBitwiseOrNode.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.apache.commons.jexl3.parser;

public
class ASTBitwiseOrNode extends JexlNode {
  public ASTBitwiseOrNode(int id) {
    super(id);
  }

  public ASTBitwiseOrNode(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=87f68163493d103a2646d58fb24d0082 (do not edit this line) */