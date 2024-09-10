# OptionValuesLimitedDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LimitingOptionValueId** | **int64** | Идентификатор значения ограничивающей характеристики. | 
**OptionValueIds** | **[]int64** | Идентификаторы допустимых значений ограничиваемой характеристики.  | 

## Methods

### NewOptionValuesLimitedDTO

`func NewOptionValuesLimitedDTO(limitingOptionValueId int64, optionValueIds []int64, ) *OptionValuesLimitedDTO`

NewOptionValuesLimitedDTO instantiates a new OptionValuesLimitedDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOptionValuesLimitedDTOWithDefaults

`func NewOptionValuesLimitedDTOWithDefaults() *OptionValuesLimitedDTO`

NewOptionValuesLimitedDTOWithDefaults instantiates a new OptionValuesLimitedDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLimitingOptionValueId

`func (o *OptionValuesLimitedDTO) GetLimitingOptionValueId() int64`

GetLimitingOptionValueId returns the LimitingOptionValueId field if non-nil, zero value otherwise.

### GetLimitingOptionValueIdOk

`func (o *OptionValuesLimitedDTO) GetLimitingOptionValueIdOk() (*int64, bool)`

GetLimitingOptionValueIdOk returns a tuple with the LimitingOptionValueId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitingOptionValueId

`func (o *OptionValuesLimitedDTO) SetLimitingOptionValueId(v int64)`

SetLimitingOptionValueId sets LimitingOptionValueId field to given value.


### GetOptionValueIds

`func (o *OptionValuesLimitedDTO) GetOptionValueIds() []int64`

GetOptionValueIds returns the OptionValueIds field if non-nil, zero value otherwise.

### GetOptionValueIdsOk

`func (o *OptionValuesLimitedDTO) GetOptionValueIdsOk() (*[]int64, bool)`

GetOptionValueIdsOk returns a tuple with the OptionValueIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptionValueIds

`func (o *OptionValuesLimitedDTO) SetOptionValueIds(v []int64)`

SetOptionValueIds sets OptionValueIds field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


