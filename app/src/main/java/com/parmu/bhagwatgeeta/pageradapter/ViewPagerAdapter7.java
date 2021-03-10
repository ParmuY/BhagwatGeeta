package com.parmu.bhagwatgeeta.pageradapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.parmu.bhagwatgeeta.fragments.SevenFragment;

public class ViewPagerAdapter7 extends FragmentStatePagerAdapter {
    public ViewPagerAdapter7(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter7(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "( विज्ञान सहित ज्ञान का विषय ) \n" +
                    " श्रीभगवानुवाच  :-\n" +
                    " मय्यासक्तमनाः पार्थ योगं युञ्जन्मदाश्रयः।\n" +
                    " असंशयं समग्रं मां यथा ज्ञास्यसि तच्छृणु ॥1॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान बोले- हे पार्थ! अनन्य प्रेम से मुझमें आसक्त चित तथा अनन्य भाव से मेरे परायण होकर योग में लगा हुआ तू जिस प्रकार से सम्पूर्ण विभूति, बल, ऐश्वर्यादि गुणों से युक्त, सबके आत्मरूप मुझको संशयरहित जानेगा, उसको सुन\n" +
                    " ॥1॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==1)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "ज्ञानं तेऽहं सविज्ञानमिदं वक्ष्याम्यशेषतः।\n" +
                    " यज्ज्ञात्वा नेह भूयोऽन्यज्ज्ञातव्यमवशिष्यते  ॥2॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं तेरे लिए इस विज्ञान सहित तत्व ज्ञान को सम्पूर्णतया कहूँगा, जिसको जानकर संसार में फिर और कुछ भी जानने योग्य शेष नहीं रह जाता\n" +
                    " ॥2॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==2)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "मनुष्याणां सहस्रेषु कश्चिद्यतति सिद्धये।\n" +
                    " यततामपि सिद्धानां कश्चिन्मां वेत्ति तत्वतः  ॥3॥\n" +
                    "\n" +
                    "भावार्थ  :-  हजारों मनुष्यों में कोई एक मेरी प्राप्ति के लिए यत्न करता है और उन यत्न करने वाले योगियों में भी कोई एक मेरे परायण होकर मुझको तत्व से अर्थात यथार्थ रूप से जानता है\n" +
                    " ॥3॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==3)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "भूमिरापोऽनलो वायुः खं मनो बुद्धिरेव च।\n" +
                    " अहङ्कार इतीयं मे भिन्ना प्रकृतिरष्टधा  ॥4॥\n" +
                    " अपरेयमितस्त्वन्यां प्रकृतिं विद्धि मे पराम्।\n" +
                    " जीवभूतां महाबाहो ययेदं धार्यते जगत्  ॥5॥\n" +
                    "\n" +
                    "भावार्थ  :-  पृथ्वी, जल, अग्नि, वायु, आकाश, मन, बुद्धि और अहंकार भी- इस प्रकार ये आठ प्रकार से विभाजित मेरी प्रकृति है। यह आठ प्रकार के भेदों वाली तो अपरा अर्थात मेरी जड़ प्रकृति है और हे महाबाहो! इससे दूसरी को, जिससे यह सम्पूर्ण जगत धारण किया जाता है, मेरी जीवरूपा परा अर्थात चेतन प्रकृति जान\n" +
                    " ॥4-5॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==4)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "एतद्योनीनि भूतानि सर्वाणीत्युपधारय।\n" +
                    " अहं कृत्स्नस्य जगतः प्रभवः प्रलयस्तथा  ॥6॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! तू ऐसा समझ कि सम्पूर्ण भूत इन दोनों प्रकृतियों से ही उत्पन्न होने वाले हैं और मैं सम्पूर्ण जगत का प्रभव तथा प्रलय हूँ अर्थात् सम्पूर्ण जगत का मूल कारण हूँ\n" +
                    " ॥6॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==5)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "मत्तः परतरं नान्यत्किञ्चिदस्ति धनञ्जय।\n" +
                    " मयि सर्वमिदं प्रोतं सूत्रे मणिगणा इव  ॥7॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे धनंजय! मुझसे भिन्न दूसरा कोई भी परम कारण नहीं है। यह सम्पूर्ण जगत सूत्र में सूत्र के मणियों के सदृश मुझमें गुँथा हुआ है\n" +
                    " ॥7॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }else if(position==6)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "( संपूर्ण पदार्थों में कारण रूप से भगवान की व्यापकता का कथन ) \n" +
                    " रसोऽहमप्सु कौन्तेय प्रभास्मि शशिसूर्ययोः।\n" +
                    " प्रणवः सर्ववेदेषु शब्दः खे पौरुषं नृषु  ॥8॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! मैं जल में रस हूँ, चन्द्रमा और सूर्य में प्रकाश हूँ, सम्पूर्ण वेदों में ओंकार हूँ, आकाश में शब्द और पुरुषों में पुरुषत्व हूँ\n" +
                    " ॥8॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }else if(position==7)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "पुण्यो गन्धः पृथिव्यां च तेजश्चास्मि विभावसौ।\n" +
                    " जीवनं सर्वभूतेषु तपश्चास्मि तपस्विषु  ॥9॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं पृथ्वी में पवित्र (शब्द, स्पर्श, रूप, रस, गंध से इस प्रसंग में इनके कारण रूप तन्मात्राओं का ग्रहण है, इस बात को स्पष्ट करने के लिए उनके साथ पवित्र शब्द जोड़ा गया है।) गंध और अग्नि में तेज हूँ तथा सम्पूर्ण भूतों में उनका जीवन हूँ और तपस्वियों में तप हूँ\n" +
                    " ॥9॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==8)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "बीजं मां सर्वभूतानां विद्धि पार्थ सनातनम्।\n" +
                    " बुद्धिर्बुद्धिमतामस्मि तेजस्तेजस्विनामहम्  ॥10॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! तू सम्पूर्ण भूतों का सनातन बीज मुझको ही जान। मैं बुद्धिमानों की बुद्धि और तेजस्वियों का तेज हूँ\n" +
                    " ॥10\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==9)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "बलं बलवतां चाहं कामरागविवर्जितम्।\n" +
                    " धर्माविरुद्धो भूतेषु कामोऽस्मि भरतर्षभ  ॥11॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे भरतश्रेष्ठ! मैं बलवानों का आसक्ति और कामनाओं से रहित बल अर्थात सामर्थ्य हूँ और सब भूतों में धर्म के अनुकूल अर्थात शास्त्र के अनुकूल काम हूँ\n" +
                    " ॥11॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==10)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "ये चैव सात्त्विका भावा राजसास्तामसाश्चये।\n" +
                    " मत्त एवेति तान्विद्धि न त्वहं तेषु ते मयि  ॥12॥\n" +
                    "\n" +
                    "भावार्थ  :-  और भी जो सत्त्व गुण से उत्पन्न होने वाले भाव हैं और जो रजो गुण से होने वाले भाव हैं, उन सबको तू 'मुझसे ही होने वाले हैं' ऐसा जान, परन्तु वास्तव में (गीता अ. 9 श्लोक 4-5 में देखना चाहिए) उनमें मैं और वे मुझमें नहीं हैं\n" +
                    " ॥12॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }else if(position==11)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "( आसुरी स्वभाव वालों की निंदा और भगवद्भक्तों की प्रशंसा )\n" +
                    " त्रिभिर्गुणमयैर्भावैरेभिः सर्वमिदं जगत्।\n" +
                    " मोहितं नाभिजानाति मामेभ्यः परमव्ययम्  ॥13॥\n" +
                    "\n" +
                    "भावार्थ  :-  गुणों के कार्य रूप सात्त्विक, राजस और तामस- इन तीनों प्रकार के भावों से यह सारा संसार- प्राणिसमुदाय मोहित हो रहा है, इसीलिए इन तीनों गुणों से परे मुझ अविनाशी को नहीं जानता\n" +
                    " ॥13॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==12)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "दैवी ह्येषा गुणमयी मम माया दुरत्यया।\n" +
                    " मामेव ये प्रपद्यन्ते मायामेतां तरन्ति ते  ॥14॥\n" +
                    "\n" +
                    "भावार्थ  :-  क्योंकि यह अलौकिक अर्थात अति अद्भुत त्रिगुणमयी मेरी माया बड़ी दुस्तर है, परन्तु जो पुरुष केवल मुझको ही निरंतर भजते हैं, वे इस माया को उल्लंघन कर जाते हैं अर्थात् संसार से तर जाते हैं\n" +
                    " ॥14॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==13)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "न मां दुष्कृतिनो मूढाः प्रपद्यन्ते नराधमाः।\n" +
                    " माययापहृतज्ञाना आसुरं भावमाश्रिताः  ॥15॥\n" +
                    "\n" +
                    "भावार्थ  :-  माया द्वारा जिनका ज्ञान हरा जा चुका है, ऐसे आसुर-स्वभाव को धारण किए हुए, मनुष्यों में नीच, दूषित कर्म करने वाले मूढ़ लोग मुझको नहीं भजते\n" +
                    " ॥15॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }else if(position==14)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "चतुर्विधा भजन्ते मां जनाः सुकृतिनोऽर्जुन।\n" +
                    " आर्तो जिज्ञासुरर्थार्थी ज्ञानी च भरतर्षभ  ॥16॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे भरतवंशियों में श्रेष्ठ अर्जुन! उत्तम कर्म करने वाले अर्थार्थी (सांसारिक पदार्थों के लिए भजने वाला), आर्त (संकटनिवारण के लिए भजने वाला) जिज्ञासु (मेरे को यथार्थ रूप से जानने की इच्छा से भजने वाला) और ज्ञानी- ऐसे चार प्रकार के भक्तजन मुझको भजते हैं\n" +
                    " ॥16॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }

        else if(position==15)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "तेषां ज्ञानी नित्ययुक्त एकभक्तिर्विशिष्यते।\n" +
                    " प्रियो हि ज्ञानिनोऽत्यर्थमहं स च मम प्रियः  ॥17॥\n" +
                    "\n" +
                    "भावार्थ  :-  उनमें नित्य मुझमें एकीभाव से स्थित अनन्य प्रेमभक्ति वाला ज्ञानी भक्त अति उत्तम है क्योंकि मुझको तत्व से जानने वाले ज्ञानी को मैं अत्यन्त प्रिय हूँ और वह ज्ञानी मुझे अत्यन्त प्रिय है\n" +
                    " ॥17॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==16)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "उदाराः सर्व एवैते ज्ञानी त्वात्मैव मे मतम्।\n" +
                    " आस्थितः स हि युक्तात्मा मामेवानुत्तमां गतिम्  ॥18॥\n" +
                    "\n" +
                    "भावार्थ  :-  ये सभी उदार हैं, परन्तु ज्ञानी तो साक्षात् मेरा स्वरूप ही है- ऐसा मेरा मत है क्योंकि वह मद्गत मन-बुद्धिवाला ज्ञानी भक्त अति उत्तम गतिस्वरूप मुझमें ही अच्छी प्रकार स्थित है\n" +
                    " ॥18॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==17)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "बहूनां जन्मनामन्ते ज्ञानवान्मां प्रपद्यते।\n" +
                    " वासुदेवः सर्वमिति स महात्मा सुदुर्लभः  ॥19॥\n" +
                    "\n" +
                    "भावार्थ  :-  बहुत जन्मों के अंत के जन्म में तत्व ज्ञान को प्राप्त पुरुष, सब कुछ वासुदेव ही हैं- इस प्रकार मुझको भजता है, वह महात्मा अत्यन्त दुर्लभ है\n" +
                    " ॥19॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==18)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "( अन्य देवताओं की उपासना का विषय ) \n" +
                    " कामैस्तैस्तैर्हृतज्ञानाः प्रपद्यन्तेऽन्यदेवताः।\n" +
                    " तं तं नियममास्थाय प्रकृत्या नियताः स्वया  ॥20॥\n" +
                    "\n" +
                    "भावार्थ  :-  उन-उन भोगों की कामना द्वारा जिनका ज्ञान हरा जा चुका है, वे लोग अपने स्वभाव से प्रेरित होकर उस-उस नियम को धारण करके अन्य देवताओं को भजते हैं अर्थात पूजते हैं\n" +
                    " ॥20॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==19)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "यो यो यां यां तनुं भक्तः श्रद्धयार्चितुमिच्छति।\n" +
                    " तस्य तस्याचलां श्रद्धां तामेव विदधाम्यहम्  ॥21॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो-जो सकाम भक्त जिस-जिस देवता के स्वरूप को श्रद्धा से पूजना चाहता है, उस-उस भक्त की श्रद्धा को मैं उसी देवता के प्रति स्थिर करता हूँ\n" +
                    " ॥21॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==20)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "स तया श्रद्धया युक्तस्तस्याराधनमीहते।\n" +
                    " लभते च ततः कामान्मयैव विहितान्हि तान् ॥22॥\n" +
                    "\n" +
                    "भावार्थ  :-  वह पुरुष उस श्रद्धा से युक्त होकर उस देवता का पूजन करता है और उस देवता से मेरे द्वारा ही विधान किए हुए उन इच्छित भोगों को निःसंदेह प्राप्त करता है\n" +
                    " ॥22॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==21)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "अन्तवत्तु फलं तेषां तद्भवत्यल्पमेधसाम्।\n" +
                    " देवान्देवयजो यान्ति मद्भक्ता यान्ति मामपि  ॥23॥\n" +
                    "\n" +
                    "भावार्थ  :-  परन्तु उन अल्प बुद्धिवालों का वह फल नाशवान है तथा वे देवताओं को पूजने वाले देवताओं को प्राप्त होते हैं और मेरे भक्त चाहे जैसे ही भजें, अन्त में वे मुझको ही प्राप्त होते हैं\n" +
                    " ॥23॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==22)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "( भगवान के प्रभाव और स्वरूप को न जानने वालों की निंदा और जानने वालों की महिमा ) \n" +
                    " अव्यक्तं व्यक्तिमापन्नं मन्यन्ते मामबुद्धयः।\n" +
                    " परं भावमजानन्तो ममाव्ययमनुत्तमम्  ॥24॥\n" +
                    "\n" +
                    "भावार्थ  :-  बुद्धिहीन पुरुष मेरे अनुत्तम अविनाशी परम भाव को न जानते हुए मन-इन्द्रियों से परे मुझ सच्चिदानन्दघन परमात्मा को मनुष्य की भाँति जन्मकर व्यक्ति भाव को प्राप्त हुआ मानते हैं\n" +
                    " ॥24॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==23)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "नाहं प्रकाशः सर्वस्य योगमायासमावृतः।\n" +
                    " मूढोऽयं नाभिजानाति लोको मामजमव्ययम्  ॥25॥\n" +
                    "\n" +
                    "भावार्थ  :-  अपनी योगमाया से छिपा हुआ मैं सबके प्रत्यक्ष नहीं होता, इसलिए यह अज्ञानी जनसमुदाय मुझ जन्मरहित अविनाशी परमेश्वर को नहीं जानता अर्थात मुझको जन्मने-मरने वाला समझता है\n" +
                    " ॥25॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==24)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "वेदाहं समतीतानि वर्तमानानि चार्जुन।\n" +
                    " भविष्याणि च भूतानि मां तु वेद न कश्चन  ॥26॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! पूर्व में व्यतीत हुए और वर्तमान में स्थित तथा आगे होने वाले सब भूतों को मैं जानता हूँ, परन्तु मुझको कोई भी श्रद्धा-भक्तिरहित पुरुष नहीं जानता\n" +
                    " ॥26॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==25)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "इच्छाद्वेषसमुत्थेन द्वन्द्वमोहेन भारत।\n" +
                    " सर्वभूतानि सम्मोहं सर्गे यान्ति परन्तप  ॥27॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे भरतवंशी अर्जुन! संसार में इच्छा और द्वेष से उत्पन्न सुख-दुःखादि द्वंद्वरूप मोह से सम्पूर्ण प्राणी अत्यन्त अज्ञता को प्राप्त हो रहे हैं\n" +
                    " ॥27॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==26)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "येषां त्वन्तगतं पापं जनानां पुण्यकर्मणाम्।\n" +
                    " ते द्वन्द्वमोहनिर्मुक्ता भजन्ते मां दृढव्रताः  ॥28॥\n" +
                    "\n" +
                    "भावार्थ  :-  परन्तु निष्काम भाव से श्रेष्ठ कर्मों का आचरण करने वाले जिन पुरुषों का पाप नष्ट हो गया है, वे राग-द्वेषजनित द्वन्द्व रूप मोह से मुक्त दृढ़निश्चयी भक्त मुझको सब प्रकार से भजते हैं\n" +
                    " ॥28॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==27)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "जरामरणमोक्षाय मामाश्रित्य यतन्ति ये।\n" +
                    " ते ब्रह्म तद्विदुः कृत्स्नमध्यात्मं कर्म चाखिलम् ॥29॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो मेरे शरण होकर जरा और मरण से छूटने के लिए यत्न करते हैं, वे पुरुष उस ब्रह्म को, सम्पूर्ण अध्यात्म को, सम्पूर्ण कर्म को जानते हैं\n" +
                    " ॥29॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }
        else if(position==28)
        {
            SevenFragment sevenFragment=new SevenFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message7", "साधिभूताधिदैवं मां साधियज्ञं च ये विदुः।\n" +
                    " प्रयाणकालेऽपि च मां ते विदुर्युक्तचेतसः  ॥30॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो पुरुष अधिभूत और अधिदैव सहित तथा अधियज्ञ सहित (सबका आत्मरूप) मुझे अन्तकाल में भी जानते हैं, वे युक्तचित्तवाले पुरुष मुझे जानते हैं अर्थात प्राप्त हो जाते हैं\n" +
                    " ॥30॥ \t\n" +
                    " \n" +
                    " ॐ तत्सदिति श्रीमद्भगवद्गीतासूपनिषत्सु ब्रह्मविद्यायां योगशास्त्रे श्रीकृष्णार्जुनसंवादे ज्ञानविज्ञानयोगो नाम सप्तमोऽध्यायः \n" +
                    " ॥7॥\n");
            sevenFragment.setArguments(bundle);
            return sevenFragment;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 29;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        if(position<=3)
        {
            return "श्लोक "+position;
        }
        else if (position==4)
        {
            return "श्लोक 4,5";
        }
        else if(position<=29&&position>=5)
        { position=position+1;
            return "श्लोक "+position;
        }
        return null;
    }
}

