# OrderItemInstanceDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cis** | Pointer to **string** | Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста. | [optional] 
**CisFull** | Pointer to **string** | Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом. | [optional] 
**Uin** | Pointer to **string** | УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК.  | [optional] 
**Rnpt** | Pointer to **string** | Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации.  | [optional] 
**Gtd** | Pointer to **string** | Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации.  | [optional] 

## Methods

### NewOrderItemInstanceDTO

`func NewOrderItemInstanceDTO() *OrderItemInstanceDTO`

NewOrderItemInstanceDTO instantiates a new OrderItemInstanceDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderItemInstanceDTOWithDefaults

`func NewOrderItemInstanceDTOWithDefaults() *OrderItemInstanceDTO`

NewOrderItemInstanceDTOWithDefaults instantiates a new OrderItemInstanceDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCis

`func (o *OrderItemInstanceDTO) GetCis() string`

GetCis returns the Cis field if non-nil, zero value otherwise.

### GetCisOk

`func (o *OrderItemInstanceDTO) GetCisOk() (*string, bool)`

GetCisOk returns a tuple with the Cis field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCis

`func (o *OrderItemInstanceDTO) SetCis(v string)`

SetCis sets Cis field to given value.

### HasCis

`func (o *OrderItemInstanceDTO) HasCis() bool`

HasCis returns a boolean if a field has been set.

### GetCisFull

`func (o *OrderItemInstanceDTO) GetCisFull() string`

GetCisFull returns the CisFull field if non-nil, zero value otherwise.

### GetCisFullOk

`func (o *OrderItemInstanceDTO) GetCisFullOk() (*string, bool)`

GetCisFullOk returns a tuple with the CisFull field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCisFull

`func (o *OrderItemInstanceDTO) SetCisFull(v string)`

SetCisFull sets CisFull field to given value.

### HasCisFull

`func (o *OrderItemInstanceDTO) HasCisFull() bool`

HasCisFull returns a boolean if a field has been set.

### GetUin

`func (o *OrderItemInstanceDTO) GetUin() string`

GetUin returns the Uin field if non-nil, zero value otherwise.

### GetUinOk

`func (o *OrderItemInstanceDTO) GetUinOk() (*string, bool)`

GetUinOk returns a tuple with the Uin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUin

`func (o *OrderItemInstanceDTO) SetUin(v string)`

SetUin sets Uin field to given value.

### HasUin

`func (o *OrderItemInstanceDTO) HasUin() bool`

HasUin returns a boolean if a field has been set.

### GetRnpt

`func (o *OrderItemInstanceDTO) GetRnpt() string`

GetRnpt returns the Rnpt field if non-nil, zero value otherwise.

### GetRnptOk

`func (o *OrderItemInstanceDTO) GetRnptOk() (*string, bool)`

GetRnptOk returns a tuple with the Rnpt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRnpt

`func (o *OrderItemInstanceDTO) SetRnpt(v string)`

SetRnpt sets Rnpt field to given value.

### HasRnpt

`func (o *OrderItemInstanceDTO) HasRnpt() bool`

HasRnpt returns a boolean if a field has been set.

### GetGtd

`func (o *OrderItemInstanceDTO) GetGtd() string`

GetGtd returns the Gtd field if non-nil, zero value otherwise.

### GetGtdOk

`func (o *OrderItemInstanceDTO) GetGtdOk() (*string, bool)`

GetGtdOk returns a tuple with the Gtd field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGtd

`func (o *OrderItemInstanceDTO) SetGtd(v string)`

SetGtd sets Gtd field to given value.

### HasGtd

`func (o *OrderItemInstanceDTO) HasGtd() bool`

HasGtd returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


