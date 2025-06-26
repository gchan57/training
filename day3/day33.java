public class day33 {
    String name="guru";
    public void pri(){
        System.out.println(this.name);
    }
    //this keyword can access the constructor,method,instance variable
    //in the current class 
    // cant be used in static method
    public static void main(String[] args){
        day33 d1= new day33();
        d1.pri();
    }
}
