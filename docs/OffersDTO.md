# OffersDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**[]OfferDTO**](OfferDTO.md) | Список предложений магазина. | 

## Methods

### NewOffersDTO

`func NewOffersDTO(offers []OfferDTO, ) *OffersDTO`

NewOffersDTO instantiates a new OffersDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOffersDTOWithDefaults

`func NewOffersDTOWithDefaults() *OffersDTO`

NewOffersDTOWithDefaults instantiates a new OffersDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOffers

`func (o *OffersDTO) GetOffers() []OfferDTO`

GetOffers returns the Offers field if non-nil, zero value otherwise.

### GetOffersOk

`func (o *OffersDTO) GetOffersOk() (*[]OfferDTO, bool)`

GetOffersOk returns a tuple with the Offers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffers

`func (o *OffersDTO) SetOffers(v []OfferDTO)`

SetOffers sets Offers field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


