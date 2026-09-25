class Solution {
public:
    string removeDuplicates(string s) {
        //intialise ans string as empty string
        string ans = "";        
        int n = s.length();

        for(int i=0; i<n; i++) {
            char currCharacter = s[i];
            if(ans.empty() || currCharacter != ans.back()) {
                //if ans is empty, seedha push karo
                ans.push_back(currCharacter);
            }//rightmost character of ans = ans.back()
            else if(currCharacter == ans.back()) {
                ans.pop_back();
            }
        }
        return ans;
    }
};



class Solution {
    public String removeDuplicates(String s) {
        // Use StringBuilder instead of string for efficiency
        StringBuilder ans = new StringBuilder();

        for (char currCharacter : s.toCharArray()) {
            if (ans.length() == 0 || currCharacter != ans.charAt(ans.length() - 1)) {
                // If ans is empty or current char is not equal to last char
                ans.append(currCharacter);
            } else {
                // If current char equals last char, remove last char
                ans.deleteCharAt(ans.length() - 1);
            }
        }

        return ans.toString();
    }
}

class Solution {
    public String removeDuplicates(String s) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // अगर ans खाली है या last char अलग है → जोड़ दो
            if (ans.isEmpty() || ans.charAt(ans.length() - 1) != ch) {
                ans = ans + ch;
            } else {
                // अगर last char same है → remove कर दो
                ans = ans.substring(0, ans.length() - 1);
            }
        }

        return ans;
    }
}
