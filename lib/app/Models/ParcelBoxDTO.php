<?php
/**
 * ParcelBoxDTO
 */
namespace app\Models;

/**
 * ParcelBoxDTO
 * @description Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
 */
class ParcelBoxDTO {

    /** @var int $id {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}*/
    public $id = 0;

    /** @var string $fulfilmentId {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}*/
    public $fulfilmentId = "";

}
