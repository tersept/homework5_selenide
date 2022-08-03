package com.github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchGithub {
    @Test
    void search() {
        open("https://github.com/selenide/selenide/");
        $("#wiki-tab").click();
        $(byText("Soft assertions")).click();
        $("div.markdown-body").shouldHave(text("3. Using JUnit5 extend test class:"));
    }


}
