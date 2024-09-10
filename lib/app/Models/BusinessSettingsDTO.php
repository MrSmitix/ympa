<?php
/**
 * BusinessSettingsDTO
 */
namespace app\Models;

/**
 * BusinessSettingsDTO
 * @description Настройки кабинета.
 */
class BusinessSettingsDTO {

    /** @var bool $onlyDefaultPrice Можно ли установить только [базовую цену](*rule): * &#x60;false&#x60; — можно задать и базовую цену, и цены в конкретных магазинах. * &#x60;true&#x60; — можно задать только базовую цену.*/
    public $onlyDefaultPrice = false;

    /** @var string $currency */
    public $currency = "";

}
