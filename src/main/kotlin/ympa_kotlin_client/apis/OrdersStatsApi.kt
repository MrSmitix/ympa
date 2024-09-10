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
import ympa_kotlin_client.models.GetOrdersStatsRequest
import ympa_kotlin_client.models.GetOrdersStatsResponse

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

class OrdersStatsApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api.partner.market.yandex.ru")
        }
    }

    /**
     * Детальная информация по заказам
     * Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \&quot;\&quot; %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional)
     * @param limit Количество значений на одной странице.  (optional)
     * @param getOrdersStatsRequest  (optional)
     * @return GetOrdersStatsResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getOrdersStats(campaignId: kotlin.Long, pageToken: kotlin.String? = null, limit: kotlin.Int? = null, getOrdersStatsRequest: GetOrdersStatsRequest? = null) : GetOrdersStatsResponse {
        val localVarResponse = getOrdersStatsWithHttpInfo(campaignId = campaignId, pageToken = pageToken, limit = limit, getOrdersStatsRequest = getOrdersStatsRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetOrdersStatsResponse
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
     * Детальная информация по заказам
     * Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \&quot;\&quot; %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional)
     * @param limit Количество значений на одной странице.  (optional)
     * @param getOrdersStatsRequest  (optional)
     * @return ApiResponse<GetOrdersStatsResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getOrdersStatsWithHttpInfo(campaignId: kotlin.Long, pageToken: kotlin.String?, limit: kotlin.Int?, getOrdersStatsRequest: GetOrdersStatsRequest?) : ApiResponse<GetOrdersStatsResponse?> {
        val localVariableConfig = getOrdersStatsRequestConfig(campaignId = campaignId, pageToken = pageToken, limit = limit, getOrdersStatsRequest = getOrdersStatsRequest)

        return request<GetOrdersStatsRequest, GetOrdersStatsResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getOrdersStats
     *
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional)
     * @param limit Количество значений на одной странице.  (optional)
     * @param getOrdersStatsRequest  (optional)
     * @return RequestConfig
     */
    fun getOrdersStatsRequestConfig(campaignId: kotlin.Long, pageToken: kotlin.String?, limit: kotlin.Int?, getOrdersStatsRequest: GetOrdersStatsRequest?) : RequestConfig<GetOrdersStatsRequest> {
        val localVariableBody = getOrdersStatsRequest
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (pageToken != null) {
                    put("page_token", listOf(pageToken.toString()))
                }
                if (limit != null) {
                    put("limit", listOf(limit.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/campaigns/{campaignId}/stats/orders".replace("{"+"campaignId"+"}", encodeURIComponent(campaignId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
