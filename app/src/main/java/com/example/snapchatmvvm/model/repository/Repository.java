package com.example.snapchatmvvm.model.repository;

import com.example.snapchatmvvm.model.model.SnapStory;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private Repository (){

    }

    static class InstanceHolder{
        static Repository INSTANCE = new Repository();
    }

    public static Repository getInstance(){
        return InstanceHolder.INSTANCE;
    }

    public List<SnapStory> getData (){
        List<SnapStory> snapStories = new ArrayList<>();

        snapStories.add(new SnapStory("Naira","https://padypady.com/users/styles-n-colors/maxi_Naira_Marley_granted_bail_for_N2_million_PADYPADY_STORY_7501.png"));
        snapStories.add(new SnapStory("Drake","https://fotojig.com/wp-content/uploads/mosaicmagick/558228320/photos/drizzydec.jpg"));
        snapStories.add(new SnapStory("Davido","https://guardian.ng/wp-content/uploads/2019/07/Davido.-Photo-GH-Headlines.jpg"));
        snapStories.add(new SnapStory("Burna","https://media.vanityfair.com/photos/5d558c5402bf930008778d99/16:9/w_2560%2Cc_limit/Burna-Boy-Party-Lede.jpg"));
        snapStories.add(new SnapStory("Tarm","https://i1.sndcdn.com/artworks-000267935612-ki7ydm-t500x500.jpg"));
        snapStories.add(new SnapStory("Kash","https://pbs.twimg.com/media/EEyEG7lXsAIbX3g.jpg"));
        snapStories.add(new SnapStory("Zlatan","https://gidifeed.com/wp-content/uploads/2019/09/Zlatan-Ibile-Seen-Gifting-His-Fans-Cash-Along-The-Street.jpg"));
        return snapStories;
    }

}
