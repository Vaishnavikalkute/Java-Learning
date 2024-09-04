class Firstclass{
    public static String datatype(){
        String str="hey there!";
        int digit=20;
        double price=99999.99;
        char initial='Z';
        boolean status=true;

        // System.out.println(str+digit+price+" "+initial+"'s love status"+status);

        return String.format("%s%d%.2f %c's love status: %s", str, digit, price, initial, status);

    }
    public void display(String val){
        System.out.println("I am from diaply"+val);
    }
    public static void main(String[] args) {
        System.out.println("okay i didi it");
        String val=datatype();
        // System.out.println(val);
        // we have reated a display method whic is not static to aces non static methods we need to getcreate class objets
        Firstclass myobj1=new Firstclass();
        // diaplay(val)    this wil give you error
        myobj1.display(val);
    }
}