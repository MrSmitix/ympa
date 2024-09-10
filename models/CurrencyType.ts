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


/**
 * Коды валют.
 * Возможные значения:
 * * `BYR` — белорусский рубль.
 * * `KZT` — казахстанский тенге.
 * * `RUR` — российский рубль.
 * * `UAH` — украинская гривна.
 * 
 * @export
 */
export const CurrencyType = {
    Rur: 'RUR',
    Usd: 'USD',
    Eur: 'EUR',
    Uah: 'UAH',
    Aud: 'AUD',
    Gbp: 'GBP',
    Byr: 'BYR',
    Byn: 'BYN',
    Dkk: 'DKK',
    Isk: 'ISK',
    Kzt: 'KZT',
    Cad: 'CAD',
    Cny: 'CNY',
    Nok: 'NOK',
    Xdr: 'XDR',
    Sgd: 'SGD',
    Try: 'TRY',
    Sek: 'SEK',
    Chf: 'CHF',
    Jpy: 'JPY',
    Azn: 'AZN',
    All: 'ALL',
    Dzd: 'DZD',
    Aoa: 'AOA',
    Ars: 'ARS',
    Amd: 'AMD',
    Afn: 'AFN',
    Bhd: 'BHD',
    Bgn: 'BGN',
    Bob: 'BOB',
    Bwp: 'BWP',
    Bnd: 'BND',
    Brl: 'BRL',
    Bif: 'BIF',
    Huf: 'HUF',
    Vef: 'VEF',
    Kpw: 'KPW',
    Vnd: 'VND',
    Gmd: 'GMD',
    Ghs: 'GHS',
    Gnf: 'GNF',
    Hkd: 'HKD',
    Gel: 'GEL',
    Aed: 'AED',
    Egp: 'EGP',
    Zmk: 'ZMK',
    Ils: 'ILS',
    Inr: 'INR',
    Idr: 'IDR',
    Jod: 'JOD',
    Iqd: 'IQD',
    Irr: 'IRR',
    Yer: 'YER',
    Qar: 'QAR',
    Kes: 'KES',
    Kgs: 'KGS',
    Cop: 'COP',
    Cdf: 'CDF',
    Crc: 'CRC',
    Kwd: 'KWD',
    Cup: 'CUP',
    Lak: 'LAK',
    Lvl: 'LVL',
    Sll: 'SLL',
    Lbp: 'LBP',
    Lyd: 'LYD',
    Szl: 'SZL',
    Ltl: 'LTL',
    Mur: 'MUR',
    Mro: 'MRO',
    Mkd: 'MKD',
    Mwk: 'MWK',
    Mga: 'MGA',
    Myr: 'MYR',
    Mad: 'MAD',
    Mxn: 'MXN',
    Mzn: 'MZN',
    Mdl: 'MDL',
    Mnt: 'MNT',
    Npr: 'NPR',
    Ngn: 'NGN',
    Nio: 'NIO',
    Nzd: 'NZD',
    Omr: 'OMR',
    Pkr: 'PKR',
    Pyg: 'PYG',
    Pen: 'PEN',
    Pln: 'PLN',
    Khr: 'KHR',
    Sar: 'SAR',
    Ron: 'RON',
    Scr: 'SCR',
    Syp: 'SYP',
    Skk: 'SKK',
    Sos: 'SOS',
    Sdg: 'SDG',
    Srd: 'SRD',
    Tjs: 'TJS',
    Thb: 'THB',
    Twd: 'TWD',
    Bdt: 'BDT',
    Tzs: 'TZS',
    Tnd: 'TND',
    Tmm: 'TMM',
    Ugx: 'UGX',
    Uzs: 'UZS',
    Uyu: 'UYU',
    Php: 'PHP',
    Djf: 'DJF',
    Xaf: 'XAF',
    Xof: 'XOF',
    Hrk: 'HRK',
    Czk: 'CZK',
    Clp: 'CLP',
    Lkr: 'LKR',
    Eek: 'EEK',
    Etb: 'ETB',
    Rsd: 'RSD',
    Zar: 'ZAR',
    Krw: 'KRW',
    Nad: 'NAD',
    Tl: 'TL',
    Ue: 'UE'
} as const;
export type CurrencyType = typeof CurrencyType[keyof typeof CurrencyType];


export function instanceOfCurrencyType(value: any): boolean {
    for (const key in CurrencyType) {
        if (Object.prototype.hasOwnProperty.call(CurrencyType, key)) {
            if (CurrencyType[key as keyof typeof CurrencyType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function CurrencyTypeFromJSON(json: any): CurrencyType {
    return CurrencyTypeFromJSONTyped(json, false);
}

export function CurrencyTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): CurrencyType {
    return json as CurrencyType;
}

export function CurrencyTypeToJSON(value?: CurrencyType | null): any {
    return value as any;
}

