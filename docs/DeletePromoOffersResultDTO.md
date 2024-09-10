# DeletePromoOffersResultDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RejectedOffers** | Pointer to [**[]RejectedPromoOfferDeleteDTO**](RejectedPromoOfferDeleteDTO.md) | Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары.  | [optional] 

## Methods

### NewDeletePromoOffersResultDTO

`func NewDeletePromoOffersResultDTO() *DeletePromoOffersResultDTO`

NewDeletePromoOffersResultDTO instantiates a new DeletePromoOffersResultDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDeletePromoOffersResultDTOWithDefaults

`func NewDeletePromoOffersResultDTOWithDefaults() *DeletePromoOffersResultDTO`

NewDeletePromoOffersResultDTOWithDefaults instantiates a new DeletePromoOffersResultDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRejectedOffers

`func (o *DeletePromoOffersResultDTO) GetRejectedOffers() []RejectedPromoOfferDeleteDTO`

GetRejectedOffers returns the RejectedOffers field if non-nil, zero value otherwise.

### GetRejectedOffersOk

`func (o *DeletePromoOffersResultDTO) GetRejectedOffersOk() (*[]RejectedPromoOfferDeleteDTO, bool)`

GetRejectedOffersOk returns a tuple with the RejectedOffers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRejectedOffers

`func (o *DeletePromoOffersResultDTO) SetRejectedOffers(v []RejectedPromoOfferDeleteDTO)`

SetRejectedOffers sets RejectedOffers field to given value.

### HasRejectedOffers

`func (o *DeletePromoOffersResultDTO) HasRejectedOffers() bool`

HasRejectedOffers returns a boolean if a field has been set.

### SetRejectedOffersNil

`func (o *DeletePromoOffersResultDTO) SetRejectedOffersNil(b bool)`

 SetRejectedOffersNil sets the value for RejectedOffers to be an explicit nil

### UnsetRejectedOffers
`func (o *DeletePromoOffersResultDTO) UnsetRejectedOffers()`

UnsetRejectedOffers ensures that no value is present for RejectedOffers, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


