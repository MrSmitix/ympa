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

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Партнерский API Маркета
 *
 * <p>API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API tests for CampaignsApi
 */
public class CampaignsApiTest {


    private CampaignsApi api;

    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        api = JAXRSClientFactory.create("https://api.partner.market.yandex.ru", CampaignsApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    
    /**
     * Информация о магазине
     *
     * Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCampaignTest() {
        Long campaignId = null;
        //GetCampaignResponse response = api.getCampaign(campaignId);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * Логины, связанные с магазином
     *
     * Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCampaignLoginsTest() {
        Long campaignId = null;
        //GetCampaignLoginsResponse response = api.getCampaignLogins(campaignId);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * Регион магазина
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCampaignRegionTest() {
        Long campaignId = null;
        //GetCampaignRegionResponse response = api.getCampaignRegion(campaignId);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * Настройки магазина
     *
     * Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCampaignSettingsTest() {
        Long campaignId = null;
        //GetCampaignSettingsResponse response = api.getCampaignSettings(campaignId);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * Список магазинов пользователя
     *
     * Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCampaignsTest() {
        Integer page = null;
        Integer pageSize = null;
        //GetCampaignsResponse response = api.getCampaigns(page, pageSize);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * Магазины, доступные логину
     *
     * Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCampaignsByLoginTest() {
        String login = null;
        Integer page = null;
        Integer pageSize = null;
        //GetCampaignsResponse response = api.getCampaignsByLogin(login, page, pageSize);
        //assertNotNull(response);
        // TODO: test validations


    }
    
}
