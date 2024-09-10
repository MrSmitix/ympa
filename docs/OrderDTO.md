# OrderDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** |  | [optional] [default to null]
**status** | [**OrderStatusType**](OrderStatusType.md) |  | [optional] [default to null]
**substatus** | [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] [default to null]
**creationDate** | **string** |  | [optional] [default to null]
**updatedAt** | **string** |  | [optional] [default to null]
**currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] [default to null]
**itemsTotal** | **integer** |  | [optional] [default to null]
**deliveryTotal** | **integer** |  | [optional] [default to null]
**buyerItemsTotal** | **integer** |  | [optional] [default to null]
**buyerTotal** | **integer** |  | [optional] [default to null]
**buyerItemsTotalBeforeDiscount** | **integer** |  | [optional] [default to null]
**buyerTotalBeforeDiscount** | **integer** |  | [optional] [default to null]
**paymentType** | [**OrderPaymentType**](OrderPaymentType.md) |  | [optional] [default to null]
**paymentMethod** | [**OrderPaymentMethodType**](OrderPaymentMethodType.md) |  | [optional] [default to null]
**fake** | **boolean** |  | [optional] [default to null]
**items** | [**array[OrderItemDTO]**](OrderItemDTO.md) |  | [default to null]
**subsidies** | [**array[OrderSubsidyDTO]**](OrderSubsidyDTO.md) |  | [optional] [default to null]
**delivery** | [**OrderDeliveryDTO**](OrderDeliveryDTO.md) |  | [optional] [default to null]
**buyer** | [**OrderBuyerDTO**](OrderBuyerDTO.md) |  | [optional] [default to null]
**notes** | **string** |  | [optional] [default to null]
**taxSystem** | [**OrderTaxSystemType**](OrderTaxSystemType.md) |  | [optional] [default to null]
**cancelRequested** | **boolean** |  | [optional] [default to null]
**expiryDate** | **string** |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


