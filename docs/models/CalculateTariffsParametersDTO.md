

# CalculateTariffsParametersDTO

Параметры для расчета стоимости услуг.

The class is defined in **[CalculateTariffsParametersDTO.java](../../src/main/java/org/openapitools/model/CalculateTariffsParametersDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | `Long` | Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр &#x60;campaignId&#x60;, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |  [optional property]
**sellingProgram** | `SellingProgramType` |  |  [optional property]
**frequency** | `PaymentFrequencyType` |  |  [optional property]





