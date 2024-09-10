# OpenAPI\Server\Api\PromosApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePromoOffers**](PromosApiInterface.md#deletePromoOffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
[**getPromoOffers**](PromosApiInterface.md#getPromoOffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
[**getPromos**](PromosApiInterface.md#getPromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
[**updatePromoOffers**](PromosApiInterface.md#updatePromoOffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\PromosApi:
        tags:
            - { name: "open_api_server.api", api: "promos" }
    # ...
```

## **deletePromoOffers**
> OpenAPI\Server\Model\DeletePromoOffersResponse deletePromoOffers($businessId, $deletePromoOffersRequest)

Удаление товаров из акции

Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PromosApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PromosApiInterface;

class PromosApi implements PromosApiInterface
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
     * Implementation of PromosApiInterface#deletePromoOffers
     */
    public function deletePromoOffers(int $businessId, DeletePromoOffersRequest $deletePromoOffersRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) |
 **deletePromoOffersRequest** | [**OpenAPI\Server\Model\DeletePromoOffersRequest**](../Model/DeletePromoOffersRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\DeletePromoOffersResponse**](../Model/DeletePromoOffersResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getPromoOffers**
> OpenAPI\Server\Model\GetPromoOffersResponse getPromoOffers($businessId, $getPromoOffersRequest, $pageToken, $limit)

Получение списка товаров, которые участвуют или могут участвовать в акции

Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре `limit` не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PromosApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PromosApiInterface;

class PromosApi implements PromosApiInterface
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
     * Implementation of PromosApiInterface#getPromoOffers
     */
    public function getPromoOffers(int $businessId, GetPromoOffersRequest $getPromoOffersRequest, ?string $pageToken, ?int $limit, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) |
 **getPromoOffersRequest** | [**OpenAPI\Server\Model\GetPromoOffersRequest**](../Model/GetPromoOffersRequest.md)|  |
 **pageToken** | **string**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. | [optional]
 **limit** | **int**| Количество значений на одной странице. | [optional]

### Return type

[**OpenAPI\Server\Model\GetPromoOffersResponse**](../Model/GetPromoOffersResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getPromos**
> OpenAPI\Server\Model\GetPromosResponse getPromos($businessId, $getPromosRequest)

Получение списка акций

Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр `participation`.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PromosApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PromosApiInterface;

class PromosApi implements PromosApiInterface
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
     * Implementation of PromosApiInterface#getPromos
     */
    public function getPromos(int $businessId, ?GetPromosRequest $getPromosRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) |
 **getPromosRequest** | [**OpenAPI\Server\Model\GetPromosRequest**](../Model/GetPromosRequest.md)|  | [optional]

### Return type

[**OpenAPI\Server\Model\GetPromosResponse**](../Model/GetPromosResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updatePromoOffers**
> OpenAPI\Server\Model\UpdatePromoOffersResponse updatePromoOffers($businessId, $updatePromoOffersRequest)

Добавление товаров в акцию или изменение их цен

Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PromosApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PromosApiInterface;

class PromosApi implements PromosApiInterface
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
     * Implementation of PromosApiInterface#updatePromoOffers
     */
    public function updatePromoOffers(int $businessId, UpdatePromoOffersRequest $updatePromoOffersRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) |
 **updatePromoOffersRequest** | [**OpenAPI\Server\Model\UpdatePromoOffersRequest**](../Model/UpdatePromoOffersRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\UpdatePromoOffersResponse**](../Model/UpdatePromoOffersResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

