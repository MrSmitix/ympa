<?php
/**
 * GetBusinessSettingsInfoDTO
 */
namespace app\Models;

/**
 * GetBusinessSettingsInfoDTO
 * @description Информация о кабинете и его настройках.
 */
class GetBusinessSettingsInfoDTO {

    /** @var \app\Models\BusinessDTO $info */
    public $info;

    /** @var \app\Models\BusinessSettingsDTO $settings */
    public $settings;

}
