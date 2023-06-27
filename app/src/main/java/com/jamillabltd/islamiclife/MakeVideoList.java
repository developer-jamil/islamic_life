
package com.jamillabltd.islamiclife;

import android.content.Context;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayListForVideo(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================

	//===============================Some automation by Juba
	public static void createCategoryForWebsite(String category_name, Integer drawable, String url){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		hashMap.put("url", url);
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================

	//===============================Some automation by Juba
	public static void createCategoryForPDF(String category_name, Integer drawable, String pdfAssetName){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		hashMap.put("pdfAssetName", pdfAssetName);
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(Context context){

		rootArrayList = new ArrayList<>();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();

		/*
		//========================Video Item Category
		addVideoItem("GgaxcNmm4UU", "Ei Mom Jochonay | Madhubanti Mukherjee", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("qPna1ZlRxTo", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("hegsoEcow8Q", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("kLHCDZeTVJk", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		createPlayListForVideo("Funny Dog", R.drawable.category_1);

		//=========================Category for website loader
		createCategoryForWebsite("Prothom Alo", R.drawable.category_2, "https://www.prothomalo.com/");

		//=========================Category for website loader
		createCategoryForWebsite("PDF FromUrl", R.drawable.category_3, "https://drive.google.com/file/d/1vB-oWIwJU6KuIKnIoqWukjZEyNjrd7IJ/view?usp=sharing");

		//===========================Category for PDF Viewer
		createCategoryForPDF("PDF FromAsset", R.drawable.category_4, "my_sample_pdf.pdf");
		//==========================================================================*
		 */


		//========================Video Item Category
		//==========================================================================
		addVideoItem("MxkQM92MSzI", "হযরত মুহাম্মদ সাঃ এর জীবনী এবং আমাদের শিক্ষা", "Mizanur Rahman Azhari - মিজানুর রহমান আজহারির সেরা একটি ওয়াজ রাসুল (সাঃ) এর জীবনী নিয়ে।");
		addVideoItem("pnEsxeTQbGE", "জীবনে যা পেলে আর কিছু লাগে না", "জীবনের অপরিহার্য় অংশগুলো নিয়ে উস্তাদ নোমান আলী খানের অসাধারণ একটি বয়ান।");
		addVideoItem("f_FGuxlZHTM", "রাসুল (সাঃ) এর জীবনী", "Abu Toha Muhammad adnan - আবু ত্বহা আদনান এর সেরা একটি ওয়াজ রাসুল (সাঃ) এর জীবনী নিয়ে।");
		addVideoItem("4om_jroKe3U", "ইসলামের সারমর্ম", "কুরআনের যে আয়াত পুরো দ্বীন ইসলামের সারমর্ম পেশ করে | মিজানুর রহমান আজহারি");
		addVideoItem("GUQ5pdXWrZc", "ভাল মুসলিম কে? কীভাবে একজন ভাল মুসলিম বা মুমিন হওয়া যায়?", "ডাঃ জাকির নায়কের শ্রেষ্ঠ একেটি প্রশ্ন উত্তর পর্ব।");
		addVideoItem("G-GjC-PKLu4", "মৃত্যুর সময় মানুষ যে কারণে চিৎকার দিয়ে উঠে", "At the time of death people cried out. mizanur rahman azhari");
		addVideoItem("bK4Gk682Kfc", "জীবনে আর গুনাহ করতে মন চাইবেনা", "ওয়াজটি একবার শুনুন । মনে হয়না জীবনে আর গুনাহ করবেন। Golam sarwar saide");
		addVideoItem("dNGokWgQwQs", "টেনশন থেকে মুক্তি পাওয়ার উপায়", "যারা অতিরিক্ত টেনশন করেন তারা এই কথাগুলো একবার শুনুন। মিজানুর রহমান আজহারি");
		addVideoItem("k4vm4HASsJo", "সাহাবীর জানাজায় ফেরেশতা !! মিজানুর রহমান আজহারী |", "Watch Mizanur Rahman Azhari Bangla Waz “New Waz 2023 ");
		addVideoItem("_4msv5qILRk", "ইব্রাহিম আঃ এর জীবনী | মিজানুর রহমান আজহারী", "Watch Mizanur Rahman Azhari Waz “Story of Ibrahim Prophet – ইব্রাহিম আঃ এর জীবনী”");
		addVideoItem("3_R4Ck30wCY", "দোয়া কবুলের গোপন রহস্য Bangla Waz by Mizanur Rahman Azhari", "Mizanur rahman azhari bangla waz duwa kobuler gupon rohossho মাওলানা মিজানুর রহমান আজহারী বাংলা ওয়াজ দোয়া কবুলের গোপন রহস্য।");
		addVideoItem("GoSwEBp7e9s", "চার খলিফার জীবনি | সাহাবীদের জীবনি | Bangla Waz by Mizanur Rahman Azhari", "Mizanur rahman azhari bangla waz 2018 about islamic history of four khalifa and sahabi (raw) মিজানুর রহমান আজহারী বাংলা ওয়াজ ");
		addVideoItem("Zuk6PZTVtdk", "কবরের প্রথম রাতে আপনার সাথে যা হবে জানলে অবাক হবেন। Golam sarwar saide", "কবরের প্রথম রাতে আপনার সাথে যা হবে জানলে অবাক হবেন। Golam sarwar saide");
		addVideoItem("R0VELnDTjlc", "জাহান্নামের ভয়াবহতা। Bangla Waz। Allama Delwar Hossain Saidi।", "In this particular waz Maulana Saidi explains the severe torment of hell fire for people who do not obey Allah and follow his command in this world. ");
		addVideoItem("4LwSAYGUtNg", "আল্লামা মামুনুল হক সাহেবের কঠিন হুংকার | Bangla Waz 2019 |", "আল্লামা মামুনুল হক সাহেবের কঠিন হুংকার | Bangla Waz 2019");
		addVideoItem("jbfwV_u48KA", "নবীর কষ্টের জীবনী নিয়ে কান্নার এক বয়ান।", "নবীর কষ্টের জীবনী নিয়ে কান্নার এক বয়ান। বলে কাঁদালেন মাঠের সবাইকে। মাওলানা ইলিয়াছুর রহমান জিহাদী।");
		addVideoItem("axrI4Ak4n2E", "ঈদের দিনের সুন্নাত আবু ত্বহা মুহাম্মদ আদনান |", "ঈদের দিনের সুন্নাত আবু ত্বহা মুহাম্মদ আদনান || Eid Sunnah || Abu taha Muhammad Adnan  @TawHaaTv");
		addVideoItem("uWyEfhKreWI", "ঈদের দিন যে কাজগুলো করতে হবে", "Mizanur Rahman Azhari New Waz Eider Diner Amol. Eid Mubarak Mizanur Rahman Azhari Waz. ");
		addVideoItem("GUmQqzBm_pw", "স্বর্ণ অলংকার এর যাকাত কিভাবে আদায় করবেন", "ব্যবহৃত সোনার গহনার যাকাত কিভাবে দিতে হবে।");
		addVideoItem("cDqbzt0oh6I", "জ্বিলহজ্ব মাসের প্রথম ১০দিনের আমল।", "জ্বিলহজ্ব মাসের প্রথম ১০দিনের আমল। আবু ত্বহা মুহাম্মদ আদনান || বাংলা ওয়াজ | abu taha muhammad adnan ");
		addVideoItem("4ahY4khbsyo", "কোরবানীর শিক্ষা । আল্লামা দেলাওয়ার হোসাইন সাঈদী ।", "আল্লামা দেলাওয়ার হোসাইন সাঈদী । Qorbanir Shikkha । Allama Delwar Hossain Sayedee");
		addVideoItem("ry74mqXTEFw", "কুরবানী কার উপর ফরজ? শায়খ আহমাদুল্লাহ ।", "কোরবানির কার উপর ফরজ | Shaykh Ahmadullah waz");
		addVideoItem("_40jFCgnJz4", "মুমিন ব্যক্তি বেশি দিন বাঁচে না কেন?", "মুমিন ব্যক্তি বেশি দিন বাঁচে না কেন maulana Golam sarwar saide Waz sm");
		addVideoItem("pQaYJAlJFmo", "দোয়া কবুলের মাস", "আজহারী রমাজানের সেরা ওয়াজ | mizanur rahman azhari Ramadan new waz | মিজানুর রহমান আজহারী নতুন ওয়াজ");
		addVideoItem("r5aDVjM9E3c", "মিজানুর রহমান আজহারী হুজুরের জীবন পাল্টে দেওয়া ওয়াজ | ", "Mizanur Rahman Azhari New Waz Jibon Palte Dewa Waz InshaAllah. Surah Ikhlash Tafsir Bangla by Mizanur Rahman Azhari.");
		addVideoItem("SmdrmNb-nnI", "নামাজের গুরুত্ব ও ফযিলত - দেলাওয়ার হোসাইন সাঈদী", " Namajer Gurutto O Fojilot - Sayeedi | Bangla Waz");

		createPlayListForVideo(context.getString(R.string.category_name_1), R.drawable.category_1);
		//==========================================================================

		//==========================================================================
		addVideoItem("sjS8vkvycmw", context.getString(R.string.surah_title_1), context.getString(R.string.surah_des_text));
		addVideoItem("Hvo4NeUxLdc", context.getString(R.string.surah_title_2), context.getString(R.string.surah_des_text));
		addVideoItem("JAdx6tR1WnQ", context.getString(R.string.surah_title_3),  context.getString(R.string.surah_des_text));
		addVideoItem("QER4JTHn-0E", context.getString(R.string.surah_title_4), context.getString(R.string.surah_des_text));
		addVideoItem("lH-siAW6qgI", context.getString(R.string.surah_title_5), context.getString(R.string.surah_des_text));
		addVideoItem("Hqt9lIFndko", context.getString(R.string.surah_title_6), context.getString(R.string.surah_des_text));
		addVideoItem("3Wmf9YH3jE0", context.getString(R.string.surah_title_7), context.getString(R.string.surah_des_text));
		addVideoItem("NuhowPIwQnY", context.getString(R.string.surah_title_8),  context.getString(R.string.surah_des_text));
		addVideoItem("WEkenhA5mPU", context.getString(R.string.surah_title_9),  context.getString(R.string.surah_des_text));
		addVideoItem("Lu-n16Dvn_U", context.getString(R.string.surah_title_10), context.getString(R.string.surah_des_text));
		addVideoItem("35TzhLl_bxA", context.getString(R.string.surah_title_11), context.getString(R.string.surah_des_text));
		addVideoItem("2gYbC7V99bE", context.getString(R.string.surah_title_12), context.getString(R.string.surah_des_text));
		addVideoItem("zaCtU6ICQwM", context.getString(R.string.surah_title_13), context.getString(R.string.surah_des_text));
		addVideoItem("r1rttkN95fM", context.getString(R.string.surah_title_14), context.getString(R.string.surah_des_text));
		addVideoItem("5hfZfYtNyyc", context.getString(R.string.surah_title_15), context.getString(R.string.surah_des_text));
		addVideoItem("E2QfGcVJgVc", context.getString(R.string.surah_title_16), context.getString(R.string.surah_des_text));
		addVideoItem("AnnupMVYFW4", context.getString(R.string.surah_title_17), context.getString(R.string.surah_des_text));
		addVideoItem("OSAIZ5mRA9k", context.getString(R.string.surah_title_18), context.getString(R.string.surah_des_text));
		addVideoItem("tbOo7KvAV-g", context.getString(R.string.surah_title_19), context.getString(R.string.surah_des_text));
		addVideoItem("lgxhTUXS-cE", context.getString(R.string.surah_title_20), context.getString(R.string.surah_des_text));
		addVideoItem("0VbXvzUB4aI", context.getString(R.string.surah_title_21), context.getString(R.string.surah_des_text));
		addVideoItem("fEQ4yD2SqqE", context.getString(R.string.surah_title_22), context.getString(R.string.surah_des_text));
		addVideoItem("FlmvtkakSfg", context.getString(R.string.surah_title_23), context.getString(R.string.surah_des_text));
		addVideoItem("TVC8A720lgc", context.getString(R.string.surah_title_24), context.getString(R.string.surah_des_text));
		addVideoItem("44bpk_QSJpo", context.getString(R.string.surah_title_25), context.getString(R.string.surah_des_text));
		addVideoItem("LYnfRh6SlgQ", context.getString(R.string.surah_title_26), context.getString(R.string.surah_des_text));
		addVideoItem("3Q6qY-GOzFo", context.getString(R.string.surah_title_27), context.getString(R.string.surah_des_text));
		addVideoItem("qgeHsDYqjpM", context.getString(R.string.surah_title_28), context.getString(R.string.surah_des_text));
		addVideoItem("AAMqxrFhP6Y", context.getString(R.string.surah_title_29), context.getString(R.string.surah_des_text));
		addVideoItem("Kb0GuzuTxys", context.getString(R.string.surah_title_30), context.getString(R.string.surah_des_text));
		addVideoItem("BXQNWTH5b6g", context.getString(R.string.surah_title_31), context.getString(R.string.surah_des_text));
		addVideoItem("fyTTBm40EsI", context.getString(R.string.surah_title_32), context.getString(R.string.surah_des_text));
		addVideoItem("fO6-swedJ1Y", context.getString(R.string.surah_title_33), context.getString(R.string.surah_des_text));
		addVideoItem("oVP46R8tRnE", context.getString(R.string.surah_title_34), context.getString(R.string.surah_des_text));
		addVideoItem("MA9vsGaH3U0", context.getString(R.string.surah_title_35), context.getString(R.string.surah_des_text));
		addVideoItem("tOafZpE1KvE", context.getString(R.string.surah_title_36), context.getString(R.string.surah_des_text));
		addVideoItem("MQbWkv8E4NQ", context.getString(R.string.surah_title_37), context.getString(R.string.surah_des_text));
		addVideoItem("583u5D3p4hA", context.getString(R.string.surah_title_38), context.getString(R.string.surah_des_text));
		addVideoItem("aoJzNFZD_fA", context.getString(R.string.surah_title_39), context.getString(R.string.surah_des_text));
		addVideoItem("atfTeTESraU", context.getString(R.string.surah_title_40), context.getString(R.string.surah_des_text));
		addVideoItem("8OKv3US9MuQ", context.getString(R.string.surah_title_41), context.getString(R.string.surah_des_text));
		addVideoItem("3m-6L-WLcE0", context.getString(R.string.surah_title_42), context.getString(R.string.surah_des_text));
		addVideoItem("Y2Tx95Ub974", context.getString(R.string.surah_title_43), context.getString(R.string.surah_des_text));
		addVideoItem("xa-XjV0kfQI", context.getString(R.string.surah_title_44), context.getString(R.string.surah_des_text));
		addVideoItem("D7JHBkGMCl8", context.getString(R.string.surah_title_45), context.getString(R.string.surah_des_text));
		addVideoItem("xm-n_LO-slY", context.getString(R.string.surah_title_46), context.getString(R.string.surah_des_text));
		addVideoItem("rYeTZbOTNyg", context.getString(R.string.surah_title_47), context.getString(R.string.surah_des_text));
		addVideoItem("yY-hD9nj9-k", context.getString(R.string.surah_title_48), context.getString(R.string.surah_des_text));
		addVideoItem("RFow2bQ51-8", context.getString(R.string.surah_title_49), context.getString(R.string.surah_des_text));
		addVideoItem("TWXxn2gJMw4", context.getString(R.string.surah_title_50), context.getString(R.string.surah_des_text));
		addVideoItem("4gr_pUrJ8SA", context.getString(R.string.surah_title_51), context.getString(R.string.surah_des_text));
		addVideoItem("z9yzYp3kMuo", context.getString(R.string.surah_title_52), context.getString(R.string.surah_des_text));
		addVideoItem("-BOPRK-5Tag", context.getString(R.string.surah_title_53), context.getString(R.string.surah_des_text));
		addVideoItem("o4snn9Kxvr8", context.getString(R.string.surah_title_54), context.getString(R.string.surah_des_text));
		addVideoItem("0OklPDe2AVQ", context.getString(R.string.surah_title_55), context.getString(R.string.surah_des_text));
		addVideoItem("V7a8GOaE-fU", context.getString(R.string.surah_title_56), context.getString(R.string.surah_des_text));
		addVideoItem("08kKYHMf1Qw", context.getString(R.string.surah_title_57), context.getString(R.string.surah_des_text));
		addVideoItem("fZc5B-T55zU", context.getString(R.string.surah_title_58), context.getString(R.string.surah_des_text));
		addVideoItem("Ev2F3QmAM_8", context.getString(R.string.surah_title_59), context.getString(R.string.surah_des_text));
		addVideoItem("Sb-eTTMZogQ", context.getString(R.string.surah_title_60), context.getString(R.string.surah_des_text));
		addVideoItem("jx8kWsX2Wj4", context.getString(R.string.surah_title_61), context.getString(R.string.surah_des_text));
		addVideoItem("85OykieQ92U", context.getString(R.string.surah_title_62), context.getString(R.string.surah_des_text));
		addVideoItem("omtp5navQdI", context.getString(R.string.surah_title_63), context.getString(R.string.surah_des_text));
		addVideoItem("3qfknrCiU20", context.getString(R.string.surah_title_64), context.getString(R.string.surah_des_text));
		addVideoItem("pwhcl4kD9FY", context.getString(R.string.surah_title_65), context.getString(R.string.surah_des_text));
		addVideoItem("LnAVrcrbk2A", context.getString(R.string.surah_title_66), context.getString(R.string.surah_des_text));
		addVideoItem("DfOAOwGxH1c", context.getString(R.string.surah_title_67), context.getString(R.string.surah_des_text));
		addVideoItem("TEpKHsVWkbI", context.getString(R.string.surah_title_68), context.getString(R.string.surah_des_text));
		addVideoItem("r8XvAGjbjKw", context.getString(R.string.surah_title_69), context.getString(R.string.surah_des_text));
		addVideoItem("d4-fP_dekW8", context.getString(R.string.surah_title_70), context.getString(R.string.surah_des_text));
		addVideoItem("Ef3oDvtYMz8", context.getString(R.string.surah_title_71), context.getString(R.string.surah_des_text));
		addVideoItem("x8JaJTGd4TQ", context.getString(R.string.surah_title_72), context.getString(R.string.surah_des_text));
		addVideoItem("44jkgZ-zobY", context.getString(R.string.surah_title_73), context.getString(R.string.surah_des_text));
		addVideoItem("wmXTkzl-RmI", context.getString(R.string.surah_title_74), context.getString(R.string.surah_des_text));
		addVideoItem("RC7VYGI4tCI", context.getString(R.string.surah_title_75), context.getString(R.string.surah_des_text));
		addVideoItem("KZZjLT-GudI", context.getString(R.string.surah_title_76), context.getString(R.string.surah_des_text));
		addVideoItem("KCCKfnYSM7Q", context.getString(R.string.surah_title_77), context.getString(R.string.surah_des_text));
		addVideoItem("WqrHnDz8MOY", context.getString(R.string.surah_title_78), context.getString(R.string.surah_des_text));
		addVideoItem("0O25KB1lXLA", context.getString(R.string.surah_title_79), context.getString(R.string.surah_des_text));
		addVideoItem("KBYGHr4IsQY", context.getString(R.string.surah_title_80), context.getString(R.string.surah_des_text));
		addVideoItem("XNn_elVu4pI", context.getString(R.string.surah_title_81), context.getString(R.string.surah_des_text));
		addVideoItem("at5VTAwB5XI", context.getString(R.string.surah_title_82), context.getString(R.string.surah_des_text));
		addVideoItem("OWbbAoRsj_k", context.getString(R.string.surah_title_83), context.getString(R.string.surah_des_text));
		addVideoItem("sCM166IoT3I", context.getString(R.string.surah_title_84), context.getString(R.string.surah_des_text));
		addVideoItem("RPgYKfyzhKI", context.getString(R.string.surah_title_85), context.getString(R.string.surah_des_text));
		addVideoItem("kqlODaDH4Zc", context.getString(R.string.surah_title_86), context.getString(R.string.surah_des_text));
		addVideoItem("mHg6kB2mAww", context.getString(R.string.surah_title_87), context.getString(R.string.surah_des_text));
		addVideoItem("QU5tIoKjscg", context.getString(R.string.surah_title_88), context.getString(R.string.surah_des_text));
		addVideoItem("sf7-1vXMxD4", context.getString(R.string.surah_title_89), context.getString(R.string.surah_des_text));
		addVideoItem("-GtTajxae8g", context.getString(R.string.surah_title_90), context.getString(R.string.surah_des_text));
		addVideoItem("PfG3uMOUtLo", context.getString(R.string.surah_title_91), context.getString(R.string.surah_des_text));
		addVideoItem("iOS16WRLu4M", context.getString(R.string.surah_title_92), context.getString(R.string.surah_des_text));
		addVideoItem("AM_VULpFcNo", context.getString(R.string.surah_title_93), context.getString(R.string.surah_des_text));
		addVideoItem("zpPaOREAkqw", context.getString(R.string.surah_title_94), context.getString(R.string.surah_des_text));
		addVideoItem("1eji_5tZb-c", context.getString(R.string.surah_title_95), context.getString(R.string.surah_des_text));
		addVideoItem("rqK41yKCKiM", context.getString(R.string.surah_title_96), context.getString(R.string.surah_des_text));
		addVideoItem("2J8TN346ff8", context.getString(R.string.surah_title_97), context.getString(R.string.surah_des_text));
		addVideoItem("vb9ChJaf7cM", context.getString(R.string.surah_title_98), context.getString(R.string.surah_des_text));
		addVideoItem("XCUIVzfW49c", context.getString(R.string.surah_title_99), context.getString(R.string.surah_des_text));
		addVideoItem("jUf3hhYPpPI", context.getString(R.string.surah_title_100), context.getString(R.string.surah_des_text));
		addVideoItem("OkHl5-fFE00", context.getString(R.string.surah_title_101), context.getString(R.string.surah_des_text));
		addVideoItem("N-CvkMS5YyU", context.getString(R.string.surah_title_102), context.getString(R.string.surah_des_text));
		addVideoItem("x_XZl1MYAoI", context.getString(R.string.surah_title_103), context.getString(R.string.surah_des_text));
		addVideoItem("JB7zfhJ-TLU", context.getString(R.string.surah_title_104), context.getString(R.string.surah_des_text));
		addVideoItem("U6mvs4ifVzY", context.getString(R.string.surah_title_105), context.getString(R.string.surah_des_text));
		addVideoItem("6nHtvH0GXKw", context.getString(R.string.surah_title_106), context.getString(R.string.surah_des_text));
		addVideoItem("Ot-1RsOwOgU", context.getString(R.string.surah_title_107), context.getString(R.string.surah_des_text));
		addVideoItem("bkr3QoewGKw", context.getString(R.string.surah_title_108), context.getString(R.string.surah_des_text));
		addVideoItem("b9YEdjef2oA", context.getString(R.string.surah_title_109), context.getString(R.string.surah_des_text));
		addVideoItem("pFuWbddyiuo", context.getString(R.string.surah_title_110), context.getString(R.string.surah_des_text));
		addVideoItem("v1FoyCFzzC8", context.getString(R.string.surah_title_111), context.getString(R.string.surah_des_text));
		addVideoItem("Z2D0iJOnNGQ", context.getString(R.string.surah_title_112), context.getString(R.string.surah_des_text));
		addVideoItem("ZWJ7pJ8rMeY", context.getString(R.string.surah_title_113), context.getString(R.string.surah_des_text));
		addVideoItem("0hil1RMqWOY", context.getString(R.string.surah_title_114), context.getString(R.string.surah_des_text));

		createPlayListForVideo(context.getString(R.string.category_name_2), R.drawable.category_2);
		//==========================================================================


		//==========================================================================
		addVideoItem("gs1neovWXFA", "Ethsha | Arabic Music Video", "Gallery Vision Presents the official latest music video of the Arabic song \" Ethsha \" sung by  Nysha Fathima.");
		addVideoItem("QvtA4z9yzqM", "কুরআন মধুর বানী গজল", "A Beautiful Islamic song recited by Baby Najnin . Hope you all enjoy of this beautiful ghazal.");
		addVideoItem("m5DeG7ElXjQ", "zamil zamil, janal janal original arabic nasheed", "I hope this beautiful Nasheed by Deema Bashar spreads worldwide, guiding listeners with its true meaning instead of leading them astray.");
		addVideoItem("FSB9ZOPU7BE", "Mai Bhi Roze Rakhunga", "An amazing Islamic ghazal about fasting in Hindi and Arabic Language.");
		addVideoItem("QeTtgr1U2aY", "ত্রিভুবনের প্রিয় মুহাম্মদ", "Tri vuboner prio Muhammad Ishrak Hussain| Baapon | Bangla Islamic Song");
		addVideoItem("BBQIMlPwa8A", "I Love You Mama hala al turk", "A beautiful arabic song | Hala Al Turk");
		addVideoItem("juphzUEAswc", "La Ilaha Illa Allah", "Nasheed 2023 | Huzaifa Jawed ");
		addVideoItem("XeU79RjQgFY", "Meherban Tumi Meherban - Munaem Billah", "Meherban Tumi Meherban - Munaem Billah");
		addVideoItem("eP0xaOQW_ZQ", " Make ME Your Friend| Iqbal HJ ", "Nasheed From the Album ‘’ Make ME Your Friend’’ 2016");
		addVideoItem("4GdogV8KMD8", "Labbaik Allah | Iqbal Hossain Jibon", "Nasheed LABBAIK ALLAH Vocal version from the album Make Me Your Friend Artist: Iqbal HJ");
		addVideoItem("wtEKXRs_xac", "New Heart Touching Beautiful Naat Sharif - Hasbi Rabbi - Huda Sisters", "Hasbi Rabbi - Huda Sisters - Hi-Tech Islamic Naats");
		addVideoItem("TEMJh0-w2mY", "amon moron mawla tumi kawke diona gojol || এমন মরণ ", "amon moron mawla tumi kawke diona gojol || এমন মরণ Abu Taher gojol");
		addVideoItem("qTaqRXw_2S0", "হৃদয় ছোঁয়া গজল । হৃদয় মাঝে মালা গাঁথি ।", "হৃদয় মাঝে মালা গাঁথি । Hridoy Majhe Mala Gathi");
		addVideoItem("8IXUIhzz4I4", "Ishq E Nabi Jindabad । ইশকে নাবী জিন্দাবাদ । Kalarab ।", "সময়ের সেরা নতুন গজল । Ishq E Nabi Jindabad । ইশকে নাবী জিন্দাবাদ । Kalarab । Holy Tune । New Gojol");
		addVideoItem("FEYpRPYRLXo", "Amar Moron Asibe Kokhon | আমার মরন আসিবে কখন ", "আমার মরন আসিবে কখন | Rajiya Risha | Bangla Islamic Song 2020");
		addVideoItem("ZyJq0WUE8yc", "Amar Moron Asibe Kokhon | আমার মরন আসিবে কখন ", "amar moron asibe kokhon islamic song।bangla sers gojol।");
		addVideoItem("95uqMWvTrk4", "কালেমা নসীবে মোর দিও | Kalima Nosibe Mor Dio | কলরব গজল |", "নতুন ইসলামি গজল | কালেমা নসীবে মোর দিও");
		addVideoItem("nz0cL8NwqRs", "মোরা যদি ডানা ওয়ালা পাখি হইতাম |Moner Ghor", "Moner Ghor | আমার মনের ঘরেতে রেখেছি যারে | Mehraz Uddin");
		addVideoItem("VrcB_sVBEcc", "Assubhu Bada || New Naat 2021 || Allah Hu Allah || abu ubayda", "Allah Hu Allah || abu ubayda || কলিজা শীতল করা গজল");
		addVideoItem("LSgRKxJb5Qg", "Assubhu Bada || Allah Hu Allah || Syeda Areeba Fatima || Naat Sharif ", "Allah Hu Allah || Syeda Areeba Fatima || Naat Sharif || MK Studio Naat");
		addVideoItem("RnIRdeAc5t0", "বাচ্চাদের কান্না থামানোর গজল | Khukumoni Sonamoni ", "Baby Najnin | Khukumoni Sonamoni | New Most Superhit Bangla Gojo| Bangla Gojo");
		addVideoItem("GK2ippphNnM", "Hariye Jabo Ekdin | হারিয়ে যাবো একদিন ", "হৃদয়স্পর্শী মরমি গজল | Hariye Jabo Ekdin | হারিয়ে যাবো একদিন | Qari Abu Rayhan");
		addVideoItem("uzmYUbGHMWo", "পর্দা করে চল নারী", "gojol porda kore cholio nari পর্দা করে চল নারী");
		addVideoItem("HrYleYeY_8U", "মায়ের নতুন গজল 2020 || Ogo Maa", "Ogo Maa || Sadman Sakib || Iqra Shilpigoshthi | ওগো মা || Tune Hut");
		addVideoItem("_Y_iYQS686o", "বাবা মানে হাজার বিকেল | বাবার স্মরণে | Baba Song", "বাবার স্মরণে | Baba Song | বাবা মানে হাজার বিকেল | Baba Mane Hajar Bikel | Jaima Noor | Saimum 2021");
		addVideoItem("Aj1wu1L5glA", "O Nodire By Sadman sakib || ও নদীরে || Vangli Amer Ghor ", "ও নদীরে || Vangli Amer Ghor || Iqra shilpigosthi new song || Tune hut");
		addVideoItem("AXEOHr5naKs", "শিশুদের কন্ঠে দারুণ গজল । এলো খুশির বরাত", "এলো খুশির বরাত । Elo Khushir Borat By Kalarab Shilpigosthi");
		addVideoItem("W_cJ_0KivHc", "কোকিল কণ্ঠে জনপ্রিয় সংগীত । Porer Jayga Porer Jomi । পরের জায়গা পরের জমি ", " Porer Jayga Porer Jomi । পরের জায়গা পরের জমি । Hujaifa Islam");
		addVideoItem("QyRRrKQP7fo", "হৃদয় মাঝে মালা গাঁথি । Mahfuz Alam", "নতুন ইসলামিক গজল ২০১৯ | Hridoy Majhe Mala Gathi | হৃদয় মাঝে মালা গাঁথি । Mahfuz Alam । Tawhid Jamil");
		addVideoItem("8DnoQnyQm4U", "প্রিয় নবীর অবমাননার প্রতিবাদে জ্বালাময়ী গজল", "প্রিয় নবীর অবমাননার প্রতিবাদে জ্বালাময়ী গজল ।Nobijir Dushmon । Sayed Ahmad Kalarab");
		addVideoItem("f7iK5bMbUiU", "YA ALLAH | يا الله |Arabic Song 2022", "Nysha Fathima | Muneer Lala | Sirajudheen Edayoor");
		addVideoItem("Mr15ZcaDbM0", "TASBIH | AYISHA ABDUL BASITH | COVER SONG ", "NYSHA FATHIMA | FAYIS MANJERI | ANWAR AMAN | IMAMMAJBOOR");
		addVideoItem("qMsTCkYjUqo", "YA ASYIQOL | COVER SONG | NYSHA FATHIMA", " NYSHA FATHIMA | FAYIS MANJERI | ANWER AMAN | IMAM MAJBOOR");
		addVideoItem("VUl7Ja06xMk", "MAULANA | COVER SONG | SABYAN ", "COVER SONG | SABYAN | NYSHA FATHIMA | FAYIS MANJERI | ANWAR AMAN | IMAM MAJBOOR");
		addVideoItem("JpDx405IBNE", "Rahmatun Lil’Alameen-Maher Zain | Cover Song", "Rahmatun Lil’Alameen-Maher Zain | Cover Song | Nysha Fathima");
		addVideoItem("X5_0DGOw-x4", "Habibi ya muhammad Rahmatun lil alamin arabic naat sharif", "Habibi ya muhammad Rahmatun lil alamin arabic naat sharif");
		addVideoItem("_B4uihcQS6c", "Qamarun | قَمَرٌ | Alisha Kiyani", " Alisha Kiyani | Arabic Nasheed 2023 | New | official video | Aljilani Studio");
		addVideoItem("Zr_Ih4C6KSs", "Amantu Billahi | Arabic & Chechen by Ayisha Abdul Basith", "Arabic & Chechen by Ayisha Abdul Basith");
		addVideoItem("QgYla9YyjUU", "Rahman Ya Rahman |", "Rahman Ya Rahman | Ayisha Abdul Basith");
		addVideoItem("QgYla9YyjUU", "Rahman Ya Rahman |", "Rahman Ya Rahman | Ayisha Abdul Basith");

		createPlayListForVideo(context.getString(R.string.category_name_3), R.drawable.category_3);
		//==========================================================================

		//==========================================================================
		addVideoItem("234JM-Mt5kA",  "প্রশ্ন উত্তর পর্ব শায়খ আহমাদুল্লাহ", " ahmadullah waz shaikh ahmadullah new waz 2023");
		addVideoItem("H1HYzFyURhk", "জাকির নায়েক প্রশ্ন ও উত্তর পর্ব", "জাকির নায়েক নতুন লেকচার ২০২৩। dr zakir naik bangla lecture 2023");
		addVideoItem("G83NQrmV8_w", "জাকির নায়েক প্রশ্ন ও উত্তর পর্ব", " জাকির নায়েক নতুন লেকচার ২০২৩। dr zakir naik bangla lecture 2023");
		addVideoItem("CsVPz1CNoPU", "জাকির নায়েক বাংলা লেকচার ২০২২", "সরাসরি উন্মুক্ত প্রশ্ন উত্তর পর্ব ১৭ | জাকির নায়েক বাংলা লেকচার ২০২২");
		addVideoItem("cbrXG2N_nio", "শায়খ আহমাদুল্লাহ প্রশ্ন উত্তর পর্ব", "sheikh ahmadullah prashn uttar বাছাইকৃত top10 প্রশ্নের উত্তর। ");
		addVideoItem("m4GRy98Bkxk", "জাকির নায়েক প্রশ্ন ও উত্তর পর্ব", "আলোড়ন সৃষ্টিকারী ৫টি প্রশ্ন ও উত্তর | মিডিয়া ও ইসলাম যুদ্ধ নয় শান্তি || dr zakir naik new bangla waz");
		addVideoItem("dclpsjAA39A", "শায়খ আহমাদুল্লাহ প্রশ্ন উত্তর পর্ব", "জেনারেল পড়ুয়া এক ছাত্রীর প্রশ্নে অবাক শায়েখ আহমাদুল্লাহ | Shaikh Ahmadullah prosno uttor 2023");
		addVideoItem("twy2RXc7i0U", "ডাঃ জাকির কঠিন প্রশ্নের উত্তর দিতে গিয়ে অবাক", "Dr Zakir Naik Bangla New Lecture");
		addVideoItem("rymC3pXdOSE", "প্রশ্ন উত্তর পর্ব by Dr Zakir Naik", " Dr Zakir Naik (Peace TV Bangla)");
		addVideoItem("qQnA6nLcmjE", "ডাঃ জাকির নায়েক বনাম ডাঃ উইলিয়াম ক্যাম্পবেলের মধ্যে বাংলা বিতর্ক", "ডাঃ জাকির নায়েক বনাম ডাঃ উইলিয়াম ক্যাম্পবেলের মধ্যে বাংলা বিতর্ক the part of peace");
		addVideoItem("0xdeDNNqzqk", "যশোর খাজুরা মাহফিল প্রশ্ন উত্তর পর্ব", "যশোর খাজুরা মাহফিল প্রশ্ন উত্তর পর্ব");
		addVideoItem("POzFON20kqA", "ডাঃ জাকির নায়েক || Bangla Islamic lecture", "হিন্দু মেয়ের প্রশ্ন || কেন আমরা নৃত্য ও সংঙ্গিত করবোনা || ডাঃ জাকির নায়েক");
		addVideoItem("9pUBfFF87Nk", "শায়খ আহমাদুল্লাহ প্রশ্ন উত্তর পর্ব", "চমৎকার ১৫টি প্রশ্নোত্তর পর্ব। শায়খ আহমাদুল্লাহ প্রশ্ন উত্তর পর্ব। ahmadullah question answer");
		addVideoItem("BGj4w5n51Ys", "ডাঃ জাকির কঠিন প্রশ্নে উত্তর পর্ব", "Dr Zakir Naik Bangla New Lecture");
		addVideoItem("UlzKGDbojpg", "প্রশ্ন উত্তর পর্ব শায়খ আহমাদুল্লাহ", "২২টি নতুন প্রশ্ন উত্তর পর্ব শায়খ আহমাদুল্লাহ ahmadullah waz shaikh ahmadullah new waz 2022");
		addVideoItem("GUQ5pdXWrZc", "ডাঃ জাকির কঠিন প্রশ্নে উত্তর পর্ব", "মেয়েটি প্রকাশ্যে ইসলাম ধর্ম গ্রহণ করল ।। dr zakir naik question answer bangla");
		addVideoItem("YltXKN-UX-c", "শায়খ আহমাদুল্লাহ প্রশ্ন উত্তর পর্ব", "গুরুত্বপূর্ণ ৫৫টি ইসলামী প্রশ্নের উত্তর | শায়খ আহমাদুল্লাহ | Islamic Waz Bangla | Shaikh Ahmadullah");
		addVideoItem("bQM0PYE7Bis", "প্রশ্ন উত্তর পর্ব - ডা. জাকির নায়েক ", "Dr. Zakir Naik Question and Answer Bangla Lecture Podcast.");
		addVideoItem("3bc_HQ_cP7k", "নতুন প্রশ্নের উত্তর আব্দুর রাজ্জাক বিন ইউসুফ 2023", "প্রশ্নোত্তর পর্ব শায়খ আব্দুর রাজ্জাক বিন ইউসুফ | ");
		addVideoItem("j4eig9aPj_E", "ডাঃ জাকির কঠিন প্রশ্নে উত্তর পর্ব", "প্রশ্ন উত্তর পর্ব ৬ Question Answer Seria 6 Dr. Zakir Naik");
		addVideoItem("m4GRy98Bkxk", "ডাঃ জাকির প্রশ্নে উত্তর পর্ব", "আলোড়ন সৃষ্টিকারী ৫টি প্রশ্ন ও উত্তর | মিডিয়া ও ইসলাম যুদ্ধ নয় শান্তি |");
		addVideoItem("", "", "");

		createPlayListForVideo(context.getString(R.string.category_name_4), R.drawable.category_4);
		//==========================================================================


		//==========================================================================
		addVideoItem("zuj1rKQBI4g", "Prophet Adham (AS) Story In Bengali", "Prophet Stories In Bangla | Prophet Adham (AS) Story In Bengali | Quran Stories In Bengali");
		addVideoItem("9kWOM42R8YY", "Prophet Nuh (AS) Story", "Prophet Stories In Bangla | Prophet Nuh (AS) Story | Quran Stories In Bengali");
		addVideoItem("RMNTy3xlc44", "Story of Prophet Hud (AS)", "Prophet Stories In Bangla | Story of Prophet Hud (AS) | Quran Stories In Bengali");
		addVideoItem("BDy1YidOTTE", "Prophet Saleh (AS)", "Prophet Stories In Bangla | Prophet Saleh (AS) | Quran Stories In Bengali");
		addVideoItem("AaHeD6cW_nc", "Prophet Ibrahim (AS)", "Prophet Stories In Bangla | Prophet Ibrahim (AS) | Part 1 | Quran Stories In Bengali");
		addVideoItem("zuquEUC-iXM", "Prophet Ibrahim (AS) | Part 2", "Prophet Stories In Bangla | Prophet Ibrahim (AS) | Part 2 | Quran Stories In Bengali");
		addVideoItem("EXvvNEpR5uI", "Prophet Ibrahim (AS) ", "Prophet Stories In Bangla | Prophet Ibrahim (AS) | Part 3 | Quran Stories In Bengali");
		addVideoItem("a2kso77pajo", "Prophet Ishaq (AS) And Yaqub (AS)", "Prophet Stories In Bangla | Prophet Ishaq (AS) And Yaqub (AS) | Quran Stories In Bengali");
		addVideoItem("rSDQuikKUqc", "Prophet Ishmael (AS)", "Prophet Stories In Bangla | Prophet Ishmael (AS) | Quran Stories In Bengali");
		addVideoItem("SO-1YymH0Kw", "Story of Prophet Lut (AS)", "Prophet Stories In Bangla | Story of Prophet Lut (AS) | Quran Stories In Bengali");
		addVideoItem("nB94UKSmuVc", "Story of Prophet Yaqub (AS)", "Prophet Stories In Bangla | Story of Prophet Yaqub (AS) | Quran Stories In Bengali");
		addVideoItem("PWi6bZCi6Eg", "Prophet Shuaib (AS)", "Prophet Stories In Bangla | Prophet Shuaib (AS) | Quran Stories In Bengali");
		addVideoItem("_Nn6wHPCk9E", "Prophet Yusuf (AS) | Part 1", "Prophet Stories In Bangla | Prophet Yusuf (AS) | Part 1 | Quran Stories In Bengali");
		addVideoItem("pwkY18kbBGc", "Prophet Yusuf (AS) | Part 2", "Prophet Stories In Bangla | Prophet Yusuf (AS) | Part 2 | Quran Stories In Bengali");
		addVideoItem("NM0vypLDlzQ", "Prophet Yusuf (AS) | Part 3", "Prophet Stories In Bangla | Prophet Yusuf (AS) | Part 3 | Quran Stories In Bengali");
		addVideoItem("bLKm_TdtMMc", "Prophet Yusuf (AS) | Part 4", "Prophet Stories In Bangla | Prophet Yusuf (AS) | Part 4 | Quran Stories In Bengali");
		addVideoItem("bVvfZa5dscc", "Prophet Yusuf (AS) | Part 5", "Prophet Stories In Bangla | Prophet Yusuf (AS) | Part 5 | Quran Stories In Bengali");
		addVideoItem("n7coNZ2isp8", "Prophet Ayoub (AS)", "Prophet Stories In Bangla | Prophet Ayoub (AS) | Quran Stories In Bengali");
		addVideoItem("bMJYLv0YYZ0", "Prophet Yunus (AS)", "Prophet Stories In Bangla | Prophet Yunus (AS) | Quran Stories In Bengali");
		addVideoItem("wZP6O2qAooQ", "Prophet Musa (AS) | Part 1", "Prophet Stories In Bangla | Prophet Musa (AS) | Part 1 | Quran Stories In Bengali");
		createPlayListForVideo(context.getString(R.string.category_name_5), R.drawable.muhammad);
		//==========================================================================


		//==========================================================================
	     addVideoItem("H8F4F6lcucQ", "হজ্জ করার নিয়ম", "উমরা ও হজ্জের তাওয়াফ সায়ী করার নিয়ম/ Kaba Tawaf and Safa Marwa Sayee- মাকারিম (২২)");
	     addVideoItem("Pk3migpBajs", "ওমরা হজ্জ করার নিয়ম ", "উমরাহ করার নিয়ম । ওমরা হজ্জ করার নিয়ম দোয়া । omra korar niyom । হজ্জ");
	     addVideoItem("zamSP9gyGSA", "হজ পালনের সঠিক নিয়ম", "ইসলামের পাঁচটি স্তম্ভের একটি পবিত্র হজ। ইসলাম ধর্মে হজ পালনে সামর্থ্যবান মুসলমানদের উপর অন্তত একবার হজকে ফরজ করা হয়েছে। ");
	     addVideoItem("Io8EQPMyy7o", "শয়তানকে পাথর মারতে হয় যেভাবে", "হজ্জে শয়তানকে পাথর মারার নিয়ম দৃশ্যধারণ ও উপস্থাপনায় - এডভোকেট মাকারিম");
		createPlayListForVideo(context.getString(R.string.category_name_6), R.drawable.hajj);
		//==========================================================================

		//==========================================================================
		addVideoItem("Hd7XhLyOoUs", "কুরবানীর ইতিহাস ও ইব্রাহিম আঃ: ত্যাগ", "কুরবানীর ইতিহাস ও ইব্রাহিম আঃ: ত্যাগ। মিজানুর রহমান আজহারী mizanur Rahman azhari");
		addVideoItem("DtQfV4phD_I", "কুরবানীর ওয়াজ ও প্রশ্নের উত্তর দিলেন মিজানুর রহমান আজহারী", "কুরবানীর ওয়াজ ও প্রশ্নের উত্তর দিলেন মিজানুর রহমান আজহারী | Qurbanir Waz | Dr Mizanur Rahman Azhari");
		addVideoItem("8KJpyp9Ih-g", "কুরবানীর নিয়ম । kurbanir niom", "কুরবানীতে যে ভুলগুলো প্রায় আমাদের সবার হয় । Shaykh Ahmadullah");
		addVideoItem("R55K-naZ-M4", "কুরবানীর মাংস বন্টনের সঠিক পদ্ধতি", "মাংস বন্টনের সঠিক পদ্ধতি|মিজানুর রহমান আজহারী|mizanur rahman azhari");
		addVideoItem("VC7mX-ZG99s", "কুরবানী দেওয়ার সময় সবার নাম কি বলতে হবে |", "কুরবানী দেওয়ার সময় সবার নাম কি বলতে হবে | Sheikh Ahmadullah | শাইখ আহমাদুল্লাহ | qurbani | kurbani");
		addVideoItem("eo8dciNqNYU", "হাবিল ও কাবিল এর জীবনী থেকে কুরবানীর ইতিহাস", "কুরবানীর নিয়মকানুন | Qurbanir Waz | Molla Nazmul Hasan");
		addVideoItem("di2HOFVQ8V8", "কুরবানীর ৭৮টি প্রশ্ন উত্তর mufti arif bin habib", "মুফতি বিন হাবিব নতুন ওয়াজ| new bangla waz download");
		addVideoItem("uRt-FEyZDQY", "কুরবানি নিয়ে ১০টি গুরুত্তপূর্ণ প্রশ্নের উত্তর", "Shaikh Ahmadullah। শায়খ আহমাদুল্লাহ প্রশ্ন উত্তর");
		addVideoItem("iKhgNWyyUL4", "কুরবানী সম্পর্কিত ৫২টি অতিগুরুত্বপূর্ণ প্রশ্নের উত্তর", "কুরবানী সম্পর্কিত ৫২টি অতিগুরুত্বপূর্ণ প্রশ্নের উত্তর");
		createPlayListForVideo(context.getString(R.string.category_name_7), R.drawable.eid_al_adha);
		//==========================================================================


		//=========================
		createCategoryForWebsite(context.getString(R.string.about_us), R.drawable.team, "https://about.me/lrjamil");
		//==========================================================================*


	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

