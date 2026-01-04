class Solution {
    public int sumFourDivisors(int[] nums) 
    {
        int sum = 0;

        for (int i = 0; i < nums.length; i++)
        {
            int n = (int) Math.sqrt(nums[i]);
            int sum1 = 0;
            int count = 0;

            for (int j = 1; j <= n; j++)
            {
                if (nums[i] % j == 0)
                {
                    if (j * j == nums[i])
                    {
                        sum1 += j;
                        count++;
                    }
                    else
                    {
                        sum1 += j + (nums[i] / j);
                        count += 2;
                    }
                }

            
                if (count > 4)
                {
                    sum1 = 0;
                    break;
                }
            }

            if (count == 4)
            {
                sum += sum1;
            }
        }
        return sum;
    }
}
