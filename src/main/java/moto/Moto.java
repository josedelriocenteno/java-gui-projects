/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moto;

/**
 *
 * @author jorge
 */
public class Moto {

    //atributos
    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;               //potencia de la moto en caballos de vapor. 
    private double deposito;            // cantidad de gasolina (en litros) del autom�vil en un momento determinado. 
    private boolean arrancado = false;    //el autom�vil est� o no arrancado. 
    private int velocidad = 0;            //: velocidad del autom�vil (km/h) en un momento determinado. 
    private int velocidadMax;          // velocidad m�xima que puede alcanzar el autom�vil.
    private double capacidadDeposito;  //litros de gasolina que como m�ximo acepta el autom�vil. 
    private int plazas;              //n? de personas que admite el veh�culo ?legalmente?. 
    private int pasajeros;          //nº de personas montadas en la moto en un momento determinado

    //constructor
    public Moto(String matricula, String marca, int plazas, String modelo, int potencia, int velocidad_max, double capacidad_deposito) {
        this.matricula = matricula;
        this.marca = marca;
        this.plazas = plazas;
        this.modelo = modelo;
        this.potencia = potencia;
        this.velocidadMax = velocidad_max;
        this.capacidadDeposito = capacidad_deposito;
        this.deposito = 10;
        this.arrancado = false;
        this.velocidad = 0;
    }

    //getter/setter
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public double getDeposito() {
        return deposito;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public double getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public int getnPasajeros() {
        return plazas;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setVelocidadMax(int velocidad_max) {
        this.velocidadMax = velocidad_max;
    }

    public void setCapacidad_deposito(double capacidad_deposito) {
        this.capacidadDeposito = capacidad_deposito;
    }

    public void setnPasajeros(int nPasajeros) {
        this.plazas = nPasajeros;
    }

    public int getPlazas() {
        return plazas;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    
    

    //metodos
    //arrancar
    public void arrancar() {
        if (!arrancado) {
            arrancado = true;
            System.out.println("La moto ha arrancado");
        } else {
            System.out.println("La moto ya esta arrancada");
        }
    }

    //parar
    public void parar() {
        if (arrancado) {
            arrancado = false;
            System.out.println("La moto se ha apagado");
        } else {
            System.out.println("La moto ya esta apagada");
        }
    }

    //respostar
    //Metodo que suma al depósito actual de la moto un nº de litros
    //recibido como parámetro
    public void repostar(double litros) {
        if (!arrancado) {
            if (this.deposito + litros >= this.capacidadDeposito) {
                System.out.println("Demasiados litros. Deposito lleno");
                this.deposito = capacidadDeposito;
            } else {
                this.deposito += litros;
            }
        } else {
            System.out.println("Apaga primero la moto");
        }
    }

    //Método que llena el depóstito de la moto
    public void repostar() {
        if (!arrancado) {
            this.deposito = capacidadDeposito;
            System.out.println("Se ha llenado el deposito a su capacidad maxima");
        } else {
            System.out.println("Apaga primero la moto");
        }
    }

    //acelerar
    public void acelerar() {
        if (arrancado) {
            if (this.deposito >= 0.5) {
                if (this.velocidad < this.velocidadMax) {
                    velocidad += 10;
                    deposito -= 0.5;
                }else{
                     System.out.println("No se puede acelerar. Velocidad maxima");
                }
            } else {
                System.out.println("No se puede acelerar. No hay combustible");
            }
        } else {
            System.out.println("No se puede acelerar. Moto parada");
        }       
    }

    //decelerar
    public void decelerar() {
        if(this.arrancado){
            if(this.velocidad >= 5){
                 velocidad -= 5;
            }else{
                 System.out.println("No se puede decelerar. Moto parada");
            }
        }else{
            System.out.println("No se puede decelerar. Moto no arrancada");
        }   
    }

    //Método que sube una persona a la moto
    public void subir() {
        if(this.velocidad == 0){
            if(this.pasajeros < this.plazas){
                this.pasajeros++;
            }else{
                System.out.println("No se pueden subir mas personas a la moto");
            }            
        }else{
            System.out.println("Moto con velocidad. Primero parala.");
        }  
    }
    
    //Método que baja una persona de la moto
    public void bajar() {
        if(this.velocidad == 0){
           if(this.pasajeros>=1){
               this.pasajeros--;
           }else{
               System.out.println("No hay personas subidas a la moto");               
           }           
        }else{
            System.out.println("Moto con velocidad. Primero parala.");
        }  
        
    }

    @Override
    public String toString() {
        return String.format("Velocidad: %s%n Combustible: %s%n Asientos libres: %s%nG", velocidad, deposito, plazas);
    }

}
