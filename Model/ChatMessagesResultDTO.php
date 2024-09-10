<?php
/**
 * ChatMessagesResultDTO
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPIServer\Model
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


namespace OpenAPIServer\Model;

/**
 * Class representing the ChatMessagesResultDTO model.
 *
 * Информация о сообщениях.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class ChatMessagesResultDTO  implements \JsonSerializable
{
        /**
     * Идентификатор заказа.
     *
     * @var int
     * @SerializedName("orderId")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    public int $orderId;

    /**
     * Информация о сообщениях.
     *
     * @var ChatMessageDTO[]
     * @SerializedName("messages")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\All({
     *   @Assert\Type("\OpenAPIServer\Model\ChatMessageDTO")
     * })
     * @Type("array<\OpenAPIServer\Model\ChatMessageDTO>")
     */
    public array $messages;

    /**
     * @var ForwardScrollingPagerDTO|null
     * @SerializedName("paging")
     * @Assert\Type("\OpenAPIServer\Model\ForwardScrollingPagerDTO")
     * @Type("\OpenAPIServer\Model\ForwardScrollingPagerDTO")
     */
    public ?ForwardScrollingPagerDTO $paging;

    /**
     * Constructor
     *
     * @param int $orderId
     * @param ChatMessageDTO[] $messages
     * @param ForwardScrollingPagerDTO|null $paging
     */
    public function __construct(int $orderId, array $messages, ?ForwardScrollingPagerDTO $paging)
    {
        $this->orderId = $orderId;
        $this->messages = $messages;
        $this->paging = $paging;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            $data['orderId'] ?? null, 
            isset($data['messages']) ? array_map(fn($item) => ChatMessageDTO::fromArray($item), $data['messages']) : null, 
            isset($data['paging']) ? ForwardScrollingPagerDTO::fromArray($data['paging']) : null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'orderId' => $this->orderId, 
            'messages' => $this->messages, 
            'paging' => $this->paging, 
        ];
    }
}


