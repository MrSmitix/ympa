# DeleteHiddenOffersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HiddenOffers** | [**[]HiddenOfferDTO**](HiddenOfferDTO.md) | Список скрытых товаров.  | 

## Methods

### NewDeleteHiddenOffersRequest

`func NewDeleteHiddenOffersRequest(hiddenOffers []HiddenOfferDTO, ) *DeleteHiddenOffersRequest`

NewDeleteHiddenOffersRequest instantiates a new DeleteHiddenOffersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDeleteHiddenOffersRequestWithDefaults

`func NewDeleteHiddenOffersRequestWithDefaults() *DeleteHiddenOffersRequest`

NewDeleteHiddenOffersRequestWithDefaults instantiates a new DeleteHiddenOffersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHiddenOffers

`func (o *DeleteHiddenOffersRequest) GetHiddenOffers() []HiddenOfferDTO`

GetHiddenOffers returns the HiddenOffers field if non-nil, zero value otherwise.

### GetHiddenOffersOk

`func (o *DeleteHiddenOffersRequest) GetHiddenOffersOk() (*[]HiddenOfferDTO, bool)`

GetHiddenOffersOk returns a tuple with the HiddenOffers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHiddenOffers

`func (o *DeleteHiddenOffersRequest) SetHiddenOffers(v []HiddenOfferDTO)`

SetHiddenOffers sets HiddenOffers field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


