package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class AirtelTestNoofLikes {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String A = br.readLine();
        String P = br.readLine();

        int out_ = count_like_dislike(A, P);
        System.out.println(out_);

        wr.close();
        br.close();
    }

    private static int count_like_dislike(String A, String P) {

        int ans = 0;

        int size=A.length();
        for (int i = 0; i <size; i++)
            if (A.charAt(i) ==  P.charAt(i))
                ans++;
        // System.out.println(ans);
        return ans;

    }
}