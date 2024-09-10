# BriefOrderItemInstanceDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cis** | Pointer to **string** | Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя &#x60;\\u001d&#x60;!  ✅ &#x60;01030410947874432155Qbag!\\u001d93Zjqw&#x60;  ❌ &#x60;01030410947874432155Qbag!\\\\u001d93Zjqw&#x60;  Косые черты и кавычки в других местах экранируйте по правилам JSON: &#x60;\\\\&#x60; и &#x60;\\\&quot;&#x60;  {% endnote %}  | [optional] 
**Uin** | Pointer to **string** | Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр.  | [optional] 
**Rnpt** | Pointer to **string** | Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации.  | [optional] 
**Gtd** | Pointer to **string** | Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации.  | [optional] 

## Methods

### NewBriefOrderItemInstanceDTO

`func NewBriefOrderItemInstanceDTO() *BriefOrderItemInstanceDTO`

NewBriefOrderItemInstanceDTO instantiates a new BriefOrderItemInstanceDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBriefOrderItemInstanceDTOWithDefaults

`func NewBriefOrderItemInstanceDTOWithDefaults() *BriefOrderItemInstanceDTO`

NewBriefOrderItemInstanceDTOWithDefaults instantiates a new BriefOrderItemInstanceDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCis

`func (o *BriefOrderItemInstanceDTO) GetCis() string`

GetCis returns the Cis field if non-nil, zero value otherwise.

### GetCisOk

`func (o *BriefOrderItemInstanceDTO) GetCisOk() (*string, bool)`

GetCisOk returns a tuple with the Cis field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCis

`func (o *BriefOrderItemInstanceDTO) SetCis(v string)`

SetCis sets Cis field to given value.

### HasCis

`func (o *BriefOrderItemInstanceDTO) HasCis() bool`

HasCis returns a boolean if a field has been set.

### GetUin

`func (o *BriefOrderItemInstanceDTO) GetUin() string`

GetUin returns the Uin field if non-nil, zero value otherwise.

### GetUinOk

`func (o *BriefOrderItemInstanceDTO) GetUinOk() (*string, bool)`

GetUinOk returns a tuple with the Uin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUin

`func (o *BriefOrderItemInstanceDTO) SetUin(v string)`

SetUin sets Uin field to given value.

### HasUin

`func (o *BriefOrderItemInstanceDTO) HasUin() bool`

HasUin returns a boolean if a field has been set.

### GetRnpt

`func (o *BriefOrderItemInstanceDTO) GetRnpt() string`

GetRnpt returns the Rnpt field if non-nil, zero value otherwise.

### GetRnptOk

`func (o *BriefOrderItemInstanceDTO) GetRnptOk() (*string, bool)`

GetRnptOk returns a tuple with the Rnpt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRnpt

`func (o *BriefOrderItemInstanceDTO) SetRnpt(v string)`

SetRnpt sets Rnpt field to given value.

### HasRnpt

`func (o *BriefOrderItemInstanceDTO) HasRnpt() bool`

HasRnpt returns a boolean if a field has been set.

### GetGtd

`func (o *BriefOrderItemInstanceDTO) GetGtd() string`

GetGtd returns the Gtd field if non-nil, zero value otherwise.

### GetGtdOk

`func (o *BriefOrderItemInstanceDTO) GetGtdOk() (*string, bool)`

GetGtdOk returns a tuple with the Gtd field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGtd

`func (o *BriefOrderItemInstanceDTO) SetGtd(v string)`

SetGtd sets Gtd field to given value.

### HasGtd

`func (o *BriefOrderItemInstanceDTO) HasGtd() bool`

HasGtd returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


