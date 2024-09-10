# ModelPriceDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Avg** | Pointer to **float32** | Средняя цена предложения для модели в регионе. | [optional] 
**Max** | Pointer to **float32** | Максимальная цена предложения для модели в регионе. | [optional] 
**Min** | Pointer to **float32** | Минимальная цена предложения для модели в регионе. | [optional] 

## Methods

### NewModelPriceDTO

`func NewModelPriceDTO() *ModelPriceDTO`

NewModelPriceDTO instantiates a new ModelPriceDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModelPriceDTOWithDefaults

`func NewModelPriceDTOWithDefaults() *ModelPriceDTO`

NewModelPriceDTOWithDefaults instantiates a new ModelPriceDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAvg

`func (o *ModelPriceDTO) GetAvg() float32`

GetAvg returns the Avg field if non-nil, zero value otherwise.

### GetAvgOk

`func (o *ModelPriceDTO) GetAvgOk() (*float32, bool)`

GetAvgOk returns a tuple with the Avg field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvg

`func (o *ModelPriceDTO) SetAvg(v float32)`

SetAvg sets Avg field to given value.

### HasAvg

`func (o *ModelPriceDTO) HasAvg() bool`

HasAvg returns a boolean if a field has been set.

### GetMax

`func (o *ModelPriceDTO) GetMax() float32`

GetMax returns the Max field if non-nil, zero value otherwise.

### GetMaxOk

`func (o *ModelPriceDTO) GetMaxOk() (*float32, bool)`

GetMaxOk returns a tuple with the Max field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMax

`func (o *ModelPriceDTO) SetMax(v float32)`

SetMax sets Max field to given value.

### HasMax

`func (o *ModelPriceDTO) HasMax() bool`

HasMax returns a boolean if a field has been set.

### GetMin

`func (o *ModelPriceDTO) GetMin() float32`

GetMin returns the Min field if non-nil, zero value otherwise.

### GetMinOk

`func (o *ModelPriceDTO) GetMinOk() (*float32, bool)`

GetMinOk returns a tuple with the Min field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMin

`func (o *ModelPriceDTO) SetMin(v float32)`

SetMin sets Min field to given value.

### HasMin

`func (o *ModelPriceDTO) HasMin() bool`

HasMin returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


