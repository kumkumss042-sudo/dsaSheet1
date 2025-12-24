package Matrix;
import java.util.*;
public class RowWithMax1 {
    public static void main(String[] args) {
        int mat[][]={{0,0},{1,1},{0,1}};
                int max=-1,index=-1;
                for(int i=0;i<mat.length;i++){
                    int count=0;
                    for(int j=0;j<mat[i].length;j++){
                        if(mat[i][j]==1) count++;
                    }
                    if(count>max){
                        max=count;
                        index=i;
                    }
                }
        int ans[]={index,max};
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
