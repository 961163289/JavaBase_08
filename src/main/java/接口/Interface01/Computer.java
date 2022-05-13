package 接口.Interface01;

public class Computer {

    public void work(UsbInterface usbInterface) {
        usbInterface.start();
        usbInterface.stop();
    }

//    public void work(Camera camera){
//        camera.start();
//        camera.stop();
//    }

//    public void work(Phone phone){
//        phone.start();
//        phone.stop();
//    }

}
