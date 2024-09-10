# OrdersStatsOrderDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** |  | [optional] [default to null]
**creationDate** | **string** |  | [optional] [default to null]
**statusUpdateDate** | **string** |  | [optional] [default to null]
**status** | [**OrderStatsStatusType**](OrderStatsStatusType.md) |  | [optional] [default to null]
**partnerOrderId** | **string** |  | [optional] [default to null]
**paymentType** | [**OrdersStatsOrderPaymentType**](OrdersStatsOrderPaymentType.md) |  | [optional] [default to null]
**fake** | **boolean** |  | [optional] [default to null]
**deliveryRegion** | [**OrdersStatsDeliveryRegionDTO**](OrdersStatsDeliveryRegionDTO.md) |  | [optional] [default to null]
**items** | [**array[OrdersStatsItemDTO]**](OrdersStatsItemDTO.md) |  | [default to null]
**initialItems** | [**array[OrdersStatsItemDTO]**](OrdersStatsItemDTO.md) |  | [optional] [default to null]
**payments** | [**array[OrdersStatsPaymentDTO]**](OrdersStatsPaymentDTO.md) |  | [default to null]
**commissions** | [**array[OrdersStatsCommissionDTO]**](OrdersStatsCommissionDTO.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


