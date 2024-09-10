# OrderDigitalItemDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int64** | Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  | 
**Code** | **string** | Сам ключ. | 
**Slip** | **string** | Инструкция по активации. | 
**ActivateTill** | **string** | Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | 

## Methods

### NewOrderDigitalItemDTO

`func NewOrderDigitalItemDTO(id int64, code string, slip string, activateTill string, ) *OrderDigitalItemDTO`

NewOrderDigitalItemDTO instantiates a new OrderDigitalItemDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderDigitalItemDTOWithDefaults

`func NewOrderDigitalItemDTOWithDefaults() *OrderDigitalItemDTO`

NewOrderDigitalItemDTOWithDefaults instantiates a new OrderDigitalItemDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *OrderDigitalItemDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OrderDigitalItemDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OrderDigitalItemDTO) SetId(v int64)`

SetId sets Id field to given value.


### GetCode

`func (o *OrderDigitalItemDTO) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *OrderDigitalItemDTO) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *OrderDigitalItemDTO) SetCode(v string)`

SetCode sets Code field to given value.


### GetSlip

`func (o *OrderDigitalItemDTO) GetSlip() string`

GetSlip returns the Slip field if non-nil, zero value otherwise.

### GetSlipOk

`func (o *OrderDigitalItemDTO) GetSlipOk() (*string, bool)`

GetSlipOk returns a tuple with the Slip field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSlip

`func (o *OrderDigitalItemDTO) SetSlip(v string)`

SetSlip sets Slip field to given value.


### GetActivateTill

`func (o *OrderDigitalItemDTO) GetActivateTill() string`

GetActivateTill returns the ActivateTill field if non-nil, zero value otherwise.

### GetActivateTillOk

`func (o *OrderDigitalItemDTO) GetActivateTillOk() (*string, bool)`

GetActivateTillOk returns a tuple with the ActivateTill field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivateTill

`func (o *OrderDigitalItemDTO) SetActivateTill(v string)`

SetActivateTill sets ActivateTill field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


