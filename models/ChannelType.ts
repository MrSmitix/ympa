/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
import type { NULL_SCHEMA_ERR } from './NULLSCHEMAERR';
import {
    NULL_SCHEMA_ERRFromJSON,
    NULL_SCHEMA_ERRFromJSONTyped,
    NULL_SCHEMA_ERRToJSON,
} from './NULLSCHEMAERR';

/**
 * Каналы продвижения товаров:
 * 
 * * `PUSH` — пуш-уведомление из приложения Яндекс Маркет.
 * 
 * * `STRETCH_MAIN` — верхний баннер-растяжка на главной странице Яндекс Маркета.
 * 
 * * `MAIN_PAGE_CAROUSEL` — карусель акций на главной странице Яндекс Маркета.
 * 
 * * `PRODUCT_RETAIL_PAGE` — товар на странице ритейл-повода.
 * 
 * * `MAIN_PAGE_CAROUSEL_WEB` — карусель акций на главной странице веб версии Яндекс Маркета.
 * 
 * * `PRODUCT_SEPARATE_LANDING` — товар на лендинге акции.
 * 
 * * `SUPER_SHELF_CATEGORY` — полка в категориях.
 * 
 * * `CAROUSEL_RETAIL_PAGE` — карусель на лендинге ритейл-повода.
 * 
 * * `POPUP_APPLICATION` — всплывающее окно в приложении Яндекс Маркет.
 * 
 * * `POST_TELEGRAM` — пост в Телеграм-канале Яндекс Маркета.
 * 
 * * `CPA` — реклама в партнерской сети Яндекс Маркета.
 * 
 * * `WEB_PERFORMANCE_DIRECT` — реклама в Яндекс Директе.
 * 
 * * `APP_PERFORMANCE` — реклама в AppStore и Google Play.
 * 
 * * `BANNER_PICKUP_POINT` — баннер в ПВЗ Маркета.
 * 
 * * `BLOGGER_PERFORMANCE` — рекламная интеграция у блогеров.
 * 
 * * `DIGITAL_CHANNEL_BANNER` — баннер в digital-каналах и социальных сетях VK, Одноклассники.
 * 
 * * `YANDEX_ECOSYSTEM_CHANNELS` — реклама в других сервисах Яндекса: GO, Delivery, Еда.
 * 
 * * `PARTNERS_MAIN_BANNER` — баннер на главной странице mail.ru, auto.ru, ya.ru.
 * 
 * * `OTHER` — прочее.
 * 
 * @export
 * @interface ChannelType
 */
export interface ChannelType {
    [key: string]: NULL_SCHEMA_ERR;
}

/**
 * Check if a given object implements the ChannelType interface.
 */
export function instanceOfChannelType(value: object): value is ChannelType {
    return true;
}

export function ChannelTypeFromJSON(json: any): ChannelType {
    return ChannelTypeFromJSONTyped(json, false);
}

export function ChannelTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): ChannelType {
    return json;
}

export function ChannelTypeToJSON(value?: ChannelType | null): any {
    return value;
}

