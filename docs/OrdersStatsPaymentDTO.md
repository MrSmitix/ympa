# WWW::OpenAPIClient::Object::OrdersStatsPaymentDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::OrdersStatsPaymentDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Идентификатор денежного перевода. | [optional] 
**date** | **DATE** | Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**type** | [**OrdersStatsPaymentType**](OrdersStatsPaymentType.md) |  | [optional] 
**source** | [**OrdersStatsPaymentSourceType**](OrdersStatsPaymentSourceType.md) |  | [optional] 
**total** | **double** | Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  | [optional] 
**payment_order** | [**OrdersStatsPaymentOrderDTO**](OrdersStatsPaymentOrderDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


