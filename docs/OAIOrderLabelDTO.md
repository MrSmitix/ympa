# OAIOrderLabelDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **NSNumber*** | Идентификатор заказа. | 
**placesNumber** | **NSNumber*** | Количество коробок в заказе. | 
**url** | **NSString*** | URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  | 
**parcelBoxLabels** | [**NSArray&lt;OAIParcelBoxLabelDTO&gt;***](OAIParcelBoxLabelDTO.md) | Информация на ярлыке. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


