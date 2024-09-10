# ScrollingPagerDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NextPageToken** | Pointer to **string** | Идентификатор следующей страницы результатов. | [optional] 
**PrevPageToken** | Pointer to **string** | Идентификатор предыдущей страницы результатов. | [optional] 

## Methods

### NewScrollingPagerDTO

`func NewScrollingPagerDTO() *ScrollingPagerDTO`

NewScrollingPagerDTO instantiates a new ScrollingPagerDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewScrollingPagerDTOWithDefaults

`func NewScrollingPagerDTOWithDefaults() *ScrollingPagerDTO`

NewScrollingPagerDTOWithDefaults instantiates a new ScrollingPagerDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNextPageToken

`func (o *ScrollingPagerDTO) GetNextPageToken() string`

GetNextPageToken returns the NextPageToken field if non-nil, zero value otherwise.

### GetNextPageTokenOk

`func (o *ScrollingPagerDTO) GetNextPageTokenOk() (*string, bool)`

GetNextPageTokenOk returns a tuple with the NextPageToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextPageToken

`func (o *ScrollingPagerDTO) SetNextPageToken(v string)`

SetNextPageToken sets NextPageToken field to given value.

### HasNextPageToken

`func (o *ScrollingPagerDTO) HasNextPageToken() bool`

HasNextPageToken returns a boolean if a field has been set.

### GetPrevPageToken

`func (o *ScrollingPagerDTO) GetPrevPageToken() string`

GetPrevPageToken returns the PrevPageToken field if non-nil, zero value otherwise.

### GetPrevPageTokenOk

`func (o *ScrollingPagerDTO) GetPrevPageTokenOk() (*string, bool)`

GetPrevPageTokenOk returns a tuple with the PrevPageToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevPageToken

`func (o *ScrollingPagerDTO) SetPrevPageToken(v string)`

SetPrevPageToken sets PrevPageToken field to given value.

### HasPrevPageToken

`func (o *ScrollingPagerDTO) HasPrevPageToken() bool`

HasPrevPageToken returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


