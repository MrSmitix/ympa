<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
 */
class ParcelBoxDTO
{
    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}
     * @DTA\Data(field="fulfilmentId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^[\\p{Alnum}- ]*$/"})
     * @var string|null
     */
    public $fulfilment_id;

}
