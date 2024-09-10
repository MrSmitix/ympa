<?php
/**
 * SetFeedParamsRequest
 */
namespace app\Models;

/**
 * SetFeedParamsRequest
 * @description Запрос на обновление изменение параметров прайс-листа.
 */
class SetFeedParamsRequest {

    /** @var \app\Models\FeedParameterDTO[] $parameters Параметры прайс-листа.  Обязательный параметр.*/
    public $parameters = [];

}
