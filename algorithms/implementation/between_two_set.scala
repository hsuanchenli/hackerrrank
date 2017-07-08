object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var m = sc.nextInt();
    var a = new Array[Int](n);
    for(a_i <- 0 to n-1) {
      a(a_i) = sc.nextInt();
    }
    var b = new Array[Int](m);
    for(b_i <- 0 to m-1) {
      b(b_i) = sc.nextInt();
    }
    def gcd(a: Int, b: Int):Int=if (b==0) a.abs else gcd(b, a%b)
    def lcm(a: Int, b: Int)=(a*b).abs/gcd(a,b)
    val g = a.reduceLeft((x,y) => lcm(x,y))
    val l = b.reduceLeft((x,y) => gcd(x,y))
    val ans = (1 to l/g) count(x => l%(x*g) == 0 )
    println(ans.toInt)
    // println(s"g $g l $l ans $ans")

  }
}
