object Ex1{
    var a=2
    var b=3
    var c=4
    var d=5
    var g=6
    val k=4.3f
    


   def main(args:Array[String]):Unit={
     b=b-1 //pre-decrement
     val exp_a=b*a + c*d
     println(exp_a)
     d=d-1  //post-decrement

     
     val exp_b=a
     println(exp_b)
     a=a+1//post-increment

     val exp_c = -2 * (g-k) + c
     println(exp_c)

     val exp_d=c
     println(exp_d)
     c=c+1 //post-increment

     val exp_e=c*a
     println(exp_e)
     a=a+1//post-increment
     
    
   }
}
