package com.ciandt.interview;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class InterviewApplicationTests {

  @ParameterizedTest
  @ValueSource(strings = {
      "https://ciandt.com",
      "https://ciandt.com/en",
      "https://ciandt.com/pt",
      "https://linkedin.com",
      "https://msn.com",
  })
  void shouldShortToFiveChars(String inputUrl) {
    var shortUrl = InterviewApplication.generateShortUrl(inputUrl);
    Assertions.assertThat(shortUrl)
        .startsWith("https://shorter.url/")
        .matches("https://shorter.url/[a-zA-Z0-1]{5}");
  }

//
//  @ParameterizedTest
//  @ValueSource(strings = {
//      "https://ciandt.com",
//      "https://ciandt.com/en",
//      "https://ciandt.com/pt",
//      "https://linkedin.com",
//      "https://msn.com",
//  })
//  void shouldShortToParameterizeLenghtChars(String inputUrl, String shorterUrl) {
//    var shortUrl = InterviewApplication.generateShortUrl(inputUrl, 8);
//    Assertions.assertThat(shortUrl)
//      .startsWith("https://shorter.url/")
//        .matches("https://shorter.url/[a-zA-Z0-1]{8}");
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


//  STEP 3
//
//  @ParameterizedTest
//  @ValueSource(strings = {
//      "https://ciandt.com",
//      "https://ciandt.com/en",
//      "https://ciandt.com/pt",
//      "https://linkedin.com",
//      "https://msn.com",
//  })
//  void shouldBeAbleToReturnToOriginalUrl(String inputUrl) {
//    var shortUrl = InterviewApplication.generateShortUrl(inputUrl);
//    Assertions.assertThat(shortUrl)
//        .startsWith("https://shorter.url/")
//        .matches("https://shorter.url/[a-zA-Z0-1]{5}");
//
//
//    var original = InterviewApplication.getOriginalUrl(shortUrl);
//    Assertions.assertThat(original).isEqualTo(inputUrl);
//  }

}
