# TariffDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**r#type** | [**models::TariffType**](TariffType.md) |  | 
**percent** | Option<**f64**> | {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах.  | [optional]
**amount** | **f64** | Значение тарифа в рублях. | 
**parameters** | [**Vec<models::TariffParameterDto>**](TariffParameterDTO.md) | Параметры расчета тарифа. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


