package com.parmu.bhagwatgeeta.pageradapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.parmu.bhagwatgeeta.fragments.Fragment8;

public class ViewPagerAdapter8 extends FragmentStatePagerAdapter {
    public ViewPagerAdapter8(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter8(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","( ब्रह्म, अध्यात्म और कर्मादि के विषय में अर्जुन के सात प्रश्न और उनका उत्तर ) \n" +
                    " अर्जुन उवाच  :-\n" +
                    " किं तद्ब्रह्म किमध्यात्मं किं पुरुषोत्तम।\n" +
                    " अधिभूतं च किं प्रोक्तमधिदैवं किमुच्यते  ॥1॥\n" +
                    "\n" +
                    "भावार्थ  :-  अर्जुन ने कहा- हे पुरुषोत्तम! वह ब्रह्म क्या है? अध्यात्म क्या है? कर्म क्या है? अधिभूत नाम से क्या कहा गया है और अधिदैव किसको कहते हैं\n" +
                    " ॥1॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==1)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","अधियज्ञः कथं कोऽत्र देहेऽस्मिन्मधुसूदन।\n" +
                    " प्रयाणकाले च कथं ज्ञेयोऽसि नियतात्मभिः  ॥2॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे मधुसूदन! यहाँ अधियज्ञ कौन है? और वह इस शरीर में कैसे है? तथा युक्त चित्त वाले पुरुषों द्वारा अंत समय में आप किस प्रकार जानने में आते हैं\n" +
                    " ॥2॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==2)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","श्रीभगवानुवाच  :-\n" +
                    " अक्षरं ब्रह्म परमं स्वभावोऽध्यात्ममुच्यते।\n" +
                    " भूतभावोद्भवकरो विसर्गः कर्मसंज्ञितः  ॥3॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान ने कहा- परम अक्षर 'ब्रह्म' है, अपना स्वरूप अर्थात जीवात्मा 'अध्यात्म' नाम से कहा जाता है तथा भूतों के भाव को उत्पन्न करने वाला जो त्याग है, वह 'कर्म' नाम से कहा गया है\n" +
                    " ॥3॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==3)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","अधिभूतं क्षरो भावः पुरुषश्चाधिदैवतम्।\n" +
                    " अधियज्ञोऽहमेवात्र देहे देहभृतां वर  ॥4॥\n" +
                    "\n" +
                    "भावार्थ  :-  उत्पत्ति-विनाश धर्म वाले सब पदार्थ अधिभूत हैं, हिरण्यमय पुरुष (जिसको शास्त्रों में सूत्रात्मा, हिरण्यगर्भ, प्रजापति, ब्रह्मा इत्यादि नामों से कहा गया है) अधिदैव है और हे देहधारियों में श्रेष्ठ अर्जुन! इस शरीर में मैं वासुदेव ही अन्तर्यामी रूप से अधियज्ञ हूँ\n" +
                    " ॥4॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==4)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","अंतकाले च मामेव स्मरन्मुक्त्वा कलेवरम्।\n" +
                    " यः प्रयाति स मद्भावं याति नास्त्यत्र संशयः  ॥5॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो पुरुष अंतकाल में भी मुझको ही स्मरण करता हुआ शरीर को त्याग कर जाता है, वह मेरे साक्षात स्वरूप को प्राप्त होता है- इसमें कुछ भी संशय नहीं है\n" +
                    " ॥5॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==5)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","यं यं वापि स्मरन्भावं त्यजत्यन्ते कलेवरम्।\n" +
                    " तं तमेवैति कौन्तेय सदा तद्भावभावितः  ॥6॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे कुन्ती पुत्र अर्जुन! यह मनुष्य अंतकाल में जिस-जिस भी भाव को स्मरण करता हुआ शरीर त्याग करता है, उस-उसको ही प्राप्त होता है क्योंकि वह सदा उसी भाव से भावित रहा है\n" +
                    " ॥6॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==6)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","तस्मात्सर्वेषु कालेषु मामनुस्मर युद्ध च।\n" +
                    " मय्यर्पितमनोबुद्धिर्मामेवैष्यस्यसंशयम्  ॥7॥\n" +
                    "\n" +
                    "भावार्थ  :-  इसलिए हे अर्जुन! तू सब समय में निरंतर मेरा स्मरण कर और युद्ध भी कर। इस प्रकार मुझमें अर्पण किए हुए मन-बुद्धि से युक्त होकर तू निःसंदेह मुझको ही प्राप्त होगा\n" +
                    " ॥7॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==7)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","( भक्ति योग का विषय ) \n" +
                    " अभ्यासयोगयुक्तेन चेतसा नान्यगामिना।\n" +
                    " परमं पुरुषं दिव्यं याति पार्थानुचिन्तयन्  ॥8॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे पार्थ! यह नियम है कि परमेश्वर के ध्यान के अभ्यास रूप योग से युक्त, दूसरी ओर न जाने वाले चित्त से निरंतर चिंतन करता हुआ मनुष्य परम प्रकाश रूप दिव्य पुरुष को अर्थात परमेश्वर को ही प्राप्त होता है\n" +
                    " ॥8॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==8)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","कविं पुराणमनुशासितार-मणोरणीयांसमनुस्मरेद्यः।\n" +
                    " सर्वस्य धातारमचिन्त्यरूप-मादित्यवर्णं तमसः परस्तात्  ॥9॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो पुरुष सर्वज्ञ, अनादि, सबके नियंता (अंतर्यामी रूप से सब प्राणियों के शुभ और अशुभ कर्म के अनुसार शासन करने वाला) सूक्ष्म से भी अति सूक्ष्म, सबके धारण-पोषण करने वाले अचिन्त्य-स्वरूप, सूर्य के सदृश नित्य चेतन प्रकाश रूप और अविद्या से अति परे, शुद्ध सच्चिदानन्दघन परमेश्वर का स्मरण करता है\n" +
                    " ॥9॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==9)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","प्रयाण काले मनसाचलेन भक्त्या युक्तो योगबलेन चैव।\n" +
                    " भ्रुवोर्मध्ये प्राणमावेश्य सम्यक्- स तं परं पुरुषमुपैति दिव्यम्  ॥10॥\n" +
                    "\n" +
                    "भावार्थ  :-  वह भक्ति युक्त पुरुष अन्तकाल में भी योगबल से भृकुटी के मध्य में प्राण को अच्छी प्रकार स्थापित करके, फिर निश्चल मन से स्मरण करता हुआ उस दिव्य रूप परम पुरुष परमात्मा को ही प्राप्त होता है\n" +
                    " ॥10॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==10)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","यदक्षरं वेदविदो वदन्ति विशन्ति यद्यतयो वीतरागाः।\n" +
                    " यदिच्छन्तो ब्रह्मचर्यं चरन्ति तत्ते पदं संग्रहेण प्रवक्ष्ये  ॥11॥\n" +
                    "\n" +
                    "भावार्थ  :-  वेद के जानने वाले विद्वान जिस सच्चिदानन्दघनरूप परम पद को अविनाश कहते हैं, आसक्ति रहित यत्नशील संन्यासी महात्माजन, जिसमें प्रवेश करते हैं और जिस परम पद को चाहने वाले ब्रह्मचारी लोग ब्रह्मचर्य का आचरण करते हैं, उस परम पद को मैं तेरे लिए संक्षेप में कहूँगा\n" +
                    " ॥11॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==11)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","सर्वद्वाराणि संयम्य मनो हृदि निरुध्य च।\n" +
                    " मूर्ध्न्याधायात्मनः प्राणमास्थितो योगधारणाम्  ॥12॥\n" +
                    " ओमित्येकाक्षरं ब्रह्म व्याहरन्मामनुस्मरन्।\n" +
                    " यः प्रयाति त्यजन्देहं स याति परमां गतिम्  ॥13॥\n" +
                    "\n" +
                    "भावार्थ  :-  सब इंद्रियों के द्वारों को रोककर तथा मन को हृद्देश में स्थिर करके, फिर उस जीते हुए मन द्वारा प्राण को मस्तक में स्थापित करके, परमात्म संबंधी योगधारणा में स्थित होकर जो पुरुष 'ॐ' इस एक अक्षर रूप ब्रह्म को उच्चारण करता हुआ और उसके अर्थस्वरूप मुझ निर्गुण ब्रह्म का चिंतन करता हुआ शरीर को त्यागकर जाता है, वह पुरुष परम गति को प्राप्त होता है\n" +
                    " ॥12-13॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==12)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","अनन्यचेताः सततं यो मां स्मरति नित्यशः।\n" +
                    " तस्याहं सुलभः पार्थ नित्ययुक्तस्य योगिनीः  ॥14॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! जो पुरुष मुझमें अनन्य-चित्त होकर सदा ही निरंतर मुझ पुरुषोत्तम को स्मरण करता है, उस नित्य-निरंतर मुझमें युक्त हुए योगी के लिए मैं सुलभ हूँ, अर्थात उसे सहज ही प्राप्त हो जाता हूँ\n" +
                    " ॥14॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==13)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","मामुपेत्य पुनर्जन्म दुःखालयमशाश्वतम्।\n" +
                    " नाप्नुवन्ति महात्मानः संसिद्धिं परमां गताः  ॥15॥\n" +
                    "\n" +
                    "भावार्थ  :-  परम सिद्धि को प्राप्त महात्माजन मुझको प्राप्त होकर दुःखों के घर एवं क्षणभंगुर पुनर्जन्म को नहीं प्राप्त होते\n" +
                    " ॥15॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==14)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","आब्रह्मभुवनाल्लोकाः पुनरावर्तिनोऽर्जुन।\n" +
                    " मामुपेत्य तु कौन्तेय पुनर्जन्म न विद्यते  ॥16॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! ब्रह्मलोकपर्यंत सब लोक पुनरावर्ती हैं, परन्तु हे कुन्तीपुत्र! मुझको प्राप्त होकर पुनर्जन्म नहीं होता, क्योंकि मैं कालातीत हूँ और ये सब ब्रह्मादि के लोक काल द्वारा सीमित होने से अनित्य हैं\n" +
                    " ॥16॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==15)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","सहस्रयुगपर्यन्तमहर्यद्ब्रह्मणो विदुः।\n" +
                    " रात्रिं युगसहस्रान्तां तेऽहोरात्रविदो जनाः ॥17॥\n" +
                    "\n" +
                    "भावार्थ  :-  ब्रह्मा का जो एक दिन है, उसको एक हजार चतुर्युगी तक की अवधि वाला और रात्रि को भी एक हजार चतुर्युगी तक की अवधि वाला जो पुरुष तत्व से जानते हैं, वे योगीजन काल के तत्व को जानने वाले हैं\n" +
                    " ॥17॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==16)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","अव्यक्ताद्व्यक्तयः सर्वाः प्रभवन्त्यहरागमे।\n" +
                    " रात्र्यागमे प्रलीयन्ते तत्रैवाव्यक्तसंज्ञके  ॥18॥\n" +
                    "\n" +
                    "भावार्थ  :-  संपूर्ण चराचर भूतगण ब्रह्मा के दिन के प्रवेश काल में अव्यक्त से अर्थात ब्रह्मा के सूक्ष्म शरीर से उत्पन्न होते हैं और ब्रह्मा की रात्रि के प्रवेशकाल में उस अव्यक्त नामक ब्रह्मा के सूक्ष्म शरीर में ही लीन हो जाते हैं\n" +
                    " ॥18॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==17)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","भूतग्रामः स एवायं भूत्वा भूत्वा प्रलीयते।\n" +
                    " रात्र्यागमेऽवशः पार्थ प्रभवत्यहरागमे  ॥19॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे पार्थ! वही यह भूतसमुदाय उत्पन्न हो-होकर प्रकृति वश में हुआ रात्रि के प्रवेश काल में लीन होता है और दिन के प्रवेश काल में फिर उत्पन्न होता है\n" +
                    " ॥19॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==18)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","परस्तस्मात्तु भावोऽन्योऽव्यक्तोऽव्यक्तात्सनातनः।\n" +
                    " यः स सर्वेषु भूतेषु नश्यत्सु न विनश्यति  ॥20॥\n" +
                    "\n" +
                    "भावार्थ  :-  उस अव्यक्त से भी अति परे दूसरा अर्थात विलक्षण जो सनातन अव्यक्त भाव है, वह परम दिव्य पुरुष सब भूतों के नष्ट होने पर भी नष्ट नहीं होता\n" +
                    " ॥20॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==19)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","अव्यक्तोऽक्षर इत्युक्तस्तमाहुः परमां गतिम्।\n" +
                    " यं प्राप्य न निवर्तन्ते तद्धाम परमं मम  ॥21॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो अव्यक्त 'अक्षर' इस नाम से कहा गया है, उसी अक्षर नामक अव्यक्त भाव को परमगति कहते हैं तथा जिस सनातन अव्यक्त भाव को प्राप्त होकर मनुष्य वापस नहीं आते, वह मेरा परम धाम है\n" +
                    " ॥21॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==20)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","पुरुषः स परः पार्थ भक्त्या लभ्यस्त्वनन्यया।\n" +
                    " यस्यान्तः स्थानि भूतानि येन सर्वमिदं ततम्  ॥22॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे पार्थ! जिस परमात्मा के अंतर्गत सर्वभूत है और जिस सच्चिदानन्दघन परमात्मा से यह समस्त जगत परिपूर्ण है (गीता अध्याय 9 श्लोक 4 में देखना चाहिए), वह सनातन अव्यक्त परम पुरुष तो अनन्य (गीता अध्याय 11 श्लोक 55 में इसका विस्तार देखना चाहिए) भक्ति से ही प्राप्त होने योग्य है\n" +
                    " ॥22॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==21)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","( शुक्ल और कृष्ण मार्ग का विषय ) \n" +
                    " यत्र काले त्वनावत्तिमावृत्तिं चैव योगिनः।\n" +
                    " प्रयाता यान्ति तं कालं वक्ष्यामि भरतर्षभ  ॥23॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! जिस काल में (यहाँ काल शब्द से मार्ग समझना चाहिए, क्योंकि आगे के श्लोकों में भगवान ने इसका नाम 'सृति', 'गति' ऐसा कहा है।) शरीर त्याग कर गए हुए योगीजन तो वापस न लौटने वाली गति को और जिस काल में गए हुए वापस लौटने वाली गति को ही प्राप्त होते हैं, उस काल को अर्थात दोनों मार्गों को कहूँगा\n" +
                    " ॥23॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==22)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","अग्निर्ज्योतिरहः शुक्लः षण्मासा उत्तरायणम्।\n" +
                    " तत्र प्रयाता गच्छन्ति ब्रह्म ब्रह्मविदो जनाः  ॥24॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिस मार्ग में ज्योतिर्मय अग्नि-अभिमानी देवता हैं, दिन का अभिमानी देवता है, शुक्ल पक्ष का अभिमानी देवता है और उत्तरायण के छः महीनों का अभिमानी देवता है, उस मार्ग में मरकर गए हुए ब्रह्मवेत्ता योगीजन उपयुक्त देवताओं द्वारा क्रम से ले जाए जाकर ब्रह्म को प्राप्त होते हैं।\n" +
                    " ॥24॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==23)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","धूमो रात्रिस्तथा कृष्ण षण्मासा दक्षिणायनम्।\n" +
                    " तत्र चान्द्रमसं ज्योतिर्योगी प्राप्य निवर्तते  ॥25॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिस मार्ग में धूमाभिमानी देवता है, रात्रि अभिमानी देवता है तथा कृष्ण पक्ष का अभिमानी देवता है और दक्षिणायन के छः महीनों का अभिमानी देवता है, उस मार्ग में मरकर गया हुआ सकाम कर्म करने वाला योगी उपयुक्त देवताओं द्वारा क्रम से ले गया हुआ चंद्रमा की ज्योत को प्राप्त होकर स्वर्ग में अपने शुभ कर्मों का फल भोगकर वापस आता है\n" +
                    " ॥25॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==24)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","शुक्ल कृष्णे गती ह्येते जगतः शाश्वते मते।\n" +
                    " एकया यात्यनावृत्ति मन्ययावर्तते पुनः  ॥26॥\n" +
                    "\n" +
                    "भावार्थ  :-  क्योंकि जगत के ये दो प्रकार के- शुक्ल और कृष्ण अर्थात देवयान और पितृयान मार्ग सनातन माने गए हैं। इनमें एक द्वारा गया हुआ (अर्थात इसी अध्याय के श्लोक 24 के अनुसार अर्चिमार्ग से गया हुआ योगी।)-- जिससे वापस नहीं लौटना पड़ता, उस परमगति को प्राप्त होता है और दूसरे के द्वारा गया हुआ ( अर्थात इसी अध्याय के श्लोक 25 के अनुसार धूममार्ग से गया हुआ सकाम कर्मयोगी।) फिर वापस आता है अर्थात् जन्म-मृत्यु को प्राप्त होता है\n" +
                    " ॥26॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==25)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","नैते सृती पार्थ जानन्योगी मुह्यति कश्चन।\n" +
                    " तस्मात्सर्वेषु कालेषु योगयुक्तो भवार्जुन  ॥27॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे पार्थ! इस प्रकार इन दोनों मार्गों को तत्त्व से जानकर कोई भी योगी मोहित नहीं होता। इस कारण हे अर्जुन! तू सब काल में समबुद्धि रूप से योग से युक्त हो अर्थात निरंतर मेरी प्राप्ति के लिए साधन करने वाला हो\n" +
                    " ॥27॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==26)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            bundle.putString("message8","वेदेषु यज्ञेषु तपःसु चैव दानेषु यत्पुण्यफलं प्रदिष्टम्।\n" +
                    " अत्येत तत्सर्वमिदं विदित्वा योगी परं स्थानमुपैति चाद्यम् ॥28॥\n" +
                    "\n" +
                    "भावार्थ  :-  योगी पुरुष इस रहस्य को तत्त्व से जानकर वेदों के पढ़ने में तथा यज्ञ, तप और दानादि के करने में जो पुण्यफल कहा है, उन सबको निःसंदेह उल्लंघन कर जाता है और सनातन परम पद को प्राप्त होता है\n" +
                    " ॥28॥ \n" +
                    " ॐ तत्सदिति श्री मद्भगवद्गीतासूपनिषत्सु ब्रह्मविद्यायां योगशास्त्रे श्री कृष्णार्जुनसंवादे अक्षर ब्रह्मयोगो नामाष्टमोऽध्यायः\n" +
                    " ॥8॥\n");
            fragment8.setArguments(bundle);
            return fragment8;
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
        if(position<=11)
        {
            return "श्लोक "+position;
        }
        else if(position==12)
        {
            return  "श्लोक 12,13";
        }
        else if(position<=27&&position>=13)
        {
            position=position+1;
            return  "श्लोक "+position;
        }
        return null;
    }
}