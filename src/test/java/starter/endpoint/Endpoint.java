package starter.endpoint;

public class Endpoint {

    public String BASEURL = "http://pretest-qa.dcidev.id";
    public String register= BASEURL+"/api/v1/register";
    public String otpRequest= BASEURL+"/api/v1/register/otp/request";
    public String otpMatch= BASEURL+"/api/v1/register/otp/match";
    public String signin=BASEURL+"/api/v1/oauth/sign_in";
    public String signinCredentials = BASEURL + "/api/v1/oauth/credentials";
    public String profile= BASEURL+"/api/v1/profile";
    public String education= BASEURL + "/api/v1/profile/education";
    public String profileCareer= BASEURL+ "/api/v1/profile/career";
    public String profileMe=BASEURL+"/api/v1/profile/me";
    public String messageGet= BASEURL+"/api/v1/message/";
    public String messagePost= BASEURL+"/api/v1/message/send";
    public String uploadProfile= BASEURL+"/api/v1/uploads/profile";
    public String uploadProfileCover= BASEURL+"/api/v1/uploads/cover";
    public String uploadDefault= BASEURL+"/api/v1/uploads/profile/default ";



    public char angka = (char)('1'+Math.random()*('0'-'9'+1));
    public char huruf2 = (char)('A'+Math.random()*('Z'-'A'+1));

}
