<?php
/**
 * OrderBuyerInfoDTO
 */
namespace app\Models;

/**
 * OrderBuyerInfoDTO
 * @description Информация о покупателе и его номере телефона.
 */
class OrderBuyerInfoDTO {

    /** @var string $id Идентификатор покупателя.*/
    public $id = "";

    /** @var string $lastName Фамилия покупателя.*/
    public $lastName = "";

    /** @var string $firstName Имя покупателя.*/
    public $firstName = "";

    /** @var string $middleName Отчество покупателя.*/
    public $middleName = "";

    /** @var string $type */
    public $type = "";

    /** @var string $phone Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: &#x60;+&lt;код_страны&gt;&lt;код_региона&gt;&lt;номер_телефона&gt;&#x60;.*/
    public $phone = "";

}
