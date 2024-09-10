# OrderItemSubsidyDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to [**OrderItemSubsidyType**](OrderItemSubsidyType.md) |  | [optional] 
**Amount** | Pointer to **float32** | Сумма субсидии. | [optional] 

## Methods

### NewOrderItemSubsidyDTO

`func NewOrderItemSubsidyDTO() *OrderItemSubsidyDTO`

NewOrderItemSubsidyDTO instantiates a new OrderItemSubsidyDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderItemSubsidyDTOWithDefaults

`func NewOrderItemSubsidyDTOWithDefaults() *OrderItemSubsidyDTO`

NewOrderItemSubsidyDTOWithDefaults instantiates a new OrderItemSubsidyDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *OrderItemSubsidyDTO) GetType() OrderItemSubsidyType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *OrderItemSubsidyDTO) GetTypeOk() (*OrderItemSubsidyType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *OrderItemSubsidyDTO) SetType(v OrderItemSubsidyType)`

SetType sets Type field to given value.

### HasType

`func (o *OrderItemSubsidyDTO) HasType() bool`

HasType returns a boolean if a field has been set.

### GetAmount

`func (o *OrderItemSubsidyDTO) GetAmount() float32`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *OrderItemSubsidyDTO) GetAmountOk() (*float32, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *OrderItemSubsidyDTO) SetAmount(v float32)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *OrderItemSubsidyDTO) HasAmount() bool`

HasAmount returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


