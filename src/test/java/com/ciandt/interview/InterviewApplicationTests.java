package com.ciandt.interview;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class InterviewApplicationTests {

  //STEP 1

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
        .matches("https://shorter.url/[a-zA-Z0-9]{5}");
  }

//  STEP 2
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
//        .matches("https://shorter.url/[a-zA-Z0-9]{8}");
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
//        .matches("https://shorter.url/[a-zA-Z0-9]{5}");
//
//
//    var original = InterviewApplication.getOriginalUrl(shortUrl);
//    Assertions.assertThat(original).isEqualTo(inputUrl);
//  }

}
