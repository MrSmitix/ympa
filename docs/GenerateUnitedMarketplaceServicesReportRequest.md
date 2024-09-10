# GenerateUnitedMarketplaceServicesReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessId** | **int64** | Идентификатор бизнеса. | 
**DateTimeFrom** | Pointer to **time.Time** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  | [optional] 
**DateTimeTo** | Pointer to **time.Time** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  | [optional] 
**DateFrom** | Pointer to **string** | Начало периода, включительно. | [optional] 
**DateTo** | Pointer to **string** | Конец периода, включительно. Максимальный период — 1 год. | [optional] 
**YearFrom** | Pointer to **int32** | Начальный год формирования акта. | [optional] 
**MonthFrom** | Pointer to **int32** | Начальный номер месяца формирования акта. | [optional] 
**YearTo** | Pointer to **int32** | Конечный год формирования акта. | [optional] 
**MonthTo** | Pointer to **int32** | Конечный номер месяца формирования акта. | [optional] 
**PlacementPrograms** | Pointer to [**[]PlacementType**](PlacementType.md) | Список моделей, которые нужны в отчете.  | [optional] 
**Inns** | Pointer to **[]string** | Список ИНН, которые нужны в отчете. | [optional] 
**CampaignIds** | Pointer to **[]int64** | Список магазинов, которые нужны в отчете. | [optional] 

## Methods

### NewGenerateUnitedMarketplaceServicesReportRequest

`func NewGenerateUnitedMarketplaceServicesReportRequest(businessId int64, ) *GenerateUnitedMarketplaceServicesReportRequest`

NewGenerateUnitedMarketplaceServicesReportRequest instantiates a new GenerateUnitedMarketplaceServicesReportRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGenerateUnitedMarketplaceServicesReportRequestWithDefaults

`func NewGenerateUnitedMarketplaceServicesReportRequestWithDefaults() *GenerateUnitedMarketplaceServicesReportRequest`

NewGenerateUnitedMarketplaceServicesReportRequestWithDefaults instantiates a new GenerateUnitedMarketplaceServicesReportRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBusinessId

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetBusinessId() int64`

GetBusinessId returns the BusinessId field if non-nil, zero value otherwise.

### GetBusinessIdOk

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetBusinessIdOk() (*int64, bool)`

GetBusinessIdOk returns a tuple with the BusinessId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusinessId

`func (o *GenerateUnitedMarketplaceServicesReportRequest) SetBusinessId(v int64)`

SetBusinessId sets BusinessId field to given value.


### GetDateTimeFrom

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetDateTimeFrom() time.Time`

GetDateTimeFrom returns the DateTimeFrom field if non-nil, zero value otherwise.

### GetDateTimeFromOk

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetDateTimeFromOk() (*time.Time, bool)`

GetDateTimeFromOk returns a tuple with the DateTimeFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateTimeFrom

`func (o *GenerateUnitedMarketplaceServicesReportRequest) SetDateTimeFrom(v time.Time)`

SetDateTimeFrom sets DateTimeFrom field to given value.

### HasDateTimeFrom

`func (o *GenerateUnitedMarketplaceServicesReportRequest) HasDateTimeFrom() bool`

HasDateTimeFrom returns a boolean if a field has been set.

### GetDateTimeTo

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetDateTimeTo() time.Time`

GetDateTimeTo returns the DateTimeTo field if non-nil, zero value otherwise.

### GetDateTimeToOk

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetDateTimeToOk() (*time.Time, bool)`

GetDateTimeToOk returns a tuple with the DateTimeTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateTimeTo

`func (o *GenerateUnitedMarketplaceServicesReportRequest) SetDateTimeTo(v time.Time)`

SetDateTimeTo sets DateTimeTo field to given value.

### HasDateTimeTo

`func (o *GenerateUnitedMarketplaceServicesReportRequest) HasDateTimeTo() bool`

HasDateTimeTo returns a boolean if a field has been set.

### GetDateFrom

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetDateFrom() string`

GetDateFrom returns the DateFrom field if non-nil, zero value otherwise.

### GetDateFromOk

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetDateFromOk() (*string, bool)`

GetDateFromOk returns a tuple with the DateFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateFrom

`func (o *GenerateUnitedMarketplaceServicesReportRequest) SetDateFrom(v string)`

SetDateFrom sets DateFrom field to given value.

### HasDateFrom

`func (o *GenerateUnitedMarketplaceServicesReportRequest) HasDateFrom() bool`

HasDateFrom returns a boolean if a field has been set.

### GetDateTo

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetDateTo() string`

GetDateTo returns the DateTo field if non-nil, zero value otherwise.

### GetDateToOk

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetDateToOk() (*string, bool)`

GetDateToOk returns a tuple with the DateTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateTo

`func (o *GenerateUnitedMarketplaceServicesReportRequest) SetDateTo(v string)`

SetDateTo sets DateTo field to given value.

### HasDateTo

`func (o *GenerateUnitedMarketplaceServicesReportRequest) HasDateTo() bool`

HasDateTo returns a boolean if a field has been set.

### GetYearFrom

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetYearFrom() int32`

GetYearFrom returns the YearFrom field if non-nil, zero value otherwise.

### GetYearFromOk

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetYearFromOk() (*int32, bool)`

GetYearFromOk returns a tuple with the YearFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetYearFrom

`func (o *GenerateUnitedMarketplaceServicesReportRequest) SetYearFrom(v int32)`

SetYearFrom sets YearFrom field to given value.

### HasYearFrom

`func (o *GenerateUnitedMarketplaceServicesReportRequest) HasYearFrom() bool`

HasYearFrom returns a boolean if a field has been set.

### GetMonthFrom

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetMonthFrom() int32`

GetMonthFrom returns the MonthFrom field if non-nil, zero value otherwise.

### GetMonthFromOk

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetMonthFromOk() (*int32, bool)`

GetMonthFromOk returns a tuple with the MonthFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMonthFrom

`func (o *GenerateUnitedMarketplaceServicesReportRequest) SetMonthFrom(v int32)`

SetMonthFrom sets MonthFrom field to given value.

### HasMonthFrom

`func (o *GenerateUnitedMarketplaceServicesReportRequest) HasMonthFrom() bool`

HasMonthFrom returns a boolean if a field has been set.

### GetYearTo

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetYearTo() int32`

GetYearTo returns the YearTo field if non-nil, zero value otherwise.

### GetYearToOk

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetYearToOk() (*int32, bool)`

GetYearToOk returns a tuple with the YearTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetYearTo

`func (o *GenerateUnitedMarketplaceServicesReportRequest) SetYearTo(v int32)`

SetYearTo sets YearTo field to given value.

### HasYearTo

`func (o *GenerateUnitedMarketplaceServicesReportRequest) HasYearTo() bool`

HasYearTo returns a boolean if a field has been set.

### GetMonthTo

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetMonthTo() int32`

GetMonthTo returns the MonthTo field if non-nil, zero value otherwise.

### GetMonthToOk

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetMonthToOk() (*int32, bool)`

GetMonthToOk returns a tuple with the MonthTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMonthTo

`func (o *GenerateUnitedMarketplaceServicesReportRequest) SetMonthTo(v int32)`

SetMonthTo sets MonthTo field to given value.

### HasMonthTo

`func (o *GenerateUnitedMarketplaceServicesReportRequest) HasMonthTo() bool`

HasMonthTo returns a boolean if a field has been set.

### GetPlacementPrograms

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetPlacementPrograms() []PlacementType`

GetPlacementPrograms returns the PlacementPrograms field if non-nil, zero value otherwise.

### GetPlacementProgramsOk

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetPlacementProgramsOk() (*[]PlacementType, bool)`

GetPlacementProgramsOk returns a tuple with the PlacementPrograms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacementPrograms

`func (o *GenerateUnitedMarketplaceServicesReportRequest) SetPlacementPrograms(v []PlacementType)`

SetPlacementPrograms sets PlacementPrograms field to given value.

### HasPlacementPrograms

`func (o *GenerateUnitedMarketplaceServicesReportRequest) HasPlacementPrograms() bool`

HasPlacementPrograms returns a boolean if a field has been set.

### SetPlacementProgramsNil

`func (o *GenerateUnitedMarketplaceServicesReportRequest) SetPlacementProgramsNil(b bool)`

 SetPlacementProgramsNil sets the value for PlacementPrograms to be an explicit nil

### UnsetPlacementPrograms
`func (o *GenerateUnitedMarketplaceServicesReportRequest) UnsetPlacementPrograms()`

UnsetPlacementPrograms ensures that no value is present for PlacementPrograms, not even an explicit nil
### GetInns

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetInns() []string`

GetInns returns the Inns field if non-nil, zero value otherwise.

### GetInnsOk

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetInnsOk() (*[]string, bool)`

GetInnsOk returns a tuple with the Inns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInns

`func (o *GenerateUnitedMarketplaceServicesReportRequest) SetInns(v []string)`

SetInns sets Inns field to given value.

### HasInns

`func (o *GenerateUnitedMarketplaceServicesReportRequest) HasInns() bool`

HasInns returns a boolean if a field has been set.

### SetInnsNil

`func (o *GenerateUnitedMarketplaceServicesReportRequest) SetInnsNil(b bool)`

 SetInnsNil sets the value for Inns to be an explicit nil

### UnsetInns
`func (o *GenerateUnitedMarketplaceServicesReportRequest) UnsetInns()`

UnsetInns ensures that no value is present for Inns, not even an explicit nil
### GetCampaignIds

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetCampaignIds() []int64`

GetCampaignIds returns the CampaignIds field if non-nil, zero value otherwise.

### GetCampaignIdsOk

`func (o *GenerateUnitedMarketplaceServicesReportRequest) GetCampaignIdsOk() (*[]int64, bool)`

GetCampaignIdsOk returns a tuple with the CampaignIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignIds

`func (o *GenerateUnitedMarketplaceServicesReportRequest) SetCampaignIds(v []int64)`

SetCampaignIds sets CampaignIds field to given value.

### HasCampaignIds

`func (o *GenerateUnitedMarketplaceServicesReportRequest) HasCampaignIds() bool`

HasCampaignIds returns a boolean if a field has been set.

### SetCampaignIdsNil

`func (o *GenerateUnitedMarketplaceServicesReportRequest) SetCampaignIdsNil(b bool)`

 SetCampaignIdsNil sets the value for CampaignIds to be an explicit nil

### UnsetCampaignIds
`func (o *GenerateUnitedMarketplaceServicesReportRequest) UnsetCampaignIds()`

UnsetCampaignIds ensures that no value is present for CampaignIds, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


