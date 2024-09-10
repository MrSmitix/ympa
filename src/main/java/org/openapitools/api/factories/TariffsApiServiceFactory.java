package org.openapitools.api.factories;

import org.openapitools.api.TariffsApiService;
import org.openapitools.api.impl.TariffsApiServiceImpl;

public class TariffsApiServiceFactory {
    private static final TariffsApiService service = new TariffsApiServiceImpl();

    public static TariffsApiService getTariffsApi() {
        return service;
    }
}
