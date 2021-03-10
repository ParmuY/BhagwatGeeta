package com.parmu.bhagwatgeeta.pageradapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.parmu.bhagwatgeeta.fragments.Fragment12;

public class ViewPagerAdapter12 extends FragmentStatePagerAdapter {
    public ViewPagerAdapter12(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter12(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("message12", "(साकार और निराकार के उपासकों की उत्तमता का निर्णय और भगवत्प्राप्ति के उपाय का विषय) \n" +
                    " अर्जुन उवाच   :-\n" +
                    " एवं सततयुक्ता ये भक्तास्त्वां पर्युपासते।\n" +
                    " ये चाप्यक्षरमव्यक्तं तेषां के योगवित्तमाः  ॥1॥\n" +
                    "\n" +
                    "भावार्थ  :-  अर्जुन बोले- जो अनन्य प्रेमी भक्तजन पूर्वोक्त प्रकार से निरन्तर आपके भजन-ध्यान में लगे रहकर आप सगुण रूप परमेश्वर को और दूसरे जो केवल अविनाशी सच्चिदानन्दघन निराकार ब्रह्म को ही अतिश्रेष्ठ भाव से भजते हैं- उन दोनों प्रकार के उपासकों में अति उत्तम योगवेत्ता कौन हैं?\n" +
                    " ॥1॥\n");
            fragment12.setArguments(bundle);
            return fragment12;
        }

        else if(position==1)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("message12", "श्रीभगवानुवाच   :-\n" +
                    " मय्यावेश्य मनो ये मां नित्ययुक्ता उपासते।\n" +
                    " श्रद्धया परयोपेतास्ते मे युक्ततमा मताः  ॥2॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान बोले- मुझमें मन को एकाग्र करके निरंतर मेरे भजन-ध्यान में लगे हुए (अर्थात गीता अध्याय 11 श्लोक 55 में लिखे हुए प्रकार से निरन्तर मेरे में लगे हुए) जो भक्तजन अतिशय श्रेष्ठ श्रद्धा से युक्त होकर मुझ सगुणरूप परमेश्वर को भजते हैं, वे मुझको योगियों में अति उत्तम योगी मान्य हैं\n" +
                    " ॥2॥\n");
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==2)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("message12", "ये त्वक्षरमनिर्देश्यमव्यक्तं पर्युपासते।\n" +
                    " सर्वत्रगमचिन्त्यं च कूटस्थमचलं ध्रुवम्  ॥3॥\n" +
                    " सन्नियम्येन्द्रियग्रामं सर्वत्र समबुद्धयः।\n" +
                    " ते प्राप्नुवन्ति मामेव सर्वभूतहिते रताः  ॥4॥\n" +
                    "\n" +
                    "भावार्थ  :-  परन्तु जो पुरुष इन्द्रियों के समुदाय को भली प्रकार वश में करके मन-बुद्धि से परे, सर्वव्यापी, अकथनीय स्वरूप और सदा एकरस रहने वाले, नित्य, अचल, निराकार, अविनाशी, सच्चिदानन्दघन ब्रह्म को निरन्तर एकीभाव से ध्यान करते हुए भजते हैं, वे सम्पूर्ण भूतों के हित में रत और सबमें समान भाववाले योगी मुझको ही प्राप्त होते हैं\n" +
                    " ॥3-4॥\n");
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==3)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("message12", "क्लेशोऽधिकतरस्तेषामव्यक्तासक्तचेतसाम्।\n" +
                    " अव्यक्ता हि गतिर्दुःखं देहवद्भिरवाप्यते ॥5॥\n" +
                    "\n" +
                    "भावार्थ  :-  उन सच्चिदानन्दघन निराकार ब्रह्म में आसक्त चित्तवाले पुरुषों के साधन में परिश्रम विशेष है क्योंकि देहाभिमानियों द्वारा अव्यक्तविषयक गति दुःखपूर्वक प्राप्त की जाती है\n" +
                    " ॥5॥\n");
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==4)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("message12", "ये तु सर्वाणि कर्माणि मयि सन्नयस्य मत्पराः।\n" +
                    " अनन्येनैव योगेन मां ध्यायन्त उपासते  ॥6॥\n" +
                    "\n" +
                    "भावार्थ  :-  परन्तु जो मेरे परायण रहने वाले भक्तजन सम्पूर्ण कर्मों को मुझमें अर्पण करके मुझ सगुणरूप परमेश्वर को ही अनन्य भक्तियोग से निरन्तर चिन्तन करते हुए भजते हैं। (इस श्लोक का विशेष भाव जानने के लिए गीता अध्याय 11 श्लोक 55 देखना चाहिए)\n" +
                    " ॥6॥\n");
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==5)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("message12", "तेषामहं समुद्धर्ता मृत्युसंसारसागरात्।\n" +
                    " भवामि नचिरात्पार्थ मय्यावेशितचेतसाम्  ॥7॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! उन मुझमें चित्त लगाने वाले प्रेमी भक्तों का मैं शीघ्र ही मृत्यु रूप संसार-समुद्र से उद्धार करने वाला होता हूँ\n" +
                    " ॥7॥\n");
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==6)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("message12", "मय्येव मन आधत्स्व मयि बुद्धिं निवेशय।\n" +
                    " निवसिष्यसि मय्येव अत ऊर्ध्वं न संशयः  ॥8॥\n" +
                    "\n" +
                    "भावार्थ  :-  मुझमें मन को लगा और मुझमें ही बुद्धि को लगा, इसके उपरान्त तू मुझमें ही निवास करेगा, इसमें कुछ भी संशय नहीं है\n" +
                    " ॥8॥\n");
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==7)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("message12", "अथ चित्तं समाधातुं न शक्रोषि मयि स्थिरम्।\n" +
                    " अभ्यासयोगेन ततो मामिच्छाप्तुं धनञ्जय  ॥9॥\n" +
                    "\n" +
                    "भावार्थ  :-  यदि तू मन को मुझमें अचल स्थापन करने के लिए समर्थ नहीं है, तो हे अर्जुन! अभ्यासरूप (भगवान के नाम और गुणों का श्रवण, कीर्तन, मनन तथा श्वास द्वारा जप और भगवत्प्राप्तिविषयक शास्त्रों का पठन-पाठन इत्यादि चेष्टाएँ भगवत्प्राप्ति के लिए बारंबार करने का नाम 'अभ्यास' है) योग द्वारा मुझको प्राप्त होने के लिए इच्छा कर\n" +
                    " ॥9॥\n");
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==8)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("message12", "अभ्यासेऽप्यसमर्थोऽसि मत्कर्मपरमो भव।\n" +
                    " मदर्थमपि कर्माणि कुर्वन्सिद्धिमवाप्स्यसि  ॥10॥\n" +
                    "\n" +
                    "भावार्थ  :-  यदि तू उपर्युक्त अभ्यास में भी असमर्थ है, तो केवल मेरे लिए कर्म करने के ही परायण (स्वार्थ को त्यागकर तथा परमेश्वर को ही परम आश्रय और परम गति समझकर, निष्काम प्रेमभाव से सती-शिरोमणि, पतिव्रता स्त्री की भाँति मन, वाणी और शरीर द्वारा परमेश्वर के ही लिए यज्ञ, दान और तपादि सम्पूर्ण कर्तव्यकर्मों के करने का नाम 'भगवदर्थ कर्म करने के परायण होना' है) हो जा। इस प्रकार मेरे निमित्त कर्मों को करता हुआ भी मेरी प्राप्ति रूप सिद्धि को ही प्राप्त होगा\n" +
                    " \n" +
                    " ॥10॥\n");
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==9)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("message12", "अथैतदप्यशक्तोऽसि कर्तुं मद्योगमाश्रितः।\n" +
                    " सर्वकर्मफलत्यागं ततः कुरु यतात्मवान्   ॥11॥\n" +
                    "\n" +
                    "भावार्थ  :-  यदि मेरी प्राप्ति रूप योग के आश्रित होकर उपर्युक्त साधन को करने में भी तू असमर्थ है, तो मन-बुद्धि आदि पर विजय प्राप्त करने वाला होकर सब कर्मों के फल का त्याग (गीता अध्याय 9 श्लोक 27 में विस्तार देखना चाहिए) कर\n" +
                    " ॥11॥\n");
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==10)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("message12", "श्रेयो हि ज्ञानमभ्यासाज्ज्ञानाद्धयानं विशिष्यते।\n" +
                    " ध्यानात्कर्मफलत्यागस्त्यागाच्छान्तिरनन्तरम्  ॥12॥\n" +
                    "\n" +
                    "भावार्थ  :-  मर्म को न जानकर किए हुए अभ्यास से ज्ञान श्रेष्ठ है, ज्ञान से मुझ परमेश्वर के स्वरूप का ध्यान श्रेष्ठ है और ध्यान से सब कर्मों के फल का त्याग (केवल भगवदर्थ कर्म करने वाले पुरुष का भगवान में प्रेम और श्रद्धा तथा भगवान का चिन्तन भी बना रहता है, इसलिए ध्यान से 'कर्मफल का त्याग' श्रेष्ठ कहा है) श्रेष्ठ है, क्योंकि त्याग से तत्काल ही परम शान्ति होती है\n" +
                    " ॥12॥\n");
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==11)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("message12", "(भगवत्-प्राप्त पुरुषों के लक्षण) \n" +
                    " अद्वेष्टा सर्वभूतानां मैत्रः करुण एव च।\n" +
                    " निर्ममो निरहङ्कारः समदुःखसुखः क्षमी  ॥13॥\n" +
                    " संतुष्टः सततं योगी यतात्मा दृढ़निश्चयः।\n" +
                    " मय्यर्पितमनोबुद्धिर्यो मद्भक्तः स मे प्रियः  ॥14॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो पुरुष सब भूतों में द्वेष भाव से रहित, स्वार्थ रहित सबका प्रेमी और हेतु रहित दयालु है तथा ममता से रहित, अहंकार से रहित, सुख-दुःखों की प्राप्ति में सम और क्षमावान है अर्थात अपराध करने वाले को भी अभय देने वाला है तथा जो योगी निरन्तर संतुष्ट है, मन-इन्द्रियों सहित शरीर को वश में किए हुए है और मुझमें दृढ़ निश्चय वाला है- वह मुझमें अर्पण किए हुए मन-बुद्धिवाला मेरा भक्त मुझको प्रिय है\n" +
                    " ॥13-14॥\n");
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==12)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("message12", "यस्मान्नोद्विजते लोको लोकान्नोद्विजते च यः।\n" +
                    " हर्षामर्षभयोद्वेगैर्मुक्तो यः स च मे प्रियः  ॥15॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिससे कोई भी जीव उद्वेग को प्राप्त नहीं होता और जो स्वयं भी किसी जीव से उद्वेग को प्राप्त नहीं होता तथा जो हर्ष, अमर्ष (दूसरे की उन्नति को देखकर संताप होने का नाम 'अमर्ष' है), भय और उद्वेगादि से रहित है वह भक्त मुझको प्रिय है\n" +
                    " ॥15॥\n");
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==13)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("message12", "अनपेक्षः शुचिर्दक्ष उदासीनो गतव्यथः।\n" +
                    " सर्वारम्भपरित्यागी यो मद्भक्तः स मे प्रियः  ॥16॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो पुरुष आकांक्षा से रहित, बाहर-भीतर से शुद्ध (गीता अध्याय 13 श्लोक 7 की टिप्पणी में इसका विस्तार देखना चाहिए) चतुर, पक्षपात से रहित और दुःखों से छूटा हुआ है- वह सब आरम्भों का त्यागी मेरा भक्त मुझको प्रिय है\n" +
                    " ॥16॥\n");
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==14)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("message12", "यो न हृष्यति न द्वेष्टि न शोचति न काङ्क्षति।\n" +
                    " शुभाशुभपरित्यागी भक्तिमान्यः स मे प्रियः  ॥17॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो न कभी हर्षित होता है, न द्वेष करता है, न शोक करता है, न कामना करता है तथा जो शुभ और अशुभ सम्पूर्ण कर्मों का त्यागी है- वह भक्तियुक्त पुरुष मुझको प्रिय है\n" +
                    " ॥17॥\n");
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==15)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("message12", "समः शत्रौ च मित्रे च तथा मानापमानयोः।\n" +
                    " शीतोष्णसुखदुःखेषु समः सङ्गविवर्जितः  ॥18॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो शत्रु-मित्र में और मान-अपमान में सम है तथा सर्दी, गर्मी और सुख-दुःखादि द्वंद्वों में सम है और आसक्ति से रहित है\n" +
                    " ॥18॥\n");
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==16)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("message12", "तुल्यनिन्दास्तुतिर्मौनी सन्तुष्टो येन केनचित्।\n" +
                    " अनिकेतः स्थिरमतिर्भक्तिमान्मे प्रियो नरः  ॥19॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो निंदा-स्तुति को समान समझने वाला, मननशील और जिस किसी प्रकार से भी शरीर का निर्वाह होने में सदा ही संतुष्ट है और रहने के स्थान में ममता और आसक्ति से रहित है- वह स्थिरबुद्धि भक्तिमान पुरुष मुझको प्रिय है\n" +
                    " ॥19॥\n");
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==17)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("message12", "ये तु धर्म्यामृतमिदं यथोक्तं पर्युपासते।\n" +
                    " श्रद्धाना मत्परमा भक्तास्तेऽतीव मे प्रियाः  ॥20॥\n" +
                    "\n" +
                    "भावार्थ  :-  परन्तु जो श्रद्धायुक्त (वेद, शास्त्र, महात्मा और गुरुजनों के तथा परमेश्वर के वचनों में प्रत्यक्ष के सदृश विश्वास का नाम 'श्रद्धा' है) पुरुष मेरे परायण होकर इस ऊपर कहे हुए धर्ममय अमृत को निष्काम प्रेमभाव से सेवन करते हैं, वे भक्त मुझको अतिशय प्रिय हैं\n" +
                    " ॥20॥ \n" +
                    " \n" +
                    " ॐ तत्सदिति श्रीमद्भगवद्गीतासूपनिषत्सु ब्रह्मविद्यायांयोगशास्त्रे श्रीकृष्णार्जुनसंवादे भक्तियोगो नाम द्वादशोऽध्यायः\n" +
                    " ॥12॥\n");
            fragment12.setArguments(bundle);
            return fragment12;
        }


        return null;
    }

    @Override
    public int getCount() {
        return 18;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        if(position<=2)
        {
            return "श्लोक "+position;
        }
        else if(position==3)
        {
            return  "श्लोक 3,4";
        }
        else if(position<=11&&position>=4)
        {
            position=position+1;
            return "श्लोक "+position;
        }
        else if(position==12)
        {
            return "श्लोक 13,14";
        }
        else if(position<=18&&position>=13)
        {
            position=position+2;
            return "श्लोक "+position;
        }
        return null;

    }
}
