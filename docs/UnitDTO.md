# UnitDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int64** | Идентификатор единицы измерения. | 
**Name** | **string** | Сокращенное название единицы измерения. | 
**FullName** | **string** | Полное название единицы измерения. | 

## Methods

### NewUnitDTO

`func NewUnitDTO(id int64, name string, fullName string, ) *UnitDTO`

NewUnitDTO instantiates a new UnitDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUnitDTOWithDefaults

`func NewUnitDTOWithDefaults() *UnitDTO`

NewUnitDTOWithDefaults instantiates a new UnitDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *UnitDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *UnitDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *UnitDTO) SetId(v int64)`

SetId sets Id field to given value.


### GetName

`func (o *UnitDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *UnitDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *UnitDTO) SetName(v string)`

SetName sets Name field to given value.


### GetFullName

`func (o *UnitDTO) GetFullName() string`

GetFullName returns the FullName field if non-nil, zero value otherwise.

### GetFullNameOk

`func (o *UnitDTO) GetFullNameOk() (*string, bool)`

GetFullNameOk returns a tuple with the FullName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullName

`func (o *UnitDTO) SetFullName(v string)`

SetFullName sets FullName field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


