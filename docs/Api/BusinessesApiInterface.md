# OpenAPI\Server\Api\BusinessesApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBusinessSettings**](BusinessesApiInterface.md#getBusinessSettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\BusinessesApi:
        tags:
            - { name: "open_api_server.api", api: "businesses" }
    # ...
```

## **getBusinessSettings**
> OpenAPI\Server\Model\GetBusinessSettingsResponse getBusinessSettings($businessId)

Настройки кабинета

Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessesApiInterface;

class BusinessesApi implements BusinessesApiInterface
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
     * Implementation of BusinessesApiInterface#getBusinessSettings
     */
    public function getBusinessSettings(int $businessId, int &$responseCode, array &$responseHeaders): array|object|null
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

### Return type

[**OpenAPI\Server\Model\GetBusinessSettingsResponse**](../Model/GetBusinessSettingsResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

