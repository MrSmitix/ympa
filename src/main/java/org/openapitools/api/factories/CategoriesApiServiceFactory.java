package org.openapitools.api.factories;

import org.openapitools.api.CategoriesApiService;
import org.openapitools.api.impl.CategoriesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CategoriesApiServiceFactory {
    private static final CategoriesApiService service = new CategoriesApiServiceImpl();

    public static CategoriesApiService getCategoriesApi() {
        return service;
    }
}
