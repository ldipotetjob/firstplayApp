trait Monoid[A] {
  def op(a1:A,a2:A): A
  def zero: A
}

def listMonoid[A] = new Monoid[List[A]] {

  def op(a1:List[A],a2:List[A]) = a1 ++ a2
  def zero = Nil

}

def stringMonoid = new Monoid[String] {

  def op(a1:String,a2:String) = a1 + a2
  def zero = ""
}


￼/*  op(op(a, b), op(c, d))
*/
val stringList: String = List("house","garden","cities","contries").foldLeft(stringMonoid.zero)((a,b)=>stringMonoid.op(a,b))


//val stringList1: String = List("house","garden","cities","contries").foldLeft(stringMonoid.zero)((a,b)=>stringMonoid(stringMonoid.op(a,b),stringMonoid.op(a,b)))