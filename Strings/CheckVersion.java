package revise_DSA.Strings;

//Leet Code problem link - https://leetcode.com/problems/compare-version-numbers/description/

public class CheckVersion {

    public static void main(String[] args) {
        String version1 = "1.1";
        String version2 = "0.001";
        System.out.println(compareVersion(version1, version2));
    }

    //Approach 1
    private static int compareVersion(String version1, String version2) {
        int i = 0;
        int j = 0;
        int n1, n2;
        int v1Length = version1.length();
        int v2Length = version2.length();

        while (i < v1Length || j < v2Length) {
            n1 = 0;
            n2 = 0;

            while (i < v1Length && version1.charAt(i) != '.') {
                n1 = n1 * 10 + (version1.charAt(i) - '0');
                i++;
            }
            i++;

            while (j < v2Length && version2.charAt(j) != '.') {
                n2 = n2 * 10 + (version2.charAt(j) - '0');
                j++;
            }
            j++;

            if (n1 < n2) return -1;
            else if (n1 > n2) return 1;
        }

        return 0;
    }

    //Approach 2
    private static int compareVersion2(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int max = Math.max(v1.length, v2.length);
        int n1, n2;

        for(int i=0; i<max; i++){
            n1 = 0;
            n2 = 0;

            if(i<v1.length){
                n1 = Integer.parseInt(v1[i]);
            }

            if(i<v2.length){
                n2 = Integer.parseInt(v2[i]);
            }

            if(n1>n2){
                return 1;
            }
            else if(n1 < n2){
                return -1;
            }
        }

        return 0;
    }
}
