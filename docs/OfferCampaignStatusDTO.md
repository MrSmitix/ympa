# OfferCampaignStatusDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignId** | **int64** | Идентификатор кампании.  | 
**Status** | [**OfferCampaignStatusType**](OfferCampaignStatusType.md) |  | 

## Methods

### NewOfferCampaignStatusDTO

`func NewOfferCampaignStatusDTO(campaignId int64, status OfferCampaignStatusType, ) *OfferCampaignStatusDTO`

NewOfferCampaignStatusDTO instantiates a new OfferCampaignStatusDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferCampaignStatusDTOWithDefaults

`func NewOfferCampaignStatusDTOWithDefaults() *OfferCampaignStatusDTO`

NewOfferCampaignStatusDTOWithDefaults instantiates a new OfferCampaignStatusDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCampaignId

`func (o *OfferCampaignStatusDTO) GetCampaignId() int64`

GetCampaignId returns the CampaignId field if non-nil, zero value otherwise.

### GetCampaignIdOk

`func (o *OfferCampaignStatusDTO) GetCampaignIdOk() (*int64, bool)`

GetCampaignIdOk returns a tuple with the CampaignId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignId

`func (o *OfferCampaignStatusDTO) SetCampaignId(v int64)`

SetCampaignId sets CampaignId field to given value.


### GetStatus

`func (o *OfferCampaignStatusDTO) GetStatus() OfferCampaignStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *OfferCampaignStatusDTO) GetStatusOk() (*OfferCampaignStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *OfferCampaignStatusDTO) SetStatus(v OfferCampaignStatusType)`

SetStatus sets Status field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


