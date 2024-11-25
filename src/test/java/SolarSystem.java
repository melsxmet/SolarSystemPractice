public class SolarSystem {
    public static void main(String[] args) {

        BasicStructure BB= new BasicStructure();
        BB.Planets= "2";
        BB.Moon= "2";
        BB.Stars= "10";
        BB.Sun= "1";
        System.out.println("Solar System is ready");

        FeatureSun Xros= new FeatureSun();
        Xros.Temp= "34324k";
        Xros.Color= "Green";
        Xros.Radius= "3242343432343 miles";

        Planet1 ZORO= new Planet1();
        ZORO.color= "Pink";
        ZORO.radius= "12345432543 miles";

        Planet2 Dros= new Planet2();
        Dros.color= "Black";
        Dros.radius= "1342432342 miles";
        
    }
}
