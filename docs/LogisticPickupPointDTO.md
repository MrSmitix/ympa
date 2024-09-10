
# Table `LogisticPickupPointDTO`
(mapped from: LogisticPickupPointDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | long PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор пункта вывоза. |  [optional]
**name** | name | text |  | **kotlin.String** | Название пункта вывоза. |  [optional]
**address** | address | long |  | [**PickupAddressDTO**](PickupAddressDTO.md) |  |  [optional] [foreignkey]
**instruction** | instruction | text |  | **kotlin.String** | Дополнительные инструкции к вывозу. |  [optional]
**type** | type | long |  | [**LogisticPointType**](LogisticPointType.md) |  |  [optional] [foreignkey]
**logisticPartnerId** | logisticPartnerId | long |  | **kotlin.Long** | Идентификатор логистического партнера, к которому относится логистическая точка. |  [optional]








