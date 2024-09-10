/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * Информация о ярлыке для коробки.
 */
export interface ParcelBoxLabelDTO { 
    /**
     * Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). 
     */
    url: string;
    /**
     * Юридическое название магазина.
     */
    supplierName: string;
    /**
     * Юридическое название службы доставки.
     */
    deliveryServiceName: string;
    /**
     * Идентификатор заказа в системе Маркета.
     */
    orderId: number;
    /**
     * Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. 
     */
    orderNum: string;
    /**
     * Фамилия и инициалы получателя заказа.
     */
    recipientName: string;
    /**
     * Идентификатор коробки.
     */
    boxId: number;
    /**
     * Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. 
     */
    fulfilmentId: string;
    /**
     * Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. 
     */
    place: string;
    /**
     * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. 
     */
    weight: string;
    /**
     * Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
     */
    deliveryServiceId: string;
    /**
     * Адрес получателя.
     */
    deliveryAddress?: string;
    /**
     * Дата отгрузки в формате `dd.MM.yyyy`.
     */
    shipmentDate?: string;
}
