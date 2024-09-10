# openapi.model.BaseShipmentDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор отгрузки. | [optional] 
**planIntervalFrom** | [**DateTime**](DateTime.md) | Начало планового интервала отгрузки. | [optional] 
**planIntervalTo** | [**DateTime**](DateTime.md) | Конец планового интервала отгрузки. | [optional] 
**shipmentType** | [**ShipmentType**](ShipmentType.md) |  | [optional] 
**warehouse** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] 
**warehouseTo** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] 
**externalId** | **String** | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`. | [optional] 
**deliveryService** | [**DeliveryServiceDTO**](DeliveryServiceDTO.md) |  | [optional] 
**palletsCount** | [**PalletsCountDTO**](PalletsCountDTO.md) |  | [optional] 
**orderIds** | **Set<int>** | Идентификаторы заказов в отгрузке. | [default to const {}]
**draftCount** | **int** | Количество заказов, которое Маркет запланировал к отгрузке. | [optional] 
**plannedCount** | **int** | Количество заказов, которое Маркет подтвердил к отгрузке. | [optional] 
**factCount** | **int** | Количество заказов, принятых в сортировочном центре или пункте приема. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


