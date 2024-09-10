<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Описание пункта вывоза для возврата.
 */
class LogisticPickupPointDTO
{
    /**
     * Идентификатор пункта вывоза.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * Название пункта вывоза.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="address", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PickupAddressDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PickupAddressDTO::class})
     * @var \App\DTO\PickupAddressDTO|null
     */
    public $address;

    /**
     * Дополнительные инструкции к вывозу.
     * @DTA\Data(field="instruction", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $instruction;

    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LogisticPointType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LogisticPointType::class})
     * @var \App\DTO\LogisticPointType|null
     */
    public $type;

    /**
     * Идентификатор логистического партнера, к которому относится логистическая точка.
     * @DTA\Data(field="logisticPartnerId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $logistic_partner_id;

}
