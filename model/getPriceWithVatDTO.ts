/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { CurrencyType } from './currencyType';


/**
 * Цена с указанием ставки НДС и времени последнего обновления.
 */
export interface GetPriceWithVatDTO { 
    /**
     * Цена на товар.
     */
    value?: number;
    /**
     * Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
     */
    discountBase?: number;
    currencyId?: CurrencyType;
    /**
     * Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. 
     */
    vat?: number;
    /**
     * Время последнего обновления.
     */
    updatedAt: string;
}
export namespace GetPriceWithVatDTO {
}


