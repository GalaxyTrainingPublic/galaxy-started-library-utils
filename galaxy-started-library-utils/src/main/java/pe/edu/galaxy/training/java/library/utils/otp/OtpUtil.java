package pe.edu.galaxy.training.java.library.utils.otp;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

@Service
public class OtpUtil {

    private final Map<String, OtpInfo> otpStorage = new ConcurrentHashMap<>();

    public String generateOtp(String username) {
        String otp = String.valueOf((int) (Math.random() * 900_000) + 100_000);
        otpStorage.put(username, new OtpInfo(otp, LocalDateTime.now().plusMinutes(3)));
        return otp;
    }

    public boolean validateOtp(String username, String otp) {
        OtpInfo info = otpStorage.get(username);
        if (info == null || LocalDateTime.now().isAfter(info.expiration())) {
            return false;
        }
        boolean isValid = info.code().equals(otp);
        if (isValid) otpStorage.remove(username);
        return isValid;
    }

    record OtpInfo(String code, LocalDateTime expiration) {}
}