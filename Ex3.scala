object ex3{
    def takeHomeSalary(nh:Int,ot:Int):Double={
        val grossSalary= (nh*250 + ot*85)
        val netSalary = grossSalary-grossSalary*0.12
         return netSalary
    }
    
   def main(args:Array[String]):Unit={
   println("The netSalary is "+ takeHomeSalary(40,30)) 
   }
}
