package com.melonsail.app.melonfriends.utils;

import java.text.SimpleDateFormat;

public class Const {
	
	// date format 
	public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ");
	
	// Messenger Request
	public static final int MSG_CLIENT_REGISTER = 101;
	public static final int MSG_CLIENT_UNREGISTER = 102;
	public static final int MSG_SERVICE_LOGIN = 103;
	public static final int MSG_SERVICE_LOGOUT = 104;
	public static final int MSG_SERVICE_SET_REFRESH_INTERNAL = 111;
	
	public static final int MSG_SERVICE_GET_NEWFEED = 201;
	public static final int MSG_SERVICE_POST_COMMENT = 202;
	public static final int MSG_SERVICE_POST_PHOTO = 203;
	public static final int MSG_SERVICE_POST_BLOG = 204;
	public static final int MSG_SERVICE_POST_LIKE = 205;
	public static final int MSG_SERVICE_POST_REPLY = 206;
	
	
	public static final int MSG_UI_RECEIVE_NEWFEED = 301;
	
	public static final int MSG_UI_RECEIVE_NEWFEED_ERROR = 401;

	//==============DBHelper================================
	public static final String TAG = "FriendsHost";
	public static final String SNS_FACEBOOK = "Facebook";
	public static final String SNS_RENREN = "Renren";
	public static final String SNS_SINA = "Sina";
	public static final String SNS_TWITTER="Twitter";
	public static final String SNS_DUMMY = "Dummy";
	
	public static final String LOGIN_ID_FACEBOOK = "Login_ID_Facebook";
	public static final String LOGIN_HEAD_RENREN = "Login_Head_Renren";
	public static final String LOGIN_HEAD_SINA = "Login_Head_Sina";
	public static final String LOGIN_HEAD_TWITTER = "Login_Head_Twitter";
	
	public static final String SNS = "sns";
	public static final String SNS_ACTIVE = "sns_active";
	public static final String SNS_TOKEN = "_token";
	public static final String SNS_READITEM_UPDATETIME = "_readitem_updatetime";
	public static final String SNS_SIGN_ON = "SnsSignOn";
	public static final String SNS_PULL_TO_REFRESH = "sns_pull_to_refresh";
	
	public static final String DELIMETER = ";";
	
	//==============DBHelper================================
	public static final String SP_SINA_TOKENKEY = "SinaTokeyKey";
	public static final String SP_SINA_TOKENSECRET = "SinaTokeySecret";
	
	//==============Intent===================================
	public static final String ACTION_DISPLAYFEED = "DisplayFeed";

	//==============Notification============================
	public static final int FRIENDSHOST_NOTIFY_ID = 1;
	
	//=============UploadPhoto Method=======================
	public static enum photoLoc {Galary, Shot};
	
	//=============Sina Auth=============================
	public static final String SINA_AUTH = "weibo4andriod";
	
	//=============Twitter Auth ============================
	public static final String	OAUTH_CALLBACK_SCHEME	= "x-oauthflow-twitter";
	public static final String	OAUTH_CALLBACK_HOST		= "callback";
	public static final String	OAUTH_CALLBACK_URL		= OAUTH_CALLBACK_SCHEME + "://" + OAUTH_CALLBACK_HOST;
	
	public static final String REQUEST_URL = "http://api.twitter.com/oauth/request_token";
	public static final String ACCESS_URL = "http://api.twitter.com/oauth/access_token";
	public static final String AUTHORIZE_URL = "http://api.twitter.com/oauth/authorize";
	
	//=============Activity Request Code===========================
	public static final int FEED_RESEND_REQ_CD = 3;
	public static final int FEED_PUBLISH = 2;
	public static final int FEED_DISPLAY_DETAIL = 1;
	public static final int FEED_DISPLAY_PREVIEW = 0;
	public static final int FEED_DETAIL_RETURN_MAIN = 2000;
	
	//==============Feed Item Attributes========================
	public static final String FEED_ITEM = "feeditem";
	public static final String SFEEDID = "feedid";
	public static final String SHEADIMG = "sHeadImg";
	public static final String SNAME = "sName";
	public static final String SOWNERID = "sOwnerID";
	public static final String SCREATEDTIME = "sCreatedTime";
	public static final String SFEEDTYPE = "sFeedType";
	public static final String SMSGBODY = "sMsgBody";
	public static final String SLINK = "sLink";
	public static final String SRESOURCEID = "sResource_id";
	public static final String SSTORY = "sStory";
	public static final String SSTORY_TAGS = "sStory_Tags";
	public static final String SPHOTOPREVIEWLINK = "sPhotoPreviewLink";
	public static final String SPHOTOPREVIEWNAME = "sPhotoPreviewName";
	public static final String SPHOTOPREVIEWCAPTION = "sPhotoPreviewCaption";
	public static final String SPHOTOPREVIEWDESCRIPTION = "sPhotoPreviewDescription";

	//=============Friend Item Attributes==========================
	public static final String FID = "fId";
	public static final String FNAME = "fName";
	public static final String FHEADURL = "fHeadurl";
	public static final String FSNS = "fSns";
	
	//=============Comment Item Attributes==========================
	public static final String COMMENTED_FEEDID = "commetedfeedID";
	public static final String COMMENTED_ID = "commentedID";
	public static final String COMMENTED_TIME = "commentedTime";
	public static final String COMMENTED_MSG = "commentedMsg";
	public static final String COMMENTED_USERID = "commentedUserID";
	public static final String COMMENTED_NAME = "commentedName";
	public static final String COMMENTED_HEADURL = "commentedHeadUrl";
	public static final String COMMENTS = "comments";
	public static final String FRIEND = "friend";
	
	//=============Login Setting======================================
	public static final String SETTING_REQ_KEY = "SettingReqKey";
	public static final String SETTING_ACNT = "SignOn";
	public static final String[] SNSGROUPS = new String[] { SNS_FACEBOOK, SNS_RENREN, SNS_SINA, SNS_TWITTER};
	
	public static final String SETTING_BASIC = "Settings";
	public static final String[] SETTING_BASIC_GROUPS = {"Schedule"};
	//public static final String[][] SETTING_UPT_FREQ = {{"Never","0"},{"30mins","1800"},{"2hours","7200"},{"6hours","21600"},{"1day","86400"}};
	public static final String[] SETTING_UPT_FREQ_BTN_TEXT = {"Never","15mins","1hour","4hours", "12hours"};
	public static final int[] SETTING_UPT_FREQ_DURATION = {0,900,3600,14400,57600,172800};
	
	public static final String SETTING_FEEDBACKS = "FeedBacks";
	public static final String[] SETTING_FEEDBACKS_GROUPS = { "FeedBacks", "Rate It","Help"};
	
	
	//============Views Name =======================================
	public static final String VIEW_MAIN = "MainUIView";
	public static final String HTTP_METHOD_POST = "POST";
	public static final String HTTP_METHOD_DELETE = "DELETE";

	  //=============Dialog View======================================
	public static final String DIALOG_VIEW_ID = "DialogViewId";
	public static final int CD_REQ_DIALOG = 1;
	public static final String DIALOG_THEME_ID = "DialogThemeId";  
	
	
	//============Service Message===================================
	public static final int SERVICE_REFRESH_FEED = 1;
	public static final int SERVICE_UPDATE_FREQ = 2;

	
	//============Initial Guide=====================================
	public static final String VIEW_GUIDE = "ViewGuide";
	
	//============Detail View Get Feed==============================
	public static final String SHOWDETAIL_SNS = "ShowDetail_SNS";
	public static final String SHOWDETAIL_FEEDID = "ShowDetail_FEEDID";
	
}
