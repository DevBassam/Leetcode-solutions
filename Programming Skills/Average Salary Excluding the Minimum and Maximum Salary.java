class Solution {
    public double average(int[] salary) {
        // This approch took 2ms
        // int max = Arrays.stream(salary).max().orElse(Integer.MAX_VALUE);
        // int min = Arrays.stream(salary).min().orElse(Integer.MIN_VALUE);
        // int sum = (Arrays.stream(salary).sum() - (min+max));
        // return (double)sum / (salary.length - 2);

        // this apporch took 0ms
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum = 0;
        for(int i = 0; i < salary.length; i++){
            if(salary[i] > max) max = salary[i];
            if(salary[i] < min) min = salary[i];
            sum += salary[i]; 
        }
        return (sum - min - max) / (salary.length - 2);
    }
}
