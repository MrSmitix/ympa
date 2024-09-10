<?php
/**
 * GetCampaignsResponse
 */
namespace app\Models;

/**
 * GetCampaignsResponse
 * @description Результаты поиска магазинов.
 */
class GetCampaignsResponse {

    /** @var \app\Models\CampaignDTO[] $campaigns Список с информацией по каждому магазину.*/
    public $campaigns = [];

    /** @var \app\Models\FlippingPagerDTO $pager */
    public $pager;

}
