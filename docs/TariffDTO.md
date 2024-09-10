

# TariffDTO

Информация о тарифах, по которым нужно заплатить за услуги Маркета.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **TariffType** |  |  |
|**percent** | **BigDecimal** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах.  |  [optional] |
|**amount** | **BigDecimal** | Значение тарифа в рублях. |  |
|**parameters** | [**List&lt;TariffParameterDTO&gt;**](TariffParameterDTO.md) | Параметры расчета тарифа. |  |



