# ContentApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getCategoryContentParameters**](ContentApi.md#getCategoryContentParameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям |
| [**getOfferCardsContentStatus**](ContentApi.md#getOfferCardsContentStatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина |
| [**updateOfferContent**](ContentApi.md#updateOfferContent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара |


<a id="getCategoryContentParameters"></a>
# **getCategoryContentParameters**
> GetCategoryContentParametersResponse getCategoryContentParameters(categoryId)

Списки характеристик товаров по категориям

Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ContentApi()
val categoryId : kotlin.Long = 789 // kotlin.Long | Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
try {
    val result : GetCategoryContentParametersResponse = apiInstance.getCategoryContentParameters(categoryId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#getCategoryContentParameters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#getCategoryContentParameters")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **categoryId** | **kotlin.Long**| Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | |

### Return type

[**GetCategoryContentParametersResponse**](GetCategoryContentParametersResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOfferCardsContentStatus"></a>
# **getOfferCardsContentStatus**
> GetOfferCardsContentStatusResponse getOfferCardsContentStatus(businessId, pageToken, limit, getOfferCardsContentStatusRequest)

Получение информации о заполненности карточек магазина

Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ContentApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
val getOfferCardsContentStatusRequest : GetOfferCardsContentStatusRequest =  // GetOfferCardsContentStatusRequest | 
try {
    val result : GetOfferCardsContentStatusResponse = apiInstance.getOfferCardsContentStatus(businessId, pageToken, limit, getOfferCardsContentStatusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#getOfferCardsContentStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#getOfferCardsContentStatus")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getOfferCardsContentStatusRequest** | [**GetOfferCardsContentStatusRequest**](GetOfferCardsContentStatusRequest.md)|  | [optional] |

### Return type

[**GetOfferCardsContentStatusResponse**](GetOfferCardsContentStatusResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateOfferContent"></a>
# **updateOfferContent**
> UpdateOfferContentResponse updateOfferContent(businessId, updateOfferContentRequest)

Редактирование категорийных характеристик товара

Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \&quot;Здесь только то, что относится к конкретной категории\&quot; %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ContentApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val updateOfferContentRequest : UpdateOfferContentRequest =  // UpdateOfferContentRequest | 
try {
    val result : UpdateOfferContentResponse = apiInstance.updateOfferContent(businessId, updateOfferContentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#updateOfferContent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#updateOfferContent")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateOfferContentRequest** | [**UpdateOfferContentRequest**](UpdateOfferContentRequest.md)|  | |

### Return type

[**UpdateOfferContentResponse**](UpdateOfferContentResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

