<?php
/**
 * OrderStatusChangeDeliveryDatesDTO
 */
namespace app\Models;

/**
 * OrderStatusChangeDeliveryDatesDTO
 * @description Диапазон дат доставки.
 */
class OrderStatusChangeDeliveryDatesDTO {

    /** @var \DateTime $realDeliveryDate **Только для модели DBS**  Фактическая дата доставки. &lt;br&gt;&lt;br&gt; Когда передавать параметр &#x60;realDeliveryDate&#x60;:  * Не передавайте параметр, если:   * переводите заказ в любой статус, кроме &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60;;   * меняете статус заказа на &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60; в день доставки — будет указана дата выполнения запроса. * Передавайте дату доставки, если переводите заказ в статус &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60; не в день доставки. Нельзя указывать дату доставки в будущем.    {% note warning \&quot;Индекс качества\&quot; %}    Передача статуса после установленного срока снижает индекс качества. О сроках читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/tech#dbs).    {% endnote %}     */
    public $realDeliveryDate;

}
