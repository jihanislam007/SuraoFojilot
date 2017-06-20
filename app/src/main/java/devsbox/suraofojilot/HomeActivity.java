package devsbox.suraofojilot;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class HomeActivity extends AppCompatActivity {

    ImageView addone , addtwo;
    TextView one ,two, three, four , five , six , seven , eight , nine , ten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        addone = (ImageView) findViewById(R.id.addOneimageView);
        addtwo = (ImageView) findViewById(R.id.addTwoimageView);


        one = (TextView) findViewById(R.id.oneButton);
        two = (TextView) findViewById(R.id.twoButton);
        three = (TextView) findViewById(R.id.threeButton);
        four = (TextView) findViewById(R.id.fourButton);
        five = (TextView) findViewById(R.id.fiveButton);
        six = (TextView) findViewById(R.id.sixButton);
        seven = (TextView) findViewById(R.id.sevenButton);
        eight = (TextView) findViewById(R.id.eightButton);
        nine = (TextView) findViewById(R.id.nineButton);
        ten = (TextView) findViewById(R.id.tenButton);


     //////////////////////////////////////- working for parmanent add -////////////////////////
        AnimationDrawable animation = new AnimationDrawable();
        animation.addFrame(getResources().getDrawable(R.drawable.logo), 2000);
        animation.addFrame(getResources().getDrawable(R.drawable.ranna), 5000);
        animation.addFrame(getResources().getDrawable(R.drawable.vote), 3000);
        animation.setOneShot(false);

        addone =  (ImageView) findViewById(R.id.addOneimageView);
        addone.setBackgroundDrawable(animation);

        // start the animation! 1
        animation.start();

        AnimationDrawable animation2 = new AnimationDrawable();
        animation2.addFrame(getResources().getDrawable(R.drawable.vote), 5000);
        animation2.addFrame(getResources().getDrawable(R.drawable.logo), 3000);
        animation2.addFrame(getResources().getDrawable(R.drawable.ranna), 2000);
        animation2.setOneShot(false);

        addtwo =  (ImageView) findViewById(R.id.addTwoimageView);
        addtwo.setBackgroundDrawable(animation2);
        // start the animation!
        animation2.start();
//////////////////////////////////////- working for parmanent add -/////////////////////////////////

        addone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://play.google.com/store/search?q=devsbox&hl=en"));
                startActivity(i);
            }
        });

        addtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://play.google.com/store/search?q=devsbox&hl=en"));
                startActivity(i);
            }
        });


        /////////////////////////////////////////////////////////////////////////////////////////

                one.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String heading = "সূরা ফাতিহা";
                        String text = "বাংলায় উচ্চারন: \n" +
                                "আলহামদু লিল্লাহি রাব্বিল আ’লামীন \n" +
                                "আর রাহমানির রাহীমি \n" +
                                "মালিকি ইয়াওমিদ্দীন \n" +
                                "ইয়্যাকা না’বুদু ওয়া ইয়্যাকা নাস্তাঈন \n" +
                                "ইহ্দিনাস্ সিরাতাল মোস্তাকীম \n" +
                                "সিরাতাল্লাজীনা আন আমতা আলাইহিম গাইরিল মাগদূবি আলাইহিম ওয়ালাদ্দোয়াল্লিন আমীন\n" +
                                "\n" +
                                "বাংলায় অনুবাদ: \n" +
                                "সমস্ত প্রশংসা বিশ্বজগতের প্রতিপালক আল্লাহ্\u200Cরই, \n" +
                                "যিনি পরম করুণাময়, পরম দয়াময়, \n" +
                                "যিনি বিচার দিনের মালিক \n" +
                                "আমরা একমাত্র তোমারই ইবাদত করি এবং শুধুমাত্র তোমারই সাহায্য প্রার্থনা করি \n" +
                                "আমাদেরকে সরল পথ দেখাও, \n" +
                                "সে সমস্ত লোকের পথ, যাদেরকে তুমি নেয়ামত দান করেছ \n" +
                                "তাদের পথ নয়, যাদের প্রতি তোমার গজব নাযিল হয়েছে এবং যারা পথভ্রষ্ট হয়েছে\n";

                        Intent in = new Intent(HomeActivity.this , AllView.class);

                        in.putExtra("titel_name", heading);
                        in.putExtra("upodetail_name", text);
                        startActivity(in);
                    }
                });

        two.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String heading = "সূরা ফীল";
                        String text = "বাংলায় উচ্চারন: \n" +
                                "বিসমিল্লাহির রাহমানির রাহিম \n" +
                                "আলাম তারা কাইফা ফা’আলা রাব্বুকা বিআছহা বিল ফীল \n" +
                                "আলাম ইয়াজ আল \n" +
                                "কাইদাহুম ফী তাদলীলিওঁ ওয়া আরসালা আলাইহিম ত্বাইরান আবাবীল ,\n" +
                                "তারমীহিম বিহিজারাতিম মিন সিজ্জীলিন। \n" +
                                "ফাজা আলাহুম কাআছ ফিম মা’কূল।\n" +
                                "\n" +
                                "বাংলায় অনুবাদ: \n" +
                                "শুরু করছি আল্লাহর নামে যিনি পরম করুণাময়, অতি দয়ালু। \n" +
                                "আপনি কি দেখেননি আপনার পালনকর্তা হস্তীবাহিনীর সাথে কিরূপ ব্যবহার করেছেন?\n" +
                                "তিনি কি তাদের চক্রান্ত নস্যাত্\u200D করে দেননি? \n" +
                                "তিনি তাদের উপর প্রেরণ করেছেন ঝাঁকে ঝাঁকে পাখী, \n" +
                                "যারা তাদের উপর পাথরের কংকর নিক্ষেপ করছিল। \n" +
                                "অতঃপর তিনি তাদেরকে ভক্ষিত তৃণসদৃশ করে দেন।";

                        Intent in = new Intent(HomeActivity.this , AllView.class);

                        in.putExtra("titel_name", heading);
                        in.putExtra("upodetail_name", text);
                        startActivity(in);
                    }
                });

        three.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String heading = "সূরা কুরাইশ";
                        String text = "বাংলায় উচ্চারন: \n" +
                                "বিসমিল্লাহির রাহমানির রাহিম\n" +
                                "\n" +
                                "লি-ঈলাফি কুরাইশিন, \n" +
                                "ঈলাফিহিম রিহ্ লাতাশ শীতায়ি ওয়াছ ছাইফ। \n" +
                                "ফালইয়া’বুদূ রাব্বা হাযাল বাইত \n" +
                                "আল্লাযী আত্য়ামাহুম মিন্ জু-ইওঁ ওয়া অমানাহুম মিন খাউফ।\n" +
                                "\n" +
                                "বাংলায় অনুবাদ: \n" +
                                "শুরু করছি আল্লাহর নামে যিনি পরম করুণাময়, অতি দয়ালু।\n" +
                                "\n" +
                                "কোরাইশের আসক্তির কারণে, \n" +
                                "আসক্তির কারণে তাদের শীত ও গ্রীষ্মকালীন সফরের। \n" +
                                "অতএব তারা যেন এবাদত করে এই ঘরের পালনকর্তার \n" +
                                "যিনি তাদেরকে ক্ষুধায় আহার দিয়েছেন এবং যুদ্ধভীতি থেকে তাদেরকে নিরাপদ করেছেন\n";

                        Intent in = new Intent(HomeActivity.this , AllView.class);

                        in.putExtra("titel_name", heading);
                        in.putExtra("upodetail_name", text);
                        startActivity(in);
                    }
                });

        four.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String heading = "সূরা মাউন";
                        String text = "বাংলায় উচ্চারন: \n" +
                                "আরাআইতাল্ লাযী ইউকায্যিবু বিদ্দীন্।\n" +
                                "ফাযা-লিকাল্ লাযী ইয়াদু‘য়্যুল ইয়াতীম্।\n" +
                                "ওয়ালা- ইয়াহুদ্দু আ’লা- ত্বা‘আ-মিল্ মিস্কীন।\n" +
                                "ফাওয়াইলুল্ লিল মুছাল্লীন।\n" +
                                "আল্লাযীনা হুম ‘আন্ সালা-তিহিম সা-হূন।\n" +
                                "আল্লাযীনা হুম ইউরা-ঊনা।\n" +
                                "ওয়া ইয়াম্না‘ঊনাল্ মা-‘ঊন্।\n" +
                                "\n" +
                                "বাংলায় অনুবাদ: \n" +
                                "শুরু করছি আল্লাহর নামে যিনি পরম করুণাময়, অতি দয়ালু।\n" +
                                "\n" +
                                "আপনি কি দেখেছেন তাকে, যে বিচারদিবসকে মিথ্যা বলে?\n" +
                                "সে সেই ব্যক্তি, যে এতীমকে গলা ধাক্কা দেয়\n" +
                                "এবং মিসকীনকে অন্ন দিতে উৎসাহিত করে না।\n" +
                                "অতএব দুর্ভোগ সেসব নামাযীর,\n" +
                                "যারা তাদের নামায সম্বন্ধে বে-খবর;\n" +
                                "যারা তা লোক-দেখানোর জন্য করে\n" +
                                "এবং নিত্য ব্যবহার্য্য বস্তু অন্যকে দেয় না";

                        Intent in = new Intent(HomeActivity.this , AllView.class);

                        in.putExtra("titel_name", heading);
                        in.putExtra("upodetail_name", text);
                        startActivity(in);
                    }
                });

        five.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String heading = "সূরা আল কাওসার";
                        String text = "বাংলায় উচ্চারন: \n" +
                                "ইন্না--- ‘আত্বাইনা- কাল্ কাওছার। \n" +
                                "ফাছাল্লি লিরাব্বিকা ওয়ান্হার। \n" +
                                "ইন্না শা-নিআকা হুয়াল আব্তার।\n" +
                                "\n" +
                                "বাংলায় অনুবাদ: \n" +
                                "নিশ্চয় আমি আপনাকে কাওসার দান করেছি। \n" +
                                "অতএব আপনার পালনকর্তার উদ্দেশ্যে নামায পড়ুন এবং কোরবানী করুন। \n" +
                                "যে আপনার শত্রু, সেই তো লেজকাটা, নির্বংশ\n";

                        Intent in = new Intent(HomeActivity.this , AllView.class);

                        in.putExtra("titel_name", heading);
                        in.putExtra("upodetail_name", text);
                        startActivity(in);
                    }
                });

        six.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String heading = "সূরা কাফিরুন";
                        String text = "বাংলায় উচ্চারন: \n" +
                                "ক্কুল ইয়া--- আইয়্যূহাল কা-ফিরূন। \n" +
                                "লা--- ‘আবুদু মা- ‘তাবুদূন। \n" +
                                "ওয়ালা--- আন্তুম ‘আ-বিদূনা মা--- ‘আবুদ। \n" +
                                "ওয়ালা--- আনা ‘আবিদূম্ মা- ‘আবাত্তুম। \n" +
                                "ওয়ালা--- আন্তুম ‘আ-বিদূনা মা--- ‘আবুদ। \n" +
                                "লাকুম দ্বীনুকুম ওয়া লিয়া দ্বীন।\n" +
                                "\n" +
                                "বাংলায় অনুবাদ: \n" +
                                "শুরু করছি আল্লাহর নামে যিনি পরম করুণাময়, অতি দয়ালু।\n" +
                                "\n" +
                                "বলুন, হে কাফেরকূল, \n" +
                                "আমি এবাদত করিনা, তোমরা যার এবাদত কর। \n" +
                                "এবং তোমরাও এবাদতকারী নও, যার এবাদত আমি করি \n" +
                                "এবং আমি এবাদতকারী নই, যার এবাদত তোমরা কর। \n" +
                                "তোমরা এবাদতকারী নও, যার এবাদত আমি করি। \n" +
                                "তোমাদের কর্ম ও কর্মফল তোমাদের জন্যে এবং আমার কর্ম ও কর্মফল আমার জন্যে\n";

                        Intent in = new Intent(HomeActivity.this , AllView.class);

                        in.putExtra("titel_name", heading);
                        in.putExtra("upodetail_name", text);
                        startActivity(in);
                    }
                });

        seven.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String heading = "সূরা নাসর";
                        String text = "বাংলায় উচ্চারন: \n" +
                                "১। ইযা- জ্বা----আ নাছ্রুল্লা-হি ওয়াল্ ফাত্হু।\n" +
                                "২। ওয়া রাআইতান্ না-ছা ইয়াদ্খুলূনা ফী দ্বীনিল্লা-হি আফ্ওয়া-জ্বা-।\n" +
                                "৩। ফাস্ব্বিহ্ বিহাম্দি রাব্বিকা ওয়াস্তাগ্ফিরহু; ইন্নাহূ কা-না তাওয়্যা-বা।\n" +
                                "\n" +
                                "বাংলায় অনুবাদ: \n" +
                                "যখন আসবে আল্লাহর সাহায্য ও বিজয়\n" +
                                "এবং আপনি মানুষকে দলে দলে আল্লাহর দ্বীনে প্রবেশ করতে দেখবেন,\n" +
                                "তখন আপনি আপনার পালনকর্তার পবিত্রতা বর্ণনা করুন এবং তাঁর কাছে ক্ষমা প্রার্থনা করুন। নিশ্চয় তিনি ক্ষমাকারী\n";

                        Intent in = new Intent(HomeActivity.this , AllView.class);

                        in.putExtra("titel_name", heading);
                        in.putExtra("upodetail_name", text);
                        startActivity(in);
                    }
                });

        eight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String heading = "সূরা আল ইখলাস";
                        String text = "বাংলায় উচ্চারন: \n" +
                                "ক্বুল্ হুওয়াল্লা-হু আহাদ্।\n" +
                                "আল্লা-হুস্ সামাদ।\n" +
                                "লাম ইয়ালিদ্ ওয়া লাম ইঊলাদ্।\n" +
                                "ওয়া লাম ইয়াকুল লাহু কুফুওয়ান্ আহাদ।\n" +
                                "\n" +
                                "বাংলায় অনুবাদ: \n" +
                                "শুরু করছি আল্লাহর নামে যিনি পরম করুণাময়, অতি দয়ালু।\n" +
                                "\n" +
                                "১) বলুন, তিনি আল্লাহ, এক, \n" +
                                "২) আল্লাহ অমুখাপেক্ষী, \n" +
                                "৩) তিনি কাউকে জন্ম দেননি এবং কেউ তাকে জন্ম দেয়নি \n" +
                                "৪) এবং তার সমতুল্য কেউ নেই\n";

                        Intent in = new Intent(HomeActivity.this , AllView.class);

                        in.putExtra("titel_name", heading);
                        in.putExtra("upodetail_name", text);
                        startActivity(in);
                    }
                });

        nine.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String heading = "সূরা আল ফালাক";
                        String text = "বাংলায় উচ্চারন: \n" +
                                "ক্বুল আ‘ঊযু বিরাব্বিল ফালাক্ব। \n" +
                                "মিন্ র্শারি মা- খালাক্ব। \n" +
                                "ওয়া মিন্ র্শারি গা-ছিক্কিন ইযা- ওয়াক্বাব। \n" +
                                "ওয়া মিন্ র্শারিন নাফ্ফা-ছা-তি ফিল্ ‘উক্বাদ্। \n" +
                                "ওয়া মিন্ র্শারি হা-ছিদিন্ ইযা- হাসাদ্।\n" +
                                "\n" +
                                "বাংলায় অনুবাদ: \n" +
                                "শুরু করছি আল্লাহর নামে যিনি পরম করুণাময়, অতি দয়ালু।\n" +
                                "\n" +
                                "বলুন, আমি আশ্রয় গ্রহণ করছি প্রভাতের পালনকর্তার, \n" +
                                "তিনি যা সৃষ্টি করেছেন, তার অনিষ্ট থেকে, \n" +
                                "অন্ধকার রাত্রির অনিষ্ট থেকে, যখন তা সমাগত হয়, \n" +
                                "গ্রন্থিতে ফুঁত্\u200Dকার দিয়ে জাদুকারিণীদের অনিষ্ট থেকে\n" +
                                "এবং হিংসুকের অনিষ্ট থেকে যখন সে হিংসা করে।\n";

                        Intent in = new Intent(HomeActivity.this , AllView.class);

                        in.putExtra("titel_name", heading);
                        in.putExtra("upodetail_name", text);
                        startActivity(in);
                    }
                });

        ten.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String heading = "সূরা ক্বদর";
                        String text = "বাংলায় উচ্চারন: \n" +
                                "ইন্না--- আন্যাল্না-হু ফী লাইলাতিল ক্বাদ্রি। \n" +
                                "ওয়ামা--- আদ্রা-কা মা- লাইলাতুল্ ক্বাদ্রি। \n" +
                                "লাইলাতুল ক্বাদরি খাইরুম্ মিন্ আল্ফি শাহ্রিন। \n" +
                                "তানাজ্জালুল মালা----ইকাতু ওর্য়ারূহু ফীহা- বিইযনি রাব্বিহিম, মিন্ কুল্লি আমরিন। \n" +
                                "সালা-মুন, হিয়া হাত্তা- মাত্বলাইল্ ফাজরি।\n" +
                                "\n" +
                                "বাংলায় অনুবাদ: \n" +
                                "শুরু করছি আল্লাহর নামে যিনি পরম করুণাময়, অতি দয়ালু।\n" +
                                "\n" +
                                "আমি একে নাযিল করেছি শবে-কদরে। \n" +
                                "শবে-কদর সম্বন্ধে আপনি কি জানেন? \n" +
                                "শবে-কদর হল এক হাজার মাস অপেক্ষা শ্রেষ্ঠ। \n" +
                                "এতে প্রত্যেক কাজের জন্যে ফেরেশতাগণ ও রূহ অবতীর্ণ হয় তাদের পালনকর্তার নির্দেশক্রমে। \n" +
                                "এটা নিরাপত্তা যা ফজরের উদয় পর্যন্ত অব্যাহত থাকে";

                        Intent in = new Intent(HomeActivity.this , AllView.class);

                        in.putExtra("titel_name", heading);
                        in.putExtra("upodetail_name", text);
                        startActivity(in);
                    }
                });

    }
}
