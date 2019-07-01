public class Skill {

    private String skill;
    private String level;

    public Skill(String skill, String level) {
        this.skill = skill;
        this.level = level;
    }

    public Skill() {
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString(){
        return getSkill() + ", " + getLevel() + "\n";
    }

}
