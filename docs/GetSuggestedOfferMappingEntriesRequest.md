# GetSuggestedOfferMappingEntriesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**[]MappingsOfferDTO**](MappingsOfferDTO.md) | Список товаров. | 

## Methods

### NewGetSuggestedOfferMappingEntriesRequest

`func NewGetSuggestedOfferMappingEntriesRequest(offers []MappingsOfferDTO, ) *GetSuggestedOfferMappingEntriesRequest`

NewGetSuggestedOfferMappingEntriesRequest instantiates a new GetSuggestedOfferMappingEntriesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetSuggestedOfferMappingEntriesRequestWithDefaults

`func NewGetSuggestedOfferMappingEntriesRequestWithDefaults() *GetSuggestedOfferMappingEntriesRequest`

NewGetSuggestedOfferMappingEntriesRequestWithDefaults instantiates a new GetSuggestedOfferMappingEntriesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOffers

`func (o *GetSuggestedOfferMappingEntriesRequest) GetOffers() []MappingsOfferDTO`

GetOffers returns the Offers field if non-nil, zero value otherwise.

### GetOffersOk

`func (o *GetSuggestedOfferMappingEntriesRequest) GetOffersOk() (*[]MappingsOfferDTO, bool)`

GetOffersOk returns a tuple with the Offers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffers

`func (o *GetSuggestedOfferMappingEntriesRequest) SetOffers(v []MappingsOfferDTO)`

SetOffers sets Offers field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


