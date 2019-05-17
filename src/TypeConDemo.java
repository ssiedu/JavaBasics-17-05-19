
public class TypeConDemo {
    public static void main(String[] args) {

    //case-1 (types are same)
        int v1=10;
        double v2=2.5;
    //case-2 (types are different)
    //case-2.1 (no-error) (implicit (automatic) conversion)
        double v3=50;   //int is converted to double
        long v4=2;      //int is converted to long
    //case-2.2 (error) (possibly loss of precisions) (explicit conversion)
        int v5=(int)34.5;
        float v6=(float)2.3;
    //case-2.3 (error) (incompatible types : cant convert)
        //double v7=(double)true;
        //boolean v8=(boolean)1;
        
    //Exceptional Case
    //Container is large and compatible also but then too need explicit conv.
    
    
        long v9=(long) 2.4f;
        
        
        
        
    }
}
