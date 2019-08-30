public class main {
    
    public static void main(String[] args) {
        int[][] testTable = {{-2,1,-3,4,-1,2,1,-5,4},{-1,-2,-3,-4,-1},{7,-6,4,3,1},{-1,6,2,7}};
        for (int[] ito : testTable) {
            test(ito);
        }
    }
         
    private static void test(int[] ito) {
        Solution solution = new Solution();
        int rtn;
        long begin = System.currentTimeMillis();
        for (int i = 0; i < ito.length; i++) {
            System.out.print(ito[i]+" ");           
        }
        System.out.println();
        //开始时打印数组
        
        rtn = solution.maxSubArray(ito);//执行程序
        long end = System.currentTimeMillis();  
        
        System.out.println( " rtn=" +rtn);
        
        System.out.println();
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }

}