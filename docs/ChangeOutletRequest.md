# ChangeOutletRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Название точки продаж.  | 
**Type** | [**OutletType**](OutletType.md) |  | 
**Coords** | Pointer to **string** | Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;.  | [optional] 
**IsMain** | Pointer to **bool** | Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж.  | [optional] 
**ShopOutletCode** | Pointer to **string** | Идентификатор точки продаж, присвоенный магазином. | [optional] 
**Visibility** | Pointer to [**OutletVisibilityType**](OutletVisibilityType.md) |  | [optional] 
**Address** | [**OutletAddressDTO**](OutletAddressDTO.md) |  | 
**Phones** | **[]string** | Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;.  | 
**WorkingSchedule** | [**OutletWorkingScheduleDTO**](OutletWorkingScheduleDTO.md) |  | 
**DeliveryRules** | Pointer to [**[]OutletDeliveryRuleDTO**](OutletDeliveryRuleDTO.md) | Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;.  | [optional] 
**StoragePeriod** | Pointer to **int64** | Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. | [optional] 

## Methods

### NewChangeOutletRequest

`func NewChangeOutletRequest(name string, type_ OutletType, address OutletAddressDTO, phones []string, workingSchedule OutletWorkingScheduleDTO, ) *ChangeOutletRequest`

NewChangeOutletRequest instantiates a new ChangeOutletRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChangeOutletRequestWithDefaults

`func NewChangeOutletRequestWithDefaults() *ChangeOutletRequest`

NewChangeOutletRequestWithDefaults instantiates a new ChangeOutletRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *ChangeOutletRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ChangeOutletRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ChangeOutletRequest) SetName(v string)`

SetName sets Name field to given value.


### GetType

`func (o *ChangeOutletRequest) GetType() OutletType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ChangeOutletRequest) GetTypeOk() (*OutletType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ChangeOutletRequest) SetType(v OutletType)`

SetType sets Type field to given value.


### GetCoords

`func (o *ChangeOutletRequest) GetCoords() string`

GetCoords returns the Coords field if non-nil, zero value otherwise.

### GetCoordsOk

`func (o *ChangeOutletRequest) GetCoordsOk() (*string, bool)`

GetCoordsOk returns a tuple with the Coords field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoords

`func (o *ChangeOutletRequest) SetCoords(v string)`

SetCoords sets Coords field to given value.

### HasCoords

`func (o *ChangeOutletRequest) HasCoords() bool`

HasCoords returns a boolean if a field has been set.

### GetIsMain

`func (o *ChangeOutletRequest) GetIsMain() bool`

GetIsMain returns the IsMain field if non-nil, zero value otherwise.

### GetIsMainOk

`func (o *ChangeOutletRequest) GetIsMainOk() (*bool, bool)`

GetIsMainOk returns a tuple with the IsMain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMain

`func (o *ChangeOutletRequest) SetIsMain(v bool)`

SetIsMain sets IsMain field to given value.

### HasIsMain

`func (o *ChangeOutletRequest) HasIsMain() bool`

HasIsMain returns a boolean if a field has been set.

### GetShopOutletCode

`func (o *ChangeOutletRequest) GetShopOutletCode() string`

GetShopOutletCode returns the ShopOutletCode field if non-nil, zero value otherwise.

### GetShopOutletCodeOk

`func (o *ChangeOutletRequest) GetShopOutletCodeOk() (*string, bool)`

GetShopOutletCodeOk returns a tuple with the ShopOutletCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShopOutletCode

`func (o *ChangeOutletRequest) SetShopOutletCode(v string)`

SetShopOutletCode sets ShopOutletCode field to given value.

### HasShopOutletCode

`func (o *ChangeOutletRequest) HasShopOutletCode() bool`

HasShopOutletCode returns a boolean if a field has been set.

### GetVisibility

`func (o *ChangeOutletRequest) GetVisibility() OutletVisibilityType`

GetVisibility returns the Visibility field if non-nil, zero value otherwise.

### GetVisibilityOk

`func (o *ChangeOutletRequest) GetVisibilityOk() (*OutletVisibilityType, bool)`

GetVisibilityOk returns a tuple with the Visibility field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisibility

`func (o *ChangeOutletRequest) SetVisibility(v OutletVisibilityType)`

SetVisibility sets Visibility field to given value.

### HasVisibility

`func (o *ChangeOutletRequest) HasVisibility() bool`

HasVisibility returns a boolean if a field has been set.

### GetAddress

`func (o *ChangeOutletRequest) GetAddress() OutletAddressDTO`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *ChangeOutletRequest) GetAddressOk() (*OutletAddressDTO, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *ChangeOutletRequest) SetAddress(v OutletAddressDTO)`

SetAddress sets Address field to given value.


### GetPhones

`func (o *ChangeOutletRequest) GetPhones() []string`

GetPhones returns the Phones field if non-nil, zero value otherwise.

### GetPhonesOk

`func (o *ChangeOutletRequest) GetPhonesOk() (*[]string, bool)`

GetPhonesOk returns a tuple with the Phones field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhones

`func (o *ChangeOutletRequest) SetPhones(v []string)`

SetPhones sets Phones field to given value.


### GetWorkingSchedule

`func (o *ChangeOutletRequest) GetWorkingSchedule() OutletWorkingScheduleDTO`

GetWorkingSchedule returns the WorkingSchedule field if non-nil, zero value otherwise.

### GetWorkingScheduleOk

`func (o *ChangeOutletRequest) GetWorkingScheduleOk() (*OutletWorkingScheduleDTO, bool)`

GetWorkingScheduleOk returns a tuple with the WorkingSchedule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWorkingSchedule

`func (o *ChangeOutletRequest) SetWorkingSchedule(v OutletWorkingScheduleDTO)`

SetWorkingSchedule sets WorkingSchedule field to given value.


### GetDeliveryRules

`func (o *ChangeOutletRequest) GetDeliveryRules() []OutletDeliveryRuleDTO`

GetDeliveryRules returns the DeliveryRules field if non-nil, zero value otherwise.

### GetDeliveryRulesOk

`func (o *ChangeOutletRequest) GetDeliveryRulesOk() (*[]OutletDeliveryRuleDTO, bool)`

GetDeliveryRulesOk returns a tuple with the DeliveryRules field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryRules

`func (o *ChangeOutletRequest) SetDeliveryRules(v []OutletDeliveryRuleDTO)`

SetDeliveryRules sets DeliveryRules field to given value.

### HasDeliveryRules

`func (o *ChangeOutletRequest) HasDeliveryRules() bool`

HasDeliveryRules returns a boolean if a field has been set.

### SetDeliveryRulesNil

`func (o *ChangeOutletRequest) SetDeliveryRulesNil(b bool)`

 SetDeliveryRulesNil sets the value for DeliveryRules to be an explicit nil

### UnsetDeliveryRules
`func (o *ChangeOutletRequest) UnsetDeliveryRules()`

UnsetDeliveryRules ensures that no value is present for DeliveryRules, not even an explicit nil
### GetStoragePeriod

`func (o *ChangeOutletRequest) GetStoragePeriod() int64`

GetStoragePeriod returns the StoragePeriod field if non-nil, zero value otherwise.

### GetStoragePeriodOk

`func (o *ChangeOutletRequest) GetStoragePeriodOk() (*int64, bool)`

GetStoragePeriodOk returns a tuple with the StoragePeriod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStoragePeriod

`func (o *ChangeOutletRequest) SetStoragePeriod(v int64)`

SetStoragePeriod sets StoragePeriod field to given value.

### HasStoragePeriod

`func (o *ChangeOutletRequest) HasStoragePeriod() bool`

HasStoragePeriod returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


