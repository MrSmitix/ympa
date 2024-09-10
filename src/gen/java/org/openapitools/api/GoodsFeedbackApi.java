package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.DeleteGoodsFeedbackCommentRequest;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.GetGoodsFeedbackCommentsRequest;
import org.openapitools.model.GetGoodsFeedbackCommentsResponse;
import org.openapitools.model.GetGoodsFeedbackRequest;
import org.openapitools.model.GetGoodsFeedbackResponse;
import org.openapitools.model.SkipGoodsFeedbackReactionRequest;
import org.openapitools.model.UpdateGoodsFeedbackCommentRequest;
import org.openapitools.model.UpdateGoodsFeedbackCommentResponse;

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

/**
 * Партнерский API Маркета
 *
 * <p>API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 */
@Path("/businesses/{businessId}/goods-feedback")
@Api(value = "/", description = "")
public interface GoodsFeedbackApi  {

    /**
     * Удаление комментария к отзыву
     *
     * Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     */
    @POST
    @Path("/comments/delete")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Удаление комментария к отзыву", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Пустой ответ.", response = EmptyApiResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public EmptyApiResponse deleteGoodsFeedbackComment(@PathParam("businessId") Long businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest);

    /**
     * Получение комментариев к отзыву
     *
     * Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     */
    @POST
    @Path("/comments")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Получение комментариев к отзыву", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Дерево комментариев к отзыву.", response = GetGoodsFeedbackCommentsResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public GetGoodsFeedbackCommentsResponse getGoodsFeedbackComments(@PathParam("businessId") Long businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, @QueryParam("page_token") String pageToken, @QueryParam("limit") Integer limit);

    /**
     * Получение отзывов о товарах продавца
     *
     * Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Получение отзывов о товарах продавца", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Список отзывов.", response = GetGoodsFeedbackResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public GetGoodsFeedbackResponse getGoodsFeedbacks(@PathParam("businessId") Long businessId, @QueryParam("page_token") String pageToken, @QueryParam("limit") Integer limit, GetGoodsFeedbackRequest getGoodsFeedbackRequest);

    /**
     * Отказ от ответа на отзывы
     *
     * Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     */
    @POST
    @Path("/skip-reaction")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Отказ от ответа на отзывы", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Пустой ответ.", response = EmptyApiResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public EmptyApiResponse skipGoodsFeedbacksReaction(@PathParam("businessId") Long businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest);

    /**
     * Добавление нового или изменение созданного комментария
     *
     * Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва &#x60;feedbackId&#x60;.  Чтобы добавить комментарий к другому комментарию, передайте:  * &#x60;feedbackId&#x60; — идентификатор отзыва; * &#x60;comment.parentId&#x60; — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * &#x60;feedbackId&#x60;— идентификатор отзыва; * &#x60;comment.id&#x60; — идентификатор комментария, который нужно изменить.  Если передать одновременно &#x60;comment.parentId&#x60; и &#x60;comment.id&#x60;, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     */
    @POST
    @Path("/comments/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Добавление нового или изменение созданного комментария", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Информация о добавленном или измененном комментарии.", response = UpdateGoodsFeedbackCommentResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public UpdateGoodsFeedbackCommentResponse updateGoodsFeedbackComment(@PathParam("businessId") Long businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest);
}
