public class LoopThree {

    public static void add(int ar[]){
        
        int sum=0;
        
        for(int n:ar){
            sum=sum+n;
        }
        System.out.println(sum);
        
        
    }
    
    public static void main(String[] args) {

        int x[]={10,20,30,40,50};
        int y[]={1,2,3,4,5,6,7,8,9,10};
        int z[]={3,4,5};

        add(x);
        add(y);
        add(z);
        
    }

}
