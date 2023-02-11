public class SickPatient extends Patient{
    private String summary;
    private String status;
    private int dayOfSickness;

    public SickPatient(String name, String adress, String egn, String summary, String status, int dayOfSickness){
        super(name, adress, egn);
        this.summary = summary;
        this.status = status;
        this.dayOfSickness = dayOfSickness;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDayOfSickness() {
        return dayOfSickness;
    }

    public void setDayOfSickness(int dayOfSickness) {
        this.dayOfSickness = dayOfSickness;
    }

    @Override
    public void cure(String drug, int dose) {
        setSummary(drug +" "+ dose);
    }
}
