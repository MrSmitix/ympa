# CalculatedTariffDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**CalculatedTariffType**](CalculatedTariffType.md) |  | 
**Amount** | Pointer to **float32** | Стоимость услуги в рублях. | [optional] 
**Parameters** | [**[]TariffParameterDTO**](TariffParameterDTO.md) | Параметры расчета тарифа. | 

## Methods

### NewCalculatedTariffDTO

`func NewCalculatedTariffDTO(type_ CalculatedTariffType, parameters []TariffParameterDTO, ) *CalculatedTariffDTO`

NewCalculatedTariffDTO instantiates a new CalculatedTariffDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCalculatedTariffDTOWithDefaults

`func NewCalculatedTariffDTOWithDefaults() *CalculatedTariffDTO`

NewCalculatedTariffDTOWithDefaults instantiates a new CalculatedTariffDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *CalculatedTariffDTO) GetType() CalculatedTariffType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CalculatedTariffDTO) GetTypeOk() (*CalculatedTariffType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CalculatedTariffDTO) SetType(v CalculatedTariffType)`

SetType sets Type field to given value.


### GetAmount

`func (o *CalculatedTariffDTO) GetAmount() float32`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *CalculatedTariffDTO) GetAmountOk() (*float32, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *CalculatedTariffDTO) SetAmount(v float32)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *CalculatedTariffDTO) HasAmount() bool`

HasAmount returns a boolean if a field has been set.

### GetParameters

`func (o *CalculatedTariffDTO) GetParameters() []TariffParameterDTO`

GetParameters returns the Parameters field if non-nil, zero value otherwise.

### GetParametersOk

`func (o *CalculatedTariffDTO) GetParametersOk() (*[]TariffParameterDTO, bool)`

GetParametersOk returns a tuple with the Parameters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParameters

`func (o *CalculatedTariffDTO) SetParameters(v []TariffParameterDTO)`

SetParameters sets Parameters field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


