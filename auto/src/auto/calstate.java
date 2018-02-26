/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

/**
 *
 * @author lenovo
 */
public class calstate {

    private state s;

    calstate() {

    }

    void setstate(state s) {
        this.s = s;
    }

    void calstate(int row, int col, int m[][], int n) {

        int i=0,j=0,k=0;
        int[][] m1 = new int[row][col];
        int[][] m2 = new int[row][col];
        for (k = 0; k < n; k++) {
            for (i = 0; i < row; i++) {
                for (j = 0; j < col; j++) {
                    m1[i][j] = this.s.nextstate(m,row,col,n);
                    //m2[i][j]=a.neighbour(m,i,j,col);
                    //System.out.println(m[i][j]);
                }
            }

            for (i = 0; i < row; i++) {
                for (j = 0; j < col; j++) {

                    m[i][j] = m1[i][j];
                    m1[i][j] = 0;

                }

            }

        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {

                System.out.print(m1[i][j]);

            }
            System.out.println();
        }

    }
}
