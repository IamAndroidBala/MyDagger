package com.android.bala.dagger.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/android/bala/dagger/dagger/PresenterModule;", "", "()V", "provideAlbumPresenter", "Lcom/android/bala/dagger/ui/albumscreen/AlbumPresenterImpl;", "albums", "Lcom/android/bala/dagger/network/GetAlbums;", "provideCommentPresenter", "Lcom/android/bala/dagger/ui/commentscreen/CommentPresenterImpl;", "comments", "Lcom/android/bala/dagger/network/GetComments;", "provideMyActivityPresenter", "Lcom/android/bala/dagger/ui/postscreen/PostPresenterImpl;", "post", "Lcom/android/bala/dagger/network/GetPosts;", "providePhotosPresenter", "Lcom/android/bala/dagger/ui/photoscreen/PhotosPresenterImpl;", "photos", "Lcom/android/bala/dagger/network/GetPhotos;", "provideUserPresenter", "Lcom/android/bala/dagger/ui/userscreen/UserPresenterImpl;", "users", "Lcom/android/bala/dagger/network/GetUsers;", "app_debug"})
@dagger.Module()
public final class PresenterModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.android.bala.dagger.ui.postscreen.PostPresenterImpl provideMyActivityPresenter(@org.jetbrains.annotations.NotNull()
    com.android.bala.dagger.network.GetPosts post) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.android.bala.dagger.ui.albumscreen.AlbumPresenterImpl provideAlbumPresenter(@org.jetbrains.annotations.NotNull()
    com.android.bala.dagger.network.GetAlbums albums) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.android.bala.dagger.ui.userscreen.UserPresenterImpl provideUserPresenter(@org.jetbrains.annotations.NotNull()
    com.android.bala.dagger.network.GetUsers users) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.android.bala.dagger.ui.commentscreen.CommentPresenterImpl provideCommentPresenter(@org.jetbrains.annotations.NotNull()
    com.android.bala.dagger.network.GetComments comments) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.android.bala.dagger.ui.photoscreen.PhotosPresenterImpl providePhotosPresenter(@org.jetbrains.annotations.NotNull()
    com.android.bala.dagger.network.GetPhotos photos) {
        return null;
    }
    
    public PresenterModule() {
        super();
    }
}