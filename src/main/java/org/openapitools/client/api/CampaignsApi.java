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

package org.openapitools.client.api;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import org.openapitools.client.model.ApiClientDataErrorResponse;
import org.openapitools.client.model.ApiForbiddenErrorResponse;
import org.openapitools.client.model.ApiLimitErrorResponse;
import org.openapitools.client.model.ApiNotFoundErrorResponse;
import org.openapitools.client.model.ApiServerErrorResponse;
import org.openapitools.client.model.ApiUnauthorizedErrorResponse;
import org.openapitools.client.model.GetCampaignLoginsResponse;
import org.openapitools.client.model.GetCampaignRegionResponse;
import org.openapitools.client.model.GetCampaignResponse;
import org.openapitools.client.model.GetCampaignSettingsResponse;
import org.openapitools.client.model.GetCampaignsResponse;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Партнерский API Маркета
 *
 * <p>API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 */
@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("/campaigns")
public interface CampaignsApi  {

    /**
     * Информация о магазине
     * Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @GET
    @Path("/{campaignId}")
    @Produces({ "application/json" })
    GetCampaignResponse getCampaign(@PathParam("campaignId") Long campaignId) throws ApiException, ProcessingException;

    /**
     * Логины, связанные с магазином
     * Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @GET
    @Path("/{campaignId}/logins")
    @Produces({ "application/json" })
    GetCampaignLoginsResponse getCampaignLogins(@PathParam("campaignId") Long campaignId) throws ApiException, ProcessingException;

    /**
     * Регион магазина
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
     * @deprecated
     */
    @Deprecated
    @GET
    @Path("/{campaignId}/region")
    @Produces({ "application/json" })
    GetCampaignRegionResponse getCampaignRegion(@PathParam("campaignId") Long campaignId) throws ApiException, ProcessingException;

    /**
     * Настройки магазина
     * Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @GET
    @Path("/{campaignId}/settings")
    @Produces({ "application/json" })
    GetCampaignSettingsResponse getCampaignSettings(@PathParam("campaignId") Long campaignId) throws ApiException, ProcessingException;

    /**
     * Список магазинов пользователя
     * Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @GET
    
    @Produces({ "application/json" })
    GetCampaignsResponse getCampaigns(@QueryParam("page") @DefaultValue("1") Integer page, @QueryParam("pageSize") Integer pageSize) throws ApiException, ProcessingException;

    /**
     * Магазины, доступные логину
     * Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @GET
    @Path("/by_login/{login}")
    @Produces({ "application/json" })
    GetCampaignsResponse getCampaignsByLogin(@PathParam("login") String login, @QueryParam("page") @DefaultValue("1") Integer page, @QueryParam("pageSize") Integer pageSize) throws ApiException, ProcessingException;
}