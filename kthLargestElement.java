
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int begin=0;
        int end=nums.length-1;
         k=nums.length+1-k;
         while(begin<end){
            int pos=partition(nums,begin,end);
            if(pos==k-1) break;
            else if(pos<k-1) begin=pos+1;
            else end=pos-1;
        }
        return nums[k-1];
    }
    public int partition(int[]nums,int l,int r){
          int less=l-1;//小于区的下标
          int  more=r;//大于区的下标，默认以最后一个下标的数作为划分值
          while(l<more){
              if(nums[l]<nums[r])
                 swap(nums,++less,l++);
              else if  (nums[l]>nums[r]) 
                 swap(nums,--more,l);
              else l++;
          }
          swap(nums,more,r);
          return less+1;//小于区位置+1可以得到划分的这个数的下标
      }
    private void swap(int[] a, int i, int j) {
          int t = a[i];
          a[i] = a[j];
          a[j] = t;
    }
}
