# OfferRecommendationDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offer** | Pointer to [**OfferForRecommendationDTO**](OfferForRecommendationDTO.md) |  | [optional] 
**Recommendation** | Pointer to [**OfferRecommendationInfoDTO**](OfferRecommendationInfoDTO.md) |  | [optional] 

## Methods

### NewOfferRecommendationDTO

`func NewOfferRecommendationDTO() *OfferRecommendationDTO`

NewOfferRecommendationDTO instantiates a new OfferRecommendationDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferRecommendationDTOWithDefaults

`func NewOfferRecommendationDTOWithDefaults() *OfferRecommendationDTO`

NewOfferRecommendationDTOWithDefaults instantiates a new OfferRecommendationDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOffer

`func (o *OfferRecommendationDTO) GetOffer() OfferForRecommendationDTO`

GetOffer returns the Offer field if non-nil, zero value otherwise.

### GetOfferOk

`func (o *OfferRecommendationDTO) GetOfferOk() (*OfferForRecommendationDTO, bool)`

GetOfferOk returns a tuple with the Offer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffer

`func (o *OfferRecommendationDTO) SetOffer(v OfferForRecommendationDTO)`

SetOffer sets Offer field to given value.

### HasOffer

`func (o *OfferRecommendationDTO) HasOffer() bool`

HasOffer returns a boolean if a field has been set.

### GetRecommendation

`func (o *OfferRecommendationDTO) GetRecommendation() OfferRecommendationInfoDTO`

GetRecommendation returns the Recommendation field if non-nil, zero value otherwise.

### GetRecommendationOk

`func (o *OfferRecommendationDTO) GetRecommendationOk() (*OfferRecommendationInfoDTO, bool)`

GetRecommendationOk returns a tuple with the Recommendation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecommendation

`func (o *OfferRecommendationDTO) SetRecommendation(v OfferRecommendationInfoDTO)`

SetRecommendation sets Recommendation field to given value.

### HasRecommendation

`func (o *OfferRecommendationDTO) HasRecommendation() bool`

HasRecommendation returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


