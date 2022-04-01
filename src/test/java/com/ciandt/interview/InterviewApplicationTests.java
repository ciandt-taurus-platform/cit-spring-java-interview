package com.ciandt.interview;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class InterviewApplicationTests {

  @ParameterizedTest
  @CsvSource({
      "https://ciandt.com, https://shorter.url/abcef",
      "https://ciandt.com/en, https://shorter.url/abceg",
      "https://ciandt.com/pt, https://shorter.url/abceh",
      "https://linkedin.com, https://shorter.url/abc12f",
      "https://msn.com, https://shorter.url/c7e78",
  })
  void shouldShortToFiveChars(String inputUrl, String shorterUrl) {
    var shortUrl = InterviewApplication.generateShortUrl(inputUrl);
    Assertions.assertThat(shortUrl).isEqualTo(shorterUrl);
  }

//
//  @ParameterizedTest
//  @CsvSource({
//      "https://ciandt.com, https://shorter.url/db77c530",
//      "https://ciandt.com/en, https://shorter.url/db77c530",
//      "https://ciandt.com/pt, https://shorter.url/c33f30ca",
//      "https://linkedin.com, https://shorter.url/f1da69f2",
//  })
//  void shouldShortToParameterizeLenghtChars(String inputUrl, String shorterUrl) {
//    var shortUrl = InterviewApplication.generateShortUrl(inputUrl, 8);
//    Assertions.assertThat(shortUrl).isEqualTo(shorterUrl);
//  }


//  @ParameterizedTest
//  @CsvSource({
//      "https://ciandt.com, https://shorter.url/db77c530",
//      "https://ciandt.com/en, https://shorter.url/db77c530",
//      "https://ciandt.com/pt, https://shorter.url/c33f30ca",
//      "https://linkedin.com, https://shorter.url/f1da69f2",
//  })
//  void shouldBeAbleToReturnToOriginalUrl(String inputUrl, String shorterUrl) {
//    var shortUrl = InterviewApplication.generateShortUrl(inputUrl, 8);
//    Assertions.assertThat(shortUrl).isEqualTo(shorterUrl);
//
//    var original = InterviewApplication.getOriginalUrl(shortUrl);
//    Assertions.assertThat(original).isEqualTo(inputUrl);
//  }

}
