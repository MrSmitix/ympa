<?php
/**
 * FeedPublicationFullDTO
 */
namespace app\Models;

/**
 * FeedPublicationFullDTO
 * @description Информация о последней публикации предложений из прайс-листа на Маркете.
 */
class FeedPublicationFullDTO {

    /** @var \DateTime $fileTime Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.*/
    public $fileTime;

    /** @var \DateTime $publishedTime Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.*/
    public $publishedTime;

}
