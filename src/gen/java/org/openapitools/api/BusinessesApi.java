package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.BusinessesApiService;
import org.openapitools.api.factories.BusinessesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AddOffersToArchiveRequest;
import org.openapitools.model.AddOffersToArchiveResponse;
import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiLockedErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.ConfirmPricesRequest;
import org.openapitools.model.CreateChatRequest;
import org.openapitools.model.CreateChatResponse;
import org.openapitools.model.DeleteGoodsFeedbackCommentRequest;
import org.openapitools.model.DeleteOffersFromArchiveRequest;
import org.openapitools.model.DeleteOffersFromArchiveResponse;
import org.openapitools.model.DeleteOffersRequest;
import org.openapitools.model.DeleteOffersResponse;
import org.openapitools.model.DeletePromoOffersRequest;
import org.openapitools.model.DeletePromoOffersResponse;
import org.openapitools.model.EmptyApiResponse;
import java.io.File;
import org.openapitools.model.GetBidsInfoRequest;
import org.openapitools.model.GetBidsInfoResponse;
import org.openapitools.model.GetBidsRecommendationsRequest;
import org.openapitools.model.GetBidsRecommendationsResponse;
import org.openapitools.model.GetBusinessSettingsResponse;
import org.openapitools.model.GetChatHistoryRequest;
import org.openapitools.model.GetChatHistoryResponse;
import org.openapitools.model.GetChatsRequest;
import org.openapitools.model.GetChatsResponse;
import org.openapitools.model.GetGoodsFeedbackCommentsRequest;
import org.openapitools.model.GetGoodsFeedbackCommentsResponse;
import org.openapitools.model.GetGoodsFeedbackRequest;
import org.openapitools.model.GetGoodsFeedbackResponse;
import org.openapitools.model.GetOfferCardsContentStatusRequest;
import org.openapitools.model.GetOfferCardsContentStatusResponse;
import org.openapitools.model.GetOfferMappingsRequest;
import org.openapitools.model.GetOfferMappingsResponse;
import org.openapitools.model.GetOfferRecommendationsRequest;
import org.openapitools.model.GetOfferRecommendationsResponse;
import org.openapitools.model.GetPromoOffersRequest;
import org.openapitools.model.GetPromoOffersResponse;
import org.openapitools.model.GetPromosRequest;
import org.openapitools.model.GetPromosResponse;
import org.openapitools.model.GetQualityRatingRequest;
import org.openapitools.model.GetQualityRatingResponse;
import org.openapitools.model.GetQuarantineOffersRequest;
import org.openapitools.model.GetQuarantineOffersResponse;
import org.openapitools.model.GetSuggestedOfferMappingsRequest;
import org.openapitools.model.GetSuggestedOfferMappingsResponse;
import org.openapitools.model.GetWarehousesResponse;
import org.openapitools.model.PutSkuBidsRequest;
import org.openapitools.model.SendMessageToChatRequest;
import org.openapitools.model.SkipGoodsFeedbackReactionRequest;
import org.openapitools.model.UpdateBusinessPricesRequest;
import org.openapitools.model.UpdateGoodsFeedbackCommentRequest;
import org.openapitools.model.UpdateGoodsFeedbackCommentResponse;
import org.openapitools.model.UpdateOfferContentRequest;
import org.openapitools.model.UpdateOfferContentResponse;
import org.openapitools.model.UpdateOfferMappingsRequest;
import org.openapitools.model.UpdateOfferMappingsResponse;
import org.openapitools.model.UpdatePromoOffersRequest;
import org.openapitools.model.UpdatePromoOffersResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/businesses/{businessId}")


@io.swagger.annotations.Api(description = "the businesses API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class BusinessesApi  {
   private final BusinessesApiService delegate = BusinessesApiServiceFactory.getBusinessesApi();

    @POST
    @Path("/offer-mappings/archive")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Добавление товаров в архив", notes = "Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \"В архив нельзя отправить товар, который хранится на складе Маркета\" %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| ", response = AddOffersToArchiveResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "business-offer-mappings","dbs","fby","fbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Если некоторые товары добавить в архив не удалось, в ответе 200 будет их список.  Список успешно добавленных товаров не возвращается. ", response = AddOffersToArchiveResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = AddOffersToArchiveResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = AddOffersToArchiveResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = AddOffersToArchiveResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = AddOffersToArchiveResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = AddOffersToArchiveResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 423, message = "К ресурсу нельзя применить указанный метод.", response = AddOffersToArchiveResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = AddOffersToArchiveResponse.class) })
    public Response addOffersToArchive(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "" ,required=true) AddOffersToArchiveRequest addOffersToArchiveRequest
)
    throws NotFoundException {
        return delegate.addOffersToArchive(businessId,addOffersToArchiveRequest);
    }
    @POST
    @Path("/price-quarantine/confirm")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Удаление товара из карантина по цене в кабинете", notes = "Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| ", response = EmptyApiResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "price-quarantine","dbs","fby","fbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Ответ 200 обозначает, что цены подтверждены.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 423, message = "К ресурсу нельзя применить указанный метод.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = EmptyApiResponse.class) })
    public Response confirmBusinessPrices(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "" ,required=true) ConfirmPricesRequest confirmPricesRequest
)
    throws NotFoundException {
        return delegate.confirmBusinessPrices(businessId,confirmPricesRequest);
    }
    @POST
    @Path("/chats/new")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Создание нового чата с покупателем", notes = "Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| ", response = CreateChatResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "chats","dbs","fbs","fby","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Все получилось: чат создан. ", response = CreateChatResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = CreateChatResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = CreateChatResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = CreateChatResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = CreateChatResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = CreateChatResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = CreateChatResponse.class) })
    public Response createChat(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "description" ,required=true) CreateChatRequest createChatRequest
)
    throws NotFoundException {
        return delegate.createChat(businessId,createChatRequest);
    }
    @POST
    @Path("/goods-feedback/comments/delete")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Удаление комментария к отзыву", notes = "Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| ", response = EmptyApiResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "goods-feedback","fby","fbs","dbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Пустой ответ.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = EmptyApiResponse.class) })
    public Response deleteGoodsFeedbackComment(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "" ,required=true) DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest
)
    throws NotFoundException {
        return delegate.deleteGoodsFeedbackComment(businessId,deleteGoodsFeedbackCommentRequest);
    }
    @POST
    @Path("/offer-mappings/delete")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Удаление товаров из каталога", notes = "Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| ", response = DeleteOffersResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "business-offer-mappings","dbs","fby","fbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине.", response = DeleteOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = DeleteOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = DeleteOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = DeleteOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = DeleteOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = DeleteOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 423, message = "К ресурсу нельзя применить указанный метод.", response = DeleteOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = DeleteOffersResponse.class) })
    public Response deleteOffers(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "" ,required=true) DeleteOffersRequest deleteOffersRequest
)
    throws NotFoundException {
        return delegate.deleteOffers(businessId,deleteOffersRequest);
    }
    @POST
    @Path("/offer-mappings/unarchive")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Удаление товаров из архива", notes = "Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| ", response = DeleteOffersFromArchiveResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "business-offer-mappings","dbs","fby","fbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Если некоторые товары восстановить из архива не удалось, в ответе 200 будет их список.  Список успешно восстановленных товаров не возвращается. ", response = DeleteOffersFromArchiveResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = DeleteOffersFromArchiveResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = DeleteOffersFromArchiveResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = DeleteOffersFromArchiveResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = DeleteOffersFromArchiveResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = DeleteOffersFromArchiveResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 423, message = "К ресурсу нельзя применить указанный метод.", response = DeleteOffersFromArchiveResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = DeleteOffersFromArchiveResponse.class) })
    public Response deleteOffersFromArchive(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "" ,required=true) DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest
)
    throws NotFoundException {
        return delegate.deleteOffersFromArchive(businessId,deleteOffersFromArchiveRequest);
    }
    @POST
    @Path("/promos/offers/delete")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Удаление товаров из акции", notes = "Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| ", response = DeletePromoOffersResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "promos","fby","fbs","dbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Результат удаления товаров из акции.", response = DeletePromoOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = DeletePromoOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = DeletePromoOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = DeletePromoOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = DeletePromoOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = DeletePromoOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = DeletePromoOffersResponse.class) })
    public Response deletePromoOffers(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "" ,required=true) DeletePromoOffersRequest deletePromoOffersRequest
)
    throws NotFoundException {
        return delegate.deletePromoOffers(businessId,deletePromoOffersRequest);
    }
    @POST
    @Path("/bids/info")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Информация об установленных ставках", notes = "Возвращает значения ставок для заданных товаров.  {% note warning \"\" %}  В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| ", response = GetBidsInfoResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "bids","dbs","fbs","fby","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Значения ставок для заданных товаров. В ответ попадают только товары, на которые установлены ставки.", response = GetBidsInfoResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = GetBidsInfoResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = GetBidsInfoResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = GetBidsInfoResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = GetBidsInfoResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = GetBidsInfoResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = GetBidsInfoResponse.class) })
    public Response getBidsInfoForBusiness(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @QueryParam("page_token") String pageToken
,@ApiParam(value = "Количество значений на одной странице. ") @QueryParam("limit") Integer limit
,@ApiParam(value = "description" ) GetBidsInfoRequest getBidsInfoRequest
)
    throws NotFoundException {
        return delegate.getBidsInfoForBusiness(businessId,pageToken,limit,getBidsInfoRequest);
    }
    @POST
    @Path("/bids/recommendations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Рекомендованные ставки для заданных товаров", notes = "Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.  Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.  Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| ", response = GetBidsRecommendationsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "bids","dbs","fbs","fby","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Рекомендованные ставки для заданных товаров.", response = GetBidsRecommendationsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = GetBidsRecommendationsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = GetBidsRecommendationsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = GetBidsRecommendationsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = GetBidsRecommendationsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = GetBidsRecommendationsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = GetBidsRecommendationsResponse.class) })
    public Response getBidsRecommendations(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "description." ,required=true) GetBidsRecommendationsRequest getBidsRecommendationsRequest
)
    throws NotFoundException {
        return delegate.getBidsRecommendations(businessId,getBidsRecommendationsRequest);
    }
    @POST
    @Path("/price-quarantine")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Список товаров, находящихся в карантине по цене в кабинете", notes = "Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| ", response = GetQuarantineOffersResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "price-quarantine","dbs","fby","fbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Список товаров в карантине.", response = GetQuarantineOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = GetQuarantineOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = GetQuarantineOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = GetQuarantineOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = GetQuarantineOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = GetQuarantineOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = GetQuarantineOffersResponse.class) })
    public Response getBusinessQuarantineOffers(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "" ,required=true) GetQuarantineOffersRequest getQuarantineOffersRequest
,@ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @QueryParam("page_token") String pageToken
,@ApiParam(value = "Количество значений на одной странице. ") @QueryParam("limit") Integer limit
)
    throws NotFoundException {
        return delegate.getBusinessQuarantineOffers(businessId,getQuarantineOffersRequest,pageToken,limit);
    }
    @POST
    @Path("/settings")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Настройки кабинета", notes = "Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| ", response = GetBusinessSettingsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "businesses","dbs","fbs","fby","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Настройки кабинета.", response = GetBusinessSettingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = GetBusinessSettingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = GetBusinessSettingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = GetBusinessSettingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = GetBusinessSettingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = GetBusinessSettingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = GetBusinessSettingsResponse.class) })
    public Response getBusinessSettings(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
)
    throws NotFoundException {
        return delegate.getBusinessSettings(businessId);
    }
    @POST
    @Path("/chats/history")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Получение истории сообщений в чате", notes = "Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| ", response = GetChatHistoryResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "chats","dbs","fbs","fby","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "История сообщений успешно получена. ", response = GetChatHistoryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = GetChatHistoryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = GetChatHistoryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = GetChatHistoryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = GetChatHistoryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = GetChatHistoryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = GetChatHistoryResponse.class) })
    public Response getChatHistory(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "Идентификатор чата.",required=true) @QueryParam("chatId") Long chatId
,@ApiParam(value = "description" ,required=true) GetChatHistoryRequest getChatHistoryRequest
,@ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @QueryParam("page_token") String pageToken
,@ApiParam(value = "Количество значений на одной странице. ") @QueryParam("limit") Integer limit
)
    throws NotFoundException {
        return delegate.getChatHistory(businessId,chatId,getChatHistoryRequest,pageToken,limit);
    }
    @POST
    @Path("/chats")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Получение доступных чатов", notes = "Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| ", response = GetChatsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "chats","dbs","fbs","fby","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Список чатов. ", response = GetChatsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = GetChatsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = GetChatsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = GetChatsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = GetChatsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = GetChatsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = GetChatsResponse.class) })
    public Response getChats(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "description" ,required=true) GetChatsRequest getChatsRequest
,@ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @QueryParam("page_token") String pageToken
,@ApiParam(value = "Количество значений на одной странице. ") @QueryParam("limit") Integer limit
)
    throws NotFoundException {
        return delegate.getChats(businessId,getChatsRequest,pageToken,limit);
    }
    @POST
    @Path("/goods-feedback/comments")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Получение комментариев к отзыву", notes = "Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| ", response = GetGoodsFeedbackCommentsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "goods-feedback","fby","fbs","dbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Дерево комментариев к отзыву.", response = GetGoodsFeedbackCommentsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = GetGoodsFeedbackCommentsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = GetGoodsFeedbackCommentsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = GetGoodsFeedbackCommentsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = GetGoodsFeedbackCommentsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = GetGoodsFeedbackCommentsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = GetGoodsFeedbackCommentsResponse.class) })
    public Response getGoodsFeedbackComments(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "" ,required=true) GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest
,@ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @QueryParam("page_token") String pageToken
,@ApiParam(value = "Количество значений на одной странице. ") @QueryParam("limit") Integer limit
)
    throws NotFoundException {
        return delegate.getGoodsFeedbackComments(businessId,getGoodsFeedbackCommentsRequest,pageToken,limit);
    }
    @POST
    @Path("/goods-feedback")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Получение отзывов о товарах продавца", notes = "Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| ", response = GetGoodsFeedbackResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "goods-feedback","fby","fbs","dbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Список отзывов.", response = GetGoodsFeedbackResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = GetGoodsFeedbackResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = GetGoodsFeedbackResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = GetGoodsFeedbackResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = GetGoodsFeedbackResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = GetGoodsFeedbackResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = GetGoodsFeedbackResponse.class) })
    public Response getGoodsFeedbacks(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @QueryParam("page_token") String pageToken
,@ApiParam(value = "Количество значений на одной странице. ") @QueryParam("limit") Integer limit
,@ApiParam(value = "" ) GetGoodsFeedbackRequest getGoodsFeedbackRequest
)
    throws NotFoundException {
        return delegate.getGoodsFeedbacks(businessId,pageToken,limit,getGoodsFeedbackRequest);
    }
    @POST
    @Path("/offer-cards")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Получение информации о заполненности карточек магазина", notes = "Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| ", response = GetOfferCardsContentStatusResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "content","dbs","fby","fbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Информация о карточках указанных товаров.", response = GetOfferCardsContentStatusResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = GetOfferCardsContentStatusResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = GetOfferCardsContentStatusResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = GetOfferCardsContentStatusResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = GetOfferCardsContentStatusResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = GetOfferCardsContentStatusResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = GetOfferCardsContentStatusResponse.class) })
    public Response getOfferCardsContentStatus(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @QueryParam("page_token") String pageToken
,@ApiParam(value = "Количество значений на одной странице. ") @QueryParam("limit") Integer limit
,@ApiParam(value = "" ) GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest
)
    throws NotFoundException {
        return delegate.getOfferCardsContentStatus(businessId,pageToken,limit,getOfferCardsContentStatusRequest);
    }
    @POST
    @Path("/offer-mappings")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Информация о товарах в каталоге", notes = "Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| ", response = GetOfferMappingsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "business-offer-mappings","dbs","fby","fbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Информация о товарах в каталоге.", response = GetOfferMappingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = GetOfferMappingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = GetOfferMappingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = GetOfferMappingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = GetOfferMappingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = GetOfferMappingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = GetOfferMappingsResponse.class) })
    public Response getOfferMappings(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @QueryParam("page_token") String pageToken
,@ApiParam(value = "Количество значений на одной странице. ") @QueryParam("limit") Integer limit
,@ApiParam(value = "" ) GetOfferMappingsRequest getOfferMappingsRequest
)
    throws NotFoundException {
        return delegate.getOfferMappings(businessId,pageToken,limit,getOfferMappingsRequest);
    }
    @POST
    @Path("/offers/recommendations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Рекомендации Маркета, касающиеся цен", notes = "Метод возвращает рекомендации нескольких типов.  **1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**  Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  **2. Оценка привлекательности цен на витрине.**  Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 100 запросов в минуту| |-| ", response = GetOfferRecommendationsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "offers","dbs","fby","fbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Список товаров с рекомендациями.", response = GetOfferRecommendationsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = GetOfferRecommendationsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = GetOfferRecommendationsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = GetOfferRecommendationsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = GetOfferRecommendationsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = GetOfferRecommendationsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = GetOfferRecommendationsResponse.class) })
    public Response getOfferRecommendations(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "" ,required=true) GetOfferRecommendationsRequest getOfferRecommendationsRequest
,@ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @QueryParam("page_token") String pageToken
,@ApiParam(value = "Количество значений на одной странице. ") @QueryParam("limit") Integer limit
)
    throws NotFoundException {
        return delegate.getOfferRecommendations(businessId,getOfferRecommendationsRequest,pageToken,limit);
    }
    @POST
    @Path("/promos/offers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Получение списка товаров, которые участвуют или могут участвовать в акции", notes = "Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре `limit` не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| ", response = GetPromoOffersResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "promos","fby","fbs","dbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Список товаров, которые участвуют или могут участвовать в акции.", response = GetPromoOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = GetPromoOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = GetPromoOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = GetPromoOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = GetPromoOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = GetPromoOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = GetPromoOffersResponse.class) })
    public Response getPromoOffers(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "" ,required=true) GetPromoOffersRequest getPromoOffersRequest
,@ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @QueryParam("page_token") String pageToken
,@ApiParam(value = "Количество значений на одной странице. ") @QueryParam("limit") Integer limit
)
    throws NotFoundException {
        return delegate.getPromoOffers(businessId,getPromoOffersRequest,pageToken,limit);
    }
    @POST
    @Path("/promos")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Получение списка акций", notes = "Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр `participation`.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| ", response = GetPromosResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "promos","fby","fbs","dbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Список акций Маркета.", response = GetPromosResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = GetPromosResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = GetPromosResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = GetPromosResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = GetPromosResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = GetPromosResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = GetPromosResponse.class) })
    public Response getPromos(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "" ) GetPromosRequest getPromosRequest
)
    throws NotFoundException {
        return delegate.getPromos(businessId,getPromosRequest);
    }
    @POST
    @Path("/ratings/quality")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Индекс качества магазинов", notes = "Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| ", response = GetQualityRatingResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "ratings","fby","fbs","dbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Значение индекса качества магазинов и его составляющие.", response = GetQualityRatingResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = GetQualityRatingResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = GetQualityRatingResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = GetQualityRatingResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = GetQualityRatingResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = GetQualityRatingResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = GetQualityRatingResponse.class) })
    public Response getQualityRatings(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "" ,required=true) GetQualityRatingRequest getQualityRatingRequest
)
    throws NotFoundException {
        return delegate.getQualityRatings(businessId,getQualityRatingRequest);
    }
    @POST
    @Path("/offer-mappings/suggestions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Просмотр карточек на Маркете, которые подходят вашим товарам", notes = "Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида `https://market.yandex.ru/product/<marketModelId>?sku=<marketSku>`. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать `marketSKU`, который ему подходит по вашему мнению.  {% note info \"𝓠 Как определить `marketSku` товара, найденного на Маркете?\" %}  𝓐 Он есть в адресе страницы товара — расположен после `sku=`.  Например, `https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016`  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| ", response = GetSuggestedOfferMappingsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "business-offer-mappings","dbs","fby","fbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Подобранные карточки на Маркете.  По результатам проверки товара полученная через этот запрос карточка может быть заменена на другую. ", response = GetSuggestedOfferMappingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = GetSuggestedOfferMappingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = GetSuggestedOfferMappingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = GetSuggestedOfferMappingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = GetSuggestedOfferMappingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = GetSuggestedOfferMappingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = GetSuggestedOfferMappingsResponse.class) })
    public Response getSuggestedOfferMappings(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "" ) GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest
)
    throws NotFoundException {
        return delegate.getSuggestedOfferMappings(businessId,getSuggestedOfferMappingsRequest);
    }
    @GET
    @Path("/warehouses")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Список складов и групп складов", notes = "Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| ", response = GetWarehousesResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "warehouses","fbs","dbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Список складов и групп складов.", response = GetWarehousesResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = GetWarehousesResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = GetWarehousesResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = GetWarehousesResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = GetWarehousesResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = GetWarehousesResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = GetWarehousesResponse.class) })
    public Response getWarehouses(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
)
    throws NotFoundException {
        return delegate.getWarehouses(businessId);
    }
    @PUT
    @Path("/bids")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Включение буста продаж и установка ставок", notes = "Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  {% cut \"Как в кабинете выглядит кампания, созданная через API\" %}  ![](../../_images/api-boost.png)  {% endcut %}  При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре `bid`.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \"𝓠 Как посмотреть расходы на буст продаж?\" %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле `bidFee`.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| ", response = EmptyApiResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "bids","dbs","fbs","fby","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Все получилось: ставки установлены или обновлены. Если нужно, добавлены новые товары и запущена кампания. ", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = EmptyApiResponse.class) })
    public Response putBidsForBusiness(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "description" ,required=true) PutSkuBidsRequest putSkuBidsRequest
)
    throws NotFoundException {
        return delegate.putBidsForBusiness(businessId,putSkuBidsRequest);
    }
    @POST
    @Path("/chats/file/send")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Отправка файла в чат", notes = "Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| ", response = EmptyApiResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "chats","dbs","fbs","fby","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Пустой ответ. Означает, что файл отправлен.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = EmptyApiResponse.class) })
    public Response sendFileToChat(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "Идентификатор чата.",required=true) @QueryParam("chatId") Long chatId
,
            @FormDataParam("file") InputStream _fileInputStream,
            @FormDataParam("file") FileInfo _fileDetail
)
    throws NotFoundException {
        return delegate.sendFileToChat(businessId,chatId,_fileInputStream, _fileDetail);
    }
    @POST
    @Path("/chats/message")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Отправка сообщения в чат", notes = "Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| ", response = EmptyApiResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "chats","dbs","fbs","fby","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Пустой ответ. Означает, что сообщение отправлено.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = EmptyApiResponse.class) })
    public Response sendMessageToChat(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "Идентификатор чата.",required=true) @QueryParam("chatId") Long chatId
,@ApiParam(value = "description" ,required=true) SendMessageToChatRequest sendMessageToChatRequest
)
    throws NotFoundException {
        return delegate.sendMessageToChat(businessId,chatId,sendMessageToChatRequest);
    }
    @POST
    @Path("/goods-feedback/skip-reaction")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Отказ от ответа на отзывы", notes = "Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| ", response = EmptyApiResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "goods-feedback","fby","fbs","dbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Пустой ответ.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = EmptyApiResponse.class) })
    public Response skipGoodsFeedbacksReaction(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "" ,required=true) SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest
)
    throws NotFoundException {
        return delegate.skipGoodsFeedbacksReaction(businessId,skipGoodsFeedbackReactionRequest);
    }
    @POST
    @Path("/offer-prices/updates")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Установка цен на товары во всех магазинах", notes = "Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| ", response = EmptyApiResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "prices","fby","fbs","dbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Маркет принял информацию о новых ценах.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 423, message = "К ресурсу нельзя применить указанный метод.", response = EmptyApiResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = EmptyApiResponse.class) })
    public Response updateBusinessPrices(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "" ,required=true) UpdateBusinessPricesRequest updateBusinessPricesRequest
)
    throws NotFoundException {
        return delegate.updateBusinessPrices(businessId,updateBusinessPricesRequest);
    }
    @POST
    @Path("/goods-feedback/comments/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Добавление нового или изменение созданного комментария", notes = "Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| ", response = UpdateGoodsFeedbackCommentResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "goods-feedback","fby","fbs","dbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Информация о добавленном или измененном комментарии.", response = UpdateGoodsFeedbackCommentResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = UpdateGoodsFeedbackCommentResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = UpdateGoodsFeedbackCommentResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = UpdateGoodsFeedbackCommentResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = UpdateGoodsFeedbackCommentResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = UpdateGoodsFeedbackCommentResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = UpdateGoodsFeedbackCommentResponse.class) })
    public Response updateGoodsFeedbackComment(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "" ,required=true) UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest
)
    throws NotFoundException {
        return delegate.updateGoodsFeedbackComment(businessId,updateGoodsFeedbackCommentRequest);
    }
    @POST
    @Path("/offer-cards/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Редактирование категорийных характеристик товара", notes = "Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \"Здесь только то, что относится к конкретной категории\" %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| ", response = UpdateOfferContentResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "content","dbs","fby","fbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Запрос выполнен корректно, данные обработаны.  {% note warning \"Ответ 200 сам по себе не значит, что переданные значения корректны\" %}  Обязательно посмотрите детали ответа: `status` и перечень ошибок, если он есть.  Даже если ошибка допущена в характеристиках всего одного товара, никакие изменения из запроса в каталог не попадут.  {% endnote %}  Если в `status` вернулось `ERROR`, убедитесь, что:  * все обязательные характеристики заполнены; * характеристики действительно существуют в указанных категориях; * значения соответствуют характеристикам; * ваши собственные значения имеют нужный тип данных.  Найти проблемы помогут поля `errors` и `warnings`. ", response = UpdateOfferContentResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = UpdateOfferContentResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = UpdateOfferContentResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = UpdateOfferContentResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = UpdateOfferContentResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = UpdateOfferContentResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 423, message = "К ресурсу нельзя применить указанный метод.", response = UpdateOfferContentResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = UpdateOfferContentResponse.class) })
    public Response updateOfferContent(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "" ,required=true) UpdateOfferContentRequest updateOfferContentRequest
)
    throws NotFoundException {
        return delegate.updateOfferContent(businessId,updateOfferContentRequest);
    }
    @POST
    @Path("/offer-mappings/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Добавление товаров в каталог и изменение информации о них", notes = "Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле `marketSKU`.  Для **новых товаров** обязательно укажите параметры: `offerId`, `name`, `marketCategoryId` или `category`, `pictures`, `vendor`, `description`.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в `offerId` соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом `string`, передайте пустое значение.  Параметр `offerId` должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \"Правила использования SKU\" %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| ", response = UpdateOfferMappingsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "business-offer-mappings","dbs","fby","fbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Все обязательные поля товаров заполнены, поэтому новые товары и внесенные изменения сохранены в каталоге. ", response = UpdateOfferMappingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = UpdateOfferMappingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = UpdateOfferMappingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = UpdateOfferMappingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = UpdateOfferMappingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = UpdateOfferMappingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 423, message = "К ресурсу нельзя применить указанный метод.", response = UpdateOfferMappingsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = UpdateOfferMappingsResponse.class) })
    public Response updateOfferMappings(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "" ,required=true) UpdateOfferMappingsRequest updateOfferMappingsRequest
)
    throws NotFoundException {
        return delegate.updateOfferMappings(businessId,updateOfferMappingsRequest);
    }
    @POST
    @Path("/promos/offers/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Добавление товаров в акцию или изменение их цен", notes = "Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| ", response = UpdatePromoOffersResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "promos","fby","fbs","dbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Результат добавления товаров в акцию или обновления их цен.", response = UpdatePromoOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = UpdatePromoOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = UpdatePromoOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = UpdatePromoOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = UpdatePromoOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = UpdatePromoOffersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = UpdatePromoOffersResponse.class) })
    public Response updatePromoOffers(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true) @PathParam("businessId") Long businessId
,@ApiParam(value = "" ,required=true) UpdatePromoOffersRequest updatePromoOffersRequest
)
    throws NotFoundException {
        return delegate.updatePromoOffers(businessId,updatePromoOffersRequest);
    }
}
