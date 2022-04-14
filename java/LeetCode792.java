import javax.security.auth.callback.CallbackHandler;
import java.util.*;

/**
 * LeetCode792
 * <p>
 * Number of Matching Subsequences
 *
 * @author qiang.xu
 * @since 2022/3/29
 */
public class LeetCode792 {
    public static void main(String[] args) {

    }

    /**
     * My solution
     *
     * @param s
     * @param words
     * @return
     */
    public int numMatchingSubseq(String s, String[] words) {
        int len = s.length();
        int result = 0;

        // construct posMap of the s
        Map<Character, TreeSet<Integer>> posMap = new HashMap<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (posMap.containsKey(c)) {
                TreeSet<Integer> posSet = posMap.get(c);
                posSet.add(i);
            } else {
                TreeSet<Integer> posSet = new TreeSet<>();
                posSet.add(i);
                posMap.put(c, posSet);
            }
        }

        // cache the result for duplicate strings
        Map<String, Boolean> matchResultCache = new HashMap<>(words.length);
        for (String word : words) {
            if (word.length() < len) {
                if (matchResultCache.get(word) != null) {
                    result++;
                    continue;
                }
                boolean matchResult = isSubsequence(word, posMap);
                if (matchResult) {
                    result++;
                    matchResultCache.put(word, Boolean.TRUE);
                }
            }
        }
        return result;
    }

    private boolean isSubsequence(String s, Map<Character, TreeSet<Integer>> posMap) {
        int lastIndex = -1;
        for (char c : s.toCharArray()) {
            if (!posMap.containsKey(c)) {
                return false;
            } else {
                TreeSet<Integer> posSet = posMap.get(c);
                Integer index = posSet.higher(lastIndex);
                if (index == null) {
                    return false;
                }
                lastIndex = index;
            }
        }
        return true;
    }

    public int numMathchingSubseq2(String s, String[] words) {
        Map<Character, Deque<String>> map = new HashMap<>(32);
        for (char c = 'a'; c <= 'z'; c++) {
            map.putIfAbsent(c, new LinkedList<>());
        }
        for (String word : words) {
            map.get(word.charAt(0)).add(word);
        }
        int count = 0;
        for (char c : s.toCharArray()) {
            Deque<String> stringDeque = map.get(c);
            int size = stringDeque.size();
            for (int i = 0; i < size; i++) {
                String tmp = stringDeque.removeFirst();
                if (tmp.length() == 1) {
                    count++;
                } else {
                    map.get(tmp.charAt(1)).add(tmp.substring(1));
                }
            }
        }
        return count;
    }
}
