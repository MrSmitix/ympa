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
/* tslint:disable:no-unused-variable member-ordering */

import { Injectable, Optional } from '@nestjs/common';
import { HttpService } from '@nestjs/axios';
import { AxiosResponse } from 'axios';
import { Observable, from, of, switchMap } from 'rxjs';
import { ApiClientDataErrorResponse } from '../model/apiClientDataErrorResponse';
import { ApiForbiddenErrorResponse } from '../model/apiForbiddenErrorResponse';
import { ApiLimitErrorResponse } from '../model/apiLimitErrorResponse';
import { ApiNotFoundErrorResponse } from '../model/apiNotFoundErrorResponse';
import { ApiServerErrorResponse } from '../model/apiServerErrorResponse';
import { ApiUnauthorizedErrorResponse } from '../model/apiUnauthorizedErrorResponse';
import { GetBusinessSettingsResponse } from '../model/getBusinessSettingsResponse';
import { Configuration } from '../configuration';
import { COLLECTION_FORMATS } from '../variables';


@Injectable()
export class BusinessesService {

    protected basePath = 'https://api.partner.market.yandex.ru';
    public defaultHeaders: Record<string,string> = {};
    public configuration = new Configuration();

    constructor(protected httpClient: HttpService, @Optional() configuration: Configuration) {
        this.configuration = configuration || this.configuration;
        this.basePath = configuration?.basePath || this.basePath;
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        return consumes.includes(form);
    }

    /**
     * Настройки кабинета
     * Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getBusinessSettings(businessId: number, ): Observable<AxiosResponse<GetBusinessSettingsResponse>>;
    public getBusinessSettings(businessId: number, ): Observable<any> {
        if (businessId === null || businessId === undefined) {
            throw new Error('Required parameter businessId was null or undefined when calling getBusinessSettings.');
        }

        let headers = {...this.defaultHeaders};

        let accessTokenObservable: Observable<any> = of(null);

        // authentication (OAuth) required
        if (this.configuration.accessToken) {
            accessTokenObservable = typeof this.configuration.accessToken === 'function'
                ? from(Promise.resolve(this.configuration.accessToken()))
                : from(Promise.resolve(this.configuration.accessToken))
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return accessTokenObservable.pipe(
            switchMap((accessToken) => {
                if (accessToken) {
                    headers['Authorization'] = `Bearer ${accessToken}`;
                }

                return this.httpClient.post<GetBusinessSettingsResponse>(`${this.basePath}/businesses/${encodeURIComponent(String(businessId))}/settings`,
                    null,
                    {
                        withCredentials: this.configuration.withCredentials,
                        headers: headers
                    }
                );
            })
        );
    }
}