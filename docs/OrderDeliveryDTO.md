# OrderDeliveryDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  | [optional] 
**Type** | Pointer to [**OrderDeliveryType**](OrderDeliveryType.md) |  | [optional] 
**ServiceName** | Pointer to **string** | Наименование службы доставки. | [optional] 
**Price** | Pointer to **float32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа.  | [optional] 
**DeliveryPartnerType** | Pointer to [**OrderDeliveryPartnerType**](OrderDeliveryPartnerType.md) |  | [optional] 
**Courier** | Pointer to [**OrderCourierDTO**](OrderCourierDTO.md) |  | [optional] 
**Dates** | Pointer to [**OrderDeliveryDatesDTO**](OrderDeliveryDatesDTO.md) |  | [optional] 
**Region** | Pointer to [**RegionDTO**](RegionDTO.md) |  | [optional] 
**Address** | Pointer to [**OrderDeliveryAddressDTO**](OrderDeliveryAddressDTO.md) |  | [optional] 
**Vat** | Pointer to [**OrderVatType**](OrderVatType.md) |  | [optional] 
**DeliveryServiceId** | Pointer to **int64** | Идентификатор службы доставки. | [optional] 
**LiftType** | Pointer to [**OrderLiftType**](OrderLiftType.md) |  | [optional] 
**LiftPrice** | Pointer to **float32** | Стоимость подъема на этаж. | [optional] 
**OutletCode** | Pointer to **string** | Идентификатор пункта самовывоза, присвоенный магазином. | [optional] 
**OutletStorageLimitDate** | Pointer to **string** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 
**DispatchType** | Pointer to [**OrderDeliveryDispatchType**](OrderDeliveryDispatchType.md) |  | [optional] 
**Tracks** | Pointer to [**[]OrderTrackDTO**](OrderTrackDTO.md) | Информация для отслеживания перемещений посылки. | [optional] 
**Shipments** | Pointer to [**[]OrderShipmentDTO**](OrderShipmentDTO.md) | Информация о посылках. | [optional] 
**Estimated** | Pointer to **bool** | Приблизительная ли дата доставки. | [optional] 
**EacType** | Pointer to [**OrderDeliveryEacType**](OrderDeliveryEacType.md) |  | [optional] 
**EacCode** | Pointer to **string** | Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;).  | [optional] 

## Methods

### NewOrderDeliveryDTO

`func NewOrderDeliveryDTO() *OrderDeliveryDTO`

NewOrderDeliveryDTO instantiates a new OrderDeliveryDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderDeliveryDTOWithDefaults

`func NewOrderDeliveryDTOWithDefaults() *OrderDeliveryDTO`

NewOrderDeliveryDTOWithDefaults instantiates a new OrderDeliveryDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *OrderDeliveryDTO) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OrderDeliveryDTO) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OrderDeliveryDTO) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *OrderDeliveryDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetType

`func (o *OrderDeliveryDTO) GetType() OrderDeliveryType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *OrderDeliveryDTO) GetTypeOk() (*OrderDeliveryType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *OrderDeliveryDTO) SetType(v OrderDeliveryType)`

SetType sets Type field to given value.

### HasType

`func (o *OrderDeliveryDTO) HasType() bool`

HasType returns a boolean if a field has been set.

### GetServiceName

`func (o *OrderDeliveryDTO) GetServiceName() string`

GetServiceName returns the ServiceName field if non-nil, zero value otherwise.

### GetServiceNameOk

`func (o *OrderDeliveryDTO) GetServiceNameOk() (*string, bool)`

GetServiceNameOk returns a tuple with the ServiceName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceName

`func (o *OrderDeliveryDTO) SetServiceName(v string)`

SetServiceName sets ServiceName field to given value.

### HasServiceName

`func (o *OrderDeliveryDTO) HasServiceName() bool`

HasServiceName returns a boolean if a field has been set.

### GetPrice

`func (o *OrderDeliveryDTO) GetPrice() float32`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *OrderDeliveryDTO) GetPriceOk() (*float32, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *OrderDeliveryDTO) SetPrice(v float32)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *OrderDeliveryDTO) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetDeliveryPartnerType

`func (o *OrderDeliveryDTO) GetDeliveryPartnerType() OrderDeliveryPartnerType`

GetDeliveryPartnerType returns the DeliveryPartnerType field if non-nil, zero value otherwise.

### GetDeliveryPartnerTypeOk

`func (o *OrderDeliveryDTO) GetDeliveryPartnerTypeOk() (*OrderDeliveryPartnerType, bool)`

GetDeliveryPartnerTypeOk returns a tuple with the DeliveryPartnerType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryPartnerType

`func (o *OrderDeliveryDTO) SetDeliveryPartnerType(v OrderDeliveryPartnerType)`

SetDeliveryPartnerType sets DeliveryPartnerType field to given value.

### HasDeliveryPartnerType

`func (o *OrderDeliveryDTO) HasDeliveryPartnerType() bool`

HasDeliveryPartnerType returns a boolean if a field has been set.

### GetCourier

`func (o *OrderDeliveryDTO) GetCourier() OrderCourierDTO`

GetCourier returns the Courier field if non-nil, zero value otherwise.

### GetCourierOk

`func (o *OrderDeliveryDTO) GetCourierOk() (*OrderCourierDTO, bool)`

GetCourierOk returns a tuple with the Courier field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourier

`func (o *OrderDeliveryDTO) SetCourier(v OrderCourierDTO)`

SetCourier sets Courier field to given value.

### HasCourier

`func (o *OrderDeliveryDTO) HasCourier() bool`

HasCourier returns a boolean if a field has been set.

### GetDates

`func (o *OrderDeliveryDTO) GetDates() OrderDeliveryDatesDTO`

GetDates returns the Dates field if non-nil, zero value otherwise.

### GetDatesOk

`func (o *OrderDeliveryDTO) GetDatesOk() (*OrderDeliveryDatesDTO, bool)`

GetDatesOk returns a tuple with the Dates field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDates

`func (o *OrderDeliveryDTO) SetDates(v OrderDeliveryDatesDTO)`

SetDates sets Dates field to given value.

### HasDates

`func (o *OrderDeliveryDTO) HasDates() bool`

HasDates returns a boolean if a field has been set.

### GetRegion

`func (o *OrderDeliveryDTO) GetRegion() RegionDTO`

GetRegion returns the Region field if non-nil, zero value otherwise.

### GetRegionOk

`func (o *OrderDeliveryDTO) GetRegionOk() (*RegionDTO, bool)`

GetRegionOk returns a tuple with the Region field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegion

`func (o *OrderDeliveryDTO) SetRegion(v RegionDTO)`

SetRegion sets Region field to given value.

### HasRegion

`func (o *OrderDeliveryDTO) HasRegion() bool`

HasRegion returns a boolean if a field has been set.

### GetAddress

`func (o *OrderDeliveryDTO) GetAddress() OrderDeliveryAddressDTO`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *OrderDeliveryDTO) GetAddressOk() (*OrderDeliveryAddressDTO, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *OrderDeliveryDTO) SetAddress(v OrderDeliveryAddressDTO)`

SetAddress sets Address field to given value.

### HasAddress

`func (o *OrderDeliveryDTO) HasAddress() bool`

HasAddress returns a boolean if a field has been set.

### GetVat

`func (o *OrderDeliveryDTO) GetVat() OrderVatType`

GetVat returns the Vat field if non-nil, zero value otherwise.

### GetVatOk

`func (o *OrderDeliveryDTO) GetVatOk() (*OrderVatType, bool)`

GetVatOk returns a tuple with the Vat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVat

`func (o *OrderDeliveryDTO) SetVat(v OrderVatType)`

SetVat sets Vat field to given value.

### HasVat

`func (o *OrderDeliveryDTO) HasVat() bool`

HasVat returns a boolean if a field has been set.

### GetDeliveryServiceId

`func (o *OrderDeliveryDTO) GetDeliveryServiceId() int64`

GetDeliveryServiceId returns the DeliveryServiceId field if non-nil, zero value otherwise.

### GetDeliveryServiceIdOk

`func (o *OrderDeliveryDTO) GetDeliveryServiceIdOk() (*int64, bool)`

GetDeliveryServiceIdOk returns a tuple with the DeliveryServiceId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryServiceId

`func (o *OrderDeliveryDTO) SetDeliveryServiceId(v int64)`

SetDeliveryServiceId sets DeliveryServiceId field to given value.

### HasDeliveryServiceId

`func (o *OrderDeliveryDTO) HasDeliveryServiceId() bool`

HasDeliveryServiceId returns a boolean if a field has been set.

### GetLiftType

`func (o *OrderDeliveryDTO) GetLiftType() OrderLiftType`

GetLiftType returns the LiftType field if non-nil, zero value otherwise.

### GetLiftTypeOk

`func (o *OrderDeliveryDTO) GetLiftTypeOk() (*OrderLiftType, bool)`

GetLiftTypeOk returns a tuple with the LiftType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLiftType

`func (o *OrderDeliveryDTO) SetLiftType(v OrderLiftType)`

SetLiftType sets LiftType field to given value.

### HasLiftType

`func (o *OrderDeliveryDTO) HasLiftType() bool`

HasLiftType returns a boolean if a field has been set.

### GetLiftPrice

`func (o *OrderDeliveryDTO) GetLiftPrice() float32`

GetLiftPrice returns the LiftPrice field if non-nil, zero value otherwise.

### GetLiftPriceOk

`func (o *OrderDeliveryDTO) GetLiftPriceOk() (*float32, bool)`

GetLiftPriceOk returns a tuple with the LiftPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLiftPrice

`func (o *OrderDeliveryDTO) SetLiftPrice(v float32)`

SetLiftPrice sets LiftPrice field to given value.

### HasLiftPrice

`func (o *OrderDeliveryDTO) HasLiftPrice() bool`

HasLiftPrice returns a boolean if a field has been set.

### GetOutletCode

`func (o *OrderDeliveryDTO) GetOutletCode() string`

GetOutletCode returns the OutletCode field if non-nil, zero value otherwise.

### GetOutletCodeOk

`func (o *OrderDeliveryDTO) GetOutletCodeOk() (*string, bool)`

GetOutletCodeOk returns a tuple with the OutletCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutletCode

`func (o *OrderDeliveryDTO) SetOutletCode(v string)`

SetOutletCode sets OutletCode field to given value.

### HasOutletCode

`func (o *OrderDeliveryDTO) HasOutletCode() bool`

HasOutletCode returns a boolean if a field has been set.

### GetOutletStorageLimitDate

`func (o *OrderDeliveryDTO) GetOutletStorageLimitDate() string`

GetOutletStorageLimitDate returns the OutletStorageLimitDate field if non-nil, zero value otherwise.

### GetOutletStorageLimitDateOk

`func (o *OrderDeliveryDTO) GetOutletStorageLimitDateOk() (*string, bool)`

GetOutletStorageLimitDateOk returns a tuple with the OutletStorageLimitDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutletStorageLimitDate

`func (o *OrderDeliveryDTO) SetOutletStorageLimitDate(v string)`

SetOutletStorageLimitDate sets OutletStorageLimitDate field to given value.

### HasOutletStorageLimitDate

`func (o *OrderDeliveryDTO) HasOutletStorageLimitDate() bool`

HasOutletStorageLimitDate returns a boolean if a field has been set.

### GetDispatchType

`func (o *OrderDeliveryDTO) GetDispatchType() OrderDeliveryDispatchType`

GetDispatchType returns the DispatchType field if non-nil, zero value otherwise.

### GetDispatchTypeOk

`func (o *OrderDeliveryDTO) GetDispatchTypeOk() (*OrderDeliveryDispatchType, bool)`

GetDispatchTypeOk returns a tuple with the DispatchType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDispatchType

`func (o *OrderDeliveryDTO) SetDispatchType(v OrderDeliveryDispatchType)`

SetDispatchType sets DispatchType field to given value.

### HasDispatchType

`func (o *OrderDeliveryDTO) HasDispatchType() bool`

HasDispatchType returns a boolean if a field has been set.

### GetTracks

`func (o *OrderDeliveryDTO) GetTracks() []OrderTrackDTO`

GetTracks returns the Tracks field if non-nil, zero value otherwise.

### GetTracksOk

`func (o *OrderDeliveryDTO) GetTracksOk() (*[]OrderTrackDTO, bool)`

GetTracksOk returns a tuple with the Tracks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTracks

`func (o *OrderDeliveryDTO) SetTracks(v []OrderTrackDTO)`

SetTracks sets Tracks field to given value.

### HasTracks

`func (o *OrderDeliveryDTO) HasTracks() bool`

HasTracks returns a boolean if a field has been set.

### SetTracksNil

`func (o *OrderDeliveryDTO) SetTracksNil(b bool)`

 SetTracksNil sets the value for Tracks to be an explicit nil

### UnsetTracks
`func (o *OrderDeliveryDTO) UnsetTracks()`

UnsetTracks ensures that no value is present for Tracks, not even an explicit nil
### GetShipments

`func (o *OrderDeliveryDTO) GetShipments() []OrderShipmentDTO`

GetShipments returns the Shipments field if non-nil, zero value otherwise.

### GetShipmentsOk

`func (o *OrderDeliveryDTO) GetShipmentsOk() (*[]OrderShipmentDTO, bool)`

GetShipmentsOk returns a tuple with the Shipments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShipments

`func (o *OrderDeliveryDTO) SetShipments(v []OrderShipmentDTO)`

SetShipments sets Shipments field to given value.

### HasShipments

`func (o *OrderDeliveryDTO) HasShipments() bool`

HasShipments returns a boolean if a field has been set.

### SetShipmentsNil

`func (o *OrderDeliveryDTO) SetShipmentsNil(b bool)`

 SetShipmentsNil sets the value for Shipments to be an explicit nil

### UnsetShipments
`func (o *OrderDeliveryDTO) UnsetShipments()`

UnsetShipments ensures that no value is present for Shipments, not even an explicit nil
### GetEstimated

`func (o *OrderDeliveryDTO) GetEstimated() bool`

GetEstimated returns the Estimated field if non-nil, zero value otherwise.

### GetEstimatedOk

`func (o *OrderDeliveryDTO) GetEstimatedOk() (*bool, bool)`

GetEstimatedOk returns a tuple with the Estimated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEstimated

`func (o *OrderDeliveryDTO) SetEstimated(v bool)`

SetEstimated sets Estimated field to given value.

### HasEstimated

`func (o *OrderDeliveryDTO) HasEstimated() bool`

HasEstimated returns a boolean if a field has been set.

### GetEacType

`func (o *OrderDeliveryDTO) GetEacType() OrderDeliveryEacType`

GetEacType returns the EacType field if non-nil, zero value otherwise.

### GetEacTypeOk

`func (o *OrderDeliveryDTO) GetEacTypeOk() (*OrderDeliveryEacType, bool)`

GetEacTypeOk returns a tuple with the EacType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEacType

`func (o *OrderDeliveryDTO) SetEacType(v OrderDeliveryEacType)`

SetEacType sets EacType field to given value.

### HasEacType

`func (o *OrderDeliveryDTO) HasEacType() bool`

HasEacType returns a boolean if a field has been set.

### GetEacCode

`func (o *OrderDeliveryDTO) GetEacCode() string`

GetEacCode returns the EacCode field if non-nil, zero value otherwise.

### GetEacCodeOk

`func (o *OrderDeliveryDTO) GetEacCodeOk() (*string, bool)`

GetEacCodeOk returns a tuple with the EacCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEacCode

`func (o *OrderDeliveryDTO) SetEacCode(v string)`

SetEacCode sets EacCode field to given value.

### HasEacCode

`func (o *OrderDeliveryDTO) HasEacCode() bool`

HasEacCode returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


