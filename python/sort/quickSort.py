def quickSort(nums,low,high):
    if low < high:
        pivot_index = partition(nums,low,high)
        quickSort(nums,low,pivot_index-1)
        quickSort(nums,pivot_index+1,high)

def partition(nums,low,high):
    pivot = nums[low]
    i,j = low+1,high
    while i<=j:
        while i<=j and nums[j] >= pivot:
            j-=1
        while i<=j and nums[i] < pivot:
            i+=1
        if i<=j:
            nums[i],nums[j] = nums[j],nums[i]
            j-=1
            i+=1
    nums[low],nums[j] = nums[j],nums[low]
    return j

if __name__ == '__main__':
    nums = [4,3,1,2,5,7,10,11,12,8,6]
    quickSort(nums,0,len(nums)-1)
    print(nums)