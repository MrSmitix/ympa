# ChatMessageDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MessageId** | **int64** | Идентификатор сообщения. | 
**CreatedAt** | **time.Time** | Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | 
**Sender** | [**ChatMessageSenderType**](ChatMessageSenderType.md) |  | 
**Message** | Pointer to **string** | Текст сообщения.  Необязательный параметр, если возвращается параметр &#x60;payload&#x60;.  | [optional] 
**Payload** | Pointer to [**[]ChatMessagePayloadDTO**](ChatMessagePayloadDTO.md) | Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр &#x60;message&#x60;.  | [optional] 

## Methods

### NewChatMessageDTO

`func NewChatMessageDTO(messageId int64, createdAt time.Time, sender ChatMessageSenderType, ) *ChatMessageDTO`

NewChatMessageDTO instantiates a new ChatMessageDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatMessageDTOWithDefaults

`func NewChatMessageDTOWithDefaults() *ChatMessageDTO`

NewChatMessageDTOWithDefaults instantiates a new ChatMessageDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessageId

`func (o *ChatMessageDTO) GetMessageId() int64`

GetMessageId returns the MessageId field if non-nil, zero value otherwise.

### GetMessageIdOk

`func (o *ChatMessageDTO) GetMessageIdOk() (*int64, bool)`

GetMessageIdOk returns a tuple with the MessageId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageId

`func (o *ChatMessageDTO) SetMessageId(v int64)`

SetMessageId sets MessageId field to given value.


### GetCreatedAt

`func (o *ChatMessageDTO) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *ChatMessageDTO) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *ChatMessageDTO) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.


### GetSender

`func (o *ChatMessageDTO) GetSender() ChatMessageSenderType`

GetSender returns the Sender field if non-nil, zero value otherwise.

### GetSenderOk

`func (o *ChatMessageDTO) GetSenderOk() (*ChatMessageSenderType, bool)`

GetSenderOk returns a tuple with the Sender field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSender

`func (o *ChatMessageDTO) SetSender(v ChatMessageSenderType)`

SetSender sets Sender field to given value.


### GetMessage

`func (o *ChatMessageDTO) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ChatMessageDTO) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ChatMessageDTO) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *ChatMessageDTO) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetPayload

`func (o *ChatMessageDTO) GetPayload() []ChatMessagePayloadDTO`

GetPayload returns the Payload field if non-nil, zero value otherwise.

### GetPayloadOk

`func (o *ChatMessageDTO) GetPayloadOk() (*[]ChatMessagePayloadDTO, bool)`

GetPayloadOk returns a tuple with the Payload field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayload

`func (o *ChatMessageDTO) SetPayload(v []ChatMessagePayloadDTO)`

SetPayload sets Payload field to given value.

### HasPayload

`func (o *ChatMessageDTO) HasPayload() bool`

HasPayload returns a boolean if a field has been set.

### SetPayloadNil

`func (o *ChatMessageDTO) SetPayloadNil(b bool)`

 SetPayloadNil sets the value for Payload to be an explicit nil

### UnsetPayload
`func (o *ChatMessageDTO) UnsetPayload()`

UnsetPayload ensures that no value is present for Payload, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


