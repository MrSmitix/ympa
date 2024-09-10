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

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ChatsApiControllerImp extends ChatsApiControllerImpInterface {
    @Override
    public CreateChatResponse createChat(Http.Request request, Long businessId, CreateChatRequest createChatRequest) throws Exception {
        //Do your magic!!!
        return new CreateChatResponse();
    }

    @Override
    public GetChatHistoryResponse getChatHistory(Http.Request request, Long businessId, @NotNull Long chatId, GetChatHistoryRequest getChatHistoryRequest, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new GetChatHistoryResponse();
    }

    @Override
    public GetChatsResponse getChats(Http.Request request, Long businessId, GetChatsRequest getChatsRequest, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new GetChatsResponse();
    }

    @Override
    public EmptyApiResponse sendFileToChat(Http.Request request, Long businessId, @NotNull Long chatId, Http.MultipartFormData.FilePart<TemporaryFile> _file) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public EmptyApiResponse sendMessageToChat(Http.Request request, Long businessId, @NotNull Long chatId, SendMessageToChatRequest sendMessageToChatRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

}
