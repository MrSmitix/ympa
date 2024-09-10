package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.GetBusinessBuyerInfoResponse;
import org.openapitools.server.model.GetBusinessDocumentsInfoResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'OrderBusinessInformation'",
                             version = "7.8.0")
public interface OrderBusinessInformationService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/business-buyer", this::getOrderBusinessBuyerInfo);
        rules.post("/documents", this::getOrderBusinessDocumentsInfo);
    }


    /**
     * POST /campaigns/{campaignId}/orders/{orderId}/business-buyer : Информация о покупателе — юридическом лице.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOrderBusinessBuyerInfo(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/orders/{orderId}/documents : Информация о документах.
     *
     * @param request the server request
     * @param response the server response
     */
    void getOrderBusinessDocumentsInfo(ServerRequest request, ServerResponse response);
}
