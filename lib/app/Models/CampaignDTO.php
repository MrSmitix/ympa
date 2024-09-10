<?php
/**
 * CampaignDTO
 */
namespace app\Models;

/**
 * CampaignDTO
 * @description Информация о магазине.
 */
class CampaignDTO {

    /** @var string $domain URL магазина.*/
    public $domain = "";

    /** @var int $id Идентификатор кампании.*/
    public $id = 0;

    /** @var int $clientId Идентификатор плательщика в Яндекс Балансе.*/
    public $clientId = 0;

    /** @var \app\Models\BusinessDTO $business */
    public $business;

    /** @var string $placementType */
    public $placementType = "";

}
