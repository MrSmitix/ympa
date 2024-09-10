# OrderDeliveryDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  | [optional] 
**Type** | [**OrderDeliveryType**](OrderDeliveryType.md) |  | [optional] 
**ServiceName** | **String** | Наименование службы доставки. | [optional] 
**Price** | **Decimal** | {% note warning &quot;&quot;&quot;&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа.  | [optional] 
**DeliveryPartnerType** | [**OrderDeliveryPartnerType**](OrderDeliveryPartnerType.md) |  | [optional] 
**Courier** | [**OrderCourierDTO**](OrderCourierDTO.md) |  | [optional] 
**Dates** | [**OrderDeliveryDatesDTO**](OrderDeliveryDatesDTO.md) |  | [optional] 
**Region** | [**RegionDTO**](RegionDTO.md) |  | [optional] 
**Address** | [**OrderDeliveryAddressDTO**](OrderDeliveryAddressDTO.md) |  | [optional] 
**Vat** | [**OrderVatType**](OrderVatType.md) |  | [optional] 
**DeliveryServiceId** | **Int64** | Идентификатор службы доставки. | [optional] 
**LiftType** | [**OrderLiftType**](OrderLiftType.md) |  | [optional] 
**LiftPrice** | **Decimal** | Стоимость подъема на этаж. | [optional] 
**OutletCode** | **String** | Идентификатор пункта самовывоза, присвоенный магазином. | [optional] 
**OutletStorageLimitDate** | **String** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 
**DispatchType** | [**OrderDeliveryDispatchType**](OrderDeliveryDispatchType.md) |  | [optional] 
**Tracks** | [**OrderTrackDTO[]**](OrderTrackDTO.md) | Информация для отслеживания перемещений посылки. | [optional] 
**Shipments** | [**OrderShipmentDTO[]**](OrderShipmentDTO.md) | Информация о посылках. | [optional] 
**Estimated** | **Boolean** | Приблизительная ли дата доставки. | [optional] 
**EacType** | [**OrderDeliveryEacType**](OrderDeliveryEacType.md) |  | [optional] 
**EacCode** | **String** | Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;).  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderDeliveryDTO = Initialize-ympa_powershell_clientOrderDeliveryDTO  -Id null `
 -Type null `
 -ServiceName null `
 -Price null `
 -DeliveryPartnerType null `
 -Courier null `
 -Dates null `
 -Region null `
 -Address null `
 -Vat null `
 -DeliveryServiceId null `
 -LiftType null `
 -LiftPrice null `
 -OutletCode null `
 -OutletStorageLimitDate 23-09-2022 `
 -DispatchType null `
 -Tracks null `
 -Shipments null `
 -Estimated null `
 -EacType null `
 -EacCode null
```

- Convert the resource to JSON
```powershell
$OrderDeliveryDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

