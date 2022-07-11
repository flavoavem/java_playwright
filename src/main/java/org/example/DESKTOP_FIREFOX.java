package org.example;

import com.microsoft.playwright.*;
//import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
//import java.util.*;

public class DESKTOP_FIREFOX {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions()
          .setHeadless(false));
      BrowserContext context = browser.newContext(new Browser.NewContextOptions()
          .setDeviceScaleFactor(1)
          .setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:100.0.2) Gecko/20100101 Firefox/100.0.2")
          .setViewportSize(1280, 720));

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

      // Click text=Submit Answer ❯
      page.locator("text=Submit Answer ❯").click();

      // Click text=Next Exercise ❯
      page.locator("text=Next Exercise ❯").click();
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

      // Click text=Submit Answer ❯
      page.locator("text=Submit Answer ❯").click();

      // Click text=Next Exercise ❯
      page.locator("text=Next Exercise ❯").click();
      assertThat(page).hasURL("https://www.w3schools.com/css/exercise.asp?filename=exercise_css3_animations6");
    }
  }
}