# WWW::OpenAPIClient::BusinessOfferMappingsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::BusinessOfferMappingsApi;
```

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_offers_to_archive**](BusinessOfferMappingsApi.md#add_offers_to_archive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
[**delete_offers**](BusinessOfferMappingsApi.md#delete_offers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
[**delete_offers_from_archive**](BusinessOfferMappingsApi.md#delete_offers_from_archive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
[**get_offer_mappings**](BusinessOfferMappingsApi.md#get_offer_mappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
[**get_suggested_offer_mappings**](BusinessOfferMappingsApi.md#get_suggested_offer_mappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
[**update_offer_mappings**](BusinessOfferMappingsApi.md#update_offer_mappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них


# **add_offers_to_archive**
> AddOffersToArchiveResponse add_offers_to_archive(business_id => $business_id, add_offers_to_archive_request => $add_offers_to_archive_request)

Добавление товаров в архив

Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \"В архив нельзя отправить товар, который хранится на складе Маркета\" %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessOfferMappingsApi;
my $api_instance = WWW::OpenAPIClient::BusinessOfferMappingsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 789; # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $add_offers_to_archive_request = WWW::OpenAPIClient::Object::AddOffersToArchiveRequest->new(); # AddOffersToArchiveRequest | 

eval {
    my $result = $api_instance->add_offers_to_archive(business_id => $business_id, add_offers_to_archive_request => $add_offers_to_archive_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessOfferMappingsApi->add_offers_to_archive: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **add_offers_to_archive_request** | [**AddOffersToArchiveRequest**](AddOffersToArchiveRequest.md)|  | 

### Return type

[**AddOffersToArchiveResponse**](AddOffersToArchiveResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_offers**
> DeleteOffersResponse delete_offers(business_id => $business_id, delete_offers_request => $delete_offers_request)

Удаление товаров из каталога

Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessOfferMappingsApi;
my $api_instance = WWW::OpenAPIClient::BusinessOfferMappingsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 789; # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $delete_offers_request = WWW::OpenAPIClient::Object::DeleteOffersRequest->new(); # DeleteOffersRequest | 

eval {
    my $result = $api_instance->delete_offers(business_id => $business_id, delete_offers_request => $delete_offers_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessOfferMappingsApi->delete_offers: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **delete_offers_request** | [**DeleteOffersRequest**](DeleteOffersRequest.md)|  | 

### Return type

[**DeleteOffersResponse**](DeleteOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_offers_from_archive**
> DeleteOffersFromArchiveResponse delete_offers_from_archive(business_id => $business_id, delete_offers_from_archive_request => $delete_offers_from_archive_request)

Удаление товаров из архива

Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessOfferMappingsApi;
my $api_instance = WWW::OpenAPIClient::BusinessOfferMappingsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 789; # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $delete_offers_from_archive_request = WWW::OpenAPIClient::Object::DeleteOffersFromArchiveRequest->new(); # DeleteOffersFromArchiveRequest | 

eval {
    my $result = $api_instance->delete_offers_from_archive(business_id => $business_id, delete_offers_from_archive_request => $delete_offers_from_archive_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessOfferMappingsApi->delete_offers_from_archive: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **delete_offers_from_archive_request** | [**DeleteOffersFromArchiveRequest**](DeleteOffersFromArchiveRequest.md)|  | 

### Return type

[**DeleteOffersFromArchiveResponse**](DeleteOffersFromArchiveResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_offer_mappings**
> GetOfferMappingsResponse get_offer_mappings(business_id => $business_id, page_token => $page_token, limit => $limit, get_offer_mappings_request => $get_offer_mappings_request)

Информация о товарах в каталоге

Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessOfferMappingsApi;
my $api_instance = WWW::OpenAPIClient::BusinessOfferMappingsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 789; # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $page_token = eyBuZXh0SWQ6IDIzNDIgfQ==; # string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
my $limit = 20; # int | Количество значений на одной странице. 
my $get_offer_mappings_request = WWW::OpenAPIClient::Object::GetOfferMappingsRequest->new(); # GetOfferMappingsRequest | 

eval {
    my $result = $api_instance->get_offer_mappings(business_id => $business_id, page_token => $page_token, limit => $limit, get_offer_mappings_request => $get_offer_mappings_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessOfferMappingsApi->get_offer_mappings: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **page_token** | **string**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **int**| Количество значений на одной странице.  | [optional] 
 **get_offer_mappings_request** | [**GetOfferMappingsRequest**](GetOfferMappingsRequest.md)|  | [optional] 

### Return type

[**GetOfferMappingsResponse**](GetOfferMappingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_suggested_offer_mappings**
> GetSuggestedOfferMappingsResponse get_suggested_offer_mappings(business_id => $business_id, get_suggested_offer_mappings_request => $get_suggested_offer_mappings_request)

Просмотр карточек на Маркете, которые подходят вашим товарам

Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида `https://market.yandex.ru/product/<marketModelId>?sku=<marketSku>`. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать `marketSKU`, который ему подходит по вашему мнению.  {% note info \"𝓠 Как определить `marketSku` товара, найденного на Маркете?\" %}  𝓐 Он есть в адресе страницы товара — расположен после `sku=`.  Например, `https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016`  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessOfferMappingsApi;
my $api_instance = WWW::OpenAPIClient::BusinessOfferMappingsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 789; # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $get_suggested_offer_mappings_request = WWW::OpenAPIClient::Object::GetSuggestedOfferMappingsRequest->new(); # GetSuggestedOfferMappingsRequest | 

eval {
    my $result = $api_instance->get_suggested_offer_mappings(business_id => $business_id, get_suggested_offer_mappings_request => $get_suggested_offer_mappings_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessOfferMappingsApi->get_suggested_offer_mappings: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **get_suggested_offer_mappings_request** | [**GetSuggestedOfferMappingsRequest**](GetSuggestedOfferMappingsRequest.md)|  | [optional] 

### Return type

[**GetSuggestedOfferMappingsResponse**](GetSuggestedOfferMappingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_offer_mappings**
> UpdateOfferMappingsResponse update_offer_mappings(business_id => $business_id, update_offer_mappings_request => $update_offer_mappings_request)

Добавление товаров в каталог и изменение информации о них

Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле `marketSKU`.  Для **новых товаров** обязательно укажите параметры: `offerId`, `name`, `marketCategoryId` или `category`, `pictures`, `vendor`, `description`.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в `offerId` соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом `string`, передайте пустое значение.  Параметр `offerId` должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \"Правила использования SKU\" %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BusinessOfferMappingsApi;
my $api_instance = WWW::OpenAPIClient::BusinessOfferMappingsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 789; # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $update_offer_mappings_request = WWW::OpenAPIClient::Object::UpdateOfferMappingsRequest->new(); # UpdateOfferMappingsRequest | 

eval {
    my $result = $api_instance->update_offer_mappings(business_id => $business_id, update_offer_mappings_request => $update_offer_mappings_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BusinessOfferMappingsApi->update_offer_mappings: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **update_offer_mappings_request** | [**UpdateOfferMappingsRequest**](UpdateOfferMappingsRequest.md)|  | 

### Return type

[**UpdateOfferMappingsResponse**](UpdateOfferMappingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

