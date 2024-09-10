# GetChatHistoryRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MessageIdFrom** | Pointer to **int64** | Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения. | [optional] 

## Methods

### NewGetChatHistoryRequest

`func NewGetChatHistoryRequest() *GetChatHistoryRequest`

NewGetChatHistoryRequest instantiates a new GetChatHistoryRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetChatHistoryRequestWithDefaults

`func NewGetChatHistoryRequestWithDefaults() *GetChatHistoryRequest`

NewGetChatHistoryRequestWithDefaults instantiates a new GetChatHistoryRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessageIdFrom

`func (o *GetChatHistoryRequest) GetMessageIdFrom() int64`

GetMessageIdFrom returns the MessageIdFrom field if non-nil, zero value otherwise.

### GetMessageIdFromOk

`func (o *GetChatHistoryRequest) GetMessageIdFromOk() (*int64, bool)`

GetMessageIdFromOk returns a tuple with the MessageIdFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageIdFrom

`func (o *GetChatHistoryRequest) SetMessageIdFrom(v int64)`

SetMessageIdFrom sets MessageIdFrom field to given value.

### HasMessageIdFrom

`func (o *GetChatHistoryRequest) HasMessageIdFrom() bool`

HasMessageIdFrom returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


