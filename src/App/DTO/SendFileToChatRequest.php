<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о чате и отправляемом файле.
 */
class SendFileToChatRequest
{
    /**
     * Содержимое файла. Максимальный размер файла — 5 Мбайт.
     * @DTA\Data(field="file")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $file = null;

}
