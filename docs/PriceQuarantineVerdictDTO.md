# PriceQuarantineVerdictDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to [**PriceQuarantineVerdictType**](PriceQuarantineVerdictType.md) |  | [optional] 
**Params** | [**[]PriceQuarantineVerdictParameterDTO**](PriceQuarantineVerdictParameterDTO.md) | Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина. | 

## Methods

### NewPriceQuarantineVerdictDTO

`func NewPriceQuarantineVerdictDTO(params []PriceQuarantineVerdictParameterDTO, ) *PriceQuarantineVerdictDTO`

NewPriceQuarantineVerdictDTO instantiates a new PriceQuarantineVerdictDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPriceQuarantineVerdictDTOWithDefaults

`func NewPriceQuarantineVerdictDTOWithDefaults() *PriceQuarantineVerdictDTO`

NewPriceQuarantineVerdictDTOWithDefaults instantiates a new PriceQuarantineVerdictDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *PriceQuarantineVerdictDTO) GetType() PriceQuarantineVerdictType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *PriceQuarantineVerdictDTO) GetTypeOk() (*PriceQuarantineVerdictType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *PriceQuarantineVerdictDTO) SetType(v PriceQuarantineVerdictType)`

SetType sets Type field to given value.

### HasType

`func (o *PriceQuarantineVerdictDTO) HasType() bool`

HasType returns a boolean if a field has been set.

### GetParams

`func (o *PriceQuarantineVerdictDTO) GetParams() []PriceQuarantineVerdictParameterDTO`

GetParams returns the Params field if non-nil, zero value otherwise.

### GetParamsOk

`func (o *PriceQuarantineVerdictDTO) GetParamsOk() (*[]PriceQuarantineVerdictParameterDTO, bool)`

GetParamsOk returns a tuple with the Params field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParams

`func (o *PriceQuarantineVerdictDTO) SetParams(v []PriceQuarantineVerdictParameterDTO)`

SetParams sets Params field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


