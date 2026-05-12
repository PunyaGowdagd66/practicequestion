class target {
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[2]; //creting new array
        ans[0]=-1;//intizaling 1st arry
        ans[1]=-1;//last position of array
        int n=nums.length;// lenth of nums
        int low=0;  //index of 1st array
        int high=n-1;//last index of nums array
        while(low<=high){//runs the condtion 
            int mid=low+ (high-low) /2;//finding the middle index
            if(nums[mid]==target){
                ans[0]=mid;
                high=mid-1;//left

            }
            else if(nums[mid]<target){
                low=mid+1;//right
            }
            else{
                high=mid-1;
            }
        }
        //int low=0;
       // int high=n-1;
        low = 0;
        high = n - 1;
        while(low<=high){
            int mid =low+(high-low)/2;
            if(nums[mid]==target){
                ans[1]=mid;
                low=mid+1;//right
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else
            {
                high=mid-1;//left
            }
        }
     
        return ans;
    }
} 
    

