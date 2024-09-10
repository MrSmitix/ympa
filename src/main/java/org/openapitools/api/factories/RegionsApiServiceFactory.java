package org.openapitools.api.factories;

import org.openapitools.api.RegionsApiService;
import org.openapitools.api.impl.RegionsApiServiceImpl;

public class RegionsApiServiceFactory {
    private static final RegionsApiService service = new RegionsApiServiceImpl();

    public static RegionsApiService getRegionsApi() {
        return service;
    }
}
