// public class Pattern {
//     public static void main(String[] args){
//         int n=6;
//         for (int i=1;i<=n;i++){
//             System.out.println("*".repeat(i));
//         }
//     }
// }
// public class Pattern {

//   public static void main(String[] args) {
//     int n = 6;
//     for (int i = 1; i <= n; i++) {
//       System.out.println(" ".repeat(n - i) + "*".repeat(i));
//     }
//   }
// }

// public class Pattern{
//     public static void main(String[] args){
//         int n=6;
//         for(int i=n;i>=1;i--){
//             System.out.println("*".repeat(i));
//         }
//     }
// }

// public class Pattern{
//     public static void main(String[] args){
//         int n=6;
//         for(int i=n;i>=1;i--){
//             System.out.println(" ".repeat(n-i)+"*".repeat(i)+"*".repeat(i));
//         }
//     }
// }

public class Pattern {

  public static void main(String[] args) {
    int n = 6;
    for (int i = 1; i <= n; i++) {
      System.out.println(" ".repeat(n - i) + "*".repeat(i * 2 - 1));
    }
  }
}
