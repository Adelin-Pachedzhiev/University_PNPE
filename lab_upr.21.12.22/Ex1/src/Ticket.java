public class Ticket {
    private String message;
    private Customer receivedBy;
    private boolean inProgress;
    private Support processedBy;


    public Ticket(String message, Customer receivedBy) {
        this.receivedBy = receivedBy;
        this.message = message;
        this.inProgress = false;
        this.processedBy = null;
    }

    public void setInProgress(boolean inProgress, Support support) {
        this.inProgress = inProgress;
        this.processedBy = support;
    }

}
