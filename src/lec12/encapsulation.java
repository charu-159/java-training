package lec12;   // Yeh package ka naam hai, matlab code ko organize karne ke liye folder jaisa

class atm {
    private int totalbalance = 10000;
    // 'private' ka matlab hai ki yeh variable sirf 'atm' class ke andar accessible hai.
    // Bahar se directly access nahi kar sakte, encapsulation ka example.

    public void getbalanced() { // getter method
        System.out.println(totalbalance);
        // Jab bhi call karoge, current balance print karega.
    }

    public void setbalance(int amount) { // setter method
        if(amount > 0) {
            totalbalance += amount;
            // Agar positive amount diya hai, toh balance increase ho jayega.
        }
    }
}

class hello {
    public static void main(String[] args) {
        atm s1 = new atm();   // ek naya ATM object banaya
        s1.getbalanced();     // pehle balance print karega (10000)
        s1.setbalance(400);   // 400 add karega balance me
        // Lekin abhi tumne dobara getbalanced() call nahi kiya,
        // isliye updated balance (10400) print nahi ho raha.
    }
}
