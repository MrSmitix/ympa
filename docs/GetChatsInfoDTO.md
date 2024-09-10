# GetChatsInfoDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Chats** | [**[]GetChatInfoDTO**](GetChatInfoDTO.md) | Информация о чатах. | 
**Paging** | Pointer to [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Methods

### NewGetChatsInfoDTO

`func NewGetChatsInfoDTO(chats []GetChatInfoDTO, ) *GetChatsInfoDTO`

NewGetChatsInfoDTO instantiates a new GetChatsInfoDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetChatsInfoDTOWithDefaults

`func NewGetChatsInfoDTOWithDefaults() *GetChatsInfoDTO`

NewGetChatsInfoDTOWithDefaults instantiates a new GetChatsInfoDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChats

`func (o *GetChatsInfoDTO) GetChats() []GetChatInfoDTO`

GetChats returns the Chats field if non-nil, zero value otherwise.

### GetChatsOk

`func (o *GetChatsInfoDTO) GetChatsOk() (*[]GetChatInfoDTO, bool)`

GetChatsOk returns a tuple with the Chats field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChats

`func (o *GetChatsInfoDTO) SetChats(v []GetChatInfoDTO)`

SetChats sets Chats field to given value.


### GetPaging

`func (o *GetChatsInfoDTO) GetPaging() ForwardScrollingPagerDTO`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *GetChatsInfoDTO) GetPagingOk() (*ForwardScrollingPagerDTO, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *GetChatsInfoDTO) SetPaging(v ForwardScrollingPagerDTO)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *GetChatsInfoDTO) HasPaging() bool`

HasPaging returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


