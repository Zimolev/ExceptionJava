package SeminarThree.HomeWork.Service;

import java.io.IOException;
import java.util.List;

public interface VerificationData {
    String isFullName(List<String> str);
    String isDateBirth(List<String> str);
    Long isPhoneNumber(List<String> str);
    char isSex(List<String> str);
}
