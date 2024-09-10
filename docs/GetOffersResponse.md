# GetOffersResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**[]OfferDTO**](OfferDTO.md) | Список предложений магазина. | 
**Pager** | Pointer to [**FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] 

## Methods

### NewGetOffersResponse

`func NewGetOffersResponse(offers []OfferDTO, ) *GetOffersResponse`

NewGetOffersResponse instantiates a new GetOffersResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetOffersResponseWithDefaults

`func NewGetOffersResponseWithDefaults() *GetOffersResponse`

NewGetOffersResponseWithDefaults instantiates a new GetOffersResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOffers

`func (o *GetOffersResponse) GetOffers() []OfferDTO`

GetOffers returns the Offers field if non-nil, zero value otherwise.

### GetOffersOk

`func (o *GetOffersResponse) GetOffersOk() (*[]OfferDTO, bool)`

GetOffersOk returns a tuple with the Offers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffers

`func (o *GetOffersResponse) SetOffers(v []OfferDTO)`

SetOffers sets Offers field to given value.


### GetPager

`func (o *GetOffersResponse) GetPager() FlippingPagerDTO`

GetPager returns the Pager field if non-nil, zero value otherwise.

### GetPagerOk

`func (o *GetOffersResponse) GetPagerOk() (*FlippingPagerDTO, bool)`

GetPagerOk returns a tuple with the Pager field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPager

`func (o *GetOffersResponse) SetPager(v FlippingPagerDTO)`

SetPager sets Pager field to given value.

### HasPager

`func (o *GetOffersResponse) HasPager() bool`

HasPager returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


