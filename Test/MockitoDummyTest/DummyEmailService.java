package MockitoDummyTest;

import com.keawe.practiceUnitTest.EmailService;

public class DummyEmailService implements EmailService {
    @Override
    public void emailService() {
      throw new AssertionError("Dummy email service");
    }
}
