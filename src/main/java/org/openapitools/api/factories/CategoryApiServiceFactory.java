package org.openapitools.api.factories;

import org.openapitools.api.CategoryApiService;
import org.openapitools.api.impl.CategoryApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CategoryApiServiceFactory {
    private static final CategoryApiService service = new CategoryApiServiceImpl();

    public static CategoryApiService getCategoryApi() {
        return service;
    }
}
