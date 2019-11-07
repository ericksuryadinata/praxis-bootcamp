class Base
{
    /**
     * Display a message
     * 
     * @return void
     */
    public void display()
    {
        System.out.println("Base display()");
    }

    /**
     * 
     * @param args
     */
    public static void main(String args[]) {
        Derived obj = new Derived();
        obj.display();
    }
}

class Derived extends Base
{
     @Override
     /**
      * Display message, but override main
      * @return void
      */
     public void display()
     {
         System.out.println("Derived display(int )");
     }
}
