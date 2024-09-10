<?php
/**
 * FeedContentDTO
 */
namespace app\Models;

/**
 * FeedContentDTO
 * @description Информация о проверке содержимого прайс-листа, загруженного на Маркет.
 */
class FeedContentDTO {

    /** @var int $rejectedOffersCount Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.*/
    public $rejectedOffersCount = 0;

    /** @var string $status */
    public $status = "";

    /** @var int $totalOffersCount Количество предложений в прайс-листе. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.*/
    public $totalOffersCount = 0;

    /** @var \app\Models\FeedContentErrorDTO $error */
    public $error;

}
