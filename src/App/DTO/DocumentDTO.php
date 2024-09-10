<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о документе.
 */
class DocumentDTO
{
    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderDocumentStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderDocumentStatusType::class})
     * @var \App\DTO\OrderDocumentStatusType|null
     */
    public $status;

    /**
     * Номер документа.
     * @DTA\Data(field="number", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $number;

    /**
     * Дата создания документа.
     * @DTA\Data(field="date", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $date;

}
