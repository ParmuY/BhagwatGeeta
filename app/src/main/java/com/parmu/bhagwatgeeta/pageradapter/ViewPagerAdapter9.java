package com.parmu.bhagwatgeeta.pageradapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.parmu.bhagwatgeeta.fragments.Fragment9;

public class ViewPagerAdapter9 extends FragmentStatePagerAdapter {

    public ViewPagerAdapter9(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter9(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","( प्रभावसहित ज्ञान का विषय ) \n" +
                    " श्रीभगवानुवाच  :-\n" +
                    " इदं तु ते गुह्यतमं प्रवक्ष्याम्यनसूयवे।\n" +
                    " ज्ञानं विज्ञानसहितं यज्ज्ञात्वा मोक्ष्यसेऽशुभात्  ॥1॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान बोले- तुझ दोषदृष्टिरहित भक्त के लिए इस परम गोपनीय विज्ञान सहित ज्ञान को पुनः भली भाँति कहूँगा, जिसको जानकर तू दुःखरूप संसार से मुक्त हो जाएगा\n" +
                    " ॥1॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==1)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","राजविद्या राजगुह्यं पवित्रमिदमुत्तमम्।\n" +
                    " प्रत्यक्षावगमं धर्म्यं सुसुखं कर्तुमव्ययम्  ॥2॥\n" +
                    "\n" +
                    "भावार्थ  :-  यह विज्ञान सहित ज्ञान सब विद्याओं का राजा, सब गोपनीयों का राजा, अति पवित्र, अति उत्तम, प्रत्यक्ष फलवाला, धर्मयुक्त, साधन करने में बड़ा सुगम और अविनाशी है\n" +
                    " ॥2॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==2)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","अश्रद्दधानाः पुरुषा धर्मस्यास्य परन्तप।\n" +
                    " अप्राप्य मां निवर्तन्ते मृत्युसंसारवर्त्मनि  ॥3॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे परंतप! इस उपयुक्त धर्म में श्रद्धारहित पुरुष मुझको न प्राप्त होकर मृत्युरूप संसार चक्र में भ्रमण करते रहते हैं\n" +
                    " ॥3॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==3)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","मया ततमिदं सर्वं जगदव्यक्तमूर्तिना।\n" +
                    " मत्स्थानि सर्वभूतानि न चाहं तेषवस्थितः  ॥4॥\n" +
                    "\n" +
                    "भावार्थ  :-  मुझ निराकार परमात्मा से यह सब जगत् जल से बर्फ के सदृश परिपूर्ण है और सब भूत मेरे अंतर्गत संकल्प के आधार स्थित हैं, किंतु वास्तव में मैं उनमें स्थित नहीं हूँ\n" +
                    " ॥4॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==4)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","न च मत्स्थानि भूतानि पश्य मे योगमैश्वरम्।\n" +
                    " भूतभृन्न च भूतस्थो ममात्मा भूतभावनः  ॥5॥\n" +
                    "\n" +
                    "भावार्थ  :-  वे सब भूत मुझमें स्थित नहीं हैं, किंतु मेरी ईश्वरीय योगशक्ति को देख कि भूतों का धारण-पोषण करने वाला और भूतों को उत्पन्न करने वाला भी मेरा आत्मा वास्तव में भूतों में स्थित नहीं है\n" +
                    " ॥5॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==5)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","यथाकाशस्थितो नित्यं वायुः सर्वत्रगो महान्।\n" +
                    " तथा सर्वाणि भूतानि मत्स्थानीत्युपधारय  ॥6॥\n" +
                    "\n" +
                    "भावार्थ  :-  जैसे आकाश से उत्पन्न सर्वत्र विचरने वाला महान् वायु सदा आकाश में ही स्थित है, वैसे ही मेरे संकल्प द्वारा उत्पन्न होने से संपूर्ण भूत मुझमें स्थित हैं, ऐसा जान\n" +
                    " ॥6॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==6)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","( जगत की उत्पत्ति का विषय ) \n" +
                    " सर्वभूतानि कौन्तेय प्रकृतिं यान्ति मामिकाम्।\n" +
                    " कल्पक्षये पुनस्तानि कल्पादौ विसृजाम्यहम्  ॥7॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! कल्पों के अन्त में सब भूत मेरी प्रकृति को प्राप्त होते हैं अर्थात् प्रकृति में लीन होते हैं और कल्पों के आदि में उनको मैं फिर रचता हूँ\n" +
                    " ॥7॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==7)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","प्रकृतिं स्वामवष्टभ्य विसृजामि पुनः पुनः।\n" +
                    " भूतग्राममिमं कृत्स्नमवशं प्रकृतेर्वशात्  ॥8॥\n" +
                    "\n" +
                    "भावार्थ  :-  अपनी प्रकृति को अंगीकार करके स्वभाव के बल से परतंत्र हुए इस संपूर्ण भूतसमुदाय को बार-बार उनके कर्मों के अनुसार रचता हूँ\n" +
                    " ॥8॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==8)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","न च मां तानि कर्माणि निबध्नन्ति धनञ्जय।\n" +
                    " उदासीनवदासीनमसक्तं तेषु कर्मसु  ॥9॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! उन कर्मों में आसक्तिरहित और उदासीन के सदृश (जिसके संपूर्ण कार्य कर्तृत्व भाव के बिना अपने आप सत्ता मात्र ही होते हैं उसका नाम 'उदासीन के सदृश' है।) स्थित मुझ परमात्मा को वे कर्म नहीं बाँधते\n" +
                    " ॥9॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==9)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","मयाध्यक्षेण प्रकृतिः सूयते सचराचरं।\n" +
                    " हेतुनानेन कौन्तेय जगद्विपरिवर्तते  ॥10॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! मुझ अधिष्ठाता के सकाश से प्रकृति चराचर सहित सर्वजगत को रचती है और इस हेतु से ही यह संसारचक्र घूम रहा है\n" +
                    " ॥10॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==10)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","( भगवान का तिरस्कार करने वाले आसुरी प्रकृति वालों की निंदा और दैवी प्रकृति वालों के भगवद्भजन का प्रकार ) \n" +
                    " अवजानन्ति मां मूढा मानुषीं तनुमाश्रितम्।\n" +
                    " परं भावमजानन्तो मम भूतमहेश्वरम्  ॥11॥\n" +
                    "\n" +
                    "भावार्थ  :-  मेरे परमभाव को (गीता अध्याय 7 श्लोक 24 में देखना चाहिए) न जानने वाले मूढ़ लोग मनुष्य का शरीर धारण करने वाले मुझ संपूर्ण भूतों के महान् ईश्वर को तुच्छ समझते हैं अर्थात् अपनी योग माया से संसार के उद्धार के लिए मनुष्य रूप में विचरते हुए मुझ परमेश्वर को साधारण मनुष्य मानते हैं\n" +
                    " ॥11॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==11)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","मोघाशा मोघकर्माणो मोघज्ञाना विचेतसः।\n" +
                    " राक्षसीमासुरीं चैव प्रकृतिं मोहिनीं श्रिताः  ॥12॥\n" +
                    "\n" +
                    "भावार्थ  :-  वे व्यर्थ आशा, व्यर्थ कर्म और व्यर्थ ज्ञान वाले विक्षिप्तचित्त अज्ञानीजन राक्षसी, आसुरी और मोहिनी प्रकृति को (जिसको आसुरी संपदा के नाम से विस्तारपूर्वक भगवान ने गीता अध्याय 16 श्लोक 4 तथा श्लोक 7 से 21 तक में कहा है) ही धारण किए रहते हैं\n" +
                    " ॥12॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==12)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","महात्मानस्तु मां पार्थ दैवीं प्रकृतिमाश्रिताः।\n" +
                    " भजन्त्यनन्यमनसो ज्ञात्वा भूतादिमव्यम्  ॥13॥\n" +
                    "\n" +
                    "भावार्थ  :-  परंतु हे कुन्तीपुत्र! दैवी प्रकृति के (इसका विस्तारपूर्वक वर्णन गीता अध्याय 16 श्लोक 1 से 3 तक में देखना चाहिए) आश्रित महात्माजन मुझको सब भूतों का सनातन कारण और नाशरहित अक्षरस्वरूप जानकर अनन्य मन से युक्त होकर निरंतर भजते हैं\n" +
                    " ॥13॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==13)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","सततं कीर्तयन्तो मां यतन्तश्च दृढ़व्रताः।\n" +
                    " नमस्यन्तश्च मां भक्त्या नित्ययुक्ता उपासते  ॥14॥\n" +
                    "\n" +
                    "भावार्थ  :-  वे दृढ़ निश्चय वाले भक्तजन निरंतर मेरे नाम और गुणों का कीर्तन करते हुए तथा मेरी प्राप्ति के लिए यत्न करते हुए और मुझको बार-बार प्रणाम करते हुए सदा मेरे ध्यान में युक्त होकर अनन्य प्रेम से मेरी उपासना करते हैं\n" +
                    " ॥14॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==14)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","ज्ञानयज्ञेन चाप्यन्ते यजन्तो मामुपासते।\n" +
                    " एकत्वेन पृथक्त्वेन बहुधा विश्वतोमुखम्।  ॥15॥\n" +
                    "\n" +
                    "भावार्थ  :-  दूसरे ज्ञानयोगी मुझ निर्गुण-निराकार ब्रह्म का ज्ञानयज्ञ द्वारा अभिन्नभाव से पूजन करते हुए भी मेरी उपासना करते हैं और दूसरे मनुष्य बहुत प्रकार से स्थित मुझ विराट स्वरूप परमेश्वर की पृथक भाव से उपासना करते हैं।।15।।\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==15)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","( सर्वात्म रूप से प्रभाव सहित भगवान के स्वरूप का वर्णन ) \n" +
                    " अहं क्रतुरहं यज्ञः स्वधाहमहमौषधम्।\n" +
                    " मंत्रोऽहमहमेवाज्यमहमग्निरहं हुतम् ॥16॥\n" +
                    "\n" +
                    "भावार्थ  :-  क्रतु मैं हूँ, यज्ञ मैं हूँ, स्वधा मैं हूँ, औषधि मैं हूँ, मंत्र मैं हूँ, घृत मैं हूँ, अग्नि मैं हूँ और हवनरूप क्रिया भी मैं ही हूँ\n" +
                    " ॥16॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==16)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","पिताहमस्य जगतो माता धाता पितामहः।\n" +
                    " वेद्यं पवित्रमोङ्कार ऋक्साम यजुरेव च  ॥17॥\n" +
                    "\n" +
                    "भावार्थ  :-  इस संपूर्ण जगत् का धाता अर्थात् धारण करने वाला एवं कर्मों के फल को देने वाला, पिता, माता, पितामह, जानने योग्य, (गीता अध्याय 13 श्लोक 12 से 17 तक में देखना चाहिए) पवित्र ओंकार तथा ऋग्वेद, सामवेद और यजुर्वेद भी मैं ही हूँ\n" +
                    " ॥17॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }else if(position==17)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","गतिर्भर्ता प्रभुः साक्षी निवासः शरणं सुहृत्।\n" +
                    " प्रभवः प्रलयः स्थानं निधानं बीजमव्ययम्  ॥18॥\n" +
                    "\n" +
                    "भावार्थ  :-  प्राप्त होने योग्य परम धाम, भरण-पोषण करने वाला, सबका स्वामी, शुभाशुभ का देखने वाला, सबका वासस्थान, शरण लेने योग्य, प्रत्युपकार न चाहकर हित करने वाला, सबकी उत्पत्ति-प्रलय का हेतु, स्थिति का आधार, निधान (प्रलयकाल में संपूर्ण भूत सूक्ष्म रूप से जिसमें लय होते हैं उसका नाम 'निधान' है) और अविनाशी कारण भी मैं ही हूँ\n" +
                    " ॥18॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }else if(position==18)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","तपाम्यहमहं वर्षं निगृह्णाम्युत्सृजामि च।\n" +
                    " अमृतं चैव मृत्युश्च सदसच्चाहमर्जुन  ॥19॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं ही सूर्यरूप से तपता हूँ, वर्षा का आकर्षण करता हूँ और उसे बरसाता हूँ। हे अर्जुन! मैं ही अमृत और मृत्यु हूँ और सत्-असत् भी मैं ही हूँ\n" +
                    " ॥19॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==19)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","( सकाम और निष्काम उपासना का फल) \n" +
                    " त्रैविद्या मां सोमपाः पूतपापायज्ञैरिष्ट्वा स्वर्गतिं प्रार्थयन्ते।\n" +
                    " ते पुण्यमासाद्य सुरेन्द्रलोकमश्नन्ति दिव्यान्दिवि देवभोगान्  ॥20॥\n" +
                    "\n" +
                    "भावार्थ  :-  तीनों वेदों में विधान किए हुए सकाम कर्मों को करने वाले, सोम रस को पीने वाले, पापरहित पुरुष (यहाँ स्वर्ग प्राप्ति के प्रतिबंधक देव ऋणरूप पाप से पवित्र होना समझना चाहिए) मुझको यज्ञों के द्वारा पूजकर स्वर्ग की प्राप्ति चाहते हैं, वे पुरुष अपने पुण्यों के फलरूप स्वर्गलोक को प्राप्त होकर स्वर्ग में दिव्य देवताओं के भोगों को भोगते हैं\n" +
                    " ॥20॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==20)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","ते तं भुक्त्वा स्वर्गलोकं विशालंक्षीणे पुण्य मर्त्यलोकं विशन्ति।\n" +
                    " एवं त्रयीधर्ममनुप्रपन्ना गतागतं कामकामा लभन्ते  ॥21॥\n" +
                    "\n" +
                    "भावार्थ  :-  वे उस विशाल स्वर्गलोक को भोगकर पुण्य क्षीण होने पर मृत्यु लोक को प्राप्त होते हैं। इस प्रकार स्वर्ग के साधनरूप तीनों वेदों में कहे हुए सकामकर्म का आश्रय लेने वाले और भोगों की कामना वाले पुरुष बार-बार आवागमन को प्राप्त होते हैं, अर्थात् पुण्य के प्रभाव से स्वर्ग में जाते हैं और पुण्य क्षीण होने पर मृत्युलोक में आते हैं\n" +
                    " ॥21॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }else if(position==21)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","अनन्याश्चिन्तयन्तो मां ये जनाः पर्युपासते।\n" +
                    " तेषां नित्याभियुक्तानां योगक्षेमं वहाम्यहम्  ॥22॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो अनन्यप्रेमी भक्तजन मुझ परमेश्वर को निरंतर चिंतन करते हुए निष्कामभाव से भजते हैं, उन नित्य-निरंतर मेरा चिंतन करने वाले पुरुषों का योगक्षेम (भगवत्स्वरूप की प्राप्ति का नाम 'योग' है और भगवत्प्राप्ति के निमित्त किए हुए साधन की रक्षा का नाम 'क्षेम' है) मैं स्वयं प्राप्त कर देता हूँ\n" +
                    " ॥22॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }else if(position==22)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","येऽप्यन्यदेवता भक्ता यजन्ते श्रद्धयान्विताः।\n" +
                    " तेऽपि मामेव कौन्तेय यजन्त्यविधिपूर्वकम्  ॥23॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! यद्यपि श्रद्धा से युक्त जो सकाम भक्त दूसरे देवताओं को पूजते हैं, वे भी मुझको ही पूजते हैं, किंतु उनका वह पूजन अविधिपूर्वक अर्थात् अज्ञानपूर्वक है\n" +
                    " ॥23॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==23)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","अहं हि सर्वयज्ञानां भोक्ता च प्रभुरेव च।\n" +
                    " न तु मामभिजानन्ति तत्त्वेनातश्च्यवन्ति ते  ॥24॥\n" +
                    "\n" +
                    "भावार्थ  :-  क्योंकि संपूर्ण यज्ञों का भोक्ता और स्वामी भी मैं ही हूँ, परंतु वे मुझ परमेश्वर को तत्त्व से नहीं जानते, इसी से गिरते हैं अर्थात् पुनर्जन्म को प्राप्त होते हैं\n" +
                    " ॥24॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }else if(position==24)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","यान्ति देवव्रता देवान्पितृन्यान्ति पितृव्रताः।\n" +
                    " भूतानि यान्ति भूतेज्या यान्ति मद्याजिनोऽपि माम्  ॥25॥\n" +
                    "\n" +
                    "भावार्थ  :-  देवताओं को पूजने वाले देवताओं को प्राप्त होते हैं, पितरों को पूजने वाले पितरों को प्राप्त होते हैं, भूतों को पूजने वाले भूतों को प्राप्त होते हैं और मेरा पूजन करने वाले भक्त मुझको ही प्राप्त होते हैं। इसीलिए मेरे भक्तों का पुनर्जन्म नहीं होता (गीता अध्याय 8 श्लोक 16 में देखना चाहिए)\n" +
                    " ॥25॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==25)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","( निष्काम भगवद् भक्ति की महिमा ) \n" +
                    " पत्रं पुष्पं फलं तोयं यो मे भक्त्या प्रयच्छति।\n" +
                    " तदहं भक्त्युपहृतमश्नामि प्रयतात्मनः  ॥26॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो कोई भक्त मेरे लिए प्रेम से पत्र, पुष्प, फल, जल आदि अर्पण करता है, उस शुद्धबुद्धि निष्काम प्रेमी भक्त का प्रेमपूर्वक अर्पण किया हुआ वह पत्र-पुष्पादि मैं सगुणरूप से प्रकट होकर प्रीतिसहित खाता हूँ\n" +
                    " ॥26॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }

        else if(position==26)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","यत्करोषि यदश्नासि यज्जुहोषि ददासि यत्।\n" +
                    " यत्तपस्यसि कौन्तेय तत्कुरुष्व मदर्पणम्  ॥27॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! तू जो कर्म करता है, जो खाता है, जो हवन करता है, जो दान देता है और जो तप करता है, वह सब मेरे अर्पण कर\n" +
                    " ॥27॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==27)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","शुभाशुभफलैरेवं मोक्ष्य से कर्मबंधनैः।\n" +
                    " सन्न्यासयोगमुक्तात्मा विमुक्तो मामुपैष्यसि  ॥28॥\n" +
                    "\n" +
                    "भावार्थ  :-  इस प्रकार, जिसमें समस्त कर्म मुझ भगवान के अर्पण होते हैं- ऐसे संन्यासयोग से युक्त चित्तवाला तू शुभाशुभ फलरूप कर्मबंधन से मुक्त हो जाएगा और उनसे मुक्त होकर मुझको ही प्राप्त होगा।\n" +
                    " ॥28॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==28)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","समोऽहं सर्वभूतेषु न मे द्वेष्योऽस्ति न प्रियः।\n" +
                    " ये भजन्ति तु मां भक्त्या मयि ते तेषु चाप्यहम्  ॥29॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं सब भूतों में समभाव से व्यापक हूँ, न कोई मेरा अप्रिय है और न प्रिय है, परंतु जो भक्त मुझको प्रेम से भजते हैं, वे मुझमें हैं और मैं भी उनमें प्रत्यक्ष प्रकट (जैसे सूक्ष्म रूप से सब जगह व्यापक हुआ भी अग्नि साधनों द्वारा प्रकट करने से ही प्रत्यक्ष होता है, वैसे ही सब जगह स्थित हुआ भी परमेश्वर भक्ति से भजने वाले के ही अंतःकरण में प्रत्यक्ष रूप से प्रकट होता है) हूँ\n" +
                    " ॥29॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==29)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","अपि चेत्सुदुराचारो भजते मामनन्यभाक्।\n" +
                    " साधुरेव स मन्तव्यः सम्यग्व्यवसितो हि सः  ॥30॥\n" +
                    "\n" +
                    "भावार्थ  :-  यदि कोई अतिशय दुराचारी भी अनन्य भाव से मेरा भक्त होकर मुझको भजता है तो वह साधु ही मानने योग्य है, क्योंकि वह यथार्थ निश्चय वाला है। अर्थात् उसने भली भाँति निश्चय कर लिया है कि परमेश्वर के भजन के समान अन्य कुछ भी नहीं है\n" +
                    " ॥30॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==30)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","क्षिप्रं भवति धर्मात्मा शश्वच्छान्तिं निगच्छति।\n" +
                    " कौन्तेय प्रतिजानीहि न मे भक्तः प्रणश्यति ॥31॥\n" +
                    "\n" +
                    "भावार्थ  :-  वह शीघ्र ही धर्मात्मा हो जाता है और सदा रहने वाली परम शान्ति को प्राप्त होता है। हे अर्जुन! तू निश्चयपूर्वक सत्य जान कि मेरा भक्त नष्ट नहीं होता\n" +
                    " ॥31॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==31)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","मां हि पार्थ व्यपाश्रित्य येऽपि स्यु पापयोनयः।\n" +
                    " स्त्रियो वैश्यास्तथा शूद्रास्तेऽपि यान्ति परां गतिम्  ॥32॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! स्त्री, वैश्य, शूद्र तथा पापयोनि चाण्डालादि जो कोई भी हों, वे भी मेरे शरण होकर परमगति को ही प्राप्त होते हैं\n" +
                    " ॥32॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==32)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","किं पुनर्ब्राह्मणाः पुण्या भक्ता राजर्षयस्तथा।\n" +
                    " अनित्यमसुखं लोकमिमं प्राप्य भजस्व माम्  ॥33॥\n" +
                    "\n" +
                    "भावार्थ  :-  फिर इसमें कहना ही क्या है, जो पुण्यशील ब्राह्मण था राजर्षि भक्तजन मेरी शरण होकर परम गति को प्राप्त होते हैं। इसलिए तू सुखरहित और क्षणभंगुर इस मनुष्य शरीर को प्राप्त होकर निरंतर मेरा ही भजन कर\n" +
                    " ॥33॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==33)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("message9","मन्मना भव मद्भक्तो मद्याजी मां नमस्कुरु।\n" +
                    " मामेवैष्यसि युक्त्वैवमात्मानं मत्परायण:  ॥34॥\n" +
                    "\n" +
                    "भावार्थ  :-  मुझमें मन वाला हो, मेरा भक्त बन, मेरा पूजन करने वाला हो, मुझको प्रणाम कर। इस प्रकार आत्मा को मुझमें नियुक्त करके मेरे परायण होकर तू मुझको ही प्राप्त होगा\n" +
                    " ॥34॥ \n" +
                    " \n" +
                    " ॐ तत्सदिति श्रीमद्भगवद्गीतासूपनिषत्सु ब्रह्मविद्यायां योगशास्त्रे श्री कृष्णार्जुनसंवादे राजविद्याराजगुह्ययोगो नाम नवमोऽध्यायः\n" +
                    " ॥9॥\n");
            fragment9.setArguments(bundle);
            return fragment9;
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
