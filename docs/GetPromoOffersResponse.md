# GetPromoOffersResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | Pointer to [**GetPromoOffersResultDTO**](GetPromoOffersResultDTO.md) |  | [optional] 

## Methods

### NewGetPromoOffersResponse

`func NewGetPromoOffersResponse() *GetPromoOffersResponse`

NewGetPromoOffersResponse instantiates a new GetPromoOffersResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetPromoOffersResponseWithDefaults

`func NewGetPromoOffersResponseWithDefaults() *GetPromoOffersResponse`

NewGetPromoOffersResponseWithDefaults instantiates a new GetPromoOffersResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *GetPromoOffersResponse) GetStatus() ApiResponseStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GetPromoOffersResponse) GetStatusOk() (*ApiResponseStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GetPromoOffersResponse) SetStatus(v ApiResponseStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *GetPromoOffersResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetResult

`func (o *GetPromoOffersResponse) GetResult() GetPromoOffersResultDTO`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *GetPromoOffersResponse) GetResultOk() (*GetPromoOffersResultDTO, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *GetPromoOffersResponse) SetResult(v GetPromoOffersResultDTO)`

SetResult sets Result field to given value.

### HasResult

`func (o *GetPromoOffersResponse) HasResult() bool`

HasResult returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


