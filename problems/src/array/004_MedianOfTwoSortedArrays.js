/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */

// 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
// 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
// 你可以假设 nums1 和 nums2 不会同时为空。

var findMedianSortedArrays = function(nums1, nums2) {
    var res = 0;
    var nums = nums1.concat(nums2);
    nums.sort((a,b) => a-b);
    if(nums.length%2 === 0){
        res = ((nums[(nums.length/2)-1] + nums[nums.length/2])/2).toFixed(1);
    } else {
        res = (nums[(nums.length-1)/2]).toFixed(1);
    }
    return res;
};

console.log(findMedianSortedArrays([1,3],[2,5]));