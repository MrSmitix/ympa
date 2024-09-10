<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Текст ошибки.
 */
class OfferContentErrorDTO
{
    /**
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OfferContentErrorType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OfferContentErrorType::class})
     */
    public ?\App\DTO\OfferContentErrorType $type = null;

    /**
     * Идентификатор характеристики, с которой связана ошибка.
     * @DTA\Data(field="parameterId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $parameter_id = null;

    /**
     * Текст ошибки.
     * @DTA\Data(field="message")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $message = null;

}
