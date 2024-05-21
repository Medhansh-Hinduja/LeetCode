class Solution {
    public String simplifyPath(String path) {
        ArrayList<String> resultPath = new ArrayList<>();
        int slash_index = 1;

        while (slash_index < path.length()) {
            int next_slash = path.indexOf('/', slash_index);
            if (next_slash == -1) {
                next_slash = path.length();
            }
            String substr = path.substring(slash_index, next_slash);
            if (substr.equals("") || substr.equals(".")) {
                slash_index = next_slash + 1;
                continue;
            } else if (substr.equals("..")) {
                if (resultPath.size() > 0) {
                    resultPath.remove(resultPath.size() - 1);
                }
            } else {
                resultPath.add('/' + substr);
            }

            slash_index = next_slash + 1;

        }

        if (resultPath.size() == 0) {
            resultPath.add("/");
        }

        String output = "";
        for (int j = 0; j < resultPath.size(); j++) {
            output += resultPath.get(j);
        }

        return output;
    }
}