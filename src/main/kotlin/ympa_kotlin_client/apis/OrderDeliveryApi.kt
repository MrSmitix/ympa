/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package ympa_kotlin_client.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import ympa_kotlin_client.models.ApiClientDataErrorResponse
import ympa_kotlin_client.models.ApiForbiddenErrorResponse
import ympa_kotlin_client.models.ApiLimitErrorResponse
import ympa_kotlin_client.models.ApiNotFoundErrorResponse
import ympa_kotlin_client.models.ApiServerErrorResponse
import ympa_kotlin_client.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_client.models.EmptyApiResponse
import ympa_kotlin_client.models.GetOrderBuyerInfoResponse
import ympa_kotlin_client.models.SetOrderDeliveryDateRequest
import ympa_kotlin_client.models.SetOrderDeliveryTrackCodeRequest
import ympa_kotlin_client.models.UpdateOrderStorageLimitRequest
import ympa_kotlin_client.models.VerifyOrderEacRequest
import ympa_kotlin_client.models.VerifyOrderEacResponse

import com.squareup.moshi.Json

import ympa_kotlin_client.infrastructure.ApiClient
import ympa_kotlin_client.infrastructure.ApiResponse
import ympa_kotlin_client.infrastructure.ClientException
import ympa_kotlin_client.infrastructure.ClientError
import ympa_kotlin_client.infrastructure.ServerException
import ympa_kotlin_client.infrastructure.ServerError
import ympa_kotlin_client.infrastructure.MultiValueMap
import ympa_kotlin_client.infrastructure.PartConfig
import ympa_kotlin_client.infrastructure.RequestConfig
import ympa_kotlin_client.infrastructure.RequestMethod
import ympa_kotlin_client.infrastructure.ResponseType
import ympa_kotlin_client.infrastructure.Success
import ympa_kotlin_client.infrastructure.toMultiValue

class OrderDeliveryApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api.partner.market.yandex.ru")
        }
    }

    /**
     * Информация о покупателе — физическом лице
     * Возвращает информацию о покупателе по идентификатору заказа.  {% note info \&quot;\&quot; %}  Чтобы получить информацию о покупателе, который является юридическим лицом, воспользуйтесь запросом [POST campaigns/{campaignId}/orders/{orderId}/business-buyer](../../reference/order-business-information/getOrderBusinessBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @return GetOrderBuyerInfoResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getOrderBuyerInfo(campaignId: kotlin.Long, orderId: kotlin.Long) : GetOrderBuyerInfoResponse {
        val localVarResponse = getOrderBuyerInfoWithHttpInfo(campaignId = campaignId, orderId = orderId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetOrderBuyerInfoResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Информация о покупателе — физическом лице
     * Возвращает информацию о покупателе по идентификатору заказа.  {% note info \&quot;\&quot; %}  Чтобы получить информацию о покупателе, который является юридическим лицом, воспользуйтесь запросом [POST campaigns/{campaignId}/orders/{orderId}/business-buyer](../../reference/order-business-information/getOrderBusinessBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @return ApiResponse<GetOrderBuyerInfoResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getOrderBuyerInfoWithHttpInfo(campaignId: kotlin.Long, orderId: kotlin.Long) : ApiResponse<GetOrderBuyerInfoResponse?> {
        val localVariableConfig = getOrderBuyerInfoRequestConfig(campaignId = campaignId, orderId = orderId)

        return request<Unit, GetOrderBuyerInfoResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getOrderBuyerInfo
     *
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @return RequestConfig
     */
    fun getOrderBuyerInfoRequestConfig(campaignId: kotlin.Long, orderId: kotlin.Long) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/campaigns/{campaignId}/orders/{orderId}/buyer".replace("{"+"campaignId"+"}", encodeURIComponent(campaignId.toString())).replace("{"+"orderId"+"}", encodeURIComponent(orderId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Изменение даты доставки заказа
     * Метод изменяет дату доставки заказа в статусе &#x60;PROCESSING&#x60; или &#x60;DELIVERY&#x60;. Для заказов с другими статусами дату доставки изменить нельзя.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @param setOrderDeliveryDateRequest 
     * @return EmptyApiResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun setOrderDeliveryDate(campaignId: kotlin.Long, orderId: kotlin.Long, setOrderDeliveryDateRequest: SetOrderDeliveryDateRequest) : EmptyApiResponse {
        val localVarResponse = setOrderDeliveryDateWithHttpInfo(campaignId = campaignId, orderId = orderId, setOrderDeliveryDateRequest = setOrderDeliveryDateRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EmptyApiResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Изменение даты доставки заказа
     * Метод изменяет дату доставки заказа в статусе &#x60;PROCESSING&#x60; или &#x60;DELIVERY&#x60;. Для заказов с другими статусами дату доставки изменить нельзя.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @param setOrderDeliveryDateRequest 
     * @return ApiResponse<EmptyApiResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun setOrderDeliveryDateWithHttpInfo(campaignId: kotlin.Long, orderId: kotlin.Long, setOrderDeliveryDateRequest: SetOrderDeliveryDateRequest) : ApiResponse<EmptyApiResponse?> {
        val localVariableConfig = setOrderDeliveryDateRequestConfig(campaignId = campaignId, orderId = orderId, setOrderDeliveryDateRequest = setOrderDeliveryDateRequest)

        return request<SetOrderDeliveryDateRequest, EmptyApiResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation setOrderDeliveryDate
     *
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @param setOrderDeliveryDateRequest 
     * @return RequestConfig
     */
    fun setOrderDeliveryDateRequestConfig(campaignId: kotlin.Long, orderId: kotlin.Long, setOrderDeliveryDateRequest: SetOrderDeliveryDateRequest) : RequestConfig<SetOrderDeliveryDateRequest> {
        val localVariableBody = setOrderDeliveryDateRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/campaigns/{campaignId}/orders/{orderId}/delivery/date".replace("{"+"campaignId"+"}", encodeURIComponent(campaignId.toString())).replace("{"+"orderId"+"}", encodeURIComponent(orderId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Передача трек‑номера посылки
     * {% note warning \&quot;Этот запрос только для DBS\&quot; %}  Вы можете использовать запрос, чтобы повысить лояльность покупателей. Если они могут узнать, на каком этапе доставки находятся их заказы, доверие покупателей к вашему магазину может возрасти.  {% endnote %}  Передает Маркету трек‑номер, по которому покупатель может отследить посылку со своим заказом через службу доставки.  Передать трек‑номер можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60;.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @param setOrderDeliveryTrackCodeRequest 
     * @return EmptyApiResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun setOrderDeliveryTrackCode(campaignId: kotlin.Long, orderId: kotlin.Long, setOrderDeliveryTrackCodeRequest: SetOrderDeliveryTrackCodeRequest) : EmptyApiResponse {
        val localVarResponse = setOrderDeliveryTrackCodeWithHttpInfo(campaignId = campaignId, orderId = orderId, setOrderDeliveryTrackCodeRequest = setOrderDeliveryTrackCodeRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EmptyApiResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Передача трек‑номера посылки
     * {% note warning \&quot;Этот запрос только для DBS\&quot; %}  Вы можете использовать запрос, чтобы повысить лояльность покупателей. Если они могут узнать, на каком этапе доставки находятся их заказы, доверие покупателей к вашему магазину может возрасти.  {% endnote %}  Передает Маркету трек‑номер, по которому покупатель может отследить посылку со своим заказом через службу доставки.  Передать трек‑номер можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60;.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @param setOrderDeliveryTrackCodeRequest 
     * @return ApiResponse<EmptyApiResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun setOrderDeliveryTrackCodeWithHttpInfo(campaignId: kotlin.Long, orderId: kotlin.Long, setOrderDeliveryTrackCodeRequest: SetOrderDeliveryTrackCodeRequest) : ApiResponse<EmptyApiResponse?> {
        val localVariableConfig = setOrderDeliveryTrackCodeRequestConfig(campaignId = campaignId, orderId = orderId, setOrderDeliveryTrackCodeRequest = setOrderDeliveryTrackCodeRequest)

        return request<SetOrderDeliveryTrackCodeRequest, EmptyApiResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation setOrderDeliveryTrackCode
     *
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @param setOrderDeliveryTrackCodeRequest 
     * @return RequestConfig
     */
    fun setOrderDeliveryTrackCodeRequestConfig(campaignId: kotlin.Long, orderId: kotlin.Long, setOrderDeliveryTrackCodeRequest: SetOrderDeliveryTrackCodeRequest) : RequestConfig<SetOrderDeliveryTrackCodeRequest> {
        val localVariableBody = setOrderDeliveryTrackCodeRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/campaigns/{campaignId}/orders/{orderId}/delivery/track".replace("{"+"campaignId"+"}", encodeURIComponent(campaignId.toString())).replace("{"+"orderId"+"}", encodeURIComponent(orderId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Продление срока хранения заказа
     * Продлевает срок хранения заказа в пункте выдачи продавца.  Заказ должен быть в статусе &#x60;PICKUP&#x60;. Продлить срок можно только один раз, не больше чем на 30 дней.  Новый срок хранения можно получить в параметре &#x60;outletStorageLimitDate&#x60; запроса [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @param updateOrderStorageLimitRequest 
     * @return EmptyApiResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateOrderStorageLimit(campaignId: kotlin.Long, orderId: kotlin.Long, updateOrderStorageLimitRequest: UpdateOrderStorageLimitRequest) : EmptyApiResponse {
        val localVarResponse = updateOrderStorageLimitWithHttpInfo(campaignId = campaignId, orderId = orderId, updateOrderStorageLimitRequest = updateOrderStorageLimitRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EmptyApiResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Продление срока хранения заказа
     * Продлевает срок хранения заказа в пункте выдачи продавца.  Заказ должен быть в статусе &#x60;PICKUP&#x60;. Продлить срок можно только один раз, не больше чем на 30 дней.  Новый срок хранения можно получить в параметре &#x60;outletStorageLimitDate&#x60; запроса [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @param updateOrderStorageLimitRequest 
     * @return ApiResponse<EmptyApiResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun updateOrderStorageLimitWithHttpInfo(campaignId: kotlin.Long, orderId: kotlin.Long, updateOrderStorageLimitRequest: UpdateOrderStorageLimitRequest) : ApiResponse<EmptyApiResponse?> {
        val localVariableConfig = updateOrderStorageLimitRequestConfig(campaignId = campaignId, orderId = orderId, updateOrderStorageLimitRequest = updateOrderStorageLimitRequest)

        return request<UpdateOrderStorageLimitRequest, EmptyApiResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation updateOrderStorageLimit
     *
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @param updateOrderStorageLimitRequest 
     * @return RequestConfig
     */
    fun updateOrderStorageLimitRequestConfig(campaignId: kotlin.Long, orderId: kotlin.Long, updateOrderStorageLimitRequest: UpdateOrderStorageLimitRequest) : RequestConfig<UpdateOrderStorageLimitRequest> {
        val localVariableBody = updateOrderStorageLimitRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit".replace("{"+"campaignId"+"}", encodeURIComponent(campaignId.toString())).replace("{"+"orderId"+"}", encodeURIComponent(orderId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Передача кода подтверждения
     * Отправляет Маркету код подтверждения для его проверки.  Код подтверждает передачу заказа или невыкупа:  * курьеру — курьер должен назвать магазину код; * магазину — магазин называет код курьеру.  Если магазин получает невыкупленный заказ, то ему нужно назвать курьеру код из кабинета или приложения.  Если у магазина настроена работа с кодами подтверждения, в запросах [POST order/status](../../pushapi/reference/postOrderStatus.md), [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md), [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md), [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) в параметре &#x60;delivery&#x60;, вложенном в &#x60;order&#x60; будет возвращаться параметр &#x60;eacType&#x60; с типом &#x60;Enum&#x60; — тип кода подтверждения для передачи заказа.  Возможные значения: &#x60;MERCHANT_TO_COURIER&#x60; — магазин называет код курьеру, &#x60;COURIER_TO_MERCHANT&#x60; — курьер называет код магазину.  Параметр &#x60;eacType&#x60; возвращается при статусах заказа &#x60;COURIER_FOUND&#x60;, &#x60;COURIER_ARRIVED_TO_SENDER&#x60; и &#x60;DELIVERY_SERVICE_UNDELIVERED&#x60;. Если заказ в других статусах, параметр может отсутствовать.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @param verifyOrderEacRequest 
     * @return VerifyOrderEacResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun verifyOrderEac(campaignId: kotlin.Long, orderId: kotlin.Long, verifyOrderEacRequest: VerifyOrderEacRequest) : VerifyOrderEacResponse {
        val localVarResponse = verifyOrderEacWithHttpInfo(campaignId = campaignId, orderId = orderId, verifyOrderEacRequest = verifyOrderEacRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as VerifyOrderEacResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Передача кода подтверждения
     * Отправляет Маркету код подтверждения для его проверки.  Код подтверждает передачу заказа или невыкупа:  * курьеру — курьер должен назвать магазину код; * магазину — магазин называет код курьеру.  Если магазин получает невыкупленный заказ, то ему нужно назвать курьеру код из кабинета или приложения.  Если у магазина настроена работа с кодами подтверждения, в запросах [POST order/status](../../pushapi/reference/postOrderStatus.md), [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md), [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md), [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) в параметре &#x60;delivery&#x60;, вложенном в &#x60;order&#x60; будет возвращаться параметр &#x60;eacType&#x60; с типом &#x60;Enum&#x60; — тип кода подтверждения для передачи заказа.  Возможные значения: &#x60;MERCHANT_TO_COURIER&#x60; — магазин называет код курьеру, &#x60;COURIER_TO_MERCHANT&#x60; — курьер называет код магазину.  Параметр &#x60;eacType&#x60; возвращается при статусах заказа &#x60;COURIER_FOUND&#x60;, &#x60;COURIER_ARRIVED_TO_SENDER&#x60; и &#x60;DELIVERY_SERVICE_UNDELIVERED&#x60;. Если заказ в других статусах, параметр может отсутствовать.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @param verifyOrderEacRequest 
     * @return ApiResponse<VerifyOrderEacResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun verifyOrderEacWithHttpInfo(campaignId: kotlin.Long, orderId: kotlin.Long, verifyOrderEacRequest: VerifyOrderEacRequest) : ApiResponse<VerifyOrderEacResponse?> {
        val localVariableConfig = verifyOrderEacRequestConfig(campaignId = campaignId, orderId = orderId, verifyOrderEacRequest = verifyOrderEacRequest)

        return request<VerifyOrderEacRequest, VerifyOrderEacResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation verifyOrderEac
     *
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param orderId Идентификатор заказа.
     * @param verifyOrderEacRequest 
     * @return RequestConfig
     */
    fun verifyOrderEacRequestConfig(campaignId: kotlin.Long, orderId: kotlin.Long, verifyOrderEacRequest: VerifyOrderEacRequest) : RequestConfig<VerifyOrderEacRequest> {
        val localVariableBody = verifyOrderEacRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/campaigns/{campaignId}/orders/{orderId}/verifyEac".replace("{"+"campaignId"+"}", encodeURIComponent(campaignId.toString())).replace("{"+"orderId"+"}", encodeURIComponent(orderId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
