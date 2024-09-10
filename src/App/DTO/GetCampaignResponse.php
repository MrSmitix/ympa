<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о магазине к данным идентификатора кампании.
 */
class GetCampaignResponse
{
    /**
     * @DTA\Data(field="campaign", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignDTO::class})
     */
    public ?\App\DTO\CampaignDTO $campaign = null;

}
