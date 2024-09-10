# FeedIndexLogsErrorDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HttpStatusCode** | Pointer to **int32** | HTTP-код ошибки индексации прайс-листа.  Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;.  | [optional] 
**Type** | Pointer to [**FeedIndexLogsErrorType**](FeedIndexLogsErrorType.md) |  | [optional] 
**Description** | Pointer to **string** | Описание ошибки.  Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;.  | [optional] 

## Methods

### NewFeedIndexLogsErrorDTO

`func NewFeedIndexLogsErrorDTO() *FeedIndexLogsErrorDTO`

NewFeedIndexLogsErrorDTO instantiates a new FeedIndexLogsErrorDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeedIndexLogsErrorDTOWithDefaults

`func NewFeedIndexLogsErrorDTOWithDefaults() *FeedIndexLogsErrorDTO`

NewFeedIndexLogsErrorDTOWithDefaults instantiates a new FeedIndexLogsErrorDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHttpStatusCode

`func (o *FeedIndexLogsErrorDTO) GetHttpStatusCode() int32`

GetHttpStatusCode returns the HttpStatusCode field if non-nil, zero value otherwise.

### GetHttpStatusCodeOk

`func (o *FeedIndexLogsErrorDTO) GetHttpStatusCodeOk() (*int32, bool)`

GetHttpStatusCodeOk returns a tuple with the HttpStatusCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHttpStatusCode

`func (o *FeedIndexLogsErrorDTO) SetHttpStatusCode(v int32)`

SetHttpStatusCode sets HttpStatusCode field to given value.

### HasHttpStatusCode

`func (o *FeedIndexLogsErrorDTO) HasHttpStatusCode() bool`

HasHttpStatusCode returns a boolean if a field has been set.

### GetType

`func (o *FeedIndexLogsErrorDTO) GetType() FeedIndexLogsErrorType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *FeedIndexLogsErrorDTO) GetTypeOk() (*FeedIndexLogsErrorType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *FeedIndexLogsErrorDTO) SetType(v FeedIndexLogsErrorType)`

SetType sets Type field to given value.

### HasType

`func (o *FeedIndexLogsErrorDTO) HasType() bool`

HasType returns a boolean if a field has been set.

### GetDescription

`func (o *FeedIndexLogsErrorDTO) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *FeedIndexLogsErrorDTO) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *FeedIndexLogsErrorDTO) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *FeedIndexLogsErrorDTO) HasDescription() bool`

HasDescription returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


