<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Результат удаления товаров.
 */
class DeleteCampaignOffersResponse
{
    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ApiResponseStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ApiResponseStatusType::class})
     * @var \App\DTO\ApiResponseStatusType|null
     */
    public $status;

    /**
     * @DTA\Data(field="result", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DeleteCampaignOffersDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DeleteCampaignOffersDTO::class})
     * @var \App\DTO\DeleteCampaignOffersDTO|null
     */
    public $result;

}
