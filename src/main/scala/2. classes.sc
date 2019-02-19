//class ChecksumAccumulator {
//  // class definition goes here
//}
//
//new ChecksumAccumulator
//
//class ChecksumAccumulator2 {
//  var sum = 0
//}
//
//val acc = new ChecksumAccumulator2
//val csa = new ChecksumAccumulator2
//
//acc.sum = 3
//
//// Won't compile, because acc is a val
//acc = new ChecksumAccumulator
//
//class ChecksumAccumulator3 {
//  private var sum = 0
//}
//
//val acc3 = new ChecksumAccumulator3
//acc3.sum = 5 // Won't compile, because sum is private
//
//class ChecksumAccumulator4 {
//
//  private var sum = 0
//
//  def add(b: Byte): Unit = {
//    sum += b
//  }
//
//  def checksum(): Int = {
//    return ~(sum & 0xFF) + 1
//  }
//}
//
