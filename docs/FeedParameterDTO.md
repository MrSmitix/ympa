# FeedParameterDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Deleted** | Pointer to **bool** | Удалить ли значение параметра.  Возможное значение: * &#x60;true&#x60; — удалить значение параметра.  Используется вместе с параметром &#x60;name&#x60;.  | [optional] 
**Name** | **string** | Название параметра.  Возможное значение: - &#x60;reparseIntervalMinutes&#x60; — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре &#x60;value&#x60;. Например, при &#x60;value&#x3D;1440&#x60;, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр.  | 
**Values** | Pointer to **[]int32** | Значения параметра.  Используется вместе с параметром &#x60;name&#x60;.  | [optional] 

## Methods

### NewFeedParameterDTO

`func NewFeedParameterDTO(name string, ) *FeedParameterDTO`

NewFeedParameterDTO instantiates a new FeedParameterDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeedParameterDTOWithDefaults

`func NewFeedParameterDTOWithDefaults() *FeedParameterDTO`

NewFeedParameterDTOWithDefaults instantiates a new FeedParameterDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDeleted

`func (o *FeedParameterDTO) GetDeleted() bool`

GetDeleted returns the Deleted field if non-nil, zero value otherwise.

### GetDeletedOk

`func (o *FeedParameterDTO) GetDeletedOk() (*bool, bool)`

GetDeletedOk returns a tuple with the Deleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeleted

`func (o *FeedParameterDTO) SetDeleted(v bool)`

SetDeleted sets Deleted field to given value.

### HasDeleted

`func (o *FeedParameterDTO) HasDeleted() bool`

HasDeleted returns a boolean if a field has been set.

### GetName

`func (o *FeedParameterDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *FeedParameterDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *FeedParameterDTO) SetName(v string)`

SetName sets Name field to given value.


### GetValues

`func (o *FeedParameterDTO) GetValues() []int32`

GetValues returns the Values field if non-nil, zero value otherwise.

### GetValuesOk

`func (o *FeedParameterDTO) GetValuesOk() (*[]int32, bool)`

GetValuesOk returns a tuple with the Values field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValues

`func (o *FeedParameterDTO) SetValues(v []int32)`

SetValues sets Values field to given value.

### HasValues

`func (o *FeedParameterDTO) HasValues() bool`

HasValues returns a boolean if a field has been set.

### SetValuesNil

`func (o *FeedParameterDTO) SetValuesNil(b bool)`

 SetValuesNil sets the value for Values to be an explicit nil

### UnsetValues
`func (o *FeedParameterDTO) UnsetValues()`

UnsetValues ensures that no value is present for Values, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


