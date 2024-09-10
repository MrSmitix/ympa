package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiLockedErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import java.util.Date;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.FeedIndexLogsStatusType;
import org.openapitools.model.GetFeedIndexLogsResponse;
import org.openapitools.model.GetFeedResponse;
import org.openapitools.model.GetFeedsResponse;
import org.openapitools.model.SetFeedParamsRequest;

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
@Path("/campaigns/{campaignId}/feeds")
@Api(value = "/", description = "")
public interface FeedsApi  {

    /**
     * Информация о прайс-листе
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     */
    @GET
    @Path("/{feedId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Информация о прайс-листе", tags={ "feeds", "dbs", "fbs", "express", "fby" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Информация о прайс-листе.", response = GetFeedResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public GetFeedResponse getFeed(@PathParam("campaignId") Long campaignId, @PathParam("feedId") Long feedId);

    /**
     * Отчет по индексации прайс-листа
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра &#x60;generationId&#x60;.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     */
    @GET
    @Path("/{feedId}/index-logs")
    @Produces({ "application/json" })
    @ApiOperation(value = "Отчет по индексации прайс-листа", tags={ "feeds", "dbs", "fbs", "express", "fby" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Отчет по индексации прайс-листа.", response = GetFeedIndexLogsResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public GetFeedIndexLogsResponse getFeedIndexLogs(@PathParam("campaignId") Long campaignId, @PathParam("feedId") Long feedId, @QueryParam("limit") Integer limit, @QueryParam("published_time_from") Date publishedTimeFrom, @QueryParam("published_time_to") Date publishedTimeTo, @QueryParam("status") FeedIndexLogsStatusType status);

    /**
     * Список прайс-листов магазина
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Список прайс-листов магазина", tags={ "feeds", "dbs", "fbs", "express", "fby" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Список прайс-листов.", response = GetFeedsResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public GetFeedsResponse getFeeds(@PathParam("campaignId") Long campaignId);

    /**
     * Сообщить, что прайс-лист обновился
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом &#x60;POST campaigns/{campaignId}/feeds/{feedId}/refresh&#x60;. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — &#x60;200 OK&#x60;. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
     *
     */
    @POST
    @Path("/{feedId}/refresh")
    @Produces({ "application/json" })
    @ApiOperation(value = "Сообщить, что прайс-лист обновился", tags={ "feeds", "dbs", "fbs", "express", "fby" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Пустой ответ.", response = EmptyApiResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public EmptyApiResponse refreshFeed(@PathParam("campaignId") Long campaignId, @PathParam("feedId") Long feedId);

    /**
     * Изменение параметров прайс-листа
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;value&#x60; (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;delete&#x3D;true&#x60; (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
     *
     */
    @POST
    @Path("/{feedId}/params")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Изменение параметров прайс-листа", tags={ "feeds", "dbs", "fbs", "express", "fby" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Статус выполнения операции.", response = EmptyApiResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 423, message = "К ресурсу нельзя применить указанный метод.", response = ApiLockedErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public EmptyApiResponse setFeedParams(@PathParam("campaignId") Long campaignId, @PathParam("feedId") Long feedId, @Valid @NotNull SetFeedParamsRequest setFeedParamsRequest);
}
