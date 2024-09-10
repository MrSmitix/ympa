# ympa_powershell_client.ympa_powershell_client\Api.CategoriesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Get-CategoriesMaxSaleQuantum**](CategoriesApi.md#Get-CategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
[**Get-CategoriesTree**](CategoriesApi.md#Get-CategoriesTree) | **POST** /categories/tree | Дерево категорий


<a id="Get-CategoriesMaxSaleQuantum"></a>
# **Get-CategoriesMaxSaleQuantum**
> GetCategoriesMaxSaleQuantumResponse Get-CategoriesMaxSaleQuantum<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GetCategoriesMaxSaleQuantumRequest] <PSCustomObject><br>

Лимит на установку кванта продажи и минимального количества товаров в заказе

Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$GetCategoriesMaxSaleQuantumRequest = Initialize-GetCategoriesMaxSaleQuantumRequest -MarketCategoryIds 0 # GetCategoriesMaxSaleQuantumRequest | 

# Лимит на установку кванта продажи и минимального количества товаров в заказе
try {
    $Result = Get-CategoriesMaxSaleQuantum -GetCategoriesMaxSaleQuantumRequest $GetCategoriesMaxSaleQuantumRequest
} catch {
    Write-Host ("Exception occurred when calling Get-CategoriesMaxSaleQuantum: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **GetCategoriesMaxSaleQuantumRequest** | [**GetCategoriesMaxSaleQuantumRequest**](GetCategoriesMaxSaleQuantumRequest.md)|  | 

### Return type

[**GetCategoriesMaxSaleQuantumResponse**](GetCategoriesMaxSaleQuantumResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-CategoriesTree"></a>
# **Get-CategoriesTree**
> GetCategoriesResponse Get-CategoriesTree<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GetCategoriesRequest] <PSCustomObject><br>

Дерево категорий

Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$GetCategoriesRequest = Initialize-GetCategoriesRequest -Language "RU" # GetCategoriesRequest |  (optional)

# Дерево категорий
try {
    $Result = Get-CategoriesTree -GetCategoriesRequest $GetCategoriesRequest
} catch {
    Write-Host ("Exception occurred when calling Get-CategoriesTree: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **GetCategoriesRequest** | [**GetCategoriesRequest**](GetCategoriesRequest.md)|  | [optional] 

### Return type

[**GetCategoriesResponse**](GetCategoriesResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

