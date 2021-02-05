package com.parmu.bhagwatgeeta;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter18 extends FragmentPagerAdapter {
    public ViewPagerAdapter18(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter18(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "(त्याग का विषय) \n" +
                    " अर्जुन उवाच   :-\n" +
                    " सन्न्यासस्य महाबाहो तत्त्वमिच्छामि वेदितुम्।\n" +
                    " त्यागस्य च हृषीकेश पृथक्केशिनिषूदन  ॥1॥\n" +
                    "\n" +
                    "भावार्थ  :-  अर्जुन बोले- हे महाबाहो! हे अन्तर्यामिन्! हे वासुदेव! मैं संन्यास और त्याग के तत्व को पृथक्-पृथक् जानना चाहता हूँ\n" +
                    " ॥1॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }

        else if(position==1)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "श्रीभगवानुवाच  :-\n" +
                    " काम्यानां कर्मणा न्यासं सन्न्यासं कवयो विदुः।\n" +
                    " सर्वकर्मफलत्यागं प्राहुस्त्यागं विचक्षणाः  ॥2॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान बोले- कितने ही पण्डितजन तो काम्य कर्मों के (स्त्री, पुत्र और धन आदि प्रिय वस्तुओं की प्राप्ति के लिए तथा रोग-संकटादि की निवृत्ति के लिए जो यज्ञ, दान, तप और उपासना आदि कर्म किए जाते हैं, उनका नाम काम्यकर्म है।) त्याग को संन्यास समझते हैं तथा दूसरे विचारकुशल पुरुष सब कर्मों के फल के त्याग को (ईश्वर की भक्ति, देवताओं का पूजन, माता-पितादि गुरुजनों की सेवा, यज्ञ, दान और तप तथा वर्णाश्रम के अनुसार आजीविका द्वारा गृहस्थ का निर्वाह एवं शरीर संबंधी खान-पान इत्यादि जितने कर्तव्यकर्म हैं, उन सबमें इस लोक और परलोक की सम्पूर्ण कामनाओं के त्याग का नाम सब कर्मों के फल का त्याग है) त्याग कहते हैं\n" +
                    " ॥2॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==2)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "त्याज्यं दोषवदित्येके कर्म प्राहुर्मनीषिणः।\n" +
                    " यज्ञदानतपःकर्म न त्याज्यमिति चापरे ॥3॥\n" +
                    "\n" +
                    "भावार्थ  :-  कई एक विद्वान ऐसा कहते हैं कि कर्ममात्र दोषयुक्त हैं, इसलिए त्यागने के योग्य हैं और दूसरे विद्वान यह कहते हैं कि यज्ञ, दान और तपरूप कर्म त्यागने योग्य नहीं हैं\n" +
                    " ॥3॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==3)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "निश्चयं श्रृणु में तत्र त्यागे भरतसत्तम।\n" +
                    " त्यागो हि पुरुषव्याघ्र त्रिविधः सम्प्रकीर्तितः  ॥4॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे पुरुषश्रेष्ठ अर्जुन ! संन्यास और त्याग, इन दोनों में से पहले त्याग के विषय में तू मेरा निश्चय सुन। क्योंकि त्याग सात्विक, राजस और तामस भेद से तीन प्रकार का कहा गया है\n" +
                    " ॥4॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==4)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "यज्ञदानतपःकर्म न त्याज्यं कार्यमेव तत्।\n" +
                    " यज्ञो दानं तपश्चैव पावनानि मनीषिणाम्  ॥5॥\n" +
                    "\n" +
                    "भावार्थ  :-  यज्ञ, दान और तपरूप कर्म त्याग करने के योग्य नहीं है, बल्कि वह तो अवश्य कर्तव्य है, क्योंकि यज्ञ, दान और तप -ये तीनों ही कर्म बुद्धिमान पुरुषों को (वह मनुष्य बुद्धिमान है, जो फल और आसक्ति को त्याग कर केवल भगवदर्थ कर्म करता है।) पवित्र करने वाले हैं\n" +
                    " ॥5॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==5)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "एतान्यपि तु कर्माणि सङ्गं त्यक्त्वा फलानि च।\n" +
                    " कर्तव्यानीति में पार्थ निश्चितं मतमुत्तमम्  ॥6॥\n" +
                    "\n" +
                    "भावार्थ  :-  इसलिए हे पार्थ! इन यज्ञ, दान और तपरूप कर्मों को तथा और भी सम्पूर्ण कर्तव्यकर्मों को आसक्ति और फलों का त्याग करके अवश्य करना चाहिए, यह मेरा निश्चय किया हुआ उत्तम मत है\n" +
                    " ॥6॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==6)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "नियतस्य तु सन्न्यासः कर्मणो नोपपद्यते।\n" +
                    " मोहात्तस्य परित्यागस्तामसः परिकीर्तितः  ॥7॥\n" +
                    "\n" +
                    "भावार्थ  :-  (निषिद्ध और काम्य कर्मों का तो स्वरूप से त्याग करना उचित ही है) परन्तु नियत कर्म का (इसी अध्याय के श्लोक 48 की टिप्पणी में इसका अर्थ देखना चाहिए।) स्वरूप से त्याग करना उचित नहीं है। इसलिए मोह के कारण उसका त्याग कर देना तामस त्याग कहा गया है\n" +
                    " ॥7॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==7)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "दुःखमित्येव यत्कर्म कायक्लेशभयात्त्यजेत्।\n" +
                    " स कृत्वा राजसं त्यागं नैव त्यागफलं लभेत्  ॥8॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो कुछ कर्म है वह सब दुःखरूप ही है- ऐसा समझकर यदि कोई शारीरिक क्लेश के भय से कर्तव्य-कर्मों का त्याग कर दे, तो वह ऐसा राजस त्याग करके त्याग के फल को किसी प्रकार भी नहीं पाता\n" +
                    " ॥8॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==8)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "कार्यमित्येव यत्कर्म नियतं क्रियतेअर्जुन।\n" +
                    " सङ्गं त्यक्त्वा फलं चैव स त्यागः सात्त्विको मतः  ॥9॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! जो शास्त्रविहित कर्म करना कर्तव्य है- इसी भाव से आसक्ति और फल का त्याग करके किया जाता है- वही सात्त्विक त्याग माना गया है\n" +
                    " ॥9॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==9)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "न द्वेष्ट्यकुशलं कर्म कुशले नानुषज्जते।\n" +
                    " त्यागी सत्त्वसमाविष्टो मेधावी छिन्नसंशयः  ॥10॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो मनुष्य अकुशल कर्म से तो द्वेष नहीं करता और कुशल कर्म में आसक्त नहीं होता- वह शुद्ध सत्त्वगुण से युक्त पुरुष संशयरहित, बुद्धिमान और सच्चा त्यागी है\n" +
                    " ॥10॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==10)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "न हि देहभृता शक्यं त्यक्तुं कर्माण्यशेषतः।\n" +
                    " यस्तु कर्मफलत्यागी स त्यागीत्यभिधीयते  ॥11॥\n" +
                    "\n" +
                    "भावार्थ  :-  क्योंकि शरीरधारी किसी भी मनुष्य द्वारा सम्पूर्णता से सब कर्मों का त्याग किया जाना शक्य नहीं है, इसलिए जो कर्मफल त्यागी है, वही त्यागी है- यह कहा जाता है\n" +
                    " ॥11॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==11)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "अनिष्टमिष्टं मिश्रं च त्रिविधं कर्मणः फलम्।\n" +
                    " भवत्यत्यागिनां प्रेत्य न तु सन्न्यासिनां क्वचित्  ॥12॥\n" +
                    "\n" +
                    "भावार्थ  :-  कर्मफल का त्याग न करने वाले मनुष्यों के कर्मों का तो अच्छा, बुरा और मिला हुआ- ऐसे तीन प्रकार का फल मरने के पश्चात अवश्य होता है, किन्तु कर्मफल का त्याग कर देने वाले मनुष्यों के कर्मों का फल किसी काल में भी नहीं होता\n" +
                    " ॥12॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==12)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "(कर्मों के होने में सांख्यसिद्धांत का कथन) \n" +
                    " पञ्चैतानि महाबाहो कारणानि निबोध मे।\n" +
                    " साङ्ख्ये कृतान्ते प्रोक्तानि सिद्धये सर्वकर्मणाम्  ॥13॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे महाबाहो! सम्पूर्ण कर्मों की सिद्धि के ये पाँच हेतु कर्मों का अंत करने के लिए उपाय बतलाने वाले सांख्य-शास्त्र में कहे गए हैं, उनको तू मुझसे भलीभाँति जान\n" +
                    " ॥13॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==13)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "अधिष्ठानं तथा कर्ता करणं च पृथग्विधम्।\n" +
                    " विविधाश्च पृथक्चेष्टा दैवं चैवात्र पञ्चमम्  ॥14॥\n" +
                    "\n" +
                    "भावार्थ  :-  इस विषय में अर्थात कर्मों की सिद्धि में अधिष्ठान (जिसके आश्रय कर्म किए जाएँ, उसका नाम अधिष्ठान है) और कर्ता तथा भिन्न-भिन्न प्रकार के करण (जिन-जिन इंद्रियादिकों और साधनों द्वारा कर्म किए जाते हैं, उनका नाम करण है) एवं नाना प्रकार की अलग-अलग चेष्टाएँ और वैसे ही पाँचवाँ हेतु दैव (पूर्वकृत शुभाशुभ कर्मों के संस्कारों का नाम दैव है) है\n" +
                    " ॥14॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==14)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "शरीरवाङ्मनोभिर्यत्कर्म प्रारभते नरः।\n" +
                    " न्याय्यं वा विपरीतं वा पञ्चैते तस्य हेतवः  ॥15॥\n" +
                    "\n" +
                    "भावार्थ  :-  मनुष्य मन, वाणी और शरीर से शास्त्रानुकूल अथवा विपरीत जो कुछ भी कर्म करता है- उसके ये पाँचों कारण हैं\n" +
                    " ॥15॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==15)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "तत्रैवं सति कर्तारमात्मानं केवलं तु यः।\n" +
                    " पश्यत्यकृतबुद्धित्वान्न स पश्यति दुर्मतिः  ॥16॥\n" +
                    "\n" +
                    "भावार्थ  :-  परन्तु ऐसा होने पर भी जो मनुष्य अशुद्ध बुद्धि (सत्संग और शास्त्र के अभ्यास से तथा भगवदर्थ कर्म और उपासना के करने से मनुष्य की बुद्धि शुद्ध होती है, इसलिए जो उपर्युक्त साधनों से रहित है, उसकी बुद्धि अशुद्ध है, ऐसा समझना चाहिए।) होने के कारण उस विषय में यानी कर्मों के होने में केवल शुद्ध स्वरूप आत्मा को कर्ता समझता है, वह मलीन बुद्धि वाला अज्ञानी यथार्थ नहीं समझता\n" +
                    " ॥16॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==16)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "यस्य नाहङ्कृतो भावो बुद्धिर्यस्य न लिप्यते।\n" +
                    " हत्वापि स इमाँल्लोकान्न हन्ति न निबध्यते  ॥17॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिस पुरुष के अन्तःकरण में 'मैं कर्ता हूँ' ऐसा भाव नहीं है तथा जिसकी बुद्धि सांसारिक पदार्थों में और कर्मों में लिपायमान नहीं होती, वह पुरुष इन सब लोकों को मारकर भी वास्तव में न तो मरता है और न पाप से बँधता है। (जैसे अग्नि, वायु और जल द्वारा प्रारब्धवश किसी प्राणी की हिंसा होती देखने में आए तो भी वह वास्तव में हिंसा नहीं है, वैसे ही जिस पुरुष का देह में अभिमान नहीं है और स्वार्थरहित केवल संसार के हित के लिए ही जिसकी सम्पूर्ण क्रियाएँ होती हैं, उस पुरुष के शरीर और इन्द्रियों द्वारा यदि किसी प्राणी की हिंसा होती हुई लोकदृष्टि में देखी जाए, तो भी वह वास्तव में हिंसा नहीं है क्योंकि आसक्ति, स्वार्थ और अहंकार के न होने से किसी प्राणी की हिंसा हो ही नहीं सकती तथा बिना कर्तृत्वाभिमान के किया हुआ कर्म वास्तव में अकर्म ही है, इसलिए वह पुरुष 'पाप से नहीं बँधता'।)\n" +
                    " ॥17॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==17)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "ज्ञानं ज्ञेयं परिज्ञाता त्रिविधा कर्मचोदना।\n" +
                    " करणं कर्म कर्तेति त्रिविधः कर्मसङ्ग्रहः  ॥18॥\n" +
                    "\n" +
                    "भावार्थ  :-  ज्ञाता (जानने वाले का नाम 'ज्ञाता' है।), ज्ञान (जिसके द्वारा जाना जाए, उसका नाम 'ज्ञान' है। ) और ज्ञेय (जानने में आने वाली वस्तु का नाम 'ज्ञेय' है।)- ये तीनों प्रकार की कर्म-प्रेरणा हैं और कर्ता (कर्म करने वाले का नाम 'कर्ता' है।), करण (जिन साधनों से कर्म किया जाए, उनका नाम 'करण' है।) तथा क्रिया (करने का नाम 'क्रिया' है।)- ये तीनों प्रकार का कर्म-संग्रह है\n" +
                    " ॥18॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==18)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "(तीनों गुणों के अनुसार ज्ञान, कर्म, कर्ता, बुद्धि, धृति और सुख के पृथक-पृथक भेद) \n" +
                    " ज्ञानं कर्म च कर्ता च त्रिधैव गुणभेदतः।\n" +
                    " प्रोच्यते गुणसङ्ख्याने यथावच्छ्णु तान्यपि  ॥19॥\n" +
                    "\n" +
                    "भावार्थ  :-  गुणों की संख्या करने वाले शास्त्र में ज्ञान और कर्म तथा कर्ता गुणों के भेद से तीन-तीन प्रकार के ही कहे गए हैं, उनको भी तु मुझसे भलीभाँति सुन\n" +
                    " ॥19॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==19)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "सर्वभूतेषु येनैकं भावमव्ययमीक्षते।\n" +
                    " अविभक्तं विभक्तेषु तज्ज्ञानं विद्धि सात्त्विकम्  ॥20॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिस ज्ञान से मनुष्य पृथक-पृथक सब भूतों में एक अविनाशी परमात्मभाव को विभागरहित समभाव से स्थित देखता है, उस ज्ञान को तू सात्त्विक जान\n" +
                    " ॥20॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==20)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "पृथक्त्वेन तु यज्ज्ञानं नानाभावान्पृथग्विधान्।\n" +
                    " वेत्ति सर्वेषु भूतेषु तज्ज्ञानं विद्धि राजसम्  ॥21॥\n" +
                    "\n" +
                    "भावार्थ  :-  किन्तु जो ज्ञान अर्थात जिस ज्ञान के द्वारा मनुष्य सम्पूर्ण भूतों में भिन्न-भिन्न प्रकार के नाना भावों को अलग-अलग जानता है, उस ज्ञान को तू राजस जान\n" +
                    " ॥21॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==21)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "यत्तु कृत्स्नवदेकस्मिन्कार्ये सक्तमहैतुकम्।\n" +
                    " अतत्त्वार्थवदल्पंच तत्तामसमुदाहृतम्  ॥22॥\n" +
                    "\n" +
                    "भावार्थ  :-  परन्तु जो ज्ञान एक कार्यरूप शरीर में ही सम्पूर्ण के सदृश आसक्त है तथा जो बिना युक्तिवाला, तात्त्विक अर्थ से रहित और तुच्छ है- वह तामस कहा गया है\n" +
                    " ॥22॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==22)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "नियतं सङ्गरहितमरागद्वेषतः कृतम।\n" +
                    " अफलप्रेप्सुना कर्म यत्तत्सात्त्विकमुच्यते   ॥23॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो कर्म शास्त्रविधि से नियत किया हुआ और कर्तापन के अभिमान से रहित हो तथा फल न चाहने वाले पुरुष द्वारा बिना राग-द्वेष के किया गया हो- वह सात्त्विक कहा जाता है\n" +
                    " ॥23॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==23)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "यत्तु कामेप्सुना कर्म साहङ्कारेण वा पुनः।\n" +
                    " क्रियते बहुलायासं तद्राजसमुदाहृतम्  ॥24॥\n" +
                    "\n" +
                    "भावार्थ  :-  परन्तु जो कर्म बहुत परिश्रम से युक्त होता है तथा भोगों को चाहने वाले पुरुष द्वारा या अहंकारयुक्त पुरुष द्वारा किया जाता है, वह कर्म राजस कहा गया है\n" +
                    " ॥24॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==24)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "अनुबन्धं क्षयं हिंसामनवेक्ष्य च पौरुषम्।\n" +
                    " मोहादारभ्यते कर्म यत्तत्तामसमुच्यते  ॥25॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो कर्म परिणाम, हानि, हिंसा और सामर्थ्य को न विचारकर केवल अज्ञान से आरंभ किया जाता है, वह तामस कहा जाता है\n" +
                    " ॥25॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==25)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "मुक्तसङ्गोऽनहंवादी धृत्युत्साहसमन्वितः।\n" +
                    " सिद्धयसिद्धयोर्निर्विकारः कर्ता सात्त्विक उच्यते  ॥26॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो कर्ता संगरहित, अहंकार के वचन न बोलने वाला, धैर्य और उत्साह से युक्त तथा कार्य के सिद्ध होने और न होने में हर्ष -शोकादि विकारों से रहित है- वह सात्त्विक कहा जाता है\n" +
                    " ॥26॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==26)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "रागी कर्मफलप्रेप्सुर्लुब्धो हिंसात्मकोऽशुचिः।\n" +
                    " हर्षशोकान्वितः कर्ता राजसः परिकीर्तितः ॥27॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो कर्ता आसक्ति से युक्त कर्मों के फल को चाहने वाला और लोभी है तथा दूसरों को कष्ट देने के स्वभाववाला, अशुद्धाचारी और हर्ष-शोक से लिप्त है वह राजस कहा गया है\n" +
                    " ॥27॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==27)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "आयुक्तः प्राकृतः स्तब्धः शठोनैष्कृतिकोऽलसः।\n" +
                    " विषादी दीर्घसूत्री च कर्ता तामस उच्यते   ॥28॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो कर्ता अयुक्त, शिक्षा से रहित घमंडी, धूर्त और दूसरों की जीविका का नाश करने वाला तथा शोक करने वाला, आलसी और दीर्घसूत्री (दीर्घसूत्री उसको कहा जाता है कि जो थोडे  काल में होने लायक साधारण कार्य को भी फिर कर लेंगे, ऐसी आशा से बहुत काल तक नहीं पूरा करता। ) है वह तामस कहा जाता है\n" +
                    " ॥28॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==28)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "बुद्धेर्भेदं धृतेश्चैव गुणतस्त्रिविधं श्रृणु।\n" +
                    " प्रोच्यमानमशेषेण पृथक्त्वेन धनंजय  ॥29॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे धनंजय ! अब तू बुद्धि का और धृति का भी गुणों के अनुसार तीन प्रकार का भेद मेरे द्वारा सम्पूर्णता से विभागपूर्वक कहा जाने वाला सुन\n" +
                    " ॥29॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==29)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "प्रवत्तिं च निवृत्तिं च कार्याकार्ये भयाभये।\n" +
                    " बन्धं मोक्षं च या वेति बुद्धिः सा पार्थ सात्त्विकी  ॥30॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे पार्थ ! जो बुद्धि प्रवृत्तिमार्ग (गृहस्थ में रहते हुए फल और आसक्ति को त्यागकर भगवदर्पण बुद्धि से केवल लोकशिक्षा के लिए राजा जनक की भाँति बरतने का नाम 'प्रवृत्तिमार्ग' है।) और निवृत्ति मार्ग को (देहाभिमान को त्यागकर केवल सच्चिदानंदघन परमात्मा में एकीभाव स्थित हुए श्री शुकदेवजी और सनकादिकों की भाँति संसार से उपराम होकर विचरने का नाम 'निवृत्तिमार्ग' है।), कर्तव्य और अकर्तव्य को, भय और अभय को तथा बंधन और मोक्ष को यथार्थ जानती है- वह बुद्धि सात्त्विकी है\n" +
                    " ॥30॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==30)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "यया धर्ममधर्मं च कार्यं चाकार्यमेव च।\n" +
                    " अयथावत्प्रजानाति बुद्धिः सा पार्थ राजसी  ॥31॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे पार्थ! मनुष्य जिस बुद्धि के द्वारा धर्म और अधर्म को तथा कर्तव्य और अकर्तव्य को भी यथार्थ नहीं जानता, वह बुद्धि राजसी है\n" +
                    " ॥31॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==31)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "अधर्मं धर्ममिति या मन्यते तमसावृता।\n" +
                    " सर्वार्थान्विपरीतांश्च बुद्धिः सा पार्थ तामसी ॥32॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! जो तमोगुण से घिरी हुई बुद्धि अधर्म को भी 'यह धर्म है' ऐसा मान लेती है तथा इसी प्रकार अन्य संपूर्ण पदार्थों को भी विपरीत मान लेती है, वह बुद्धि तामसी है\n" +
                    " ॥32॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==32)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "धृत्या यया धारयते मनःप्राणेन्द्रियक्रियाः।\n" +
                    " योगेनाव्यभिचारिण्या धृतिः सा पार्थ सात्त्विकी  ॥33॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे पार्थ! जिस अव्यभिचारिणी धारण शक्ति (भगवद्विषय के सिवाय अन्य सांसारिक विषयों को धारण करना ही व्यभिचार दोष है, उस दोष से जो रहित है वह 'अव्यभिचारिणी धारणा' है।) से मनुष्य ध्यान योग के द्वारा मन, प्राण और इंद्रियों की क्रियाओं ( मन, प्राण और इंद्रियों को भगवत्प्राप्ति के लिए भजन, ध्यान और निष्काम कर्मों में लगाने का नाम 'उनकी क्रियाओं को धारण करना' है।) को धारण करता है, वह धृति सात्त्विकी है\n" +
                    " ॥33॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==33)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "यया तु धर्मकामार्थान्धत्या धारयतेऽर्जुन।\n" +
                    " प्रसङ्गेन फलाकाङ्क्षी धृतिः सा पार्थ राजसी  ॥34॥\n" +
                    "\n" +
                    "भावार्थ  :-  परंतु हे पृथापुत्र अर्जुन! फल की इच्छावाला मनुष्य जिस धारण शक्ति के द्वारा अत्यंत आसक्ति से धर्म, अर्थ और कामों को धारण करता है, वह धारण शक्ति राजसी है\n" +
                    " ॥34॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==34)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "यया स्वप्नं भयं शोकं विषादं मदमेव च।\n" +
                    " न विमुञ्चति दुर्मेधा धृतिः सा पार्थ तामसी  ॥35॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे पार्थ! दुष्ट बुद्धिवाला मनुष्य जिस धारण शक्ति के द्वारा निद्रा, भय, चिंता और दु:ख को तथा उन्मत्तता को भी नहीं छोड़ता अर्थात धारण किए रहता है- वह धारण शक्ति तामसी है\n" +
                    " ॥35॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==35)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "सुखं त्विदानीं त्रिविधं श्रृणु मे भरतर्षभ।\n" +
                    " अभ्यासाद्रमते यत्र दुःखान्तं च निगच्छति  ॥36॥\n" +
                    " यत्तदग्रे विषमिव परिणामेऽमृतोपमम्।\n" +
                    " तत्सुखं सात्त्विकं प्रोक्तमात्मबुद्धिप्रसादजम्  ॥37॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे भरतश्रेष्ठ! अब तीन प्रकार के सुख को भी तू मुझसे सुन। जिस सुख में साधक मनुष्य भजन, ध्यान और सेवादि के अभ्यास से रमण करता है और जिससे दुःखों के अंत को प्राप्त हो जाता है, जो ऐसा सुख है, वह आरंभकाल में यद्यपि विष के तुल्य प्रतीत (जैसे खेल में आसक्ति वाले बालक को विद्या का अभ्यास मूढ़ता के कारण प्रथम विष के तुल्य भासता है वैसे ही विषयों में आसक्ति वाले पुरुष को भगवद्भजन, ध्यान, सेवा आदि साधनाओं का अभ्यास मर्म न जानने के कारण प्रथम 'विष के तुल्य प्रतीत होता' है) होता है, परन्तु परिणाम में अमृत के तुल्य है, इसलिए वह परमात्मविषयक बुद्धि के प्रसाद से उत्पन्न होने वाला सुख सात्त्विक कहा गया है\n" +
                    " ॥36-37॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==36)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "विषयेन्द्रियसंयोगाद्यत्तदग्रेऽमृतोपमम्।\n" +
                    " परिणामे विषमिव तत्सुखं राजसं स्मृतम्  ॥38॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो सुख विषय और इंद्रियों के संयोग से होता है, वह पहले- भोगकाल में अमृत के तुल्य प्रतीत होने पर भी परिणाम में विष के तुल्य (बल, वीर्य, बुद्धि, धन, उत्साह और परलोक का नाश होने से विषय और इंद्रियों के संयोग से होने वाले सुख को 'परिणाम में विष के तुल्य' कहा है) है इसलिए वह सुख राजस कहा गया है\n" +
                    " ॥38॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==37)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "यदग्रे चानुबन्धे च सुखं मोहनमात्मनः।\n" +
                    " निद्रालस्यप्रमादोत्थं तत्तामसमुदाहृतम्  ॥39॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो सुख भोगकाल में तथा परिणाम में भी आत्मा को मोहित करने वाला है, वह निद्रा, आलस्य और प्रमाद से उत्पन्न सुख तामस कहा गया है\n" +
                    " ॥39॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==38)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "न तदस्ति पृथिव्यां वा दिवि देवेषु वा पुनः।\n" +
                    " सत्त्वं प्रकृतिजैर्मुक्तं यदेभिःस्यात्त्रिभिर्गुणैः  ॥40॥\n" +
                    "\n" +
                    "भावार्थ  :-  पृथ्वी में या आकाश में अथवा देवताओं में तथा इनके सिवा और कहीं भी ऐसा कोई भी सत्त्व नहीं है, जो प्रकृति से उत्पन्न इन तीनों गुणों से रहित हो\n" +
                    " ॥40॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==39)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "(फल सहित वर्ण धर्म का विषय) \n" +
                    " ब्राह्मणक्षत्रियविशां शूद्राणां च परन्तप।\n" +
                    " कर्माणि प्रविभक्तानि स्वभावप्रभवैर्गुणैः  ॥41॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे परंतप! ब्राह्मण, क्षत्रिय और वैश्यों के तथा शूद्रों के कर्म स्वभाव से उत्पन्न गुणों द्वारा विभक्त किए गए हैं\n" +
                    " ॥41॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==40)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "शमो दमस्तपः शौचं क्षान्तिरार्जवमेव च।\n" +
                    " ज्ञानं विज्ञानमास्तिक्यं ब्रह्मकर्म स्वभावजम्  ॥42॥\n" +
                    "\n" +
                    "भावार्थ  :-  अंतःकरण का निग्रह करना, इंद्रियों का दमन करना, धर्मपालन के लिए कष्ट सहना, बाहर-भीतर से शुद्ध (गीता अध्याय 13 श्लोक 7 की टिप्पणी में देखना चाहिए) रहना, दूसरों के अपराधों को क्षमा करना, मन, इंद्रिय और शरीर को सरल रखना, वेद, शास्त्र, ईश्वर और परलोक आदि में श्रद्धा रखना, वेद-शास्त्रों का अध्ययन-अध्यापन करना और परमात्मा के तत्त्व का अनुभव करना- ये सब-के-सब ही ब्राह्मण के स्वाभाविक कर्म हैं\n" +
                    " ॥42॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==41)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "शौर्यं तेजो धृतिर्दाक्ष्यं युद्धे चाप्यपलायनम्।\n" +
                    " दानमीश्वरभावश्च क्षात्रं कर्म स्वभावजम्  ॥43॥\n" +
                    "\n" +
                    "भावार्थ  :-  शूरवीरता, तेज, धैर्य, चतुरता और युद्ध में न भागना, दान देना और स्वामिभाव- ये सब-के-सब ही क्षत्रिय के स्वाभाविक कर्म हैं\n" +
                    " ॥43॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==42)
            {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "कृषिगौरक्ष्यवाणिज्यं वैश्यकर्म स्वभावजम्।\n" +
                    " परिचर्यात्मकं कर्म शूद्रस्यापि स्वभावजम्  ॥44॥\n" +
                    "\n" +
                    "भावार्थ  :-  खेती, गोपालन और क्रय-विक्रय रूप सत्य व्यवहार (वस्तुओं के खरीदने और बेचने में तौल, नाप और गिनती आदि से कम देना अथवा अधिक लेना एवं वस्तु को बदलकर या एक वस्तु में दूसरी या खराब वस्तु मिलाकर दे देना अथवा अच्छी ले लेना तथा नफा, आढ़त और दलाली ठहराकर उससे अधिक दाम लेना या कम देना तथा झूठ, कपट, चोरी और जबरदस्ती से अथवा अन्य किसी प्रकार से दूसरों के हक को ग्रहण कर लेना इत्यादि दोषों से रहित जो सत्यतापूर्वक पवित्र वस्तुओं का व्यापार है उसका नाम 'सत्य व्यवहार' है।) ये वैश्य के स्वाभाविक कर्म हैं तथा सब वर्णों की सेवा करना शूद्र का भी स्वाभाविक कर्म है\n" +
                    " ॥44॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==43)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "स्वे स्वे कर्मण्यभिरतः संसिद्धिं लभते नरः।\n" +
                    " स्वकर्मनिरतः सिद्धिं यथा विन्दति तच्छृणु  ॥45॥\n" +
                    "\n" +
                    "भावार्थ  :-  अपने-अपने स्वाभाविक कर्मों में तत्परता से लगा हुआ मनुष्य भगवत्प्राप्ति रूप परमसिद्धि को प्राप्त हो जाता है। अपने स्वाभाविक कर्म में लगा हुआ मनुष्य जिस प्रकार से कर्म करके परमसिद्धि को प्राप्त होता है, उस विधि को तू सुन\n" +
                    " ॥45॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==44)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "यतः प्रवृत्तिर्भूतानां येन सर्वमिदं ततम्।\n" +
                    " स्वकर्मणा तमभ्यर्च्य सिद्धिं विन्दति मानवः  ॥46॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिस परमेश्वर से संपूर्ण प्राणियों की उत्पत्ति हुई है और जिससे यह समस्त जगत् व्याप्त है (जैसे बर्फ जल से व्याप्त है, वैसे ही संपूर्ण संसार सच्चिदानंदघन परमात्मा से व्याप्त है), उस परमेश्वर की अपने स्वाभाविक कर्मों द्वारा पूजा करके (जैसे पतिव्रता स्त्री पति को सर्वस्व समझकर पति का चिंतन करती हुई पति के आज्ञानुसार पति के ही लिए मन, वाणी, शरीर से कर्म करती है, वैसे ही परमेश्वर को ही सर्वस्व समझकर परमेश्वर का चिंतन करते हुए परमेश्वर की आज्ञा के अनुसार मन, वाणी और शरीर से परमेश्वर के ही लिए स्वाभाविक कर्तव्य कर्म का आचरण करना 'कर्म द्वारा परमेश्वर को पूजना' है) मनुष्य परमसिद्धि को प्राप्त हो जाता है\n" +
                    " ॥46॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==45)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "श्रेयान्स्वधर्मो विगुणः परधर्मात्स्वनुष्ठितात्।\n" +
                    " स्वभावनियतं कर्म कुर्वन्नाप्नोति किल्बिषम्  ॥47॥\n" +
                    "\n" +
                    "भावार्थ  :-  अच्छी प्रकार आचरण किए हुए दूसरे के धर्म से गुणरहित भी अपना धर्म श्रेष्ठ है, क्योंकि स्वभाव से नियत किए हुए स्वधर्मरूप कर्म को करता हुआ मनुष्य पाप को नहीं प्राप्त होता\n" +
                    " ॥47॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==46)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "सहजं कर्म कौन्तेय सदोषमपि न त्यजेत्।\n" +
                    " सर्वारम्भा हि दोषेण धूमेनाग्निरिवावृताः  ॥48॥\n" +
                    "\n" +
                    "भावार्थ  :-  अतएव हे कुन्तीपुत्र! दोषयुक्त होने पर भी सहज कर्म (प्रकृति के अनुसार शास्त्र विधि से नियत किए हुए वर्णाश्रम के धर्म और सामान्य धर्मरूप स्वाभाविक कर्म हैं उनको ही यहाँ स्वधर्म, सहज कर्म, स्वकर्म, नियत कर्म, स्वभावज कर्म, स्वभावनियत कर्म इत्यादि नामों से कहा है) को नहीं त्यागना चाहिए, क्योंकि धूएँ से अग्नि की भाँति सभी कर्म किसी-न-किसी दोष से युक्त हैं\n" +
                    " ॥48॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==47)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "(ज्ञाननिष्ठा का विषय )\n" +
                    " असक्तबुद्धिः सर्वत्र जितात्मा विगतस्पृहः।\n" +
                    " नैष्कर्म्यसिद्धिं परमां सन्न्यासेनाधिगच्छति  ॥49॥\n" +
                    "\n" +
                    "भावार्थ  :-  सर्वत्र आसक्तिरहित बुद्धिवाला, स्पृहारहित और जीते हुए अंतःकरण वाला पुरुष सांख्ययोग के द्वारा उस परम नैष्कर्म्यसिद्धि को प्राप्त होता है\n" +
                    " ॥49॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==48)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "सिद्धिं प्राप्तो यथा ब्रह्म तथाप्नोति निबोध मे।\n" +
                    " समासेनैव कौन्तेय निष्ठा ज्ञानस्य या परा  ॥50॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो कि ज्ञान योग की परानिष्ठा है, उस नैष्कर्म्य सिद्धि को जिस प्रकार से प्राप्त होकर मनुष्य ब्रह्म को प्राप्त होता है, उस प्रकार को हे कुन्तीपुत्र! तू संक्षेप में ही मुझसे समझ\n" +
                    " ॥50॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==49)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "बुद्ध्या विशुद्धया युक्तो धृत्यात्मानं नियम्य च।\n" +
                    " शब्दादीन्विषयांस्त्यक्त्वा रागद्वेषौ व्युदस्य च  ॥51॥\n" +
                    " विविक्तसेवी लघ्वाशी यतवाक्कायमानस।\n" +
                    " ध्यानयोगपरो नित्यं वैराग्यं समुपाश्रितः  ॥52॥\n" +
                    " अहङकारं बलं दर्पं कामं क्रोधं परिग्रहम्।\n" +
                    " विमुच्य निर्ममः शान्तो ब्रह्मभूयाय कल्पते  ॥53॥\n" +
                    "\n" +
                    "भावार्थ  :-  विशुद्ध बुद्धि से युक्त तथा हलका, सात्त्विक और नियमित भोजन करने वाला, शब्दादि विषयों का त्याग करके एकांत और शुद्ध देश का सेवन करने वाला, सात्त्विक धारण शक्ति के (इसी अध्याय के श्लोक 33 में जिसका विस्तार है) द्वारा अंतःकरण और इंद्रियों का संयम करके मन, वाणी और शरीर को वश में कर लेने वाला, राग-द्वेष को सर्वथा नष्ट करके भलीभाँति दृढ़ वैराग्य का आश्रय लेने वाला तथा अहंकार, बल, घमंड, काम, क्रोध और परिग्रह का त्याग करके निरंतर ध्यान योग के परायण रहने वाला, ममतारहित और शांतियुक्त पुरुष सच्चिदानन्दघन ब्रह्म में अभिन्नभाव से स्थित होने का पात्र होता है\n" +
                    " ॥51-53॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==50)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "ब्रह्मभूतः प्रसन्नात्मा न शोचति न काङ्क्षति।\n" +
                    " समः सर्वेषु भूतेषु मद्भक्तिं लभते पराम्  ॥54॥\n" +
                    "\n" +
                    "भावार्थ  :-  फिर वह सच्चिदानन्दघन ब्रह्म में एकीभाव से स्थित, प्रसन्न मनवाला योगी न तो किसी के लिए शोक करता है और न किसी की आकांक्षा ही करता है। ऐसा समस्त प्राणियों में समभाव वाला (गीता अध्याय 6 श्लोक 29 में देखना चाहिए) योगी मेरी पराभक्ति को ( जो तत्त्व ज्ञान की पराकाष्ठा है तथा जिसको प्राप्त होकर और कुछ जानना बाकी नहीं रहता वही यहाँ पराभक्ति, ज्ञान की परानिष्ठा, परम नैष्कर्म्यसिद्धि और परमसिद्धि इत्यादि नामों से कही गई है) प्राप्त हो जाता है\n" +
                    " ॥54॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==51)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "भक्त्या मामभिजानाति यावान्यश्चास्मि तत्त्वतः।\n" +
                    " ततो मां तत्त्वतो ज्ञात्वा विशते तदनन्तरम्  ॥55॥\n" +
                    "\n" +
                    "भावार्थ  :-  उस पराभक्ति के द्वारा वह मुझ परमात्मा को, मैं जो हूँ और जितना हूँ, ठीक वैसा-का-वैसा तत्त्व से जान लेता है तथा उस भक्ति से मुझको तत्त्व से जानकर तत्काल ही मुझमें प्रविष्ट हो जाता है\n" +
                    " ॥55॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==52)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "( भक्ति सहित कर्मयोग का विषय ) \n" +
                    " सर्वकर्माण्यपि सदा कुर्वाणो मद्व्यपाश्रयः।\n" +
                    " मत्प्रसादादवाप्नोति शाश्वतं पदमव्ययम्  ॥56॥\n" +
                    "\n" +
                    "भावार्थ  :-  मेरे परायण हुआ कर्मयोगी तो संपूर्ण कर्मों को सदा करता हुआ भी मेरी कृपा से सनातन अविनाशी परमपद को प्राप्त हो जाता है\n" +
                    " ॥56॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==53)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "चेतसा सर्वकर्माणि मयि सन्न्यस्य मत्परः।\n" +
                    " बुद्धियोगमुपाश्रित्य मच्चित्तः सततं भव ॥57॥\n" +
                    "\n" +
                    "भावार्थ  :-  सब कर्मों को मन से मुझमें अर्पण करके (गीता अध्याय 9 श्लोक 27 में जिसकी विधि कही है) तथा समबुद्धि रूप योग को अवलंबन करके मेरे परायण और निरंतर मुझमें चित्तवाला हो\n" +
                    " ॥57॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==54)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "मच्चित्तः सर्वदुर्गाणि मत्प्रसादात्तरिष्यसि।\n" +
                    " अथ चेत्वमहाङ्कारान्न श्रोष्यसि विनङ्क्ष्यसि  ॥58॥\n" +
                    "\n" +
                    "भावार्थ  :-  उपर्युक्त प्रकार से मुझमें चित्तवाला होकर तू मेरी कृपा से समस्त संकटों को अनायास ही पार कर जाएगा और यदि अहंकार के कारण मेरे वचनों को न सुनेगा तो नष्ट हो जाएगा अर्थात परमार्थ से भ्रष्ट हो जाएगा\n" +
                    " ॥58॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
         else if(position==55)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "यदहङ्कारमाश्रित्य न योत्स्य इति मन्यसे।\n" +
                    " मिथ्यैष व्यवसायस्ते प्रकृतिस्त्वां नियोक्ष्यति ॥59॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो तू अहंकार का आश्रय लेकर यह मान रहा है कि 'मैं युद्ध नहीं करूँगा' तो तेरा यह निश्चय मिथ्या है, क्योंकि तेरा स्वभाव तुझे जबर्दस्ती युद्ध में लगा देगा\n" +
                    " ॥59॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }

        else if(position==56)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "स्वभावजेन कौन्तेय निबद्धः स्वेन कर्मणा।\n" +
                    " कर्तुं नेच्छसि यन्मोहात्करिष्यस्यवशोऽपि तत्  ॥60॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे कुन्तीपुत्र! जिस कर्म को तू मोह के कारण करना नहीं चाहता, उसको भी अपने पूर्वकृत स्वाभाविक कर्म से बँधा हुआ परवश होकर करेगा\n" +
                    " ॥60॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==57)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "ईश्वरः सर्वभूतानां हृद्देशेऽजुर्न तिष्ठति।\n" +
                    " भ्रामयन्सर्वभूतानि यन्त्रारुढानि मायया  ॥61॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! शरीर रूप यंत्र में आरूढ़ हुए संपूर्ण प्राणियों को अन्तर्यामी परमेश्वर अपनी माया से उनके कर्मों के अनुसार भ्रमण कराता हुआ सब प्राणियों के हृदय में स्थित है\n" +
                    " ॥61॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==58)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "तमेव शरणं गच्छ सर्वभावेन भारत।\n" +
                    " तत्प्रसादात्परां शान्तिं स्थानं प्राप्स्यसि शाश्वतम्  ॥62॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे भारत! तू सब प्रकार से उस परमेश्वर की ही शरण में (लज्जा, भय, मान, बड़ाई और आसक्ति को त्यागकर एवं शरीर और संसार में अहंता, ममता से रहित होकर एक परमात्मा को ही परम आश्रय, परम गति और सर्वस्व समझना तथा अनन्य भाव से अतिशय श्रद्धा, भक्ति और प्रेमपूर्वक निरंतर भगवान के नाम, गुण, प्रभाव और स्वरूप का चिंतन करते रहना एवं भगवान का भजन, स्मरण करते हुए ही उनके आज्ञा अनुसार कर्तव्य कर्मों का निःस्वार्थ भाव से केवल परमेश्वर के लिए आचरण करना यह 'सब प्रकार से परमात्मा के ही शरण' होना है) जा। उस परमात्मा की कृपा से ही तू परम शांति को तथा सनातन परमधाम को प्राप्त होगा\n" +
                    " ॥62॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==59)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "इति ते ज्ञानमाख्यातं गुह्याद्गुह्यतरं मया।\n" +
                    " विमृश्यैतदशेषेण यथेच्छसि तथा कुरु ॥63॥\n" +
                    "\n" +
                    "भावार्थ  :-  इस प्रकार यह गोपनीय से भी अति गोपनीय ज्ञान मैंने तुमसे कह दिया। अब तू इस रहस्ययुक्त ज्ञान को पूर्णतया भलीभाँति विचार कर, जैसे चाहता है वैसे ही कर\n" +
                    " ॥63॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==60)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "सर्वगुह्यतमं भूतः श्रृणु मे परमं वचः।\n" +
                    " इष्टोऽसि मे दृढमिति ततो वक्ष्यामि ते हितम्  ॥64॥\n" +
                    "\n" +
                    "भावार्थ  :-  संपूर्ण गोपनीयों से अति गोपनीय मेरे परम रहस्ययुक्त वचन को तू फिर भी सुन। तू मेरा अतिशय प्रिय है, इससे यह परम हितकारक वचन मैं तुझसे कहूँगा\n" +
                    " ॥64॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==61)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "मन्मना भव मद्भक्तो मद्याजी मां नमस्कुरु।\n" +
                    " मामेवैष्यसि सत्यं ते प्रतिजाने प्रियोऽसि मे  ॥65॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! तू मुझमें मनवाला हो, मेरा भक्त बन, मेरा पूजन करने वाला हो और मुझको प्रणाम कर। ऐसा करने से तू मुझे ही प्राप्त होगा, यह मैं तुझसे सत्य प्रतिज्ञा करता हूँ क्योंकि तू मेरा अत्यंत प्रिय है\n" +
                    " ॥65॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==62)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "सर्वधर्मान्परित्यज्य मामेकं शरणं व्रज।\n" +
                    " अहं त्वा सर्वपापेभ्यो मोक्षयिष्यामि मा शुचः  ॥66॥\n" +
                    "\n" +
                    "भावार्थ  :-  संपूर्ण धर्मों को अर्थात संपूर्ण कर्तव्य कर्मों को मुझमें त्यागकर तू केवल एक मुझ सर्वशक्तिमान, सर्वाधार परमेश्वर की ही शरण (इसी अध्याय के श्लोक 62 की टिप्पणी में शरण का भाव देखना चाहिए।) में आ जा। मैं तुझे संपूर्ण पापों से मुक्त कर दूँगा, तू शोक मत कर\n" +
                    " ॥66॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==63)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "( श्रीगीताजी का माहात्म्य )\n" +
                    " इदं ते नातपस्काय नाभक्ताय कदाचन।\n" +
                    " न चाशुश्रूषवे वाच्यं न च मां योऽभ्यसूयति ॥67॥\n" +
                    "\n" +
                    "भावार्थ  :-  तुझे यह गीत रूप रहस्यमय उपदेश किसी भी काल में न तो तपरहित मनुष्य से कहना चाहिए, न भक्ति-(वेद, शास्त्र और परमेश्वर तथा महात्मा और गुरुजनों में श्रद्धा, प्रेम और पूज्य भाव का नाम 'भक्ति' है।)-रहित से और न बिना सुनने की इच्छा वाले से ही कहना चाहिए तथा जो मुझमें दोषदृष्टि रखता है, उससे तो कभी भी नहीं कहना चाहिए\n" +
                    " ॥67॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==64)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "य इमं परमं गुह्यं मद्भक्तेष्वभिधास्यति।\n" +
                    " भक्तिं मयि परां कृत्वा मामेवैष्यत्यसंशयः  ॥68॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो पुरुष मुझमें परम प्रेम करके इस परम रहस्ययुक्त गीताशास्त्र को मेरे भक्तों में कहेगा, वह मुझको ही प्राप्त होगा- इसमें कोई संदेह नहीं है\n" +
                    " ॥68॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==65)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "न च तस्मान्मनुष्येषु कश्चिन्मे प्रियकृत्तमः।\n" +
                    " भविता न च मे तस्मादन्यः प्रियतरो भुवि  ॥69॥\n" +
                    "\n" +
                    "भावार्थ  :-  उससे बढ़कर मेरा प्रिय कार्य करने वाला मनुष्यों में कोई भी नहीं है तथा पृथ्वीभर में उससे बढ़कर मेरा प्रिय दूसरा कोई भविष्य में होगा भी नहीं\n" +
                    " ॥69॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==66)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "अध्येष्यते च य इमं धर्म्यं संवादमावयोः।\n" +
                    " ज्ञानयज्ञेन तेनाहमिष्टः स्यामिति मे मतिः ॥70॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो पुरुष इस धर्ममय हम दोनों के संवाद रूप गीताशास्त्र को पढ़ेगा, उसके द्वारा भी मैं ज्ञानयज्ञ (गीता अध्याय 4 श्लोक 33 का अर्थ देखना चाहिए।) से पूजित होऊँगा- ऐसा मेरा मत है\n" +
                    " ॥70॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==67)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "श्रद्धावाननसूयश्च श्रृणुयादपि यो नरः।\n" +
                    " सोऽपि मुक्तः शुभाँल्लोकान्प्राप्नुयात्पुण्यकर्मणाम्  ॥71॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो मनुष्य श्रद्धायुक्त और दोषदृष्टि से रहित होकर इस गीताशास्त्र का श्रवण भी करेगा, वह भी पापों से मुक्त होकर उत्तम कर्म करने वालों के श्रेष्ठ लोकों को प्राप्त होगा\n" +
                    " ॥71॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==68)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "कच्चिदेतच्छ्रुतं पार्थ त्वयैकाग्रेण चेतसा।\n" +
                    " कच्चिदज्ञानसम्मोहः प्रनष्टस्ते धनञ्जय  ॥72॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे पार्थ! क्या इस (गीताशास्त्र) को तूने एकाग्रचित्त से श्रवण किया? और हे धनञ्जय! क्या तेरा अज्ञानजनित मोह नष्ट हो गया?\n" +
                    " ॥72॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==69)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "अर्जुन उवाच   :-\n" +
                    " नष्टो मोहः स्मृतिर्लब्धा त्वप्रसादान्मयाच्युत।\n" +
                    " स्थितोऽस्मि गतसंदेहः करिष्ये वचनं तव  ॥73॥\n" +
                    "\n" +
                    "भावार्थ  :-  अर्जुन बोले- हे अच्युत! आपकी कृपा से मेरा मोह नष्ट हो गया और मैंने स्मृति प्राप्त कर ली है, अब मैं संशयरहित होकर स्थिर हूँ, अतः आपकी आज्ञा का पालन करूँगा\n" +
                    " ॥73॥ \n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==70)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "संजय उवाच  :-\n" +
                    " इत्यहं वासुदेवस्य पार्थस्य च महात्मनः।\n" +
                    " संवादमिममश्रौषमद्भुतं रोमहर्षणम् ॥74॥\n" +
                    "\n" +
                    "भावार्थ  :-  संजय बोले- इस प्रकार मैंने श्री वासुदेव के और महात्मा अर्जुन के इस अद्भुत रहस्ययुक्त, रोमांचकारक संवाद को सुना\n" +
                    " ॥74॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==71)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "व्यासप्रसादाच्छ्रुतवानेतद्गुह्यमहं परम्।\n" +
                    " योगं योगेश्वरात्कृष्णात्साक्षात्कथयतः स्वयम्  ॥75॥\n" +
                    "\n" +
                    "भावार्थ  :-  योगं योगेश्वरात्कृष्णात्साक्षात्कथयतः स्वयम्॥ श्री व्यासजी की कृपा से दिव्य दृष्टि पाकर मैंने इस परम गोपनीय योग को अर्जुन के प्रति कहते हुए स्वयं योगेश्वर भगवान श्रीकृष्ण से प्रत्यक्ष सुना\n" +
                    " ॥75॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==72)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "राजन्संस्मृत्य संस्मृत्य संवादमिममद्भुतम्।\n" +
                    " केशवार्जुनयोः पुण्यं हृष्यामि च मुहुर्मुहुः  ॥76॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे राजन! भगवान श्रीकृष्ण और अर्जुन के इस रहस्ययुक्त, कल्याणकारक और अद्भुत संवाद को पुनः-पुनः स्मरण करके मैं बार-बार हर्षित हो रहा हूँ\n" +
                    " ॥76॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==73)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "तच्च संस्मृत्य संस्मृत्य रूपमत्यद्भुतं हरेः।\n" +
                    " विस्मयो मे महान् राजन्हृष्यामि च पुनः पुनः  ॥77॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे राजन्! श्रीहरि (जिसका स्मरण करने से पापों का नाश होता है उसका नाम 'हरि' है) के उस अत्यंत विलक्षण रूप को भी पुनः-पुनः स्मरण करके मेरे चित्त में महान आश्चर्य होता है और मैं बार-बार हर्षित हो रहा हूँ\n" +
                    " ॥77॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        else if(position==74)
        {
            EighteenFragment eighteenFragment=new EighteenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message18", "यत्र योगेश्वरः कृष्णो यत्र पार्थो धनुर्धरः।\n" +
                    " तत्र श्रीर्विजयो भूतिर्ध्रुवा नीतिर्मतिर्मम   ॥78॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे राजन! जहाँ योगेश्वर भगवान श्रीकृष्ण हैं और जहाँ गाण्डीव-धनुषधारी अर्जुन है, वहीं पर श्री, विजय, विभूति और अचल नीति है- ऐसा मेरा मत है\n" +
                    " ॥78॥ \n" +
                    " \n" +
                    " ॐ तत्सदिति श्रीमद्भगवद्गीतासूपनिषत्सु ब्रह्मविद्यायां योगशास्त्रे श्रीकृष्णार्जुनसंवादे मोक्षसन्न्यासयोगो नामाष्टादशोऽध्यायः\n" +
                    " ॥18॥\n");
            eighteenFragment.setArguments(bundle);
            return  eighteenFragment;
        }
        
        return null;
    }

    @Override
    public int getCount() {
        return 75;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        if(position<=35)
        {
            return "श्लोक "+position;
        }
        else if(position==36)
        {
            return "श्लोक 36,37";
        }
        else if(position<=49)
        {
            position=position+1;
            return "श्लोक "+position;
        }
        else if(position==50)
        {
            return  "श्लोक 51,52,53";
        }
        else if(position<=75){
            position=position+3;
            return  "श्लोक "+position;
        }
        return null;
    }
}
