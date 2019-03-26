import java.util.ArrayList;

public class Backpack {

    public ArrayList<__Object> sac;
    public int quantity;

    public Backpack() {
        this.sac = new ArrayList<>();
        this.quantity = 0;
    }

    public void backtrack (ArrayList<__Object> sac, int k, int n) {
        ArrayList<__Object> list = new ArrayList<>();

        if (isSolution(k, n)) {
            processSolution(sac);
        }

        else {
            backtrack(sac, k + 1, n);
            list.add(sac.get(k));
            backtrack(sac, k+1, n);
            list.remove(k);
            }
        System.out.println(list);
    }

    public int weight (ArrayList<__Object> list) {
        for (int i = 0; i < list.size(); i++) {
            quantity += list.get(i).getWeight();
        }
        return quantity;
    }

    public boolean isSolution (int k, int n) {
        return k == n;
    }

    public boolean processSolution (ArrayList<__Object> sac) {
        return weight(sac) <= 1000;
    }
}
