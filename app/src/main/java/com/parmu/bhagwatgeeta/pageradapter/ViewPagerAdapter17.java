package com.parmu.bhagwatgeeta.pageradapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.parmu.bhagwatgeeta.fragments.Fragment17;

public class ViewPagerAdapter17 extends FragmentPagerAdapter {
    public ViewPagerAdapter17(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter17(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "(श्रद्धा का और शास्त्रविपरीत घोर तप करने वालों का विषय) \n" +
                    "अर्जुन उवाच ये शास्त्रविधिमुत्सृज्य यजन्ते श्रद्धयान्विताः।\n" +
                    " तेषां निष्ठा तु का कृष्ण सत्त्वमाहो रजस्तमः ॥1॥\n" +
                    "\n" +
                    "भावार्थ  :-  अर्जुन बोले- हे कृष्ण! जो मनुष्य शास्त्र विधि को त्यागकर श्रद्धा से युक्त हुए देवादिका पूजन करते हैं, उनकी स्थिति फिर कौन-सी है? सात्त्विकी है अथवा राजसी किंवा तामसी?\n" +
                    " ॥1॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }

        else if(position==1)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "श्रीभगवानुवाच  :-\n" +
                    " त्रिविधा भवति श्रद्धा देहिनां सा स्वभावजा।\n" +
                    " सात्त्विकी राजसी चैव तामसी चेति तां श्रृणु  ॥2॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान् बोले- मनुष्यों की वह शास्त्रीय संस्कारों से रहित केवल स्वभाव से उत्पन्न श्रद्धा (अनन्त जन्मों में किए हुए कर्मों के सञ्चित संस्कार से उत्पन्न हुई श्रद्धा ''स्वभावजा'' श्रद्धा कही जाती है।) सात्त्विकी और राजसी तथा तामसी- ऐसे तीनों प्रकार की ही होती है। उसको तू मुझसे सुन\n" +
                    " ॥2॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==2)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "सत्त्वानुरूपा सर्वस्य श्रद्धा भवति भारत।\n" +
                    " श्रद्धामयोऽयं पुरुषो यो यच्छ्रद्धः स एव सः  ॥3॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे भारत! सभी मनुष्यों की श्रद्धा उनके अन्तःकरण के अनुरूप होती है। यह पुरुष श्रद्धामय है, इसलिए जो पुरुष जैसी श्रद्धावाला है, वह स्वयं भी वही है\n" +
                    " ॥3॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==3)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "यजन्ते सात्त्विका देवान्यक्षरक्षांसि राजसाः।\n" +
                    " प्रेतान्भूतगणांश्चान्ये जयन्ते तामसा जनाः  ॥4॥\n" +
                    "\n" +
                    "भावार्थ  :-  सात्त्विक पुरुष देवों को पूजते हैं, राजस पुरुष यक्ष और राक्षसों को तथा अन्य जो तामस मनुष्य हैं, वे प्रेत और भूतगणों को पूजते हैं\n" +
                    " ॥4॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==4)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "अशास्त्रविहितं घोरं तप्यन्ते ये तपो जनाः।\n" +
                    " दम्भाहङ्कारसंयुक्ताः कामरागबलान्विताः  ॥5॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो मनुष्य शास्त्र विधि से रहित केवल मनःकल्पित घोर तप को तपते हैं तथा दम्भ और अहंकार से युक्त एवं कामना, आसक्ति और बल के अभिमान से भी युक्त हैं\n" +
                    " ॥5॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==5)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "कर्शयन्तः शरीरस्थं भूतग्राममचेतसः।\n" +
                    " मां चैवान्तःशरीरस्थं तान्विद्ध्यासुरनिश्चयान् ॥6॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो शरीर रूप से स्थित भूत समुदाय को और अन्तःकरण में स्थित मुझ परमात्मा को भी कृश करने वाले हैं (शास्त्र से विरुद्ध उपवासादि घोर आचरणों द्वारा शरीर को सुखाना एवं भगवान् के अंशस्वरूप जीवात्मा को क्लेश देना, भूत समुदाय को और अन्तर्यामी परमात्मा को ''कृश करना'' है।), उन अज्ञानियों को तू आसुर स्वभाव वाले जान\n" +
                    " ॥6॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==6)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "(आहार, यज्ञ, तप और दान के पृथक-पृथक भेद)\n" +
                    "आहारस्त्वपि सर्वस्य त्रिविधो भवति प्रियः।\n" +
                    " यज्ञस्तपस्तथा दानं तेषां भेदमिमं श्रृणु   ॥7॥\n" +
                    "\n" +
                    "भावार्थ  :-  भोजन भी सबको अपनी-अपनी प्रकृति के अनुसार तीन प्रकार का प्रिय होता है। और वैसे ही यज्ञ, तप और दान भी तीन-तीन प्रकार के होते हैं। उनके इस पृथक्-पृथक् भेद को तू मुझ से सुन\n" +
                    " ॥7॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==7)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "आयुः सत्त्वबलारोग्यसुखप्रीतिविवर्धनाः।\n" +
                    " रस्याः स्निग्धाः स्थिरा हृद्या आहाराः सात्त्विकप्रियाः  ॥8॥\n" +
                    "\n" +
                    "भावार्थ  :-  आयु, बुद्धि, बल, आरोग्य, सुख और प्रीति को बढ़ाने वाले, रसयुक्त, चिकने और स्थिर रहने वाले (जिस भोजन का सार शरीर में बहुत काल तक रहता है, उसको स्थिर रहने वाला कहते हैं।) तथा स्वभाव से ही मन को प्रिय- ऐसे आहार अर्थात् भोजन करने के पदार्थ सात्त्विक पुरुष को प्रिय होते हैं\n" +
                    " ॥8॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==8)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "कट्वम्ललवणात्युष्णतीक्ष्णरूक्षविदाहिनः।\n" +
                    " आहारा राजसस्येष्टा दुःखशोकामयप्रदाः  ॥9॥\n" +
                    "\n" +
                    "भावार्थ  :-  कड़वे, खट्टे, लवणयुक्त, बहुत गरम, तीखे, रूखे, दाहकारक और दुःख, चिन्ता तथा रोगों को उत्पन्न करने वाले आहार अर्थात् भोजन करने के पदार्थ राजस पुरुष को प्रिय होते हैं\n" +
                    " ॥9॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==9)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "यातयामं गतरसं पूति पर्युषितं च यत्।\n" +
                    " उच्छिष्टमपि चामेध्यं भोजनं तामसप्रियम्  ॥10॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो भोजन अधपका, रसरहित, दुर्गन्धयुक्त, बासी और उच्छिष्ट है तथा जो अपवित्र भी है, वह भोजन तामस पुरुष को प्रिय होता है\n" +
                    "  ॥10॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==10)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "अफलाकाङ्क्षिभिर्यज्ञो विधिदृष्टो य इज्यते।\n" +
                    " यष्टव्यमेवेति मनः समाधाय स सात्त्विकः  ॥11॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो शास्त्र विधि से नियत, यज्ञ करना ही कर्तव्य है- इस प्रकार मन को समाधान करके, फल न चाहने वाले पुरुषों द्वारा किया जाता है, वह सात्त्विक है\n" +
                    " ॥11॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==11)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "अभिसन्धाय तु फलं दम्भार्थमपि चैव यत्।\n" +
                    " इज्यते भरतश्रेष्ठ तं यज्ञं विद्धि राजसम्   ॥12॥\n" +
                    "\n" +
                    "भावार्थ  :-  परन्तु हे अर्जुन! केवल दम्भाचरण के लिए अथवा फल को भी दृष्टि में रखकर जो यज्ञ किया जाता है, उस यज्ञ को तू राजस जान\n" +
                    " ॥12॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==12)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "विधिहीनमसृष्टान्नं मन्त्रहीनमदक्षिणम्।\n" +
                    " श्रद्धाविरहितं यज्ञं तामसं परिचक्षते  ॥13॥\n" +
                    "\n" +
                    "भावार्थ  :-  शास्त्रविधि से हीन, अन्नदान से रहित, बिना मन्त्रों के, बिना दक्षिणा के और बिना श्रद्धा के किए जाने वाले यज्ञ को तामस यज्ञ कहते हैं\n" +
                    " ॥13॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==13)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "देवद्विजगुरुप्राज्ञपूजनं शौचमार्जवम्।\n" +
                    " ब्रह्मचर्यमहिंसा च शारीरं तप उच्यते  ॥14॥\n" +
                    "\n" +
                    "भावार्थ  :-  देवता, ब्राह्मण, गुरु (यहाँ 'गुरु' शब्द से माता, पिता, आचार्य और वृद्ध एवं अपने से जो किसी प्रकार भी बड़े हों, उन सबको समझना चाहिए।) और ज्ञानीजनों का पूजन, पवित्रता, सरलता, ब्रह्मचर्य और अहिंसा- यह शरीर- सम्बन्धी तप कहा जाता है\n" +
                    " ॥14॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==14)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "अनुद्वेगकरं वाक्यं सत्यं प्रियहितं च यत्।\n" +
                    " स्वाध्यायाभ्यसनं चैव वाङ्मयं तप उच्यते  ॥15॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो उद्वेग न करने वाला, प्रिय और हितकारक एवं यथार्थ भाषण है (मन और इन्द्रियों द्वारा जैसा अनुभव किया हो, ठीक वैसा ही कहने का नाम 'यथार्थ भाषण' है।) तथा जो वेद-शास्त्रों के पठन का एवं परमेश्वर के नाम-जप का अभ्यास है- वही वाणी-सम्बन्धी तप कहा जाता है\n" +
                    " ॥15॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==15)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "मनः प्रसादः सौम्यत्वं मौनमात्मविनिग्रहः।\n" +
                    " भावसंशुद्धिरित्येतत्तपो मानसमुच्यते  ॥16॥\n" +
                    "\n" +
                    "भावार्थ  :-  मन की प्रसन्नता, शान्तभाव, भगवच्चिन्तन करने का स्वभाव, मन का निग्रह और अन्तःकरण के भावों की भलीभाँति पवित्रता, इस प्रकार यह मन सम्बन्धी तप कहा जाता है\n" +
                    " ॥16॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==16)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "श्रद्धया परया तप्तं तपस्तत्त्रिविधं नरैः।\n" +
                    " अफलाकाङ्क्षिभिर्युक्तैः सात्त्विकं परिचक्षते  ॥17॥\n" +
                    "\n" +
                    "भावार्थ  :-  फल को न चाहने वाले योगी पुरुषों द्वारा परम श्रद्धा से किए हुए उस पूर्वोक्त तीन प्रकार के तप को सात्त्विक कहते हैं\n" +
                    " ॥17॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==17)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "सत्कारमानपूजार्थं तपो दम्भेन चैव यत्।\n" +
                    " क्रियते तदिह प्रोक्तं राजसं चलमध्रुवम् ॥18॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो तप सत्कार, मान और पूजा के लिए तथा अन्य किसी स्वार्थ के लिए भी स्वभाव से या पाखण्ड से किया जाता है, वह अनिश्चित ('अनिश्चित फलवाला' उसको कहते हैं कि जिसका फल होने न होने में शंका हो।) एवं क्षणिक फलवाला तप यहाँ राजस कहा गया है\n" +
                    " ॥18॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==18)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "मूढग्राहेणात्मनो यत्पीडया क्रियते तपः।\n" +
                    " परस्योत्सादनार्थं वा तत्तामसमुदाहृतम्  ॥19॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो तप मूढ़तापूर्वक हठ से, मन, वाणी और शरीर की पीड़ा के सहित अथवा दूसरे का अनिष्ट करने के लिए किया जाता है- वह तप तामस कहा गया है\n" +
                    " ॥19॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==19)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "दातव्यमिति यद्दानं दीयतेऽनुपकारिणे।\n" +
                    " देशे काले च पात्रे च तद्दानं सात्त्विकं स्मृतम्  ॥20॥\n" +
                    "\n" +
                    "भावार्थ  :-  दान देना ही कर्तव्य है- ऐसे भाव से जो दान देश तथा काल (जिस देश-काल में जिस वस्तु का अभाव हो, वही देश-काल, उस वस्तु द्वारा प्राणियों की सेवा करने के लिए योग्य समझा जाता है।) और पात्र के (भूखे, अनाथ, दुःखी, रोगी और असमर्थ तथा भिक्षुक आदि तो अन्न, वस्त्र और ओषधि एवं जिस वस्तु का जिसके पास अभाव हो, उस वस्तु द्वारा सेवा करने के लिए योग्य पात्र समझे जाते हैं और श्रेष्ठ आचरणों वाले विद्वान् ब्राह्मणजन धनादि सब प्रकार के पदार्थों द्वारा सेवा करने के लिए योग्य पात्र समझे जाते हैं।) प्राप्त होने पर उपकार न करने वाले के प्रति दिया जाता है, वह दान सात्त्विक कहा गया है\n" +
                    " ॥20॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==20)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "यत्तु प्रत्युपकारार्थं फलमुद्दिश्य वा पुनः।\n" +
                    " दीयते च परिक्लिष्टं तद्दानं राजसं स्मृतम्  ॥21॥\n" +
                    "\n" +
                    "भावार्थ  :-  किन्तु जो दान क्लेशपूर्वक (जैसे प्रायः वर्तमान समय के चन्दे-चिट्ठे आदि में धन दिया जाता है।) तथा प्रत्युपकार के प्रयोजन से अथवा फल को दृष्टि में (अर्थात् मान बड़ाई, प्रतिष्ठा और स्वर्गादि की प्राप्ति के लिए अथवा रोगादि की निवृत्ति के लिए।) रखकर फिर दिया जाता है, वह दान राजस कहा गया है\n" +
                    " ॥21॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==21)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "अदेशकाले यद्दानमपात्रेभ्यश्च दीयते।\n" +
                    " असत्कृतमवज्ञातं तत्तामसमुदाहृतम्  ॥22॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो दान बिना सत्कार के अथवा तिरस्कारपूर्वक अयोग्य देश-काल में और कुपात्र के प्रति दिया जाता है, वह दान तामस कहा गया है\n" +
                    " ॥22॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==22)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "(ॐ तत्सत् के प्रयोग की व्याख्या) \n" +
                    "ॐ तत्सदिति निर्देशो ब्रह्मणस्त्रिविधः स्मृतः।\n" +
                    " ब्राह्मणास्तेन वेदाश्च यज्ञाश्च विहिताः पुरा  ॥23॥\n" +
                    "\n" +
                    "भावार्थ  :-  ॐ, तत्, सत्-ऐसे यह तीन प्रकार का सच्चिदानन्दघन ब्रह्म का नाम कहा है, उसी से सृष्टि के आदिकाल में ब्राह्मण और वेद तथा यज्ञादि रचे गए\n" +
                    " ॥23॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==23)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "तस्मादोमित्युदाहृत्य यज्ञदानतपः क्रियाः।\n" +
                    " प्रवर्तन्ते विधानोक्तः सततं ब्रह्मवादिनाम्  ॥24॥\n" +
                    "\n" +
                    "भावार्थ  :-  इसलिए वेद-मन्त्रों का उच्चारण करने वाले श्रेष्ठ पुरुषों की शास्त्र विधि से नियत यज्ञ, दान और तपरूप क्रियाएँ सदा 'ॐ' इस परमात्मा के नाम को उच्चारण करके ही आरम्भ होती हैं\n" +
                    " ॥24॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==24)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "तदित्यनभिसन्दाय फलं यज्ञतपःक्रियाः।\n" +
                    " दानक्रियाश्चविविधाः क्रियन्ते मोक्षकाङ्क्षिभिः  ॥25॥\n" +
                    "\n" +
                    "भावार्थ  :-  तत् अर्थात् 'तत्' नाम से कहे जाने वाले परमात्मा का ही यह सब है- इस भाव से फल को न चाहकर नाना प्रकार के यज्ञ, तपरूप क्रियाएँ तथा दानरूप क्रियाएँ कल्याण की इच्छा वाले पुरुषों द्वारा की जाती हैं\n" +
                    " ॥25॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==25)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "सद्भावे साधुभावे च सदित्यतत्प्रयुज्यते।\n" +
                    " प्रशस्ते कर्मणि तथा सच्छब्दः पार्थ युज्यते  ॥26॥\n" +
                    "\n" +
                    "भावार्थ  :-  'सत्'- इस प्रकार यह परमात्मा का नाम सत्यभाव में और श्रेष्ठभाव में प्रयोग किया जाता है तथा हे पार्थ! उत्तम कर्म में भी 'सत्' शब्द का प्रयोग किया जाता है\n" +
                    " ॥26॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==26)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "यज्ञे तपसि दाने च स्थितिः सदिति चोच्यते।\n" +
                    " कर्म चैव तदर्थीयं सदित्यवाभिधीयते  ॥27॥\n" +
                    "\n" +
                    "भावार्थ  :-  तथा यज्ञ, तप और दान में जो स्थिति है, वह भी 'सत्' इस प्रकार कही जाती है और उस परमात्मा के लिए किया हुआ कर्म निश्चयपूर्वक सत्-ऐसे कहा जाता है\n" +
                    " ॥27॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==27)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            bundle.putString("message17", "अश्रद्धया हुतं दत्तं तपस्तप्तं कृतं च यत्।\n" +
                    " असदित्युच्यते पार्थ न च तत्प्रेत्य नो इह  ॥28॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! बिना श्रद्धा के किया हुआ हवन, दिया हुआ दान एवं तपा हुआ तप और जो कुछ भी किया हुआ शुभ कर्म है- वह समस्त 'असत्'- इस प्रकार कहा जाता है, इसलिए वह न तो इस लोक में लाभदायक है और न मरने के बाद ही\n" +
                    " ॥28॥ \n" +
                    " \n" +
                    " ॐ तत्सदिति श्रीमद्भगवद्गीतासूपनिषत्सु ब्रह्मविद्यायां योगशास्त्रे श्री कृष्णार्जुनसंवादे श्रद्धात्रयविभागयोगो नाम सप्तदशोऽध्याय : \n" +
                    " ॥17॥\n");
            fragment17.setArguments(bundle);
            return fragment17;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 28;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        return "श्लोक "+position;
    }
}
