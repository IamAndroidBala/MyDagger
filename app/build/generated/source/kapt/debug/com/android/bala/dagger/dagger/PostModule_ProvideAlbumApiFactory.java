package com.android.bala.dagger.dagger;

import com.android.bala.dagger.network.ApiBuilder;
import com.android.bala.dagger.network.GetAlbums;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PostModule_ProvideAlbumApiFactory implements Factory<GetAlbums> {
  private final PostModule module;

  private final Provider<ApiBuilder> apiProvider;

  public PostModule_ProvideAlbumApiFactory(PostModule module, Provider<ApiBuilder> apiProvider) {
    this.module = module;
    this.apiProvider = apiProvider;
  }

  @Override
  public GetAlbums get() {
    return provideAlbumApi(module, apiProvider.get());
  }

  public static PostModule_ProvideAlbumApiFactory create(PostModule module,
      Provider<ApiBuilder> apiProvider) {
    return new PostModule_ProvideAlbumApiFactory(module, apiProvider);
  }

  public static GetAlbums provideAlbumApi(PostModule instance, ApiBuilder api) {
    return Preconditions.checkNotNull(instance.provideAlbumApi(api), "Cannot return null from a non-@Nullable @Provides method");
  }
}
