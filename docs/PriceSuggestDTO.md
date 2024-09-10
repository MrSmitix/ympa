# PriceSuggestDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to [**PriceSuggestType**](PriceSuggestType.md) |  | [optional] 
**Price** | Pointer to **float32** | Цена в рублях. | [optional] 

## Methods

### NewPriceSuggestDTO

`func NewPriceSuggestDTO() *PriceSuggestDTO`

NewPriceSuggestDTO instantiates a new PriceSuggestDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPriceSuggestDTOWithDefaults

`func NewPriceSuggestDTOWithDefaults() *PriceSuggestDTO`

NewPriceSuggestDTOWithDefaults instantiates a new PriceSuggestDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *PriceSuggestDTO) GetType() PriceSuggestType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *PriceSuggestDTO) GetTypeOk() (*PriceSuggestType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *PriceSuggestDTO) SetType(v PriceSuggestType)`

SetType sets Type field to given value.

### HasType

`func (o *PriceSuggestDTO) HasType() bool`

HasType returns a boolean if a field has been set.

### GetPrice

`func (o *PriceSuggestDTO) GetPrice() float32`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *PriceSuggestDTO) GetPriceOk() (*float32, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *PriceSuggestDTO) SetPrice(v float32)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *PriceSuggestDTO) HasPrice() bool`

HasPrice returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


