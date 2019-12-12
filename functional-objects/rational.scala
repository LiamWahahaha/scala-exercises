class Rational(n: Int, d: Int) {
    def this(n: Int) = this(n, 1)
    println("created: " + n + "/" + d)

    private def gcd(a: Int, b: Int): Int =
        if (b == 0) a else gcd(b, a % b)
    private val g = gcd(n, d)

    val numer: Int = n / g
    val denom: Int = d / g

    override def toString() = numer + "/" + denom

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

    def lessThan(that: Rational) =
        this.numer * that.denom < that.numer * this.denom

    def max(that: Rational) = {
        if (this.lessThan(that)) {
            that
        } else {
            this
        }
    }
}
