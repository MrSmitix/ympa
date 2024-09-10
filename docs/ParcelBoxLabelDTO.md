# ParcelBoxLabelDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Url** | **string** | Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).  | 
**SupplierName** | **string** | Юридическое название магазина. | 
**DeliveryServiceName** | **string** | Юридическое название службы доставки. | 
**OrderId** | **int64** | Идентификатор заказа в системе Маркета. | 
**OrderNum** | **string** | Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина.  | 
**RecipientName** | **string** | Фамилия и инициалы получателя заказа. | 
**BoxId** | **int64** | Идентификатор коробки. | 
**FulfilmentId** | **string** | Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д.  | 
**Place** | **string** | Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;.  | 
**Weight** | **string** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;.  | 
**DeliveryServiceId** | **string** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). | 
**DeliveryAddress** | Pointer to **string** | Адрес получателя. | [optional] 
**ShipmentDate** | Pointer to **string** | Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;. | [optional] 

## Methods

### NewParcelBoxLabelDTO

`func NewParcelBoxLabelDTO(url string, supplierName string, deliveryServiceName string, orderId int64, orderNum string, recipientName string, boxId int64, fulfilmentId string, place string, weight string, deliveryServiceId string, ) *ParcelBoxLabelDTO`

NewParcelBoxLabelDTO instantiates a new ParcelBoxLabelDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewParcelBoxLabelDTOWithDefaults

`func NewParcelBoxLabelDTOWithDefaults() *ParcelBoxLabelDTO`

NewParcelBoxLabelDTOWithDefaults instantiates a new ParcelBoxLabelDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUrl

`func (o *ParcelBoxLabelDTO) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *ParcelBoxLabelDTO) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *ParcelBoxLabelDTO) SetUrl(v string)`

SetUrl sets Url field to given value.


### GetSupplierName

`func (o *ParcelBoxLabelDTO) GetSupplierName() string`

GetSupplierName returns the SupplierName field if non-nil, zero value otherwise.

### GetSupplierNameOk

`func (o *ParcelBoxLabelDTO) GetSupplierNameOk() (*string, bool)`

GetSupplierNameOk returns a tuple with the SupplierName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSupplierName

`func (o *ParcelBoxLabelDTO) SetSupplierName(v string)`

SetSupplierName sets SupplierName field to given value.


### GetDeliveryServiceName

`func (o *ParcelBoxLabelDTO) GetDeliveryServiceName() string`

GetDeliveryServiceName returns the DeliveryServiceName field if non-nil, zero value otherwise.

### GetDeliveryServiceNameOk

`func (o *ParcelBoxLabelDTO) GetDeliveryServiceNameOk() (*string, bool)`

GetDeliveryServiceNameOk returns a tuple with the DeliveryServiceName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryServiceName

`func (o *ParcelBoxLabelDTO) SetDeliveryServiceName(v string)`

SetDeliveryServiceName sets DeliveryServiceName field to given value.


### GetOrderId

`func (o *ParcelBoxLabelDTO) GetOrderId() int64`

GetOrderId returns the OrderId field if non-nil, zero value otherwise.

### GetOrderIdOk

`func (o *ParcelBoxLabelDTO) GetOrderIdOk() (*int64, bool)`

GetOrderIdOk returns a tuple with the OrderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderId

`func (o *ParcelBoxLabelDTO) SetOrderId(v int64)`

SetOrderId sets OrderId field to given value.


### GetOrderNum

`func (o *ParcelBoxLabelDTO) GetOrderNum() string`

GetOrderNum returns the OrderNum field if non-nil, zero value otherwise.

### GetOrderNumOk

`func (o *ParcelBoxLabelDTO) GetOrderNumOk() (*string, bool)`

GetOrderNumOk returns a tuple with the OrderNum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderNum

`func (o *ParcelBoxLabelDTO) SetOrderNum(v string)`

SetOrderNum sets OrderNum field to given value.


### GetRecipientName

`func (o *ParcelBoxLabelDTO) GetRecipientName() string`

GetRecipientName returns the RecipientName field if non-nil, zero value otherwise.

### GetRecipientNameOk

`func (o *ParcelBoxLabelDTO) GetRecipientNameOk() (*string, bool)`

GetRecipientNameOk returns a tuple with the RecipientName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecipientName

`func (o *ParcelBoxLabelDTO) SetRecipientName(v string)`

SetRecipientName sets RecipientName field to given value.


### GetBoxId

`func (o *ParcelBoxLabelDTO) GetBoxId() int64`

GetBoxId returns the BoxId field if non-nil, zero value otherwise.

### GetBoxIdOk

`func (o *ParcelBoxLabelDTO) GetBoxIdOk() (*int64, bool)`

GetBoxIdOk returns a tuple with the BoxId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoxId

`func (o *ParcelBoxLabelDTO) SetBoxId(v int64)`

SetBoxId sets BoxId field to given value.


### GetFulfilmentId

`func (o *ParcelBoxLabelDTO) GetFulfilmentId() string`

GetFulfilmentId returns the FulfilmentId field if non-nil, zero value otherwise.

### GetFulfilmentIdOk

`func (o *ParcelBoxLabelDTO) GetFulfilmentIdOk() (*string, bool)`

GetFulfilmentIdOk returns a tuple with the FulfilmentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFulfilmentId

`func (o *ParcelBoxLabelDTO) SetFulfilmentId(v string)`

SetFulfilmentId sets FulfilmentId field to given value.


### GetPlace

`func (o *ParcelBoxLabelDTO) GetPlace() string`

GetPlace returns the Place field if non-nil, zero value otherwise.

### GetPlaceOk

`func (o *ParcelBoxLabelDTO) GetPlaceOk() (*string, bool)`

GetPlaceOk returns a tuple with the Place field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlace

`func (o *ParcelBoxLabelDTO) SetPlace(v string)`

SetPlace sets Place field to given value.


### GetWeight

`func (o *ParcelBoxLabelDTO) GetWeight() string`

GetWeight returns the Weight field if non-nil, zero value otherwise.

### GetWeightOk

`func (o *ParcelBoxLabelDTO) GetWeightOk() (*string, bool)`

GetWeightOk returns a tuple with the Weight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeight

`func (o *ParcelBoxLabelDTO) SetWeight(v string)`

SetWeight sets Weight field to given value.


### GetDeliveryServiceId

`func (o *ParcelBoxLabelDTO) GetDeliveryServiceId() string`

GetDeliveryServiceId returns the DeliveryServiceId field if non-nil, zero value otherwise.

### GetDeliveryServiceIdOk

`func (o *ParcelBoxLabelDTO) GetDeliveryServiceIdOk() (*string, bool)`

GetDeliveryServiceIdOk returns a tuple with the DeliveryServiceId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryServiceId

`func (o *ParcelBoxLabelDTO) SetDeliveryServiceId(v string)`

SetDeliveryServiceId sets DeliveryServiceId field to given value.


### GetDeliveryAddress

`func (o *ParcelBoxLabelDTO) GetDeliveryAddress() string`

GetDeliveryAddress returns the DeliveryAddress field if non-nil, zero value otherwise.

### GetDeliveryAddressOk

`func (o *ParcelBoxLabelDTO) GetDeliveryAddressOk() (*string, bool)`

GetDeliveryAddressOk returns a tuple with the DeliveryAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryAddress

`func (o *ParcelBoxLabelDTO) SetDeliveryAddress(v string)`

SetDeliveryAddress sets DeliveryAddress field to given value.

### HasDeliveryAddress

`func (o *ParcelBoxLabelDTO) HasDeliveryAddress() bool`

HasDeliveryAddress returns a boolean if a field has been set.

### GetShipmentDate

`func (o *ParcelBoxLabelDTO) GetShipmentDate() string`

GetShipmentDate returns the ShipmentDate field if non-nil, zero value otherwise.

### GetShipmentDateOk

`func (o *ParcelBoxLabelDTO) GetShipmentDateOk() (*string, bool)`

GetShipmentDateOk returns a tuple with the ShipmentDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShipmentDate

`func (o *ParcelBoxLabelDTO) SetShipmentDate(v string)`

SetShipmentDate sets ShipmentDate field to given value.

### HasShipmentDate

`func (o *ParcelBoxLabelDTO) HasShipmentDate() bool`

HasShipmentDate returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


