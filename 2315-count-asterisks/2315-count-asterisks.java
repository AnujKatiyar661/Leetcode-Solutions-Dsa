class Solution {
    public int countAsterisks(String s) {
        int barCount = 0;
        int asteriskCount = 0;
        for(char ch : s.toCharArray()) {
            barCount += ch == '|' ? 1 : 0;
            asteriskCount += barCount == 0 && ch == '*' ? 1 : 0;
            barCount = barCount == 2 ? 0 : barCount;
        }
        return asteriskCount;
    }
}