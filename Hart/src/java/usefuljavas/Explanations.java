//Altered on 2009-02-17

// A Class that provides English and Japanese Explanations for Hart Book classes.

package usefuljavas;


public final class Explanations
    {
    public int lang = 1;

    //public String check = "Don't Got It";
    private String links = "";
    //private String style = " style='font-family: HGP明朝E, sans-serif; font-size: 12pt'";
    public String folder = "Hart";
    public String bgcolor = "e7eddf"; // f5f3ea (cream) ; e7eddf (light green-blue) ; dbf1bb (light green)

    private String[] linkArraySamp = {"c0", "c1", "c2", "c3"};
    private String[] linkArray = {"c0", "c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8","c9", "c10", "c11"};
    private String[][] sampPage = {{"Front Page", "前面"}, {"Sample", "サンプル"}, {"Log In", "ログイン"}, {"Register", "登録"}};


    public void setLang(SessionState ss)
    {
            lang = ss.lang;
    }
    

    private String getLang()
    {
            if(lang == 1) return "English";
            else return "日本語";
    }


    private String getVersion()
    {
            if(lang == 1) return "<a href='/"+folder+"/front_pageE.jsp'>English Version</a>";
            else return "<a href='/"+folder+"/front_pageJ.jsp'>日本語訳文</a>";
    }


    public String getSampPage(int x)
    {
            return sampPage[x][lang];
    }


    public String getPopUpScript()
    {
            String s = "function popup(mylink, windowname, w, h){if (! window.focus)return true;var href;"+
                    "if (typeof(mylink) == 'string')href=mylink; else href=mylink.href;"+
                    "window.open(href, windowname, 'width='+w+',height='+h+',scrollbars=yes'); return false;} ";

            return s;
    }


    public String begMainTable()
    {
            String s =  "<table cellpadding='0' cellspacing='0' border='0' align='center' width='690'>";
            return s;
    }


    public String begTable()
    {
            String s =  "<table width='650' cellpadding='0' cellspacing='0' border='0' align='center'>";
            return s;
    }


    public String begBordSpTable()
    {
            String s =  "<table width='650' cellpadding='0' cellspacing='2' border='0' align='center'>";
            return s;
    }


    public String begHalfTable()
    {
            String s =  "<table width='300' cellpadding='0' cellspacing='0' border='0' align='center'>";
            return s;
    }


    public String mainBodyTopRow()
    {
            String s =  "<tr><td width='650' height='66' class='body_top' align='center'>"; //  height='66'
            return s;
    }


    public String mainBodyRow()
    {
            String s =  "<tr><td width='650' class='body_content'>";
            return s;
    }


    public String begRow()
    {
            String s =  "<tr><td width='650' class='body_content'>";
            return s;
    }


    public String begHalfRow()
    {
            String s =  "<tr><td width='300'>";
            return s;
    }


    public String endRow()
    {
            String s =  "</td></tr>";
            return s;
    }


    public String endTable()
    {
            String s =  "</table>";
            return s;
    }


    public String endMainTBH()
    {
            String s =  "</table></body></html>";
            return s;
    }


    public String endBodyHtml()
    {
            String s =  "</body></html>";
            return s;
    }


    public String banner()
    {
            String s =  "<tr><td width='650' height='97'>"+
                            "<img src='images/top_bannerg.gif' alt='Banner' width='690' height='97' /></td></tr>";
            return s;
    }


    public String mainNav(SessionState ss)
    {
            String s =  "<form name='language' method='post'><tr><td width='650'>"+
                            "<table width='650' cellpadding='0' cellspacing='0' border='0' align='center' class='margin_set'><tr>"+
                            Buttons.roundButton(Buttons.getBut21(ss), ss)+
                            "<td width='550' align='center'>"+getLinks(ss)+
                            "</td></tr></table></td></tr></form>";
            return s;
    }


    public String frontPageNav()
    {
            String s =  "<tr><td width='650'>"+
                            "<table width='650' cellpadding='0' cellspacing='0' border='0' align='center' class='margin_set'><tr>"+
                            "<td width='150' align='center'>"+getVersion()+"</td>"+
                            "<td width='500' align='center'>"+getSampLinks()+
                            "</td></tr></table></td></tr>";
            return s;
    }


    public String sampNav()
    {
            String s =  "<form name='lang' method='post' accept-charset='UTF-8'><tr><td width='650'>"+
                            "<table width='650' cellpadding='0' cellspacing='0' border='0' align='center' class='margin_set'><tr>"+
                            "<td align='center'><table cellpadding='0' cellspacing='0' border='0'><tr>"+
                            "<td class='button-lg-left' cellpadding='1'>&nbsp;</td><td class='button-lg-mid' >"+
            "<input type='submit' name='language' value='"+getLang()+"' class='button-lg-mid' ></td>"+
            "<td class='button-lg-right' cellpadding='1'>&nbsp;</td></tr></table></td>"+
                            "<td width='550' align='center'>"+getSampLinks()+
                            "</td></tr></table></td></tr></form>";
            return s;
    }


    public String sampFooter()
    {
            String s =  "<tr><td width='650' height='75' class='footer'>"+
                    "<table cellpadding='0' cellspacing='0' border='0' width='650' align='center'>"+
                    "<!-- Footer Nav, Left Cell --><tr><td width='325' valign='bottom'>"+getTinySampLinks()+"</td>"+
                    "<!-- Copyright, Right Cell --><td width='325' valign='bottom' align='right'>"+
                    "<span class='small'>Copyright © 2006 Hart  Book. All Rights Reserved.</span></td></tr></table>"+
                    "<!-- End Footer Content, Left and Right Cells --></td></tr>";
            return s;
    }


    public String footer(SessionState ss)
    {
            String s =  "<tr><td width='650' height='75' class='footer'>"+
                    "<table cellpadding='0' cellspacing='0' border='0' width='650' align='center'>"+
                    "<!-- Footer Nav, Left Cell --><tr><td width='325' valign='bottom'>"+getTinyLinks(ss)+"</td>"+
                    "<!-- Copyright, Right Cell --><td width='325' valign='bottom' align='right'>"+
                    "<a href='mailto:rkbarber@hartvocab.com' class='tinylink'>"+ss.exp.getExp39()+"</a><br />"+
                    "<span class='small'>Copyright © 2006 Hart  Book. All Rights Reserved.</span></td></tr></table>"+
                    "<!-- End Footer Content, Left and Right Cells --></td></tr>";
            return s;
    }


    // use this to send to log
    public String deBug(SessionState ss)
    {
            //System.out.println(ss.debugString);
            String s =  "</table><table><tr><td><pre>"+ss.debugString+"</pre></td></tr></table>";
            ss.debugString = "";
            return s;
    }


    private void setSampLinks()
    {
            String[] linkArrayE = {"<a href='/"+folder+"/front_page.jsp'>Front Page</a>",
                    "<a href='/"+folder+"/sample.jsp'>Sample</a>",
                    "<a href='/"+folder+"/register.jsp'>Register</a>",
                    "<a href='/"+folder+"/login.jsp'>Log In</a>",
                    "<a href='/"+folder+"/paypalbutton.jsp'>Create Lists</a>"};

            String[] linkArrayJ = {"<a href='/"+folder+"/front_page.jsp'>前面</a>",
                    "<a href='/"+folder+"/sample.jsp'>サンプル</a>",
                    "<a href='/"+folder+"/register.jsp'>登録</a>",
                    "<a href='/"+folder+"/login.jsp'>ログイン</a>",
                    "<a href='/"+folder+"/paypalbutton.jsp'>リストの作成</a>"};

            if(lang == 0) linkArraySamp = linkArrayE;
            else linkArraySamp = linkArrayJ;
    }


    private void setTinySampLinks()
    {
            String[] smLinkArrayE = {"<a href='/"+folder+"/front_page.jsp' class='tinylink'>Front Page</a>",
                    "<a href='/"+folder+"/sample.jsp' class='tinylink'>Sample</a>",
                    "<a href='/"+folder+"/register.jsp' class='tinylink'>Register</a>",
                    "<a href='/"+folder+"/login.jsp' class='tinylink'>Log In</a>",
                    "<a href='/"+folder+"/paypalbutton.jsp' class='tinylink'>Create Lists</a>"};

            String[] smLinkArrayJ = {"<a href='/"+folder+"/front_page.jsp' class='tinylink'>前面</a>",
                    "<a href='/"+folder+"/sample.jsp' class='tinylink'>サンプル</a>",
                    "<a href='/"+folder+"/register.jsp' class='tinylink'>登録</a>",
                    "<a href='/"+folder+"/login.jsp' class='tinylink'>ログイン</a>",
                    "<a href='/"+folder+"/paypalbutton.jsp' class='tinylink'>リストの作成</a>"};


            if(lang == 0) linkArraySamp = smLinkArrayE;
            else linkArraySamp = smLinkArrayJ;
    }


    private void setLinks(SessionState ss)
    {// 0=CHANGE-LANG, 1=HOME, 2=EDIT, 3=DISP, 4=HIST, 5=HELP, 6=LOGOUT, 7=ADMIN
            String[] linkArrayE = {"<a href='/"+folder+"/forlang.jsp' onClick='return popup(this, \"help\", 750, 600)'>Change Language</a>",
                    "<a href='/"+folder+"/startButtons'>Home</a>",
                    "<a href='/"+folder+"/editrows'>Create Lists</a>",
                    "<a href='/"+folder+"/displaylists'>Display Lists</a>",
                    "<a href='/"+folder+"/studyhistory.jsp'>History</a>",
                    "<a href='/"+folder+"/"+ss.help+"' onClick='return popup(this, \"help\", 750, 600)'>Help</a>",
                    "<a href='/"+folder+"/loggedout.jsp'>Log Out</a>",
                    "<a href='/"+folder+"/admin.jsp'>Admin</a>"};

                    // "<a href='/"+folder+"/teachlists'>Teacher Lists</a>",
                    // "<a href='/"+folder+"/edittables'>Edit Tables</a>",
                    // "<a href='/"+folder+"/dbdebug'>DB Debug</a>",
                    // "<a href='/"+folder+"/notepad.jsp'>Notepad</a>",

            String[] linkArrayJ = {"<a href='/"+folder+"/forlang.jsp' onClick='return popup(this, \"help\", 750, 600)'>他の外国語</a>",
                    "<a href='/"+folder+"/startButtons'>ホーム</a>",
                    "<a href='/"+folder+"/editrows'>リストの作成</a>",
                    "<a href='/"+folder+"/displaylists'>リストの表示</a>",
                    "<a href='/"+folder+"/studyhistory.jsp'>履歴</a>",
                    "<a href='/"+folder+"/"+ss.help+"' onClick='return popup(this, \"help\", 750, 600)'>ヘルプ</a>",
                    "<a href='/"+folder+"/loggedout.jsp'>ログアウト</a>",
                    "<a href='/"+folder+"/admin.jsp'>Admin</a>"};

                    // "<a href='/"+folder+"/teachlists'>先生リスト</a>",
                    // "<a href='/"+folder+"/edittables'>編集テーブル</a>",
                    // "<a href='/"+folder+"/dbdebug'>DB Debug</a>",
                    // "<a href='/"+folder+"/notepad.jsp'>Notepad</a>",

            if(lang == 0) linkArray = linkArrayE;
            else linkArray = linkArrayJ;

    }


    private void setTinyLinks(SessionState ss)
    {// 0=CHANGE-LANG, 1=HOME, 2=EDIT, 3=DISP, 4=HIST, 5=HELP, 6=LOGOUT, 7=ADMIN
            String[] smLinkArrayE = {"<a href='/"+folder+"/forlang.jsp' class='tinylink' onClick='return popup(this, \"help\", 750, 600)'>Change Language</a>",
                    "<a href='/"+folder+"/startButtons' class='tinylink'>Home</a>",
                    "<a href='/"+folder+"/editrows' class='tinylink'>Create Lists</a>",
                    "<a href='/"+folder+"/displaylists' class='tinylink'>Display Lists</a>",
                    "<a href='/"+folder+"/studyhistory.jsp' class='tinylink'>History</a>",
                    "<a href='/"+folder+"/"+ss.help+"' class='tinylink' onClick='return popup(this, \"help\", 750, 600)'>Help</a>",
                    "<a href='/"+folder+"/loggedout.jsp' class='tinylink'>Log Out</a>",
                    "<a href='/"+folder+"/admin.jsp' class='tinylink'>Admin</a>"};

                    // "<a href='/"+folder+"/teachlists' class='tinylink'>Teacher Lists</a>",
                    // "<a href='/"+folder+"/edittables' class='tinylink'>Edit Tables</a>",
                    // "<a href='/"+folder+"/dbdebug' class='tinylink'>DB Debug</a>",
                    // "<a href='/"+folder+"/notepad.jsp' class='tinylink'>Notepad</a>",


            String[] smLinkArrayJ = {"<a href='/"+folder+"/forlang.jsp' class='tinylink' onClick='return popup(this, \"help\", 750, 600)'>他の外国語</a>",
                    "<a href='/"+folder+"/startButtons' class='tinylink'>ホーム</a>",
                    "<a href='/"+folder+"/editrows' class='tinylink'>リストの作成</a>",
                    "<a href='/"+folder+"/displaylists' class='tinylink'>リストの表示</a>",
                    "<a href='/"+folder+"/studyhistory.jsp' class='tinylink'>履歴</a>",
                    "<a href='/"+folder+"/"+ss.help+"' class='tinylink' onClick='return popup(this, \"help\", 750, 600)'>ヘルプ</a>",
                    "<a href='/"+folder+"/loggedout.jsp' class='tinylink'>ログアウト</a>",
                    "<a href='/"+folder+"/admin.jsp' class='tinylink'>Admin</a>"};

                    // "<a href='/"+folder+"/teachlists' class='tinylink'>先生リスト</a>",
                    // "<a href='/"+folder+"/edittables' class='tinylink'>編集テーブル</a>",
                    // "<a href='/"+folder+"/dbdebug' class='tinylink'>DB Debug</a>",
                    // "<a href='/"+folder+"/notepad.jsp' class='tinylink'>Notepad</a>",


            if(lang == 0) linkArray = smLinkArrayE;
            else linkArray = smLinkArrayJ;
    }


    public String getSampLinks()
    { 
            setSampLinks();

            links = linkArraySamp[0]+"&nbsp;|&nbsp;"+
                    linkArraySamp[1]+"&nbsp;|&nbsp;"+
                    linkArraySamp[2]+"&nbsp;|&nbsp;"+
                    linkArraySamp[3];// for paypalbutton.jsp +"&nbsp;|&nbsp;"+linkArraySamp[4]

            //links = links+"&nbsp;|&nbsp;"+lang;

            return links;
    }


    public String getTinySampLinks()
    { 
            setTinySampLinks();

            links = linkArraySamp[0]+"&nbsp;|&nbsp;"+
                    linkArraySamp[1]+"&nbsp;|&nbsp;"+
                    linkArraySamp[2]+"&nbsp;|&nbsp;"+
                    linkArraySamp[3]; // for paypalbutton.jsp +"&nbsp;|&nbsp;"+linkArraySamp[4]

            return links;
    }


    public String getLinks(SessionState ss)
    { 
            setLang(ss);

            setLinks(ss);

            if(ss.role.equals("admin"))
            {
                    links = linkArray[1]+"&nbsp;|&nbsp;"+
                            linkArray[2]+"&nbsp;|&nbsp;"+
                            linkArray[3]+"&nbsp;|&nbsp;"+
                            linkArray[4]+"&nbsp;|&nbsp;"+
                            linkArray[5]+"&nbsp;|&nbsp;"+
                            linkArray[6]+"&nbsp;|&nbsp;"+
                            linkArray[7];
            }// 0=CHANGE-LANG, 1=HOME, 2=EDIT, 3=DISP, 4=HIST, 5=HELP, 6=LOGOUT, 7=ADMIN
            else if(ss.role.equals("payer"))
            {
                    links = linkArray[1]+"&nbsp;|&nbsp;"+
                            linkArray[2]+"&nbsp;|&nbsp;"+
                            linkArray[3]+"&nbsp;|&nbsp;"+
                            linkArray[4]+"&nbsp;|&nbsp;"+
                            linkArray[5]+"&nbsp;|&nbsp;"+
                            linkArray[6];
            }// 0=CHANGE-LANG, 1=HOME, 2=EDIT, 3=DISP, 4=HIST, 5=HELP, 6=LOGOUT, 7=ADMIN
            else if(ss.role.equals("user"))
            {
                    links = linkArray[1]+"&nbsp;|&nbsp;"+
                            linkArray[3]+"&nbsp;|&nbsp;"+
                            linkArray[4]+"&nbsp;|&nbsp;"+
                            linkArray[5]+"&nbsp;|&nbsp;"+
                            linkArray[6];
            }// 0=CHANGE-LANG, 1=HOME, 2=EDIT, 3=DISP, 4=HIST, 5=HELP, 6=LOGOUT, 7=ADMIN
            else if(ss.role.equals("sampler"))
            {
                    links = linkArray[1]+"&nbsp;|&nbsp;"+
                            linkArray[3]+"&nbsp;|&nbsp;"+
                            linkArray[5]+"&nbsp;|&nbsp;"+
                            linkArray[6];
            }// 0=CHANGE-LANG, 1=HOME, 2=EDIT, 3=DISP, 4=HIST, 5=HELP, 6=LOGOUT, 7=ADMIN
            else if(ss.role.equals("teacher"))
            {
                    links = linkArray[1]+"&nbsp;|&nbsp;"+
                            linkArray[2]+"&nbsp;|&nbsp;"+
                            linkArray[3]+"&nbsp;|&nbsp;"+
                            linkArray[4]+"&nbsp;|&nbsp;"+
                            linkArray[5]+"&nbsp;|&nbsp;"+
                            linkArray[6];
            }// 0=CHANGE-LANG, 1=HOME, 2=EDIT, 3=DISP, 4=HIST, 5=HELP, 6=LOGOUT, 7=ADMIN
            else if(ss.role.equals("student"))
            {
                    links = linkArray[1]+"&nbsp;|&nbsp;"+
                            linkArray[3]+"&nbsp;|&nbsp;"+
                            linkArray[4]+"&nbsp;|&nbsp;"+
                            linkArray[5]+"&nbsp;|&nbsp;"+
                            linkArray[6];
            }// 0=CHANGE-LANG, 1=HOME, 2=EDIT, 3=DISP, 4=HIST, 5=HELP, 6=LOGOUT, 7=ADMIN
            else if(ss.role.length() == 0) {links = "Role is empty";}

            return links;
    }


    public String getTinyLinks(SessionState ss)
    {
            setLang(ss);

            setTinyLinks(ss);

            if(ss.role.equals("admin"))
            {
                    links = linkArray[1]+"&nbsp;|&nbsp;"+
                            linkArray[2]+"&nbsp;|&nbsp;"+
                            linkArray[3]+"&nbsp;|&nbsp;"+
                            linkArray[4]+"&nbsp;|&nbsp;"+
                            linkArray[5]+"&nbsp;|&nbsp;"+
                            linkArray[6]+"&nbsp;|&nbsp;"+
                            linkArray[7];
            }// 0=CHANGE-LANG, 1=HOME, 2=EDIT, 3=DISP, 4=HIST, 5=HELP, 6=LOGOUT, 7=ADMIN
            else if(ss.role.equals("payer"))
            {
                    links = linkArray[1]+"&nbsp;|&nbsp;"+
                            linkArray[2]+"&nbsp;|&nbsp;"+
                            linkArray[3]+"&nbsp;|&nbsp;"+
                            linkArray[4]+"&nbsp;|&nbsp;"+
                            linkArray[5]+"&nbsp;|&nbsp;"+
                            linkArray[6];
            }// 0=CHANGE-LANG, 1=HOME, 2=EDIT, 3=DISP, 4=HIST, 5=HELP, 6=LOGOUT, 7=ADMIN
            else if(ss.role.equals("user"))
            {
                    links = linkArray[1]+"&nbsp;|&nbsp;"+
                            linkArray[3]+"&nbsp;|&nbsp;"+
                            linkArray[4]+"&nbsp;|&nbsp;"+
                            linkArray[5]+"&nbsp;|&nbsp;"+
                            linkArray[6];
            }// 0=CHANGE-LANG, 1=HOME, 2=EDIT, 3=DISP, 4=HIST, 5=HELP, 6=LOGOUT, 7=ADMIN
            else if(ss.role.equals("sampler"))
            {
                    links = linkArray[1]+"&nbsp;|&nbsp;"+
                            linkArray[3]+"&nbsp;|&nbsp;"+
                            linkArray[5]+"&nbsp;|&nbsp;"+
                            linkArray[6];
            }// 0=CHANGE-LANG, 1=HOME, 2=EDIT, 3=DISP, 4=HIST, 5=HELP, 6=LOGOUT, 7=ADMIN
            else if(ss.role.equals("teacher"))
            {
                    links = linkArray[1]+"&nbsp;|&nbsp;"+
                            linkArray[2]+"&nbsp;|&nbsp;"+
                            linkArray[3]+"&nbsp;|&nbsp;"+
                            linkArray[4]+"&nbsp;|&nbsp;"+
                            linkArray[5]+"&nbsp;|&nbsp;"+
                            linkArray[6];
            }// 0=CHANGE-LANG, 1=HOME, 2=EDIT, 3=DISP, 4=HIST, 5=HELP, 6=LOGOUT, 7=ADMIN
            else if(ss.role.equals("student"))
            {
                    links = linkArray[1]+"&nbsp;|&nbsp;"+
                            linkArray[3]+"&nbsp;|&nbsp;"+
                            linkArray[4]+"&nbsp;|&nbsp;"+
                            linkArray[5]+"&nbsp;|&nbsp;"+
                            linkArray[6];
            }// 0=CHANGE-LANG, 1=HOME, 2=EDIT, 3=DISP, 4=HIST, 5=HELP, 6=LOGOUT, 7=ADMIN
            else if(ss.role.length() == 0) {links = "Role is empty";}

            return links;
    }


    public String roundButton(String button)
    {
            String roundBut = "<td align='center'><table cellpadding='0' cellspacing='0' border='0'><tr>"+
                    "<td class='button-lg-left' cellpadding='1'>&nbsp;</td>"+
                    "<td class='button-lg-mid'>"+button+"</td>"+
                    "<td class='button-lg-right' cellpadding='1'>&nbsp;</td></tr></table></td>";

            return roundBut;
    }


    public String getBut10()
    {
            String[] s =  {"<input type='submit' name='addwordsets' value='Add Words' class='button-lg-mid'/>",
                    "<input type='submit' name='addwordsets' value='単語を追加' class='button-lg-mid'/>"};
            return s[lang];
    }


    public String getBut11()
    {
            String[] s =  {"<input type='submit' name='login' value='Log in' class='button-lg-mid'/>",
                    "<input type='submit' name='login' value='ログイン' class='button-lg-mid'/>"};
            return s[lang];
    }


    public String getBut12()
    {
            String[] s =  {"<input type='submit' name='register' value='Register' class='button-lg-mid'/>",
                    "<input type='submit' name='register' value='登録' class='button-lg-mid'/>"};
            return s[lang];
    }


    public String getExp1()
    {
            String[] s =  {"Welcome to Hart Book", 
                    "Hart Bookへようこそ"};
            return s[lang];
    }


    public String getExp2()
    {
            String[] s =  {"Click <a href='/"+folder+"/mylists' target='_self'>My Lists</a> for studying, reviewing or testing.", 
                    "勉強、復習又はテストする為には<a href='/"+folder+"/mylists' target='_self'>私のリスト</a>をクリックして下さい。"};
            return s[lang];
    }


    public String getExp3()
    {
            String[] s =  {"Click <a href='/"+folder+"/displaylists' target='_self'>Display Lists</a> to see all of your lists.", 
                    "全てのリストを見るには<a href='/"+folder+"/displaylists' target='_self'>表示リスト</a>をクリックして下さい。"};
            return s[lang];
    }


    public String getExp4A()
    {
            String[] s =  {"Display Lists", 
                    "リストを表示する"};
            return s[lang];
    }


    public String getExp4()
    {
            String[] s =  {"Choose the type and the list you want to see: ", 
                    "見たいタイプとリストを選択して下さい"};
            return s[lang];
    }


    public String getExp5()
    {
            String[] s =  {"Choose How You Want to Learn", 
                    "学習方法を選択して下さい"};
            return s[lang];
    }


    public String getExp6()
    {
            String[] s =  {"First, choose the meanings you want to learn: ", 
                    "始めに学習したい単語を選択して下さい"};
            return s[lang];
    }


    public String getExp7()
    {
            String[] s =  {"Now, choose the type of words: ", 
                    "次に学習したい言葉のタイプを選択して下さい"};
            return s[lang];
    }

    // not being used now
    public String getExp8()
    {
            String[] s =  {"Then, choose the list of words from which you want to learn: ", 
                    "それから学習したい単語のリストを選択して下さい"};
            return s[lang];
    }


    public String getExp9()
    {
            String[] s =  {"Add ", 
                    "追加"};
            return s[lang];
    }


    public String getExp10()
    {
            String[] s =  {" from ", 
                    "から"};
            return s[lang];
    }


    public String getExp10A()
    {
            String[] s =  {" to My List ", 
                    "私のリストへ"};
            return s[lang];
    }


    public String getExp11()
    {
            String[] s =  {"Clear ", 
                    "消去"};
            return s[lang];
    }


    public String getExp12()
    {
            String[] s =  {"Welcome to My Study, ", 
                    "私の勉強へようこそ"};
            return s[lang];
    }


    public String getExp13()
    {
            String[] s =  {"Click to see the next set of words.", 
                    "クリックして次の単語のセットを見て下さい"};
            return s[lang];
    }


    public String getExp14()
    {
            String[] s =  {"Number of Rounds: ", 
                    "ラウンドの数"};
            return s[lang];
    }


    public String getExp15()
    {
            String[] s =  {"Welcome to My Review, ", 
                    "私の復習へようこそ"};
            return s[lang];
    }


    public String getExp16()
    {
            String[] s =  {"Congratulations!  You Were Right!", 
                    "おめでとうございます！正解です！"};
            return s[lang];
    }


    public String getExp17()
    {
            String[] s =  {"does mean", 
                    "の意味は"};
            return s[lang];
    }


    public String getExp18()
    {
            String[] s =  {"Sorry! That Was Not Right", 
                    "残念！不正解です"};
            return s[lang];
    }


    public String getExp19(SessionState ss)
    {
            if(ss.language.equals("japanese"))
            {
                    setLang(ss);

                    String[] s =  {"Your Guess was \""+ss.guess+"\", but \""+ss.wBean.getEng()+"\" means "+ss.wBean.getKan()+
                            " ( "+ss.wBean.getYom()+" )", 
                    "貴方の予想は\""+ss.guess+"\", でも \""+ss.wBean.getEng()+"\" の意味が "+ss.wBean.getKan()+
                            " ( "+ss.wBean.getYom()+" )"};
                    return s[lang];
            }
            else
            {
                    setLang(ss);

                    String[] s =  {"Your Guess was \""+ss.guess+"\", but \""+ss.wBean.getEng()+"\" means "+ss.wBean.getKan(), 
                    "貴方の予想は\""+ss.guess+"\", でも \""+ss.wBean.getEng()+"\" の意味が "+ss.wBean.getKan()};
                    return s[lang];
            }
    }


    public String getExp20(SessionState ss)
    {
            setLang(ss);

            // "+ss.wBean+" "+ss.wBean.getID()+" 
            String[] s =  {"Meaning Row: "+ss.wBean.getEng()+ss.wBean.getKan()+ss.wBean.getYom(), 
                    "一欄の意味: "+ss.wBean.getEng()+	ss.wBean.getKan()+ss.wBean.getYom()};
            return s[lang];
    }


    public String getExp21()
    {
            String[] s =  {"Move this set of meanings to: ", 
                    "移動したい一欄を選択して下さい"};
            return s[lang];
    }


    public String getExp22(SessionState ss)
    {
            setLang(ss);

            String[] s =  {"Number Right: "+ss.rightGuessRev+", Number Wrong: "+ss.wrongGuessRev+", Percent Correct: "+ss.percentCorrectRev+"% "+
                    "<br />Number of Rounds: "+ss.numOfRounds+", Word List Size: "+ss.wordList.size()+" Test List Size: "+ss.useList.size(), 
            "正解の数: "+ss.rightGuessRev+", 不正解の数: "+ss.wrongGuessRev+", 正解率: "+ss.percentCorrectRev+"% "+
                    "<br />ラウンドの数: "+ss.numOfRounds+", 単語一欄のサイズ: "+ss.wordList.size()+" テスト一欄のサイズ: "+ss.useList.size()};
            return s[lang];
    }


    public String getExp23(SessionState ss)
    {
            setLang(ss);

            String[] s =  {"Welcome to My Test, "+ss.userID+" ("+ss.psswd+") "+ss.role+" "+ss.whereCol+" "+ss.whereVal, 
                    " 私のテストへようこそ, "+ss.userID+" ("+ss.psswd+") "+ss.role+" "+ss.whereCol+" "+ss.whereVal};
            return s[lang];
    }


    public String getExp24(SessionState ss)
    {
            setLang(ss);

            String[] s =  {"Number Right: "+ss.rightGuessTest+", &nbsp;&nbsp;Total Right: "+ss.totalCorrectTest+
                    ", &nbsp;&nbsp;Total Right Percentage: "+ss.percentCorrectTest+"%,  &nbsp;&nbsp;Number of Rounds: "+ss.round, 
            "正解の数: "+	ss.rightGuessTest+", &nbsp;&nbsp;正解の合計: "+ss.totalCorrectTest+
                    ", &nbsp;&nbsp;正解率の合計: "+ss.percentCorrectTest+"%, &nbsp;&nbsp;ラウンドの数: "+ss.round};
            return s[lang];
    }


    public String getExp25A()
    {
            String[] s =  {"Click to see the next test&nbsp;&nbsp;", 
                    "クリックして次のテストを見てください"};
            return s[lang];
    }


    public String getExp25()
    {
            String[] s =  {"Correct Answers: ", 
                    "正解は"};
            return s[lang];
    }


    public String getExp26A()
    {
            String[] s =  {" means ", 
                    "の意味は"};
            return s[lang];
    }


    public String getExp26()
    {
            String[] s =  {"Your Answers: ", 
                    "貴方の答えは"};
            return s[lang];
    }


    public String getExp27()
    {
            String[] s =  {"Move the selected row to: ", 
                    "選択した一欄を移動する"};
            return s[lang];
    }


    public String getExp28()
    {
            String[] s =  {"Search for a word: ", 
                    "単語の検索"};
            return s[lang];
    }


    public String getExp29()
    {
            String[] s =  {"Please click on one of the links to start", 
                    "リンクをくりっくして始めて下さい"};
            return s[lang];
    }


    public String getExp30()
    {
            String[] s =  {"Click <a href='/"+folder+"/teachlists' target='_self'>Teacher Lists</a> for studying, reviewing or testing.", 
                    "勉強、復習又はテストする為には<a href='/"+folder+"/teachlists' target='_self'>先生のリスト</a>をクリックして下さい。"};
            return s[lang];
    }


    public String getExp31()
    {
            String[] s =  {"Click <a href='/"+folder+"/studyhistory.jsp' target='_self'>History</a> to see what you have done.", 
                    "あなたの履歴を見る為には<a href='/"+folder+"/studyhistory.jsp' target='_self'>履歴</a>をクリックして下さい。"};
            return s[lang];
    }


    /*public String getExp32()
    {
            setLang(ss);

            // add_popup stuff removed 
            String[] s =  {"<p class='p'>Click <a href='/"+folder+"/clear_popup.jsp' onClick='return popup(this, \"clearlist\", 700, 156)' class='small' >Clear</a> to remove all rows in a list.</p>", 
                    "<p class='p'>リストの単語を削除するには<a href='/"+folder+"/clear_popup.jsp' onClick='return popup(this, \"clearlist\", 700, 156)' class='small' >削除</a>をクリックして下さい。</p>"};
            // <p class='p'>Click <a href='/"+folder+"/add_popup.jsp' onClick='return popup(this, \"addlist\", 700, 156)' class='small' >Add</a> to put more rows in a list.</p>
            // <p class='p'>リストに単語を追加するには<a href='/"+folder+"/add_popup.jsp' onClick='return popup(this, \"addlist\", 700, 156)' class='small' >追加</a>をクリックして下さい。</p>

            return s[lang];
    }*/


    public String getExp32A()
    {
            String[] s =  {"<p class='p'>Click <a href='/"+folder+"/add_popup.jsp' onClick='return popup(this, \"addlist\", 700, 200)' class='small' >Add</a> to put more rows in a list.</p>", 
                    "<p class='p'>リストに単語を追加するには<a href='/"+folder+"/add_popup.jsp' onClick='return popup(this, \"addlist\", 700, 200)' class='small' >追加</a>をクリックして下さい。</p>"};
            return s[lang];
    }


    public String getExp32B()
    {
            String[] s =  {"<p class='p'>Click <a href='/"+folder+"/clear_popup.jsp' onClick='return popup(this, \"clearlist\", 700, 200)' class='small' >Clear</a> to remove all rows in a list.</p>", 
                    "<p class='p'>リストの単語を削除するには<a href='/"+folder+"/clear_popup.jsp' onClick='return popup(this, \"clearlist\", 700, 200)' class='small' >削除</a>をクリックして下さい。</p>"};
            return s[lang];
    }


    public String getExp33()
    {
            String[] s =  {"<p ><input type='radio' name='reading' value='kan' checked /> Kanji</p>",
                    "<p ><input type='radio' name='reading' value='kan' checked /> 漢字</p>"};
            return s[lang];
    }


    public String getExp34()
    {
            String[] s =  {"<p ><input type='radio' name='reading' value='yom' /> Hiragana</p>",
                    "<p ><input type='radio' name='reading' value='yom' /> ひらがな</p>"};
            return s[lang];
    }

    // IMPORTANT: Needs Translation
    public String getExp34A()
    {
            String[] s =  {"<p ><input type='radio' name='listSize' value='whole' /> Whole List</p>",
                    "<p ><input type='radio' name='listSize' value='whole' /> Whole List</p>"};
            return s[lang];
    }


    // IMPORTANT: Needs Translation
    public String getExp34B()
    {
            String[] s =  {"<p ><input type='radio' name='listSize' value='partial' checked /> Partial List</p>",
                    "<p ><input type='radio' name='listSize' value='partial' checked /> Partial List</p>"};
            return s[lang];
    }


    public String getExp35(SessionState ss)
    {
            setLang(ss);

            if(ss.table.equals("japanese"))
            {
                    String[] s = {"<p ><input type='radio' name='meaning' value='J' checked /> Japanese</p>",
                            "<p ><input type='radio' name='meaning' value='J' checked /> 日本語</p>"};

                            return s[lang];
            }
            else
            {
                    String[] s = {"<p ><input type='radio' name='meaning' value='J' checked /> "+ss.table+"</p>",
                            "<p ><input type='radio' name='meaning' value='J' checked /> "+ss.table+"</p>"};

                            return s[lang];
            }
    }


    public String getExp36()
    {
            String[] s =  {"<p ><input type='radio' name='meaning' value='E' /> English</p>",
                    "<p ><input type='radio' name='meaning' value='E' /> 英語</p>"};
            return s[lang];
    }


    public String getExp37()
    {
            String[] s =  {"This List is empty.", 
                    "このリストは空です"};
            return s[lang];
    }

    // Needs translation
    public String getExp38()
    {
            String[] s =  {"If a list is empty, click<a href='/"+folder+"/add_popup.jsp' onClick='return popup(this, \"addlist\", 700, 200)' class='small' > here </a>to add words to My List,<br />or click on Home and start again with a different list.<br />(Other lists will grow as you move rows through Review or Display Lists.)", 
                    "リストが空の場合は<a href='/"+folder+"/add_popup.jsp' onClick='return popup(this, \"addlist\", 700, 200)' class='small' >ここ</a>をクリックして私のリストに単語を追加して下さい。<br />又はホームをクリックして他のリストに行って下さい。<br />()"};
            return s[lang];
    }


    public String getExp39()
    {
            String[] s =  {"Contact Hart Co.", 
                    "Hart Coへ連絡して下さい"};
            return s[lang];
    }


    public String getExp40()
    {
            String[] s =  {"Choose the set of words<br>which you want to see: ", 
                    "見たい言葉のセットを選択して下さい "};
            return s[lang];
    }


    public String getExp41()
    {
            String[] s =  {"To create a new list name, click <A HREF='/"+folder+"/edit_list_names.jsp' >here</A>",
                    "新しいリスト名を作成するには<A HREF='/"+folder+"/edit_list_names.jsp' >ここ</A>をクリックして下さい。"};
            return s[lang];
    }

    // have keiko check this J
    public String getExp41A()
    {
            String[] s =  {"To create a new language table, or switch tables, click <A HREF='/"+folder+"/createLangTab.jsp' >here</A>", 
                    "新しい外国語テブルを作成するには<A HREF='/"+folder+"/createLangTab.jsp' >ここ</A>をクリックして下さい。"};
            return s[lang];
    }


    public String getExp42()
    {
            String[] s =  {"To create a quiz, click <A HREF='/"+folder+"/create_quiz.jsp' >here</A>",
                    "クイズを作成するには<A HREF='/"+folder+"/create_quiz.jsp' >ここ</A>をクリックして下さい。"};
            return s[lang];
    }

    // maybe don't use for editrows rowID link to example sentences popup
    public String getExp42A()
    {
            String[] s =  {"To create a quiz, click <A HREF='/"+folder+"/create_quiz.jsp' >here</A>",
                    "クイズを作成するには<A HREF='/"+folder+"/create_quiz.jsp' >ここ</A>をクリックして下さい。"};
            return s[lang];
    }


    public String getExp43()
    {
            String[] s =  {"(This Review will continue until you click on another link or move all the words.)", 
                    "(他のリンクにクリックしたりまたは全部の単語を移動したりするまで復習が続きます。)"};
            return s[lang];
    }


    // NEED Japanese
    public String getExp44()
    {
            String[] s =  {"Sorry, but your ID or Password was blank.</br>Please try again.",
                    ""};
            return s[lang];
    }
    
    
    /*
    public String getExp44()
    {
            String[] s =  {"If you were already logged in, you might have to wait up to 20 minutes to log in again.",
                    "既にログイン中ならばもう一度ログインするのに20分程度かかる場合がございます。"};
            return s[lang];
    }
    */

    // NEED Japanese
    public String getExp45()
    {
            String[] s =  {"Sorry, but there was a problem logging in.</br>That id is not in the database.</br>Please check your spelling.",
                    ""};
            return s[lang];
    }

    // IMPORTANT: Make a way to send people new passwords
    // NEED Japanese
    public String getExp45A()
    {
            String[] s =  {"Sorry, but there was a problem logging in.</br>That password does not match the ID.",
                    ""};
            return s[lang];
    }


    /*  original version
    public String getExp45()
    {
            String[] s =  {"Sorry, but there was a problem logging in.", 
                    "申し訳ありませんが問題が発生した為ログイン出来ません。"};
            return s[lang];
    }
    */

    // NEED Japanese
    public String getExp46()
    {
            String[] s =  {"Sorry, but that ID is still logged in.</br>Please wait (up to 20 minutes)</br>for automatic log-out.",
                    ""};
            return s[lang];
    }

    /*  original version
    public String getExp46()
    {
            String[] s =  {"Please try again if you misspelled something.",
                    "スペルを間違えたらもう一度ログインしてみて下さい。"};
            return s[lang];
    }
    */

    public String getExp47()
    {
            String[] s =  {"Add ", 
                    "追加,"};
            return s[lang];
    }


    public String getExp48()
    {
            String[] s =  {" from ", 
                    "から"};
            return s[lang];
    }


    public String getExp49()
    {
            String[] s =  {" to My List ", 
                    "私のリストへ"};
            return s[lang];
    }


    public String getExp50()
    {
            String[] s =  {"Home", 
                    "ホーム"};
            return s[lang];
    }


    public String getExp51()
    {
            String[] s =  {"Finished List", 
                    "リストが完成しました"};
            return s[lang];
    }


    public String getExp52()
    {
            String[] s =  {"Welcome to Hart Book", 
                    "Hart Bookへようこそ"};
            return s[lang];
    }


    public String getExp53()
    {
            String[] s =  {"User-ID: ", 
                    "ユーザーID: "};
            return s[lang];
    }


    // needs translation
    public String getExp54()
    {
            String[] s =  {"Password: ", 
                    "パスワード: "};
            return s[lang];
    }


    // needs translation
    public String getExp55()
    {
            String[] s =  {"Family Name: ", 
                    "名字: "};
            return s[lang];
    }


    // needs translation
    public String getExp56()
    {
            String[] s =  {"First Name: ", 
                    "名前: "};
            return s[lang];
    }

    // needs translation
    public String getExp57()
    {
            String[] s =  {"Email Address: ", 
                    "Eメールアドレス: "};
            return s[lang];
    }


    // needs translation
    public String getExp58()
    {
            String[] s =  {"Create UserID: ", 
                    "ユーザーID作成: "};
            return s[lang];
    }


    // needs translation
    public String getExp59()
    {
            String[] s =  {"Create Password: ", 
                    "パスワード入力: "};
            return s[lang];
    }


    // needs translation
    public String getExp60()
    {
            String[] s =  {"Re-enter Password: ", 
                    "パスワード再入力: "};
            return s[lang];
    }


    // needs translation
    public String getExp61()
    {
            String[] s =  {"<a href='/"+folder+"/switch_lang.jsp' onClick='return popup(this, \"help\", 750, 325)'>"+
                            "Change Language</a>", 
                    "<a href='/"+folder+"/switch_lang.jsp' onClick='return popup(this, \"help\", 750, 325)'>"+
                            "Change Language</a>"};
            return s[lang];
    }


    // needs translation
    public String getExp62()
    {
            String[] s =  {"If you are unsure what to do, please click on the Help link above (unique for each page).", 
                    "If you are unsure what to do, please click on the Help link above (unique for each page)."};
            return s[lang];
    }


    // needs translation
    public String getExp63()
    {
            String[] s =  {"<a href='/"+folder+"/examp_sent_popup.jsp'  onClick='return popup(this, \"help\", 750, 260)'>Example Sentences</a>", 
                    "<a href='/"+folder+"/examp_sent_popup.jsp'  onClick='return popup(this, \"help\", 750, 260)'>例文</a>"};
            return s[lang];
    }

    
    public String getExp64A()
    {
            String[] s =  {"Welcome to Hart Book", 
                    "ようこそHart Bookへ"};
            return s[lang];
    }

    
    public String getExp64()
    {
            String[] s =  {"This site is dedicated to helping you learn vocabulary.", 
                    "このサイトは英単語学習を手助けするものです。"};
            return s[lang];
    }

    
    public String getExp65()
    {
            String[] s =  {"Whether you are a Student, a Teacher or an Individual User, this system's tools will help you improve your language skills. There are three different and effective ways you can study English, Japanese or another tongue's vocabulary. (Click <a href='/"+folder+"/explanation_page.jsp'>here</a> to learn more.)",
                    "こちらのサイトは生徒の方や、教師の方々並びに個人で使用される方にとって言語能力を上達させる為のものです。 三つの効果的な違った方法で英語と日本語の単語を勉強する事が出来ます。<br />（詳しくは <a href='/"+folder+"/explanation_page.jsp'>こちら</a>をクリックして下さい。）"};
            return s[lang];
    }

    
    public String getExp66()
    {
            String[] s =  {"The words in this database can help prepare you for Step Tests (Eiken), the TOEIC or the TOEFL. If you are not planning to take a test, you can just use this system to polish your English, Japanese (Kanji or Yomi) or another tongue's skills.", 
                    "データベース中にある言葉は英検テスト並びにTOEIC、TOEFLにとても役立つ物です。 もしテストを受ける予定がなくてもこのシステムを使えば、英語又は日本語の能力を磨く事が出来ます。"};
            return s[lang];
    }

    
    public String getExp67()
    {
            String[] s =  {"Please click on <a href='/"+folder+"/sample.jsp'>Sample</a> to try this system. If you like it, please click on <a href='/"+folder+"/register.jsp'>Register</a> to sign up for free so you can store your lists in the database.", 
                    "<a href='/"+folder+"/sample.jsp'>サンプル</a>をクリックしてこのシステムを体験して見て下さい。 もし気に入られたら<a href='/"+folder+"/register.jsp'>登録</a>をクリックして無料でデータベースにリストを保存して下さい。"};
            return s[lang];
    }


    public String getExp68()
    {
            String[] s =  {"This site is dedicated to helping you learn vocabulary.", 
                    "このサイトは英単語学習を手助けするものです。"};
            return s[lang];
    }

    
    public String getExp69()
    {
            String[] s =  {"It is designed as a tool for any user, student or teacher to use lists of rows of vocabulary from the database. A row includes an English word and a meaning in Japanese (both Kanji and Yomi) or another language.", 
                    "生徒さん並びに先生方、全てのユーザーの為にデザインされており、データベースより単語のリストを使用します。単語には英語と日本語の意味が含まれています(漢字と読み)。"};
            return s[lang];
    }

    
    public String getExp70()
    {
            String[] s =  {"You use the rows to:", 
                    "一欄の使用方法: "};
            return s[lang];
    }

    
    public String getExp71()
    {
            String[] s =  {"Study a list of words one by one and all of their meanings in the other language (that have been entered into the database so far)", 
                    "リストの単語を一つずつ勉強しながらその単語の意味を知る事が出来ます。(データベースに既に入力された単語)"};
            return s[lang];
    }

        
    public String getExp72()
    {
            String[] s =  {"Review a list of words one by one and choose each meaning from a group of choices", 
                    "リストの単語を一つずつ復習して、いくつかの選択肢の中から意味を選ぶ事が出来ます。"};
            return s[lang];
    }

    
    public String getExp73()
    {
            String[] s =  {"Test yourself by viewing a list of words one by one and typing each of the meanings in the space provided.", 
                    "リストの単語を一つずつテストする事が出来その意味を与えられたスペースに入力できます。"};
            return s[lang];
    }

    
    public String getExp74()
    {
            String[] s =  {"To do so, you use: ", 
                    "リスト使用にあたって: "};
            return s[lang];
    }
    
    
    public String getExp75()
    {
            String[] s =  {"My List - for those words you want to study a lot", 
                    "私のリスト ー たくさん勉強したい単語"};
            return s[lang];
    }
    
    
    public String getExp76()
    {
            String[] s =  {"Maybe Know List - for those words you know pretty well and only want to review occasionally", 
                    "たぶん知っているリスト ー だいたい知っているが時々復習したい単語"};
            return s[lang];
    }
    
    
    public String getExp77()
    {
            String[] s =  {"Know List - for those words you know extremely well and rarely want to review", 
                    "知っているリスト ー よく知っていてまれに復習したい単語"};
            return s[lang];
    }
    
    
    public String getExp78()
    {
            String[] s =  {"(Maybe Know List and Know List are empty to begin with and may be filled by moving rows to them on the Review and Display List pages.)", 
                    "(たぶん知っているリストと知っているリストは空の状態でスタートしますが、そのリストに単語を移動したければ復習ページか、表示リストページで出来ます。)"};
            return s[lang];
    }
    
    
    public String getExp79()
    {
            String[] s =  {"My List is filled with rows by choosing from word types (Verbs, Nouns, Adjectives and Miscellaneous) and choosing from the desired Step Test (Eiken) level (Step 4, Step 3 and Step Pre 2 are available so far).", 
                    "私のリストは単語の種類により分けられた一欄で構成されています（動詞、名詞、形容詞そして雑多詞）そして好みにより英検のレベルを選択出来ます（英検4級、英検3級、英検準2級など"};
            return s[lang];
    }
    
    
    public String getExp80()
    {
            String[] s =  {"Please click on <a href='/"+folder+"/sample.jsp'>Sample</a> to try this system. If you like it, please click on <a href='/"+folder+"/register.jsp'>Register</a> to sign up for free so you can store your lists in the database.", 
                    "<a href='/"+folder+"/sample.jsp'>サンプル</a>をクリックしてこのシステムを体験して見て下さい。もし気に入られたら<a href='/"+folder+"/register.jsp'>登録</a>をクリックして無料でデータベースにリストを保存して下さい。"};
            return s[lang];
    }
    
    
    // needs translation
    public String getExp81()
    {
            String[] s =  {"You have logged out.", 
                    "ログアウトしました。"};
            return s[lang];
    }

    
    // needs translation
    public String getExp82()
    {
            String[] s =  {"You may want to<br /><a href='/"+folder+"/login.jsp' target='_self'>Log In Again</a>", 
                    "もう一度<br /><a href='/"+folder+"/login.jsp' target='_self'>ログイン</a>"};
            return s[lang];
    }


    // needs translation
    public String getExp83(SessionState ss)
    {
            String[] s =  {getExp32A()+getExp32B(),
                    ss.language+getExp32B()};
            return s[lang];
    }

    
    // needs translation
    public String getExp()
    {
            String[] s =  {"", 
                    "japanese"};
            return s[lang];
    }

}
