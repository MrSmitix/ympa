# DocumentDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**OrderDocumentStatusType**](OrderDocumentStatusType.md) |  | [optional] 
**Number** | Pointer to **string** | Номер документа. | [optional] 
**Date** | Pointer to **string** | Дата создания документа. | [optional] 

## Methods

### NewDocumentDTO

`func NewDocumentDTO() *DocumentDTO`

NewDocumentDTO instantiates a new DocumentDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDocumentDTOWithDefaults

`func NewDocumentDTOWithDefaults() *DocumentDTO`

NewDocumentDTOWithDefaults instantiates a new DocumentDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *DocumentDTO) GetStatus() OrderDocumentStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *DocumentDTO) GetStatusOk() (*OrderDocumentStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *DocumentDTO) SetStatus(v OrderDocumentStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *DocumentDTO) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetNumber

`func (o *DocumentDTO) GetNumber() string`

GetNumber returns the Number field if non-nil, zero value otherwise.

### GetNumberOk

`func (o *DocumentDTO) GetNumberOk() (*string, bool)`

GetNumberOk returns a tuple with the Number field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumber

`func (o *DocumentDTO) SetNumber(v string)`

SetNumber sets Number field to given value.

### HasNumber

`func (o *DocumentDTO) HasNumber() bool`

HasNumber returns a boolean if a field has been set.

### GetDate

`func (o *DocumentDTO) GetDate() string`

GetDate returns the Date field if non-nil, zero value otherwise.

### GetDateOk

`func (o *DocumentDTO) GetDateOk() (*string, bool)`

GetDateOk returns a tuple with the Date field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDate

`func (o *DocumentDTO) SetDate(v string)`

SetDate sets Date field to given value.

### HasDate

`func (o *DocumentDTO) HasDate() bool`

HasDate returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


