# FeedPublicationPriceAndStockUpdateDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileTime** | Pointer to **time.Time** | Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 
**PublishedTime** | Pointer to **time.Time** | Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 

## Methods

### NewFeedPublicationPriceAndStockUpdateDTO

`func NewFeedPublicationPriceAndStockUpdateDTO() *FeedPublicationPriceAndStockUpdateDTO`

NewFeedPublicationPriceAndStockUpdateDTO instantiates a new FeedPublicationPriceAndStockUpdateDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeedPublicationPriceAndStockUpdateDTOWithDefaults

`func NewFeedPublicationPriceAndStockUpdateDTOWithDefaults() *FeedPublicationPriceAndStockUpdateDTO`

NewFeedPublicationPriceAndStockUpdateDTOWithDefaults instantiates a new FeedPublicationPriceAndStockUpdateDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFileTime

`func (o *FeedPublicationPriceAndStockUpdateDTO) GetFileTime() time.Time`

GetFileTime returns the FileTime field if non-nil, zero value otherwise.

### GetFileTimeOk

`func (o *FeedPublicationPriceAndStockUpdateDTO) GetFileTimeOk() (*time.Time, bool)`

GetFileTimeOk returns a tuple with the FileTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileTime

`func (o *FeedPublicationPriceAndStockUpdateDTO) SetFileTime(v time.Time)`

SetFileTime sets FileTime field to given value.

### HasFileTime

`func (o *FeedPublicationPriceAndStockUpdateDTO) HasFileTime() bool`

HasFileTime returns a boolean if a field has been set.

### GetPublishedTime

`func (o *FeedPublicationPriceAndStockUpdateDTO) GetPublishedTime() time.Time`

GetPublishedTime returns the PublishedTime field if non-nil, zero value otherwise.

### GetPublishedTimeOk

`func (o *FeedPublicationPriceAndStockUpdateDTO) GetPublishedTimeOk() (*time.Time, bool)`

GetPublishedTimeOk returns a tuple with the PublishedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublishedTime

`func (o *FeedPublicationPriceAndStockUpdateDTO) SetPublishedTime(v time.Time)`

SetPublishedTime sets PublishedTime field to given value.

### HasPublishedTime

`func (o *FeedPublicationPriceAndStockUpdateDTO) HasPublishedTime() bool`

HasPublishedTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


