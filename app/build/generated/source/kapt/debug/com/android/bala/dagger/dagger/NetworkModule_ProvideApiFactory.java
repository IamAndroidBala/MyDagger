package com.android.bala.dagger.dagger;

import com.android.bala.dagger.network.ApiBuilder;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideApiFactory implements Factory<ApiBuilder> {
  private final NetworkModule module;

  private final Provider<OkHttpClient> clientProvider;

  private final Provider<HttpUrl.Builder> requestBuilderProvider;

  public NetworkModule_ProvideApiFactory(NetworkModule module,
      Provider<OkHttpClient> clientProvider, Provider<HttpUrl.Builder> requestBuilderProvider) {
    this.module = module;
    this.clientProvider = clientProvider;
    this.requestBuilderProvider = requestBuilderProvider;
  }

  @Override
  public ApiBuilder get() {
    return provideApi(module, clientProvider.get(), requestBuilderProvider.get());
  }

  public static NetworkModule_ProvideApiFactory create(NetworkModule module,
      Provider<OkHttpClient> clientProvider, Provider<HttpUrl.Builder> requestBuilderProvider) {
    return new NetworkModule_ProvideApiFactory(module, clientProvider, requestBuilderProvider);
  }

  public static ApiBuilder provideApi(NetworkModule instance, OkHttpClient client,
      HttpUrl.Builder requestBuilder) {
    return Preconditions.checkNotNull(instance.provideApi(client, requestBuilder), "Cannot return null from a non-@Nullable @Provides method");
  }
}
