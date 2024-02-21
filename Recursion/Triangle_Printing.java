package revise_DSA.Recursion;

public class Triangle_Printing {
    public static void main(String[] args) {
        trianglePrint2(4, 0);
    }

    public static void trianglePrint(int r, int c){
        if(r==0){
            return;
        }
        if(r>c){
            System.out.print("*");
            trianglePrint(r, c+1);
        }
        else{
            System.out.println();
            trianglePrint(r-1, 0);
        }
    }

    public static void trianglePrint2(int r, int c){
        if(r==0){
            return;
        }
        if(r>c){
            trianglePrint2(r, c+1);
            System.out.print("*");
        }
        else{
            trianglePrint2(r-1, 0);
            System.out.println();
        }
    }
}


