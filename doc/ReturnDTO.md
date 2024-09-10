# openapi.model.ReturnDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор возврата. | [optional] 
**orderId** | **int** | Номер заказа. | [optional] 
**creationDate** | [**DateTime**](DateTime.md) | Дата создания возврата клиентом. | [optional] 
**updateDate** | [**DateTime**](DateTime.md) | Дата обновления возврата. | [optional] 
**refundStatus** | [**RefundStatusType**](RefundStatusType.md) |  | [optional] 
**logisticPickupPoint** | [**LogisticPickupPointDTO**](LogisticPickupPointDTO.md) |  | [optional] 
**shipmentRecipientType** | [**RecipientType**](RecipientType.md) |  | [optional] 
**shipmentStatus** | [**ReturnShipmentStatusType**](ReturnShipmentStatusType.md) |  | [optional] 
**refundAmount** | **int** | Сумма возврата. | [optional] 
**items** | [**List<ReturnItemDTO>**](ReturnItemDTO.md) | Список товаров в возврате. | [default to const []]
**returnType** | [**ReturnType**](ReturnType.md) |  | [optional] 
**fastReturn** | **bool** | Используется ли опция **Быстрый возврат денег за дешевый брак**.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


