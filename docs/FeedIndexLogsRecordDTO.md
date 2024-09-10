# FeedIndexLogsRecordDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DownloadTime** | Pointer to **time.Time** | Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 
**FileTime** | Pointer to **time.Time** | Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 
**GenerationId** | Pointer to **int64** | Идентификатор индексации. | [optional] 
**IndexType** | Pointer to [**FeedIndexLogsIndexType**](FeedIndexLogsIndexType.md) |  | [optional] 
**PublishedTime** | Pointer to **time.Time** | Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 
**Status** | Pointer to [**FeedIndexLogsStatusType**](FeedIndexLogsStatusType.md) |  | [optional] 
**Error** | Pointer to [**FeedIndexLogsErrorDTO**](FeedIndexLogsErrorDTO.md) |  | [optional] 
**Offers** | Pointer to [**FeedIndexLogsOffersDTO**](FeedIndexLogsOffersDTO.md) |  | [optional] 

## Methods

### NewFeedIndexLogsRecordDTO

`func NewFeedIndexLogsRecordDTO() *FeedIndexLogsRecordDTO`

NewFeedIndexLogsRecordDTO instantiates a new FeedIndexLogsRecordDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeedIndexLogsRecordDTOWithDefaults

`func NewFeedIndexLogsRecordDTOWithDefaults() *FeedIndexLogsRecordDTO`

NewFeedIndexLogsRecordDTOWithDefaults instantiates a new FeedIndexLogsRecordDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDownloadTime

`func (o *FeedIndexLogsRecordDTO) GetDownloadTime() time.Time`

GetDownloadTime returns the DownloadTime field if non-nil, zero value otherwise.

### GetDownloadTimeOk

`func (o *FeedIndexLogsRecordDTO) GetDownloadTimeOk() (*time.Time, bool)`

GetDownloadTimeOk returns a tuple with the DownloadTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDownloadTime

`func (o *FeedIndexLogsRecordDTO) SetDownloadTime(v time.Time)`

SetDownloadTime sets DownloadTime field to given value.

### HasDownloadTime

`func (o *FeedIndexLogsRecordDTO) HasDownloadTime() bool`

HasDownloadTime returns a boolean if a field has been set.

### GetFileTime

`func (o *FeedIndexLogsRecordDTO) GetFileTime() time.Time`

GetFileTime returns the FileTime field if non-nil, zero value otherwise.

### GetFileTimeOk

`func (o *FeedIndexLogsRecordDTO) GetFileTimeOk() (*time.Time, bool)`

GetFileTimeOk returns a tuple with the FileTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileTime

`func (o *FeedIndexLogsRecordDTO) SetFileTime(v time.Time)`

SetFileTime sets FileTime field to given value.

### HasFileTime

`func (o *FeedIndexLogsRecordDTO) HasFileTime() bool`

HasFileTime returns a boolean if a field has been set.

### GetGenerationId

`func (o *FeedIndexLogsRecordDTO) GetGenerationId() int64`

GetGenerationId returns the GenerationId field if non-nil, zero value otherwise.

### GetGenerationIdOk

`func (o *FeedIndexLogsRecordDTO) GetGenerationIdOk() (*int64, bool)`

GetGenerationIdOk returns a tuple with the GenerationId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGenerationId

`func (o *FeedIndexLogsRecordDTO) SetGenerationId(v int64)`

SetGenerationId sets GenerationId field to given value.

### HasGenerationId

`func (o *FeedIndexLogsRecordDTO) HasGenerationId() bool`

HasGenerationId returns a boolean if a field has been set.

### GetIndexType

`func (o *FeedIndexLogsRecordDTO) GetIndexType() FeedIndexLogsIndexType`

GetIndexType returns the IndexType field if non-nil, zero value otherwise.

### GetIndexTypeOk

`func (o *FeedIndexLogsRecordDTO) GetIndexTypeOk() (*FeedIndexLogsIndexType, bool)`

GetIndexTypeOk returns a tuple with the IndexType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndexType

`func (o *FeedIndexLogsRecordDTO) SetIndexType(v FeedIndexLogsIndexType)`

SetIndexType sets IndexType field to given value.

### HasIndexType

`func (o *FeedIndexLogsRecordDTO) HasIndexType() bool`

HasIndexType returns a boolean if a field has been set.

### GetPublishedTime

`func (o *FeedIndexLogsRecordDTO) GetPublishedTime() time.Time`

GetPublishedTime returns the PublishedTime field if non-nil, zero value otherwise.

### GetPublishedTimeOk

`func (o *FeedIndexLogsRecordDTO) GetPublishedTimeOk() (*time.Time, bool)`

GetPublishedTimeOk returns a tuple with the PublishedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublishedTime

`func (o *FeedIndexLogsRecordDTO) SetPublishedTime(v time.Time)`

SetPublishedTime sets PublishedTime field to given value.

### HasPublishedTime

`func (o *FeedIndexLogsRecordDTO) HasPublishedTime() bool`

HasPublishedTime returns a boolean if a field has been set.

### GetStatus

`func (o *FeedIndexLogsRecordDTO) GetStatus() FeedIndexLogsStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *FeedIndexLogsRecordDTO) GetStatusOk() (*FeedIndexLogsStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *FeedIndexLogsRecordDTO) SetStatus(v FeedIndexLogsStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *FeedIndexLogsRecordDTO) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetError

`func (o *FeedIndexLogsRecordDTO) GetError() FeedIndexLogsErrorDTO`

GetError returns the Error field if non-nil, zero value otherwise.

### GetErrorOk

`func (o *FeedIndexLogsRecordDTO) GetErrorOk() (*FeedIndexLogsErrorDTO, bool)`

GetErrorOk returns a tuple with the Error field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetError

`func (o *FeedIndexLogsRecordDTO) SetError(v FeedIndexLogsErrorDTO)`

SetError sets Error field to given value.

### HasError

`func (o *FeedIndexLogsRecordDTO) HasError() bool`

HasError returns a boolean if a field has been set.

### GetOffers

`func (o *FeedIndexLogsRecordDTO) GetOffers() FeedIndexLogsOffersDTO`

GetOffers returns the Offers field if non-nil, zero value otherwise.

### GetOffersOk

`func (o *FeedIndexLogsRecordDTO) GetOffersOk() (*FeedIndexLogsOffersDTO, bool)`

GetOffersOk returns a tuple with the Offers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffers

`func (o *FeedIndexLogsRecordDTO) SetOffers(v FeedIndexLogsOffersDTO)`

SetOffers sets Offers field to given value.

### HasOffers

`func (o *FeedIndexLogsRecordDTO) HasOffers() bool`

HasOffers returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


