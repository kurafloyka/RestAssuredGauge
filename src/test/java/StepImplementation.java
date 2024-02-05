import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.Step;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class StepImplementation {
private Logger LOGGER = LoggerFactory.getLogger(StepImplementation.class);


    @BeforeScenario
    public void setup(){
        LOGGER.info("Before Scenario");

        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.baseURI = "https://evcmsapitest.watmobility.com";
        RestAssured.basePath = "/watmotor-web-api/api/mobile";


        RestAssured.requestSpecification = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                build();
        RestAssured.responseSpecification = new ResponseSpecBuilder().
                expectStatusCode(HttpStatus.SC_OK).build();
    }



  /*  public String generateToAccessToken() throws IOException {
        Gson gson = null;
        Reader reader;
        String JSON_FILE_PATH_USER_LOGIN = "src/main/resources/UserLogin.json";
        String USER_ENDPOINT_LOGIN = "/user/login";
        BrowserType type;
        RequestUser user;
        ConfigReader.populateSettings();
        //BrowserInitializer.browserInitializer((BrowserType) Settings.browserType);
        type = (BrowserType) Settings.browserType;

        gson = new Gson();
        reader = Files.newBufferedReader(Paths.get(JSON_FILE_PATH_USER_LOGIN));
        user = gson.fromJson(reader, RequestUser.class);
        reader.close();
        LOGGER.info("Login test case is passed..." + user.getUsername());

        //LOGGER.info("Login test case is passed..." + Settings.userName);
        //given().body(user).when().request("POST", USER_ENDPOINT_LOGIN).prettyPeek().then().assertThat().statusCode(HttpStatus.SC_OK).body("result", is(true));

        Response res = given().body(user).when().request("POST", USER_ENDPOINT_LOGIN);

        res.prettyPeek().getHeaders().get("AccessToken");

        LOGGER.info(res.prettyPeek().getHeaders().get("AccessToken").getValue());


        return res.prettyPeek().getHeaders().getValue("AccessToken");
    }
*/

    @AfterScenario
    public void tearDown(){
        LOGGER.info("After Scenario");
    }


    @Step("<PREP ALLIANZ> ortamında çalıştır")
    public void implementation1(Object arg0) {

    }

    @Step("<10> saniye bekle")
    public void implementation2(Object arg0) {


        LOGGER.info("Faruk Akyol");

    }

    @Step("Merhaba")
    public void implementation3() {

    }
}
