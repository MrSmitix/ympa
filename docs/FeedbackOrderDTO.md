# FeedbackOrderDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ShopOrderId** | Pointer to **string** | Номер заказа, указанный в отзыве. | [optional] 
**Delivery** | Pointer to [**FeedbackDeliveryType**](FeedbackDeliveryType.md) |  | [optional] 

## Methods

### NewFeedbackOrderDTO

`func NewFeedbackOrderDTO() *FeedbackOrderDTO`

NewFeedbackOrderDTO instantiates a new FeedbackOrderDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeedbackOrderDTOWithDefaults

`func NewFeedbackOrderDTOWithDefaults() *FeedbackOrderDTO`

NewFeedbackOrderDTOWithDefaults instantiates a new FeedbackOrderDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetShopOrderId

`func (o *FeedbackOrderDTO) GetShopOrderId() string`

GetShopOrderId returns the ShopOrderId field if non-nil, zero value otherwise.

### GetShopOrderIdOk

`func (o *FeedbackOrderDTO) GetShopOrderIdOk() (*string, bool)`

GetShopOrderIdOk returns a tuple with the ShopOrderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShopOrderId

`func (o *FeedbackOrderDTO) SetShopOrderId(v string)`

SetShopOrderId sets ShopOrderId field to given value.

### HasShopOrderId

`func (o *FeedbackOrderDTO) HasShopOrderId() bool`

HasShopOrderId returns a boolean if a field has been set.

### GetDelivery

`func (o *FeedbackOrderDTO) GetDelivery() FeedbackDeliveryType`

GetDelivery returns the Delivery field if non-nil, zero value otherwise.

### GetDeliveryOk

`func (o *FeedbackOrderDTO) GetDeliveryOk() (*FeedbackDeliveryType, bool)`

GetDeliveryOk returns a tuple with the Delivery field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDelivery

`func (o *FeedbackOrderDTO) SetDelivery(v FeedbackDeliveryType)`

SetDelivery sets Delivery field to given value.

### HasDelivery

`func (o *FeedbackOrderDTO) HasDelivery() bool`

HasDelivery returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


