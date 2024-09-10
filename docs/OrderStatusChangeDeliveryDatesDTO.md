# OrderStatusChangeDeliveryDatesDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RealDeliveryDate** | Pointer to **string** | **Только для модели DBS**  Фактическая дата доставки. &lt;br&gt;&lt;br&gt; Когда передавать параметр &#x60;realDeliveryDate&#x60;:  * Не передавайте параметр, если:   * переводите заказ в любой статус, кроме &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60;;   * меняете статус заказа на &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60; в день доставки — будет указана дата выполнения запроса. * Передавайте дату доставки, если переводите заказ в статус &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60; не в день доставки. Нельзя указывать дату доставки в будущем.    {% note warning \&quot;Индекс качества\&quot; %}    Передача статуса после установленного срока снижает индекс качества. О сроках читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/tech#dbs).    {% endnote %}       | [optional] 

## Methods

### NewOrderStatusChangeDeliveryDatesDTO

`func NewOrderStatusChangeDeliveryDatesDTO() *OrderStatusChangeDeliveryDatesDTO`

NewOrderStatusChangeDeliveryDatesDTO instantiates a new OrderStatusChangeDeliveryDatesDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderStatusChangeDeliveryDatesDTOWithDefaults

`func NewOrderStatusChangeDeliveryDatesDTOWithDefaults() *OrderStatusChangeDeliveryDatesDTO`

NewOrderStatusChangeDeliveryDatesDTOWithDefaults instantiates a new OrderStatusChangeDeliveryDatesDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRealDeliveryDate

`func (o *OrderStatusChangeDeliveryDatesDTO) GetRealDeliveryDate() string`

GetRealDeliveryDate returns the RealDeliveryDate field if non-nil, zero value otherwise.

### GetRealDeliveryDateOk

`func (o *OrderStatusChangeDeliveryDatesDTO) GetRealDeliveryDateOk() (*string, bool)`

GetRealDeliveryDateOk returns a tuple with the RealDeliveryDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRealDeliveryDate

`func (o *OrderStatusChangeDeliveryDatesDTO) SetRealDeliveryDate(v string)`

SetRealDeliveryDate sets RealDeliveryDate field to given value.

### HasRealDeliveryDate

`func (o *OrderStatusChangeDeliveryDatesDTO) HasRealDeliveryDate() bool`

HasRealDeliveryDate returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


