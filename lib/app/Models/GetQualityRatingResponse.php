<?php
/**
 * GetQualityRatingResponse
 */
namespace app\Models;

/**
 * GetQualityRatingResponse
 * @description Информация об индексе качества магазинов.
 */
class GetQualityRatingResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\CampaignsQualityRatingDTO $result */
    public $result;

}
