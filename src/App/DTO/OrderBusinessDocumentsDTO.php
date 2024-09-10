<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о документах.
 */
class OrderBusinessDocumentsDTO
{
    /**
     * @DTA\Data(field="upd", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DocumentDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DocumentDTO::class})
     * @var \App\DTO\DocumentDTO|null
     */
    public $upd;

    /**
     * @DTA\Data(field="ukd", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DocumentDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DocumentDTO::class})
     * @var \App\DTO\DocumentDTO|null
     */
    public $ukd;

    /**
     * @DTA\Data(field="torgTwelve", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DocumentDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DocumentDTO::class})
     * @var \App\DTO\DocumentDTO|null
     */
    public $torg_twelve;

    /**
     * @DTA\Data(field="sf", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DocumentDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DocumentDTO::class})
     * @var \App\DTO\DocumentDTO|null
     */
    public $sf;

    /**
     * @DTA\Data(field="ksf", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DocumentDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DocumentDTO::class})
     * @var \App\DTO\DocumentDTO|null
     */
    public $ksf;

}
