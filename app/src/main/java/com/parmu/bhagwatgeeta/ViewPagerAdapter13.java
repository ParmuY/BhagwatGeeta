package com.parmu.bhagwatgeeta;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter13 extends FragmentStatePagerAdapter {
    public ViewPagerAdapter13(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter13(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "(ज्ञानसहित क्षेत्र-क्षेत्रज्ञ का विषय) \n" +
                    " श्रीभगवानुवाच   :-\n" +
                    " इदं शरीरं कौन्तेय क्षेत्रमित्यभिधीयते।\n" +
                    " एतद्यो वेत्ति तं प्राहुः क्षेत्रज्ञ इति तद्विदः  ॥1॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान बोले- हे अर्जुन! यह शरीर 'क्षेत्र' (जैसे खेत में बोए हुए बीजों का उनके अनुरूप फल समय पर प्रकट होता है, वैसे ही इसमें बोए हुए कर्मों के संस्कार रूप बीजों का फल समय पर प्रकट होता है, इसलिए इसका नाम 'क्षेत्र' ऐसा कहा है) इस नाम से कहा जाता है और इसको जो जानता है, उसको 'क्षेत्रज्ञ' इस नाम से उनके तत्व को जानने वाले ज्ञानीजन कहते हैं\n" +
                    " ॥1॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }

        else if(position==1)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "क्षेत्रज्ञं चापि मां विद्धि सर्वक्षेत्रेषु भारत।\n" +
                    " क्षेत्रक्षेत्रज्ञयोर्ज्ञानं यत्तज्ज्ञानं मतं मम  ॥2॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! तू सब क्षेत्रों में क्षेत्रज्ञ अर्थात जीवात्मा भी मुझे ही जान (गीता अध्याय 15 श्लोक 7 और उसकी टिप्पणी देखनी चाहिए) और क्षेत्र-क्षेत्रज्ञ को अर्थात विकार सहित प्रकृति और पुरुष का जो तत्व से जानना है (गीता अध्याय 13 श्लोक 23 और उसकी टिप्पणी देखनी चाहिए) वह ज्ञान है- ऐसा मेरा मत है\n" +
                    " ॥2॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==2)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "तत्क्षेत्रं यच्च यादृक्च यद्विकारि यतश्च यत्।\n" +
                    " स च यो यत्प्रभावश्च तत्समासेन मे श्रृणु  ॥3॥\n" +
                    "\n" +
                    "भावार्थ  :-  वह क्षेत्र जो और जैसा है तथा जिन विकारों वाला है और जिस कारण से जो हुआ है तथा वह क्षेत्रज्ञ भी जो और जिस प्रभाववाला है- वह सब संक्षेप में मुझसे सुन\n" +
                    " ॥3॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==3)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "ऋषिभिर्बहुधा गीतं छन्दोभिर्विविधैः पृथक्।\n" +
                    " ब्रह्मसूत्रपदैश्चैव हेतुमद्भिर्विनिश्चितैः  ॥4॥\n" +
                    "\n" +
                    "भावार्थ  :-  यह क्षेत्र और क्षेत्रज्ञ का तत्व ऋषियों द्वारा बहुत प्रकार से कहा गया है और विविध वेदमन्त्रों द्वारा भी विभागपूर्वक कहा गया है तथा भलीभाँति निश्चय किए हुए युक्तियुक्त ब्रह्मसूत्र के पदों द्वारा भी कहा गया है\n" +
                    " ॥4॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==4)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "महाभूतान्यहङ्कारो बुद्धिरव्यक्तमेव च।\n" +
                    " इन्द्रियाणि दशैकं च पञ्च चेन्द्रियगोचराः  ॥5॥\n" +
                    "\n" +
                    "भावार्थ  :-  पाँच महाभूत, अहंकार, बुद्धि और मूल प्रकृति भी तथा दस इन्द्रियाँ, एक मन और पाँच इन्द्रियों के विषय अर्थात शब्द, स्पर्श, रूप, रस और गंध\n" +
                    " ॥5॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==5)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "इच्छा द्वेषः सुखं दुःखं सङ्घातश्चेतना धृतिः।\n" +
                    " एतत्क्षेत्रं समासेन सविकारमुदाहृतम्  ॥6॥\n" +
                    "\n" +
                    "भावार्थ  :-  तथा इच्छा, द्वेष, सुख, दुःख, स्थूल देहका पिण्ड, चेतना (शरीर और अन्तःकरण की एक प्रकार की चेतन-शक्ति।) और धृति (गीता अध्याय 18 श्लोक 34 व 35 तक देखना चाहिए।)-- इस प्रकार विकारों (पाँचवें श्लोक में कहा हुआ तो क्षेत्र का स्वरूप समझना चाहिए और इस श्लोक में कहे हुए इच्छादि क्षेत्र के विकार समझने चाहिए।) के सहित यह क्षेत्र संक्षेप में कहा गया\n" +
                    " ॥6॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==6)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "अमानित्वमदम्भित्वमहिंसा क्षान्तिरार्जवम्।\n" +
                    " आचार्योपासनं शौचं स्थैर्यमात्मविनिग्रहः  ॥7॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्रेष्ठता के अभिमान का अभाव, दम्भाचरण का अभाव, किसी भी प्राणी को किसी प्रकार भी न सताना, क्षमाभाव, मन-वाणी आदि की सरलता, श्रद्धा-भक्ति सहित गुरु की सेवा, बाहर-भीतर की शुद्धि (सत्यतापूर्वक शुद्ध व्यवहार से द्रव्य की और उसके अन्न से आहार की तथा यथायोग्य बर्ताव से आचरणों की और जल-मृत्तिकादि से शरीर की शुद्धि को बाहर की शुद्धि कहते हैं तथा राग, द्वेष और कपट आदि विकारों का नाश होकर अन्तःकरण का स्वच्छ हो जाना भीतर की शुद्धि कही जाती है।) अन्तःकरण की स्थिरता और मन-इन्द्रियों सहित शरीर का निग्रह\n" +
                    " ॥7॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==7)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "इन्द्रियार्थेषु वैराग्यमनहङ्कार एव च।\n" +
                    " जन्ममृत्युजराव्याधिदुःखदोषानुदर्शनम्  ॥8॥\n" +
                    "\n" +
                    "भावार्थ  :-  इस लोक और परलोक के सम्पूर्ण भोगों में आसक्ति का अभाव और अहंकार का भी अभाव, जन्म, मृत्यु, जरा और रोग आदि में दुःख और दोषों का बार-बार विचार करना\n" +
                    " ॥8॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==8)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "असक्तिरनभिष्वङ्ग: पुत्रदारगृहादिषु।\n" +
                    " नित्यं च समचित्तत्वमिष्टानिष्टोपपत्तिषु  ॥9॥\n" +
                    "\n" +
                    "भावार्थ  :-  पुत्र, स्त्री, घर और धन आदि में आसक्ति का अभाव, ममता का न होना तथा प्रिय और अप्रिय की प्राप्ति में सदा ही चित्त का सम रहना\n" +
                    " ॥9॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==9)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "मयि चानन्ययोगेन भक्तिरव्यभिचारिणी।\n" +
                    " विविक्तदेशसेवित्वमरतिर्जनसंसदि  ॥10॥\n" +
                    "\n" +
                    "भावार्थ  :-  मुझ परमेश्वर में अनन्य योग द्वारा अव्यभिचारिणी भक्ति (केवल एक सर्वशक्तिमान परमेश्वर को ही अपना स्वामी मानते हुए स्वार्थ और अभिमान का त्याग करके, श्रद्धा और भाव सहित परमप्रेम से भगवान का निरन्तर चिन्तन करना 'अव्यभिचारिणी' भक्ति है) तथा एकान्त और शुद्ध देश में रहने का स्वभाव और विषयासक्त मनुष्यों के समुदाय में प्रेम का न होना\n" +
                    " \n" +
                    " ॥10॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==10)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "अध्यात्मज्ञाननित्यत्वं तत्वज्ञानार्थदर्शनम्।\n" +
                    " एतज्ज्ञानमिति प्रोक्तमज्ञानं यदतोऽन्यथा  ॥11॥\n" +
                    "\n" +
                    "भावार्थ  :-  अध्यात्म ज्ञान में (जिस ज्ञान द्वारा आत्मवस्तु और अनात्मवस्तु जानी जाए, उस ज्ञान का नाम 'अध्यात्म ज्ञान' है) नित्य स्थिति और तत्वज्ञान के अर्थरूप परमात्मा को ही देखना- यह सब ज्ञान (इस अध्याय के श्लोक 7 से लेकर यहाँ तक जो साधन कहे हैं, वे सब तत्वज्ञान की प्राप्ति में हेतु होने से 'ज्ञान' नाम से कहे गए हैं) है और जो इसके विपरीत है वह अज्ञान (ऊपर कहे हुए ज्ञान के साधनों से विपरीत तो मान, दम्भ, हिंसा आदि हैं, वे अज्ञान की वृद्धि में हेतु होने से 'अज्ञान' नाम से कहे गए हैं) है- ऐसा कहा है\n" +
                    " ॥11॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==11)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "ज्ञेयं यत्तत्वप्रवक्ष्यामि यज्ज्ञात्वामृतमश्नुते।\n" +
                    " अनादिमत्परं ब्रह्म न सत्तन्नासदुच्यते  ॥12॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो जानने योग्य है तथा जिसको जानकर मनुष्य परमानन्द को प्राप्त होता है, उसको भलीभाँति कहूँगा। वह अनादिवाला परमब्रह्म न सत् ही कहा जाता है, न असत् ही\n" +
                    " ॥12॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==12)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "सर्वतः पाणिपादं तत्सर्वतोऽक्षिशिरोमुखम्।\n" +
                    " सर्वतः श्रुतिमल्लोके सर्वमावृत्य तिष्ठति  ॥13॥\n" +
                    "\n" +
                    "भावार्थ  :-  वह सब ओर हाथ-पैर वाला, सब ओर नेत्र, सिर और मुख वाला तथा सब ओर कान वाला है, क्योंकि वह संसार में सबको व्याप्त करके स्थित है। (आकाश जिस प्रकार वायु, अग्नि, जल और पृथ्वी का कारण रूप होने से उनको व्याप्त करके स्थित है, वैसे ही परमात्मा भी सबका कारण रूप होने से सम्पूर्ण चराचर जगत को व्याप्त करके स्थित है) \n" +
                    " ॥13॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==13)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "सर्वेन्द्रियगुणाभासं सर्वेन्द्रियविवर्जितम्।\n" +
                    " असक्तं सर्वभृच्चैव निर्गुणं गुणभोक्तृ च  ॥14॥\n" +
                    "\n" +
                    "भावार्थ  :-  वह सम्पूर्ण इन्द्रियों के विषयों को जानने वाला है, परन्तु वास्तव में सब इन्द्रियों से रहित है तथा आसक्ति रहित होने पर भी सबका धारण-पोषण करने वाला और निर्गुण होने पर भी गुणों को भोगने वाला है\n" +
                    " ॥14॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==14)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "बहिरन्तश्च भूतानामचरं चरमेव च।\n" +
                    " सूक्ष्मत्वात्तदविज्ञयं दूरस्थं चान्तिके च तत्  ॥15॥\n" +
                    "\n" +
                    "भावार्थ  :-  वह चराचर सब भूतों के बाहर-भीतर परिपूर्ण है और चर-अचर भी वही है। और वह सूक्ष्म होने से अविज्ञेय (जैसे सूर्य की किरणों में स्थित हुआ जल सूक्ष्म होने से साधारण मनुष्यों के जानने में नहीं आता है, वैसे ही सर्वव्यापी परमात्मा भी सूक्ष्म होने से साधारण मनुष्यों के जानने में नहीं आता है) है तथा अति समीप में (वह परमात्मा सर्वत्र परिपूर्ण और सबका आत्मा होने से अत्यन्त समीप है) और दूर में (श्रद्धारहित, अज्ञानी पुरुषों के लिए न जानने के कारण बहुत दूर है) भी स्थित वही है\n" +
                    " ॥15॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==15)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "अविभक्तं च भूतेषु विभक्तमिव च स्थितम्।\n" +
                    " भूतभर्तृ च तज्ज्ञेयं ग्रसिष्णु प्रभविष्णु च  ॥16॥\n" +
                    "\n" +
                    "भावार्थ  :-  वह परमात्मा विभागरहित एक रूप से आकाश के सदृश परिपूर्ण होने पर भी चराचर सम्पूर्ण भूतों में विभक्त-सा स्थित प्रतीत होता है (जैसे महाकाश विभागरहित स्थित हुआ भी घड़ों में पृथक-पृथक के सदृश प्रतीत होता है, वैसे ही परमात्मा सब भूतों में एक रूप से स्थित हुआ भी पृथक-पृथक की भाँति प्रतीत होता है) तथा वह जानने योग्य परमात्मा विष्णुरूप से भूतों को धारण-पोषण करने वाला और रुद्ररूप से संहार करने वाला तथा ब्रह्मारूप से सबको उत्पन्न करने वाला है\n" +
                    " ॥16॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==16)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "ज्योतिषामपि तज्ज्योतिस्तमसः परमुच्यते।\n" +
                    " ज्ञानं ज्ञेयं ज्ञानगम्यं हृदि सर्वस्य विष्ठितम्  ॥17॥\n" +
                    "\n" +
                    "भावार्थ  :-  वह परब्रह्म ज्योतियों का भी ज्योति (गीता अध्याय 15 श्लोक 12 में देखना चाहिए) एवं माया से अत्यन्त परे कहा जाता है। वह परमात्मा बोधस्वरूप, जानने के योग्य एवं तत्वज्ञान से प्राप्त करने योग्य है और सबके हृदय में विशेष रूप से स्थित है\n" +
                    " ॥17॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==17)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "इति क्षेत्रं तथा ज्ञानं ज्ञेयं चोक्तं समासतः।\n" +
                    " मद्भक्त एतद्विज्ञाय मद्भावायोपपद्यते  ॥18॥\n" +
                    "\n" +
                    "भावार्थ  :-  इस प्रकार क्षेत्र (श्लोक 5-6 में विकार सहित क्षेत्र का स्वरूप कहा है) तथा ज्ञान (श्लोक 7 से 11 तक ज्ञान अर्थात ज्ञान का साधन कहा है।) और जानने योग्य परमात्मा का स्वरूप (श्लोक 12 से 17 तक ज्ञेय का स्वरूप कहा है) संक्षेप में कहा गया। मेरा भक्त इसको तत्व से जानकर मेरे स्वरूप को प्राप्त होता है\n" +
                    " ॥18॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==18)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "(ज्ञानसहित प्रकृति-पुरुष का विषय) \n" +
                    " प्रकृतिं पुरुषं चैव विद्ध्यनादी उभावपि।\n" +
                    " विकारांश्च गुणांश्चैव विद्धि प्रकृतिसम्भवान्  ॥19॥\n" +
                    "\n" +
                    "भावार्थ  :-  प्रकृति और पुरुष- इन दोनों को ही तू अनादि जान और राग-द्वेषादि विकारों को तथा त्रिगुणात्मक सम्पूर्ण पदार्थों को भी प्रकृति से ही उत्पन्न जान\n" +
                    " ॥19॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==19)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "कार्यकरणकर्तृत्वे हेतुः प्रकृतिरुच्यते।\n" +
                    " पुरुषः सुखदुःखानां भोक्तृत्वे हेतुरुच्यते  ॥20॥\n" +
                    "\n" +
                    "भावार्थ  :-  कार्य (आकाश, वायु, अग्नि, जल और पृथ्वी तथा शब्द, स्पर्श, रूप, रस, गंध -इनका नाम 'कार्य' है) और करण (बुद्धि, अहंकार और मन तथा श्रोत्र, त्वचा, रसना, नेत्र और घ्राण एवं वाक्, हस्त, पाद, उपस्थ और गुदा- इन 13 का नाम 'करण' है) को उत्पन्न करने में हेतु प्रकृति कही जाती है और जीवात्मा सुख-दुःखों के भोक्तपन में अर्थात भोगने में हेतु कहा जाता है\n" +
                    " ॥20॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==20)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "पुरुषः प्रकृतिस्थो हि भुङ्क्ते प्रकृतिजान्गुणान्।\n" +
                    " कारणं गुणसंगोऽस्य सदसद्योनिजन्मसु  ॥21॥\n" +
                    "\n" +
                    "भावार्थ  :-  प्रकृति में (प्रकृति शब्द का अर्थ गीता अध्याय 7 श्लोक 14 में कही हुई भगवान की त्रिगुणमयी माया समझना चाहिए) स्थित ही पुरुष प्रकृति से उत्पन्न त्रिगुणात्मक पदार्थों को भोगता है और इन गुणों का संग ही इस जीवात्मा के अच्छी-बुरी योनियों में जन्म लेने का कारण है। (सत्त्वगुण के संग से देवयोनि में एवं रजोगुण के संग से मनुष्य योनि में और तमो गुण के संग से पशु आदि नीच योनियों में जन्म होता है।)\n" +
                    " ॥21॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==21)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "उपद्रष्टानुमन्ता च भर्ता भोक्ता महेश्वरः।\n" +
                    " परमात्मेति चाप्युक्तो देहेऽस्मिन्पुरुषः परः  ॥22॥\n" +
                    "\n" +
                    "भावार्थ  :-  इस देह में स्थित यह आत्मा वास्तव में परमात्मा ही है। वह साक्षी होने से उपद्रष्टा और यथार्थ सम्मति देने वाला होने से अनुमन्ता, सबका धारण-पोषण करने वाला होने से भर्ता, जीवरूप से भोक्ता, ब्रह्मा आदि का भी स्वामी होने से महेश्वर और शुद्ध सच्चिदानन्दघन होने से परमात्मा- ऐसा कहा गया है\n" +
                    " ॥22॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==22)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "य एवं वेत्ति पुरुषं प्रकृतिं च गुणैः सह।\n" +
                    " सर्वथा वर्तमानोऽपि न स भूयोऽभिजायते  ॥23॥\n" +
                    "\n" +
                    "भावार्थ  :-  इस प्रकार पुरुष को और गुणों के सहित प्रकृति को जो मनुष्य तत्व से जानता है (दृश्यमात्र सम्पूर्ण जगत माया का कार्य होने से क्षणभंगुर, नाशवान, जड़ और अनित्य है तथा जीवात्मा नित्य, चेतन, निर्विकार और अविनाशी एवं शुद्ध, बोधस्वरूप, सच्चिदानन्दघन परमात्मा का ही सनातन अंश है, इस प्रकार समझकर सम्पूर्ण मायिक पदार्थों के संग का सर्वथा त्याग करके परम पुरुष परमात्मा में ही एकीभाव से नित्य स्थित रहने का नाम उनको 'तत्व से जानना' है) वह सब प्रकार से कर्तव्य कर्म करता हुआ भी फिर नहीं जन्मता\n" +
                    " ॥23॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==23)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "ध्यानेनात्मनि पश्यन्ति केचिदात्मानमात्मना।\n" +
                    " अन्ये साङ्ख्येन योगेन कर्मयोगेन चापरे  ॥24॥\n" +
                    "\n" +
                    "भावार्थ  :-  उस परमात्मा को कितने ही मनुष्य तो शुद्ध हुई सूक्ष्म बुद्धि से ध्यान (जिसका वर्णन गीता अध्याय 6 में श्लोक 11 से 32 तक विस्तारपूर्वक किया है) द्वारा हृदय में देखते हैं, अन्य कितने ही ज्ञानयोग (जिसका वर्णन गीता अध्याय 2 में श्लोक 11 से 30 तक विस्तारपूर्वक किया है) द्वारा और दूसरे कितने ही कर्मयोग (जिसका वर्णन गीता अध्याय 2 में श्लोक 40 से अध्याय समाप्तिपर्यन्त विस्तारपूर्वक किया है) द्वारा देखते हैं अर्थात प्राप्त करते हैं\n" +
                    " ॥24॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==24)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "अन्ये त्वेवमजानन्तः श्रुत्वान्येभ्य उपासते।\n" +
                    " तेऽपि चातितरन्त्येव मृत्युं श्रुतिपरायणाः  ॥25॥\n" +
                    "\n" +
                    "भावार्थ  :-  परन्तु इनसे दूसरे अर्थात जो मंदबुद्धिवाले पुरुष हैं, वे इस प्रकार न जानते हुए दूसरों से अर्थात तत्व के जानने वाले पुरुषों से सुनकर ही तदनुसार उपासना करते हैं और वे श्रवणपरायण पुरुष भी मृत्युरूप संसार-सागर को निःसंदेह तर जाते हैं\n" +
                    " ॥25॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==25)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "यावत्सञ्जायते किञ्चित्सत्त्वं स्थावरजङ्गमम्।\n" +
                    " क्षेत्रक्षेत्रज्ञसंयोगात्तद्विद्धि भरतर्षभ  ॥26॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! यावन्मात्र जितने भी स्थावर-जंगम प्राणी उत्पन्न होते हैं, उन सबको तू क्षेत्र और क्षेत्रज्ञ के संयोग से ही उत्पन्न जान\n" +
                    " ॥26॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==26)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "समं सर्वेषु भूतेषु तिष्ठन्तं परमेश्वरम्।\n" +
                    " विनश्यत्स्वविनश्यन्तं यः पश्यति स पश्यति  ॥27॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो पुरुष नष्ट होते हुए सब चराचर भूतों में परमेश्वर को नाशरहित और समभाव से स्थित देखता है वही यथार्थ देखता है\n" +
                    " ॥27॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==27)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "समं पश्यन्हि सर्वत्र समवस्थितमीश्वरम्।\n" +
                    " न हिनस्त्यात्मनात्मानं ततो याति परां गतिम्  ॥28॥\n" +
                    "\n" +
                    "भावार्थ  :-  क्योंकि जो पुरुष सबमें समभाव से स्थित परमेश्वर को समान देखता हुआ अपने द्वारा अपने को नष्ट नहीं करता, इससे वह परम गति को प्राप्त होता है\n" +
                    " ॥28॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==28)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "प्रकृत्यैव च कर्माणि क्रियमाणानि सर्वशः।\n" +
                    " यः पश्यति तथात्मानमकर्तारं स पश्यति  ॥29॥\n" +
                    "\n" +
                    "भावार्थ  :-  और जो पुरुष सम्पूर्ण कर्मों को सब प्रकार से प्रकृति द्वारा ही किए जाते हुए देखता है और आत्मा को अकर्ता देखता है, वही यथार्थ देखता है\n" +
                    " ॥29॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==29)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "यदा भूतपृथग्भावमेकस्थमनुपश्यति।\n" +
                    " तत एव च विस्तारं ब्रह्म सम्पद्यते तदा  ॥30॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिस क्षण यह पुरुष भूतों के पृथक-पृथक भाव को एक परमात्मा में ही स्थित तथा उस परमात्मा से ही सम्पूर्ण भूतों का विस्तार देखता है, उसी क्षण वह सच्चिदानन्दघन ब्रह्म को प्राप्त हो जाता है\n" +
                    " ॥30॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==30)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "अनादित्वान्निर्गुणत्वात्परमात्मायमव्ययः।\n" +
                    " शरीरस्थोऽपि कौन्तेय न करोति न लिप्यते  ॥31॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! अनादि होने से और निर्गुण होने से यह अविनाशी परमात्मा शरीर में स्थित होने पर भी वास्तव में न तो कुछ करता है और न लिप्त ही होता है\n" +
                    " ॥31॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==31)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "यथा सर्वगतं सौक्ष्म्यादाकाशं नोपलिप्यते ।\n" +
                    " सर्वत्रावस्थितो देहे तथात्मा नोपलिप्यते  ॥32॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिस प्रकार सर्वत्र व्याप्त आकाश सूक्ष्म होने के कारण लिप्त नहीं होता, वैसे ही देह में सर्वत्र स्थित आत्मा निर्गुण होने के कारण देह के गुणों से लिप्त नहीं होता\n" +
                    " ॥32॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==32)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "यथा प्रकाशयत्येकः कृत्स्नं लोकमिमं रविः ।\n" +
                    " क्षेत्रं क्षेत्री तथा कृत्स्नं प्रकाशयति भारत  ॥33॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! जिस प्रकार एक ही सूर्य इस सम्पूर्ण ब्रह्माण्ड को प्रकाशित करता है, उसी प्रकार एक ही आत्मा सम्पूर्ण क्षेत्र को प्रकाशित करता है\n" +
                    " ॥33॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }
        else if(position==33)
        {
            ThirteenFragment thirteenFragment=new ThirteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message13", "क्षेत्रक्षेत्रज्ञयोरेवमन्तरं ज्ञानचक्षुषा ।\n" +
                    " भूतप्रकृतिमोक्षं च ये विदुर्यान्ति ते परम्  ॥34॥\n" +
                    "\n" +
                    "भावार्थ  :-  इस प्रकार क्षेत्र और क्षेत्रज्ञ के भेद को (क्षेत्र को जड़, विकारी, क्षणिक और नाशवान तथा क्षेत्रज्ञ को नित्य, चेतन, अविकारी और अविनाशी जानना ही 'उनके भेद को जानना' है) तथा कार्य सहित प्रकृति से मुक्त होने को जो पुरुष ज्ञान नेत्रों द्वारा तत्व से जानते हैं, वे महात्माजन परम ब्रह्म परमात्मा को प्राप्त होते हैं\n" +
                    " ॥34॥ \n" +
                    " \n" +
                    " ॐ तत्सदिति श्रीमद्भगवद्गीतासूपनिषत्सु ब्रह्मविद्यायांयोगशास्त्रे श्रीकृष्णार्जुनसंवादे क्षेत्रक्षेत्रज्ञविभागयोगो नाम त्रयोदशोऽध्यायः\n" +
                    " ॥13॥\n");
            thirteenFragment.setArguments(bundle);
            return  thirteenFragment;
        }


        return null;
    }

    @Override
    public int getCount() {
        return 34;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        return "श्लोक "+position;
    }
}
