# GetSuggestedOfferMappingsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | Pointer to [**[]SuggestedOfferDTO**](SuggestedOfferDTO.md) | Список товаров. | [optional] 

## Methods

### NewGetSuggestedOfferMappingsRequest

`func NewGetSuggestedOfferMappingsRequest() *GetSuggestedOfferMappingsRequest`

NewGetSuggestedOfferMappingsRequest instantiates a new GetSuggestedOfferMappingsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetSuggestedOfferMappingsRequestWithDefaults

`func NewGetSuggestedOfferMappingsRequestWithDefaults() *GetSuggestedOfferMappingsRequest`

NewGetSuggestedOfferMappingsRequestWithDefaults instantiates a new GetSuggestedOfferMappingsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOffers

`func (o *GetSuggestedOfferMappingsRequest) GetOffers() []SuggestedOfferDTO`

GetOffers returns the Offers field if non-nil, zero value otherwise.

### GetOffersOk

`func (o *GetSuggestedOfferMappingsRequest) GetOffersOk() (*[]SuggestedOfferDTO, bool)`

GetOffersOk returns a tuple with the Offers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffers

`func (o *GetSuggestedOfferMappingsRequest) SetOffers(v []SuggestedOfferDTO)`

SetOffers sets Offers field to given value.

### HasOffers

`func (o *GetSuggestedOfferMappingsRequest) HasOffers() bool`

HasOffers returns a boolean if a field has been set.

### SetOffersNil

`func (o *GetSuggestedOfferMappingsRequest) SetOffersNil(b bool)`

 SetOffersNil sets the value for Offers to be an explicit nil

### UnsetOffers
`func (o *GetSuggestedOfferMappingsRequest) UnsetOffers()`

UnsetOffers ensures that no value is present for Offers, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


