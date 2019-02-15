package task_3_regex.model.entity;

public class NotebookEntry {
    private String fullName;
    private String nickName;
    private String comment;
    private Group group;
    private String homePhone;
    private String mobilePhone;
    private String mobilePhoneAdditional;
    private String eMail;
    private String skype;
    private String address;
    private String dateOfEntry;
    private String dateOfLastChangeEntry;

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
        return "NotebookEntry = \n" +
                "fullName='" + fullName + "\'\n" +
                "nickName='" + nickName + "\'\n" +
                "comment='" + comment + "\'\n" +
                "group='" + group + "\'\n" +
                "homePhone='" + homePhone + "\'\n" +
                "mobilePhone='" + mobilePhone + "\'\n" +
                "mobilePhoneAdditional='" + mobilePhoneAdditional + "\'\n" +
                "eMail='" + eMail + "\'\n" +
                "skype='" + skype + "\'\n" +
                "address='" + address + "\'\n" +
                "dateOfEntry='" + dateOfEntry + "\'\n" +
                "dateOfLastChangeEntry='" + dateOfLastChangeEntry + '\'';
    }
}
