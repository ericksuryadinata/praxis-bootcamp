public class Variabel{
    public void pupAge(){
        int age = 0;
        age = age + 7;
        System.out.println("Puppy Age is " + age);
    }

    public static void main(String[] args){
        Variabel variabel = new Variabel();
        variabel.pupAge();
    }
}