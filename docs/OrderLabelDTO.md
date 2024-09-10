# WWW::OpenAPIClient::Object::OrderLabelDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::OrderLabelDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**order_id** | **int** | Идентификатор заказа. | 
**places_number** | **int** | Количество коробок в заказе. | 
**url** | **string** | URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  | 
**parcel_box_labels** | [**ARRAY[ParcelBoxLabelDTO]**](ParcelBoxLabelDTO.md) | Информация на ярлыке. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


