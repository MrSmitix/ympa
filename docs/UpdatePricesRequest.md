# UpdatePricesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**[]OfferPriceDTO**](OfferPriceDTO.md) | Список товаров. | 

## Methods

### NewUpdatePricesRequest

`func NewUpdatePricesRequest(offers []OfferPriceDTO, ) *UpdatePricesRequest`

NewUpdatePricesRequest instantiates a new UpdatePricesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdatePricesRequestWithDefaults

`func NewUpdatePricesRequestWithDefaults() *UpdatePricesRequest`

NewUpdatePricesRequestWithDefaults instantiates a new UpdatePricesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOffers

`func (o *UpdatePricesRequest) GetOffers() []OfferPriceDTO`

GetOffers returns the Offers field if non-nil, zero value otherwise.

### GetOffersOk

`func (o *UpdatePricesRequest) GetOffersOk() (*[]OfferPriceDTO, bool)`

GetOffersOk returns a tuple with the Offers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffers

`func (o *UpdatePricesRequest) SetOffers(v []OfferPriceDTO)`

SetOffers sets Offers field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


