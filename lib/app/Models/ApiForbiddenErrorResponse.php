<?php
/**
 * ApiForbiddenErrorResponse
 */
namespace app\Models;

/**
 * ApiForbiddenErrorResponse
 * @description Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.
 */
class ApiForbiddenErrorResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\ApiErrorDTO[]|null $errors Список ошибок.*/
    public $errors = null;

}
