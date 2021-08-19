package app.coronawarn.verification.portal.service;

import app.coronawarn.verification.portal.client.TeleTan;
import app.coronawarn.verification.portal.client.VerificationServerClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TeleTanService {

  private final VerificationServerClient verificationServerClient;
 
  public static final String TOKEN_PREFIX = "Bearer ";

  public TeleTan createTeleTan(String token, String teleTanType) {
    return verificationServerClient.createTeleTan(TOKEN_PREFIX + token, teleTanType);
  }

}
