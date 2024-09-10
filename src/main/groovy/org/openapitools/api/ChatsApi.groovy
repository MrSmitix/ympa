package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.CreateChatRequest
import org.openapitools.model.CreateChatResponse
import org.openapitools.model.EmptyApiResponse
import org.openapitools.model.GetChatHistoryRequest
import org.openapitools.model.GetChatHistoryResponse
import org.openapitools.model.GetChatsRequest
import org.openapitools.model.GetChatsResponse
import org.openapitools.model.SendMessageToChatRequest

class ChatsApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createChat ( Long businessId, CreateChatRequest createChatRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/chats/new"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (createChatRequest == null) {
            throw new RuntimeException("missing required params createChatRequest")
        }



        contentType = 'application/json';
        bodyParams = createChatRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CreateChatResponse.class )

    }

    def getChatHistory ( Long businessId, Long chatId, GetChatHistoryRequest getChatHistoryRequest, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/chats/history"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (chatId == null) {
            throw new RuntimeException("missing required params chatId")
        }
        // verify required params are set
        if (getChatHistoryRequest == null) {
            throw new RuntimeException("missing required params getChatHistoryRequest")
        }

        if (chatId != null) {
            queryParams.put("chatId", chatId)
        }
        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getChatHistoryRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetChatHistoryResponse.class )

    }

    def getChats ( Long businessId, GetChatsRequest getChatsRequest, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/chats"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (getChatsRequest == null) {
            throw new RuntimeException("missing required params getChatsRequest")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getChatsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetChatsResponse.class )

    }

    def sendFileToChat ( Long businessId, Long chatId, File _file, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/chats/file/send"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (chatId == null) {
            throw new RuntimeException("missing required params chatId")
        }
        // verify required params are set
        if (_file == null) {
            throw new RuntimeException("missing required params _file")
        }

        if (chatId != null) {
            queryParams.put("chatId", chatId)
        }



        contentType = 'multipart/form-data';
        bodyParams = _file

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def sendMessageToChat ( Long businessId, Long chatId, SendMessageToChatRequest sendMessageToChatRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/chats/message"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (chatId == null) {
            throw new RuntimeException("missing required params chatId")
        }
        // verify required params are set
        if (sendMessageToChatRequest == null) {
            throw new RuntimeException("missing required params sendMessageToChatRequest")
        }

        if (chatId != null) {
            queryParams.put("chatId", chatId)
        }


        contentType = 'application/json';
        bodyParams = sendMessageToChatRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

}
