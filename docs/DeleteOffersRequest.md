# DeleteOffersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferIds** | **[]string** | Список SKU товаров, которые нужно удалить. | 

## Methods

### NewDeleteOffersRequest

`func NewDeleteOffersRequest(offerIds []string, ) *DeleteOffersRequest`

NewDeleteOffersRequest instantiates a new DeleteOffersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDeleteOffersRequestWithDefaults

`func NewDeleteOffersRequestWithDefaults() *DeleteOffersRequest`

NewDeleteOffersRequestWithDefaults instantiates a new DeleteOffersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferIds

`func (o *DeleteOffersRequest) GetOfferIds() []string`

GetOfferIds returns the OfferIds field if non-nil, zero value otherwise.

### GetOfferIdsOk

`func (o *DeleteOffersRequest) GetOfferIdsOk() (*[]string, bool)`

GetOfferIdsOk returns a tuple with the OfferIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferIds

`func (o *DeleteOffersRequest) SetOfferIds(v []string)`

SetOfferIds sets OfferIds field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


