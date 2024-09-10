# OpenapiClient::CalculateTariffsParametersDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр &#x60;campaignId&#x60;, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  | [optional] |
| **selling_program** | [**SellingProgramType**](SellingProgramType.md) |  | [optional] |
| **frequency** | [**PaymentFrequencyType**](PaymentFrequencyType.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::CalculateTariffsParametersDTO.new(
  campaign_id: null,
  selling_program: null,
  frequency: null
)
```

