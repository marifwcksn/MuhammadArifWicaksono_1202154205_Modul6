package com.example.arif.muhammadarifwicaksono_1202154205_studycase6.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;



public class MyPostsFragment extends PostListFragment {

    public MyPostsFragment() {}



    @Override

    public Query getQuery(DatabaseReference databaseReference) {

        // All my posts

        return databaseReference.child("user-posts")

                .child(getUid());

    }
}
