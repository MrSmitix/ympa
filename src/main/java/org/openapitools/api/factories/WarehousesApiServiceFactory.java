package org.openapitools.api.factories;

import org.openapitools.api.WarehousesApiService;
import org.openapitools.api.impl.WarehousesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WarehousesApiServiceFactory {
    private static final WarehousesApiService service = new WarehousesApiServiceImpl();

    public static WarehousesApiService getWarehousesApi() {
        return service;
    }
}
