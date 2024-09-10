# UpdatePromoOffersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PromoId** | **string** | Идентификатор акции. | 
**Offers** | [**[]UpdatePromoOfferDTO**](UpdatePromoOfferDTO.md) | Товары, которые необходимо добавить в акцию или цены которых нужно изменить. | 

## Methods

### NewUpdatePromoOffersRequest

`func NewUpdatePromoOffersRequest(promoId string, offers []UpdatePromoOfferDTO, ) *UpdatePromoOffersRequest`

NewUpdatePromoOffersRequest instantiates a new UpdatePromoOffersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdatePromoOffersRequestWithDefaults

`func NewUpdatePromoOffersRequestWithDefaults() *UpdatePromoOffersRequest`

NewUpdatePromoOffersRequestWithDefaults instantiates a new UpdatePromoOffersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPromoId

`func (o *UpdatePromoOffersRequest) GetPromoId() string`

GetPromoId returns the PromoId field if non-nil, zero value otherwise.

### GetPromoIdOk

`func (o *UpdatePromoOffersRequest) GetPromoIdOk() (*string, bool)`

GetPromoIdOk returns a tuple with the PromoId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromoId

`func (o *UpdatePromoOffersRequest) SetPromoId(v string)`

SetPromoId sets PromoId field to given value.


### GetOffers

`func (o *UpdatePromoOffersRequest) GetOffers() []UpdatePromoOfferDTO`

GetOffers returns the Offers field if non-nil, zero value otherwise.

### GetOffersOk

`func (o *UpdatePromoOffersRequest) GetOffersOk() (*[]UpdatePromoOfferDTO, bool)`

GetOffersOk returns a tuple with the Offers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffers

`func (o *UpdatePromoOffersRequest) SetOffers(v []UpdatePromoOfferDTO)`

SetOffers sets Offers field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


