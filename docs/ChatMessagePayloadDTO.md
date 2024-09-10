# ChatMessagePayloadDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Имя файла. | 
**Url** | **string** | Ссылка для скачивания файла. | 
**Size** | **int32** | Размер файла в байтах. | 

## Methods

### NewChatMessagePayloadDTO

`func NewChatMessagePayloadDTO(name string, url string, size int32, ) *ChatMessagePayloadDTO`

NewChatMessagePayloadDTO instantiates a new ChatMessagePayloadDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatMessagePayloadDTOWithDefaults

`func NewChatMessagePayloadDTOWithDefaults() *ChatMessagePayloadDTO`

NewChatMessagePayloadDTOWithDefaults instantiates a new ChatMessagePayloadDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *ChatMessagePayloadDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ChatMessagePayloadDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ChatMessagePayloadDTO) SetName(v string)`

SetName sets Name field to given value.


### GetUrl

`func (o *ChatMessagePayloadDTO) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *ChatMessagePayloadDTO) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *ChatMessagePayloadDTO) SetUrl(v string)`

SetUrl sets Url field to given value.


### GetSize

`func (o *ChatMessagePayloadDTO) GetSize() int32`

GetSize returns the Size field if non-nil, zero value otherwise.

### GetSizeOk

`func (o *ChatMessagePayloadDTO) GetSizeOk() (*int32, bool)`

GetSizeOk returns a tuple with the Size field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSize

`func (o *ChatMessagePayloadDTO) SetSize(v int32)`

SetSize sets Size field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


