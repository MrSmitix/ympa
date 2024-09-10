
# Table `CampaignSettingsLocalRegionDTO`
(mapped from: CampaignSettingsLocalRegionDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | long PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор региона. |  [optional]
**name** | name | text |  | **kotlin.String** | Название региона. |  [optional]
**type** | type | long |  | [**RegionType**](RegionType.md) |  |  [optional] [foreignkey]
**deliveryOptionsSource** | deliveryOptionsSource | long |  | [**CampaignSettingsScheduleSourceType**](CampaignSettingsScheduleSourceType.md) |  |  [optional] [foreignkey]
**delivery** | delivery | long |  | [**CampaignSettingsDeliveryDTO**](CampaignSettingsDeliveryDTO.md) |  |  [optional] [foreignkey]







