package org.openapitools.api.factories;

import org.openapitools.api.WarehousesApiService;
import org.openapitools.api.impl.WarehousesApiServiceImpl;

public class WarehousesApiServiceFactory {
    private static final WarehousesApiService service = new WarehousesApiServiceImpl();

    public static WarehousesApiService getWarehousesApi() {
        return service;
    }
}
