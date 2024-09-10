package org.openapitools.api.factories;

import org.openapitools.api.ReportsApiService;
import org.openapitools.api.impl.ReportsApiServiceImpl;

public class ReportsApiServiceFactory {
    private static final ReportsApiService service = new ReportsApiServiceImpl();

    public static ReportsApiService getReportsApi() {
        return service;
    }
}
