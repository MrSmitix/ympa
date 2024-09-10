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

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Партнерский API Маркета
 *
 * <p>API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 */
@Path("/campaigns")
@Api(value = "/", description = "")
public interface CampaignsApi  {

    /**
     * Информация о магазине
     *
     * Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     */
    @GET
    @Path("/{campaignId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Информация о магазине", tags={ "campaigns", "dbs", "express", "fbs", "fby" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Информация о магазине.", response = GetCampaignResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public GetCampaignResponse getCampaign(@PathParam("campaignId") Long campaignId);

    /**
     * Логины, связанные с магазином
     *
     * Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     */
    @GET
    @Path("/{campaignId}/logins")
    @Produces({ "application/json" })
    @ApiOperation(value = "Логины, связанные с магазином", tags={ "campaigns", "dbs", "express", "fbs", "fby" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Список логинов, связанных с магазином.", response = GetCampaignLoginsResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public GetCampaignLoginsResponse getCampaignLogins(@PathParam("campaignId") Long campaignId);

    /**
     * Регион магазина
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
     *
     */
    @GET
    @Path("/{campaignId}/region")
    @Produces({ "application/json" })
    @ApiOperation(value = "Регион магазина", tags={ "campaigns", "dbs", "fby", "fbs", "express" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Возвращает регион, в котором находится магазин.  |**⚙️ Лимит:** 1000 запросов в час| |-| ", response = GetCampaignRegionResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public GetCampaignRegionResponse getCampaignRegion(@PathParam("campaignId") Long campaignId);

    /**
     * Настройки магазина
     *
     * Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     */
    @GET
    @Path("/{campaignId}/settings")
    @Produces({ "application/json" })
    @ApiOperation(value = "Настройки магазина", tags={ "campaigns", "dbs", "fbs", "express", "fby" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Настройки магазина.", response = GetCampaignSettingsResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public GetCampaignSettingsResponse getCampaignSettings(@PathParam("campaignId") Long campaignId);

    /**
     * Список магазинов пользователя
     *
     * Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Список магазинов пользователя", tags={ "campaigns", "dbs", "express", "fbs", "fby" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Магазины пользователя.", response = GetCampaignsResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public GetCampaignsResponse getCampaigns(@QueryParam("page") @Max(10000) @DefaultValue("1") Integer page, @QueryParam("pageSize") Integer pageSize);

    /**
     * Магазины, доступные логину
     *
     * Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     */
    @GET
    @Path("/by_login/{login}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Магазины, доступные логину", tags={ "campaigns", "dbs", "express", "fbs", "fby" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Информация о магазинах.", response = GetCampaignsResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public GetCampaignsResponse getCampaignsByLogin(@PathParam("login") String login, @QueryParam("page") @Max(10000) @DefaultValue("1") Integer page, @QueryParam("pageSize") Integer pageSize);
}
