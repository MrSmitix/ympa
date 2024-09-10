# GetBusinessSettingsInfoDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Info** | Pointer to [**BusinessDTO**](BusinessDTO.md) |  | [optional] 
**Settings** | Pointer to [**BusinessSettingsDTO**](BusinessSettingsDTO.md) |  | [optional] 

## Methods

### NewGetBusinessSettingsInfoDTO

`func NewGetBusinessSettingsInfoDTO() *GetBusinessSettingsInfoDTO`

NewGetBusinessSettingsInfoDTO instantiates a new GetBusinessSettingsInfoDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetBusinessSettingsInfoDTOWithDefaults

`func NewGetBusinessSettingsInfoDTOWithDefaults() *GetBusinessSettingsInfoDTO`

NewGetBusinessSettingsInfoDTOWithDefaults instantiates a new GetBusinessSettingsInfoDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInfo

`func (o *GetBusinessSettingsInfoDTO) GetInfo() BusinessDTO`

GetInfo returns the Info field if non-nil, zero value otherwise.

### GetInfoOk

`func (o *GetBusinessSettingsInfoDTO) GetInfoOk() (*BusinessDTO, bool)`

GetInfoOk returns a tuple with the Info field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInfo

`func (o *GetBusinessSettingsInfoDTO) SetInfo(v BusinessDTO)`

SetInfo sets Info field to given value.

### HasInfo

`func (o *GetBusinessSettingsInfoDTO) HasInfo() bool`

HasInfo returns a boolean if a field has been set.

### GetSettings

`func (o *GetBusinessSettingsInfoDTO) GetSettings() BusinessSettingsDTO`

GetSettings returns the Settings field if non-nil, zero value otherwise.

### GetSettingsOk

`func (o *GetBusinessSettingsInfoDTO) GetSettingsOk() (*BusinessSettingsDTO, bool)`

GetSettingsOk returns a tuple with the Settings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSettings

`func (o *GetBusinessSettingsInfoDTO) SetSettings(v BusinessSettingsDTO)`

SetSettings sets Settings field to given value.

### HasSettings

`func (o *GetBusinessSettingsInfoDTO) HasSettings() bool`

HasSettings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


