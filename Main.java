class Solution
{
    int sumOfMatrix(int N, int M, int[][] Grid) 
    {
        int a = 0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                a+=Grid[i][j];
            }
        }
    return a;   
    }
}
