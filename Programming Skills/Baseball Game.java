class Solution {
    public int calPoints(String[] operations) {
        List<Integer> data = new ArrayList<>();
        int index = 0;
        int sum = 0;
        for(int i = 0; i< operations.length; i++){
            switch(operations[i]){
                case "+":
                    data.add(data.get(index-1)+data.get(index-2));
                    index++;
                    break;
                case "C":
                    data.remove(index-1);
                    index--;
                    break;
                case "D":
                    data.add(data.get(index-1)*2);
                    index++;
                    break;
                default:
                    data.add(Integer.parseInt(operations[i]));
                    index++;
            }
        }
        for (int number : data) {
        sum += number;
        }
        return sum;
    }
}
