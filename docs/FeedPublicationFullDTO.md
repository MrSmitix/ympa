# FeedPublicationFullDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileTime** | Pointer to **time.Time** | Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 
**PublishedTime** | Pointer to **time.Time** | Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 

## Methods

### NewFeedPublicationFullDTO

`func NewFeedPublicationFullDTO() *FeedPublicationFullDTO`

NewFeedPublicationFullDTO instantiates a new FeedPublicationFullDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeedPublicationFullDTOWithDefaults

`func NewFeedPublicationFullDTOWithDefaults() *FeedPublicationFullDTO`

NewFeedPublicationFullDTOWithDefaults instantiates a new FeedPublicationFullDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFileTime

`func (o *FeedPublicationFullDTO) GetFileTime() time.Time`

GetFileTime returns the FileTime field if non-nil, zero value otherwise.

### GetFileTimeOk

`func (o *FeedPublicationFullDTO) GetFileTimeOk() (*time.Time, bool)`

GetFileTimeOk returns a tuple with the FileTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileTime

`func (o *FeedPublicationFullDTO) SetFileTime(v time.Time)`

SetFileTime sets FileTime field to given value.

### HasFileTime

`func (o *FeedPublicationFullDTO) HasFileTime() bool`

HasFileTime returns a boolean if a field has been set.

### GetPublishedTime

`func (o *FeedPublicationFullDTO) GetPublishedTime() time.Time`

GetPublishedTime returns the PublishedTime field if non-nil, zero value otherwise.

### GetPublishedTimeOk

`func (o *FeedPublicationFullDTO) GetPublishedTimeOk() (*time.Time, bool)`

GetPublishedTimeOk returns a tuple with the PublishedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublishedTime

`func (o *FeedPublicationFullDTO) SetPublishedTime(v time.Time)`

SetPublishedTime sets PublishedTime field to given value.

### HasPublishedTime

`func (o *FeedPublicationFullDTO) HasPublishedTime() bool`

HasPublishedTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


