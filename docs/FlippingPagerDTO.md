# FlippingPagerDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Total** | Pointer to **int32** | Сколько всего найдено элементов. | [optional] 
**From** | Pointer to **int32** | Начальный номер найденного элемента на странице. | [optional] 
**To** | Pointer to **int32** | Конечный номер найденного элемента на странице. | [optional] 
**CurrentPage** | Pointer to **int32** | Текущая страница. | [optional] 
**PagesCount** | Pointer to **int32** | Общее количество страниц. | [optional] 
**PageSize** | Pointer to **int32** | Размер страницы. | [optional] 

## Methods

### NewFlippingPagerDTO

`func NewFlippingPagerDTO() *FlippingPagerDTO`

NewFlippingPagerDTO instantiates a new FlippingPagerDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFlippingPagerDTOWithDefaults

`func NewFlippingPagerDTOWithDefaults() *FlippingPagerDTO`

NewFlippingPagerDTOWithDefaults instantiates a new FlippingPagerDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTotal

`func (o *FlippingPagerDTO) GetTotal() int32`

GetTotal returns the Total field if non-nil, zero value otherwise.

### GetTotalOk

`func (o *FlippingPagerDTO) GetTotalOk() (*int32, bool)`

GetTotalOk returns a tuple with the Total field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotal

`func (o *FlippingPagerDTO) SetTotal(v int32)`

SetTotal sets Total field to given value.

### HasTotal

`func (o *FlippingPagerDTO) HasTotal() bool`

HasTotal returns a boolean if a field has been set.

### GetFrom

`func (o *FlippingPagerDTO) GetFrom() int32`

GetFrom returns the From field if non-nil, zero value otherwise.

### GetFromOk

`func (o *FlippingPagerDTO) GetFromOk() (*int32, bool)`

GetFromOk returns a tuple with the From field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrom

`func (o *FlippingPagerDTO) SetFrom(v int32)`

SetFrom sets From field to given value.

### HasFrom

`func (o *FlippingPagerDTO) HasFrom() bool`

HasFrom returns a boolean if a field has been set.

### GetTo

`func (o *FlippingPagerDTO) GetTo() int32`

GetTo returns the To field if non-nil, zero value otherwise.

### GetToOk

`func (o *FlippingPagerDTO) GetToOk() (*int32, bool)`

GetToOk returns a tuple with the To field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTo

`func (o *FlippingPagerDTO) SetTo(v int32)`

SetTo sets To field to given value.

### HasTo

`func (o *FlippingPagerDTO) HasTo() bool`

HasTo returns a boolean if a field has been set.

### GetCurrentPage

`func (o *FlippingPagerDTO) GetCurrentPage() int32`

GetCurrentPage returns the CurrentPage field if non-nil, zero value otherwise.

### GetCurrentPageOk

`func (o *FlippingPagerDTO) GetCurrentPageOk() (*int32, bool)`

GetCurrentPageOk returns a tuple with the CurrentPage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrentPage

`func (o *FlippingPagerDTO) SetCurrentPage(v int32)`

SetCurrentPage sets CurrentPage field to given value.

### HasCurrentPage

`func (o *FlippingPagerDTO) HasCurrentPage() bool`

HasCurrentPage returns a boolean if a field has been set.

### GetPagesCount

`func (o *FlippingPagerDTO) GetPagesCount() int32`

GetPagesCount returns the PagesCount field if non-nil, zero value otherwise.

### GetPagesCountOk

`func (o *FlippingPagerDTO) GetPagesCountOk() (*int32, bool)`

GetPagesCountOk returns a tuple with the PagesCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPagesCount

`func (o *FlippingPagerDTO) SetPagesCount(v int32)`

SetPagesCount sets PagesCount field to given value.

### HasPagesCount

`func (o *FlippingPagerDTO) HasPagesCount() bool`

HasPagesCount returns a boolean if a field has been set.

### GetPageSize

`func (o *FlippingPagerDTO) GetPageSize() int32`

GetPageSize returns the PageSize field if non-nil, zero value otherwise.

### GetPageSizeOk

`func (o *FlippingPagerDTO) GetPageSizeOk() (*int32, bool)`

GetPageSizeOk returns a tuple with the PageSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPageSize

`func (o *FlippingPagerDTO) SetPageSize(v int32)`

SetPageSize sets PageSize field to given value.

### HasPageSize

`func (o *FlippingPagerDTO) HasPageSize() bool`

HasPageSize returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


