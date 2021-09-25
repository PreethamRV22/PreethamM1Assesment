package Question1;

class TaxCalculator
{
         public static double taxableAmount(double monthlySalary)
         {
                    //Tax must be calculated for Annual Salary
                   //should return annual taxable annualSalary
        	 		double annualSalary=12*monthlySalary;
        	 		if(annualSalary>250000 && annualSalary<=500000)
        	 			{
        	 				return 0.1*(annualSalary-250000);
        	 			}
        	 			else if(annualSalary>500000 && annualSalary<=1000000)
        	 			{
        	 					return ((0.2*(annualSalary-500000))+(0.1*250000));
        	 			}
        	 			else if(annualSalary>1000000)
        	 			{
        	 					return ((0.3*(annualSalary-1000000))+(0.2*500000)+(0.1*250000));
        	 			}
        	 			else
        	 			{
        	 				return 0;
        	 			}

         }
         public static void main(String [] args)
         {
        	 System.out.println(taxableAmount(50000));   
         }
}
