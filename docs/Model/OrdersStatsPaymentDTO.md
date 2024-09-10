# OrdersStatsPaymentDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Идентификатор денежного перевода. | [optional] 
**date** | [**\DateTime**](Date.md) | Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. | [optional] 
**type** | [**OpenAPI\Server\Model\OrdersStatsPaymentType**](OrdersStatsPaymentType.md) |  | [optional] 
**source** | [**OpenAPI\Server\Model\OrdersStatsPaymentSourceType**](OrdersStatsPaymentSourceType.md) |  | [optional] 
**total** | **float** | Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. | [optional] 
**paymentOrder** | [**OpenAPI\Server\Model\OrdersStatsPaymentOrderDTO**](OrdersStatsPaymentOrderDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


