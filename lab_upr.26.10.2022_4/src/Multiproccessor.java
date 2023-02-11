public class Multiproccessor {
    int CPUCount;
    int coreCount;
    int frequency;

    public Multiproccessor(int CPUCount, int coreCount, int frequency){
        this.CPUCount = CPUCount;
        this.coreCount = coreCount;
        this.frequency = frequency;
    }

    public int getCPUCount() {
        return this.CPUCount;
    }

    public void setCPUCount(int CPUCount) {
        this.CPUCount = CPUCount;
    }

    public int getCoreCount() {
        return this.coreCount;
    }

    public void setCoreCount(int coreCount) {
        this.coreCount = coreCount;
    }

    public int getFrequency() {
        return this.frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public double clockCalculator(){
        if (this.CPUCount < 1) this.CPUCount = 1;
        if (this.coreCount < 1) this.coreCount = 1;

        return (0.7*coreCount)*(0.8*CPUCount)*this.frequency;
    }
    public double timeCalculate(double t){
        return ((t*frequency)/clockCalculator());
    }

    public String toString(double t){
        return "CPU count:" + this.CPUCount + "\ncoreCount :" + this.coreCount + "\nCPU frequency:" + this.frequency + "\nmulty cpy clock:" + this.clockCalculator() +"\ntime:" + this.timeCalculate(t);



    }
}
