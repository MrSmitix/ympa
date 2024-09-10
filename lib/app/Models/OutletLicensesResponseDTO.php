<?php
/**
 * OutletLicensesResponseDTO
 */
namespace app\Models;

/**
 * OutletLicensesResponseDTO
 * @description Ответ на запрос информации о лицензиях для точек продаж.
 */
class OutletLicensesResponseDTO {

    /** @var \app\Models\FullOutletLicenseDTO[] $licenses Список лицензий.*/
    public $licenses = [];

}
