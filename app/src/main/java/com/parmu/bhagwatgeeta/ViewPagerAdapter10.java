package com.parmu.bhagwatgeeta;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter10 extends FragmentStatePagerAdapter {
    public ViewPagerAdapter10(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter10(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","( भगवान की विभूति और योगशक्ति का कथन तथा उनके जानने का फल) \n" +
                    " श्रीभगवानुवाच  :-\n" +
                    " भूय एव महाबाहो श्रृणु मे परमं वचः।\n" +
                    " यत्तेऽहं प्रीयमाणाय वक्ष्यामि हितकाम्यया  ॥1॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान् बोले- हे महाबाहो! फिर भी मेरे परम रहस्य और प्रभावयुक्त वचन को सुन, जिसे मैं तुझे अतिशय प्रेम रखने वाले के लिए हित की इच्छा से कहूँगा\n" +
                    " ॥1॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==1)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","न मे विदुः सुरगणाः प्रभवं न महर्षयः।\n" +
                    " अहमादिर्हि देवानां महर्षीणां च सर्वशः  ॥2॥\n" +
                    "\n" +
                    "भावार्थ  :-  मेरी उत्पत्ति को अर्थात् लीला से प्रकट होने को न देवता लोग जानते हैं और न महर्षिजन ही जानते हैं, क्योंकि मैं सब प्रकार से देवताओं का और महर्षियों का भी आदिकारण हूँ\n" +
                    " ॥2॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==2)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","यो मामजमनादिं च वेत्ति लोकमहेश्वरम्।\n" +
                    " असम्मूढः स मर्त्येषु सर्वपापैः प्रमुच्यते  ॥3॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो मुझको अजन्मा अर्थात् वास्तव में जन्मरहित, अनादि (अनादि उसको कहते हैं जो आदि रहित हो एवं सबका कारण हो) और लोकों का महान् ईश्वर तत्त्व से जानता है, वह मनुष्यों में ज्ञानवान् पुरुष संपूर्ण पापों से मुक्त हो जाता है\n" +
                    " ॥3॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==3)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","बुद्धिर्ज्ञानमसम्मोहः क्षमा सत्यं दमः शमः।\n" +
                    " सुखं दुःखं भवोऽभावो भयं चाभयमेव च  ॥4॥\n" +
                    " अहिंसा समता तुष्टिस्तपो दानं यशोऽयशः।\n" +
                    " भवन्ति भावा भूतानां मत्त एव पृथग्विधाः  ॥5॥\n" +
                    "\n" +
                    "भावार्थ  :-  निश्चय करने की शक्ति, यथार्थ ज्ञान, असम्मूढ़ता, क्षमा, सत्य, इंद्रियों का वश में करना, मन का निग्रह तथा सुख-दुःख, उत्पत्ति-प्रलय और भय-अभय तथा अहिंसा, समता, संतोष तप (स्वधर्म के आचरण से इंद्रियादि को तपाकर शुद्ध करने का नाम तप है), दान, कीर्ति और अपकीर्ति- ऐसे ये प्राणियों के नाना प्रकार के भाव मुझसे ही होते हैं\n" +
                    " ॥4-5॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==4)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","महर्षयः सप्त पूर्वे चत्वारो मनवस्तथा।\n" +
                    " मद्भावा मानसा जाता येषां लोक इमाः प्रजाः  ॥6॥\n" +
                    "\n" +
                    "भावार्थ  :-  सात महर्षिजन, चार उनसे भी पूर्व में होने वाले सनकादि तथा स्वायम्भुव आदि चौदह मनु- ये मुझमें भाव वाले सब-के-सब मेरे संकल्प से उत्पन्न हुए हैं, जिनकी संसार में यह संपूर्ण प्रजा है\n" +
                    " ॥6॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==5)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","एतां विभूतिं योगं च मम यो वेत्ति तत्त्वतः।\n" +
                    " सोऽविकम्पेन योगेन युज्यते नात्र संशयः  ॥7॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो पुरुष मेरी इस परमैश्वर्यरूप विभूति को और योगशक्ति को तत्त्व से जानता है (जो कुछ दृश्यमात्र संसार है वह सब भगवान की माया है और एक वासुदेव भगवान ही सर्वत्र परिपूर्ण है, यह जानना ही तत्व से जानना है), वह निश्चल भक्तियोग से युक्त हो जाता है- इसमें कुछ भी संशय नहीं है\n" +
                    " ॥7॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==6)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","( फल और प्रभाव सहित भक्तियोग का कथन ) \n" +
                    " अहं सर्वस्य प्रभवो मत्तः सर्वं प्रवर्तते।\n" +
                    " इति मत्वा भजन्ते मां बुधा भावसमन्विताः  ॥8॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं वासुदेव ही संपूर्ण जगत् की उत्पत्ति का कारण हूँ और मुझसे ही सब जगत् चेष्टा करता है, इस प्रकार समझकर श्रद्धा और भक्ति से युक्त बुद्धिमान् भक्तजन मुझ परमेश्वर को ही निरंतर भजते हैं\n" +
                    " ॥8॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==7)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","मच्चित्ता मद्गतप्राणा बोधयन्तः परस्परम्।\n" +
                    " कथयन्तश्च मां नित्यं तुष्यन्ति च रमन्ति च  ॥9॥\n" +
                    "\n" +
                    "भावार्थ  :-  निरंतर मुझमें मन लगाने वाले और मुझमें ही प्राणों को अर्पण करने वाले (मुझ वासुदेव के लिए ही जिन्होंने अपना जीवन अर्पण कर दिया है उनका नाम मद्गतप्राणाः है।) भक्तजन मेरी भक्ति की चर्चा के द्वारा आपस में मेरे प्रभाव को जानते हुए तथा गुण और प्रभाव सहित मेरा कथन करते हुए ही निरंतर संतुष्ट होते हैं और मुझ वासुदेव में ही निरंतर रमण करते हैं\n" +
                    " ॥9॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==8)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","तेषां सततयुक्तानां भजतां प्रीतिपूर्वकम्।\n" +
                    " ददामि बद्धियोगं तं येन मामुपयान्ति ते ॥10॥\n" +
                    "\n" +
                    "भावार्थ  :-  उन निरंतर मेरे ध्यान आदि में लगे हुए और प्रेमपूर्वक भजने वाले भक्तों को मैं वह तत्त्वज्ञानरूप योग देता हूँ, जिससे वे मुझको ही प्राप्त होते हैं\n" +
                    " ॥10॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==9)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","तेषामेवानुकम्पार्थमहमज्ञानजं तमः।\n" +
                    " नाशयाम्यात्मभावस्थो ज्ञानदीपेन भास्वता  ॥11॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! उनके ऊपर अनुग्रह करने के लिए उनके अंतःकरण में स्थित हुआ मैं स्वयं ही उनके अज्ञानजनित अंधकार को प्रकाशमय तत्त्वज्ञानरूप दीपक के द्वारा नष्ट कर देता हूँ\n" +
                    " ॥11॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==10)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","( अर्जुन द्वारा भगवान की स्तुति तथा विभूति और योगशक्ति को कहने के लिए प्रार्थना ) \n" +
                    " अर्जुन उवाच  :-\n" +
                    " परं ब्रह्म परं धाम पवित्रं परमं भवान्।\n" +
                    " पुरुषं शाश्वतं दिव्यमादिदेवमजं विभुम्  ॥12॥\n" +
                    " आहुस्त्वामृषयः सर्वे देवर्षिर्नारदस्तथा।\n" +
                    " असितो देवलो व्यासः स्वयं चैव ब्रवीषि मे  ॥13॥\n" +
                    "\n" +
                    "भावार्थ  :-  अर्जुन बोले- आप परम ब्रह्म, परम धाम और परम पवित्र हैं, क्योंकि आपको सब ऋषिगण सनातन, दिव्य पुरुष एवं देवों का भी आदिदेव, अजन्मा और सर्वव्यापी कहते हैं। वैसे ही देवर्षि नारद तथा असित और देवल ऋषि तथा महर्षि व्यास भी कहते हैं और आप भी मेरे प्रति कहते हैं\n" +
                    " ॥12-13॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==11)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","सर्वमेतदृतं मन्ये यन्मां वदसि केशव।\n" +
                    " न हि ते भगवन्व्यक्तिं विदुर्देवा न दानवाः  ॥14॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे केशव! जो कुछ भी मेरे प्रति आप कहते हैं, इस सबको मैं सत्य मानता हूँ। हे भगवन्! आपके लीलामय (गीता अध्याय 4 श्लोक 6 में इसका विस्तार देखना चाहिए) स्वरूप को न तो दानव जानते हैं और न देवता ही\n" +
                    " ॥14॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==12)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","स्वयमेवात्मनात्मानं वेत्थ त्वं पुरुषोत्तम।\n" +
                    " भूतभावन भूतेश देवदेव जगत्पते  ॥15॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे भूतों को उत्पन्न करने वाले! हे भूतों के ईश्वर! हे देवों के देव! हे जगत् के स्वामी! हे पुरुषोत्तम! आप स्वयं ही अपने से अपने को जानते हैं\n" +
                    " ॥15॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==13)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","वक्तुमर्हस्यशेषेण दिव्या ह्यात्मविभूतयः।\n" +
                    " याभिर्विभूतिभिर्लोकानिमांस्त्वं व्याप्य तिष्ठसि  ॥16॥\n" +
                    "\n" +
                    "भावार्थ  :-  इसलिए आप ही उन अपनी दिव्य विभूतियों को संपूर्णता से कहने में समर्थ हैं, जिन विभूतियों द्वारा आप इन सब लोकों को व्याप्त करके स्थित हैं\n" +
                    " ॥16॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==14)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","कथं विद्यामहं योगिंस्त्वां सदा परिचिन्तयन्।\n" +
                    " केषु केषु च भावेषु चिन्त्योऽसि भगवन्मया  ॥17॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे योगेश्वर! मैं किस प्रकार निरंतर चिंतन करता हुआ आपको जानूँ और हे भगवन्! आप किन-किन भावों में मेरे द्वारा चिंतन करने योग्य हैं?\n" +
                    " ॥17॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==15)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","विस्तरेणात्मनो योगं विभूतिं च जनार्दन।\n" +
                    " भूयः कथय तृप्तिर्हि श्रृण्वतो नास्ति मेऽमृतम्  ॥18॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे जनार्दन! अपनी योगशक्ति को और विभूति को फिर भी विस्तारपूर्वक कहिए, क्योंकि आपके अमृतमय वचनों को सुनते हुए मेरी तृप्ति नहीं होती अर्थात् सुनने की उत्कंठा बनी ही रहती है\n" +
                    " ॥18॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==16)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","(भगवान द्वारा अपनी विभूतियों और योगशक्ति का कथन) \n" +
                    " श्रीभगवानुवाच  :-\n" +
                    " हन्त ते कथयिष्यामि दिव्या ह्यात्मविभूतयः।\n" +
                    " प्राधान्यतः कुरुश्रेष्ठ नास्त्यन्तो विस्तरस्य मे  ॥19॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान बोले- हे कुरुश्रेष्ठ! अब मैं जो मेरी दिव्य विभूतियाँ हैं, उनको तेरे लिए प्रधानता से कहूँगा; क्योंकि मेरे विस्तार का अंत नहीं है\n" +
                    " ॥19॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==17)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","अहमात्मा गुडाकेश सर्वभूताशयस्थितः।\n" +
                    " अहमादिश्च मध्यं च भूतानामन्त एव च  ॥20॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! मैं सब भूतों के हृदय में स्थित सबका आत्मा हूँ तथा संपूर्ण भूतों का आदि, मध्य और अंत भी मैं ही हूँ\n" +
                    " ॥20॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==18)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","आदित्यानामहं विष्णुर्ज्योतिषां रविरंशुमान्।\n" +
                    " मरीचिर्मरुतामस्मि नक्षत्राणामहं शशी  ॥21॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं अदिति के बारह पुत्रों में विष्णु और ज्योतियों में किरणों वाला सूर्य हूँ तथा मैं उनचास वायुदेवताओं का तेज और नक्षत्रों का अधिपति चंद्रमा हूँ\n" +
                    " ॥21॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==19)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","वेदानां सामवेदोऽस्मि देवानामस्मि वासवः।\n" +
                    " इंद्रियाणां मनश्चास्मि भूतानामस्मि चेतना  ॥22॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं वेदों में सामवेद हूँ, देवों में इंद्र हूँ, इंद्रियों में मन हूँ और भूत प्राणियों की चेतना अर्थात् जीवन-शक्ति हूँ\n" +
                    " ॥22॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==20)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","रुद्राणां शङ्करश्चास्मि वित्तेशो यक्षरक्षसाम्।\n" +
                    " वसूनां पावकश्चास्मि मेरुः शिखरिणामहम्  ॥23॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं एकादश रुद्रों में शंकर हूँ और यक्ष तथा राक्षसों में धन का स्वामी कुबेर हूँ। मैं आठ वसुओं में अग्नि हूँ और शिखरवाले पर्वतों में सुमेरु पर्वत हूँ\n" +
                    " ॥23॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==21)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","पुरोधसां च मुख्यं मां विद्धि पार्थ बृहस्पतिम्।\n" +
                    " सेनानीनामहं स्कन्दः सरसामस्मि सागरः  ॥24॥\n" +
                    "\n" +
                    "भावार्थ  :-  पुरोहितों में मुखिया बृहस्पति मुझको जान। हे पार्थ! मैं सेनापतियों में स्कंद और जलाशयों में समुद्र हूँ\n" +
                    " ॥24॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==22)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","महर्षीणां भृगुरहं गिरामस्म्येकमक्षरम्।\n" +
                    " यज्ञानां जपयज्ञोऽस्मि स्थावराणां हिमालयः  ॥25॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं महर्षियों में भृगु और शब्दों में एक अक्षर अर्थात् ओंकार हूँ। सब प्रकार के यज्ञों में जपयज्ञ और स्थिर रहने वालों में हिमालय पहाड़ हूँ\n" +
                    " ॥25॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==23)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","अश्वत्थः सर्ववृक्षाणां देवर्षीणां च नारदः।\n" +
                    " गन्धर्वाणां चित्ररथः सिद्धानां कपिलो मुनिः  ॥26॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं सब वृक्षों में पीपल का वृक्ष, देवर्षियों में नारद मुनि, गन्धर्वों में चित्ररथ और सिद्धों में कपिल मुनि हूँ\n" +
                    " ॥26॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==24)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","उच्चैःश्रवसमश्वानां विद्धि माममृतोद्धवम्।\n" +
                    " एरावतं गजेन्द्राणां नराणां च नराधिपम्  ॥27॥\n" +
                    "\n" +
                    "भावार्थ  :-  घोड़ों में अमृत के साथ उत्पन्न होने वाला उच्चैःश्रवा नामक घोड़ा, श्रेष्ठ हाथियों में ऐरावत नामक हाथी और मनुष्यों में राजा मुझको जान\n" +
                    " ॥27॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==25)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","आयुधानामहं वज्रं धेनूनामस्मि कामधुक्।\n" +
                    " प्रजनश्चास्मि कन्दर्पः सर्पाणामस्मि वासुकिः  ॥28॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं शस्त्रों में वज्र और गौओं में कामधेनु हूँ। शास्त्रोक्त रीति से सन्तान की उत्पत्ति का हेतु कामदेव हूँ और सर्पों में सर्पराज वासुकि हूँ\n" +
                    " ॥28॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==26)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","अनन्तश्चास्मि नागानां वरुणो यादसामहम्।\n" +
                    " पितॄणामर्यमा चास्मि यमः संयमतामहम्  ॥29॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं नागों में (नाग और सर्प ये दो प्रकार की सर्पों की ही जाति है।) शेषनाग और जलचरों का अधिपति वरुण देवता हूँ और पितरों में अर्यमा नामक पितर तथा शासन करने वालों में यमराज मैं हूँ\n" +
                    " ॥29॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==27)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","प्रह्लादश्चास्मि दैत्यानां कालः कलयतामहम्।\n" +
                    " मृगाणां च मृगेन्द्रोऽहं वैनतेयश्च पक्षिणाम्  ॥30॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं दैत्यों में प्रह्लाद और गणना करने वालों का समय (क्षण, घड़ी, दिन, पक्ष, मास आदि में जो समय है वह मैं हूँ) हूँ तथा पशुओं में मृगराज सिंह और पक्षियों में गरुड़ हूँ\n" +
                    " ॥30॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==28)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","पवनः पवतामस्मि रामः शस्त्रभृतामहम्।\n" +
                    " झषाणां मकरश्चास्मि स्रोतसामस्मि जाह्नवी  ॥31॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं पवित्र करने वालों में वायु और शस्त्रधारियों में श्रीराम हूँ तथा मछलियों में मगर हूँ और नदियों में श्री भागीरथी गंगाजी हूँ\n" +
                    " ॥31॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==29)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","सर्गाणामादिरन्तश्च मध्यं चैवाहमर्जुन।\n" +
                    " अध्यात्मविद्या विद्यानां वादः प्रवदतामहम्  ॥32॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! सृष्टियों का आदि और अंत तथा मध्य भी मैं ही हूँ। मैं विद्याओं में अध्यात्मविद्या अर्थात् ब्रह्मविद्या और परस्पर विवाद करने वालों का तत्व-निर्णय के लिए किया जाने वाला वाद हूँ\n" +
                    " ॥32॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==30)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","अक्षराणामकारोऽस्मि द्वंद्वः सामासिकस्य च।\n" +
                    " अहमेवाक्षयः कालो धाताहं विश्वतोमुखः  ॥33॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं अक्षरों में अकार हूँ और समासों में द्वंद्व नामक समास हूँ। अक्षयकाल अर्थात् काल का भी महाकाल तथा सब ओर मुखवाला, विराट्स्वरूप, सबका धारण-पोषण करने वाला भी मैं ही हूँ\n" +
                    " ॥33॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==31)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","मृत्युः सर्वहरश्चाहमुद्भवश्च भविष्यताम्।\n" +
                    " कीर्तिः श्रीर्वाक्च नारीणां स्मृतिर्मेधा धृतिः क्षमा  ॥34॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं सबका नाश करने वाला मृत्यु और उत्पन्न होने वालों का उत्पत्ति हेतु हूँ तथा स्त्रियों में कीर्ति (कीर्ति आदि ये सात देवताओं की स्त्रियाँ और स्त्रीवाचक नाम वाले गुण भी प्रसिद्ध हैं, इसलिए दोनों प्रकार से ही भगवान की विभूतियाँ हैं), श्री, वाक्, स्मृति, मेधा, धृति और क्षमा हूँ\n" +
                    " ॥34॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==32)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","बृहत्साम तथा साम्नां गायत्री छन्दसामहम्।\n" +
                    " मासानां मार्गशीर्षोऽहमृतूनां कुसुमाकरः  ॥35॥\n" +
                    "\n" +
                    "भावार्थ  :-  तथा गायन करने योग्य श्रुतियों में मैं बृहत्साम और छंदों में गायत्री छंद हूँ तथा महीनों में मार्गशीर्ष और ऋतुओं में वसंत मैं हूँ\n" +
                    " ॥35॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==33)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","द्यूतं छलयतामस्मि तेजस्तेजस्विनामहम्।\n" +
                    " जयोऽस्मि व्यवसायोऽस्मि सत्त्वं सत्त्ववतामहम्  ॥36॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं छल करने वालों में जूआ और प्रभावशाली पुरुषों का प्रभाव हूँ। मैं जीतने वालों का विजय हूँ, निश्चय करने वालों का निश्चय और सात्त्विक पुरुषों का सात्त्विक भाव हूँ\n" +
                    " ॥36॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==34)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","वृष्णीनां वासुदेवोऽस्मि पाण्डवानां धनञ्जयः।\n" +
                    " मुनीनामप्यहं व्यासः कवीनामुशना कविः  ॥37॥\n" +
                    "\n" +
                    "भावार्थ  :-  वृष्णिवंशियों में (यादवों के अंतर्गत एक वृष्णि वंश भी था) वासुदेव अर्थात् मैं स्वयं तेरा सखा, पाण्डवों में धनञ्जय अर्थात् तू, मुनियों में वेदव्यास और कवियों में शुक्राचार्य कवि भी मैं ही हूँ\n" +
                    " ॥37॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==35)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","दण्डो दमयतामस्मि नीतिरस्मि जिगीषताम्।\n" +
                    " मौनं चैवास्मि गुह्यानां ज्ञानं ज्ञानवतामहम्  ॥38॥\n" +
                    "\n" +
                    "भावार्थ  :-  मैं दमन करने वालों का दंड अर्थात् दमन करने की शक्ति हूँ, जीतने की इच्छावालों की नीति हूँ, गुप्त रखने योग्य भावों का रक्षक मौन हूँ और ज्ञानवानों का तत्त्वज्ञान मैं ही हूँ\n" +
                    " ॥38॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==36)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","यच्चापि सर्वभूतानां बीजं तदहमर्जुन।\n" +
                    " न तदस्ति विना यत्स्यान्मया भूतं चराचरम्  ॥39॥\n" +
                    "\n" +
                    "भावार्थ  :-  और हे अर्जुन! जो सब भूतों की उत्पत्ति का कारण है, वह भी मैं ही हूँ, क्योंकि ऐसा चर और अचर कोई भी भूत नहीं है, जो मुझसे रहित हो\n" +
                    " ॥39॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==37)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","नान्तोऽस्ति मम दिव्यानां विभूतीनां परन्तप।\n" +
                    " एष तूद्देशतः प्रोक्तो विभूतेर्विस्तरो मया  ॥40॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे परंतप! मेरी दिव्य विभूतियों का अंत नहीं है, मैंने अपनी विभूतियों का यह विस्तार तो तेरे लिए एकदेश से अर्थात् संक्षेप से कहा है\n" +
                    " ॥40॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==38)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","यद्यद्विभूतिमत्सत्त्वं श्रीमदूर्जितमेव वा।\n" +
                    " तत्तदेवावगच्छ त्वं मम तेजोंऽशसम्भवम्  ॥41॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो-जो भी विभूतियुक्त अर्थात् ऐश्वर्ययुक्त, कांतियुक्त और शक्तियुक्त वस्तु है, उस-उस को तू मेरे तेज के अंश की ही अभिव्यक्ति जान\n" +
                    " ॥41॥\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
        }
        else if(position==39)
        {
            TenFragment tenFragment=new TenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message10","अथवा बहुनैतेन किं ज्ञातेन तवार्जुन।\n" +
                    " विष्टभ्याहमिदं कृत्स्नमेकांशेन स्थितो जगत्  ॥42॥\n" +
                    "\n" +
                    "भावार्थ  :-  अथवा हे अर्जुन! इस बहुत जानने से तेरा क्या प्रायोजन है। मैं इस संपूर्ण जगत् को अपनी योगशक्ति के एक अंश मात्र से धारण करके स्थित हूँ\n" +
                    " ॥42॥ \n" +
                    " \n" +
                    "ॐ तत्सदिति श्रीमद्भगवद्गीतासूपनिषत्सु ब्रह्मविद्यायांयोगशास्त्रे श्रीकृष्णार्जुनसंवादे विभूतियोगो नाम दशमोऽध्यायः॥10।\n");
            tenFragment.setArguments(bundle);
            return tenFragment;
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
        position = position + 1;
        if (position <= 3) {
            return "श्लोक " + position;
        } else if (position == 4) {
            return "श्लोक 4,5";
        } else if (position <= 10 && position >= 5) {
            position = position + 1;
            return "श्लोक " + position;
        } 
        else if(position==11){
            return "श्लोक 12,13";
        }
        else if (position <= 40 && position >= 11) {
            position = position + 2;
            return "श्लोक " + position;
        }
        return null;
    }
}
