# OpenAPI\Server\Api\CategoriesApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategoriesMaxSaleQuantum**](CategoriesApiInterface.md#getCategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
[**getCategoriesTree**](CategoriesApiInterface.md#getCategoriesTree) | **POST** /categories/tree | Дерево категорий


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\CategoriesApi:
        tags:
            - { name: "open_api_server.api", api: "categories" }
    # ...
```

## **getCategoriesMaxSaleQuantum**
> OpenAPI\Server\Model\GetCategoriesMaxSaleQuantumResponse getCategoriesMaxSaleQuantum($getCategoriesMaxSaleQuantumRequest)

Лимит на установку кванта продажи и минимального количества товаров в заказе

Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CategoriesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CategoriesApiInterface;

class CategoriesApi implements CategoriesApiInterface
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
     * Implementation of CategoriesApiInterface#getCategoriesMaxSaleQuantum
     */
    public function getCategoriesMaxSaleQuantum(GetCategoriesMaxSaleQuantumRequest $getCategoriesMaxSaleQuantumRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getCategoriesMaxSaleQuantumRequest** | [**OpenAPI\Server\Model\GetCategoriesMaxSaleQuantumRequest**](../Model/GetCategoriesMaxSaleQuantumRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\GetCategoriesMaxSaleQuantumResponse**](../Model/GetCategoriesMaxSaleQuantumResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getCategoriesTree**
> OpenAPI\Server\Model\GetCategoriesResponse getCategoriesTree($getCategoriesRequest)

Дерево категорий

Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CategoriesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CategoriesApiInterface;

class CategoriesApi implements CategoriesApiInterface
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
     * Implementation of CategoriesApiInterface#getCategoriesTree
     */
    public function getCategoriesTree(?GetCategoriesRequest $getCategoriesRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getCategoriesRequest** | [**OpenAPI\Server\Model\GetCategoriesRequest**](../Model/GetCategoriesRequest.md)|  | [optional]

### Return type

[**OpenAPI\Server\Model\GetCategoriesResponse**](../Model/GetCategoriesResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

