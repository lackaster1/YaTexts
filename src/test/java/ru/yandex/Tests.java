package ru.yandex;

import net.sf.cglib.core.CollectionUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

import static org.openqa.selenium.By.cssSelector;

public class Tests extends ru.yandex.TestSettings {

    @Test
    public void test01() throws InterruptedException {

        Actions action01 = new Actions(driver);
        WebElement link01 = driver.findElement(By.linkText("Электроника"));
        action01.moveToElement(link01).build().perform();
        WebElement Element1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Мобильные телефоны")));
        driver.findElement(By.linkText("Мобильные телефоны")).click();
        WebElement Element2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#search-prepack > div > div > div:nth-child(2) > div > div._3U2TeVBOWN > div > div > a")));
        driver.findElement(cssSelector("#search-prepack > div > div > div:nth-child(2) > div > div._3U2TeVBOWN > div > div > a")).click();
        driver.findElement(cssSelector("#glf-pricefrom-var")).sendKeys("20000");
        driver.findElement(cssSelector("body > div.main > div:nth-child(5) > div > div.n-filter-panel-extend.i-bem.n-filter-panel-extend_js_inited > div:nth-child(1) > div:nth-child(2) > div.n-filter-block__body.i-bem.n-filter-block__body_js_inited > div > div.n-filter-block__list-items.i-bem > div:nth-child(1) > a > span")).click();
        driver.findElement(cssSelector("body > div.main > div:nth-child(5) > div > div.n-filter-panel-extend.i-bem.n-filter-panel-extend_js_inited > div:nth-child(1) > div:nth-child(2) > div.n-filter-block__body.i-bem.n-filter-block__body_js_inited > div > div.n-filter-block__list-items.i-bem > div:nth-child(10) > a > span")).click();
        driver.findElement(cssSelector("body > div.main > div:nth-child(5) > div > div.n-filter-panel-extend.i-bem.n-filter-panel-extend_js_inited > div.n-filter-panel-extend__button-bar > a.button.button_size_l.button_theme_pseudo.i-bem.button_action_show-filtered.n-filter-panel-extend__controll-button_size_big.button_js_inited")).click();
        List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div[1]/div[*]"));
        int listSize = list.size();
        if (listSize != 12)
            System.out.println("Количество элементов на странице не равно 12 " + "(" + listSize + ")");
        String a = driver.findElement(By.cssSelector("body > div.main > div:nth-child(5) > div.layout.layout_type_search.i-bem > div.layout__col.i-bem.layout__col_search-results_normal > div.n-filter-applied-results.metrika.b-zone.i-bem.n-filter-applied-results_js_inited.b-zone_js_inited > div > div.n-snippet-list.n-snippet-list_type_grid.snippet-list_size_3.metrika.b-zone.b-spy-init.i-bem.metrika_js_inited.snippet-list_js_inited.b-spy-init_js_inited.b-zone_js_inited > div:nth-child(1) > div.n-snippet-cell2__header > div.n-snippet-cell2__title > a")).getText();
        driver.findElement(By.cssSelector("#header-search")).sendKeys(a);
        driver.findElement(By.cssSelector("body > div.main > div.header2.suggest-owner.i-bem.header2_type_default > noindex > div.header2__main > div > div.header2__middle > div > div.header2__left > form > span > span.search2__button > button")).click();
        String b = driver.findElement(By.cssSelector("#n-breadcrumbs > li.n-breadcrumbs__item.n-breadcrumbs__item_type_text")).getText();
        Assert.assertEquals(a, b);
    }

    @Test
    public void test02() throws InterruptedException {

        Actions action01 = new Actions(driver);
        if (driver.findElement(By.cssSelector("body > div.popup2.popup2_autoclosable_yes.popup2_adaptive_yes.popup2_animate_yes.popup2_target_anchor.popup2_theme_normal.popup2_region_notification.i-bem.popup2_js_inited.popup2_direction_bottom-center.popup2_visible_yes > div.popup2__content > div > div > div.n-region-notification__actions.layout.layout_display_flex > div:nth-child(1) > span")) != null)
            driver.findElement(By.cssSelector("body > div.popup2.popup2_autoclosable_yes.popup2_adaptive_yes.popup2_animate_yes.popup2_target_anchor.popup2_theme_normal.popup2_region_notification.i-bem.popup2_js_inited.popup2_direction_bottom-center.popup2_visible_yes > div.popup2__content > div > div > div.n-region-notification__actions.layout.layout_display_flex > div:nth-child(1) > span")).click();
        WebElement link02 = driver.findElement(By.linkText("Электроника"));
        action01.moveToElement(link02).build().perform();
        WebElement Element3 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Наушники")));
        driver.findElement(By.linkText("Наушники")).click();
        WebElement Element4 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#search-prepack > div > div > div:nth-child(2) > div > div._3U2TeVBOWN > div > div > a")));
        driver.findElement(cssSelector("#search-prepack > div > div > div:nth-child(2) > div > div._3U2TeVBOWN > div > div > a")).click();
        driver.findElement(cssSelector("#glf-pricefrom-var")).sendKeys("5000");
        driver.findElement(cssSelector("body > div.main > div:nth-child(5) > div > div.n-filter-panel-extend.i-bem.n-filter-panel-extend_js_inited > div:nth-child(1) > div:nth-child(2) > div.n-filter-block__body.i-bem.n-filter-block__body_js_inited > div > div.n-filter-block__list-items.i-bem > div:nth-child(3) > a > span > label")).click();
        driver.findElement(cssSelector("body > div.main > div:nth-child(5) > div > div.n-filter-panel-extend.i-bem.n-filter-panel-extend_js_inited > div.n-filter-panel-extend__button-bar > a.button.button_size_l.button_theme_pseudo.i-bem.button_action_show-filtered.n-filter-panel-extend__controll-button_size_big.button_js_inited")).click();
        List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div[1]/div[*]"));
        int listSize = list.size();
        if (listSize != 12)
            System.out.println("Количество элементов на странице не равно 12 " + "(" + listSize + ")");
        String a = driver.findElement(By.cssSelector("body > div.main > div:nth-child(5) > div.layout.layout_type_search.i-bem > div.layout__col.i-bem.layout__col_search-results_normal > div.n-filter-applied-results.metrika.b-zone.i-bem.n-filter-applied-results_js_inited.b-zone_js_inited > div > div.n-snippet-list.n-snippet-list_type_grid.snippet-list_size_3.metrika.b-zone.b-spy-init.i-bem.metrika_js_inited.snippet-list_js_inited.b-spy-init_js_inited.b-zone_js_inited > div:nth-child(1) > div.n-snippet-cell2__header > div.n-snippet-cell2__title > a")).getText();
        driver.findElement(By.cssSelector("#header-search")).sendKeys(a);
        driver.findElement(By.cssSelector("body > div.main > div.header2.suggest-owner.i-bem.header2_type_default > noindex > div.header2__main > div > div.header2__middle > div > div.header2__left > form > span > span.search2__button > button")).click();
        String b = driver.findElement(By.cssSelector("#n-breadcrumbs > li.n-breadcrumbs__item.n-breadcrumbs__item_type_text")).getText();
        Assert.assertEquals(a, b);
    }

    @Test
    public void test03() throws InterruptedException {

        Actions action01 = new Actions(driver);
        WebElement link01 = driver.findElement(By.linkText("Электроника"));
        action01.moveToElement(link01).build().perform();
        WebElement Element1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Мобильные телефоны")));
        driver.findElement(By.linkText("Мобильные телефоны")).click();
        WebElement Element2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#search-prepack > div > div > div:nth-child(2) > div > div._3U2TeVBOWN > div > div > a")));
        driver.findElement(cssSelector("body > div.main > div:nth-child(5) > div.n-filter-panel-dropdown.i-bem.n-filter-panel-dropdown_js_inited > div.n-filter-panel-dropdown__main > div.n-filter-panel-dropdown__item.n-filter-panel-dropdown__item_size_triple.n-filter-panel-dropdown__item_left_100 > div.n-filter-block_pos_left.i-bem > div:nth-child(3) > a")).click();
        ArrayList<String> actual = new ArrayList<>();

//      Дальше нужно взять со страницы цены телефонов и поместить их в массив. Не смог это реализовать(

//        boolean isPricesSorted(LinkedList<String> expected, LinkedList<String> actual)
//        {
//            boolean result = false;
//            Collections.sort(expected);
//            if(CollectionUtils.isEqualCollection(expected,actual))
//                result = true;
//            return result;
        }
    }





//7. Проверить, что элементы на странице отсортированы верно
