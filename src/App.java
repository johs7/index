public class App {
    
    String color;
    String marca;
    int km;
    
    
    
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        App coche1 = new App();
        coche1.color = "rojo";
        coche1.marca = "Seat";
        coche1.km = 100;
        System.out.println("el color del coche es:"+coche1.color);
        System.out.println("la marca del coche es:"+coche1.marca);
        System.out.println("los km del coche son:"+coche1.km);
        App coche2 = new App();
        coche2.color = "azul";
        coche2.marca = "Ferrari";
        coche2.km = 200;
        System.out.println("el color del coche es:"+coche2.color);
        System.out.println("la marca del coche es:"+coche2.marca);
        System.out.println("los km del coche son:"+coche2.km);
        
    }
}
