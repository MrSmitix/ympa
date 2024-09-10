# GetChatInfoDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ChatId** | **int64** | Идентификатор чата. | 
**OrderId** | **int64** | Идентификатор заказа. | 
**Type** | [**ChatType**](ChatType.md) |  | 
**Status** | [**ChatStatusType**](ChatStatusType.md) |  | 
**CreatedAt** | **time.Time** | Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | 
**UpdatedAt** | **time.Time** | Дата и время последнего сообщения в чате. | 

## Methods

### NewGetChatInfoDTO

`func NewGetChatInfoDTO(chatId int64, orderId int64, type_ ChatType, status ChatStatusType, createdAt time.Time, updatedAt time.Time, ) *GetChatInfoDTO`

NewGetChatInfoDTO instantiates a new GetChatInfoDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetChatInfoDTOWithDefaults

`func NewGetChatInfoDTOWithDefaults() *GetChatInfoDTO`

NewGetChatInfoDTOWithDefaults instantiates a new GetChatInfoDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChatId

`func (o *GetChatInfoDTO) GetChatId() int64`

GetChatId returns the ChatId field if non-nil, zero value otherwise.

### GetChatIdOk

`func (o *GetChatInfoDTO) GetChatIdOk() (*int64, bool)`

GetChatIdOk returns a tuple with the ChatId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChatId

`func (o *GetChatInfoDTO) SetChatId(v int64)`

SetChatId sets ChatId field to given value.


### GetOrderId

`func (o *GetChatInfoDTO) GetOrderId() int64`

GetOrderId returns the OrderId field if non-nil, zero value otherwise.

### GetOrderIdOk

`func (o *GetChatInfoDTO) GetOrderIdOk() (*int64, bool)`

GetOrderIdOk returns a tuple with the OrderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderId

`func (o *GetChatInfoDTO) SetOrderId(v int64)`

SetOrderId sets OrderId field to given value.


### GetType

`func (o *GetChatInfoDTO) GetType() ChatType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *GetChatInfoDTO) GetTypeOk() (*ChatType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *GetChatInfoDTO) SetType(v ChatType)`

SetType sets Type field to given value.


### GetStatus

`func (o *GetChatInfoDTO) GetStatus() ChatStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GetChatInfoDTO) GetStatusOk() (*ChatStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GetChatInfoDTO) SetStatus(v ChatStatusType)`

SetStatus sets Status field to given value.


### GetCreatedAt

`func (o *GetChatInfoDTO) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *GetChatInfoDTO) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *GetChatInfoDTO) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.


### GetUpdatedAt

`func (o *GetChatInfoDTO) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *GetChatInfoDTO) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *GetChatInfoDTO) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


