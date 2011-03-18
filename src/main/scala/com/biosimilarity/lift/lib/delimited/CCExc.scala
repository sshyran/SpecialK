// -*- mode: Scala;-*- 
// Filename:    CCExc.scala 
// Authors:     lgm                                                    
// Creation:    Thu Mar 17 14:47:04 2011 
// Copyright:   Not supplied 
// Description: 
// ------------------------------------------------------------------------

package com.biosimilarity.lift.lib.delimited

import com.biosimilarity.lift.lib.monad._

trait CCV[P[M[_],A],M[_],A]
// case class Iru[P[M[_],A],M[_],A]( a : A ) extends CCV[P,M,A]
// case class Deru[P[M[_],A],M[_],A](
//   sk : SubCont[P,M,_,A],
//   r : P[M,_]
// ) extends CCV[P,M,A]

abstract class CC[P[M[_],_],M[_],A](
  val unCC : M[CCV[P,M,A]]
)

trait SubCont[P[M[_],_],M[_],A,B] extends Function1[CC[P,M,A],CC[P,M,B]]

trait CCT[P[M[_],_],M[_],A,W] extends SubCont[P,M,A,W]

trait Prompt[P[M[_],_],M[_],W] extends ( CCT[P,M,_,W],Option[CCT[P,M,_,W]] )

trait MonadicCCScope[P[M[_],_],M[_]] {
  trait CCC[A] extends CC[P,M,A]
  // class MonadicCC extends Monad[CCC] {
//     override def fmap [S,T]( f : S => T ) : CCC[S] => CCC[T] = {
//       ( la : CCC[S] ) => {
// 	la match {
// 	  case Iru( s ) =>
// 	}
//       }
//     }
//     override def unit [S] ( s : S ) : CCC[S] = Some[S]( s )
//     override def mult [A] (
//       mma : CCC[CCC[A]]
//     ) : CCC[A] = {
//       bind[CCC[A],A]( mma, ( ma ) => ma )
//     }
//   }
}