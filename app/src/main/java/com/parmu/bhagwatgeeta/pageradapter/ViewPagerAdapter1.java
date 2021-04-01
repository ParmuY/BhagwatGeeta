package com.parmu.bhagwatgeeta.pageradapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.parmu.bhagwatgeeta.fragments.Fragment1;

public class ViewPagerAdapter1 extends FragmentStatePagerAdapter {
    public ViewPagerAdapter1(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "धृतराष्ट्र उवाच    :-\n" +
                    "धर्मक्षेत्रे कुरुक्षेत्रे समवेता युयुत्सवः।\n" +
                    " मामकाः पाण्डवाश्चैव किमकुर्वत संजय ॥1॥\n" +
                    "\n" +
                    "भावार्थ  :- धृतराष्ट्र बोले- हे संजय! धर्मभूमि कुरुक्षेत्र में एकत्रित, युद्ध की इच्छावाले मेरे और पाण्डु के पुत्रों ने क्या किया?   ॥1॥\n");
            fragment1.setArguments(bundle);
            return fragment1;

        }

        else if (position==1)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "संजय उवाच    :-\n" +
                    "दृष्टवा तु पाण्डवानीकं व्यूढं दुर्योधनस्तदा।\n" +
                    " आचार्यमुपसंगम्य राजा वचनमब्रवीत्   ॥2॥\n" +"\n"+
                    "भावार्थ  :- संजय बोले- उस समय राजा दुर्योधन ने व्यूहरचनायुक्त पाण्डवों की सेना को देखा और द्रोणाचार्य के पास जाकर यह वचन कहा\n"+ "॥2॥\n");
            fragment1.setArguments(bundle);
            return fragment1;

        }

        else if (position==2)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "पश्यैतां पाण्डुपुत्राणामाचार्य महतीं चमूम्।\n" +
                    " व्यूढां द्रुपदपुत्रेण तव शिष्येण धीमता ॥3॥\n" +
                    "\n" +
                    "भावार्थ  :- हे आचार्य! आपके बुद्धिमान् शिष्य द्रुपदपुत्र धृष्टद्युम्न द्वारा व्यूहाकार खड़ी की हुई पाण्डुपुत्रों की इस बड़ी भारी सेना को देखिए\n" +
                    " ॥3॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==3)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "अत्र शूरा महेष्वासा भीमार्जुनसमा युधि।\n" +
                    " युयुधानो विराटश्च द्रुपदश्च महारथः ॥4॥\n" +
                    " धृष्टकेतुश्चेकितानः काशिराजश्च वीर्यवान्।\n" +
                    " पुरुजित्कुन्तिभोजश्च शैब्यश्च नरपुङवः ॥5॥\n" +
                    " युधामन्युश्च विक्रान्त उत्तमौजाश्च वीर्यवान्।\n" +
                    " सौभद्रो द्रौपदेयाश्च सर्व एव महारथाः ॥6॥\n" +
                    "\n" +
                    "भावार्थ  :- इस सेना में बड़े-बड़े धनुषों वाले तथा युद्ध में भीम और अर्जुन के समान शूरवीर सात्यकि और विराट तथा महारथी राजा द्रुपद, धृष्टकेतु और चेकितान तथा बलवान काशिराज, पुरुजित, कुन्तिभोज और मनुष्यों में श्रेष्ठ शैब्य, पराक्रमी युधामन्यु तथा बलवान उत्तमौजा, सुभद्रापुत्र अभिमन्यु एवं द्रौपदी के पाँचों पुत्र- ये सभी महारथी हैं  " +
                    "॥4-6॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==4)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "अस्माकं तु विशिष्टा ये तान्निबोध द्विजोत्तम।\n" +
                    " नायका मम सैन्यस्य सञ्ज्ञार्थं तान्ब्रवीमि ते ॥7॥\n" +
                    "\n" +
                    "भावार्थ  :- हे ब्राह्मणश्रेष्ठ! अपने पक्ष में भी जो प्रधान हैं, उनको आप समझ लीजिए। आपकी जानकारी के लिए मेरी सेना के जो-जो सेनापति हैं, उनको बतलाता हूँ  ॥7॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==5)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "\n" +
                    "भवान्भीष्मश्च कर्णश्च कृपश्च समितिञ्जयः।\n" +
                    " अश्वत्थामा विकर्णश्च सौमदत्तिस्तथैव च  ॥8॥\n" +
                    "\n" +
                    "भावार्थ  :- आप-द्रोणाचार्य और पितामह भीष्म तथा कर्ण और संग्रामविजयी कृपाचार्य तथा वैसे ही अश्वत्थामा, विकर्ण और सोमदत्त का पुत्र भूरिश्रवा\n"+ "॥8॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==6)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "अन्ये च बहवः शूरा मदर्थे त्यक्तजीविताः।\n" +
                    " नानाशस्त्रप्रहरणाः सर्वे युद्धविशारदाः ॥9॥\n" +
                    "\n" +
                    "भावार्थ  :- और भी मेरे लिए जीवन की आशा त्याग देने वाले बहुत-से शूरवीर अनेक प्रकार के शस्त्रास्त्रों से सुसज्जित और सब-के-सब युद्ध में चतुर हैं  ॥9॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==7)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "अपर्याप्तं तदस्माकं बलं भीष्माभिरक्षितम्।\n" +
                    " पर्याप्तं त्विदमेतेषां बलं भीमाभिरक्षितम्  ॥10॥\n" +
                    "\n" +
                    " भावार्थ  :- भीष्म पितामह द्वारा रक्षित हमारी वह सेना सब प्रकार से अजेय है और भीम द्वारा रक्षित इन लोगों की यह सेना जीतने में सुगम है  ॥10॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==8)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "अयनेषु च सर्वेषु यथाभागमवस्थिताः।\n" +
                    " भीष्ममेवाभिरक्षन्तु भवन्तः सर्व एव हि ॥11॥\n" +
                    "\n" +
                    "भावार्थ  :- इसलिए सब मोर्चों पर अपनी-अपनी जगह स्थित रहते हुए आप लोग सभी निःसंदेह भीष्म पितामह की ही सब ओर से रक्षा करें  ॥11॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==9)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "(दोनों सेनाओं की शंख-ध्वनि का कथन) \n" +
                    " तस्य सञ्जनयन्हर्षं कुरुवृद्धः पितामहः।\n" +
                    " सिंहनादं विनद्योच्चैः शंख दध्मो प्रतापवान् ॥12॥\n" +
                    "\n" +
                    "भावार्थ  :- कौरवों में वृद्ध बड़े प्रतापी पितामह भीष्म ने उस दुर्योधन के हृदय में हर्ष उत्पन्न करते हुए उच्च स्वर से सिंह की दहाड़ के समान गरजकर शंख बजाया  ॥12॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==10)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "ततः शंखाश्च भेर्यश्च पणवानकगोमुखाः।\n" +
                    " सहसैवाभ्यहन्यन्त स शब्दस्तुमुलोऽभवत् ॥13॥\n" +
                    "\n" +
                    "भावार्थ  :- इसके पश्चात शंख और नगाड़े तथा ढोल, मृदंग और नरसिंघे आदि बाजे एक साथ ही बज उठे। उनका वह शब्द बड़ा भयंकर हुआ  ॥13॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==11)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "ततः श्वेतैर्हयैर्युक्ते महति स्यन्दने स्थितौ।\n" +
                    " माधवः पाण्डवश्चैव दिव्यौ शंखौ प्रदध्मतुः  ॥14॥\n" +
                    "\n" +
                    "भावार्थ  :- इसके अनन्तर सफेद घोड़ों से युक्त उत्तम रथ में बैठे हुए श्रीकृष्ण महाराज और अर्जुन ने भी अलौकिक शंख बजाए   ॥14॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==12)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "पाञ्चजन्यं हृषीकेशो देवदत्तं धनञ्जयः।\n" +
                    " पौण्ड्रं दध्मौ महाशंख भीमकर्मा वृकोदरः  ॥15॥\n" +
                    "\n" +
                    "भावार्थ  :- श्रीकृष्ण महाराज ने पाञ्चजन्य नामक, अर्जुन ने देवदत्त नामक और भयानक कर्मवाले भीमसेन ने पौण्ड्र नामक महाशंख बजाया ॥15॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==13)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "अनन्तविजयं राजा कुन्तीपुत्रो युधिष्ठिरः।\n" +
                    " नकुलः सहदेवश्च सुघोषमणिपुष्पकौ  ॥16॥\n" +
                    "\n" +
                    "भावार्थ  :- कुन्तीपुत्र राजा युधिष्ठिर ने अनन्तविजय नामक और नकुल तथा सहदेव ने सुघोष और मणिपुष्पक नामक शंख बजाए   ॥16॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==14)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "काश्यश्च परमेष्वासः शिखण्डी च महारथः।\n" +
                    " धृष्टद्युम्नो विराटश्च सात्यकिश्चापराजितः  ॥17॥\n" +
                    " द्रुपदो द्रौपदेयाश्च सर्वशः पृथिवीपते।\n" +
                    " सौभद्रश्च महाबाहुः शंखान्दध्मुः पृथक्पृथक्  ॥18॥\n" +
                    "\n" +
                    "भावार्थ  :- श्रेष्ठ धनुष वाले काशिराज और महारथी शिखण्डी एवं धृष्टद्युम्न तथा राजा विराट और अजेय सात्यकि, राजा द्रुपद एवं द्रौपदी के पाँचों पुत्र और बड़ी भुजावाले सुभद्रा पुत्र अभिमन्यु- इन सभी ने, हे राजन्! सब ओर से अलग-अलग शंख बजाए \n"+"॥17-18॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==15)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "स घोषो धार्तराष्ट्राणां हृदयानि व्यदारयत्।\n" +
                    " नभश्च पृथिवीं चैव तुमुलो व्यनुनादयन्  ॥19॥\n" +
                    "\n" +
                    "भावार्थ  :- और उस भयानक शब्द ने आकाश और पृथ्वी को भी गुंजाते हुए धार्तराष्ट्रों के अर्थात आपके पक्षवालों के हृदय विदीर्ण कर दिए  ॥19॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==16)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "(अर्जुन द्वारा सेना-निरीक्षण का प्रसंग)\n" +
                    " अथ व्यवस्थितान्दृष्ट्वा धार्तराष्ट्रान् कपिध्वजः।\n" +
                    " प्रवृत्ते शस्त्रसम्पाते धनुरुद्यम्य पाण्डवः  ॥20॥ \n" +
                    " हृषीकेशं तदा वाक्यमिदमाह महीपते। \n" +
                    " अर्जुन उवाचः \n" +
                    " सेनयोरुभयोर्मध्ये रथं स्थापय मेऽच्युत  ॥21॥\n" +
                    "\n" +
                    "भावार्थ  :- हे राजन्! इसके बाद कपिध्वज अर्जुन ने मोर्चा बाँधकर डटे हुए धृतराष्ट्र-संबंधियों को देखकर, उस शस्त्र चलने की तैयारी के समय धनुष उठाकर हृषीकेश श्रीकृष्ण महाराज से यह वचन कहा- हे अच्युत! मेरे रथ को दोनों सेनाओं के बीच में खड़ा कीजिए  ॥20-21॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==17)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "यावदेतान्निरीक्षेऽहं योद्धुकामानवस्थितान्।\n" +
                    " कैर्मया सह योद्धव्यमस्मिन् रणसमुद्यमे  ॥22॥\n" +
                    "\n" +
                    "भावार्थ  :- और जब तक कि मैं युद्ध क्षेत्र में डटे हुए युद्ध के अभिलाषी इन विपक्षी योद्धाओं को भली प्रकार देख न लूँ कि इस युद्ध रूप व्यापार में मुझे किन-किन के साथ युद्ध करना योग्य है, तब तक उसे खड़ा रखिए  ॥22॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==18)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "योत्स्यमानानवेक्षेऽहं य एतेऽत्र समागताः।\n" +
                    " धार्तराष्ट्रस्य दुर्बुद्धेर्युद्धे प्रियचिकीर्षवः ॥23॥\n" +
                    "\n" +
                    "भावार्थ  :- दुर्बुद्धि दुर्योधन का युद्ध में हित चाहने वाले जो-जो ये राजा लोग इस सेना में आए हैं, इन युद्ध करने वालों को मैं देखूँगा  ॥23॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==19)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "संजय उवाच    :-\n" +
                    " एवमुक्तो हृषीकेशो गुडाकेशेन भारत।\n" +
                    " सेनयोरुभयोर्मध्ये स्थापयित्वा रथोत्तमम्   ॥24॥\n" +
                    " भीष्मद्रोणप्रमुखतः सर्वेषां च महीक्षिताम्।\n" +
                    " उवाच पार्थ पश्यैतान् समवेतान् कुरूनिति  ॥25॥\n" +
                    "\n" +
                    "भावार्थ  :- संजय बोले- हे धृतराष्ट्र! अर्जुन द्वारा कहे अनुसार महाराज श्रीकृष्णचंद्र ने दोनों सेनाओं के बीच में भीष्म और द्रोणाचार्य के सामने तथा सम्पूर्ण राजाओं के सामने उत्तम रथ को खड़ा कर इस प्रकार कहा कि हे पार्थ! युद्ध के लिए जुटे हुए इन कौरवों को देख  ॥24-25॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==20)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "तत्रापश्यत्स्थितान् पार्थः पितृनथ पितामहान्।\n" +
                    " आचार्यान्मातुलान्भ्रातृन्पुत्रान्पौत्रान्सखींस्तथा  ॥26॥\n" +
                    " श्वशुरान् सुहृदश्चैव सेनयोरुभयोरपि।\n" +
                    "\n" +
                    "भावार्थ  :- इसके बाद पृथापुत्र अर्जुन ने उन दोनों ही सेनाओं में स्थित ताऊ-चाचों को, दादों-परदादों को, गुरुओं को, मामाओं को, भाइयों को, पुत्रों को, पौत्रों को तथा मित्रों को, ससुरों को और सुहृदों को भी देखा    ॥26 और 27वें का पूर्वार्ध॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==21)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "तान्समीक्ष्य स कौन्तेयः सर्वान् बन्धूनवस्थितान्  ॥27॥\n" +
                    " कृपया परयाविष्टो विषीदत्रिदमब्रवीत्।\n" +
                    "\n" +
                    "भावार्थ  :- उन उपस्थित सम्पूर्ण बंधुओं को देखकर वे कुंतीपुत्र अर्जुन अत्यन्त करुणा से युक्त होकर शोक करते हुए यह वचन बोले। \n" +
                    " ॥27वें का उत्तरार्ध और 28वें का पूर्वार्ध॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==22)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "अर्जुन उवाच   :-\n" +
                    " दृष्टेवमं स्वजनं कृष्ण युयुत्सुं समुपस्थितम् ॥28॥\n" +
                    " सीदन्ति मम गात्राणि मुखं च परिशुष्यति। \n" +
                    " वेपथुश्च शरीरे में रोमहर्षश्च जायते   ॥29॥\n" +
                    "\n" +
                    "भावार्थ  :- अर्जुन बोले- हे कृष्ण! युद्ध क्षेत्र में डटे हुए युद्ध के अभिलाषी इस स्वजनसमुदाय को देखकर मेरे अंग शिथिल हुए जा रहे हैं और मुख सूखा जा रहा है तथा मेरे शरीर में कम्प एवं रोमांच हो रहा है\n" +
                    " ॥28वें का उत्तरार्ध और 29॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==23)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "गाण्डीवं स्रंसते हस्तात्वक्चैव परिदह्यते।\n" +
                    " न च शक्नोम्यवस्थातुं भ्रमतीव च मे मनः  ॥30॥\n" +
                    "\n" +
                    "भावार्थ  :- हाथ से गांडीव धनुष गिर रहा है और त्वचा भी बहुत जल रही है तथा मेरा मन भ्रमित-सा हो रहा है, इसलिए मैं खड़ा रहने को भी समर्थ नहीं हूँ   ॥30॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==24)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "निमित्तानि च पश्यामि विपरीतानि केशव।\n" +
                    " न च श्रेयोऽनुपश्यामि हत्वा स्वजनमाहवे  ॥31॥\n" +
                    "\n" +
                    "भावार्थ  :- हे केशव! मैं लक्षणों को भी विपरीत ही देख रहा हूँ तथा युद्ध में स्वजन-समुदाय को मारकर कल्याण भी नहीं देखता   ॥31॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==25)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "न काङ्क्षे विजयं कृष्ण न च राज्यं सुखानि च।\n" +
                    " किं नो राज्येन गोविंद किं भोगैर्जीवितेन वा  ॥32॥\n" +
                    "\n" +
                    "\n" +
                    "भावार्थ  :- हे कृष्ण! मैं न तो विजय चाहता हूँ और न राज्य तथा सुखों को ही। हे गोविंद! हमें ऐसे राज्य से क्या प्रयोजन है अथवा ऐसे भोगों से और जीवन से भी क्या लाभ है?  ॥32॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==26)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "येषामर्थे काङक्षितं नो राज्यं भोगाः सुखानि च।\n" +
                    " त इमेऽवस्थिता युद्धे प्राणांस्त्यक्त्वा धनानि च  ॥33॥\n" +
                    "\n" +
                    "भावार्थ  :- हमें जिनके लिए राज्य, भोग और सुखादि अभीष्ट हैं, वे ही ये सब धन और जीवन की आशा को त्यागकर युद्ध में खड़े हैं  ॥33॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==27)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "आचार्याः पितरः पुत्रास्तथैव च पितामहाः।\n" +
                    " मातुलाः श्वशुराः पौत्राः श्यालाः संबंधिनस्तथा   ॥34॥\n" +
                    "\n" +
                    "भावार्थ  :- गुरुजन, ताऊ-चाचे, लड़के और उसी प्रकार दादे, मामे, ससुर, पौत्र, साले तथा और भी संबंधी लोग हैं   ॥34॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==28)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "एतान्न हन्तुमिच्छामि घ्नतोऽपि मधुसूदन।\n" +
                    " अपि त्रैलोक्यराज्यस्य हेतोः किं नु महीकृते  ॥35॥\n" +
                    "\n" +
                    "भावार्थ  :- हे मधुसूदन! मुझे मारने पर भी अथवा तीनों लोकों के राज्य के लिए भी मैं इन सबको मारना नहीं चाहता, फिर पृथ्वी के लिए तो कहना ही क्या है?  ॥35॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==29)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "निहत्य धार्तराष्ट्रान्न का प्रीतिः स्याज्जनार्दन।\n" +
                    " पापमेवाश्रयेदस्मान् हत्वैतानाततायिनः  ॥36॥\n" +
                    "\n" +
                    "भावार्थ  :- हे जनार्दन! धृतराष्ट्र के पुत्रों को मारकर हमें क्या प्रसन्नता होगी? इन आततायियों को मारकर तो हमें पाप ही लगेगा  ॥36॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==30)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "तस्मान्नार्हा वयं हन्तुं धार्तराष्ट्रान्स्वबान्धवान्।\n" +
                    " स्वजनं हि कथं हत्वा सुखिनः स्याम माधव  ॥37॥\n" +
                    "\n" +
                    "भावार्थ  :- अतएव हे माधव! अपने ही बान्धव धृतराष्ट्र के पुत्रों को मारने के लिए हम योग्य नहीं हैं क्योंकि अपने ही कुटुम्ब को मारकर हम कैसे सुखी होंगे?  ॥37॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==31)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "यद्यप्येते न पश्यन्ति लोभोपहतचेतसः।\n" +
                    " कुलक्षयकृतं दोषं मित्रद्रोहे च पातकम्  ॥38॥\n" +
                    " कथं न ज्ञेयमस्माभिः पापादस्मान्निवर्तितुम्।\n" +
                    " कुलक्षयकृतं दोषं प्रपश्यद्भिर्जनार्दन  ॥39॥\n" +
                    "\n" +
                    "भावार्थ  :- यद्यपि लोभ से भ्रष्टचित्त हुए ये लोग कुल के नाश से उत्पन्न दोष को और मित्रों से विरोध करने में पाप को नहीं देखते, तो भी हे जनार्दन! कुल के नाश से उत्पन्न दोष को जानने वाले हम लोगों को इस पाप से हटने के लिए क्यों नहीं विचार करना चाहिए? ॥38-39॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==32)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "कुलक्षये प्रणश्यन्ति कुलधर्माः सनातनाः।\n" +
                    " धर्मे नष्टे कुलं कृत्स्नमधर्मोऽभिभवत्युत ॥40॥\n" +
                    "\n" +
                    "भावार्थ  :- कुल के नाश से सनातन कुल-धर्म नष्ट हो जाते हैं तथा धर्म का नाश हो जाने पर सम्पूर्ण कुल में पाप भी बहुत फैल जाता है  ॥40॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==33)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "अधर्माभिभवात्कृष्ण प्रदुष्यन्ति कुलस्त्रियः।\n" +
                    " स्त्रीषु दुष्टासु वार्ष्णेय जायते वर्णसंकरः  ॥41॥\n" +
                    "\n" +
                    "भावार्थ  :- हे कृष्ण! पाप के अधिक बढ़ जाने से कुल की स्त्रियाँ अत्यन्त दूषित हो जाती हैं और हे वार्ष्णेय! स्त्रियों के दूषित हो जाने पर वर्णसंकर उत्पन्न होता है  ॥41॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==34)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "संकरो नरकायैव कुलघ्नानां कुलस्य च।\n" +
                    " पतन्ति पितरो ह्येषां लुप्तपिण्डोदकक्रियाः  ॥42॥\n" +
                    "\n" +
                    "भावार्थ  :- वर्णसंकर कुलघातियों को और कुल को नरक में ले जाने के लिए ही होता है। लुप्त हुई पिण्ड और जल की क्रिया वाले अर्थात श्राद्ध और तर्पण से वंचित इनके पितर लोग भी अधोगति को प्राप्त होते हैं   ॥42॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==35)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "दोषैरेतैः कुलघ्नानां वर्णसंकरकारकैः।\n" +
                    " उत्साद्यन्ते जातिधर्माः कुलधर्माश्च शाश्वताः  ॥43॥\n" +
                    "\n" +
                    "भावार्थ  :- इन वर्णसंकरकारक दोषों से कुलघातियों के सनातन कुल-धर्म और जाति-धर्म नष्ट हो जाते हैं\n" +
                    " ॥43॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==36)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "उत्सन्नकुलधर्माणां मनुष्याणां जनार्दन।\n" +
                    " नरकेऽनियतं वासो भवतीत्यनुशुश्रुम  ॥44॥\n" +
                    "\n" +
                    "भावार्थ  :- हे जनार्दन! जिनका कुल-धर्म नष्ट हो गया है, ऐसे मनुष्यों का अनिश्चितकाल तक नरक में वास होता है, ऐसा हम सुनते आए हैं  ॥44॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==37)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "अहो बत महत्पापं कर्तुं व्यवसिता वयम्।\n" +
                    " यद्राज्यसुखलोभेन हन्तुं स्वजनमुद्यताः   ॥45॥\n" +
                    "\n" +
                    "भावार्थ  :- हा! शोक! हम लोग बुद्धिमान होकर भी महान पाप करने को तैयार हो गए हैं, जो राज्य और सुख के लोभ से स्वजनों को मारने के लिए उद्यत हो गए हैं  ॥45॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==38)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "यदि मामप्रतीकारमशस्त्रं शस्त्रपाणयः।\n" +
                    " धार्तराष्ट्रा रणे हन्युस्तन्मे क्षेमतरं भवेत्  ॥46॥\n" +
                    "\n" +
                    "भावार्थ  :- यदि मुझ शस्त्ररहित एवं सामना न करने वाले को शस्त्र हाथ में लिए हुए धृतराष्ट्र के पुत्र रण में मार डालें तो वह मारना भी मेरे लिए अधिक कल्याणकारक होगा ॥46॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==39)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("message", "संजय उवाच    :-\n" +
                    " एवमुक्त्वार्जुनः सङ्ख्ये रथोपस्थ उपाविशत्।\n" +
                    " विसृज्य सशरं चापं शोकसंविग्नमानसः  ॥47॥\n" +
                    "\n" +
                    "भावार्थ  :- संजय बोले- रणभूमि में शोक से उद्विग्न मन वाले अर्जुन इस प्रकार कहकर, बाणसहित धनुष को त्यागकर रथ के पिछले भाग में बैठ गए  ॥47॥\n" +
                    "\n" +
                    "ॐ तत्सदिति श्रीमद्भगवद्गीतासूपनिषत्सु ब्रह्मविद्यायां योगशास्त्रे श्रीकृष्णार्जुनसंवादेऽर्जुनविषादयोगो नाम प्रथमोऽध्यायः। \n" +
                    " ॥1॥\n");
            fragment1.setArguments(bundle);
            return fragment1;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 40;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        if(position<=3)
        {
            return "श्लोक "+position;
        }
        else if(position==4)
        {
            return "श्लोक 4,5,6";
        }
        else if(position>=5&&position<=14)
        {
            position=position+2;
            return "श्लोक "+position;
        }
        else if(position==15)
        {
            return "श्लोक 17,18";
        }
        else if(position==16)
        {
            return "श्लोक 19";
        }
        else if(position==17)
        {
            return "श्लोक 20,21";
        }
        else if(position==18)
        {
            return "श्लोक 22";
        }
        else if (position==19)
        {
            return "श्लोक 23";
        }
        else if(position==20)
        {
            return "श्लोक 24,25";
        }
        else if(position==21)
        {
            return "श्लोक 26";
        }
        else if(position==22)
        {
            return "श्लोक 27";
        }
        else if(position==23)
        {
            return "श्लोक 28,29";
        }
        else if(position>=24&&position<=31)
        {
            position = position+6;
            return "श्लोक "+position;
        }
        else if(position==32)
        {
            return "श्लोक 38,39";
        }
        else if(position>=33&&position<=40)
        {
            position=position+7;
            return "श्लोक "+position;
        }
        return null;
    }


}
