package com.android.bala.dagger.ui.photoscreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\u00132\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006 "}, d2 = {"Lcom/android/bala/dagger/ui/photoscreen/PhotoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/android/bala/dagger/ui/photoscreen/PhotoAdapter$ViewHolder;", "thisList", "Ljava/util/ArrayList;", "Lcom/android/bala/dagger/model/photos/Photos;", "Lkotlin/collections/ArrayList;", "activity", "Landroid/app/Activity;", "(Ljava/util/ArrayList;Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "getThisList", "()Ljava/util/ArrayList;", "setThisList", "(Ljava/util/ArrayList;)V", "addPhotos", "", "newList", "", "getItemCount", "", "onBindViewHolder", "itemView", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "p1", "ViewHolder", "app_debug"})
public final class PhotoAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.android.bala.dagger.ui.photoscreen.PhotoAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.android.bala.dagger.model.photos.Photos> thisList;
    @org.jetbrains.annotations.NotNull()
    private android.app.Activity activity;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.android.bala.dagger.ui.photoscreen.PhotoAdapter.ViewHolder itemView, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.android.bala.dagger.ui.photoscreen.PhotoAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int p1) {
        return null;
    }
    
    public final void addPhotos(@org.jetbrains.annotations.NotNull()
    java.util.List<com.android.bala.dagger.model.photos.Photos> newList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.android.bala.dagger.model.photos.Photos> getThisList() {
        return null;
    }
    
    public final void setThisList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.android.bala.dagger.model.photos.Photos> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getActivity() {
        return null;
    }
    
    public final void setActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity p0) {
    }
    
    public PhotoAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.android.bala.dagger.model.photos.Photos> thisList, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/android/bala/dagger/ui/photoscreen/PhotoAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/android/bala/dagger/ui/photoscreen/PhotoAdapter;Landroid/view/View;)V", "bindItems", "", "photo", "Lcom/android/bala/dagger/model/photos/Photos;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bindItems(@org.jetbrains.annotations.NotNull()
        com.android.bala.dagger.model.photos.Photos photo) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}