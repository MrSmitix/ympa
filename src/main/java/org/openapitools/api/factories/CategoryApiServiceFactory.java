package org.openapitools.api.factories;

import org.openapitools.api.CategoryApiService;
import org.openapitools.api.impl.CategoryApiServiceImpl;

public class CategoryApiServiceFactory {
    private static final CategoryApiService service = new CategoryApiServiceImpl();

    public static CategoryApiService getCategoryApi() {
        return service;
    }
}
