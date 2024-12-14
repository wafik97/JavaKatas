package katas.exercises;

import static katas.exercises.ListFlatten.flattenList;
import static katas.exercises.LongestCommonPrefix.longestCommonPrefix;
import static katas.exercises.MatrixRotate.rotateMatrix;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class MatrixRotateTest {

    @Test
    public void testMatrixRotate() {



        int[][] matrix = {
                {1, 2, 3,4},
                {5, 6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        rotateMatrix(matrix);

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){  //j,n-i-1
                assertEquals(i*4+j+1, matrix[j][4-i-1], "the answer should be "+i*4+j+1);
            }
        }

    }
}
