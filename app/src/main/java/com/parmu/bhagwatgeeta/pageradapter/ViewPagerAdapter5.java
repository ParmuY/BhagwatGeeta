package com.parmu.bhagwatgeeta.pageradapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.parmu.bhagwatgeeta.fragments.FiveFragment;

public class ViewPagerAdapter5 extends FragmentStatePagerAdapter {
    public ViewPagerAdapter5(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter5(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","अर्जुन उवाच  :-\n" +
                    " सन्न्यासं कर्मणां कृष्ण पुनर्योगं च शंससि।\n" +
                    " यच्छ्रेय एतयोरेकं तन्मे ब्रूहि सुनिश्चितम्  ॥1॥\n" +
                    "\n" +
                    "भावार्थ  :-  अर्जुन बोले- हे कृष्ण! आप कर्मों के संन्यास की और फिर कर्मयोग की प्रशंसा करते हैं। इसलिए इन दोनों में से जो एक मेरे लिए भलीभाँति निश्चित कल्याणकारक साधन हो, उसको कहिए\n" +
                    " ॥1॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==1)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","श्रीभगवानुवाच  :-\n" +
                    " सन्न्यासः कर्मयोगश्च निःश्रेयसकरावुभौ।\n" +
                    " तयोस्तु कर्मसन्न्यासात्कर्मयोगो विशिष्यते  ॥2॥\n" +
                    "\n" +
                    "भावार्थ  :-  श्री भगवान बोले- कर्म संन्यास और कर्मयोग- ये दोनों ही परम कल्याण के करने वाले हैं, परन्तु उन दोनों में भी कर्म संन्यास से कर्मयोग साधन में सुगम होने से श्रेष्ठ है\n" +
                    " ॥2॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==2)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","ज्ञेयः स नित्यसन्न्यासी यो न द्वेष्टि न काङ्क्षति।\n" +
                    " निर्द्वन्द्वो हि महाबाहो सुखं बन्धात्प्रमुच्यते  ॥3॥\n" +
                    "\n" +
                    "भावार्थ  :-  हे अर्जुन! जो पुरुष न किसी से द्वेष करता है और न किसी की आकांक्षा करता है, वह कर्मयोगी सदा संन्यासी ही समझने योग्य है क्योंकि राग-द्वेषादि द्वंद्वों से रहित पुरुष सुखपूर्वक संसार बंधन से मुक्त हो जाता है\n" +
                    " ॥3॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==3)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","साङ्ख्ययोगौ पृथग्बालाः प्रवदन्ति न पण्डिताः।\n" +
                    " एकमप्यास्थितः सम्यगुभयोर्विन्दते फलम्  ॥4॥\n" +
                    "\n" +
                    "भावार्थ  :-  उपर्युक्त संन्यास और कर्मयोग को मूर्ख लोग पृथक्-पृथक् फल देने वाले कहते हैं न कि पण्डितजन, क्योंकि दोनों में से एक में भी सम्यक् प्रकार से स्थित पुरुष दोनों के फलरूप परमात्मा को प्राप्त होता है\n" +
                    " ॥4॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==4)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","यत्साङ्ख्यैः प्राप्यते स्थानं तद्यौगैरपि गम्यते।\n" +
                    " एकं साङ्ख्यं च योगं च यः पश्यति स पश्यति  ॥5॥\n" +
                    "\n" +
                    "भावार्थ  :-  ज्ञान योगियों द्वारा जो परमधाम प्राप्त किया जाता है, कर्मयोगियों द्वारा भी वही प्राप्त किया जाता है। इसलिए जो पुरुष ज्ञानयोग और कर्मयोग को फलरूप में एक देखता है, वही यथार्थ देखता है\n" +
                    " ॥5॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==5)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","सन्न्यासस्तु महाबाहो दुःखमाप्तुमयोगतः।\n" +
                    " योगयुक्तो मुनिर्ब्रह्म नचिरेणाधिगच्छति  ॥6॥\n" +
                    "\n" +
                    "भावार्थ  :-  परन्तु हे अर्जुन! कर्मयोग के बिना संन्यास अर्थात् मन, इन्द्रिय और शरीर द्वारा होने वाले सम्पूर्ण कर्मों में कर्तापन का त्याग प्राप्त होना कठिन है और भगवत्स्वरूप को मनन करने वाला कर्मयोगी परब्रह्म परमात्मा को शीघ्र ही प्राप्त हो जाता है\n" +
                    " ॥6॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==6)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","योगयुक्तो विशुद्धात्मा विजितात्मा जितेन्द्रियः।\n" +
                    " सर्वभूतात्मभूतात्मा कुर्वन्नपि न लिप्यते  ॥7॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिसका मन अपने वश में है, जो जितेन्द्रिय एवं विशुद्ध अन्तःकरण वाला है और सम्पूर्ण प्राणियों का आत्मरूप परमात्मा ही जिसका आत्मा है, ऐसा कर्मयोगी कर्म करता हुआ भी लिप्त नहीं होता\n" +
                    " ॥7॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==7)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","नैव किंचित्करोमीति युक्तो मन्येत तत्ववित्।\n" +
                    " पश्यञ्श्रृण्वन्स्पृशञ्जिघ्रन्नश्नन्गच्छन्स्वपंश्वसन्  ॥8॥\n" +
                    " प्रलपन्विसृजन्गृह्णन्नुन्मिषन्निमिषन्नपि॥\n" +
                    " इन्द्रियाणीन्द्रियार्थेषु वर्तन्त इति धारयन्  ॥9॥\n" +
                    "\n" +
                    "भावार्थ  :-  तत्व को जानने वाला सांख्ययोगी तो देखता हुआ, सुनता हुआ, स्पर्श करता हुआ, सूँघता हुआ, भोजन करता हुआ, गमन करता हुआ, सोता हुआ, श्वास लेता हुआ, बोलता हुआ, त्यागता हुआ, ग्रहण करता हुआ तथा आँखों को खोलता और मूँदता हुआ भी, सब इन्द्रियाँ अपने-अपने अर्थों में बरत रही हैं- इस प्रकार समझकर निःसंदेह ऐसा मानें कि मैं कुछ भी नहीं करता हूँ\n" +
                    " ॥8-9॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==8)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","ब्रह्मण्याधाय कर्माणि सङ्गं त्यक्त्वा करोति यः।\n" +
                    " लिप्यते न स पापेन पद्मपत्रमिवाम्भसा ॥10॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो पुरुष सब कर्मों को परमात्मा में अर्पण करके और आसक्ति को त्याग कर कर्म करता है, वह पुरुष जल से कमल के पत्ते की भाँति पाप से लिप्त नहीं होता\n" +
                    " ॥10॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==9)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","कायेन मनसा बुद्धया केवलैरिन्द्रियैरपि।\n" +
                    " योगिनः कर्म कुर्वन्ति संग त्यक्त्वात्मशुद्धये  ॥11॥\n" +
                    "\n" +
                    "भावार्थ  :-  कर्मयोगी ममत्वबुद्धिरहित केवल इन्द्रिय, मन, बुद्धि और शरीर द्वारा भी आसक्ति को त्याग कर अन्तःकरण की शुद्धि के लिए कर्म करते हैं\n" +
                    " ॥11॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==10)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","युक्तः कर्मफलं त्यक्त्वा शान्तिमाप्नोति नैष्ठिकीम्।\n" +
                    " अयुक्तः कामकारेण फले सक्तो निबध्यते  ॥12॥\n" +
                    "\n" +
                    "भावार्थ  :-  कर्मयोगी कर्मों के फल का त्याग करके भगवत्प्राप्ति रूप शान्ति को प्राप्त होता है और सकामपुरुष कामना की प्रेरणा से फल में आसक्त होकर बँधता है\n" +
                    " ॥12॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==11)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","सर्वकर्माणि मनसा संन्यस्यास्ते सुखं वशी।\n" +
                    " नवद्वारे पुरे देही नैव कुर्वन्न कारयन्  ॥13॥\n" +
                    "\n" +
                    "भावार्थ  :-  अन्तःकरण जिसके वश में है, ऐसा सांख्य योग का आचरण करने वाला पुरुष न करता हुआ और न करवाता हुआ ही नवद्वारों वाले शरीर रूप घर में सब कर्मों को मन से त्यागकर आनंदपूर्वक सच्चिदानंदघन परमात्मा के स्वरूप में स्थित रहता है\n" +
                    " ॥13॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==12)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","न कर्तृत्वं न कर्माणि लोकस्य सृजति प्रभुः।\n" +
                    " न कर्मफलसंयोगं स्वभावस्तु प्रवर्तते  ॥14॥\n" +
                    "\n" +
                    "भावार्थ  :-  परमेश्वर मनुष्यों के न तो कर्तापन की, न कर्मों की और न कर्मफल के संयोग की रचना करते हैं, किन्तु स्वभाव ही बर्त रहा है\n" +
                    " ॥14॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==13)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","नादत्ते कस्यचित्पापं न चैव सुकृतं विभुः।\n" +
                    " अज्ञानेनावृतं ज्ञानं तेन मुह्यन्ति जन्तवः  ॥15॥\n" +
                    "\n" +
                    "भावार्थ  :-  सर्वव्यापी परमेश्वर भी न किसी के पाप कर्म को और न किसी के शुभकर्म को ही ग्रहण करता है, किन्तु अज्ञान द्वारा ज्ञान ढँका हुआ है, उसी से सब अज्ञानी मनुष्य मोहित हो रहे हंं\n" +
                    " ॥15॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==14)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","ज्ञानेन तु तदज्ञानं येषां नाशितमात्मनः।\n" +
                    " तेषामादित्यवज्ज्ञानं प्रकाशयति तत्परम्  ॥16॥\n" +
                    "\n" +
                    "भावार्थ  :-  परन्तु जिनका वह अज्ञान परमात्मा के तत्व ज्ञान द्वारा नष्ट कर दिया गया है, उनका वह ज्ञान सूर्य के सदृश उस सच्चिदानन्दघन परमात्मा को प्रकाशित कर देता है\n" +
                    " ॥16॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==15)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","तद्बुद्धयस्तदात्मानस्तन्निष्ठास्तत्परायणाः।\n" +
                    " गच्छन्त्यपुनरावृत्तिं ज्ञाननिर्धूतकल्मषाः  ॥17॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिनका मन तद्रूप हो रहा है, जिनकी बुद्धि तद्रूप हो रही है और सच्चिदानन्दघन परमात्मा में ही जिनकी निरंतर एकीभाव से स्थिति है, ऐसे तत्परायण पुरुष ज्ञान द्वारा पापरहित होकर अपुनरावृत्ति को अर्थात परमगति को प्राप्त होते हैं\n" +
                    " ॥17॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }else if(position==16)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","विद्याविनयसम्पन्ने ब्राह्मणे गवि हस्तिनि।\n" +
                    " शुनि चैव श्वपाके च पण्डिताः समदर्शिनः  ॥18॥\n" +
                    "\n" +
                    "भावार्थ  :-  वे ज्ञानीजन विद्या और विनययुक्त ब्राह्मण में तथा गौ, हाथी, कुत्ते और चाण्डाल में भी समदर्शी (इसका विस्तार गीता अध्याय 6 श्लोक 32 की टिप्पणी में देखना चाहिए।) ही होते हैं\n" +
                    " ॥18॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==17)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","इहैव तैर्जितः सर्गो येषां साम्ये स्थितं मनः।\n" +
                    " निर्दोषं हि समं ब्रह्म तस्माद् ब्रह्मणि ते स्थिताः  ॥19॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिनका मन समभाव में स्थित है, उनके द्वारा इस जीवित अवस्था में ही सम्पूर्ण संसार जीत लिया गया है क्योंकि सच्चिदानन्दघन परमात्मा निर्दोष और सम है, इससे वे सच्चिदानन्दघन परमात्मा में ही स्थित हैं\n" +
                    " ॥19॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==18)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","न प्रहृष्येत्प्रियं प्राप्य नोद्विजेत्प्राप्य चाप्रियम्।\n" +
                    " स्थिरबुद्धिरसम्मूढो ब्रह्मविद् ब्रह्मणि स्थितः  ॥20॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो पुरुष प्रिय को प्राप्त होकर हर्षित नहीं हो और अप्रिय को प्राप्त होकर उद्विग्न न हो, वह स्थिरबुद्धि, संशयरहित, ब्रह्मवेत्ता पुरुष सच्चिदानन्दघन परब्रह्म परमात्मा में एकीभाव से नित्य स्थित है\n" +
                    " ॥20॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==19)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","बाह्यस्पर्शेष्वसक्तात्मा विन्दत्यात्मनि यत्सुखम्।\n" +
                    " स ब्रह्मयोगयुक्तात्मा सुखमक्षयमश्नुते ॥21॥\n" +
                    "\n" +
                    "भावार्थ  :-  बाहर के विषयों में आसक्तिरहित अन्तःकरण वाला साधक आत्मा में स्थित जो ध्यानजनित सात्विक आनंद है, उसको प्राप्त होता है, तदनन्तर वह सच्चिदानन्दघन परब्रह्म परमात्मा के ध्यानरूप योग में अभिन्न भाव से स्थित पुरुष अक्षय आनन्द का अनुभव करता है\n" +
                    " ॥21॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==20)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","ये हि संस्पर्शजा भोगा दुःखयोनय एव ते।\n" +
                    " आद्यन्तवन्तः कौन्तेय न तेषु रमते बुधः ॥22॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो ये इन्द्रिय तथा विषयों के संयोग से उत्पन्न होने वाले सब भोग हैं, यद्यपि विषयी पुरुषों को सुखरूप भासते हैं, तो भी दुःख के ही हेतु हैं और आदि-अन्तवाले अर्थात अनित्य हैं। इसलिए हे अर्जुन! बुद्धिमान विवेकी पुरुष उनमें नहीं रमता\n" +
                    " ॥22॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==21)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","शक्नोतीहैव यः सोढुं प्राक्शरीरविमोक्षणात्।\n" +
                    " कामक्रोधोद्भवं वेगं स युक्तः स सुखी नरः  ॥23॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो साधक इस मनुष्य शरीर में, शरीर का नाश होने से पहले-पहले ही काम-क्रोध से उत्पन्न होने वाले वेग को सहन करने में समर्थ हो जाता है, वही पुरुष योगी है और वही सुखी है\n" +
                    " ॥23॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==22)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","योऽन्तःसुखोऽन्तरारामस्तथान्तर्ज्योतिरेव यः।\n" +
                    " स योगी ब्रह्मनिर्वाणं ब्रह्मभूतोऽधिगच्छति  ॥24॥\n" +
                    "\n" +
                    "भावार्थ  :-  जो पुरुष अन्तरात्मा में ही सुखवाला है, आत्मा में ही रमण करने वाला है तथा जो आत्मा में ही ज्ञान वाला है, वह सच्चिदानन्दघन परब्रह्म परमात्मा के साथ एकीभाव को प्राप्त सांख्य योगी शांत ब्रह्म को प्राप्त होता है\n" +
                    " ॥24॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==23)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","लभन्ते ब्रह्मनिर्वाणमृषयः क्षीणकल्मषाः।\n" +
                    " छिन्नद्वैधा यतात्मानः सर्वभूतहिते रताः  ॥25॥\n" +
                    "\n" +
                    "भावार्थ  :-  जिनके सब पाप नष्ट हो गए हैं, जिनके सब संशय ज्ञान द्वारा निवृत्त हो गए हैं, जो सम्पूर्ण प्राणियों के हित में रत हैं और जिनका जीता हुआ मन निश्चलभाव से परमात्मा में स्थित है, वे ब्रह्मवेत्ता पुरुष शांत ब्रह्म को प्राप्त होते हैं\n" +
                    " ॥25॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==24)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","कामक्रोधवियुक्तानां यतीनां यतचेतसाम्।\n" +
                    " अभितो ब्रह्मनिर्वाणं वर्तते विदितात्मनाम्  ॥26॥\n" +
                    "\n" +
                    "भावार्थ  :-  काम-क्रोध से रहित, जीते हुए चित्तवाले, परब्रह्म परमात्मा का साक्षात्कार किए हुए ज्ञानी पुरुषों के लिए सब ओर से शांत परब्रह्म परमात्मा ही परिपूर्ण है\n" +
                    " ॥26॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==25)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","स्पर्शान्कृत्वा बहिर्बाह्यांश्चक्षुश्चैवान्तरे भ्रुवोः।\n" +
                    " प्राणापानौ समौ कृत्वा नासाभ्यन्तरचारिणौ  ॥27॥\n" +
                    " यतेन्द्रियमनोबुद्धिर्मुनिर्मोक्षपरायणः।\n" +
                    " विगतेच्छाभयक्रोधो यः सदा मुक्त एव सः  ॥28॥\n" +
                    "\n" +
                    "भावार्थ  :-  बाहर के विषय-भोगों को न चिन्तन करता हुआ बाहर ही निकालकर और नेत्रों की दृष्टि को भृकुटी के बीच में स्थित करके तथा नासिका में विचरने वाले प्राण और अपानवायु को सम करके, जिसकी इन्द्रियाँ मन और बुद्धि जीती हुई हैं, ऐसा जो मोक्षपरायण मुनि (परमेश्वर के स्वरूप का निरन्तर मनन करने वाला।) इच्छा, भय और क्रोध से रहित हो गया है, वह सदा मुक्त ही है\n" +
                    " ॥27-28॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }
        else if(position==26)
        {
            FiveFragment fiveFragment=new FiveFragment();
            Bundle bundle= new Bundle();
            bundle.putString("message5","भोक्तारं यज्ञतपसां सर्वलोकमहेश्वरम्।\n" +
                    " सुहृदं सर्वभूतानां ज्ञात्वा मां शान्तिमृच्छति ॥29॥\n" +
                    "\n" +
                    "भावार्थ  :-  मेरा भक्त मुझको सब यज्ञ और तपों का भोगने वाला, सम्पूर्ण लोकों के ईश्वरों का भी ईश्वर तथा सम्पूर्ण भूत-प्राणियों का सुहृद् अर्थात स्वार्थरहित दयालु और प्रेमी, ऐसा तत्व से जानकर शान्ति को प्राप्त होता है\n" +
                    " ॥29॥ \n" +
                    " ॐ तत्सदिति श्रीमद्भगवद्गीतासूपनिषत्सु ब्रह्मविद्यायां योगशास्त्रे श्रीकृष्णार्जुनसंवादे कर्मसंन्यासयोगो नाम पंचमोऽध्यायः\n" +
                    " ॥5॥\n");
            fiveFragment.setArguments(bundle);
            return fiveFragment;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 27;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        if(position<=7)
        {
            return "श्लोक "+position;
        }
        else if(position==8)
        {
            return "श्लोक 8,9";
        }
        else if(position<=25&&position>=9)
        {
            position=position+1;
            return "श्लोक "+position;
        }
        else if(position==26)
        {
            return "श्लोक 27,28";
        }
        else if(position==27)
        {
            return  "श्लोक 29";
        }
        return null;
    }
}

