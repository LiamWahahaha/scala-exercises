/** A class that calculates a checksum of bytes.
 *  This class is not thread-safe.
 */
class ChecksumCalculator {
  private var sum = 0
  /** Adds the passed <code>Byte</code> to the checksum
   *  calculation.
   *
   *  @param b the <code>Byte</code> to add
   */
  def add(b: Byte) { sum += b }
  /** Gets a checksum for all the <code>Byte</code>s passed
   *  to <code>add</code>. The sum of the integer returned
   *  by this method, when added to the sum of all the
   *  passed bytes will yield zero.
   */
  def checksum: Int = ~(sum & 0xFF) + 1
}

/** When a singleton object shares the same name with a class,
 *  it is called that class's companion object.
 *  The class is called the companion class of the singleton
 *  object.
 *  A class and its companion object can access each other's
 *  private members.
 *  A singleton object that does not share the same name with
 *  a companion class is called a standalone object.
 */
object ChecksumCalculator {
  def calcChecksum(s: String): Int = {
    val cc = new ChecksumCalculator
    for (c <- s)
      cc.add(c.toByte)
    cc.checksum
  }
}
