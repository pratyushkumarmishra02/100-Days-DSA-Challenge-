class ReverseInteger {
    public int reverse(int x) {
        boolean neg = x<0;
        StringBuilder sb = new StringBuilder(Integer.toString(Math.abs(x)));
        sb.reverse();
        int n;
        try {
            n = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0; 
        }
        return neg?-n:n;
    }
}