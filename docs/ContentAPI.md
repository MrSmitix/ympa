# ContentAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ContentAPI_getCategoryContentParameters**](ContentAPI.md#ContentAPI_getCategoryContentParameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
[**ContentAPI_getOfferCardsContentStatus**](ContentAPI.md#ContentAPI_getOfferCardsContentStatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
[**ContentAPI_updateOfferContent**](ContentAPI.md#ContentAPI_updateOfferContent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара


# **ContentAPI_getCategoryContentParameters**
```c
// Списки характеристик товаров по категориям
//
// Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 
//
get_category_content_parameters_response_t* ContentAPI_getCategoryContentParameters(apiClient_t *apiClient, long categoryId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**categoryId** | **long** | Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | 

### Return type

[get_category_content_parameters_response_t](get_category_content_parameters_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContentAPI_getOfferCardsContentStatus**
```c
// Получение информации о заполненности карточек магазина
//
// Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 
//
get_offer_cards_content_status_response_t* ContentAPI_getOfferCardsContentStatus(apiClient_t *apiClient, long businessId, char *page_token, int *limit, get_offer_cards_content_status_request_t *get_offer_cards_content_status_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 
**get_offer_cards_content_status_request** | **[get_offer_cards_content_status_request_t](get_offer_cards_content_status_request.md) \*** |  | [optional] 

### Return type

[get_offer_cards_content_status_response_t](get_offer_cards_content_status_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ContentAPI_updateOfferContent**
```c
// Редактирование категорийных характеристик товара
//
// Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \"Здесь только то, что относится к конкретной категории\" %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
update_offer_content_response_t* ContentAPI_updateOfferContent(apiClient_t *apiClient, long businessId, update_offer_content_request_t *update_offer_content_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**update_offer_content_request** | **[update_offer_content_request_t](update_offer_content_request.md) \*** |  | 

### Return type

[update_offer_content_response_t](update_offer_content_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

