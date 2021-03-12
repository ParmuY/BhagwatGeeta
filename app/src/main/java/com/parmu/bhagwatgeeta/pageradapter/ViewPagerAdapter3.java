package com.parmu.bhagwatgeeta.pageradapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.parmu.bhagwatgeeta.fragments.Fragment3;

public class ViewPagerAdapter3 extends FragmentStatePagerAdapter {
    public ViewPagerAdapter3(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter3(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position==0)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "अर्जुन उवाच  :-\n" +
                    "ज्यायसी चेत्कर्मणस्ते मता बुद्धिर्जनार्दन।\n" +
                    " तत्किं कर्मणि घोरे मां नियोजयसि केशव ॥1॥\n" +
                    "\n" +
                    "भावार्थ  :-  अर्जुन बोले- हे जनार्दन! यदि आपको कर्म की अपेक्षा ज्ञान श्रेष्ठ मान्य है तो फिर हे केशव! मुझे भयंकर कर्म में क्यों लगाते हैं?\n" +
                    " ॥1॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==1)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "व्यामिश्रेणेव वाक्येन बुद्धिं मोहयसीव मे।\n" +
                    " तदेकं वद निश्चित्य येन श्रेयोऽहमाप्नुयाम्॥2॥\n" +
                    "\n" +
                    "भावार्थ  :-  आप मिले हुए-से वचनों से मेरी बुद्धि को मानो मोहित कर रहे हैं। इसलिए उस एक बात को निश्चित करके कहिए जिससे मैं कल्याण को प्राप्त हो जाऊँ\n" +
                    " ॥2॥॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==2)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "श्रीभगवानुवाच :-\n" +
                    "लोकेऽस्मिन्द्विविधा निष्ठा पुरा प्रोक्ता मयानघ।\n" +
                    " ज्ञानयोगेन साङ्ख्यानां कर्मयोगेन योगिनाम् ॥3॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्रीभगवान बोले- हे निष्पाप! इस लोक में दो प्रकार की निष्ठा (साधन की परिपक्व अवस्था अर्थात पराकाष्ठा का नाम 'निष्ठा' है।) मेरे द्वारा पहले कही गई है। उनमें से सांख्य योगियों की निष्ठा तो ज्ञान योग से (माया से उत्पन्न हुए सम्पूर्ण गुण ही गुणों में बरतते हैं, ऐसे समझकर तथा मन, इन्द्रिय और शरीर द्वारा होने वाली सम्पूर्ण क्रियाओं में कर्तापन के अभिमान से रहित होकर सर्वव्यापी सच्चिदानंदघन परमात्मा में एकीभाव से स्थित रहने का नाम 'ज्ञान योग' है, इसी को 'संन्यास', 'सांख्ययोग' आदि नामों से कहा गया है।) और योगियों की निष्ठा कर्मयोग से (फल और आसक्ति को त्यागकर भगवदाज्ञानुसार केवल भगवदर्थ समत्व बुद्धि से कर्म करने का नाम 'निष्काम कर्मयोग' है, इसी को 'समत्वयोग', 'बुद्धियोग', 'कर्मयोग', 'तदर्थकर्म', 'मदर्थकर्म', 'मत्कर्म' आदि नामों से कहा गया है\n" +
                    " ॥3॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==3)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "न कर्मणामनारंभान्नैष्कर्म्यं पुरुषोऽश्नुते।\n" +
                    " न च सन्न्यसनादेव सिद्धिं समधिगच्छति  ॥4॥\n" +
                    "\n" +
                    "भावार्थ  :-  मनुष्य न तो कर्मों का आरंभ किए बिना निष्कर्मता (जिस अवस्था को प्राप्त हुए पुरुष के कर्म अकर्म हो जाते हैं अर्थात फल उत्पन्न नहीं कर सकते, उस अवस्था का नाम 'निष्कर्मता' है।) को यानी योगनिष्ठा को प्राप्त होता है और न कर्मों के केवल त्यागमात्र से सिद्धि यानी सांख्यनिष्ठा को ही प्राप्त होता है\n" +
                    " ॥4॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==4)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "न हि कश्चित्क्षणमपि जातु तिष्ठत्यकर्मकृत्।\n" +
                    " कार्यते ह्यवशः कर्म सर्वः प्रकृतिजैर्गुणैः  ॥5॥\n" +
                    "\n" +
                    "भावार्थ  :-  निःसंदेह कोई भी मनुष्य किसी भी काल में क्षणमात्र भी बिना कर्म किए नहीं रहता क्योंकि सारा मनुष्य समुदाय प्रकृति जनित गुणों द्वारा परवश हुआ कर्म करने के लिए बाध्य किया जाता है\n" +
                    " ॥5॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==5)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "कर्मेन्द्रियाणि संयम्य य आस्ते मनसा स्मरन्।\n" +
                    " इन्द्रियार्थान्विमूढात्मा मिथ्याचारः स उच्यते ॥6॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो मूढ़ बुद्धि मनुष्य समस्त इन्द्रियों को हठपूर्वक ऊपर से रोककर मन से उन इन्द्रियों के विषयों का चिन्तन करता रहता है, वह मिथ्याचारी अर्थात दम्भी कहा जाता है\n" +
                    " ॥6॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==6)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "यस्त्विन्द्रियाणि मनसा नियम्यारभतेऽर्जुन।\n" +
                    " कर्मेन्द्रियैः कर्मयोगमसक्तः स विशिष्यते  ॥7॥\n" +
                    "\n" +
                    "भावार्थ  :-  किन्तु हे अर्जुन! जो पुरुष मन से इन्द्रियों को वश में करके अनासक्त हुआ समस्त इन्द्रियों द्वारा कर्मयोग का आचरण करता है, वही श्रेष्ठ है\n" +
                    " ॥7॥॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==7)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "नियतं कुरु कर्म त्वं कर्म ज्यायो ह्यकर्मणः।\n" +
                    " शरीरयात्रापि च ते न प्रसिद्धयेदकर्मणः  ॥8॥\n" +
                    "\n" +
                    "भावार्थ  :-  तू शास्त्रविहित कर्तव्यकर्म कर क्योंकि कर्म न करने की अपेक्षा कर्म करना श्रेष्ठ है तथा कर्म न करने से तेरा शरीर-निर्वाह भी नहीं सिद्ध होगा\n" +
                    " ॥8॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==8)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "यज्ञार्थात्कर्मणोऽन्यत्र लोकोऽयं कर्मबंधनः।\n" +
                    " तदर्थं कर्म कौन्तेय मुक्तसंगः समाचर  ॥9॥\n" +
                    "\n" +
                    "भावार्थ  :-  यज्ञ के निमित्त किए जाने वाले कर्मों से अतिरिक्त दूसरे कर्मों में लगा हुआ ही यह मुनष्य समुदाय कर्मों से बँधता है। इसलिए हे अर्जुन! तू आसक्ति से रहित होकर उस यज्ञ के निमित्त ही भलीभाँति कर्तव्य कर्म कर\n" +
                    " ॥9॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==9)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "सहयज्ञाः प्रजाः सृष्टा पुरोवाचप्रजापतिः।\n" +
                    " अनेन प्रसविष्यध्वमेष वोऽस्त्विष्टकामधुक्  ॥10॥\n" +
                    "\n" +
                    "भावार्थ  :-  प्रजापति ब्रह्मा ने कल्प के आदि में यज्ञ सहित प्रजाओं को रचकर उनसे कहा कि तुम लोग इस यज्ञ द्वारा वृद्धि को प्राप्त होओ और यह यज्ञ तुम लोगों को इच्छित भोग प्रदान करने वाला हो\n" +
                    "॥10॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==10)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "देवान्भावयतानेन ते देवा भावयन्तु वः।\n" +
                    " परस्परं भावयन्तः श्रेयः परमवाप्स्यथ  ॥11॥\n" +
                    "\n" +
                    "भावार्थ  :-  तुम लोग इस यज्ञ द्वारा देवताओं को उन्नत करो और वे देवता तुम लोगों को उन्नत करें। इस प्रकार निःस्वार्थ भाव से एक-दूसरे को उन्नत करते हुए तुम लोग परम कल्याण को प्राप्त हो जाओगे\n" +
                    " ॥11॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==11)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "इष्टान्भोगान्हि वो देवा दास्यन्ते यज्ञभाविताः।\n" +
                    " तैर्दत्तानप्रदायैभ्यो यो भुंक्ते स्तेन एव सः  ॥12॥\n" +
                    "\n" +
                    "भावार्थ  :-  यज्ञ द्वारा बढ़ाए हुए देवता तुम लोगों को बिना माँगे ही इच्छित भोग निश्चय ही देते रहेंगे। इस प्रकार उन देवताओं द्वारा दिए हुए भोगों को जो पुरुष उनको बिना दिए स्वयं भोगता है, वह चोर ही है\n" +
                    " ॥12॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else  if (position==12)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "यज्ञशिष्टाशिनः सन्तो मुच्यन्ते सर्वकिल्बिषैः।\n" +
                    " भुञ्जते ते त्वघं पापा ये पचन्त्यात्मकारणात्  ॥13॥\n" +
                    "\n" +
                    "भावार्थ  :-  यज्ञ से बचे हुए अन्न को खाने वाले श्रेष्ठ पुरुष सब पापों से मुक्त हो जाते हैं और जो पापी लोग अपना शरीर-पोषण करने के लिए ही अन्न पकाते हैं, वे तो पाप को ही खाते हैं\n" +
                    " ॥13॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==13)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "अन्नाद्भवन्ति भूतानि पर्जन्यादन्नसम्भवः।\n" +
                    " यज्ञाद्भवति पर्जन्यो यज्ञः कर्मसमुद्भवः  ॥14॥\n" +
                    " कर्म ब्रह्मोद्भवं विद्धि ब्रह्माक्षरसमुद्भवम्।\n" +
                    " तस्मात्सर्वगतं ब्रह्म नित्यं यज्ञे प्रतिष्ठितम्  ॥15॥\n" +
                    "\n" +
                    "भावार्थ  :-  सम्पूर्ण प्राणी अन्न से उत्पन्न होते हैं, अन्न की उत्पत्ति वृष्टि से होती है, वृष्टि यज्ञ से होती है और यज्ञ विहित कर्मों से उत्पन्न होने वाला है। कर्मसमुदाय को तू वेद से उत्पन्न और वेद को अविनाशी परमात्मा से उत्पन्न हुआ जान। इससे सिद्ध होता है कि सर्वव्यापी परम अक्षर परमात्मा सदा ही यज्ञ में प्रतिष्ठित है\n" +
                    " ॥14-15॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==14)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "एवं प्रवर्तितं चक्रं नानुवर्तयतीह यः।\n" +
                    "अघायुरिन्द्रियारामो मोघं पार्थ स जीवति  ॥16॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे पार्थ! जो पुरुष इस लोक में इस प्रकार परम्परा से प्रचलित सृष्टिचक्र के अनुकूल नहीं बरतता अर्थात अपने कर्तव्य का पालन नहीं करता, वह इन्द्रियों द्वारा भोगों में रमण करने वाला पापायु पुरुष व्यर्थ ही जीता है\n" +
                    " ॥16॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==15)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "यस्त्वात्मरतिरेव स्यादात्मतृप्तश्च मानवः।\n" +
                    " आत्मन्येव च सन्तुष्टस्तस्य कार्यं न विद्यते  ॥17॥\n" +
                    "\n" +
                    "भावार्थ  :-  परन्तु जो मनुष्य आत्मा में ही रमण करने वाला और आत्मा में ही तृप्त तथा आत्मा में ही सन्तुष्ट हो, उसके लिए कोई कर्तव्य नहीं है\n" +
                    " ॥17॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==16)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "संजय उवाच: नैव तस्य कृतेनार्थो नाकृतेनेह कश्चन।\n" +
                    " न चास्य सर्वभूतेषु कश्चिदर्थव्यपाश्रयः  ॥18॥\n" +
                    "\n" +
                    "भावार्थ  :-  उस महापुरुष का इस विश्व में न तो कर्म करने से कोई प्रयोजन रहता है और न कर्मों के न करने से ही कोई प्रयोजन रहता है तथा सम्पूर्ण प्राणियों में भी इसका किञ्चिन्मात्र भी स्वार्थ का संबंध नहीं रहता\n" +
                    " ॥18॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==17)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "तस्मादसक्तः सततं कार्यं कर्म समाचर।\n" +
                    " असक्तो ह्याचरन्कर्म परमाप्नोति पुरुषः  ॥19॥\n" +
                    "\n" +
                    "भावार्थ  :-  इसलिए तू निरन्तर आसक्ति से रहित होकर सदा कर्तव्यकर्म को भलीभाँति करता रह क्योंकि आसक्ति से रहित होकर कर्म करता हुआ मनुष्य परमात्मा को प्राप्त हो जाता है\n" +
                    " ॥19॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==18)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "कर्मणैव हि संसिद्धिमास्थिता जनकादयः।\n" +
                    " लोकसंग्रहमेवापि सम्पश्यन्कर्तुमर्हसि  ॥20॥\n" +
                    "\n" +
                    "भावार्थ  :-  जनकादि ज्ञानीजन भी आसक्ति रहित कर्मद्वारा ही परम सिद्धि को प्राप्त हुए थे, इसलिए तथा लोकसंग्रह को देखते हुए भी तू कर्म करने के ही योग्य है अर्थात तुझे कर्म करना ही उचित है\n" +
                    " ॥20॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==19)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "यद्यदाचरति श्रेष्ठस्तत्तदेवेतरो जनः।\n" +
                    " स यत्प्रमाणं कुरुते लोकस्तदनुवर्तते  ॥21॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्रेष्ठ पुरुष जो-जो आचरण करता है, अन्य पुरुष भी वैसा-वैसा ही आचरण करते हैं। वह जो कुछ प्रमाण कर देता है, समस्त मनुष्य-समुदाय उसी के अनुसार बरतने लग जाता है (यहाँ क्रिया में एकवचन है, परन्तु 'लोक' शब्द समुदायवाचक होने से भाषा में बहुवचन की क्रिया लिखी गई है।)\n" +
                    " ॥21॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==20)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "न मे पार्थास्ति कर्तव्यं त्रिषु लोकेषु किंचन।\n" +
                    " नानवाप्तमवाप्तव्यं वर्त एव च कर्मणि  ॥22॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! मुझे इन तीनों लोकों में न तो कुछ कर्तव्य है और न कोई भी प्राप्त करने योग्य वस्तु अप्राप्त है, तो भी मैं कर्म में ही बरतता हूँ\n" +
                    " ॥22॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==21)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "यदि ह्यहं न वर्तेयं जातु कर्मण्यतन्द्रितः।\n" +
                    " मम वर्त्मानुवर्तन्ते मनुष्याः पार्थ सर्वशः ॥23॥\n" +
                    "\n" +
                    "भावार्थ  :-  क्योंकि हे पार्थ! यदि कदाचित् मैं सावधान होकर कर्मों में न बरतूँ तो बड़ी हानि हो जाए क्योंकि मनुष्य सब प्रकार से मेरे ही मार्ग का अनुसरण करते हैं\n" +
                    " ॥23॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==22)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "यदि उत्सीदेयुरिमे लोका न कुर्यां कर्म चेदहम्।\n" +
                    " संकरस्य च कर्ता स्यामुपहन्यामिमाः प्रजाः  ॥24॥\n" +
                    "\n" +
                    "भावार्थ  :-  इसलिए यदि मैं कर्म न करूँ तो ये सब मनुष्य नष्ट-भ्रष्ट हो जाएँ और मैं संकरता का करने वाला होऊँ तथा इस समस्त प्रजा को नष्ट करने वाला बनूँ\n" +
                    " ॥24॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==23)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "सक्ताः कर्मण्यविद्वांसो यथा कुर्वन्ति भारत।\n" +
                    " कुर्याद्विद्वांस्तथासक्तश्चिकीर्षुर्लोकसंग्रहम्  ॥25॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे भारत! कर्म में आसक्त हुए अज्ञानीजन जिस प्रकार कर्म करते हैं, आसक्तिरहित विद्वान भी लोकसंग्रह करना चाहता हुआ उसी प्रकार कर्म करे\n" +
                    " ॥25॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==24)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "न बुद्धिभेदं जनयेदज्ञानां कर्मसङि्गनाम्।\n" +
                    "जोषयेत्सर्वकर्माणि विद्वान्युक्तः समाचरन्  ॥26॥\n" +
                    "\n" +
                    "भावार्थ  :-  परमात्मा के स्वरूप में अटल स्थित हुए ज्ञानी पुरुष को चाहिए कि वह शास्त्रविहित कर्मों में आसक्ति वाले अज्ञानियों की बुद्धि में भ्रम अर्थात कर्मों में अश्रद्धा उत्पन्न न करे, किन्तु स्वयं शास्त्रविहित समस्त कर्म भलीभाँति करता हुआ उनसे भी वैसे ही करवाए\n" +
                    " ॥26॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==25)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "प्रकृतेः क्रियमाणानि गुणैः कर्माणि सर्वशः।\n" +
                    " अहंकारविमूढात्मा कर्ताहमिति मन्यते  ॥27॥\n" +
                    "\n" +
                    "भावार्थ  :-  वास्तव में सम्पूर्ण कर्म सब प्रकार से प्रकृति के गुणों द्वारा किए जाते हैं, तो भी जिसका अन्तःकरण अहंकार से मोहित हो रहा है, ऐसा अज्ञानी 'मैं कर्ता हूँ' ऐसा मानता है\n" +
                    " ॥27॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==26)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "तत्त्ववित्तु महाबाहो गुणकर्मविभागयोः।\n" +
                    " गुणा गुणेषु वर्तन्त इति मत्वा न सज्जते  ॥28॥\n" +
                    "\n" +
                    "भावार्थ  :-  परन्तु हे महाबाहो! गुण विभाग और कर्म विभाग (त्रिगुणात्मक माया के कार्यरूप पाँच महाभूत और मन, बुद्धि, अहंकार तथा पाँच ज्ञानेन्द्रियाँ, पाँच कर्मेन्द्रियाँ और शब्दादि पाँच विषय- इन सबके समुदाय का नाम 'गुण विभाग' है और इनकी परस्पर की चेष्टाओं का नाम 'कर्म विभाग' है।) के तत्व (उपर्युक्त 'गुण विभाग' और 'कर्म विभाग' से आत्मा को पृथक अर्थात् निर्लेप जानना ही इनका तत्व जानना है।) को जानने वाला ज्ञान योगी सम्पूर्ण गुण ही गुणों में बरत रहे हैं, ऐसा समझकर उनमें आसक्त नहीं होता।\n" +
                    " ॥28॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==27)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "प्रकृतेर्गुणसम्मूढ़ाः सज्जन्ते गुणकर्मसु।\n" +
                    " तानकृत्स्नविदो मन्दान्कृत्स्नविन्न विचालयेत् ॥29॥\n" +
                    "\n" +
                    "भावार्थ  :-  प्रकृति के गुणों से अत्यन्त मोहित हुए मनुष्य गुणों में और कर्मों में आसक्त रहते हैं, उन पूर्णतया न समझने वाले मन्दबुद्धि अज्ञानियों को पूर्णतया जानने वाला ज्ञानी विचलित न करे\n" +
                    " ॥29॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else  if (position==28)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "मयि सर्वाणि कर्माणि सन्नयस्याध्यात्मचेतसा।\n" +
                    " निराशीर्निर्ममो भूत्वा युध्यस्व विगतज्वरः  ॥30॥\n" +
                    "\n" +
                    "भावार्थ  :-  मुझ अन्तर्यामी परमात्मा में लगे हुए चित्त द्वारा सम्पूर्ण कर्मों को मुझमें अर्पण करके आशारहित, ममतारहित और सन्तापरहित होकर युद्ध कर\n" +
                    " ॥30॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==29)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "ये मे मतमिदं नित्यमनुतिष्ठन्ति मानवाः।\n" +
                    " श्रद्धावन्तोऽनसूयन्तो मुच्यन्ते तेऽति कर्मभिः  ॥31॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो कोई मनुष्य दोषदृष्टि से रहित और श्रद्धायुक्त होकर मेरे इस मत का सदा अनुसरण करते हैं, वे भी सम्पूर्ण कर्मों से छूट जाते हैं\n" +
                    " ॥31॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==30)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "ये त्वेतदभ्यसूयन्तो नानुतिष्ठन्ति मे मतम्।\n" +
                    " सर्वज्ञानविमूढांस्तान्विद्धि नष्टानचेतसः  ॥32॥\n" +
                    "\n" +
                    "भावार्थ  :-  परन्तु जो मनुष्य मुझमें दोषारोपण करते हुए मेरे इस मत के अनुसार नहीं चलते हैं, उन मूर्खों को तू सम्पूर्ण ज्ञानों में मोहित और नष्ट हुए ही समझ\n" +
                    " ॥32॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==31)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "सदृशं चेष्टते स्वस्याः प्रकृतेर्ज्ञानवानपि।\n" +
                    " प्रकृतिं यान्ति भूतानि निग्रहः किं करिष्यति  ॥33॥\n" +
                    "\n" +
                    "भावार्थ  :-  सभी प्राणी प्रकृति को प्राप्त होते हैं अर्थात अपने स्वभाव के परवश हुए कर्म करते हैं। ज्ञानवान् भी अपनी प्रकृति के अनुसार चेष्टा करता है। फिर इसमें किसी का हठ क्या करेगा\n" +
                    " ॥33॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==32)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "इन्द्रियस्येन्द्रियस्यार्थे रागद्वेषौ व्यवस्थितौ।\n" +
                    " तयोर्न वशमागच्छेत्तौ ह्यस्य परिपन्थिनौ  ॥34॥\n" +
                    "\n" +
                    "भावार्थ  :-  इन्द्रिय-इन्द्रिय के अर्थ में अर्थात प्रत्येक इन्द्रिय के विषय में राग और द्वेष छिपे हुए स्थित हैं। मनुष्य को उन दोनों के वश में नहीं होना चाहिए क्योंकि वे दोनों ही इसके कल्याण मार्ग में विघ्न करने वाले महान् शत्रु हैं\n" +
                    " ॥34॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else  if (position==33)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "श्रेयान्स्वधर्मो विगुणः परधर्मात्स्वनुष्ठितात्।\n" +
                    " स्वधर्मे निधनं श्रेयः परधर्मो भयावहः  ॥35॥\n" +
                    "\n" +
                    "भावार्थ  :-  अच्छी प्रकार आचरण में लाए हुए दूसरे के धर्म से गुण रहित भी अपना धर्म अति उत्तम है। अपने धर्म में तो मरना भी कल्याणकारक है और दूसरे का धर्म भय को देने वाला है\n" +
                    " ॥35॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==34)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "अर्जुन उवाचः अथ केन प्रयुक्तोऽयं पापं चरति पुरुषः।\n" +
                    " अनिच्छन्नपि वार्ष्णेय बलादिव नियोजितः  ॥36॥\n" +
                    "\n" +
                    "भावार्थ  :-  अर्जुन बोले- हे कृष्ण! तो फिर यह मनुष्य स्वयं न चाहता हुआ भी बलात् लगाए हुए की भाँति किससे प्रेरित होकर पाप का आचरण करता है\n" +
                    " ॥36॥॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==35)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "श्रीभगवानुवाच  :-\n" +
                    "काम एष क्रोध एष रजोगुणसमुद्भवः।\n" +
                    " महाशनो महापाप्मा विद्धयेनमिह वैरिणम्  ॥37॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान बोले- रजोगुण से उत्पन्न हुआ यह काम ही क्रोध है। यह बहुत खाने वाला अर्थात भोगों से कभी न अघानेवाला और बड़ा पापी है। इसको ही तू इस विषय में वैरी जान\n" +
                    " ॥37॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==36)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "धूमेनाव्रियते वह्निर्यथादर्शो मलेन च।\n" +
                    " यथोल्बेनावृतो गर्भस्तथा तेनेदमावृतम्  ॥38॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिस प्रकार धुएँ से अग्नि और मैल से दर्पण ढँका जाता है तथा जिस प्रकार जेर से गर्भ ढँका रहता है, वैसे ही उस काम द्वारा यह ज्ञान ढँका रहता है\n" +
                    " ॥38॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==37)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "आवृतं ज्ञानमेतेन ज्ञानिनो नित्यवैरिणा।\n" +
                    " कामरूपेण कौन्तेय दुष्पूरेणानलेन च  ॥39॥\n" +
                    "\n" +
                    "भावार्थ  :-  और हे अर्जुन! इस अग्नि के समान कभी न पूर्ण होने वाले काम रूप ज्ञानियों के नित्य वैरी द्वारा मनुष्य का ज्ञान ढँका हुआ है\n" +
                    " ॥39॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==38)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "इन्द्रियाणि मनो बुद्धिरस्याधिष्ठानमुच्यते।\n" +
                    " एतैर्विमोहयत्येष ज्ञानमावृत्य देहिनम्  ॥40॥\n" +
                    "\n" +
                    "भावार्थ  :-  इन्द्रियाँ, मन और बुद्धि- ये सब इसके वासस्थान कहे जाते हैं। यह काम इन मन, बुद्धि और इन्द्रियों द्वारा ही ज्ञान को आच्छादित करके जीवात्मा को मोहित करता है।\n" +
                    " ॥40॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==39)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "तस्मात्त्वमिन्द्रियाण्यादौ नियम्य भरतर्षभ।\n" +
                    " पाप्मानं प्रजहि ह्येनं ज्ञानविज्ञाननाशनम्  ॥41॥\n" +
                    "\n" +
                    "भावार्थ  :-  इसलिए हे अर्जुन! तू पहले इन्द्रियों को वश में करके इस ज्ञान और विज्ञान का नाश करने वाले महान पापी काम को अवश्य ही बलपूर्वक मार डाल\n" +
                    " ॥41॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==40)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "इन्द्रियाणि पराण्याहुरिन्द्रियेभ्यः परं मनः।\n" +
                    " मनसस्तु परा बुद्धिर्यो बुद्धेः परतस्तु सः  ॥42॥\n" +
                    "\n" +
                    "भावार्थ  :-  इन्द्रियों को स्थूल शरीर से पर यानी श्रेष्ठ, बलवान और सूक्ष्म कहते हैं। इन इन्द्रियों से पर मन है, मन से भी पर बुद्धि है और जो बुद्धि से भी अत्यन्त पर है वह आत्मा है\n" +
                    " ॥42॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==41)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            bundle.putString("message3", "एवं बुद्धेः परं बुद्धवा संस्तभ्यात्मानमात्मना।\n" +
                    " जहि शत्रुं महाबाहो कामरूपं दुरासदम्  ॥43॥\n" +
                    "\n" +
                    "भावार्थ  :-  इस प्रकार बुद्धि से पर अर्थात सूक्ष्म, बलवान और अत्यन्त श्रेष्ठ आत्मा को जानकर और बुद्धि द्वारा मन को वश में करके हे महाबाहो! तू इस कामरूप दुर्जय शत्रु को मार डाल\n" +
                    " ॥43॥ \n" +
                    " ॐ तत्सदिति श्रीमद्भगवद्गीतासूपनिषत्सु ब्रह्मविद्यायां योगशास्त्रे श्रीकृष्णार्जुनसंवादे कर्मयोगो नाम तृतीयोऽध्यायः\n" +
                    " ॥3॥\n");
            fragment3.setArguments(bundle);
            return fragment3;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 42;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        if(position<=13)
        {
            return "श्लोक "+position;
        }
        else if(position==14)
        {
            return "श्लोक 14,15";
        }
        else if (position>=15&&position<=42)
        {
            position=position+1;
            return "श्लोक "+position;
        }
        return null;

}
}