# CampaignQualityRatingDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignId** | **int64** | Идентификатор магазина. | 
**Ratings** | [**[]QualityRatingDTO**](QualityRatingDTO.md) | Список значений индекса качества. | 

## Methods

### NewCampaignQualityRatingDTO

`func NewCampaignQualityRatingDTO(campaignId int64, ratings []QualityRatingDTO, ) *CampaignQualityRatingDTO`

NewCampaignQualityRatingDTO instantiates a new CampaignQualityRatingDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignQualityRatingDTOWithDefaults

`func NewCampaignQualityRatingDTOWithDefaults() *CampaignQualityRatingDTO`

NewCampaignQualityRatingDTOWithDefaults instantiates a new CampaignQualityRatingDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCampaignId

`func (o *CampaignQualityRatingDTO) GetCampaignId() int64`

GetCampaignId returns the CampaignId field if non-nil, zero value otherwise.

### GetCampaignIdOk

`func (o *CampaignQualityRatingDTO) GetCampaignIdOk() (*int64, bool)`

GetCampaignIdOk returns a tuple with the CampaignId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignId

`func (o *CampaignQualityRatingDTO) SetCampaignId(v int64)`

SetCampaignId sets CampaignId field to given value.


### GetRatings

`func (o *CampaignQualityRatingDTO) GetRatings() []QualityRatingDTO`

GetRatings returns the Ratings field if non-nil, zero value otherwise.

### GetRatingsOk

`func (o *CampaignQualityRatingDTO) GetRatingsOk() (*[]QualityRatingDTO, bool)`

GetRatingsOk returns a tuple with the Ratings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRatings

`func (o *CampaignQualityRatingDTO) SetRatings(v []QualityRatingDTO)`

SetRatings sets Ratings field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


