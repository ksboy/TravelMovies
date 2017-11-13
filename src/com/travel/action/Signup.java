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

}



<!DOCTYPE html>
<html>
<head>
            <link rel="canonical" href="http://blog.csdn.net/js1568/article/details/78042431"/> 

    <script type="text/javascript">
        var username = "js1568";var _blogger = username;var blog_address = "http://blog.csdn.net/js1568";var static_host = "http://static.blog.csdn.net";
        var currentUserName = "js1568"; var fileName = '78042431';var commentscount = 0; var islock = false
        window.quickReplyflag = true;
        var totalFloor=0;
                
                 var isBole = false;
                
                
                 var isDigg = false;
                
          
             var isExpert=false;
        
          
        var isAdm=false;
        

    </script>

<meta http-equiv="content-type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <script src="http://c.csdnimg.cn/public/common/libs/jquery/jquery-1.9.1.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/common/libs/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/static/css/avatar.css">
    <link type="text/css" rel="stylesheet" href="http://static.blog.csdn.net/scripts/SyntaxHighlighter/styles/default.css" />
    <link rel="stylesheet" href="http://static.blog.csdn.net/Skin/skin3-template/css/style.css?v=2017.042">
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/common/toolbar/content_toolbar_css/content_toolbar.css?v5.00.37">
              <!-- adhoc sdk -->
		<script src=https://sdk.appadhoc.com/ab.plus.js></script>
		<script>
		adhoc('init', {
		  appKey: 'ADHOC_0e0bce4f-8793-4f68-89cf-34c14f2532bb',
		  defaultFlags: {isLogin: true}
		})
		</script>
              <!-- adhoc sdk end -->
    
	<script src="//static.blog.csdn.net/public/switchHome/switchHome.js?v=2017.43"></script>	
	
    <script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/fonts/iconfont.js"></script>
    <script src="//csdnimg.cn/rabbit/exposure-click/main.js?v1.15.23"></script>
    <script type="text/javascript" src="http://c.csdnimg.cn/pubfooter/js/tracking_for_recommend.js?v=0911" charset="utf-8"></script>
    <script type="text/javascript" src="http://csdnimg.cn/pubfooter/js/tracking.js" charset="utf-8"></script>
    <script type="text/javascript" src="http://static.blog.csdn.net/scripts/cnick.js" charset="utf-8"></script>
 
    <link rel="stylesheet" href="http://static.blog.csdn.net/code/prettify.css" />
    <script type="text/javascript" src="http://static.blog.csdn.net/code/prettify.js"></script>
<script src="http://dup.baidustatic.com/js/ds.js"></script>
    <script type="text/javascript">

        // Traffic Stats of the entire Web site By baidu
        var _hmt = _hmt || [];
        (function() {
            var hm = document.createElement("script");
            hm.src = "https://hm.baidu.com/hm.js?6bcd52f51e9b3dce32bec4a3997715ac";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
        // Traffic Stats of the entire Web site By baidu end



    </script>
    <meta name="description" content="线性代数中的范数" />
    <meta name="keywords" content="机器学习,线性代数" />
    <meta http-equiv="Cache-Control" content="no-siteapp" /><link rel="alternate" media="handheld" href="#" />
    <meta name="shenma-site-verification" content="5a59773ab8077d4a62bf469ab966a63b_1497598848">


    <title>线性代数中的范数 - CSDN博客</title>
</head>
<body>
<script id="toolbar-tpl-scriptId" prod="download" skin="black" src="http://c.csdnimg.cn/public/common/toolbar/js/content_toolbar.js?v5.00.37" type="text/javascript" domain="http://blog.csdn.net"></script>

<div class="container clearfix">
    <main>
        <article>
            <h1 class="csdn_top">线性代数中的范数</h1>
            <div class="article_bar clearfix">
                <div class="artical_tag">
                    <span class="original">转载</span>
                    <span class="time">2017年09月20日 16:31:53</span>
                </div>
				<ul class="article_tags clearfix csdn-tracking-statistics" data-mod="popu_377">
					<li class="tit">标签：</li>
					
					<li><a href="http://so.csdn.net/so/search/s.do?q=机器学习&t=blog" target="_blank">机器学习</a> <span>/</span></li>
					
					<li><a href="http://so.csdn.net/so/search/s.do?q=线性代数&t=blog" target="_blank">线性代数</a> <span>/</span></li>
					
				</ul>
                <ul class="right_bar">
                    <li><button class="btn-noborder"><i class="icon iconfont icon-read"></i><span class="txt">381</span></button></li>
                    <!--<li><button class="btn-noborder"><i class="icon iconfont icon-dashang-"></i><span class="txt">0</span></button></li>-->

                    <li class="edit">
                        <a class="btn-noborder" href="" >
                            <i class="icon iconfont icon-bianji"></i><span class="txt">编辑</span>
                        </a>
                    </li>
                    <li class="del">
                        <a class="btn-noborder" onclick="javascript:deleteArticle(fileName);return false;">
                            <i class="icon iconfont icon-shanchu"></i><span class="txt">删除</span>
                        </a>
                    </li>
                </ul>
            </div>
            <div id="article_content" class="article_content csdn-tracking-statistics" data-mod="popu_519" data-dsm="post">
                <div class="markdown_views"><p>向量范数</p>

<ul>
<li>0-范数：向量中非零元素个数</li>
<li>1-范数： <img src="https://www.zhihu.com/equation?tex=%7C%7Cx%7C%7C_1%20=%20%5Csum_%7Bi=1%7D%5EN%7Cx_i%7C" alt="" title="">，即向量元素绝对值之和，matlab调用函数norm(x, 1) 。</li>
<li>2-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_2%20=%5Csqrt%7B%5Csum_%7Bi=1%7D%5ENx_i%5E2%7D" alt="" title="">，Euclid范数（欧几里得范数，常用计算向量长度），即向量元素绝对值的平方和再开方，matlab调用函数norm(x, 2)。</li>
<li><img src="https://www.zhihu.com/equation?tex=%5Cinfty" alt="" title=""> -范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_%5Cinfty%20=%20%5Cmax_%7Bi%7D%7Cx_i%7C" alt="" title="">，即所有向量元素绝对值中的最大值，matlab调用函数norm(x, inf)。</li>
<li><img src="https://www.zhihu.com/equation?tex=-%5Cinfty" alt="" title="">-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_%7B-%5Cinfty%7D=%5Cmin_i%7Cx_i%7C" alt="" title="">，即所有向量元素绝对值中的最小值，matlab调用函数norm(x, -inf)。</li>
<li>p-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_p%20=%20%28%5Csum_%7Bi=1%7D%5EN%7Cx_i%7C%5Ep%29%5E%7B%5Cfrac%7B1%7D%7Bp%7D%7D" alt="" title="">，即向量元素绝对值的p次方和的1/p次幂，matlab调用函数norm(x, p)。</li>
</ul>

<p>矩阵范数</p>

<ul>
<li>1-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_1%20=%20%5Cmax_j%5Csum_%7Bi=1%7D%5Em%7Ca_%7Bi,j%7D%7C" alt="" title="">， 列和范数，即所有矩阵列向量绝对值之和的最大值，matlab调用函数norm(A, 1)。</li>
<li>2-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_2%20=%20%5Csqrt%7B%5Clambda_1%7D" alt="" title="">，<img src="https://www.zhihu.com/equation?tex=%5Clambda%3Cbr/%3E" alt="" title="">为的最大特征值。，谱范数，即A’A矩阵的最大特征值的开平方。matlab调用函数norm(x, 2)。</li>
<li><img src="https://www.zhihu.com/equation?tex=%5Cinfty" alt="" title="">-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_%5Cinfty%20=%20%5Cmax_i%5Csum_%7Bj=1%7D%5EN%7Ca_%7Bi,j%7D%7C" alt="" title="">，行和范数，即所有矩阵行向量绝对值之和的最大值，matlab调用函数norm(A, inf)。</li>
<li>F-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_F=%5Cleft%28%5Csum_%7Bi=1%7D%5Em%5Csum_%7Bj=1%7D%5En%7Ca_%7Bi,j%7D%7C%5E2%5Cright%29%5E%7B%5Cfrac%7B1%7D%7B2%7D%7D" alt="" title="">，Frobenius范数，即矩阵元素绝对值的平方和再开平方，matlab调用函数norm(A, ’fro‘)。</li>
<li>核范数：是A的奇异值。即奇异值之和</li>
</ul>

<p>作者：魏通 <br>
链接：<a href="https://www.zhihu.com/question/20473040/answer/102907063" target="_blank">https://www.zhihu.com/question/20473040/answer/102907063</a> <br>
来源：知乎 <br>
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。</p><link rel="stylesheet" href="http://static.blog.csdn.net/public/res-min/markdown_views.css?v=2.0" /></div><link rel="stylesheet" href="http://static.blog.csdn.net/public/res-min/markdown_views.css?v=2.0" />
            </div>
        </article>
        <div class="readall_box csdn-tracking-statistics" data-mod="popu_376">
			<div class="read_more_mask"></div>
            <a class="btn btn-large btn-gray-fred read_more_btn" target="_self">阅读全文</a>
        </div>
        <div class="article_copyright">
            
        </div>
        <!--  <div class="reward_box">
            <div class="tit">
              <button class="btn_reward"><i class="icon iconfont icon-dashang-"></i></button>
            </div>
            <dl class="clearfix">
              <dt><a href="#" target="_blank">近期打赏</a></dt>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
            </dl>
          </div>-->

        <ul class="article_collect clearfix csdn-tracking-statistics"  data-mod="popu_378">
            <li class="tit">本文已收录于以下专栏：</li>
            
        </ul>
        <div class="comment_box clearfix">
            <div id="comment_form">
                <div id="commentsbmitarear">
                    <!-- <h6><span>0</span>条评论</h6> -->
           <!--          <dl class="clearfix" id="commentbox">
                        <dt>
                            <a href="http://my.csdn.net/js1568"><img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg" ></a>
                        </dt>
                        <dd>
                            <a href="http://my.csdn.net/js1568" target="_blank">js1568</a>
                        </dd>
                        <dd class="txt_tip"><span id="tip_comment" class="tip"></span></dd>
                    </dl> -->
                    <div class="comment_area clearfix">
						<div class="userimg"><a href="http://my.csdn.net/js1568"><img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg"></a></div>
                        <form action="/js1568/comment/submit?id=78042431" method="post" onsubmit="return subform(this);" id="commentform">
                            <textarea class="comment_content" name="comment_content" id="comment_content" placeholder="发表你的评论"></textarea>
                            <div class="bot_bar clearfix">
                                <div id="ubbtools" class="add_code">
                                    <a href="#insertcode" code="code" target="_self"><i class="icon iconfont icon-daima"></i></a>
                                </div>

                                <input type="hidden" id="comment_replyId" name="comment_replyId">
                                <input type="hidden" id="comment_userId" name="comment_userId" value="">
                                <input type="hidden" id="commentId" name="commentId" value="">
                                <input type="submit" class="btn btn-redborder" value="发表评论">
								<span id="tip_comment" class="tip">
                                <div style="display: none;" class="csdn-tracking-statistics" data-mod="popu_384"><a href="#" target="_blank" class="comment_area_btn">发表评论</a></div>

                                <div id="lang_list" code="code">
                                    <a href="#html" style="width:95px;" class="long_name" target="_self">HTML/XML</a>
                                    <a href="#objc" style="width:95px;" class="long_name" target="_self">objective-c</a>
                                    <a href="#delphi" style="width:58px;" class="zhong_name" target="_self">Delphi</a>
                                    <a href="#ruby" class="zhong_name" target="_self">Ruby</a>
                                    <a href="#php" target="_self">PHP</a>
                                    <a href="#csharp" class="duan_name" target="_self">C#</a>
                                    <a style=" border-right: none;" href="#cpp" class="duan_name" target="_self">C++</a>
                                    <a style=" border-bottom:none;width:95px;" href="#javascript" class="long_name" target="_self">JavaScript</a>
                                    <a style=" border-bottom:none;width:95px;" href="#vb" class="long_name" target="_self">Visual Basic</a>
                                    <a style=" border-bottom:none;" href="#python" class="zhong_name" target="_self">Python</a>
                                    <a style=" border-bottom:none;" href="#java" class="zhong_name" target="_self">Java</a>
                                    <a style="border-bottom:none;" href="#css" class="duan_name" target="_self">CSS</a>
                                    <a style="border-bottom:none;" href="#sql" class="duan_name" target="_self">SQL</a>
                                    <a style="border:none; " href="#plain" class="duan_name" target="_self">其它</a>
                                    <span class="arrb"></span>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <div class="comment_li_outbox">
            <div id="comment_list"></div>
        </div>

        <div class="more_comment">
            <div id="comment_bar" class="trackgin-ad" data-mod="popu_385"></div>
        </div>

        <h3 class="recommend_tit">相关文章推荐</h3>
        <div class="recommend_list clearfix">
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/wylfll/article/details/47950593"  target="_blank" strategy="BlogCommendFromCF_0">在jsp中如何实现网页的自动更新</a></h2>
                    <div class="summary">
                        在jsp中如何实现网页的自动更新
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/wylfll" target="_blank" strategy="BlogCommendFromCF_0"><img src="http://avatar.csdn.net/E/4/0/2_wylfll.jpg" alt="wylfll" title="wylfll"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/wylfll">wylfll</a></li>
                        <li class="time">2015-08-24 14:27</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>410</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/js1568/article/details/73434001"  target="_blank" strategy="BlogCommendFromCF_1">最小生成树-Prim算法和Kruskal算法</a></h2>
                    <div class="summary">
                        最小生成树-Prim算法和Kruskal算法
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/js1568" target="_blank" strategy="BlogCommendFromCF_1"><img src="http://avatar.csdn.net/B/A/D/2_js1568.jpg" alt="js1568" title="js1568"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/js1568">js1568</a></li>
                        <li class="time">2017-06-18 17:19</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>88</span></li>
                    </ul>
                </dd>
            </dl>
            
            <!--dl class="clearfix csdn-tracking-statistics" data-mod="popu_393">
                <dt><a href="http://edu.csdn.net/huiyiCourse/series_detail/64?utm_source=blog10" target="_blank"><img class="maxwidth" src="http://img.blog.csdn.net/20170928113144608" alt="" title=""></a></dt>
                <dd>
                    <div class="summary">
                        <h2><a href='http://edu.csdn.net/topic/python1?utm_source=blog10' target='_blank'>伤心啊！年度热门编程语言排行榜出来了...</a></h2>  <div class="summary">近期，IEEE Spectrum 发布了第四届顶级编程语言交互排行榜。结合 10 个线上数据源的 12 个标准，对 48 种语言进行了排行！此外，七牛云许式伟曾说过Go语言会取代Java...气氛... </div> 
                    </div>
                </dd>
            </dl-->
	<script>
		(function() {
		    var s = "_" + Math.random().toString(36).slice(2);
		    document.write('<div id="' + s + '"></div>');
		    (window.slotbydup=window.slotbydup || []).push({
			id: '4765209',
			container: s,
			size: '808,120',
			display: 'inlay-fix'
		    });
		})();
	</script>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/myarrow/article/details/51188553"  target="_blank" strategy="BlogCommendFromCsdn_2">线性代数常用基本知识 (含向量和矩阵范数&lt;Matrix or vector norm&gt;)</a></h2>
                    <div class="summary">
                        1. 行列式
1.1 二阶行列式




1.2 三阶行列式
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/MyArrow" target="_blank" strategy="BlogCommendFromCsdn_2"><img src="http://avatar.csdn.net/C/1/6/2_myarrow.jpg" alt="MyArrow" title="MyArrow"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/MyArrow">MyArrow</a></li>
                        <li class="time">2016-04-19 11:07</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>8551</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/mathmetics/article/details/9279367"  target="_blank" strategy="BlogCommendFromCsdn_3">线性代数(七) : 子空间的基与维数</a></h2>
                    <div class="summary">
                        子空间的基与维数
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/xxingjjing" target="_blank" strategy="BlogCommendFromCsdn_3"><img src="http://avatar.csdn.net/5/D/7/2_xxingjjing.jpg" alt="xxingjjing" title="xxingjjing"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/xxingjjing">xxingjjing</a></li>
                        <li class="time">2013-07-11 10:29</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>2984</span></li>
                    </ul>
                </dd>
            </dl>
            <!-- 广告位：PC端-博客详情通栏7（feed流）-808*120 --><script> (function() {    var s = "_" + Math.random().toString(36).slice(2);   document.write('<div id="' + s + '"></div>');    (window.slotbydup=window.slotbydup || []).push({        id: '4983339',       container: s,        size: '808,120',        display: 'inlay-fix'    }); })();  </script>
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/qq_28306361/article/details/50800972"  target="_blank" strategy="BlogCommendFromCsdn_4">线性代数复习四——矩阵的维数和秩</a></h2>
                    <div class="summary">
                        复习
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/qq_28306361" target="_blank" strategy="BlogCommendFromCsdn_4"><img src="http://avatar.csdn.net/8/6/2/2_qq_28306361.jpg" alt="qq_28306361" title="qq_28306361"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/qq_28306361">qq_28306361</a></li>
                        <li class="time">2016-03-04 10:57</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>1835</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics downloadElement" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
               	<dt><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank" strategy="BlogCommendFromCsdn_5"><img class="maxwidth" src="http://download.csdn.net/images/minetype/rar.svg" alt="" title=""></a></dt>
		<dd>
			<div class="summary">
				<h2><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank" strategy="BlogCommendFromCsdn_5">高校教学资源，高数，线性代数等</a></h2>
				<div class="summary">
				  <ul>
					  <li class="time">2011-04-02 21:01</li>
					  <li class="visited_num fileSize">3.32MB</li>
					  <li class="download_btn"><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank">下载</a></li>
				  </ul>
				</div> 
			</div>
		</dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics downloadElement" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
               	<dt><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank" strategy="BlogCommendFromCsdn_6"><img class="maxwidth" src="http://download.csdn.net/images/minetype/rar.svg" alt="" title=""></a></dt>
		<dd>
			<div class="summary">
				<h2><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank" strategy="BlogCommendFromCsdn_6">考研数学公式（线性代数+概率论+高数）合集</a></h2>
				<div class="summary">
				  <ul>
					  <li class="time">2010-03-02 20:44</li>
					  <li class="visited_num fileSize">815KB</li>
					  <li class="download_btn"><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank">下载</a></li>
				  </ul>
				</div> 
			</div>
		</dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/suqier1314520/article/details/12584479"  target="_blank" strategy="BlogCommendFromCsdn_7">线性代数导论9——线性相关性、基、维数</a></h2>
                    <div class="summary">
                        本文是Gilbert Strang的线性代数导论课程笔记。课程地址：http://v.163.com/special/opencourse/daishu.html&#160;&#160;
第九课时：线性相关性、基、维数...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/suqier1314520" target="_blank" strategy="BlogCommendFromCsdn_7"><img src="http://avatar.csdn.net/5/6/9/2_suqier1314520.jpg" alt="suqier1314520" title="suqier1314520"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/suqier1314520">suqier1314520</a></li>
                        <li class="time">2013-10-10 19:28</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>4187</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/tengweitw/article/details/40921209"  target="_blank" strategy="BlogCommendFromCsdn_8">【线性代数】线性相关性、基和维数</a></h2>
                    <div class="summary">
                        一、线性相关性

&#160; &#160; &#160; 什么情况下，向量X1，X2，……，Xn是线性无关的？


&#160; &#160;&#160;&#160; 答：当向量X1，X2，……，Xn的线性组合(线性组合时系数不能全为0)不为零向量时，它们是线性无关的...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/tengweitw" target="_blank" strategy="BlogCommendFromCsdn_8"><img src="http://avatar.csdn.net/B/E/9/2_tengweitw.jpg" alt="tengweitw" title="tengweitw"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/tengweitw">tengweitw</a></li>
                        <li class="time">2014-11-09 14:29</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>1551</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/u010182633/article/details/52331744"  target="_blank" strategy="BlogCommendFromCsdn_9">漫步线性代数十——线性无关，基和维数</a></h2>
                    <div class="summary">
                        m,nm,n没有给出线性系统实际大小的真实信息，在我们上文的例子中有三行和四列，但是第三行仅仅是前两行的组合，在消元后得到了零行，它对奇次问题Ax=0Ax=0 没有影响。第四列同样是相关的，列空间减到...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/u010182633" target="_blank" strategy="BlogCommendFromCsdn_9"><img src="http://avatar.csdn.net/2/2/4/2_u010182633.jpg" alt="u010182633" title="u010182633"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/u010182633">u010182633</a></li>
                        <li class="time">2016-08-26 21:16</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>974</span></li>
                    </ul>
                </dd>
            </dl>
            

	   

            

            
        </div>
    </main>
    <aside>
        <div class="right_box user_info">
            <dl class="inf_bar clearfix">
                <dt class="csdn-tracking-statistics" data-mod="popu_381">
                    <a href="http://blog.csdn.net/js1568" target="_blank">
                        <img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg" class="avatar_pic">
                    </a>
                    <span class="medals" title="">
                <svg class="icon" aria-hidden="true">
                    
                </svg>
              </span>
                </dt>
                <dd>
                    <h3 class="csdn-tracking-statistics"  data-mod="popu_380"><a href="http://blog.csdn.net/js1568" target="_blank" id="uid">js1568</a></h3>
                    <span  class="csdn-tracking-statistics" data-mod="popu_379"><a class="btn btn-redborder-small "  id="span_add_follow" target="_self">＋关注</a></span>
                </dd>
            </dl>
            <div class="inf_number_box clearfix">
                <dl>
                    <dt>原创</dt>
                    <dd>15</dd>
                </dl>
                <dl>
                    <dt>粉丝</dt>
                    <dd id='fan'>3</dd>
                </dl>
                <dl>
                    <dt>喜欢</dt>
                    <dd>0</dd>
                </dl>
								 <dl>
              <dt>码云</dt>
              <dd>&nbsp;</dd>
            </dl>

            </div>
	    <div class="writings">
              <div class="public_signal clearfix">
                <h3>他的最新文章</h3>
                <a href="http://blog.csdn.net/js1568" target="_blank" class="more_z"><span>更多文章</span></a>
              </div>
                <ul class="inf_list clearfix csdn-tracking-statistics" data-mod="popu_382">
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429272" target="_blank">统计学习方法 7-支持向量机</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429192" target="_blank">统计学习方法 6-逻辑斯谛回归与最大熵模型</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429164" target="_blank">统计学习方法 5-决策树</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429150" target="_blank">统计学习方法 4-朴素贝叶斯法</a>
                    </li>
                    
                </ul>
            </div>
        </div>
        <div class="extension_other csdn-tracking-statistics" data-mod="popu_389">
						<!--u3032528-->
			<div class="flashrecommend">

<!-- 请置于所有广告位代码之前 -->
<script src="http://dup.baidustatic.com/js/dm.js"></script>
           
<!-- 广告位：PC端-博客详情页右侧视窗1（feed流）-300*250 -->
<script>
(function() {
    var s = "_" + Math.random().toString(36).slice(2);
    document.write('<div id="' + s + '"></div>');
    (window.slotbydup=window.slotbydup || []).push({
        id: '4770930',
        container: s,
        size: '300,250',
        display: 'inlay-fix'
    });
})();
</script>

		    </div>
        </div>

        
        <div class="fixRight">
            <div class="right_box padb0 csdn-tracking-statistics" data-mod="popu_391">
                <h3 class="tit"><span><em>在线课程</em></span></h3>
                <ul class="edu_li clearfix">
                  
                  <li>
                    <div>
                      <a href="http://edu.csdn.net/huiyiCourse/detail/603?utm_source=blog7" target="_blank">
                        <img src="http://img.bss.csdn.net/201711101450316277.png" alt="MVVM在美团点评酒旅移动端的最佳实践" title="MVVM在美团点评酒旅移动端的最佳实践">
                      </a>
                    </div>
                    <div>
                      <p><a href="http://edu.csdn.net/huiyiCourse/detail/603?utm_source=blog7" target="_blank">MVVM在美团点评酒旅移动端的最佳实践</a></p>
                      <p>讲师：王禹华</p>
                    </div>
                  </li>
                  
                  <li>
                    <div>
                      <a href="http://edu.csdn.net/huiyiCourse/detail/594?utm_source=blog7" target="_blank">
                        <img src="http://img.bss.csdn.net/201711101448389242.png" alt="C语言大型软件设计的面向对象" title="C语言大型软件设计的面向对象">
                      </a>
                    </div>
                    <div>
                      <p><a href="http://edu.csdn.net/huiyiCourse/detail/594?utm_source=blog7" target="_blank">C语言大型软件设计的面向对象</a></p>
                      <p>讲师：宋宝华</p>
                    </div>
                  </li>
                  
                </ul>
            </div>
			<!--u3032529-->
            <!-- <div class="extension_other csdn-tracking-statistics baidu_box" data-mod="popu_395">
								
                <script type="text/javascript" src="http://mpb1.iteye.com/cxpdpmumfaedgm.js"></script>
            </div> -->
			<div class="extension_other csdn-tracking-statistics bottomRcom" data-mod="popu_389" style="position:absolute;z-index:-5;opacity:0;pointer-events:none">
						<!--u3032528-->
				<div class="flashrecommend">
				<script type="text/javascript" src="http://mpb1.iteye.com/bwocoltlyzdec.js"></script>
				</div>
			</div>
        </div>
		<div class="user-hotArticle">
          <h3>热门文章</h3>
          <ul class="hotArticle-list csdn-tracking-statistics" data-mod="popu_521">
 
            <li>
              <a href="/js1568/article/details/78042431">线性代数中的范数</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>377</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/73385734">八大（基于比较）排序算法</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>371</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/66476086">先序，中序，后序线索化二叉树</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>313</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/64905555">机器学习（周志华 ）-2模型评估与选择</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>313</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/68066618">字符串匹配的KMP算法</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>309</span></div>
            </li>
 
          </ul>
        </div>


    </aside>
</div>

<div class="left_fixed">
      <div class="left_show_button">
        <span>
          <i class="icon iconfont icon-youjiantou"></i>
        </span>
      </div>
    <ul class="left_menu">

        <li>
            <button class="left-fixed-btn btn-like csdn-tracking-statistics" data-mod="popu_373" target="_self">
                <span class="iconbox border_red"><i class="icon iconfont icon-dianzan"></i></span>
				<span class="txt">0</span>
            </button>
        </li>
		<li id="blog_artical_directory">
            <button class="left-fixed-btn left_menu_btn csdn-tracking-statistics" data-mod="popu_372" target="_self">
                <span class="iconbox border_black"><i class="icon iconfont icon-mulu"></i></span>
            </button>
        </li>
        <li class="menu_con">
            <div class="list_father">
                <div class="arr_box">
                    <button class="btn-noborder arr-btn scroll-down  left_scroll_down"><i class="icon iconfont icon-xiajiantou"></i></button>
                    <button class="btn-noborder arr-btn scroll-up left_scroll_top"><i class="icon iconfont icon-shangjiantou"></i></button>
                </div>
                <div class="arr"></div>
                <div id="csdnBlogDir"></div>
            </div>
        </li>
        <li>
            <button class="left-fixed-btn csdn-tracking-statistics" data-mod="popu_374"  id="com-quick-collect" target="_self">
                <span class="iconbox border_purple"><i class="icon iconfont icon-shoucang"></i></span>
    
            </button>
        </li>
		<li>
          <button class="left-fixed-btn btn-pinglun" >
            <span class="iconbox border_purple"><i class="icon iconfont icon-pinglun"></i></span>
          </button>
        </li>
        <li id="share_box">
            <button class="left-fixed-btn  csdn-tracking-statistics"  data-mod="popu_375" target="_self">
                <span class="iconbox border_orange"><i class="icon iconfont icon-fenxiang"></i></span>
            </button>
            <div class="bdsharebuttonbox csdn-tracking-statistics" data-mod="popu_172">
                <div class="outside">
                    <span class="iconbox border_red2"><i class="icon iconfont icon-xinlang"></i></span>
                    <a href="#" class="bds_tsina" data-cmd="tsina" title="分享到新浪微博"> </a>
                </div>
                <div class="outside">
                    <span class="iconbox border_green"><i class="icon iconfont icon-weixin"></i></span>
                    <a href="#" class="bds_weixin" data-cmd="weixin" title="分享到微信"> </a>
                </div>
                <div class="outside">
                    <span class="iconbox border_blue"><i class="icon iconfont icon-QQ"></i></span>
                    <a href="#" class="bds_qzone" data-cmd="qzone" title="分享到QQ空间"> </a>
                </div>
            </div>
        </li>
    </ul>
</div>
<div class="right_fixed">
  <div class="r_ico">
	<i class="icon iconfont icon-jubao"></i>
	<span class="txt" id="reportBtn">内容举报</span>
  </div>
  <div class="returnTop">
   <i class="icon iconfont icon-fanhuidingbu"></i>
   <span>返回顶部</span>
 </div>
</div>
<div id="pop_win"></div>
<div id="popup_mask"></div>
<div class="pop_CA_cover" ></div>
<div class="pop pop_CA" >
    <div class="CA_header">
        收藏助手
        <span class="cancel_icon"  id="fapancle" ></span>
    </div>
    <iframe src="" id="collectIframe" frameborder="0" width="100%" height="360"  scrolling="no" ></iframe>
</div>
<!--举报-->
<div id="report_dialog" style="top: 250px; left: 343.5px;"><div id="panel_report">
    <div class="panel_head">不良信息举报</div>
    <form method="post" id="frmReport" class="panel_body">
        <table border="0" cellpadding="0" cellspacing="4" class="pop_table">
            <tbody><tr><td colspan="2">您举报文章：<a href="http://blog.csdn.net/raintungli/article/details/76583070" target="_blank">深度学习：神经网络中的前向传播和反向传播算法推导</a></td></tr>
            <tr>
                <th style="width:60px;">举报原因：</th>
                <td id="panel_reporttype">
                    <label><input type="radio" class="report_type" id="report_sex" name="report_type" value="1">色情</label>
                    <label><input type="radio" class="report_type" id="report_Politics" name="report_type" value="2">政治</label>
                    <label><input type="radio" class="report_type" id="report_copy" name="report_type" value="3">抄袭</label>
                    <label><input type="radio" class="report_type" id="report_ad" name="report_type" value="4">广告</label>
                    <label><input type="radio" class="report_type" id="report_want" name="report_type" value="5">招聘</label>
                    <label><input type="radio" class="report_type" id="report_call" name="report_type" value="6">骂人</label>
                    <br>
                    <label><input type="radio" class="report_type" id="report_other" name="report_type" value="7">其他</label>
                    <input type="text" name="report_other_content" id="report_other_content" maxlength="30" style="display: none;">
                </td>
            </tr>
            <tr id="panel_originalurl" style="display: none;">
                <th>原文地址：</th>
                <td>
                    <input id="originalurl" value="http://" name="originalurl" type="text" style="width: 90%;">
                </td>
            </tr>
            <tr>
                <th id="sp_reason">原因补充：</th>
                <td>
                    <textarea id="report_description" style="width: 300px;" rows="3" name="report_description"></textarea>
                    <p id="sp_n" style="color:#999;margin:0px;padding:0px;">(最多只允许输入30个字)</p>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input id="btnSubmitReport" name="submit" type="image" align="middle" class="btn_1" src="http://static.blog.csdn.net/images/btn_submit.jpg">
                    <span style="padding-left:20px;"></span>
                    <img id="btnCloseReportDialog" src="http://static.blog.csdn.net/images/btn_cancel.jpg" align="middle">
                    <div id="error" style="color: Red">
                    </div>
                </td>
            </tr>
            </tbody></table>
    </form>
</div>
    <script language="javascript" type="text/javascript">
        var isComment=0;
        //显示隐藏地址
        $(function () {
            if(isComment){
                $("#report_description").attr("disabled",true);
                $("#sp_n").hide();
                $("#sp_reason").html("评论内容：");
            }
            $(".report_type").click(function () {
                $("#panel_originalurl,#report_other_content").hide();
                switch ($(this).val()) {
                    case '3':
                        $("#panel_originalurl").show();
                        $("#originalurl").focus();
                        break;
                    case '7':
                        if(isComment){
                            $("#report_other_content").show().focus();
                        }
                        break;
                }

            });

            $("#frmReport").submit(function () {
                if (!currentUserName) {

                    if (confirm("您的操作必须登录，是否登录？")) {
                        location.href = "http://passport.csdn.net/account/login?from=" + encodeURIComponent(location.href);
                        return false;
                    }
                    return false;
                }

                var reportType = $("input[name=report_type]:checked").val();
                if(!reportType){
                    alert("请选择举报原因！");
                    return false;
                }
                var otherInfo = "";
                switch (reportType) {
                    case '3':
                        otherInfo = $("#originalurl").val();
                        if (otherInfo == ""||otherInfo=="http://") {
                            alert("举报抄袭必须提供原创文章地址！");
                            $("#originalurl").focus();
                            return false;
                        } else if(!checkeURL(otherInfo)) {
                            alert("请输入正确的原创文章地址！");
                            $("#originalurl").focus();
                            return false;
                        }
                        break;
                    case '7':
                        otherInfo = $("#report_other_content").val();
                        if (isComment && !otherInfo) {
                            alert("请填写举报的具体原因！");
                            $("#report_other_content").focus();
                            return false;
                        }
                        if(!isComment){
                            if(!$("#report_description").val()){
                                alert("请填写举报的具体原因！");
                                $("#report_description").focus();
                                return false;
                            }
                        }
                        break;
                }
                if(!isComment){
                    if($("#report_description").val().length>30){
                        alert("举报原因最多只允许输入30个字！");
                        return false;
                    }
                }
                nowTime = {
                  year: new Date().getFullYear(),
                  month: parseInt(new Date().getMonth())+1,
                  day: new Date().getDate(),
                  hours: parseInt(new Date().getHours()),
                  minutes: parseInt(new Date().getMinutes()),
                  seconds: parseInt(new Date().getSeconds())
                }
                var data = {
                    articleId: fileName,
                    commentId: 0,
                    reportType: reportType,
                    originalurl: $("#originalurl").val(),
                    report_other_content: $("#report_other_content").val(),
                    report_description: $("#report_description").val(),
                    currentUserName: currentUserName,
                    updatetime: nowTime.year+'/'+nowTime.month+'/'+nowTime.day+' '+ nowTime.hours+':'+nowTime.minutes+':'+seconds,
                    blogUser: username
                };
                if(!isComment){//如果是举报文章
                    data.report_other_content = data.report_description;
                    // data.report_description = "1. 神经网络这是一个常见的神经网络的图：这是一个常见的三层神经网络的基本构成，Layer L1是输入层，Layer L2是隐含层";
                }

                $.post(blog_address + "/common/report?id="+fileName+"&t=2", data, function (data) {
                    if (data.result == 1){
                        SetError("感谢您的举报，我们会尽快审核！");
                    }else{
                        if (data.content) alert(data.content);
                    }

                });
                return false;
            });

            $("#btnCloseReportDialog").click(function () {
                CloseDiv();
            });

        });

        //提示后关闭方法
        function SetError(error) {
            $("#btnCloseReportDialog").trigger("click");
            alert(error);
            CloseDiv();
        }

        //关闭方法
        function CloseDiv() {

            $.removeMask();
            $("#report_dialog").hide();
            return false;
        }

        //验证url
        function checkeURL(url){
            return /^http(s)?:\/\/([\w-]+\.)+[\w-]+/i.test(url);
        }

    </script>
</div>

<script src="http://c.csdnimg.cn/public/common/libs/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/public/res/bower-libs/MathJax/MathJax.js?config=TeX-AMS_HTML"></script>
<script type="text/javascript" src="http://passport.csdn.net/content/loginbox/login.js"></script>

<script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/js/blog_ver.js?v=2017.042"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/js/skin2017.js?v=2017.042"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/scripts/cnick.js"></script>
<script>window._bd_share_config = { "common": { "bdSnsKey": {}, "bdText": "", "bdMini": "1", "bdMiniList": false, "bdPic": "", "bdStyle": "0", "bdSize": "16" }, "share": {} }; with (document) 0[(getElementsByTagName('head')[0] || body).appendChild(createElement('script')).src = 'http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion=' + ~(-new Date() / 36e5)];</script>
<script type="text/javascript" >
    if($(".article_collect li").length==1){$(".article_collect").hide();}
    if($(".article_tags li").length==1){$(".article_tags").hide();}
    $(".edit a").attr("href","http://write.blog.csdn.net/postedit/"+fileName);
    $.each($(".edu_li a"),function(){$(this).attr("href",$(this).attr("href").replace("blog7","blog9"))});
    new CNick('#uid').showNickname();
if($("#fan").html()=="")
{
$("#fan").html(0);	
}

	var blogCustomType ='{customtype}';
                
        $("#custom"+blogCustomType).show();
</script>
</body>

<script  type="text/javascript">
    var fromjs=$("#fromjs");
    if(fromjs.length>0)
    {                  
        $("#fromjs .markdown_views pre").addClass("prettyprint");       
        prettyPrint();

        $('pre.prettyprint code').each(function () {
            var lines = $(this).text().split('\n').length;
            var $numbering = $('<ul/>').addClass('pre-numbering').hide();
            $(this).addClass('has-numbering').parent().append($numbering);
            for (i = 1; i <= lines; i++) {
                $numbering.append($('<li/>').text(i));
            };
            $numbering.fadeIn(1700);
        });

        $('.pre-numbering li').css("color","#999");             
    }

    $(function(){
        setTimeout(function(){
            $(".math").each(function(index,value){$(this).find("span").last().css("color","#fff"); })
        },500);         
       

    });

    setTimeout(function () {
        $(".toc a[target='_blank']").attr("target", "");
    }, 500);

</script>
</html>



<!DOCTYPE html>
<html>
<head>
            <link rel="canonical" href="http://blog.csdn.net/js1568/article/details/78042431"/> 

    <script type="text/javascript">
        var username = "js1568";var _blogger = username;var blog_address = "http://blog.csdn.net/js1568";var static_host = "http://static.blog.csdn.net";
        var currentUserName = "js1568"; var fileName = '78042431';var commentscount = 0; var islock = false
        window.quickReplyflag = true;
        var totalFloor=0;
                
                 var isBole = false;
                
                
                 var isDigg = false;
                
          
             var isExpert=false;
        
          
        var isAdm=false;
        

    </script>

<meta http-equiv="content-type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <script src="http://c.csdnimg.cn/public/common/libs/jquery/jquery-1.9.1.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/common/libs/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/static/css/avatar.css">
    <link type="text/css" rel="stylesheet" href="http://static.blog.csdn.net/scripts/SyntaxHighlighter/styles/default.css" />
    <link rel="stylesheet" href="http://static.blog.csdn.net/Skin/skin3-template/css/style.css?v=2017.042">
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/common/toolbar/content_toolbar_css/content_toolbar.css?v5.00.37">
              <!-- adhoc sdk -->
		<script src=https://sdk.appadhoc.com/ab.plus.js></script>
		<script>
		adhoc('init', {
		  appKey: 'ADHOC_0e0bce4f-8793-4f68-89cf-34c14f2532bb',
		  defaultFlags: {isLogin: true}
		})
		</script>
              <!-- adhoc sdk end -->
    
	<script src="//static.blog.csdn.net/public/switchHome/switchHome.js?v=2017.43"></script>	
	
    <script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/fonts/iconfont.js"></script>
    <script src="//csdnimg.cn/rabbit/exposure-click/main.js?v1.15.23"></script>
    <script type="text/javascript" src="http://c.csdnimg.cn/pubfooter/js/tracking_for_recommend.js?v=0911" charset="utf-8"></script>
    <script type="text/javascript" src="http://csdnimg.cn/pubfooter/js/tracking.js" charset="utf-8"></script>
    <script type="text/javascript" src="http://static.blog.csdn.net/scripts/cnick.js" charset="utf-8"></script>
 
    <link rel="stylesheet" href="http://static.blog.csdn.net/code/prettify.css" />
    <script type="text/javascript" src="http://static.blog.csdn.net/code/prettify.js"></script>
<script src="http://dup.baidustatic.com/js/ds.js"></script>
    <script type="text/javascript">

        // Traffic Stats of the entire Web site By baidu
        var _hmt = _hmt || [];
        (function() {
            var hm = document.createElement("script");
            hm.src = "https://hm.baidu.com/hm.js?6bcd52f51e9b3dce32bec4a3997715ac";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
        // Traffic Stats of the entire Web site By baidu end



    </script>
    <meta name="description" content="线性代数中的范数" />
    <meta name="keywords" content="机器学习,线性代数" />
    <meta http-equiv="Cache-Control" content="no-siteapp" /><link rel="alternate" media="handheld" href="#" />
    <meta name="shenma-site-verification" content="5a59773ab8077d4a62bf469ab966a63b_1497598848">


    <title>线性代数中的范数 - CSDN博客</title>
</head>
<body>
<script id="toolbar-tpl-scriptId" prod="download" skin="black" src="http://c.csdnimg.cn/public/common/toolbar/js/content_toolbar.js?v5.00.37" type="text/javascript" domain="http://blog.csdn.net"></script>

<div class="container clearfix">
    <main>
        <article>
            <h1 class="csdn_top">线性代数中的范数</h1>
            <div class="article_bar clearfix">
                <div class="artical_tag">
                    <span class="original">转载</span>
                    <span class="time">2017年09月20日 16:31:53</span>
                </div>
				<ul class="article_tags clearfix csdn-tracking-statistics" data-mod="popu_377">
					<li class="tit">标签：</li>
					
					<li><a href="http://so.csdn.net/so/search/s.do?q=机器学习&t=blog" target="_blank">机器学习</a> <span>/</span></li>
					
					<li><a href="http://so.csdn.net/so/search/s.do?q=线性代数&t=blog" target="_blank">线性代数</a> <span>/</span></li>
					
				</ul>
                <ul class="right_bar">
                    <li><button class="btn-noborder"><i class="icon iconfont icon-read"></i><span class="txt">381</span></button></li>
                    <!--<li><button class="btn-noborder"><i class="icon iconfont icon-dashang-"></i><span class="txt">0</span></button></li>-->

                    <li class="edit">
                        <a class="btn-noborder" href="" >
                            <i class="icon iconfont icon-bianji"></i><span class="txt">编辑</span>
                        </a>
                    </li>
                    <li class="del">
                        <a class="btn-noborder" onclick="javascript:deleteArticle(fileName);return false;">
                            <i class="icon iconfont icon-shanchu"></i><span class="txt">删除</span>
                        </a>
                    </li>
                </ul>
            </div>
            <div id="article_content" class="article_content csdn-tracking-statistics" data-mod="popu_519" data-dsm="post">
                <div class="markdown_views"><p>向量范数</p>

<ul>
<li>0-范数：向量中非零元素个数</li>
<li>1-范数： <img src="https://www.zhihu.com/equation?tex=%7C%7Cx%7C%7C_1%20=%20%5Csum_%7Bi=1%7D%5EN%7Cx_i%7C" alt="" title="">，即向量元素绝对值之和，matlab调用函数norm(x, 1) 。</li>
<li>2-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_2%20=%5Csqrt%7B%5Csum_%7Bi=1%7D%5ENx_i%5E2%7D" alt="" title="">，Euclid范数（欧几里得范数，常用计算向量长度），即向量元素绝对值的平方和再开方，matlab调用函数norm(x, 2)。</li>
<li><img src="https://www.zhihu.com/equation?tex=%5Cinfty" alt="" title=""> -范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_%5Cinfty%20=%20%5Cmax_%7Bi%7D%7Cx_i%7C" alt="" title="">，即所有向量元素绝对值中的最大值，matlab调用函数norm(x, inf)。</li>
<li><img src="https://www.zhihu.com/equation?tex=-%5Cinfty" alt="" title="">-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_%7B-%5Cinfty%7D=%5Cmin_i%7Cx_i%7C" alt="" title="">，即所有向量元素绝对值中的最小值，matlab调用函数norm(x, -inf)。</li>
<li>p-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_p%20=%20%28%5Csum_%7Bi=1%7D%5EN%7Cx_i%7C%5Ep%29%5E%7B%5Cfrac%7B1%7D%7Bp%7D%7D" alt="" title="">，即向量元素绝对值的p次方和的1/p次幂，matlab调用函数norm(x, p)。</li>
</ul>

<p>矩阵范数</p>

<ul>
<li>1-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_1%20=%20%5Cmax_j%5Csum_%7Bi=1%7D%5Em%7Ca_%7Bi,j%7D%7C" alt="" title="">， 列和范数，即所有矩阵列向量绝对值之和的最大值，matlab调用函数norm(A, 1)。</li>
<li>2-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_2%20=%20%5Csqrt%7B%5Clambda_1%7D" alt="" title="">，<img src="https://www.zhihu.com/equation?tex=%5Clambda%3Cbr/%3E" alt="" title="">为的最大特征值。，谱范数，即A’A矩阵的最大特征值的开平方。matlab调用函数norm(x, 2)。</li>
<li><img src="https://www.zhihu.com/equation?tex=%5Cinfty" alt="" title="">-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_%5Cinfty%20=%20%5Cmax_i%5Csum_%7Bj=1%7D%5EN%7Ca_%7Bi,j%7D%7C" alt="" title="">，行和范数，即所有矩阵行向量绝对值之和的最大值，matlab调用函数norm(A, inf)。</li>
<li>F-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_F=%5Cleft%28%5Csum_%7Bi=1%7D%5Em%5Csum_%7Bj=1%7D%5En%7Ca_%7Bi,j%7D%7C%5E2%5Cright%29%5E%7B%5Cfrac%7B1%7D%7B2%7D%7D" alt="" title="">，Frobenius范数，即矩阵元素绝对值的平方和再开平方，matlab调用函数norm(A, ’fro‘)。</li>
<li>核范数：是A的奇异值。即奇异值之和</li>
</ul>

<p>作者：魏通 <br>
链接：<a href="https://www.zhihu.com/question/20473040/answer/102907063" target="_blank">https://www.zhihu.com/question/20473040/answer/102907063</a> <br>
来源：知乎 <br>
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。</p><link rel="stylesheet" href="http://static.blog.csdn.net/public/res-min/markdown_views.css?v=2.0" /></div><link rel="stylesheet" href="http://static.blog.csdn.net/public/res-min/markdown_views.css?v=2.0" />
            </div>
        </article>
        <div class="readall_box csdn-tracking-statistics" data-mod="popu_376">
			<div class="read_more_mask"></div>
            <a class="btn btn-large btn-gray-fred read_more_btn" target="_self">阅读全文</a>
        </div>
        <div class="article_copyright">
            
        </div>
        <!--  <div class="reward_box">
            <div class="tit">
              <button class="btn_reward"><i class="icon iconfont icon-dashang-"></i></button>
            </div>
            <dl class="clearfix">
              <dt><a href="#" target="_blank">近期打赏</a></dt>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
            </dl>
          </div>-->

        <ul class="article_collect clearfix csdn-tracking-statistics"  data-mod="popu_378">
            <li class="tit">本文已收录于以下专栏：</li>
            
        </ul>
        <div class="comment_box clearfix">
            <div id="comment_form">
                <div id="commentsbmitarear">
                    <!-- <h6><span>0</span>条评论</h6> -->
           <!--          <dl class="clearfix" id="commentbox">
                        <dt>
                            <a href="http://my.csdn.net/js1568"><img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg" ></a>
                        </dt>
                        <dd>
                            <a href="http://my.csdn.net/js1568" target="_blank">js1568</a>
                        </dd>
                        <dd class="txt_tip"><span id="tip_comment" class="tip"></span></dd>
                    </dl> -->
                    <div class="comment_area clearfix">
						<div class="userimg"><a href="http://my.csdn.net/js1568"><img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg"></a></div>
                        <form action="/js1568/comment/submit?id=78042431" method="post" onsubmit="return subform(this);" id="commentform">
                            <textarea class="comment_content" name="comment_content" id="comment_content" placeholder="发表你的评论"></textarea>
                            <div class="bot_bar clearfix">
                                <div id="ubbtools" class="add_code">
                                    <a href="#insertcode" code="code" target="_self"><i class="icon iconfont icon-daima"></i></a>
                                </div>

                                <input type="hidden" id="comment_replyId" name="comment_replyId">
                                <input type="hidden" id="comment_userId" name="comment_userId" value="">
                                <input type="hidden" id="commentId" name="commentId" value="">
                                <input type="submit" class="btn btn-redborder" value="发表评论">
								<span id="tip_comment" class="tip">
                                <div style="display: none;" class="csdn-tracking-statistics" data-mod="popu_384"><a href="#" target="_blank" class="comment_area_btn">发表评论</a></div>

                                <div id="lang_list" code="code">
                                    <a href="#html" style="width:95px;" class="long_name" target="_self">HTML/XML</a>
                                    <a href="#objc" style="width:95px;" class="long_name" target="_self">objective-c</a>
                                    <a href="#delphi" style="width:58px;" class="zhong_name" target="_self">Delphi</a>
                                    <a href="#ruby" class="zhong_name" target="_self">Ruby</a>
                                    <a href="#php" target="_self">PHP</a>
                                    <a href="#csharp" class="duan_name" target="_self">C#</a>
                                    <a style=" border-right: none;" href="#cpp" class="duan_name" target="_self">C++</a>
                                    <a style=" border-bottom:none;width:95px;" href="#javascript" class="long_name" target="_self">JavaScript</a>
                                    <a style=" border-bottom:none;width:95px;" href="#vb" class="long_name" target="_self">Visual Basic</a>
                                    <a style=" border-bottom:none;" href="#python" class="zhong_name" target="_self">Python</a>
                                    <a style=" border-bottom:none;" href="#java" class="zhong_name" target="_self">Java</a>
                                    <a style="border-bottom:none;" href="#css" class="duan_name" target="_self">CSS</a>
                                    <a style="border-bottom:none;" href="#sql" class="duan_name" target="_self">SQL</a>
                                    <a style="border:none; " href="#plain" class="duan_name" target="_self">其它</a>
                                    <span class="arrb"></span>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <div class="comment_li_outbox">
            <div id="comment_list"></div>
        </div>

        <div class="more_comment">
            <div id="comment_bar" class="trackgin-ad" data-mod="popu_385"></div>
        </div>

        <h3 class="recommend_tit">相关文章推荐</h3>
        <div class="recommend_list clearfix">
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/wylfll/article/details/47950593"  target="_blank" strategy="BlogCommendFromCF_0">在jsp中如何实现网页的自动更新</a></h2>
                    <div class="summary">
                        在jsp中如何实现网页的自动更新
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/wylfll" target="_blank" strategy="BlogCommendFromCF_0"><img src="http://avatar.csdn.net/E/4/0/2_wylfll.jpg" alt="wylfll" title="wylfll"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/wylfll">wylfll</a></li>
                        <li class="time">2015-08-24 14:27</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>410</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/js1568/article/details/73434001"  target="_blank" strategy="BlogCommendFromCF_1">最小生成树-Prim算法和Kruskal算法</a></h2>
                    <div class="summary">
                        最小生成树-Prim算法和Kruskal算法
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/js1568" target="_blank" strategy="BlogCommendFromCF_1"><img src="http://avatar.csdn.net/B/A/D/2_js1568.jpg" alt="js1568" title="js1568"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/js1568">js1568</a></li>
                        <li class="time">2017-06-18 17:19</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>88</span></li>
                    </ul>
                </dd>
            </dl>
            
            <!--dl class="clearfix csdn-tracking-statistics" data-mod="popu_393">
                <dt><a href="http://edu.csdn.net/huiyiCourse/series_detail/64?utm_source=blog10" target="_blank"><img class="maxwidth" src="http://img.blog.csdn.net/20170928113144608" alt="" title=""></a></dt>
                <dd>
                    <div class="summary">
                        <h2><a href='http://edu.csdn.net/topic/python1?utm_source=blog10' target='_blank'>伤心啊！年度热门编程语言排行榜出来了...</a></h2>  <div class="summary">近期，IEEE Spectrum 发布了第四届顶级编程语言交互排行榜。结合 10 个线上数据源的 12 个标准，对 48 种语言进行了排行！此外，七牛云许式伟曾说过Go语言会取代Java...气氛... </div> 
                    </div>
                </dd>
            </dl-->
	<script>
		(function() {
		    var s = "_" + Math.random().toString(36).slice(2);
		    document.write('<div id="' + s + '"></div>');
		    (window.slotbydup=window.slotbydup || []).push({
			id: '4765209',
			container: s,
			size: '808,120',
			display: 'inlay-fix'
		    });
		})();
	</script>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/myarrow/article/details/51188553"  target="_blank" strategy="BlogCommendFromCsdn_2">线性代数常用基本知识 (含向量和矩阵范数&lt;Matrix or vector norm&gt;)</a></h2>
                    <div class="summary">
                        1. 行列式
1.1 二阶行列式




1.2 三阶行列式
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/MyArrow" target="_blank" strategy="BlogCommendFromCsdn_2"><img src="http://avatar.csdn.net/C/1/6/2_myarrow.jpg" alt="MyArrow" title="MyArrow"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/MyArrow">MyArrow</a></li>
                        <li class="time">2016-04-19 11:07</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>8551</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/mathmetics/article/details/9279367"  target="_blank" strategy="BlogCommendFromCsdn_3">线性代数(七) : 子空间的基与维数</a></h2>
                    <div class="summary">
                        子空间的基与维数
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/xxingjjing" target="_blank" strategy="BlogCommendFromCsdn_3"><img src="http://avatar.csdn.net/5/D/7/2_xxingjjing.jpg" alt="xxingjjing" title="xxingjjing"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/xxingjjing">xxingjjing</a></li>
                        <li class="time">2013-07-11 10:29</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>2984</span></li>
                    </ul>
                </dd>
            </dl>
            <!-- 广告位：PC端-博客详情通栏7（feed流）-808*120 --><script> (function() {    var s = "_" + Math.random().toString(36).slice(2);   document.write('<div id="' + s + '"></div>');    (window.slotbydup=window.slotbydup || []).push({        id: '4983339',       container: s,        size: '808,120',        display: 'inlay-fix'    }); })();  </script>
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/qq_28306361/article/details/50800972"  target="_blank" strategy="BlogCommendFromCsdn_4">线性代数复习四——矩阵的维数和秩</a></h2>
                    <div class="summary">
                        复习
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/qq_28306361" target="_blank" strategy="BlogCommendFromCsdn_4"><img src="http://avatar.csdn.net/8/6/2/2_qq_28306361.jpg" alt="qq_28306361" title="qq_28306361"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/qq_28306361">qq_28306361</a></li>
                        <li class="time">2016-03-04 10:57</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>1835</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics downloadElement" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
               	<dt><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank" strategy="BlogCommendFromCsdn_5"><img class="maxwidth" src="http://download.csdn.net/images/minetype/rar.svg" alt="" title=""></a></dt>
		<dd>
			<div class="summary">
				<h2><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank" strategy="BlogCommendFromCsdn_5">高校教学资源，高数，线性代数等</a></h2>
				<div class="summary">
				  <ul>
					  <li class="time">2011-04-02 21:01</li>
					  <li class="visited_num fileSize">3.32MB</li>
					  <li class="download_btn"><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank">下载</a></li>
				  </ul>
				</div> 
			</div>
		</dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics downloadElement" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
               	<dt><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank" strategy="BlogCommendFromCsdn_6"><img class="maxwidth" src="http://download.csdn.net/images/minetype/rar.svg" alt="" title=""></a></dt>
		<dd>
			<div class="summary">
				<h2><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank" strategy="BlogCommendFromCsdn_6">考研数学公式（线性代数+概率论+高数）合集</a></h2>
				<div class="summary">
				  <ul>
					  <li class="time">2010-03-02 20:44</li>
					  <li class="visited_num fileSize">815KB</li>
					  <li class="download_btn"><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank">下载</a></li>
				  </ul>
				</div> 
			</div>
		</dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/suqier1314520/article/details/12584479"  target="_blank" strategy="BlogCommendFromCsdn_7">线性代数导论9——线性相关性、基、维数</a></h2>
                    <div class="summary">
                        本文是Gilbert Strang的线性代数导论课程笔记。课程地址：http://v.163.com/special/opencourse/daishu.html&#160;&#160;
第九课时：线性相关性、基、维数...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/suqier1314520" target="_blank" strategy="BlogCommendFromCsdn_7"><img src="http://avatar.csdn.net/5/6/9/2_suqier1314520.jpg" alt="suqier1314520" title="suqier1314520"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/suqier1314520">suqier1314520</a></li>
                        <li class="time">2013-10-10 19:28</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>4187</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/tengweitw/article/details/40921209"  target="_blank" strategy="BlogCommendFromCsdn_8">【线性代数】线性相关性、基和维数</a></h2>
                    <div class="summary">
                        一、线性相关性

&#160; &#160; &#160; 什么情况下，向量X1，X2，……，Xn是线性无关的？


&#160; &#160;&#160;&#160; 答：当向量X1，X2，……，Xn的线性组合(线性组合时系数不能全为0)不为零向量时，它们是线性无关的...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/tengweitw" target="_blank" strategy="BlogCommendFromCsdn_8"><img src="http://avatar.csdn.net/B/E/9/2_tengweitw.jpg" alt="tengweitw" title="tengweitw"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/tengweitw">tengweitw</a></li>
                        <li class="time">2014-11-09 14:29</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>1551</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/u010182633/article/details/52331744"  target="_blank" strategy="BlogCommendFromCsdn_9">漫步线性代数十——线性无关，基和维数</a></h2>
                    <div class="summary">
                        m,nm,n没有给出线性系统实际大小的真实信息，在我们上文的例子中有三行和四列，但是第三行仅仅是前两行的组合，在消元后得到了零行，它对奇次问题Ax=0Ax=0 没有影响。第四列同样是相关的，列空间减到...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/u010182633" target="_blank" strategy="BlogCommendFromCsdn_9"><img src="http://avatar.csdn.net/2/2/4/2_u010182633.jpg" alt="u010182633" title="u010182633"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/u010182633">u010182633</a></li>
                        <li class="time">2016-08-26 21:16</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>974</span></li>
                    </ul>
                </dd>
            </dl>
            

	   

            

            
        </div>
    </main>
    <aside>
        <div class="right_box user_info">
            <dl class="inf_bar clearfix">
                <dt class="csdn-tracking-statistics" data-mod="popu_381">
                    <a href="http://blog.csdn.net/js1568" target="_blank">
                        <img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg" class="avatar_pic">
                    </a>
                    <span class="medals" title="">
                <svg class="icon" aria-hidden="true">
                    
                </svg>
              </span>
                </dt>
                <dd>
                    <h3 class="csdn-tracking-statistics"  data-mod="popu_380"><a href="http://blog.csdn.net/js1568" target="_blank" id="uid">js1568</a></h3>
                    <span  class="csdn-tracking-statistics" data-mod="popu_379"><a class="btn btn-redborder-small "  id="span_add_follow" target="_self">＋关注</a></span>
                </dd>
            </dl>
            <div class="inf_number_box clearfix">
                <dl>
                    <dt>原创</dt>
                    <dd>15</dd>
                </dl>
                <dl>
                    <dt>粉丝</dt>
                    <dd id='fan'>3</dd>
                </dl>
                <dl>
                    <dt>喜欢</dt>
                    <dd>0</dd>
                </dl>
								 <dl>
              <dt>码云</dt>
              <dd>&nbsp;</dd>
            </dl>

            </div>
	    <div class="writings">
              <div class="public_signal clearfix">
                <h3>他的最新文章</h3>
                <a href="http://blog.csdn.net/js1568" target="_blank" class="more_z"><span>更多文章</span></a>
              </div>
                <ul class="inf_list clearfix csdn-tracking-statistics" data-mod="popu_382">
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429272" target="_blank">统计学习方法 7-支持向量机</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429192" target="_blank">统计学习方法 6-逻辑斯谛回归与最大熵模型</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429164" target="_blank">统计学习方法 5-决策树</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429150" target="_blank">统计学习方法 4-朴素贝叶斯法</a>
                    </li>
                    
                </ul>
            </div>
        </div>
        <div class="extension_other csdn-tracking-statistics" data-mod="popu_389">
						<!--u3032528-->
			<div class="flashrecommend">

<!-- 请置于所有广告位代码之前 -->
<script src="http://dup.baidustatic.com/js/dm.js"></script>
           
<!-- 广告位：PC端-博客详情页右侧视窗1（feed流）-300*250 -->
<script>
(function() {
    var s = "_" + Math.random().toString(36).slice(2);
    document.write('<div id="' + s + '"></div>');
    (window.slotbydup=window.slotbydup || []).push({
        id: '4770930',
        container: s,
        size: '300,250',
        display: 'inlay-fix'
    });
})();
</script>

		    </div>
        </div>

        
        <div class="fixRight">
            <div class="right_box padb0 csdn-tracking-statistics" data-mod="popu_391">
                <h3 class="tit"><span><em>在线课程</em></span></h3>
                <ul class="edu_li clearfix">
                  
                  <li>
                    <div>
                      <a href="http://edu.csdn.net/huiyiCourse/detail/603?utm_source=blog7" target="_blank">
                        <img src="http://img.bss.csdn.net/201711101450316277.png" alt="MVVM在美团点评酒旅移动端的最佳实践" title="MVVM在美团点评酒旅移动端的最佳实践">
                      </a>
                    </div>
                    <div>
                      <p><a href="http://edu.csdn.net/huiyiCourse/detail/603?utm_source=blog7" target="_blank">MVVM在美团点评酒旅移动端的最佳实践</a></p>
                      <p>讲师：王禹华</p>
                    </div>
                  </li>
                  
                  <li>
                    <div>
                      <a href="http://edu.csdn.net/huiyiCourse/detail/594?utm_source=blog7" target="_blank">
                        <img src="http://img.bss.csdn.net/201711101448389242.png" alt="C语言大型软件设计的面向对象" title="C语言大型软件设计的面向对象">
                      </a>
                    </div>
                    <div>
                      <p><a href="http://edu.csdn.net/huiyiCourse/detail/594?utm_source=blog7" target="_blank">C语言大型软件设计的面向对象</a></p>
                      <p>讲师：宋宝华</p>
                    </div>
                  </li>
                  
                </ul>
            </div>
			<!--u3032529-->
            <!-- <div class="extension_other csdn-tracking-statistics baidu_box" data-mod="popu_395">
								
                <script type="text/javascript" src="http://mpb1.iteye.com/cxpdpmumfaedgm.js"></script>
            </div> -->
			<div class="extension_other csdn-tracking-statistics bottomRcom" data-mod="popu_389" style="position:absolute;z-index:-5;opacity:0;pointer-events:none">
						<!--u3032528-->
				<div class="flashrecommend">
				<script type="text/javascript" src="http://mpb1.iteye.com/bwocoltlyzdec.js"></script>
				</div>
			</div>
        </div>
		<div class="user-hotArticle">
          <h3>热门文章</h3>
          <ul class="hotArticle-list csdn-tracking-statistics" data-mod="popu_521">
 
            <li>
              <a href="/js1568/article/details/78042431">线性代数中的范数</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>377</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/73385734">八大（基于比较）排序算法</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>371</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/66476086">先序，中序，后序线索化二叉树</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>313</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/64905555">机器学习（周志华 ）-2模型评估与选择</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>313</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/68066618">字符串匹配的KMP算法</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>309</span></div>
            </li>
 
          </ul>
        </div>


    </aside>
</div>

<div class="left_fixed">
      <div class="left_show_button">
        <span>
          <i class="icon iconfont icon-youjiantou"></i>
        </span>
      </div>
    <ul class="left_menu">

        <li>
            <button class="left-fixed-btn btn-like csdn-tracking-statistics" data-mod="popu_373" target="_self">
                <span class="iconbox border_red"><i class="icon iconfont icon-dianzan"></i></span>
				<span class="txt">0</span>
            </button>
        </li>
		<li id="blog_artical_directory">
            <button class="left-fixed-btn left_menu_btn csdn-tracking-statistics" data-mod="popu_372" target="_self">
                <span class="iconbox border_black"><i class="icon iconfont icon-mulu"></i></span>
            </button>
        </li>
        <li class="menu_con">
            <div class="list_father">
                <div class="arr_box">
                    <button class="btn-noborder arr-btn scroll-down  left_scroll_down"><i class="icon iconfont icon-xiajiantou"></i></button>
                    <button class="btn-noborder arr-btn scroll-up left_scroll_top"><i class="icon iconfont icon-shangjiantou"></i></button>
                </div>
                <div class="arr"></div>
                <div id="csdnBlogDir"></div>
            </div>
        </li>
        <li>
            <button class="left-fixed-btn csdn-tracking-statistics" data-mod="popu_374"  id="com-quick-collect" target="_self">
                <span class="iconbox border_purple"><i class="icon iconfont icon-shoucang"></i></span>
    
            </button>
        </li>
		<li>
          <button class="left-fixed-btn btn-pinglun" >
            <span class="iconbox border_purple"><i class="icon iconfont icon-pinglun"></i></span>
          </button>
        </li>
        <li id="share_box">
            <button class="left-fixed-btn  csdn-tracking-statistics"  data-mod="popu_375" target="_self">
                <span class="iconbox border_orange"><i class="icon iconfont icon-fenxiang"></i></span>
            </button>
            <div class="bdsharebuttonbox csdn-tracking-statistics" data-mod="popu_172">
                <div class="outside">
                    <span class="iconbox border_red2"><i class="icon iconfont icon-xinlang"></i></span>
                    <a href="#" class="bds_tsina" data-cmd="tsina" title="分享到新浪微博"> </a>
                </div>
                <div class="outside">
                    <span class="iconbox border_green"><i class="icon iconfont icon-weixin"></i></span>
                    <a href="#" class="bds_weixin" data-cmd="weixin" title="分享到微信"> </a>
                </div>
                <div class="outside">
                    <span class="iconbox border_blue"><i class="icon iconfont icon-QQ"></i></span>
                    <a href="#" class="bds_qzone" data-cmd="qzone" title="分享到QQ空间"> </a>
                </div>
            </div>
        </li>
    </ul>
</div>
<div class="right_fixed">
  <div class="r_ico">
	<i class="icon iconfont icon-jubao"></i>
	<span class="txt" id="reportBtn">内容举报</span>
  </div>
  <div class="returnTop">
   <i class="icon iconfont icon-fanhuidingbu"></i>
   <span>返回顶部</span>
 </div>
</div>
<div id="pop_win"></div>
<div id="popup_mask"></div>
<div class="pop_CA_cover" ></div>
<div class="pop pop_CA" >
    <div class="CA_header">
        收藏助手
        <span class="cancel_icon"  id="fapancle" ></span>
    </div>
    <iframe src="" id="collectIframe" frameborder="0" width="100%" height="360"  scrolling="no" ></iframe>
</div>
<!--举报-->
<div id="report_dialog" style="top: 250px; left: 343.5px;"><div id="panel_report">
    <div class="panel_head">不良信息举报</div>
    <form method="post" id="frmReport" class="panel_body">
        <table border="0" cellpadding="0" cellspacing="4" class="pop_table">
            <tbody><tr><td colspan="2">您举报文章：<a href="http://blog.csdn.net/raintungli/article/details/76583070" target="_blank">深度学习：神经网络中的前向传播和反向传播算法推导</a></td></tr>
            <tr>
                <th style="width:60px;">举报原因：</th>
                <td id="panel_reporttype">
                    <label><input type="radio" class="report_type" id="report_sex" name="report_type" value="1">色情</label>
                    <label><input type="radio" class="report_type" id="report_Politics" name="report_type" value="2">政治</label>
                    <label><input type="radio" class="report_type" id="report_copy" name="report_type" value="3">抄袭</label>
                    <label><input type="radio" class="report_type" id="report_ad" name="report_type" value="4">广告</label>
                    <label><input type="radio" class="report_type" id="report_want" name="report_type" value="5">招聘</label>
                    <label><input type="radio" class="report_type" id="report_call" name="report_type" value="6">骂人</label>
                    <br>
                    <label><input type="radio" class="report_type" id="report_other" name="report_type" value="7">其他</label>
                    <input type="text" name="report_other_content" id="report_other_content" maxlength="30" style="display: none;">
                </td>
            </tr>
            <tr id="panel_originalurl" style="display: none;">
                <th>原文地址：</th>
                <td>
                    <input id="originalurl" value="http://" name="originalurl" type="text" style="width: 90%;">
                </td>
            </tr>
            <tr>
                <th id="sp_reason">原因补充：</th>
                <td>
                    <textarea id="report_description" style="width: 300px;" rows="3" name="report_description"></textarea>
                    <p id="sp_n" style="color:#999;margin:0px;padding:0px;">(最多只允许输入30个字)</p>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input id="btnSubmitReport" name="submit" type="image" align="middle" class="btn_1" src="http://static.blog.csdn.net/images/btn_submit.jpg">
                    <span style="padding-left:20px;"></span>
                    <img id="btnCloseReportDialog" src="http://static.blog.csdn.net/images/btn_cancel.jpg" align="middle">
                    <div id="error" style="color: Red">
                    </div>
                </td>
            </tr>
            </tbody></table>
    </form>
</div>
    <script language="javascript" type="text/javascript">
        var isComment=0;
        //显示隐藏地址
        $(function () {
            if(isComment){
                $("#report_description").attr("disabled",true);
                $("#sp_n").hide();
                $("#sp_reason").html("评论内容：");
            }
            $(".report_type").click(function () {
                $("#panel_originalurl,#report_other_content").hide();
                switch ($(this).val()) {
                    case '3':
                        $("#panel_originalurl").show();
                        $("#originalurl").focus();
                        break;
                    case '7':
                        if(isComment){
                            $("#report_other_content").show().focus();
                        }
                        break;
                }

            });

            $("#frmReport").submit(function () {
                if (!currentUserName) {

                    if (confirm("您的操作必须登录，是否登录？")) {
                        location.href = "http://passport.csdn.net/account/login?from=" + encodeURIComponent(location.href);
                        return false;
                    }
                    return false;
                }

                var reportType = $("input[name=report_type]:checked").val();
                if(!reportType){
                    alert("请选择举报原因！");
                    return false;
                }
                var otherInfo = "";
                switch (reportType) {
                    case '3':
                        otherInfo = $("#originalurl").val();
                        if (otherInfo == ""||otherInfo=="http://") {
                            alert("举报抄袭必须提供原创文章地址！");
                            $("#originalurl").focus();
                            return false;
                        } else if(!checkeURL(otherInfo)) {
                            alert("请输入正确的原创文章地址！");
                            $("#originalurl").focus();
                            return false;
                        }
                        break;
                    case '7':
                        otherInfo = $("#report_other_content").val();
                        if (isComment && !otherInfo) {
                            alert("请填写举报的具体原因！");
                            $("#report_other_content").focus();
                            return false;
                        }
                        if(!isComment){
                            if(!$("#report_description").val()){
                                alert("请填写举报的具体原因！");
                                $("#report_description").focus();
                                return false;
                            }
                        }
                        break;
                }
                if(!isComment){
                    if($("#report_description").val().length>30){
                        alert("举报原因最多只允许输入30个字！");
                        return false;
                    }
                }
                nowTime = {
                  year: new Date().getFullYear(),
                  month: parseInt(new Date().getMonth())+1,
                  day: new Date().getDate(),
                  hours: parseInt(new Date().getHours()),
                  minutes: parseInt(new Date().getMinutes()),
                  seconds: parseInt(new Date().getSeconds())
                }
                var data = {
                    articleId: fileName,
                    commentId: 0,
                    reportType: reportType,
                    originalurl: $("#originalurl").val(),
                    report_other_content: $("#report_other_content").val(),
                    report_description: $("#report_description").val(),
                    currentUserName: currentUserName,
                    updatetime: nowTime.year+'/'+nowTime.month+'/'+nowTime.day+' '+ nowTime.hours+':'+nowTime.minutes+':'+seconds,
                    blogUser: username
                };
                if(!isComment){//如果是举报文章
                    data.report_other_content = data.report_description;
                    // data.report_description = "1. 神经网络这是一个常见的神经网络的图：这是一个常见的三层神经网络的基本构成，Layer L1是输入层，Layer L2是隐含层";
                }

                $.post(blog_address + "/common/report?id="+fileName+"&t=2", data, function (data) {
                    if (data.result == 1){
                        SetError("感谢您的举报，我们会尽快审核！");
                    }else{
                        if (data.content) alert(data.content);
                    }

                });
                return false;
            });

            $("#btnCloseReportDialog").click(function () {
                CloseDiv();
            });

        });

        //提示后关闭方法
        function SetError(error) {
            $("#btnCloseReportDialog").trigger("click");
            alert(error);
            CloseDiv();
        }

        //关闭方法
        function CloseDiv() {

            $.removeMask();
            $("#report_dialog").hide();
            return false;
        }

        //验证url
        function checkeURL(url){
            return /^http(s)?:\/\/([\w-]+\.)+[\w-]+/i.test(url);
        }

    </script>
</div>

<script src="http://c.csdnimg.cn/public/common/libs/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/public/res/bower-libs/MathJax/MathJax.js?config=TeX-AMS_HTML"></script>
<script type="text/javascript" src="http://passport.csdn.net/content/loginbox/login.js"></script>

<script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/js/blog_ver.js?v=2017.042"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/js/skin2017.js?v=2017.042"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/scripts/cnick.js"></script>
<script>window._bd_share_config = { "common": { "bdSnsKey": {}, "bdText": "", "bdMini": "1", "bdMiniList": false, "bdPic": "", "bdStyle": "0", "bdSize": "16" }, "share": {} }; with (document) 0[(getElementsByTagName('head')[0] || body).appendChild(createElement('script')).src = 'http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion=' + ~(-new Date() / 36e5)];</script>
<script type="text/javascript" >
    if($(".article_collect li").length==1){$(".article_collect").hide();}
    if($(".article_tags li").length==1){$(".article_tags").hide();}
    $(".edit a").attr("href","http://write.blog.csdn.net/postedit/"+fileName);
    $.each($(".edu_li a"),function(){$(this).attr("href",$(this).attr("href").replace("blog7","blog9"))});
    new CNick('#uid').showNickname();
if($("#fan").html()=="")
{
$("#fan").html(0);	
}

	var blogCustomType ='{customtype}';
                
        $("#custom"+blogCustomType).show();
</script>
</body>

<script  type="text/javascript">
    var fromjs=$("#fromjs");
    if(fromjs.length>0)
    {                  
        $("#fromjs .markdown_views pre").addClass("prettyprint");       
        prettyPrint();

        $('pre.prettyprint code').each(function () {
            var lines = $(this).text().split('\n').length;
            var $numbering = $('<ul/>').addClass('pre-numbering').hide();
            $(this).addClass('has-numbering').parent().append($numbering);
            for (i = 1; i <= lines; i++) {
                $numbering.append($('<li/>').text(i));
            };
            $numbering.fadeIn(1700);
        });

        $('.pre-numbering li').css("color","#999");             
    }

    $(function(){
        setTimeout(function(){
            $(".math").each(function(index,value){$(this).find("span").last().css("color","#fff"); })
        },500);         
       

    });

    setTimeout(function () {
        $(".toc a[target='_blank']").attr("target", "");
    }, 500);

</script>
</html>



<!DOCTYPE html>
<html>
<head>
            <link rel="canonical" href="http://blog.csdn.net/js1568/article/details/78042431"/> 

    <script type="text/javascript">
        var username = "js1568";var _blogger = username;var blog_address = "http://blog.csdn.net/js1568";var static_host = "http://static.blog.csdn.net";
        var currentUserName = "js1568"; var fileName = '78042431';var commentscount = 0; var islock = false
        window.quickReplyflag = true;
        var totalFloor=0;
                
                 var isBole = false;
                
                
                 var isDigg = false;
                
          
             var isExpert=false;
        
          
        var isAdm=false;
        

    </script>

<meta http-equiv="content-type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <script src="http://c.csdnimg.cn/public/common/libs/jquery/jquery-1.9.1.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/common/libs/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/static/css/avatar.css">
    <link type="text/css" rel="stylesheet" href="http://static.blog.csdn.net/scripts/SyntaxHighlighter/styles/default.css" />
    <link rel="stylesheet" href="http://static.blog.csdn.net/Skin/skin3-template/css/style.css?v=2017.042">
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/common/toolbar/content_toolbar_css/content_toolbar.css?v5.00.37">
              <!-- adhoc sdk -->
		<script src=https://sdk.appadhoc.com/ab.plus.js></script>
		<script>
		adhoc('init', {
		  appKey: 'ADHOC_0e0bce4f-8793-4f68-89cf-34c14f2532bb',
		  defaultFlags: {isLogin: true}
		})
		</script>
              <!-- adhoc sdk end -->
    
	<script src="//static.blog.csdn.net/public/switchHome/switchHome.js?v=2017.43"></script>	
	
    <script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/fonts/iconfont.js"></script>
    <script src="//csdnimg.cn/rabbit/exposure-click/main.js?v1.15.23"></script>
    <script type="text/javascript" src="http://c.csdnimg.cn/pubfooter/js/tracking_for_recommend.js?v=0911" charset="utf-8"></script>
    <script type="text/javascript" src="http://csdnimg.cn/pubfooter/js/tracking.js" charset="utf-8"></script>
    <script type="text/javascript" src="http://static.blog.csdn.net/scripts/cnick.js" charset="utf-8"></script>
 
    <link rel="stylesheet" href="http://static.blog.csdn.net/code/prettify.css" />
    <script type="text/javascript" src="http://static.blog.csdn.net/code/prettify.js"></script>
<script src="http://dup.baidustatic.com/js/ds.js"></script>
    <script type="text/javascript">

        // Traffic Stats of the entire Web site By baidu
        var _hmt = _hmt || [];
        (function() {
            var hm = document.createElement("script");
            hm.src = "https://hm.baidu.com/hm.js?6bcd52f51e9b3dce32bec4a3997715ac";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
        // Traffic Stats of the entire Web site By baidu end



    </script>
    <meta name="description" content="线性代数中的范数" />
    <meta name="keywords" content="机器学习,线性代数" />
    <meta http-equiv="Cache-Control" content="no-siteapp" /><link rel="alternate" media="handheld" href="#" />
    <meta name="shenma-site-verification" content="5a59773ab8077d4a62bf469ab966a63b_1497598848">


    <title>线性代数中的范数 - CSDN博客</title>
</head>
<body>
<script id="toolbar-tpl-scriptId" prod="download" skin="black" src="http://c.csdnimg.cn/public/common/toolbar/js/content_toolbar.js?v5.00.37" type="text/javascript" domain="http://blog.csdn.net"></script>

<div class="container clearfix">
    <main>
        <article>
            <h1 class="csdn_top">线性代数中的范数</h1>
            <div class="article_bar clearfix">
                <div class="artical_tag">
                    <span class="original">转载</span>
                    <span class="time">2017年09月20日 16:31:53</span>
                </div>
				<ul class="article_tags clearfix csdn-tracking-statistics" data-mod="popu_377">
					<li class="tit">标签：</li>
					
					<li><a href="http://so.csdn.net/so/search/s.do?q=机器学习&t=blog" target="_blank">机器学习</a> <span>/</span></li>
					
					<li><a href="http://so.csdn.net/so/search/s.do?q=线性代数&t=blog" target="_blank">线性代数</a> <span>/</span></li>
					
				</ul>
                <ul class="right_bar">
                    <li><button class="btn-noborder"><i class="icon iconfont icon-read"></i><span class="txt">381</span></button></li>
                    <!--<li><button class="btn-noborder"><i class="icon iconfont icon-dashang-"></i><span class="txt">0</span></button></li>-->

                    <li class="edit">
                        <a class="btn-noborder" href="" >
                            <i class="icon iconfont icon-bianji"></i><span class="txt">编辑</span>
                        </a>
                    </li>
                    <li class="del">
                        <a class="btn-noborder" onclick="javascript:deleteArticle(fileName);return false;">
                            <i class="icon iconfont icon-shanchu"></i><span class="txt">删除</span>
                        </a>
                    </li>
                </ul>
            </div>
            <div id="article_content" class="article_content csdn-tracking-statistics" data-mod="popu_519" data-dsm="post">
                <div class="markdown_views"><p>向量范数</p>

<ul>
<li>0-范数：向量中非零元素个数</li>
<li>1-范数： <img src="https://www.zhihu.com/equation?tex=%7C%7Cx%7C%7C_1%20=%20%5Csum_%7Bi=1%7D%5EN%7Cx_i%7C" alt="" title="">，即向量元素绝对值之和，matlab调用函数norm(x, 1) 。</li>
<li>2-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_2%20=%5Csqrt%7B%5Csum_%7Bi=1%7D%5ENx_i%5E2%7D" alt="" title="">，Euclid范数（欧几里得范数，常用计算向量长度），即向量元素绝对值的平方和再开方，matlab调用函数norm(x, 2)。</li>
<li><img src="https://www.zhihu.com/equation?tex=%5Cinfty" alt="" title=""> -范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_%5Cinfty%20=%20%5Cmax_%7Bi%7D%7Cx_i%7C" alt="" title="">，即所有向量元素绝对值中的最大值，matlab调用函数norm(x, inf)。</li>
<li><img src="https://www.zhihu.com/equation?tex=-%5Cinfty" alt="" title="">-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_%7B-%5Cinfty%7D=%5Cmin_i%7Cx_i%7C" alt="" title="">，即所有向量元素绝对值中的最小值，matlab调用函数norm(x, -inf)。</li>
<li>p-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_p%20=%20%28%5Csum_%7Bi=1%7D%5EN%7Cx_i%7C%5Ep%29%5E%7B%5Cfrac%7B1%7D%7Bp%7D%7D" alt="" title="">，即向量元素绝对值的p次方和的1/p次幂，matlab调用函数norm(x, p)。</li>
</ul>

<p>矩阵范数</p>

<ul>
<li>1-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_1%20=%20%5Cmax_j%5Csum_%7Bi=1%7D%5Em%7Ca_%7Bi,j%7D%7C" alt="" title="">， 列和范数，即所有矩阵列向量绝对值之和的最大值，matlab调用函数norm(A, 1)。</li>
<li>2-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_2%20=%20%5Csqrt%7B%5Clambda_1%7D" alt="" title="">，<img src="https://www.zhihu.com/equation?tex=%5Clambda%3Cbr/%3E" alt="" title="">为的最大特征值。，谱范数，即A’A矩阵的最大特征值的开平方。matlab调用函数norm(x, 2)。</li>
<li><img src="https://www.zhihu.com/equation?tex=%5Cinfty" alt="" title="">-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_%5Cinfty%20=%20%5Cmax_i%5Csum_%7Bj=1%7D%5EN%7Ca_%7Bi,j%7D%7C" alt="" title="">，行和范数，即所有矩阵行向量绝对值之和的最大值，matlab调用函数norm(A, inf)。</li>
<li>F-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_F=%5Cleft%28%5Csum_%7Bi=1%7D%5Em%5Csum_%7Bj=1%7D%5En%7Ca_%7Bi,j%7D%7C%5E2%5Cright%29%5E%7B%5Cfrac%7B1%7D%7B2%7D%7D" alt="" title="">，Frobenius范数，即矩阵元素绝对值的平方和再开平方，matlab调用函数norm(A, ’fro‘)。</li>
<li>核范数：是A的奇异值。即奇异值之和</li>
</ul>

<p>作者：魏通 <br>
链接：<a href="https://www.zhihu.com/question/20473040/answer/102907063" target="_blank">https://www.zhihu.com/question/20473040/answer/102907063</a> <br>
来源：知乎 <br>
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。</p><link rel="stylesheet" href="http://static.blog.csdn.net/public/res-min/markdown_views.css?v=2.0" /></div><link rel="stylesheet" href="http://static.blog.csdn.net/public/res-min/markdown_views.css?v=2.0" />
            </div>
        </article>
        <div class="readall_box csdn-tracking-statistics" data-mod="popu_376">
			<div class="read_more_mask"></div>
            <a class="btn btn-large btn-gray-fred read_more_btn" target="_self">阅读全文</a>
        </div>
        <div class="article_copyright">
            
        </div>
        <!--  <div class="reward_box">
            <div class="tit">
              <button class="btn_reward"><i class="icon iconfont icon-dashang-"></i></button>
            </div>
            <dl class="clearfix">
              <dt><a href="#" target="_blank">近期打赏</a></dt>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
            </dl>
          </div>-->

        <ul class="article_collect clearfix csdn-tracking-statistics"  data-mod="popu_378">
            <li class="tit">本文已收录于以下专栏：</li>
            
        </ul>
        <div class="comment_box clearfix">
            <div id="comment_form">
                <div id="commentsbmitarear">
                    <!-- <h6><span>0</span>条评论</h6> -->
           <!--          <dl class="clearfix" id="commentbox">
                        <dt>
                            <a href="http://my.csdn.net/js1568"><img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg" ></a>
                        </dt>
                        <dd>
                            <a href="http://my.csdn.net/js1568" target="_blank">js1568</a>
                        </dd>
                        <dd class="txt_tip"><span id="tip_comment" class="tip"></span></dd>
                    </dl> -->
                    <div class="comment_area clearfix">
						<div class="userimg"><a href="http://my.csdn.net/js1568"><img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg"></a></div>
                        <form action="/js1568/comment/submit?id=78042431" method="post" onsubmit="return subform(this);" id="commentform">
                            <textarea class="comment_content" name="comment_content" id="comment_content" placeholder="发表你的评论"></textarea>
                            <div class="bot_bar clearfix">
                                <div id="ubbtools" class="add_code">
                                    <a href="#insertcode" code="code" target="_self"><i class="icon iconfont icon-daima"></i></a>
                                </div>

                                <input type="hidden" id="comment_replyId" name="comment_replyId">
                                <input type="hidden" id="comment_userId" name="comment_userId" value="">
                                <input type="hidden" id="commentId" name="commentId" value="">
                                <input type="submit" class="btn btn-redborder" value="发表评论">
								<span id="tip_comment" class="tip">
                                <div style="display: none;" class="csdn-tracking-statistics" data-mod="popu_384"><a href="#" target="_blank" class="comment_area_btn">发表评论</a></div>

                                <div id="lang_list" code="code">
                                    <a href="#html" style="width:95px;" class="long_name" target="_self">HTML/XML</a>
                                    <a href="#objc" style="width:95px;" class="long_name" target="_self">objective-c</a>
                                    <a href="#delphi" style="width:58px;" class="zhong_name" target="_self">Delphi</a>
                                    <a href="#ruby" class="zhong_name" target="_self">Ruby</a>
                                    <a href="#php" target="_self">PHP</a>
                                    <a href="#csharp" class="duan_name" target="_self">C#</a>
                                    <a style=" border-right: none;" href="#cpp" class="duan_name" target="_self">C++</a>
                                    <a style=" border-bottom:none;width:95px;" href="#javascript" class="long_name" target="_self">JavaScript</a>
                                    <a style=" border-bottom:none;width:95px;" href="#vb" class="long_name" target="_self">Visual Basic</a>
                                    <a style=" border-bottom:none;" href="#python" class="zhong_name" target="_self">Python</a>
                                    <a style=" border-bottom:none;" href="#java" class="zhong_name" target="_self">Java</a>
                                    <a style="border-bottom:none;" href="#css" class="duan_name" target="_self">CSS</a>
                                    <a style="border-bottom:none;" href="#sql" class="duan_name" target="_self">SQL</a>
                                    <a style="border:none; " href="#plain" class="duan_name" target="_self">其它</a>
                                    <span class="arrb"></span>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <div class="comment_li_outbox">
            <div id="comment_list"></div>
        </div>

        <div class="more_comment">
            <div id="comment_bar" class="trackgin-ad" data-mod="popu_385"></div>
        </div>

        <h3 class="recommend_tit">相关文章推荐</h3>
        <div class="recommend_list clearfix">
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/wylfll/article/details/47950593"  target="_blank" strategy="BlogCommendFromCF_0">在jsp中如何实现网页的自动更新</a></h2>
                    <div class="summary">
                        在jsp中如何实现网页的自动更新
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/wylfll" target="_blank" strategy="BlogCommendFromCF_0"><img src="http://avatar.csdn.net/E/4/0/2_wylfll.jpg" alt="wylfll" title="wylfll"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/wylfll">wylfll</a></li>
                        <li class="time">2015-08-24 14:27</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>410</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/js1568/article/details/73434001"  target="_blank" strategy="BlogCommendFromCF_1">最小生成树-Prim算法和Kruskal算法</a></h2>
                    <div class="summary">
                        最小生成树-Prim算法和Kruskal算法
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/js1568" target="_blank" strategy="BlogCommendFromCF_1"><img src="http://avatar.csdn.net/B/A/D/2_js1568.jpg" alt="js1568" title="js1568"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/js1568">js1568</a></li>
                        <li class="time">2017-06-18 17:19</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>88</span></li>
                    </ul>
                </dd>
            </dl>
            
            <!--dl class="clearfix csdn-tracking-statistics" data-mod="popu_393">
                <dt><a href="http://edu.csdn.net/huiyiCourse/series_detail/64?utm_source=blog10" target="_blank"><img class="maxwidth" src="http://img.blog.csdn.net/20170928113144608" alt="" title=""></a></dt>
                <dd>
                    <div class="summary">
                        <h2><a href='http://edu.csdn.net/topic/python1?utm_source=blog10' target='_blank'>伤心啊！年度热门编程语言排行榜出来了...</a></h2>  <div class="summary">近期，IEEE Spectrum 发布了第四届顶级编程语言交互排行榜。结合 10 个线上数据源的 12 个标准，对 48 种语言进行了排行！此外，七牛云许式伟曾说过Go语言会取代Java...气氛... </div> 
                    </div>
                </dd>
            </dl-->
	<script>
		(function() {
		    var s = "_" + Math.random().toString(36).slice(2);
		    document.write('<div id="' + s + '"></div>');
		    (window.slotbydup=window.slotbydup || []).push({
			id: '4765209',
			container: s,
			size: '808,120',
			display: 'inlay-fix'
		    });
		})();
	</script>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/myarrow/article/details/51188553"  target="_blank" strategy="BlogCommendFromCsdn_2">线性代数常用基本知识 (含向量和矩阵范数&lt;Matrix or vector norm&gt;)</a></h2>
                    <div class="summary">
                        1. 行列式
1.1 二阶行列式




1.2 三阶行列式
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/MyArrow" target="_blank" strategy="BlogCommendFromCsdn_2"><img src="http://avatar.csdn.net/C/1/6/2_myarrow.jpg" alt="MyArrow" title="MyArrow"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/MyArrow">MyArrow</a></li>
                        <li class="time">2016-04-19 11:07</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>8551</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/mathmetics/article/details/9279367"  target="_blank" strategy="BlogCommendFromCsdn_3">线性代数(七) : 子空间的基与维数</a></h2>
                    <div class="summary">
                        子空间的基与维数
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/xxingjjing" target="_blank" strategy="BlogCommendFromCsdn_3"><img src="http://avatar.csdn.net/5/D/7/2_xxingjjing.jpg" alt="xxingjjing" title="xxingjjing"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/xxingjjing">xxingjjing</a></li>
                        <li class="time">2013-07-11 10:29</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>2984</span></li>
                    </ul>
                </dd>
            </dl>
            <!-- 广告位：PC端-博客详情通栏7（feed流）-808*120 --><script> (function() {    var s = "_" + Math.random().toString(36).slice(2);   document.write('<div id="' + s + '"></div>');    (window.slotbydup=window.slotbydup || []).push({        id: '4983339',       container: s,        size: '808,120',        display: 'inlay-fix'    }); })();  </script>
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/qq_28306361/article/details/50800972"  target="_blank" strategy="BlogCommendFromCsdn_4">线性代数复习四——矩阵的维数和秩</a></h2>
                    <div class="summary">
                        复习
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/qq_28306361" target="_blank" strategy="BlogCommendFromCsdn_4"><img src="http://avatar.csdn.net/8/6/2/2_qq_28306361.jpg" alt="qq_28306361" title="qq_28306361"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/qq_28306361">qq_28306361</a></li>
                        <li class="time">2016-03-04 10:57</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>1835</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics downloadElement" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
               	<dt><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank" strategy="BlogCommendFromCsdn_5"><img class="maxwidth" src="http://download.csdn.net/images/minetype/rar.svg" alt="" title=""></a></dt>
		<dd>
			<div class="summary">
				<h2><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank" strategy="BlogCommendFromCsdn_5">高校教学资源，高数，线性代数等</a></h2>
				<div class="summary">
				  <ul>
					  <li class="time">2011-04-02 21:01</li>
					  <li class="visited_num fileSize">3.32MB</li>
					  <li class="download_btn"><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank">下载</a></li>
				  </ul>
				</div> 
			</div>
		</dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics downloadElement" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
               	<dt><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank" strategy="BlogCommendFromCsdn_6"><img class="maxwidth" src="http://download.csdn.net/images/minetype/rar.svg" alt="" title=""></a></dt>
		<dd>
			<div class="summary">
				<h2><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank" strategy="BlogCommendFromCsdn_6">考研数学公式（线性代数+概率论+高数）合集</a></h2>
				<div class="summary">
				  <ul>
					  <li class="time">2010-03-02 20:44</li>
					  <li class="visited_num fileSize">815KB</li>
					  <li class="download_btn"><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank">下载</a></li>
				  </ul>
				</div> 
			</div>
		</dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/suqier1314520/article/details/12584479"  target="_blank" strategy="BlogCommendFromCsdn_7">线性代数导论9——线性相关性、基、维数</a></h2>
                    <div class="summary">
                        本文是Gilbert Strang的线性代数导论课程笔记。课程地址：http://v.163.com/special/opencourse/daishu.html&#160;&#160;
第九课时：线性相关性、基、维数...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/suqier1314520" target="_blank" strategy="BlogCommendFromCsdn_7"><img src="http://avatar.csdn.net/5/6/9/2_suqier1314520.jpg" alt="suqier1314520" title="suqier1314520"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/suqier1314520">suqier1314520</a></li>
                        <li class="time">2013-10-10 19:28</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>4187</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/tengweitw/article/details/40921209"  target="_blank" strategy="BlogCommendFromCsdn_8">【线性代数】线性相关性、基和维数</a></h2>
                    <div class="summary">
                        一、线性相关性

&#160; &#160; &#160; 什么情况下，向量X1，X2，……，Xn是线性无关的？


&#160; &#160;&#160;&#160; 答：当向量X1，X2，……，Xn的线性组合(线性组合时系数不能全为0)不为零向量时，它们是线性无关的...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/tengweitw" target="_blank" strategy="BlogCommendFromCsdn_8"><img src="http://avatar.csdn.net/B/E/9/2_tengweitw.jpg" alt="tengweitw" title="tengweitw"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/tengweitw">tengweitw</a></li>
                        <li class="time">2014-11-09 14:29</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>1551</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/u010182633/article/details/52331744"  target="_blank" strategy="BlogCommendFromCsdn_9">漫步线性代数十——线性无关，基和维数</a></h2>
                    <div class="summary">
                        m,nm,n没有给出线性系统实际大小的真实信息，在我们上文的例子中有三行和四列，但是第三行仅仅是前两行的组合，在消元后得到了零行，它对奇次问题Ax=0Ax=0 没有影响。第四列同样是相关的，列空间减到...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/u010182633" target="_blank" strategy="BlogCommendFromCsdn_9"><img src="http://avatar.csdn.net/2/2/4/2_u010182633.jpg" alt="u010182633" title="u010182633"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/u010182633">u010182633</a></li>
                        <li class="time">2016-08-26 21:16</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>974</span></li>
                    </ul>
                </dd>
            </dl>
            

	   

            

            
        </div>
    </main>
    <aside>
        <div class="right_box user_info">
            <dl class="inf_bar clearfix">
                <dt class="csdn-tracking-statistics" data-mod="popu_381">
                    <a href="http://blog.csdn.net/js1568" target="_blank">
                        <img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg" class="avatar_pic">
                    </a>
                    <span class="medals" title="">
                <svg class="icon" aria-hidden="true">
                    
                </svg>
              </span>
                </dt>
                <dd>
                    <h3 class="csdn-tracking-statistics"  data-mod="popu_380"><a href="http://blog.csdn.net/js1568" target="_blank" id="uid">js1568</a></h3>
                    <span  class="csdn-tracking-statistics" data-mod="popu_379"><a class="btn btn-redborder-small "  id="span_add_follow" target="_self">＋关注</a></span>
                </dd>
            </dl>
            <div class="inf_number_box clearfix">
                <dl>
                    <dt>原创</dt>
                    <dd>15</dd>
                </dl>
                <dl>
                    <dt>粉丝</dt>
                    <dd id='fan'>3</dd>
                </dl>
                <dl>
                    <dt>喜欢</dt>
                    <dd>0</dd>
                </dl>
								 <dl>
              <dt>码云</dt>
              <dd>&nbsp;</dd>
            </dl>

            </div>
	    <div class="writings">
              <div class="public_signal clearfix">
                <h3>他的最新文章</h3>
                <a href="http://blog.csdn.net/js1568" target="_blank" class="more_z"><span>更多文章</span></a>
              </div>
                <ul class="inf_list clearfix csdn-tracking-statistics" data-mod="popu_382">
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429272" target="_blank">统计学习方法 7-支持向量机</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429192" target="_blank">统计学习方法 6-逻辑斯谛回归与最大熵模型</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429164" target="_blank">统计学习方法 5-决策树</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429150" target="_blank">统计学习方法 4-朴素贝叶斯法</a>
                    </li>
                    
                </ul>
            </div>
        </div>
        <div class="extension_other csdn-tracking-statistics" data-mod="popu_389">
						<!--u3032528-->
			<div class="flashrecommend">

<!-- 请置于所有广告位代码之前 -->
<script src="http://dup.baidustatic.com/js/dm.js"></script>
           
<!-- 广告位：PC端-博客详情页右侧视窗1（feed流）-300*250 -->
<script>
(function() {
    var s = "_" + Math.random().toString(36).slice(2);
    document.write('<div id="' + s + '"></div>');
    (window.slotbydup=window.slotbydup || []).push({
        id: '4770930',
        container: s,
        size: '300,250',
        display: 'inlay-fix'
    });
})();
</script>

		    </div>
        </div>

        
        <div class="fixRight">
            <div class="right_box padb0 csdn-tracking-statistics" data-mod="popu_391">
                <h3 class="tit"><span><em>在线课程</em></span></h3>
                <ul class="edu_li clearfix">
                  
                  <li>
                    <div>
                      <a href="http://edu.csdn.net/huiyiCourse/detail/603?utm_source=blog7" target="_blank">
                        <img src="http://img.bss.csdn.net/201711101450316277.png" alt="MVVM在美团点评酒旅移动端的最佳实践" title="MVVM在美团点评酒旅移动端的最佳实践">
                      </a>
                    </div>
                    <div>
                      <p><a href="http://edu.csdn.net/huiyiCourse/detail/603?utm_source=blog7" target="_blank">MVVM在美团点评酒旅移动端的最佳实践</a></p>
                      <p>讲师：王禹华</p>
                    </div>
                  </li>
                  
                  <li>
                    <div>
                      <a href="http://edu.csdn.net/huiyiCourse/detail/594?utm_source=blog7" target="_blank">
                        <img src="http://img.bss.csdn.net/201711101448389242.png" alt="C语言大型软件设计的面向对象" title="C语言大型软件设计的面向对象">
                      </a>
                    </div>
                    <div>
                      <p><a href="http://edu.csdn.net/huiyiCourse/detail/594?utm_source=blog7" target="_blank">C语言大型软件设计的面向对象</a></p>
                      <p>讲师：宋宝华</p>
                    </div>
                  </li>
                  
                </ul>
            </div>
			<!--u3032529-->
            <!-- <div class="extension_other csdn-tracking-statistics baidu_box" data-mod="popu_395">
								
                <script type="text/javascript" src="http://mpb1.iteye.com/cxpdpmumfaedgm.js"></script>
            </div> -->
			<div class="extension_other csdn-tracking-statistics bottomRcom" data-mod="popu_389" style="position:absolute;z-index:-5;opacity:0;pointer-events:none">
						<!--u3032528-->
				<div class="flashrecommend">
				<script type="text/javascript" src="http://mpb1.iteye.com/bwocoltlyzdec.js"></script>
				</div>
			</div>
        </div>
		<div class="user-hotArticle">
          <h3>热门文章</h3>
          <ul class="hotArticle-list csdn-tracking-statistics" data-mod="popu_521">
 
            <li>
              <a href="/js1568/article/details/78042431">线性代数中的范数</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>377</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/73385734">八大（基于比较）排序算法</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>371</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/66476086">先序，中序，后序线索化二叉树</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>313</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/64905555">机器学习（周志华 ）-2模型评估与选择</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>313</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/68066618">字符串匹配的KMP算法</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>309</span></div>
            </li>
 
          </ul>
        </div>


    </aside>
</div>

<div class="left_fixed">
      <div class="left_show_button">
        <span>
          <i class="icon iconfont icon-youjiantou"></i>
        </span>
      </div>
    <ul class="left_menu">

        <li>
            <button class="left-fixed-btn btn-like csdn-tracking-statistics" data-mod="popu_373" target="_self">
                <span class="iconbox border_red"><i class="icon iconfont icon-dianzan"></i></span>
				<span class="txt">0</span>
            </button>
        </li>
		<li id="blog_artical_directory">
            <button class="left-fixed-btn left_menu_btn csdn-tracking-statistics" data-mod="popu_372" target="_self">
                <span class="iconbox border_black"><i class="icon iconfont icon-mulu"></i></span>
            </button>
        </li>
        <li class="menu_con">
            <div class="list_father">
                <div class="arr_box">
                    <button class="btn-noborder arr-btn scroll-down  left_scroll_down"><i class="icon iconfont icon-xiajiantou"></i></button>
                    <button class="btn-noborder arr-btn scroll-up left_scroll_top"><i class="icon iconfont icon-shangjiantou"></i></button>
                </div>
                <div class="arr"></div>
                <div id="csdnBlogDir"></div>
            </div>
        </li>
        <li>
            <button class="left-fixed-btn csdn-tracking-statistics" data-mod="popu_374"  id="com-quick-collect" target="_self">
                <span class="iconbox border_purple"><i class="icon iconfont icon-shoucang"></i></span>
    
            </button>
        </li>
		<li>
          <button class="left-fixed-btn btn-pinglun" >
            <span class="iconbox border_purple"><i class="icon iconfont icon-pinglun"></i></span>
          </button>
        </li>
        <li id="share_box">
            <button class="left-fixed-btn  csdn-tracking-statistics"  data-mod="popu_375" target="_self">
                <span class="iconbox border_orange"><i class="icon iconfont icon-fenxiang"></i></span>
            </button>
            <div class="bdsharebuttonbox csdn-tracking-statistics" data-mod="popu_172">
                <div class="outside">
                    <span class="iconbox border_red2"><i class="icon iconfont icon-xinlang"></i></span>
                    <a href="#" class="bds_tsina" data-cmd="tsina" title="分享到新浪微博"> </a>
                </div>
                <div class="outside">
                    <span class="iconbox border_green"><i class="icon iconfont icon-weixin"></i></span>
                    <a href="#" class="bds_weixin" data-cmd="weixin" title="分享到微信"> </a>
                </div>
                <div class="outside">
                    <span class="iconbox border_blue"><i class="icon iconfont icon-QQ"></i></span>
                    <a href="#" class="bds_qzone" data-cmd="qzone" title="分享到QQ空间"> </a>
                </div>
            </div>
        </li>
    </ul>
</div>
<div class="right_fixed">
  <div class="r_ico">
	<i class="icon iconfont icon-jubao"></i>
	<span class="txt" id="reportBtn">内容举报</span>
  </div>
  <div class="returnTop">
   <i class="icon iconfont icon-fanhuidingbu"></i>
   <span>返回顶部</span>
 </div>
</div>
<div id="pop_win"></div>
<div id="popup_mask"></div>
<div class="pop_CA_cover" ></div>
<div class="pop pop_CA" >
    <div class="CA_header">
        收藏助手
        <span class="cancel_icon"  id="fapancle" ></span>
    </div>
    <iframe src="" id="collectIframe" frameborder="0" width="100%" height="360"  scrolling="no" ></iframe>
</div>
<!--举报-->
<div id="report_dialog" style="top: 250px; left: 343.5px;"><div id="panel_report">
    <div class="panel_head">不良信息举报</div>
    <form method="post" id="frmReport" class="panel_body">
        <table border="0" cellpadding="0" cellspacing="4" class="pop_table">
            <tbody><tr><td colspan="2">您举报文章：<a href="http://blog.csdn.net/raintungli/article/details/76583070" target="_blank">深度学习：神经网络中的前向传播和反向传播算法推导</a></td></tr>
            <tr>
                <th style="width:60px;">举报原因：</th>
                <td id="panel_reporttype">
                    <label><input type="radio" class="report_type" id="report_sex" name="report_type" value="1">色情</label>
                    <label><input type="radio" class="report_type" id="report_Politics" name="report_type" value="2">政治</label>
                    <label><input type="radio" class="report_type" id="report_copy" name="report_type" value="3">抄袭</label>
                    <label><input type="radio" class="report_type" id="report_ad" name="report_type" value="4">广告</label>
                    <label><input type="radio" class="report_type" id="report_want" name="report_type" value="5">招聘</label>
                    <label><input type="radio" class="report_type" id="report_call" name="report_type" value="6">骂人</label>
                    <br>
                    <label><input type="radio" class="report_type" id="report_other" name="report_type" value="7">其他</label>
                    <input type="text" name="report_other_content" id="report_other_content" maxlength="30" style="display: none;">
                </td>
            </tr>
            <tr id="panel_originalurl" style="display: none;">
                <th>原文地址：</th>
                <td>
                    <input id="originalurl" value="http://" name="originalurl" type="text" style="width: 90%;">
                </td>
            </tr>
            <tr>
                <th id="sp_reason">原因补充：</th>
                <td>
                    <textarea id="report_description" style="width: 300px;" rows="3" name="report_description"></textarea>
                    <p id="sp_n" style="color:#999;margin:0px;padding:0px;">(最多只允许输入30个字)</p>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input id="btnSubmitReport" name="submit" type="image" align="middle" class="btn_1" src="http://static.blog.csdn.net/images/btn_submit.jpg">
                    <span style="padding-left:20px;"></span>
                    <img id="btnCloseReportDialog" src="http://static.blog.csdn.net/images/btn_cancel.jpg" align="middle">
                    <div id="error" style="color: Red">
                    </div>
                </td>
            </tr>
            </tbody></table>
    </form>
</div>
    <script language="javascript" type="text/javascript">
        var isComment=0;
        //显示隐藏地址
        $(function () {
            if(isComment){
                $("#report_description").attr("disabled",true);
                $("#sp_n").hide();
                $("#sp_reason").html("评论内容：");
            }
            $(".report_type").click(function () {
                $("#panel_originalurl,#report_other_content").hide();
                switch ($(this).val()) {
                    case '3':
                        $("#panel_originalurl").show();
                        $("#originalurl").focus();
                        break;
                    case '7':
                        if(isComment){
                            $("#report_other_content").show().focus();
                        }
                        break;
                }

            });

            $("#frmReport").submit(function () {
                if (!currentUserName) {

                    if (confirm("您的操作必须登录，是否登录？")) {
                        location.href = "http://passport.csdn.net/account/login?from=" + encodeURIComponent(location.href);
                        return false;
                    }
                    return false;
                }

                var reportType = $("input[name=report_type]:checked").val();
                if(!reportType){
                    alert("请选择举报原因！");
                    return false;
                }
                var otherInfo = "";
                switch (reportType) {
                    case '3':
                        otherInfo = $("#originalurl").val();
                        if (otherInfo == ""||otherInfo=="http://") {
                            alert("举报抄袭必须提供原创文章地址！");
                            $("#originalurl").focus();
                            return false;
                        } else if(!checkeURL(otherInfo)) {
                            alert("请输入正确的原创文章地址！");
                            $("#originalurl").focus();
                            return false;
                        }
                        break;
                    case '7':
                        otherInfo = $("#report_other_content").val();
                        if (isComment && !otherInfo) {
                            alert("请填写举报的具体原因！");
                            $("#report_other_content").focus();
                            return false;
                        }
                        if(!isComment){
                            if(!$("#report_description").val()){
                                alert("请填写举报的具体原因！");
                                $("#report_description").focus();
                                return false;
                            }
                        }
                        break;
                }
                if(!isComment){
                    if($("#report_description").val().length>30){
                        alert("举报原因最多只允许输入30个字！");
                        return false;
                    }
                }
                nowTime = {
                  year: new Date().getFullYear(),
                  month: parseInt(new Date().getMonth())+1,
                  day: new Date().getDate(),
                  hours: parseInt(new Date().getHours()),
                  minutes: parseInt(new Date().getMinutes()),
                  seconds: parseInt(new Date().getSeconds())
                }
                var data = {
                    articleId: fileName,
                    commentId: 0,
                    reportType: reportType,
                    originalurl: $("#originalurl").val(),
                    report_other_content: $("#report_other_content").val(),
                    report_description: $("#report_description").val(),
                    currentUserName: currentUserName,
                    updatetime: nowTime.year+'/'+nowTime.month+'/'+nowTime.day+' '+ nowTime.hours+':'+nowTime.minutes+':'+seconds,
                    blogUser: username
                };
                if(!isComment){//如果是举报文章
                    data.report_other_content = data.report_description;
                    // data.report_description = "1. 神经网络这是一个常见的神经网络的图：这是一个常见的三层神经网络的基本构成，Layer L1是输入层，Layer L2是隐含层";
                }

                $.post(blog_address + "/common/report?id="+fileName+"&t=2", data, function (data) {
                    if (data.result == 1){
                        SetError("感谢您的举报，我们会尽快审核！");
                    }else{
                        if (data.content) alert(data.content);
                    }

                });
                return false;
            });

            $("#btnCloseReportDialog").click(function () {
                CloseDiv();
            });

        });

        //提示后关闭方法
        function SetError(error) {
            $("#btnCloseReportDialog").trigger("click");
            alert(error);
            CloseDiv();
        }

        //关闭方法
        function CloseDiv() {

            $.removeMask();
            $("#report_dialog").hide();
            return false;
        }

        //验证url
        function checkeURL(url){
            return /^http(s)?:\/\/([\w-]+\.)+[\w-]+/i.test(url);
        }

    </script>
</div>

<script src="http://c.csdnimg.cn/public/common/libs/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/public/res/bower-libs/MathJax/MathJax.js?config=TeX-AMS_HTML"></script>
<script type="text/javascript" src="http://passport.csdn.net/content/loginbox/login.js"></script>

<script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/js/blog_ver.js?v=2017.042"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/js/skin2017.js?v=2017.042"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/scripts/cnick.js"></script>
<script>window._bd_share_config = { "common": { "bdSnsKey": {}, "bdText": "", "bdMini": "1", "bdMiniList": false, "bdPic": "", "bdStyle": "0", "bdSize": "16" }, "share": {} }; with (document) 0[(getElementsByTagName('head')[0] || body).appendChild(createElement('script')).src = 'http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion=' + ~(-new Date() / 36e5)];</script>
<script type="text/javascript" >
    if($(".article_collect li").length==1){$(".article_collect").hide();}
    if($(".article_tags li").length==1){$(".article_tags").hide();}
    $(".edit a").attr("href","http://write.blog.csdn.net/postedit/"+fileName);
    $.each($(".edu_li a"),function(){$(this).attr("href",$(this).attr("href").replace("blog7","blog9"))});
    new CNick('#uid').showNickname();
if($("#fan").html()=="")
{
$("#fan").html(0);	
}

	var blogCustomType ='{customtype}';
                
        $("#custom"+blogCustomType).show();
</script>
</body>

<script  type="text/javascript">
    var fromjs=$("#fromjs");
    if(fromjs.length>0)
    {                  
        $("#fromjs .markdown_views pre").addClass("prettyprint");       
        prettyPrint();

        $('pre.prettyprint code').each(function () {
            var lines = $(this).text().split('\n').length;
            var $numbering = $('<ul/>').addClass('pre-numbering').hide();
            $(this).addClass('has-numbering').parent().append($numbering);
            for (i = 1; i <= lines; i++) {
                $numbering.append($('<li/>').text(i));
            };
            $numbering.fadeIn(1700);
        });

        $('.pre-numbering li').css("color","#999");             
    }

    $(function(){
        setTimeout(function(){
            $(".math").each(function(index,value){$(this).find("span").last().css("color","#fff"); })
        },500);         
       

    });

    setTimeout(function () {
        $(".toc a[target='_blank']").attr("target", "");
    }, 500);

</script>
</html>



<!DOCTYPE html>
<html>
<head>
            <link rel="canonical" href="http://blog.csdn.net/js1568/article/details/78042431"/> 

    <script type="text/javascript">
        var username = "js1568";var _blogger = username;var blog_address = "http://blog.csdn.net/js1568";var static_host = "http://static.blog.csdn.net";
        var currentUserName = "js1568"; var fileName = '78042431';var commentscount = 0; var islock = false
        window.quickReplyflag = true;
        var totalFloor=0;
                
                 var isBole = false;
                
                
                 var isDigg = false;
                
          
             var isExpert=false;
        
          
        var isAdm=false;
        

    </script>

<meta http-equiv="content-type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <script src="http://c.csdnimg.cn/public/common/libs/jquery/jquery-1.9.1.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/common/libs/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/static/css/avatar.css">
    <link type="text/css" rel="stylesheet" href="http://static.blog.csdn.net/scripts/SyntaxHighlighter/styles/default.css" />
    <link rel="stylesheet" href="http://static.blog.csdn.net/Skin/skin3-template/css/style.css?v=2017.042">
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/common/toolbar/content_toolbar_css/content_toolbar.css?v5.00.37">
              <!-- adhoc sdk -->
		<script src=https://sdk.appadhoc.com/ab.plus.js></script>
		<script>
		adhoc('init', {
		  appKey: 'ADHOC_0e0bce4f-8793-4f68-89cf-34c14f2532bb',
		  defaultFlags: {isLogin: true}
		})
		</script>
              <!-- adhoc sdk end -->
    
	<script src="//static.blog.csdn.net/public/switchHome/switchHome.js?v=2017.43"></script>	
	
    <script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/fonts/iconfont.js"></script>
    <script src="//csdnimg.cn/rabbit/exposure-click/main.js?v1.15.23"></script>
    <script type="text/javascript" src="http://c.csdnimg.cn/pubfooter/js/tracking_for_recommend.js?v=0911" charset="utf-8"></script>
    <script type="text/javascript" src="http://csdnimg.cn/pubfooter/js/tracking.js" charset="utf-8"></script>
    <script type="text/javascript" src="http://static.blog.csdn.net/scripts/cnick.js" charset="utf-8"></script>
 
    <link rel="stylesheet" href="http://static.blog.csdn.net/code/prettify.css" />
    <script type="text/javascript" src="http://static.blog.csdn.net/code/prettify.js"></script>
<script src="http://dup.baidustatic.com/js/ds.js"></script>
    <script type="text/javascript">

        // Traffic Stats of the entire Web site By baidu
        var _hmt = _hmt || [];
        (function() {
            var hm = document.createElement("script");
            hm.src = "https://hm.baidu.com/hm.js?6bcd52f51e9b3dce32bec4a3997715ac";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
        // Traffic Stats of the entire Web site By baidu end



    </script>
    <meta name="description" content="线性代数中的范数" />
    <meta name="keywords" content="机器学习,线性代数" />
    <meta http-equiv="Cache-Control" content="no-siteapp" /><link rel="alternate" media="handheld" href="#" />
    <meta name="shenma-site-verification" content="5a59773ab8077d4a62bf469ab966a63b_1497598848">


    <title>线性代数中的范数 - CSDN博客</title>
</head>
<body>
<script id="toolbar-tpl-scriptId" prod="download" skin="black" src="http://c.csdnimg.cn/public/common/toolbar/js/content_toolbar.js?v5.00.37" type="text/javascript" domain="http://blog.csdn.net"></script>

<div class="container clearfix">
    <main>
        <article>
            <h1 class="csdn_top">线性代数中的范数</h1>
            <div class="article_bar clearfix">
                <div class="artical_tag">
                    <span class="original">转载</span>
                    <span class="time">2017年09月20日 16:31:53</span>
                </div>
				<ul class="article_tags clearfix csdn-tracking-statistics" data-mod="popu_377">
					<li class="tit">标签：</li>
					
					<li><a href="http://so.csdn.net/so/search/s.do?q=机器学习&t=blog" target="_blank">机器学习</a> <span>/</span></li>
					
					<li><a href="http://so.csdn.net/so/search/s.do?q=线性代数&t=blog" target="_blank">线性代数</a> <span>/</span></li>
					
				</ul>
                <ul class="right_bar">
                    <li><button class="btn-noborder"><i class="icon iconfont icon-read"></i><span class="txt">381</span></button></li>
                    <!--<li><button class="btn-noborder"><i class="icon iconfont icon-dashang-"></i><span class="txt">0</span></button></li>-->

                    <li class="edit">
                        <a class="btn-noborder" href="" >
                            <i class="icon iconfont icon-bianji"></i><span class="txt">编辑</span>
                        </a>
                    </li>
                    <li class="del">
                        <a class="btn-noborder" onclick="javascript:deleteArticle(fileName);return false;">
                            <i class="icon iconfont icon-shanchu"></i><span class="txt">删除</span>
                        </a>
                    </li>
                </ul>
            </div>
            <div id="article_content" class="article_content csdn-tracking-statistics" data-mod="popu_519" data-dsm="post">
                <div class="markdown_views"><p>向量范数</p>

<ul>
<li>0-范数：向量中非零元素个数</li>
<li>1-范数： <img src="https://www.zhihu.com/equation?tex=%7C%7Cx%7C%7C_1%20=%20%5Csum_%7Bi=1%7D%5EN%7Cx_i%7C" alt="" title="">，即向量元素绝对值之和，matlab调用函数norm(x, 1) 。</li>
<li>2-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_2%20=%5Csqrt%7B%5Csum_%7Bi=1%7D%5ENx_i%5E2%7D" alt="" title="">，Euclid范数（欧几里得范数，常用计算向量长度），即向量元素绝对值的平方和再开方，matlab调用函数norm(x, 2)。</li>
<li><img src="https://www.zhihu.com/equation?tex=%5Cinfty" alt="" title=""> -范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_%5Cinfty%20=%20%5Cmax_%7Bi%7D%7Cx_i%7C" alt="" title="">，即所有向量元素绝对值中的最大值，matlab调用函数norm(x, inf)。</li>
<li><img src="https://www.zhihu.com/equation?tex=-%5Cinfty" alt="" title="">-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_%7B-%5Cinfty%7D=%5Cmin_i%7Cx_i%7C" alt="" title="">，即所有向量元素绝对值中的最小值，matlab调用函数norm(x, -inf)。</li>
<li>p-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_p%20=%20%28%5Csum_%7Bi=1%7D%5EN%7Cx_i%7C%5Ep%29%5E%7B%5Cfrac%7B1%7D%7Bp%7D%7D" alt="" title="">，即向量元素绝对值的p次方和的1/p次幂，matlab调用函数norm(x, p)。</li>
</ul>

<p>矩阵范数</p>

<ul>
<li>1-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_1%20=%20%5Cmax_j%5Csum_%7Bi=1%7D%5Em%7Ca_%7Bi,j%7D%7C" alt="" title="">， 列和范数，即所有矩阵列向量绝对值之和的最大值，matlab调用函数norm(A, 1)。</li>
<li>2-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_2%20=%20%5Csqrt%7B%5Clambda_1%7D" alt="" title="">，<img src="https://www.zhihu.com/equation?tex=%5Clambda%3Cbr/%3E" alt="" title="">为的最大特征值。，谱范数，即A’A矩阵的最大特征值的开平方。matlab调用函数norm(x, 2)。</li>
<li><img src="https://www.zhihu.com/equation?tex=%5Cinfty" alt="" title="">-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_%5Cinfty%20=%20%5Cmax_i%5Csum_%7Bj=1%7D%5EN%7Ca_%7Bi,j%7D%7C" alt="" title="">，行和范数，即所有矩阵行向量绝对值之和的最大值，matlab调用函数norm(A, inf)。</li>
<li>F-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_F=%5Cleft%28%5Csum_%7Bi=1%7D%5Em%5Csum_%7Bj=1%7D%5En%7Ca_%7Bi,j%7D%7C%5E2%5Cright%29%5E%7B%5Cfrac%7B1%7D%7B2%7D%7D" alt="" title="">，Frobenius范数，即矩阵元素绝对值的平方和再开平方，matlab调用函数norm(A, ’fro‘)。</li>
<li>核范数：是A的奇异值。即奇异值之和</li>
</ul>

<p>作者：魏通 <br>
链接：<a href="https://www.zhihu.com/question/20473040/answer/102907063" target="_blank">https://www.zhihu.com/question/20473040/answer/102907063</a> <br>
来源：知乎 <br>
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。</p><link rel="stylesheet" href="http://static.blog.csdn.net/public/res-min/markdown_views.css?v=2.0" /></div><link rel="stylesheet" href="http://static.blog.csdn.net/public/res-min/markdown_views.css?v=2.0" />
            </div>
        </article>
        <div class="readall_box csdn-tracking-statistics" data-mod="popu_376">
			<div class="read_more_mask"></div>
            <a class="btn btn-large btn-gray-fred read_more_btn" target="_self">阅读全文</a>
        </div>
        <div class="article_copyright">
            
        </div>
        <!--  <div class="reward_box">
            <div class="tit">
              <button class="btn_reward"><i class="icon iconfont icon-dashang-"></i></button>
            </div>
            <dl class="clearfix">
              <dt><a href="#" target="_blank">近期打赏</a></dt>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
            </dl>
          </div>-->

        <ul class="article_collect clearfix csdn-tracking-statistics"  data-mod="popu_378">
            <li class="tit">本文已收录于以下专栏：</li>
            
        </ul>
        <div class="comment_box clearfix">
            <div id="comment_form">
                <div id="commentsbmitarear">
                    <!-- <h6><span>0</span>条评论</h6> -->
           <!--          <dl class="clearfix" id="commentbox">
                        <dt>
                            <a href="http://my.csdn.net/js1568"><img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg" ></a>
                        </dt>
                        <dd>
                            <a href="http://my.csdn.net/js1568" target="_blank">js1568</a>
                        </dd>
                        <dd class="txt_tip"><span id="tip_comment" class="tip"></span></dd>
                    </dl> -->
                    <div class="comment_area clearfix">
						<div class="userimg"><a href="http://my.csdn.net/js1568"><img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg"></a></div>
                        <form action="/js1568/comment/submit?id=78042431" method="post" onsubmit="return subform(this);" id="commentform">
                            <textarea class="comment_content" name="comment_content" id="comment_content" placeholder="发表你的评论"></textarea>
                            <div class="bot_bar clearfix">
                                <div id="ubbtools" class="add_code">
                                    <a href="#insertcode" code="code" target="_self"><i class="icon iconfont icon-daima"></i></a>
                                </div>

                                <input type="hidden" id="comment_replyId" name="comment_replyId">
                                <input type="hidden" id="comment_userId" name="comment_userId" value="">
                                <input type="hidden" id="commentId" name="commentId" value="">
                                <input type="submit" class="btn btn-redborder" value="发表评论">
								<span id="tip_comment" class="tip">
                                <div style="display: none;" class="csdn-tracking-statistics" data-mod="popu_384"><a href="#" target="_blank" class="comment_area_btn">发表评论</a></div>

                                <div id="lang_list" code="code">
                                    <a href="#html" style="width:95px;" class="long_name" target="_self">HTML/XML</a>
                                    <a href="#objc" style="width:95px;" class="long_name" target="_self">objective-c</a>
                                    <a href="#delphi" style="width:58px;" class="zhong_name" target="_self">Delphi</a>
                                    <a href="#ruby" class="zhong_name" target="_self">Ruby</a>
                                    <a href="#php" target="_self">PHP</a>
                                    <a href="#csharp" class="duan_name" target="_self">C#</a>
                                    <a style=" border-right: none;" href="#cpp" class="duan_name" target="_self">C++</a>
                                    <a style=" border-bottom:none;width:95px;" href="#javascript" class="long_name" target="_self">JavaScript</a>
                                    <a style=" border-bottom:none;width:95px;" href="#vb" class="long_name" target="_self">Visual Basic</a>
                                    <a style=" border-bottom:none;" href="#python" class="zhong_name" target="_self">Python</a>
                                    <a style=" border-bottom:none;" href="#java" class="zhong_name" target="_self">Java</a>
                                    <a style="border-bottom:none;" href="#css" class="duan_name" target="_self">CSS</a>
                                    <a style="border-bottom:none;" href="#sql" class="duan_name" target="_self">SQL</a>
                                    <a style="border:none; " href="#plain" class="duan_name" target="_self">其它</a>
                                    <span class="arrb"></span>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <div class="comment_li_outbox">
            <div id="comment_list"></div>
        </div>

        <div class="more_comment">
            <div id="comment_bar" class="trackgin-ad" data-mod="popu_385"></div>
        </div>

        <h3 class="recommend_tit">相关文章推荐</h3>
        <div class="recommend_list clearfix">
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/wylfll/article/details/47950593"  target="_blank" strategy="BlogCommendFromCF_0">在jsp中如何实现网页的自动更新</a></h2>
                    <div class="summary">
                        在jsp中如何实现网页的自动更新
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/wylfll" target="_blank" strategy="BlogCommendFromCF_0"><img src="http://avatar.csdn.net/E/4/0/2_wylfll.jpg" alt="wylfll" title="wylfll"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/wylfll">wylfll</a></li>
                        <li class="time">2015-08-24 14:27</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>410</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/js1568/article/details/73434001"  target="_blank" strategy="BlogCommendFromCF_1">最小生成树-Prim算法和Kruskal算法</a></h2>
                    <div class="summary">
                        最小生成树-Prim算法和Kruskal算法
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/js1568" target="_blank" strategy="BlogCommendFromCF_1"><img src="http://avatar.csdn.net/B/A/D/2_js1568.jpg" alt="js1568" title="js1568"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/js1568">js1568</a></li>
                        <li class="time">2017-06-18 17:19</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>88</span></li>
                    </ul>
                </dd>
            </dl>
            
            <!--dl class="clearfix csdn-tracking-statistics" data-mod="popu_393">
                <dt><a href="http://edu.csdn.net/huiyiCourse/series_detail/64?utm_source=blog10" target="_blank"><img class="maxwidth" src="http://img.blog.csdn.net/20170928113144608" alt="" title=""></a></dt>
                <dd>
                    <div class="summary">
                        <h2><a href='http://edu.csdn.net/topic/python1?utm_source=blog10' target='_blank'>伤心啊！年度热门编程语言排行榜出来了...</a></h2>  <div class="summary">近期，IEEE Spectrum 发布了第四届顶级编程语言交互排行榜。结合 10 个线上数据源的 12 个标准，对 48 种语言进行了排行！此外，七牛云许式伟曾说过Go语言会取代Java...气氛... </div> 
                    </div>
                </dd>
            </dl-->
	<script>
		(function() {
		    var s = "_" + Math.random().toString(36).slice(2);
		    document.write('<div id="' + s + '"></div>');
		    (window.slotbydup=window.slotbydup || []).push({
			id: '4765209',
			container: s,
			size: '808,120',
			display: 'inlay-fix'
		    });
		})();
	</script>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/myarrow/article/details/51188553"  target="_blank" strategy="BlogCommendFromCsdn_2">线性代数常用基本知识 (含向量和矩阵范数&lt;Matrix or vector norm&gt;)</a></h2>
                    <div class="summary">
                        1. 行列式
1.1 二阶行列式




1.2 三阶行列式
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/MyArrow" target="_blank" strategy="BlogCommendFromCsdn_2"><img src="http://avatar.csdn.net/C/1/6/2_myarrow.jpg" alt="MyArrow" title="MyArrow"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/MyArrow">MyArrow</a></li>
                        <li class="time">2016-04-19 11:07</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>8551</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/mathmetics/article/details/9279367"  target="_blank" strategy="BlogCommendFromCsdn_3">线性代数(七) : 子空间的基与维数</a></h2>
                    <div class="summary">
                        子空间的基与维数
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/xxingjjing" target="_blank" strategy="BlogCommendFromCsdn_3"><img src="http://avatar.csdn.net/5/D/7/2_xxingjjing.jpg" alt="xxingjjing" title="xxingjjing"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/xxingjjing">xxingjjing</a></li>
                        <li class="time">2013-07-11 10:29</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>2984</span></li>
                    </ul>
                </dd>
            </dl>
            <!-- 广告位：PC端-博客详情通栏7（feed流）-808*120 --><script> (function() {    var s = "_" + Math.random().toString(36).slice(2);   document.write('<div id="' + s + '"></div>');    (window.slotbydup=window.slotbydup || []).push({        id: '4983339',       container: s,        size: '808,120',        display: 'inlay-fix'    }); })();  </script>
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/qq_28306361/article/details/50800972"  target="_blank" strategy="BlogCommendFromCsdn_4">线性代数复习四——矩阵的维数和秩</a></h2>
                    <div class="summary">
                        复习
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/qq_28306361" target="_blank" strategy="BlogCommendFromCsdn_4"><img src="http://avatar.csdn.net/8/6/2/2_qq_28306361.jpg" alt="qq_28306361" title="qq_28306361"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/qq_28306361">qq_28306361</a></li>
                        <li class="time">2016-03-04 10:57</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>1835</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics downloadElement" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
               	<dt><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank" strategy="BlogCommendFromCsdn_5"><img class="maxwidth" src="http://download.csdn.net/images/minetype/rar.svg" alt="" title=""></a></dt>
		<dd>
			<div class="summary">
				<h2><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank" strategy="BlogCommendFromCsdn_5">高校教学资源，高数，线性代数等</a></h2>
				<div class="summary">
				  <ul>
					  <li class="time">2011-04-02 21:01</li>
					  <li class="visited_num fileSize">3.32MB</li>
					  <li class="download_btn"><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank">下载</a></li>
				  </ul>
				</div> 
			</div>
		</dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics downloadElement" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
               	<dt><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank" strategy="BlogCommendFromCsdn_6"><img class="maxwidth" src="http://download.csdn.net/images/minetype/rar.svg" alt="" title=""></a></dt>
		<dd>
			<div class="summary">
				<h2><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank" strategy="BlogCommendFromCsdn_6">考研数学公式（线性代数+概率论+高数）合集</a></h2>
				<div class="summary">
				  <ul>
					  <li class="time">2010-03-02 20:44</li>
					  <li class="visited_num fileSize">815KB</li>
					  <li class="download_btn"><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank">下载</a></li>
				  </ul>
				</div> 
			</div>
		</dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/suqier1314520/article/details/12584479"  target="_blank" strategy="BlogCommendFromCsdn_7">线性代数导论9——线性相关性、基、维数</a></h2>
                    <div class="summary">
                        本文是Gilbert Strang的线性代数导论课程笔记。课程地址：http://v.163.com/special/opencourse/daishu.html&#160;&#160;
第九课时：线性相关性、基、维数...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/suqier1314520" target="_blank" strategy="BlogCommendFromCsdn_7"><img src="http://avatar.csdn.net/5/6/9/2_suqier1314520.jpg" alt="suqier1314520" title="suqier1314520"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/suqier1314520">suqier1314520</a></li>
                        <li class="time">2013-10-10 19:28</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>4187</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/tengweitw/article/details/40921209"  target="_blank" strategy="BlogCommendFromCsdn_8">【线性代数】线性相关性、基和维数</a></h2>
                    <div class="summary">
                        一、线性相关性

&#160; &#160; &#160; 什么情况下，向量X1，X2，……，Xn是线性无关的？


&#160; &#160;&#160;&#160; 答：当向量X1，X2，……，Xn的线性组合(线性组合时系数不能全为0)不为零向量时，它们是线性无关的...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/tengweitw" target="_blank" strategy="BlogCommendFromCsdn_8"><img src="http://avatar.csdn.net/B/E/9/2_tengweitw.jpg" alt="tengweitw" title="tengweitw"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/tengweitw">tengweitw</a></li>
                        <li class="time">2014-11-09 14:29</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>1551</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/u010182633/article/details/52331744"  target="_blank" strategy="BlogCommendFromCsdn_9">漫步线性代数十——线性无关，基和维数</a></h2>
                    <div class="summary">
                        m,nm,n没有给出线性系统实际大小的真实信息，在我们上文的例子中有三行和四列，但是第三行仅仅是前两行的组合，在消元后得到了零行，它对奇次问题Ax=0Ax=0 没有影响。第四列同样是相关的，列空间减到...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/u010182633" target="_blank" strategy="BlogCommendFromCsdn_9"><img src="http://avatar.csdn.net/2/2/4/2_u010182633.jpg" alt="u010182633" title="u010182633"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/u010182633">u010182633</a></li>
                        <li class="time">2016-08-26 21:16</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>974</span></li>
                    </ul>
                </dd>
            </dl>
            

	   

            

            
        </div>
    </main>
    <aside>
        <div class="right_box user_info">
            <dl class="inf_bar clearfix">
                <dt class="csdn-tracking-statistics" data-mod="popu_381">
                    <a href="http://blog.csdn.net/js1568" target="_blank">
                        <img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg" class="avatar_pic">
                    </a>
                    <span class="medals" title="">
                <svg class="icon" aria-hidden="true">
                    
                </svg>
              </span>
                </dt>
                <dd>
                    <h3 class="csdn-tracking-statistics"  data-mod="popu_380"><a href="http://blog.csdn.net/js1568" target="_blank" id="uid">js1568</a></h3>
                    <span  class="csdn-tracking-statistics" data-mod="popu_379"><a class="btn btn-redborder-small "  id="span_add_follow" target="_self">＋关注</a></span>
                </dd>
            </dl>
            <div class="inf_number_box clearfix">
                <dl>
                    <dt>原创</dt>
                    <dd>15</dd>
                </dl>
                <dl>
                    <dt>粉丝</dt>
                    <dd id='fan'>3</dd>
                </dl>
                <dl>
                    <dt>喜欢</dt>
                    <dd>0</dd>
                </dl>
								 <dl>
              <dt>码云</dt>
              <dd>&nbsp;</dd>
            </dl>

            </div>
	    <div class="writings">
              <div class="public_signal clearfix">
                <h3>他的最新文章</h3>
                <a href="http://blog.csdn.net/js1568" target="_blank" class="more_z"><span>更多文章</span></a>
              </div>
                <ul class="inf_list clearfix csdn-tracking-statistics" data-mod="popu_382">
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429272" target="_blank">统计学习方法 7-支持向量机</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429192" target="_blank">统计学习方法 6-逻辑斯谛回归与最大熵模型</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429164" target="_blank">统计学习方法 5-决策树</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429150" target="_blank">统计学习方法 4-朴素贝叶斯法</a>
                    </li>
                    
                </ul>
            </div>
        </div>
        <div class="extension_other csdn-tracking-statistics" data-mod="popu_389">
						<!--u3032528-->
			<div class="flashrecommend">

<!-- 请置于所有广告位代码之前 -->
<script src="http://dup.baidustatic.com/js/dm.js"></script>
           
<!-- 广告位：PC端-博客详情页右侧视窗1（feed流）-300*250 -->
<script>
(function() {
    var s = "_" + Math.random().toString(36).slice(2);
    document.write('<div id="' + s + '"></div>');
    (window.slotbydup=window.slotbydup || []).push({
        id: '4770930',
        container: s,
        size: '300,250',
        display: 'inlay-fix'
    });
})();
</script>

		    </div>
        </div>

        
        <div class="fixRight">
            <div class="right_box padb0 csdn-tracking-statistics" data-mod="popu_391">
                <h3 class="tit"><span><em>在线课程</em></span></h3>
                <ul class="edu_li clearfix">
                  
                  <li>
                    <div>
                      <a href="http://edu.csdn.net/huiyiCourse/detail/603?utm_source=blog7" target="_blank">
                        <img src="http://img.bss.csdn.net/201711101450316277.png" alt="MVVM在美团点评酒旅移动端的最佳实践" title="MVVM在美团点评酒旅移动端的最佳实践">
                      </a>
                    </div>
                    <div>
                      <p><a href="http://edu.csdn.net/huiyiCourse/detail/603?utm_source=blog7" target="_blank">MVVM在美团点评酒旅移动端的最佳实践</a></p>
                      <p>讲师：王禹华</p>
                    </div>
                  </li>
                  
                  <li>
                    <div>
                      <a href="http://edu.csdn.net/huiyiCourse/detail/594?utm_source=blog7" target="_blank">
                        <img src="http://img.bss.csdn.net/201711101448389242.png" alt="C语言大型软件设计的面向对象" title="C语言大型软件设计的面向对象">
                      </a>
                    </div>
                    <div>
                      <p><a href="http://edu.csdn.net/huiyiCourse/detail/594?utm_source=blog7" target="_blank">C语言大型软件设计的面向对象</a></p>
                      <p>讲师：宋宝华</p>
                    </div>
                  </li>
                  
                </ul>
            </div>
			<!--u3032529-->
            <!-- <div class="extension_other csdn-tracking-statistics baidu_box" data-mod="popu_395">
								
                <script type="text/javascript" src="http://mpb1.iteye.com/cxpdpmumfaedgm.js"></script>
            </div> -->
			<div class="extension_other csdn-tracking-statistics bottomRcom" data-mod="popu_389" style="position:absolute;z-index:-5;opacity:0;pointer-events:none">
						<!--u3032528-->
				<div class="flashrecommend">
				<script type="text/javascript" src="http://mpb1.iteye.com/bwocoltlyzdec.js"></script>
				</div>
			</div>
        </div>
		<div class="user-hotArticle">
          <h3>热门文章</h3>
          <ul class="hotArticle-list csdn-tracking-statistics" data-mod="popu_521">
 
            <li>
              <a href="/js1568/article/details/78042431">线性代数中的范数</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>377</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/73385734">八大（基于比较）排序算法</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>371</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/66476086">先序，中序，后序线索化二叉树</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>313</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/64905555">机器学习（周志华 ）-2模型评估与选择</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>313</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/68066618">字符串匹配的KMP算法</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>309</span></div>
            </li>
 
          </ul>
        </div>


    </aside>
</div>

<div class="left_fixed">
      <div class="left_show_button">
        <span>
          <i class="icon iconfont icon-youjiantou"></i>
        </span>
      </div>
    <ul class="left_menu">

        <li>
            <button class="left-fixed-btn btn-like csdn-tracking-statistics" data-mod="popu_373" target="_self">
                <span class="iconbox border_red"><i class="icon iconfont icon-dianzan"></i></span>
				<span class="txt">0</span>
            </button>
        </li>
		<li id="blog_artical_directory">
            <button class="left-fixed-btn left_menu_btn csdn-tracking-statistics" data-mod="popu_372" target="_self">
                <span class="iconbox border_black"><i class="icon iconfont icon-mulu"></i></span>
            </button>
        </li>
        <li class="menu_con">
            <div class="list_father">
                <div class="arr_box">
                    <button class="btn-noborder arr-btn scroll-down  left_scroll_down"><i class="icon iconfont icon-xiajiantou"></i></button>
                    <button class="btn-noborder arr-btn scroll-up left_scroll_top"><i class="icon iconfont icon-shangjiantou"></i></button>
                </div>
                <div class="arr"></div>
                <div id="csdnBlogDir"></div>
            </div>
        </li>
        <li>
            <button class="left-fixed-btn csdn-tracking-statistics" data-mod="popu_374"  id="com-quick-collect" target="_self">
                <span class="iconbox border_purple"><i class="icon iconfont icon-shoucang"></i></span>
    
            </button>
        </li>
		<li>
          <button class="left-fixed-btn btn-pinglun" >
            <span class="iconbox border_purple"><i class="icon iconfont icon-pinglun"></i></span>
          </button>
        </li>
        <li id="share_box">
            <button class="left-fixed-btn  csdn-tracking-statistics"  data-mod="popu_375" target="_self">
                <span class="iconbox border_orange"><i class="icon iconfont icon-fenxiang"></i></span>
            </button>
            <div class="bdsharebuttonbox csdn-tracking-statistics" data-mod="popu_172">
                <div class="outside">
                    <span class="iconbox border_red2"><i class="icon iconfont icon-xinlang"></i></span>
                    <a href="#" class="bds_tsina" data-cmd="tsina" title="分享到新浪微博"> </a>
                </div>
                <div class="outside">
                    <span class="iconbox border_green"><i class="icon iconfont icon-weixin"></i></span>
                    <a href="#" class="bds_weixin" data-cmd="weixin" title="分享到微信"> </a>
                </div>
                <div class="outside">
                    <span class="iconbox border_blue"><i class="icon iconfont icon-QQ"></i></span>
                    <a href="#" class="bds_qzone" data-cmd="qzone" title="分享到QQ空间"> </a>
                </div>
            </div>
        </li>
    </ul>
</div>
<div class="right_fixed">
  <div class="r_ico">
	<i class="icon iconfont icon-jubao"></i>
	<span class="txt" id="reportBtn">内容举报</span>
  </div>
  <div class="returnTop">
   <i class="icon iconfont icon-fanhuidingbu"></i>
   <span>返回顶部</span>
 </div>
</div>
<div id="pop_win"></div>
<div id="popup_mask"></div>
<div class="pop_CA_cover" ></div>
<div class="pop pop_CA" >
    <div class="CA_header">
        收藏助手
        <span class="cancel_icon"  id="fapancle" ></span>
    </div>
    <iframe src="" id="collectIframe" frameborder="0" width="100%" height="360"  scrolling="no" ></iframe>
</div>
<!--举报-->
<div id="report_dialog" style="top: 250px; left: 343.5px;"><div id="panel_report">
    <div class="panel_head">不良信息举报</div>
    <form method="post" id="frmReport" class="panel_body">
        <table border="0" cellpadding="0" cellspacing="4" class="pop_table">
            <tbody><tr><td colspan="2">您举报文章：<a href="http://blog.csdn.net/raintungli/article/details/76583070" target="_blank">深度学习：神经网络中的前向传播和反向传播算法推导</a></td></tr>
            <tr>
                <th style="width:60px;">举报原因：</th>
                <td id="panel_reporttype">
                    <label><input type="radio" class="report_type" id="report_sex" name="report_type" value="1">色情</label>
                    <label><input type="radio" class="report_type" id="report_Politics" name="report_type" value="2">政治</label>
                    <label><input type="radio" class="report_type" id="report_copy" name="report_type" value="3">抄袭</label>
                    <label><input type="radio" class="report_type" id="report_ad" name="report_type" value="4">广告</label>
                    <label><input type="radio" class="report_type" id="report_want" name="report_type" value="5">招聘</label>
                    <label><input type="radio" class="report_type" id="report_call" name="report_type" value="6">骂人</label>
                    <br>
                    <label><input type="radio" class="report_type" id="report_other" name="report_type" value="7">其他</label>
                    <input type="text" name="report_other_content" id="report_other_content" maxlength="30" style="display: none;">
                </td>
            </tr>
            <tr id="panel_originalurl" style="display: none;">
                <th>原文地址：</th>
                <td>
                    <input id="originalurl" value="http://" name="originalurl" type="text" style="width: 90%;">
                </td>
            </tr>
            <tr>
                <th id="sp_reason">原因补充：</th>
                <td>
                    <textarea id="report_description" style="width: 300px;" rows="3" name="report_description"></textarea>
                    <p id="sp_n" style="color:#999;margin:0px;padding:0px;">(最多只允许输入30个字)</p>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input id="btnSubmitReport" name="submit" type="image" align="middle" class="btn_1" src="http://static.blog.csdn.net/images/btn_submit.jpg">
                    <span style="padding-left:20px;"></span>
                    <img id="btnCloseReportDialog" src="http://static.blog.csdn.net/images/btn_cancel.jpg" align="middle">
                    <div id="error" style="color: Red">
                    </div>
                </td>
            </tr>
            </tbody></table>
    </form>
</div>
    <script language="javascript" type="text/javascript">
        var isComment=0;
        //显示隐藏地址
        $(function () {
            if(isComment){
                $("#report_description").attr("disabled",true);
                $("#sp_n").hide();
                $("#sp_reason").html("评论内容：");
            }
            $(".report_type").click(function () {
                $("#panel_originalurl,#report_other_content").hide();
                switch ($(this).val()) {
                    case '3':
                        $("#panel_originalurl").show();
                        $("#originalurl").focus();
                        break;
                    case '7':
                        if(isComment){
                            $("#report_other_content").show().focus();
                        }
                        break;
                }

            });

            $("#frmReport").submit(function () {
                if (!currentUserName) {

                    if (confirm("您的操作必须登录，是否登录？")) {
                        location.href = "http://passport.csdn.net/account/login?from=" + encodeURIComponent(location.href);
                        return false;
                    }
                    return false;
                }

                var reportType = $("input[name=report_type]:checked").val();
                if(!reportType){
                    alert("请选择举报原因！");
                    return false;
                }
                var otherInfo = "";
                switch (reportType) {
                    case '3':
                        otherInfo = $("#originalurl").val();
                        if (otherInfo == ""||otherInfo=="http://") {
                            alert("举报抄袭必须提供原创文章地址！");
                            $("#originalurl").focus();
                            return false;
                        } else if(!checkeURL(otherInfo)) {
                            alert("请输入正确的原创文章地址！");
                            $("#originalurl").focus();
                            return false;
                        }
                        break;
                    case '7':
                        otherInfo = $("#report_other_content").val();
                        if (isComment && !otherInfo) {
                            alert("请填写举报的具体原因！");
                            $("#report_other_content").focus();
                            return false;
                        }
                        if(!isComment){
                            if(!$("#report_description").val()){
                                alert("请填写举报的具体原因！");
                                $("#report_description").focus();
                                return false;
                            }
                        }
                        break;
                }
                if(!isComment){
                    if($("#report_description").val().length>30){
                        alert("举报原因最多只允许输入30个字！");
                        return false;
                    }
                }
                nowTime = {
                  year: new Date().getFullYear(),
                  month: parseInt(new Date().getMonth())+1,
                  day: new Date().getDate(),
                  hours: parseInt(new Date().getHours()),
                  minutes: parseInt(new Date().getMinutes()),
                  seconds: parseInt(new Date().getSeconds())
                }
                var data = {
                    articleId: fileName,
                    commentId: 0,
                    reportType: reportType,
                    originalurl: $("#originalurl").val(),
                    report_other_content: $("#report_other_content").val(),
                    report_description: $("#report_description").val(),
                    currentUserName: currentUserName,
                    updatetime: nowTime.year+'/'+nowTime.month+'/'+nowTime.day+' '+ nowTime.hours+':'+nowTime.minutes+':'+seconds,
                    blogUser: username
                };
                if(!isComment){//如果是举报文章
                    data.report_other_content = data.report_description;
                    // data.report_description = "1. 神经网络这是一个常见的神经网络的图：这是一个常见的三层神经网络的基本构成，Layer L1是输入层，Layer L2是隐含层";
                }

                $.post(blog_address + "/common/report?id="+fileName+"&t=2", data, function (data) {
                    if (data.result == 1){
                        SetError("感谢您的举报，我们会尽快审核！");
                    }else{
                        if (data.content) alert(data.content);
                    }

                });
                return false;
            });

            $("#btnCloseReportDialog").click(function () {
                CloseDiv();
            });

        });

        //提示后关闭方法
        function SetError(error) {
            $("#btnCloseReportDialog").trigger("click");
            alert(error);
            CloseDiv();
        }

        //关闭方法
        function CloseDiv() {

            $.removeMask();
            $("#report_dialog").hide();
            return false;
        }

        //验证url
        function checkeURL(url){
            return /^http(s)?:\/\/([\w-]+\.)+[\w-]+/i.test(url);
        }

    </script>
</div>

<script src="http://c.csdnimg.cn/public/common/libs/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/public/res/bower-libs/MathJax/MathJax.js?config=TeX-AMS_HTML"></script>
<script type="text/javascript" src="http://passport.csdn.net/content/loginbox/login.js"></script>

<script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/js/blog_ver.js?v=2017.042"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/js/skin2017.js?v=2017.042"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/scripts/cnick.js"></script>
<script>window._bd_share_config = { "common": { "bdSnsKey": {}, "bdText": "", "bdMini": "1", "bdMiniList": false, "bdPic": "", "bdStyle": "0", "bdSize": "16" }, "share": {} }; with (document) 0[(getElementsByTagName('head')[0] || body).appendChild(createElement('script')).src = 'http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion=' + ~(-new Date() / 36e5)];</script>
<script type="text/javascript" >
    if($(".article_collect li").length==1){$(".article_collect").hide();}
    if($(".article_tags li").length==1){$(".article_tags").hide();}
    $(".edit a").attr("href","http://write.blog.csdn.net/postedit/"+fileName);
    $.each($(".edu_li a"),function(){$(this).attr("href",$(this).attr("href").replace("blog7","blog9"))});
    new CNick('#uid').showNickname();
if($("#fan").html()=="")
{
$("#fan").html(0);	
}

	var blogCustomType ='{customtype}';
                
        $("#custom"+blogCustomType).show();
</script>
</body>

<script  type="text/javascript">
    var fromjs=$("#fromjs");
    if(fromjs.length>0)
    {                  
        $("#fromjs .markdown_views pre").addClass("prettyprint");       
        prettyPrint();

        $('pre.prettyprint code').each(function () {
            var lines = $(this).text().split('\n').length;
            var $numbering = $('<ul/>').addClass('pre-numbering').hide();
            $(this).addClass('has-numbering').parent().append($numbering);
            for (i = 1; i <= lines; i++) {
                $numbering.append($('<li/>').text(i));
            };
            $numbering.fadeIn(1700);
        });

        $('.pre-numbering li').css("color","#999");             
    }

    $(function(){
        setTimeout(function(){
            $(".math").each(function(index,value){$(this).find("span").last().css("color","#fff"); })
        },500);         
       

    });

    setTimeout(function () {
        $(".toc a[target='_blank']").attr("target", "");
    }, 500);

</script>
</html>



<!DOCTYPE html>
<html>
<head>
            <link rel="canonical" href="http://blog.csdn.net/js1568/article/details/78042431"/> 

    <script type="text/javascript">
        var username = "js1568";var _blogger = username;var blog_address = "http://blog.csdn.net/js1568";var static_host = "http://static.blog.csdn.net";
        var currentUserName = "js1568"; var fileName = '78042431';var commentscount = 0; var islock = false
        window.quickReplyflag = true;
        var totalFloor=0;
                
                 var isBole = false;
                
                
                 var isDigg = false;
                
          
             var isExpert=false;
        
          
        var isAdm=false;
        

    </script>

<meta http-equiv="content-type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <script src="http://c.csdnimg.cn/public/common/libs/jquery/jquery-1.9.1.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/common/libs/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/static/css/avatar.css">
    <link type="text/css" rel="stylesheet" href="http://static.blog.csdn.net/scripts/SyntaxHighlighter/styles/default.css" />
    <link rel="stylesheet" href="http://static.blog.csdn.net/Skin/skin3-template/css/style.css?v=2017.042">
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/common/toolbar/content_toolbar_css/content_toolbar.css?v5.00.37">
              <!-- adhoc sdk -->
		<script src=https://sdk.appadhoc.com/ab.plus.js></script>
		<script>
		adhoc('init', {
		  appKey: 'ADHOC_0e0bce4f-8793-4f68-89cf-34c14f2532bb',
		  defaultFlags: {isLogin: true}
		})
		</script>
              <!-- adhoc sdk end -->
    
	<script src="//static.blog.csdn.net/public/switchHome/switchHome.js?v=2017.43"></script>	
	
    <script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/fonts/iconfont.js"></script>
    <script src="//csdnimg.cn/rabbit/exposure-click/main.js?v1.15.23"></script>
    <script type="text/javascript" src="http://c.csdnimg.cn/pubfooter/js/tracking_for_recommend.js?v=0911" charset="utf-8"></script>
    <script type="text/javascript" src="http://csdnimg.cn/pubfooter/js/tracking.js" charset="utf-8"></script>
    <script type="text/javascript" src="http://static.blog.csdn.net/scripts/cnick.js" charset="utf-8"></script>
 
    <link rel="stylesheet" href="http://static.blog.csdn.net/code/prettify.css" />
    <script type="text/javascript" src="http://static.blog.csdn.net/code/prettify.js"></script>
<script src="http://dup.baidustatic.com/js/ds.js"></script>
    <script type="text/javascript">

        // Traffic Stats of the entire Web site By baidu
        var _hmt = _hmt || [];
        (function() {
            var hm = document.createElement("script");
            hm.src = "https://hm.baidu.com/hm.js?6bcd52f51e9b3dce32bec4a3997715ac";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
        // Traffic Stats of the entire Web site By baidu end



    </script>
    <meta name="description" content="线性代数中的范数" />
    <meta name="keywords" content="机器学习,线性代数" />
    <meta http-equiv="Cache-Control" content="no-siteapp" /><link rel="alternate" media="handheld" href="#" />
    <meta name="shenma-site-verification" content="5a59773ab8077d4a62bf469ab966a63b_1497598848">


    <title>线性代数中的范数 - CSDN博客</title>
</head>
<body>
<script id="toolbar-tpl-scriptId" prod="download" skin="black" src="http://c.csdnimg.cn/public/common/toolbar/js/content_toolbar.js?v5.00.37" type="text/javascript" domain="http://blog.csdn.net"></script>

<div class="container clearfix">
    <main>
        <article>
            <h1 class="csdn_top">线性代数中的范数</h1>
            <div class="article_bar clearfix">
                <div class="artical_tag">
                    <span class="original">转载</span>
                    <span class="time">2017年09月20日 16:31:53</span>
                </div>
				<ul class="article_tags clearfix csdn-tracking-statistics" data-mod="popu_377">
					<li class="tit">标签：</li>
					
					<li><a href="http://so.csdn.net/so/search/s.do?q=机器学习&t=blog" target="_blank">机器学习</a> <span>/</span></li>
					
					<li><a href="http://so.csdn.net/so/search/s.do?q=线性代数&t=blog" target="_blank">线性代数</a> <span>/</span></li>
					
				</ul>
                <ul class="right_bar">
                    <li><button class="btn-noborder"><i class="icon iconfont icon-read"></i><span class="txt">381</span></button></li>
                    <!--<li><button class="btn-noborder"><i class="icon iconfont icon-dashang-"></i><span class="txt">0</span></button></li>-->

                    <li class="edit">
                        <a class="btn-noborder" href="" >
                            <i class="icon iconfont icon-bianji"></i><span class="txt">编辑</span>
                        </a>
                    </li>
                    <li class="del">
                        <a class="btn-noborder" onclick="javascript:deleteArticle(fileName);return false;">
                            <i class="icon iconfont icon-shanchu"></i><span class="txt">删除</span>
                        </a>
                    </li>
                </ul>
            </div>
            <div id="article_content" class="article_content csdn-tracking-statistics" data-mod="popu_519" data-dsm="post">
                <div class="markdown_views"><p>向量范数</p>

<ul>
<li>0-范数：向量中非零元素个数</li>
<li>1-范数： <img src="https://www.zhihu.com/equation?tex=%7C%7Cx%7C%7C_1%20=%20%5Csum_%7Bi=1%7D%5EN%7Cx_i%7C" alt="" title="">，即向量元素绝对值之和，matlab调用函数norm(x, 1) 。</li>
<li>2-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_2%20=%5Csqrt%7B%5Csum_%7Bi=1%7D%5ENx_i%5E2%7D" alt="" title="">，Euclid范数（欧几里得范数，常用计算向量长度），即向量元素绝对值的平方和再开方，matlab调用函数norm(x, 2)。</li>
<li><img src="https://www.zhihu.com/equation?tex=%5Cinfty" alt="" title=""> -范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_%5Cinfty%20=%20%5Cmax_%7Bi%7D%7Cx_i%7C" alt="" title="">，即所有向量元素绝对值中的最大值，matlab调用函数norm(x, inf)。</li>
<li><img src="https://www.zhihu.com/equation?tex=-%5Cinfty" alt="" title="">-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_%7B-%5Cinfty%7D=%5Cmin_i%7Cx_i%7C" alt="" title="">，即所有向量元素绝对值中的最小值，matlab调用函数norm(x, -inf)。</li>
<li>p-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_p%20=%20%28%5Csum_%7Bi=1%7D%5EN%7Cx_i%7C%5Ep%29%5E%7B%5Cfrac%7B1%7D%7Bp%7D%7D" alt="" title="">，即向量元素绝对值的p次方和的1/p次幂，matlab调用函数norm(x, p)。</li>
</ul>

<p>矩阵范数</p>

<ul>
<li>1-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_1%20=%20%5Cmax_j%5Csum_%7Bi=1%7D%5Em%7Ca_%7Bi,j%7D%7C" alt="" title="">， 列和范数，即所有矩阵列向量绝对值之和的最大值，matlab调用函数norm(A, 1)。</li>
<li>2-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_2%20=%20%5Csqrt%7B%5Clambda_1%7D" alt="" title="">，<img src="https://www.zhihu.com/equation?tex=%5Clambda%3Cbr/%3E" alt="" title="">为的最大特征值。，谱范数，即A’A矩阵的最大特征值的开平方。matlab调用函数norm(x, 2)。</li>
<li><img src="https://www.zhihu.com/equation?tex=%5Cinfty" alt="" title="">-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_%5Cinfty%20=%20%5Cmax_i%5Csum_%7Bj=1%7D%5EN%7Ca_%7Bi,j%7D%7C" alt="" title="">，行和范数，即所有矩阵行向量绝对值之和的最大值，matlab调用函数norm(A, inf)。</li>
<li>F-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_F=%5Cleft%28%5Csum_%7Bi=1%7D%5Em%5Csum_%7Bj=1%7D%5En%7Ca_%7Bi,j%7D%7C%5E2%5Cright%29%5E%7B%5Cfrac%7B1%7D%7B2%7D%7D" alt="" title="">，Frobenius范数，即矩阵元素绝对值的平方和再开平方，matlab调用函数norm(A, ’fro‘)。</li>
<li>核范数：是A的奇异值。即奇异值之和</li>
</ul>

<p>作者：魏通 <br>
链接：<a href="https://www.zhihu.com/question/20473040/answer/102907063" target="_blank">https://www.zhihu.com/question/20473040/answer/102907063</a> <br>
来源：知乎 <br>
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。</p><link rel="stylesheet" href="http://static.blog.csdn.net/public/res-min/markdown_views.css?v=2.0" /></div><link rel="stylesheet" href="http://static.blog.csdn.net/public/res-min/markdown_views.css?v=2.0" />
            </div>
        </article>
        <div class="readall_box csdn-tracking-statistics" data-mod="popu_376">
			<div class="read_more_mask"></div>
            <a class="btn btn-large btn-gray-fred read_more_btn" target="_self">阅读全文</a>
        </div>
        <div class="article_copyright">
            
        </div>
        <!--  <div class="reward_box">
            <div class="tit">
              <button class="btn_reward"><i class="icon iconfont icon-dashang-"></i></button>
            </div>
            <dl class="clearfix">
              <dt><a href="#" target="_blank">近期打赏</a></dt>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
            </dl>
          </div>-->

        <ul class="article_collect clearfix csdn-tracking-statistics"  data-mod="popu_378">
            <li class="tit">本文已收录于以下专栏：</li>
            
        </ul>
        <div class="comment_box clearfix">
            <div id="comment_form">
                <div id="commentsbmitarear">
                    <!-- <h6><span>0</span>条评论</h6> -->
           <!--          <dl class="clearfix" id="commentbox">
                        <dt>
                            <a href="http://my.csdn.net/js1568"><img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg" ></a>
                        </dt>
                        <dd>
                            <a href="http://my.csdn.net/js1568" target="_blank">js1568</a>
                        </dd>
                        <dd class="txt_tip"><span id="tip_comment" class="tip"></span></dd>
                    </dl> -->
                    <div class="comment_area clearfix">
						<div class="userimg"><a href="http://my.csdn.net/js1568"><img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg"></a></div>
                        <form action="/js1568/comment/submit?id=78042431" method="post" onsubmit="return subform(this);" id="commentform">
                            <textarea class="comment_content" name="comment_content" id="comment_content" placeholder="发表你的评论"></textarea>
                            <div class="bot_bar clearfix">
                                <div id="ubbtools" class="add_code">
                                    <a href="#insertcode" code="code" target="_self"><i class="icon iconfont icon-daima"></i></a>
                                </div>

                                <input type="hidden" id="comment_replyId" name="comment_replyId">
                                <input type="hidden" id="comment_userId" name="comment_userId" value="">
                                <input type="hidden" id="commentId" name="commentId" value="">
                                <input type="submit" class="btn btn-redborder" value="发表评论">
								<span id="tip_comment" class="tip">
                                <div style="display: none;" class="csdn-tracking-statistics" data-mod="popu_384"><a href="#" target="_blank" class="comment_area_btn">发表评论</a></div>

                                <div id="lang_list" code="code">
                                    <a href="#html" style="width:95px;" class="long_name" target="_self">HTML/XML</a>
                                    <a href="#objc" style="width:95px;" class="long_name" target="_self">objective-c</a>
                                    <a href="#delphi" style="width:58px;" class="zhong_name" target="_self">Delphi</a>
                                    <a href="#ruby" class="zhong_name" target="_self">Ruby</a>
                                    <a href="#php" target="_self">PHP</a>
                                    <a href="#csharp" class="duan_name" target="_self">C#</a>
                                    <a style=" border-right: none;" href="#cpp" class="duan_name" target="_self">C++</a>
                                    <a style=" border-bottom:none;width:95px;" href="#javascript" class="long_name" target="_self">JavaScript</a>
                                    <a style=" border-bottom:none;width:95px;" href="#vb" class="long_name" target="_self">Visual Basic</a>
                                    <a style=" border-bottom:none;" href="#python" class="zhong_name" target="_self">Python</a>
                                    <a style=" border-bottom:none;" href="#java" class="zhong_name" target="_self">Java</a>
                                    <a style="border-bottom:none;" href="#css" class="duan_name" target="_self">CSS</a>
                                    <a style="border-bottom:none;" href="#sql" class="duan_name" target="_self">SQL</a>
                                    <a style="border:none; " href="#plain" class="duan_name" target="_self">其它</a>
                                    <span class="arrb"></span>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <div class="comment_li_outbox">
            <div id="comment_list"></div>
        </div>

        <div class="more_comment">
            <div id="comment_bar" class="trackgin-ad" data-mod="popu_385"></div>
        </div>

        <h3 class="recommend_tit">相关文章推荐</h3>
        <div class="recommend_list clearfix">
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/wylfll/article/details/47950593"  target="_blank" strategy="BlogCommendFromCF_0">在jsp中如何实现网页的自动更新</a></h2>
                    <div class="summary">
                        在jsp中如何实现网页的自动更新
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/wylfll" target="_blank" strategy="BlogCommendFromCF_0"><img src="http://avatar.csdn.net/E/4/0/2_wylfll.jpg" alt="wylfll" title="wylfll"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/wylfll">wylfll</a></li>
                        <li class="time">2015-08-24 14:27</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>410</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/js1568/article/details/73434001"  target="_blank" strategy="BlogCommendFromCF_1">最小生成树-Prim算法和Kruskal算法</a></h2>
                    <div class="summary">
                        最小生成树-Prim算法和Kruskal算法
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/js1568" target="_blank" strategy="BlogCommendFromCF_1"><img src="http://avatar.csdn.net/B/A/D/2_js1568.jpg" alt="js1568" title="js1568"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/js1568">js1568</a></li>
                        <li class="time">2017-06-18 17:19</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>88</span></li>
                    </ul>
                </dd>
            </dl>
            
            <!--dl class="clearfix csdn-tracking-statistics" data-mod="popu_393">
                <dt><a href="http://edu.csdn.net/huiyiCourse/series_detail/64?utm_source=blog10" target="_blank"><img class="maxwidth" src="http://img.blog.csdn.net/20170928113144608" alt="" title=""></a></dt>
                <dd>
                    <div class="summary">
                        <h2><a href='http://edu.csdn.net/topic/python1?utm_source=blog10' target='_blank'>伤心啊！年度热门编程语言排行榜出来了...</a></h2>  <div class="summary">近期，IEEE Spectrum 发布了第四届顶级编程语言交互排行榜。结合 10 个线上数据源的 12 个标准，对 48 种语言进行了排行！此外，七牛云许式伟曾说过Go语言会取代Java...气氛... </div> 
                    </div>
                </dd>
            </dl-->
	<script>
		(function() {
		    var s = "_" + Math.random().toString(36).slice(2);
		    document.write('<div id="' + s + '"></div>');
		    (window.slotbydup=window.slotbydup || []).push({
			id: '4765209',
			container: s,
			size: '808,120',
			display: 'inlay-fix'
		    });
		})();
	</script>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/myarrow/article/details/51188553"  target="_blank" strategy="BlogCommendFromCsdn_2">线性代数常用基本知识 (含向量和矩阵范数&lt;Matrix or vector norm&gt;)</a></h2>
                    <div class="summary">
                        1. 行列式
1.1 二阶行列式




1.2 三阶行列式
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/MyArrow" target="_blank" strategy="BlogCommendFromCsdn_2"><img src="http://avatar.csdn.net/C/1/6/2_myarrow.jpg" alt="MyArrow" title="MyArrow"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/MyArrow">MyArrow</a></li>
                        <li class="time">2016-04-19 11:07</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>8551</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/mathmetics/article/details/9279367"  target="_blank" strategy="BlogCommendFromCsdn_3">线性代数(七) : 子空间的基与维数</a></h2>
                    <div class="summary">
                        子空间的基与维数
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/xxingjjing" target="_blank" strategy="BlogCommendFromCsdn_3"><img src="http://avatar.csdn.net/5/D/7/2_xxingjjing.jpg" alt="xxingjjing" title="xxingjjing"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/xxingjjing">xxingjjing</a></li>
                        <li class="time">2013-07-11 10:29</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>2984</span></li>
                    </ul>
                </dd>
            </dl>
            <!-- 广告位：PC端-博客详情通栏7（feed流）-808*120 --><script> (function() {    var s = "_" + Math.random().toString(36).slice(2);   document.write('<div id="' + s + '"></div>');    (window.slotbydup=window.slotbydup || []).push({        id: '4983339',       container: s,        size: '808,120',        display: 'inlay-fix'    }); })();  </script>
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/qq_28306361/article/details/50800972"  target="_blank" strategy="BlogCommendFromCsdn_4">线性代数复习四——矩阵的维数和秩</a></h2>
                    <div class="summary">
                        复习
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/qq_28306361" target="_blank" strategy="BlogCommendFromCsdn_4"><img src="http://avatar.csdn.net/8/6/2/2_qq_28306361.jpg" alt="qq_28306361" title="qq_28306361"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/qq_28306361">qq_28306361</a></li>
                        <li class="time">2016-03-04 10:57</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>1835</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics downloadElement" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
               	<dt><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank" strategy="BlogCommendFromCsdn_5"><img class="maxwidth" src="http://download.csdn.net/images/minetype/rar.svg" alt="" title=""></a></dt>
		<dd>
			<div class="summary">
				<h2><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank" strategy="BlogCommendFromCsdn_5">高校教学资源，高数，线性代数等</a></h2>
				<div class="summary">
				  <ul>
					  <li class="time">2011-04-02 21:01</li>
					  <li class="visited_num fileSize">3.32MB</li>
					  <li class="download_btn"><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank">下载</a></li>
				  </ul>
				</div> 
			</div>
		</dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics downloadElement" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
               	<dt><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank" strategy="BlogCommendFromCsdn_6"><img class="maxwidth" src="http://download.csdn.net/images/minetype/rar.svg" alt="" title=""></a></dt>
		<dd>
			<div class="summary">
				<h2><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank" strategy="BlogCommendFromCsdn_6">考研数学公式（线性代数+概率论+高数）合集</a></h2>
				<div class="summary">
				  <ul>
					  <li class="time">2010-03-02 20:44</li>
					  <li class="visited_num fileSize">815KB</li>
					  <li class="download_btn"><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank">下载</a></li>
				  </ul>
				</div> 
			</div>
		</dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/suqier1314520/article/details/12584479"  target="_blank" strategy="BlogCommendFromCsdn_7">线性代数导论9——线性相关性、基、维数</a></h2>
                    <div class="summary">
                        本文是Gilbert Strang的线性代数导论课程笔记。课程地址：http://v.163.com/special/opencourse/daishu.html&#160;&#160;
第九课时：线性相关性、基、维数...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/suqier1314520" target="_blank" strategy="BlogCommendFromCsdn_7"><img src="http://avatar.csdn.net/5/6/9/2_suqier1314520.jpg" alt="suqier1314520" title="suqier1314520"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/suqier1314520">suqier1314520</a></li>
                        <li class="time">2013-10-10 19:28</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>4187</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/tengweitw/article/details/40921209"  target="_blank" strategy="BlogCommendFromCsdn_8">【线性代数】线性相关性、基和维数</a></h2>
                    <div class="summary">
                        一、线性相关性

&#160; &#160; &#160; 什么情况下，向量X1，X2，……，Xn是线性无关的？


&#160; &#160;&#160;&#160; 答：当向量X1，X2，……，Xn的线性组合(线性组合时系数不能全为0)不为零向量时，它们是线性无关的...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/tengweitw" target="_blank" strategy="BlogCommendFromCsdn_8"><img src="http://avatar.csdn.net/B/E/9/2_tengweitw.jpg" alt="tengweitw" title="tengweitw"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/tengweitw">tengweitw</a></li>
                        <li class="time">2014-11-09 14:29</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>1551</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/u010182633/article/details/52331744"  target="_blank" strategy="BlogCommendFromCsdn_9">漫步线性代数十——线性无关，基和维数</a></h2>
                    <div class="summary">
                        m,nm,n没有给出线性系统实际大小的真实信息，在我们上文的例子中有三行和四列，但是第三行仅仅是前两行的组合，在消元后得到了零行，它对奇次问题Ax=0Ax=0 没有影响。第四列同样是相关的，列空间减到...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/u010182633" target="_blank" strategy="BlogCommendFromCsdn_9"><img src="http://avatar.csdn.net/2/2/4/2_u010182633.jpg" alt="u010182633" title="u010182633"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/u010182633">u010182633</a></li>
                        <li class="time">2016-08-26 21:16</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>974</span></li>
                    </ul>
                </dd>
            </dl>
            

	   

            

            
        </div>
    </main>
    <aside>
        <div class="right_box user_info">
            <dl class="inf_bar clearfix">
                <dt class="csdn-tracking-statistics" data-mod="popu_381">
                    <a href="http://blog.csdn.net/js1568" target="_blank">
                        <img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg" class="avatar_pic">
                    </a>
                    <span class="medals" title="">
                <svg class="icon" aria-hidden="true">
                    
                </svg>
              </span>
                </dt>
                <dd>
                    <h3 class="csdn-tracking-statistics"  data-mod="popu_380"><a href="http://blog.csdn.net/js1568" target="_blank" id="uid">js1568</a></h3>
                    <span  class="csdn-tracking-statistics" data-mod="popu_379"><a class="btn btn-redborder-small "  id="span_add_follow" target="_self">＋关注</a></span>
                </dd>
            </dl>
            <div class="inf_number_box clearfix">
                <dl>
                    <dt>原创</dt>
                    <dd>15</dd>
                </dl>
                <dl>
                    <dt>粉丝</dt>
                    <dd id='fan'>3</dd>
                </dl>
                <dl>
                    <dt>喜欢</dt>
                    <dd>0</dd>
                </dl>
								 <dl>
              <dt>码云</dt>
              <dd>&nbsp;</dd>
            </dl>

            </div>
	    <div class="writings">
              <div class="public_signal clearfix">
                <h3>他的最新文章</h3>
                <a href="http://blog.csdn.net/js1568" target="_blank" class="more_z"><span>更多文章</span></a>
              </div>
                <ul class="inf_list clearfix csdn-tracking-statistics" data-mod="popu_382">
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429272" target="_blank">统计学习方法 7-支持向量机</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429192" target="_blank">统计学习方法 6-逻辑斯谛回归与最大熵模型</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429164" target="_blank">统计学习方法 5-决策树</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429150" target="_blank">统计学习方法 4-朴素贝叶斯法</a>
                    </li>
                    
                </ul>
            </div>
        </div>
        <div class="extension_other csdn-tracking-statistics" data-mod="popu_389">
						<!--u3032528-->
			<div class="flashrecommend">

<!-- 请置于所有广告位代码之前 -->
<script src="http://dup.baidustatic.com/js/dm.js"></script>
           
<!-- 广告位：PC端-博客详情页右侧视窗1（feed流）-300*250 -->
<script>
(function() {
    var s = "_" + Math.random().toString(36).slice(2);
    document.write('<div id="' + s + '"></div>');
    (window.slotbydup=window.slotbydup || []).push({
        id: '4770930',
        container: s,
        size: '300,250',
        display: 'inlay-fix'
    });
})();
</script>

		    </div>
        </div>

        
        <div class="fixRight">
            <div class="right_box padb0 csdn-tracking-statistics" data-mod="popu_391">
                <h3 class="tit"><span><em>在线课程</em></span></h3>
                <ul class="edu_li clearfix">
                  
                  <li>
                    <div>
                      <a href="http://edu.csdn.net/huiyiCourse/detail/603?utm_source=blog7" target="_blank">
                        <img src="http://img.bss.csdn.net/201711101450316277.png" alt="MVVM在美团点评酒旅移动端的最佳实践" title="MVVM在美团点评酒旅移动端的最佳实践">
                      </a>
                    </div>
                    <div>
                      <p><a href="http://edu.csdn.net/huiyiCourse/detail/603?utm_source=blog7" target="_blank">MVVM在美团点评酒旅移动端的最佳实践</a></p>
                      <p>讲师：王禹华</p>
                    </div>
                  </li>
                  
                  <li>
                    <div>
                      <a href="http://edu.csdn.net/huiyiCourse/detail/594?utm_source=blog7" target="_blank">
                        <img src="http://img.bss.csdn.net/201711101448389242.png" alt="C语言大型软件设计的面向对象" title="C语言大型软件设计的面向对象">
                      </a>
                    </div>
                    <div>
                      <p><a href="http://edu.csdn.net/huiyiCourse/detail/594?utm_source=blog7" target="_blank">C语言大型软件设计的面向对象</a></p>
                      <p>讲师：宋宝华</p>
                    </div>
                  </li>
                  
                </ul>
            </div>
			<!--u3032529-->
            <!-- <div class="extension_other csdn-tracking-statistics baidu_box" data-mod="popu_395">
								
                <script type="text/javascript" src="http://mpb1.iteye.com/cxpdpmumfaedgm.js"></script>
            </div> -->
			<div class="extension_other csdn-tracking-statistics bottomRcom" data-mod="popu_389" style="position:absolute;z-index:-5;opacity:0;pointer-events:none">
						<!--u3032528-->
				<div class="flashrecommend">
				<script type="text/javascript" src="http://mpb1.iteye.com/bwocoltlyzdec.js"></script>
				</div>
			</div>
        </div>
		<div class="user-hotArticle">
          <h3>热门文章</h3>
          <ul class="hotArticle-list csdn-tracking-statistics" data-mod="popu_521">
 
            <li>
              <a href="/js1568/article/details/78042431">线性代数中的范数</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>377</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/73385734">八大（基于比较）排序算法</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>371</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/66476086">先序，中序，后序线索化二叉树</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>313</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/64905555">机器学习（周志华 ）-2模型评估与选择</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>313</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/68066618">字符串匹配的KMP算法</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>309</span></div>
            </li>
 
          </ul>
        </div>


    </aside>
</div>

<div class="left_fixed">
      <div class="left_show_button">
        <span>
          <i class="icon iconfont icon-youjiantou"></i>
        </span>
      </div>
    <ul class="left_menu">

        <li>
            <button class="left-fixed-btn btn-like csdn-tracking-statistics" data-mod="popu_373" target="_self">
                <span class="iconbox border_red"><i class="icon iconfont icon-dianzan"></i></span>
				<span class="txt">0</span>
            </button>
        </li>
		<li id="blog_artical_directory">
            <button class="left-fixed-btn left_menu_btn csdn-tracking-statistics" data-mod="popu_372" target="_self">
                <span class="iconbox border_black"><i class="icon iconfont icon-mulu"></i></span>
            </button>
        </li>
        <li class="menu_con">
            <div class="list_father">
                <div class="arr_box">
                    <button class="btn-noborder arr-btn scroll-down  left_scroll_down"><i class="icon iconfont icon-xiajiantou"></i></button>
                    <button class="btn-noborder arr-btn scroll-up left_scroll_top"><i class="icon iconfont icon-shangjiantou"></i></button>
                </div>
                <div class="arr"></div>
                <div id="csdnBlogDir"></div>
            </div>
        </li>
        <li>
            <button class="left-fixed-btn csdn-tracking-statistics" data-mod="popu_374"  id="com-quick-collect" target="_self">
                <span class="iconbox border_purple"><i class="icon iconfont icon-shoucang"></i></span>
    
            </button>
        </li>
		<li>
          <button class="left-fixed-btn btn-pinglun" >
            <span class="iconbox border_purple"><i class="icon iconfont icon-pinglun"></i></span>
          </button>
        </li>
        <li id="share_box">
            <button class="left-fixed-btn  csdn-tracking-statistics"  data-mod="popu_375" target="_self">
                <span class="iconbox border_orange"><i class="icon iconfont icon-fenxiang"></i></span>
            </button>
            <div class="bdsharebuttonbox csdn-tracking-statistics" data-mod="popu_172">
                <div class="outside">
                    <span class="iconbox border_red2"><i class="icon iconfont icon-xinlang"></i></span>
                    <a href="#" class="bds_tsina" data-cmd="tsina" title="分享到新浪微博"> </a>
                </div>
                <div class="outside">
                    <span class="iconbox border_green"><i class="icon iconfont icon-weixin"></i></span>
                    <a href="#" class="bds_weixin" data-cmd="weixin" title="分享到微信"> </a>
                </div>
                <div class="outside">
                    <span class="iconbox border_blue"><i class="icon iconfont icon-QQ"></i></span>
                    <a href="#" class="bds_qzone" data-cmd="qzone" title="分享到QQ空间"> </a>
                </div>
            </div>
        </li>
    </ul>
</div>
<div class="right_fixed">
  <div class="r_ico">
	<i class="icon iconfont icon-jubao"></i>
	<span class="txt" id="reportBtn">内容举报</span>
  </div>
  <div class="returnTop">
   <i class="icon iconfont icon-fanhuidingbu"></i>
   <span>返回顶部</span>
 </div>
</div>
<div id="pop_win"></div>
<div id="popup_mask"></div>
<div class="pop_CA_cover" ></div>
<div class="pop pop_CA" >
    <div class="CA_header">
        收藏助手
        <span class="cancel_icon"  id="fapancle" ></span>
    </div>
    <iframe src="" id="collectIframe" frameborder="0" width="100%" height="360"  scrolling="no" ></iframe>
</div>
<!--举报-->
<div id="report_dialog" style="top: 250px; left: 343.5px;"><div id="panel_report">
    <div class="panel_head">不良信息举报</div>
    <form method="post" id="frmReport" class="panel_body">
        <table border="0" cellpadding="0" cellspacing="4" class="pop_table">
            <tbody><tr><td colspan="2">您举报文章：<a href="http://blog.csdn.net/raintungli/article/details/76583070" target="_blank">深度学习：神经网络中的前向传播和反向传播算法推导</a></td></tr>
            <tr>
                <th style="width:60px;">举报原因：</th>
                <td id="panel_reporttype">
                    <label><input type="radio" class="report_type" id="report_sex" name="report_type" value="1">色情</label>
                    <label><input type="radio" class="report_type" id="report_Politics" name="report_type" value="2">政治</label>
                    <label><input type="radio" class="report_type" id="report_copy" name="report_type" value="3">抄袭</label>
                    <label><input type="radio" class="report_type" id="report_ad" name="report_type" value="4">广告</label>
                    <label><input type="radio" class="report_type" id="report_want" name="report_type" value="5">招聘</label>
                    <label><input type="radio" class="report_type" id="report_call" name="report_type" value="6">骂人</label>
                    <br>
                    <label><input type="radio" class="report_type" id="report_other" name="report_type" value="7">其他</label>
                    <input type="text" name="report_other_content" id="report_other_content" maxlength="30" style="display: none;">
                </td>
            </tr>
            <tr id="panel_originalurl" style="display: none;">
                <th>原文地址：</th>
                <td>
                    <input id="originalurl" value="http://" name="originalurl" type="text" style="width: 90%;">
                </td>
            </tr>
            <tr>
                <th id="sp_reason">原因补充：</th>
                <td>
                    <textarea id="report_description" style="width: 300px;" rows="3" name="report_description"></textarea>
                    <p id="sp_n" style="color:#999;margin:0px;padding:0px;">(最多只允许输入30个字)</p>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input id="btnSubmitReport" name="submit" type="image" align="middle" class="btn_1" src="http://static.blog.csdn.net/images/btn_submit.jpg">
                    <span style="padding-left:20px;"></span>
                    <img id="btnCloseReportDialog" src="http://static.blog.csdn.net/images/btn_cancel.jpg" align="middle">
                    <div id="error" style="color: Red">
                    </div>
                </td>
            </tr>
            </tbody></table>
    </form>
</div>
    <script language="javascript" type="text/javascript">
        var isComment=0;
        //显示隐藏地址
        $(function () {
            if(isComment){
                $("#report_description").attr("disabled",true);
                $("#sp_n").hide();
                $("#sp_reason").html("评论内容：");
            }
            $(".report_type").click(function () {
                $("#panel_originalurl,#report_other_content").hide();
                switch ($(this).val()) {
                    case '3':
                        $("#panel_originalurl").show();
                        $("#originalurl").focus();
                        break;
                    case '7':
                        if(isComment){
                            $("#report_other_content").show().focus();
                        }
                        break;
                }

            });

            $("#frmReport").submit(function () {
                if (!currentUserName) {

                    if (confirm("您的操作必须登录，是否登录？")) {
                        location.href = "http://passport.csdn.net/account/login?from=" + encodeURIComponent(location.href);
                        return false;
                    }
                    return false;
                }

                var reportType = $("input[name=report_type]:checked").val();
                if(!reportType){
                    alert("请选择举报原因！");
                    return false;
                }
                var otherInfo = "";
                switch (reportType) {
                    case '3':
                        otherInfo = $("#originalurl").val();
                        if (otherInfo == ""||otherInfo=="http://") {
                            alert("举报抄袭必须提供原创文章地址！");
                            $("#originalurl").focus();
                            return false;
                        } else if(!checkeURL(otherInfo)) {
                            alert("请输入正确的原创文章地址！");
                            $("#originalurl").focus();
                            return false;
                        }
                        break;
                    case '7':
                        otherInfo = $("#report_other_content").val();
                        if (isComment && !otherInfo) {
                            alert("请填写举报的具体原因！");
                            $("#report_other_content").focus();
                            return false;
                        }
                        if(!isComment){
                            if(!$("#report_description").val()){
                                alert("请填写举报的具体原因！");
                                $("#report_description").focus();
                                return false;
                            }
                        }
                        break;
                }
                if(!isComment){
                    if($("#report_description").val().length>30){
                        alert("举报原因最多只允许输入30个字！");
                        return false;
                    }
                }
                nowTime = {
                  year: new Date().getFullYear(),
                  month: parseInt(new Date().getMonth())+1,
                  day: new Date().getDate(),
                  hours: parseInt(new Date().getHours()),
                  minutes: parseInt(new Date().getMinutes()),
                  seconds: parseInt(new Date().getSeconds())
                }
                var data = {
                    articleId: fileName,
                    commentId: 0,
                    reportType: reportType,
                    originalurl: $("#originalurl").val(),
                    report_other_content: $("#report_other_content").val(),
                    report_description: $("#report_description").val(),
                    currentUserName: currentUserName,
                    updatetime: nowTime.year+'/'+nowTime.month+'/'+nowTime.day+' '+ nowTime.hours+':'+nowTime.minutes+':'+seconds,
                    blogUser: username
                };
                if(!isComment){//如果是举报文章
                    data.report_other_content = data.report_description;
                    // data.report_description = "1. 神经网络这是一个常见的神经网络的图：这是一个常见的三层神经网络的基本构成，Layer L1是输入层，Layer L2是隐含层";
                }

                $.post(blog_address + "/common/report?id="+fileName+"&t=2", data, function (data) {
                    if (data.result == 1){
                        SetError("感谢您的举报，我们会尽快审核！");
                    }else{
                        if (data.content) alert(data.content);
                    }

                });
                return false;
            });

            $("#btnCloseReportDialog").click(function () {
                CloseDiv();
            });

        });

        //提示后关闭方法
        function SetError(error) {
            $("#btnCloseReportDialog").trigger("click");
            alert(error);
            CloseDiv();
        }

        //关闭方法
        function CloseDiv() {

            $.removeMask();
            $("#report_dialog").hide();
            return false;
        }

        //验证url
        function checkeURL(url){
            return /^http(s)?:\/\/([\w-]+\.)+[\w-]+/i.test(url);
        }

    </script>
</div>

<script src="http://c.csdnimg.cn/public/common/libs/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/public/res/bower-libs/MathJax/MathJax.js?config=TeX-AMS_HTML"></script>
<script type="text/javascript" src="http://passport.csdn.net/content/loginbox/login.js"></script>

<script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/js/blog_ver.js?v=2017.042"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/js/skin2017.js?v=2017.042"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/scripts/cnick.js"></script>
<script>window._bd_share_config = { "common": { "bdSnsKey": {}, "bdText": "", "bdMini": "1", "bdMiniList": false, "bdPic": "", "bdStyle": "0", "bdSize": "16" }, "share": {} }; with (document) 0[(getElementsByTagName('head')[0] || body).appendChild(createElement('script')).src = 'http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion=' + ~(-new Date() / 36e5)];</script>
<script type="text/javascript" >
    if($(".article_collect li").length==1){$(".article_collect").hide();}
    if($(".article_tags li").length==1){$(".article_tags").hide();}
    $(".edit a").attr("href","http://write.blog.csdn.net/postedit/"+fileName);
    $.each($(".edu_li a"),function(){$(this).attr("href",$(this).attr("href").replace("blog7","blog9"))});
    new CNick('#uid').showNickname();
if($("#fan").html()=="")
{
$("#fan").html(0);	
}

	var blogCustomType ='{customtype}';
                
        $("#custom"+blogCustomType).show();
</script>
</body>

<script  type="text/javascript">
    var fromjs=$("#fromjs");
    if(fromjs.length>0)
    {                  
        $("#fromjs .markdown_views pre").addClass("prettyprint");       
        prettyPrint();

        $('pre.prettyprint code').each(function () {
            var lines = $(this).text().split('\n').length;
            var $numbering = $('<ul/>').addClass('pre-numbering').hide();
            $(this).addClass('has-numbering').parent().append($numbering);
            for (i = 1; i <= lines; i++) {
                $numbering.append($('<li/>').text(i));
            };
            $numbering.fadeIn(1700);
        });

        $('.pre-numbering li').css("color","#999");             
    }

    $(function(){
        setTimeout(function(){
            $(".math").each(function(index,value){$(this).find("span").last().css("color","#fff"); })
        },500);         
       

    });

    setTimeout(function () {
        $(".toc a[target='_blank']").attr("target", "");
    }, 500);

</script>
</html>



<!DOCTYPE html>
<html>
<head>
            <link rel="canonical" href="http://blog.csdn.net/js1568/article/details/78042431"/> 

    <script type="text/javascript">
        var username = "js1568";var _blogger = username;var blog_address = "http://blog.csdn.net/js1568";var static_host = "http://static.blog.csdn.net";
        var currentUserName = "js1568"; var fileName = '78042431';var commentscount = 0; var islock = false
        window.quickReplyflag = true;
        var totalFloor=0;
                
                 var isBole = false;
                
                
                 var isDigg = false;
                
          
             var isExpert=false;
        
          
        var isAdm=false;
        

    </script>

<meta http-equiv="content-type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <script src="http://c.csdnimg.cn/public/common/libs/jquery/jquery-1.9.1.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/common/libs/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/static/css/avatar.css">
    <link type="text/css" rel="stylesheet" href="http://static.blog.csdn.net/scripts/SyntaxHighlighter/styles/default.css" />
    <link rel="stylesheet" href="http://static.blog.csdn.net/Skin/skin3-template/css/style.css?v=2017.042">
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/common/toolbar/content_toolbar_css/content_toolbar.css?v5.00.37">
              <!-- adhoc sdk -->
		<script src=https://sdk.appadhoc.com/ab.plus.js></script>
		<script>
		adhoc('init', {
		  appKey: 'ADHOC_0e0bce4f-8793-4f68-89cf-34c14f2532bb',
		  defaultFlags: {isLogin: true}
		})
		</script>
              <!-- adhoc sdk end -->
    
	<script src="//static.blog.csdn.net/public/switchHome/switchHome.js?v=2017.43"></script>	
	
    <script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/fonts/iconfont.js"></script>
    <script src="//csdnimg.cn/rabbit/exposure-click/main.js?v1.15.23"></script>
    <script type="text/javascript" src="http://c.csdnimg.cn/pubfooter/js/tracking_for_recommend.js?v=0911" charset="utf-8"></script>
    <script type="text/javascript" src="http://csdnimg.cn/pubfooter/js/tracking.js" charset="utf-8"></script>
    <script type="text/javascript" src="http://static.blog.csdn.net/scripts/cnick.js" charset="utf-8"></script>
 
    <link rel="stylesheet" href="http://static.blog.csdn.net/code/prettify.css" />
    <script type="text/javascript" src="http://static.blog.csdn.net/code/prettify.js"></script>
<script src="http://dup.baidustatic.com/js/ds.js"></script>
    <script type="text/javascript">

        // Traffic Stats of the entire Web site By baidu
        var _hmt = _hmt || [];
        (function() {
            var hm = document.createElement("script");
            hm.src = "https://hm.baidu.com/hm.js?6bcd52f51e9b3dce32bec4a3997715ac";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
        // Traffic Stats of the entire Web site By baidu end



    </script>
    <meta name="description" content="线性代数中的范数" />
    <meta name="keywords" content="机器学习,线性代数" />
    <meta http-equiv="Cache-Control" content="no-siteapp" /><link rel="alternate" media="handheld" href="#" />
    <meta name="shenma-site-verification" content="5a59773ab8077d4a62bf469ab966a63b_1497598848">


    <title>线性代数中的范数 - CSDN博客</title>
</head>
<body>
<script id="toolbar-tpl-scriptId" prod="download" skin="black" src="http://c.csdnimg.cn/public/common/toolbar/js/content_toolbar.js?v5.00.37" type="text/javascript" domain="http://blog.csdn.net"></script>

<div class="container clearfix">
    <main>
        <article>
            <h1 class="csdn_top">线性代数中的范数</h1>
            <div class="article_bar clearfix">
                <div class="artical_tag">
                    <span class="original">转载</span>
                    <span class="time">2017年09月20日 16:31:53</span>
                </div>
				<ul class="article_tags clearfix csdn-tracking-statistics" data-mod="popu_377">
					<li class="tit">标签：</li>
					
					<li><a href="http://so.csdn.net/so/search/s.do?q=机器学习&t=blog" target="_blank">机器学习</a> <span>/</span></li>
					
					<li><a href="http://so.csdn.net/so/search/s.do?q=线性代数&t=blog" target="_blank">线性代数</a> <span>/</span></li>
					
				</ul>
                <ul class="right_bar">
                    <li><button class="btn-noborder"><i class="icon iconfont icon-read"></i><span class="txt">381</span></button></li>
                    <!--<li><button class="btn-noborder"><i class="icon iconfont icon-dashang-"></i><span class="txt">0</span></button></li>-->

                    <li class="edit">
                        <a class="btn-noborder" href="" >
                            <i class="icon iconfont icon-bianji"></i><span class="txt">编辑</span>
                        </a>
                    </li>
                    <li class="del">
                        <a class="btn-noborder" onclick="javascript:deleteArticle(fileName);return false;">
                            <i class="icon iconfont icon-shanchu"></i><span class="txt">删除</span>
                        </a>
                    </li>
                </ul>
            </div>
            <div id="article_content" class="article_content csdn-tracking-statistics" data-mod="popu_519" data-dsm="post">
                <div class="markdown_views"><p>向量范数</p>

<ul>
<li>0-范数：向量中非零元素个数</li>
<li>1-范数： <img src="https://www.zhihu.com/equation?tex=%7C%7Cx%7C%7C_1%20=%20%5Csum_%7Bi=1%7D%5EN%7Cx_i%7C" alt="" title="">，即向量元素绝对值之和，matlab调用函数norm(x, 1) 。</li>
<li>2-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_2%20=%5Csqrt%7B%5Csum_%7Bi=1%7D%5ENx_i%5E2%7D" alt="" title="">，Euclid范数（欧几里得范数，常用计算向量长度），即向量元素绝对值的平方和再开方，matlab调用函数norm(x, 2)。</li>
<li><img src="https://www.zhihu.com/equation?tex=%5Cinfty" alt="" title=""> -范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_%5Cinfty%20=%20%5Cmax_%7Bi%7D%7Cx_i%7C" alt="" title="">，即所有向量元素绝对值中的最大值，matlab调用函数norm(x, inf)。</li>
<li><img src="https://www.zhihu.com/equation?tex=-%5Cinfty" alt="" title="">-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_%7B-%5Cinfty%7D=%5Cmin_i%7Cx_i%7C" alt="" title="">，即所有向量元素绝对值中的最小值，matlab调用函数norm(x, -inf)。</li>
<li>p-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_p%20=%20%28%5Csum_%7Bi=1%7D%5EN%7Cx_i%7C%5Ep%29%5E%7B%5Cfrac%7B1%7D%7Bp%7D%7D" alt="" title="">，即向量元素绝对值的p次方和的1/p次幂，matlab调用函数norm(x, p)。</li>
</ul>

<p>矩阵范数</p>

<ul>
<li>1-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_1%20=%20%5Cmax_j%5Csum_%7Bi=1%7D%5Em%7Ca_%7Bi,j%7D%7C" alt="" title="">， 列和范数，即所有矩阵列向量绝对值之和的最大值，matlab调用函数norm(A, 1)。</li>
<li>2-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_2%20=%20%5Csqrt%7B%5Clambda_1%7D" alt="" title="">，<img src="https://www.zhihu.com/equation?tex=%5Clambda%3Cbr/%3E" alt="" title="">为的最大特征值。，谱范数，即A’A矩阵的最大特征值的开平方。matlab调用函数norm(x, 2)。</li>
<li><img src="https://www.zhihu.com/equation?tex=%5Cinfty" alt="" title="">-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_%5Cinfty%20=%20%5Cmax_i%5Csum_%7Bj=1%7D%5EN%7Ca_%7Bi,j%7D%7C" alt="" title="">，行和范数，即所有矩阵行向量绝对值之和的最大值，matlab调用函数norm(A, inf)。</li>
<li>F-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_F=%5Cleft%28%5Csum_%7Bi=1%7D%5Em%5Csum_%7Bj=1%7D%5En%7Ca_%7Bi,j%7D%7C%5E2%5Cright%29%5E%7B%5Cfrac%7B1%7D%7B2%7D%7D" alt="" title="">，Frobenius范数，即矩阵元素绝对值的平方和再开平方，matlab调用函数norm(A, ’fro‘)。</li>
<li>核范数：是A的奇异值。即奇异值之和</li>
</ul>

<p>作者：魏通 <br>
链接：<a href="https://www.zhihu.com/question/20473040/answer/102907063" target="_blank">https://www.zhihu.com/question/20473040/answer/102907063</a> <br>
来源：知乎 <br>
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。</p><link rel="stylesheet" href="http://static.blog.csdn.net/public/res-min/markdown_views.css?v=2.0" /></div><link rel="stylesheet" href="http://static.blog.csdn.net/public/res-min/markdown_views.css?v=2.0" />
            </div>
        </article>
        <div class="readall_box csdn-tracking-statistics" data-mod="popu_376">
			<div class="read_more_mask"></div>
            <a class="btn btn-large btn-gray-fred read_more_btn" target="_self">阅读全文</a>
        </div>
        <div class="article_copyright">
            
        </div>
        <!--  <div class="reward_box">
            <div class="tit">
              <button class="btn_reward"><i class="icon iconfont icon-dashang-"></i></button>
            </div>
            <dl class="clearfix">
              <dt><a href="#" target="_blank">近期打赏</a></dt>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
            </dl>
          </div>-->

        <ul class="article_collect clearfix csdn-tracking-statistics"  data-mod="popu_378">
            <li class="tit">本文已收录于以下专栏：</li>
            
        </ul>
        <div class="comment_box clearfix">
            <div id="comment_form">
                <div id="commentsbmitarear">
                    <!-- <h6><span>0</span>条评论</h6> -->
           <!--          <dl class="clearfix" id="commentbox">
                        <dt>
                            <a href="http://my.csdn.net/js1568"><img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg" ></a>
                        </dt>
                        <dd>
                            <a href="http://my.csdn.net/js1568" target="_blank">js1568</a>
                        </dd>
                        <dd class="txt_tip"><span id="tip_comment" class="tip"></span></dd>
                    </dl> -->
                    <div class="comment_area clearfix">
						<div class="userimg"><a href="http://my.csdn.net/js1568"><img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg"></a></div>
                        <form action="/js1568/comment/submit?id=78042431" method="post" onsubmit="return subform(this);" id="commentform">
                            <textarea class="comment_content" name="comment_content" id="comment_content" placeholder="发表你的评论"></textarea>
                            <div class="bot_bar clearfix">
                                <div id="ubbtools" class="add_code">
                                    <a href="#insertcode" code="code" target="_self"><i class="icon iconfont icon-daima"></i></a>
                                </div>

                                <input type="hidden" id="comment_replyId" name="comment_replyId">
                                <input type="hidden" id="comment_userId" name="comment_userId" value="">
                                <input type="hidden" id="commentId" name="commentId" value="">
                                <input type="submit" class="btn btn-redborder" value="发表评论">
								<span id="tip_comment" class="tip">
                                <div style="display: none;" class="csdn-tracking-statistics" data-mod="popu_384"><a href="#" target="_blank" class="comment_area_btn">发表评论</a></div>

                                <div id="lang_list" code="code">
                                    <a href="#html" style="width:95px;" class="long_name" target="_self">HTML/XML</a>
                                    <a href="#objc" style="width:95px;" class="long_name" target="_self">objective-c</a>
                                    <a href="#delphi" style="width:58px;" class="zhong_name" target="_self">Delphi</a>
                                    <a href="#ruby" class="zhong_name" target="_self">Ruby</a>
                                    <a href="#php" target="_self">PHP</a>
                                    <a href="#csharp" class="duan_name" target="_self">C#</a>
                                    <a style=" border-right: none;" href="#cpp" class="duan_name" target="_self">C++</a>
                                    <a style=" border-bottom:none;width:95px;" href="#javascript" class="long_name" target="_self">JavaScript</a>
                                    <a style=" border-bottom:none;width:95px;" href="#vb" class="long_name" target="_self">Visual Basic</a>
                                    <a style=" border-bottom:none;" href="#python" class="zhong_name" target="_self">Python</a>
                                    <a style=" border-bottom:none;" href="#java" class="zhong_name" target="_self">Java</a>
                                    <a style="border-bottom:none;" href="#css" class="duan_name" target="_self">CSS</a>
                                    <a style="border-bottom:none;" href="#sql" class="duan_name" target="_self">SQL</a>
                                    <a style="border:none; " href="#plain" class="duan_name" target="_self">其它</a>
                                    <span class="arrb"></span>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <div class="comment_li_outbox">
            <div id="comment_list"></div>
        </div>

        <div class="more_comment">
            <div id="comment_bar" class="trackgin-ad" data-mod="popu_385"></div>
        </div>

        <h3 class="recommend_tit">相关文章推荐</h3>
        <div class="recommend_list clearfix">
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/wylfll/article/details/47950593"  target="_blank" strategy="BlogCommendFromCF_0">在jsp中如何实现网页的自动更新</a></h2>
                    <div class="summary">
                        在jsp中如何实现网页的自动更新
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/wylfll" target="_blank" strategy="BlogCommendFromCF_0"><img src="http://avatar.csdn.net/E/4/0/2_wylfll.jpg" alt="wylfll" title="wylfll"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/wylfll">wylfll</a></li>
                        <li class="time">2015-08-24 14:27</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>410</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/js1568/article/details/73434001"  target="_blank" strategy="BlogCommendFromCF_1">最小生成树-Prim算法和Kruskal算法</a></h2>
                    <div class="summary">
                        最小生成树-Prim算法和Kruskal算法
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/js1568" target="_blank" strategy="BlogCommendFromCF_1"><img src="http://avatar.csdn.net/B/A/D/2_js1568.jpg" alt="js1568" title="js1568"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/js1568">js1568</a></li>
                        <li class="time">2017-06-18 17:19</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>88</span></li>
                    </ul>
                </dd>
            </dl>
            
            <!--dl class="clearfix csdn-tracking-statistics" data-mod="popu_393">
                <dt><a href="http://edu.csdn.net/huiyiCourse/series_detail/64?utm_source=blog10" target="_blank"><img class="maxwidth" src="http://img.blog.csdn.net/20170928113144608" alt="" title=""></a></dt>
                <dd>
                    <div class="summary">
                        <h2><a href='http://edu.csdn.net/topic/python1?utm_source=blog10' target='_blank'>伤心啊！年度热门编程语言排行榜出来了...</a></h2>  <div class="summary">近期，IEEE Spectrum 发布了第四届顶级编程语言交互排行榜。结合 10 个线上数据源的 12 个标准，对 48 种语言进行了排行！此外，七牛云许式伟曾说过Go语言会取代Java...气氛... </div> 
                    </div>
                </dd>
            </dl-->
	<script>
		(function() {
		    var s = "_" + Math.random().toString(36).slice(2);
		    document.write('<div id="' + s + '"></div>');
		    (window.slotbydup=window.slotbydup || []).push({
			id: '4765209',
			container: s,
			size: '808,120',
			display: 'inlay-fix'
		    });
		})();
	</script>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/myarrow/article/details/51188553"  target="_blank" strategy="BlogCommendFromCsdn_2">线性代数常用基本知识 (含向量和矩阵范数&lt;Matrix or vector norm&gt;)</a></h2>
                    <div class="summary">
                        1. 行列式
1.1 二阶行列式




1.2 三阶行列式
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/MyArrow" target="_blank" strategy="BlogCommendFromCsdn_2"><img src="http://avatar.csdn.net/C/1/6/2_myarrow.jpg" alt="MyArrow" title="MyArrow"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/MyArrow">MyArrow</a></li>
                        <li class="time">2016-04-19 11:07</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>8551</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/mathmetics/article/details/9279367"  target="_blank" strategy="BlogCommendFromCsdn_3">线性代数(七) : 子空间的基与维数</a></h2>
                    <div class="summary">
                        子空间的基与维数
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/xxingjjing" target="_blank" strategy="BlogCommendFromCsdn_3"><img src="http://avatar.csdn.net/5/D/7/2_xxingjjing.jpg" alt="xxingjjing" title="xxingjjing"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/xxingjjing">xxingjjing</a></li>
                        <li class="time">2013-07-11 10:29</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>2984</span></li>
                    </ul>
                </dd>
            </dl>
            <!-- 广告位：PC端-博客详情通栏7（feed流）-808*120 --><script> (function() {    var s = "_" + Math.random().toString(36).slice(2);   document.write('<div id="' + s + '"></div>');    (window.slotbydup=window.slotbydup || []).push({        id: '4983339',       container: s,        size: '808,120',        display: 'inlay-fix'    }); })();  </script>
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/qq_28306361/article/details/50800972"  target="_blank" strategy="BlogCommendFromCsdn_4">线性代数复习四——矩阵的维数和秩</a></h2>
                    <div class="summary">
                        复习
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/qq_28306361" target="_blank" strategy="BlogCommendFromCsdn_4"><img src="http://avatar.csdn.net/8/6/2/2_qq_28306361.jpg" alt="qq_28306361" title="qq_28306361"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/qq_28306361">qq_28306361</a></li>
                        <li class="time">2016-03-04 10:57</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>1835</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics downloadElement" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
               	<dt><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank" strategy="BlogCommendFromCsdn_5"><img class="maxwidth" src="http://download.csdn.net/images/minetype/rar.svg" alt="" title=""></a></dt>
		<dd>
			<div class="summary">
				<h2><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank" strategy="BlogCommendFromCsdn_5">高校教学资源，高数，线性代数等</a></h2>
				<div class="summary">
				  <ul>
					  <li class="time">2011-04-02 21:01</li>
					  <li class="visited_num fileSize">3.32MB</li>
					  <li class="download_btn"><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank">下载</a></li>
				  </ul>
				</div> 
			</div>
		</dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics downloadElement" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
               	<dt><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank" strategy="BlogCommendFromCsdn_6"><img class="maxwidth" src="http://download.csdn.net/images/minetype/rar.svg" alt="" title=""></a></dt>
		<dd>
			<div class="summary">
				<h2><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank" strategy="BlogCommendFromCsdn_6">考研数学公式（线性代数+概率论+高数）合集</a></h2>
				<div class="summary">
				  <ul>
					  <li class="time">2010-03-02 20:44</li>
					  <li class="visited_num fileSize">815KB</li>
					  <li class="download_btn"><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank">下载</a></li>
				  </ul>
				</div> 
			</div>
		</dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/suqier1314520/article/details/12584479"  target="_blank" strategy="BlogCommendFromCsdn_7">线性代数导论9——线性相关性、基、维数</a></h2>
                    <div class="summary">
                        本文是Gilbert Strang的线性代数导论课程笔记。课程地址：http://v.163.com/special/opencourse/daishu.html&#160;&#160;
第九课时：线性相关性、基、维数...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/suqier1314520" target="_blank" strategy="BlogCommendFromCsdn_7"><img src="http://avatar.csdn.net/5/6/9/2_suqier1314520.jpg" alt="suqier1314520" title="suqier1314520"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/suqier1314520">suqier1314520</a></li>
                        <li class="time">2013-10-10 19:28</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>4187</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/tengweitw/article/details/40921209"  target="_blank" strategy="BlogCommendFromCsdn_8">【线性代数】线性相关性、基和维数</a></h2>
                    <div class="summary">
                        一、线性相关性

&#160; &#160; &#160; 什么情况下，向量X1，X2，……，Xn是线性无关的？


&#160; &#160;&#160;&#160; 答：当向量X1，X2，……，Xn的线性组合(线性组合时系数不能全为0)不为零向量时，它们是线性无关的...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/tengweitw" target="_blank" strategy="BlogCommendFromCsdn_8"><img src="http://avatar.csdn.net/B/E/9/2_tengweitw.jpg" alt="tengweitw" title="tengweitw"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/tengweitw">tengweitw</a></li>
                        <li class="time">2014-11-09 14:29</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>1551</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/u010182633/article/details/52331744"  target="_blank" strategy="BlogCommendFromCsdn_9">漫步线性代数十——线性无关，基和维数</a></h2>
                    <div class="summary">
                        m,nm,n没有给出线性系统实际大小的真实信息，在我们上文的例子中有三行和四列，但是第三行仅仅是前两行的组合，在消元后得到了零行，它对奇次问题Ax=0Ax=0 没有影响。第四列同样是相关的，列空间减到...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/u010182633" target="_blank" strategy="BlogCommendFromCsdn_9"><img src="http://avatar.csdn.net/2/2/4/2_u010182633.jpg" alt="u010182633" title="u010182633"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/u010182633">u010182633</a></li>
                        <li class="time">2016-08-26 21:16</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>974</span></li>
                    </ul>
                </dd>
            </dl>
            

	   

            

            
        </div>
    </main>
    <aside>
        <div class="right_box user_info">
            <dl class="inf_bar clearfix">
                <dt class="csdn-tracking-statistics" data-mod="popu_381">
                    <a href="http://blog.csdn.net/js1568" target="_blank">
                        <img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg" class="avatar_pic">
                    </a>
                    <span class="medals" title="">
                <svg class="icon" aria-hidden="true">
                    
                </svg>
              </span>
                </dt>
                <dd>
                    <h3 class="csdn-tracking-statistics"  data-mod="popu_380"><a href="http://blog.csdn.net/js1568" target="_blank" id="uid">js1568</a></h3>
                    <span  class="csdn-tracking-statistics" data-mod="popu_379"><a class="btn btn-redborder-small "  id="span_add_follow" target="_self">＋关注</a></span>
                </dd>
            </dl>
            <div class="inf_number_box clearfix">
                <dl>
                    <dt>原创</dt>
                    <dd>15</dd>
                </dl>
                <dl>
                    <dt>粉丝</dt>
                    <dd id='fan'>3</dd>
                </dl>
                <dl>
                    <dt>喜欢</dt>
                    <dd>0</dd>
                </dl>
								 <dl>
              <dt>码云</dt>
              <dd>&nbsp;</dd>
            </dl>

            </div>
	    <div class="writings">
              <div class="public_signal clearfix">
                <h3>他的最新文章</h3>
                <a href="http://blog.csdn.net/js1568" target="_blank" class="more_z"><span>更多文章</span></a>
              </div>
                <ul class="inf_list clearfix csdn-tracking-statistics" data-mod="popu_382">
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429272" target="_blank">统计学习方法 7-支持向量机</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429192" target="_blank">统计学习方法 6-逻辑斯谛回归与最大熵模型</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429164" target="_blank">统计学习方法 5-决策树</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429150" target="_blank">统计学习方法 4-朴素贝叶斯法</a>
                    </li>
                    
                </ul>
            </div>
        </div>
        <div class="extension_other csdn-tracking-statistics" data-mod="popu_389">
						<!--u3032528-->
			<div class="flashrecommend">

<!-- 请置于所有广告位代码之前 -->
<script src="http://dup.baidustatic.com/js/dm.js"></script>
           
<!-- 广告位：PC端-博客详情页右侧视窗1（feed流）-300*250 -->
<script>
(function() {
    var s = "_" + Math.random().toString(36).slice(2);
    document.write('<div id="' + s + '"></div>');
    (window.slotbydup=window.slotbydup || []).push({
        id: '4770930',
        container: s,
        size: '300,250',
        display: 'inlay-fix'
    });
})();
</script>

		    </div>
        </div>

        
        <div class="fixRight">
            <div class="right_box padb0 csdn-tracking-statistics" data-mod="popu_391">
                <h3 class="tit"><span><em>在线课程</em></span></h3>
                <ul class="edu_li clearfix">
                  
                  <li>
                    <div>
                      <a href="http://edu.csdn.net/huiyiCourse/detail/603?utm_source=blog7" target="_blank">
                        <img src="http://img.bss.csdn.net/201711101450316277.png" alt="MVVM在美团点评酒旅移动端的最佳实践" title="MVVM在美团点评酒旅移动端的最佳实践">
                      </a>
                    </div>
                    <div>
                      <p><a href="http://edu.csdn.net/huiyiCourse/detail/603?utm_source=blog7" target="_blank">MVVM在美团点评酒旅移动端的最佳实践</a></p>
                      <p>讲师：王禹华</p>
                    </div>
                  </li>
                  
                  <li>
                    <div>
                      <a href="http://edu.csdn.net/huiyiCourse/detail/594?utm_source=blog7" target="_blank">
                        <img src="http://img.bss.csdn.net/201711101448389242.png" alt="C语言大型软件设计的面向对象" title="C语言大型软件设计的面向对象">
                      </a>
                    </div>
                    <div>
                      <p><a href="http://edu.csdn.net/huiyiCourse/detail/594?utm_source=blog7" target="_blank">C语言大型软件设计的面向对象</a></p>
                      <p>讲师：宋宝华</p>
                    </div>
                  </li>
                  
                </ul>
            </div>
			<!--u3032529-->
            <!-- <div class="extension_other csdn-tracking-statistics baidu_box" data-mod="popu_395">
								
                <script type="text/javascript" src="http://mpb1.iteye.com/cxpdpmumfaedgm.js"></script>
            </div> -->
			<div class="extension_other csdn-tracking-statistics bottomRcom" data-mod="popu_389" style="position:absolute;z-index:-5;opacity:0;pointer-events:none">
						<!--u3032528-->
				<div class="flashrecommend">
				<script type="text/javascript" src="http://mpb1.iteye.com/bwocoltlyzdec.js"></script>
				</div>
			</div>
        </div>
		<div class="user-hotArticle">
          <h3>热门文章</h3>
          <ul class="hotArticle-list csdn-tracking-statistics" data-mod="popu_521">
 
            <li>
              <a href="/js1568/article/details/78042431">线性代数中的范数</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>377</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/73385734">八大（基于比较）排序算法</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>371</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/66476086">先序，中序，后序线索化二叉树</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>313</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/64905555">机器学习（周志华 ）-2模型评估与选择</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>313</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/68066618">字符串匹配的KMP算法</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>309</span></div>
            </li>
 
          </ul>
        </div>


    </aside>
</div>

<div class="left_fixed">
      <div class="left_show_button">
        <span>
          <i class="icon iconfont icon-youjiantou"></i>
        </span>
      </div>
    <ul class="left_menu">

        <li>
            <button class="left-fixed-btn btn-like csdn-tracking-statistics" data-mod="popu_373" target="_self">
                <span class="iconbox border_red"><i class="icon iconfont icon-dianzan"></i></span>
				<span class="txt">0</span>
            </button>
        </li>
		<li id="blog_artical_directory">
            <button class="left-fixed-btn left_menu_btn csdn-tracking-statistics" data-mod="popu_372" target="_self">
                <span class="iconbox border_black"><i class="icon iconfont icon-mulu"></i></span>
            </button>
        </li>
        <li class="menu_con">
            <div class="list_father">
                <div class="arr_box">
                    <button class="btn-noborder arr-btn scroll-down  left_scroll_down"><i class="icon iconfont icon-xiajiantou"></i></button>
                    <button class="btn-noborder arr-btn scroll-up left_scroll_top"><i class="icon iconfont icon-shangjiantou"></i></button>
                </div>
                <div class="arr"></div>
                <div id="csdnBlogDir"></div>
            </div>
        </li>
        <li>
            <button class="left-fixed-btn csdn-tracking-statistics" data-mod="popu_374"  id="com-quick-collect" target="_self">
                <span class="iconbox border_purple"><i class="icon iconfont icon-shoucang"></i></span>
    
            </button>
        </li>
		<li>
          <button class="left-fixed-btn btn-pinglun" >
            <span class="iconbox border_purple"><i class="icon iconfont icon-pinglun"></i></span>
          </button>
        </li>
        <li id="share_box">
            <button class="left-fixed-btn  csdn-tracking-statistics"  data-mod="popu_375" target="_self">
                <span class="iconbox border_orange"><i class="icon iconfont icon-fenxiang"></i></span>
            </button>
            <div class="bdsharebuttonbox csdn-tracking-statistics" data-mod="popu_172">
                <div class="outside">
                    <span class="iconbox border_red2"><i class="icon iconfont icon-xinlang"></i></span>
                    <a href="#" class="bds_tsina" data-cmd="tsina" title="分享到新浪微博"> </a>
                </div>
                <div class="outside">
                    <span class="iconbox border_green"><i class="icon iconfont icon-weixin"></i></span>
                    <a href="#" class="bds_weixin" data-cmd="weixin" title="分享到微信"> </a>
                </div>
                <div class="outside">
                    <span class="iconbox border_blue"><i class="icon iconfont icon-QQ"></i></span>
                    <a href="#" class="bds_qzone" data-cmd="qzone" title="分享到QQ空间"> </a>
                </div>
            </div>
        </li>
    </ul>
</div>
<div class="right_fixed">
  <div class="r_ico">
	<i class="icon iconfont icon-jubao"></i>
	<span class="txt" id="reportBtn">内容举报</span>
  </div>
  <div class="returnTop">
   <i class="icon iconfont icon-fanhuidingbu"></i>
   <span>返回顶部</span>
 </div>
</div>
<div id="pop_win"></div>
<div id="popup_mask"></div>
<div class="pop_CA_cover" ></div>
<div class="pop pop_CA" >
    <div class="CA_header">
        收藏助手
        <span class="cancel_icon"  id="fapancle" ></span>
    </div>
    <iframe src="" id="collectIframe" frameborder="0" width="100%" height="360"  scrolling="no" ></iframe>
</div>
<!--举报-->
<div id="report_dialog" style="top: 250px; left: 343.5px;"><div id="panel_report">
    <div class="panel_head">不良信息举报</div>
    <form method="post" id="frmReport" class="panel_body">
        <table border="0" cellpadding="0" cellspacing="4" class="pop_table">
            <tbody><tr><td colspan="2">您举报文章：<a href="http://blog.csdn.net/raintungli/article/details/76583070" target="_blank">深度学习：神经网络中的前向传播和反向传播算法推导</a></td></tr>
            <tr>
                <th style="width:60px;">举报原因：</th>
                <td id="panel_reporttype">
                    <label><input type="radio" class="report_type" id="report_sex" name="report_type" value="1">色情</label>
                    <label><input type="radio" class="report_type" id="report_Politics" name="report_type" value="2">政治</label>
                    <label><input type="radio" class="report_type" id="report_copy" name="report_type" value="3">抄袭</label>
                    <label><input type="radio" class="report_type" id="report_ad" name="report_type" value="4">广告</label>
                    <label><input type="radio" class="report_type" id="report_want" name="report_type" value="5">招聘</label>
                    <label><input type="radio" class="report_type" id="report_call" name="report_type" value="6">骂人</label>
                    <br>
                    <label><input type="radio" class="report_type" id="report_other" name="report_type" value="7">其他</label>
                    <input type="text" name="report_other_content" id="report_other_content" maxlength="30" style="display: none;">
                </td>
            </tr>
            <tr id="panel_originalurl" style="display: none;">
                <th>原文地址：</th>
                <td>
                    <input id="originalurl" value="http://" name="originalurl" type="text" style="width: 90%;">
                </td>
            </tr>
            <tr>
                <th id="sp_reason">原因补充：</th>
                <td>
                    <textarea id="report_description" style="width: 300px;" rows="3" name="report_description"></textarea>
                    <p id="sp_n" style="color:#999;margin:0px;padding:0px;">(最多只允许输入30个字)</p>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input id="btnSubmitReport" name="submit" type="image" align="middle" class="btn_1" src="http://static.blog.csdn.net/images/btn_submit.jpg">
                    <span style="padding-left:20px;"></span>
                    <img id="btnCloseReportDialog" src="http://static.blog.csdn.net/images/btn_cancel.jpg" align="middle">
                    <div id="error" style="color: Red">
                    </div>
                </td>
            </tr>
            </tbody></table>
    </form>
</div>
    <script language="javascript" type="text/javascript">
        var isComment=0;
        //显示隐藏地址
        $(function () {
            if(isComment){
                $("#report_description").attr("disabled",true);
                $("#sp_n").hide();
                $("#sp_reason").html("评论内容：");
            }
            $(".report_type").click(function () {
                $("#panel_originalurl,#report_other_content").hide();
                switch ($(this).val()) {
                    case '3':
                        $("#panel_originalurl").show();
                        $("#originalurl").focus();
                        break;
                    case '7':
                        if(isComment){
                            $("#report_other_content").show().focus();
                        }
                        break;
                }

            });

            $("#frmReport").submit(function () {
                if (!currentUserName) {

                    if (confirm("您的操作必须登录，是否登录？")) {
                        location.href = "http://passport.csdn.net/account/login?from=" + encodeURIComponent(location.href);
                        return false;
                    }
                    return false;
                }

                var reportType = $("input[name=report_type]:checked").val();
                if(!reportType){
                    alert("请选择举报原因！");
                    return false;
                }
                var otherInfo = "";
                switch (reportType) {
                    case '3':
                        otherInfo = $("#originalurl").val();
                        if (otherInfo == ""||otherInfo=="http://") {
                            alert("举报抄袭必须提供原创文章地址！");
                            $("#originalurl").focus();
                            return false;
                        } else if(!checkeURL(otherInfo)) {
                            alert("请输入正确的原创文章地址！");
                            $("#originalurl").focus();
                            return false;
                        }
                        break;
                    case '7':
                        otherInfo = $("#report_other_content").val();
                        if (isComment && !otherInfo) {
                            alert("请填写举报的具体原因！");
                            $("#report_other_content").focus();
                            return false;
                        }
                        if(!isComment){
                            if(!$("#report_description").val()){
                                alert("请填写举报的具体原因！");
                                $("#report_description").focus();
                                return false;
                            }
                        }
                        break;
                }
                if(!isComment){
                    if($("#report_description").val().length>30){
                        alert("举报原因最多只允许输入30个字！");
                        return false;
                    }
                }
                nowTime = {
                  year: new Date().getFullYear(),
                  month: parseInt(new Date().getMonth())+1,
                  day: new Date().getDate(),
                  hours: parseInt(new Date().getHours()),
                  minutes: parseInt(new Date().getMinutes()),
                  seconds: parseInt(new Date().getSeconds())
                }
                var data = {
                    articleId: fileName,
                    commentId: 0,
                    reportType: reportType,
                    originalurl: $("#originalurl").val(),
                    report_other_content: $("#report_other_content").val(),
                    report_description: $("#report_description").val(),
                    currentUserName: currentUserName,
                    updatetime: nowTime.year+'/'+nowTime.month+'/'+nowTime.day+' '+ nowTime.hours+':'+nowTime.minutes+':'+seconds,
                    blogUser: username
                };
                if(!isComment){//如果是举报文章
                    data.report_other_content = data.report_description;
                    // data.report_description = "1. 神经网络这是一个常见的神经网络的图：这是一个常见的三层神经网络的基本构成，Layer L1是输入层，Layer L2是隐含层";
                }

                $.post(blog_address + "/common/report?id="+fileName+"&t=2", data, function (data) {
                    if (data.result == 1){
                        SetError("感谢您的举报，我们会尽快审核！");
                    }else{
                        if (data.content) alert(data.content);
                    }

                });
                return false;
            });

            $("#btnCloseReportDialog").click(function () {
                CloseDiv();
            });

        });

        //提示后关闭方法
        function SetError(error) {
            $("#btnCloseReportDialog").trigger("click");
            alert(error);
            CloseDiv();
        }

        //关闭方法
        function CloseDiv() {

            $.removeMask();
            $("#report_dialog").hide();
            return false;
        }

        //验证url
        function checkeURL(url){
            return /^http(s)?:\/\/([\w-]+\.)+[\w-]+/i.test(url);
        }

    </script>
</div>

<script src="http://c.csdnimg.cn/public/common/libs/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/public/res/bower-libs/MathJax/MathJax.js?config=TeX-AMS_HTML"></script>
<script type="text/javascript" src="http://passport.csdn.net/content/loginbox/login.js"></script>

<script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/js/blog_ver.js?v=2017.042"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/js/skin2017.js?v=2017.042"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/scripts/cnick.js"></script>
<script>window._bd_share_config = { "common": { "bdSnsKey": {}, "bdText": "", "bdMini": "1", "bdMiniList": false, "bdPic": "", "bdStyle": "0", "bdSize": "16" }, "share": {} }; with (document) 0[(getElementsByTagName('head')[0] || body).appendChild(createElement('script')).src = 'http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion=' + ~(-new Date() / 36e5)];</script>
<script type="text/javascript" >
    if($(".article_collect li").length==1){$(".article_collect").hide();}
    if($(".article_tags li").length==1){$(".article_tags").hide();}
    $(".edit a").attr("href","http://write.blog.csdn.net/postedit/"+fileName);
    $.each($(".edu_li a"),function(){$(this).attr("href",$(this).attr("href").replace("blog7","blog9"))});
    new CNick('#uid').showNickname();
if($("#fan").html()=="")
{
$("#fan").html(0);	
}

	var blogCustomType ='{customtype}';
                
        $("#custom"+blogCustomType).show();
</script>
</body>

<script  type="text/javascript">
    var fromjs=$("#fromjs");
    if(fromjs.length>0)
    {                  
        $("#fromjs .markdown_views pre").addClass("prettyprint");       
        prettyPrint();

        $('pre.prettyprint code').each(function () {
            var lines = $(this).text().split('\n').length;
            var $numbering = $('<ul/>').addClass('pre-numbering').hide();
            $(this).addClass('has-numbering').parent().append($numbering);
            for (i = 1; i <= lines; i++) {
                $numbering.append($('<li/>').text(i));
            };
            $numbering.fadeIn(1700);
        });

        $('.pre-numbering li').css("color","#999");             
    }

    $(function(){
        setTimeout(function(){
            $(".math").each(function(index,value){$(this).find("span").last().css("color","#fff"); })
        },500);         
       

    });

    setTimeout(function () {
        $(".toc a[target='_blank']").attr("target", "");
    }, 500);

</script>
</html>



<!DOCTYPE html>
<html>
<head>
            <link rel="canonical" href="http://blog.csdn.net/js1568/article/details/78042431"/> 

    <script type="text/javascript">
        var username = "js1568";var _blogger = username;var blog_address = "http://blog.csdn.net/js1568";var static_host = "http://static.blog.csdn.net";
        var currentUserName = "js1568"; var fileName = '78042431';var commentscount = 0; var islock = false
        window.quickReplyflag = true;
        var totalFloor=0;
                
                 var isBole = false;
                
                
                 var isDigg = false;
                
          
             var isExpert=false;
        
          
        var isAdm=false;
        

    </script>

<meta http-equiv="content-type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <script src="http://c.csdnimg.cn/public/common/libs/jquery/jquery-1.9.1.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/common/libs/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/static/css/avatar.css">
    <link type="text/css" rel="stylesheet" href="http://static.blog.csdn.net/scripts/SyntaxHighlighter/styles/default.css" />
    <link rel="stylesheet" href="http://static.blog.csdn.net/Skin/skin3-template/css/style.css?v=2017.042">
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/common/toolbar/content_toolbar_css/content_toolbar.css?v5.00.37">
              <!-- adhoc sdk -->
		<script src=https://sdk.appadhoc.com/ab.plus.js></script>
		<script>
		adhoc('init', {
		  appKey: 'ADHOC_0e0bce4f-8793-4f68-89cf-34c14f2532bb',
		  defaultFlags: {isLogin: true}
		})
		</script>
              <!-- adhoc sdk end -->
    
	<script src="//static.blog.csdn.net/public/switchHome/switchHome.js?v=2017.43"></script>	
	
    <script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/fonts/iconfont.js"></script>
    <script src="//csdnimg.cn/rabbit/exposure-click/main.js?v1.15.23"></script>
    <script type="text/javascript" src="http://c.csdnimg.cn/pubfooter/js/tracking_for_recommend.js?v=0911" charset="utf-8"></script>
    <script type="text/javascript" src="http://csdnimg.cn/pubfooter/js/tracking.js" charset="utf-8"></script>
    <script type="text/javascript" src="http://static.blog.csdn.net/scripts/cnick.js" charset="utf-8"></script>
 
    <link rel="stylesheet" href="http://static.blog.csdn.net/code/prettify.css" />
    <script type="text/javascript" src="http://static.blog.csdn.net/code/prettify.js"></script>
<script src="http://dup.baidustatic.com/js/ds.js"></script>
    <script type="text/javascript">

        // Traffic Stats of the entire Web site By baidu
        var _hmt = _hmt || [];
        (function() {
            var hm = document.createElement("script");
            hm.src = "https://hm.baidu.com/hm.js?6bcd52f51e9b3dce32bec4a3997715ac";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
        // Traffic Stats of the entire Web site By baidu end



    </script>
    <meta name="description" content="线性代数中的范数" />
    <meta name="keywords" content="机器学习,线性代数" />
    <meta http-equiv="Cache-Control" content="no-siteapp" /><link rel="alternate" media="handheld" href="#" />
    <meta name="shenma-site-verification" content="5a59773ab8077d4a62bf469ab966a63b_1497598848">


    <title>线性代数中的范数 - CSDN博客</title>
</head>
<body>
<script id="toolbar-tpl-scriptId" prod="download" skin="black" src="http://c.csdnimg.cn/public/common/toolbar/js/content_toolbar.js?v5.00.37" type="text/javascript" domain="http://blog.csdn.net"></script>

<div class="container clearfix">
    <main>
        <article>
            <h1 class="csdn_top">线性代数中的范数</h1>
            <div class="article_bar clearfix">
                <div class="artical_tag">
                    <span class="original">转载</span>
                    <span class="time">2017年09月20日 16:31:53</span>
                </div>
				<ul class="article_tags clearfix csdn-tracking-statistics" data-mod="popu_377">
					<li class="tit">标签：</li>
					
					<li><a href="http://so.csdn.net/so/search/s.do?q=机器学习&t=blog" target="_blank">机器学习</a> <span>/</span></li>
					
					<li><a href="http://so.csdn.net/so/search/s.do?q=线性代数&t=blog" target="_blank">线性代数</a> <span>/</span></li>
					
				</ul>
                <ul class="right_bar">
                    <li><button class="btn-noborder"><i class="icon iconfont icon-read"></i><span class="txt">381</span></button></li>
                    <!--<li><button class="btn-noborder"><i class="icon iconfont icon-dashang-"></i><span class="txt">0</span></button></li>-->

                    <li class="edit">
                        <a class="btn-noborder" href="" >
                            <i class="icon iconfont icon-bianji"></i><span class="txt">编辑</span>
                        </a>
                    </li>
                    <li class="del">
                        <a class="btn-noborder" onclick="javascript:deleteArticle(fileName);return false;">
                            <i class="icon iconfont icon-shanchu"></i><span class="txt">删除</span>
                        </a>
                    </li>
                </ul>
            </div>
            <div id="article_content" class="article_content csdn-tracking-statistics" data-mod="popu_519" data-dsm="post">
                <div class="markdown_views"><p>向量范数</p>

<ul>
<li>0-范数：向量中非零元素个数</li>
<li>1-范数： <img src="https://www.zhihu.com/equation?tex=%7C%7Cx%7C%7C_1%20=%20%5Csum_%7Bi=1%7D%5EN%7Cx_i%7C" alt="" title="">，即向量元素绝对值之和，matlab调用函数norm(x, 1) 。</li>
<li>2-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_2%20=%5Csqrt%7B%5Csum_%7Bi=1%7D%5ENx_i%5E2%7D" alt="" title="">，Euclid范数（欧几里得范数，常用计算向量长度），即向量元素绝对值的平方和再开方，matlab调用函数norm(x, 2)。</li>
<li><img src="https://www.zhihu.com/equation?tex=%5Cinfty" alt="" title=""> -范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_%5Cinfty%20=%20%5Cmax_%7Bi%7D%7Cx_i%7C" alt="" title="">，即所有向量元素绝对值中的最大值，matlab调用函数norm(x, inf)。</li>
<li><img src="https://www.zhihu.com/equation?tex=-%5Cinfty" alt="" title="">-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_%7B-%5Cinfty%7D=%5Cmin_i%7Cx_i%7C" alt="" title="">，即所有向量元素绝对值中的最小值，matlab调用函数norm(x, -inf)。</li>
<li>p-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_p%20=%20%28%5Csum_%7Bi=1%7D%5EN%7Cx_i%7C%5Ep%29%5E%7B%5Cfrac%7B1%7D%7Bp%7D%7D" alt="" title="">，即向量元素绝对值的p次方和的1/p次幂，matlab调用函数norm(x, p)。</li>
</ul>

<p>矩阵范数</p>

<ul>
<li>1-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_1%20=%20%5Cmax_j%5Csum_%7Bi=1%7D%5Em%7Ca_%7Bi,j%7D%7C" alt="" title="">， 列和范数，即所有矩阵列向量绝对值之和的最大值，matlab调用函数norm(A, 1)。</li>
<li>2-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_2%20=%20%5Csqrt%7B%5Clambda_1%7D" alt="" title="">，<img src="https://www.zhihu.com/equation?tex=%5Clambda%3Cbr/%3E" alt="" title="">为的最大特征值。，谱范数，即A’A矩阵的最大特征值的开平方。matlab调用函数norm(x, 2)。</li>
<li><img src="https://www.zhihu.com/equation?tex=%5Cinfty" alt="" title="">-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_%5Cinfty%20=%20%5Cmax_i%5Csum_%7Bj=1%7D%5EN%7Ca_%7Bi,j%7D%7C" alt="" title="">，行和范数，即所有矩阵行向量绝对值之和的最大值，matlab调用函数norm(A, inf)。</li>
<li>F-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_F=%5Cleft%28%5Csum_%7Bi=1%7D%5Em%5Csum_%7Bj=1%7D%5En%7Ca_%7Bi,j%7D%7C%5E2%5Cright%29%5E%7B%5Cfrac%7B1%7D%7B2%7D%7D" alt="" title="">，Frobenius范数，即矩阵元素绝对值的平方和再开平方，matlab调用函数norm(A, ’fro‘)。</li>
<li>核范数：是A的奇异值。即奇异值之和</li>
</ul>

<p>作者：魏通 <br>
链接：<a href="https://www.zhihu.com/question/20473040/answer/102907063" target="_blank">https://www.zhihu.com/question/20473040/answer/102907063</a> <br>
来源：知乎 <br>
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。</p><link rel="stylesheet" href="http://static.blog.csdn.net/public/res-min/markdown_views.css?v=2.0" /></div><link rel="stylesheet" href="http://static.blog.csdn.net/public/res-min/markdown_views.css?v=2.0" />
            </div>
        </article>
        <div class="readall_box csdn-tracking-statistics" data-mod="popu_376">
			<div class="read_more_mask"></div>
            <a class="btn btn-large btn-gray-fred read_more_btn" target="_self">阅读全文</a>
        </div>
        <div class="article_copyright">
            
        </div>
        <!--  <div class="reward_box">
            <div class="tit">
              <button class="btn_reward"><i class="icon iconfont icon-dashang-"></i></button>
            </div>
            <dl class="clearfix">
              <dt><a href="#" target="_blank">近期打赏</a></dt>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
            </dl>
          </div>-->

        <ul class="article_collect clearfix csdn-tracking-statistics"  data-mod="popu_378">
            <li class="tit">本文已收录于以下专栏：</li>
            
        </ul>
        <div class="comment_box clearfix">
            <div id="comment_form">
                <div id="commentsbmitarear">
                    <!-- <h6><span>0</span>条评论</h6> -->
           <!--          <dl class="clearfix" id="commentbox">
                        <dt>
                            <a href="http://my.csdn.net/js1568"><img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg" ></a>
                        </dt>
                        <dd>
                            <a href="http://my.csdn.net/js1568" target="_blank">js1568</a>
                        </dd>
                        <dd class="txt_tip"><span id="tip_comment" class="tip"></span></dd>
                    </dl> -->
                    <div class="comment_area clearfix">
						<div class="userimg"><a href="http://my.csdn.net/js1568"><img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg"></a></div>
                        <form action="/js1568/comment/submit?id=78042431" method="post" onsubmit="return subform(this);" id="commentform">
                            <textarea class="comment_content" name="comment_content" id="comment_content" placeholder="发表你的评论"></textarea>
                            <div class="bot_bar clearfix">
                                <div id="ubbtools" class="add_code">
                                    <a href="#insertcode" code="code" target="_self"><i class="icon iconfont icon-daima"></i></a>
                                </div>

                                <input type="hidden" id="comment_replyId" name="comment_replyId">
                                <input type="hidden" id="comment_userId" name="comment_userId" value="">
                                <input type="hidden" id="commentId" name="commentId" value="">
                                <input type="submit" class="btn btn-redborder" value="发表评论">
								<span id="tip_comment" class="tip">
                                <div style="display: none;" class="csdn-tracking-statistics" data-mod="popu_384"><a href="#" target="_blank" class="comment_area_btn">发表评论</a></div>

                                <div id="lang_list" code="code">
                                    <a href="#html" style="width:95px;" class="long_name" target="_self">HTML/XML</a>
                                    <a href="#objc" style="width:95px;" class="long_name" target="_self">objective-c</a>
                                    <a href="#delphi" style="width:58px;" class="zhong_name" target="_self">Delphi</a>
                                    <a href="#ruby" class="zhong_name" target="_self">Ruby</a>
                                    <a href="#php" target="_self">PHP</a>
                                    <a href="#csharp" class="duan_name" target="_self">C#</a>
                                    <a style=" border-right: none;" href="#cpp" class="duan_name" target="_self">C++</a>
                                    <a style=" border-bottom:none;width:95px;" href="#javascript" class="long_name" target="_self">JavaScript</a>
                                    <a style=" border-bottom:none;width:95px;" href="#vb" class="long_name" target="_self">Visual Basic</a>
                                    <a style=" border-bottom:none;" href="#python" class="zhong_name" target="_self">Python</a>
                                    <a style=" border-bottom:none;" href="#java" class="zhong_name" target="_self">Java</a>
                                    <a style="border-bottom:none;" href="#css" class="duan_name" target="_self">CSS</a>
                                    <a style="border-bottom:none;" href="#sql" class="duan_name" target="_self">SQL</a>
                                    <a style="border:none; " href="#plain" class="duan_name" target="_self">其它</a>
                                    <span class="arrb"></span>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <div class="comment_li_outbox">
            <div id="comment_list"></div>
        </div>

        <div class="more_comment">
            <div id="comment_bar" class="trackgin-ad" data-mod="popu_385"></div>
        </div>

        <h3 class="recommend_tit">相关文章推荐</h3>
        <div class="recommend_list clearfix">
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/wylfll/article/details/47950593"  target="_blank" strategy="BlogCommendFromCF_0">在jsp中如何实现网页的自动更新</a></h2>
                    <div class="summary">
                        在jsp中如何实现网页的自动更新
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/wylfll" target="_blank" strategy="BlogCommendFromCF_0"><img src="http://avatar.csdn.net/E/4/0/2_wylfll.jpg" alt="wylfll" title="wylfll"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/wylfll">wylfll</a></li>
                        <li class="time">2015-08-24 14:27</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>410</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/js1568/article/details/73434001"  target="_blank" strategy="BlogCommendFromCF_1">最小生成树-Prim算法和Kruskal算法</a></h2>
                    <div class="summary">
                        最小生成树-Prim算法和Kruskal算法
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/js1568" target="_blank" strategy="BlogCommendFromCF_1"><img src="http://avatar.csdn.net/B/A/D/2_js1568.jpg" alt="js1568" title="js1568"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/js1568">js1568</a></li>
                        <li class="time">2017-06-18 17:19</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>88</span></li>
                    </ul>
                </dd>
            </dl>
            
            <!--dl class="clearfix csdn-tracking-statistics" data-mod="popu_393">
                <dt><a href="http://edu.csdn.net/huiyiCourse/series_detail/64?utm_source=blog10" target="_blank"><img class="maxwidth" src="http://img.blog.csdn.net/20170928113144608" alt="" title=""></a></dt>
                <dd>
                    <div class="summary">
                        <h2><a href='http://edu.csdn.net/topic/python1?utm_source=blog10' target='_blank'>伤心啊！年度热门编程语言排行榜出来了...</a></h2>  <div class="summary">近期，IEEE Spectrum 发布了第四届顶级编程语言交互排行榜。结合 10 个线上数据源的 12 个标准，对 48 种语言进行了排行！此外，七牛云许式伟曾说过Go语言会取代Java...气氛... </div> 
                    </div>
                </dd>
            </dl-->
	<script>
		(function() {
		    var s = "_" + Math.random().toString(36).slice(2);
		    document.write('<div id="' + s + '"></div>');
		    (window.slotbydup=window.slotbydup || []).push({
			id: '4765209',
			container: s,
			size: '808,120',
			display: 'inlay-fix'
		    });
		})();
	</script>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/myarrow/article/details/51188553"  target="_blank" strategy="BlogCommendFromCsdn_2">线性代数常用基本知识 (含向量和矩阵范数&lt;Matrix or vector norm&gt;)</a></h2>
                    <div class="summary">
                        1. 行列式
1.1 二阶行列式




1.2 三阶行列式
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/MyArrow" target="_blank" strategy="BlogCommendFromCsdn_2"><img src="http://avatar.csdn.net/C/1/6/2_myarrow.jpg" alt="MyArrow" title="MyArrow"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/MyArrow">MyArrow</a></li>
                        <li class="time">2016-04-19 11:07</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>8551</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/mathmetics/article/details/9279367"  target="_blank" strategy="BlogCommendFromCsdn_3">线性代数(七) : 子空间的基与维数</a></h2>
                    <div class="summary">
                        子空间的基与维数
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/xxingjjing" target="_blank" strategy="BlogCommendFromCsdn_3"><img src="http://avatar.csdn.net/5/D/7/2_xxingjjing.jpg" alt="xxingjjing" title="xxingjjing"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/xxingjjing">xxingjjing</a></li>
                        <li class="time">2013-07-11 10:29</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>2984</span></li>
                    </ul>
                </dd>
            </dl>
            <!-- 广告位：PC端-博客详情通栏7（feed流）-808*120 --><script> (function() {    var s = "_" + Math.random().toString(36).slice(2);   document.write('<div id="' + s + '"></div>');    (window.slotbydup=window.slotbydup || []).push({        id: '4983339',       container: s,        size: '808,120',        display: 'inlay-fix'    }); })();  </script>
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/qq_28306361/article/details/50800972"  target="_blank" strategy="BlogCommendFromCsdn_4">线性代数复习四——矩阵的维数和秩</a></h2>
                    <div class="summary">
                        复习
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/qq_28306361" target="_blank" strategy="BlogCommendFromCsdn_4"><img src="http://avatar.csdn.net/8/6/2/2_qq_28306361.jpg" alt="qq_28306361" title="qq_28306361"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/qq_28306361">qq_28306361</a></li>
                        <li class="time">2016-03-04 10:57</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>1835</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics downloadElement" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
               	<dt><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank" strategy="BlogCommendFromCsdn_5"><img class="maxwidth" src="http://download.csdn.net/images/minetype/rar.svg" alt="" title=""></a></dt>
		<dd>
			<div class="summary">
				<h2><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank" strategy="BlogCommendFromCsdn_5">高校教学资源，高数，线性代数等</a></h2>
				<div class="summary">
				  <ul>
					  <li class="time">2011-04-02 21:01</li>
					  <li class="visited_num fileSize">3.32MB</li>
					  <li class="download_btn"><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank">下载</a></li>
				  </ul>
				</div> 
			</div>
		</dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics downloadElement" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
               	<dt><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank" strategy="BlogCommendFromCsdn_6"><img class="maxwidth" src="http://download.csdn.net/images/minetype/rar.svg" alt="" title=""></a></dt>
		<dd>
			<div class="summary">
				<h2><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank" strategy="BlogCommendFromCsdn_6">考研数学公式（线性代数+概率论+高数）合集</a></h2>
				<div class="summary">
				  <ul>
					  <li class="time">2010-03-02 20:44</li>
					  <li class="visited_num fileSize">815KB</li>
					  <li class="download_btn"><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank">下载</a></li>
				  </ul>
				</div> 
			</div>
		</dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/suqier1314520/article/details/12584479"  target="_blank" strategy="BlogCommendFromCsdn_7">线性代数导论9——线性相关性、基、维数</a></h2>
                    <div class="summary">
                        本文是Gilbert Strang的线性代数导论课程笔记。课程地址：http://v.163.com/special/opencourse/daishu.html&#160;&#160;
第九课时：线性相关性、基、维数...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/suqier1314520" target="_blank" strategy="BlogCommendFromCsdn_7"><img src="http://avatar.csdn.net/5/6/9/2_suqier1314520.jpg" alt="suqier1314520" title="suqier1314520"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/suqier1314520">suqier1314520</a></li>
                        <li class="time">2013-10-10 19:28</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>4187</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/tengweitw/article/details/40921209"  target="_blank" strategy="BlogCommendFromCsdn_8">【线性代数】线性相关性、基和维数</a></h2>
                    <div class="summary">
                        一、线性相关性

&#160; &#160; &#160; 什么情况下，向量X1，X2，……，Xn是线性无关的？


&#160; &#160;&#160;&#160; 答：当向量X1，X2，……，Xn的线性组合(线性组合时系数不能全为0)不为零向量时，它们是线性无关的...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/tengweitw" target="_blank" strategy="BlogCommendFromCsdn_8"><img src="http://avatar.csdn.net/B/E/9/2_tengweitw.jpg" alt="tengweitw" title="tengweitw"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/tengweitw">tengweitw</a></li>
                        <li class="time">2014-11-09 14:29</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>1551</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/u010182633/article/details/52331744"  target="_blank" strategy="BlogCommendFromCsdn_9">漫步线性代数十——线性无关，基和维数</a></h2>
                    <div class="summary">
                        m,nm,n没有给出线性系统实际大小的真实信息，在我们上文的例子中有三行和四列，但是第三行仅仅是前两行的组合，在消元后得到了零行，它对奇次问题Ax=0Ax=0 没有影响。第四列同样是相关的，列空间减到...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/u010182633" target="_blank" strategy="BlogCommendFromCsdn_9"><img src="http://avatar.csdn.net/2/2/4/2_u010182633.jpg" alt="u010182633" title="u010182633"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/u010182633">u010182633</a></li>
                        <li class="time">2016-08-26 21:16</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>974</span></li>
                    </ul>
                </dd>
            </dl>
            

	   

            

            
        </div>
    </main>
    <aside>
        <div class="right_box user_info">
            <dl class="inf_bar clearfix">
                <dt class="csdn-tracking-statistics" data-mod="popu_381">
                    <a href="http://blog.csdn.net/js1568" target="_blank">
                        <img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg" class="avatar_pic">
                    </a>
                    <span class="medals" title="">
                <svg class="icon" aria-hidden="true">
                    
                </svg>
              </span>
                </dt>
                <dd>
                    <h3 class="csdn-tracking-statistics"  data-mod="popu_380"><a href="http://blog.csdn.net/js1568" target="_blank" id="uid">js1568</a></h3>
                    <span  class="csdn-tracking-statistics" data-mod="popu_379"><a class="btn btn-redborder-small "  id="span_add_follow" target="_self">＋关注</a></span>
                </dd>
            </dl>
            <div class="inf_number_box clearfix">
                <dl>
                    <dt>原创</dt>
                    <dd>15</dd>
                </dl>
                <dl>
                    <dt>粉丝</dt>
                    <dd id='fan'>3</dd>
                </dl>
                <dl>
                    <dt>喜欢</dt>
                    <dd>0</dd>
                </dl>
								 <dl>
              <dt>码云</dt>
              <dd>&nbsp;</dd>
            </dl>

            </div>
	    <div class="writings">
              <div class="public_signal clearfix">
                <h3>他的最新文章</h3>
                <a href="http://blog.csdn.net/js1568" target="_blank" class="more_z"><span>更多文章</span></a>
              </div>
                <ul class="inf_list clearfix csdn-tracking-statistics" data-mod="popu_382">
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429272" target="_blank">统计学习方法 7-支持向量机</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429192" target="_blank">统计学习方法 6-逻辑斯谛回归与最大熵模型</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429164" target="_blank">统计学习方法 5-决策树</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429150" target="_blank">统计学习方法 4-朴素贝叶斯法</a>
                    </li>
                    
                </ul>
            </div>
        </div>
        <div class="extension_other csdn-tracking-statistics" data-mod="popu_389">
						<!--u3032528-->
			<div class="flashrecommend">

<!-- 请置于所有广告位代码之前 -->
<script src="http://dup.baidustatic.com/js/dm.js"></script>
           
<!-- 广告位：PC端-博客详情页右侧视窗1（feed流）-300*250 -->
<script>
(function() {
    var s = "_" + Math.random().toString(36).slice(2);
    document.write('<div id="' + s + '"></div>');
    (window.slotbydup=window.slotbydup || []).push({
        id: '4770930',
        container: s,
        size: '300,250',
        display: 'inlay-fix'
    });
})();
</script>

		    </div>
        </div>

        
        <div class="fixRight">
            <div class="right_box padb0 csdn-tracking-statistics" data-mod="popu_391">
                <h3 class="tit"><span><em>在线课程</em></span></h3>
                <ul class="edu_li clearfix">
                  
                  <li>
                    <div>
                      <a href="http://edu.csdn.net/huiyiCourse/detail/603?utm_source=blog7" target="_blank">
                        <img src="http://img.bss.csdn.net/201711101450316277.png" alt="MVVM在美团点评酒旅移动端的最佳实践" title="MVVM在美团点评酒旅移动端的最佳实践">
                      </a>
                    </div>
                    <div>
                      <p><a href="http://edu.csdn.net/huiyiCourse/detail/603?utm_source=blog7" target="_blank">MVVM在美团点评酒旅移动端的最佳实践</a></p>
                      <p>讲师：王禹华</p>
                    </div>
                  </li>
                  
                  <li>
                    <div>
                      <a href="http://edu.csdn.net/huiyiCourse/detail/594?utm_source=blog7" target="_blank">
                        <img src="http://img.bss.csdn.net/201711101448389242.png" alt="C语言大型软件设计的面向对象" title="C语言大型软件设计的面向对象">
                      </a>
                    </div>
                    <div>
                      <p><a href="http://edu.csdn.net/huiyiCourse/detail/594?utm_source=blog7" target="_blank">C语言大型软件设计的面向对象</a></p>
                      <p>讲师：宋宝华</p>
                    </div>
                  </li>
                  
                </ul>
            </div>
			<!--u3032529-->
            <!-- <div class="extension_other csdn-tracking-statistics baidu_box" data-mod="popu_395">
								
                <script type="text/javascript" src="http://mpb1.iteye.com/cxpdpmumfaedgm.js"></script>
            </div> -->
			<div class="extension_other csdn-tracking-statistics bottomRcom" data-mod="popu_389" style="position:absolute;z-index:-5;opacity:0;pointer-events:none">
						<!--u3032528-->
				<div class="flashrecommend">
				<script type="text/javascript" src="http://mpb1.iteye.com/bwocoltlyzdec.js"></script>
				</div>
			</div>
        </div>
		<div class="user-hotArticle">
          <h3>热门文章</h3>
          <ul class="hotArticle-list csdn-tracking-statistics" data-mod="popu_521">
 
            <li>
              <a href="/js1568/article/details/78042431">线性代数中的范数</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>377</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/73385734">八大（基于比较）排序算法</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>371</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/66476086">先序，中序，后序线索化二叉树</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>313</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/64905555">机器学习（周志华 ）-2模型评估与选择</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>313</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/68066618">字符串匹配的KMP算法</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>309</span></div>
            </li>
 
          </ul>
        </div>


    </aside>
</div>

<div class="left_fixed">
      <div class="left_show_button">
        <span>
          <i class="icon iconfont icon-youjiantou"></i>
        </span>
      </div>
    <ul class="left_menu">

        <li>
            <button class="left-fixed-btn btn-like csdn-tracking-statistics" data-mod="popu_373" target="_self">
                <span class="iconbox border_red"><i class="icon iconfont icon-dianzan"></i></span>
				<span class="txt">0</span>
            </button>
        </li>
		<li id="blog_artical_directory">
            <button class="left-fixed-btn left_menu_btn csdn-tracking-statistics" data-mod="popu_372" target="_self">
                <span class="iconbox border_black"><i class="icon iconfont icon-mulu"></i></span>
            </button>
        </li>
        <li class="menu_con">
            <div class="list_father">
                <div class="arr_box">
                    <button class="btn-noborder arr-btn scroll-down  left_scroll_down"><i class="icon iconfont icon-xiajiantou"></i></button>
                    <button class="btn-noborder arr-btn scroll-up left_scroll_top"><i class="icon iconfont icon-shangjiantou"></i></button>
                </div>
                <div class="arr"></div>
                <div id="csdnBlogDir"></div>
            </div>
        </li>
        <li>
            <button class="left-fixed-btn csdn-tracking-statistics" data-mod="popu_374"  id="com-quick-collect" target="_self">
                <span class="iconbox border_purple"><i class="icon iconfont icon-shoucang"></i></span>
    
            </button>
        </li>
		<li>
          <button class="left-fixed-btn btn-pinglun" >
            <span class="iconbox border_purple"><i class="icon iconfont icon-pinglun"></i></span>
          </button>
        </li>
        <li id="share_box">
            <button class="left-fixed-btn  csdn-tracking-statistics"  data-mod="popu_375" target="_self">
                <span class="iconbox border_orange"><i class="icon iconfont icon-fenxiang"></i></span>
            </button>
            <div class="bdsharebuttonbox csdn-tracking-statistics" data-mod="popu_172">
                <div class="outside">
                    <span class="iconbox border_red2"><i class="icon iconfont icon-xinlang"></i></span>
                    <a href="#" class="bds_tsina" data-cmd="tsina" title="分享到新浪微博"> </a>
                </div>
                <div class="outside">
                    <span class="iconbox border_green"><i class="icon iconfont icon-weixin"></i></span>
                    <a href="#" class="bds_weixin" data-cmd="weixin" title="分享到微信"> </a>
                </div>
                <div class="outside">
                    <span class="iconbox border_blue"><i class="icon iconfont icon-QQ"></i></span>
                    <a href="#" class="bds_qzone" data-cmd="qzone" title="分享到QQ空间"> </a>
                </div>
            </div>
        </li>
    </ul>
</div>
<div class="right_fixed">
  <div class="r_ico">
	<i class="icon iconfont icon-jubao"></i>
	<span class="txt" id="reportBtn">内容举报</span>
  </div>
  <div class="returnTop">
   <i class="icon iconfont icon-fanhuidingbu"></i>
   <span>返回顶部</span>
 </div>
</div>
<div id="pop_win"></div>
<div id="popup_mask"></div>
<div class="pop_CA_cover" ></div>
<div class="pop pop_CA" >
    <div class="CA_header">
        收藏助手
        <span class="cancel_icon"  id="fapancle" ></span>
    </div>
    <iframe src="" id="collectIframe" frameborder="0" width="100%" height="360"  scrolling="no" ></iframe>
</div>
<!--举报-->
<div id="report_dialog" style="top: 250px; left: 343.5px;"><div id="panel_report">
    <div class="panel_head">不良信息举报</div>
    <form method="post" id="frmReport" class="panel_body">
        <table border="0" cellpadding="0" cellspacing="4" class="pop_table">
            <tbody><tr><td colspan="2">您举报文章：<a href="http://blog.csdn.net/raintungli/article/details/76583070" target="_blank">深度学习：神经网络中的前向传播和反向传播算法推导</a></td></tr>
            <tr>
                <th style="width:60px;">举报原因：</th>
                <td id="panel_reporttype">
                    <label><input type="radio" class="report_type" id="report_sex" name="report_type" value="1">色情</label>
                    <label><input type="radio" class="report_type" id="report_Politics" name="report_type" value="2">政治</label>
                    <label><input type="radio" class="report_type" id="report_copy" name="report_type" value="3">抄袭</label>
                    <label><input type="radio" class="report_type" id="report_ad" name="report_type" value="4">广告</label>
                    <label><input type="radio" class="report_type" id="report_want" name="report_type" value="5">招聘</label>
                    <label><input type="radio" class="report_type" id="report_call" name="report_type" value="6">骂人</label>
                    <br>
                    <label><input type="radio" class="report_type" id="report_other" name="report_type" value="7">其他</label>
                    <input type="text" name="report_other_content" id="report_other_content" maxlength="30" style="display: none;">
                </td>
            </tr>
            <tr id="panel_originalurl" style="display: none;">
                <th>原文地址：</th>
                <td>
                    <input id="originalurl" value="http://" name="originalurl" type="text" style="width: 90%;">
                </td>
            </tr>
            <tr>
                <th id="sp_reason">原因补充：</th>
                <td>
                    <textarea id="report_description" style="width: 300px;" rows="3" name="report_description"></textarea>
                    <p id="sp_n" style="color:#999;margin:0px;padding:0px;">(最多只允许输入30个字)</p>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input id="btnSubmitReport" name="submit" type="image" align="middle" class="btn_1" src="http://static.blog.csdn.net/images/btn_submit.jpg">
                    <span style="padding-left:20px;"></span>
                    <img id="btnCloseReportDialog" src="http://static.blog.csdn.net/images/btn_cancel.jpg" align="middle">
                    <div id="error" style="color: Red">
                    </div>
                </td>
            </tr>
            </tbody></table>
    </form>
</div>
    <script language="javascript" type="text/javascript">
        var isComment=0;
        //显示隐藏地址
        $(function () {
            if(isComment){
                $("#report_description").attr("disabled",true);
                $("#sp_n").hide();
                $("#sp_reason").html("评论内容：");
            }
            $(".report_type").click(function () {
                $("#panel_originalurl,#report_other_content").hide();
                switch ($(this).val()) {
                    case '3':
                        $("#panel_originalurl").show();
                        $("#originalurl").focus();
                        break;
                    case '7':
                        if(isComment){
                            $("#report_other_content").show().focus();
                        }
                        break;
                }

            });

            $("#frmReport").submit(function () {
                if (!currentUserName) {

                    if (confirm("您的操作必须登录，是否登录？")) {
                        location.href = "http://passport.csdn.net/account/login?from=" + encodeURIComponent(location.href);
                        return false;
                    }
                    return false;
                }

                var reportType = $("input[name=report_type]:checked").val();
                if(!reportType){
                    alert("请选择举报原因！");
                    return false;
                }
                var otherInfo = "";
                switch (reportType) {
                    case '3':
                        otherInfo = $("#originalurl").val();
                        if (otherInfo == ""||otherInfo=="http://") {
                            alert("举报抄袭必须提供原创文章地址！");
                            $("#originalurl").focus();
                            return false;
                        } else if(!checkeURL(otherInfo)) {
                            alert("请输入正确的原创文章地址！");
                            $("#originalurl").focus();
                            return false;
                        }
                        break;
                    case '7':
                        otherInfo = $("#report_other_content").val();
                        if (isComment && !otherInfo) {
                            alert("请填写举报的具体原因！");
                            $("#report_other_content").focus();
                            return false;
                        }
                        if(!isComment){
                            if(!$("#report_description").val()){
                                alert("请填写举报的具体原因！");
                                $("#report_description").focus();
                                return false;
                            }
                        }
                        break;
                }
                if(!isComment){
                    if($("#report_description").val().length>30){
                        alert("举报原因最多只允许输入30个字！");
                        return false;
                    }
                }
                nowTime = {
                  year: new Date().getFullYear(),
                  month: parseInt(new Date().getMonth())+1,
                  day: new Date().getDate(),
                  hours: parseInt(new Date().getHours()),
                  minutes: parseInt(new Date().getMinutes()),
                  seconds: parseInt(new Date().getSeconds())
                }
                var data = {
                    articleId: fileName,
                    commentId: 0,
                    reportType: reportType,
                    originalurl: $("#originalurl").val(),
                    report_other_content: $("#report_other_content").val(),
                    report_description: $("#report_description").val(),
                    currentUserName: currentUserName,
                    updatetime: nowTime.year+'/'+nowTime.month+'/'+nowTime.day+' '+ nowTime.hours+':'+nowTime.minutes+':'+seconds,
                    blogUser: username
                };
                if(!isComment){//如果是举报文章
                    data.report_other_content = data.report_description;
                    // data.report_description = "1. 神经网络这是一个常见的神经网络的图：这是一个常见的三层神经网络的基本构成，Layer L1是输入层，Layer L2是隐含层";
                }

                $.post(blog_address + "/common/report?id="+fileName+"&t=2", data, function (data) {
                    if (data.result == 1){
                        SetError("感谢您的举报，我们会尽快审核！");
                    }else{
                        if (data.content) alert(data.content);
                    }

                });
                return false;
            });

            $("#btnCloseReportDialog").click(function () {
                CloseDiv();
            });

        });

        //提示后关闭方法
        function SetError(error) {
            $("#btnCloseReportDialog").trigger("click");
            alert(error);
            CloseDiv();
        }

        //关闭方法
        function CloseDiv() {

            $.removeMask();
            $("#report_dialog").hide();
            return false;
        }

        //验证url
        function checkeURL(url){
            return /^http(s)?:\/\/([\w-]+\.)+[\w-]+/i.test(url);
        }

    </script>
</div>

<script src="http://c.csdnimg.cn/public/common/libs/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/public/res/bower-libs/MathJax/MathJax.js?config=TeX-AMS_HTML"></script>
<script type="text/javascript" src="http://passport.csdn.net/content/loginbox/login.js"></script>

<script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/js/blog_ver.js?v=2017.042"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/js/skin2017.js?v=2017.042"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/scripts/cnick.js"></script>
<script>window._bd_share_config = { "common": { "bdSnsKey": {}, "bdText": "", "bdMini": "1", "bdMiniList": false, "bdPic": "", "bdStyle": "0", "bdSize": "16" }, "share": {} }; with (document) 0[(getElementsByTagName('head')[0] || body).appendChild(createElement('script')).src = 'http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion=' + ~(-new Date() / 36e5)];</script>
<script type="text/javascript" >
    if($(".article_collect li").length==1){$(".article_collect").hide();}
    if($(".article_tags li").length==1){$(".article_tags").hide();}
    $(".edit a").attr("href","http://write.blog.csdn.net/postedit/"+fileName);
    $.each($(".edu_li a"),function(){$(this).attr("href",$(this).attr("href").replace("blog7","blog9"))});
    new CNick('#uid').showNickname();
if($("#fan").html()=="")
{
$("#fan").html(0);	
}

	var blogCustomType ='{customtype}';
                
        $("#custom"+blogCustomType).show();
</script>
</body>

<script  type="text/javascript">
    var fromjs=$("#fromjs");
    if(fromjs.length>0)
    {                  
        $("#fromjs .markdown_views pre").addClass("prettyprint");       
        prettyPrint();

        $('pre.prettyprint code').each(function () {
            var lines = $(this).text().split('\n').length;
            var $numbering = $('<ul/>').addClass('pre-numbering').hide();
            $(this).addClass('has-numbering').parent().append($numbering);
            for (i = 1; i <= lines; i++) {
                $numbering.append($('<li/>').text(i));
            };
            $numbering.fadeIn(1700);
        });

        $('.pre-numbering li').css("color","#999");             
    }

    $(function(){
        setTimeout(function(){
            $(".math").each(function(index,value){$(this).find("span").last().css("color","#fff"); })
        },500);         
       

    });

    setTimeout(function () {
        $(".toc a[target='_blank']").attr("target", "");
    }, 500);

</script>
</html>



<!DOCTYPE html>
<html>
<head>
            <link rel="canonical" href="http://blog.csdn.net/js1568/article/details/78042431"/> 

    <script type="text/javascript">
        var username = "js1568";var _blogger = username;var blog_address = "http://blog.csdn.net/js1568";var static_host = "http://static.blog.csdn.net";
        var currentUserName = "js1568"; var fileName = '78042431';var commentscount = 0; var islock = false
        window.quickReplyflag = true;
        var totalFloor=0;
                
                 var isBole = false;
                
                
                 var isDigg = false;
                
          
             var isExpert=false;
        
          
        var isAdm=false;
        

    </script>

<meta http-equiv="content-type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <script src="http://c.csdnimg.cn/public/common/libs/jquery/jquery-1.9.1.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/common/libs/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/static/css/avatar.css">
    <link type="text/css" rel="stylesheet" href="http://static.blog.csdn.net/scripts/SyntaxHighlighter/styles/default.css" />
    <link rel="stylesheet" href="http://static.blog.csdn.net/Skin/skin3-template/css/style.css?v=2017.042">
    <link rel="stylesheet" href="http://c.csdnimg.cn/public/common/toolbar/content_toolbar_css/content_toolbar.css?v5.00.37">
              <!-- adhoc sdk -->
		<script src=https://sdk.appadhoc.com/ab.plus.js></script>
		<script>
		adhoc('init', {
		  appKey: 'ADHOC_0e0bce4f-8793-4f68-89cf-34c14f2532bb',
		  defaultFlags: {isLogin: true}
		})
		</script>
              <!-- adhoc sdk end -->
    
	<script src="//static.blog.csdn.net/public/switchHome/switchHome.js?v=2017.43"></script>	
	
    <script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/fonts/iconfont.js"></script>
    <script src="//csdnimg.cn/rabbit/exposure-click/main.js?v1.15.23"></script>
    <script type="text/javascript" src="http://c.csdnimg.cn/pubfooter/js/tracking_for_recommend.js?v=0911" charset="utf-8"></script>
    <script type="text/javascript" src="http://csdnimg.cn/pubfooter/js/tracking.js" charset="utf-8"></script>
    <script type="text/javascript" src="http://static.blog.csdn.net/scripts/cnick.js" charset="utf-8"></script>
 
    <link rel="stylesheet" href="http://static.blog.csdn.net/code/prettify.css" />
    <script type="text/javascript" src="http://static.blog.csdn.net/code/prettify.js"></script>
<script src="http://dup.baidustatic.com/js/ds.js"></script>
    <script type="text/javascript">

        // Traffic Stats of the entire Web site By baidu
        var _hmt = _hmt || [];
        (function() {
            var hm = document.createElement("script");
            hm.src = "https://hm.baidu.com/hm.js?6bcd52f51e9b3dce32bec4a3997715ac";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
        // Traffic Stats of the entire Web site By baidu end



    </script>
    <meta name="description" content="线性代数中的范数" />
    <meta name="keywords" content="机器学习,线性代数" />
    <meta http-equiv="Cache-Control" content="no-siteapp" /><link rel="alternate" media="handheld" href="#" />
    <meta name="shenma-site-verification" content="5a59773ab8077d4a62bf469ab966a63b_1497598848">


    <title>线性代数中的范数 - CSDN博客</title>
</head>
<body>
<script id="toolbar-tpl-scriptId" prod="download" skin="black" src="http://c.csdnimg.cn/public/common/toolbar/js/content_toolbar.js?v5.00.37" type="text/javascript" domain="http://blog.csdn.net"></script>

<div class="container clearfix">
    <main>
        <article>
            <h1 class="csdn_top">线性代数中的范数</h1>
            <div class="article_bar clearfix">
                <div class="artical_tag">
                    <span class="original">转载</span>
                    <span class="time">2017年09月20日 16:31:53</span>
                </div>
				<ul class="article_tags clearfix csdn-tracking-statistics" data-mod="popu_377">
					<li class="tit">标签：</li>
					
					<li><a href="http://so.csdn.net/so/search/s.do?q=机器学习&t=blog" target="_blank">机器学习</a> <span>/</span></li>
					
					<li><a href="http://so.csdn.net/so/search/s.do?q=线性代数&t=blog" target="_blank">线性代数</a> <span>/</span></li>
					
				</ul>
                <ul class="right_bar">
                    <li><button class="btn-noborder"><i class="icon iconfont icon-read"></i><span class="txt">381</span></button></li>
                    <!--<li><button class="btn-noborder"><i class="icon iconfont icon-dashang-"></i><span class="txt">0</span></button></li>-->

                    <li class="edit">
                        <a class="btn-noborder" href="" >
                            <i class="icon iconfont icon-bianji"></i><span class="txt">编辑</span>
                        </a>
                    </li>
                    <li class="del">
                        <a class="btn-noborder" onclick="javascript:deleteArticle(fileName);return false;">
                            <i class="icon iconfont icon-shanchu"></i><span class="txt">删除</span>
                        </a>
                    </li>
                </ul>
            </div>
            <div id="article_content" class="article_content csdn-tracking-statistics" data-mod="popu_519" data-dsm="post">
                <div class="markdown_views"><p>向量范数</p>

<ul>
<li>0-范数：向量中非零元素个数</li>
<li>1-范数： <img src="https://www.zhihu.com/equation?tex=%7C%7Cx%7C%7C_1%20=%20%5Csum_%7Bi=1%7D%5EN%7Cx_i%7C" alt="" title="">，即向量元素绝对值之和，matlab调用函数norm(x, 1) 。</li>
<li>2-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_2%20=%5Csqrt%7B%5Csum_%7Bi=1%7D%5ENx_i%5E2%7D" alt="" title="">，Euclid范数（欧几里得范数，常用计算向量长度），即向量元素绝对值的平方和再开方，matlab调用函数norm(x, 2)。</li>
<li><img src="https://www.zhihu.com/equation?tex=%5Cinfty" alt="" title=""> -范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_%5Cinfty%20=%20%5Cmax_%7Bi%7D%7Cx_i%7C" alt="" title="">，即所有向量元素绝对值中的最大值，matlab调用函数norm(x, inf)。</li>
<li><img src="https://www.zhihu.com/equation?tex=-%5Cinfty" alt="" title="">-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_%7B-%5Cinfty%7D=%5Cmin_i%7Cx_i%7C" alt="" title="">，即所有向量元素绝对值中的最小值，matlab调用函数norm(x, -inf)。</li>
<li>p-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7C%5Ctextbf%7Bx%7D%7C%7C_p%20=%20%28%5Csum_%7Bi=1%7D%5EN%7Cx_i%7C%5Ep%29%5E%7B%5Cfrac%7B1%7D%7Bp%7D%7D" alt="" title="">，即向量元素绝对值的p次方和的1/p次幂，matlab调用函数norm(x, p)。</li>
</ul>

<p>矩阵范数</p>

<ul>
<li>1-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_1%20=%20%5Cmax_j%5Csum_%7Bi=1%7D%5Em%7Ca_%7Bi,j%7D%7C" alt="" title="">， 列和范数，即所有矩阵列向量绝对值之和的最大值，matlab调用函数norm(A, 1)。</li>
<li>2-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_2%20=%20%5Csqrt%7B%5Clambda_1%7D" alt="" title="">，<img src="https://www.zhihu.com/equation?tex=%5Clambda%3Cbr/%3E" alt="" title="">为的最大特征值。，谱范数，即A’A矩阵的最大特征值的开平方。matlab调用函数norm(x, 2)。</li>
<li><img src="https://www.zhihu.com/equation?tex=%5Cinfty" alt="" title="">-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_%5Cinfty%20=%20%5Cmax_i%5Csum_%7Bj=1%7D%5EN%7Ca_%7Bi,j%7D%7C" alt="" title="">，行和范数，即所有矩阵行向量绝对值之和的最大值，matlab调用函数norm(A, inf)。</li>
<li>F-范数：<img src="https://www.zhihu.com/equation?tex=%7C%7CA%7C%7C_F=%5Cleft%28%5Csum_%7Bi=1%7D%5Em%5Csum_%7Bj=1%7D%5En%7Ca_%7Bi,j%7D%7C%5E2%5Cright%29%5E%7B%5Cfrac%7B1%7D%7B2%7D%7D" alt="" title="">，Frobenius范数，即矩阵元素绝对值的平方和再开平方，matlab调用函数norm(A, ’fro‘)。</li>
<li>核范数：是A的奇异值。即奇异值之和</li>
</ul>

<p>作者：魏通 <br>
链接：<a href="https://www.zhihu.com/question/20473040/answer/102907063" target="_blank">https://www.zhihu.com/question/20473040/answer/102907063</a> <br>
来源：知乎 <br>
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。</p><link rel="stylesheet" href="http://static.blog.csdn.net/public/res-min/markdown_views.css?v=2.0" /></div><link rel="stylesheet" href="http://static.blog.csdn.net/public/res-min/markdown_views.css?v=2.0" />
            </div>
        </article>
        <div class="readall_box csdn-tracking-statistics" data-mod="popu_376">
			<div class="read_more_mask"></div>
            <a class="btn btn-large btn-gray-fred read_more_btn" target="_self">阅读全文</a>
        </div>
        <div class="article_copyright">
            
        </div>
        <!--  <div class="reward_box">
            <div class="tit">
              <button class="btn_reward"><i class="icon iconfont icon-dashang-"></i></button>
            </div>
            <dl class="clearfix">
              <dt><a href="#" target="_blank">近期打赏</a></dt>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
              <dd><a href="#" target="_blank"><img src="http://avatar.csdn.net/9/3/2/2_nzf_001.jpg" alt="聂兆芳" title="聂兆芳"></a></dd>
            </dl>
          </div>-->

        <ul class="article_collect clearfix csdn-tracking-statistics"  data-mod="popu_378">
            <li class="tit">本文已收录于以下专栏：</li>
            
        </ul>
        <div class="comment_box clearfix">
            <div id="comment_form">
                <div id="commentsbmitarear">
                    <!-- <h6><span>0</span>条评论</h6> -->
           <!--          <dl class="clearfix" id="commentbox">
                        <dt>
                            <a href="http://my.csdn.net/js1568"><img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg" ></a>
                        </dt>
                        <dd>
                            <a href="http://my.csdn.net/js1568" target="_blank">js1568</a>
                        </dd>
                        <dd class="txt_tip"><span id="tip_comment" class="tip"></span></dd>
                    </dl> -->
                    <div class="comment_area clearfix">
						<div class="userimg"><a href="http://my.csdn.net/js1568"><img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg"></a></div>
                        <form action="/js1568/comment/submit?id=78042431" method="post" onsubmit="return subform(this);" id="commentform">
                            <textarea class="comment_content" name="comment_content" id="comment_content" placeholder="发表你的评论"></textarea>
                            <div class="bot_bar clearfix">
                                <div id="ubbtools" class="add_code">
                                    <a href="#insertcode" code="code" target="_self"><i class="icon iconfont icon-daima"></i></a>
                                </div>

                                <input type="hidden" id="comment_replyId" name="comment_replyId">
                                <input type="hidden" id="comment_userId" name="comment_userId" value="">
                                <input type="hidden" id="commentId" name="commentId" value="">
                                <input type="submit" class="btn btn-redborder" value="发表评论">
								<span id="tip_comment" class="tip">
                                <div style="display: none;" class="csdn-tracking-statistics" data-mod="popu_384"><a href="#" target="_blank" class="comment_area_btn">发表评论</a></div>

                                <div id="lang_list" code="code">
                                    <a href="#html" style="width:95px;" class="long_name" target="_self">HTML/XML</a>
                                    <a href="#objc" style="width:95px;" class="long_name" target="_self">objective-c</a>
                                    <a href="#delphi" style="width:58px;" class="zhong_name" target="_self">Delphi</a>
                                    <a href="#ruby" class="zhong_name" target="_self">Ruby</a>
                                    <a href="#php" target="_self">PHP</a>
                                    <a href="#csharp" class="duan_name" target="_self">C#</a>
                                    <a style=" border-right: none;" href="#cpp" class="duan_name" target="_self">C++</a>
                                    <a style=" border-bottom:none;width:95px;" href="#javascript" class="long_name" target="_self">JavaScript</a>
                                    <a style=" border-bottom:none;width:95px;" href="#vb" class="long_name" target="_self">Visual Basic</a>
                                    <a style=" border-bottom:none;" href="#python" class="zhong_name" target="_self">Python</a>
                                    <a style=" border-bottom:none;" href="#java" class="zhong_name" target="_self">Java</a>
                                    <a style="border-bottom:none;" href="#css" class="duan_name" target="_self">CSS</a>
                                    <a style="border-bottom:none;" href="#sql" class="duan_name" target="_self">SQL</a>
                                    <a style="border:none; " href="#plain" class="duan_name" target="_self">其它</a>
                                    <span class="arrb"></span>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <div class="comment_li_outbox">
            <div id="comment_list"></div>
        </div>

        <div class="more_comment">
            <div id="comment_bar" class="trackgin-ad" data-mod="popu_385"></div>
        </div>

        <h3 class="recommend_tit">相关文章推荐</h3>
        <div class="recommend_list clearfix">
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/wylfll/article/details/47950593"  target="_blank" strategy="BlogCommendFromCF_0">在jsp中如何实现网页的自动更新</a></h2>
                    <div class="summary">
                        在jsp中如何实现网页的自动更新
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/wylfll" target="_blank" strategy="BlogCommendFromCF_0"><img src="http://avatar.csdn.net/E/4/0/2_wylfll.jpg" alt="wylfll" title="wylfll"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/wylfll">wylfll</a></li>
                        <li class="time">2015-08-24 14:27</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>410</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/js1568/article/details/73434001"  target="_blank" strategy="BlogCommendFromCF_1">最小生成树-Prim算法和Kruskal算法</a></h2>
                    <div class="summary">
                        最小生成树-Prim算法和Kruskal算法
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/js1568" target="_blank" strategy="BlogCommendFromCF_1"><img src="http://avatar.csdn.net/B/A/D/2_js1568.jpg" alt="js1568" title="js1568"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/js1568">js1568</a></li>
                        <li class="time">2017-06-18 17:19</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>88</span></li>
                    </ul>
                </dd>
            </dl>
            
            <!--dl class="clearfix csdn-tracking-statistics" data-mod="popu_393">
                <dt><a href="http://edu.csdn.net/huiyiCourse/series_detail/64?utm_source=blog10" target="_blank"><img class="maxwidth" src="http://img.blog.csdn.net/20170928113144608" alt="" title=""></a></dt>
                <dd>
                    <div class="summary">
                        <h2><a href='http://edu.csdn.net/topic/python1?utm_source=blog10' target='_blank'>伤心啊！年度热门编程语言排行榜出来了...</a></h2>  <div class="summary">近期，IEEE Spectrum 发布了第四届顶级编程语言交互排行榜。结合 10 个线上数据源的 12 个标准，对 48 种语言进行了排行！此外，七牛云许式伟曾说过Go语言会取代Java...气氛... </div> 
                    </div>
                </dd>
            </dl-->
	<script>
		(function() {
		    var s = "_" + Math.random().toString(36).slice(2);
		    document.write('<div id="' + s + '"></div>');
		    (window.slotbydup=window.slotbydup || []).push({
			id: '4765209',
			container: s,
			size: '808,120',
			display: 'inlay-fix'
		    });
		})();
	</script>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/myarrow/article/details/51188553"  target="_blank" strategy="BlogCommendFromCsdn_2">线性代数常用基本知识 (含向量和矩阵范数&lt;Matrix or vector norm&gt;)</a></h2>
                    <div class="summary">
                        1. 行列式
1.1 二阶行列式




1.2 三阶行列式
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/MyArrow" target="_blank" strategy="BlogCommendFromCsdn_2"><img src="http://avatar.csdn.net/C/1/6/2_myarrow.jpg" alt="MyArrow" title="MyArrow"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/MyArrow">MyArrow</a></li>
                        <li class="time">2016-04-19 11:07</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>8551</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/mathmetics/article/details/9279367"  target="_blank" strategy="BlogCommendFromCsdn_3">线性代数(七) : 子空间的基与维数</a></h2>
                    <div class="summary">
                        子空间的基与维数
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/xxingjjing" target="_blank" strategy="BlogCommendFromCsdn_3"><img src="http://avatar.csdn.net/5/D/7/2_xxingjjing.jpg" alt="xxingjjing" title="xxingjjing"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/xxingjjing">xxingjjing</a></li>
                        <li class="time">2013-07-11 10:29</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>2984</span></li>
                    </ul>
                </dd>
            </dl>
            <!-- 广告位：PC端-博客详情通栏7（feed流）-808*120 --><script> (function() {    var s = "_" + Math.random().toString(36).slice(2);   document.write('<div id="' + s + '"></div>');    (window.slotbydup=window.slotbydup || []).push({        id: '4983339',       container: s,        size: '808,120',        display: 'inlay-fix'    }); })();  </script>
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/qq_28306361/article/details/50800972"  target="_blank" strategy="BlogCommendFromCsdn_4">线性代数复习四——矩阵的维数和秩</a></h2>
                    <div class="summary">
                        复习
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/qq_28306361" target="_blank" strategy="BlogCommendFromCsdn_4"><img src="http://avatar.csdn.net/8/6/2/2_qq_28306361.jpg" alt="qq_28306361" title="qq_28306361"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/qq_28306361">qq_28306361</a></li>
                        <li class="time">2016-03-04 10:57</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>1835</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics downloadElement" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
               	<dt><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank" strategy="BlogCommendFromCsdn_5"><img class="maxwidth" src="http://download.csdn.net/images/minetype/rar.svg" alt="" title=""></a></dt>
		<dd>
			<div class="summary">
				<h2><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank" strategy="BlogCommendFromCsdn_5">高校教学资源，高数，线性代数等</a></h2>
				<div class="summary">
				  <ul>
					  <li class="time">2011-04-02 21:01</li>
					  <li class="visited_num fileSize">3.32MB</li>
					  <li class="download_btn"><a href="http://download.csdn.net/detail/growmyself/3154209" target="_blank">下载</a></li>
				  </ul>
				</div> 
			</div>
		</dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics downloadElement" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
               	<dt><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank" strategy="BlogCommendFromCsdn_6"><img class="maxwidth" src="http://download.csdn.net/images/minetype/rar.svg" alt="" title=""></a></dt>
		<dd>
			<div class="summary">
				<h2><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank" strategy="BlogCommendFromCsdn_6">考研数学公式（线性代数+概率论+高数）合集</a></h2>
				<div class="summary">
				  <ul>
					  <li class="time">2010-03-02 20:44</li>
					  <li class="visited_num fileSize">815KB</li>
					  <li class="download_btn"><a href="http://download.csdn.net/detail/weiplin/2090039" target="_blank">下载</a></li>
				  </ul>
				</div> 
			</div>
		</dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/suqier1314520/article/details/12584479"  target="_blank" strategy="BlogCommendFromCsdn_7">线性代数导论9——线性相关性、基、维数</a></h2>
                    <div class="summary">
                        本文是Gilbert Strang的线性代数导论课程笔记。课程地址：http://v.163.com/special/opencourse/daishu.html&#160;&#160;
第九课时：线性相关性、基、维数...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/suqier1314520" target="_blank" strategy="BlogCommendFromCsdn_7"><img src="http://avatar.csdn.net/5/6/9/2_suqier1314520.jpg" alt="suqier1314520" title="suqier1314520"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/suqier1314520">suqier1314520</a></li>
                        <li class="time">2013-10-10 19:28</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>4187</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/tengweitw/article/details/40921209"  target="_blank" strategy="BlogCommendFromCsdn_8">【线性代数】线性相关性、基和维数</a></h2>
                    <div class="summary">
                        一、线性相关性

&#160; &#160; &#160; 什么情况下，向量X1，X2，……，Xn是线性无关的？


&#160; &#160;&#160;&#160; 答：当向量X1，X2，……，Xn的线性组合(线性组合时系数不能全为0)不为零向量时，它们是线性无关的...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/tengweitw" target="_blank" strategy="BlogCommendFromCsdn_8"><img src="http://avatar.csdn.net/B/E/9/2_tengweitw.jpg" alt="tengweitw" title="tengweitw"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/tengweitw">tengweitw</a></li>
                        <li class="time">2014-11-09 14:29</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>1551</span></li>
                    </ul>
                </dd>
            </dl>
            
            <dl class="clearfix csdn-tracking-statistics" data-mod="popu_387" data-poputype="feed"  data-feed-show="false"  data-dsm="post">
                <dd>
                    <h2><a href="/u010182633/article/details/52331744"  target="_blank" strategy="BlogCommendFromCsdn_9">漫步线性代数十——线性无关，基和维数</a></h2>
                    <div class="summary">
                        m,nm,n没有给出线性系统实际大小的真实信息，在我们上文的例子中有三行和四列，但是第三行仅仅是前两行的组合，在消元后得到了零行，它对奇次问题Ax=0Ax=0 没有影响。第四列同样是相关的，列空间减到...
                    </div>
                    <ul>
                        <li class="avatar_img"><a href="http://blog.csdn.net/u010182633" target="_blank" strategy="BlogCommendFromCsdn_9"><img src="http://avatar.csdn.net/2/2/4/2_u010182633.jpg" alt="u010182633" title="u010182633"></a></li>
                        <li class="user_name"><a href="http://blog.csdn.net/u010182633">u010182633</a></li>
                        <li class="time">2016-08-26 21:16</li>
                        <li class="visited_num"><i class="icon iconfont icon-read"></i><span>974</span></li>
                    </ul>
                </dd>
            </dl>
            

	   

            

            
        </div>
    </main>
    <aside>
        <div class="right_box user_info">
            <dl class="inf_bar clearfix">
                <dt class="csdn-tracking-statistics" data-mod="popu_381">
                    <a href="http://blog.csdn.net/js1568" target="_blank">
                        <img src="http://avatar.csdn.net/B/A/D/1_js1568.jpg" class="avatar_pic">
                    </a>
                    <span class="medals" title="">
                <svg class="icon" aria-hidden="true">
                    
                </svg>
              </span>
                </dt>
                <dd>
                    <h3 class="csdn-tracking-statistics"  data-mod="popu_380"><a href="http://blog.csdn.net/js1568" target="_blank" id="uid">js1568</a></h3>
                    <span  class="csdn-tracking-statistics" data-mod="popu_379"><a class="btn btn-redborder-small "  id="span_add_follow" target="_self">＋关注</a></span>
                </dd>
            </dl>
            <div class="inf_number_box clearfix">
                <dl>
                    <dt>原创</dt>
                    <dd>15</dd>
                </dl>
                <dl>
                    <dt>粉丝</dt>
                    <dd id='fan'>3</dd>
                </dl>
                <dl>
                    <dt>喜欢</dt>
                    <dd>0</dd>
                </dl>
								 <dl>
              <dt>码云</dt>
              <dd>&nbsp;</dd>
            </dl>

            </div>
	    <div class="writings">
              <div class="public_signal clearfix">
                <h3>他的最新文章</h3>
                <a href="http://blog.csdn.net/js1568" target="_blank" class="more_z"><span>更多文章</span></a>
              </div>
                <ul class="inf_list clearfix csdn-tracking-statistics" data-mod="popu_382">
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429272" target="_blank">统计学习方法 7-支持向量机</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429192" target="_blank">统计学习方法 6-逻辑斯谛回归与最大熵模型</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429164" target="_blank">统计学习方法 5-决策树</a>
                    </li>
                    
                    <li class="clearfix">
                      
                        <a href="/js1568/article/details/78429150" target="_blank">统计学习方法 4-朴素贝叶斯法</a>
                    </li>
                    
                </ul>
            </div>
        </div>
        <div class="extension_other csdn-tracking-statistics" data-mod="popu_389">
						<!--u3032528-->
			<div class="flashrecommend">

<!-- 请置于所有广告位代码之前 -->
<script src="http://dup.baidustatic.com/js/dm.js"></script>
           
<!-- 广告位：PC端-博客详情页右侧视窗1（feed流）-300*250 -->
<script>
(function() {
    var s = "_" + Math.random().toString(36).slice(2);
    document.write('<div id="' + s + '"></div>');
    (window.slotbydup=window.slotbydup || []).push({
        id: '4770930',
        container: s,
        size: '300,250',
        display: 'inlay-fix'
    });
})();
</script>

		    </div>
        </div>

        
        <div class="fixRight">
            <div class="right_box padb0 csdn-tracking-statistics" data-mod="popu_391">
                <h3 class="tit"><span><em>在线课程</em></span></h3>
                <ul class="edu_li clearfix">
                  
                  <li>
                    <div>
                      <a href="http://edu.csdn.net/huiyiCourse/detail/603?utm_source=blog7" target="_blank">
                        <img src="http://img.bss.csdn.net/201711101450316277.png" alt="MVVM在美团点评酒旅移动端的最佳实践" title="MVVM在美团点评酒旅移动端的最佳实践">
                      </a>
                    </div>
                    <div>
                      <p><a href="http://edu.csdn.net/huiyiCourse/detail/603?utm_source=blog7" target="_blank">MVVM在美团点评酒旅移动端的最佳实践</a></p>
                      <p>讲师：王禹华</p>
                    </div>
                  </li>
                  
                  <li>
                    <div>
                      <a href="http://edu.csdn.net/huiyiCourse/detail/594?utm_source=blog7" target="_blank">
                        <img src="http://img.bss.csdn.net/201711101448389242.png" alt="C语言大型软件设计的面向对象" title="C语言大型软件设计的面向对象">
                      </a>
                    </div>
                    <div>
                      <p><a href="http://edu.csdn.net/huiyiCourse/detail/594?utm_source=blog7" target="_blank">C语言大型软件设计的面向对象</a></p>
                      <p>讲师：宋宝华</p>
                    </div>
                  </li>
                  
                </ul>
            </div>
			<!--u3032529-->
            <!-- <div class="extension_other csdn-tracking-statistics baidu_box" data-mod="popu_395">
								
                <script type="text/javascript" src="http://mpb1.iteye.com/cxpdpmumfaedgm.js"></script>
            </div> -->
			<div class="extension_other csdn-tracking-statistics bottomRcom" data-mod="popu_389" style="position:absolute;z-index:-5;opacity:0;pointer-events:none">
						<!--u3032528-->
				<div class="flashrecommend">
				<script type="text/javascript" src="http://mpb1.iteye.com/bwocoltlyzdec.js"></script>
				</div>
			</div>
        </div>
		<div class="user-hotArticle">
          <h3>热门文章</h3>
          <ul class="hotArticle-list csdn-tracking-statistics" data-mod="popu_521">
 
            <li>
              <a href="/js1568/article/details/78042431">线性代数中的范数</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>377</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/73385734">八大（基于比较）排序算法</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>371</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/66476086">先序，中序，后序线索化二叉树</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>313</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/64905555">机器学习（周志华 ）-2模型评估与选择</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>313</span></div>
            </li>
 
            <li>
              <a href="/js1568/article/details/68066618">字符串匹配的KMP算法</a>
              <div class="read list-left"><i class="icon iconfont icon-read"></i><span>309</span></div>
            </li>
 
          </ul>
        </div>


    </aside>
</div>

<div class="left_fixed">
      <div class="left_show_button">
        <span>
          <i class="icon iconfont icon-youjiantou"></i>
        </span>
      </div>
    <ul class="left_menu">

        <li>
            <button class="left-fixed-btn btn-like csdn-tracking-statistics" data-mod="popu_373" target="_self">
                <span class="iconbox border_red"><i class="icon iconfont icon-dianzan"></i></span>
				<span class="txt">0</span>
            </button>
        </li>
		<li id="blog_artical_directory">
            <button class="left-fixed-btn left_menu_btn csdn-tracking-statistics" data-mod="popu_372" target="_self">
                <span class="iconbox border_black"><i class="icon iconfont icon-mulu"></i></span>
            </button>
        </li>
        <li class="menu_con">
            <div class="list_father">
                <div class="arr_box">
                    <button class="btn-noborder arr-btn scroll-down  left_scroll_down"><i class="icon iconfont icon-xiajiantou"></i></button>
                    <button class="btn-noborder arr-btn scroll-up left_scroll_top"><i class="icon iconfont icon-shangjiantou"></i></button>
                </div>
                <div class="arr"></div>
                <div id="csdnBlogDir"></div>
            </div>
        </li>
        <li>
            <button class="left-fixed-btn csdn-tracking-statistics" data-mod="popu_374"  id="com-quick-collect" target="_self">
                <span class="iconbox border_purple"><i class="icon iconfont icon-shoucang"></i></span>
    
            </button>
        </li>
		<li>
          <button class="left-fixed-btn btn-pinglun" >
            <span class="iconbox border_purple"><i class="icon iconfont icon-pinglun"></i></span>
          </button>
        </li>
        <li id="share_box">
            <button class="left-fixed-btn  csdn-tracking-statistics"  data-mod="popu_375" target="_self">
                <span class="iconbox border_orange"><i class="icon iconfont icon-fenxiang"></i></span>
            </button>
            <div class="bdsharebuttonbox csdn-tracking-statistics" data-mod="popu_172">
                <div class="outside">
                    <span class="iconbox border_red2"><i class="icon iconfont icon-xinlang"></i></span>
                    <a href="#" class="bds_tsina" data-cmd="tsina" title="分享到新浪微博"> </a>
                </div>
                <div class="outside">
                    <span class="iconbox border_green"><i class="icon iconfont icon-weixin"></i></span>
                    <a href="#" class="bds_weixin" data-cmd="weixin" title="分享到微信"> </a>
                </div>
                <div class="outside">
                    <span class="iconbox border_blue"><i class="icon iconfont icon-QQ"></i></span>
                    <a href="#" class="bds_qzone" data-cmd="qzone" title="分享到QQ空间"> </a>
                </div>
            </div>
        </li>
    </ul>
</div>
<div class="right_fixed">
  <div class="r_ico">
	<i class="icon iconfont icon-jubao"></i>
	<span class="txt" id="reportBtn">内容举报</span>
  </div>
  <div class="returnTop">
   <i class="icon iconfont icon-fanhuidingbu"></i>
   <span>返回顶部</span>
 </div>
</div>
<div id="pop_win"></div>
<div id="popup_mask"></div>
<div class="pop_CA_cover" ></div>
<div class="pop pop_CA" >
    <div class="CA_header">
        收藏助手
        <span class="cancel_icon"  id="fapancle" ></span>
    </div>
    <iframe src="" id="collectIframe" frameborder="0" width="100%" height="360"  scrolling="no" ></iframe>
</div>
<!--举报-->
<div id="report_dialog" style="top: 250px; left: 343.5px;"><div id="panel_report">
    <div class="panel_head">不良信息举报</div>
    <form method="post" id="frmReport" class="panel_body">
        <table border="0" cellpadding="0" cellspacing="4" class="pop_table">
            <tbody><tr><td colspan="2">您举报文章：<a href="http://blog.csdn.net/raintungli/article/details/76583070" target="_blank">深度学习：神经网络中的前向传播和反向传播算法推导</a></td></tr>
            <tr>
                <th style="width:60px;">举报原因：</th>
                <td id="panel_reporttype">
                    <label><input type="radio" class="report_type" id="report_sex" name="report_type" value="1">色情</label>
                    <label><input type="radio" class="report_type" id="report_Politics" name="report_type" value="2">政治</label>
                    <label><input type="radio" class="report_type" id="report_copy" name="report_type" value="3">抄袭</label>
                    <label><input type="radio" class="report_type" id="report_ad" name="report_type" value="4">广告</label>
                    <label><input type="radio" class="report_type" id="report_want" name="report_type" value="5">招聘</label>
                    <label><input type="radio" class="report_type" id="report_call" name="report_type" value="6">骂人</label>
                    <br>
                    <label><input type="radio" class="report_type" id="report_other" name="report_type" value="7">其他</label>
                    <input type="text" name="report_other_content" id="report_other_content" maxlength="30" style="display: none;">
                </td>
            </tr>
            <tr id="panel_originalurl" style="display: none;">
                <th>原文地址：</th>
                <td>
                    <input id="originalurl" value="http://" name="originalurl" type="text" style="width: 90%;">
                </td>
            </tr>
            <tr>
                <th id="sp_reason">原因补充：</th>
                <td>
                    <textarea id="report_description" style="width: 300px;" rows="3" name="report_description"></textarea>
                    <p id="sp_n" style="color:#999;margin:0px;padding:0px;">(最多只允许输入30个字)</p>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input id="btnSubmitReport" name="submit" type="image" align="middle" class="btn_1" src="http://static.blog.csdn.net/images/btn_submit.jpg">
                    <span style="padding-left:20px;"></span>
                    <img id="btnCloseReportDialog" src="http://static.blog.csdn.net/images/btn_cancel.jpg" align="middle">
                    <div id="error" style="color: Red">
                    </div>
                </td>
            </tr>
            </tbody></table>
    </form>
</div>
    <script language="javascript" type="text/javascript">
        var isComment=0;
        //显示隐藏地址
        $(function () {
            if(isComment){
                $("#report_description").attr("disabled",true);
                $("#sp_n").hide();
                $("#sp_reason").html("评论内容：");
            }
            $(".report_type").click(function () {
                $("#panel_originalurl,#report_other_content").hide();
                switch ($(this).val()) {
                    case '3':
                        $("#panel_originalurl").show();
                        $("#originalurl").focus();
                        break;
                    case '7':
                        if(isComment){
                            $("#report_other_content").show().focus();
                        }
                        break;
                }

            });

            $("#frmReport").submit(function () {
                if (!currentUserName) {

                    if (confirm("您的操作必须登录，是否登录？")) {
                        location.href = "http://passport.csdn.net/account/login?from=" + encodeURIComponent(location.href);
                        return false;
                    }
                    return false;
                }

                var reportType = $("input[name=report_type]:checked").val();
                if(!reportType){
                    alert("请选择举报原因！");
                    return false;
                }
                var otherInfo = "";
                switch (reportType) {
                    case '3':
                        otherInfo = $("#originalurl").val();
                        if (otherInfo == ""||otherInfo=="http://") {
                            alert("举报抄袭必须提供原创文章地址！");
                            $("#originalurl").focus();
                            return false;
                        } else if(!checkeURL(otherInfo)) {
                            alert("请输入正确的原创文章地址！");
                            $("#originalurl").focus();
                            return false;
                        }
                        break;
                    case '7':
                        otherInfo = $("#report_other_content").val();
                        if (isComment && !otherInfo) {
                            alert("请填写举报的具体原因！");
                            $("#report_other_content").focus();
                            return false;
                        }
                        if(!isComment){
                            if(!$("#report_description").val()){
                                alert("请填写举报的具体原因！");
                                $("#report_description").focus();
                                return false;
                            }
                        }
                        break;
                }
                if(!isComment){
                    if($("#report_description").val().length>30){
                        alert("举报原因最多只允许输入30个字！");
                        return false;
                    }
                }
                nowTime = {
                  year: new Date().getFullYear(),
                  month: parseInt(new Date().getMonth())+1,
                  day: new Date().getDate(),
                  hours: parseInt(new Date().getHours()),
                  minutes: parseInt(new Date().getMinutes()),
                  seconds: parseInt(new Date().getSeconds())
                }
                var data = {
                    articleId: fileName,
                    commentId: 0,
                    reportType: reportType,
                    originalurl: $("#originalurl").val(),
                    report_other_content: $("#report_other_content").val(),
                    report_description: $("#report_description").val(),
                    currentUserName: currentUserName,
                    updatetime: nowTime.year+'/'+nowTime.month+'/'+nowTime.day+' '+ nowTime.hours+':'+nowTime.minutes+':'+seconds,
                    blogUser: username
                };
                if(!isComment){//如果是举报文章
                    data.report_other_content = data.report_description;
                    // data.report_description = "1. 神经网络这是一个常见的神经网络的图：这是一个常见的三层神经网络的基本构成，Layer L1是输入层，Layer L2是隐含层";
                }

                $.post(blog_address + "/common/report?id="+fileName+"&t=2", data, function (data) {
                    if (data.result == 1){
                        SetError("感谢您的举报，我们会尽快审核！");
                    }else{
                        if (data.content) alert(data.content);
                    }

                });
                return false;
            });

            $("#btnCloseReportDialog").click(function () {
                CloseDiv();
            });

        });

        //提示后关闭方法
        function SetError(error) {
            $("#btnCloseReportDialog").trigger("click");
            alert(error);
            CloseDiv();
        }

        //关闭方法
        function CloseDiv() {

            $.removeMask();
            $("#report_dialog").hide();
            return false;
        }

        //验证url
        function checkeURL(url){
            return /^http(s)?:\/\/([\w-]+\.)+[\w-]+/i.test(url);
        }

    </script>
</div>

<script src="http://c.csdnimg.cn/public/common/libs/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/public/res/bower-libs/MathJax/MathJax.js?config=TeX-AMS_HTML"></script>
<script type="text/javascript" src="http://passport.csdn.net/content/loginbox/login.js"></script>

<script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/js/blog_ver.js?v=2017.042"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/Skin/skin3-template/js/skin2017.js?v=2017.042"></script>
<script type="text/javascript" src="http://static.blog.csdn.net/scripts/cnick.js"></script>
<script>window._bd_share_config = { "common": { "bdSnsKey": {}, "bdText": "", "bdMini": "1", "bdMiniList": false, "bdPic": "", "bdStyle": "0", "bdSize": "16" }, "share": {} }; with (document) 0[(getElementsByTagName('head')[0] || body).appendChild(createElement('script')).src = 'http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion=' + ~(-new Date() / 36e5)];</script>
<script type="text/javascript" >
    if($(".article_collect li").length==1){$(".article_collect").hide();}
    if($(".article_tags li").length==1){$(".article_tags").hide();}
    $(".edit a").attr("href","http://write.blog.csdn.net/postedit/"+fileName);
    $.each($(".edu_li a"),function(){$(this).attr("href",$(this).attr("href").replace("blog7","blog9"))});
    new CNick('#uid').showNickname();
if($("#fan").html()=="")
{
$("#fan").html(0);	
}

	var blogCustomType ='{customtype}';
                
        $("#custom"+blogCustomType).show();
</script>
</body>

<script  type="text/javascript">
    var fromjs=$("#fromjs");
    if(fromjs.length>0)
    {                  
        $("#fromjs .markdown_views pre").addClass("prettyprint");       
        prettyPrint();

        $('pre.prettyprint code').each(function () {
            var lines = $(this).text().split('\n').length;
            var $numbering = $('<ul/>').addClass('pre-numbering').hide();
            $(this).addClass('has-numbering').parent().append($numbering);
            for (i = 1; i <= lines; i++) {
                $numbering.append($('<li/>').text(i));
            };
            $numbering.fadeIn(1700);
        });

        $('.pre-numbering li').css("color","#999");             
    }

    $(function(){
        setTimeout(function(){
            $(".math").each(function(index,value){$(this).find("span").last().css("color","#fff"); })
        },500);         
       

    });

    setTimeout(function () {
        $(".toc a[target='_blank']").attr("target", "");
    }, 500);

</script>
</html>

