package com.juawapps.newsspread.di;

import com.juawapps.newsspread.data.ArticlesRepository;
import com.juawapps.newsspread.data.api.NewsapiService;
import com.juawapps.newsspread.data.db.ArticleDao;
import com.juawapps.newsspread.utils.AppExecutors;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Repository module
 */
@Module
public class AppModuleRepository {

    @Singleton
    @Provides
    ArticlesRepository provideArticleRepository(NewsapiService newsapiService,
                                                ArticleDao articleDao,
                                                AppExecutors appExecutors) {
        return new ArticlesRepository(newsapiService, articleDao, appExecutors);
    }
}
