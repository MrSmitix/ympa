<?php
/**
 * GoodsFeedbackMediaDTO
 */
namespace app\Models;

/**
 * GoodsFeedbackMediaDTO
 * @description Фото и видео.
 */
class GoodsFeedbackMediaDTO {

    /** @var string[]|null $photos Ссылки на фото.*/
    public $photos = null;

    /** @var string[]|null $videos Ссылки на видео.*/
    public $videos = null;

}
