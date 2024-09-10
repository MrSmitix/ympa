# OpenAPI\Server\Api\CampaignsApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCampaign**](CampaignsApiInterface.md#getCampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
[**getCampaignLogins**](CampaignsApiInterface.md#getCampaignLogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
[**getCampaignRegion**](CampaignsApiInterface.md#getCampaignRegion) | **GET** /campaigns/{campaignId}/region | Регион магазина
[**getCampaignSettings**](CampaignsApiInterface.md#getCampaignSettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
[**getCampaigns**](CampaignsApiInterface.md#getCampaigns) | **GET** /campaigns | Список магазинов пользователя
[**getCampaignsByLogin**](CampaignsApiInterface.md#getCampaignsByLogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\CampaignsApi:
        tags:
            - { name: "open_api_server.api", api: "campaigns" }
    # ...
```

## **getCampaign**
> OpenAPI\Server\Model\GetCampaignResponse getCampaign($campaignId)

Информация о магазине

Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CampaignsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CampaignsApiInterface;

class CampaignsApi implements CampaignsApiInterface
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
     * Implementation of CampaignsApiInterface#getCampaign
     */
    public function getCampaign(int $campaignId, int &$responseCode, array &$responseHeaders): array|object|null
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

### Return type

[**OpenAPI\Server\Model\GetCampaignResponse**](../Model/GetCampaignResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getCampaignLogins**
> OpenAPI\Server\Model\GetCampaignLoginsResponse getCampaignLogins($campaignId)

Логины, связанные с магазином

Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CampaignsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CampaignsApiInterface;

class CampaignsApi implements CampaignsApiInterface
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
     * Implementation of CampaignsApiInterface#getCampaignLogins
     */
    public function getCampaignLogins(int $campaignId, int &$responseCode, array &$responseHeaders): array|object|null
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

### Return type

[**OpenAPI\Server\Model\GetCampaignLoginsResponse**](../Model/GetCampaignLoginsResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getCampaignRegion**
> OpenAPI\Server\Model\GetCampaignRegionResponse getCampaignRegion($campaignId)

Регион магазина

{% note warning \"\" %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CampaignsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CampaignsApiInterface;

class CampaignsApi implements CampaignsApiInterface
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
     * Implementation of CampaignsApiInterface#getCampaignRegion
     */
    public function getCampaignRegion(int $campaignId, int &$responseCode, array &$responseHeaders): array|object|null
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

### Return type

[**OpenAPI\Server\Model\GetCampaignRegionResponse**](../Model/GetCampaignRegionResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getCampaignSettings**
> OpenAPI\Server\Model\GetCampaignSettingsResponse getCampaignSettings($campaignId)

Настройки магазина

Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CampaignsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CampaignsApiInterface;

class CampaignsApi implements CampaignsApiInterface
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
     * Implementation of CampaignsApiInterface#getCampaignSettings
     */
    public function getCampaignSettings(int $campaignId, int &$responseCode, array &$responseHeaders): array|object|null
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

### Return type

[**OpenAPI\Server\Model\GetCampaignSettingsResponse**](../Model/GetCampaignSettingsResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getCampaigns**
> OpenAPI\Server\Model\GetCampaignsResponse getCampaigns($page, $pageSize)

Список магазинов пользователя

Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CampaignsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CampaignsApiInterface;

class CampaignsApi implements CampaignsApiInterface
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
     * Implementation of CampaignsApiInterface#getCampaigns
     */
    public function getCampaigns(int $page, ?int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. | [optional] [default to 1]
 **pageSize** | **int**| Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. | [optional]

### Return type

[**OpenAPI\Server\Model\GetCampaignsResponse**](../Model/GetCampaignsResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getCampaignsByLogin**
> OpenAPI\Server\Model\GetCampaignsResponse getCampaignsByLogin($login, $page, $pageSize)

Магазины, доступные логину

Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CampaignsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CampaignsApiInterface;

class CampaignsApi implements CampaignsApiInterface
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
     * Implementation of CampaignsApiInterface#getCampaignsByLogin
     */
    public function getCampaignsByLogin(string $login, int $page, ?int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **string**| Логин пользователя. |
 **page** | **int**| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. | [optional] [default to 1]
 **pageSize** | **int**| Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. | [optional]

### Return type

[**OpenAPI\Server\Model\GetCampaignsResponse**](../Model/GetCampaignsResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

