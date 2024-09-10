# ModelDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | Идентификатор модели товара. | [optional] 
**Name** | Pointer to **string** | Название модели товара. | [optional] 
**Prices** | Pointer to [**ModelPriceDTO**](ModelPriceDTO.md) |  | [optional] 

## Methods

### NewModelDTO

`func NewModelDTO() *ModelDTO`

NewModelDTO instantiates a new ModelDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModelDTOWithDefaults

`func NewModelDTOWithDefaults() *ModelDTO`

NewModelDTOWithDefaults instantiates a new ModelDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ModelDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModelDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModelDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *ModelDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *ModelDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModelDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModelDTO) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModelDTO) HasName() bool`

HasName returns a boolean if a field has been set.

### GetPrices

`func (o *ModelDTO) GetPrices() ModelPriceDTO`

GetPrices returns the Prices field if non-nil, zero value otherwise.

### GetPricesOk

`func (o *ModelDTO) GetPricesOk() (*ModelPriceDTO, bool)`

GetPricesOk returns a tuple with the Prices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrices

`func (o *ModelDTO) SetPrices(v ModelPriceDTO)`

SetPrices sets Prices field to given value.

### HasPrices

`func (o *ModelDTO) HasPrices() bool`

HasPrices returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


