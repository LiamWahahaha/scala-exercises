class Rational(n: Int, d: Int) {
  val numer: Int = n
  val denom: Int = d

  override def toString() = numer + "/" + denom

  def this(n: Int) = this(n, 1)

  def add(that: Rational): Rational =
    new Rational(numer * that.denom + that.numer * denom,
                 denom * that.denom)

  def sub(that: Rational): Rational =
    new Rational(numer * that.denom - that.numer * denom,
                 denom * that.denom)

  def mul(that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  def div(that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)
}
