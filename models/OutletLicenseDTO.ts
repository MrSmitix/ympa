// tslint:disable
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

import type {
    LicenseType,
} from './';

/**
 * Информация о лицензии.
 * @export
 * @interface OutletLicenseDTO
 */
export interface OutletLicenseDTO {
    /**
     * Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. 
     * @type {number}
     * @memberof OutletLicenseDTO
     */
    id?: number;
    /**
     * Идентификатор точки продаж, для которой действительна лицензия.
     * @type {number}
     * @memberof OutletLicenseDTO
     */
    outletId?: number;
    /**
     * @type {LicenseType}
     * @memberof OutletLicenseDTO
     */
    licenseType?: LicenseType;
    /**
     * Номер лицензии.
     * @type {string}
     * @memberof OutletLicenseDTO
     */
    number?: string;
    /**
     * Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. 
     * @type {string}
     * @memberof OutletLicenseDTO
     */
    dateOfIssue?: string;
    /**
     * Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. 
     * @type {string}
     * @memberof OutletLicenseDTO
     */
    dateOfExpiry?: string;
}


