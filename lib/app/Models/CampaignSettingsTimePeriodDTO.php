<?php
/**
 * CampaignSettingsTimePeriodDTO
 */
namespace app\Models;

/**
 * CampaignSettingsTimePeriodDTO
 * @description Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
 */
class CampaignSettingsTimePeriodDTO {

    /** @var string $fromDate Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.*/
    public $fromDate = "";

    /** @var string $toDate Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.*/
    public $toDate = "";

}
