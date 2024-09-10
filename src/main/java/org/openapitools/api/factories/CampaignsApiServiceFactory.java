package org.openapitools.api.factories;

import org.openapitools.api.CampaignsApiService;
import org.openapitools.api.impl.CampaignsApiServiceImpl;

public class CampaignsApiServiceFactory {
    private static final CampaignsApiService service = new CampaignsApiServiceImpl();

    public static CampaignsApiService getCampaignsApi() {
        return service;
    }
}
