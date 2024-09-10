# WWW::OpenAPIClient::Object::CalculateTariffsParametersDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CalculateTariffsParametersDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_id** | **int** | Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр &#x60;campaignId&#x60;, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  | [optional] 
**selling_program** | [**SellingProgramType**](SellingProgramType.md) |  | [optional] 
**frequency** | [**PaymentFrequencyType**](PaymentFrequencyType.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


