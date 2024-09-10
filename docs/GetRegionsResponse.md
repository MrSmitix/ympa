# GetRegionsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Regions** | [**[]RegionDTO**](RegionDTO.md) | Регион доставки. | 
**Paging** | Pointer to [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Methods

### NewGetRegionsResponse

`func NewGetRegionsResponse(regions []RegionDTO, ) *GetRegionsResponse`

NewGetRegionsResponse instantiates a new GetRegionsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetRegionsResponseWithDefaults

`func NewGetRegionsResponseWithDefaults() *GetRegionsResponse`

NewGetRegionsResponseWithDefaults instantiates a new GetRegionsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRegions

`func (o *GetRegionsResponse) GetRegions() []RegionDTO`

GetRegions returns the Regions field if non-nil, zero value otherwise.

### GetRegionsOk

`func (o *GetRegionsResponse) GetRegionsOk() (*[]RegionDTO, bool)`

GetRegionsOk returns a tuple with the Regions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegions

`func (o *GetRegionsResponse) SetRegions(v []RegionDTO)`

SetRegions sets Regions field to given value.


### GetPaging

`func (o *GetRegionsResponse) GetPaging() ForwardScrollingPagerDTO`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *GetRegionsResponse) GetPagingOk() (*ForwardScrollingPagerDTO, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *GetRegionsResponse) SetPaging(v ForwardScrollingPagerDTO)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *GetRegionsResponse) HasPaging() bool`

HasPaging returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


