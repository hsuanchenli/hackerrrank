object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var x1 = sc.nextInt();
    var v1 = sc.nextInt();
    var x2 = sc.nextInt();
    var v2 = sc.nextInt();
    sc.close()
    if((v1>v2 && x1>x2) || (v1<v2 && x1<x2)  )println("NO")
    else {
      if(v1!=v2){
        val res = (x2-x1) % (v1-v2)
        if(res == 0)
          println("YES")
        else
          println("NO")
      }
      else{
        if(x2!=x1)
          println("NO")
        else
          println("YES")
      }
    }
  }
}