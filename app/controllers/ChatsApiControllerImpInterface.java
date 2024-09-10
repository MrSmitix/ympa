package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.CreateChatRequest;
import apimodels.CreateChatResponse;
import apimodels.EmptyApiResponse;
import apimodels.GetChatHistoryRequest;
import apimodels.GetChatHistoryResponse;
import apimodels.GetChatsRequest;
import apimodels.GetChatsResponse;
import java.io.InputStream;
import apimodels.SendMessageToChatRequest;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class ChatsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createChatHttp(Http.Request request, Long businessId, CreateChatRequest createChatRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        CreateChatResponse obj = createChat(request, businessId, createChatRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CreateChatResponse createChat(Http.Request request, Long businessId, CreateChatRequest createChatRequest) throws Exception;

    public Result getChatHistoryHttp(Http.Request request, Long businessId, @NotNull Long chatId, GetChatHistoryRequest getChatHistoryRequest, String pageToken, Integer limit) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetChatHistoryResponse obj = getChatHistory(request, businessId, chatId, getChatHistoryRequest, pageToken, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetChatHistoryResponse getChatHistory(Http.Request request, Long businessId, @NotNull Long chatId, GetChatHistoryRequest getChatHistoryRequest, String pageToken, Integer limit) throws Exception;

    public Result getChatsHttp(Http.Request request, Long businessId, GetChatsRequest getChatsRequest, String pageToken, Integer limit) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetChatsResponse obj = getChats(request, businessId, getChatsRequest, pageToken, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetChatsResponse getChats(Http.Request request, Long businessId, GetChatsRequest getChatsRequest, String pageToken, Integer limit) throws Exception;

    public Result sendFileToChatHttp(Http.Request request, Long businessId, @NotNull Long chatId, Http.MultipartFormData.FilePart<TemporaryFile> _file) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = sendFileToChat(request, businessId, chatId, _file);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse sendFileToChat(Http.Request request, Long businessId, @NotNull Long chatId, Http.MultipartFormData.FilePart<TemporaryFile> _file) throws Exception;

    public Result sendMessageToChatHttp(Http.Request request, Long businessId, @NotNull Long chatId, SendMessageToChatRequest sendMessageToChatRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = sendMessageToChat(request, businessId, chatId, sendMessageToChatRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse sendMessageToChat(Http.Request request, Long businessId, @NotNull Long chatId, SendMessageToChatRequest sendMessageToChatRequest) throws Exception;

}
