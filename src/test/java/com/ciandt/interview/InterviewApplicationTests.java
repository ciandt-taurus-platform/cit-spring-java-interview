package com.ciandt.interview;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
//  void shouldShortToParameterizeLenghtChars(String inputUrl) {
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


//  STEP 4
//
//  @Test
//  void shouldBeAbleToCountHitsFromShortUrl() {
//    var random = new Random();
//
//    var urls = List.of(
//        "https://ciandt.com",
//        "https://ciandt.com/en",
//        "https://ciandt.com/pt",
//        "https://linkedin.com",
//        "https://msn.com"
//    );
//
//    var shortUrls = urls.stream()
//        .map(InterviewApplication::generateShortUrl)
//        .collect(Collectors.toList());
//
//    //Generate random load
//    var hitCounts = shortUrls.stream()
//        .collect(Collectors.toMap(
//            Function.identity(),
//            s -> random.nextInt(20)
//        ));
//
//    //Hit the method
//    hitCounts.forEach(
//        (shortUrl, hitCount) -> {
//          for (var i = 0; i < hitCount; i++) {
//            InterviewApplication.getOriginalUrl(shortUrl);
//          }
//        }
//    );
//
//    //Validate
//    hitCounts.forEach(
//        (shortUrl, hitCount) -> Assertions.assertThat(
//            InterviewApplication.getHitCountStatistics(shortUrl)
//        ).isEqualTo(hitCount)
//    );
//  }

}
