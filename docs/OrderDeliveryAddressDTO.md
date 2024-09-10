# OrderDeliveryAddressDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | Pointer to **string** | Страна.  Обязательный параметр.  | [optional] 
**Postcode** | Pointer to **string** | Почтовый индекс.  Указывается, если выбрана доставка почтой (&#x60;delivery type&#x3D;POST&#x60;).  | [optional] 
**City** | Pointer to **string** | Город или населенный пункт.  Обязательный параметр.  | [optional] 
**District** | Pointer to **string** | Район. | [optional] 
**Subway** | Pointer to **string** | Станция метро. | [optional] 
**Street** | Pointer to **string** | Улица.  Обязательный параметр.  | [optional] 
**House** | Pointer to **string** | Дом или владение.  Обязательный параметр.  | [optional] 
**Block** | Pointer to **string** | Корпус или строение. | [optional] 
**Entrance** | Pointer to **string** | Подъезд. | [optional] 
**Entryphone** | Pointer to **string** | Код домофона. | [optional] 
**Floor** | Pointer to **string** | Этаж. | [optional] 
**Apartment** | Pointer to **string** | Квартира или офис. | [optional] 
**Phone** | Pointer to **string** | Телефон получателя заказа.  Обязательный параметр.  | [optional] 
**Recipient** | Pointer to **string** | Фамилия, имя и отчество получателя заказа.  Обязательный параметр.  | [optional] 
**Gps** | Pointer to [**GpsDTO**](GpsDTO.md) |  | [optional] 

## Methods

### NewOrderDeliveryAddressDTO

`func NewOrderDeliveryAddressDTO() *OrderDeliveryAddressDTO`

NewOrderDeliveryAddressDTO instantiates a new OrderDeliveryAddressDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderDeliveryAddressDTOWithDefaults

`func NewOrderDeliveryAddressDTOWithDefaults() *OrderDeliveryAddressDTO`

NewOrderDeliveryAddressDTOWithDefaults instantiates a new OrderDeliveryAddressDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCountry

`func (o *OrderDeliveryAddressDTO) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *OrderDeliveryAddressDTO) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *OrderDeliveryAddressDTO) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *OrderDeliveryAddressDTO) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetPostcode

`func (o *OrderDeliveryAddressDTO) GetPostcode() string`

GetPostcode returns the Postcode field if non-nil, zero value otherwise.

### GetPostcodeOk

`func (o *OrderDeliveryAddressDTO) GetPostcodeOk() (*string, bool)`

GetPostcodeOk returns a tuple with the Postcode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPostcode

`func (o *OrderDeliveryAddressDTO) SetPostcode(v string)`

SetPostcode sets Postcode field to given value.

### HasPostcode

`func (o *OrderDeliveryAddressDTO) HasPostcode() bool`

HasPostcode returns a boolean if a field has been set.

### GetCity

`func (o *OrderDeliveryAddressDTO) GetCity() string`

GetCity returns the City field if non-nil, zero value otherwise.

### GetCityOk

`func (o *OrderDeliveryAddressDTO) GetCityOk() (*string, bool)`

GetCityOk returns a tuple with the City field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCity

`func (o *OrderDeliveryAddressDTO) SetCity(v string)`

SetCity sets City field to given value.

### HasCity

`func (o *OrderDeliveryAddressDTO) HasCity() bool`

HasCity returns a boolean if a field has been set.

### GetDistrict

`func (o *OrderDeliveryAddressDTO) GetDistrict() string`

GetDistrict returns the District field if non-nil, zero value otherwise.

### GetDistrictOk

`func (o *OrderDeliveryAddressDTO) GetDistrictOk() (*string, bool)`

GetDistrictOk returns a tuple with the District field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDistrict

`func (o *OrderDeliveryAddressDTO) SetDistrict(v string)`

SetDistrict sets District field to given value.

### HasDistrict

`func (o *OrderDeliveryAddressDTO) HasDistrict() bool`

HasDistrict returns a boolean if a field has been set.

### GetSubway

`func (o *OrderDeliveryAddressDTO) GetSubway() string`

GetSubway returns the Subway field if non-nil, zero value otherwise.

### GetSubwayOk

`func (o *OrderDeliveryAddressDTO) GetSubwayOk() (*string, bool)`

GetSubwayOk returns a tuple with the Subway field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubway

`func (o *OrderDeliveryAddressDTO) SetSubway(v string)`

SetSubway sets Subway field to given value.

### HasSubway

`func (o *OrderDeliveryAddressDTO) HasSubway() bool`

HasSubway returns a boolean if a field has been set.

### GetStreet

`func (o *OrderDeliveryAddressDTO) GetStreet() string`

GetStreet returns the Street field if non-nil, zero value otherwise.

### GetStreetOk

`func (o *OrderDeliveryAddressDTO) GetStreetOk() (*string, bool)`

GetStreetOk returns a tuple with the Street field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStreet

`func (o *OrderDeliveryAddressDTO) SetStreet(v string)`

SetStreet sets Street field to given value.

### HasStreet

`func (o *OrderDeliveryAddressDTO) HasStreet() bool`

HasStreet returns a boolean if a field has been set.

### GetHouse

`func (o *OrderDeliveryAddressDTO) GetHouse() string`

GetHouse returns the House field if non-nil, zero value otherwise.

### GetHouseOk

`func (o *OrderDeliveryAddressDTO) GetHouseOk() (*string, bool)`

GetHouseOk returns a tuple with the House field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHouse

`func (o *OrderDeliveryAddressDTO) SetHouse(v string)`

SetHouse sets House field to given value.

### HasHouse

`func (o *OrderDeliveryAddressDTO) HasHouse() bool`

HasHouse returns a boolean if a field has been set.

### GetBlock

`func (o *OrderDeliveryAddressDTO) GetBlock() string`

GetBlock returns the Block field if non-nil, zero value otherwise.

### GetBlockOk

`func (o *OrderDeliveryAddressDTO) GetBlockOk() (*string, bool)`

GetBlockOk returns a tuple with the Block field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlock

`func (o *OrderDeliveryAddressDTO) SetBlock(v string)`

SetBlock sets Block field to given value.

### HasBlock

`func (o *OrderDeliveryAddressDTO) HasBlock() bool`

HasBlock returns a boolean if a field has been set.

### GetEntrance

`func (o *OrderDeliveryAddressDTO) GetEntrance() string`

GetEntrance returns the Entrance field if non-nil, zero value otherwise.

### GetEntranceOk

`func (o *OrderDeliveryAddressDTO) GetEntranceOk() (*string, bool)`

GetEntranceOk returns a tuple with the Entrance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntrance

`func (o *OrderDeliveryAddressDTO) SetEntrance(v string)`

SetEntrance sets Entrance field to given value.

### HasEntrance

`func (o *OrderDeliveryAddressDTO) HasEntrance() bool`

HasEntrance returns a boolean if a field has been set.

### GetEntryphone

`func (o *OrderDeliveryAddressDTO) GetEntryphone() string`

GetEntryphone returns the Entryphone field if non-nil, zero value otherwise.

### GetEntryphoneOk

`func (o *OrderDeliveryAddressDTO) GetEntryphoneOk() (*string, bool)`

GetEntryphoneOk returns a tuple with the Entryphone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntryphone

`func (o *OrderDeliveryAddressDTO) SetEntryphone(v string)`

SetEntryphone sets Entryphone field to given value.

### HasEntryphone

`func (o *OrderDeliveryAddressDTO) HasEntryphone() bool`

HasEntryphone returns a boolean if a field has been set.

### GetFloor

`func (o *OrderDeliveryAddressDTO) GetFloor() string`

GetFloor returns the Floor field if non-nil, zero value otherwise.

### GetFloorOk

`func (o *OrderDeliveryAddressDTO) GetFloorOk() (*string, bool)`

GetFloorOk returns a tuple with the Floor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFloor

`func (o *OrderDeliveryAddressDTO) SetFloor(v string)`

SetFloor sets Floor field to given value.

### HasFloor

`func (o *OrderDeliveryAddressDTO) HasFloor() bool`

HasFloor returns a boolean if a field has been set.

### GetApartment

`func (o *OrderDeliveryAddressDTO) GetApartment() string`

GetApartment returns the Apartment field if non-nil, zero value otherwise.

### GetApartmentOk

`func (o *OrderDeliveryAddressDTO) GetApartmentOk() (*string, bool)`

GetApartmentOk returns a tuple with the Apartment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApartment

`func (o *OrderDeliveryAddressDTO) SetApartment(v string)`

SetApartment sets Apartment field to given value.

### HasApartment

`func (o *OrderDeliveryAddressDTO) HasApartment() bool`

HasApartment returns a boolean if a field has been set.

### GetPhone

`func (o *OrderDeliveryAddressDTO) GetPhone() string`

GetPhone returns the Phone field if non-nil, zero value otherwise.

### GetPhoneOk

`func (o *OrderDeliveryAddressDTO) GetPhoneOk() (*string, bool)`

GetPhoneOk returns a tuple with the Phone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhone

`func (o *OrderDeliveryAddressDTO) SetPhone(v string)`

SetPhone sets Phone field to given value.

### HasPhone

`func (o *OrderDeliveryAddressDTO) HasPhone() bool`

HasPhone returns a boolean if a field has been set.

### GetRecipient

`func (o *OrderDeliveryAddressDTO) GetRecipient() string`

GetRecipient returns the Recipient field if non-nil, zero value otherwise.

### GetRecipientOk

`func (o *OrderDeliveryAddressDTO) GetRecipientOk() (*string, bool)`

GetRecipientOk returns a tuple with the Recipient field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecipient

`func (o *OrderDeliveryAddressDTO) SetRecipient(v string)`

SetRecipient sets Recipient field to given value.

### HasRecipient

`func (o *OrderDeliveryAddressDTO) HasRecipient() bool`

HasRecipient returns a boolean if a field has been set.

### GetGps

`func (o *OrderDeliveryAddressDTO) GetGps() GpsDTO`

GetGps returns the Gps field if non-nil, zero value otherwise.

### GetGpsOk

`func (o *OrderDeliveryAddressDTO) GetGpsOk() (*GpsDTO, bool)`

GetGpsOk returns a tuple with the Gps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGps

`func (o *OrderDeliveryAddressDTO) SetGps(v GpsDTO)`

SetGps sets Gps field to given value.

### HasGps

`func (o *OrderDeliveryAddressDTO) HasGps() bool`

HasGps returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


