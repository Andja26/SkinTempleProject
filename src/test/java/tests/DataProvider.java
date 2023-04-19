package tests;

public class DataProvider {

    @org.testng.annotations.DataProvider(name = "validCredentials")
    public static Object[][] validCredentials() {
        return new Object[][]{
                {"andjajankovic26@gmail.com","djordjevic"}

        };
    }
    @org.testng.annotations.DataProvider(name = "invalidPassword")
    public static Object[][] invalidPassword() {
        return new Object[][]{
                {"andjajankovic26@gmail.com","djordje"}

        };
    }

}
