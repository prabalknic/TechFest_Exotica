package com.exotica.asus.theexotica2k18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Gallery extends AppCompatActivity {

    //a list to store all the products
    List<Product> productList;

    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new Product(
                        1,
                        "'It feel great to perform here. we love the crowd the people at Exotica.I look forward to visit Nalanda Institute of Technology Bhubaneswar many More Times In The Year To Come.'",
                        "-Samrat sarkar",
                        4.3,
                        60000,
                        R.drawable.samrat));

        productList.add(
                new Product(
                        1,
                        "'Amazing show! I had an amazing time performing here.The crowd was Awesome, I would love to come back again.'",
                        "-Rupali Malik",
                        4.3,
                        60000,
                        R.drawable.rupali));

        productList.add(
                new Product(
                        1,
                        "'I had an awesome time at The Exotica Fest.It always feels good to be one of the headliners at a festival of this magnitude.The Experience was overwhelming.'",
                        "-Sagar",
                        4.3,
                        60000,
                        R.drawable.sagar));
        productList.add(
                new Product(
                        1,
                        "'The Energy here is Incredible do your best in your field.'",
                        "-Our Past Guest",
                        4.3,
                        60000,
                        R.drawable.ch4));
        productList.add(
                new Product(
                        1,
                        "'The crowd is really Energetic that I have ever watched.'",
                        "-Our Past Guest",
                        4.3,
                        60000,
                        R.drawable.ch2));
        productList.add(
                new Product(
                        1,
                        "'Nalanda is growing Tremdeously in such a short year.'",
                        "-Our Past Guest",
                        4.3,
                        60000,
                        R.drawable.ch3));
        productList.add(
                new Product(
                        1,
                        "'Lovely Crowd Lovely place.'",
                        "-Our Past Guest",
                        4.3,
                        60000,
                        R.drawable.ch1));
        productList.add(
                new Product(
                        1,
                        "'After Being Mr.NIT I seen betterment in my creativity.'\n\n" +
                                "'After Being Miss.NIT It increased my confidence level and leadership.'",
                        "Vishal Kumar ,Amrita Rai",
                        4.3,
                        60000,
                        R.drawable.mrandmiss));
        productList.add(
                new Product(
                        1,
                        "'Lets find out who will be Mr and Miss NIT of 2k18?'",
                        "-?",
                        4.3,
                        60000,
                        R.drawable.ques));

        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }
}
