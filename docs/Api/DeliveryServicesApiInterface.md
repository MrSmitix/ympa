# OpenAPI\Server\Api\DeliveryServicesApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDeliveryServices**](DeliveryServicesApiInterface.md#getDeliveryServices) | **GET** /delivery/services | Справочник служб доставки


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\DeliveryServicesApi:
        tags:
            - { name: "open_api_server.api", api: "deliveryServices" }
    # ...
```

## **getDeliveryServices**
> OpenAPI\Server\Model\GetDeliveryServicesResponse getDeliveryServices()

Справочник служб доставки

Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/DeliveryServicesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\DeliveryServicesApiInterface;

class DeliveryServicesApi implements DeliveryServicesApiInterface
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
     * Implementation of DeliveryServicesApiInterface#getDeliveryServices
     */
    public function getDeliveryServices(int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OpenAPI\Server\Model\GetDeliveryServicesResponse**](../Model/GetDeliveryServicesResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

