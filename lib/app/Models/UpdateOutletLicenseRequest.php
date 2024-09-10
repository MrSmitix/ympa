<?php
/**
 * UpdateOutletLicenseRequest
 */
namespace app\Models;

/**
 * UpdateOutletLicenseRequest
 * @description Запрос на создание или изменение лицензий для точек продаж.
 */
class UpdateOutletLicenseRequest {

    /** @var \app\Models\OutletLicenseDTO[] $licenses Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии.*/
    public $licenses = [];

}
