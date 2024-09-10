# OutletLicenseDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре &#x60;number&#x60;.  | [optional] 
**OutletId** | Pointer to **int64** | Идентификатор точки продаж, для которой действительна лицензия. | [optional] 
**LicenseType** | Pointer to [**LicenseType**](LicenseType.md) |  | [optional] 
**Number** | Pointer to **string** | Номер лицензии. | [optional] 
**DateOfIssue** | Pointer to **time.Time** | Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время &#x60;00:00:00&#x60; и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение &#x60;2017-11-13T00:00:00+03:00&#x60;.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре &#x60;dateOfExpiry&#x60;.  | [optional] 
**DateOfExpiry** | Pointer to **time.Time** | Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время &#x60;00:00:00&#x60; и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение &#x60;2022-11-20T00:00:00+03:00&#x60;.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре &#x60;dateOfIssue&#x60;.  | [optional] 

## Methods

### NewOutletLicenseDTO

`func NewOutletLicenseDTO() *OutletLicenseDTO`

NewOutletLicenseDTO instantiates a new OutletLicenseDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOutletLicenseDTOWithDefaults

`func NewOutletLicenseDTOWithDefaults() *OutletLicenseDTO`

NewOutletLicenseDTOWithDefaults instantiates a new OutletLicenseDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *OutletLicenseDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OutletLicenseDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OutletLicenseDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *OutletLicenseDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetOutletId

`func (o *OutletLicenseDTO) GetOutletId() int64`

GetOutletId returns the OutletId field if non-nil, zero value otherwise.

### GetOutletIdOk

`func (o *OutletLicenseDTO) GetOutletIdOk() (*int64, bool)`

GetOutletIdOk returns a tuple with the OutletId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutletId

`func (o *OutletLicenseDTO) SetOutletId(v int64)`

SetOutletId sets OutletId field to given value.

### HasOutletId

`func (o *OutletLicenseDTO) HasOutletId() bool`

HasOutletId returns a boolean if a field has been set.

### GetLicenseType

`func (o *OutletLicenseDTO) GetLicenseType() LicenseType`

GetLicenseType returns the LicenseType field if non-nil, zero value otherwise.

### GetLicenseTypeOk

`func (o *OutletLicenseDTO) GetLicenseTypeOk() (*LicenseType, bool)`

GetLicenseTypeOk returns a tuple with the LicenseType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLicenseType

`func (o *OutletLicenseDTO) SetLicenseType(v LicenseType)`

SetLicenseType sets LicenseType field to given value.

### HasLicenseType

`func (o *OutletLicenseDTO) HasLicenseType() bool`

HasLicenseType returns a boolean if a field has been set.

### GetNumber

`func (o *OutletLicenseDTO) GetNumber() string`

GetNumber returns the Number field if non-nil, zero value otherwise.

### GetNumberOk

`func (o *OutletLicenseDTO) GetNumberOk() (*string, bool)`

GetNumberOk returns a tuple with the Number field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumber

`func (o *OutletLicenseDTO) SetNumber(v string)`

SetNumber sets Number field to given value.

### HasNumber

`func (o *OutletLicenseDTO) HasNumber() bool`

HasNumber returns a boolean if a field has been set.

### GetDateOfIssue

`func (o *OutletLicenseDTO) GetDateOfIssue() time.Time`

GetDateOfIssue returns the DateOfIssue field if non-nil, zero value otherwise.

### GetDateOfIssueOk

`func (o *OutletLicenseDTO) GetDateOfIssueOk() (*time.Time, bool)`

GetDateOfIssueOk returns a tuple with the DateOfIssue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateOfIssue

`func (o *OutletLicenseDTO) SetDateOfIssue(v time.Time)`

SetDateOfIssue sets DateOfIssue field to given value.

### HasDateOfIssue

`func (o *OutletLicenseDTO) HasDateOfIssue() bool`

HasDateOfIssue returns a boolean if a field has been set.

### GetDateOfExpiry

`func (o *OutletLicenseDTO) GetDateOfExpiry() time.Time`

GetDateOfExpiry returns the DateOfExpiry field if non-nil, zero value otherwise.

### GetDateOfExpiryOk

`func (o *OutletLicenseDTO) GetDateOfExpiryOk() (*time.Time, bool)`

GetDateOfExpiryOk returns a tuple with the DateOfExpiry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateOfExpiry

`func (o *OutletLicenseDTO) SetDateOfExpiry(v time.Time)`

SetDateOfExpiry sets DateOfExpiry field to given value.

### HasDateOfExpiry

`func (o *OutletLicenseDTO) HasDateOfExpiry() bool`

HasDateOfExpiry returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


