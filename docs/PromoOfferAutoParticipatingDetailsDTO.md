# PromoOfferAutoParticipatingDetailsDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignIds** | Pointer to **[]int64** | Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — &#x60;PARTIALLY_AUTO&#x60;.  | [optional] 

## Methods

### NewPromoOfferAutoParticipatingDetailsDTO

`func NewPromoOfferAutoParticipatingDetailsDTO() *PromoOfferAutoParticipatingDetailsDTO`

NewPromoOfferAutoParticipatingDetailsDTO instantiates a new PromoOfferAutoParticipatingDetailsDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPromoOfferAutoParticipatingDetailsDTOWithDefaults

`func NewPromoOfferAutoParticipatingDetailsDTOWithDefaults() *PromoOfferAutoParticipatingDetailsDTO`

NewPromoOfferAutoParticipatingDetailsDTOWithDefaults instantiates a new PromoOfferAutoParticipatingDetailsDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCampaignIds

`func (o *PromoOfferAutoParticipatingDetailsDTO) GetCampaignIds() []int64`

GetCampaignIds returns the CampaignIds field if non-nil, zero value otherwise.

### GetCampaignIdsOk

`func (o *PromoOfferAutoParticipatingDetailsDTO) GetCampaignIdsOk() (*[]int64, bool)`

GetCampaignIdsOk returns a tuple with the CampaignIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignIds

`func (o *PromoOfferAutoParticipatingDetailsDTO) SetCampaignIds(v []int64)`

SetCampaignIds sets CampaignIds field to given value.

### HasCampaignIds

`func (o *PromoOfferAutoParticipatingDetailsDTO) HasCampaignIds() bool`

HasCampaignIds returns a boolean if a field has been set.

### SetCampaignIdsNil

`func (o *PromoOfferAutoParticipatingDetailsDTO) SetCampaignIdsNil(b bool)`

 SetCampaignIdsNil sets the value for CampaignIds to be an explicit nil

### UnsetCampaignIds
`func (o *PromoOfferAutoParticipatingDetailsDTO) UnsetCampaignIds()`

UnsetCampaignIds ensures that no value is present for CampaignIds, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


