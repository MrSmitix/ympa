package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.GetQualityRatingDetailsResponse;
import org.openapitools.server.model.GetQualityRatingRequest;
import org.openapitools.server.model.GetQualityRatingResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Ratings'",
                             version = "7.8.0")
public interface RatingsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/campaigns/{campaignId}/ratings/quality/details", this::getQualityRatingDetails);
        rules.post("/businesses/{businessId}/ratings/quality", this::getQualityRatings);
    }


    /**
     * POST /campaigns/{campaignId}/ratings/quality/details : Заказы, которые повлияли на индекс качества.
     *
     * @param request the server request
     * @param response the server response
     */
    void getQualityRatingDetails(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/ratings/quality : Индекс качества магазинов.
     *
     * @param request the server request
     * @param response the server response
     */
    void getQualityRatings(ServerRequest request, ServerResponse response);
}
