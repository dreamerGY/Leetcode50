class Solution {
      public double findMedianSortedArrays(int[] a, int[] b) {
        int[] c = new int[a.length+b.length];
 
        for (int i = 0; i < c.length; i++) {
            c[i] = i<a.length?a[i]:b[i-a.length];
        }//将两个数组合并成一个数组（不在乎数组速度），比较可取的方法
 
        Arrays.sort(c);
 
        if (c.length%2 == 1){
            return c[c.length/2]*1.0;
        }else {
            return (c[c.length/2]*1.0+c[c.length/2-1])/2;
        }
    }
}
