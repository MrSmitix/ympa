package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiLockedErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.EmptyApiResponse;
import org.openapitools.server.model.FeedIndexLogsStatusType;
import org.openapitools.server.model.GetFeedIndexLogsResponse;
import org.openapitools.server.model.GetFeedResponse;
import org.openapitools.server.model.GetFeedsResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.server.model.SetFeedParamsRequest;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Feeds'",
                             version = "7.8.0")
public interface FeedsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/{feedId}", this::getFeed);
        rules.get("/{feedId}/index-logs", this::getFeedIndexLogs);
        rules.get("/", this::getFeeds);
        rules.post("/{feedId}/refresh", this::refreshFeed);
        rules.post("/{feedId}/params", this::setFeedParams);
    }


    /**
     * GET /campaigns/{campaignId}/feeds/{feedId} : Информация о прайс-листе.
     *
     * @param request the server request
     * @param response the server response
     */
    void getFeed(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/feeds/{feedId}/index-logs : Отчет по индексации прайс-листа.
     *
     * @param request the server request
     * @param response the server response
     */
    void getFeedIndexLogs(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/feeds : Список прайс-листов магазина.
     *
     * @param request the server request
     * @param response the server response
     */
    void getFeeds(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/feeds/{feedId}/refresh : Сообщить, что прайс-лист обновился.
     *
     * @param request the server request
     * @param response the server response
     */
    void refreshFeed(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/feeds/{feedId}/params : Изменение параметров прайс-листа.
     *
     * @param request the server request
     * @param response the server response
     */
    void setFeedParams(ServerRequest request, ServerResponse response);
}
