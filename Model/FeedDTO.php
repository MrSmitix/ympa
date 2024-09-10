<?php
/**
 * FeedDTO
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов.
 *
 * The version of the OpenAPI document: LATEST
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\Accessor;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the FeedDTO model.
 *
 * Информация о прайс-листе.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class FeedDTO 
{
        /**
     * Идентификатор прайс-листа.
     *
     * @var int|null
     * @SerializedName("id")
     * @Type("int")
    */
    #[Assert\Type("int")]
    protected ?int $id = null;

    /**
     * Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.
     *
     * @var string|null
     * @SerializedName("login")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $login = null;

    /**
     * Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.
     *
     * @var string|null
     * @SerializedName("name")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $name = null;

    /**
     * Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.
     *
     * @var string|null
     * @SerializedName("password")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $password = null;

    /**
     * Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета.
     *
     * @var \DateTime|null
     * @SerializedName("uploadDate")
     * @Type("DateTime")
    */
    #[Assert\Type("\DateTime")]
    protected ?\DateTime $uploadDate = null;

    /**
     * URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.
     *
     * @var string|null
     * @SerializedName("url")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $url = null;

    /**
     * @var FeedContentDTO|null
     * @SerializedName("content")
     * @Type("OpenAPI\Server\Model\FeedContentDTO")
    */
    #[Assert\Type("OpenAPI\Server\Model\FeedContentDTO")]
    protected ?FeedContentDTO $content = null;

    /**
     * @var FeedDownloadDTO|null
     * @SerializedName("download")
     * @Type("OpenAPI\Server\Model\FeedDownloadDTO")
    */
    #[Assert\Type("OpenAPI\Server\Model\FeedDownloadDTO")]
    protected ?FeedDownloadDTO $download = null;

    /**
     * @var FeedPlacementDTO|null
     * @SerializedName("placement")
     * @Type("OpenAPI\Server\Model\FeedPlacementDTO")
    */
    #[Assert\Type("OpenAPI\Server\Model\FeedPlacementDTO")]
    protected ?FeedPlacementDTO $placement = null;

    /**
     * @var FeedPublicationDTO|null
     * @SerializedName("publication")
     * @Type("OpenAPI\Server\Model\FeedPublicationDTO")
    */
    #[Assert\Type("OpenAPI\Server\Model\FeedPublicationDTO")]
    protected ?FeedPublicationDTO $publication = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->id = array_key_exists('id', $data) ? $data['id'] : $this->id;
            $this->login = array_key_exists('login', $data) ? $data['login'] : $this->login;
            $this->name = array_key_exists('name', $data) ? $data['name'] : $this->name;
            $this->password = array_key_exists('password', $data) ? $data['password'] : $this->password;
            $this->uploadDate = array_key_exists('uploadDate', $data) ? $data['uploadDate'] : $this->uploadDate;
            $this->url = array_key_exists('url', $data) ? $data['url'] : $this->url;
            $this->content = array_key_exists('content', $data) ? $data['content'] : $this->content;
            $this->download = array_key_exists('download', $data) ? $data['download'] : $this->download;
            $this->placement = array_key_exists('placement', $data) ? $data['placement'] : $this->placement;
            $this->publication = array_key_exists('publication', $data) ? $data['publication'] : $this->publication;
        }
    }

    /**
     * Gets id.
     *
     * @return int|null
     */
    public function getId(): ?int
    {
        return $this->id;
    }

    /**
    * Sets id.
    *
    * @param int|null $id  Идентификатор прайс-листа.
    *
    * @return $this
    */
    public function setId(?int $id = null): self
    {
        $this->id = $id;

        return $this;
    }




    /**
     * Gets login.
     *
     * @return string|null
     */
    public function getLogin(): ?string
    {
        return $this->login;
    }

    /**
    * Sets login.
    *
    * @param string|null $login  Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.
    *
    * @return $this
    */
    public function setLogin(?string $login = null): self
    {
        $this->login = $login;

        return $this;
    }




    /**
     * Gets name.
     *
     * @return string|null
     */
    public function getName(): ?string
    {
        return $this->name;
    }

    /**
    * Sets name.
    *
    * @param string|null $name  Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета.
    *
    * @return $this
    */
    public function setName(?string $name = null): self
    {
        $this->name = $name;

        return $this;
    }




    /**
     * Gets password.
     *
     * @return string|null
     */
    public function getPassword(): ?string
    {
        return $this->password;
    }

    /**
    * Sets password.
    *
    * @param string|null $password  Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему.
    *
    * @return $this
    */
    public function setPassword(?string $password = null): self
    {
        $this->password = $password;

        return $this;
    }




    /**
     * Gets uploadDate.
     *
     * @return \DateTime|null
     */
    public function getUploadDate(): ?\DateTime
    {
        return $this->uploadDate;
    }

    /**
    * Sets uploadDate.
    *
    * @param \DateTime|null $uploadDate  Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета.
    *
    * @return $this
    */
    public function setUploadDate(?\DateTime $uploadDate = null): self
    {
        $this->uploadDate = $uploadDate;

        return $this;
    }




    /**
     * Gets url.
     *
     * @return string|null
     */
    public function getUrl(): ?string
    {
        return $this->url;
    }

    /**
    * Sets url.
    *
    * @param string|null $url  URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина.
    *
    * @return $this
    */
    public function setUrl(?string $url = null): self
    {
        $this->url = $url;

        return $this;
    }




    /**
     * Gets content.
     *
     * @return FeedContentDTO|null
     */
    public function getContent(): ?FeedContentDTO
    {
        return $this->content;
    }

    /**
    * Sets content.
    *
    * @param FeedContentDTO|null $content
    *
    * @return $this
    */
    public function setContent(?FeedContentDTO $content = null): self
    {
        $this->content = $content;

        return $this;
    }




    /**
     * Gets download.
     *
     * @return FeedDownloadDTO|null
     */
    public function getDownload(): ?FeedDownloadDTO
    {
        return $this->download;
    }

    /**
    * Sets download.
    *
    * @param FeedDownloadDTO|null $download
    *
    * @return $this
    */
    public function setDownload(?FeedDownloadDTO $download = null): self
    {
        $this->download = $download;

        return $this;
    }




    /**
     * Gets placement.
     *
     * @return FeedPlacementDTO|null
     */
    public function getPlacement(): ?FeedPlacementDTO
    {
        return $this->placement;
    }

    /**
    * Sets placement.
    *
    * @param FeedPlacementDTO|null $placement
    *
    * @return $this
    */
    public function setPlacement(?FeedPlacementDTO $placement = null): self
    {
        $this->placement = $placement;

        return $this;
    }




    /**
     * Gets publication.
     *
     * @return FeedPublicationDTO|null
     */
    public function getPublication(): ?FeedPublicationDTO
    {
        return $this->publication;
    }

    /**
    * Sets publication.
    *
    * @param FeedPublicationDTO|null $publication
    *
    * @return $this
    */
    public function setPublication(?FeedPublicationDTO $publication = null): self
    {
        $this->publication = $publication;

        return $this;
    }



}


