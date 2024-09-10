# OrderBuyerInfoDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Идентификатор покупателя. | [optional] 
**LastName** | **String** | Фамилия покупателя. | [optional] 
**FirstName** | **String** | Имя покупателя. | [optional] 
**MiddleName** | **String** | Отчество покупателя. | [optional] 
**Type** | [**OrderBuyerType**](OrderBuyerType.md) |  | [optional] 
**Phone** | **String** | Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: &#x60;+&lt;код_страны&gt;&lt;код_региона&gt;&lt;номер_телефона&gt;&#x60;.  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderBuyerInfoDTO = Initialize-ympa_powershell_clientOrderBuyerInfoDTO  -Id null `
 -LastName null `
 -FirstName null `
 -MiddleName null `
 -Type null `
 -Phone null
```

- Convert the resource to JSON
```powershell
$OrderBuyerInfoDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

