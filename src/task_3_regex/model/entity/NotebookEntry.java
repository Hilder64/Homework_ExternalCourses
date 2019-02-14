package task_3_regex.model.entity;

public class NotebookEntry {
    String fullName;
    String nickName;
    String comment;
    Group group;
    String homePhone;
    String mobilePhone;
    String mobilePhoneAdditional;
    String eMail;
    String skype;
    String address;
    String dateOfEntry;
    String dateOfLastChangeEntry;

    public NotebookEntry(String fullName,
                         String nickName,
                         String comment,
                         Group group,
                         String homePhone,
                         String mobilePhone,
                         String mobilePhoneAdditional,
                         String eMail,
                         String skype, String address,
                         String dateOfEntry,
                         String dateOfLastChangeEntry) {
        this.fullName = fullName;
        this.nickName = nickName;
        this.comment = comment;
        this.group = group;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.mobilePhoneAdditional = mobilePhoneAdditional;
        this.eMail = eMail;
        this.skype = skype;
        this.address = address;
        this.dateOfEntry = dateOfEntry;
        this.dateOfLastChangeEntry = dateOfLastChangeEntry;
    }

    @Override
    public String toString() {
        return "NotebookEntry{" +
                "fullName='" + fullName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", comment='" + comment + '\'' +
                ", group=" + group +
                ", homePhone='" + homePhone + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", mobilePhoneAdditional='" + mobilePhoneAdditional + '\'' +
                ", eMail='" + eMail + '\'' +
                ", skype='" + skype + '\'' +
                ", address='" + address + '\'' +
                ", dateOfEntry='" + dateOfEntry + '\'' +
                ", dateOfLastChangeEntry='" + dateOfLastChangeEntry + '\'' +
                '}';
    }
}
