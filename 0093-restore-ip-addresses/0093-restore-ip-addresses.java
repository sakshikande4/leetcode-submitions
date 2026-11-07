class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), res);
        return res;
    }
    
    private void backtrack(String s, int idx, List<String> path, List<String> res) {
        if (path.size() == 4) {
            if (idx == s.length()) {
                res.add(String.join(".", path));
            }
            return;
        }
        
        for (int i = 1; i <= 3 && idx + i <= s.length(); i++) {
            String part = s.substring(idx, idx + i);
            if (isValid(part)) {
                path.add(part);
                backtrack(s, idx + i, path, res);
                path.remove(path.size() - 1);
            }
        }
    }
    
    private boolean isValid(String s) {
        if (s.length() > 1 && s.startsWith("0")) return false;
        int val = Integer.parseInt(s);
        return val >= 0 && val <= 255;
    }
}