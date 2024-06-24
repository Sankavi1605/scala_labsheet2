object Ex1{
   var (k,i,j)=(2,2,2)
   var (m,n)=(5,5)
   val f=12.0f
   val g=4.0f
   val c='X'
    
   val exp_a = k + 12*m
   val exp_b = m/j
   val exp_c = n%j
   val exp_d = m/j * i
   val exp_e = f + 10*5 +g
   val exp_f = {
      i += 1;
       i*n
   }
   def main(args:Array[String]):Unit={
   println(exp_a)
   println(exp_b)
   println(exp_c)
   println(exp_d)
   println(exp_e)
   println(exp_f)

   }
}
