# OrdersStatsOrderDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | Идентификатор заказа. | [optional] 
**CreationDate** | Pointer to **string** | Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**StatusUpdateDate** | Pointer to **time.Time** | Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва).  | [optional] 
**Status** | Pointer to [**OrderStatsStatusType**](OrderStatsStatusType.md) |  | [optional] 
**PartnerOrderId** | Pointer to **string** | Идентификатор заказа в информационной системе магазина. | [optional] 
**PaymentType** | Pointer to [**OrdersStatsOrderPaymentType**](OrdersStatsOrderPaymentType.md) |  | [optional] 
**Fake** | Pointer to **bool** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] 
**DeliveryRegion** | Pointer to [**OrdersStatsDeliveryRegionDTO**](OrdersStatsDeliveryRegionDTO.md) |  | [optional] 
**Items** | [**[]OrdersStatsItemDTO**](OrdersStatsItemDTO.md) | Список товаров в заказе после возможных изменений. | 
**InitialItems** | Pointer to [**[]OrdersStatsItemDTO**](OrdersStatsItemDTO.md) | Список товаров в заказе до изменений. | [optional] 
**Payments** | [**[]OrdersStatsPaymentDTO**](OrdersStatsPaymentDTO.md) | Информация о денежных переводах по заказу. | 
**Commissions** | [**[]OrdersStatsCommissionDTO**](OrdersStatsCommissionDTO.md) | Информация о комиссиях за заказ. | 

## Methods

### NewOrdersStatsOrderDTO

`func NewOrdersStatsOrderDTO(items []OrdersStatsItemDTO, payments []OrdersStatsPaymentDTO, commissions []OrdersStatsCommissionDTO, ) *OrdersStatsOrderDTO`

NewOrdersStatsOrderDTO instantiates a new OrdersStatsOrderDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrdersStatsOrderDTOWithDefaults

`func NewOrdersStatsOrderDTOWithDefaults() *OrdersStatsOrderDTO`

NewOrdersStatsOrderDTOWithDefaults instantiates a new OrdersStatsOrderDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *OrdersStatsOrderDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OrdersStatsOrderDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OrdersStatsOrderDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *OrdersStatsOrderDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetCreationDate

`func (o *OrdersStatsOrderDTO) GetCreationDate() string`

GetCreationDate returns the CreationDate field if non-nil, zero value otherwise.

### GetCreationDateOk

`func (o *OrdersStatsOrderDTO) GetCreationDateOk() (*string, bool)`

GetCreationDateOk returns a tuple with the CreationDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreationDate

`func (o *OrdersStatsOrderDTO) SetCreationDate(v string)`

SetCreationDate sets CreationDate field to given value.

### HasCreationDate

`func (o *OrdersStatsOrderDTO) HasCreationDate() bool`

HasCreationDate returns a boolean if a field has been set.

### GetStatusUpdateDate

`func (o *OrdersStatsOrderDTO) GetStatusUpdateDate() time.Time`

GetStatusUpdateDate returns the StatusUpdateDate field if non-nil, zero value otherwise.

### GetStatusUpdateDateOk

`func (o *OrdersStatsOrderDTO) GetStatusUpdateDateOk() (*time.Time, bool)`

GetStatusUpdateDateOk returns a tuple with the StatusUpdateDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusUpdateDate

`func (o *OrdersStatsOrderDTO) SetStatusUpdateDate(v time.Time)`

SetStatusUpdateDate sets StatusUpdateDate field to given value.

### HasStatusUpdateDate

`func (o *OrdersStatsOrderDTO) HasStatusUpdateDate() bool`

HasStatusUpdateDate returns a boolean if a field has been set.

### GetStatus

`func (o *OrdersStatsOrderDTO) GetStatus() OrderStatsStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *OrdersStatsOrderDTO) GetStatusOk() (*OrderStatsStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *OrdersStatsOrderDTO) SetStatus(v OrderStatsStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *OrdersStatsOrderDTO) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetPartnerOrderId

`func (o *OrdersStatsOrderDTO) GetPartnerOrderId() string`

GetPartnerOrderId returns the PartnerOrderId field if non-nil, zero value otherwise.

### GetPartnerOrderIdOk

`func (o *OrdersStatsOrderDTO) GetPartnerOrderIdOk() (*string, bool)`

GetPartnerOrderIdOk returns a tuple with the PartnerOrderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerOrderId

`func (o *OrdersStatsOrderDTO) SetPartnerOrderId(v string)`

SetPartnerOrderId sets PartnerOrderId field to given value.

### HasPartnerOrderId

`func (o *OrdersStatsOrderDTO) HasPartnerOrderId() bool`

HasPartnerOrderId returns a boolean if a field has been set.

### GetPaymentType

`func (o *OrdersStatsOrderDTO) GetPaymentType() OrdersStatsOrderPaymentType`

GetPaymentType returns the PaymentType field if non-nil, zero value otherwise.

### GetPaymentTypeOk

`func (o *OrdersStatsOrderDTO) GetPaymentTypeOk() (*OrdersStatsOrderPaymentType, bool)`

GetPaymentTypeOk returns a tuple with the PaymentType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentType

`func (o *OrdersStatsOrderDTO) SetPaymentType(v OrdersStatsOrderPaymentType)`

SetPaymentType sets PaymentType field to given value.

### HasPaymentType

`func (o *OrdersStatsOrderDTO) HasPaymentType() bool`

HasPaymentType returns a boolean if a field has been set.

### GetFake

`func (o *OrdersStatsOrderDTO) GetFake() bool`

GetFake returns the Fake field if non-nil, zero value otherwise.

### GetFakeOk

`func (o *OrdersStatsOrderDTO) GetFakeOk() (*bool, bool)`

GetFakeOk returns a tuple with the Fake field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFake

`func (o *OrdersStatsOrderDTO) SetFake(v bool)`

SetFake sets Fake field to given value.

### HasFake

`func (o *OrdersStatsOrderDTO) HasFake() bool`

HasFake returns a boolean if a field has been set.

### GetDeliveryRegion

`func (o *OrdersStatsOrderDTO) GetDeliveryRegion() OrdersStatsDeliveryRegionDTO`

GetDeliveryRegion returns the DeliveryRegion field if non-nil, zero value otherwise.

### GetDeliveryRegionOk

`func (o *OrdersStatsOrderDTO) GetDeliveryRegionOk() (*OrdersStatsDeliveryRegionDTO, bool)`

GetDeliveryRegionOk returns a tuple with the DeliveryRegion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryRegion

`func (o *OrdersStatsOrderDTO) SetDeliveryRegion(v OrdersStatsDeliveryRegionDTO)`

SetDeliveryRegion sets DeliveryRegion field to given value.

### HasDeliveryRegion

`func (o *OrdersStatsOrderDTO) HasDeliveryRegion() bool`

HasDeliveryRegion returns a boolean if a field has been set.

### GetItems

`func (o *OrdersStatsOrderDTO) GetItems() []OrdersStatsItemDTO`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *OrdersStatsOrderDTO) GetItemsOk() (*[]OrdersStatsItemDTO, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *OrdersStatsOrderDTO) SetItems(v []OrdersStatsItemDTO)`

SetItems sets Items field to given value.


### GetInitialItems

`func (o *OrdersStatsOrderDTO) GetInitialItems() []OrdersStatsItemDTO`

GetInitialItems returns the InitialItems field if non-nil, zero value otherwise.

### GetInitialItemsOk

`func (o *OrdersStatsOrderDTO) GetInitialItemsOk() (*[]OrdersStatsItemDTO, bool)`

GetInitialItemsOk returns a tuple with the InitialItems field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInitialItems

`func (o *OrdersStatsOrderDTO) SetInitialItems(v []OrdersStatsItemDTO)`

SetInitialItems sets InitialItems field to given value.

### HasInitialItems

`func (o *OrdersStatsOrderDTO) HasInitialItems() bool`

HasInitialItems returns a boolean if a field has been set.

### SetInitialItemsNil

`func (o *OrdersStatsOrderDTO) SetInitialItemsNil(b bool)`

 SetInitialItemsNil sets the value for InitialItems to be an explicit nil

### UnsetInitialItems
`func (o *OrdersStatsOrderDTO) UnsetInitialItems()`

UnsetInitialItems ensures that no value is present for InitialItems, not even an explicit nil
### GetPayments

`func (o *OrdersStatsOrderDTO) GetPayments() []OrdersStatsPaymentDTO`

GetPayments returns the Payments field if non-nil, zero value otherwise.

### GetPaymentsOk

`func (o *OrdersStatsOrderDTO) GetPaymentsOk() (*[]OrdersStatsPaymentDTO, bool)`

GetPaymentsOk returns a tuple with the Payments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayments

`func (o *OrdersStatsOrderDTO) SetPayments(v []OrdersStatsPaymentDTO)`

SetPayments sets Payments field to given value.


### GetCommissions

`func (o *OrdersStatsOrderDTO) GetCommissions() []OrdersStatsCommissionDTO`

GetCommissions returns the Commissions field if non-nil, zero value otherwise.

### GetCommissionsOk

`func (o *OrdersStatsOrderDTO) GetCommissionsOk() (*[]OrdersStatsCommissionDTO, bool)`

GetCommissionsOk returns a tuple with the Commissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCommissions

`func (o *OrdersStatsOrderDTO) SetCommissions(v []OrdersStatsCommissionDTO)`

SetCommissions sets Commissions field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


