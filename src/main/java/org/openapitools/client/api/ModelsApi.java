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
import org.openapitools.client.model.CurrencyType;
import org.openapitools.client.model.GetModelsOffersResponse;
import org.openapitools.client.model.GetModelsRequest;
import org.openapitools.client.model.GetModelsResponse;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.openapitools.client.model.SearchModelsResponse;
import org.openapitools.client.model.SortOrderType;

/**
 * Партнерский API Маркета
 *
 * <p>API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 */
@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("/models")
public interface ModelsApi  {

    /**
     * Информация об одной модели
     * Возвращает информацию о модели товара.  Для методов &#x60;GET models&#x60;, &#x60;GET models/{modelId}&#x60; и &#x60;POST models&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
     */
    @GET
    @Path("/{modelId}")
    @Produces({ "application/json" })
    GetModelsResponse getModel(@PathParam("modelId") Long modelId, @QueryParam("regionId") Long regionId, @QueryParam("currency") CurrencyType currency) throws ApiException, ProcessingException;

    /**
     * Список предложений для одной модели
     * Возвращает информацию о первых десяти предложениях, расположенных на карточке модели.  Предложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.  Для групповых моделей метод не поддерживается. Идентификатор групповой модели игнорируется.  Для методов &#x60;GET models/{modelId}/offers&#x60; и &#x60;POST models/offers&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
     */
    @GET
    @Path("/{modelId}/offers")
    @Produces({ "application/json" })
    GetModelsOffersResponse getModelOffers(@PathParam("modelId") Long modelId, @QueryParam("regionId") Long regionId, @QueryParam("currency") CurrencyType currency, @QueryParam("orderByPrice") SortOrderType orderByPrice, @QueryParam("count") @DefaultValue("10") Integer count, @QueryParam("page") @DefaultValue("1") Integer page) throws ApiException, ProcessingException;

    /**
     * Информация о нескольких моделях
     * Возвращает информацию о моделях товаров.  В одном запросе можно получить информацию не более чем о 100 моделях.  Для методов &#x60;GET models&#x60;, &#x60;GET models/{modelId}&#x60; и &#x60;POST models&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    GetModelsResponse getModels(@QueryParam("regionId") Long regionId, GetModelsRequest getModelsRequest, @QueryParam("currency") CurrencyType currency) throws ApiException, ProcessingException;

    /**
     * Список предложений для нескольких моделей
     * Возвращает информацию о первых десяти предложениях, расположенных на карточках моделей, идентификаторы которых указаны в запросе.  Предложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.  Для групповых моделей выдача предложений не поддерживается. Идентификаторы групповых моделей игнорируются.  В одном запросе можно получить информацию о предложениях не более чем для 100 моделей.  Для методов &#x60;GET models/{modelId}/offers&#x60; и &#x60;POST models/offers&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
     */
    @POST
    @Path("/offers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    GetModelsOffersResponse getModelsOffers(@QueryParam("regionId") Long regionId, GetModelsRequest getModelsRequest, @QueryParam("currency") CurrencyType currency, @QueryParam("orderByPrice") SortOrderType orderByPrice) throws ApiException, ProcessingException;

    /**
     * Поиск модели товара
     * Возвращает информацию о моделях, удовлетворяющих заданным в запросе условиям поиска.  В одном запросе можно получить информацию не более чем о 100 моделях.  Для методов &#x60;GET models&#x60;, &#x60;GET models/{modelId}&#x60; и &#x60;POST models&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
     */
    @GET
    
    @Produces({ "application/json" })
    SearchModelsResponse searchModels(@QueryParam("query") String query, @QueryParam("regionId") Long regionId, @QueryParam("currency") CurrencyType currency, @QueryParam("page") @DefaultValue("1") Integer page, @QueryParam("pageSize") Integer pageSize) throws ApiException, ProcessingException;
}
