class Solution {
     public int findPivot(int arr[])
    {
        int s = 0;
        int e = arr.length - 1;

        while(s <= e)
        {
            int mid = s + (e - s)/2;

            if(mid < arr.length - 1 && arr[mid] > arr[mid + 1])
            {
                return mid;
            }

            if(mid > 0 && arr[mid] < arr[mid - 1])
            {
                return mid - 1;
            }

            if(arr[s] >= arr[mid])
            {
                e = mid - 1;
            }
            else 
            {
                s = mid + 1;
            }

        }
        return -1;
    }
    public int findMin(int[] nums) {
        int pivot = findPivot(nums);

        return nums[pivot + 1];
    }
}
