
# Table `CalculateTariffsParametersDTO`
(mapped from: CalculateTariffsParametersDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**campaignId** | campaignId | long |  | **kotlin.Long** | Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр &#x60;campaignId&#x60;, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |  [optional]
**sellingProgram** | sellingProgram | long |  | [**SellingProgramType**](SellingProgramType.md) |  |  [optional] [foreignkey]
**frequency** | frequency | long |  | [**PaymentFrequencyType**](PaymentFrequencyType.md) |  |  [optional] [foreignkey]





