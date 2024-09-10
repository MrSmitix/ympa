# FeedDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | Идентификатор прайс-листа. | [optional] 
**Login** | Pointer to **string** | Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] 
**Name** | Pointer to **string** | Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] 
**Password** | Pointer to **string** | Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.  | [optional] 
**UploadDate** | Pointer to **time.Time** | Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета.  | [optional] 
**Url** | Pointer to **string** | URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.  | [optional] 
**Content** | Pointer to [**FeedContentDTO**](FeedContentDTO.md) |  | [optional] 
**Download** | Pointer to [**FeedDownloadDTO**](FeedDownloadDTO.md) |  | [optional] 
**Placement** | Pointer to [**FeedPlacementDTO**](FeedPlacementDTO.md) |  | [optional] 
**Publication** | Pointer to [**FeedPublicationDTO**](FeedPublicationDTO.md) |  | [optional] 

## Methods

### NewFeedDTO

`func NewFeedDTO() *FeedDTO`

NewFeedDTO instantiates a new FeedDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeedDTOWithDefaults

`func NewFeedDTOWithDefaults() *FeedDTO`

NewFeedDTOWithDefaults instantiates a new FeedDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *FeedDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *FeedDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *FeedDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *FeedDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLogin

`func (o *FeedDTO) GetLogin() string`

GetLogin returns the Login field if non-nil, zero value otherwise.

### GetLoginOk

`func (o *FeedDTO) GetLoginOk() (*string, bool)`

GetLoginOk returns a tuple with the Login field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogin

`func (o *FeedDTO) SetLogin(v string)`

SetLogin sets Login field to given value.

### HasLogin

`func (o *FeedDTO) HasLogin() bool`

HasLogin returns a boolean if a field has been set.

### GetName

`func (o *FeedDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *FeedDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *FeedDTO) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *FeedDTO) HasName() bool`

HasName returns a boolean if a field has been set.

### GetPassword

`func (o *FeedDTO) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *FeedDTO) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *FeedDTO) SetPassword(v string)`

SetPassword sets Password field to given value.

### HasPassword

`func (o *FeedDTO) HasPassword() bool`

HasPassword returns a boolean if a field has been set.

### GetUploadDate

`func (o *FeedDTO) GetUploadDate() time.Time`

GetUploadDate returns the UploadDate field if non-nil, zero value otherwise.

### GetUploadDateOk

`func (o *FeedDTO) GetUploadDateOk() (*time.Time, bool)`

GetUploadDateOk returns a tuple with the UploadDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUploadDate

`func (o *FeedDTO) SetUploadDate(v time.Time)`

SetUploadDate sets UploadDate field to given value.

### HasUploadDate

`func (o *FeedDTO) HasUploadDate() bool`

HasUploadDate returns a boolean if a field has been set.

### GetUrl

`func (o *FeedDTO) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *FeedDTO) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *FeedDTO) SetUrl(v string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *FeedDTO) HasUrl() bool`

HasUrl returns a boolean if a field has been set.

### GetContent

`func (o *FeedDTO) GetContent() FeedContentDTO`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *FeedDTO) GetContentOk() (*FeedContentDTO, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *FeedDTO) SetContent(v FeedContentDTO)`

SetContent sets Content field to given value.

### HasContent

`func (o *FeedDTO) HasContent() bool`

HasContent returns a boolean if a field has been set.

### GetDownload

`func (o *FeedDTO) GetDownload() FeedDownloadDTO`

GetDownload returns the Download field if non-nil, zero value otherwise.

### GetDownloadOk

`func (o *FeedDTO) GetDownloadOk() (*FeedDownloadDTO, bool)`

GetDownloadOk returns a tuple with the Download field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDownload

`func (o *FeedDTO) SetDownload(v FeedDownloadDTO)`

SetDownload sets Download field to given value.

### HasDownload

`func (o *FeedDTO) HasDownload() bool`

HasDownload returns a boolean if a field has been set.

### GetPlacement

`func (o *FeedDTO) GetPlacement() FeedPlacementDTO`

GetPlacement returns the Placement field if non-nil, zero value otherwise.

### GetPlacementOk

`func (o *FeedDTO) GetPlacementOk() (*FeedPlacementDTO, bool)`

GetPlacementOk returns a tuple with the Placement field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacement

`func (o *FeedDTO) SetPlacement(v FeedPlacementDTO)`

SetPlacement sets Placement field to given value.

### HasPlacement

`func (o *FeedDTO) HasPlacement() bool`

HasPlacement returns a boolean if a field has been set.

### GetPublication

`func (o *FeedDTO) GetPublication() FeedPublicationDTO`

GetPublication returns the Publication field if non-nil, zero value otherwise.

### GetPublicationOk

`func (o *FeedDTO) GetPublicationOk() (*FeedPublicationDTO, bool)`

GetPublicationOk returns a tuple with the Publication field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublication

`func (o *FeedDTO) SetPublication(v FeedPublicationDTO)`

SetPublication sets Publication field to given value.

### HasPublication

`func (o *FeedDTO) HasPublication() bool`

HasPublication returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


