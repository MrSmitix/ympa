# OrderDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | Идентификатор заказа. | [optional] 
**Status** | Pointer to [**OrderStatusType**](OrderStatusType.md) |  | [optional] 
**Substatus** | Pointer to [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] 
**CreationDate** | Pointer to **string** |  | [optional] 
**UpdatedAt** | Pointer to **string** |  | [optional] 
**Currency** | Pointer to [**CurrencyType**](CurrencyType.md) |  | [optional] 
**ItemsTotal** | Pointer to **float32** | Платеж покупателя.  | [optional] 
**DeliveryTotal** | Pointer to **float32** | Стоимость доставки.  | [optional] 
**BuyerItemsTotal** | Pointer to **float32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  | [optional] 
**BuyerTotal** | Pointer to **float32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  | [optional] 
**BuyerItemsTotalBeforeDiscount** | Pointer to **float32** | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  | [optional] 
**BuyerTotalBeforeDiscount** | Pointer to **float32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки).  | [optional] 
**PaymentType** | Pointer to [**OrderPaymentType**](OrderPaymentType.md) |  | [optional] 
**PaymentMethod** | Pointer to [**OrderPaymentMethodType**](OrderPaymentMethodType.md) |  | [optional] 
**Fake** | Pointer to **bool** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] 
**Items** | [**[]OrderItemDTO**](OrderItemDTO.md) | Список товаров в заказе. | 
**Subsidies** | Pointer to [**[]OrderSubsidyDTO**](OrderSubsidyDTO.md) | Список субсидий по типам. | [optional] 
**Delivery** | Pointer to [**OrderDeliveryDTO**](OrderDeliveryDTO.md) |  | [optional] 
**Buyer** | Pointer to [**OrderBuyerDTO**](OrderBuyerDTO.md) |  | [optional] 
**Notes** | Pointer to **string** | Комментарий к заказу. | [optional] 
**TaxSystem** | Pointer to [**OrderTaxSystemType**](OrderTaxSystemType.md) |  | [optional] 
**CancelRequested** | Pointer to **bool** | **Только для модели DBS**  Запрошена ли отмена.  | [optional] 
**ExpiryDate** | Pointer to **string** |  | [optional] 

## Methods

### NewOrderDTO

`func NewOrderDTO(items []OrderItemDTO, ) *OrderDTO`

NewOrderDTO instantiates a new OrderDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderDTOWithDefaults

`func NewOrderDTOWithDefaults() *OrderDTO`

NewOrderDTOWithDefaults instantiates a new OrderDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *OrderDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OrderDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OrderDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *OrderDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetStatus

`func (o *OrderDTO) GetStatus() OrderStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *OrderDTO) GetStatusOk() (*OrderStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *OrderDTO) SetStatus(v OrderStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *OrderDTO) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetSubstatus

`func (o *OrderDTO) GetSubstatus() OrderSubstatusType`

GetSubstatus returns the Substatus field if non-nil, zero value otherwise.

### GetSubstatusOk

`func (o *OrderDTO) GetSubstatusOk() (*OrderSubstatusType, bool)`

GetSubstatusOk returns a tuple with the Substatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubstatus

`func (o *OrderDTO) SetSubstatus(v OrderSubstatusType)`

SetSubstatus sets Substatus field to given value.

### HasSubstatus

`func (o *OrderDTO) HasSubstatus() bool`

HasSubstatus returns a boolean if a field has been set.

### GetCreationDate

`func (o *OrderDTO) GetCreationDate() string`

GetCreationDate returns the CreationDate field if non-nil, zero value otherwise.

### GetCreationDateOk

`func (o *OrderDTO) GetCreationDateOk() (*string, bool)`

GetCreationDateOk returns a tuple with the CreationDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreationDate

`func (o *OrderDTO) SetCreationDate(v string)`

SetCreationDate sets CreationDate field to given value.

### HasCreationDate

`func (o *OrderDTO) HasCreationDate() bool`

HasCreationDate returns a boolean if a field has been set.

### GetUpdatedAt

`func (o *OrderDTO) GetUpdatedAt() string`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *OrderDTO) GetUpdatedAtOk() (*string, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *OrderDTO) SetUpdatedAt(v string)`

SetUpdatedAt sets UpdatedAt field to given value.

### HasUpdatedAt

`func (o *OrderDTO) HasUpdatedAt() bool`

HasUpdatedAt returns a boolean if a field has been set.

### GetCurrency

`func (o *OrderDTO) GetCurrency() CurrencyType`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *OrderDTO) GetCurrencyOk() (*CurrencyType, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *OrderDTO) SetCurrency(v CurrencyType)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *OrderDTO) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetItemsTotal

`func (o *OrderDTO) GetItemsTotal() float32`

GetItemsTotal returns the ItemsTotal field if non-nil, zero value otherwise.

### GetItemsTotalOk

`func (o *OrderDTO) GetItemsTotalOk() (*float32, bool)`

GetItemsTotalOk returns a tuple with the ItemsTotal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemsTotal

`func (o *OrderDTO) SetItemsTotal(v float32)`

SetItemsTotal sets ItemsTotal field to given value.

### HasItemsTotal

`func (o *OrderDTO) HasItemsTotal() bool`

HasItemsTotal returns a boolean if a field has been set.

### GetDeliveryTotal

`func (o *OrderDTO) GetDeliveryTotal() float32`

GetDeliveryTotal returns the DeliveryTotal field if non-nil, zero value otherwise.

### GetDeliveryTotalOk

`func (o *OrderDTO) GetDeliveryTotalOk() (*float32, bool)`

GetDeliveryTotalOk returns a tuple with the DeliveryTotal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryTotal

`func (o *OrderDTO) SetDeliveryTotal(v float32)`

SetDeliveryTotal sets DeliveryTotal field to given value.

### HasDeliveryTotal

`func (o *OrderDTO) HasDeliveryTotal() bool`

HasDeliveryTotal returns a boolean if a field has been set.

### GetBuyerItemsTotal

`func (o *OrderDTO) GetBuyerItemsTotal() float32`

GetBuyerItemsTotal returns the BuyerItemsTotal field if non-nil, zero value otherwise.

### GetBuyerItemsTotalOk

`func (o *OrderDTO) GetBuyerItemsTotalOk() (*float32, bool)`

GetBuyerItemsTotalOk returns a tuple with the BuyerItemsTotal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBuyerItemsTotal

`func (o *OrderDTO) SetBuyerItemsTotal(v float32)`

SetBuyerItemsTotal sets BuyerItemsTotal field to given value.

### HasBuyerItemsTotal

`func (o *OrderDTO) HasBuyerItemsTotal() bool`

HasBuyerItemsTotal returns a boolean if a field has been set.

### GetBuyerTotal

`func (o *OrderDTO) GetBuyerTotal() float32`

GetBuyerTotal returns the BuyerTotal field if non-nil, zero value otherwise.

### GetBuyerTotalOk

`func (o *OrderDTO) GetBuyerTotalOk() (*float32, bool)`

GetBuyerTotalOk returns a tuple with the BuyerTotal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBuyerTotal

`func (o *OrderDTO) SetBuyerTotal(v float32)`

SetBuyerTotal sets BuyerTotal field to given value.

### HasBuyerTotal

`func (o *OrderDTO) HasBuyerTotal() bool`

HasBuyerTotal returns a boolean if a field has been set.

### GetBuyerItemsTotalBeforeDiscount

`func (o *OrderDTO) GetBuyerItemsTotalBeforeDiscount() float32`

GetBuyerItemsTotalBeforeDiscount returns the BuyerItemsTotalBeforeDiscount field if non-nil, zero value otherwise.

### GetBuyerItemsTotalBeforeDiscountOk

`func (o *OrderDTO) GetBuyerItemsTotalBeforeDiscountOk() (*float32, bool)`

GetBuyerItemsTotalBeforeDiscountOk returns a tuple with the BuyerItemsTotalBeforeDiscount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBuyerItemsTotalBeforeDiscount

`func (o *OrderDTO) SetBuyerItemsTotalBeforeDiscount(v float32)`

SetBuyerItemsTotalBeforeDiscount sets BuyerItemsTotalBeforeDiscount field to given value.

### HasBuyerItemsTotalBeforeDiscount

`func (o *OrderDTO) HasBuyerItemsTotalBeforeDiscount() bool`

HasBuyerItemsTotalBeforeDiscount returns a boolean if a field has been set.

### GetBuyerTotalBeforeDiscount

`func (o *OrderDTO) GetBuyerTotalBeforeDiscount() float32`

GetBuyerTotalBeforeDiscount returns the BuyerTotalBeforeDiscount field if non-nil, zero value otherwise.

### GetBuyerTotalBeforeDiscountOk

`func (o *OrderDTO) GetBuyerTotalBeforeDiscountOk() (*float32, bool)`

GetBuyerTotalBeforeDiscountOk returns a tuple with the BuyerTotalBeforeDiscount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBuyerTotalBeforeDiscount

`func (o *OrderDTO) SetBuyerTotalBeforeDiscount(v float32)`

SetBuyerTotalBeforeDiscount sets BuyerTotalBeforeDiscount field to given value.

### HasBuyerTotalBeforeDiscount

`func (o *OrderDTO) HasBuyerTotalBeforeDiscount() bool`

HasBuyerTotalBeforeDiscount returns a boolean if a field has been set.

### GetPaymentType

`func (o *OrderDTO) GetPaymentType() OrderPaymentType`

GetPaymentType returns the PaymentType field if non-nil, zero value otherwise.

### GetPaymentTypeOk

`func (o *OrderDTO) GetPaymentTypeOk() (*OrderPaymentType, bool)`

GetPaymentTypeOk returns a tuple with the PaymentType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentType

`func (o *OrderDTO) SetPaymentType(v OrderPaymentType)`

SetPaymentType sets PaymentType field to given value.

### HasPaymentType

`func (o *OrderDTO) HasPaymentType() bool`

HasPaymentType returns a boolean if a field has been set.

### GetPaymentMethod

`func (o *OrderDTO) GetPaymentMethod() OrderPaymentMethodType`

GetPaymentMethod returns the PaymentMethod field if non-nil, zero value otherwise.

### GetPaymentMethodOk

`func (o *OrderDTO) GetPaymentMethodOk() (*OrderPaymentMethodType, bool)`

GetPaymentMethodOk returns a tuple with the PaymentMethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentMethod

`func (o *OrderDTO) SetPaymentMethod(v OrderPaymentMethodType)`

SetPaymentMethod sets PaymentMethod field to given value.

### HasPaymentMethod

`func (o *OrderDTO) HasPaymentMethod() bool`

HasPaymentMethod returns a boolean if a field has been set.

### GetFake

`func (o *OrderDTO) GetFake() bool`

GetFake returns the Fake field if non-nil, zero value otherwise.

### GetFakeOk

`func (o *OrderDTO) GetFakeOk() (*bool, bool)`

GetFakeOk returns a tuple with the Fake field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFake

`func (o *OrderDTO) SetFake(v bool)`

SetFake sets Fake field to given value.

### HasFake

`func (o *OrderDTO) HasFake() bool`

HasFake returns a boolean if a field has been set.

### GetItems

`func (o *OrderDTO) GetItems() []OrderItemDTO`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *OrderDTO) GetItemsOk() (*[]OrderItemDTO, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *OrderDTO) SetItems(v []OrderItemDTO)`

SetItems sets Items field to given value.


### GetSubsidies

`func (o *OrderDTO) GetSubsidies() []OrderSubsidyDTO`

GetSubsidies returns the Subsidies field if non-nil, zero value otherwise.

### GetSubsidiesOk

`func (o *OrderDTO) GetSubsidiesOk() (*[]OrderSubsidyDTO, bool)`

GetSubsidiesOk returns a tuple with the Subsidies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubsidies

`func (o *OrderDTO) SetSubsidies(v []OrderSubsidyDTO)`

SetSubsidies sets Subsidies field to given value.

### HasSubsidies

`func (o *OrderDTO) HasSubsidies() bool`

HasSubsidies returns a boolean if a field has been set.

### SetSubsidiesNil

`func (o *OrderDTO) SetSubsidiesNil(b bool)`

 SetSubsidiesNil sets the value for Subsidies to be an explicit nil

### UnsetSubsidies
`func (o *OrderDTO) UnsetSubsidies()`

UnsetSubsidies ensures that no value is present for Subsidies, not even an explicit nil
### GetDelivery

`func (o *OrderDTO) GetDelivery() OrderDeliveryDTO`

GetDelivery returns the Delivery field if non-nil, zero value otherwise.

### GetDeliveryOk

`func (o *OrderDTO) GetDeliveryOk() (*OrderDeliveryDTO, bool)`

GetDeliveryOk returns a tuple with the Delivery field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDelivery

`func (o *OrderDTO) SetDelivery(v OrderDeliveryDTO)`

SetDelivery sets Delivery field to given value.

### HasDelivery

`func (o *OrderDTO) HasDelivery() bool`

HasDelivery returns a boolean if a field has been set.

### GetBuyer

`func (o *OrderDTO) GetBuyer() OrderBuyerDTO`

GetBuyer returns the Buyer field if non-nil, zero value otherwise.

### GetBuyerOk

`func (o *OrderDTO) GetBuyerOk() (*OrderBuyerDTO, bool)`

GetBuyerOk returns a tuple with the Buyer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBuyer

`func (o *OrderDTO) SetBuyer(v OrderBuyerDTO)`

SetBuyer sets Buyer field to given value.

### HasBuyer

`func (o *OrderDTO) HasBuyer() bool`

HasBuyer returns a boolean if a field has been set.

### GetNotes

`func (o *OrderDTO) GetNotes() string`

GetNotes returns the Notes field if non-nil, zero value otherwise.

### GetNotesOk

`func (o *OrderDTO) GetNotesOk() (*string, bool)`

GetNotesOk returns a tuple with the Notes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotes

`func (o *OrderDTO) SetNotes(v string)`

SetNotes sets Notes field to given value.

### HasNotes

`func (o *OrderDTO) HasNotes() bool`

HasNotes returns a boolean if a field has been set.

### GetTaxSystem

`func (o *OrderDTO) GetTaxSystem() OrderTaxSystemType`

GetTaxSystem returns the TaxSystem field if non-nil, zero value otherwise.

### GetTaxSystemOk

`func (o *OrderDTO) GetTaxSystemOk() (*OrderTaxSystemType, bool)`

GetTaxSystemOk returns a tuple with the TaxSystem field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaxSystem

`func (o *OrderDTO) SetTaxSystem(v OrderTaxSystemType)`

SetTaxSystem sets TaxSystem field to given value.

### HasTaxSystem

`func (o *OrderDTO) HasTaxSystem() bool`

HasTaxSystem returns a boolean if a field has been set.

### GetCancelRequested

`func (o *OrderDTO) GetCancelRequested() bool`

GetCancelRequested returns the CancelRequested field if non-nil, zero value otherwise.

### GetCancelRequestedOk

`func (o *OrderDTO) GetCancelRequestedOk() (*bool, bool)`

GetCancelRequestedOk returns a tuple with the CancelRequested field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancelRequested

`func (o *OrderDTO) SetCancelRequested(v bool)`

SetCancelRequested sets CancelRequested field to given value.

### HasCancelRequested

`func (o *OrderDTO) HasCancelRequested() bool`

HasCancelRequested returns a boolean if a field has been set.

### GetExpiryDate

`func (o *OrderDTO) GetExpiryDate() string`

GetExpiryDate returns the ExpiryDate field if non-nil, zero value otherwise.

### GetExpiryDateOk

`func (o *OrderDTO) GetExpiryDateOk() (*string, bool)`

GetExpiryDateOk returns a tuple with the ExpiryDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiryDate

`func (o *OrderDTO) SetExpiryDate(v string)`

SetExpiryDate sets ExpiryDate field to given value.

### HasExpiryDate

`func (o *OrderDTO) HasExpiryDate() bool`

HasExpiryDate returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


