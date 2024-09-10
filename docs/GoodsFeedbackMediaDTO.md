# GoodsFeedbackMediaDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Photos** | Pointer to **[]string** | Ссылки на фото. | [optional] 
**Videos** | Pointer to **[]string** | Ссылки на видео. | [optional] 

## Methods

### NewGoodsFeedbackMediaDTO

`func NewGoodsFeedbackMediaDTO() *GoodsFeedbackMediaDTO`

NewGoodsFeedbackMediaDTO instantiates a new GoodsFeedbackMediaDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGoodsFeedbackMediaDTOWithDefaults

`func NewGoodsFeedbackMediaDTOWithDefaults() *GoodsFeedbackMediaDTO`

NewGoodsFeedbackMediaDTOWithDefaults instantiates a new GoodsFeedbackMediaDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPhotos

`func (o *GoodsFeedbackMediaDTO) GetPhotos() []string`

GetPhotos returns the Photos field if non-nil, zero value otherwise.

### GetPhotosOk

`func (o *GoodsFeedbackMediaDTO) GetPhotosOk() (*[]string, bool)`

GetPhotosOk returns a tuple with the Photos field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhotos

`func (o *GoodsFeedbackMediaDTO) SetPhotos(v []string)`

SetPhotos sets Photos field to given value.

### HasPhotos

`func (o *GoodsFeedbackMediaDTO) HasPhotos() bool`

HasPhotos returns a boolean if a field has been set.

### SetPhotosNil

`func (o *GoodsFeedbackMediaDTO) SetPhotosNil(b bool)`

 SetPhotosNil sets the value for Photos to be an explicit nil

### UnsetPhotos
`func (o *GoodsFeedbackMediaDTO) UnsetPhotos()`

UnsetPhotos ensures that no value is present for Photos, not even an explicit nil
### GetVideos

`func (o *GoodsFeedbackMediaDTO) GetVideos() []string`

GetVideos returns the Videos field if non-nil, zero value otherwise.

### GetVideosOk

`func (o *GoodsFeedbackMediaDTO) GetVideosOk() (*[]string, bool)`

GetVideosOk returns a tuple with the Videos field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVideos

`func (o *GoodsFeedbackMediaDTO) SetVideos(v []string)`

SetVideos sets Videos field to given value.

### HasVideos

`func (o *GoodsFeedbackMediaDTO) HasVideos() bool`

HasVideos returns a boolean if a field has been set.

### SetVideosNil

`func (o *GoodsFeedbackMediaDTO) SetVideosNil(b bool)`

 SetVideosNil sets the value for Videos to be an explicit nil

### UnsetVideos
`func (o *GoodsFeedbackMediaDTO) UnsetVideos()`

UnsetVideos ensures that no value is present for Videos, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


