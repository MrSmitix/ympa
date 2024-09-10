<?php
/**
 * FeedbackAuthorDTO
 */
namespace app\Models;

/**
 * FeedbackAuthorDTO
 * @description Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается.
 */
class FeedbackAuthorDTO {

    /** @var string $name Имя автора отзыва.*/
    public $name = "";

    /** @var \app\Models\RegionDTO $region */
    public $region;

}
