import java.util.Scanner;
class Matrix {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row=input.nextInt();
        System.out.println("Enter the number of colums: ");
                int colum=input.nextInt();
        int[][] matrix1=new int[row][colum];
        int[][] matrix2=new int[row][colum];
        System.out.println("Enter the elements of first matrix:");
        for(int i=0;i<row;i++) {
            for (int j = 0; j < colum; j++) {
                matrix1[i][j] = input.nextInt();

            }
        }
     System.out.println("Enter the elements of the second matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
              matrix2[i][j]=input.nextInt();

        }
        }
        int [][] sum=new int[row][colum];
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("The sum of the two matrices is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++) {
                System.out.print(sum[i][i] + " ");
            }
            System.out.println();
            }
        }
    }
