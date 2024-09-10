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
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class GoodsFeedbackServiceImpl implements GoodsFeedbackService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void deleteGoodsFeedbackComment(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getGoodsFeedbackComments(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getGoodsFeedbacks(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void skipGoodsFeedbacksReaction(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void updateGoodsFeedbackComment(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service GoodsFeedbackService is down. Goodbye!");
    }

}
