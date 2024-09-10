# WWW::OpenAPIClient::ContentApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ContentApi;
```

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_category_content_parameters**](ContentApi.md#get_category_content_parameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
[**get_offer_cards_content_status**](ContentApi.md#get_offer_cards_content_status) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
[**update_offer_content**](ContentApi.md#update_offer_content) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара


# **get_category_content_parameters**
> GetCategoryContentParametersResponse get_category_content_parameters(category_id => $category_id)

Списки характеристик товаров по категориям

Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ContentApi;
my $api_instance = WWW::OpenAPIClient::ContentApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $category_id = 789; # int | Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 

eval {
    my $result = $api_instance->get_category_content_parameters(category_id => $category_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ContentApi->get_category_content_parameters: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category_id** | **int**| Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | 

### Return type

[**GetCategoryContentParametersResponse**](GetCategoryContentParametersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_offer_cards_content_status**
> GetOfferCardsContentStatusResponse get_offer_cards_content_status(business_id => $business_id, page_token => $page_token, limit => $limit, get_offer_cards_content_status_request => $get_offer_cards_content_status_request)

Получение информации о заполненности карточек магазина

Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ContentApi;
my $api_instance = WWW::OpenAPIClient::ContentApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 789; # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $page_token = eyBuZXh0SWQ6IDIzNDIgfQ==; # string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
my $limit = 20; # int | Количество значений на одной странице. 
my $get_offer_cards_content_status_request = WWW::OpenAPIClient::Object::GetOfferCardsContentStatusRequest->new(); # GetOfferCardsContentStatusRequest | 

eval {
    my $result = $api_instance->get_offer_cards_content_status(business_id => $business_id, page_token => $page_token, limit => $limit, get_offer_cards_content_status_request => $get_offer_cards_content_status_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ContentApi->get_offer_cards_content_status: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **page_token** | **string**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **int**| Количество значений на одной странице.  | [optional] 
 **get_offer_cards_content_status_request** | [**GetOfferCardsContentStatusRequest**](GetOfferCardsContentStatusRequest.md)|  | [optional] 

### Return type

[**GetOfferCardsContentStatusResponse**](GetOfferCardsContentStatusResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_offer_content**
> UpdateOfferContentResponse update_offer_content(business_id => $business_id, update_offer_content_request => $update_offer_content_request)

Редактирование категорийных характеристик товара

Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \"Здесь только то, что относится к конкретной категории\" %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ContentApi;
my $api_instance = WWW::OpenAPIClient::ContentApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 789; # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $update_offer_content_request = WWW::OpenAPIClient::Object::UpdateOfferContentRequest->new(); # UpdateOfferContentRequest | 

eval {
    my $result = $api_instance->update_offer_content(business_id => $business_id, update_offer_content_request => $update_offer_content_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ContentApi->update_offer_content: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **update_offer_content_request** | [**UpdateOfferContentRequest**](UpdateOfferContentRequest.md)|  | 

### Return type

[**UpdateOfferContentResponse**](UpdateOfferContentResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

