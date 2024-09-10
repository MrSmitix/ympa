# OpenAPI\Server\Api\TariffsApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculateTariffs**](TariffsApiInterface.md#calculateTariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\TariffsApi:
        tags:
            - { name: "open_api_server.api", api: "tariffs" }
    # ...
```

## **calculateTariffs**
> OpenAPI\Server\Model\CalculateTariffsResponse calculateTariffs($calculateTariffsRequest)

Калькулятор стоимости услуг

Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/TariffsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\TariffsApiInterface;

class TariffsApi implements TariffsApiInterface
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
     * Implementation of TariffsApiInterface#calculateTariffs
     */
    public function calculateTariffs(CalculateTariffsRequest $calculateTariffsRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **calculateTariffsRequest** | [**OpenAPI\Server\Model\CalculateTariffsRequest**](../Model/CalculateTariffsRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\CalculateTariffsResponse**](../Model/CalculateTariffsResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

