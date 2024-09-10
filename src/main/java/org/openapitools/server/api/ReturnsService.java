package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import java.util.stream.Collectors;
import org.openapitools.server.model.EmptyApiResponse;
import java.io.File;
import org.openapitools.server.model.GetReturnResponse;
import org.openapitools.server.model.GetReturnsResponse;
import java.util.HexFormat;
import java.util.List;
import java.time.LocalDate;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.RefundStatusType;
import org.openapitools.server.model.ReturnType;
import org.openapitools.server.model.SetReturnDecisionRequest;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Returns'",
                             version = "7.8.0")
public interface ReturnsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/orders/{orderId}/returns/{returnId}", this::getReturn);
        rules.get("/orders/{orderId}/returns/{returnId}/application", this::getReturnApplication);
        rules.get("/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}", this::getReturnPhoto);
        rules.get("/returns", this::getReturns);
        rules.post("/orders/{orderId}/returns/{returnId}/decision", this::setReturnDecision);
        rules.post("/orders/{orderId}/returns/{returnId}/decision/submit", this::submitReturnDecision);
    }


    /**
     * GET /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} : Информация о невыкупе или возврате.
     *
     * @param request the server request
     * @param response the server response
     */
    void getReturn(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application : Получение заявления на возврат.
     *
     * @param request the server request
     * @param response the server response
     */
    void getReturnApplication(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} : Получение фотографии возврата.
     *
     * @param request the server request
     * @param response the server response
     */
    void getReturnPhoto(ServerRequest request, ServerResponse response);
    /**
     * GET /campaigns/{campaignId}/returns : Список невыкупов и возвратов.
     *
     * @param request the server request
     * @param response the server response
     */
    void getReturns(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision : Принятие или изменение решения по возврату.
     *
     * @param request the server request
     * @param response the server response
     */
    void setReturnDecision(ServerRequest request, ServerResponse response);
    /**
     * POST /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit : Подтверждение решения по возврату.
     *
     * @param request the server request
     * @param response the server response
     */
    void submitReturnDecision(ServerRequest request, ServerResponse response);
}
