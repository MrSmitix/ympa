# ympa_r_client::LogisticPickupPointDTO

Описание пункта вывоза для возврата.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | Идентификатор пункта вывоза. | [optional] 
**name** | **character** | Название пункта вывоза. | [optional] 
**address** | [**PickupAddressDTO**](PickupAddressDTO.md) |  | [optional] 
**instruction** | **character** | Дополнительные инструкции к вывозу. | [optional] 
**type** | [**LogisticPointType**](LogisticPointType.md) |  | [optional] [Enum: ] 
**logisticPartnerId** | **integer** | Идентификатор логистического партнера, к которому относится логистическая точка. | [optional] 


