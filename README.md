# TestingStuff
Testing everything new from web and books. Java only.
mbaykova
Nobolevsk

public abstract class BasePage {

    public abstract boolean isPageLoaded();

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(getDriver(), this);
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void scroll(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);
    }

    public void click(WebElement element) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

///////////////////////

public class MainPage extends BasePage {


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageLoaded() {
        return false;
    }

    @FindBy(xpath = "//*[@id = 'desktopMenuMain']//a[@class = 'type-global-nav-link-1' and contains(text(), 'Меню доставки')]")
    WebElement mainMenu;

    @FindBy(xpath = "//*[@id = 'desktopMenuMain']//a[@href='/catalog']/..//div[@class = 'main-menu__wrap']/ul[contains(@class,'main-menu__list')]/li")
    WebElement menuItems;

    public void clickMenu(String text) {
        List<WebElement> href = driver.findElements(By.xpath("//*[@id = 'desktopMenuMain']//li[@class = 'level-2__item']/a[contains(text(), '" + text + "')]"));

        Assert.assertEquals("Menu not found", 0, href.size());
        this.click(href.get(0));
    }
