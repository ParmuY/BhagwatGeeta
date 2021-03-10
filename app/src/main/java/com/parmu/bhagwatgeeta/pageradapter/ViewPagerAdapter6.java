package com.parmu.bhagwatgeeta.pageradapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.parmu.bhagwatgeeta.fragments.Fragment6;

public class ViewPagerAdapter6 extends FragmentStatePagerAdapter {
    public ViewPagerAdapter6(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter6(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","( कर्मयोग का विषय और योगारूढ़ पुरुष के लक्षण ) \n" +
                    " श्रीभगवानुवाच  :-\n" +
                    " अनाश्रितः कर्मफलं कार्यं कर्म करोति यः।\n" +
                    " स सन्न्यासी च योगी च न निरग्निर्न चाक्रियः  ॥1॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान बोले- जो पुरुष कर्मफल का आश्रय न लेकर करने योग्य कर्म करता है, वह संन्यासी तथा योगी है और केवल अग्नि का त्याग करने वाला संन्यासी नहीं है तथा केवल क्रियाओं का त्याग करने वाला योगी नहीं है\n" +
                    " ॥1॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==1)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","यं सन्न्यासमिति प्राहुर्योगं तं विद्धि पाण्डव।\n" +
                    " न ह्यसन्न्यस्तसङ्कल्पो योगी भवति कश्चन ॥2॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! जिसको संन्यास (गीता अध्याय 3 श्लोक 3 की टिप्पणी में इसका खुलासा अर्थ लिखा है।) ऐसा कहते हैं, उसी को तू योग (गीता अध्याय 3 श्लोक 3 की टिप्पणी में इसका खुलासा अर्थ लिखा है।) जान क्योंकि संकल्पों का त्याग न करने वाला कोई भी पुरुष योगी नहीं होता\n" +
                    " ॥2॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==2)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","आरुरुक्षोर्मुनेर्योगं कर्म कारणमुच्यते।\n" +
                    " योगारूढस्य तस्यैव शमः कारणमुच्यते  ॥3॥\n" +
                    "\n" +
                    "भावार्थ  :-  योग में आरूढ़ होने की इच्छा वाले मननशील पुरुष के लिए योग की प्राप्ति में निष्काम भाव से कर्म करना ही हेतु कहा जाता है और योगारूढ़ हो जाने पर उस योगारूढ़ पुरुष का जो सर्वसंकल्पों का अभाव है, वही कल्याण में हेतु कहा जाता है\n" +
                    " ॥3॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==3)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","यदा हि नेन्द्रियार्थेषु न कर्मस्वनुषज्जते।\n" +
                    " सर्वसङ्कल्पसन्न्यासी योगारूढ़स्तदोच्यते  ॥4॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिस काल में न तो इन्द्रियों के भोगों में और न कर्मों में ही आसक्त होता है, उस काल में सर्वसंकल्पों का त्यागी पुरुष योगारूढ़ कहा जाता है\n" +
                    " ॥4॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==4)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","( आत्म-उद्धार के लिए प्रेरणा और भगवत्प्राप्त पुरुष के लक्षण ) \n" +
                    " उद्धरेदात्मनाऽत्मानं नात्मानमवसादयेत्।\n" +
                    " आत्मैव ह्यात्मनो बन्धुरात्मैव रिपुरात्मनः  ॥5॥\n" +
                    "\n" +
                    "भावार्थ  :-  अपने द्वारा अपना संसार-समुद्र से उद्धार करे और अपने को अधोगति में न डाले क्योंकि यह मनुष्य आप ही तो अपना मित्र है और आप ही अपना शत्रु है\n" +
                    " ॥5॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==5)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","बन्धुरात्मात्मनस्तस्य येनात्मैवात्मना जितः।\n" +
                    " अनात्मनस्तु शत्रुत्वे वर्तेतात्मैव शत्रुवत्  ॥6॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिस जीवात्मा द्वारा मन और इन्द्रियों सहित शरीर जीता हुआ है, उस जीवात्मा का तो वह आप ही मित्र है और जिसके द्वारा मन तथा इन्द्रियों सहित शरीर नहीं जीता गया है, उसके लिए वह आप ही शत्रु के सदृश शत्रुता में बर्तता है\n" +
                    " ॥6॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==6)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","जितात्मनः प्रशान्तस्य परमात्मा समाहितः।\n" +
                    " शीतोष्णसुखदुःखेषु तथा मानापमानयोः  ॥7॥\n" +
                    "\n" +
                    "भावार्थ  :-  सरदी-गरमी और सुख-दुःखादि में तथा मान और अपमान में जिसके अन्तःकरण की वृत्तियाँ भलीभाँति शांत हैं, ऐसे स्वाधीन आत्मावाले पुरुष के ज्ञान में सच्चिदानन्दघन परमात्मा सम्यक् प्रकार से स्थित है अर्थात उसके ज्ञान में परमात्मा के सिवा अन्य कुछ है ही नहीं\n" +
                    " ॥7॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==7)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","ज्ञानविज्ञानतृप्तात्मा कूटस्थो विजितेन्द्रियः।\n" +
                    " युक्त इत्युच्यते योगी समलोष्टाश्मकांचनः  ॥8॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिसका अन्तःकरण ज्ञान-विज्ञान से तृप्त है, जिसकी स्थिति विकाररहित है, जिसकी इन्द्रियाँ भलीभाँति जीती हुई हैं और जिसके लिए मिट्टी, पत्थर और सुवर्ण समान हैं, वह योगी युक्त अर्थात भगवत्प्राप्त है, ऐसे कहा जाता है\n" +
                    " ॥8॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==8)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","सुहृन्मित्रार्युदासीनमध्यस्थद्वेष्यबन्धुषु।\n" +
                    " साधुष्वपि च पापेषु समबुद्धिर्विशिष्यते  ॥9॥\n" +
                    "\n" +
                    "भावार्थ  :-  सुहृद् (स्वार्थ रहित सबका हित करने वाला), मित्र, वैरी, उदासीन (पक्षपातरहित), मध्यस्थ (दोनों ओर की भलाई चाहने वाला), द्वेष्य और बन्धुगणों में, धर्मात्माओं में और पापियों में भी समान भाव रखने वाला अत्यन्त श्रेष्ठ है\n" +
                    " ॥9॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==9)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","योगी युञ्जीत सततमात्मानं रहसि स्थितः।\n" +
                    " एकाकी यतचित्तात्मा निराशीरपरिग्रहः  ॥10॥\n" +
                    "\n" +
                    "भावार्थ  :-  मन और इन्द्रियों सहित शरीर को वश में रखने वाला, आशारहित और संग्रहरहित योगी अकेला ही एकांत स्थान में स्थित होकर आत्मा को निरंतर परमात्मा में लगाए\n" +
                    " ॥10॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==10)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","( विस्तार से ध्यान योग का विषय ) \n" +
                    " शुचौ देशे प्रतिष्ठाप्य स्थिरमासनमात्मनः।\n" +
                    " नात्युच्छ्रितं नातिनीचं चैलाजिनकुशोत्तरम्  ॥11॥\n" +
                    "\n" +
                    "भावार्थ  :-  शुद्ध भूमि में, जिसके ऊपर क्रमशः कुशा, मृगछाला और वस्त्र बिछे हैं, जो न बहुत ऊँचा है और न बहुत नीचा, ऐसे अपने आसन को स्थिर स्थापन करके\n" +
                    " ॥11॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==11)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","तत्रैकाग्रं मनः कृत्वा यतचित्तेन्द्रियक्रियः।\n" +
                    " उपविश्यासने युञ्ज्याद्योगमात्मविशुद्धये  ॥12॥\n" +
                    "\n" +
                    "भावार्थ  :-  उस आसन पर बैठकर चित्त और इन्द्रियों की क्रियाओं को वश में रखते हुए मन को एकाग्र करके अन्तःकरण की शुद्धि के लिए योग का अभ्यास करे\n" +
                    " ॥12॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==12)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","समं कायशिरोग्रीवं धारयन्नचलं स्थिरः।\n" +
                    " सम्प्रेक्ष्य नासिकाग्रं स्वं दिशश्चानवलोकयन्  ॥13॥\n" +
                    "\n" +
                    "भावार्थ  :-  काया, सिर और गले को समान एवं अचल धारण करके और स्थिर होकर, अपनी नासिका के अग्रभाग पर दृष्टि जमाकर, अन्य दिशाओं को न देखता हुआ\n" +
                    " ॥13॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==13)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","प्रशान्तात्मा विगतभीर्ब्रह्मचारिव्रते स्थितः।\n" +
                    " मनः संयम्य मच्चित्तो युक्त आसीत मत्परः  ॥14॥\n" +
                    "\n" +
                    "भावार्थ  :-  ब्रह्मचारी के व्रत में स्थित, भयरहित तथा भलीभाँति शांत अन्तःकरण वाला सावधान योगी मन को रोककर मुझमें चित्तवाला और मेरे परायण होकर स्थित होए\n" +
                    " ॥14॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==14)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","युञ्जन्नेवं सदात्मानं योगी नियतमानसः।\n" +
                    " शान्तिं निर्वाणपरमां मत्संस्थामधिगच्छति  ॥15॥\n" +
                    "\n" +
                    "भावार्थ  :-  वश में किए हुए मनवाला योगी इस प्रकार आत्मा को निरंतर मुझ परमेश्वर के स्वरूप में लगाता हुआ मुझमें रहने वाली परमानन्द की पराकाष्ठारूप शान्ति को प्राप्त होता है\n" +
                    " ॥15॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==15)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","नात्यश्नतस्तु योगोऽस्ति न चैकान्तमनश्नतः।\n" +
                    " न चाति स्वप्नशीलस्य जाग्रतो नैव चार्जुन  ॥16॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! यह योग न तो बहुत खाने वाले का, न बिलकुल न खाने वाले का, न बहुत शयन करने के स्वभाव वाले का और न सदा जागने वाले का ही सिद्ध होता है\n" +
                    " ॥16॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==16)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","युक्ताहारविहारस्य युक्तचेष्टस्य कर्मसु।\n" +
                    " युक्तस्वप्नावबोधस्य योगो भवति दुःखहा  ॥17॥\n" +
                    "\n" +
                    "भावार्थ  :-  दुःखों का नाश करने वाला योग तो यथायोग्य आहार-विहार करने वाले का, कर्मों में यथायोग्य चेष्टा करने वाले का और यथायोग्य सोने तथा जागने वाले का ही सिद्ध होता है\n" +
                    " ॥17॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==17)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","यदा विनियतं चित्तमात्मन्येवावतिष्ठते।\n" +
                    " निःस्पृहः सर्वकामेभ्यो युक्त इत्युच्यते तदा  ॥18॥\n" +
                    "\n" +
                    "भावार्थ  :-  अत्यन्त वश में किया हुआ चित्त जिस काल में परमात्मा में ही भलीभाँति स्थित हो जाता है, उस काल में सम्पूर्ण भोगों से स्पृहारहित पुरुष योगयुक्त है, ऐसा कहा जाता है\n" +
                    " ॥18॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==18)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","यथा दीपो निवातस्थो नेंगते सोपमा स्मृता।\n" +
                    " योगिनो यतचित्तस्य युञ्जतो योगमात्मनः  ॥19॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिस प्रकार वायुरहित स्थान में स्थित दीपक चलायमान नहीं होता, वैसी ही उपमा परमात्मा के ध्यान में लगे हुए योगी के जीते हुए चित्त की कही गई है\n" +
                    " ॥19॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==19)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","यत्रोपरमते चित्तं निरुद्धं योगसेवया।\n" +
                    " यत्र चैवात्मनात्मानं पश्यन्नात्मनि तुष्यति  ॥20॥\n" +
                    "\n" +
                    "भावार्थ  :-  योग के अभ्यास से निरुद्ध चित्त जिस अवस्था में उपराम हो जाता है और जिस अवस्था में परमात्मा के ध्यान से शुद्ध हुई सूक्ष्म बुद्धि द्वारा परमात्मा को साक्षात करता हुआ सच्चिदानन्दघन परमात्मा में ही सन्तुष्ट रहता है\n" +
                    " ॥20॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==20)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","सुखमात्यन्तिकं यत्तद्बुद्धिग्राह्यमतीन्द्रियम्।\n" +
                    " वेत्ति यत्र न चैवायं स्थितश्चलति तत्त्वतः  ॥21॥\n" +
                    "\n" +
                    "भावार्थ  :-  इन्द्रियों से अतीत, केवल शुद्ध हुई सूक्ष्म बुद्धि द्वारा ग्रहण करने योग्य जो अनन्त आनन्द है, उसको जिस अवस्था में अनुभव करता है, और जिस अवस्था में स्थित यह योगी परमात्मा के स्वरूप से विचलित होता ही नहीं\n" +
                    " ॥21॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==21)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","यं लब्ध्वा चापरं लाभं मन्यते नाधिकं ततः।\n" +
                    " यस्मिन्स्थितो न दुःखेन गुरुणापि विचाल्यते  ॥22॥\n" +
                    "\n" +
                    "भावार्थ  :-  परमात्मा की प्राप्ति रूप जिस लाभ को प्राप्त होकर उसे अधिक दूसरा कुछ भी लाभ नहीं मानता और परमात्मा प्राप्ति रूप जिस अवस्था में स्थित योगी बड़े भारी दुःख से भी चलायमान नहीं होता\n" +
                    " ॥22॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==22)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","तं विद्याद् दुःखसंयोगवियोगं योगसञ्ज्ञितम्।\n" +
                    " स निश्चयेन योक्तव्यो योगोऽनिर्विण्णचेतसा  ॥23॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो दुःखरूप संसार के संयोग से रहित है तथा जिसका नाम योग है, उसको जानना चाहिए। वह योग न उकताए हुए अर्थात धैर्य और उत्साहयुक्त चित्त से निश्चयपूर्वक करना कर्तव्य है\n" +
                    " ॥23॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==23)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","सङ्कल्पप्रभवान्कामांस्त्यक्त्वा सर्वानशेषतः।\n" +
                    " मनसैवेन्द्रियग्रामं विनियम्य समन्ततः  ॥24॥\n" +
                    "\n" +
                    "भावार्थ  :-  संकल्प से उत्पन्न होने वाली सम्पूर्ण कामनाओं को निःशेष रूप से त्यागकर और मन द्वारा इन्द्रियों के समुदाय को सभी ओर से भलीभाँति रोककर\n" +
                    " ॥24॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==24)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","शनैः शनैरुपरमेद्बुद्धया धृतिगृहीतया।\n" +
                    " आत्मसंस्थं मनः कृत्वा न किंचिदपि चिन्तयेत्  ॥25॥\n" +
                    "\n" +
                    "भावार्थ  :-  क्रम-क्रम से अभ्यास करता हुआ उपरति को प्राप्त हो तथा धैर्ययुक्त बुद्धि द्वारा मन को परमात्मा में स्थित करके परमात्मा के सिवा और कुछ भी चिन्तन न करे\n" +
                    " ॥25॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==25)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","यतो यतो निश्चरति मनश्चञ्चलमस्थिरम्।\n" +
                    " ततस्ततो नियम्यैतदात्मन्येव वशं नयेत्  ॥26॥\n" +
                    "\n" +
                    "भावार्थ  :-  यह स्थिर न रहने वाला और चंचल मन जिस-जिस शब्दादि विषय के निमित्त से संसार में विचरता है, उस-उस विषय से रोककर यानी हटाकर इसे बार-बार परमात्मा में ही निरुद्ध करे\n" +
                    " ॥26॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==26)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","प्रशान्तमनसं ह्येनं योगिनं सुखमुत्तमम्।\n" +
                    " उपैति शांतरजसं ब्रह्मभूतमकल्मषम्  ॥27॥\n" +
                    "\n" +
                    "भावार्थ  :-  क्योंकि जिसका मन भली प्रकार शांत है, जो पाप से रहित है और जिसका रजोगुण शांत हो गया है, ऐसे इस सच्चिदानन्दघन ब्रह्म के साथ एकीभाव हुए योगी को उत्तम आनंद प्राप्त होता है\n" +
                    " ॥27॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==27)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","युञ्जन्नेवं सदात्मानं योगी विगतकल्मषः।\n" +
                    " सुखेन ब्रह्मसंस्पर्शमत्यन्तं सुखमश्नुते  ॥28॥\n" +
                    "\n" +
                    "भावार्थ  :-  वह पापरहित योगी इस प्रकार निरंतर आत्मा को परमात्मा में लगाता हुआ सुखपूर्वक परब्रह्म परमात्मा की प्राप्ति रूप अनन्त आनंद का अनुभव करता है\n" +
                    " ॥28॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==28)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","सर्वभूतस्थमात्मानं सर्वभूतानि चात्मनि।\n" +
                    " ईक्षते योगयुक्तात्मा सर्वत्र समदर्शनः  ॥29॥\n" +
                    "\n" +
                    "भावार्थ  :-  सर्वव्यापी अनंत चेतन में एकीभाव से स्थिति रूप योग से युक्त आत्मा वाला तथा सब में समभाव से देखने वाला योगी आत्मा को सम्पूर्ण भूतों में स्थित और सम्पूर्ण भूतों को आत्मा में कल्पित देखता है\n" +
                    " ॥29॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==29)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","यो मां पश्यति सर्वत्र सर्वं च मयि पश्यति।\n" +
                    " तस्याहं न प्रणश्यामि स च मे न प्रणश्यति  ॥30॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो पुरुष सम्पूर्ण भूतों में सबके आत्मरूप मुझ वासुदेव को ही व्यापक देखता है और सम्पूर्ण भूतों को मुझ वासुदेव के अन्तर्गत (गीता अध्याय 9 श्लोक 6 में देखना चाहिए।) देखता है, उसके लिए मैं अदृश्य नहीं होता और वह मेरे लिए अदृश्य नहीं होता\n" +
                    " ॥30॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==30)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","सर्वभूतस्थितं यो मां भजत्येकत्वमास्थितः।\n" +
                    " सर्वथा वर्तमानोऽपि स योगी मयि वर्तते  ॥31॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो पुरुष एकीभाव में स्थित होकर सम्पूर्ण भूतों में आत्मरूप से स्थित मुझ सच्चिदानन्दघन वासुदेव को भजता है, वह योगी सब प्रकार से बरतता हुआ भी मुझमें ही बरतता है\n" +
                    " ॥31॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==31)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","आत्मौपम्येन सर्वत्र समं पश्यति योऽर्जुन।\n" +
                    " सुखं वा यदि वा दुःखं स योगी परमो मतः  ॥32॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! जो योगी अपनी भाँति (जैसे मनुष्य अपने मस्तक, हाथ, पैर और गुदादि के साथ ब्राह्मण, क्षत्रिय, शूद्र और म्लेच्छादिकों का-सा बर्ताव करता हुआ भी उनमें आत्मभाव अर्थात अपनापन समान होने से सुख और दुःख को समान ही देखता है, वैसे ही सब भूतों में देखना 'अपनी भाँति' सम देखना है।) सम्पूर्ण भूतों में सम देखता है और सुख अथवा दुःख को भी सबमें सम देखता है, वह योगी परम श्रेष्ठ माना गया है\n" +
                    " ॥32॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==32)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","( मन के निग्रह का विषय ) \n" +
                    " अर्जुन उवाच  :-\n" +
                    " योऽयं योगस्त्वया प्रोक्तः साम्येन मधुसूदन।\n" +
                    " एतस्याहं न पश्यामि चञ्चलत्वात्स्थितिं स्थिराम्  ॥33॥\n" +
                    "\n" +
                    "भावार्थ  :-  अर्जुन बोले- हे मधुसूदन! जो यह योग आपने समभाव से कहा है, मन के चंचल होने से मैं इसकी नित्य स्थिति को नहीं देखता हूँ\n" +
                    " ॥33॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==33)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","चञ्चलं हि मनः कृष्ण प्रमाथि बलवद्दृढम्।\n" +
                    " तस्याहं निग्रहं मन्ये वायोरिव सुदुष्करम्    ॥34॥\n" +
                    "\n" +
                    "भावार्थ  :-  क्योंकि हे श्रीकृष्ण! यह मन बड़ा चंचल, प्रमथन स्वभाव वाला, बड़ा दृढ़ और बलवान है। इसलिए उसको वश में करना मैं वायु को रोकने की भाँति अत्यन्त दुष्कर मानता हूँ\n" +
                    " ॥34॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==34)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","श्रीभगवानुवाच   ¬:-\n" +
                    " असंशयं महाबाहो मनो दुर्निग्रहं चलम्।\n" +
                    " अभ्यासेन तु कौन्तेय वैराग्येण च गृह्यते  ॥35॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान बोले- हे महाबाहो! निःसंदेह मन चंचल और कठिनता से वश में होने वाला है। परन्तु हे कुंतीपुत्र अर्जुन! यह अभ्यास (गीता अध्याय 12 श्लोक 9 की टिप्पणी में इसका विस्तार देखना चाहिए।) और वैराग्य से वश में होता है\n" +
                    " ॥35॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==35)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","असंयतात्मना योगो दुष्प्राप इति मे मतिः।\n" +
                    " वश्यात्मना तु यतता शक्योऽवाप्तुमुपायतः  ॥36॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिसका मन वश में किया हुआ नहीं है, ऐसे पुरुष द्वारा योग दुष्प्राप्य है और वश में किए हुए मन वाले प्रयत्नशील पुरुष द्वारा साधन से उसका प्राप्त होना सहज है- यह मेरा मत है\n" +
                    " ॥36॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==36)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","( योगभ्रष्ट पुरुष की गति का विषय और ध्यानयोगी की महिमा ) \n" +
                    " अर्जुन उवाच  :-\n" +
                    " अयतिः श्रद्धयोपेतो योगाच्चलितमानसः।\n" +
                    " अप्राप्य योगसंसिद्धिं कां गतिं कृष्ण गच्छति  ॥37॥\n" +
                    "\n" +
                    "भावार्थ  :-  अर्जुन बोले- हे श्रीकृष्ण! जो योग में श्रद्धा रखने वाला है, किन्तु संयमी नहीं है, इस कारण जिसका मन अन्तकाल में योग से विचलित हो गया है, ऐसा साधक योग की सिद्धि को अर्थात भगवत्साक्षात्कार को न प्राप्त होकर किस गति को प्राप्त होता है\n" +
                    " ॥37॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==37)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","कच्चिन्नोभयविभ्रष्टश्छिन्नाभ्रमिव नश्यति।\n" +
                    " अप्रतिष्ठो महाबाहो विमूढो ब्रह्मणः पथि   ॥38॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे महाबाहो! क्या वह भगवत्प्राप्ति के मार्ग में मोहित और आश्रयरहित पुरुष छिन्न-भिन्न बादल की भाँति दोनों ओर से भ्रष्ट होकर नष्ट तो नहीं हो जाता?\n" +
                    " ॥38॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==38)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","एतन्मे संशयं कृष्ण छेत्तुमर्हस्यशेषतः।\n" +
                    " त्वदन्यः संशयस्यास्य छेत्ता न ह्युपपद्यते  ॥39॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे श्रीकृष्ण! मेरे इस संशय को सम्पूर्ण रूप से छेदन करने के लिए आप ही योग्य हैं क्योंकि आपके सिवा दूसरा इस संशय का छेदन करने वाला मिलना संभव नहीं है\n" +
                    " ॥39॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==39)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","श्रीभगवानुवाच  :-\n" +
                    " पार्थ नैवेह नामुत्र विनाशस्तस्य विद्यते।\n" +
                    " न हि कल्याणकृत्कश्चिद्दुर्गतिं तात गच्छति  ॥40॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान बोले- हे पार्थ! उस पुरुष का न तो इस लोक में नाश होता है और न परलोक में ही क्योंकि हे प्यारे! आत्मोद्धार के लिए अर्थात भगवत्प्राप्ति के लिए कर्म करने वाला कोई भी मनुष्य दुर्गति को प्राप्त नहीं होता\n" +
                    " ॥40॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==40)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","प्राप्य पुण्यकृतां लोकानुषित्वा शाश्वतीः समाः।\n" +
                    " शुचीनां श्रीमतां गेहे योगभ्रष्टोऽभिजायते  ॥41॥\n" +
                    "\n" +
                    "भावार्थ  :-  योगभ्रष्ट पुरुष पुण्यवानों के लोकों को अर्थात स्वर्गादि उत्तम लोकों को प्राप्त होकर उनमें बहुत वर्षों तक निवास करके फिर शुद्ध आचरण वाले श्रीमान पुरुषों के घर में जन्म लेता है\n" +
                    " ॥41॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==41)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","अथवा योगिनामेव कुले भवति धीमताम्।\n" +
                    " एतद्धि दुर्लभतरं लोके जन्म यदीदृशम् ॥42॥\n" +
                    "\n" +
                    "भावार्थ  :-  अथवा वैराग्यवान पुरुष उन लोकों में न जाकर ज्ञानवान योगियों के ही कुल में जन्म लेता है, परन्तु इस प्रकार का जो यह जन्म है, सो संसार में निःसंदेह अत्यन्त दुर्लभ है\n" +
                    " ॥42॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==42)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","तत्र तं बुद्धिसंयोगं लभते पौर्वदेहिकम्।\n" +
                    " यतते च ततो भूयः संसिद्धौ कुरुनन्दन  ॥43॥\n" +
                    "\n" +
                    "भावार्थ  :-  वहाँ उस पहले शरीर में संग्रह किए हुए बुद्धि-संयोग को अर्थात समबुद्धिरूप योग के संस्कारों को अनायास ही प्राप्त हो जाता है और हे कुरुनन्दन! उसके प्रभाव से वह फिर परमात्मा की प्राप्तिरूप सिद्धि के लिए पहले से भी बढ़कर प्रयत्न करता है\n" +
                    " ॥43॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==43)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","पूर्वाभ्यासेन तेनैव ह्रियते ह्यवशोऽपि सः।\n" +
                    " जिज्ञासुरपि योगस्य शब्दब्रह्मातिवर्तते  ॥44॥\n" +
                    "\n" +
                    "भावार्थ  :-  वह (यहाँ 'वह' शब्द से श्रीमानों के घर में जन्म लेने वाला योगभ्रष्ट पुरुष समझना चाहिए।) श्रीमानों के घर में जन्म लेने वाला योगभ्रष्ट पराधीन हुआ भी उस पहले के अभ्यास से ही निःसंदेह भगवान की ओर आकर्षित किया जाता है तथा समबुद्धि रूप योग का जिज्ञासु भी वेद में कहे हुए सकाम कर्मों के फल को उल्लंघन कर जाता है\n" +
                    " ॥44॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==44)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","प्रयत्नाद्यतमानस्तु योगी संशुद्धकिल्बिषः।\n" +
                    " अनेकजन्मसंसिद्धस्ततो यात परां गतिम्  ॥45॥\n" +
                    "\n" +
                    "भावार्थ  :-  परन्तु प्रयत्नपूर्वक अभ्यास करने वाला योगी तो पिछले अनेक जन्मों के संस्कारबल से इसी जन्म में संसिद्ध होकर सम्पूर्ण पापों से रहित हो फिर तत्काल ही परमगति को प्राप्त हो जाता है\n" +
                    " ॥45॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==45)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","तपस्विभ्योऽधिको योगी ज्ञानिभ्योऽपि मतोऽधिकः।\n" +
                    " कर्मिभ्यश्चाधिको योगी तस्माद्योगी भवार्जुन  ॥46॥\n" +
                    "\n" +
                    "भावार्थ  :-  योगी तपस्वियों से श्रेष्ठ है, शास्त्रज्ञानियों से भी श्रेष्ठ माना गया है और सकाम कर्म करने वालों से भी योगी श्रेष्ठ है। इससे हे अर्जुन! तू योगी हो\n" +
                    " ॥46॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==46)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("message6","योगिनामपि सर्वेषां मद्गतेनान्तरात्मना।\n" +
                    " श्रद्धावान्भजते यो मां स मे युक्ततमो मतः  ॥47॥\n" +
                    "\n" +
                    "भावार्थ  :-  सम्पूर्ण योगियों में भी जो श्रद्धावान योगी मुझमें लगे हुए अन्तरात्मा से मुझको निरन्तर भजता है, वह योगी मुझे परम श्रेष्ठ मान्य है\n" +
                    " ॥47॥ \n" +
                    " \n" +
                    " ॐ तत्सदिति श्रीमद्भगवद्गीतासूपनिषत्सु ब्रह्मविद्यायां योगशास्त्रे श्रीकृष्णार्जुनसंवादे आत्मसंयमयोगो नाम षष्ठोऽध्यायः \n" +
                    " ॥6॥\n");
            fragment6.setArguments(bundle);
            return fragment6;
        }


        return null;
    }

    @Override
    public int getCount() {
        return 47;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        return"श्लोक "+position;
    }
}

