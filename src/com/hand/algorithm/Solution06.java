package com.hand.algorithm;

/**
 * 旋转数组的最小数字：
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0
 */
public class Solution06 {
    /**
     * 思路：二分查找
     * 有三种情况找到最小值：
     * 1、下标为n+1的值小于下标为n的值，则下标为n+1的值肯定是最小元素
     * 2、下标为n的值小于下标为n-1的值，则下标为n的值肯定是最小元素
     * 3、由于不断查找，数组查找范围内的值已经全为非降序
     * <p>
     * 每次二分查找时范围的变化：
     * 1、当下标为n的值大于下标为0的值，从0到n这一段肯定是升序，最小值肯定在后半段（如果数组本身是升序，在上面的第3种情况下已经找到了最小值）
     * 2、当下标为n的值小于下标为0的值，从0到n这一段不是升序，最小值肯定在这一段
     *
     * @param array
     * @return
     */
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) return array[0];
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (array[left] < array[right]) return array[left];
            if (array[mid] > array[mid + 1]) return array[mid + 1];
            if (array[mid] < array[mid - 1]) return array[mid];
            if (array[mid] > array[0]) left = mid + 1;
            else right = mid - 1;
        }
        return 0;
    }
}
