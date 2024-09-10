package org.openapitools.api.factories;

import org.openapitools.api.DeliveryApiService;
import org.openapitools.api.impl.DeliveryApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DeliveryApiServiceFactory {
    private static final DeliveryApiService service = new DeliveryApiServiceImpl();

    public static DeliveryApiService getDeliveryApi() {
        return service;
    }
}
