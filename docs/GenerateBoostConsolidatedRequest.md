# GenerateBoostConsolidatedRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessId** | **int64** | Идентификатор бизнеса. | 
**DateFrom** | **string** | Начало периода, включительно. | 
**DateTo** | **string** | Конец периода, включительно. | 

## Methods

### NewGenerateBoostConsolidatedRequest

`func NewGenerateBoostConsolidatedRequest(businessId int64, dateFrom string, dateTo string, ) *GenerateBoostConsolidatedRequest`

NewGenerateBoostConsolidatedRequest instantiates a new GenerateBoostConsolidatedRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGenerateBoostConsolidatedRequestWithDefaults

`func NewGenerateBoostConsolidatedRequestWithDefaults() *GenerateBoostConsolidatedRequest`

NewGenerateBoostConsolidatedRequestWithDefaults instantiates a new GenerateBoostConsolidatedRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBusinessId

`func (o *GenerateBoostConsolidatedRequest) GetBusinessId() int64`

GetBusinessId returns the BusinessId field if non-nil, zero value otherwise.

### GetBusinessIdOk

`func (o *GenerateBoostConsolidatedRequest) GetBusinessIdOk() (*int64, bool)`

GetBusinessIdOk returns a tuple with the BusinessId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusinessId

`func (o *GenerateBoostConsolidatedRequest) SetBusinessId(v int64)`

SetBusinessId sets BusinessId field to given value.


### GetDateFrom

`func (o *GenerateBoostConsolidatedRequest) GetDateFrom() string`

GetDateFrom returns the DateFrom field if non-nil, zero value otherwise.

### GetDateFromOk

`func (o *GenerateBoostConsolidatedRequest) GetDateFromOk() (*string, bool)`

GetDateFromOk returns a tuple with the DateFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateFrom

`func (o *GenerateBoostConsolidatedRequest) SetDateFrom(v string)`

SetDateFrom sets DateFrom field to given value.


### GetDateTo

`func (o *GenerateBoostConsolidatedRequest) GetDateTo() string`

GetDateTo returns the DateTo field if non-nil, zero value otherwise.

### GetDateToOk

`func (o *GenerateBoostConsolidatedRequest) GetDateToOk() (*string, bool)`

GetDateToOk returns a tuple with the DateTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateTo

`func (o *GenerateBoostConsolidatedRequest) SetDateTo(v string)`

SetDateTo sets DateTo field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


