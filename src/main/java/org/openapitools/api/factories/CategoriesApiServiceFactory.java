package org.openapitools.api.factories;

import org.openapitools.api.CategoriesApiService;
import org.openapitools.api.impl.CategoriesApiServiceImpl;

public class CategoriesApiServiceFactory {
    private static final CategoriesApiService service = new CategoriesApiServiceImpl();

    public static CategoriesApiService getCategoriesApi() {
        return service;
    }
}
