<?php
/**
 * ApiClientDataErrorResponse
 */
namespace app\Models;

/**
 * ApiClientDataErrorResponse
 * @description Ошибка в данных переданных от клиента.
 */
class ApiClientDataErrorResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\ApiErrorDTO[]|null $errors Список ошибок.*/
    public $errors = null;

}
