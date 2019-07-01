import java.util.ArrayList;

public class Resume {
    private Info details;
    private ArrayList<Education> edList = new ArrayList<>();
    private ArrayList<Experience> exList = new ArrayList<>();
    private ArrayList<Skill> skList = new ArrayList<>();


    public Resume(Info details, ArrayList<Education> edList, ArrayList<Experience> exList, ArrayList<Skill> skList) {
        this.details = details;
        this.edList = edList;
        this.exList = exList;
        this.skList = skList;
    }

    public Resume() {
    }

    public Info getDetails() {
        return details;
    }

    public void setDetails(Info details) {
        this.details = details;
    }

    public ArrayList<Education> getEdList() {
        return edList;
    }

    public void setEdList(Education ed) {
        this.edList.add(ed);
    }

    public ArrayList<Experience> getExList() {
        return exList;
    }

    public void setExList(Experience ex) {
        this.exList.add(ex);
    }

    public ArrayList<Skill> getSkList() {
        return skList;
    }

    public void setSkList(Skill sk) {
        this.skList.add(sk);
    }
}
