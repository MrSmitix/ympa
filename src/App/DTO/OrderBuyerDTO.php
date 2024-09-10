<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о покупателе.  Параметры &#x60;id&#x60;, &#x60;lastName&#x60;, &#x60;firstName&#x60; и &#x60;middleName&#x60; возвращаются, только если вы работаете по модели DBS.
 */
class OrderBuyerDTO
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

}
