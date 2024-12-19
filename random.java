public class random {
    public static void main(String[] args) {
        String a = "abc";
        char[] arr = a.toCharArray();
        int[] freq = new int[26];
        for (char c : arr) {
            freq[c - 'a']++;
        }

        char mx = arr[0];
        char mn = arr[0];

        for (int i = 0; i < 26; i++) {
            if (freq[i] >= freq[mx - 'a']) {
                mx = (char) ('a' + i);
            }
            if (freq[25 - i] <= freq[mn - 'a'] && freq[25 - i] > 0) {
                mn = (char) ('a' + (25 - i));
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(freq[i]+"\t");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mn) {
                arr[i] = mx;
                break;
            }
        }

        // Convert character array back to string
        String result = new String(arr);
        System.out.println("Updated String: " + result);

    }
}
