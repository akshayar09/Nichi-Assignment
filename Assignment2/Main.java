import Person.Farmer;
import Person.WholeSaler;
public class Main {
    
    public static void main(String[] args)  {

        WholeSaler wholeSaler1 = new WholeSaler("manu augustine",(long) 245679431);

        Farmer farmer1 = new Farmer("Akshaya r nair", (long)907856478);
        Farmer farmer2 = new Farmer("Arun Dev", (long) 874679305);
        Farmer farmer3 = new Farmer("Vivek Krishna", (long) 475066346);
        Farmer farmer4 = new Farmer("Rachel GReen", (long) 647928464);
        Farmer farmer5 = new Farmer("Caroline Forbes", (long) 563418216);
        Farmer farmer6 = new Farmer("Stefan Salvatore", (long) 564219056);
        try {
            wholeSaler1.addFarmer(farmer1);
            wholeSaler1.addFarmer(farmer2);
            wholeSaler1.addFarmer(farmer3);
            wholeSaler1.addFarmer(farmer4);
            wholeSaler1.addFarmer(farmer5);
            wholeSaler1.addFarmer(farmer6);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("You cannot add more than 5 farmers to the farmers list");
        }

        System.out.println("List of Farmers");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        for (Farmer f : wholeSaler1.farmers) {
            System.out.printf("\n Farmer name: %s and Phone number: %s", f.getName(), f.getContact());
        }

    }

}