# GetPromoConstraintsDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**WarehouseIds** | Pointer to **[]int64** | Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу.  | [optional] 

## Methods

### NewGetPromoConstraintsDTO

`func NewGetPromoConstraintsDTO() *GetPromoConstraintsDTO`

NewGetPromoConstraintsDTO instantiates a new GetPromoConstraintsDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetPromoConstraintsDTOWithDefaults

`func NewGetPromoConstraintsDTOWithDefaults() *GetPromoConstraintsDTO`

NewGetPromoConstraintsDTOWithDefaults instantiates a new GetPromoConstraintsDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetWarehouseIds

`func (o *GetPromoConstraintsDTO) GetWarehouseIds() []int64`

GetWarehouseIds returns the WarehouseIds field if non-nil, zero value otherwise.

### GetWarehouseIdsOk

`func (o *GetPromoConstraintsDTO) GetWarehouseIdsOk() (*[]int64, bool)`

GetWarehouseIdsOk returns a tuple with the WarehouseIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarehouseIds

`func (o *GetPromoConstraintsDTO) SetWarehouseIds(v []int64)`

SetWarehouseIds sets WarehouseIds field to given value.

### HasWarehouseIds

`func (o *GetPromoConstraintsDTO) HasWarehouseIds() bool`

HasWarehouseIds returns a boolean if a field has been set.

### SetWarehouseIdsNil

`func (o *GetPromoConstraintsDTO) SetWarehouseIdsNil(b bool)`

 SetWarehouseIdsNil sets the value for WarehouseIds to be an explicit nil

### UnsetWarehouseIds
`func (o *GetPromoConstraintsDTO) UnsetWarehouseIds()`

UnsetWarehouseIds ensures that no value is present for WarehouseIds, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


