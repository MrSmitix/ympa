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

import org.openapitools.client.ApiInvoker;
import org.openapitools.client.ApiException;
import org.openapitools.client.Pair;

import org.openapitools.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.openapitools.client.model.ApiClientDataErrorResponse;
import org.openapitools.client.model.ApiForbiddenErrorResponse;
import org.openapitools.client.model.ApiLimitErrorResponse;
import org.openapitools.client.model.ApiLockedErrorResponse;
import org.openapitools.client.model.ApiNotFoundErrorResponse;
import org.openapitools.client.model.ApiServerErrorResponse;
import org.openapitools.client.model.ApiUnauthorizedErrorResponse;
import org.openapitools.client.model.ConfirmPricesRequest;
import org.openapitools.client.model.EmptyApiResponse;
import org.openapitools.client.model.GetQuarantineOffersRequest;
import org.openapitools.client.model.GetQuarantineOffersResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class PriceQuarantineApi {
  String basePath = "https://api.partner.market.yandex.ru";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Удаление товара из карантина по цене в кабинете
  * Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param confirmPricesRequest 
   * @return EmptyApiResponse
  */
  public EmptyApiResponse confirmBusinessPrices (Long businessId, ConfirmPricesRequest confirmPricesRequest) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = confirmPricesRequest;
    // verify the required parameter 'businessId' is set
    if (businessId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'businessId' when calling confirmBusinessPrices",
        new ApiException(400, "Missing the required parameter 'businessId' when calling confirmBusinessPrices"));
    }
    // verify the required parameter 'confirmPricesRequest' is set
    if (confirmPricesRequest == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'confirmPricesRequest' when calling confirmBusinessPrices",
        new ApiException(400, "Missing the required parameter 'confirmPricesRequest' when calling confirmBusinessPrices"));
    }

    // create path and map variables
    String path = "/businesses/{businessId}/price-quarantine/confirm".replaceAll("\\{" + "businessId" + "\\}", apiInvoker.escapeString(businessId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "OAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (EmptyApiResponse) ApiInvoker.deserialize(localVarResponse, "", EmptyApiResponse.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Удаление товара из карантина по цене в кабинете
   * Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)    * @param confirmPricesRequest 
  */
  public void confirmBusinessPrices (Long businessId, ConfirmPricesRequest confirmPricesRequest, final Response.Listener<EmptyApiResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = confirmPricesRequest;

    // verify the required parameter 'businessId' is set
    if (businessId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'businessId' when calling confirmBusinessPrices",
        new ApiException(400, "Missing the required parameter 'businessId' when calling confirmBusinessPrices"));
    }
    // verify the required parameter 'confirmPricesRequest' is set
    if (confirmPricesRequest == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'confirmPricesRequest' when calling confirmBusinessPrices",
        new ApiException(400, "Missing the required parameter 'confirmPricesRequest' when calling confirmBusinessPrices"));
    }

    // create path and map variables
    String path = "/businesses/{businessId}/price-quarantine/confirm".replaceAll("\\{format\\}","json").replaceAll("\\{" + "businessId" + "\\}", apiInvoker.escapeString(businessId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "OAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((EmptyApiResponse) ApiInvoker.deserialize(localVarResponse,  "", EmptyApiResponse.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Удаление товара из карантина по цене в магазине
  * Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
   * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param confirmPricesRequest 
   * @return EmptyApiResponse
  */
  public EmptyApiResponse confirmCampaignPrices (Long campaignId, ConfirmPricesRequest confirmPricesRequest) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = confirmPricesRequest;
    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'campaignId' when calling confirmCampaignPrices",
        new ApiException(400, "Missing the required parameter 'campaignId' when calling confirmCampaignPrices"));
    }
    // verify the required parameter 'confirmPricesRequest' is set
    if (confirmPricesRequest == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'confirmPricesRequest' when calling confirmCampaignPrices",
        new ApiException(400, "Missing the required parameter 'confirmPricesRequest' when calling confirmCampaignPrices"));
    }

    // create path and map variables
    String path = "/campaigns/{campaignId}/price-quarantine/confirm".replaceAll("\\{" + "campaignId" + "\\}", apiInvoker.escapeString(campaignId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "OAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (EmptyApiResponse) ApiInvoker.deserialize(localVarResponse, "", EmptyApiResponse.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Удаление товара из карантина по цене в магазине
   * Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
   * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)    * @param confirmPricesRequest 
  */
  public void confirmCampaignPrices (Long campaignId, ConfirmPricesRequest confirmPricesRequest, final Response.Listener<EmptyApiResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = confirmPricesRequest;

    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'campaignId' when calling confirmCampaignPrices",
        new ApiException(400, "Missing the required parameter 'campaignId' when calling confirmCampaignPrices"));
    }
    // verify the required parameter 'confirmPricesRequest' is set
    if (confirmPricesRequest == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'confirmPricesRequest' when calling confirmCampaignPrices",
        new ApiException(400, "Missing the required parameter 'confirmPricesRequest' when calling confirmCampaignPrices"));
    }

    // create path and map variables
    String path = "/campaigns/{campaignId}/price-quarantine/confirm".replaceAll("\\{format\\}","json").replaceAll("\\{" + "campaignId" + "\\}", apiInvoker.escapeString(campaignId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "OAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((EmptyApiResponse) ApiInvoker.deserialize(localVarResponse,  "", EmptyApiResponse.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Список товаров, находящихся в карантине по цене в кабинете
  * Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param getQuarantineOffersRequest 
   * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
   * @param limit Количество значений на одной странице. 
   * @return GetQuarantineOffersResponse
  */
  public GetQuarantineOffersResponse getBusinessQuarantineOffers (Long businessId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = getQuarantineOffersRequest;
    // verify the required parameter 'businessId' is set
    if (businessId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'businessId' when calling getBusinessQuarantineOffers",
        new ApiException(400, "Missing the required parameter 'businessId' when calling getBusinessQuarantineOffers"));
    }
    // verify the required parameter 'getQuarantineOffersRequest' is set
    if (getQuarantineOffersRequest == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'getQuarantineOffersRequest' when calling getBusinessQuarantineOffers",
        new ApiException(400, "Missing the required parameter 'getQuarantineOffersRequest' when calling getBusinessQuarantineOffers"));
    }

    // create path and map variables
    String path = "/businesses/{businessId}/price-quarantine".replaceAll("\\{" + "businessId" + "\\}", apiInvoker.escapeString(businessId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page_token", pageToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "OAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (GetQuarantineOffersResponse) ApiInvoker.deserialize(localVarResponse, "", GetQuarantineOffersResponse.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Список товаров, находящихся в карантине по цене в кабинете
   * Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)    * @param getQuarantineOffersRequest    * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.    * @param limit Количество значений на одной странице. 
  */
  public void getBusinessQuarantineOffers (Long businessId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit, final Response.Listener<GetQuarantineOffersResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = getQuarantineOffersRequest;

    // verify the required parameter 'businessId' is set
    if (businessId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'businessId' when calling getBusinessQuarantineOffers",
        new ApiException(400, "Missing the required parameter 'businessId' when calling getBusinessQuarantineOffers"));
    }
    // verify the required parameter 'getQuarantineOffersRequest' is set
    if (getQuarantineOffersRequest == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'getQuarantineOffersRequest' when calling getBusinessQuarantineOffers",
        new ApiException(400, "Missing the required parameter 'getQuarantineOffersRequest' when calling getBusinessQuarantineOffers"));
    }

    // create path and map variables
    String path = "/businesses/{businessId}/price-quarantine".replaceAll("\\{format\\}","json").replaceAll("\\{" + "businessId" + "\\}", apiInvoker.escapeString(businessId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "page_token", pageToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));


    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "OAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((GetQuarantineOffersResponse) ApiInvoker.deserialize(localVarResponse,  "", GetQuarantineOffersResponse.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Список товаров, находящихся в карантине по цене в магазине
  * Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
   * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param getQuarantineOffersRequest 
   * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
   * @param limit Количество значений на одной странице. 
   * @return GetQuarantineOffersResponse
  */
  public GetQuarantineOffersResponse getCampaignQuarantineOffers (Long campaignId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = getQuarantineOffersRequest;
    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'campaignId' when calling getCampaignQuarantineOffers",
        new ApiException(400, "Missing the required parameter 'campaignId' when calling getCampaignQuarantineOffers"));
    }
    // verify the required parameter 'getQuarantineOffersRequest' is set
    if (getQuarantineOffersRequest == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'getQuarantineOffersRequest' when calling getCampaignQuarantineOffers",
        new ApiException(400, "Missing the required parameter 'getQuarantineOffersRequest' when calling getCampaignQuarantineOffers"));
    }

    // create path and map variables
    String path = "/campaigns/{campaignId}/price-quarantine".replaceAll("\\{" + "campaignId" + "\\}", apiInvoker.escapeString(campaignId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page_token", pageToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "OAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (GetQuarantineOffersResponse) ApiInvoker.deserialize(localVarResponse, "", GetQuarantineOffersResponse.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Список товаров, находящихся в карантине по цене в магазине
   * Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
   * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)    * @param getQuarantineOffersRequest    * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.    * @param limit Количество значений на одной странице. 
  */
  public void getCampaignQuarantineOffers (Long campaignId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit, final Response.Listener<GetQuarantineOffersResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = getQuarantineOffersRequest;

    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'campaignId' when calling getCampaignQuarantineOffers",
        new ApiException(400, "Missing the required parameter 'campaignId' when calling getCampaignQuarantineOffers"));
    }
    // verify the required parameter 'getQuarantineOffersRequest' is set
    if (getQuarantineOffersRequest == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'getQuarantineOffersRequest' when calling getCampaignQuarantineOffers",
        new ApiException(400, "Missing the required parameter 'getQuarantineOffersRequest' when calling getCampaignQuarantineOffers"));
    }

    // create path and map variables
    String path = "/campaigns/{campaignId}/price-quarantine".replaceAll("\\{format\\}","json").replaceAll("\\{" + "campaignId" + "\\}", apiInvoker.escapeString(campaignId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "page_token", pageToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));


    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "OAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((GetQuarantineOffersResponse) ApiInvoker.deserialize(localVarResponse,  "", GetQuarantineOffersResponse.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
