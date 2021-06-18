/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chef.and.snackdown;
import java.util.Scanner;
public class ChefAndSnackdown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
        {
             int n=in.nextInt();
            if(n==2010 || n==2015 || n==2016 || n==2017 ||
                    n==2019)
            {
                 System.out.println("HOSTED");
            }
            else
            {
                 System.out.println("NOT HOSTED");
            }
        }
        t--;
        
        
    }
    
}
