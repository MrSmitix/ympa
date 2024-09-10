# ReportInfoDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ReportStatusType**](ReportStatusType.md) |  | 
**SubStatus** | Pointer to [**ReportSubStatusType**](ReportSubStatusType.md) |  | [optional] 
**GenerationRequestedAt** | **time.Time** | Дата и время запроса на генерацию. | 
**GenerationFinishedAt** | Pointer to **time.Time** | Дата и время завершения генерации. | [optional] 
**File** | Pointer to **string** | Ссылка на готовый отчет. | [optional] 
**EstimatedGenerationTime** | Pointer to **int64** | Ожидаемая продолжительность генерации в миллисекундах. | [optional] 

## Methods

### NewReportInfoDTO

`func NewReportInfoDTO(status ReportStatusType, generationRequestedAt time.Time, ) *ReportInfoDTO`

NewReportInfoDTO instantiates a new ReportInfoDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewReportInfoDTOWithDefaults

`func NewReportInfoDTOWithDefaults() *ReportInfoDTO`

NewReportInfoDTOWithDefaults instantiates a new ReportInfoDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *ReportInfoDTO) GetStatus() ReportStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ReportInfoDTO) GetStatusOk() (*ReportStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ReportInfoDTO) SetStatus(v ReportStatusType)`

SetStatus sets Status field to given value.


### GetSubStatus

`func (o *ReportInfoDTO) GetSubStatus() ReportSubStatusType`

GetSubStatus returns the SubStatus field if non-nil, zero value otherwise.

### GetSubStatusOk

`func (o *ReportInfoDTO) GetSubStatusOk() (*ReportSubStatusType, bool)`

GetSubStatusOk returns a tuple with the SubStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubStatus

`func (o *ReportInfoDTO) SetSubStatus(v ReportSubStatusType)`

SetSubStatus sets SubStatus field to given value.

### HasSubStatus

`func (o *ReportInfoDTO) HasSubStatus() bool`

HasSubStatus returns a boolean if a field has been set.

### GetGenerationRequestedAt

`func (o *ReportInfoDTO) GetGenerationRequestedAt() time.Time`

GetGenerationRequestedAt returns the GenerationRequestedAt field if non-nil, zero value otherwise.

### GetGenerationRequestedAtOk

`func (o *ReportInfoDTO) GetGenerationRequestedAtOk() (*time.Time, bool)`

GetGenerationRequestedAtOk returns a tuple with the GenerationRequestedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGenerationRequestedAt

`func (o *ReportInfoDTO) SetGenerationRequestedAt(v time.Time)`

SetGenerationRequestedAt sets GenerationRequestedAt field to given value.


### GetGenerationFinishedAt

`func (o *ReportInfoDTO) GetGenerationFinishedAt() time.Time`

GetGenerationFinishedAt returns the GenerationFinishedAt field if non-nil, zero value otherwise.

### GetGenerationFinishedAtOk

`func (o *ReportInfoDTO) GetGenerationFinishedAtOk() (*time.Time, bool)`

GetGenerationFinishedAtOk returns a tuple with the GenerationFinishedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGenerationFinishedAt

`func (o *ReportInfoDTO) SetGenerationFinishedAt(v time.Time)`

SetGenerationFinishedAt sets GenerationFinishedAt field to given value.

### HasGenerationFinishedAt

`func (o *ReportInfoDTO) HasGenerationFinishedAt() bool`

HasGenerationFinishedAt returns a boolean if a field has been set.

### GetFile

`func (o *ReportInfoDTO) GetFile() string`

GetFile returns the File field if non-nil, zero value otherwise.

### GetFileOk

`func (o *ReportInfoDTO) GetFileOk() (*string, bool)`

GetFileOk returns a tuple with the File field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFile

`func (o *ReportInfoDTO) SetFile(v string)`

SetFile sets File field to given value.

### HasFile

`func (o *ReportInfoDTO) HasFile() bool`

HasFile returns a boolean if a field has been set.

### GetEstimatedGenerationTime

`func (o *ReportInfoDTO) GetEstimatedGenerationTime() int64`

GetEstimatedGenerationTime returns the EstimatedGenerationTime field if non-nil, zero value otherwise.

### GetEstimatedGenerationTimeOk

`func (o *ReportInfoDTO) GetEstimatedGenerationTimeOk() (*int64, bool)`

GetEstimatedGenerationTimeOk returns a tuple with the EstimatedGenerationTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEstimatedGenerationTime

`func (o *ReportInfoDTO) SetEstimatedGenerationTime(v int64)`

SetEstimatedGenerationTime sets EstimatedGenerationTime field to given value.

### HasEstimatedGenerationTime

`func (o *ReportInfoDTO) HasEstimatedGenerationTime() bool`

HasEstimatedGenerationTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


