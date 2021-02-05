package com.parmu.bhagwatgeeta;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter14 extends FragmentStatePagerAdapter {
    public ViewPagerAdapter14(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter14(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "(ज्ञान की महिमा और प्रकृति-पुरुष से जगत् की उत्पत्ति) \n" +
                    " श्रीभगवानुवाच परं भूयः प्रवक्ष्यामि ज्ञानानं मानमुत्तमम्। \n" +
                    " यज्ज्ञात्वा मुनयः सर्वे परां सिद्धिमितो गताः  ॥1॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान बोले- ज्ञानों में भी अतिउत्तम उस परम ज्ञान को मैं फिर कहूँगा, जिसको जानकर सब मुनिजन इस संसार से मुक्त होकर परम सिद्धि को प्राप्त हो गए हैं\n" +
                    " ॥1॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }

        else if(position==1)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "इदं ज्ञानमुपाश्रित्य मम साधर्म्यमागताः। \n" +
                    " सर्गेऽपि नोपजायन्ते प्रलये न व्यथन्ति च  ॥2॥\n" +
                    "\n" +
                    "भावार्थ  :-  इस ज्ञान को आश्रय करके अर्थात धारण करके मेरे स्वरूप को प्राप्त हुए पुरुष सृष्टि के आदि में पुनः उत्पन्न नहीं होते और प्रलयकाल में भी व्याकुल नहीं होते\n" +
                    " ॥2॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==2)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "मम योनिर्महद्ब्रह्म तस्मिन्गर्भं दधाम्यहम्। \n" +
                    " सम्भवः सर्वभूतानां ततो भवति भारत  ॥3॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! मेरी महत्-ब्रह्मरूप मूल-प्रकृति सम्पूर्ण भूतों की योनि है अर्थात गर्भाधान का स्थान है और मैं उस योनि में चेतन समुदायरूप गर्भ को स्थापन करता हूँ। उस जड़-चेतन के संयोग से सब भूतों की उत्पति होती है\n" +
                    " ॥3॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==3)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "सर्वयोनिषु कौन्तेय मूर्तयः सम्भवन्ति याः। \n" +
                    " तासां ब्रह्म महद्योनिरहं बीजप्रदः पिता  ॥4॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! नाना प्रकार की सब योनियों में जितनी मूर्तियाँ अर्थात शरीरधारी प्राणी उत्पन्न होते हैं, प्रकृति तो उन सबकी गर्भधारण करने वाली माता है और मैं बीज को स्थापन करने वाला पिता हूँ\n" +
                    " ॥4॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==4)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "(सत्, रज, तम- तीनों गुणों का विषय)\n" +
                    "सत्त्वं रजस्तम इति गुणाः प्रकृतिसम्भवाः।\n" +
                    " निबध्नन्ति महाबाहो देहे देहिनमव्ययम्  ॥5॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! सत्त्वगुण, रजोगुण और तमोगुण -ये प्रकृति से उत्पन्न तीनों गुण अविनाशी जीवात्मा को शरीर में बाँधते हैं\n" +
                    " ॥5॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==5)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "तत्र सत्त्वं निर्मलत्वात्प्रकाशकमनामयम्।\n" +
                    " सुखसङ्गेन बध्नाति ज्ञानसङ्गेन चानघ  ॥6॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे निष्पाप! उन तीनों गुणों में सत्त्वगुण तो निर्मल होने के कारण प्रकाश करने वाला और विकार रहित है, वह सुख के सम्बन्ध से और ज्ञान के सम्बन्ध से अर्थात उसके अभिमान से बाँधता है\n" +
                    " ॥6॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==6)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "रजो रागात्मकं विद्धि तृष्णासङ्गसमुद्भवम्।\n" +
                    " तन्निबध्नाति कौन्तेय कर्मसङ्गेन देहिनम्  ॥7॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! रागरूप रजोगुण को कामना और आसक्ति से उत्पन्न जान। वह इस जीवात्मा को कर्मों और उनके फल के सम्बन्ध में बाँधता है\n" +
                    " ॥7॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==7)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "तमस्त्वज्ञानजं विद्धि मोहनं सर्वदेहिनाम्।\n" +
                    " प्रमादालस्यनिद्राभिस्तन्निबध्नाति भारत  ॥8॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! सब देहाभिमानियों को मोहित करने वाले तमोगुण को तो अज्ञान से उत्पन्न जान। वह इस जीवात्मा को प्रमाद (इंद्रियों और अंतःकरण की व्यर्थ चेष्टाओं का नाम 'प्रमाद' है), आलस्य (कर्तव्य कर्म में अप्रवृत्तिरूप निरुद्यमता का नाम 'आलस्य' है) और निद्रा द्वारा बाँधता है\n" +
                    " ॥8॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==8)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "सत्त्वं सुखे सञ्जयति रजः कर्मणि भारत।\n" +
                    " ज्ञानमावृत्य तु तमः प्रमादे सञ्जयत्युत  ॥9॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! सत्त्वगुण सुख में लगाता है और रजोगुण कर्म में तथा तमोगुण तो ज्ञान को ढँककर प्रमाद में भी लगाता है\n" +
                    " ॥9॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==9)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "रजस्तमश्चाभिभूय सत्त्वं भवति भारत।\n" +
                    " रजः सत्त्वं तमश्चैव तमः सत्त्वं रजस्तथा  ॥10॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! रजोगुण और तमोगुण को दबाकर सत्त्वगुण, सत्त्वगुण और तमोगुण को दबाकर रजोगुण, वैसे ही सत्त्वगुण और रजोगुण को दबाकर तमोगुण होता है अर्थात बढ़ता है\n" +
                    " \n" +
                    " ॥10॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==10)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "सर्वद्वारेषु देहेऽस्मिन्प्रकाश उपजायते।\n" +
                    " ज्ञानं यदा तदा विद्याद्विवृद्धं सत्त्वमित्युत  ॥11॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिस समय इस देह में तथा अन्तःकरण और इन्द्रियों में चेतनता और विवेक शक्ति उत्पन्न होती है, उस समय ऐसा जानना चाहिए कि सत्त्वगुण बढ़ा है\n" +
                    " ॥11॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==11)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "लोभः प्रवृत्तिरारम्भः कर्मणामशमः स्पृहा।\n" +
                    " रजस्येतानि जायन्ते विवृद्धे भरतर्षभ  ॥12॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! रजोगुण के बढ़ने पर लोभ, प्रवृत्ति, स्वार्थबुद्धि से कर्मों का सकामभाव से आरम्भ, अशान्ति और विषय भोगों की लालसा- ये सब उत्पन्न होते हैं\n" +
                    " ॥12॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==12)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "अप्रकाशोऽप्रवृत्तिश्च प्रमादो मोह एव च।\n" +
                    " तमस्येतानि जायन्ते विवृद्धे कुरुनन्दन  ॥13॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! तमोगुण के बढ़ने पर अन्तःकरण और इंन्द्रियों में अप्रकाश, कर्तव्य-कर्मों में अप्रवृत्ति और प्रमाद अर्थात व्यर्थ चेष्टा और निद्रादि अन्तःकरण की मोहिनी वृत्तियाँ - ये सब ही उत्पन्न होते हैं\n" +
                    " ॥13॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==13)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "यदा सत्त्वे प्रवृद्धे तु प्रलयं याति देहभृत्।\n" +
                    " तदोत्तमविदां लोकानमलान्प्रतिपद्यते  ॥14॥\n" +
                    "\n" +
                    "भावार्थ  :-  जब यह मनुष्य सत्त्वगुण की वृद्धि में मृत्यु को प्राप्त होता है, तब तो उत्तम कर्म करने वालों के निर्मल दिव्य स्वर्गादि लोकों को प्राप्त होता है\n" +
                    " ॥14॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==14)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "रजसि प्रलयं गत्वा कर्मसङ्गिषु जायते।\n" +
                    " तथा प्रलीनस्तमसि मूढयोनिषु जायते  ॥15॥\n" +
                    "\n" +
                    "भावार्थ  :-  रजोगुण के बढ़ने पर मृत्यु को प्राप्त होकर कर्मों की आसक्ति वाले मनुष्यों में उत्पन्न होता है तथा तमोगुण के बढ़ने पर मरा हुआ मनुष्य कीट, पशु आदि मूढ़योनियों में उत्पन्न होता है\n" +
                    " ॥15॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==15)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "कर्मणः सुकृतस्याहुः सात्त्विकं निर्मलं फलम्।\n" +
                    " रजसस्तु फलं दुःखमज्ञानं तमसः फलम्  ॥16॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्रेष्ठ कर्म का तो सात्त्विक अर्थात् सुख, ज्ञान और वैराग्यादि निर्मल फल कहा है, राजस कर्म का फल दुःख एवं तामस कर्म का फल अज्ञान कहा है\n" +
                    " ॥16॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==16)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "सत्त्वात्सञ्जायते ज्ञानं रजसो लोभ एव च।\n" +
                    " प्रमादमोहौ तमसो भवतोऽज्ञानमेव च  ॥17॥\n" +
                    "\n" +
                    "भावार्थ  :-  सत्त्वगुण से ज्ञान उत्पन्न होता है और रजोगुण से निःसन्देह लोभ तथा तमोगुण से प्रमाद (इसी अध्याय के श्लोक 13 में देखना चाहिए) और मोह (इसी अध्याय के श्लोक 13 में देखना चाहिए।) उत्पन्न होते हैं और अज्ञान भी होता है\n" +
                    " ॥17॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==17)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "ऊर्ध्वं गच्छन्ति सत्त्वस्था मध्ये तिष्ठन्ति राजसाः।\n" +
                    " जघन्यगुणवृत्तिस्था अधो गच्छन्ति तामसाः  ॥18॥\n" +
                    "\n" +
                    "भावार्थ  :-  सत्त्वगुण में स्थित पुरुष स्वर्गादि उच्च लोकों को जाते हैं, रजोगुण में स्थित राजस पुरुष मध्य में अर्थात मनुष्य लोक में ही रहते हैं और तमोगुण के कार्यरूप निद्रा, प्रमाद और आलस्यादि में स्थित तामस पुरुष अधोगति को अर्थात कीट, पशु आदि नीच योनियों को तथा नरकों को प्राप्त होते हैं\n" +
                    " ॥18॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==18)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "(भगवत्प्राप्ति का उपाय और गुणातीत पुरुष के लक्षण) \n" +
                    "नान्यं गुणेभ्यः कर्तारं यदा द्रष्टानुपश्यति।\n" +
                    " गुणेभ्यश्च परं वेत्ति मद्भावं सोऽधिगच्छति  ॥19॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिस समय दृष्टा तीनों गुणों के अतिरिक्त अन्य किसी को कर्ता नहीं देखता और तीनों गुणों से अत्यन्त परे सच्चिदानन्दघनस्वरूप मुझ परमात्मा को तत्त्व से जानता है, उस समय वह मेरे स्वरूप को प्राप्त होता है\n" +
                    " ॥19॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==19)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "गुणानेतानतीत्य त्रीन्देही देहसमुद्भवान्।\n" +
                    " जन्ममृत्युजरादुःखैर्विमुक्तोऽमृतमश्नुते   ॥20॥\n" +
                    "\n" +
                    "भावार्थ  :-  यह पुरुष शरीर की (बुद्धि, अहंकार और मन तथा पाँच ज्ञानेन्द्रियाँ, पाँच कर्मेन्द्रियाँ, पाँच भूत, पाँच इन्द्रियों के विषय- इस प्रकार इन तेईस तत्त्वों का पिण्ड रूप यह स्थूल शरीर प्रकृति से उत्पन्न होने वाले गुणों का ही कार्य है, इसलिए इन तीनों गुणों को इसी की उत्पत्ति का कारण कहा है) उत्पत्ति के कारणरूप इन तीनों गुणों को उल्लंघन करके जन्म, मृत्यु, वृद्धावस्था और सब प्रकार के दुःखों से मुक्त हुआ परमानन्द को प्राप्त होता है\n" +
                    " ॥20॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==20)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "अर्जुन उवाच कैर्लिङ्गैस्त्रीन्गुणानेतानतीतो भवति प्रभो।\n" +
                    " किमाचारः कथं चैतांस्त्रीन्गुणानतिवर्तते  ॥21॥\n" +
                    "\n" +
                    "भावार्थ  :-  अर्जुन बोले- इन तीनों गुणों से अतीत पुरुष किन-किन लक्षणों से युक्त होता है और किस प्रकार के आचरणों वाला होता है तथा हे प्रभो! मनुष्य किस उपाय से इन तीनों गुणों से अतीत होता है?\n" +
                    " ॥21॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==21)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "श्रीभगवानुवाच  :-\n" +
                    "प्रकाशं च प्रवृत्तिं च मोहमेव च पाण्डव।\n" +
                    " न द्वेष्टि सम्प्रवृत्तानि न निवृत्तानि काङ्क्षति  ॥22॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान बोले- हे अर्जुन! जो पुरुष सत्त्वगुण के कार्यरूप प्रकाश (अन्तःकरण और इन्द्रियादि को आलस्य का अभाव होकर जो एक प्रकार की चेतनता होती है, उसका नाम 'प्रकाश' है) को और रजोगुण के कार्यरूप प्रवृत्ति को तथा तमोगुण के कार्यरूप मोह (निद्रा और आलस्य आदि की बहुलता से अन्तःकरण और इन्द्रियों में चेतन शक्ति के लय होने को यहाँ 'मोह' नाम से समझना चाहिए) को भी न तो प्रवृत्त होने पर उनसे द्वेष करता है और न निवृत्त होने पर उनकी आकांक्षा करता है। (जो पुरुष एक सच्चिदानन्दघन परमात्मा में ही नित्य, एकीभाव से स्थित हुआ इस त्रिगुणमयी माया के प्रपंच रूप संसार से सर्वथा अतीत हो गया है, उस गुणातीत पुरुष के अभिमानरहित अन्तःकरण में तीनों गुणों के कार्यरूप प्रकाश, प्रवृत्ति और मोहादि वृत्तियों के प्रकट होने और न होने पर किसी काल में भी इच्छा-द्वेष आदि विकार नहीं होते हैं, यही उसके गुणों से अतीत होने के प्रधान लक्षण है)\n" +
                    " ॥22॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==22)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "उदासीनवदासीनो गुणैर्यो न विचाल्यते।\n" +
                    " गुणा वर्तन्त इत्येव योऽवतिष्ठति नेङ्गते  ॥23॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो साक्षी के सदृश स्थित हुआ गुणों द्वारा विचलित नहीं किया जा सकता और गुण ही गुणों में बरतते (त्रिगुणमयी माया से उत्पन्न हुए अन्तःकरण सहित इन्द्रियों का अपने-अपने विषयों में विचरना ही 'गुणों का गुणों में बरतना' है) हैं- ऐसा समझता हुआ जो सच्चिदानन्दघन परमात्मा में एकीभाव से स्थित रहता है एवं उस स्थिति से कभी विचलित नहीं होता\n" +
                    " ॥23॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==23)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "समदुःखसुखः स्वस्थः समलोष्टाश्मकाञ्चनः।\n" +
                    " तुल्यप्रियाप्रियो धीरस्तुल्यनिन्दात्मसंस्तुतिः  ॥24॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो निरन्तर आत्म भाव में स्थित, दुःख-सुख को समान समझने वाला, मिट्टी, पत्थर और स्वर्ण में समान भाव वाला, ज्ञानी, प्रिय तथा अप्रिय को एक-सा मानने वाला और अपनी निन्दा-स्तुति में भी समान भाव वाला है\n" +
                    " ॥24॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==24)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "मानापमानयोस्तुल्यस्तुल्यो मित्रारिपक्षयोः।\n" +
                    " सर्वारम्भपरित्यागी गुणातीतः सा उच्यते  ॥25॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो मान और अपमान में सम है, मित्र और वैरी के पक्ष में भी सम है एवं सम्पूर्ण आरम्भों में कर्तापन के अभिमान से रहित है, वह पुरुष गुणातीत कहा जाता है\n" +
                    " ॥25॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==25)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "मां च योऽव्यभिचारेण भक्तियोगेन सेवते।\n" +
                    " स गुणान्समतीत्येतान्ब्रह्मभूयाय कल्पते  ॥26॥\n" +
                    "\n" +
                    "भावार्थ  :-  और जो पुरुष अव्यभिचारी भक्ति योग (केवल एक सर्वशक्तिमान परमेश्वर वासुदेव भगवान को ही अपना स्वामी मानता हुआ, स्वार्थ और अभिमान को त्याग कर श्रद्धा और भाव सहित परम प्रेम से निरन्तर चिन्तन करने को 'अव्यभिचारी भक्तियोग' कहते हैं) द्वारा मुझको निरन्तर भजता है, वह भी इन तीनों गुणों को भलीभाँति लाँघकर सच्चिदानन्दघन ब्रह्म को प्राप्त होने के लिए योग्य बन जाता है\n" +
                    " ॥26॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }
        else if(position==26)
        {
            FourteenFragment fourteenFragment=new FourteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message14", "ब्रह्मणो हि प्रतिष्ठाहममृतस्याव्ययस्य च।\n" +
                    " शाश्वतस्य च धर्मस्य सुखस्यैकान्तिकस्य च  ॥27॥\n" +
                    "\n" +
                    "भावार्थ  :-  क्योंकि उस अविनाशी परब्रह्म का और अमृत का तथा नित्य धर्म का और अखण्ड एकरस आनन्द का आश्रय मैं हूँ\n" +
                    " ॥27॥ \n" +
                    " \n" +
                    " ॐ तत्सदिति श्रीमद्भगवद्गीतासूपनिषत्सु ब्रह्मविद्यायांयोगशास्त्रे श्रीकृष्णार्जुनसंवादे गुणत्रयविभागयोगो नामचतुर्दशोऽध्यायः\n" +
                    " ॥14॥\n");
            fourteenFragment.setArguments(bundle);
            return  fourteenFragment;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 27;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        return "श्लोक "+position;
    }
}
