# QuantumDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MinQuantity** | Pointer to **int32** | Минимальное количество единиц товара в заказе. Например, если указать 10, покупатель сможет добавить в корзину не меньше 10 единиц.  ⚠️ Если количество товара на складе меньше заданного, ограничение не сработает и покупатель сможет его заказать.  | [optional] 
**StepQuantity** | Pointer to **int32** | На сколько единиц покупатель сможет увеличить количество товара в корзине.  Например, если задать 5, покупатель сможет добавить к заказу только 5, 10, 15, ... единиц товара.  ⚠️ Если количество товара на складе не дотягивает до кванта, ограничение не сработает и покупатель сможет заказать количество, не кратное кванту.  | [optional] 

## Methods

### NewQuantumDTO

`func NewQuantumDTO() *QuantumDTO`

NewQuantumDTO instantiates a new QuantumDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQuantumDTOWithDefaults

`func NewQuantumDTOWithDefaults() *QuantumDTO`

NewQuantumDTOWithDefaults instantiates a new QuantumDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMinQuantity

`func (o *QuantumDTO) GetMinQuantity() int32`

GetMinQuantity returns the MinQuantity field if non-nil, zero value otherwise.

### GetMinQuantityOk

`func (o *QuantumDTO) GetMinQuantityOk() (*int32, bool)`

GetMinQuantityOk returns a tuple with the MinQuantity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinQuantity

`func (o *QuantumDTO) SetMinQuantity(v int32)`

SetMinQuantity sets MinQuantity field to given value.

### HasMinQuantity

`func (o *QuantumDTO) HasMinQuantity() bool`

HasMinQuantity returns a boolean if a field has been set.

### GetStepQuantity

`func (o *QuantumDTO) GetStepQuantity() int32`

GetStepQuantity returns the StepQuantity field if non-nil, zero value otherwise.

### GetStepQuantityOk

`func (o *QuantumDTO) GetStepQuantityOk() (*int32, bool)`

GetStepQuantityOk returns a tuple with the StepQuantity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStepQuantity

`func (o *QuantumDTO) SetStepQuantity(v int32)`

SetStepQuantity sets StepQuantity field to given value.

### HasStepQuantity

`func (o *QuantumDTO) HasStepQuantity() bool`

HasStepQuantity returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


