# ympa_powershell_client.ympa_powershell_client\Api.OutletsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**New-Outlet**](OutletsApi.md#New-Outlet) | **POST** /campaigns/{campaignId}/outlets | Создание точки продаж
[**Invoke-DeleteOutlet**](OutletsApi.md#Invoke-DeleteOutlet) | **DELETE** /campaigns/{campaignId}/outlets/{outletId} | Удаление точки продаж
[**Get-Outlet**](OutletsApi.md#Get-Outlet) | **GET** /campaigns/{campaignId}/outlets/{outletId} | Информация об одной точке продаж
[**Get-Outlets**](OutletsApi.md#Get-Outlets) | **GET** /campaigns/{campaignId}/outlets | Информация о нескольких точках продаж
[**Update-Outlet**](OutletsApi.md#Update-Outlet) | **PUT** /campaigns/{campaignId}/outlets/{outletId} | Изменение информации о точке продаж


<a id="New-Outlet"></a>
# **New-Outlet**
> CreateOutletResponse New-Outlet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignId] <Int64><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ChangeOutletRequest] <PSCustomObject><br>

Создание точки продаж

Создает точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CampaignId = 789 # Int64 | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
$OutletAddressDTO = Initialize-OutletAddressDTO -RegionId 0 -Street "MyStreet" -Number "MyNumber" -Building "MyBuilding" -Estate "MyEstate" -Block "MyBlock" -Additional "MyAdditional" -Km 0 -City "MyCity"

$OutletWorkingScheduleItemDTO = Initialize-OutletWorkingScheduleItemDTO -StartDay "MONDAY" -EndDay "MONDAY" -StartTime "MyStartTime" -EndTime "MyEndTime"
$OutletWorkingScheduleDTO = Initialize-OutletWorkingScheduleDTO -WorkInHoliday $false -ScheduleItems $OutletWorkingScheduleItemDTO

$OutletDeliveryRuleDTO = Initialize-OutletDeliveryRuleDTO -MinDeliveryDays 0 -MaxDeliveryDays 0 -DeliveryServiceId 0 -OrderBefore 0 -PriceFreePickup 0 -UnspecifiedDeliveryInterval $false
$ChangeOutletRequest = Initialize-ChangeOutletRequest -Name "MyName" -Type "DEPOT" -Coords "MyCoords" -IsMain $false -ShopOutletCode "MyShopOutletCode" -Visibility "HIDDEN" -Address $OutletAddressDTO -Phones "MyPhones" -WorkingSchedule $OutletWorkingScheduleDTO -DeliveryRules $OutletDeliveryRuleDTO -StoragePeriod 0 # ChangeOutletRequest | 

# Создание точки продаж
try {
    $Result = New-Outlet -CampaignId $CampaignId -ChangeOutletRequest $ChangeOutletRequest
} catch {
    Write-Host ("Exception occurred when calling New-Outlet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CampaignId** | **Int64**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **ChangeOutletRequest** | [**ChangeOutletRequest**](ChangeOutletRequest.md)|  | 

### Return type

[**CreateOutletResponse**](CreateOutletResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-DeleteOutlet"></a>
# **Invoke-DeleteOutlet**
> EmptyApiResponse Invoke-DeleteOutlet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignId] <Int64><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OutletId] <Int64><br>

Удаление точки продаж

Удаляет точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CampaignId = 789 # Int64 | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
$OutletId = 789 # Int64 | Идентификатор точки продаж.

# Удаление точки продаж
try {
    $Result = Invoke-DeleteOutlet -CampaignId $CampaignId -OutletId $OutletId
} catch {
    Write-Host ("Exception occurred when calling Invoke-DeleteOutlet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CampaignId** | **Int64**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **OutletId** | **Int64**| Идентификатор точки продаж. | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-Outlet"></a>
# **Get-Outlet**
> GetOutletResponse Get-Outlet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignId] <Int64><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OutletId] <Int64><br>

Информация об одной точке продаж

Возвращает информацию о точках продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CampaignId = 789 # Int64 | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
$OutletId = 789 # Int64 | Идентификатор точки продаж.

# Информация об одной точке продаж
try {
    $Result = Get-Outlet -CampaignId $CampaignId -OutletId $OutletId
} catch {
    Write-Host ("Exception occurred when calling Get-Outlet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CampaignId** | **Int64**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **OutletId** | **Int64**| Идентификатор точки продаж. | 

### Return type

[**GetOutletResponse**](GetOutletResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-Outlets"></a>
# **Get-Outlets**
> GetOutletsResponse Get-Outlets<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignId] <Int64><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageToken] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-RegionId] <System.Nullable[Int64]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ShopOutletCode] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-RegionId2] <System.Nullable[Int64]><br>

Информация о нескольких точках продаж

Возвращает список точек продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CampaignId = 789 # Int64 | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
$PageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==" # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
$RegionId = 789 # Int64 | Идентификатор региона. Если задать идентификатор родительского региона любого уровня, в выходных данных будут отображены точки продаж всех дочерних регионов. Идентификатор региона можно получить c помощью метода [GET regions](../../reference/regions/searchRegionsByName.md).  (optional)
$ShopOutletCode = "MyShopOutletCode" # String | Идентификатор точки продаж, присвоенный магазином. (optional)
$RegionId2 = 789 # Int64 | {% note warning """" %}  Этот параметр устарел. Для указания региона используйте `region_id`.  {% endnote %}  (optional)

# Информация о нескольких точках продаж
try {
    $Result = Get-Outlets -CampaignId $CampaignId -PageToken $PageToken -RegionId $RegionId -ShopOutletCode $ShopOutletCode -RegionId2 $RegionId2
} catch {
    Write-Host ("Exception occurred when calling Get-Outlets: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CampaignId** | **Int64**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **PageToken** | **String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **RegionId** | **Int64**| Идентификатор региона. Если задать идентификатор родительского региона любого уровня, в выходных данных будут отображены точки продаж всех дочерних регионов. Идентификатор региона можно получить c помощью метода [GET regions](../../reference/regions/searchRegionsByName.md).  | [optional] 
 **ShopOutletCode** | **String**| Идентификатор точки продаж, присвоенный магазином. | [optional] 
 **RegionId2** | **Int64**| {% note warning &quot;&quot;&quot;&quot; %}  Этот параметр устарел. Для указания региона используйте &#x60;region_id&#x60;.  {% endnote %}  | [optional] 

### Return type

[**GetOutletsResponse**](GetOutletsResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Update-Outlet"></a>
# **Update-Outlet**
> EmptyApiResponse Update-Outlet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignId] <Int64><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OutletId] <Int64><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ChangeOutletRequest] <PSCustomObject><br>

Изменение информации о точке продаж

Изменяет информацию о точке продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CampaignId = 789 # Int64 | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
$OutletId = 789 # Int64 | Идентификатор точки продаж.
$OutletAddressDTO = Initialize-OutletAddressDTO -RegionId 0 -Street "MyStreet" -Number "MyNumber" -Building "MyBuilding" -Estate "MyEstate" -Block "MyBlock" -Additional "MyAdditional" -Km 0 -City "MyCity"

$OutletWorkingScheduleItemDTO = Initialize-OutletWorkingScheduleItemDTO -StartDay "MONDAY" -EndDay "MONDAY" -StartTime "MyStartTime" -EndTime "MyEndTime"
$OutletWorkingScheduleDTO = Initialize-OutletWorkingScheduleDTO -WorkInHoliday $false -ScheduleItems $OutletWorkingScheduleItemDTO

$OutletDeliveryRuleDTO = Initialize-OutletDeliveryRuleDTO -MinDeliveryDays 0 -MaxDeliveryDays 0 -DeliveryServiceId 0 -OrderBefore 0 -PriceFreePickup 0 -UnspecifiedDeliveryInterval $false
$ChangeOutletRequest = Initialize-ChangeOutletRequest -Name "MyName" -Type "DEPOT" -Coords "MyCoords" -IsMain $false -ShopOutletCode "MyShopOutletCode" -Visibility "HIDDEN" -Address $OutletAddressDTO -Phones "MyPhones" -WorkingSchedule $OutletWorkingScheduleDTO -DeliveryRules $OutletDeliveryRuleDTO -StoragePeriod 0 # ChangeOutletRequest | 

# Изменение информации о точке продаж
try {
    $Result = Update-Outlet -CampaignId $CampaignId -OutletId $OutletId -ChangeOutletRequest $ChangeOutletRequest
} catch {
    Write-Host ("Exception occurred when calling Update-Outlet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CampaignId** | **Int64**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **OutletId** | **Int64**| Идентификатор точки продаж. | 
 **ChangeOutletRequest** | [**ChangeOutletRequest**](ChangeOutletRequest.md)|  | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

