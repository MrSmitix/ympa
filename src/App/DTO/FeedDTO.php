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
     */
    public ?int $id = null;

    /**
     * Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.
     * @DTA\Data(field="login", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $login = null;

    /**
     * Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.
     * @DTA\Data(field="password", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $password = null;

    /**
     * Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета.
     * @DTA\Data(field="uploadDate", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $upload_date = null;

    /**
     * URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.
     * @DTA\Data(field="url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $url = null;

    /**
     * @DTA\Data(field="content", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedContentDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedContentDTO::class})
     */
    public ?\App\DTO\FeedContentDTO $content = null;

    /**
     * @DTA\Data(field="download", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedDownloadDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedDownloadDTO::class})
     */
    public ?\App\DTO\FeedDownloadDTO $download = null;

    /**
     * @DTA\Data(field="placement", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedPlacementDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedPlacementDTO::class})
     */
    public ?\App\DTO\FeedPlacementDTO $placement = null;

    /**
     * @DTA\Data(field="publication", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedPublicationDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedPublicationDTO::class})
     */
    public ?\App\DTO\FeedPublicationDTO $publication = null;

}
