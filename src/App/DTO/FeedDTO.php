<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о прайс-листе.
 */
class FeedDTO
{
    /**
     * Идентификатор прайс-листа.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.
     * @DTA\Data(field="login", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $login;

    /**
     * Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.
     * @DTA\Data(field="password", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $password;

    /**
     * Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета.
     * @DTA\Data(field="uploadDate", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $upload_date;

    /**
     * URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.
     * @DTA\Data(field="url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $url;

    /**
     * @DTA\Data(field="content", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedContentDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedContentDTO::class})
     * @var \App\DTO\FeedContentDTO|null
     */
    public $content;

    /**
     * @DTA\Data(field="download", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedDownloadDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedDownloadDTO::class})
     * @var \App\DTO\FeedDownloadDTO|null
     */
    public $download;

    /**
     * @DTA\Data(field="placement", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedPlacementDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedPlacementDTO::class})
     * @var \App\DTO\FeedPlacementDTO|null
     */
    public $placement;

    /**
     * @DTA\Data(field="publication", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedPublicationDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedPublicationDTO::class})
     * @var \App\DTO\FeedPublicationDTO|null
     */
    public $publication;

}
