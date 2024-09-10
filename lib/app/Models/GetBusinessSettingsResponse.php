<?php
/**
 * GetBusinessSettingsResponse
 */
namespace app\Models;

/**
 * GetBusinessSettingsResponse
 * @description Ответ на запрос настроек кабинета.
 */
class GetBusinessSettingsResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\GetBusinessSettingsInfoDTO $result */
    public $result;

}
