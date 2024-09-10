package org.openapitools.api.factories;

import org.openapitools.api.BusinessesApiService;
import org.openapitools.api.impl.BusinessesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class BusinessesApiServiceFactory {
    private static final BusinessesApiService service = new BusinessesApiServiceImpl();

    public static BusinessesApiService getBusinessesApi() {
        return service;
    }
}
