package com.parmu.bhagwatgeeta.pageradapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.parmu.bhagwatgeeta.fragments.TwoFragment;

public class ViewPagerAdapter2 extends FragmentStatePagerAdapter {
    public ViewPagerAdapter2(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter2(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", " संजय उवाच    :-\n" +
                    " तं तथा कृपयाविष्टमश्रुपूर्णाकुलेक्षणम्।\n" +
                    " विषीदन्तमिदं वाक्यमुवाच मधुसूदनः॥1॥\n" +
                    "\n" +
                    "भावार्थ  :- संजय बोले- उस प्रकार करुणा से व्याप्त और आँसुओं से पूर्ण तथा व्याकुल नेत्रों वाले शोकयुक्त उस अर्जुन के प्रति भगवान मधुसूदन ने यह वचन कहा\n" +
                    " ॥1॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==1)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "श्रीभगवानुवाच  :-\n" +
                    " कुतस्त्वा कश्मलमिदं विषमे समुपस्थितम्।\n" +
                    " अनार्यजुष्टमस्वर्ग्यमकीर्तिकरमर्जुन ॥2॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्रीभगवान बोले- हे अर्जुन! तुझे इस असमय में यह मोह किस हेतु से प्राप्त हुआ? क्योंकि न तो यह श्रेष्ठ पुरुषों द्वारा आचरित है, न स्वर्ग को देने वाला है और न कीर्ति को करने वाला ही है\n" +
                    " ॥2॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==2)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "क्लैब्यं मा स्म गमः पार्थ नैतत्त्वय्युपपद्यते।\n" +
                    " क्षुद्रं हृदयदौर्बल्यं त्यक्त्वोत्तिष्ठ परन्तप ॥3॥\n" +
                    "\n" +
                    "भावार्थ  :-  इसलिए हे अर्जुन! नपुंसकता को मत प्राप्त हो, तुझमें यह उचित नहीं जान पड़ती। हे परंतप! हृदय की तुच्छ दुर्बलता को त्यागकर युद्ध के लिए खड़ा हो जा\n" +
                    " ॥3॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==3)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "अर्जुन उवाच  :-\n" +
                    " कथं भीष्ममहं सङ्ख्ये द्रोणं च मधुसूदन।\n" +
                    " इषुभिः प्रतियोत्स्यामि पूजार्हावरिसूदन॥4॥\n" +
                    "\n" +
                    "भावार्थ  :-  अर्जुन बोले- हे मधुसूदन! मैं रणभूमि में किस प्रकार बाणों से भीष्म पितामह और द्रोणाचार्य के विरुद्ध लड़ूँगा? क्योंकि हे अरिसूदन! वे दोनों ही पूजनीय हैं\n" +
                    " ॥4॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==4)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "गुरूनहत्वा हि महानुभावान् श्रेयो भोक्तुं भैक्ष्यमपीह लोके।\n" +
                    "हत्वार्थकामांस्तु गुरूनिहैव भुञ्जीय भोगान् रुधिरप्रदिग्धान्॥5॥\n" +
                    "\n" +
                    "भावार्थ  :-  इसलिए इन महानुभाव गुरुजनों को न मारकर मैं इस लोक में भिक्षा का अन्न भी खाना कल्याणकारक समझता हूँ क्योंकि गुरुजनों को मारकर भी इस लोक में रुधिर से सने हुए अर्थ और कामरूप भोगों को ही तो भोगूँगा\n" +
                    " ॥5॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==5)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "न चैतद्विद्मः कतरन्नो गरीयो  यद्वा जयेम यदि वा नो जयेयुः।\n" +
                    " यानेव हत्वा न जिजीविषाम  स्तेऽवस्थिताः प्रमुखे धार्तराष्ट्राः॥6॥\n" +
                    "\n" +
                    "भावार्थ  :-  हम यह भी नहीं जानते कि हमारे लिए युद्ध करना और न करना- इन दोनों में से कौन-सा श्रेष्ठ है, अथवा यह भी नहीं जानते कि उन्हें हम जीतेंगे या हमको वे जीतेंगे। और जिनको मारकर हम जीना भी नहीं चाहते, वे ही हमारे आत्मीय धृतराष्ट्र के पुत्र हमारे मुकाबले में खड़े हैं\n" +
                    " ॥6॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==6)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "कार्पण्यदोषोपहतस्वभावः पृच्छामि त्वां धर्मसम्मूढचेताः।\n" +
                    " यच्छ्रेयः स्यान्निश्चितं ब्रूहि तन्मे शिष्यस्तेऽहं शाधि मां त्वां प्रपन्नम्॥7॥\n" +
                    "\n" +
                    "भावार्थ  :-  इसलिए कायरता रूप दोष से उपहत हुए स्वभाव वाला तथा धर्म के विषय में मोहित चित्त हुआ मैं आपसे पूछता हूँ कि जो साधन निश्चित कल्याणकारक हो, वह मेरे लिए कहिए क्योंकि मैं आपका शिष्य हूँ, इसलिए आपके शरण हुए मुझको शिक्षा दीजिए\n" +
                    " ॥7॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==7)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "न हि प्रपश्यामि ममापनुद्या द्यच्छोकमुच्छोषणमिन्द्रियाणाम्।\n" +
                    " अवाप्य भूमावसपत्रमृद्धं राज्यं सुराणामपि चाधिपत्यम् ॥8॥\n" +
                    "\n" +
                    "भावार्थ  :-  क्योंकि भूमि में निष्कण्टक, धन-धान्य सम्पन्न राज्य को और देवताओं के स्वामीपने को प्राप्त होकर भी मैं उस उपाय को नहीं देखता हूँ, जो मेरी इन्द्रियों के सुखाने वाले शोक को दूर कर सके\n" +
                    " ॥8॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==8)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "संजय उवाच  :-\n" +
                    " एवमुक्त्वा हृषीकेशं गुडाकेशः परन्तप।\n" +
                    " न योत्स्य इतिगोविन्दमुक्त्वा तूष्णीं बभूव ह ॥9॥\n" +
                    "\n" +
                    "भावार्थ  :-  संजय बोले- हे राजन्! निद्रा को जीतने वाले अर्जुन अंतर्यामी श्रीकृष्ण महाराज के प्रति इस प्रकार कहकर फिर श्री गोविंद भगवान् से 'युद्ध नहीं करूँगा' यह स्पष्ट कहकर चुप हो गए\n" +
                    " ॥9॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==9)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "तमुवाच हृषीकेशः प्रहसन्निव भारत।\n" +
                    " सेनयोरुभयोर्मध्ये विषीदंतमिदं वचः  ॥10॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे भरतवंशी धृतराष्ट्र! अंतर्यामी श्रीकृष्ण महाराज दोनों सेनाओं के बीच में शोक करते हुए उस अर्जुन को हँसते हुए से यह वचन बोले ॥10॥\n" +
                    "\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==10)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "श्री भगवानुवाच  :-\n" +
                    " अशोच्यानन्वशोचस्त्वं प्रज्ञावादांश्च भाषसे।\n" +
                    " गतासूनगतासूंश्च नानुशोचन्ति पण्डिताः  ॥11॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान बोले, हे अर्जुन! तू न शोक करने योग्य मनुष्यों के लिए शोक करता है और पण्डितों के से वचनों को कहता है, परन्तु जिनके प्राण चले गए हैं, उनके लिए और जिनके प्राण नहीं गए हैं उनके लिए भी पण्डितजन शोक नहीं करते\n" +
                    " ॥11॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==11)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "न त्वेवाहं जातु नासं न त्वं नेमे जनाधिपाः।\n" +
                    " न चैव न भविष्यामः सर्वे वयमतः परम्  ॥12॥\n" +
                    "\n" +
                    "भावार्थ  :-  न तो ऐसा ही है कि मैं किसी काल में नहीं था, तू नहीं था अथवा ये राजा लोग नहीं थे और न ऐसा ही है कि इससे आगे हम सब नहीं रहेंगे\n" +
                    " ॥12॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==12)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "देहिनोऽस्मिन्यथा देहे कौमारं यौवनं जरा।\n" +
                    " तथा देहान्तरप्राप्तिर्धीरस्तत्र न मुह्यति  ॥13॥\n" +
                    "\n" +
                    "भावार्थ  :-  जैसे जीवात्मा की इस देह में बालकपन, जवानी और वृद्धावस्था होती है, वैसे ही अन्य शरीर की प्राप्ति होती है, उस विषय में धीर पुरुष मोहित नहीं होता।13॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==13)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "मात्रास्पर्शास्तु कौन्तेय शीतोष्णसुखदुःखदाः।\n" +
                    " आगमापायिनोऽनित्यास्तांस्तितिक्षस्व भारत ॥14॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे कुंतीपुत्र! सर्दी-गर्मी और सुख-दुःख को देने वाले इन्द्रिय और विषयों के संयोग तो उत्पत्ति-विनाशशील और अनित्य हैं, इसलिए हे भारत! उनको तू सहन कर\n" +
                    " ॥14॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==14)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "यं हि न व्यथयन्त्येते पुरुषं पुरुषर्षभ।\n" +
                    " समदुःखसुखं धीरं सोऽमृतत्वाय कल्पते ॥15॥\n" +
                    "\n" +
                    "भावार्थ  :-  क्योंकि हे पुरुषश्रेष्ठ! दुःख-सुख को समान समझने वाले जिस धीर पुरुष को ये इन्द्रिय और विषयों के संयोग व्याकुल नहीं करते, वह मोक्ष के योग्य होता है\n" +
                    " ॥15॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==15)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "नासतो विद्यते भावो नाभावो विद्यते सतः।\n" +
                    " उभयोरपि दृष्टोऽन्तस्त्वनयोस्तत्वदर्शिभिः  ॥16॥\n" +
                    "\n" +
                    "भावार्थ  :-  असत् वस्तु की तो सत्ता नहीं है और सत् का अभाव नहीं है। इस प्रकार इन दोनों का ही तत्व तत्वज्ञानी पुरुषों द्वारा देखा गया है\n" +
                    " ॥16॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==16)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "अविनाशि तु तद्विद्धि येन सर्वमिदं ततम्।\n" +
                    " विनाशमव्ययस्यास्य न कश्चित्कर्तुमर्हति  ॥17॥\n" +
                    "\n" +
                    "भावार्थ  :-  नाशरहित तो तू उसको जान, जिससे यह सम्पूर्ण जगत्- दृश्यवर्ग व्याप्त है। इस अविनाशी का विनाश करने में कोई भी समर्थ नहीं है\n" +
                    " ॥17॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==17)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "अन्तवन्त इमे देहा नित्यस्योक्ताः शरीरिणः।\n" +
                    " अनाशिनोऽप्रमेयस्य तस्माद्युध्यस्व भारत  ॥18॥\n" +
                    "\n" +
                    "भावार्थ  :-  इस नाशरहित, अप्रमेय, नित्यस्वरूप जीवात्मा के ये सब शरीर नाशवान कहे गए हैं, इसलिए हे भरतवंशी अर्जुन! तू युद्ध कर\n" +
                    " ॥18॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==18)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "य एनं वेत्ति हन्तारं यश्चैनं मन्यते हतम्।\n" +
                    " उभौ तौ न विजानीतो नायं हन्ति न हन्यते  ॥19॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो इस आत्मा को मारने वाला समझता है तथा जो इसको मरा मानता है, वे दोनों ही नहीं जानते क्योंकि यह आत्मा वास्तव में न तो किसी को मारता है और न किसी द्वारा मारा जाता है\n" +
                    " ॥19॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==19)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "न जायते म्रियते वा कदाचिन्नायं भूत्वा भविता वा न भूयः।\n" +
                    "अजो नित्यः शाश्वतोऽयं पुराणो न हन्यते हन्यमाने शरीरे  ॥20॥\n" +
                    "\n" +
                    "भावार्थ  :-  यह आत्मा किसी काल में भी न तो जन्मता है और न मरता ही है तथा न यह उत्पन्न होकर फिर होने वाला ही है क्योंकि यह अजन्मा, नित्य, सनातन और पुरातन है, शरीर के मारे जाने पर भी यह नहीं मारा जाता\n" +
                    " ॥20॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==20)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "वेदाविनाशिनं नित्यं य एनमजमव्ययम्।\n" +
                    " कथं स पुरुषः पार्थ कं घातयति हन्ति कम्  ॥21॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे पृथापुत्र अर्जुन! जो पुरुष इस आत्मा को नाशरहित, नित्य, अजन्मा और अव्यय जानता है, वह पुरुष कैसे किसको मरवाता है और कैसे किसको मारता है?\n" +
                    " ॥21॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==21)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "वासांसि जीर्णानि यथा विहाय नवानि गृह्णाति नरोऽपराणि।\n" +
                    " तथा शरीराणि विहाय जीर्णान्यन्यानि संयाति नवानि देही ॥22॥\n" +
                    "\n" +
                    "भावार्थ  :-  जैसे मनुष्य पुराने वस्त्रों को त्यागकर दूसरे नए वस्त्रों को ग्रहण करता है, वैसे ही जीवात्मा पुराने शरीरों को त्यागकर दूसरे नए शरीरों को प्राप्त होता है\n" +
                    " ॥22॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==22)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "नैनं छिन्दन्ति शस्त्राणि नैनं दहति पावकः।\n" +
                    " न चैनं क्लेदयन्त्यापो न शोषयति मारुतः  ॥23॥\n" +
                    "\n" +
                    "भावार्थ  :-  इस आत्मा को शस्त्र नहीं काट सकते, इसको आग नहीं जला सकती, इसको जल नहीं गला सकता और वायु नहीं सुखा सकता\n" +
                    " ॥23॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==23)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "अच्छेद्योऽयमदाह्योऽयमक्लेद्योऽशोष्य एव च।\n" +
                    " नित्यः सर्वगतः स्थाणुरचलोऽयं सनातनः  ॥24॥\n" +
                    "\n" +
                    "भावार्थ  :-  क्योंकि यह आत्मा अच्छेद्य है, यह आत्मा अदाह्य, अक्लेद्य और निःसंदेह अशोष्य है तथा यह आत्मा नित्य, सर्वव्यापी, अचल, स्थिर रहने वाला और सनातन है\n" +
                    " ॥24॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==24)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "अव्यक्तोऽयमचिन्त्योऽयमविकार्योऽयमुच्यते।\n" +
                    " तस्मादेवं विदित्वैनं नानुशोचितुमर्हसि ॥25॥\n" +
                    "\n" +
                    "भावार्थ  :-  यह आत्मा अव्यक्त है, यह आत्मा अचिन्त्य है और यह आत्मा विकाररहित कहा जाता है। इससे हे अर्जुन! इस आत्मा को उपर्युक्त प्रकार से जानकर तू शोक करने के योग्य नहीं है अर्थात् तुझे शोक करना उचित नहीं है\n" +
                    " ॥25॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==25)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "अथ चैनं नित्यजातं नित्यं वा मन्यसे मृतम्।\n" +
                    " तथापि त्वं महाबाहो नैवं शोचितुमर्हसि  ॥26॥\n" +
                    "\n" +
                    "भावार्थ  :-  किन्तु यदि तू इस आत्मा को सदा जन्मने वाला तथा सदा मरने वाला मानता हो, तो भी हे महाबाहो! तू इस प्रकार शोक करने योग्य नहीं है\n" +
                    " ॥26॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==26)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "जातस्त हि ध्रुवो मृत्युर्ध्रुवं जन्म मृतस्य च।\n" +
                    " तस्मादपरिहार्येऽर्थे न त्वं शोचितुमर्हसि  ॥27॥\n" +
                    "\n" +
                    "भावार्थ  :-  क्योंकि इस मान्यता के अनुसार जन्मे हुए की मृत्यु निश्चित है और मरे हुए का जन्म निश्चित है। इससे भी इस बिना उपाय वाले विषय में तू शोक करने योग्य नहीं है\n" +
                    " ॥27॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==27)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "अव्यक्तादीनि भूतानि व्यक्तमध्यानि भारत।\n" +
                    " अव्यक्तनिधनान्येव तत्र का परिदेवना   ॥28॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! सम्पूर्ण प्राणी जन्म से पहले अप्रकट थे और मरने के बाद भी अप्रकट हो जाने वाले हैं, केवल बीच में ही प्रकट हैं, फिर ऐसी स्थिति में क्या शोक करना है?\n" +
                    " ॥28॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==28)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "आश्चर्यवत्पश्यति कश्चिदेनमाश्चर्यवद्वदति तथैव चान्यः।\n" +
                    " आश्चर्यवच्चैनमन्यः श्रृणोति श्रुत्वाप्येनं वेद न चैव कश्चित् ॥29॥\n" +
                    "\n" +
                    "भावार्थ  :-  कोई एक महापुरुष ही इस आत्मा को आश्चर्य की भाँति देखता है और वैसे ही दूसरा कोई महापुरुष ही इसके तत्व का आश्चर्य की भाँति वर्णन करता है तथा दूसरा कोई अधिकारी पुरुष ही इसे आश्चर्य की भाँति सुनता है और कोई-कोई तो सुनकर भी इसको नहीं जानता\n" +
                    " ॥29॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==29)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "देही नित्यमवध्योऽयं देहे सर्वस्य भारत।\n" +
                    " तस्मात्सर्वाणि भूतानि न त्वं शोचितुमर्हसि ॥30॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! यह आत्मा सबके शरीर में सदा ही अवध्य (जिसका वध नहीं किया जा सके) है। इस कारण सम्पूर्ण प्राणियों के लिए तू शोक करने योग्य नहीं है\n" +
                    " ॥30॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==30)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "स्वधर्ममपि चावेक्ष्य न विकम्पितुमर्हसि।\n" +
                    " धर्म्याद्धि युद्धाच्छ्रेयोऽन्यत्क्षत्रियस्य न विद्यते ॥31॥\n" +
                    "\n" +
                    "भावार्थ  :-  तथा अपने धर्म को देखकर भी तू भय करने योग्य नहीं है अर्थात् तुझे भय नहीं करना चाहिए क्योंकि क्षत्रिय के लिए धर्मयुक्त युद्ध से बढ़कर दूसरा कोई कल्याणकारी कर्तव्य नहीं है\n" +
                    " ॥31॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==31)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "यदृच्छया चोपपन्नां स्वर्गद्वारमपावृतम्।\n" +
                    " सुखिनः क्षत्रियाः पार्थ लभन्ते युद्धमीदृशम् ॥32॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे पार्थ! अपने-आप प्राप्त हुए और खुले हुए स्वर्ग के द्वार रूप इस प्रकार के युद्ध को भाग्यवान क्षत्रिय लोग ही पाते हैं\n" +
                    " ॥32॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==32)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "अथ चेत्त्वमिमं धर्म्यं सङ्ग्रामं न करिष्यसि।\n" +
                    " ततः स्वधर्मं कीर्तिं च हित्वा पापमवाप्स्यसि ॥33॥\n" +
                    "\n" +
                    "भावार्थ  :-  किन्तु यदि तू इस धर्मयुक्त युद्ध को नहीं करेगा तो स्वधर्म और कीर्ति को खोकर पाप को प्राप्त होगा \n" +
                    " ॥33॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==33)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "अकीर्तिं चापि भूतानि कथयिष्यन्ति तेऽव्ययाम्।\n" +
                    " सम्भावितस्य चाकीर्तिर्मरणादतिरिच्यते ॥34॥\n" +
                    "\n" +
                    "भावार्थ  :-  तथा सब लोग तेरी बहुत काल तक रहने वाली अपकीर्ति का भी कथन करेंगे और माननीय पुरुष के लिए अपकीर्ति मरण से भी बढ़कर है\n" +
                    " ॥34॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==34)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "भयाद्रणादुपरतं मंस्यन्ते त्वां महारथाः।\n" +
                    " येषां च त्वं बहुमतो भूत्वा यास्यसि लाघवम्  ॥35॥\n" +
                    "\n" +
                    "भावार्थ  :-  और जिनकी दृष्टि में तू पहले बहुत सम्मानित होकर अब लघुता को प्राप्त होगा, वे महारथी लोग तुझे भय के कारण युद्ध से हटा हुआ मानेंगे\n" +
                    " ॥35॥\nभयाद्रणादुपरतं मंस्यन्ते त्वां महारथाः।\n" +
                    " येषां च त्वं बहुमतो भूत्वा यास्यसि लाघवम्  ॥35॥\n" +
                    "\n" +
                    "भावार्थ  :-  और जिनकी दृष्टि में तू पहले बहुत सम्मानित होकर अब लघुता को प्राप्त होगा, वे महारथी लोग तुझे भय के कारण युद्ध से हटा हुआ मानेंगे\n" +
                    " ॥35॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==35)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "अवाच्यवादांश्च बहून् वदिष्यन्ति तवाहिताः।\n" +
                    " निन्दन्तस्तव सामर्थ्यं ततो दुःखतरं नु किम्  ॥36॥\n" +
                    "\n" +
                    "भावार्थ  :-  तेरे वैरी लोग तेरे सामर्थ्य की निंदा करते हुए तुझे बहुत से न कहने योग्य वचन भी कहेंगे, उससे अधिक दुःख और क्या होगा?\n" +
                    " ॥36॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==36)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "हतो वा प्राप्स्यसि स्वर्गं जित्वा वा भोक्ष्यसे महीम्।\n" +
                    " तस्मादुत्तिष्ठ कौन्तेय युद्धाय कृतनिश्चयः ॥37॥\n" +
                    "\n" +
                    "भावार्थ  :-  या तो तू युद्ध में मारा जाकर स्वर्ग को प्राप्त होगा अथवा संग्राम में जीतकर पृथ्वी का राज्य भोगेगा। इस कारण हे अर्जुन! तू युद्ध के लिए निश्चय करके खड़ा हो जा\n" +
                    " ॥37॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==37)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "सुखदुःखे समे कृत्वा लाभालाभौ जयाजयौ।\n" +
                    " ततो युद्धाय युज्यस्व नैवं पापमवाप्स्यसि  ॥38॥\n" +
                    "\n" +
                    "भावार्थ  :-  जय-पराजय, लाभ-हानि और सुख-दुख को समान समझकर, उसके बाद युद्ध के लिए तैयार हो जा, इस प्रकार युद्ध करने से तू पाप को नहीं प्राप्त होगा\n" +
                    " ॥38॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==38)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "एषा तेऽभिहिता साङ्ख्ये बुद्धिर्योगे त्विमां श्रृणु।\n" +
                    " बुद्ध्या युक्तो यया पार्थ कर्मबन्धं प्रहास्यसि ॥39॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे पार्थ! यह बुद्धि तेरे लिए ज्ञानयोग के विषय में कही गई और अब तू इसको कर्मयोग के (अध्याय 3 श्लोक 3 की टिप्पणी में इसका विस्तार देखें।) विषय में सुन- जिस बुद्धि से युक्त हुआ तू कर्मों के बंधन को भली-भाँति त्याग देगा अर्थात सर्वथा नष्ट कर डालेगा\n" +
                    " ॥39॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==39)
        {
            TwoFragment twoFragment = new TwoFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message2", "यनेहाभिक्रमनाशोऽस्ति प्रत्यवातो न विद्यते।\n" +
                    " स्वल्पमप्यस्य धर्मस्य त्रायते महतो भयात्  ॥40॥\n" +
                    "\n" +
                    "भावार्थ  :-  इस कर्मयोग में आरंभ का अर्थात बीज का नाश नहीं है और उलटा फलरूप दोष भी नहीं है, बल्कि इस कर्मयोग रूप धर्म का थोड़ा-सा भी साधन जन्म-मृत्यु रूप महान भय से रक्षा कर लेता है\n" +
                    " ॥40॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==40)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "व्यवसायात्मिका बुद्धिरेकेह कुरुनन्दन।\n" +
                    " बहुशाका ह्यनन्ताश्च बुद्धयोऽव्यवसायिनाम् ॥41॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! इस कर्मयोग में निश्चयात्मिका बुद्धि एक ही होती है, किन्तु अस्थिर विचार वाले विवेकहीन सकाम मनुष्यों की बुद्धियाँ निश्चय ही बहुत भेदों वाली और अनन्त होती हैं\n" +
                    " ॥41॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==41)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "यामिमां पुष्पितां वाचं प्रवदन्त्यविपश्चितः।\n" +
                    " वेदवादरताः पार्थ नान्यदस्तीति वादिनः  ॥42॥\n" +
                    " कामात्मानः स्वर्गपरा जन्मकर्मफलप्रदाम्।\n" +
                    " क्रियाविश्लेषबहुलां भोगैश्वर्यगतिं प्रति  ॥43॥\n" +
                    " भोगैश्वर्यप्रसक्तानां तयापहृतचेतसाम्।\n" +
                    " व्यवसायात्मिका बुद्धिः समाधौ न विधीयते  ॥44॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! जो भोगों में तन्मय हो रहे हैं, जो कर्मफल के प्रशंसक वेदवाक्यों में ही प्रीति रखते हैं, जिनकी बुद्धि में स्वर्ग ही परम प्राप्य वस्तु है और जो स्वर्ग से बढ़कर दूसरी कोई वस्तु ही नहीं है- ऐसा कहने वाले हैं, वे अविवेकीजन इस प्रकार की जिस पुष्पित अर्थात् दिखाऊ शोभायुक्त वाणी को कहा करते हैं, जो कि जन्मरूप कर्मफल देने वाली एवं भोग तथा ऐश्वर्य की प्राप्ति के लिए नाना प्रकार की बहुत-सी क्रियाओं का वर्णन करने वाली है, उस वाणी द्वारा जिनका चित्त हर लिया गया है, जो भोग और ऐश्वर्य में अत्यन्त आसक्त हैं, उन पुरुषों की परमात्मा में निश्चियात्मिका बुद्धि नहीं होती\n" +
                    " ॥42-44॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==42)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "त्रैगुण्यविषया वेदा निस्त्रैगुण्यो भवार्जुन।\n" +
                    " निर्द्वन्द्वो नित्यसत्वस्थो निर्योगक्षेम आत्मवान्  ॥45॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! वेद उपर्युक्त प्रकार से तीनों गुणों के कार्य रूप समस्त भोगों एवं उनके साधनों का प्रतिपादन करने वाले हैं, इसलिए तू उन भोगों एवं उनके साधनों में आसक्तिहीन, हर्ष-शोकादि द्वंद्वों से रहित, नित्यवस्तु परमात्मा में स्थित योग (अप्राप्त की प्राप्ति का नाम 'योग' है।) क्षेम (प्राप्त वस्तु की रक्षा का नाम 'क्षेम' है।) को न चाहने वाला और स्वाधीन अन्तःकरण वाला हो\n" +
                    " ॥45॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==43)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "यावानर्थ उदपाने सर्वतः सम्प्लुतोदके।\n" +
                    " तावान्सर्वेषु वेदेषु ब्राह्मणस्य विजानतः  ॥46॥\n" +
                    "\n" +
                    "भावार्थ  :-  सब ओर से परिपूर्ण जलाशय के प्राप्त हो जाने पर छोटे जलाशय में मनुष्य का जितना प्रयोजन रहता है, ब्रह्म को तत्व से जानने वाले ब्राह्मण का समस्त वेदों में उतना ही प्रयोजन रह जाता है\n" +
                    " ॥46॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==44)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "कर्मण्येवाधिकारस्ते मा फलेषु कदाचन।\n" +
                    " मा कर्मफलहेतुर्भुर्मा ते संगोऽस्त्वकर्मणि  ॥47॥\n" +
                    "\n" +
                    "भावार्थ  :-  तेरा कर्म करने में ही अधिकार है, उसके फलों में कभी नहीं। इसलिए तू कर्मों के फल हेतु मत हो तथा तेरी कर्म न करने में भी आसक्ति न हो\n" +
                    " ॥47॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==45)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "योगस्थः कुरु कर्माणि संग त्यक्त्वा धनंजय।\n" +
                    " सिद्धयसिद्धयोः समो भूत्वा समत्वं योग उच्यते  ॥48॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे धनंजय! तू आसक्ति को त्यागकर तथा सिद्धि और असिद्धि में समान बुद्धिवाला होकर योग में स्थित हुआ कर्तव्य कर्मों को कर, समत्व (जो कुछ भी कर्म किया जाए, उसके पूर्ण होने और न होने में तथा उसके फल में समभाव रहने का नाम 'समत्व' है।) ही योग कहलाता है\n" +
                    " ॥48॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==46)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "दूरेण ह्यवरं कर्म बुद्धियोगाद्धनंजय।\n" +
                    " बुद्धौ शरणमन्विच्छ कृपणाः फलहेतवः  ॥49॥\n" +
                    "\n" +
                    "भावार्थ  :-  इस समत्वरूप बुद्धियोग से सकाम कर्म अत्यन्त ही निम्न श्रेणी का है। इसलिए हे धनंजय! तू समबुद्धि में ही रक्षा का उपाय ढूँढ अर्थात् बुद्धियोग का ही आश्रय ग्रहण कर क्योंकि फल के हेतु बनने वाले अत्यन्त दीन हैं\n" +
                    " ॥49॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==47)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "बुद्धियुक्तो जहातीह उभे सुकृतदुष्कृते।\n" +
                    " तस्माद्योगाय युज्यस्व योगः कर्मसु कौशलम्  ॥50॥\n" +
                    "\n" +
                    "भावार्थ  :-  समबुद्धियुक्त पुरुष पुण्य और पाप दोनों को इसी लोक में त्याग देता है अर्थात उनसे मुक्त हो जाता है। इससे तू समत्व रूप योग में लग जा, यह समत्व रूप योग ही कर्मों में कुशलता है अर्थात कर्मबंध से छूटने का उपाय है\n" +
                    " ॥50॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==48)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "कर्मजं बुद्धियुक्ता हि फलं त्यक्त्वा मनीषिणः।\n" +
                    " जन्मबन्धविनिर्मुक्ताः पदं गच्छन्त्यनामयम्  ॥51॥\n" +
                    "\n" +
                    "भावार्थ  :-  क्योंकि समबुद्धि से युक्त ज्ञानीजन कर्मों से उत्पन्न होने वाले फल को त्यागकर जन्मरूप बंधन से मुक्त हो निर्विकार परम पद को प्राप्त हो जाते हैं\n" +
                    " ॥51॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==49)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "यदा ते मोहकलिलं बुद्धिर्व्यतितरिष्यति।\n" +
                    " तदा गन्तासि निर्वेदं श्रोतव्यस्य श्रुतस्य च  ॥52॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिस काल में तेरी बुद्धि मोहरूपी दलदल को भलीभाँति पार कर जाएगी, उस समय तू सुने हुए और सुनने में आने वाले इस लोक और परलोक संबंधी सभी भोगों से वैराग्य को प्राप्त हो जाएगा\n" +
                    " ॥52॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==50)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "श्रुतिविप्रतिपन्ना ते यदा स्थास्यति निश्चला।\n" +
                    " समाधावचला बुद्धिस्तदा योगमवाप्स्यसि  ॥53॥\n" +
                    "\n" +
                    "भावार्थ  :-  भाँति-भाँति के वचनों को सुनने से विचलित हुई तेरी बुद्धि जब परमात्मा में अचल और स्थिर ठहर जाएगी, तब तू योग को प्राप्त हो जाएगा अर्थात तेरा परमात्मा से नित्य संयोग हो जाएगा\n" +
                    " ॥53॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==51)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "अर्जुन उवाच  :-\n" +
                    " स्थितप्रज्ञस्य का भाषा समाधिस्थस्य केशव।\n" +
                    " स्थितधीः किं प्रभाषेत किमासीत व्रजेत किम्  ॥54॥\n" +
                    "\n" +
                    "भावार्थ  :-  अर्जुन बोले- हे केशव! समाधि में स्थित परमात्मा को प्राप्त हुए स्थिरबुद्धि पुरुष का क्या लक्षण है? वह स्थिरबुद्धि पुरुष कैसे बोलता है, कैसे बैठता है और कैसे चलता है?\n" +
                    " ॥54॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==52)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "श्रीभगवानुवाच  :-\n" +
                    " प्रजहाति यदा कामान् सर्वान्पार्थ मनोगतान्।\n" +
                    " आत्मयेवात्मना तुष्टः स्थितप्रज्ञस्तदोच्यते  ॥55॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान् बोले- हे अर्जुन! जिस काल में यह पुरुष मन में स्थित सम्पूर्ण कामनाओं को भलीभाँति त्याग देता है और आत्मा से आत्मा में ही संतुष्ट रहता है, उस काल में वह स्थितप्रज्ञ कहा जाता है\n" +
                    " ॥55॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==53)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "दुःखेष्वनुद्विग्नमनाः सुखेषु विगतस्पृहः।\n" +
                    " वीतरागभयक्रोधः स्थितधीर्मुनिरुच्यते  ॥56॥\n" +
                    "\n" +
                    "भावार्थ  :-  दुःखों की प्राप्ति होने पर जिसके मन में उद्वेग नहीं होता, सुखों की प्राप्ति में सर्वथा निःस्पृह है तथा जिसके राग, भय और क्रोध नष्ट हो गए हैं, ऐसा मुनि स्थिरबुद्धि कहा जाता है\n" +
                    " ॥56॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==54)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "यः सर्वत्रानभिस्नेहस्तत्तत्प्राप्य शुभाशुभम्।\n" +
                    " नाभिनंदति न द्वेष्टि तस्य प्रज्ञा प्रतिष्ठिता  ॥57॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो पुरुष सर्वत्र स्नेहरहित हुआ उस-उस शुभ या अशुभ वस्तु को प्राप्त होकर न प्रसन्न होता है और न द्वेष करता है, उसकी बुद्धि स्थिर है\n" +
                    " ॥57॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==55)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "यदा संहरते चायं कूर्मोऽङ्गनीव सर्वशः।\n" +
                    " इन्द्रियाणीन्द्रियार्थेभ्यस्तस्य प्रज्ञा प्रतिष्ठिता  ॥58॥\n" +
                    "\n" +
                    "भावार्थ  :-  और कछुवा सब ओर से अपने अंगों को जैसे समेट लेता है, वैसे ही जब यह पुरुष इन्द्रियों के विषयों से इन्द्रियों को सब प्रकार से हटा लेता है, तब उसकी बुद्धि स्थिर है (ऐसा समझना चाहिए)\n" +
                    " ॥58॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==56)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "विषया विनिवर्तन्ते निराहारस्य देहिनः।\n" +
                    " रसवर्जं रसोऽप्यस्य परं दृष्टवा निवर्तते  ॥59॥\n" +
                    "\n" +
                    "भावार्थ  :-  इन्द्रियों द्वारा विषयों को ग्रहण न करने वाले पुरुष के भी केवल विषय तो निवृत्त हो जाते हैं, परन्तु उनमें रहने वाली आसक्ति निवृत्त नहीं होती। इस स्थितप्रज्ञ पुरुष की तो आसक्ति भी परमात्मा का साक्षात्कार करके निवृत्त हो जाती है\n" +
                    " ॥59॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==57)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "यततो ह्यपि कौन्तेय पुरुषस्य विपश्चितः।\n" +
                    " इन्द्रियाणि प्रमाथीनि हरन्ति प्रसभं मनः  ॥60॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! आसक्ति का नाश न होने के कारण ये प्रमथन स्वभाव वाली इन्द्रियाँ यत्न करते हुए बुद्धिमान पुरुष के मन को भी बलात् हर लेती हैं\n" +
                    " ॥60॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==58)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "तानि सर्वाणि संयम्य युक्त आसीत मत्परः।\n" +
                    " वशे हि यस्येन्द्रियाणि तस्य प्रज्ञा प्रतिष्ठिता  ॥61॥\n" +
                    "\n" +
                    "भावार्थ  :-  इसलिए साधक को चाहिए कि वह उन सम्पूर्ण इन्द्रियों को वश में करके समाहित चित्त हुआ मेरे परायण होकर ध्यान में बैठे क्योंकि जिस पुरुष की इन्द्रियाँ वश में होती हैं, उसी की बुद्धि स्थिर हो जाती है\n" +
                    " ॥61॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==59)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "ध्यायतो विषयान्पुंसः संगस्तेषूपजायते।\n" +
                    " संगात्संजायते कामः कामात्क्रोधोऽभिजायते  ॥62॥\n" +
                    "\n" +
                    "भावार्थ  :-  विषयों का चिन्तन करने वाले पुरुष की उन विषयों में आसक्ति हो जाती है, आसक्ति से उन विषयों की कामना उत्पन्न होती है और कामना में विघ्न पड़ने से क्रोध उत्पन्न होता है\n" +
                    " ॥62॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==60)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "क्रोधाद्भवति सम्मोहः सम्मोहात्स्मृतिविभ्रमः।\n" +
                    " स्मृतिभ्रंशाद् बुद्धिनाशो बुद्धिनाशात्प्रणश्यति  ॥63॥\n" +
                    "\n" +
                    "भावार्थ  :-  क्रोध से अत्यन्त मूढ़ भाव उत्पन्न हो जाता है, मूढ़ भाव से स्मृति में भ्रम हो जाता है, स्मृति में भ्रम हो जाने से बुद्धि अर्थात ज्ञानशक्ति का नाश हो जाता है और बुद्धि का नाश हो जाने से यह पुरुष अपनी स्थिति से गिर जाता है\n" +
                    " ॥63॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==61)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "रागद्वेषवियुक्तैस्तु विषयानिन्द्रियैश्चरन्।\n" +
                    " आत्मवश्यैर्विधेयात्मा प्रसादमधिगच्छति  ॥64॥\n" +
                    "\n" +
                    "भावार्थ  :-  परंन्तु अपने अधीन किए हुए अन्तःकरण वाला साधक अपने वश में की हुई, राग-द्वेष रहित इन्द्रियों द्वारा विषयों में विचरण करता हुआ अन्तःकरण की प्रसन्नता को प्राप्त होता है\n" +
                    " ॥64॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==62)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "प्रसादे सर्वदुःखानां हानिरस्योपजायते।\n" +
                    " प्रसन्नचेतसो ह्याशु बुद्धिः पर्यवतिष्ठते  ॥65॥\n" +
                    "\n" +
                    "भावार्थ  :-  अन्तःकरण की प्रसन्नता होने पर इसके सम्पूर्ण दुःखों का अभाव हो जाता है और उस प्रसन्नचित्त वाले कर्मयोगी की बुद्धि शीघ्र ही सब ओर से हटकर एक परमात्मा में ही भलीभाँति स्थिर हो जाती है\n" +
                    " ॥65॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==63)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "नास्ति बुद्धिरयुक्तस्य न चायुक्तस्य भावना।\n" +
                    " न चाभावयतः शान्तिरशान्तस्य कुतः सुखम्  ॥66॥\n" +
                    "\n" +
                    "भावार्थ  :-  न जीते हुए मन और इन्द्रियों वाले पुरुष में निश्चयात्मिका बुद्धि नहीं होती और उस अयुक्त मनुष्य के अन्तःकरण में भावना भी नहीं होती तथा भावनाहीन मनुष्य को शान्ति नहीं मिलती और शान्तिरहित मनुष्य को सुख कैसे मिल सकता है?\n" +
                    " ॥66॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==64)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "इन्द्रियाणां हि चरतां यन्मनोऽनुविधीयते।\n" +
                    " तदस्य हरति प्रज्ञां वायुर्नावमिवाम्भसि  ॥67॥\n" +
                    "\n" +
                    "भावार्थ  :-  क्योंकि जैसे जल में चलने वाली नाव को वायु हर लेती है, वैसे ही विषयों में विचरती हुई इन्द्रियों में से मन जिस इन्द्रिय के साथ रहता है, वह एक ही इन्द्रिय इस अयुक्त पुरुष की बुद्धि को हर लेती है\n" +
                    " ॥67॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==65)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "तस्माद्यस्य महाबाहो निगृहीतानि सर्वशः।\n" +
                    " इन्द्रियाणीन्द्रियार्थेभ्यस्तस्य प्रज्ञा प्रतिष्ठिता  ॥68॥\n" +
                    "\n" +
                    "भावार्थ  :-  इसलिए हे महाबाहो! जिस पुरुष की इन्द्रियाँ इन्द्रियों के विषयों में सब प्रकार निग्रह की हुई हैं, उसी की बुद्धि स्थिर है\n" +
                    " ॥68॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==66)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "या निशा सर्वभूतानां तस्यां जागर्ति संयमी।\n" +
                    " यस्यां जाग्रति भूतानि सा निशा पश्यतो मुनेः  ॥69॥\n" +
                    "\n" +
                    "भावार्थ  :-  सम्पूर्ण प्राणियों के लिए जो रात्रि के समान है, उस नित्य ज्ञानस्वरूप परमानन्द की प्राप्ति में स्थितप्रज्ञ योगी जागता है और जिस नाशवान सांसारिक सुख की प्राप्ति में सब प्राणी जागते हैं, परमात्मा के तत्व को जानने वाले मुनि के लिए वह रात्रि के समान है\n" +
                    " ॥69॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==67)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "आपूर्यमाणमचलप्रतिष्ठं समुद्रमापः प्रविशन्ति यद्वत्।\n" +
                    " तद्वत्कामा यं प्रविशन्ति सर्वे स शान्तिमाप्नोति न कामकामी  ॥70॥\n" +
                    "\n" +
                    "भावार्थ  :-  जैसे नाना नदियों के जल सब ओर से परिपूर्ण, अचल प्रतिष्ठा वाले समुद्र में उसको विचलित न करते हुए ही समा जाते हैं, वैसे ही सब भोग जिस स्थितप्रज्ञ पुरुष में किसी प्रकार का विकार उत्पन्न किए बिना ही समा जाते हैं, वही पुरुष परम शान्ति को प्राप्त होता है, भोगों को चाहने वाला नहीं\n" +
                    " ॥70॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==68)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "विहाय कामान्यः सर्वान्पुमांश्चरति निःस्पृहः।\n" +
                    " निर्ममो निरहंकारः स शान्तिमधिगच्छति  ॥71॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो पुरुष सम्पूर्ण कामनाओं को त्याग कर ममतारहित, अहंकाररहित और स्पृहारहित हुआ विचरता है, वही शांति को प्राप्त होता है अर्थात वह शान्ति को प्राप्त है\n" +
                    " ॥71॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }
        if(position==69)
        {
            TwoFragment twoFragment= new TwoFragment();
            Bundle bundle=new Bundle();
            bundle.putString("message2", "एषा ब्राह्मी स्थितिः पार्थ नैनां प्राप्य विमुह्यति।\n" +
                    " स्थित्वास्यामन्तकालेऽपि ब्रह्मनिर्वाणमृच्छति ॥72॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! यह ब्रह्म को प्राप्त हुए पुरुष की स्थिति है, इसको प्राप्त होकर योगी कभी मोहित नहीं होता और अंतकाल में भी इस ब्राह्मी स्थिति में स्थित होकर ब्रह्मानन्द को प्राप्त हो जाता है\n" +
                    " ॥72॥ \n" +
                    "\n" +
                    "ॐ तत्सदिति श्रीमद्भगवद्गीतासूपनिषत्सु ब्रह्मविद्यायां योगशास्त्रे श्रीकृष्णार्जुनसंवादे सांख्ययोगो नाम द्वितीयोऽध्यायः \n" +
                    " ॥2॥\n");
            twoFragment.setArguments(bundle);
            return twoFragment;
        }


        return null;
    }

    @Override
    public int getCount() {
        return 70;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        if(position<=41)
        {
            return "श्लोक "+position;
        }
        else if(position==42)
        {
            return "श्लोक 42,43,44";
        }
        else if(position<=70&&position>=43)
        {
            position=position+2;
            return "श्लोक "+position;
        }
        return null;

    }
}
