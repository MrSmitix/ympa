# PutSkuBidsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bids** | [**[]SkuBidItemDTO**](SkuBidItemDTO.md) | Список товаров и ставки для продвижения, которые на них нужно установить. | 

## Methods

### NewPutSkuBidsRequest

`func NewPutSkuBidsRequest(bids []SkuBidItemDTO, ) *PutSkuBidsRequest`

NewPutSkuBidsRequest instantiates a new PutSkuBidsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPutSkuBidsRequestWithDefaults

`func NewPutSkuBidsRequestWithDefaults() *PutSkuBidsRequest`

NewPutSkuBidsRequestWithDefaults instantiates a new PutSkuBidsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBids

`func (o *PutSkuBidsRequest) GetBids() []SkuBidItemDTO`

GetBids returns the Bids field if non-nil, zero value otherwise.

### GetBidsOk

`func (o *PutSkuBidsRequest) GetBidsOk() (*[]SkuBidItemDTO, bool)`

GetBidsOk returns a tuple with the Bids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBids

`func (o *PutSkuBidsRequest) SetBids(v []SkuBidItemDTO)`

SetBids sets Bids field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


