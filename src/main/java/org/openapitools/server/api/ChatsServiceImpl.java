package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.CreateChatRequest;
import org.openapitools.server.model.CreateChatResponse;
import org.openapitools.server.model.EmptyApiResponse;
import java.io.File;
import org.openapitools.server.model.GetChatHistoryRequest;
import org.openapitools.server.model.GetChatHistoryResponse;
import org.openapitools.server.model.GetChatsRequest;
import org.openapitools.server.model.GetChatsResponse;
import java.util.HexFormat;
import java.util.Map;
import io.helidon.http.media.multipart.MultiPart;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.common.parameters.Parameters;
import io.helidon.http.media.multipart.ReadablePart;
import org.openapitools.server.model.SendMessageToChatRequest;
import io.helidon.http.Status;
import io.helidon.common.mapper.Value;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class ChatsServiceImpl implements ChatsService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void createChat(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getChatHistory(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getChats(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void sendFileToChat(ServerRequest request, ServerResponse response) {
        MultiPart multiPart = request.content().as(MultiPart.class);
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void sendMessageToChat(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service ChatsService is down. Goodbye!");
    }

}
