package org.example;

import com.microsoft.playwright.*;
//import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
//import java.util.*;

public class NOKIAN9 {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.webkit().launch(new BrowserType.LaunchOptions()
          .setHeadless(false));
      BrowserContext context = browser.newContext(new Browser.NewContextOptions()
          .setDeviceScaleFactor(1)
          .setHasTouch(true)
          .setIsMobile(true)
          .setUserAgent(
              "Mozilla/5.0 (MeeGo; NokiaN9) AppleWebKit/534.13 (KHTML, like Gecko) NokiaBrowser/8.5.0 Mobile Safari/534.13")
          .setViewportSize(480, 854));

      // Open new page
      Page page = context.newPage();

      // Go to
      // https://www.w3schools.com/css/exercise.asp?filename=exercise_css3_animations1
      page.navigate("https://www.w3schools.com/css/exercise.asp?filename=exercise_css3_animations1");

      // Go to
      // https://www.w3schools.com/css/exercise.asp?filename=exercise_css3_animations2
      page.navigate("https://www.w3schools.com/css/exercise.asp?filename=exercise_css3_animations2");

      // Go to
      // https://www.w3schools.com/css/exercise.asp?filename=exercise_css3_animations3
      page.navigate("https://www.w3schools.com/css/exercise.asp?filename=exercise_css3_animations3");

      // Click #answerbuttoncontainer >> text=Show Answer
      page.locator("#answerbuttoncontainer >> text=Show Answer").click();

      // Click #answerbuttoncontainer >> text=Hide Answer
      page.locator("#answerbuttoncontainer >> text=Hide Answer").click();

      // Click input >> nth=0
      page.locator("input").first().click();

      // Fill input >> nth=0
      page.locator("input").first().fill("animation-delay");

      // Press Tab
      page.locator("input").first().press("Tab");

      // Fill input >> nth=1
      page.locator("input").nth(1).fill("1s");

      // Click text=Submit Answer ???
      page.locator("text=Submit Answer ???").click();

      // Click text=Next Exercise ???
      page.locator("text=Next Exercise ???").click();
      assertThat(page).hasURL("https://www.w3schools.com/css/exercise.asp?filename=exercise_css3_animations4");

      // Go to
      // https://www.w3schools.com/css/exercise.asp?filename=exercise_css3_animations5
      page.navigate("https://www.w3schools.com/css/exercise.asp?filename=exercise_css3_animations5");

      // Click #answerbuttoncontainer >> text=Show Answer
      page.locator("#answerbuttoncontainer >> text=Show Answer").click();

      // Click #answerbuttoncontainer >> text=Hide Answer
      page.locator("#answerbuttoncontainer >> text=Hide Answer").click();

      // Click input >> nth=0
      page.locator("input").first().click();

      // Fill input >> nth=0
      page.locator("input").first().fill("animation-direction");

      // Press Tab
      page.locator("input").first().press("Tab");

      // Click #answerbuttoncontainer >> text=Show Answer
      page.locator("#answerbuttoncontainer >> text=Show Answer").click();

      // Click #answerbuttoncontainer >> text=Hide Answer
      page.locator("#answerbuttoncontainer >> text=Hide Answer").click();

      // Click input >> nth=1
      page.locator("input").nth(1).click();

      // Fill input >> nth=1
      page.locator("input").nth(1).fill("alternate");

      // Click text=Submit Answer ???
      page.locator("text=Submit Answer ???").click();

      // Click text=Next Exercise ???
      page.locator("text=Next Exercise ???").click();
      assertThat(page).hasURL("https://www.w3schools.com/css/exercise.asp?filename=exercise_css3_animations6");
    }
  }
}