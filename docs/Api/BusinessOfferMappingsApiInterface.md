# OpenAPI\Server\Api\BusinessOfferMappingsApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOffersToArchive**](BusinessOfferMappingsApiInterface.md#addOffersToArchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
[**deleteOffers**](BusinessOfferMappingsApiInterface.md#deleteOffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
[**deleteOffersFromArchive**](BusinessOfferMappingsApiInterface.md#deleteOffersFromArchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
[**getOfferMappings**](BusinessOfferMappingsApiInterface.md#getOfferMappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
[**getSuggestedOfferMappings**](BusinessOfferMappingsApiInterface.md#getSuggestedOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
[**updateOfferMappings**](BusinessOfferMappingsApiInterface.md#updateOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\BusinessOfferMappingsApi:
        tags:
            - { name: "open_api_server.api", api: "businessOfferMappings" }
    # ...
```

## **addOffersToArchive**
> OpenAPI\Server\Model\AddOffersToArchiveResponse addOffersToArchive($businessId, $addOffersToArchiveRequest)

Добавление товаров в архив

Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \"В архив нельзя отправить товар, который хранится на складе Маркета\" %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessOfferMappingsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessOfferMappingsApiInterface;

class BusinessOfferMappingsApi implements BusinessOfferMappingsApiInterface
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
     * Implementation of BusinessOfferMappingsApiInterface#addOffersToArchive
     */
    public function addOffersToArchive(int $businessId, AddOffersToArchiveRequest $addOffersToArchiveRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **addOffersToArchiveRequest** | [**OpenAPI\Server\Model\AddOffersToArchiveRequest**](../Model/AddOffersToArchiveRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\AddOffersToArchiveResponse**](../Model/AddOffersToArchiveResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deleteOffers**
> OpenAPI\Server\Model\DeleteOffersResponse deleteOffers($businessId, $deleteOffersRequest)

Удаление товаров из каталога

Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessOfferMappingsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessOfferMappingsApiInterface;

class BusinessOfferMappingsApi implements BusinessOfferMappingsApiInterface
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
     * Implementation of BusinessOfferMappingsApiInterface#deleteOffers
     */
    public function deleteOffers(int $businessId, DeleteOffersRequest $deleteOffersRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **deleteOffersRequest** | [**OpenAPI\Server\Model\DeleteOffersRequest**](../Model/DeleteOffersRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\DeleteOffersResponse**](../Model/DeleteOffersResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deleteOffersFromArchive**
> OpenAPI\Server\Model\DeleteOffersFromArchiveResponse deleteOffersFromArchive($businessId, $deleteOffersFromArchiveRequest)

Удаление товаров из архива

Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessOfferMappingsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessOfferMappingsApiInterface;

class BusinessOfferMappingsApi implements BusinessOfferMappingsApiInterface
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
     * Implementation of BusinessOfferMappingsApiInterface#deleteOffersFromArchive
     */
    public function deleteOffersFromArchive(int $businessId, DeleteOffersFromArchiveRequest $deleteOffersFromArchiveRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **deleteOffersFromArchiveRequest** | [**OpenAPI\Server\Model\DeleteOffersFromArchiveRequest**](../Model/DeleteOffersFromArchiveRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\DeleteOffersFromArchiveResponse**](../Model/DeleteOffersFromArchiveResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getOfferMappings**
> OpenAPI\Server\Model\GetOfferMappingsResponse getOfferMappings($businessId, $pageToken, $limit, $getOfferMappingsRequest)

Информация о товарах в каталоге

Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessOfferMappingsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessOfferMappingsApiInterface;

class BusinessOfferMappingsApi implements BusinessOfferMappingsApiInterface
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
     * Implementation of BusinessOfferMappingsApiInterface#getOfferMappings
     */
    public function getOfferMappings(int $businessId, ?string $pageToken, ?int $limit, ?GetOfferMappingsRequest $getOfferMappingsRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **pageToken** | **string**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. | [optional]
 **limit** | **int**| Количество значений на одной странице. | [optional]
 **getOfferMappingsRequest** | [**OpenAPI\Server\Model\GetOfferMappingsRequest**](../Model/GetOfferMappingsRequest.md)|  | [optional]

### Return type

[**OpenAPI\Server\Model\GetOfferMappingsResponse**](../Model/GetOfferMappingsResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getSuggestedOfferMappings**
> OpenAPI\Server\Model\GetSuggestedOfferMappingsResponse getSuggestedOfferMappings($businessId, $getSuggestedOfferMappingsRequest)

Просмотр карточек на Маркете, которые подходят вашим товарам

Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида `https://market.yandex.ru/product/<marketModelId>?sku=<marketSku>`. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать `marketSKU`, который ему подходит по вашему мнению.  {% note info \"𝓠 Как определить `marketSku` товара, найденного на Маркете?\" %}  𝓐 Он есть в адресе страницы товара — расположен после `sku=`.  Например, `https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016`  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessOfferMappingsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessOfferMappingsApiInterface;

class BusinessOfferMappingsApi implements BusinessOfferMappingsApiInterface
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
     * Implementation of BusinessOfferMappingsApiInterface#getSuggestedOfferMappings
     */
    public function getSuggestedOfferMappings(int $businessId, ?GetSuggestedOfferMappingsRequest $getSuggestedOfferMappingsRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **getSuggestedOfferMappingsRequest** | [**OpenAPI\Server\Model\GetSuggestedOfferMappingsRequest**](../Model/GetSuggestedOfferMappingsRequest.md)|  | [optional]

### Return type

[**OpenAPI\Server\Model\GetSuggestedOfferMappingsResponse**](../Model/GetSuggestedOfferMappingsResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateOfferMappings**
> OpenAPI\Server\Model\UpdateOfferMappingsResponse updateOfferMappings($businessId, $updateOfferMappingsRequest)

Добавление товаров в каталог и изменение информации о них

Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле `marketSKU`.  Для **новых товаров** обязательно укажите параметры: `offerId`, `name`, `marketCategoryId` или `category`, `pictures`, `vendor`, `description`.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в `offerId` соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом `string`, передайте пустое значение.  Параметр `offerId` должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \"Правила использования SKU\" %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessOfferMappingsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessOfferMappingsApiInterface;

class BusinessOfferMappingsApi implements BusinessOfferMappingsApiInterface
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
     * Implementation of BusinessOfferMappingsApiInterface#updateOfferMappings
     */
    public function updateOfferMappings(int $businessId, UpdateOfferMappingsRequest $updateOfferMappingsRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **updateOfferMappingsRequest** | [**OpenAPI\Server\Model\UpdateOfferMappingsRequest**](../Model/UpdateOfferMappingsRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\UpdateOfferMappingsResponse**](../Model/UpdateOfferMappingsResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

