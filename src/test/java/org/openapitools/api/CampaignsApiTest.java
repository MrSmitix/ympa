/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.api;

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
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.fasterxml.jackson.jaxrs.xml.JacksonXMLProvider;
import org.apache.cxf.jaxrs.provider.MultipartProvider;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Партнерский API Маркета
 *
 * <p>API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API tests for CampaignsApi.
 */
public class CampaignsApiTest {

    private CampaignsApi api;

    @Before
    public void setup() {
        List<?> providers = Arrays.asList(new JacksonJsonProvider(), new JacksonXMLProvider(), new MultipartProvider());

        api = JAXRSClientFactory.create("https://api.partner.market.yandex.ru", CampaignsApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    
    /**
     * Информация о магазине
     *
     * Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void getCampaignTest() throws Exception {
        // TODO: assign appropriate parameter values
        Long campaignId = null;

        // TODO: delete this line and uncomment the next
        // GetCampaignResponse response = api.getCampaign(campaignId);
        // TODO: complete test assertions
    }
    
    /**
     * Логины, связанные с магазином
     *
     * Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void getCampaignLoginsTest() throws Exception {
        // TODO: assign appropriate parameter values
        Long campaignId = null;

        // TODO: delete this line and uncomment the next
        // GetCampaignLoginsResponse response = api.getCampaignLogins(campaignId);
        // TODO: complete test assertions
    }
    
    /**
     * Регион магазина
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void getCampaignRegionTest() throws Exception {
        // TODO: assign appropriate parameter values
        Long campaignId = null;

        // TODO: delete this line and uncomment the next
        // GetCampaignRegionResponse response = api.getCampaignRegion(campaignId);
        // TODO: complete test assertions
    }
    
    /**
     * Настройки магазина
     *
     * Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void getCampaignSettingsTest() throws Exception {
        // TODO: assign appropriate parameter values
        Long campaignId = null;

        // TODO: delete this line and uncomment the next
        // GetCampaignSettingsResponse response = api.getCampaignSettings(campaignId);
        // TODO: complete test assertions
    }
    
    /**
     * Список магазинов пользователя
     *
     * Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void getCampaignsTest() throws Exception {
        // TODO: assign appropriate parameter values
        Integer page = null;
        Integer pageSize = null;

        // TODO: delete this line and uncomment the next
        // GetCampaignsResponse response = api.getCampaigns(page, pageSize);
        // TODO: complete test assertions
    }
    
    /**
     * Магазины, доступные логину
     *
     * Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void getCampaignsByLoginTest() throws Exception {
        // TODO: assign appropriate parameter values
        String login = null;
        Integer page = null;
        Integer pageSize = null;

        // TODO: delete this line and uncomment the next
        // GetCampaignsResponse response = api.getCampaignsByLogin(login, page, pageSize);
        // TODO: complete test assertions
    }
    
}
