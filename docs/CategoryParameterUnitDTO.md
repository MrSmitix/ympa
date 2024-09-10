# CategoryParameterUnitDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DefaultUnitId** | **int64** | Единица измерения по умолчанию. | 
**Units** | [**[]UnitDTO**](UnitDTO.md) | Допустимые единицы измерения. | 

## Methods

### NewCategoryParameterUnitDTO

`func NewCategoryParameterUnitDTO(defaultUnitId int64, units []UnitDTO, ) *CategoryParameterUnitDTO`

NewCategoryParameterUnitDTO instantiates a new CategoryParameterUnitDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCategoryParameterUnitDTOWithDefaults

`func NewCategoryParameterUnitDTOWithDefaults() *CategoryParameterUnitDTO`

NewCategoryParameterUnitDTOWithDefaults instantiates a new CategoryParameterUnitDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDefaultUnitId

`func (o *CategoryParameterUnitDTO) GetDefaultUnitId() int64`

GetDefaultUnitId returns the DefaultUnitId field if non-nil, zero value otherwise.

### GetDefaultUnitIdOk

`func (o *CategoryParameterUnitDTO) GetDefaultUnitIdOk() (*int64, bool)`

GetDefaultUnitIdOk returns a tuple with the DefaultUnitId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultUnitId

`func (o *CategoryParameterUnitDTO) SetDefaultUnitId(v int64)`

SetDefaultUnitId sets DefaultUnitId field to given value.


### GetUnits

`func (o *CategoryParameterUnitDTO) GetUnits() []UnitDTO`

GetUnits returns the Units field if non-nil, zero value otherwise.

### GetUnitsOk

`func (o *CategoryParameterUnitDTO) GetUnitsOk() (*[]UnitDTO, bool)`

GetUnitsOk returns a tuple with the Units field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnits

`func (o *CategoryParameterUnitDTO) SetUnits(v []UnitDTO)`

SetUnits sets Units field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


