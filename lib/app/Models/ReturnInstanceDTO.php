<?php
/**
 * ReturnInstanceDTO
 */
namespace app\Models;

/**
 * ReturnInstanceDTO
 * @description Логистическая информация по возврату.
 */
class ReturnInstanceDTO {

    /** @var string $stockType */
    public $stockType = "";

    /** @var string $status */
    public $status = "";

    /** @var string $cis Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).*/
    public $cis = "";

    /** @var string $imei Международный идентификатор мобильного оборудования.*/
    public $imei = "";

}
