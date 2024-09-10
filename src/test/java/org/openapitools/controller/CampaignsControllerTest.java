package org.openapitools.controller;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GetCampaignLoginsResponse;
import org.openapitools.model.GetCampaignRegionResponse;
import org.openapitools.model.GetCampaignResponse;
import org.openapitools.model.GetCampaignSettingsResponse;
import org.openapitools.model.GetCampaignsResponse;
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
 * API tests for CampaignsController
 */
@MicronautTest
public class CampaignsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    CampaignsController controller;

    /**
     * This test is used to validate the implementation of getCampaign() method
     *
     * The method should: Информация о магазине
     *
     * Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getCampaignMethodTest() {
        // given
        Long campaignId = 56L;

        // when
        GetCampaignResponse result = controller.getCampaign(campaignId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}' to the features of getCampaign() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getCampaignClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@b106842");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetCampaignResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getCampaignLogins() method
     *
     * The method should: Логины, связанные с магазином
     *
     * Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getCampaignLoginsMethodTest() {
        // given
        Long campaignId = 56L;

        // when
        GetCampaignLoginsResponse result = controller.getCampaignLogins(campaignId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/logins' to the features of getCampaignLogins() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getCampaignLoginsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/logins").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@29c808c8");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetCampaignLoginsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getCampaignRegion() method
     *
     * The method should: Регион магазина
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getCampaignRegionMethodTest() {
        // given
        Long campaignId = 56L;

        // when
        GetCampaignRegionResponse result = controller.getCampaignRegion(campaignId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/region' to the features of getCampaignRegion() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getCampaignRegionClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/region").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@6916566d");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetCampaignRegionResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getCampaignSettings() method
     *
     * The method should: Настройки магазина
     *
     * Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getCampaignSettingsMethodTest() {
        // given
        Long campaignId = 56L;

        // when
        GetCampaignSettingsResponse result = controller.getCampaignSettings(campaignId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/settings' to the features of getCampaignSettings() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getCampaignSettingsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/settings").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@614c7175");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetCampaignSettingsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getCampaigns() method
     *
     * The method should: Список магазинов пользователя
     *
     * Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getCampaignsMethodTest() {
        // given
        Integer page = 1;
        Integer pageSize = 56;

        // when
        GetCampaignsResponse result = controller.getCampaigns(page, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns' to the features of getCampaigns() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getCampaignsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@82bbbdc");
        request.getParameters()
            .add("page", String.valueOf(1)) // The query parameter format should be 
            .add("pageSize", String.valueOf(56)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetCampaignsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getCampaignsByLogin() method
     *
     * The method should: Магазины, доступные логину
     *
     * Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getCampaignsByLoginMethodTest() {
        // given
        String login = "example";
        Integer page = 1;
        Integer pageSize = 56;

        // when
        GetCampaignsResponse result = controller.getCampaignsByLogin(login, page, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/by_login/{login}' to the features of getCampaignsByLogin() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getCampaignsByLoginClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/by_login/{login}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("login", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@74f47eab");
        request.getParameters()
            .add("page", String.valueOf(1)) // The query parameter format should be 
            .add("pageSize", String.valueOf(56)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetCampaignsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
