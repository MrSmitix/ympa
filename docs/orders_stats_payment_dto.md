# orders_stats_payment_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** | Идентификатор денежного перевода. | [optional] 
**date** | **char \*** | Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**type** | **orders_stats_payment_type_t \*** |  | [optional] 
**source** | **orders_stats_payment_source_type_t \*** |  | [optional] 
**total** | **double** | Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  | [optional] 
**payment_order** | [**orders_stats_payment_order_dto_t**](orders_stats_payment_order_dto.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


