# OpenAPI\Server\Api\HiddenOffersApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addHiddenOffers**](HiddenOffersApiInterface.md#addHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
[**deleteHiddenOffers**](HiddenOffersApiInterface.md#deleteHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
[**getHiddenOffers**](HiddenOffersApiInterface.md#getHiddenOffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\HiddenOffersApi:
        tags:
            - { name: "open_api_server.api", api: "hiddenOffers" }
    # ...
```

## **addHiddenOffers**
> OpenAPI\Server\Model\EmptyApiResponse addHiddenOffers($campaignId, $addHiddenOffersRequest)

Скрытие товаров и настройки скрытия

Скрывает товары магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/HiddenOffersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\HiddenOffersApiInterface;

class HiddenOffersApi implements HiddenOffersApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of HiddenOffersApiInterface#addHiddenOffers
     */
    public function addHiddenOffers(int $campaignId, AddHiddenOffersRequest $addHiddenOffersRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) |
 **addHiddenOffersRequest** | [**OpenAPI\Server\Model\AddHiddenOffersRequest**](../Model/AddHiddenOffersRequest.md)| Запрос на скрытие оферов. |

### Return type

[**OpenAPI\Server\Model\EmptyApiResponse**](../Model/EmptyApiResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deleteHiddenOffers**
> OpenAPI\Server\Model\EmptyApiResponse deleteHiddenOffers($campaignId, $deleteHiddenOffersRequest)

Возобновление показа товаров

Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/HiddenOffersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\HiddenOffersApiInterface;

class HiddenOffersApi implements HiddenOffersApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of HiddenOffersApiInterface#deleteHiddenOffers
     */
    public function deleteHiddenOffers(int $campaignId, DeleteHiddenOffersRequest $deleteHiddenOffersRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) |
 **deleteHiddenOffersRequest** | [**OpenAPI\Server\Model\DeleteHiddenOffersRequest**](../Model/DeleteHiddenOffersRequest.md)| Запрос на возобновление показа оферов. |

### Return type

[**OpenAPI\Server\Model\EmptyApiResponse**](../Model/EmptyApiResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getHiddenOffers**
> OpenAPI\Server\Model\GetHiddenOffersResponse getHiddenOffers($campaignId, $offerId, $pageToken, $limit, $offset, $page, $pageSize)

Информация о скрытых вами товарах

Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/HiddenOffersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\HiddenOffersApiInterface;

class HiddenOffersApi implements HiddenOffersApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of HiddenOffersApiInterface#getHiddenOffers
     */
    public function getHiddenOffers(int $campaignId, ?array $offerId, ?string $pageToken, ?int $limit, ?int $offset, int $page, ?int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) |
 **offerId** | [**string**](../Model/string.md)| Идентификатор скрытого предложения. | [optional]
 **pageToken** | **string**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. | [optional]
 **limit** | **int**| Количество значений на одной странице. | [optional]
 **offset** | **int**| Позиция в списке, начиная с которой возвращаются результаты ответа.  Используется вместе с параметром &#x60;limit&#x60;.  Если задан &#x60;offset&#x60;, параметры &#x60;page_number&#x60; и &#x60;page_size&#x60; игнорируются.  &#x60;offset&#x60; игнорируется, если задан &#x60;page_token&#x60;. | [optional]
 **page** | **int**| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. | [optional] [default to 1]
 **pageSize** | **int**| Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. | [optional]

### Return type

[**OpenAPI\Server\Model\GetHiddenOffersResponse**](../Model/GetHiddenOffersResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

