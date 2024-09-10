<?php
/**
 * ApiServerErrorResponse
 */
namespace app\Models;

/**
 * ApiServerErrorResponse
 * @description Внутренняя ошибка сервера.
 */
class ApiServerErrorResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\ApiErrorDTO[]|null $errors Список ошибок.*/
    public $errors = null;

}
