# GetRegionWithChildrenResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Pager** | Pointer to [**FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] 
**Regions** | Pointer to [**RegionDTO**](RegionDTO.md) |  | [optional] 

## Methods

### NewGetRegionWithChildrenResponse

`func NewGetRegionWithChildrenResponse() *GetRegionWithChildrenResponse`

NewGetRegionWithChildrenResponse instantiates a new GetRegionWithChildrenResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetRegionWithChildrenResponseWithDefaults

`func NewGetRegionWithChildrenResponseWithDefaults() *GetRegionWithChildrenResponse`

NewGetRegionWithChildrenResponseWithDefaults instantiates a new GetRegionWithChildrenResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPager

`func (o *GetRegionWithChildrenResponse) GetPager() FlippingPagerDTO`

GetPager returns the Pager field if non-nil, zero value otherwise.

### GetPagerOk

`func (o *GetRegionWithChildrenResponse) GetPagerOk() (*FlippingPagerDTO, bool)`

GetPagerOk returns a tuple with the Pager field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPager

`func (o *GetRegionWithChildrenResponse) SetPager(v FlippingPagerDTO)`

SetPager sets Pager field to given value.

### HasPager

`func (o *GetRegionWithChildrenResponse) HasPager() bool`

HasPager returns a boolean if a field has been set.

### GetRegions

`func (o *GetRegionWithChildrenResponse) GetRegions() RegionDTO`

GetRegions returns the Regions field if non-nil, zero value otherwise.

### GetRegionsOk

`func (o *GetRegionWithChildrenResponse) GetRegionsOk() (*RegionDTO, bool)`

GetRegionsOk returns a tuple with the Regions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegions

`func (o *GetRegionWithChildrenResponse) SetRegions(v RegionDTO)`

SetRegions sets Regions field to given value.

### HasRegions

`func (o *GetRegionWithChildrenResponse) HasRegions() bool`

HasRegions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


