# OrderSubsidyDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to [**OrderSubsidyType**](OrderSubsidyType.md) |  | [optional] 
**Amount** | Pointer to **float32** | Сумма субсидии. | [optional] 

## Methods

### NewOrderSubsidyDTO

`func NewOrderSubsidyDTO() *OrderSubsidyDTO`

NewOrderSubsidyDTO instantiates a new OrderSubsidyDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderSubsidyDTOWithDefaults

`func NewOrderSubsidyDTOWithDefaults() *OrderSubsidyDTO`

NewOrderSubsidyDTOWithDefaults instantiates a new OrderSubsidyDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *OrderSubsidyDTO) GetType() OrderSubsidyType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *OrderSubsidyDTO) GetTypeOk() (*OrderSubsidyType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *OrderSubsidyDTO) SetType(v OrderSubsidyType)`

SetType sets Type field to given value.

### HasType

`func (o *OrderSubsidyDTO) HasType() bool`

HasType returns a boolean if a field has been set.

### GetAmount

`func (o *OrderSubsidyDTO) GetAmount() float32`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *OrderSubsidyDTO) GetAmountOk() (*float32, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *OrderSubsidyDTO) SetAmount(v float32)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *OrderSubsidyDTO) HasAmount() bool`

HasAmount returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


