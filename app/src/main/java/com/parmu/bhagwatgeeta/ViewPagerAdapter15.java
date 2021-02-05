package com.parmu.bhagwatgeeta;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter15 extends FragmentStatePagerAdapter {
    public ViewPagerAdapter15(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter15(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            FifteenFragment fifteenFragment=new FifteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message15", "(संसार वृक्ष का कथन और भगवत्प्राप्ति का उपाय) \n" +
                    " श्रीभगवानुवाच   :-\n" +
                    " ऊर्ध्वमूलमधः शाखमश्वत्थं प्राहुरव्ययम्।\n" +
                    " छन्दांसि यस्य पर्णानि यस्तं वेद स वेदवित्  ॥1॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान बोले- आदिपुरुष परमेश्वर रूप मूल वाले (आदिपुरुष नारायण वासुदेव भगवान ही नित्य और अनन्त तथा सबके आधार होने के कारण और सबसे ऊपर नित्यधाम में सगुणरूप से वास करने के कारण ऊर्ध्व नाम से कहे गए हैं और वे मायापति, सर्वशक्तिमान परमेश्वर ही इस संसाररूप वृक्ष के कारण हैं, इसलिए इस संसार वृक्ष को 'ऊर्ध्वमूलवाला' कहते हैं) और ब्रह्मारूप मुख्य शाखा वाले (उस आदिपुरुष परमेश्वर से उत्पत्ति वाला होने के कारण तथा नित्यधाम से नीचे ब्रह्मलोक में वास करने के कारण, हिरण्यगर्भरूप ब्रह्मा को परमेश्वर की अपेक्षा 'अधः' कहा है और वही इस संसार का विस्तार करने वाला होने से इसकी मुख्य शाखा है, इसलिए इस संसार वृक्ष को 'अधःशाखा वाला' कहते हैं) जिस संसार रूप पीपल वृक्ष को अविनाशी (इस वृक्ष का मूल कारण परमात्मा अविनाशी है तथा अनादिकाल से इसकी परम्परा चली आती है, इसलिए इस संसार वृक्ष को 'अविनाशी' कहते हैं) कहते हैं, तथा वेद जिसके पत्ते (इस वृक्ष की शाखा रूप ब्रह्मा से प्रकट होने वाले और यज्ञादि कर्मों द्वारा इस संसार वृक्ष की रक्षा और वृद्धि करने वाले एवं शोभा को बढ़ाने वाले होने से वेद 'पत्ते' कहे गए हैं) कहे गए हैं, उस संसार रूप वृक्ष को जो पुरुष मूलसहित सत्त्व से जानता है, वह वेद के तात्पर्य को जानने वाला है। (भगवान् की योगमाया से उत्पन्न हुआ संसार क्षणभंगुर, नाशवान और दुःखरूप है, इसके चिन्तन को त्याग कर केवल परमेश्वर ही नित्य-निरन्तर, अनन्य प्रेम से चिन्तन करना 'वेद के तात्पर्य को जानना' है)\n" +
                    " ॥1॥\n");
            fifteenFragment.setArguments(bundle);
            return  fifteenFragment;
        }

        else if(position==1)
        {
            FifteenFragment fifteenFragment=new FifteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message15", "अधश्चोर्ध्वं प्रसृतास्तस्य शाखा गुणप्रवृद्धा विषयप्रवालाः।\n" +
                    " अधश्च मूलान्यनुसन्ततानि कर्मानुबन्धीनि मनुष्यलोके  ॥2॥\n" +
                    "\n" +
                    "भावार्थ  :-  उस संसार वृक्ष की तीनों गुणोंरूप जल के द्वारा बढ़ी हुई एवं विषय-भोग रूप कोंपलोंवाली ( शब्द, स्पर्श, रूप, रस और गन्ध -ये पाँचों स्थूलदेह और इन्द्रियों की अपेक्षा सूक्ष्म होने के कारण उन शाखाओं की 'कोंपलों' के रूप में कहे गए हैं।) देव, मनुष्य और तिर्यक् आदि योनिरूप शाखाएँ (मुख्य शाखा रूप ब्रह्मा से सम्पूर्ण लोकों सहित देव, मनुष्य और तिर्यक् आदि योनियों की उत्पत्ति और विस्तार हुआ है, इसलिए उनका यहाँ 'शाखाओं' के रूप में वर्णन किया है) नीचे और ऊपर सर्वत्र फैली हुई हैं तथा मनुष्य लोक में ( अहंता, ममता और वासनारूप मूलों को केवल मनुष्य योनि में कर्मों के अनुसार बाँधने वाली कहने का कारण यह है कि अन्य सब योनियों में तो केवल पूर्वकृत कर्मों के फल को भोगने का ही अधिकार है और मनुष्य योनि में नवीन कर्मों के करने का भी अधिकार है) कर्मों के अनुसार बाँधने वाली अहंता-ममता और वासना रूप जड़ें भी नीचे और ऊपर सभी लोकों में व्याप्त हो रही हैं। \n" +
                    " ॥2॥\n");
            fifteenFragment.setArguments(bundle);
            return  fifteenFragment;
        }
        else if(position==2)
        {
            FifteenFragment fifteenFragment=new FifteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message15", "न रूपमस्येह तथोपलभ्यते नान्तो न चादिर्न च सम्प्रतिष्ठा।\n" +
                    " अश्वत्थमेनं सुविरूढमूल मसङ्गशस्त्रेण दृढेन छित्त्वा  ॥3॥\n" +
                    "\n" +
                    "भावार्थ  :-  इस संसार वृक्ष का स्वरूप जैसा कहा है वैसा यहाँ विचार काल में नहीं पाया जाता (इस संसार का जैसा स्वरूप शास्त्रों में वर्णन किया गया है और जैसा देखा-सुना जाता है, वैसा तत्त्व ज्ञान होने के पश्चात नहीं पाया जाता, जिस प्रकार आँख खुलने के पश्चात स्वप्न का संसार नहीं पाया जाता) क्योंकि न तो इसका आदि है (इसका आदि नहीं है, यह कहने का प्रयोजन यह है कि इसकी परम्परा कब से चली आ रही है, इसका कोई पता नहीं है) और न अन्त है (इसका अन्त नहीं है, यह कहने का प्रयोजन यह है कि इसकी परम्परा कब तक चलती रहेगी, इसका कोई पता नहीं है) तथा न इसकी अच्छी प्रकार से स्थिति ही है (इसकी अच्छी प्रकार स्थिति भी नहीं है, यह कहने का प्रयोजन यह है कि वास्तव में यह क्षणभंगुर और नाशवान है) इसलिए इस अहंता, ममता और वासनारूप अति दृढ़ मूलों वाले संसार रूप पीपल के वृक्ष को दृढ़ वैराग्य रूप (ब्रह्मलोक तक के भोग क्षणिक और नाशवान हैं, ऐसा समझकर, इस संसार के समस्त विषयभोगों में सत्ता, सुख, प्रीति और रमणीयता का न भासना ही 'दृढ़ वैराग्यरूप शस्त्र' है) शस्त्र द्वारा काटकर (स्थावर, जंगमरूप यावन्मात्र संसार के चिन्तन का तथा अनादिकाल से अज्ञान द्वारा दृढ़ हुई अहंता, ममता और वासना रूप मूलों का त्याग करना ही संसार वृक्ष का अवान्तर 'मूलों के सहित काटना' है।)\n" +
                    " ॥3॥\n");
            fifteenFragment.setArguments(bundle);
            return  fifteenFragment;
        }
        else if(position==3)
        {
            FifteenFragment fifteenFragment=new FifteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message15", "ततः पदं तत्परिमार्गितव्यं यस्मिन्गता न निवर्तन्ति भूयः।\n" +
                    " तमेव चाद्यं पुरुषं प्रपद्ये यतः प्रवृत्तिः प्रसृता पुराणी  ॥4॥\n" +
                    "\n" +
                    "भावार्थ  :-  उसके पश्चात उस परम-पदरूप परमेश्वर को भलीभाँति खोजना चाहिए, जिसमें गए हुए पुरुष फिर लौटकर संसार में नहीं आते और जिस परमेश्वर से इस पुरातन संसार वृक्ष की प्रवृत्ति विस्तार को प्राप्त हुई है, उसी आदिपुरुष नारायण के मैं शरण हूँ- इस प्रकार दृढ़ निश्चय करके उस परमेश्वर का मनन और निदिध्यासन करना चाहिए\n" +
                    " ॥4॥\n");
            fifteenFragment.setArguments(bundle);
            return  fifteenFragment;
        }
        else if(position==4)
        {
            FifteenFragment fifteenFragment=new FifteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message15", "निर्मानमोहा जितसङ्गदोषाअध्यात्मनित्या विनिवृत्तकामाः।\n" +
                    " द्वन्द्वैर्विमुक्ताः सुखदुःखसञ्ज्ञैर्गच्छन्त्यमूढाः पदमव्ययं तत्  ॥5॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिनका मान और मोह नष्ट हो गया है, जिन्होंने आसक्ति रूप दोष को जीत लिया है, जिनकी परमात्मा के स्वरूप में नित्य स्थिति है और जिनकी कामनाएँ पूर्ण रूप से नष्ट हो गई हैं- वे सुख-दुःख नामक द्वन्द्वों से विमुक्त ज्ञानीजन उस अविनाशी परम पद को प्राप्त होते हैं\n" +
                    " ॥5॥\n");
            fifteenFragment.setArguments(bundle);
            return  fifteenFragment;
        }
        else if(position==5)
        {
            FifteenFragment fifteenFragment=new FifteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message15", "न तद्भासयते सूर्यो न शशाङ्को न पावकः।\n" +
                    " यद्गत्वा न निवर्तन्ते तद्धाम परमं मम  ॥6॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिस परम पद को प्राप्त होकर मनुष्य लौटकर संसार में नहीं आते उस स्वयं प्रकाश परम पद को न सूर्य प्रकाशित कर सकता है, न चन्द्रमा और न अग्नि ही, वही मेरा परम धाम ('परम धाम' का अर्थ गीता अध्याय 8 श्लोक 21 में देखना चाहिए।) है\n" +
                    " ॥6॥\n");
            fifteenFragment.setArguments(bundle);
            return  fifteenFragment;
        }
        else if(position==6)
        {
            FifteenFragment fifteenFragment=new FifteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message15", "(जीवात्मा का विषय) \n" +
                    " श्रीभगवानुवाच   :-\n" +
                    " ममैवांशो जीवलोके जीवभूतः सनातनः।\n" +
                    " मनः षष्ठानीन्द्रियाणि प्रकृतिस्थानि कर्षति  ॥7॥\n" +
                    "\n" +
                    "भावार्थ  :-  इस देह में यह जीवात्मा मेरा ही सनातन अंश है (जैसे विभागरहित स्थित हुआ भी महाकाश घटों में पृथक-पृथक की भाँति प्रतीत होता है, वैसे ही सब भूतों में एकीरूप से स्थित हुआ भी परमात्मा पृथक-पृथक की भाँति प्रतीत होता है, इसी से देह में स्थित जीवात्मा को भगवान ने अपना 'सनातन अंश' कहा है) और वही इन प्रकृति में स्थित मन और पाँचों इन्द्रियों को आकर्षित करता है\n" +
                    " ॥7॥\n");
            fifteenFragment.setArguments(bundle);
            return  fifteenFragment;
        }
        else if(position==7)
        {
            FifteenFragment fifteenFragment=new FifteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message15", "शरीरं यदवाप्नोति यच्चाप्युत्क्रामतीश्वरः।\n" +
                    " गृहीत्वैतानि संयाति वायुर्गन्धानिवाशयात्  ॥8॥\n" +
                    "\n" +
                    "भावार्थ  :-  वायु गन्ध के स्थान से गन्ध को जैसे ग्रहण करके ले जाता है, वैसे ही देहादिका स्वामी जीवात्मा भी जिस शरीर का त्याग करता है, उससे इन मन सहित इन्द्रियों को ग्रहण करके फिर जिस शरीर को प्राप्त होता है- उसमें जाता है\n" +
                    " ॥8॥\n");
            fifteenFragment.setArguments(bundle);
            return  fifteenFragment;
        }
        else if(position==8)
        {
            FifteenFragment fifteenFragment=new FifteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message15", "श्रोत्रं चक्षुः स्पर्शनं च रसनं घ्राणमेव च।\n" +
                    " अधिष्ठाय मनश्चायं विषयानुपसेवते  ॥9॥\n" +
                    "\n" +
                    "भावार्थ  :-  यह जीवात्मा श्रोत्र, चक्षु और त्वचा को तथा रसना, घ्राण और मन को आश्रय करके -अर्थात इन सबके सहारे से ही विषयों का सेवन करता है\n" +
                    " ॥9॥\n");
            fifteenFragment.setArguments(bundle);
            return  fifteenFragment;
        }
        else if(position==9)
        {
            FifteenFragment fifteenFragment=new FifteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message15", "उत्क्रामन्तं स्थितं वापि भुञ्जानं वा गुणान्वितम्।\n" +
                    " विमूढा नानुपश्यन्ति पश्यन्ति ज्ञानचक्षुषः  ॥10॥\n" +
                    "\n" +
                    "भावार्थ  :-  शरीर को छोड़कर जाते हुए को अथवा शरीर में स्थित हुए को अथवा विषयों को भोगते हुए को इस प्रकार तीनों गुणों से युक्त हुए को भी अज्ञानीजन नहीं जानते, केवल ज्ञानरूप नेत्रों वाले विवेकशील ज्ञानी ही तत्त्व से जानते हैं\n" +
                    " \n" +
                    " ॥10॥\n");
            fifteenFragment.setArguments(bundle);
            return  fifteenFragment;
        }
        else if(position==10)
        {
            FifteenFragment fifteenFragment=new FifteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message15", "यतन्तो योगिनश्चैनं पश्यन्त्यात्मन्यवस्थितम्।\n" +
                    " यतन्तोऽप्यकृतात्मानो नैनं पश्यन्त्यचेतसः  ॥11॥\n" +
                    "\n" +
                    "भावार्थ  :-  यत्न करने वाले योगीजन भी अपने हृदय में स्थित इस आत्मा को तत्त्व से जानते हैं, किन्तु जिन्होंने अपने अन्तःकरण को शुद्ध नहीं किया है, ऐसे अज्ञानीजन तो यत्न करते रहने पर भी इस आत्मा को नहीं जानते\n" +
                    " ॥11॥\n");
            fifteenFragment.setArguments(bundle);
            return  fifteenFragment;
        }
        else if(position==11)
        {
            FifteenFragment fifteenFragment=new FifteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message15", "(प्रभाव सहित परमेश्वर के स्वरूप का विषय) \n" +
                    " यदादित्यगतं तेजो जगद्भासयतेऽखिलम्।\n" +
                    " यच्चन्द्रमसि यच्चाग्नौ तत्तेजो विद्धि मामकम्  ॥12॥\n" +
                    "\n" +
                    "भावार्थ  :-  सूर्य में स्थित जो तेज सम्पूर्ण जगत को प्रकाशित करता है तथा जो तेज चन्द्रमा में है और जो अग्नि में है- उसको तू मेरा ही तेज जान\n" +
                    " ॥12॥\n");
            fifteenFragment.setArguments(bundle);
            return  fifteenFragment;
        }
        else if(position==12)
        {
            FifteenFragment fifteenFragment=new FifteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message15", "गामाविश्य च भूतानि धारयाम्यहमोजसा।\n" +
                    " पुष्णामि चौषधीः सर्वाः सोमो भूत्वा रसात्मकः  ॥13॥\n" +
                    "\n" +
                    "भावार्थ  :-  और मैं ही पृथ्वी में प्रवेश करके अपनी शक्ति से सब भूतों को धारण करता हूँ और रसस्वरूप अर्थात अमृतमय चन्द्रमा होकर सम्पूर्ण ओषधियों को अर्थात वनस्पतियों को पुष्ट करता हूँ\n" +
                    " ॥13॥\n");
            fifteenFragment.setArguments(bundle);
            return  fifteenFragment;
        }
        else if(position==13)
        {
            FifteenFragment fifteenFragment=new FifteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message15", "अहं वैश्वानरो भूत्वा प्राणिनां देहमाश्रितः।\n" +
                    " प्राणापानसमायुक्तः पचाम्यन्नं चतुर्विधम्  ॥14॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं ही सब प्राणियों के शरीर में स्थित रहने वाला प्राण और अपान से संयुक्त वैश्वानर अग्नि रूप होकर चार (भक्ष्य, भोज्य, लेह्य और चोष्य, ऐसे चार प्रकार के अन्न होते हैं, उनमें जो चबाकर खाया जाता है, वह 'भक्ष्य' है- जैसे रोटी आदि। जो निगला जाता है, वह 'भोज्य' है- जैसे दूध आदि तथा जो चाटा जाता है, वह 'लेह्य' है- जैसे चटनी आदि और जो चूसा जाता है, वह 'चोष्य' है- जैसे ईख आदि) प्रकार के अन्न को पचाता हूँ\n" +
                    " ॥14॥\n");
            fifteenFragment.setArguments(bundle);
            return  fifteenFragment;
        }
        else if(position==14)
        {
            FifteenFragment fifteenFragment=new FifteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message15", "सर्वस्य चाहं हृदि सन्निविष्टोमत्तः स्मृतिर्ज्ञानमपोहनं च।\n" +
                    " वेदैश्च सर्वैरहमेव वेद्योवेदान्तकृद्वेदविदेव चाहम्  ॥15॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं ही सब प्राणियों के हृदय में अन्तर्यामी रूप से स्थित हूँ तथा मुझसे ही स्मृति, ज्ञान और अपोहन (विचार द्वारा बुद्धि में रहने वाले संशय, विपर्यय आदि दोषों को हटाने का नाम 'अपोहन' है) होता है और सब वेदों द्वारा मैं ही जानने योग्य (सर्व वेदों का तात्पर्य परमेश्वर को जानने का है, इसलिए सब वेदों द्वारा 'जानने के योग्य' एक परमेश्वर ही है) हूँ तथा वेदान्त का कर्ता और वेदों को जानने वाला भी मैं ही हूँ\n" +
                    " ॥15॥\n");
            fifteenFragment.setArguments(bundle);
            return  fifteenFragment;
        }
        else if(position==15)
        {
            FifteenFragment fifteenFragment=new FifteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message15", "(क्षर, अक्षर, पुरुषोत्तम का विषय) \n" +
                    " द्वाविमौ पुरुषौ लोके क्षरश्चाक्षर एव च।\n" +
                    " क्षरः सर्वाणि भूतानि कूटस्थोऽक्षर उच्यते  ॥16॥\n" +
                    "\n" +
                    "भावार्थ  :-  इस संसार में नाशवान और अविनाशी भी ये दो प्रकार (गीता अध्याय 7 श्लोक 4-5 में जो अपरा और परा प्रकृति के नाम से कहे गए हैं तथा अध्याय 13 श्लोक 1 में जो क्षेत्र और क्षेत्रज्ञ के नाम से कहे गए हैं, उन्हीं दोनों का यहाँ क्षर और अक्षर के नाम से वर्णन किया है) के पुरुष हैं। इनमें सम्पूर्ण भूतप्राणियों के शरीर तो नाशवान और जीवात्मा अविनाशी कहा जाता है\n" +
                    " ॥16॥\n");
            fifteenFragment.setArguments(bundle);
            return  fifteenFragment;
        }
        else if(position==16)
        {
            FifteenFragment fifteenFragment=new FifteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message15", "उत्तमः पुरुषस्त्वन्यः परमात्मेत्युदाहृतः।\n" +
                    " यो लोकत्रयमाविश्य बिभर्त्यव्यय ईश्वरः  ॥17॥\n" +
                    "\n" +
                    "भावार्थ  :-  इन दोनों से उत्तम पुरुष तो अन्य ही है, जो तीनों लोकों में प्रवेश करके सबका धारण-पोषण करता है एवं अविनाशी परमेश्वर और परमात्मा- इस प्रकार कहा गया है\n" +
                    " ॥17॥\n");
            fifteenFragment.setArguments(bundle);
            return  fifteenFragment;
        }
        else if(position==17)
        {
            FifteenFragment fifteenFragment=new FifteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message15", "यस्मात्क्षरमतीतोऽहमक्षरादपि चोत्तमः।\n" +
                    " अतोऽस्मि लोके वेदे च प्रथितः पुरुषोत्तमः॥18॥\n" +
                    "\n" +
                    "भावार्थ  :-  क्योंकि मैं नाशवान जड़वर्ग- क्षेत्र से तो सर्वथा अतीत हूँ और अविनाशी जीवात्मा से भी उत्तम हूँ, इसलिए लोक में और वेद में भी पुरुषोत्तम नाम से प्रसिद्ध हूँ\n" +
                    " ॥18॥\n");
            fifteenFragment.setArguments(bundle);
            return  fifteenFragment;
        }
        else if(position==18)
        {
            FifteenFragment fifteenFragment=new FifteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message15", "यो मामेवमसम्मूढो जानाति पुरुषोत्तमम्।\n" +
                    " स सर्वविद्भजति मां सर्वभावेन भारत ॥19॥\n" +
                    "\n" +
                    "भावार्थ  :-  भारत! जो ज्ञानी पुरुष मुझको इस प्रकार तत्त्व से पुरुषोत्तम जानता है, वह सर्वज्ञ पुरुष सब प्रकार से निरन्तर मुझ वासुदेव परमेश्वर को ही भजता है\n" +
                    " ॥19॥\n");
            fifteenFragment.setArguments(bundle);
            return  fifteenFragment;
        }
        else if(position==19)
        {
            FifteenFragment fifteenFragment=new FifteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message15", "इति गुह्यतमं शास्त्रमिदमुक्तं मयानघ।\n" +
                    " एतद्बुद्ध्वा बुद्धिमान्स्यात्कृतकृत्यश्च भारत  ॥20॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे निष्पाप अर्जुन! इस प्रकार यह अति रहस्ययुक्त गोपनीय शास्त्र मेरे द्वारा कहा गया, इसको तत्त्व से जानकर मनुष्य ज्ञानवान और कृतार्थ हो जाता है\n" +
                    " ॥20॥ \n" +
                    " \n" +
                    " ॐ तत्सदिति श्रीमद्भगवद्गीतासूपनिषत्सु ब्रह्मविद्यायां योगशास्त्रे श्रीकृष्णार्जुन संवादे पुरुषोत्तमयोगो नाम पञ्चदशोऽध्यायः \n" +
                    " ॥15॥\n");
            fifteenFragment.setArguments(bundle);
            return  fifteenFragment;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 20;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        return "श्लोक "+position;
    }
}
