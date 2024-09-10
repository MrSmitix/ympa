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
import { OrderParcelBoxDTO } from './orderParcelBoxDTO';
import { OrderTrackDTO } from './orderTrackDTO';


/**
 * Список посылок.  В параметре может указываться несколько посылок. 
 */
export interface OrderShipmentDTO { 
    /**
     * Идентификатор посылки, присвоенный Маркетом.
     */
    id?: number;
    /**
     * Формат даты: `ДД-ММ-ГГГГ`. 
     */
    shipmentDate?: string;
    /**
     * **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
     */
    shipmentTime?: string;
    /**
     * **Только для модели DBS**  Информация для отслеживания перемещений посылки. 
     */
    tracks?: Array<OrderTrackDTO> | null;
    /**
     * Список грузовых мест.
     */
    boxes?: Array<OrderParcelBoxDTO> | null;
}
