package task_3_regex.conroller;

public interface RegexContainer {
    public static final String NAME_REGEX = "^[A-Z][a-z]+$";
    public static final String COMMENT_REGEX = "^(\\w+\\s*)+$";
    public static final String GROUP_REGEX = "^Group[1-5]$";
    public static final String PHONE_REGEX = "^\\+[0-9]{12}$";
    public static final String E_MAIL_REGEX = "^[A-Za-z0-9_.+-]+@[A-Za-z0-9_.+-]+$";
    public static final String SKYPE_REGEX = "^\\w+\\.?\\w*$";
    public static final String POSTCODE_REGEX = "^[0-9]{5}$";
    public static final String CITY_AND_STREET_REGEX = "^[A-Z][a-z]+$";
    public static final String HOUSE_NUMBER_REGEX = "^[0-9]+$";
    public static final String DATE_REGEX = "^([0-2][0-9]||3[0-1])\\.(0[1-9]||1[0-2])\\.[0-9][0-9][0-9][0-9]$";
}
