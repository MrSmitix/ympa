<?php
/**
 * ChatMessageDTO
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
 * Class representing the ChatMessageDTO model.
 *
 * Информация о сообщениях.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class ChatMessageDTO 
{
        /**
     * Идентификатор сообщения.
     *
     * @var int|null
     * @SerializedName("messageId")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    protected ?int $messageId = null;

    /**
     * Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.
     *
     * @var \DateTime|null
     * @SerializedName("createdAt")
     * @Type("DateTime")
    */
    #[Assert\NotNull]
    #[Assert\Type("\DateTime")]
    protected ?\DateTime $createdAt = null;

    /**
     * @var ChatMessageSenderType|null
     * @SerializedName("sender")
    * @Accessor(getter="getSerializedSender", setter="setDeserializedSender")
    * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    protected ?ChatMessageSenderType $sender = null;

    /**
     * Текст сообщения.  Необязательный параметр, если возвращается параметр &#x60;payload&#x60;.
     *
     * @var string|null
     * @SerializedName("message")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $message = null;

    /**
     * Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр &#x60;message&#x60;.
     *
     * @var ChatMessagePayloadDTO[]|null
     * @SerializedName("payload")
     * @Type("array<OpenAPI\Server\Model\ChatMessagePayloadDTO>")
    */
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\ChatMessagePayloadDTO"),
    ])]
    protected ?array $payload = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->messageId = array_key_exists('messageId', $data) ? $data['messageId'] : $this->messageId;
            $this->createdAt = array_key_exists('createdAt', $data) ? $data['createdAt'] : $this->createdAt;
            $this->sender = array_key_exists('sender', $data) ? $data['sender'] : $this->sender;
            $this->message = array_key_exists('message', $data) ? $data['message'] : $this->message;
            $this->payload = array_key_exists('payload', $data) ? $data['payload'] : $this->payload;
        }
    }

    /**
     * Gets messageId.
     *
     * @return int|null
     */
    public function getMessageId(): ?int
    {
        return $this->messageId;
    }

    /**
    * Sets messageId.
    *
    * @param int|null $messageId  Идентификатор сообщения.
    *
    * @return $this
    */
    public function setMessageId(?int $messageId): self
    {
        $this->messageId = $messageId;

        return $this;
    }




    /**
     * Gets createdAt.
     *
     * @return \DateTime|null
     */
    public function getCreatedAt(): ?\DateTime
    {
        return $this->createdAt;
    }

    /**
    * Sets createdAt.
    *
    * @param \DateTime|null $createdAt  Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.
    *
    * @return $this
    */
    public function setCreatedAt(?\DateTime $createdAt): self
    {
        $this->createdAt = $createdAt;

        return $this;
    }




    /**
     * Gets sender.
     *
     * @return ChatMessageSenderType|null
     */
    public function getSender(): ?ChatMessageSenderType
    {
        return $this->sender;
    }

    /**
    * Sets sender.
    *
    * @param ChatMessageSenderType|null $sender
    *
    * @return $this
    */
    public function setSender(?ChatMessageSenderType $sender): self
    {
        $this->sender = $sender;

        return $this;
    }

    /**
    * Gets sender for serialization.
    *
    * @return string|null
    */
    public function getSerializedSender(): string|null
    {
        return $this->sender?->value ? (string) $this->sender->value : null;
    }

    /**
    * Sets sender.
    *
    * @param string|ChatMessageSenderType|null $sender
    *
    * @return $this
    */
    public function setDeserializedSender(string|ChatMessageSenderType|null $sender): self
    {
        if (is_string($sender)) {
            $sender = ChatMessageSenderType::tryFrom($sender);
        }

        $this->sender = $sender;

        return $this;
    }



    /**
     * Gets message.
     *
     * @return string|null
     */
    public function getMessage(): ?string
    {
        return $this->message;
    }

    /**
    * Sets message.
    *
    * @param string|null $message  Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`.
    *
    * @return $this
    */
    public function setMessage(?string $message = null): self
    {
        $this->message = $message;

        return $this;
    }




    /**
     * Gets payload.
     *
     * @return ChatMessagePayloadDTO[]|null
     */
    public function getPayload(): ?array
    {
        return $this->payload;
    }

    /**
    * Sets payload.
    *
    * @param ChatMessagePayloadDTO[]|null $payload  Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`.
    *
    * @return $this
    */
    public function setPayload(?array $payload = null): self
    {
        $this->payload = $payload;

        return $this;
    }



}


