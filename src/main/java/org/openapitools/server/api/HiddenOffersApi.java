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

package org.openapitools.server.api;

import org.openapitools.server.model.AddHiddenOffersRequest;
import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiLockedErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.DeleteHiddenOffersRequest;
import org.openapitools.server.model.EmptyApiResponse;
import org.openapitools.server.model.GetHiddenOffersResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;


import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 * Партнерский API Маркета
 *
 * <p>API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 */

@RegisterProvider(ApiExceptionMapper.class)
@Path("/campaigns/{campaignId}/hidden-offers")
public interface HiddenOffersApi  {

    /**
     * Скрытие товаров и настройки скрытия
     *
     * Скрывает товары магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    EmptyApiResponse addHiddenOffers(@PathParam("campaignId") Long campaignId, AddHiddenOffersRequest addHiddenOffersRequest) throws ApiException, ProcessingException;

    /**
     * Возобновление показа товаров
     *
     * Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     *
     */
    @POST
    @Path("/delete")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    EmptyApiResponse deleteHiddenOffers(@PathParam("campaignId") Long campaignId, DeleteHiddenOffersRequest deleteHiddenOffersRequest) throws ApiException, ProcessingException;

    /**
     * Информация о скрытых вами товарах
     *
     * Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
     *
     */
    @GET
    
    @Produces({ "application/json" })
    GetHiddenOffersResponse getHiddenOffers(@PathParam("campaignId") Long campaignId, @QueryParam("offer_id") List<String> offerId, @QueryParam("page_token") String pageToken, @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("page") @DefaultValue("1") Integer page, @QueryParam("pageSize") Integer pageSize) throws ApiException, ProcessingException;
}
