# OAIOrdersStatsPaymentDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSString*** | Идентификатор денежного перевода. | [optional] 
**date** | **NSDate*** | Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**type** | [**OAIOrdersStatsPaymentType***](OAIOrdersStatsPaymentType.md) |  | [optional] 
**source** | [**OAIOrdersStatsPaymentSourceType***](OAIOrdersStatsPaymentSourceType.md) |  | [optional] 
**total** | **NSNumber*** | Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  | [optional] 
**paymentOrder** | [**OAIOrdersStatsPaymentOrderDTO***](OAIOrdersStatsPaymentOrderDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


