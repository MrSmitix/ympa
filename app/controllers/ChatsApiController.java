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

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ChatsApiController extends Controller {
    private final ChatsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ChatsApiController(Config configuration, ChatsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createChat(Http.Request request, Long businessId) throws Exception {
        JsonNode nodecreateChatRequest = request.body().asJson();
        CreateChatRequest createChatRequest;
        if (nodecreateChatRequest != null) {
            createChatRequest = mapper.readValue(nodecreateChatRequest.toString(), CreateChatRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createChatRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateChatRequest' parameter is required");
        }
        return imp.createChatHttp(request, businessId, createChatRequest);
    }

    @ApiAction
    public Result getChatHistory(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetChatHistoryRequest = request.body().asJson();
        GetChatHistoryRequest getChatHistoryRequest;
        if (nodegetChatHistoryRequest != null) {
            getChatHistoryRequest = mapper.readValue(nodegetChatHistoryRequest.toString(), GetChatHistoryRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getChatHistoryRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetChatHistoryRequest' parameter is required");
        }
        String valuechatId = request.getQueryString("chatId");
        Long chatId;
        if (valuechatId != null) {
            chatId = Long.parseLong(valuechatId);
        } else {
            throw new IllegalArgumentException("'chatId' parameter is required");
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getChatHistoryHttp(request, businessId, chatId, getChatHistoryRequest, pageToken, limit);
    }

    @ApiAction
    public Result getChats(Http.Request request, Long businessId) throws Exception {
        JsonNode nodegetChatsRequest = request.body().asJson();
        GetChatsRequest getChatsRequest;
        if (nodegetChatsRequest != null) {
            getChatsRequest = mapper.readValue(nodegetChatsRequest.toString(), GetChatsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(getChatsRequest);
            }
        } else {
            throw new IllegalArgumentException("'GetChatsRequest' parameter is required");
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getChatsHttp(request, businessId, getChatsRequest, pageToken, limit);
    }

    @ApiAction
    public Result sendFileToChat(Http.Request request, Long businessId) throws Exception {
        String valuechatId = request.getQueryString("chatId");
        Long chatId;
        if (valuechatId != null) {
            chatId = Long.parseLong(valuechatId);
        } else {
            throw new IllegalArgumentException("'chatId' parameter is required");
        }
        Http.MultipartFormData<TemporaryFile> body_file = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> _file = body_file.getFile("file");
        if ((_file == null || _file.getFileSize() == 0)) {
            throw new IllegalArgumentException("'file' file cannot be empty");
        }
        return imp.sendFileToChatHttp(request, businessId, chatId, _file);
    }

    @ApiAction
    public Result sendMessageToChat(Http.Request request, Long businessId) throws Exception {
        JsonNode nodesendMessageToChatRequest = request.body().asJson();
        SendMessageToChatRequest sendMessageToChatRequest;
        if (nodesendMessageToChatRequest != null) {
            sendMessageToChatRequest = mapper.readValue(nodesendMessageToChatRequest.toString(), SendMessageToChatRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(sendMessageToChatRequest);
            }
        } else {
            throw new IllegalArgumentException("'SendMessageToChatRequest' parameter is required");
        }
        String valuechatId = request.getQueryString("chatId");
        Long chatId;
        if (valuechatId != null) {
            chatId = Long.parseLong(valuechatId);
        } else {
            throw new IllegalArgumentException("'chatId' parameter is required");
        }
        return imp.sendMessageToChatHttp(request, businessId, chatId, sendMessageToChatRequest);
    }

}
