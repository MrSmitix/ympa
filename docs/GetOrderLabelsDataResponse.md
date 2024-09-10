# GetOrderLabelsDataResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | Pointer to [**OrderLabelDTO**](OrderLabelDTO.md) |  | [optional] 

## Methods

### NewGetOrderLabelsDataResponse

`func NewGetOrderLabelsDataResponse() *GetOrderLabelsDataResponse`

NewGetOrderLabelsDataResponse instantiates a new GetOrderLabelsDataResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetOrderLabelsDataResponseWithDefaults

`func NewGetOrderLabelsDataResponseWithDefaults() *GetOrderLabelsDataResponse`

NewGetOrderLabelsDataResponseWithDefaults instantiates a new GetOrderLabelsDataResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *GetOrderLabelsDataResponse) GetStatus() ApiResponseStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GetOrderLabelsDataResponse) GetStatusOk() (*ApiResponseStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GetOrderLabelsDataResponse) SetStatus(v ApiResponseStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *GetOrderLabelsDataResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetResult

`func (o *GetOrderLabelsDataResponse) GetResult() OrderLabelDTO`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *GetOrderLabelsDataResponse) GetResultOk() (*OrderLabelDTO, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *GetOrderLabelsDataResponse) SetResult(v OrderLabelDTO)`

SetResult sets Result field to given value.

### HasResult

`func (o *GetOrderLabelsDataResponse) HasResult() bool`

HasResult returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


