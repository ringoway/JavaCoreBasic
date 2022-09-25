public class Multi_Arrays {
    public static void main(String[] args) {
        int [][] matrice = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        System.out.println(matrice[2][1]);

        for (int i = 0; i<matrice.length; i++){
            for (int j = 0; j<matrice[i].length; j++){
                System.out.print(matrice[i][j]+" ");
            }
            System.out.println();
        }
    }
}
