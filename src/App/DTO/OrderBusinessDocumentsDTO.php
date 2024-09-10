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
     */
    public ?\App\DTO\DocumentDTO $upd = null;

    /**
     * @DTA\Data(field="ukd", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DocumentDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DocumentDTO::class})
     */
    public ?\App\DTO\DocumentDTO $ukd = null;

    /**
     * @DTA\Data(field="torgTwelve", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DocumentDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DocumentDTO::class})
     */
    public ?\App\DTO\DocumentDTO $torg_twelve = null;

    /**
     * @DTA\Data(field="sf", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DocumentDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DocumentDTO::class})
     */
    public ?\App\DTO\DocumentDTO $sf = null;

    /**
     * @DTA\Data(field="ksf", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DocumentDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DocumentDTO::class})
     */
    public ?\App\DTO\DocumentDTO $ksf = null;

}
