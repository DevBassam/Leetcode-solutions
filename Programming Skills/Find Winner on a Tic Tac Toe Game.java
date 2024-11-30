class Solution {
    public String tictactoe(int[][] moves) {
        char [] slots = new char[9];
        int index = 0;
        for(int i = 0; i < moves.length; i++){
            index = (moves[i][0]*2) + (moves[i][0]+moves[i][1]);
            if(i % 2 == 0) slots[index] = 'x';
            else slots[index] = 'o';
        }
        // System.out.println(Arrays.toString(slots));
        if(checkRow('x',slots)||checkCol('x',slots)||checkDiagonal('x',slots)) return "A";
        if(checkRow('o',slots)||checkCol('o',slots)||checkDiagonal('o',slots)) return "B";
        return (moves.length < 9) ? "Pending" : "Draw";        
    }

    private boolean checkRow(char e, char[] arr){
        boolean r1 = arr[0] == e && arr[1] == e && arr[2] == e; 
        boolean r2 = arr[3] == e && arr[4] == e && arr[5] == e; 
        boolean r3 = arr[6] == e && arr[7] == e && arr[8] == e; 
        return r1 || r2 || r3;
    }
    private boolean checkCol(char e, char[] arr){
        boolean c1 = arr[0] == e && arr[3] == e && arr[6] == e; 
        boolean c2 = arr[1] == e && arr[4] == e && arr[7] == e; 
        boolean c3 = arr[2] == e && arr[5] == e && arr[8] == e; 
        return c1 || c2 || c3;
    }
    private boolean checkDiagonal(char e, char[] arr){
        boolean d1 = arr[0] == e && arr[4] == e && arr[8] == e; 
        boolean d2 = arr[2] == e && arr[4] == e && arr[6] == e; 
        return d1 || d2;
    }
}
