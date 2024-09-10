<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
 */
class OfferSellingProgramDTO
{
    /**
     * @DTA\Data(field="sellingProgram")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SellingProgramType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SellingProgramType::class})
     */
    public ?\App\DTO\SellingProgramType $selling_program = null;

    /**
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OfferSellingProgramStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OfferSellingProgramStatusType::class})
     */
    public ?\App\DTO\OfferSellingProgramStatusType $status = null;

}
