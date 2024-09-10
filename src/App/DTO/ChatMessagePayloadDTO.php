<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о приложенных к сообщению файлах.
 */
class ChatMessagePayloadDTO
{
    /**
     * Имя файла.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Ссылка для скачивания файла.
     * @DTA\Data(field="url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $url = null;

    /**
     * Размер файла в байтах.
     * @DTA\Data(field="size")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $size = null;

}
