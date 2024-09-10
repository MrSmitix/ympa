# ContentController

All URIs are relative to `""`

The controller class is defined in **[ContentController.java](../../src/main/java/org/openapitools/controller/ContentController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategoryContentParameters**](#getCategoryContentParameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
[**getOfferCardsContentStatus**](#getOfferCardsContentStatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
[**updateOfferContent**](#updateOfferContent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара

<a id="getCategoryContentParameters"></a>
# **getCategoryContentParameters**
```java
Mono<GetCategoryContentParametersResponse> ContentController.getCategoryContentParameters(categoryId)
```

Списки характеристик товаров по категориям

Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**categoryId** | `Long` | Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  |

### Return type
[**GetCategoryContentParametersResponse**](../../docs/models/GetCategoryContentParametersResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getOfferCardsContentStatus"></a>
# **getOfferCardsContentStatus**
```java
Mono<GetOfferCardsContentStatusResponse> ContentController.getOfferCardsContentStatus(businessIdpageTokenlimitgetOfferCardsContentStatusRequest)
```

Получение информации о заполненности карточек магазина

Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `Long` | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**pageToken** | `String` | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter]
**limit** | `Integer` | Количество значений на одной странице.  | [optional parameter]
**getOfferCardsContentStatusRequest** | [**GetOfferCardsContentStatusRequest**](../../docs/models/GetOfferCardsContentStatusRequest.md) |  | [optional parameter]

### Return type
[**GetOfferCardsContentStatusResponse**](../../docs/models/GetOfferCardsContentStatusResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="updateOfferContent"></a>
# **updateOfferContent**
```java
Mono<UpdateOfferContentResponse> ContentController.updateOfferContent(businessIdupdateOfferContentRequest)
```

Редактирование категорийных характеристик товара

Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \&quot;Здесь только то, что относится к конкретной категории\&quot; %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `Long` | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**updateOfferContentRequest** | [**UpdateOfferContentRequest**](../../docs/models/UpdateOfferContentRequest.md) |  |

### Return type
[**UpdateOfferContentResponse**](../../docs/models/UpdateOfferContentResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

