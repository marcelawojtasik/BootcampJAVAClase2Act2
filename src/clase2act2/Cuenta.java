
package clase2act2;

import java.util.Scanner;


public class Cuenta {
    private String numeroCuenta;
    private int DNI;
    private double saldo;
    public double ingreso;
    public double retiro;
    private double extraccion;
    private double saldoActual;
    
    public Cuenta(){        
    }
    
    public Cuenta(String numeroCuenta, int DNI, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldoActual();
    }
    
    private double saldoActual(){
        return (165000);
    }             
    
    public void setDNI(int DNI) {        
        this.DNI = DNI;
    }
    
    public void setNumeroCuenta(String numeroCuenta) {
        System.out.println("Ingrese su número de cuenta ");
        Scanner input = new Scanner(System.in);
        this.numeroCuenta = input.nextLine();
    }
    
    private String nroCuenta(){
        return numeroCuenta;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    } 
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void consultarDatos(){
        //System.out.println(this);
        System.out.println("Cuenta " + numeroCuenta + ", DNI  " + DNI + ", saldo $ " + saldo);
    }
    
    public void crearCuenta(){
        System.out.println("Indique los siguientes datos para crear su cuenta bancaria y asociar el saldo disponible");
        System.out.println("Ingrese su DNI");
        Scanner input = new Scanner(System.in);
        this.DNI = input.nextInt();
        System.out.println("Ingrese su número de cuenta ");
        Scanner input2 = new Scanner(System.in);
        this.numeroCuenta = DNI + ("/") + input2.nextLine();
        this.saldo = saldoActual();        
    }
    
    public void ingresar(){
                                
        System.out.println("Ingrese el monto a depositar");
        Scanner input = new Scanner(System.in);
        ingreso = input.nextDouble();
        if (ingreso > 0){
           this.saldo = saldoActual() + ingreso;  
        }
               
    }
    
    public void retirar(){                                
        System.out.println("Ingrese el monto a retirar");
        Scanner input = new Scanner(System.in);
        retiro = input.nextDouble();
        if (retiro > saldo){
            saldo = 0;
            System.out.println("Se le entregara el disponible de acuerdo a su saldo. Su nuevo saldo es de $ " + saldo);
        }
        else {
            this.saldo = saldoActual() - retiro;
            System.out.println("Ud. retiró $ " + retiro + ", su saldo actual quedó en $ " + saldo);
            }           
    }    
    
    public void extraccionRapida(){
        System.out.println("Se realizara una extraccion del 20% de su saldo " + saldo);
        extraccion = 0.2 * saldo;
        System.out.println("Se retiraran $ " + extraccion);
        saldo = saldo - extraccion;
        System.out.println("Su nuevo saldo es de $ " + saldo);
        
    }
   
    
    
}

