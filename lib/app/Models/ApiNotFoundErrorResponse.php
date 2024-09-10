<?php
/**
 * ApiNotFoundErrorResponse
 */
namespace app\Models;

/**
 * ApiNotFoundErrorResponse
 * @description Запрашиваемый ресурс не найден.
 */
class ApiNotFoundErrorResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\ApiErrorDTO[]|null $errors Список ошибок.*/
    public $errors = null;

}
