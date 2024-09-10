# OutletDeliveryRuleDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MinDeliveryDays** | Pointer to **int32** | Минимальный срок доставки товаров в точку продаж. Указан в рабочих днях.  Минимальное значение: &#x60;0&#x60; — доставка в день заказа.  Максимальное значение: &#x60;60&#x60;.  Допустимые сроки доставки (разница между &#x60;minDeliveryDays&#x60; и &#x60;maxDeliveryDays&#x60;) зависят от региона.  Для доставки по своему региону разница не должна превышать двух дней. Например, если &#x60;minDeliveryDays&#x60; равно 1, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 1 до 3.  Для доставки в другие регионы:  * Если &#x60;minDeliveryDays&#x60; до 18 дней, разница не должна превышать четырех дней. Например, если &#x60;minDeliveryDays&#x60; равно 10, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 10 до 14. * Если &#x60;minDeliveryDays&#x60; больше 18 дней, разница должна быть не больше чем в два раза. Например, если &#x60;minDeliveryDays&#x60; равно 21, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 21 до 42.  Обязательный параметр, если &#x60;type&#x3D;\&quot;DEPOT\&quot;&#x60; или &#x60;type&#x3D;\&quot;MIXED\&quot;&#x60;.  Взаимоисключающий с параметром &#x60;unspecifiedDeliveryInterval&#x60;.  | [optional] 
**MaxDeliveryDays** | Pointer to **int32** | Максимальный срок доставки товаров в точку продаж. Указан в рабочих днях.  Минимальное значение: &#x60;0&#x60; — доставка в день заказа.  Максимальное значение: &#x60;60&#x60;.  Допустимые сроки доставки (разница между &#x60;minDeliveryDays&#x60; и &#x60;maxDeliveryDays&#x60;) зависят от региона.  Для доставки по своему региону разница не должна превышать двух дней. Например, если &#x60;minDeliveryDays&#x60; равно 1, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 1 до 3.  Для доставки в другие регионы:  * Если &#x60;minDeliveryDays&#x60; до 18 дней, разница не должна превышать четырех дней. Например, если &#x60;minDeliveryDays&#x60; равно 10, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 10 до 14. * Если &#x60;minDeliveryDays&#x60; больше 18 дней, разница должна быть не больше чем в два раза. Например, если &#x60;minDeliveryDays&#x60; равно 21, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 21 до 42.  Обязательный параметр, если &#x60;type&#x3D;\&quot;DEPOT\&quot;&#x60; или &#x60;type&#x3D;\&quot;MIXED\&quot;&#x60;.  Взаимоисключающий с параметром &#x60;unspecifiedDeliveryInterval&#x60;.  | [optional] 
**DeliveryServiceId** | Pointer to **int64** | Идентификатор службы доставки товаров в точку продаж.  Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).  | [optional] 
**OrderBefore** | Pointer to **int32** | Час, до которого покупателю нужно сделать заказ, чтобы он был доставлен в точку продаж в сроки от &#x60;minDeliveryDays&#x60; до &#x60;maxDeliveryDays&#x60;.  Если покупатель оформит заказ после указанного часа, он будет доставлен в сроки от &#x60;minDeliveryDays&#x60; + 1 рабочий день до &#x60;maxDeliveryDays&#x60; + 1 рабочий день.  Значение по умолчанию: &#x60;24&#x60;.  | [optional] 
**PriceFreePickup** | Pointer to **float32** | Цена на товар, начиная с которой действует бесплатный самовывоз товара из точки продаж. | [optional] 
**UnspecifiedDeliveryInterval** | Pointer to **bool** | Признак доставки товаров в точку продаж на заказ.  Признак выставлен, если:  * точный срок доставки в точку продаж заранее неизвестен (например, если магазин собирает несколько заказов для отправки в точку или населенный пункт); * все товары изготавливаются или поставляются на заказ.  Возможные значения: * &#x60;true&#x60; — товары доставляются в точку продаж на заказ.  Параметр указывается только со значением &#x60;true&#x60;.  Взаимоисключающий с параметрами &#x60;minDeliveryDays&#x60; и &#x60;maxDeliveryDays&#x60;.  | [optional] 

## Methods

### NewOutletDeliveryRuleDTO

`func NewOutletDeliveryRuleDTO() *OutletDeliveryRuleDTO`

NewOutletDeliveryRuleDTO instantiates a new OutletDeliveryRuleDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOutletDeliveryRuleDTOWithDefaults

`func NewOutletDeliveryRuleDTOWithDefaults() *OutletDeliveryRuleDTO`

NewOutletDeliveryRuleDTOWithDefaults instantiates a new OutletDeliveryRuleDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMinDeliveryDays

`func (o *OutletDeliveryRuleDTO) GetMinDeliveryDays() int32`

GetMinDeliveryDays returns the MinDeliveryDays field if non-nil, zero value otherwise.

### GetMinDeliveryDaysOk

`func (o *OutletDeliveryRuleDTO) GetMinDeliveryDaysOk() (*int32, bool)`

GetMinDeliveryDaysOk returns a tuple with the MinDeliveryDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinDeliveryDays

`func (o *OutletDeliveryRuleDTO) SetMinDeliveryDays(v int32)`

SetMinDeliveryDays sets MinDeliveryDays field to given value.

### HasMinDeliveryDays

`func (o *OutletDeliveryRuleDTO) HasMinDeliveryDays() bool`

HasMinDeliveryDays returns a boolean if a field has been set.

### GetMaxDeliveryDays

`func (o *OutletDeliveryRuleDTO) GetMaxDeliveryDays() int32`

GetMaxDeliveryDays returns the MaxDeliveryDays field if non-nil, zero value otherwise.

### GetMaxDeliveryDaysOk

`func (o *OutletDeliveryRuleDTO) GetMaxDeliveryDaysOk() (*int32, bool)`

GetMaxDeliveryDaysOk returns a tuple with the MaxDeliveryDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxDeliveryDays

`func (o *OutletDeliveryRuleDTO) SetMaxDeliveryDays(v int32)`

SetMaxDeliveryDays sets MaxDeliveryDays field to given value.

### HasMaxDeliveryDays

`func (o *OutletDeliveryRuleDTO) HasMaxDeliveryDays() bool`

HasMaxDeliveryDays returns a boolean if a field has been set.

### GetDeliveryServiceId

`func (o *OutletDeliveryRuleDTO) GetDeliveryServiceId() int64`

GetDeliveryServiceId returns the DeliveryServiceId field if non-nil, zero value otherwise.

### GetDeliveryServiceIdOk

`func (o *OutletDeliveryRuleDTO) GetDeliveryServiceIdOk() (*int64, bool)`

GetDeliveryServiceIdOk returns a tuple with the DeliveryServiceId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryServiceId

`func (o *OutletDeliveryRuleDTO) SetDeliveryServiceId(v int64)`

SetDeliveryServiceId sets DeliveryServiceId field to given value.

### HasDeliveryServiceId

`func (o *OutletDeliveryRuleDTO) HasDeliveryServiceId() bool`

HasDeliveryServiceId returns a boolean if a field has been set.

### GetOrderBefore

`func (o *OutletDeliveryRuleDTO) GetOrderBefore() int32`

GetOrderBefore returns the OrderBefore field if non-nil, zero value otherwise.

### GetOrderBeforeOk

`func (o *OutletDeliveryRuleDTO) GetOrderBeforeOk() (*int32, bool)`

GetOrderBeforeOk returns a tuple with the OrderBefore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderBefore

`func (o *OutletDeliveryRuleDTO) SetOrderBefore(v int32)`

SetOrderBefore sets OrderBefore field to given value.

### HasOrderBefore

`func (o *OutletDeliveryRuleDTO) HasOrderBefore() bool`

HasOrderBefore returns a boolean if a field has been set.

### GetPriceFreePickup

`func (o *OutletDeliveryRuleDTO) GetPriceFreePickup() float32`

GetPriceFreePickup returns the PriceFreePickup field if non-nil, zero value otherwise.

### GetPriceFreePickupOk

`func (o *OutletDeliveryRuleDTO) GetPriceFreePickupOk() (*float32, bool)`

GetPriceFreePickupOk returns a tuple with the PriceFreePickup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriceFreePickup

`func (o *OutletDeliveryRuleDTO) SetPriceFreePickup(v float32)`

SetPriceFreePickup sets PriceFreePickup field to given value.

### HasPriceFreePickup

`func (o *OutletDeliveryRuleDTO) HasPriceFreePickup() bool`

HasPriceFreePickup returns a boolean if a field has been set.

### GetUnspecifiedDeliveryInterval

`func (o *OutletDeliveryRuleDTO) GetUnspecifiedDeliveryInterval() bool`

GetUnspecifiedDeliveryInterval returns the UnspecifiedDeliveryInterval field if non-nil, zero value otherwise.

### GetUnspecifiedDeliveryIntervalOk

`func (o *OutletDeliveryRuleDTO) GetUnspecifiedDeliveryIntervalOk() (*bool, bool)`

GetUnspecifiedDeliveryIntervalOk returns a tuple with the UnspecifiedDeliveryInterval field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnspecifiedDeliveryInterval

`func (o *OutletDeliveryRuleDTO) SetUnspecifiedDeliveryInterval(v bool)`

SetUnspecifiedDeliveryInterval sets UnspecifiedDeliveryInterval field to given value.

### HasUnspecifiedDeliveryInterval

`func (o *OutletDeliveryRuleDTO) HasUnspecifiedDeliveryInterval() bool`

HasUnspecifiedDeliveryInterval returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


