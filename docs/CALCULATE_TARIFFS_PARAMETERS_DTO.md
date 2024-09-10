# CALCULATE_TARIFFS_PARAMETERS_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_id** | **INTEGER_64** | Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр &#x60;campaignId&#x60;, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  | [optional] [default to null]
**selling_program** | [**SELLING_PROGRAM_TYPE**](SellingProgramType.md) |  | [optional] [default to null]
**frequency** | [**PAYMENT_FREQUENCY_TYPE**](PaymentFrequencyType.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


