package task_3_regex.model.entity;

public enum Group {
    GROUP1,
    GROUP2,
    GROUP3,
    GROUP4,
    GROUP5;

    public static Group getGroup(String group) {
        switch (group.charAt(5)) {
            case '1':
                return GROUP1;
            case '2':
                return GROUP2;
            case '3':
                return GROUP3;
            case '4':
                return GROUP4;
            case '5':
                return GROUP5;
            default:
                throw new RuntimeException();
        }
    }
}
