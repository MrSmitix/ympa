# ympa_csharp_client.Model.OrdersStatsPaymentDTO
Информация о денежных переводах по заказу.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Идентификатор денежного перевода. | [optional] 
**Date** | **DateOnly** | Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**Type** | **OrdersStatsPaymentType** |  | [optional] 
**Source** | **OrdersStatsPaymentSourceType** |  | [optional] 
**Total** | **decimal** | Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  | [optional] 
**PaymentOrder** | [**OrdersStatsPaymentOrderDTO**](OrdersStatsPaymentOrderDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

