# OrderItemDetailDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemCount** | Pointer to **int64** | Количество единиц товара. | [optional] 
**ItemStatus** | Pointer to [**OrderItemStatusType**](OrderItemStatusType.md) |  | [optional] 
**UpdateDate** | Pointer to **string** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 

## Methods

### NewOrderItemDetailDTO

`func NewOrderItemDetailDTO() *OrderItemDetailDTO`

NewOrderItemDetailDTO instantiates a new OrderItemDetailDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderItemDetailDTOWithDefaults

`func NewOrderItemDetailDTOWithDefaults() *OrderItemDetailDTO`

NewOrderItemDetailDTOWithDefaults instantiates a new OrderItemDetailDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItemCount

`func (o *OrderItemDetailDTO) GetItemCount() int64`

GetItemCount returns the ItemCount field if non-nil, zero value otherwise.

### GetItemCountOk

`func (o *OrderItemDetailDTO) GetItemCountOk() (*int64, bool)`

GetItemCountOk returns a tuple with the ItemCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemCount

`func (o *OrderItemDetailDTO) SetItemCount(v int64)`

SetItemCount sets ItemCount field to given value.

### HasItemCount

`func (o *OrderItemDetailDTO) HasItemCount() bool`

HasItemCount returns a boolean if a field has been set.

### GetItemStatus

`func (o *OrderItemDetailDTO) GetItemStatus() OrderItemStatusType`

GetItemStatus returns the ItemStatus field if non-nil, zero value otherwise.

### GetItemStatusOk

`func (o *OrderItemDetailDTO) GetItemStatusOk() (*OrderItemStatusType, bool)`

GetItemStatusOk returns a tuple with the ItemStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemStatus

`func (o *OrderItemDetailDTO) SetItemStatus(v OrderItemStatusType)`

SetItemStatus sets ItemStatus field to given value.

### HasItemStatus

`func (o *OrderItemDetailDTO) HasItemStatus() bool`

HasItemStatus returns a boolean if a field has been set.

### GetUpdateDate

`func (o *OrderItemDetailDTO) GetUpdateDate() string`

GetUpdateDate returns the UpdateDate field if non-nil, zero value otherwise.

### GetUpdateDateOk

`func (o *OrderItemDetailDTO) GetUpdateDateOk() (*string, bool)`

GetUpdateDateOk returns a tuple with the UpdateDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdateDate

`func (o *OrderItemDetailDTO) SetUpdateDate(v string)`

SetUpdateDate sets UpdateDate field to given value.

### HasUpdateDate

`func (o *OrderItemDetailDTO) HasUpdateDate() bool`

HasUpdateDate returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


