# openapi.model.UpdateOrderStatusDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор заказа. | [optional] 
**status** | [**OrderStatusType**](OrderStatusType.md) |  | [optional] 
**substatus** | [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] 
**updateStatus** | [**OrderUpdateStatusType**](OrderUpdateStatusType.md) |  | [optional] 
**errorDetails** | **String** | Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


