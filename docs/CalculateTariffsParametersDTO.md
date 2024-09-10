# ympa_r_client::CalculateTariffsParametersDTO

Параметры для расчета стоимости услуг.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | **integer** | Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр &#x60;campaignId&#x60;, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  | [optional] 
**sellingProgram** | [**SellingProgramType**](SellingProgramType.md) |  | [optional] [Enum: ] 
**frequency** | [**PaymentFrequencyType**](PaymentFrequencyType.md) |  | [optional] [Enum: ] 


