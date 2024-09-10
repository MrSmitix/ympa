<?php
/**
 * ChatMessagePayloadDTO
 */
namespace app\Models;

/**
 * ChatMessagePayloadDTO
 * @description Информация о приложенных к сообщению файлах.
 */
class ChatMessagePayloadDTO {

    /** @var string $name Имя файла.*/
    public $name = "";

    /** @var string $url Ссылка для скачивания файла.*/
    public $url = "";

    /** @var int $size Размер файла в байтах.*/
    public $size = 0;

}
