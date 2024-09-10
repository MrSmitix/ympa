# FeedIndexLogsResultDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Feed** | Pointer to [**FeedIndexLogsFeedDTO**](FeedIndexLogsFeedDTO.md) |  | [optional] 
**IndexLogRecords** | [**[]FeedIndexLogsRecordDTO**](FeedIndexLogsRecordDTO.md) | Список отчетов по индексации прайс-листа. | 
**Total** | Pointer to **int64** | Количество отчетов на всех страницах выходных данных. | [optional] 

## Methods

### NewFeedIndexLogsResultDTO

`func NewFeedIndexLogsResultDTO(indexLogRecords []FeedIndexLogsRecordDTO, ) *FeedIndexLogsResultDTO`

NewFeedIndexLogsResultDTO instantiates a new FeedIndexLogsResultDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeedIndexLogsResultDTOWithDefaults

`func NewFeedIndexLogsResultDTOWithDefaults() *FeedIndexLogsResultDTO`

NewFeedIndexLogsResultDTOWithDefaults instantiates a new FeedIndexLogsResultDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFeed

`func (o *FeedIndexLogsResultDTO) GetFeed() FeedIndexLogsFeedDTO`

GetFeed returns the Feed field if non-nil, zero value otherwise.

### GetFeedOk

`func (o *FeedIndexLogsResultDTO) GetFeedOk() (*FeedIndexLogsFeedDTO, bool)`

GetFeedOk returns a tuple with the Feed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeed

`func (o *FeedIndexLogsResultDTO) SetFeed(v FeedIndexLogsFeedDTO)`

SetFeed sets Feed field to given value.

### HasFeed

`func (o *FeedIndexLogsResultDTO) HasFeed() bool`

HasFeed returns a boolean if a field has been set.

### GetIndexLogRecords

`func (o *FeedIndexLogsResultDTO) GetIndexLogRecords() []FeedIndexLogsRecordDTO`

GetIndexLogRecords returns the IndexLogRecords field if non-nil, zero value otherwise.

### GetIndexLogRecordsOk

`func (o *FeedIndexLogsResultDTO) GetIndexLogRecordsOk() (*[]FeedIndexLogsRecordDTO, bool)`

GetIndexLogRecordsOk returns a tuple with the IndexLogRecords field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndexLogRecords

`func (o *FeedIndexLogsResultDTO) SetIndexLogRecords(v []FeedIndexLogsRecordDTO)`

SetIndexLogRecords sets IndexLogRecords field to given value.


### GetTotal

`func (o *FeedIndexLogsResultDTO) GetTotal() int64`

GetTotal returns the Total field if non-nil, zero value otherwise.

### GetTotalOk

`func (o *FeedIndexLogsResultDTO) GetTotalOk() (*int64, bool)`

GetTotalOk returns a tuple with the Total field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotal

`func (o *FeedIndexLogsResultDTO) SetTotal(v int64)`

SetTotal sets Total field to given value.

### HasTotal

`func (o *FeedIndexLogsResultDTO) HasTotal() bool`

HasTotal returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


