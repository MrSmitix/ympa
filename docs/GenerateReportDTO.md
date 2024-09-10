# GenerateReportDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportId** | **string** | Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета. | 
**EstimatedGenerationTime** | **int64** | Ожидаемая продолжительность генерации в миллисекундах. | 

## Methods

### NewGenerateReportDTO

`func NewGenerateReportDTO(reportId string, estimatedGenerationTime int64, ) *GenerateReportDTO`

NewGenerateReportDTO instantiates a new GenerateReportDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGenerateReportDTOWithDefaults

`func NewGenerateReportDTOWithDefaults() *GenerateReportDTO`

NewGenerateReportDTOWithDefaults instantiates a new GenerateReportDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetReportId

`func (o *GenerateReportDTO) GetReportId() string`

GetReportId returns the ReportId field if non-nil, zero value otherwise.

### GetReportIdOk

`func (o *GenerateReportDTO) GetReportIdOk() (*string, bool)`

GetReportIdOk returns a tuple with the ReportId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportId

`func (o *GenerateReportDTO) SetReportId(v string)`

SetReportId sets ReportId field to given value.


### GetEstimatedGenerationTime

`func (o *GenerateReportDTO) GetEstimatedGenerationTime() int64`

GetEstimatedGenerationTime returns the EstimatedGenerationTime field if non-nil, zero value otherwise.

### GetEstimatedGenerationTimeOk

`func (o *GenerateReportDTO) GetEstimatedGenerationTimeOk() (*int64, bool)`

GetEstimatedGenerationTimeOk returns a tuple with the EstimatedGenerationTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEstimatedGenerationTime

`func (o *GenerateReportDTO) SetEstimatedGenerationTime(v int64)`

SetEstimatedGenerationTime sets EstimatedGenerationTime field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


