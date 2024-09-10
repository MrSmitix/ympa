# SetOrderBoxLayoutRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Boxes** | [**[]OrderBoxLayoutDTO**](OrderBoxLayoutDTO.md) | Список коробок. | 
**AllowRemove** | Pointer to **bool** | Передайте &#x60;true&#x60;, если вы собираетесь удалить часть товаров из заказа. | [optional] [default to false]

## Methods

### NewSetOrderBoxLayoutRequest

`func NewSetOrderBoxLayoutRequest(boxes []OrderBoxLayoutDTO, ) *SetOrderBoxLayoutRequest`

NewSetOrderBoxLayoutRequest instantiates a new SetOrderBoxLayoutRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSetOrderBoxLayoutRequestWithDefaults

`func NewSetOrderBoxLayoutRequestWithDefaults() *SetOrderBoxLayoutRequest`

NewSetOrderBoxLayoutRequestWithDefaults instantiates a new SetOrderBoxLayoutRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBoxes

`func (o *SetOrderBoxLayoutRequest) GetBoxes() []OrderBoxLayoutDTO`

GetBoxes returns the Boxes field if non-nil, zero value otherwise.

### GetBoxesOk

`func (o *SetOrderBoxLayoutRequest) GetBoxesOk() (*[]OrderBoxLayoutDTO, bool)`

GetBoxesOk returns a tuple with the Boxes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoxes

`func (o *SetOrderBoxLayoutRequest) SetBoxes(v []OrderBoxLayoutDTO)`

SetBoxes sets Boxes field to given value.


### GetAllowRemove

`func (o *SetOrderBoxLayoutRequest) GetAllowRemove() bool`

GetAllowRemove returns the AllowRemove field if non-nil, zero value otherwise.

### GetAllowRemoveOk

`func (o *SetOrderBoxLayoutRequest) GetAllowRemoveOk() (*bool, bool)`

GetAllowRemoveOk returns a tuple with the AllowRemove field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowRemove

`func (o *SetOrderBoxLayoutRequest) SetAllowRemove(v bool)`

SetAllowRemove sets AllowRemove field to given value.

### HasAllowRemove

`func (o *SetOrderBoxLayoutRequest) HasAllowRemove() bool`

HasAllowRemove returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


