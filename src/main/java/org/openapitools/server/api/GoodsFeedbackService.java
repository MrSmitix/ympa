package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.DeleteGoodsFeedbackCommentRequest;
import org.openapitools.server.model.EmptyApiResponse;
import org.openapitools.server.model.GetGoodsFeedbackCommentsRequest;
import org.openapitools.server.model.GetGoodsFeedbackCommentsResponse;
import org.openapitools.server.model.GetGoodsFeedbackRequest;
import org.openapitools.server.model.GetGoodsFeedbackResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.SkipGoodsFeedbackReactionRequest;
import io.helidon.http.Status;
import org.openapitools.server.model.UpdateGoodsFeedbackCommentRequest;
import org.openapitools.server.model.UpdateGoodsFeedbackCommentResponse;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'GoodsFeedback'",
                             version = "7.8.0")
public interface GoodsFeedbackService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/comments/delete", this::deleteGoodsFeedbackComment);
        rules.post("/comments", this::getGoodsFeedbackComments);
        rules.post("/", this::getGoodsFeedbacks);
        rules.post("/skip-reaction", this::skipGoodsFeedbacksReaction);
        rules.post("/comments/update", this::updateGoodsFeedbackComment);
    }


    /**
     * POST /businesses/{businessId}/goods-feedback/comments/delete : Удаление комментария к отзыву.
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteGoodsFeedbackComment(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/goods-feedback/comments : Получение комментариев к отзыву.
     *
     * @param request the server request
     * @param response the server response
     */
    void getGoodsFeedbackComments(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/goods-feedback : Получение отзывов о товарах продавца.
     *
     * @param request the server request
     * @param response the server response
     */
    void getGoodsFeedbacks(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/goods-feedback/skip-reaction : Отказ от ответа на отзывы.
     *
     * @param request the server request
     * @param response the server response
     */
    void skipGoodsFeedbacksReaction(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/goods-feedback/comments/update : Добавление нового или изменение созданного комментария.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateGoodsFeedbackComment(ServerRequest request, ServerResponse response);
}
