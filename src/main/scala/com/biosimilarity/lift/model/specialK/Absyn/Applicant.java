package com.biosimilarity.lift.model.specialK.Absyn; // Java Package generated by the BNF Converter.

public class Applicant extends Abstraction {
  public final Variation variation_;
  public final Agent agent_;

  public Applicant(Variation p1, Agent p2) { variation_ = p1; agent_ = p2; }

  public <R,A> R accept(com.biosimilarity.lift.model.specialK.Absyn.Abstraction.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.model.specialK.Absyn.Applicant) {
      com.biosimilarity.lift.model.specialK.Absyn.Applicant x = (com.biosimilarity.lift.model.specialK.Absyn.Applicant)o;
      return this.variation_.equals(x.variation_) && this.agent_.equals(x.agent_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.variation_.hashCode())+this.agent_.hashCode();
  }


}
