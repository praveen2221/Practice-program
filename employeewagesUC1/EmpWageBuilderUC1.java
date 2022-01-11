public class EmpWageBuilderUC1 {

   public static void main(String[] args) {
        int IS_Full_Time = 1;
        double empChack = Math.floor(Math.random() * 10) % 2;
        if(empChack == IS_Full_Time)
            System.out.println("Employee is Present");
        else
             System.out.println("Employee is Abscent");
   }
}
