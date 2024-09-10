# BriefOrderItemDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  | [optional] 
**Vat** | [**OrderVatType**](OrderVatType.md) |  | [optional] 
**Count** | **Int32** | Количество единиц товара. | [optional] 
**Price** | **Decimal** | Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка.  | [optional] 
**OfferName** | **String** | Название товара. | [optional] 
**OfferId** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**Instances** | [**OrderItemInstanceDTO[]**](OrderItemInstanceDTO.md) | Переданные вами коды маркировки. | [optional] 

## Examples

- Prepare the resource
```powershell
$BriefOrderItemDTO = Initialize-ympa_powershell_clientBriefOrderItemDTO  -Id null `
 -Vat null `
 -Count null `
 -Price null `
 -OfferName null `
 -OfferId null `
 -Instances null
```

- Convert the resource to JSON
```powershell
$BriefOrderItemDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

