class Solution {
    public boolean judgeCircle(String moves) {
        int hori = 0 ;
        int veri = 0 ;
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'D') veri--;
            else if(moves.charAt(i) == 'U') veri++;
            else if(moves.charAt(i) == 'R') hori++;
            else hori--;
        }
        return hori == 0 && veri == 0;
    }
}

/*
class Solution {
    public boolean judgeCircle(String moves) {
        int[] cnt = new int[128]; // Mảng để đếm số lần xuất hiện của các ký tự

        // Đếm số lần xuất hiện của mỗi ký tự trong chuỗi moves
        for (char c : moves.toCharArray()) {
            cnt[c]++;
        }

        // Kiểm tra xem số lần xuất hiện của 'U' và 'D' có bằng nhau, 
        // và số lần xuất hiện của 'L' và 'R' có bằng nhau hay không
        return cnt['U'] == cnt['D'] && cnt['L'] == cnt['R'];
    }
}
*/
