# FeedbackAuthorDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | Имя автора отзыва. | [optional] 
**Region** | Pointer to [**RegionDTO**](RegionDTO.md) |  | [optional] 

## Methods

### NewFeedbackAuthorDTO

`func NewFeedbackAuthorDTO() *FeedbackAuthorDTO`

NewFeedbackAuthorDTO instantiates a new FeedbackAuthorDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeedbackAuthorDTOWithDefaults

`func NewFeedbackAuthorDTOWithDefaults() *FeedbackAuthorDTO`

NewFeedbackAuthorDTOWithDefaults instantiates a new FeedbackAuthorDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *FeedbackAuthorDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *FeedbackAuthorDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *FeedbackAuthorDTO) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *FeedbackAuthorDTO) HasName() bool`

HasName returns a boolean if a field has been set.

### GetRegion

`func (o *FeedbackAuthorDTO) GetRegion() RegionDTO`

GetRegion returns the Region field if non-nil, zero value otherwise.

### GetRegionOk

`func (o *FeedbackAuthorDTO) GetRegionOk() (*RegionDTO, bool)`

GetRegionOk returns a tuple with the Region field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegion

`func (o *FeedbackAuthorDTO) SetRegion(v RegionDTO)`

SetRegion sets Region field to given value.

### HasRegion

`func (o *FeedbackAuthorDTO) HasRegion() bool`

HasRegion returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


