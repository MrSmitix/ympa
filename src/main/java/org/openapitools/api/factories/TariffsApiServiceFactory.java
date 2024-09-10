package org.openapitools.api.factories;

import org.openapitools.api.TariffsApiService;
import org.openapitools.api.impl.TariffsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TariffsApiServiceFactory {
    private static final TariffsApiService service = new TariffsApiServiceImpl();

    public static TariffsApiService getTariffsApi() {
        return service;
    }
}
