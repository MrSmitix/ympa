# UpdateBusinessPricesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**[]UpdateBusinessOfferPriceDTO**](UpdateBusinessOfferPriceDTO.md) | Список товаров с ценами. | 

## Methods

### NewUpdateBusinessPricesRequest

`func NewUpdateBusinessPricesRequest(offers []UpdateBusinessOfferPriceDTO, ) *UpdateBusinessPricesRequest`

NewUpdateBusinessPricesRequest instantiates a new UpdateBusinessPricesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateBusinessPricesRequestWithDefaults

`func NewUpdateBusinessPricesRequestWithDefaults() *UpdateBusinessPricesRequest`

NewUpdateBusinessPricesRequestWithDefaults instantiates a new UpdateBusinessPricesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOffers

`func (o *UpdateBusinessPricesRequest) GetOffers() []UpdateBusinessOfferPriceDTO`

GetOffers returns the Offers field if non-nil, zero value otherwise.

### GetOffersOk

`func (o *UpdateBusinessPricesRequest) GetOffersOk() (*[]UpdateBusinessOfferPriceDTO, bool)`

GetOffersOk returns a tuple with the Offers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffers

`func (o *UpdateBusinessPricesRequest) SetOffers(v []UpdateBusinessOfferPriceDTO)`

SetOffers sets Offers field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


