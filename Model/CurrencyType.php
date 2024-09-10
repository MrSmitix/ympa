<?php
/**
 * CurrencyType
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
 * Class representing the CurrencyType model.
 *
 * Коды валют. Возможные значения: * &#x60;BYR&#x60; — белорусский рубль. * &#x60;KZT&#x60; — казахстанский тенге. * &#x60;RUR&#x60; — российский рубль. * &#x60;UAH&#x60; — украинская гривна.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
enum CurrencyType: string
{
        case RUR = "RUR";
        case USD = "USD";
        case EUR = "EUR";
        case UAH = "UAH";
        case AUD = "AUD";
        case GBP = "GBP";
        case BYR = "BYR";
        case BYN = "BYN";
        case DKK = "DKK";
        case ISK = "ISK";
        case KZT = "KZT";
        case CAD = "CAD";
        case CNY = "CNY";
        case NOK = "NOK";
        case XDR = "XDR";
        case SGD = "SGD";
        case _TRY = "TRY";
        case SEK = "SEK";
        case CHF = "CHF";
        case JPY = "JPY";
        case AZN = "AZN";
        case ALL = "ALL";
        case DZD = "DZD";
        case AOA = "AOA";
        case ARS = "ARS";
        case AMD = "AMD";
        case AFN = "AFN";
        case BHD = "BHD";
        case BGN = "BGN";
        case BOB = "BOB";
        case BWP = "BWP";
        case BND = "BND";
        case BRL = "BRL";
        case BIF = "BIF";
        case HUF = "HUF";
        case VEF = "VEF";
        case KPW = "KPW";
        case VND = "VND";
        case GMD = "GMD";
        case GHS = "GHS";
        case GNF = "GNF";
        case HKD = "HKD";
        case GEL = "GEL";
        case AED = "AED";
        case EGP = "EGP";
        case ZMK = "ZMK";
        case ILS = "ILS";
        case INR = "INR";
        case IDR = "IDR";
        case JOD = "JOD";
        case IQD = "IQD";
        case IRR = "IRR";
        case YER = "YER";
        case QAR = "QAR";
        case KES = "KES";
        case KGS = "KGS";
        case COP = "COP";
        case CDF = "CDF";
        case CRC = "CRC";
        case KWD = "KWD";
        case CUP = "CUP";
        case LAK = "LAK";
        case LVL = "LVL";
        case SLL = "SLL";
        case LBP = "LBP";
        case LYD = "LYD";
        case SZL = "SZL";
        case LTL = "LTL";
        case MUR = "MUR";
        case MRO = "MRO";
        case MKD = "MKD";
        case MWK = "MWK";
        case MGA = "MGA";
        case MYR = "MYR";
        case MAD = "MAD";
        case MXN = "MXN";
        case MZN = "MZN";
        case MDL = "MDL";
        case MNT = "MNT";
        case NPR = "NPR";
        case NGN = "NGN";
        case NIO = "NIO";
        case NZD = "NZD";
        case OMR = "OMR";
        case PKR = "PKR";
        case PYG = "PYG";
        case PEN = "PEN";
        case PLN = "PLN";
        case KHR = "KHR";
        case SAR = "SAR";
        case RON = "RON";
        case SCR = "SCR";
        case SYP = "SYP";
        case SKK = "SKK";
        case SOS = "SOS";
        case SDG = "SDG";
        case SRD = "SRD";
        case TJS = "TJS";
        case THB = "THB";
        case TWD = "TWD";
        case BDT = "BDT";
        case TZS = "TZS";
        case TND = "TND";
        case TMM = "TMM";
        case UGX = "UGX";
        case UZS = "UZS";
        case UYU = "UYU";
        case PHP = "PHP";
        case DJF = "DJF";
        case XAF = "XAF";
        case XOF = "XOF";
        case HRK = "HRK";
        case CZK = "CZK";
        case CLP = "CLP";
        case LKR = "LKR";
        case EEK = "EEK";
        case ETB = "ETB";
        case RSD = "RSD";
        case ZAR = "ZAR";
        case KRW = "KRW";
        case NAD = "NAD";
        case TL = "TL";
        case UE = "UE";
}



