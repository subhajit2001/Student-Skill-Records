package collegedetails;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
class User {
    private String name,address,gender,knowledge,subject;
    public User(String name,String address, String gender, String knowledge,String subject)
    {
    this.name = name;
    this.address = address;
    this.gender = gender;
    this.knowledge = knowledge;
    this.subject = subject;
    }
    public String getname()
    {
        return name;
    }
    public String getaddress()
    {
        return address;
    }
    public String getgender()
    {
        return gender;
    }
    public String getknowledge()
    {
        return knowledge;
    }
    public String getsubject()
    {
        return subject;
    }
}
