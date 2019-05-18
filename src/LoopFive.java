
public class LoopFive {
    public static void main(String[] args) {

        //int x[][]={{11,12,13},{14,15,16},{17,18,19},{20,21,22},{23,24,25}};
        int x[][]={{1,2},{3,4},{5,6},{7,8},{9,10},{11,12}};
        for(int tmp[]:x){
            for(int n:tmp){
                System.out.print(n+"\t");
            }
            System.out.println("");
        }
        
        
        /*
        for(int i=0; i<3; i++){
            for(int j=0;j<3; j++){
                System.out.print(x[i][j] + "\t");
            }
            
            System.out.println("");
        }
        */
        
        
    }
}
