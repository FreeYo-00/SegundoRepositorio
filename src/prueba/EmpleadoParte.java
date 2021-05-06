package prueba;

import Utilidades.Entrada;
public class Empleados {
private String nombre;
private int edad;
private double salarioBase;
private static final double plus=500;
public Empleados(String nombre, int edad, double
salarioBase) {
this.nombre = nombre;
setEdad(edad);
setSalarioBase(salarioBase);
}
public void setNombre(String nombre) {
this.nombre = nombre;
}
public void setEdad(int edad) {
while (edad<16 || edad>=70) {
System.out.println("NO ES UNA EDAD LABORAL VÁLIDA, DEBE ESTAR ENTRE 16 Y 70");
System.out.print("INTRODUCE EDAD ");
edad=Entrada.entero();
}
this.edad = edad;
}
public void setSalarioBase(double salarioBase) {
while (salarioBase<900) {
System.out.println("NO ES UN SALARIO VÁLIDO, DEBE SER SUPERIOR A 900€");
System.out.print("INTRODUCE SALARIO ");
salarioBase=Entrada.entero();
}
this.salarioBase = salarioBase;
}
public String getNombre() {
return nombre;
}
public int getEdad() {
return edad;
}
public double getSalarioBase() {
return salarioBase;
}
public static double getPlus() {
return plus;
}
@Override
public String toString() {
return "NOMBRE: " + nombre + "\tEDAD:" + edad +
"\t\tSALARIO BASE: " + salarioBase + "\n";
}