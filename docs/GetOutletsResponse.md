# GetOutletsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Outlets** | [**[]FullOutletDTO**](FullOutletDTO.md) | Информация о точках продаж. | 
**Paging** | Pointer to [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**Pager** | Pointer to [**FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] 

## Methods

### NewGetOutletsResponse

`func NewGetOutletsResponse(outlets []FullOutletDTO, ) *GetOutletsResponse`

NewGetOutletsResponse instantiates a new GetOutletsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetOutletsResponseWithDefaults

`func NewGetOutletsResponseWithDefaults() *GetOutletsResponse`

NewGetOutletsResponseWithDefaults instantiates a new GetOutletsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOutlets

`func (o *GetOutletsResponse) GetOutlets() []FullOutletDTO`

GetOutlets returns the Outlets field if non-nil, zero value otherwise.

### GetOutletsOk

`func (o *GetOutletsResponse) GetOutletsOk() (*[]FullOutletDTO, bool)`

GetOutletsOk returns a tuple with the Outlets field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutlets

`func (o *GetOutletsResponse) SetOutlets(v []FullOutletDTO)`

SetOutlets sets Outlets field to given value.


### GetPaging

`func (o *GetOutletsResponse) GetPaging() ScrollingPagerDTO`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *GetOutletsResponse) GetPagingOk() (*ScrollingPagerDTO, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *GetOutletsResponse) SetPaging(v ScrollingPagerDTO)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *GetOutletsResponse) HasPaging() bool`

HasPaging returns a boolean if a field has been set.

### GetPager

`func (o *GetOutletsResponse) GetPager() FlippingPagerDTO`

GetPager returns the Pager field if non-nil, zero value otherwise.

### GetPagerOk

`func (o *GetOutletsResponse) GetPagerOk() (*FlippingPagerDTO, bool)`

GetPagerOk returns a tuple with the Pager field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPager

`func (o *GetOutletsResponse) SetPager(v FlippingPagerDTO)`

SetPager sets Pager field to given value.

### HasPager

`func (o *GetOutletsResponse) HasPager() bool`

HasPager returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


