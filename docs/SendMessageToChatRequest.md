# SendMessageToChatRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | **string** | Текст сообщения. Максимальная длина — 4096 символа. | 

## Methods

### NewSendMessageToChatRequest

`func NewSendMessageToChatRequest(message string, ) *SendMessageToChatRequest`

NewSendMessageToChatRequest instantiates a new SendMessageToChatRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSendMessageToChatRequestWithDefaults

`func NewSendMessageToChatRequestWithDefaults() *SendMessageToChatRequest`

NewSendMessageToChatRequestWithDefaults instantiates a new SendMessageToChatRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessage

`func (o *SendMessageToChatRequest) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *SendMessageToChatRequest) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *SendMessageToChatRequest) SetMessage(v string)`

SetMessage sets Message field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


