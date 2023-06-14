class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[] range = new int[distance.length];
        Arrays.fill(range, -1);

        for(int i = 0; i < s.length(); ++i) {
            int index = s.charAt(i) - 'a';

            if(range[index] != -1 && Math.abs(range[index] - i) != distance[index] + 1)
                return false;

            range[index] = i;
        }

        return true;
    }
}