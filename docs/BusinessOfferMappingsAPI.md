# BusinessOfferMappingsAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOffersToArchive**](BusinessOfferMappingsAPI.md#addofferstoarchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
[**deleteOffers**](BusinessOfferMappingsAPI.md#deleteoffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
[**deleteOffersFromArchive**](BusinessOfferMappingsAPI.md#deleteoffersfromarchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
[**getOfferMappings**](BusinessOfferMappingsAPI.md#getoffermappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
[**getSuggestedOfferMappings**](BusinessOfferMappingsAPI.md#getsuggestedoffermappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
[**updateOfferMappings**](BusinessOfferMappingsAPI.md#updateoffermappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них


# **addOffersToArchive**
```swift
    open class func addOffersToArchive(businessId: Int64, addOffersToArchiveRequest: AddOffersToArchiveRequest, completion: @escaping (_ data: AddOffersToArchiveResponse?, _ error: Error?) -> Void)
```

Добавление товаров в архив

Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \"В архив нельзя отправить товар, который хранится на складе Маркета\" %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = 987 // Int64 | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
let addOffersToArchiveRequest = AddOffersToArchiveRequest(offerIds: ["offerIds_example"]) // AddOffersToArchiveRequest | 

// Добавление товаров в архив
BusinessOfferMappingsAPI.addOffersToArchive(businessId: businessId, addOffersToArchiveRequest: addOffersToArchiveRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **Int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **addOffersToArchiveRequest** | [**AddOffersToArchiveRequest**](AddOffersToArchiveRequest.md) |  | 

### Return type

[**AddOffersToArchiveResponse**](AddOffersToArchiveResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteOffers**
```swift
    open class func deleteOffers(businessId: Int64, deleteOffersRequest: DeleteOffersRequest, completion: @escaping (_ data: DeleteOffersResponse?, _ error: Error?) -> Void)
```

Удаление товаров из каталога

Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = 987 // Int64 | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
let deleteOffersRequest = DeleteOffersRequest(offerIds: ["offerIds_example"]) // DeleteOffersRequest | 

// Удаление товаров из каталога
BusinessOfferMappingsAPI.deleteOffers(businessId: businessId, deleteOffersRequest: deleteOffersRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **Int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **deleteOffersRequest** | [**DeleteOffersRequest**](DeleteOffersRequest.md) |  | 

### Return type

[**DeleteOffersResponse**](DeleteOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteOffersFromArchive**
```swift
    open class func deleteOffersFromArchive(businessId: Int64, deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest, completion: @escaping (_ data: DeleteOffersFromArchiveResponse?, _ error: Error?) -> Void)
```

Удаление товаров из архива

Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = 987 // Int64 | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
let deleteOffersFromArchiveRequest = DeleteOffersFromArchiveRequest(offerIds: ["offerIds_example"]) // DeleteOffersFromArchiveRequest | 

// Удаление товаров из архива
BusinessOfferMappingsAPI.deleteOffersFromArchive(businessId: businessId, deleteOffersFromArchiveRequest: deleteOffersFromArchiveRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **Int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **deleteOffersFromArchiveRequest** | [**DeleteOffersFromArchiveRequest**](DeleteOffersFromArchiveRequest.md) |  | 

### Return type

[**DeleteOffersFromArchiveResponse**](DeleteOffersFromArchiveResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getOfferMappings**
```swift
    open class func getOfferMappings(businessId: Int64, pageToken: String? = nil, limit: Int? = nil, getOfferMappingsRequest: GetOfferMappingsRequest? = nil, completion: @escaping (_ data: GetOfferMappingsResponse?, _ error: Error?) -> Void)
```

Информация о товарах в каталоге

Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = 987 // Int64 | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
let pageToken = "pageToken_example" // String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
let limit = 987 // Int | Количество значений на одной странице.  (optional)
let getOfferMappingsRequest = GetOfferMappingsRequest(offerIds: ["offerIds_example"], cardStatuses: [OfferCardStatusType()], categoryIds: [123], vendorNames: ["vendorNames_example"], tags: ["tags_example"], archived: false) // GetOfferMappingsRequest |  (optional)

// Информация о товарах в каталоге
BusinessOfferMappingsAPI.getOfferMappings(businessId: businessId, pageToken: pageToken, limit: limit, getOfferMappingsRequest: getOfferMappingsRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **Int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **pageToken** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **Int** | Количество значений на одной странице.  | [optional] 
 **getOfferMappingsRequest** | [**GetOfferMappingsRequest**](GetOfferMappingsRequest.md) |  | [optional] 

### Return type

[**GetOfferMappingsResponse**](GetOfferMappingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSuggestedOfferMappings**
```swift
    open class func getSuggestedOfferMappings(businessId: Int64, getSuggestedOfferMappingsRequest: GetSuggestedOfferMappingsRequest? = nil, completion: @escaping (_ data: GetSuggestedOfferMappingsResponse?, _ error: Error?) -> Void)
```

Просмотр карточек на Маркете, которые подходят вашим товарам

Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида `https://market.yandex.ru/product/<marketModelId>?sku=<marketSku>`. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать `marketSKU`, который ему подходит по вашему мнению.  {% note info \"𝓠 Как определить `marketSku` товара, найденного на Маркете?\" %}  𝓐 Он есть в адресе страницы товара — расположен после `sku=`.  Например, `https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016`  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = 987 // Int64 | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
let getSuggestedOfferMappingsRequest = GetSuggestedOfferMappingsRequest(offers: [SuggestedOfferDTO(offerId: "offerId_example", name: "name_example", category: "category_example", vendor: "vendor_example", barcodes: ["barcodes_example"], description: "description_example", vendorCode: "vendorCode_example", basicPrice: BasePriceDTO(value: 123, currencyId: CurrencyType()))]) // GetSuggestedOfferMappingsRequest |  (optional)

// Просмотр карточек на Маркете, которые подходят вашим товарам
BusinessOfferMappingsAPI.getSuggestedOfferMappings(businessId: businessId, getSuggestedOfferMappingsRequest: getSuggestedOfferMappingsRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **Int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **getSuggestedOfferMappingsRequest** | [**GetSuggestedOfferMappingsRequest**](GetSuggestedOfferMappingsRequest.md) |  | [optional] 

### Return type

[**GetSuggestedOfferMappingsResponse**](GetSuggestedOfferMappingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateOfferMappings**
```swift
    open class func updateOfferMappings(businessId: Int64, updateOfferMappingsRequest: UpdateOfferMappingsRequest, completion: @escaping (_ data: UpdateOfferMappingsResponse?, _ error: Error?) -> Void)
```

Добавление товаров в каталог и изменение информации о них

Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле `marketSKU`.  Для **новых товаров** обязательно укажите параметры: `offerId`, `name`, `marketCategoryId` или `category`, `pictures`, `vendor`, `description`.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в `offerId` соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом `string`, передайте пустое значение.  Параметр `offerId` должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \"Правила использования SKU\" %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = 987 // Int64 | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
let updateOfferMappingsRequest = UpdateOfferMappingsRequest(offerMappings: [UpdateOfferMappingDTO(offer: UpdateOfferDTO(offerId: "offerId_example", name: "name_example", marketCategoryId: 123, category: "category_example", pictures: ["pictures_example"], videos: ["videos_example"], manuals: [OfferManualDTO(url: "url_example", title: "title_example")], vendor: "vendor_example", barcodes: ["barcodes_example"], description: "description_example", manufacturerCountries: ["manufacturerCountries_example"], weightDimensions: OfferWeightDimensionsDTO(length: 123, width: 123, height: 123, weight: 123), vendorCode: "vendorCode_example", tags: ["tags_example"], shelfLife: TimePeriodDTO(timePeriod: 123, timeUnit: TimeUnitType(), comment: "comment_example"), lifeTime: nil, guaranteePeriod: nil, customsCommodityCode: "customsCommodityCode_example", certificates: ["certificates_example"], boxCount: 123, condition: OfferConditionDTO(type: OfferConditionType(), quality: OfferConditionQualityType(), reason: "reason_example"), type: OfferType(), downloadable: false, adult: false, age: AgeDTO(value: 123, ageUnit: AgeUnitType()), params: [OfferParamDTO(name: "name_example", value: "value_example")], parameterValues: [ParameterValueDTO(parameterId: 123, unitId: 123, valueId: 123, value: "value_example")], basicPrice: UpdatePriceWithDiscountDTO(value: 123, currencyId: CurrencyType(), discountBase: 123), purchasePrice: BasePriceDTO(value: 123, currencyId: nil), additionalExpenses: nil, cofinancePrice: nil), mapping: UpdateMappingDTO(marketSku: 123))], onlyPartnerMediaContent: false) // UpdateOfferMappingsRequest | 

// Добавление товаров в каталог и изменение информации о них
BusinessOfferMappingsAPI.updateOfferMappings(businessId: businessId, updateOfferMappingsRequest: updateOfferMappingsRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **Int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **updateOfferMappingsRequest** | [**UpdateOfferMappingsRequest**](UpdateOfferMappingsRequest.md) |  | 

### Return type

[**UpdateOfferMappingsResponse**](UpdateOfferMappingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

