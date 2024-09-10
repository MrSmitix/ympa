# GetCampaignsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Campaigns** | [**[]CampaignDTO**](CampaignDTO.md) | Список с информацией по каждому магазину. | 
**Pager** | Pointer to [**FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] 

## Methods

### NewGetCampaignsResponse

`func NewGetCampaignsResponse(campaigns []CampaignDTO, ) *GetCampaignsResponse`

NewGetCampaignsResponse instantiates a new GetCampaignsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetCampaignsResponseWithDefaults

`func NewGetCampaignsResponseWithDefaults() *GetCampaignsResponse`

NewGetCampaignsResponseWithDefaults instantiates a new GetCampaignsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCampaigns

`func (o *GetCampaignsResponse) GetCampaigns() []CampaignDTO`

GetCampaigns returns the Campaigns field if non-nil, zero value otherwise.

### GetCampaignsOk

`func (o *GetCampaignsResponse) GetCampaignsOk() (*[]CampaignDTO, bool)`

GetCampaignsOk returns a tuple with the Campaigns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaigns

`func (o *GetCampaignsResponse) SetCampaigns(v []CampaignDTO)`

SetCampaigns sets Campaigns field to given value.


### GetPager

`func (o *GetCampaignsResponse) GetPager() FlippingPagerDTO`

GetPager returns the Pager field if non-nil, zero value otherwise.

### GetPagerOk

`func (o *GetCampaignsResponse) GetPagerOk() (*FlippingPagerDTO, bool)`

GetPagerOk returns a tuple with the Pager field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPager

`func (o *GetCampaignsResponse) SetPager(v FlippingPagerDTO)`

SetPager sets Pager field to given value.

### HasPager

`func (o *GetCampaignsResponse) HasPager() bool`

HasPager returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


