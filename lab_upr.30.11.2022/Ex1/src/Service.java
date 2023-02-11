import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Service{
    private List<Device> deviceList;
    private Queue<BrokenDevice> brokenDeviceList;

    public Service() {
        this.deviceList = new ArrayList<Device>();
        this.brokenDeviceList = new LinkedList<BrokenDevice>();
    }

    public List<Device> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(List<Device> deviceList) {
        this.deviceList = deviceList;
    }

    public Queue<BrokenDevice> getBrokenDeviceList() {
        return brokenDeviceList;
    }

    public void setBrokenDeviceList(Queue<BrokenDevice> brokenDeviceList) {
        this.brokenDeviceList = brokenDeviceList;
    }

    public void addDevice(Device device) {
        deviceList.add(device);
        writeDeviceOnFile();
    }

    public void addBrokenDevice(BrokenDevice brokenDevice) {
        brokenDeviceList.add(brokenDevice);
        writeBrokenDeviceOnFile();
    }

    public void repairDevice(BrokenDevice device) {
        brokenDeviceList.remove(device);
        addDevice((Device)device);
        writeBrokenDeviceOnFile();
    }

    public void searchBySymptom(String symptom) {

        brokenDeviceList = (Queue<BrokenDevice>) readBrokenDeviceOnFile();
        brokenDeviceList.stream().filter(device -> device.getSymptoms().equals(symptom)).forEach(BrokenDevice::printValues);
    }

    public double calculateTotalPrice() {
        double sum = 0;
        for (Device device : deviceList) {
            sum+=device.getPrice();
        }
        return sum;
    }

    public double calculateIncome(double pricePerDevice){
        return pricePerDevice*brokenDeviceList.size();
    }


    private void writeBrokenDeviceOnFile() {
        String filename = "BrokenDevices";
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(brokenDeviceList);
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private Queue<BrokenDevice> readBrokenDeviceOnFile() {
        String fileName = "BrokenDevices";
        Queue<BrokenDevice> brokenDevices = null;
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream oos = new ObjectInputStream(fis);
            brokenDevices = (Queue<BrokenDevice>) oos.readObject();
            oos.close();
            fis.close();
        } catch (ClassNotFoundException | IOException ioe) {
            ioe.printStackTrace();
        }
        return brokenDevices;

    }

    private void writeDeviceOnFile() {
        String filename = "Devices";
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(deviceList);
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private List<Device> readDeviceOnFile() {
        String fileName = "Devices";
        List<Device> devices = null;
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream oos = new ObjectInputStream(fis);
            devices = (List<Device>) oos.readObject();
            oos.close();
            fis.close();
        } catch (ClassNotFoundException | IOException ioe) {
            ioe.printStackTrace();
        }
        return devices;

    }

    public void printDeviceList(){
        System.out.println("Devices list:");
        deviceList.forEach(Device::printValues);
    }

    public void printBrokenDeviceList(){
        System.out.println("Broken devices list:");
        brokenDeviceList.forEach(BrokenDevice::printValues);
    }

}
