# ProvideOrderItemIdentifiersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**[]OrderItemInstanceModificationDTO**](OrderItemInstanceModificationDTO.md) | Список позиций, требующих маркировки.  | 

## Methods

### NewProvideOrderItemIdentifiersRequest

`func NewProvideOrderItemIdentifiersRequest(items []OrderItemInstanceModificationDTO, ) *ProvideOrderItemIdentifiersRequest`

NewProvideOrderItemIdentifiersRequest instantiates a new ProvideOrderItemIdentifiersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProvideOrderItemIdentifiersRequestWithDefaults

`func NewProvideOrderItemIdentifiersRequestWithDefaults() *ProvideOrderItemIdentifiersRequest`

NewProvideOrderItemIdentifiersRequestWithDefaults instantiates a new ProvideOrderItemIdentifiersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *ProvideOrderItemIdentifiersRequest) GetItems() []OrderItemInstanceModificationDTO`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *ProvideOrderItemIdentifiersRequest) GetItemsOk() (*[]OrderItemInstanceModificationDTO, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *ProvideOrderItemIdentifiersRequest) SetItems(v []OrderItemInstanceModificationDTO)`

SetItems sets Items field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


