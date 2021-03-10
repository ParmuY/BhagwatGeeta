package com.parmu.bhagwatgeeta.pageradapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.parmu.bhagwatgeeta.fragments.Fragment4;

public class ViewPagerAdapter4 extends FragmentStatePagerAdapter {
    public ViewPagerAdapter4(@NonNull FragmentManager fm, int behavior)
    {
        super(fm, behavior);
    }

    public ViewPagerAdapter4(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0)
        {
         Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","इमं विवस्वते योगं प्रोक्तवानहमव्ययम्।\n" +
                    "विवस्वान्मनवे प्राह मनुरिक्ष्वाकवेऽब्रवीत्  ॥1॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान बोले- मैंने इस अविनाशी योग को सूर्य से कहा था, सूर्य ने अपने पुत्र वैवस्वत मनु से कहा और मनु ने अपने पुत्र राजा इक्ष्वाकु से कहा\n" +
                    " ॥1॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 1)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","एवं परम्पराप्राप्तमिमं राजर्षयो विदुः।\n" +
                    " स कालेनेह महता योगो नष्टः परन्तप  ॥2॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे परन्तप अर्जुन! इस प्रकार परम्परा से प्राप्त इस योग को राजर्षियों ने जाना, किन्तु उसके बाद वह योग बहुत काल से इस पृथ्वी लोक में लुप्तप्राय हो गया\n" +
                    " ॥2॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 2)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","स एवायं मया तेऽद्य योगः प्रोक्तः पुरातनः।\n" +
                    " भक्तोऽसि मे सखा चेति रहस्यं ह्येतदुत्तमम्   ॥3॥\n" +
                    "\n" +
                    "भावार्थ  :-  तू मेरा भक्त और प्रिय सखा है, इसलिए वही यह पुरातन योग आज मैंने तुझको कहा है क्योंकि यह बड़ा ही उत्तम रहस्य है अर्थात गुप्त रखने योग्य विषय है\n" +
                    " ॥3॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 3)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","अर्जुन उवाच  :-\n" +
                    "अपरं भवतो जन्म परं जन्म विवस्वतः।\n" +
                    " कथमेतद्विजानीयां त्वमादौ प्रोक्तवानिति  ॥4॥\n" +
                    "\n" +
                    "भावार्थ  :-  अर्जुन बोले- आपका जन्म तो अर्वाचीन-अभी हाल का है और सूर्य का जन्म बहुत पुराना है अर्थात कल्प के आदि में हो चुका था। तब मैं इस बात को कैसे समूझँ कि आप ही ने कल्प के आदि में सूर्य से यह योग कहा था?\n" +
                    " ॥4॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 4)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","श्रीभगवानुवाच  :-\n" +
                    "बहूनि मे व्यतीतानि जन्मानि तव चार्जुन।\n" +
                    " तान्यहं वेद सर्वाणि न त्वं वेत्थ परन्तप ॥5॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान बोले- हे परंतप अर्जुन! मेरे और तेरे बहुत से जन्म हो चुके हैं। उन सबको तू नहीं जानता, किन्तु मैं जानता हूँ\n" +
                    " ॥5॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 5)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","अजोऽपि सन्नव्ययात्मा भूतानामीश्वरोऽपि सन्।\n" +
                    " प्रकृतिं स्वामधिष्ठाय सम्भवाम्यात्ममायया   ॥6॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं अजन्मा और अविनाशीस्वरूप होते हुए भी तथा समस्त प्राणियों का ईश्वर होते हुए भी अपनी प्रकृति को अधीन करके अपनी योगमाया से प्रकट होता हूँ\n" +
                    " ॥6॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 6)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","यदा यदा हि धर्मस्य ग्लानिर्भवति भारत।\n" +
                    " अभ्युत्थानमधर्मस्य तदात्मानं सृजाम्यहम्   ॥7॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे भारत! जब-जब धर्म की हानि और अधर्म की वृद्धि होती है, तब-तब ही मैं अपने रूप को रचता हूँ अर्थात साकार रूप से लोगों के सम्मुख प्रकट होता हूँ\n" +
                    " ॥7॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 7)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","परित्राणाय साधूनां विनाशाय च दुष्कृताम्।\n" +
                    " धर्मसंस्थापनार्थाय सम्भवामि युगे युगे  ॥8॥\n" +
                    "\n" +
                    "भावार्थ  :-  साधु पुरुषों का उद्धार करने के लिए, पाप कर्म करने वालों का विनाश करने के लिए और धर्म की अच्छी तरह से स्थापना करने के लिए मैं युग-युग में प्रकट हुआ करता हूँ\n" +
                    " ॥8॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 8)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","जन्म कर्म च मे दिव्यमेवं यो वेत्ति तत्वतः।\n" +
                    " त्यक्तवा देहं पुनर्जन्म नैति मामेति सोऽर्जुन  ॥9॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! मेरे जन्म और कर्म दिव्य अर्थात निर्मल और अलौकिक हैं- इस प्रकार जो मनुष्य तत्व से (सर्वशक्तिमान, सच्चिदानन्दन परमात्मा अज, अविनाशी और सर्वभूतों के परम गति तथा परम आश्रय हैं, वे केवल धर्म को स्थापन करने और संसार का उद्धार करने के लिए ही अपनी योगमाया से सगुणरूप होकर प्रकट होते हैं। इसलिए परमेश्वर के समान सुहृद्, प्रेमी और पतितपावन दूसरा कोई नहीं है, ऐसा समझकर जो पुरुष परमेश्वर का अनन्य प्रेम से निरन्तर चिन्तन करता हुआ आसक्तिरहित संसार में बर्तता है, वही उनको तत्व से जानता है।) जान लेता है, वह शरीर को त्याग कर फिर जन्म को प्राप्त नहीं होता, किन्तु मुझे ही प्राप्त होता है\n" +
                    " ॥9॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 9)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","वीतरागभय क्रोधा मन्मया मामुपाश्रिताः।\n" +
                    " बहवो ज्ञानतपसा पूता मद्भावमागताः  ॥10॥\n" +
                    "\n" +
                    "भावार्थ  :-  पहले भी, जिनके राग, भय और क्रोध सर्वथा नष्ट हो गए थे और जो मुझ में अनन्य प्रेमपूर्वक स्थित रहते थे, ऐसे मेरे आश्रित रहने वाले बहुत से भक्त उपर्युक्त ज्ञान रूप तप से पवित्र होकर मेरे स्वरूप को प्राप्त हो चुके हैं\n" +
                    " ॥10॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 10)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","ये यथा माँ प्रपद्यन्ते तांस्तथैव भजाम्यहम्।\n" +
                    " मम वर्त्मानुवर्तन्ते मनुष्याः पार्थ सर्वशः  ॥11॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! जो भक्त मुझे जिस प्रकार भजते हैं, मैं भी उनको उसी प्रकार भजता हूँ क्योंकि सभी मनुष्य सब प्रकार से मेरे ही मार्ग का अनुसरण करते हैं\n" +
                    " ॥11॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 11)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","काङ्क्षन्तः कर्मणां सिद्धिं यजन्त इह देवताः।\n" +
                    " क्षिप्रं हि मानुषे लोके सिद्धिर्भवति कर्मजा   ॥12॥\n" +
                    "\n" +
                    "भावार्थ  :-  इस मनुष्य लोक में कर्मों के फल को चाहने वाले लोग देवताओं का पूजन किया करते हैं क्योंकि उनको कर्मों से उत्पन्न होने वाली सिद्धि शीघ्र मिल जाती है\n" +
                    " ॥12॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 12)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","चातुर्वर्ण्यं मया सृष्टं गुणकर्मविभागशः।\n" +
                    " तस्य कर्तारमपि मां विद्धयकर्तारमव्ययम्  ॥13॥\n" +
                    "\n" +
                    "भावार्थ  :-  ब्राह्मण, क्षत्रिय, वैश्य और शूद्र- इन चार वर्णों का समूह, गुण और कर्मों के विभागपूर्वक मेरे द्वारा रचा गया है। इस प्रकार उस सृष्टि-रचनादि कर्म का कर्ता होने पर भी मुझ अविनाशी परमेश्वर को तू वास्तव में अकर्ता ही जान\n" +
                    " ॥13॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 13)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","न मां कर्माणि लिम्पन्ति न मे कर्मफले स्पृहा।\n" +
                    " इति मां योऽभिजानाति कर्मभिर्न स बध्यते  ॥14॥\n" +
                    "\n" +
                    "भावार्थ  :-  कर्मों के फल में मेरी स्पृहा नहीं है, इसलिए मुझे कर्म लिप्त नहीं करते- इस प्रकार जो मुझे तत्व से जान लेता है, वह भी कर्मों से नहीं बँधता\n" +
                    " ॥14॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 14)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","एवं ज्ञात्वा कृतं कर्म पूर्वैरपि मुमुक्षुभिः।\n" +
                    " कुरु कर्मैव तस्मात्वं पूर्वैः पूर्वतरं कृतम्  ॥15॥\n" +
                    "\n" +
                    "भावार्थ  :-  पूर्वकाल में मुमुक्षुओं ने भी इस प्रकार जानकर ही कर्म किए हैं, इसलिए तू भी पूर्वजों द्वारा सदा से किए जाने वाले कर्मों को ही कर\n" +
                    " ॥15॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 15)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","किं कर्म किमकर्मेति कवयोऽप्यत्र मोहिताः।\n" +
                    " तत्ते कर्म प्रवक्ष्यामि यज्ज्ञात्वा मोक्ष्यसेऽशुभात्  ॥16॥\n" +
                    "\n" +
                    "भावार्थ  :-  कर्म क्या है? और अकर्म क्या है? इस प्रकार इसका निर्णय करने में बुद्धिमान पुरुष भी मोहित हो जाते हैं। इसलिए वह कर्मतत्व मैं तुझे भलीभाँति समझाकर कहूँगा, जिसे जानकर तू अशुभ से अर्थात कर्मबंधन से मुक्त हो जाएगा\n" +
                    " ॥16॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 16)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","कर्मणो ह्यपि बोद्धव्यं बोद्धव्यं च विकर्मणः।\n" +
                    " अकर्मणश्च बोद्धव्यं गहना कर्मणो गतिः  ॥17॥\n" +
                    "\n" +
                    "भावार्थ  :-  कर्म का स्वरूप भी जानना चाहिए और अकर्मण का स्वरूप भी जानना चाहिए तथा विकर्म का स्वरूप भी जानना चाहिए क्योंकि कर्म की गति गहन है\n" +
                    " ॥17॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 17)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","कर्मण्य कर्म यः पश्येदकर्मणि च कर्म यः।\n" +
                    " स बुद्धिमान्मनुष्येषु स युक्तः कृत्स्नकर्मकृत्  ॥18॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो मनुष्य कर्म में अकर्म देखता है और जो अकर्म में कर्म देखता है, वह मनुष्यों में बुद्धिमान है और वह योगी समस्त कर्मों को करने वाला है\n" +
                    " ॥18॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 18)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","यस्य सर्वे समारम्भाः कामसंकल्पवर्जिताः।\n" +
                    "ज्ञानाग्निदग्धकर्माणं तमाहुः पंडितं बुधाः  ॥19॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिसके सम्पूर्ण शास्त्रसम्मत कर्म बिना कामना और संकल्प के होते हैं तथा जिसके समस्त कर्म ज्ञानरूप अग्नि द्वारा भस्म हो गए हैं, उस महापुरुष को ज्ञानीजन भी पंडित कहते हैं\n" +
                    " ॥19॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 19)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","त्यक्त्वा कर्मफलासङ्गं नित्यतृप्तो निराश्रयः।\n" +
                    " कर्मण्यभिप्रवृत्तोऽपि नैव किंचित्करोति सः  ॥20॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो पुरुष समस्त कर्मों में और उनके फल में आसक्ति का सर्वथा त्याग करके संसार के आश्रय से रहित हो गया है और परमात्मा में नित्य तृप्त है, वह कर्मों में भलीभाँति बर्तता हुआ भी वास्तव में कुछ भी नहीं करता\n" +
                    " ॥20॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position ==20)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","निराशीर्यतचित्तात्मा त्यक्तसर्वपरिग्रहः।\n" +
                    " शारीरं केवलं कर्म कुर्वन्नाप्नोति किल्बिषम्  ॥21॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिसका अंतःकरण और इन्द्रियों सहित शरीर जीता हुआ है और जिसने समस्त भोगों की सामग्री का परित्याग कर दिया है, ऐसा आशारहित पुरुष केवल शरीर-संबंधी कर्म करता हुआ भी पापों को नहीं प्राप्त होता\n" +
                    " ॥21॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 21)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","यदृच्छालाभसंतुष्टो द्वंद्वातीतो विमत्सरः।\n" +
                    " समः सिद्धावसिद्धौ च कृत्वापि न निबध्यते  ॥22॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो बिना इच्छा के अपने-आप प्राप्त हुए पदार्थ में सदा संतुष्ट रहता है, जिसमें ईर्ष्या का सर्वथा अभाव हो गया हो, जो हर्ष-शोक आदि द्वंद्वों से सर्वथा अतीत हो गया है- ऐसा सिद्धि और असिद्धि में सम रहने वाला कर्मयोगी कर्म करता हुआ भी उनसे नहीं बँधता\n" +
                    " ॥22॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 22)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","गतसङ्गस्य मुक्तस्य ज्ञानावस्थितचेतसः।\n" +
                    " यज्ञायाचरतः कर्म समग्रं प्रविलीयते  ॥23॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिसकी आसक्ति सर्वथा नष्ट हो गई है, जो देहाभिमान और ममता से रहित हो गया है, जिसका चित्त निरन्तर परमात्मा के ज्ञान में स्थित रहता है- ऐसा केवल यज्ञसम्पादन के लिए कर्म करने वाले मनुष्य के सम्पूर्ण कर्म भलीभाँति विलीन हो जाते हैं\n" +
                    " ॥23॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 23)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","ब्रह्मार्पणं ब्रह्म हविर्ब्रह्माग्रौ ब्रह्मणा हुतम्।\n" +
                    " ब्रह्मैव तेन गन्तव्यं ब्रह्मकर्मसमाधिना  ॥24॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिस यज्ञ में अर्पण अर्थात स्रुवा आदि भी ब्रह्म है और हवन किए जाने योग्य द्रव्य भी ब्रह्म है तथा ब्रह्मरूप कर्ता द्वारा ब्रह्मरूप अग्नि में आहुति देना रूप क्रिया भी ब्रह्म है- उस ब्रह्मकर्म में स्थित रहने वाले योगी द्वारा प्राप्त किए जाने योग्य फल भी ब्रह्म ही हैं\n" +
                    " ॥24॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 24)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","दैवमेवापरे यज्ञं योगिनः पर्युपासते।\n" +
                    " ब्रह्माग्नावपरे यज्ञं यज्ञेनैवोपजुह्वति  ॥25॥\n" +
                    "\n" +
                    "भावार्थ  :-  दूसरे योगीजन देवताओं के पूजनरूप यज्ञ का ही भलीभाँति अनुष्ठान किया करते हैं और अन्य योगीजन परब्रह्म परमात्मारूप अग्नि में अभेद दर्शनरूप यज्ञ द्वारा ही आत्मरूप यज्ञ का हवन किया करते हैं। (परब्रह्म परमात्मा में ज्ञान द्वारा एकीभाव से स्थित होना ही ब्रह्मरूप अग्नि में यज्ञ द्वारा यज्ञ को हवन करना है।)\n" +
                    " ॥25॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 25)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","श्रोत्रादीनीन्द्रियाण्यन्ये संयमाग्निषु जुह्वति।\n" +
                    " शब्दादीन्विषयानन्य इन्द्रियाग्निषु जुह्वति  ॥26॥\n" +
                    "\n" +
                    "भावार्थ  :-  अन्य योगीजन श्रोत्र आदि समस्त इन्द्रियों को संयम रूप अग्नियों में हवन किया करते हैं और दूसरे योगी लोग शब्दादि समस्त विषयों को इन्द्रिय रूप अग्नियों में हवन किया करते हैं\n" +
                    " ॥26॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 26)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","सर्वाणीन्द्रियकर्माणि प्राणकर्माणि चापरे।\n" +
                    " आत्मसंयमयोगाग्नौ जुह्वति ज्ञानदीपिते  ॥27॥\n" +
                    "\n" +
                    "भावार्थ  :-  दूसरे योगीजन इन्द्रियों की सम्पूर्ण क्रियाओं और प्राणों की समस्त क्रियाओं को ज्ञान से प्रकाशित आत्म संयम योगरूप अग्नि में हवन किया करते हैं (सच्चिदानंदघन परमात्मा के सिवाय अन्य किसी का भी न चिन्तन करना ही उन सबका हवन करना है।)\n" +
                    " ॥27॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 27)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","द्रव्ययज्ञास्तपोयज्ञा योगयज्ञास्तथापरे।\n" +
                    " स्वाध्यायज्ञानयज्ञाश्च यतयः संशितव्रताः  ॥28॥\n" +
                    "\n" +
                    "भावार्थ  :-  कई पुरुष द्रव्य संबंधी यज्ञ करने वाले हैं, कितने ही तपस्या रूप यज्ञ करने वाले हैं तथा दूसरे कितने ही योगरूप यज्ञ करने वाले हैं, कितने ही अहिंसादि तीक्ष्णव्रतों से युक्त यत्नशील पुरुष स्वाध्यायरूप ज्ञानयज्ञ करने वाले हैं\n" +
                    " ॥28॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 28)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","अपाने जुह्वति प्राणं प्राणेऽपानं तथापरे।\n" +
                    " प्राणापानगती रुद्ध्वा प्राणायामपरायणाः  ॥29॥\n" +
                    " अपरे नियताहाराः प्राणान्प्राणेषु जुह्वति।\n" +
                    " सर्वेऽप्येते यज्ञविदो यज्ञक्षपितकल्मषाः  ॥30॥\n" +
                    "\n" +
                    "भावार्थ  :-  दूसरे कितने ही योगीजन अपान वायु में प्राणवायु को हवन करते हैं, वैसे ही अन्य योगीजन प्राणवायु में अपान वायु को हवन करते हैं तथा अन्य कितने ही नियमित आहार (गीता अध्याय 6 श्लोक 17 में देखना चाहिए।) करने वाले प्राणायाम परायण पुरुष प्राण और अपान की गति को रोककर प्राणों को प्राणों में ही हवन किया करते हैं। ये सभी साधक यज्ञों द्वारा पापों का नाश कर देने वाले और यज्ञों को जानने वाले हैं\n" +
                    " ॥29-30॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 29)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","यज्ञशिष्टामृतभुजो यान्ति ब्रह्म सनातनम्।\n" +
                    " नायं लोकोऽस्त्ययज्ञस्य कुतोऽन्यः कुरुसत्तम  ॥31॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे कुरुश्रेष्ठ अर्जुन! यज्ञ से बचे हुए अमृत का अनुभव करने वाले योगीजन सनातन परब्रह्म परमात्मा को प्राप्त होते हैं। और यज्ञ न करने वाले पुरुष के लिए तो यह मनुष्यलोक भी सुखदायक नहीं है, फिर परलोक कैसे सुखदायक हो सकता है?\n" +
                    " ॥31॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 30)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","एवं बहुविधा यज्ञा वितता ब्रह्मणो मुखे।\n" +
                    " कर्मजान्विद्धि तान्सर्वानेवं ज्ञात्वा विमोक्ष्यसे  ॥32॥\n" +
                    "\n" +
                    "भावार्थ  :-  इसी प्रकार और भी बहुत तरह के यज्ञ वेद की वाणी में विस्तार से कहे गए हैं। उन सबको तू मन, इन्द्रिय और शरीर की क्रिया द्वारा सम्पन्न होने वाले जान, इस प्रकार तत्व से जानकर उनके अनुष्ठान द्वारा तू कर्म बंधन से सर्वथा मुक्त हो जाएगा\n" +
                    " ॥32॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 31)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","श्रेयान्द्रव्यमयाद्यज्ञाज्ज्ञानयज्ञः परन्तप।\n" +
                    "सर्वं कर्माखिलं पार्थ ज्ञाने परिसमाप्यते  ॥33॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे परंतप अर्जुन! द्रव्यमय यज्ञ की अपेक्षा ज्ञान यज्ञ अत्यन्त श्रेष्ठ है तथा यावन्मात्र सम्पूर्ण कर्म ज्ञान में समाप्त हो जाते हैं\n" +
                    " ॥33॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 32)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","तद्विद्धि प्रणिपातेन परिप्रश्नेन सेवया।\n" +
                    " उपदेक्ष्यन्ति ते ज्ञानं ज्ञानिनस्तत्वदर्शिनः  ॥34॥\n" +
                    "\n" +
                    "भावार्थ  :-  उस ज्ञान को तू तत्वदर्शी ज्ञानियों के पास जाकर समझ, उनको भलीभाँति दण्डवत् प्रणाम करने से, उनकी सेवा करने से और कपट छोड़कर सरलतापूर्वक प्रश्न करने से वे परमात्म तत्व को भलीभाँति जानने वाले ज्ञानी महात्मा तुझे उस तत्वज्ञान का उपदेश करेंगे\n" +
                    " ॥34॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 33)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","यज्ज्ञात्वा न पुनर्मोहमेवं यास्यसि पाण्डव।\n" +
                    " येन भुतान्यशेषेण द्रक्ष्यस्यात्मन्यथो मयि  ॥35॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिसको जानकर फिर तू इस प्रकार मोह को नहीं प्राप्त होगा तथा हे अर्जुन! जिस ज्ञान द्वारा तू सम्पूर्ण भूतों को निःशेषभाव से पहले अपने में (गीता अध्याय 6 श्लोक 29 में देखना चाहिए।) और पीछे मुझ सच्चिदानन्दघन परमात्मा में देखेगा। (गीता अध्याय 6 श्लोक 30 में देखना चाहिए।)\n" +
                    " ॥35॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 34)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","अपि चेदसि पापेभ्यः सर्वेभ्यः पापकृत्तमः।\n" +
                    " सर्वं ज्ञानप्लवेनैव वृजिनं सन्तरिष्यसि  ॥36॥\n" +
                    "\n" +
                    "भावार्थ  :-  यदि तू अन्य सब पापियों से भी अधिक पाप करने वाला है, तो भी तू ज्ञान रूप नौका द्वारा निःसंदेह सम्पूर्ण पाप-समुद्र से भलीभाँति तर जाएगा\n" +
                    " ॥36॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 35)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","यथैधांसि समिद्धोऽग्निर्भस्मसात्कुरुतेऽर्जुन।\n" +
                    " ज्ञानाग्निः सर्वकर्माणि भस्मसात्कुरुते तथा  ॥37॥\n" +
                    "\n" +
                    "भावार्थ  :-  क्योंकि हे अर्जुन! जैसे प्रज्वलित अग्नि ईंधनों को भस्ममय कर देता है, वैसे ही ज्ञानरूप अग्नि सम्पूर्ण कर्मों को भस्ममय कर देता है\n" +
                    " ॥37॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 36)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","न हि ज्ञानेन सदृशं पवित्रमिह विद्यते।\n" +
                    " तत्स्वयं योगसंसिद्धः कालेनात्मनि विन्दति  ॥38॥\n" +
                    "\n" +
                    "भावार्थ  :-  इस संसार में ज्ञान के समान पवित्र करने वाला निःसंदेह कुछ भी नहीं है। उस ज्ञान को कितने ही काल से कर्मयोग द्वारा शुद्धान्तःकरण हुआ मनुष्य अपने-आप ही आत्मा में पा लेता है\n" +
                    " ॥38॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 37)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","श्रद्धावाँल्लभते ज्ञानं तत्परः संयतेन्द्रियः।\n" +
                    " ज्ञानं लब्धवा परां शान्तिमचिरेणाधिगच्छति  ॥39॥\n" +
                    "\n" +
                    "भावार्थ  :-  जितेन्द्रिय, साधनपरायण और श्रद्धावान मनुष्य ज्ञान को प्राप्त होता है तथा ज्ञान को प्राप्त होकर वह बिना विलम्ब के- तत्काल ही भगवत्प्राप्तिरूप परम शान्ति को प्राप्त हो जाता है\n" +
                    " ॥39॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 38)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","अज्ञश्चश्रद्दधानश्च संशयात्मा विनश्यति।\n" +
                    " नायं लोकोऽस्ति न परो न सुखं संशयात्मनः  ॥40॥\n" +
                    "\n" +
                    "भावार्थ  :-  विवेकहीन और श्रद्धारहित संशययुक्त मनुष्य परमार्थ से अवश्य भ्रष्ट हो जाता है। ऐसे संशययुक्त मनुष्य के लिए न यह लोक है, न परलोक है और न सुख ही है\n" +
                    " ॥40॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 39)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","योगसन्नयस्तकर्माणं ज्ञानसञ्न्निसंशयम्।\n" +
                    " आत्मवन्तं न कर्माणि निबध्नन्ति धनञ्जय  ॥41॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे धनंजय! जिसने कर्मयोग की विधि से समस्त कर्मों का परमात्मा में अर्पण कर दिया है और जिसने विवेक द्वारा समस्त संशयों का नाश कर दिया है, ऐसे वश में किए हुए अन्तःकरण वाले पुरुष को कर्म नहीं बाँधते\n" +
                    " ॥41॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 40)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            bundle.putString("message4","तस्मादज्ञानसम्भूतं हृत्स्थं ज्ञानासिनात्मनः।\n" +
                    " छित्वैनं संशयं योगमातिष्ठोत्तिष्ठ भारत  ॥42॥\n" +
                    "\n" +
                    "भावार्थ  :-  इसलिए हे भरतवंशी अर्जुन! तू हृदय में स्थित इस अज्ञानजनित अपने संशय का विवेकज्ञान रूप तलवार द्वारा छेदन करके समत्वरूप कर्मयोग में स्थित हो जा और युद्ध के लिए खड़ा हो जा\n" +
                    " ॥42॥\n" +
                    "\n" +
                    "ॐ तत्सदिति श्रीमद्भगवद्गीतासूपनिषत्सु ब्रह्मविद्यायां योगशास्त्रे श्रीकृष्णार्जुनसंवादे ज्ञानकर्मसंन्यास योगो नाम चतुर्थोऽध्यायः॥4॥\n");
            fragment4.setArguments(bundle);
            return fragment4;
        }




        return null;
    }

    @Override
    public int getCount()
    {
        return 41;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        if(position<=28)
        {
          return "श्लोक "+position;
        }
        else if(position==29)
        {
            return "श्लोक 29,30";
        }
        if(position<=42&&position>=30)
        {
            position=position+1;
            return "श्लोक "+position;
        }
        return null;

    }

}
