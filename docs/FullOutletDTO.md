# FullOutletDTO

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
**Id** | Pointer to **int64** | Идентификатор точки продаж, присвоенный Маркетом. | [optional] 
**Status** | Pointer to [**OutletStatusType**](OutletStatusType.md) |  | [optional] 
**Region** | Pointer to [**RegionDTO**](RegionDTO.md) |  | [optional] 
**ShopOutletId** | Pointer to **string** | Идентификатор точки продаж, заданный магазином. | [optional] 
**WorkingTime** | Pointer to **string** | Рабочее время. | [optional] 
**ModerationReason** | Pointer to **string** | Статус модерации. | [optional] 

## Methods

### NewFullOutletDTO

`func NewFullOutletDTO(name string, type_ OutletType, address OutletAddressDTO, phones []string, workingSchedule OutletWorkingScheduleDTO, ) *FullOutletDTO`

NewFullOutletDTO instantiates a new FullOutletDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFullOutletDTOWithDefaults

`func NewFullOutletDTOWithDefaults() *FullOutletDTO`

NewFullOutletDTOWithDefaults instantiates a new FullOutletDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *FullOutletDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *FullOutletDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *FullOutletDTO) SetName(v string)`

SetName sets Name field to given value.


### GetType

`func (o *FullOutletDTO) GetType() OutletType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *FullOutletDTO) GetTypeOk() (*OutletType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *FullOutletDTO) SetType(v OutletType)`

SetType sets Type field to given value.


### GetCoords

`func (o *FullOutletDTO) GetCoords() string`

GetCoords returns the Coords field if non-nil, zero value otherwise.

### GetCoordsOk

`func (o *FullOutletDTO) GetCoordsOk() (*string, bool)`

GetCoordsOk returns a tuple with the Coords field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoords

`func (o *FullOutletDTO) SetCoords(v string)`

SetCoords sets Coords field to given value.

### HasCoords

`func (o *FullOutletDTO) HasCoords() bool`

HasCoords returns a boolean if a field has been set.

### GetIsMain

`func (o *FullOutletDTO) GetIsMain() bool`

GetIsMain returns the IsMain field if non-nil, zero value otherwise.

### GetIsMainOk

`func (o *FullOutletDTO) GetIsMainOk() (*bool, bool)`

GetIsMainOk returns a tuple with the IsMain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMain

`func (o *FullOutletDTO) SetIsMain(v bool)`

SetIsMain sets IsMain field to given value.

### HasIsMain

`func (o *FullOutletDTO) HasIsMain() bool`

HasIsMain returns a boolean if a field has been set.

### GetShopOutletCode

`func (o *FullOutletDTO) GetShopOutletCode() string`

GetShopOutletCode returns the ShopOutletCode field if non-nil, zero value otherwise.

### GetShopOutletCodeOk

`func (o *FullOutletDTO) GetShopOutletCodeOk() (*string, bool)`

GetShopOutletCodeOk returns a tuple with the ShopOutletCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShopOutletCode

`func (o *FullOutletDTO) SetShopOutletCode(v string)`

SetShopOutletCode sets ShopOutletCode field to given value.

### HasShopOutletCode

`func (o *FullOutletDTO) HasShopOutletCode() bool`

HasShopOutletCode returns a boolean if a field has been set.

### GetVisibility

`func (o *FullOutletDTO) GetVisibility() OutletVisibilityType`

GetVisibility returns the Visibility field if non-nil, zero value otherwise.

### GetVisibilityOk

`func (o *FullOutletDTO) GetVisibilityOk() (*OutletVisibilityType, bool)`

GetVisibilityOk returns a tuple with the Visibility field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisibility

`func (o *FullOutletDTO) SetVisibility(v OutletVisibilityType)`

SetVisibility sets Visibility field to given value.

### HasVisibility

`func (o *FullOutletDTO) HasVisibility() bool`

HasVisibility returns a boolean if a field has been set.

### GetAddress

`func (o *FullOutletDTO) GetAddress() OutletAddressDTO`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *FullOutletDTO) GetAddressOk() (*OutletAddressDTO, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *FullOutletDTO) SetAddress(v OutletAddressDTO)`

SetAddress sets Address field to given value.


### GetPhones

`func (o *FullOutletDTO) GetPhones() []string`

GetPhones returns the Phones field if non-nil, zero value otherwise.

### GetPhonesOk

`func (o *FullOutletDTO) GetPhonesOk() (*[]string, bool)`

GetPhonesOk returns a tuple with the Phones field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhones

`func (o *FullOutletDTO) SetPhones(v []string)`

SetPhones sets Phones field to given value.


### GetWorkingSchedule

`func (o *FullOutletDTO) GetWorkingSchedule() OutletWorkingScheduleDTO`

GetWorkingSchedule returns the WorkingSchedule field if non-nil, zero value otherwise.

### GetWorkingScheduleOk

`func (o *FullOutletDTO) GetWorkingScheduleOk() (*OutletWorkingScheduleDTO, bool)`

GetWorkingScheduleOk returns a tuple with the WorkingSchedule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWorkingSchedule

`func (o *FullOutletDTO) SetWorkingSchedule(v OutletWorkingScheduleDTO)`

SetWorkingSchedule sets WorkingSchedule field to given value.


### GetDeliveryRules

`func (o *FullOutletDTO) GetDeliveryRules() []OutletDeliveryRuleDTO`

GetDeliveryRules returns the DeliveryRules field if non-nil, zero value otherwise.

### GetDeliveryRulesOk

`func (o *FullOutletDTO) GetDeliveryRulesOk() (*[]OutletDeliveryRuleDTO, bool)`

GetDeliveryRulesOk returns a tuple with the DeliveryRules field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryRules

`func (o *FullOutletDTO) SetDeliveryRules(v []OutletDeliveryRuleDTO)`

SetDeliveryRules sets DeliveryRules field to given value.

### HasDeliveryRules

`func (o *FullOutletDTO) HasDeliveryRules() bool`

HasDeliveryRules returns a boolean if a field has been set.

### SetDeliveryRulesNil

`func (o *FullOutletDTO) SetDeliveryRulesNil(b bool)`

 SetDeliveryRulesNil sets the value for DeliveryRules to be an explicit nil

### UnsetDeliveryRules
`func (o *FullOutletDTO) UnsetDeliveryRules()`

UnsetDeliveryRules ensures that no value is present for DeliveryRules, not even an explicit nil
### GetStoragePeriod

`func (o *FullOutletDTO) GetStoragePeriod() int64`

GetStoragePeriod returns the StoragePeriod field if non-nil, zero value otherwise.

### GetStoragePeriodOk

`func (o *FullOutletDTO) GetStoragePeriodOk() (*int64, bool)`

GetStoragePeriodOk returns a tuple with the StoragePeriod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStoragePeriod

`func (o *FullOutletDTO) SetStoragePeriod(v int64)`

SetStoragePeriod sets StoragePeriod field to given value.

### HasStoragePeriod

`func (o *FullOutletDTO) HasStoragePeriod() bool`

HasStoragePeriod returns a boolean if a field has been set.

### GetId

`func (o *FullOutletDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *FullOutletDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *FullOutletDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *FullOutletDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetStatus

`func (o *FullOutletDTO) GetStatus() OutletStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *FullOutletDTO) GetStatusOk() (*OutletStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *FullOutletDTO) SetStatus(v OutletStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *FullOutletDTO) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetRegion

`func (o *FullOutletDTO) GetRegion() RegionDTO`

GetRegion returns the Region field if non-nil, zero value otherwise.

### GetRegionOk

`func (o *FullOutletDTO) GetRegionOk() (*RegionDTO, bool)`

GetRegionOk returns a tuple with the Region field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegion

`func (o *FullOutletDTO) SetRegion(v RegionDTO)`

SetRegion sets Region field to given value.

### HasRegion

`func (o *FullOutletDTO) HasRegion() bool`

HasRegion returns a boolean if a field has been set.

### GetShopOutletId

`func (o *FullOutletDTO) GetShopOutletId() string`

GetShopOutletId returns the ShopOutletId field if non-nil, zero value otherwise.

### GetShopOutletIdOk

`func (o *FullOutletDTO) GetShopOutletIdOk() (*string, bool)`

GetShopOutletIdOk returns a tuple with the ShopOutletId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShopOutletId

`func (o *FullOutletDTO) SetShopOutletId(v string)`

SetShopOutletId sets ShopOutletId field to given value.

### HasShopOutletId

`func (o *FullOutletDTO) HasShopOutletId() bool`

HasShopOutletId returns a boolean if a field has been set.

### GetWorkingTime

`func (o *FullOutletDTO) GetWorkingTime() string`

GetWorkingTime returns the WorkingTime field if non-nil, zero value otherwise.

### GetWorkingTimeOk

`func (o *FullOutletDTO) GetWorkingTimeOk() (*string, bool)`

GetWorkingTimeOk returns a tuple with the WorkingTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWorkingTime

`func (o *FullOutletDTO) SetWorkingTime(v string)`

SetWorkingTime sets WorkingTime field to given value.

### HasWorkingTime

`func (o *FullOutletDTO) HasWorkingTime() bool`

HasWorkingTime returns a boolean if a field has been set.

### GetModerationReason

`func (o *FullOutletDTO) GetModerationReason() string`

GetModerationReason returns the ModerationReason field if non-nil, zero value otherwise.

### GetModerationReasonOk

`func (o *FullOutletDTO) GetModerationReasonOk() (*string, bool)`

GetModerationReasonOk returns a tuple with the ModerationReason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModerationReason

`func (o *FullOutletDTO) SetModerationReason(v string)`

SetModerationReason sets ModerationReason field to given value.

### HasModerationReason

`func (o *FullOutletDTO) HasModerationReason() bool`

HasModerationReason returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


