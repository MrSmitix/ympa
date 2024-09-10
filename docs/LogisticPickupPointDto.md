# LogisticPickupPointDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**i64**> | Идентификатор пункта вывоза. | [optional]
**name** | Option<**String**> | Название пункта вывоза. | [optional]
**address** | Option<[**models::PickupAddressDto**](PickupAddressDTO.md)> |  | [optional]
**instruction** | Option<**String**> | Дополнительные инструкции к вывозу. | [optional]
**r#type** | Option<[**models::LogisticPointType**](LogisticPointType.md)> |  | [optional]
**logistic_partner_id** | Option<**i64**> | Идентификатор логистического партнера, к которому относится логистическая точка. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


