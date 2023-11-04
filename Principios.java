/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosolid;

/**
 *
 * @author Rocio Lopez
 */
public class Principios {
    // Principio SRP: Clase con una única responsabilidad
class Order {
    public void createOrder() {
        // Lógica para crear una orden
    }
}

class EmailService {
    public void sendEmail(String message) {
        // Lógica para enviar un correo electrónico
    }
}

// Principio OCP: Extensión sin modificación
interface PaymentProvider {
    void processPayment(double amount);
}

class CreditCardPaymentProvider implements PaymentProvider {
    @Override
    public void processPayment(double amount) {
        // Lógica para procesar el pago con tarjeta de crédito
    }
}

class PayPalPaymentProvider implements PaymentProvider {
    @Override
    public void processPayment(double amount) {
        // Lógica para procesar el pago con PayPal
    }
}

// Principio ISP: Interfaces específicas para clientes
interface Printable {
    void print();
}

interface Faxable {
    void fax();
}

class Printer implements Printable {
    @Override
    public void print() {
        // Lógica para imprimir
    }
}

class FaxMachine implements Faxable {
    @Override
    public void fax() {
        // Lógica para enviar un fax
    }
}

    
}
