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
     * @var \App\DTO\OfferContentErrorType|null
     */
    public $type;

    /**
     * Идентификатор характеристики, с которой связана ошибка.
     * @DTA\Data(field="parameterId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $parameter_id;

    /**
     * Текст ошибки.
     * @DTA\Data(field="message")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $message;

}
