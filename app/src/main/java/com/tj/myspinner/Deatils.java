package com.tj.myspinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Deatils extends AppCompatActivity {
private TextView textView;
private Button button1,button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatils);
        textView=(TextView)findViewById(R.id.textViewId3);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);

Bundle bundle=getIntent().getExtras();
if(bundle!=null) {

    String value = bundle.getString("tag");
    textView.setText(value);
}
button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent1=new Intent(Deatils.this,High_Blood_pressure.class);
        intent1.putExtra("BP","উচ্চ রক্তচাপ :\nযখন কোন ব্যাক্তির রক্তের চাপ সব সময়েই স্বাভাবিকের চেয়ে ঊর্ধ্বে থাকে তখন তাকে হাইপারটেনশন (Hypertension) বা উচ্চ রক্তচাপ বলে।\n" +
                "উচ্চ রক্তচাপের লক্ষণ:\n" +
                "\n" +
                "    #অস্বস্তি বোধ করা\n" +
                "    #নিয়মিত বা অতিরিক্ত মাথা ব্যথা\n" +
                "    #ঘাড়ে ব্যথা\n" +
                "    #চোখে ঝাপসা দেখা\nউচ্চ রক্তচাপের কারণ:\n" +

                "সাধারনভাবে নিম্নলিখিত কারনে উচ্চ রক্তচাপ হয়ে থাকেঃ\n" +
                "\n" +
                "    #অতিরিক্ত কাজের চাপ\n" +
                "    #অতিরিক্ত মদ্যপান\n" +
                "    #উচ্চমাত্রার লবণের ব্যবহারের\n" +
                "   #মেদ\n" +
                "    #পরিবারের আকার বড় হওয়া\n" +
                "    #বেশী আওয়াজ\n" +
                "   #ঘিঞ্জি পরিবেশ\n" +
                "    #গর্ভধারণের কারণে\n");
        startActivity(intent1);
    }
});
button2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent2=new Intent(Deatils.this,High_cholesterol.class);
        intent2.putExtra("HC","কোলেষ্টেরল নিয়ন্ত্রণে :\nস্বাস্থ্য সুরক্ষার জন্য কোলেষ্টেরল নিয়ন্ত্রণে রাখা জরুরি। কারণ এটি নিয়ন্ত্রণে না থাকলে স্ট্রোক অথবা হৃদরোগের ঝুঁকি বাড়ে। অনেকেই শরীরের এলডিএল ( খারাপ) এবং এইচডিএল (ভাল) কোলেস্টেরল নিয়ে বিভ্রান্তিতে পড়েন। কারও কারও ধারনা কোলেস্টেরল হৃদরোগের ক্ষেত্রে কোনো সমস্যা সৃষ্টি করে না। এমনিতে কোলেস্টেরল ধমনী প্রাচীর এবং হরমোন উৎপাদনে ভূমিকা রাখে।কিন্তু কোলেস্টেরল বেশি থাকা শরীরের জন্য খারাপ। এ কারণে শরীরের কোলেস্টেরল নিয়ন্ত্রণে রাখা জরুরি। তা না হলে উচ্চ রক্তচাপ, স্ট্রোক ও হৃদরোগের ঝুঁকি বাড়ে");

        startActivity(intent2);
    }
});
button3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent3=new Intent(Deatils.this,Heart_Attack.class);
        intent3.putExtra("HA"," হার্ট অ্যাটাক কি?\nমূল কথা হার্ট অ্যাটাক হল হার্ট  ঠিক মত কাজ না করা । করোনারি আর্টারি নামে হৃৎপিন্ডের গায়ে থাকে দুটি ছোট ধমনী।এরাই হৃৎপিন্ডে পুষ্টির যোগান দেয়। কোন কারনে এই করোনারি আর্টারিতে যদি ব্লক সৃষ্টি হয় তাহলে যে এলাকা ঐ আর্টারি বা ধমনীর রক্তের পুষ্টি নিয়ে চলে সে জায়গার হৃৎপেশি কাজ করে না। তখনই হার্ট অ্যাটাক হয়ে থাকে। এর কেতাবি নাম মায়োকার্ডিয়াল ইনফার্কশন।" +
                "\n" +
                "হার্ট অ্যাটাক এর কারন কি?  \n" +
                "\n" +
                "হৃদরোগের অনেক কারন আছে। প্রাথমিক জ্ঞানের জন্য আমরা এখানে প্রধান কারনগুলো উল্লেখ করবো ,\n" +
                "1. তেলযুক্ত খাদ্য গ্রহন।\n" +
                "2. মানসিক চাপের মধ্যে থাকা।\n" +
                "3. রক্তে এল ডি এল (খারাপ) কোলেস্ট্রলের মাত্রা বেড়ে যাওয়া এবং এইচ ডি এল (ভাল) কোলেস্ট্রলের মাত্রা কমে যাওয়া।\n" +
                "4. খাদ্যে এন্টি অক্সিডেন্টের অভাব।\n" +
                "5. উচ্চ রক্তচাপ,ডায়াবেটিস এবং মদ খাওয়া।\n" +
                "6. শারীরিক পরিশ্রমের অভাব ও ওজন বৃদ্দি।\n" +
                "7. তামাক (বিড়ি,সিগারেট,গুল,জর্দা) খাওয়া।ক" +
                "িভাবে বুঝবেন হার্ট অ্যাটাক হয়েছে?\n"+
                "1.বুকে প্রচন্ড ব্যাথা হবে। এরকম লাগতে পারেঃ\n" +
                " 2.হঠাৎ অনুভব করবেন ভারি কিছু একটা যেন বসে আছে আপনার বুকের উপর \n" +
                " 3.একটা ব্যাথার ব্যান্ড বুকের চারপাশে অনুভব করবেন\n" +
                " 4.বুকের ব্যাথা মনে হবে যেন বুক চিপে ফেলছে\n" +
                " 5.হজম হবে না পেটের উপরের অংশে জ্বালাপোড়া করবে");
        startActivity(intent3);
    }
});
button4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent4=new Intent(Deatils.this,Diabetes.class);
        intent4.putExtra("DIA"," ডায়াবেটিস :\n ডায়াবেটিস একটি বিপাকজনিত রোগ। আমাদের শরীরে ইনস্যুলিন নামের হরমোনের সম্পূর্ণ বা আপেক্ষিক ঘাটতির কারণে বিপাকজনিত গোলযোগ সৃষ্টি হয়ে রক্তে গ্লুকোজের পরিমাণ বৃদ্ধি পায় এবং এক সময় তা প্রস্রাবের সঙ্গে বেরিয়ে আসে। এই সামগ্রিক অবস্থাকে ডায়াবেটিস বলে। এই রোগে রক্তে গ্লুকোজের পরিমাণ দীর্ঘস্থায়ীভাবে বেড়ে যায়।" +
                "ডায়াবেটিসের লক্ষণসমূহ :\n" +
                "ক. ঘন ঘন প্রস্রাব হওয়া\n" +
                "খ. খুব বেশি পিপাসা লাগা\n" +
                "গ. বেশি ক্ষুধা পাওয়া\n" +
                "ঘ. যথেষ্ট খাওয়া সত্ত্বেও ওজন কমে যাওয়া\n" +
                "ঙ. ক্লান্তি ও দুর্বলতা বোধ করা\n" +
                "চ. ক্ষত শুকাতে বিলম্ব হওয়া\n" +
                "ছ. খোস-পাঁচড়া, ফোঁড়া প্রভৃতি চর্মরোগ দেখা দেওয়া\n" +
                "জ. চোখে কম দেখা।" +
                "\n" +
                "ডায়াবেটিসে আক্রান্ত হওয়ার কারণসমূহ :\n" +
                "যে কেউ যে কোনো বয়সে যেকোনো সময় ডায়াবেটিসে আক্রান্ত হতে পারেন। তবে নিম্নোক্ত শ্রেণীর ব্যক্তিদের মধ্যে ডায়াবেটিস হওয়ার সম্ভাবনা বেশি থাকে:\n" +
                "ক. যাদের বংশে বিশেষ করে বাবা-মা বা রক্ত সম্পর্কিত নিকটাত্মীয়ের ডায়াবেটিস আছে।\n" +
                "খ. যাদের ওজন অনেক বেশি ও যারা ব্যায়াম বা শারীরিক পরিশ্রমের কোনো কাজ করেন না।\n" +
                "গ. যারা বহুদিন ধরে কর্টিসোল জাতীয় ওষুধ ব্যবহার করেন।\n" +
                "ঘ. যেসব মহিলার গর্ভাবস্থায় ডায়াবেটিস ছিল আবার যেসব মহিলা ৯ পাউন্ডের বেশি ওজনের বাচ্চা প্রসব করেছেন।\n" +
                "ঙ. যাদের রক্তচাপ আছে এবং রক্তে কোলেস্টেরল বেশি থাকে।");
        startActivity(intent4);
    }
});


    }
}
