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

    public int BinarySerach(int arr[],int s,int e,int t)
    {
    
        while(s <= e)
        {

            int mid = s + (e - s)/2;

            if(arr[mid] == t)
            {
                return mid;
            }
            else if(arr[mid] > t)
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
    public int search(int[] nums, int target) {

        int pivot = findPivot(nums);

        // Array is Not Rotated
        if(pivot == -1)
        {
            return BinarySerach(nums,0,nums.length - 1,target);
        }

        if(nums[pivot] == target)
        {
            return pivot;
        }

        if(nums[0] <= target && target <= nums[pivot])
        {
            return BinarySerach(nums,0,pivot,target);
        }
        else 
        {
            return BinarySerach(nums,pivot + 1,nums.length - 1,target);
        }

    }
}
