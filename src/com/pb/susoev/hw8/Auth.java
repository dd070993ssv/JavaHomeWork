package com.pb.susoev.hw8;

public class Auth {
    private String login;
    private String password;

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if(login==null || password==null|| confirmPassword==null){
            throw new WrongLoginException("Wrong login");
        }

        if((login.length()>5&&login.length()<20)){
            if(login.matches("^[a-zA-Z0-9]+$") ){
                if(password.length()>5){
                    if(password.matches("^[a-zA-Z0-9_]+$")){
                        if(password.equals(confirmPassword)){
                            this.login=login;
                            this.password=password;
                        }else{
                            throw  new WrongPasswordException("Wrong confirmPassword");
                        }
                    }else{
                        throw  new WrongPasswordException("Wrong password");
                    }
                }else{
                    throw  new WrongPasswordException("Wrong password");
                }
            }else{
                throw  new WrongLoginException("Wrong login");
            }
        }else{
            throw  new WrongLoginException("Wrong login");
        }
    }


    public Boolean signIn(String login, String password) throws WrongLoginException {

        if(login==null || password==null){
            throw new WrongLoginException("Wrong login");
        }
        if (login.equals(this.login) && password.equals(this.password)) {
            return true;
        } else {
            throw new WrongLoginException("Wrong login");
        }
    }




    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


