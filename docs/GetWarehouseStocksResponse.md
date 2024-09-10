# GetWarehouseStocksResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | Pointer to [**GetWarehouseStocksDTO**](GetWarehouseStocksDTO.md) |  | [optional] 

## Methods

### NewGetWarehouseStocksResponse

`func NewGetWarehouseStocksResponse() *GetWarehouseStocksResponse`

NewGetWarehouseStocksResponse instantiates a new GetWarehouseStocksResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetWarehouseStocksResponseWithDefaults

`func NewGetWarehouseStocksResponseWithDefaults() *GetWarehouseStocksResponse`

NewGetWarehouseStocksResponseWithDefaults instantiates a new GetWarehouseStocksResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *GetWarehouseStocksResponse) GetStatus() ApiResponseStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GetWarehouseStocksResponse) GetStatusOk() (*ApiResponseStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GetWarehouseStocksResponse) SetStatus(v ApiResponseStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *GetWarehouseStocksResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetResult

`func (o *GetWarehouseStocksResponse) GetResult() GetWarehouseStocksDTO`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *GetWarehouseStocksResponse) GetResultOk() (*GetWarehouseStocksDTO, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *GetWarehouseStocksResponse) SetResult(v GetWarehouseStocksDTO)`

SetResult sets Result field to given value.

### HasResult

`func (o *GetWarehouseStocksResponse) HasResult() bool`

HasResult returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


