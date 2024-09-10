
# Table `CampaignDTO`
(mapped from: CampaignDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**domain** | domain | text |  | **kotlin.String** | URL магазина. |  [optional]
**id** | id | long PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор кампании. |  [optional]
**clientId** | clientId | long |  | **kotlin.Long** | Идентификатор плательщика в Яндекс Балансе. |  [optional]
**business** | business | long |  | [**BusinessDTO**](BusinessDTO.md) |  |  [optional] [foreignkey]
**placementType** | placementType | long |  | [**PlacementType**](PlacementType.md) |  |  [optional] [foreignkey]







