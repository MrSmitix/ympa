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
     */
    public ?int $id = null;

    /**
     * Название пункта вывоза.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="address", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PickupAddressDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PickupAddressDTO::class})
     */
    public ?\App\DTO\PickupAddressDTO $address = null;

    /**
     * Дополнительные инструкции к вывозу.
     * @DTA\Data(field="instruction", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $instruction = null;

    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LogisticPointType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LogisticPointType::class})
     */
    public ?\App\DTO\LogisticPointType $type = null;

    /**
     * Идентификатор логистического партнера, к которому относится логистическая точка.
     * @DTA\Data(field="logisticPartnerId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $logistic_partner_id = null;

}
