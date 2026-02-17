// Nicoll Valeria Camayo Sol
    import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Moto moto = new Moto("Kawasaki", 200, true);
    Bus bus = new Bus("Nissan", 120, 50);
    moto.conducir();
    System.out.print("ingrese el incremento de velocidad para la moto: ");
    
    int incrementoMoto = scanner.nextInt();
    moto.aumentarVelocidad(incrementoMoto);
    bus.conducir();
    System.out.print("ingrese el incremento de velocidad para el bus: ");
    
    int incrementoBus = scanner.nextInt();
    bus.aumentarVelocidad(incrementoBus);
    scanner.close();
    }
    }
    class Vehiculo {
    protected String marca;
    protected int velocidadMaxima;
    protected int velocidadActual;
    public Vehiculo(String marca, int velocidadMaxima) {
    this.marca = marca;
    this.velocidadMaxima = velocidadMaxima;
    this.velocidadActual = 0;
    }
    public void conducir() {
    System.out.println("El vehículo de marca " + marca + " está avanzando.");
    
    }
    public void aumentarVelocidad(int incremento) {
    velocidadActual += incremento;
    if (velocidadActual > velocidadMaxima) {
    velocidadActual = velocidadMaxima;
    System.out.println("Velocidad máxima alcanzada. Velocidad actual: " + velocidadActual + " km/h");
    
    } else {
    System.out.println("Velocidad aumentada. Velocidad actual: "
    
    + velocidadActual + " km/h");
    
    }
    }
    }
    class Moto extends Vehiculo {
    private boolean tieneSidecar;
    public Moto(String marca, int velocidadMaxima, boolean tieneSidecar)
    {
    
    super(marca, velocidadMaxima);
    this.tieneSidecar = tieneSidecar;
    }
    @Override
    public void conducir() {
    System.out.println("La moto de marca " + marca + " avanza a " +
    
    velocidadActual + " km/h sobre dos ruedas.");
    }
    }
    class Bus extends Vehiculo {
    private int capacidadPasajeros;
    public Bus(String marca, int velocidadMaxima, int
    capacidadPasajeros) {
    
    super(marca, velocidadMaxima);
    this.capacidadPasajeros = capacidadPasajeros;
    }
    @Override
    public void conducir() {
    System.out.println("El bus de marca " + marca + " lleva a " +
    
    capacidadPasajeros + " personas.");
    }
    
    }