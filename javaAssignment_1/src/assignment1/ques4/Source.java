package assignment1.ques4;

public class Source {
    public static void main(String[] args) {
        int [][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int colSum=0, rowSum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                rowSum+=matrix[i][j];
            }
            System.out.println("Row"+" "+i+": "+rowSum);
            rowSum=0;
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                colSum+=matrix[j][i];
            }
            System.out.println("Col"+" "+i+": "+colSum);
            colSum=0;
        }
    }
}
