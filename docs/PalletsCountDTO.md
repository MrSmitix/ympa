# PalletsCountDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Planned** | Pointer to **int32** | Количество палет, которое заявил продавец. | [optional] 
**Fact** | Pointer to **int32** | Количество палет, которое приняли в сортировочном центре. | [optional] 

## Methods

### NewPalletsCountDTO

`func NewPalletsCountDTO() *PalletsCountDTO`

NewPalletsCountDTO instantiates a new PalletsCountDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPalletsCountDTOWithDefaults

`func NewPalletsCountDTOWithDefaults() *PalletsCountDTO`

NewPalletsCountDTOWithDefaults instantiates a new PalletsCountDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPlanned

`func (o *PalletsCountDTO) GetPlanned() int32`

GetPlanned returns the Planned field if non-nil, zero value otherwise.

### GetPlannedOk

`func (o *PalletsCountDTO) GetPlannedOk() (*int32, bool)`

GetPlannedOk returns a tuple with the Planned field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlanned

`func (o *PalletsCountDTO) SetPlanned(v int32)`

SetPlanned sets Planned field to given value.

### HasPlanned

`func (o *PalletsCountDTO) HasPlanned() bool`

HasPlanned returns a boolean if a field has been set.

### GetFact

`func (o *PalletsCountDTO) GetFact() int32`

GetFact returns the Fact field if non-nil, zero value otherwise.

### GetFactOk

`func (o *PalletsCountDTO) GetFactOk() (*int32, bool)`

GetFactOk returns a tuple with the Fact field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFact

`func (o *PalletsCountDTO) SetFact(v int32)`

SetFact sets Fact field to given value.

### HasFact

`func (o *PalletsCountDTO) HasFact() bool`

HasFact returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


