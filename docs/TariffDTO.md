# ympa_csharp_client.Model.TariffDTO
Информация о тарифах, по которым нужно заплатить за услуги Маркета.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **TariffType** |  | 
**Percent** | **decimal** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах.  | [optional] 
**Amount** | **decimal** | Значение тарифа в рублях. | 
**Parameters** | [**List&lt;TariffParameterDTO&gt;**](TariffParameterDTO.md) | Параметры расчета тарифа. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

