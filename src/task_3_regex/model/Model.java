package task_3_regex.model;

import task_3_regex.model.entity.Group;
import task_3_regex.model.entity.NotebookEntry;

public class Model {
    NotebookEntry entry;

    public NotebookEntry createEntry(String fullName, String nickName,
                                     String comment, String group,
                                     String homePhone, String mobilePhone,
                                     String mobilePhoneAdditional, String eMail,
                                     String skype, String address,
                                     String dateOfEntry, String dateOfLastChangeEntry) {
        return entry = new NotebookEntry(fullName, nickName, comment, Group.getGroup(group), homePhone,
                mobilePhone, mobilePhoneAdditional, eMail, skype, address,
                dateOfEntry, dateOfLastChangeEntry);
    }

    public String getEntry() {
        return entry.toString();
    }
}
