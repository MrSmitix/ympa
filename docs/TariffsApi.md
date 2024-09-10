# ympa_powershell_client.ympa_powershell_client\Api.TariffsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Measure-Tariffs**](TariffsApi.md#Measure-Tariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг


<a id="Measure-Tariffs"></a>
# **Measure-Tariffs**
> CalculateTariffsResponse Measure-Tariffs<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CalculateTariffsRequest] <PSCustomObject><br>

Калькулятор стоимости услуг

Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CalculateTariffsParametersDTO = Initialize-CalculateTariffsParametersDTO -CampaignId 0 -SellingProgram "FBY" -Frequency "DAILY"
$CalculateTariffsOfferDTO = Initialize-CalculateTariffsOfferDTO -CategoryId 0 -Price 0 -Length 0 -Width 0 -Height 0 -Weight 0 -Quantity 0
$CalculateTariffsRequest = Initialize-CalculateTariffsRequest -Parameters $CalculateTariffsParametersDTO -Offers $CalculateTariffsOfferDTO # CalculateTariffsRequest | 

# Калькулятор стоимости услуг
try {
    $Result = Measure-Tariffs -CalculateTariffsRequest $CalculateTariffsRequest
} catch {
    Write-Host ("Exception occurred when calling Measure-Tariffs: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CalculateTariffsRequest** | [**CalculateTariffsRequest**](CalculateTariffsRequest.md)|  | 

### Return type

[**CalculateTariffsResponse**](CalculateTariffsResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

