

# TariffDTO

Информация о тарифах, по которым нужно заплатить за услуги Маркета.

The class is defined in **[TariffDTO.java](../../src/main/java/org/openapitools/model/TariffDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | `TariffType` |  | 
**percent** | `BigDecimal` | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах.  |  [optional property]
**amount** | `BigDecimal` | Значение тарифа в рублях. | 
**parameters** | [`List&lt;TariffParameterDTO&gt;`](TariffParameterDTO.md) | Параметры расчета тарифа. | 






