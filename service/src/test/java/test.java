/**
 * Created by kenan on 2018/7/26.
 */
public class test {

    public static void main(String[] args) {
        case1(5, "1,2,7,12,35", 35);
        case3("1024 998");
    }


    public static int case1(int n, String a, int val){
        String[] split = a.split(",");
        if(!a.contains(val + "")){
            return -1;
        }

        int num = get(split, 0, n-1, val);
        System.out.println(num);
        return num;
    }

   static int get(String[] a, int x, int y, int val){
        if(x == y || x == y-1){
            if(a[x].equals(val+"")){
                return x;
            }else if(a[y].equals(val + "")){
                return y;
            }else{
                return -1;
            }
        }

        int m = (x+y)/2;
        if(val == Integer.valueOf(a[m]).intValue()) {
            return m;
        }else if(val > Integer.valueOf(a[m]).intValue()){
            return get(a, m, y, val);
        }else{
            return get(a, x, m, val);
        }
   }



   public static int case3(String n){
       String[] nos = n.split(" ");
       int a = Integer.valueOf(nos[0]);
       int b = Integer.valueOf(nos[1]);

       int yue = yue(a, b, a > b ? b : a);
       System.out.println(yue);
       return yue;
   }

   private static int yue(int a, int b, int x){
        if(a%x == 0 && b%x == 0){
            return x;
        }else{
            return yue(a, b, x-1);
        }
   }
}
