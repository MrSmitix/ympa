# ympa_r_client::TariffDTO

Информация о тарифах, по которым нужно заплатить за услуги Маркета.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TariffType**](TariffType.md) |  | [Enum: ] 
**percent** | **numeric** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах.  | [optional] 
**amount** | **numeric** | Значение тарифа в рублях. | 
**parameters** | [**array[TariffParameterDTO]**](TariffParameterDTO.md) | Параметры расчета тарифа. | 


