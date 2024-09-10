package org.openapitools.api.factories;

import org.openapitools.api.RegionsApiService;
import org.openapitools.api.impl.RegionsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class RegionsApiServiceFactory {
    private static final RegionsApiService service = new RegionsApiServiceImpl();

    public static RegionsApiService getRegionsApi() {
        return service;
    }
}
