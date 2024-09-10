<?php
/**
 * CampaignsQualityRatingDTO
 */
namespace app\Models;

/**
 * CampaignsQualityRatingDTO
 * @description Информация об индексе качества магазинов.
 */
class CampaignsQualityRatingDTO {

    /** @var \app\Models\CampaignQualityRatingDTO[] $campaignRatings Список магазинов c информацией об их индексе качества.*/
    public $campaignRatings = [];

}
