<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о покупателе и его номере телефона.
 */
class OrderBuyerInfoDTO
{
    /**
     * Идентификатор покупателя.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * Фамилия покупателя.
     * @DTA\Data(field="lastName", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $last_name;

    /**
     * Имя покупателя.
     * @DTA\Data(field="firstName", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $first_name;

    /**
     * Отчество покупателя.
     * @DTA\Data(field="middleName", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $middle_name;

    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderBuyerType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderBuyerType::class})
     * @var \App\DTO\OrderBuyerType|null
     */
    public $type;

    /**
     * Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: &#x60;+&lt;код_страны&gt;&lt;код_региона&gt;&lt;номер_телефона&gt;&#x60;.
     * @DTA\Data(field="phone", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $phone;

}
