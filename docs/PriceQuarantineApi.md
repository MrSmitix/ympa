# ympa_powershell_client.ympa_powershell_client\Api.PriceQuarantineApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Confirm-BusinessPrices**](PriceQuarantineApi.md#Confirm-BusinessPrices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
[**Confirm-CampaignPrices**](PriceQuarantineApi.md#Confirm-CampaignPrices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
[**Get-BusinessQuarantineOffers**](PriceQuarantineApi.md#Get-BusinessQuarantineOffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
[**Get-CampaignQuarantineOffers**](PriceQuarantineApi.md#Get-CampaignQuarantineOffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине


<a id="Confirm-BusinessPrices"></a>
# **Confirm-BusinessPrices**
> EmptyApiResponse Confirm-BusinessPrices<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <Int64><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ConfirmPricesRequest] <PSCustomObject><br>

Удаление товара из карантина по цене в кабинете

Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = 789 # Int64 | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
$ConfirmPricesRequest = Initialize-ConfirmPricesRequest -OfferIds "MyOfferIds" # ConfirmPricesRequest | 

# Удаление товара из карантина по цене в кабинете
try {
    $Result = Confirm-BusinessPrices -BusinessId $BusinessId -ConfirmPricesRequest $ConfirmPricesRequest
} catch {
    Write-Host ("Exception occurred when calling Confirm-BusinessPrices: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **Int64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **ConfirmPricesRequest** | [**ConfirmPricesRequest**](ConfirmPricesRequest.md)|  | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Confirm-CampaignPrices"></a>
# **Confirm-CampaignPrices**
> EmptyApiResponse Confirm-CampaignPrices<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignId] <Int64><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ConfirmPricesRequest] <PSCustomObject><br>

Удаление товара из карантина по цене в магазине

Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CampaignId = 789 # Int64 | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
$ConfirmPricesRequest = Initialize-ConfirmPricesRequest -OfferIds "MyOfferIds" # ConfirmPricesRequest | 

# Удаление товара из карантина по цене в магазине
try {
    $Result = Confirm-CampaignPrices -CampaignId $CampaignId -ConfirmPricesRequest $ConfirmPricesRequest
} catch {
    Write-Host ("Exception occurred when calling Confirm-CampaignPrices: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CampaignId** | **Int64**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **ConfirmPricesRequest** | [**ConfirmPricesRequest**](ConfirmPricesRequest.md)|  | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-BusinessQuarantineOffers"></a>
# **Get-BusinessQuarantineOffers**
> GetQuarantineOffersResponse Get-BusinessQuarantineOffers<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <Int64><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GetQuarantineOffersRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageToken] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>

Список товаров, находящихся в карантине по цене в кабинете

Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info ""𝓠 Что такое карантин?"" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = 789 # Int64 | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
$GetQuarantineOffersRequest = Initialize-GetQuarantineOffersRequest -OfferIds "MyOfferIds" -CardStatuses "HAS_CARD_CAN_NOT_UPDATE" -CategoryIds 0 -VendorNames "MyVendorNames" -Tags "MyTags" # GetQuarantineOffersRequest | 
$PageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==" # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
$Limit = 20 # Int32 | Количество значений на одной странице.  (optional)

# Список товаров, находящихся в карантине по цене в кабинете
try {
    $Result = Get-BusinessQuarantineOffers -BusinessId $BusinessId -GetQuarantineOffersRequest $GetQuarantineOffersRequest -PageToken $PageToken -Limit $Limit
} catch {
    Write-Host ("Exception occurred when calling Get-BusinessQuarantineOffers: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **Int64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **GetQuarantineOffersRequest** | [**GetQuarantineOffersRequest**](GetQuarantineOffersRequest.md)|  | 
 **PageToken** | **String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **Limit** | **Int32**| Количество значений на одной странице.  | [optional] 

### Return type

[**GetQuarantineOffersResponse**](GetQuarantineOffersResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-CampaignQuarantineOffers"></a>
# **Get-CampaignQuarantineOffers**
> GetQuarantineOffersResponse Get-CampaignQuarantineOffers<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignId] <Int64><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GetQuarantineOffersRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageToken] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>

Список товаров, находящихся в карантине по цене в магазине

Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info ""𝓠 Что такое карантин?"" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CampaignId = 789 # Int64 | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
$GetQuarantineOffersRequest = Initialize-GetQuarantineOffersRequest -OfferIds "MyOfferIds" -CardStatuses "HAS_CARD_CAN_NOT_UPDATE" -CategoryIds 0 -VendorNames "MyVendorNames" -Tags "MyTags" # GetQuarantineOffersRequest | 
$PageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==" # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
$Limit = 20 # Int32 | Количество значений на одной странице.  (optional)

# Список товаров, находящихся в карантине по цене в магазине
try {
    $Result = Get-CampaignQuarantineOffers -CampaignId $CampaignId -GetQuarantineOffersRequest $GetQuarantineOffersRequest -PageToken $PageToken -Limit $Limit
} catch {
    Write-Host ("Exception occurred when calling Get-CampaignQuarantineOffers: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CampaignId** | **Int64**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **GetQuarantineOffersRequest** | [**GetQuarantineOffersRequest**](GetQuarantineOffersRequest.md)|  | 
 **PageToken** | **String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **Limit** | **Int32**| Количество значений на одной странице.  | [optional] 

### Return type

[**GetQuarantineOffersResponse**](GetQuarantineOffersResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

