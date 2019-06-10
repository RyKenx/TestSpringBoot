package site.hje.testspringboot.demo.Utile;

import site.hje.testspringboot.demo.Model.SaveUserModel;
import site.hje.testspringboot.demo.Model.UserModel;

public class ModelUtile {

    public static UserModel setUserModel(SaveUserModel saveUserModel){
        UserModel userModel = new UserModel();
        userModel.setId(0);
        userModel.setUserName(saveUserModel.getUserName());
        userModel.setUserPassWord(saveUserModel.getUserPassWord());
        return userModel;
    }
}
