package bruno.fernandez.loginandcameratest.data;

import bruno.fernandez.loginandcameratest.data.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            if(username.equals("foton@foton.com.br") && password.equals("Foton!")){
                LoggedInUser fakeUser =
                        new LoggedInUser(
                                java.util.UUID.randomUUID().toString(),
                                "Foton!");
                return new Result.Success<>(fakeUser);
            }
            else{
                return null;
            }

        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

//    public void logout() {
//    }
}
