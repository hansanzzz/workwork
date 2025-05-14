import java.util.InputMismatchException;
import java.util.Scanner;
import exception.InvalidNumberException;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double quotient = 0;
        try{
            double x = scanner.nextDouble();
            quotient = ( 1.0/ x );
            if(x <0){
                throw new InvalidNumberException("除數不能小於0");
            }
            if(Double.isInfinite(quotient)){
                throw new ArithmeticException("除數不能為0");
            }
            System.out.printf("%.2f\n",quotient);
        }catch (ArithmeticException e){
            System.out.println("錯誤:輸入的數字不能為0");
        }catch (InputMismatchException e){
            System.out.println("錯誤:輸入的必須是整數");
        }catch (InvalidNumberException e){
            System.out.println("錯誤:輸入的必須大於0");
        }
        finally {scanner.close();}
        }
    }

