package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        int[][]metrix = new int[3][3];
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                metrix[i][j]=in.nextInt();
            }
        }
        int det_up;
        int det_down;
        det_up=(metrix[2][0]*metrix[1][1]*metrix[0][2])+(metrix[2][1]*metrix[1][2]*metrix[0][0])+(metrix[2][2]*metrix[1][0]*metrix[0][1]);
        det_down=(metrix[0][0]*metrix[1][1]*metrix[2][2])+(metrix[0][1]*metrix[1][2]*metrix[2][0])+(metrix[0][2]*metrix[1][0]*metrix[2][1]);
        System.out.println(det_down-det_up);
    }
}
