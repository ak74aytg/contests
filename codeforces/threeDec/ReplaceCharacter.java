//package codeforces.threeDec;

import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            StringBuilder s = new StringBuilder(str);
            int[] freq = new int[26];

            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i)-'a']++;
            }

            char max = s.charAt(0);
            char min = s.charAt(0);

            for (int i = 0; i < 26; i++) {
                if(freq[i]>=freq[max-'a']){
                    max = (char) (i+'a');
                }
                if(freq[25-i]<=freq[min-'a'] && freq[25-i]>0){
                    min = (char) (25-i+'a');
                }
            }

            for (int i = 0; i < n; i++) {
                if(s.charAt(i)==min){
                    s.setCharAt(i, max);
                    break;
                }
            }
            System.out.println(s);
        }


    }
}

//
//int n = sc.nextInt();
//            sc.nextLine();
//String str = sc.nextLine();
//StringBuilder s = new StringBuilder(str);
//HashMap<Character, Integer> map = new HashMap<>();
//            for (int i = 0; i < s.length(); i++) {
//        map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
//        }
//int max = 0;
//int min = n+1;
//Character[] ch = new Character[2];
//            for (Map.Entry<Character, Integer> item : map.entrySet()){
//        if(item.getValue()>max){
//ch[0] = item.getKey();
//max = item.getValue();
//                }
//                        if(item.getValue()<min){
//ch[1] = item.getKey();
//min = item.getValue();
//                }
//                        }
//                        if(ch[0]==ch[1]){
//        for (int i = 0; i < n; i++) {
//        if(s.charAt(i)!=ch[0]){
//        s.setCharAt(i, ch[0]);
//                        break;
//                                }
//                                }
//                                System.out.println(s);
//                continue;
//                        }
//                        for (int i = 0; i < n; i++) {
//        if(s.charAt(i)==ch[1]){
//        s.setCharAt(i, ch[0]);
//                    break;
//                            }
//                            }
//                            System.out.println(s);
