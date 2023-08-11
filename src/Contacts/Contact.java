package Contacts;

public class Contact {
    private String name;
    private String number;
    private Group group;
    public Contact(String name, String number, Group group) {
        this.name = name;
        this.number = number;
        this.group = group;
    }
    public Contact(String name, String number, int numGroup) {
        this.name = name;
        this.number = number;
        switch(numGroup){
            case 1: this.group = Group.FAMILY;
            break;
            case 2: this.group = Group.FRIEND;
                break;
            case 3: this.group = Group.COLLEAGUE;
                break;
            default:
                System.out.println("Wrong value of group member! Group status is FRIEND");
                this.group = Group.FRIEND;
                break;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public Group getGroup() {
        return group;
    }
    public void setGroup(Group group) {
        this.group = group;
    }
    @Override
    public String toString() {
        String result = String.format("Name: %s, Tel: %s, Group: %s", getName(), getNumber(), getGroup().name());
        return result;
    }
    @Override
    public int hashCode() {
        return getNumber().hashCode() + getName().hashCode() + getGroup().hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Contact)) return false;
        Contact con = (Contact) obj;
        return this.name.equals(con.getName()) && this.number.equals(con.getNumber()) && this.group.equals(getGroup());
    }
}