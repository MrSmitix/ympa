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
import org.openapitools.client.model.GetDeliveryServicesResponse;

/**
 * Партнерский API Маркета
 *
 * <p>API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 */
@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("/delivery/services")
public interface DeliveryServicesApi  {

    /**
     * Справочник служб доставки
     * Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
     */
    @GET
    
    @Produces({ "application/json" })
    GetDeliveryServicesResponse getDeliveryServices() throws ApiException, ProcessingException;
}
