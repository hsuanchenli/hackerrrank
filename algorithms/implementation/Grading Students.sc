object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var grades = new Array[Int](n);
    for(grades_i <- 0 to n-1) {
      grades(grades_i) = sc.nextInt();
    }
  }
}
