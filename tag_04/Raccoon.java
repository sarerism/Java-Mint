package tag_04;

public class Raccoon {

    public String color = "Gray";
    String name;

    public void sleep(){
        System.out.println("I am sleeping!");
    }

    public void eating(int times){
        for (int i = 0; i<times; i++){
            System.out.println("I am eating!");
        }
    }
        
    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

}
