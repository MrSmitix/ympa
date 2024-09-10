package org.openapitools.controller;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import io.micronaut.http.multipart.CompletedFileUpload;
import org.openapitools.model.CreateChatRequest;
import org.openapitools.model.CreateChatResponse;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.GetChatHistoryRequest;
import org.openapitools.model.GetChatHistoryResponse;
import org.openapitools.model.GetChatsRequest;
import org.openapitools.model.GetChatsResponse;
import org.openapitools.model.SendMessageToChatRequest;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for ChatsController
 */
@MicronautTest
public class ChatsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    ChatsController controller;

    /**
     * This test is used to validate the implementation of createChat() method
     *
     * The method should: Создание нового чата с покупателем
     *
     * Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createChatMethodTest() {
        // given
        Long businessId = 56L;
        CreateChatRequest createChatRequest = new CreateChatRequest(56L);

        // when
        CreateChatResponse result = controller.createChat(businessId, createChatRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/chats/new' to the features of createChat() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createChatClientApiTest() throws IOException {
        // given
        CreateChatRequest body = new CreateChatRequest(56L);
        String uri = UriTemplate.of("/businesses/{businessId}/chats/new").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@4518ba8c");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CreateChatResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getChatHistory() method
     *
     * The method should: Получение истории сообщений в чате
     *
     * Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getChatHistoryMethodTest() {
        // given
        Long businessId = 56L;
        Long chatId = 56L;
        GetChatHistoryRequest getChatHistoryRequest = new GetChatHistoryRequest();
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetChatHistoryResponse result = controller.getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/chats/history' to the features of getChatHistory() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getChatHistoryClientApiTest() throws IOException {
        // given
        GetChatHistoryRequest body = new GetChatHistoryRequest();
        String uri = UriTemplate.of("/businesses/{businessId}/chats/history").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@3796062b");
        request.getParameters()
            .add("chatId", String.valueOf(56L)) // The query parameter format should be 
            .add("page_token", "eyBuZXh0SWQ6IDIzNDIgfQ==") // The query parameter format should be 
            .add("limit", String.valueOf(20)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetChatHistoryResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getChats() method
     *
     * The method should: Получение доступных чатов
     *
     * Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getChatsMethodTest() {
        // given
        Long businessId = 56L;
        GetChatsRequest getChatsRequest = new GetChatsRequest();
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetChatsResponse result = controller.getChats(businessId, getChatsRequest, pageToken, limit).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/chats' to the features of getChats() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getChatsClientApiTest() throws IOException {
        // given
        GetChatsRequest body = new GetChatsRequest();
        String uri = UriTemplate.of("/businesses/{businessId}/chats").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@375a068f");
        request.getParameters()
            .add("page_token", "eyBuZXh0SWQ6IDIzNDIgfQ==") // The query parameter format should be 
            .add("limit", String.valueOf(20)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetChatsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of sendFileToChat() method
     *
     * The method should: Отправка файла в чат
     *
     * Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void sendFileToChatMethodTest() {
        // given
        Long businessId = 56L;
        Long chatId = 56L;
        CompletedFileUpload _file = null;

        // when
        EmptyApiResponse result = controller.sendFileToChat(businessId, chatId, _file).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/chats/file/send' to the features of sendFileToChat() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void sendFileToChatClientApiTest() throws IOException {
        // given
        Map<String, Object> form = new HashMap<String, Object>(){{
            // Fill in the body form parameters
            put("file", new FileReader(File.createTempFile("test", ".tmp")));
        }};
        String uri = UriTemplate.of("/businesses/{businessId}/chats/file/send").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("[Ljava.lang.String;@481beb8b");
        request.getParameters()
            .add("chatId", String.valueOf(56L)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EmptyApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of sendMessageToChat() method
     *
     * The method should: Отправка сообщения в чат
     *
     * Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void sendMessageToChatMethodTest() {
        // given
        Long businessId = 56L;
        Long chatId = 56L;
        SendMessageToChatRequest sendMessageToChatRequest = new SendMessageToChatRequest("example");

        // when
        EmptyApiResponse result = controller.sendMessageToChat(businessId, chatId, sendMessageToChatRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/chats/message' to the features of sendMessageToChat() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void sendMessageToChatClientApiTest() throws IOException {
        // given
        SendMessageToChatRequest body = new SendMessageToChatRequest("example");
        String uri = UriTemplate.of("/businesses/{businessId}/chats/message").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@24406d54");
        request.getParameters()
            .add("chatId", String.valueOf(56L)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EmptyApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
