# GetCampaignResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Campaign** | Pointer to [**CampaignDTO**](CampaignDTO.md) |  | [optional] 

## Methods

### NewGetCampaignResponse

`func NewGetCampaignResponse() *GetCampaignResponse`

NewGetCampaignResponse instantiates a new GetCampaignResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetCampaignResponseWithDefaults

`func NewGetCampaignResponseWithDefaults() *GetCampaignResponse`

NewGetCampaignResponseWithDefaults instantiates a new GetCampaignResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCampaign

`func (o *GetCampaignResponse) GetCampaign() CampaignDTO`

GetCampaign returns the Campaign field if non-nil, zero value otherwise.

### GetCampaignOk

`func (o *GetCampaignResponse) GetCampaignOk() (*CampaignDTO, bool)`

GetCampaignOk returns a tuple with the Campaign field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaign

`func (o *GetCampaignResponse) SetCampaign(v CampaignDTO)`

SetCampaign sets Campaign field to given value.

### HasCampaign

`func (o *GetCampaignResponse) HasCampaign() bool`

HasCampaign returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


