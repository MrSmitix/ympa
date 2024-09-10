<?php
/**
 * FeedDownloadDTO
 */
namespace app\Models;

/**
 * FeedDownloadDTO
 * @description Информация о последней загрузке прайс-листа.
 */
class FeedDownloadDTO {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\FeedDownloadErrorDTO $error */
    public $error;

}
