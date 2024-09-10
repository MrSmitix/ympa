# TariffDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**TariffType**](TariffType.md) |  | 
**Percent** | Pointer to **float32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах.  | [optional] 
**Amount** | **float32** | Значение тарифа в рублях. | 
**Parameters** | [**[]TariffParameterDTO**](TariffParameterDTO.md) | Параметры расчета тарифа. | 

## Methods

### NewTariffDTO

`func NewTariffDTO(type_ TariffType, amount float32, parameters []TariffParameterDTO, ) *TariffDTO`

NewTariffDTO instantiates a new TariffDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTariffDTOWithDefaults

`func NewTariffDTOWithDefaults() *TariffDTO`

NewTariffDTOWithDefaults instantiates a new TariffDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *TariffDTO) GetType() TariffType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *TariffDTO) GetTypeOk() (*TariffType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *TariffDTO) SetType(v TariffType)`

SetType sets Type field to given value.


### GetPercent

`func (o *TariffDTO) GetPercent() float32`

GetPercent returns the Percent field if non-nil, zero value otherwise.

### GetPercentOk

`func (o *TariffDTO) GetPercentOk() (*float32, bool)`

GetPercentOk returns a tuple with the Percent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPercent

`func (o *TariffDTO) SetPercent(v float32)`

SetPercent sets Percent field to given value.

### HasPercent

`func (o *TariffDTO) HasPercent() bool`

HasPercent returns a boolean if a field has been set.

### GetAmount

`func (o *TariffDTO) GetAmount() float32`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *TariffDTO) GetAmountOk() (*float32, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *TariffDTO) SetAmount(v float32)`

SetAmount sets Amount field to given value.


### GetParameters

`func (o *TariffDTO) GetParameters() []TariffParameterDTO`

GetParameters returns the Parameters field if non-nil, zero value otherwise.

### GetParametersOk

`func (o *TariffDTO) GetParametersOk() (*[]TariffParameterDTO, bool)`

GetParametersOk returns a tuple with the Parameters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParameters

`func (o *TariffDTO) SetParameters(v []TariffParameterDTO)`

SetParameters sets Parameters field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


