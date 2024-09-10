<?php
/**
 * CampaignSettingsLocalRegionDTO
 */
namespace app\Models;

/**
 * CampaignSettingsLocalRegionDTO
 * @description Информация о своем регионе магазина.
 */
class CampaignSettingsLocalRegionDTO {

    /** @var int $id Идентификатор региона.*/
    public $id = 0;

    /** @var string $name Название региона.*/
    public $name = "";

    /** @var string $type */
    public $type = "";

    /** @var string $deliveryOptionsSource */
    public $deliveryOptionsSource = "";

    /** @var \app\Models\CampaignSettingsDeliveryDTO $delivery */
    public $delivery;

}
