<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о своем регионе магазина.
 */
class CampaignSettingsLocalRegionDTO
{
    /**
     * Идентификатор региона.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * Название региона.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionType::class})
     * @var \App\DTO\RegionType|null
     */
    public $type;

    /**
     * @DTA\Data(field="deliveryOptionsSource", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignSettingsScheduleSourceType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignSettingsScheduleSourceType::class})
     * @var \App\DTO\CampaignSettingsScheduleSourceType|null
     */
    public $delivery_options_source;

    /**
     * @DTA\Data(field="delivery", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignSettingsDeliveryDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignSettingsDeliveryDTO::class})
     * @var \App\DTO\CampaignSettingsDeliveryDTO|null
     */
    public $delivery;

}
