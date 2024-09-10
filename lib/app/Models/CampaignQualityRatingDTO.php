<?php
/**
 * CampaignQualityRatingDTO
 */
namespace app\Models;

/**
 * CampaignQualityRatingDTO
 * @description Информация об индексе качества магазина.
 */
class CampaignQualityRatingDTO {

    /** @var int $campaignId Идентификатор магазина.*/
    public $campaignId = 0;

    /** @var \app\Models\QualityRatingDTO[] $ratings Список значений индекса качества.*/
    public $ratings = [];

}
