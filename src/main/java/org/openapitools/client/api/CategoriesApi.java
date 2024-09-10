/*
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

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ApiClientDataErrorResponse;
import org.openapitools.client.model.ApiForbiddenErrorResponse;
import org.openapitools.client.model.ApiLimitErrorResponse;
import org.openapitools.client.model.ApiNotFoundErrorResponse;
import org.openapitools.client.model.ApiServerErrorResponse;
import org.openapitools.client.model.ApiUnauthorizedErrorResponse;
import org.openapitools.client.model.GetCategoriesMaxSaleQuantumRequest;
import org.openapitools.client.model.GetCategoriesMaxSaleQuantumResponse;
import org.openapitools.client.model.GetCategoriesRequest;
import org.openapitools.client.model.GetCategoriesResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoriesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CategoriesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CategoriesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getCategoriesMaxSaleQuantum
     * @param getCategoriesMaxSaleQuantumRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Лимит на установку кванта и минимального количества товаров. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Запрос содержит неправильные данные. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> В запросе не указаны данные для авторизации. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Данные для авторизации неверны или доступ к ресурсу запрещен. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Запрашиваемый ресурс не найден. </td><td>  -  </td></tr>
        <tr><td> 420 </td><td> Превышено ограничение на доступ к ресурсу. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Внутренняя ошибка сервера. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCategoriesMaxSaleQuantumCall(GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getCategoriesMaxSaleQuantumRequest;

        // create path and map variables
        String localVarPath = "/categories/max-sale-quantum";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCategoriesMaxSaleQuantumValidateBeforeCall(GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'getCategoriesMaxSaleQuantumRequest' is set
        if (getCategoriesMaxSaleQuantumRequest == null) {
            throw new ApiException("Missing the required parameter 'getCategoriesMaxSaleQuantumRequest' when calling getCategoriesMaxSaleQuantum(Async)");
        }

        return getCategoriesMaxSaleQuantumCall(getCategoriesMaxSaleQuantumRequest, _callback);

    }

    /**
     * Лимит на установку кванта продажи и минимального количества товаров в заказе
     * Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     * @param getCategoriesMaxSaleQuantumRequest  (required)
     * @return GetCategoriesMaxSaleQuantumResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Лимит на установку кванта и минимального количества товаров. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Запрос содержит неправильные данные. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> В запросе не указаны данные для авторизации. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Данные для авторизации неверны или доступ к ресурсу запрещен. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Запрашиваемый ресурс не найден. </td><td>  -  </td></tr>
        <tr><td> 420 </td><td> Превышено ограничение на доступ к ресурсу. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Внутренняя ошибка сервера. </td><td>  -  </td></tr>
     </table>
     */
    public GetCategoriesMaxSaleQuantumResponse getCategoriesMaxSaleQuantum(GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest) throws ApiException {
        ApiResponse<GetCategoriesMaxSaleQuantumResponse> localVarResp = getCategoriesMaxSaleQuantumWithHttpInfo(getCategoriesMaxSaleQuantumRequest);
        return localVarResp.getData();
    }

    /**
     * Лимит на установку кванта продажи и минимального количества товаров в заказе
     * Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     * @param getCategoriesMaxSaleQuantumRequest  (required)
     * @return ApiResponse&lt;GetCategoriesMaxSaleQuantumResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Лимит на установку кванта и минимального количества товаров. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Запрос содержит неправильные данные. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> В запросе не указаны данные для авторизации. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Данные для авторизации неверны или доступ к ресурсу запрещен. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Запрашиваемый ресурс не найден. </td><td>  -  </td></tr>
        <tr><td> 420 </td><td> Превышено ограничение на доступ к ресурсу. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Внутренняя ошибка сервера. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetCategoriesMaxSaleQuantumResponse> getCategoriesMaxSaleQuantumWithHttpInfo(GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest) throws ApiException {
        okhttp3.Call localVarCall = getCategoriesMaxSaleQuantumValidateBeforeCall(getCategoriesMaxSaleQuantumRequest, null);
        Type localVarReturnType = new TypeToken<GetCategoriesMaxSaleQuantumResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Лимит на установку кванта продажи и минимального количества товаров в заказе (asynchronously)
     * Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     * @param getCategoriesMaxSaleQuantumRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Лимит на установку кванта и минимального количества товаров. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Запрос содержит неправильные данные. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> В запросе не указаны данные для авторизации. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Данные для авторизации неверны или доступ к ресурсу запрещен. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Запрашиваемый ресурс не найден. </td><td>  -  </td></tr>
        <tr><td> 420 </td><td> Превышено ограничение на доступ к ресурсу. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Внутренняя ошибка сервера. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCategoriesMaxSaleQuantumAsync(GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest, final ApiCallback<GetCategoriesMaxSaleQuantumResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCategoriesMaxSaleQuantumValidateBeforeCall(getCategoriesMaxSaleQuantumRequest, _callback);
        Type localVarReturnType = new TypeToken<GetCategoriesMaxSaleQuantumResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCategoriesTree
     * @param getCategoriesRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Категории Маркета. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Запрос содержит неправильные данные. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> В запросе не указаны данные для авторизации. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Данные для авторизации неверны или доступ к ресурсу запрещен. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Запрашиваемый ресурс не найден. </td><td>  -  </td></tr>
        <tr><td> 420 </td><td> Превышено ограничение на доступ к ресурсу. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Внутренняя ошибка сервера. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCategoriesTreeCall(GetCategoriesRequest getCategoriesRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getCategoriesRequest;

        // create path and map variables
        String localVarPath = "/categories/tree";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCategoriesTreeValidateBeforeCall(GetCategoriesRequest getCategoriesRequest, final ApiCallback _callback) throws ApiException {
        return getCategoriesTreeCall(getCategoriesRequest, _callback);

    }

    /**
     * Дерево категорий
     * Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     * @param getCategoriesRequest  (optional)
     * @return GetCategoriesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Категории Маркета. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Запрос содержит неправильные данные. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> В запросе не указаны данные для авторизации. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Данные для авторизации неверны или доступ к ресурсу запрещен. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Запрашиваемый ресурс не найден. </td><td>  -  </td></tr>
        <tr><td> 420 </td><td> Превышено ограничение на доступ к ресурсу. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Внутренняя ошибка сервера. </td><td>  -  </td></tr>
     </table>
     */
    public GetCategoriesResponse getCategoriesTree(GetCategoriesRequest getCategoriesRequest) throws ApiException {
        ApiResponse<GetCategoriesResponse> localVarResp = getCategoriesTreeWithHttpInfo(getCategoriesRequest);
        return localVarResp.getData();
    }

    /**
     * Дерево категорий
     * Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     * @param getCategoriesRequest  (optional)
     * @return ApiResponse&lt;GetCategoriesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Категории Маркета. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Запрос содержит неправильные данные. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> В запросе не указаны данные для авторизации. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Данные для авторизации неверны или доступ к ресурсу запрещен. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Запрашиваемый ресурс не найден. </td><td>  -  </td></tr>
        <tr><td> 420 </td><td> Превышено ограничение на доступ к ресурсу. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Внутренняя ошибка сервера. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetCategoriesResponse> getCategoriesTreeWithHttpInfo(GetCategoriesRequest getCategoriesRequest) throws ApiException {
        okhttp3.Call localVarCall = getCategoriesTreeValidateBeforeCall(getCategoriesRequest, null);
        Type localVarReturnType = new TypeToken<GetCategoriesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Дерево категорий (asynchronously)
     * Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     * @param getCategoriesRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Категории Маркета. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Запрос содержит неправильные данные. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> В запросе не указаны данные для авторизации. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Данные для авторизации неверны или доступ к ресурсу запрещен. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Запрашиваемый ресурс не найден. </td><td>  -  </td></tr>
        <tr><td> 420 </td><td> Превышено ограничение на доступ к ресурсу. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Внутренняя ошибка сервера. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCategoriesTreeAsync(GetCategoriesRequest getCategoriesRequest, final ApiCallback<GetCategoriesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCategoriesTreeValidateBeforeCall(getCategoriesRequest, _callback);
        Type localVarReturnType = new TypeToken<GetCategoriesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
