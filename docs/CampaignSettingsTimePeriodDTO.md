# CampaignSettingsTimePeriodDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FromDate** | Pointer to **string** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 
**ToDate** | Pointer to **string** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 

## Methods

### NewCampaignSettingsTimePeriodDTO

`func NewCampaignSettingsTimePeriodDTO() *CampaignSettingsTimePeriodDTO`

NewCampaignSettingsTimePeriodDTO instantiates a new CampaignSettingsTimePeriodDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignSettingsTimePeriodDTOWithDefaults

`func NewCampaignSettingsTimePeriodDTOWithDefaults() *CampaignSettingsTimePeriodDTO`

NewCampaignSettingsTimePeriodDTOWithDefaults instantiates a new CampaignSettingsTimePeriodDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFromDate

`func (o *CampaignSettingsTimePeriodDTO) GetFromDate() string`

GetFromDate returns the FromDate field if non-nil, zero value otherwise.

### GetFromDateOk

`func (o *CampaignSettingsTimePeriodDTO) GetFromDateOk() (*string, bool)`

GetFromDateOk returns a tuple with the FromDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFromDate

`func (o *CampaignSettingsTimePeriodDTO) SetFromDate(v string)`

SetFromDate sets FromDate field to given value.

### HasFromDate

`func (o *CampaignSettingsTimePeriodDTO) HasFromDate() bool`

HasFromDate returns a boolean if a field has been set.

### GetToDate

`func (o *CampaignSettingsTimePeriodDTO) GetToDate() string`

GetToDate returns the ToDate field if non-nil, zero value otherwise.

### GetToDateOk

`func (o *CampaignSettingsTimePeriodDTO) GetToDateOk() (*string, bool)`

GetToDateOk returns a tuple with the ToDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToDate

`func (o *CampaignSettingsTimePeriodDTO) SetToDate(v string)`

SetToDate sets ToDate field to given value.

### HasToDate

`func (o *CampaignSettingsTimePeriodDTO) HasToDate() bool`

HasToDate returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


