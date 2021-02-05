package com.parmu.bhagwatgeeta;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter16 extends FragmentStatePagerAdapter {
    public ViewPagerAdapter16(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter16(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "(फलसहित दैवी और आसुरी संपदा का कथन) \n" +
                    " \n" +
                    " श्रीभगवानुवाच  :-\n" +
                    " अभयं सत्त्वसंशुद्धिर्ज्ञानयोगव्यवस्थितिः।\n" +
                    " दानं दमश्च यज्ञश्च स्वाध्यायस्तप आर्जवम्  ॥1॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान बोले- भय का सर्वथा अभाव, अन्तःकरण की पूर्ण निर्मलता, तत्त्वज्ञान के लिए ध्यान योग में निरन्तर दृढ़ स्थिति (परमात्मा के स्वरूप को तत्त्व से जानने के लिए सच्चिदानन्दघन परमात्मा के स्वरूप में एकी भाव से ध्यान की निरन्तर गाढ़ स्थिति का ही नाम 'ज्ञानयोगव्यवस्थिति' समझना चाहिए) और सात्त्विक दान (गीता अध्याय 17 श्लोक 20 में जिसका विस्तार किया है), इन्द्रियों का दमन, भगवान, देवता और गुरुजनों की पूजा तथा अग्निहोत्र आदि उत्तम कर्मों का आचरण एवं वेद-शास्त्रों का पठन-पाठन तथा भगवान् के नाम और गुणों का कीर्तन, स्वधर्म पालन के लिए कष्टसहन और शरीर तथा इन्द्रियों के सहित अन्तःकरण की सरलता\n" +
                    " ॥1॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }

        else if(position==1)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "अहिंसा सत्यमक्रोधस्त्यागः शान्तिरपैशुनम्।\n" +
                    " दया भूतेष्वलोलुप्त्वं मार्दवं ह्रीरचापलम् ॥2॥\n" +
                    "\n" +
                    "भावार्थ  :-  मन, वाणी और शरीर से किसी प्रकार भी किसी को कष्ट न देना, यथार्थ और प्रिय भाषण (अन्तःकरण और इन्द्रियों के द्वारा जैसा निश्चय किया हो, वैसे-का-वैसा ही प्रिय शब्दों में कहने का नाम 'सत्यभाषण' है), अपना अपकार करने वाले पर भी क्रोध का न होना, कर्मों में कर्तापन के अभिमान का त्याग, अन्तःकरण की उपरति अर्थात् चित्त की चञ्चलता का अभाव, किसी की भी निन्दादि न करना, सब भूतप्राणियों में हेतुरहित दया, इन्द्रियों का विषयों के साथ संयोग होने पर भी उनमें आसक्ति का न होना, कोमलता, लोक और शास्त्र से विरुद्ध आचरण में लज्जा और व्यर्थ चेष्टाओं का अभाव\n" +
                    " ॥2॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }
        else if(position==2)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "तेजः क्षमा धृतिः शौचमद्रोहोनातिमानिता।\n" +
                    " भवन्ति सम्पदं दैवीमभिजातस्य भारत  ॥3॥\n" +
                    "\n" +
                    "भावार्थ  :-  तेज (श्रेष्ठ पुरुषों की उस शक्ति का नाम 'तेज' है कि जिसके प्रभाव से उनके सामने विषयासक्त और नीच प्रकृति वाले मनुष्य भी प्रायः अन्यायाचरण से रुककर उनके कथनानुसार श्रेष्ठ कर्मों में प्रवृत्त हो जाते हैं), क्षमा, धैर्य, बाहर की शुद्धि (गीता अध्याय 13 श्लोक 7 की टिप्पणी देखनी चाहिए) एवं किसी में भी शत्रुभाव का न होना और अपने में पूज्यता के अभिमान का अभाव- ये सब तो हे अर्जुन! दैवी सम्पदा को लेकर उत्पन्न हुए पुरुष के लक्षण हैं\n" +
                    " ॥3॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }
        else if(position==3)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "दम्भो दर्पोऽभिमानश्च क्रोधः पारुष्यमेव च।\n" +
                    " अज्ञानं चाभिजातस्य पार्थ सम्पदमासुरीम्  ॥4॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे पार्थ! दम्भ, घमण्ड और अभिमान तथा क्रोध, कठोरता और अज्ञान भी- ये सब आसुरी सम्पदा को लेकर उत्पन्न हुए पुरुष के लक्षण हैं\n" +
                    " ॥4॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }
        else if(position==4)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "दैवी सम्पद्विमोक्षाय निबन्धायासुरी मता।\n" +
                    " मा शुचः सम्पदं दैवीमभिजातोऽसि पाण्डव  ॥5॥\n" +
                    "\n" +
                    "भावार्थ  :-  दैवी सम्पदा मुक्ति के लिए और आसुरी सम्पदा बाँधने के लिए मानी गई है। इसलिए हे अर्जुन! तू शोक मत कर, क्योंकि तू दैवी सम्पदा को लेकर उत्पन्न हुआ है\n" +
                    " ॥5॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }
        else if(position==5)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "(आसुरी संपदा वालों के लक्षण और उनकी अधोगति का कथन) \n" +
                    " द्वौ भूतसर्गौ लोकऽस्मिन्दैव आसुर एव च।\n" +
                    " दैवो विस्तरशः प्रोक्त आसुरं पार्थ में श्रृणु  ॥6॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! इस लोक में भूतों की सृष्टि यानी मनुष्य समुदाय दो ही प्रकार का है, एक तो दैवी प्रकृति वाला और दूसरा आसुरी प्रकृति वाला। उनमें से दैवी प्रकृति वाला तो विस्तारपूर्वक कहा गया, अब तू आसुरी प्रकृति वाले मनुष्य समुदाय को भी विस्तारपूर्वक मुझसे सुन\n" +
                    " ॥6॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }
        else if(position==6)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "प्रवृत्तिं च निवृत्तिं च जना न विदुरासुराः।\n" +
                    " न शौचं नापि चाचारो न सत्यं तेषु विद्यते  ॥7॥\n" +
                    "\n" +
                    "भावार्थ  :-  आसुर स्वभाव वाले मनुष्य प्रवृत्ति और निवृत्ति- इन दोनों को ही नहीं जानते। इसलिए उनमें न तो बाहर-भीतर की शुद्धि है, न श्रेष्ठ आचरण है और न सत्य भाषण ही है\n" +
                    " ॥7॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }
        else if(position==7)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "असत्यमप्रतिष्ठं ते जगदाहुरनीश्वरम्।\n" +
                    " अपरस्परसम्भूतं किमन्यत्कामहैतुकम्  ॥8॥\n" +
                    "\n" +
                    "भावार्थ  :-  वे आसुरी प्रकृति वाले मनुष्य कहा करते हैं कि जगत् आश्रयरहित, सर्वथा असत्य और बिना ईश्वर के, अपने-आप केवल स्त्री-पुरुष के संयोग से उत्पन्न है, अतएव केवल काम ही इसका कारण है। इसके सिवा और क्या है?\n" +
                    " ॥8॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }
        else if(position==8)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "एतां दृष्टिमवष्टभ्य नष्टात्मानोऽल्पबुद्धयः।\n" +
                    " प्रभवन्त्युग्रकर्माणः क्षयाय जगतोऽहिताः  ॥9॥\n" +
                    "\n" +
                    "भावार्थ  :-  इस मिथ्या ज्ञान को अवलम्बन करके- जिनका स्वभाव नष्ट हो गया है तथा जिनकी बुद्धि मन्द है, वे सब अपकार करने वाले क्रुरकर्मी मनुष्य केवल जगत् के नाश के लिए ही समर्थ होते हैं\n" +
                    " ॥9॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }
        else if(position==9)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "काममाश्रित्य दुष्पूरं दम्भमानमदान्विताः।\n" +
                    " मोहाद्गृहीत्वासद्ग्राहान्प्रवर्तन्तेऽशुचिव्रताः  ॥10॥\n" +
                    "\n" +
                    "भावार्थ  :-  वे दम्भ, मान और मद से युक्त मनुष्य किसी प्रकार भी पूर्ण न होने वाली कामनाओं का आश्रय लेकर, अज्ञान से मिथ्या सिद्धांतों को ग्रहण करके भ्रष्ट आचरणों को धारण करके संसार में विचरते हैं\n" +
                    " \n" +
                    " ॥10॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }
        else if(position==10)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "चिन्तामपरिमेयां च प्रलयान्तामुपाश्रिताः।\n" +
                    " कामोपभोगपरमा एतावदिति निश्चिताः  ॥11॥\n" +
                    "\n" +
                    "भावार्थ  :-  तथा वे मृत्युपर्यन्त रहने वाली असंख्य चिन्ताओं का आश्रय लेने वाले, विषयभोगों के भोगने में तत्पर रहने वाले और 'इतना ही सुख है' इस प्रकार मानने वाले होते हैं\n" +
                    " ॥11॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }
        else if(position==11)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "आशापाशशतैर्बद्धाः कामक्रोधपरायणाः।\n" +
                    " ईहन्ते कामभोगार्थमन्यायेनार्थसञ्चयान्  ॥12॥\n" +
                    "\n" +
                    "भावार्थ  :-  वे आशा की सैकड़ों फाँसियों से बँधे हुए मनुष्य काम-क्रोध के परायण होकर विषय भोगों के लिए अन्यायपूर्वक धनादि पदार्थों का संग्रह करने की चेष्टा करते हैं\n" +
                    " ॥12॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }
        else if(position==12)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "इदमद्य मया लब्धमिमं प्राप्स्ये मनोरथम्।\n" +
                    " इदमस्तीदमपि मे भविष्यति पुनर्धनम्  ॥13॥\n" +
                    "\n" +
                    "भावार्थ  :-  वे सोचा करते हैं कि मैंने आज यह प्राप्त कर लिया है और अब इस मनोरथ को प्राप्त कर लूँगा। मेरे पास यह इतना धन है और फिर भी यह हो जाएगा\n" +
                    " ॥13॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }
        else if(position==13)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "असौ मया हतः शत्रुर्हनिष्ये चापरानपि।\n" +
                    " ईश्वरोऽहमहं भोगी सिद्धोऽहं बलवान्सुखी  ॥14॥\n" +
                    "\n" +
                    "भावार्थ  :-  वह शत्रु मेरे द्वारा मारा गया और उन दूसरे शत्रुओं को भी मैं मार डालूँगा। मैं ईश्वर हूँ, ऐश्र्वर्य को भोगने वाला हूँ। मै सब सिद्धियों से युक्त हूँ और बलवान् तथा सुखी हूँ\n" +
                    " ॥14॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }
        else if(position==14)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "आढयोऽभिजनवानस्मि कोऽन्योऽस्ति सदृशो मया।\n" +
                    " यक्ष्ये दास्यामि मोदिष्य इत्यज्ञानविमोहिताः  ॥15॥\n" +
                    " अनेकचित्तविभ्रान्ता मोहजालसमावृताः।\n" +
                    " प्रसक्ताः कामभोगेषु पतन्ति नरकेऽशुचौ  ॥16॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं बड़ा धनी और बड़े कुटुम्ब वाला हूँ। मेरे समान दूसरा कौन है? मैं यज्ञ करूँगा, दान दूँगा और आमोद-प्रमोद करूँगा। इस प्रकार अज्ञान से मोहित रहने वाले तथा अनेक प्रकार से भ्रमित चित्त वाले मोहरूप जाल से समावृत और विषयभोगों में अत्यन्त आसक्त आसुरलोग महान् अपवित्र नरक में गिरते हैं\n" +
                    " ॥15-16॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }
        else if(position==15)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "आत्मसम्भाविताः स्तब्धा धनमानमदान्विताः।\n" +
                    " यजन्ते नामयज्ञैस्ते दम्भेनाविधिपूर्वकम्  ॥17॥\n" +
                    "\n" +
                    "भावार्थ  :-  वे अपने-आपको ही श्रेष्ठ मानने वाले घमण्डी पुरुष धन और मान के मद से युक्त होकर केवल नाममात्र के यज्ञों द्वारा पाखण्ड से शास्त्रविधिरहित यजन करते हैं\n" +
                    " ॥17॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }
        else if(position==16)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "अहङ्कारं बलं दर्पं कामं क्रोधं च संश्रिताः।\n" +
                    " मामात्मपरदेहेषु प्रद्विषन्तोऽभ्यसूयकाः  ॥18॥\n" +
                    "\n" +
                    "भावार्थ  :-  वे अहंकार, बल, घमण्ड, कामना और क्रोधादि के परायण और दूसरों की निन्दा करने वाले पुरुष अपने और दूसरों के शरीर में स्थित मुझ अन्तर्यामी से द्वेष करने वाले होते हैं\n" +
                    " ॥18॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }
        else if(position==17)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "तानहं द्विषतः क्रूरान्संसारेषु नराधमान्।\n" +
                    " क्षिपाम्यजस्रमशुभानासुरीष्वेव योनिषु  ॥19॥\n" +
                    "\n" +
                    "भावार्थ  :-  उन द्वेष करने वाले पापाचारी और क्रूरकर्मी नराधमों को मैं संसार में बार-बार आसुरी योनियों में ही डालता हूँ\n" +
                    " ॥19॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }
        else if(position==18)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "आसुरीं योनिमापन्ना मूढा जन्मनि जन्मनि।\n" +
                    " मामप्राप्यैव कौन्तेय ततो यान्त्यधमां गतिम्  ॥20॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! वे मूढ़ मुझको न प्राप्त होकर ही जन्म-जन्म में आसुरी योनि को प्राप्त होते हैं, फिर उससे भी अति नीच गति को ही प्राप्त होते हैं अर्थात् घोर नरकों में पड़ते हैं\n" +
                    " ॥20॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }
        else if(position==19)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "(शास्त्रविपरीत आचरणों को त्यागने और शास्त्रानुकूल आचरणों के लिए प्रेरणा) \n" +
                    " त्रिविधं नरकस्येदं द्वारं नाशनमात्मनः।\n" +
                    " कामः क्रोधस्तथा लोभस्तस्मादेतत्त्रयं त्यजेत्  ॥21॥\n" +
                    "\n" +
                    "भावार्थ  :-  काम, क्रोध तथा लोभ- ये तीन प्रकार के नरक के द्वार ( सर्व अनर्थों के मूल और नरक की प्राप्ति में हेतु होने से यहाँ काम, क्रोध और लोभ को 'नरक के द्वार' कहा है) आत्मा का नाश करने वाले अर्थात् उसको अधोगति में ले जाने वाले हैं। अतएव इन तीनों को त्याग देना चाहिए\n" +
                    " ॥21॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }
        else if(position==20)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "एतैर्विमुक्तः कौन्तेय तमोद्वारैस्त्रिभिर्नरः।\n" +
                    " आचरत्यात्मनः श्रेयस्ततो याति परां गतिम्  ॥22॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! इन तीनों नरक के द्वारों से मुक्त पुरुष अपने कल्याण का आचरण करता है (अपने उद्धार के लिए भगवदाज्ञानुसार बरतना ही 'अपने कल्याण का आचरण करना' है), इससे वह परमगति को जाता है अर्थात् मुझको प्राप्त हो जाता है\n" +
                    " ॥22॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }
        else if(position==21)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "यः शास्त्रविधिमुत्सृज्य वर्तते कामकारतः।\n" +
                    " न स सिद्धिमवाप्नोति न सुखं न परां गतिम्  ॥23॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो पुरुष शास्त्र विधि को त्यागकर अपनी इच्छा से मनमाना आचरण करता है, वह न सिद्धि को प्राप्त होता है, न परमगति को और न सुख को ही\n" +
                    " ॥23॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }
        else if(position==22)
        {
            SixteenFragment sixteenFragment=new SixteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message16", "तस्माच्छास्त्रं प्रमाणं ते कार्याकार्यव्यवस्थितौ।\n" +
                    " ज्ञात्वा शास्त्रविधानोक्तं कर्म कर्तुमिहार्हसि  ॥24॥\n" +
                    "\n" +
                    "भावार्थ  :-  इससे तेरे लिए इस कर्तव्य और अकर्तव्य की व्यवस्था में शास्त्र ही प्रमाण है। ऐसा जानकर तू शास्त्र विधि से नियत कर्म ही करने योग्य है\n" +
                    " ॥24॥ \n" +
                    " \n" +
                    "ॐ तत्सदिति श्रीमद्भगवद्नीतासूपनिषत्सु ब्रह्मविद्यायां योगशास्त्रे श्रीकृष्णार्जुन दैवासुरसम्पद्विभागयोगो नाम षोडशोऽध्यायः \n" +
                    " ॥16॥\n");
            sixteenFragment.setArguments(bundle);
            return  sixteenFragment;
        }


        return null;
    }

    @Override
    public int getCount() {
        return 23;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        if(position<=14)
        {
           return  "श्लोक "+position;
        }
        else if(position==15)
        {
           return  "श्लोक 15,16";
        }
        else if(position<=23)
        {   position=position+1;
            return "श्लोक "+position;
        }
        return null;
    }
}
