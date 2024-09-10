# ChatMessagesResultDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrderId** | **int64** | Идентификатор заказа. | 
**Messages** | [**[]ChatMessageDTO**](ChatMessageDTO.md) | Информация о сообщениях. | 
**Paging** | Pointer to [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Methods

### NewChatMessagesResultDTO

`func NewChatMessagesResultDTO(orderId int64, messages []ChatMessageDTO, ) *ChatMessagesResultDTO`

NewChatMessagesResultDTO instantiates a new ChatMessagesResultDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatMessagesResultDTOWithDefaults

`func NewChatMessagesResultDTOWithDefaults() *ChatMessagesResultDTO`

NewChatMessagesResultDTOWithDefaults instantiates a new ChatMessagesResultDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOrderId

`func (o *ChatMessagesResultDTO) GetOrderId() int64`

GetOrderId returns the OrderId field if non-nil, zero value otherwise.

### GetOrderIdOk

`func (o *ChatMessagesResultDTO) GetOrderIdOk() (*int64, bool)`

GetOrderIdOk returns a tuple with the OrderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderId

`func (o *ChatMessagesResultDTO) SetOrderId(v int64)`

SetOrderId sets OrderId field to given value.


### GetMessages

`func (o *ChatMessagesResultDTO) GetMessages() []ChatMessageDTO`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *ChatMessagesResultDTO) GetMessagesOk() (*[]ChatMessageDTO, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *ChatMessagesResultDTO) SetMessages(v []ChatMessageDTO)`

SetMessages sets Messages field to given value.


### GetPaging

`func (o *ChatMessagesResultDTO) GetPaging() ForwardScrollingPagerDTO`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *ChatMessagesResultDTO) GetPagingOk() (*ForwardScrollingPagerDTO, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *ChatMessagesResultDTO) SetPaging(v ForwardScrollingPagerDTO)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *ChatMessagesResultDTO) HasPaging() bool`

HasPaging returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


