
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Apr 02 13:20:28 PDT 2013
//----------------------------------------------------

package com.biosimilarity.lift.lib.term.Prolog;


/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Apr 02 13:20:28 PDT 2013
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\031\000\002\002\004\000\002\002\003\000\002\002" +
    "\006\000\002\003\003\000\002\003\003\000\002\003\006" +
    "\000\002\003\003\000\002\004\003\000\002\004\005\000" +
    "\002\004\003\000\002\004\003\000\002\004\003\000\002" +
    "\004\003\000\002\005\003\000\002\005\003\000\002\006" +
    "\003\000\002\006\003\000\002\007\004\000\002\007\005" +
    "\000\002\007\007\000\002\007\007\000\002\010\003\000" +
    "\002\010\005\000\002\011\003\000\002\011\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\045\000\020\006\007\013\006\014\005\015\012\016" +
    "\013\017\014\022\011\001\002\000\004\002\047\001\002" +
    "\000\016\002\ufff4\004\ufff4\005\ufff4\010\ufff4\011\ufff4\012" +
    "\ufff4\001\002\000\016\002\ufff3\004\ufff3\005\ufff3\010\ufff3" +
    "\011\ufff3\012\ufff3\001\002\000\004\020\045\001\002\000" +
    "\016\002\ufff8\004\ufff8\005\ufff8\010\ufff8\011\ufff8\012\ufff8" +
    "\001\002\000\016\002\ufffa\004\ufffa\005\ufffa\010\ufffa\011" +
    "\ufffa\012\ufffa\001\002\000\016\002\ufff7\004\ufff7\005\ufff7" +
    "\010\ufff7\011\ufff7\012\ufff7\001\002\000\016\002\ufff6\004" +
    "\ufff6\005\ufff6\010\ufff6\011\ufff6\012\ufff6\001\002\000\016" +
    "\002\ufff5\004\ufff5\005\ufff5\010\ufff5\011\ufff5\012\ufff5\001" +
    "\002\000\006\002\000\004\016\001\002\000\026\006\007" +
    "\007\021\013\006\014\005\015\012\016\013\017\014\021" +
    "\022\022\011\023\020\001\002\000\004\005\044\001\002" +
    "\000\012\005\ufff1\010\ufff1\011\ufff1\012\ufff1\001\002\000" +
    "\030\006\007\007\021\010\035\013\006\014\005\015\012" +
    "\016\013\017\014\021\022\022\011\023\020\001\002\000" +
    "\012\005\ufff2\010\ufff2\011\ufff2\012\ufff2\001\002\000\012" +
    "\005\ufffb\010\ufffb\011\ufffb\012\ufffb\001\002\000\012\005" +
    "\uffea\010\uffea\011\uffea\012\032\001\002\000\014\004\027" +
    "\005\ufffe\010\ufffe\011\ufffe\012\ufffe\001\002\000\012\005" +
    "\ufffd\010\ufffd\011\ufffd\012\ufffd\001\002\000\026\006\007" +
    "\007\021\013\006\014\005\015\012\016\013\017\014\021" +
    "\022\022\011\023\020\001\002\000\004\005\031\001\002" +
    "\000\012\005\ufffc\010\ufffc\011\ufffc\012\ufffc\001\002\000" +
    "\026\006\007\007\021\013\006\014\005\015\012\016\013" +
    "\017\014\021\022\022\011\023\020\001\002\000\010\005" +
    "\uffe9\010\uffe9\011\uffe9\001\002\000\006\010\036\011\037" +
    "\001\002\000\012\005\ufff0\010\ufff0\011\ufff0\012\ufff0\001" +
    "\002\000\012\005\uffef\010\uffef\011\uffef\012\uffef\001\002" +
    "\000\010\007\021\021\022\023\020\001\002\000\004\010" +
    "\043\001\002\000\004\010\042\001\002\000\012\005\uffed" +
    "\010\uffed\011\uffed\012\uffed\001\002\000\012\005\uffee\010" +
    "\uffee\011\uffee\012\uffee\001\002\000\004\002\uffff\001\002" +
    "\000\004\006\046\001\002\000\016\002\ufff9\004\ufff9\005" +
    "\ufff9\010\ufff9\011\ufff9\012\ufff9\001\002\000\004\002\001" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\045\000\010\002\003\004\014\005\007\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\016\003\023\004\024\005\007\006\025\007\022\011" +
    "\016\001\001\000\002\001\001\000\002\001\001\000\016" +
    "\003\023\004\024\005\007\006\025\007\022\011\033\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\016\003\023\004" +
    "\024\005\007\006\025\007\022\011\027\001\001\000\002" +
    "\001\001\000\002\001\001\000\016\003\023\004\024\005" +
    "\007\006\025\007\022\011\032\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\006\040\007\037\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



  public com.biosimilarity.lift.lib.term.Prolog.Absyn.Predicate pPredicate() throws Exception
  {
	java_cup.runtime.Symbol res = parse();
	return (com.biosimilarity.lift.lib.term.Prolog.Absyn.Predicate) res.value;
  }

public <B,A extends java.util.LinkedList<? super B>> A cons_(B x, A xs) { xs.addFirst(x); return xs; }

public void syntax_error(java_cup.runtime.Symbol cur_token)
{
	report_error("Syntax Error, trying to recover and continue parse...", cur_token);
}

public void unrecovered_syntax_error(java_cup.runtime.Symbol cur_token) throws java.lang.Exception
{
	throw new Exception("Unrecoverable Syntax Error");
}


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // ListTerm ::= Term _SYMB_6 ListTerm 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.ListTerm RESULT =null;
		com.biosimilarity.lift.lib.term.Prolog.Absyn.Term p_1 = (com.biosimilarity.lift.lib.term.Prolog.Absyn.Term)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		com.biosimilarity.lift.lib.term.Prolog.Absyn.ListTerm p_3 = (com.biosimilarity.lift.lib.term.Prolog.Absyn.ListTerm)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = p_3; p_3.addFirst(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ListTerm",7, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // ListTerm ::= Term 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.ListTerm RESULT =null;
		com.biosimilarity.lift.lib.term.Prolog.Absyn.Term p_1 = (com.biosimilarity.lift.lib.term.Prolog.Absyn.Term)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new com.biosimilarity.lift.lib.term.Prolog.Absyn.ListTerm(); RESULT.addLast(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ListTerm",7, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // ListPredicate ::= Predicate _SYMB_6 ListPredicate 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.ListPredicate RESULT =null;
		com.biosimilarity.lift.lib.term.Prolog.Absyn.Predicate p_1 = (com.biosimilarity.lift.lib.term.Prolog.Absyn.Predicate)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		com.biosimilarity.lift.lib.term.Prolog.Absyn.ListPredicate p_3 = (com.biosimilarity.lift.lib.term.Prolog.Absyn.ListPredicate)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = p_3; p_3.addFirst(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ListPredicate",6, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // ListPredicate ::= Predicate 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.ListPredicate RESULT =null;
		com.biosimilarity.lift.lib.term.Prolog.Absyn.Predicate p_1 = (com.biosimilarity.lift.lib.term.Prolog.Absyn.Predicate)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new com.biosimilarity.lift.lib.term.Prolog.Absyn.ListPredicate(); RESULT.addLast(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ListPredicate",6, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Lyst ::= _SYMB_3 ListTerm _SYMB_5 Var _SYMB_4 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.Lyst RESULT =null;
		com.biosimilarity.lift.lib.term.Prolog.Absyn.ListTerm p_2 = (com.biosimilarity.lift.lib.term.Prolog.Absyn.ListTerm)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		com.biosimilarity.lift.lib.term.Prolog.Absyn.Var p_4 = (com.biosimilarity.lift.lib.term.Prolog.Absyn.Var)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new com.biosimilarity.lift.lib.term.Prolog.Absyn.ConsV(p_2,p_4); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Lyst",5, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Lyst ::= _SYMB_3 ListTerm _SYMB_5 Lyst _SYMB_4 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.Lyst RESULT =null;
		com.biosimilarity.lift.lib.term.Prolog.Absyn.ListTerm p_2 = (com.biosimilarity.lift.lib.term.Prolog.Absyn.ListTerm)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		com.biosimilarity.lift.lib.term.Prolog.Absyn.Lyst p_4 = (com.biosimilarity.lift.lib.term.Prolog.Absyn.Lyst)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new com.biosimilarity.lift.lib.term.Prolog.Absyn.Cons(p_2,p_4); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Lyst",5, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Lyst ::= _SYMB_3 ListTerm _SYMB_4 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.Lyst RESULT =null;
		com.biosimilarity.lift.lib.term.Prolog.Absyn.ListTerm p_2 = (com.biosimilarity.lift.lib.term.Prolog.Absyn.ListTerm)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new com.biosimilarity.lift.lib.term.Prolog.Absyn.Enum(p_2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Lyst",5, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Lyst ::= _SYMB_3 _SYMB_4 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.Lyst RESULT =null;
		 RESULT = new com.biosimilarity.lift.lib.term.Prolog.Absyn.Empty(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Lyst",5, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Var ::= Wild 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.Var RESULT =null;
		String p_1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new com.biosimilarity.lift.lib.term.Prolog.Absyn.A(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Var",4, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Var ::= UIdent 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.Var RESULT =null;
		String p_1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new com.biosimilarity.lift.lib.term.Prolog.Absyn.V(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Var",4, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Boole ::= _SYMB_7 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.Boole RESULT =null;
		 RESULT = new com.biosimilarity.lift.lib.term.Prolog.Absyn.Absurdity(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Boole",3, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Boole ::= _SYMB_8 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.Boole RESULT =null;
		 RESULT = new com.biosimilarity.lift.lib.term.Prolog.Absyn.Verity(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Boole",3, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Atom ::= _DOUBLE_ 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.Atom RESULT =null;
		Double p_1 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new com.biosimilarity.lift.lib.term.Prolog.Absyn.FltAtm(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Atom",2, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Atom ::= _INTEGER_ 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.Atom RESULT =null;
		Integer p_1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new com.biosimilarity.lift.lib.term.Prolog.Absyn.IntAtm(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Atom",2, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Atom ::= _STRING_ 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.Atom RESULT =null;
		String p_1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new com.biosimilarity.lift.lib.term.Prolog.Absyn.StrAtm(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Atom",2, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Atom ::= Boole 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.Atom RESULT =null;
		com.biosimilarity.lift.lib.term.Prolog.Absyn.Boole p_1 = (com.biosimilarity.lift.lib.term.Prolog.Absyn.Boole)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new com.biosimilarity.lift.lib.term.Prolog.Absyn.BAtm(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Atom",2, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Atom ::= _SYMB_2 _IDENT_ _SYMB_2 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.Atom RESULT =null;
		String p_2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new com.biosimilarity.lift.lib.term.Prolog.Absyn.EAtm(p_2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Atom",2, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Atom ::= LIdent 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.Atom RESULT =null;
		String p_1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new com.biosimilarity.lift.lib.term.Prolog.Absyn.Atm(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Atom",2, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Term ::= Lyst 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.Term RESULT =null;
		com.biosimilarity.lift.lib.term.Prolog.Absyn.Lyst p_1 = (com.biosimilarity.lift.lib.term.Prolog.Absyn.Lyst)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new com.biosimilarity.lift.lib.term.Prolog.Absyn.TList(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Term",1, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Term ::= Atom _SYMB_0 ListTerm _SYMB_1 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.Term RESULT =null;
		com.biosimilarity.lift.lib.term.Prolog.Absyn.Atom p_1 = (com.biosimilarity.lift.lib.term.Prolog.Absyn.Atom)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		com.biosimilarity.lift.lib.term.Prolog.Absyn.ListTerm p_3 = (com.biosimilarity.lift.lib.term.Prolog.Absyn.ListTerm)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new com.biosimilarity.lift.lib.term.Prolog.Absyn.Complex(p_1,p_3); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Term",1, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Term ::= Var 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.Term RESULT =null;
		com.biosimilarity.lift.lib.term.Prolog.Absyn.Var p_1 = (com.biosimilarity.lift.lib.term.Prolog.Absyn.Var)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new com.biosimilarity.lift.lib.term.Prolog.Absyn.VarT(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Term",1, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Term ::= Atom 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.Term RESULT =null;
		com.biosimilarity.lift.lib.term.Prolog.Absyn.Atom p_1 = (com.biosimilarity.lift.lib.term.Prolog.Absyn.Atom)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new com.biosimilarity.lift.lib.term.Prolog.Absyn.TAtom(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Term",1, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Predicate ::= Atom _SYMB_0 ListTerm _SYMB_1 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.Predicate RESULT =null;
		com.biosimilarity.lift.lib.term.Prolog.Absyn.Atom p_1 = (com.biosimilarity.lift.lib.term.Prolog.Absyn.Atom)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		com.biosimilarity.lift.lib.term.Prolog.Absyn.ListTerm p_3 = (com.biosimilarity.lift.lib.term.Prolog.Absyn.ListTerm)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new com.biosimilarity.lift.lib.term.Prolog.Absyn.CPred(p_1,p_3); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Predicate",0, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // Predicate ::= Atom 
            {
              com.biosimilarity.lift.lib.term.Prolog.Absyn.Predicate RESULT =null;
		com.biosimilarity.lift.lib.term.Prolog.Absyn.Atom p_1 = (com.biosimilarity.lift.lib.term.Prolog.Absyn.Atom)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new com.biosimilarity.lift.lib.term.Prolog.Absyn.APred(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Predicate",0, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= Predicate EOF 
            {
              Object RESULT =null;
		com.biosimilarity.lift.lib.term.Prolog.Absyn.Predicate start_val = (com.biosimilarity.lift.lib.term.Prolog.Absyn.Predicate)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

