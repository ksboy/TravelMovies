
package com.travel.action;

import java.util.ArrayList;

import org.apache.struts2.ServletActionContext;

import com.travel.database.Database;

import net.sf.json.JSONObject;


public class Signup {
  private String id;
  private String name;
  private String password;
  private String nickname;
  private String question;
  private String answer;
  private String avartar;
  private String age;
  private String gender;
  private String birth_date;
  private String bio;
  private String tags;
  private boolean userCookie;
  private String result;
  
  public String execute() throws Exception { 
      ArrayList<String> tit = new ArrayList<String>() ;
      //tit.add(id);
	  Database.Connect();
	  JSONObject rsjson = new JSONObject();
      tit.add(name);
      tit.add(password);
      tit.add(nickname);
      tit.add(question);
      tit.add(answer);
      //tit.add(avartar);
      tit.add(age);
      tit.add(gender);
      tit.add(birth_date);
      tit.add(bio);
      tit.add(tags);
      //System.out.print(tit);
      boolean flag =Database.signup(tit);
      rsjson.put("result", flag);
	  Database.Close();
      if(flag) return "success";
      else return "error";
     }
  
  

public String getId() {
    return id;
}



public void setId(String id) {
    this.id = id;
}



public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getPassword() {
    return password;
}
public void setPassword(String password) {
    this.password = password;
}
public String getNickname() {
    return nickname;
}
public void setNickname(String nickname) {
    this.nickname = nickname;
}
public String getQuestion() {
    return question;
}
public void setQuestion(String question) {
    this.question = question;
}
public String getAnswer() {
    return answer;
}
public void setAnswer(String answer) {
    this.answer = answer;
}
public String getAvartar() {
    return avartar;
}
public void setAvartar(String avartar) {
    this.avartar = avartar;
}
public String getAge() {
    return age;
}
public void setAge(String age) {
    this.age = age;
}
public String getGender() {
    return gender;
}
public void setGender(String gender) {
    this.gender = gender;
}
public String getBirth_date() {
    return birth_date;
}
public void setBirth_date(String birth_date) {
    this.birth_date = birth_date;
}
public String getBio() {
    return bio;
}
public void setBio(String bio) {
    this.bio = bio;
}
public String getTags() {
    return tags;
}
public void setTags(String tags) {
    this.tags = tags;
}
public boolean isUserCookie() {
    return userCookie;
}
public void setUserCookie(boolean userCookie) {
    this.userCookie = userCookie;
}
public String getResult() {
	return result;
}
public void setResult(String result) {
	this.result = result;
}


////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;



////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;

////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;


////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;


////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;


////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;


////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;


////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;


////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;


////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;


////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;


////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;

////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
////public String getName() {
//return name;
//}
//public void setName(String name) {
//this.name = name;
//}
//public String getPassword() {
//return password;
//}
//public void setPassword(String password) {
//this.password = password;
//}
//public String getNickname() {
//return nickname;
//}
//public void setNickname(String nickname) {
//this.nickname = nickname;
//}
//public String getQuestion() {
//return question;
//}
//public void setQuestion(String question) {
//this.question = question;
//}
//public String getAnswer() {
//return answer;
//}
//public void setAnswer(String answer) {
//this.answer = answer;
//}
//public String getAvartar() {
//return avartar;
//}
//public void setAvartar(String avartar) {
//this.avartar = avartar;
//}
//public String getAge() {
//return age;
//}
//public void setAge(String age) {
//this.age = age;
//}
//public String getGender() {
//return gender;
//}
//public void setGender(String gender) {
//this.gender = gender;
//}
//public String getBirth_date() {
//return birth_date;
//}
//public void setBirth_date(String birth_date) {
//this.birth_date = birth_date;
//}
//public String getBio() {
//return bio;
//}
//public void setBio(String bio) {
//this.bio = bio;
//}
//public String getTags() {
//return tags;
//}
//public void setTags(String tags) {
//this.tags = tags;
//}
//public boolean isUserCookie() {
//return userCookie;
//}
//public void setUserCookie(boolean userCookie) {
//this.userCookie = userCookie;
//}
//public String getResult() {
//return result;
//}
//public void setResult(String result) {
//this.result = result;
}//
}

