# OrdersStatsOrderDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор заказа. | [optional] 
**CreationDate** | **System.DateTime** | Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**StatusUpdateDate** | **System.DateTime** | Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва).  | [optional] 
**Status** | [**OrderStatsStatusType**](OrderStatsStatusType.md) |  | [optional] 
**PartnerOrderId** | **String** | Идентификатор заказа в информационной системе магазина. | [optional] 
**PaymentType** | [**OrdersStatsOrderPaymentType**](OrdersStatsOrderPaymentType.md) |  | [optional] 
**Fake** | **Boolean** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] 
**DeliveryRegion** | [**OrdersStatsDeliveryRegionDTO**](OrdersStatsDeliveryRegionDTO.md) |  | [optional] 
**Items** | [**OrdersStatsItemDTO[]**](OrdersStatsItemDTO.md) | Список товаров в заказе после возможных изменений. | 
**InitialItems** | [**OrdersStatsItemDTO[]**](OrdersStatsItemDTO.md) | Список товаров в заказе до изменений. | [optional] 
**Payments** | [**OrdersStatsPaymentDTO[]**](OrdersStatsPaymentDTO.md) | Информация о денежных переводах по заказу. | 
**Commissions** | [**OrdersStatsCommissionDTO[]**](OrdersStatsCommissionDTO.md) | Информация о комиссиях за заказ. | 

## Examples

- Prepare the resource
```powershell
$OrdersStatsOrderDTO = Initialize-ympa_powershell_clientOrdersStatsOrderDTO  -Id null `
 -CreationDate null `
 -StatusUpdateDate null `
 -Status null `
 -PartnerOrderId null `
 -PaymentType null `
 -Fake null `
 -DeliveryRegion null `
 -Items null `
 -InitialItems null `
 -Payments null `
 -Commissions null
```

- Convert the resource to JSON
```powershell
$OrdersStatsOrderDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

