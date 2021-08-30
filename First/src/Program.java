public class Program {
    public static void main(String[] args) {
        int[] digit={1,2,3};

        for (int x = 0; x <=2; x++) {
            for (int y = 0; y <= 2; y++) {
                for (int z = 0; z <= 2; z++) {
                    if (x != y && x != z && y != z) {

                        System.out.println(digit[x] + "" + digit[y] + "" + digit[z]);
                    }
                }
            }
        }
    }
        }
