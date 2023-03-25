package ICO_POO_2258;

public class MaqunaDeCafeDriver {
    public static void main(String[] args) {
        MaquinaDeCafe maquina1 = new MaquinaDeCafe();
        System.out.println(maquina1);
        maquina1.setCafe(1000);
        maquina1.setAgua(5000);
        maquina1.setCrema(1500);
        maquina1.setCapVasos(50);
        maquina1.setVasos(50);
        System.out.println(maquina1);
        maquina1.hacindoExpreso();
        System.out.println(maquina1);
        maquina1.haciendoCapuchino();
        System.out.println(maquina1);
        maquina1.hacindoExpreso();
        System.out.println(maquina1);
        maquina1.haciendoCapuchino();
        System.out.println(maquina1);
        maquina1.hacindoExpreso();
        System.out.println(maquina1);
        maquina1.haciendoCapuchino();
        System.out.println(maquina1);
        maquina1.hacindoExpreso();
        System.out.println(maquina1);
        maquina1.haciendoCapuchino();
        System.out.println(maquina1);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        MaquinaDeCafe maquina2 = new MaquinaDeCafe(1000, 200, 300, 50, 8);
        System.out.println(maquina2);
        maquina2.hacindoExpreso();
        maquina2.haciendoCapuchino();
        maquina2.hacindoCafeAmericano();
        maquina2.haciendoCapuchino();
        maquina2.hacindoExpreso();
        maquina2.haciendoCapuchino();
        maquina2.hacindoCafeAmericano();
        maquina2.haciendoCapuchino();
        maquina2.hacindoExpreso();
        System.out.println(maquina2);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        MaquinaDeCafe maquina3 = new MaquinaDeCafe();
        maquina3.setAgua(5742);
        maquina3.setCafe(1089);
        maquina3.setCrema(1501);
        maquina3.setCapVasos(50);
        maquina3.setVasos(53);
        System.out.println(maquina3);
    }
}
