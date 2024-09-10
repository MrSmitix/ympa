# ParcelBoxDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  | [optional] 
**FulfilmentId** | Pointer to **string** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  | [optional] 

## Methods

### NewParcelBoxDTO

`func NewParcelBoxDTO() *ParcelBoxDTO`

NewParcelBoxDTO instantiates a new ParcelBoxDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewParcelBoxDTOWithDefaults

`func NewParcelBoxDTOWithDefaults() *ParcelBoxDTO`

NewParcelBoxDTOWithDefaults instantiates a new ParcelBoxDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ParcelBoxDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ParcelBoxDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ParcelBoxDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *ParcelBoxDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetFulfilmentId

`func (o *ParcelBoxDTO) GetFulfilmentId() string`

GetFulfilmentId returns the FulfilmentId field if non-nil, zero value otherwise.

### GetFulfilmentIdOk

`func (o *ParcelBoxDTO) GetFulfilmentIdOk() (*string, bool)`

GetFulfilmentIdOk returns a tuple with the FulfilmentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFulfilmentId

`func (o *ParcelBoxDTO) SetFulfilmentId(v string)`

SetFulfilmentId sets FulfilmentId field to given value.

### HasFulfilmentId

`func (o *ParcelBoxDTO) HasFulfilmentId() bool`

HasFulfilmentId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


