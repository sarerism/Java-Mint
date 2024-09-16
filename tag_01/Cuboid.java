package tag_01;

public class Cuboid {
    public static void main(String[] args){

        double width = 4;
        double heigth = 5;
        double length = 6;

        double volume = width*heigth*length;
        double surfaceArea = 2*((width*heigth)+(width*length)+(length*heigth));
        double diagonal = Math.sqrt((width*width)+(length*length)+(heigth*heigth));

        System.out.println("Volume: " + volume);
        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Diagonal: " + diagonal);

    }
    
}
