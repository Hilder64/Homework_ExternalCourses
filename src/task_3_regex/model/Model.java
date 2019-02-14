package task_3_regex.model;

import task_3_regex.model.entity.Group;
import task_3_regex.model.entity.NotebookEntry;

public class Model {
    public NotebookEntry createEntry(String fullName,
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
        return new NotebookEntry(fullName, nickName, comment, group, homePhone,
                mobilePhone, mobilePhoneAdditional, eMail, skype, address,
                dateOfEntry, dateOfLastChangeEntry);
    }

    public String getEntry(NotebookEntry entry) {
        return entry.toString();
    }
}
