package org.openapitools.api.factories;

import org.openapitools.api.DeliveryApiService;
import org.openapitools.api.impl.DeliveryApiServiceImpl;

public class DeliveryApiServiceFactory {
    private static final DeliveryApiService service = new DeliveryApiServiceImpl();

    public static DeliveryApiService getDeliveryApi() {
        return service;
    }
}
