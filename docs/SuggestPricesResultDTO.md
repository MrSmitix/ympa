# SuggestPricesResultDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**[]PriceSuggestOfferDTO**](PriceSuggestOfferDTO.md) | Список товаров с ценами для продвижения. | 

## Methods

### NewSuggestPricesResultDTO

`func NewSuggestPricesResultDTO(offers []PriceSuggestOfferDTO, ) *SuggestPricesResultDTO`

NewSuggestPricesResultDTO instantiates a new SuggestPricesResultDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSuggestPricesResultDTOWithDefaults

`func NewSuggestPricesResultDTOWithDefaults() *SuggestPricesResultDTO`

NewSuggestPricesResultDTOWithDefaults instantiates a new SuggestPricesResultDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOffers

`func (o *SuggestPricesResultDTO) GetOffers() []PriceSuggestOfferDTO`

GetOffers returns the Offers field if non-nil, zero value otherwise.

### GetOffersOk

`func (o *SuggestPricesResultDTO) GetOffersOk() (*[]PriceSuggestOfferDTO, bool)`

GetOffersOk returns a tuple with the Offers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffers

`func (o *SuggestPricesResultDTO) SetOffers(v []PriceSuggestOfferDTO)`

SetOffers sets Offers field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


