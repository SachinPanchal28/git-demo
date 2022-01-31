

public class add{
    int a,b;
    add(){
        a=4;
        b=6;
    }

    public int sum(){
        return a+b;
    }
    
   public static void main(String args[]){
        add obj= new add();
        System.out.println(obj.sum());
    }
}


