<?php
/**
 * FeedDTO
 */
namespace app\Models;

/**
 * FeedDTO
 * @description Информация о прайс-листе.
 */
class FeedDTO {

    /** @var int $id Идентификатор прайс-листа.*/
    public $id = 0;

    /** @var string $login Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.*/
    public $login = "";

    /** @var string $name Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.*/
    public $name = "";

    /** @var string $password Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.*/
    public $password = "";

    /** @var \DateTime $uploadDate Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета.*/
    public $uploadDate;

    /** @var string $url URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.*/
    public $url = "";

    /** @var \app\Models\FeedContentDTO $content */
    public $content;

    /** @var \app\Models\FeedDownloadDTO $download */
    public $download;

    /** @var \app\Models\FeedPlacementDTO $placement */
    public $placement;

    /** @var \app\Models\FeedPublicationDTO $publication */
    public $publication;

}
