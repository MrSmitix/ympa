# CampaignSettingsLocalRegionDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | Идентификатор региона. | [optional] 
**Name** | Pointer to **string** | Название региона. | [optional] 
**Type** | Pointer to [**RegionType**](RegionType.md) |  | [optional] 
**DeliveryOptionsSource** | Pointer to [**CampaignSettingsScheduleSourceType**](CampaignSettingsScheduleSourceType.md) |  | [optional] 
**Delivery** | Pointer to [**CampaignSettingsDeliveryDTO**](CampaignSettingsDeliveryDTO.md) |  | [optional] 

## Methods

### NewCampaignSettingsLocalRegionDTO

`func NewCampaignSettingsLocalRegionDTO() *CampaignSettingsLocalRegionDTO`

NewCampaignSettingsLocalRegionDTO instantiates a new CampaignSettingsLocalRegionDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignSettingsLocalRegionDTOWithDefaults

`func NewCampaignSettingsLocalRegionDTOWithDefaults() *CampaignSettingsLocalRegionDTO`

NewCampaignSettingsLocalRegionDTOWithDefaults instantiates a new CampaignSettingsLocalRegionDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *CampaignSettingsLocalRegionDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CampaignSettingsLocalRegionDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CampaignSettingsLocalRegionDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *CampaignSettingsLocalRegionDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *CampaignSettingsLocalRegionDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CampaignSettingsLocalRegionDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CampaignSettingsLocalRegionDTO) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CampaignSettingsLocalRegionDTO) HasName() bool`

HasName returns a boolean if a field has been set.

### GetType

`func (o *CampaignSettingsLocalRegionDTO) GetType() RegionType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CampaignSettingsLocalRegionDTO) GetTypeOk() (*RegionType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CampaignSettingsLocalRegionDTO) SetType(v RegionType)`

SetType sets Type field to given value.

### HasType

`func (o *CampaignSettingsLocalRegionDTO) HasType() bool`

HasType returns a boolean if a field has been set.

### GetDeliveryOptionsSource

`func (o *CampaignSettingsLocalRegionDTO) GetDeliveryOptionsSource() CampaignSettingsScheduleSourceType`

GetDeliveryOptionsSource returns the DeliveryOptionsSource field if non-nil, zero value otherwise.

### GetDeliveryOptionsSourceOk

`func (o *CampaignSettingsLocalRegionDTO) GetDeliveryOptionsSourceOk() (*CampaignSettingsScheduleSourceType, bool)`

GetDeliveryOptionsSourceOk returns a tuple with the DeliveryOptionsSource field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryOptionsSource

`func (o *CampaignSettingsLocalRegionDTO) SetDeliveryOptionsSource(v CampaignSettingsScheduleSourceType)`

SetDeliveryOptionsSource sets DeliveryOptionsSource field to given value.

### HasDeliveryOptionsSource

`func (o *CampaignSettingsLocalRegionDTO) HasDeliveryOptionsSource() bool`

HasDeliveryOptionsSource returns a boolean if a field has been set.

### GetDelivery

`func (o *CampaignSettingsLocalRegionDTO) GetDelivery() CampaignSettingsDeliveryDTO`

GetDelivery returns the Delivery field if non-nil, zero value otherwise.

### GetDeliveryOk

`func (o *CampaignSettingsLocalRegionDTO) GetDeliveryOk() (*CampaignSettingsDeliveryDTO, bool)`

GetDeliveryOk returns a tuple with the Delivery field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDelivery

`func (o *CampaignSettingsLocalRegionDTO) SetDelivery(v CampaignSettingsDeliveryDTO)`

SetDelivery sets Delivery field to given value.

### HasDelivery

`func (o *CampaignSettingsLocalRegionDTO) HasDelivery() bool`

HasDelivery returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


