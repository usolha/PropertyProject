public class MainProgram {

    public static void main(String [] args) {
        Property p1 = new Property("Erzbergestraße 1", 10,20.57);
        System.out.println(p1.getAddress() + " - " + p1.getSize() + "m²");

        Property p2 = new Property( "Erzbergestraße 2", 15, 22.212);
        System.out.println(p2.getAddress() + " - " + p2.getSize() + "m²");

        Property p3 = new Property("Erzbergestraße 3", 10,20.57);
        System.out.println(p3.getAddress() + " - " + p3.getSize() + "m²");

        Property p4 = new Property("Erzbergestraße 4", 10,20.57);
        System.out.println(p4.getAddress() + " - " + p4.getSize() + "m²");



    }

 }
