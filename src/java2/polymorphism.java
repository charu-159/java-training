package java2;
interface MyCamera2 {
    void takeSnap();
    void recordVideo();
    // void record4KVideo(); // Optional advanced method
}

interface MyWifi2 {
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2 {
    public void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    public void pickCall() {
        System.out.println("Connecting...");
    }
}

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2 {
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Recording video");
    }

    // Optional method — uncomment if needed
    // public void record4KVideo() {
    //     System.out.println("Taking snap and recording in 4K");
    // }

    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Prashanth", "Anjali56"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        MySmartPhone2 ms = new MySmartPhone2();

        // 📞 CellPhone features
        ms.callNumber(1234567890);
        ms.pickCall();

        // 📸 Camera features
        ms.takeSnap();
        ms.recordVideo();
        // ms.record4KVideo(); // Uncomment if method is defined

        // 🌐 Wifi features
        String[] nets = ms.getNetworks();
        for (String net : nets) {
            System.out.println(net);
        }
        ms.connectToNetwork("Prashanth");

        // 🔁 Polymorphism demo
        MyCamera2 camRef = new MySmartPhone2(); // Only camera methods accessible
        camRef.takeSnap();
        camRef.recordVideo();
        // camRef.getNetworks(); ❌ Not allowed — camRef is of type MyCamera2
    }
}

