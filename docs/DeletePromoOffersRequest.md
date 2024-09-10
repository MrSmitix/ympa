# DeletePromoOffersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PromoId** | **string** | Идентификатор акции. | 
**DeleteAllOffers** | Pointer to **bool** | Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; и не передавайте параметр &#x60;offerIds&#x60;. | [optional] 
**OfferIds** | Pointer to **[]string** | Товары, которые нужно убрать из акции. | [optional] 

## Methods

### NewDeletePromoOffersRequest

`func NewDeletePromoOffersRequest(promoId string, ) *DeletePromoOffersRequest`

NewDeletePromoOffersRequest instantiates a new DeletePromoOffersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDeletePromoOffersRequestWithDefaults

`func NewDeletePromoOffersRequestWithDefaults() *DeletePromoOffersRequest`

NewDeletePromoOffersRequestWithDefaults instantiates a new DeletePromoOffersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPromoId

`func (o *DeletePromoOffersRequest) GetPromoId() string`

GetPromoId returns the PromoId field if non-nil, zero value otherwise.

### GetPromoIdOk

`func (o *DeletePromoOffersRequest) GetPromoIdOk() (*string, bool)`

GetPromoIdOk returns a tuple with the PromoId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromoId

`func (o *DeletePromoOffersRequest) SetPromoId(v string)`

SetPromoId sets PromoId field to given value.


### GetDeleteAllOffers

`func (o *DeletePromoOffersRequest) GetDeleteAllOffers() bool`

GetDeleteAllOffers returns the DeleteAllOffers field if non-nil, zero value otherwise.

### GetDeleteAllOffersOk

`func (o *DeletePromoOffersRequest) GetDeleteAllOffersOk() (*bool, bool)`

GetDeleteAllOffersOk returns a tuple with the DeleteAllOffers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeleteAllOffers

`func (o *DeletePromoOffersRequest) SetDeleteAllOffers(v bool)`

SetDeleteAllOffers sets DeleteAllOffers field to given value.

### HasDeleteAllOffers

`func (o *DeletePromoOffersRequest) HasDeleteAllOffers() bool`

HasDeleteAllOffers returns a boolean if a field has been set.

### GetOfferIds

`func (o *DeletePromoOffersRequest) GetOfferIds() []string`

GetOfferIds returns the OfferIds field if non-nil, zero value otherwise.

### GetOfferIdsOk

`func (o *DeletePromoOffersRequest) GetOfferIdsOk() (*[]string, bool)`

GetOfferIdsOk returns a tuple with the OfferIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferIds

`func (o *DeletePromoOffersRequest) SetOfferIds(v []string)`

SetOfferIds sets OfferIds field to given value.

### HasOfferIds

`func (o *DeletePromoOffersRequest) HasOfferIds() bool`

HasOfferIds returns a boolean if a field has been set.

### SetOfferIdsNil

`func (o *DeletePromoOffersRequest) SetOfferIdsNil(b bool)`

 SetOfferIdsNil sets the value for OfferIds to be an explicit nil

### UnsetOfferIds
`func (o *DeletePromoOffersRequest) UnsetOfferIds()`

UnsetOfferIds ensures that no value is present for OfferIds, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


