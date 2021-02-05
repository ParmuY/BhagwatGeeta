package com.parmu.bhagwatgeeta;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter11 extends FragmentStatePagerAdapter {
    public ViewPagerAdapter11(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter11(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "( विश्वरूप के दर्शन हेतु अर्जुन की प्रार्थना ) \n" +
                    " अर्जुन उवाच  :-\n" +
                    " मदनुग्रहाय परमं गुह्यमध्यात्मसञ्ज्ञितम्।\n" +
                    " यत्त्वयोक्तं वचस्तेन मोहोऽयं विगतो मम  ॥1॥\n" +
                    "\n" +
                    "भावार्थ  :-  अर्जुन बोले- मुझ पर अनुग्रह करने के लिए आपने जो परम गोपनीय अध्यात्म विषयक वचन अर्थात उपदेश कहा, उससे मेरा यह अज्ञान नष्ट हो गया है\n" +
                    " ॥1॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }

         else if(position==1)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "भवाप्ययौ हि भूतानां श्रुतौ विस्तरशो मया।\n" +
                    " त्वतः कमलपत्राक्ष माहात्म्यमपि चाव्ययम्  ॥2॥\n" +
                    "\n" +
                    "भावार्थ  :-  क्योंकि हे कमलनेत्र! मैंने आपसे भूतों की उत्पत्ति और प्रलय विस्तारपूर्वक सुने हैं तथा आपकी अविनाशी महिमा भी सुनी है\n" +
                    " ॥2॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==2)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "एवमेतद्यथात्थ त्वमात्मानं परमेश्वर।\n" +
                    " द्रष्टुमिच्छामि ते रूपमैश्वरं पुरुषोत्तम  ॥3॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे परमेश्वर! आप अपने को जैसा कहते हैं, यह ठीक ऐसा ही है, परन्तु हे पुरुषोत्तम! आपके ज्ञान, ऐश्वर्य, शक्ति, बल, वीर्य और तेज से युक्त ऐश्वर्य-रूप को मैं प्रत्यक्ष देखना चाहता हूँ\n" +
                    " ॥3॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==3)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "मन्यसे यदि तच्छक्यं मया द्रष्टुमिति प्रभो।\n" +
                    " योगेश्वर ततो मे त्वं दर्शयात्मानमव्ययम्  ॥4॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे प्रभो! (उत्पत्ति, स्थिति और प्रलय तथा अन्तर्यामी रूप से शासन करने वाला होने से भगवान का नाम 'प्रभु' है) यदि मेरे द्वारा आपका वह रूप देखा जाना शक्य है- ऐसा आप मानते हैं, तो हे योगेश्वर! उस अविनाशी स्वरूप का मुझे दर्शन कराइए\n" +
                    " ॥4॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==4)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "भगवान द्वारा अपने विश्व रूप का वर्णन ) \n" +
                    " श्रीभगवानुवाच  :-\n" +
                    " पश्य मे पार्थ रूपाणि शतशोऽथ सहस्रशः।\n" +
                    " नानाविधानि दिव्यानि नानावर्णाकृतीनि च ॥5॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान बोले- हे पार्थ! अब तू मेरे सैकड़ों-हजारों नाना प्रकार के और नाना वर्ण तथा नाना आकृतिवाले अलौकिक रूपों को देख\n" +
                    " ॥5॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==5)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "पश्यादित्यान्वसून्रुद्रानश्विनौ मरुतस्तथा।\n" +
                    " बहून्यदृष्टपूर्वाणि पश्याश्चर्याणि भारत  ॥6॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे भरतवंशी अर्जुन! तू मुझमें आदित्यों को अर्थात अदिति के द्वादश पुत्रों को, आठ वसुओं को, एकादश रुद्रों को, दोनों अश्विनीकुमारों को और उनचास मरुद्गणों को देख तथा और भी बहुत से पहले न देखे हुए आश्चर्यमय रूपों को देख\n" +
                    " ॥6॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==6)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "इहैकस्थं जगत्कृत्स्नं पश्याद्य सचराचरम्।\n" +
                    " मम देहे गुडाकेश यच्चान्यद्द्रष्टमिच्छसि  ॥7॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! अब इस मेरे शरीर में एक जगह स्थित चराचर सहित सम्पूर्ण जगत को देख तथा और भी जो कुछ देखना चाहता हो सो देख\n" +
                    " ॥7॥ (गुडाकेश- निद्रा को जीतने वाला होने से अर्जुन का नाम 'गुडाकेश' हुआ था)\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==7)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "न तु मां शक्यसे द्रष्टमनेनैव स्वचक्षुषा।\n" +
                    " दिव्यं ददामि ते चक्षुः पश्य मे योगमैश्वरम्  ॥8॥\n" +
                    "\n" +
                    "भावार्थ  :-  परन्तु मुझको तू इन अपने प्राकृत नेत्रों द्वारा देखने में निःसंदेह समर्थ नहीं है, इसी से मैं तुझे दिव्य अर्थात अलौकिक चक्षु देता हूँ, इससे तू मेरी ईश्वरीय योग शक्ति को देख\n" +
                    " ॥8॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==8)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "(संजय द्वारा धृतराष्ट्र के प्रति विश्वरूप का वर्णन ) \n" +
                    " संजय उवाच  :-\n" +
                    " एवमुक्त्वा ततो राजन्महायोगेश्वरो हरिः।\n" +
                    " दर्शयामास पार्थाय परमं रूपमैश्वरम्  ॥9॥\n" +
                    "\n" +
                    "भावार्थ  :-  संजय बोले- हे राजन्! महायोगेश्वर और सब पापों के नाश करने वाले भगवान ने इस प्रकार कहकर उसके पश्चात अर्जुन को परम ऐश्वर्ययुक्त दिव्यस्वरूप दिखलाया\n" +
                    " ॥9॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==9)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "अनेकवक्त्रनयनमनेकाद्भुतदर्शनम्।\n" +
                    " अनेकदिव्याभरणं दिव्यानेकोद्यतायुधम्   ॥10॥\n" +
                    " दिव्यमाल्याम्बरधरं दिव्यगन्धानुलेपनम्।\n" +
                    " सर्वाश्चर्यमयं देवमनन्तं विश्वतोमुखम्  ॥11॥\n" +
                    "\n" +
                    "भावार्थ  :-  अनेक मुख और नेत्रों से युक्त, अनेक अद्भुत दर्शनों वाले, बहुत से दिव्य भूषणों से युक्त और बहुत से दिव्य शस्त्रों को धारण किए हुए और दिव्य गंध का सारे शरीर में लेप किए हुए, सब प्रकार के आश्चर्यों से युक्त, सीमारहित और सब ओर मुख किए हुए विराट्स्वरूप परमदेव परमेश्वर को अर्जुन ने देखा\n" +
                    " ॥10-11॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==10)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "दिवि सूर्यसहस्रस्य भवेद्युगपदुत्थिता।\n" +
                    " यदि भाः सदृशी सा स्याद्भासस्तस्य महात्मनः  ॥12॥\n" +
                    "\n" +
                    "भावार्थ  :-  आकाश में हजार सूर्यों के एक साथ उदय होने से उत्पन्न जो प्रकाश हो, वह भी उस विश्व रूप परमात्मा के प्रकाश के सदृश कदाचित् ही हो\n" +
                    " ॥12॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==11)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "तत्रैकस्थं जगत्कृत्स्नं प्रविभक्तमनेकधा।\n" +
                    " अपश्यद्देवदेवस्य शरीरे पाण्डवस्तदा  ॥13॥\n" +
                    "\n" +
                    "भावार्थ  :-  पाण्डुपुत्र अर्जुन ने उस समय अनेक प्रकार से विभक्त अर्थात पृथक-पृथक सम्पूर्ण जगत को देवों के देव श्रीकृष्ण भगवान के उस शरीर में एक जगह स्थित देखा\n" +
                    " ॥13॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==12)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "ततः स विस्मयाविष्टो हृष्टरोमा धनञ्जयः।\n" +
                    " प्रणम्य शिरसा देवं कृताञ्जलिरभाषत  ॥14॥\n" +
                    "\n" +
                    "भावार्थ  :-  उसके अनंतर आश्चर्य से चकित और पुलकित शरीर अर्जुन प्रकाशमय विश्वरूप परमात्मा को श्रद्धा-भक्ति सहित सिर से प्रणाम करके हाथ जोड़कर बोले\n" +
                    " ॥14॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==13)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "(अर्जुन द्वारा भगवान के विश्वरूप का देखा जाना और उनकी स्तुति करना ) \n" +
                    " अर्जुन उवाच  :-\n" +
                    " पश्यामि देवांस्तव देव देहे सर्वांस्तथा भूतविशेषसङ्घान्।\n" +
                    " ब्रह्माणमीशं कमलासनस्थमृषींश्च सर्वानुरगांश्च दिव्यान्  ॥15॥\n" +
                    "\n" +
                    "भावार्थ  :-  अर्जुन बोले- हे देव! मैं आपके शरीर में सम्पूर्ण देवों को तथा अनेक भूतों के समुदायों को, कमल के आसन पर विराजित ब्रह्मा को, महादेव को और सम्पूर्ण ऋषियों को तथा दिव्य सर्पों को देखता हूँ\n" +
                    " ॥15॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==14)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "अनेकबाहूदरवक्त्रनेत्रंपश्यामि त्वां सर्वतोऽनन्तरूपम्।\n" +
                    " नान्तं न मध्यं न पुनस्तवादिंपश्यामि विश्वेश्वर विश्वरूप  ॥16॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे सम्पूर्ण विश्व के स्वामिन्! आपको अनेक भुजा, पेट, मुख और नेत्रों से युक्त तथा सब ओर से अनन्त रूपों वाला देखता हूँ। हे विश्वरूप! मैं आपके न अन्त को देखता हूँ, न मध्य को और न आदि को ही\n" +
                    " ॥16॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==15)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "किरीटिनं गदिनं चक्रिणं च तेजोराशिं सर्वतो दीप्तिमन्तम्।\n" +
                    " पश्यामि त्वां दुर्निरीक्ष्यं समन्ताद्दीप्तानलार्कद्युतिमप्रमेयम्  ॥17॥\n" +
                    "\n" +
                    "भावार्थ  :-  आपको मैं मुकुटयुक्त, गदायुक्त और चक्रयुक्त तथा सब ओर से प्रकाशमान तेज के पुंज, प्रज्वलित अग्नि और सूर्य के सदृश ज्योतियुक्त, कठिनता से देखे जाने योग्य और सब ओर से अप्रमेयस्वरूप देखता हूँ\n" +
                    " ॥17॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==16)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "त्वमक्षरं परमं वेदितव्यंत्वमस्य विश्वस्य परं निधानम्।\n" +
                    " त्वमव्ययः शाश्वतधर्मगोप्ता सनातनस्त्वं पुरुषो मतो मे  ॥18॥\n" +
                    "\n" +
                    "भावार्थ  :-  आप ही जानने योग्य परम अक्षर अर्थात परब्रह्म परमात्मा हैं। आप ही इस जगत के परम आश्रय हैं, आप ही अनादि धर्म के रक्षक हैं और आप ही अविनाशी सनातन पुरुष हैं। ऐसा मेरा मत है\n" +
                    " ॥18॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==17)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "अनादिमध्यान्तमनन्तवीर्यमनन्तबाहुं शशिसूर्यनेत्रम्।\n" +
                    " पश्यामि त्वां दीप्तहुताशवक्त्रंस्वतेजसा विश्वमिदं तपन्तम्  ॥19॥\n" +
                    "\n" +
                    "भावार्थ  :-  आपको आदि, अंत और मध्य से रहित, अनन्त सामर्थ्य से युक्त, अनन्त भुजावाले, चन्द्र-सूर्य रूप नेत्रों वाले, प्रज्वलित अग्निरूप मुखवाले और अपने तेज से इस जगत को संतृप्त करते हुए देखता हूँ\n" +
                    " ॥19॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==18)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "द्यावापृथिव्योरिदमन्तरं हि व्याप्तं त्वयैकेन दिशश्च सर्वाः।\n" +
                    " दृष्ट्वाद्भुतं रूपमुग्रं तवेदंलोकत्रयं प्रव्यथितं महात्मन्  ॥20॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे महात्मन्! यह स्वर्ग और पृथ्वी के बीच का सम्पूर्ण आकाश तथा सब दिशाएँ एक आपसे ही परिपूर्ण हैं तथा आपके इस अलौकिक और भयंकर रूप को देखकर तीनों लोक अतिव्यथा को प्राप्त हो रहे हैं\n" +
                    " ॥20॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==19)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "अमी हि त्वां सुरसङ्घा विशन्ति केचिद्भीताः प्राञ्जलयो गृणन्ति।\n" +
                    " स्वस्तीत्युक्त्वा महर्षिसिद्धसङ्घा: स्तुवन्ति त्वां स्तुतिभिः पुष्कलाभिः  ॥21॥\n" +
                    "\n" +
                    "भावार्थ  :-  वे ही देवताओं के समूह आप में प्रवेश करते हैं और कुछ भयभीत होकर हाथ जोड़े आपके नाम और गुणों का उच्चारण करते हैं तथा महर्षि और सिद्धों के समुदाय 'कल्याण हो' ऐसा कहकर उत्तम-उत्तम स्तोत्रों द्वारा आपकी स्तुति करते हैं\n" +
                    " ॥21॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==20)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "रुद्रादित्या वसवो ये च साध्याविश्वेऽश्विनौ मरुतश्चोष्मपाश्च।\n" +
                    " गंधर्वयक्षासुरसिद्धसङ्घावीक्षन्ते त्वां विस्मिताश्चैव सर्वे  ॥22॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो ग्यारह रुद्र और बारह आदित्य तथा आठ वसु, साध्यगण, विश्वेदेव, अश्विनीकुमार तथा मरुद्गण और पितरों का समुदाय तथा गंधर्व, यक्ष, राक्षस और सिद्धों के समुदाय हैं- वे सब ही विस्मित होकर आपको देखते हैं\n" +
                    " ॥22॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==21)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "रूपं महत्ते बहुवक्त्रनेत्रंमहाबाहो बहुबाहूरूपादम्।\n" +
                    " बहूदरं बहुदंष्ट्राकरालंदृष्टवा लोकाः प्रव्यथितास्तथाहम्  ॥23॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे महाबाहो! आपके बहुत मुख और नेत्रों वाले, बहुत हाथ, जंघा और पैरों वाले, बहुत उदरों वाले और बहुत-सी दाढ़ों के कारण अत्यन्त विकराल महान रूप को देखकर सब लोग व्याकुल हो रहे हैं तथा मैं भी व्याकुल हो रहा हूँ\n" +
                    " ॥23॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==22)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "नभःस्पृशं दीप्तमनेकवर्णंव्यात्ताननं दीप्तविशालनेत्रम्।\n" +
                    " दृष्टवा हि त्वां प्रव्यथितान्तरात्मा धृतिं न विन्दामि शमं च विष्णो  ॥24॥\n" +
                    "\n" +
                    "भावार्थ  :-  क्योंकि हे विष्णो! आकाश को स्पर्श करने वाले, दैदीप्यमान, अनेक वर्णों से युक्त तथा फैलाए हुए मुख और प्रकाशमान विशाल नेत्रों से युक्त आपको देखकर भयभीत अन्तःकरण वाला मैं धीरज और शान्ति नहीं पाता हूँ\n" +
                    " ॥24॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==23)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "दंष्ट्राकरालानि च ते मुखानिदृष्टैव कालानलसन्निभानि।\n" +
                    " दिशो न जाने न लभे च शर्म प्रसीद देवेश जगन्निवास  ॥25॥\n" +
                    "\n" +
                    "भावार्थ  :-  दाढ़ों के कारण विकराल और प्रलयकाल की अग्नि के समान प्रज्वलित आपके मुखों को देखकर मैं दिशाओं को नहीं जानता हूँ और सुख भी नहीं पाता हूँ। इसलिए हे देवेश! हे जगन्निवास! आप प्रसन्न हों\n" +
                    " ॥25॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==24)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "अमी च त्वां धृतराष्ट्रस्य पुत्राः सर्वे सहैवावनिपालसंघैः।\n" +
                    " भीष्मो द्रोणः सूतपुत्रस्तथासौ सहास्मदीयैरपि योधमुख्यैः  ॥26॥\n" +
                    " वक्त्राणि ते त्वरमाणा विशन्ति दंष्ट्राकरालानि भयानकानि।\n" +
                    " केचिद्विलग्ना दशनान्तरेषु सन्दृश्यन्ते चूर्णितैरुत्तमाङ्गै  ॥27॥\n" +
                    "\n" +
                    "भावार्थ  :-  वे सभी धृतराष्ट्र के पुत्र राजाओं के समुदाय सहित आप में प्रवेश कर रहे हैं और भीष्म पितामह, द्रोणाचार्य तथा वह कर्ण और हमारे पक्ष के भी प्रधान योद्धाओं के सहित सबके सब आपके दाढ़ों के कारण विकराल भयानक मुखों में बड़े वेग से दौड़ते हुए प्रवेश कर रहे हैं और कई एक चूर्ण हुए सिरों सहित आपके दाँतों के बीच में लगे हुए दिख रहे हैं\n" +
                    " ॥26-27॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==25)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "यथा नदीनां बहवोऽम्बुवेगाः समुद्रमेवाभिमुखा द्रवन्ति।\n" +
                    " तथा तवामी नरलोकवीराविशन्ति वक्त्राण्यभिविज्वलन्ति  ॥28॥\n" +
                    "\n" +
                    "भावार्थ  :-  जैसे नदियों के बहुत-से जल के प्रवाह स्वाभाविक ही समुद्र के ही सम्मुख दौड़ते हैं अर्थात समुद्र में प्रवेश करते हैं, वैसे ही वे नरलोक के वीर भी आपके प्रज्वलित मुखों में प्रवेश कर रहे हैं\n" +
                    " ॥28॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==26)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "यथा प्रदीप्तं ज्वलनं पतंगाविशन्ति नाशाय समृद्धवेगाः।\n" +
                    " तथैव नाशाय विशन्ति लोकास्तवापि वक्त्राणि समृद्धवेगाः  ॥29॥\n" +
                    "\n" +
                    "भावार्थ  :-  जैसे पतंग मोहवश नष्ट होने के लिए प्रज्वलित अग्नि में अतिवेग से दौड़ते हुए प्रवेश करते हैं, वैसे ही ये सब लोग भी अपने नाश के लिए आपके मुखों में अतिवेग से दौड़ते हुए प्रवेश कर रहे हैं\n" +
                    " ॥29॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==27)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "लेलिह्यसे ग्रसमानः समन्ताल्लोकान्समग्रान्वदनैर्ज्वलद्भिः।\n" +
                    " तेजोभिरापूर्य जगत्समग्रंभासस्तवोग्राः प्रतपन्ति विष्णो  ॥30॥\n" +
                    "\n" +
                    "भावार्थ  :-  आप उन सम्पूर्ण लोकों को प्रज्वलित मुखों द्वारा ग्रास करते हुए सब ओर से बार-बार चाट रहे हैं। हे विष्णो! आपका उग्र प्रकाश सम्पूर्ण जगत को तेज द्वारा परिपूर्ण करके तपा रहा है\n" +
                    " ॥30॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==28)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "आख्याहि मे को भवानुग्ररूपोनमोऽस्तु ते देववर प्रसीद।\n" +
                    " विज्ञातुमिच्छामि भवन्तमाद्यंन हि प्रजानामि तव प्रवृत्तिम्  ॥31॥\n" +
                    "\n" +
                    "भावार्थ  :-  मुझे बतलाइए कि आप उग्ररूप वाले कौन हैं? हे देवों में श्रेष्ठ! आपको नमस्कार हो। आप प्रसन्न होइए। आदि पुरुष आपको मैं विशेष रूप से जानना चाहता हूँ क्योंकि मैं आपकी प्रवृत्ति को नहीं जानता\n" +
                    " ॥31॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==29)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "(भगवान द्वारा अपने प्रभाव का वर्णन और अर्जुन को युद्ध के लिए उत्साहित करना) \n" +
                    " श्रीभगवानुवाच  :-\n" +
                    " कालोऽस्मि लोकक्षयकृत्प्रवृद्धोलोकान्समाहर्तुमिह प्रवृत्तः।\n" +
                    " ऋतेऽपि त्वां न भविष्यन्ति सर्वे येऽवस्थिताः प्रत्यनीकेषु योधाः  ॥32॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान बोले- मैं लोकों का नाश करने वाला बढ़ा हुआ महाकाल हूँ। इस समय इन लोकों को नष्ट करने के लिए प्रवृत्त हुआ हूँ। इसलिए जो प्रतिपक्षियों की सेना में स्थित योद्धा लोग हैं, वे सब तेरे बिना भी नहीं रहेंगे अर्थात तेरे युद्ध न करने पर भी इन सबका नाश हो जाएगा\n" +
                    " ॥32॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==30)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "तस्मात्त्वमुक्तिष्ठ यशो लभस्व जित्वा शत्रून्भुङ्क्ष्व राज्यं समृद्धम्।\n" +
                    " मयैवैते निहताः पूर्वमेव निमित्तमात्रं भव सव्यसाचिन्  ॥33॥\n" +
                    "\n" +
                    "भावार्थ  :-  अतएव तू उठ! यश प्राप्त कर और शत्रुओं को जीतकर धन-धान्य से सम्पन्न राज्य को भोग। ये सब शूरवीर पहले ही से मेरे ही द्वारा मारे हुए हैं। हे सव्यसाचिन! (बाएँ हाथ से भी बाण चलाने का अभ्यास होने से अर्जुन का नाम 'सव्यसाची' हुआ था) तू तो केवल निमित्तमात्र बन जा\n" +
                    " ॥33॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==31)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "द्रोणं च भीष्मं च जयद्रथं च कर्णं तथान्यानपि योधवीरान्।\n" +
                    " मया हतांस्त्वं जहि मा व्यथिष्ठायुध्यस्व जेतासि रणे सपत्नान्  ॥34॥\n" +
                    "\n" +
                    "भावार्थ  :-  द्रोणाचार्य और भीष्म पितामह तथा जयद्रथ और कर्ण तथा और भी बहुत से मेरे द्वारा मारे हुए शूरवीर योद्धाओं को तू मार। भय मत कर। निःसंदेह तू युद्ध में वैरियों को जीतेगा। इसलिए युद्ध कर\n" +
                    " ॥34॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==32)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "(भयभीत हुए अर्जुन द्वारा भगवान की स्तुति और चतुर्भुज रूप का दर्शन कराने के लिए प्रार्थना) \n" +
                    " संजय उवाच  :-\n" +
                    " एतच्छ्रुत्वा वचनं केशवस्य कृतांजलिर्वेपमानः किरीटी।\n" +
                    " नमस्कृत्वा भूय एवाह कृष्णंसगद्गदं भीतभीतः प्रणम्य  ॥35॥\n" +
                    "\n" +
                    "भावार्थ  :-  संजय बोले- केशव भगवान के इस वचन को सुनकर मुकुटधारी अर्जुन हाथ जोड़कर काँपते हुए नमस्कार करके, फिर भी अत्यन्त भयभीत होकर प्रणाम करके भगवान श्रीकृष्ण के प्रति गद्गद् वाणी से बोले\n" +
                    " ॥35॥ \n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==33)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "अर्जुन उवाच  :-\n" +
                    " स्थाने हृषीकेश तव प्रकीर्त्या जगत्प्रहृष्यत्यनुरज्यते च।\n" +
                    " रक्षांसि भीतानि दिशो द्रवन्ति सर्वे नमस्यन्ति च सिद्धसङ्घा:   ॥36॥\n" +
                    "\n" +
                    "भावार्थ  :-  अर्जुन बोले- हे अन्तर्यामिन्! यह योग्य ही है कि आपके नाम, गुण और प्रभाव के कीर्तन से जगत अति हर्षित हो रहा है और अनुराग को भी प्राप्त हो रहा है तथा भयभीत राक्षस लोग दिशाओं में भाग रहे हैं और सब सिद्धगणों के समुदाय नमस्कार कर रहे हैं\n" +
                    " ॥36॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==34)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "कस्माच्च ते न नमेरन्महात्मन् गरीयसे ब्रह्मणोऽप्यादिकर्त्रे।\n" +
                    " अनन्त देवेश जगन्निवास त्वमक्षरं सदसत्तत्परं यत्  ॥37॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे महात्मन्! ब्रह्मा के भी आदिकर्ता और सबसे बड़े आपके लिए वे कैसे नमस्कार न करें क्योंकि हे अनन्त! हे देवेश! हे जगन्निवास! जो सत्, असत् और उनसे परे अक्षर अर्थात सच्चिदानन्दघन ब्रह्म है, वह आप ही हैं\n" +
                    " ॥37॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==35)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "त्वमादिदेवः पुरुषः पुराणस्त्वमस्य विश्वस्य परं निधानम्।\n" +
                    " वेत्तासि वेद्यं च परं च धाम त्वया ततं विश्वमनन्तरूप  ॥38॥\n" +
                    "\n" +
                    "भावार्थ  :-  आप आदिदेव और सनातन पुरुष हैं, आप इन जगत के परम आश्रय और जानने वाले तथा जानने योग्य और परम धाम हैं। हे अनन्तरूप! आपसे यह सब जगत व्याप्त अर्थात परिपूर्ण हैं\n" +
                    " ॥38॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==36)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "वायुर्यमोऽग्निर्वरुणः शशाङ्क: प्रजापतिस्त्वं प्रपितामहश्च।\n" +
                    " नमो नमस्तेऽस्तु सहस्रकृत्वः पुनश्च भूयोऽपि नमो नमस्ते  ॥39॥\n" +
                    "\n" +
                    "भावार्थ  :-  आप वायु, यमराज, अग्नि, वरुण, चन्द्रमा, प्रजा के स्वामी ब्रह्मा और ब्रह्मा के भी पिता हैं। आपके लिए हजारों बार नमस्कार! नमस्कार हो!! आपके लिए फिर भी बार-बार नमस्कार! नमस्कार!!\n" +
                    " ॥39॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==37)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "नमः पुरस्तादथ पृष्ठतस्ते नमोऽस्तु ते सर्वत एव सर्व। \n" +
                    " अनन्तवीर्यामितविक्रमस्त्वंसर्वं समाप्नोषि ततोऽसि सर्वः  ॥40॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अनन्त सामर्थ्यवाले! आपके लिए आगे से और पीछे से भी नमस्कार! हे सर्वात्मन्! आपके लिए सब ओर से ही नमस्कार हो, क्योंकि अनन्त पराक्रमशाली आप समस्त संसार को व्याप्त किए हुए हैं, इससे आप ही सर्वरूप हैं\n" +
                    " ॥40॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==38)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "सखेति मत्वा प्रसभं यदुक्तं हे कृष्ण हे यादव हे सखेति।\n" +
                    " अजानता महिमानं तवेदंमया प्रमादात्प्रणयेन वापि  ॥41॥\n" +
                    " यच्चावहासार्थमसत्कृतोऽसि विहारशय्यासनभोजनेषु।\n" +
                    " एकोऽथवाप्यच्युत तत्समक्षंतत्क्षामये त्वामहमप्रमेयम्  ॥42॥\n" +
                    "\n" +
                    "भावार्थ  :-  आपके इस प्रभाव को न जानते हुए, आप मेरे सखा हैं ऐसा मानकर प्रेम से अथवा प्रमाद से भी मैंने 'हे कृष्ण!', 'हे यादव !' 'हे सखे!' इस प्रकार जो कुछ बिना सोचे-समझे हठात् कहा है और हे अच्युत! आप जो मेरे द्वारा विनोद के लिए विहार, शय्या, आसन और भोजनादि में अकेले अथवा उन सखाओं के सामने भी अपमानित किए गए हैं- वह सब अपराध अप्रमेयस्वरूप अर्थात अचिन्त्य प्रभाव वाले आपसे मैं क्षमा करवाता हूँ\n" +
                    " ॥41-42॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==39)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "पितासि लोकस्य चराचरस्य त्वमस्य पूज्यश्च गुरुर्गरीयान्।\n" +
                    " न त्वत्समोऽस्त्यभ्यधिकः कुतोऽन्योलोकत्रयेऽप्यप्रतिमप्रभाव  ॥43॥\n" +
                    "\n" +
                    "भावार्थ  :-  आप इस चराचर जगत के पिता और सबसे बड़े गुरु एवं अति पूजनीय हैं। हे अनुपम प्रभाववाले! तीनों लोकों में आपके समान भी दूसरा कोई नहीं हैं, फिर अधिक तो कैसे हो सकता है\n" +
                    " ॥43॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==40)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "तस्मात्प्रणम्य प्रणिधाय कायंप्रसादये त्वामहमीशमीड्यम्।\n" +
                    " पितेव पुत्रस्य सखेव सख्युः प्रियः प्रियायार्हसि देव सोढुम्  ॥44॥\n" +
                    "\n" +
                    "भावार्थ  :-  अतएव हे प्रभो! मैं शरीर को भलीभाँति चरणों में निवेदित कर, प्रणाम करके, स्तुति करने योग्य आप ईश्वर को प्रसन्न होने के लिए प्रार्थना करता हूँ। हे देव! पिता जैसे पुत्र के, सखा जैसे सखा के और पति जैसे प्रियतमा पत्नी के अपराध सहन करते हैं- वैसे ही आप भी मेरे अपराध को सहन करने योग्य हैं।\n" +
                    " ॥44॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==41)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "अदृष्टपूर्वं हृषितोऽस्मि दृष्ट्वा भयेन च प्रव्यथितं मनो मे।\n" +
                    " तदेव मे दर्शय देवरूपंप्रसीद देवेश जगन्निवास ॥45॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं पहले न देखे हुए आपके इस आश्चर्यमय रूप को देखकर हर्षित हो रहा हूँ और मेरा मन भय से अति व्याकुल भी हो रहा है, इसलिए आप उस अपने चतुर्भुज विष्णु रूप को ही मुझे दिखलाइए। हे देवेश! हे जगन्निवास! प्रसन्न होइए\n" +
                    " ॥45॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==42)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "किरीटिनं गदिनं चक्रहस्तमिच्छामि त्वां द्रष्टुमहं तथैव।\n" +
                    " तेनैव रूपेण चतुर्भुजेनसहस्रबाहो भव विश्वमूर्ते  ॥46॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं वैसे ही आपको मुकुट धारण किए हुए तथा गदा और चक्र हाथ में लिए हुए देखना चाहता हूँ। इसलिए हे विश्वस्वरूप! हे सहस्रबाहो! आप उसी चतुर्भुज रूप से प्रकट होइए\n" +
                    " ॥46॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==43)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "(भगवान द्वारा अपने विश्वरूप के दर्शन की महिमा का कथन तथा चतुर्भुज और सौम्य रूप का दिखाया जाना) \n" +
                    " श्रीभगवानुवाच   :-\n" +
                    " मया प्रसन्नेन तवार्जुनेदंरूपं परं दर्शितमात्मयोगात्।\n" +
                    " तेजोमयं विश्वमनन्तमाद्यंयन्मे त्वदन्येन न दृष्टपूर्वम्  ॥47॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान बोले- हे अर्जुन! अनुग्रहपूर्वक मैंने अपनी योगशक्ति के प्रभाव से यह मेरे परम तेजोमय, सबका आदि और सीमारहित विराट् रूप तुझको दिखाया है, जिसे तेरे अतिरिक्त दूसरे किसी ने पहले नहीं देखा था\n" +
                    " ॥47॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==44)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "न वेदयज्ञाध्ययनैर्न दानैर्न च क्रियाभिर्न तपोभिरुग्रैः।\n" +
                    " एवं रूपः शक्य अहं नृलोके द्रष्टुं त्वदन्येन कुरुप्रवीर  ॥48॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! मनुष्य लोक में इस प्रकार विश्व रूप वाला मैं न वेद और यज्ञों के अध्ययन से, न दान से, न क्रियाओं से और न उग्र तपों से ही तेरे अतिरिक्त दूसरे द्वारा देखा जा सकता हूँ।48॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==45)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "मा ते व्यथा मा च विमूढभावोदृष्ट्वा रूपं घोरमीदृङ्ममेदम्।\n" +
                    " व्यतेपभीः प्रीतमनाः पुनस्त्वंतदेव मे रूपमिदं प्रपश्य  ॥49॥\n" +
                    "\n" +
                    "भावार्थ  :-  मेरे इस प्रकार के इस विकराल रूप को देखकर तुझको व्याकुलता नहीं होनी चाहिए और मूढ़भाव भी नहीं होना चाहिए। तू भयरहित और प्रीतियुक्त मनवाला होकर उसी मेरे इस शंख-चक्र-गदा-पद्मयुक्त चतुर्भुज रूप को फिर देख\n" +
                    " ॥49॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==46)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "संजय उवाच  :-\n" +
                    " इत्यर्जुनं वासुदेवस्तथोक्त्वा स्वकं रूपं दर्शयामास भूयः।\n" +
                    " आश्वासयामास च भीतमेनंभूत्वा पुनः सौम्यवपुर्महात्मा  ॥50॥\n" +
                    "\n" +
                    "भावार्थ  :-  संजय बोले- वासुदेव भगवान ने अर्जुन के प्रति इस प्रकार कहकर फिर वैसे ही अपने चतुर्भुज रूप को दिखाया और फिर महात्मा श्रीकृष्ण ने सौम्यमूर्ति होकर इस भयभीत अर्जुन को धीरज दिया\n" +
                    " ॥50॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==47)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "(बिना अनन्य भक्ति के चतुर्भुज रूप के दर्शन की दुर्लभता का और फलसहित अनन्य भक्ति का कथन) ) \n" +
                    " अर्जुन उवाच  :-\n" +
                    " दृष्ट्वेदं मानुषं रूपं तव सौम्यं जनार्दन।\n" +
                    " इदानीमस्मि संवृत्तः सचेताः प्रकृतिं गतः  ॥51॥\n" +
                    "\n" +
                    "भावार्थ  :-  अर्जुन बोले- हे जनार्दन! आपके इस अतिशांत मनुष्य रूप को देखकर अब मैं स्थिरचित्त हो गया हूँ और अपनी स्वाभाविक स्थिति को प्राप्त हो गया हूँ\n" +
                    " ॥51॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==48)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "श्रीभगवानुवाच  :-\n" +
                    " सुदुर्दर्शमिदं रूपं दृष्टवानसि यन्मम।\n" +
                    " देवा अप्यस्य रूपस्य नित्यं दर्शनकाङ्क्षिणः  ॥52॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान बोले- मेरा जो चतुर्भज रूप तुमने देखा है, वह सुदुर्दर्श है अर्थात् इसके दर्शन बड़े ही दुर्लभ हैं। देवता भी सदा इस रूप के दर्शन की आकांक्षा करते रहते हैं\n" +
                    " ॥52॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==49)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "नाहं वेदैर्न तपसा न दानेन न चेज्यया।\n" +
                    " शक्य एवं विधो द्रष्टुं दृष्ट्वानसि मां यथा  ॥53॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिस प्रकार तुमने मुझको देखा है- इस प्रकार चतुर्भुज रूप वाला मैं न वेदों से, न तप से, न दान से और न यज्ञ से ही देखा जा सकता हूँ\n" +
                    " ॥53॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==50)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "भक्त्या त्वनन्यया शक्य अहमेवंविधोऽर्जुन।\n" +
                    " ज्ञातुं द्रष्टुं च तत्वेन प्रवेष्टुं च परन्तप  ॥54॥\n" +
                    "\n" +
                    "भावार्थ  :-  परन्तु हे परंतप अर्जुन! अनन्य भक्ति (अनन्यभक्ति का भाव अगले श्लोक में विस्तारपूर्वक कहा है।) के द्वारा इस प्रकार चतुर्भुज रूपवाला मैं प्रत्यक्ष देखने के लिए, तत्व से जानने के लिए तथा प्रवेश करने के लिए अर्थात एकीभाव से प्राप्त होने के लिए भी शक्य हूँ\n" +
                    " ॥54॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }
        else if(position==51)
        {
            ElevenFragment elevenFragment=new ElevenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message11", "मत्कर्मकृन्मत्परमो मद्भक्तः सङ्गवर्जितः।\n" +
                    " निर्वैरः सर्वभूतेषु यः स मामेति पाण्डव  ॥55॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! जो पुरुष केवल मेरे ही लिए सम्पूर्ण कर्तव्य कर्मों को करने वाला है, मेरे परायण है, मेरा भक्त है, आसक्तिरहित है और सम्पूर्ण भूतप्राणियों में वैरभाव से रहित है (सर्वत्र भगवद्बुद्धि हो जाने से उस पुरुष का अति अपराध करने वाले में भी वैरभाव नहीं होता है, फिर औरों में तो कहना ही क्या है), वह अनन्यभक्तियुक्त पुरुष मुझको ही प्राप्त होता है\n" +
                    " ॥55॥ \n" +
                    " \n" +
                    " ॐ तत्सदिति श्रीमद्भगवद्गीतासूपनिषत्सु ब्रह्मविद्यायांयोगशास्त्रे श्रीकृष्णार्जुनसंवादे विश्वरूपदर्शनयोगो नामैकादशोऽध्यायः\n" +
                    " ॥11॥\n");
            elevenFragment.setArguments(bundle);
            return  elevenFragment;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 52;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        if(position<=9)
        {
            return "श्लोक "+position;
        }
        else if(position==10)
        {
            return "श्लोक 10,11";
        }
        else if(position<=24)
        {
            position=position+1;
            return "श्लोक "+position;
        }
        else if(position==25)
        {
            return "श्लोक 26,27";
        }
        else if(position<=38)
        {
            position=position+2;
            return "श्लोक "+position;
        }
        else if(position<=52)
        {
            position=position+3;
            return "श्लोक "+position;
        }

        return  null;
    }
}
