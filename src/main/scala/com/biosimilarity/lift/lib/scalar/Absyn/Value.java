package com.biosimilarity.lift.lib.scalar.Absyn; // Java Package generated by the BNF Converter.

public class Value extends Expression {
  public final ValueExpr valueexpr_;

  public Value(ValueExpr p1) { valueexpr_ = p1; }

  public <R,A> R accept(com.biosimilarity.lift.lib.scalar.Absyn.Expression.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.lib.scalar.Absyn.Value) {
      com.biosimilarity.lift.lib.scalar.Absyn.Value x = (com.biosimilarity.lift.lib.scalar.Absyn.Value)o;
      return this.valueexpr_.equals(x.valueexpr_);
    }
    return false;
  }

  public int hashCode() {
    return this.valueexpr_.hashCode();
  }


}