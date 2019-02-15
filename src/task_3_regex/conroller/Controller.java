package task_3_regex.conroller;

import task_3_regex.model.Model;
import task_3_regex.view.TextConstants;
import task_3_regex.view.View;

import java.util.Scanner;

public class Controller {
    Model model;
    View view;
    Scanner scanner;
    private String firstName;
    private String lastName;
    private String middleName;
    private StringBuilder fullName;
    private String nickName;
    private String comment;
    private String group;
    private String homePhone;
    private String mobilePhone;
    private String mobilePhoneAdditional;
    private String eMail;
    private String skype;
    private StringBuilder address;
    private String dateOfEntry;
    private String dateOfLastChangeEntry;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        scanner = new Scanner(System.in);
        fullName = new StringBuilder();
        address = new StringBuilder();
    }

    public void processUser() {
        view.printRequestMessage(TextConstants.FIRST_NAME);
        firstName = inputStringValueWithScanner(TextConstants.FIRST_NAME, RegexContainer.NAME_REGEX);
        view.printRequestMessage(TextConstants.LAST_NAME);
        lastName = inputStringValueWithScanner(TextConstants.LAST_NAME, RegexContainer.NAME_REGEX);
        view.printRequestMessage(TextConstants.MIDDLE_NAME);
        middleName = inputStringValueWithScanner(TextConstants.MIDDLE_NAME, RegexContainer.NAME_REGEX);
        fullName.append(lastName);
        fullName.append(TextConstants.SPACE_SING);
        fullName.append(firstName.charAt(0));
        fullName.append(TextConstants.DOT_SING);
        view.printRequestMessage(TextConstants.NICK_NAME);
        nickName = inputStringValueWithScanner(TextConstants.NICK_NAME, RegexContainer.NAME_REGEX);
        view.printRequestMessage(TextConstants.COMMENT);
        comment =  inputStringValueWithScanner(TextConstants.COMMENT, RegexContainer.COMMENT_REGEX);
        view.printRequestMessage(TextConstants.GROUP);
        group = inputStringValueWithScanner(TextConstants.GROUP, RegexContainer.GROUP_REGEX);
        view.printRequestMessage(TextConstants.HOME_PHONE);
        homePhone = inputStringValueWithScanner(TextConstants.HOME_PHONE, RegexContainer.PHONE_REGEX);
        view.printRequestMessage(TextConstants.MOBILE_PHONE);
        mobilePhone = inputStringValueWithScanner(TextConstants.MOBILE_PHONE, RegexContainer.PHONE_REGEX);
        view.printRequestMessage(TextConstants.MOBILE_PHONE_ADD);
        mobilePhoneAdditional = inputStringValueWithScanner(TextConstants.MOBILE_PHONE_ADD, RegexContainer.PHONE_REGEX_ADD);
        view.printRequestMessage(TextConstants.E_MAIL);
        eMail = inputStringValueWithScanner(TextConstants.E_MAIL, RegexContainer.E_MAIL_REGEX);
        view.printRequestMessage(TextConstants.SKYPE);
        skype = inputStringValueWithScanner(TextConstants.SKYPE, RegexContainer.SKYPE_REGEX);
        view.printRequestMessage(TextConstants.POSTCODE);
        address.append(inputStringValueWithScanner(TextConstants.POSTCODE, RegexContainer.POSTCODE_REGEX));
        view.printRequestMessage(TextConstants.CITY);
        address.append(TextConstants.SPACE_SING);
        address.append(inputStringValueWithScanner(TextConstants.CITY, RegexContainer.CITY_AND_STREET_REGEX));
        view.printRequestMessage(TextConstants.STREET);
        address.append(TextConstants.SPACE_SING);
        address.append(inputStringValueWithScanner(TextConstants.STREET, RegexContainer.CITY_AND_STREET_REGEX));
        view.printRequestMessage(TextConstants.HOUSE_NUMBER);
        address.append(TextConstants.SPACE_SING);
        address.append(inputStringValueWithScanner(TextConstants.HOUSE_NUMBER, RegexContainer.HOUSE_AND_APARTMENT_REGEX));
        view.printRequestMessage(TextConstants.APARTMENT_NUMBER);
        address.append(TextConstants.SPACE_SING);
        address.append(inputStringValueWithScanner(TextConstants.APARTMENT_NUMBER, RegexContainer.HOUSE_AND_APARTMENT_REGEX));
        view.printRequestMessage(TextConstants.DATE_OF_ENTRY);
        dateOfEntry = inputStringValueWithScanner(TextConstants.DATE_OF_ENTRY, RegexContainer.DATE_REGEX);
        view.printRequestMessage(TextConstants.DATE_OF_LAST_CHANGE);
        dateOfLastChangeEntry = inputStringValueWithScanner(TextConstants.DATE_OF_LAST_CHANGE, RegexContainer.DATE_REGEX);

        model.createEntry(fullName.toString(), nickName, comment, group, homePhone, mobilePhone, mobilePhoneAdditional,
                eMail, skype, address.toString(), dateOfEntry, dateOfLastChangeEntry);

        view.printMessage(model.getEntry());
    }

    String inputStringValueWithScanner(String messageType, String regex) {
        String res;
        while (!(scanner.hasNextLine() &&
                (res = scanner.nextLine()).matches(regex))) {
            view.printWrongStringInput(messageType);/*.printMessage(TextConstants.WRONG_INPUT_DATA);*/
        }
        return res;
    }
}
