class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        
        Deque<String> q = new ArrayDeque<>();
        
        for(String str: arr)
        {
            if(str.equals(""))
                continue;
            else if(str.equals("."))
                continue;
            else if(str.equals(".."))
                q.pollLast();
            else
                q.add(str);
        }
        return "/"+String.join("/", q);
    }
}
