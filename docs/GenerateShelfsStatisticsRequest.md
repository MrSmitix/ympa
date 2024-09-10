# GenerateShelfsStatisticsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessId** | **int64** | Идентификатор бизнеса. | 
**DateFrom** | **string** | Начало периода, включительно. | 
**DateTo** | **string** | Конец периода, включительно. | 
**AttributionType** | [**ShelfsStatisticsAttributionType**](ShelfsStatisticsAttributionType.md) |  | 

## Methods

### NewGenerateShelfsStatisticsRequest

`func NewGenerateShelfsStatisticsRequest(businessId int64, dateFrom string, dateTo string, attributionType ShelfsStatisticsAttributionType, ) *GenerateShelfsStatisticsRequest`

NewGenerateShelfsStatisticsRequest instantiates a new GenerateShelfsStatisticsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGenerateShelfsStatisticsRequestWithDefaults

`func NewGenerateShelfsStatisticsRequestWithDefaults() *GenerateShelfsStatisticsRequest`

NewGenerateShelfsStatisticsRequestWithDefaults instantiates a new GenerateShelfsStatisticsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBusinessId

`func (o *GenerateShelfsStatisticsRequest) GetBusinessId() int64`

GetBusinessId returns the BusinessId field if non-nil, zero value otherwise.

### GetBusinessIdOk

`func (o *GenerateShelfsStatisticsRequest) GetBusinessIdOk() (*int64, bool)`

GetBusinessIdOk returns a tuple with the BusinessId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusinessId

`func (o *GenerateShelfsStatisticsRequest) SetBusinessId(v int64)`

SetBusinessId sets BusinessId field to given value.


### GetDateFrom

`func (o *GenerateShelfsStatisticsRequest) GetDateFrom() string`

GetDateFrom returns the DateFrom field if non-nil, zero value otherwise.

### GetDateFromOk

`func (o *GenerateShelfsStatisticsRequest) GetDateFromOk() (*string, bool)`

GetDateFromOk returns a tuple with the DateFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateFrom

`func (o *GenerateShelfsStatisticsRequest) SetDateFrom(v string)`

SetDateFrom sets DateFrom field to given value.


### GetDateTo

`func (o *GenerateShelfsStatisticsRequest) GetDateTo() string`

GetDateTo returns the DateTo field if non-nil, zero value otherwise.

### GetDateToOk

`func (o *GenerateShelfsStatisticsRequest) GetDateToOk() (*string, bool)`

GetDateToOk returns a tuple with the DateTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateTo

`func (o *GenerateShelfsStatisticsRequest) SetDateTo(v string)`

SetDateTo sets DateTo field to given value.


### GetAttributionType

`func (o *GenerateShelfsStatisticsRequest) GetAttributionType() ShelfsStatisticsAttributionType`

GetAttributionType returns the AttributionType field if non-nil, zero value otherwise.

### GetAttributionTypeOk

`func (o *GenerateShelfsStatisticsRequest) GetAttributionTypeOk() (*ShelfsStatisticsAttributionType, bool)`

GetAttributionTypeOk returns a tuple with the AttributionType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributionType

`func (o *GenerateShelfsStatisticsRequest) SetAttributionType(v ShelfsStatisticsAttributionType)`

SetAttributionType sets AttributionType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


