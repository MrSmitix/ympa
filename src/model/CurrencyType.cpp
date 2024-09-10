/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "ympa_cpp_restsdk_client/model/CurrencyType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

CurrencyType::eCurrencyType toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("RUR")))
        return CurrencyType::eCurrencyType::CurrencyType_RUR;
    if (val == utility::conversions::to_string_t(U("USD")))
        return CurrencyType::eCurrencyType::CurrencyType_USD;
    if (val == utility::conversions::to_string_t(U("EUR")))
        return CurrencyType::eCurrencyType::CurrencyType_EUR;
    if (val == utility::conversions::to_string_t(U("UAH")))
        return CurrencyType::eCurrencyType::CurrencyType_UAH;
    if (val == utility::conversions::to_string_t(U("AUD")))
        return CurrencyType::eCurrencyType::CurrencyType_AUD;
    if (val == utility::conversions::to_string_t(U("GBP")))
        return CurrencyType::eCurrencyType::CurrencyType_GBP;
    if (val == utility::conversions::to_string_t(U("BYR")))
        return CurrencyType::eCurrencyType::CurrencyType_BYR;
    if (val == utility::conversions::to_string_t(U("BYN")))
        return CurrencyType::eCurrencyType::CurrencyType_BYN;
    if (val == utility::conversions::to_string_t(U("DKK")))
        return CurrencyType::eCurrencyType::CurrencyType_DKK;
    if (val == utility::conversions::to_string_t(U("ISK")))
        return CurrencyType::eCurrencyType::CurrencyType_ISK;
    if (val == utility::conversions::to_string_t(U("KZT")))
        return CurrencyType::eCurrencyType::CurrencyType_KZT;
    if (val == utility::conversions::to_string_t(U("CAD")))
        return CurrencyType::eCurrencyType::CurrencyType_CAD;
    if (val == utility::conversions::to_string_t(U("CNY")))
        return CurrencyType::eCurrencyType::CurrencyType_CNY;
    if (val == utility::conversions::to_string_t(U("NOK")))
        return CurrencyType::eCurrencyType::CurrencyType_NOK;
    if (val == utility::conversions::to_string_t(U("XDR")))
        return CurrencyType::eCurrencyType::CurrencyType_XDR;
    if (val == utility::conversions::to_string_t(U("SGD")))
        return CurrencyType::eCurrencyType::CurrencyType_SGD;
    if (val == utility::conversions::to_string_t(U("TRY")))
        return CurrencyType::eCurrencyType::CurrencyType_TRY;
    if (val == utility::conversions::to_string_t(U("SEK")))
        return CurrencyType::eCurrencyType::CurrencyType_SEK;
    if (val == utility::conversions::to_string_t(U("CHF")))
        return CurrencyType::eCurrencyType::CurrencyType_CHF;
    if (val == utility::conversions::to_string_t(U("JPY")))
        return CurrencyType::eCurrencyType::CurrencyType_JPY;
    if (val == utility::conversions::to_string_t(U("AZN")))
        return CurrencyType::eCurrencyType::CurrencyType_AZN;
    if (val == utility::conversions::to_string_t(U("ALL")))
        return CurrencyType::eCurrencyType::CurrencyType_ALL;
    if (val == utility::conversions::to_string_t(U("DZD")))
        return CurrencyType::eCurrencyType::CurrencyType_DZD;
    if (val == utility::conversions::to_string_t(U("AOA")))
        return CurrencyType::eCurrencyType::CurrencyType_AOA;
    if (val == utility::conversions::to_string_t(U("ARS")))
        return CurrencyType::eCurrencyType::CurrencyType_ARS;
    if (val == utility::conversions::to_string_t(U("AMD")))
        return CurrencyType::eCurrencyType::CurrencyType_AMD;
    if (val == utility::conversions::to_string_t(U("AFN")))
        return CurrencyType::eCurrencyType::CurrencyType_AFN;
    if (val == utility::conversions::to_string_t(U("BHD")))
        return CurrencyType::eCurrencyType::CurrencyType_BHD;
    if (val == utility::conversions::to_string_t(U("BGN")))
        return CurrencyType::eCurrencyType::CurrencyType_BGN;
    if (val == utility::conversions::to_string_t(U("BOB")))
        return CurrencyType::eCurrencyType::CurrencyType_BOB;
    if (val == utility::conversions::to_string_t(U("BWP")))
        return CurrencyType::eCurrencyType::CurrencyType_BWP;
    if (val == utility::conversions::to_string_t(U("BND")))
        return CurrencyType::eCurrencyType::CurrencyType_BND;
    if (val == utility::conversions::to_string_t(U("BRL")))
        return CurrencyType::eCurrencyType::CurrencyType_BRL;
    if (val == utility::conversions::to_string_t(U("BIF")))
        return CurrencyType::eCurrencyType::CurrencyType_BIF;
    if (val == utility::conversions::to_string_t(U("HUF")))
        return CurrencyType::eCurrencyType::CurrencyType_HUF;
    if (val == utility::conversions::to_string_t(U("VEF")))
        return CurrencyType::eCurrencyType::CurrencyType_VEF;
    if (val == utility::conversions::to_string_t(U("KPW")))
        return CurrencyType::eCurrencyType::CurrencyType_KPW;
    if (val == utility::conversions::to_string_t(U("VND")))
        return CurrencyType::eCurrencyType::CurrencyType_VND;
    if (val == utility::conversions::to_string_t(U("GMD")))
        return CurrencyType::eCurrencyType::CurrencyType_GMD;
    if (val == utility::conversions::to_string_t(U("GHS")))
        return CurrencyType::eCurrencyType::CurrencyType_GHS;
    if (val == utility::conversions::to_string_t(U("GNF")))
        return CurrencyType::eCurrencyType::CurrencyType_GNF;
    if (val == utility::conversions::to_string_t(U("HKD")))
        return CurrencyType::eCurrencyType::CurrencyType_HKD;
    if (val == utility::conversions::to_string_t(U("GEL")))
        return CurrencyType::eCurrencyType::CurrencyType_GEL;
    if (val == utility::conversions::to_string_t(U("AED")))
        return CurrencyType::eCurrencyType::CurrencyType_AED;
    if (val == utility::conversions::to_string_t(U("EGP")))
        return CurrencyType::eCurrencyType::CurrencyType_EGP;
    if (val == utility::conversions::to_string_t(U("ZMK")))
        return CurrencyType::eCurrencyType::CurrencyType_ZMK;
    if (val == utility::conversions::to_string_t(U("ILS")))
        return CurrencyType::eCurrencyType::CurrencyType_ILS;
    if (val == utility::conversions::to_string_t(U("INR")))
        return CurrencyType::eCurrencyType::CurrencyType_INR;
    if (val == utility::conversions::to_string_t(U("IDR")))
        return CurrencyType::eCurrencyType::CurrencyType_IDR;
    if (val == utility::conversions::to_string_t(U("JOD")))
        return CurrencyType::eCurrencyType::CurrencyType_JOD;
    if (val == utility::conversions::to_string_t(U("IQD")))
        return CurrencyType::eCurrencyType::CurrencyType_IQD;
    if (val == utility::conversions::to_string_t(U("IRR")))
        return CurrencyType::eCurrencyType::CurrencyType_IRR;
    if (val == utility::conversions::to_string_t(U("YER")))
        return CurrencyType::eCurrencyType::CurrencyType_YER;
    if (val == utility::conversions::to_string_t(U("QAR")))
        return CurrencyType::eCurrencyType::CurrencyType_QAR;
    if (val == utility::conversions::to_string_t(U("KES")))
        return CurrencyType::eCurrencyType::CurrencyType_KES;
    if (val == utility::conversions::to_string_t(U("KGS")))
        return CurrencyType::eCurrencyType::CurrencyType_KGS;
    if (val == utility::conversions::to_string_t(U("COP")))
        return CurrencyType::eCurrencyType::CurrencyType_COP;
    if (val == utility::conversions::to_string_t(U("CDF")))
        return CurrencyType::eCurrencyType::CurrencyType_CDF;
    if (val == utility::conversions::to_string_t(U("CRC")))
        return CurrencyType::eCurrencyType::CurrencyType_CRC;
    if (val == utility::conversions::to_string_t(U("KWD")))
        return CurrencyType::eCurrencyType::CurrencyType_KWD;
    if (val == utility::conversions::to_string_t(U("CUP")))
        return CurrencyType::eCurrencyType::CurrencyType_CUP;
    if (val == utility::conversions::to_string_t(U("LAK")))
        return CurrencyType::eCurrencyType::CurrencyType_LAK;
    if (val == utility::conversions::to_string_t(U("LVL")))
        return CurrencyType::eCurrencyType::CurrencyType_LVL;
    if (val == utility::conversions::to_string_t(U("SLL")))
        return CurrencyType::eCurrencyType::CurrencyType_SLL;
    if (val == utility::conversions::to_string_t(U("LBP")))
        return CurrencyType::eCurrencyType::CurrencyType_LBP;
    if (val == utility::conversions::to_string_t(U("LYD")))
        return CurrencyType::eCurrencyType::CurrencyType_LYD;
    if (val == utility::conversions::to_string_t(U("SZL")))
        return CurrencyType::eCurrencyType::CurrencyType_SZL;
    if (val == utility::conversions::to_string_t(U("LTL")))
        return CurrencyType::eCurrencyType::CurrencyType_LTL;
    if (val == utility::conversions::to_string_t(U("MUR")))
        return CurrencyType::eCurrencyType::CurrencyType_MUR;
    if (val == utility::conversions::to_string_t(U("MRO")))
        return CurrencyType::eCurrencyType::CurrencyType_MRO;
    if (val == utility::conversions::to_string_t(U("MKD")))
        return CurrencyType::eCurrencyType::CurrencyType_MKD;
    if (val == utility::conversions::to_string_t(U("MWK")))
        return CurrencyType::eCurrencyType::CurrencyType_MWK;
    if (val == utility::conversions::to_string_t(U("MGA")))
        return CurrencyType::eCurrencyType::CurrencyType_MGA;
    if (val == utility::conversions::to_string_t(U("MYR")))
        return CurrencyType::eCurrencyType::CurrencyType_MYR;
    if (val == utility::conversions::to_string_t(U("MAD")))
        return CurrencyType::eCurrencyType::CurrencyType_MAD;
    if (val == utility::conversions::to_string_t(U("MXN")))
        return CurrencyType::eCurrencyType::CurrencyType_MXN;
    if (val == utility::conversions::to_string_t(U("MZN")))
        return CurrencyType::eCurrencyType::CurrencyType_MZN;
    if (val == utility::conversions::to_string_t(U("MDL")))
        return CurrencyType::eCurrencyType::CurrencyType_MDL;
    if (val == utility::conversions::to_string_t(U("MNT")))
        return CurrencyType::eCurrencyType::CurrencyType_MNT;
    if (val == utility::conversions::to_string_t(U("NPR")))
        return CurrencyType::eCurrencyType::CurrencyType_NPR;
    if (val == utility::conversions::to_string_t(U("NGN")))
        return CurrencyType::eCurrencyType::CurrencyType_NGN;
    if (val == utility::conversions::to_string_t(U("NIO")))
        return CurrencyType::eCurrencyType::CurrencyType_NIO;
    if (val == utility::conversions::to_string_t(U("NZD")))
        return CurrencyType::eCurrencyType::CurrencyType_NZD;
    if (val == utility::conversions::to_string_t(U("OMR")))
        return CurrencyType::eCurrencyType::CurrencyType_OMR;
    if (val == utility::conversions::to_string_t(U("PKR")))
        return CurrencyType::eCurrencyType::CurrencyType_PKR;
    if (val == utility::conversions::to_string_t(U("PYG")))
        return CurrencyType::eCurrencyType::CurrencyType_PYG;
    if (val == utility::conversions::to_string_t(U("PEN")))
        return CurrencyType::eCurrencyType::CurrencyType_PEN;
    if (val == utility::conversions::to_string_t(U("PLN")))
        return CurrencyType::eCurrencyType::CurrencyType_PLN;
    if (val == utility::conversions::to_string_t(U("KHR")))
        return CurrencyType::eCurrencyType::CurrencyType_KHR;
    if (val == utility::conversions::to_string_t(U("SAR")))
        return CurrencyType::eCurrencyType::CurrencyType_SAR;
    if (val == utility::conversions::to_string_t(U("RON")))
        return CurrencyType::eCurrencyType::CurrencyType_RON;
    if (val == utility::conversions::to_string_t(U("SCR")))
        return CurrencyType::eCurrencyType::CurrencyType_SCR;
    if (val == utility::conversions::to_string_t(U("SYP")))
        return CurrencyType::eCurrencyType::CurrencyType_SYP;
    if (val == utility::conversions::to_string_t(U("SKK")))
        return CurrencyType::eCurrencyType::CurrencyType_SKK;
    if (val == utility::conversions::to_string_t(U("SOS")))
        return CurrencyType::eCurrencyType::CurrencyType_SOS;
    if (val == utility::conversions::to_string_t(U("SDG")))
        return CurrencyType::eCurrencyType::CurrencyType_SDG;
    if (val == utility::conversions::to_string_t(U("SRD")))
        return CurrencyType::eCurrencyType::CurrencyType_SRD;
    if (val == utility::conversions::to_string_t(U("TJS")))
        return CurrencyType::eCurrencyType::CurrencyType_TJS;
    if (val == utility::conversions::to_string_t(U("THB")))
        return CurrencyType::eCurrencyType::CurrencyType_THB;
    if (val == utility::conversions::to_string_t(U("TWD")))
        return CurrencyType::eCurrencyType::CurrencyType_TWD;
    if (val == utility::conversions::to_string_t(U("BDT")))
        return CurrencyType::eCurrencyType::CurrencyType_BDT;
    if (val == utility::conversions::to_string_t(U("TZS")))
        return CurrencyType::eCurrencyType::CurrencyType_TZS;
    if (val == utility::conversions::to_string_t(U("TND")))
        return CurrencyType::eCurrencyType::CurrencyType_TND;
    if (val == utility::conversions::to_string_t(U("TMM")))
        return CurrencyType::eCurrencyType::CurrencyType_TMM;
    if (val == utility::conversions::to_string_t(U("UGX")))
        return CurrencyType::eCurrencyType::CurrencyType_UGX;
    if (val == utility::conversions::to_string_t(U("UZS")))
        return CurrencyType::eCurrencyType::CurrencyType_UZS;
    if (val == utility::conversions::to_string_t(U("UYU")))
        return CurrencyType::eCurrencyType::CurrencyType_UYU;
    if (val == utility::conversions::to_string_t(U("PHP")))
        return CurrencyType::eCurrencyType::CurrencyType_PHP;
    if (val == utility::conversions::to_string_t(U("DJF")))
        return CurrencyType::eCurrencyType::CurrencyType_DJF;
    if (val == utility::conversions::to_string_t(U("XAF")))
        return CurrencyType::eCurrencyType::CurrencyType_XAF;
    if (val == utility::conversions::to_string_t(U("XOF")))
        return CurrencyType::eCurrencyType::CurrencyType_XOF;
    if (val == utility::conversions::to_string_t(U("HRK")))
        return CurrencyType::eCurrencyType::CurrencyType_HRK;
    if (val == utility::conversions::to_string_t(U("CZK")))
        return CurrencyType::eCurrencyType::CurrencyType_CZK;
    if (val == utility::conversions::to_string_t(U("CLP")))
        return CurrencyType::eCurrencyType::CurrencyType_CLP;
    if (val == utility::conversions::to_string_t(U("LKR")))
        return CurrencyType::eCurrencyType::CurrencyType_LKR;
    if (val == utility::conversions::to_string_t(U("EEK")))
        return CurrencyType::eCurrencyType::CurrencyType_EEK;
    if (val == utility::conversions::to_string_t(U("ETB")))
        return CurrencyType::eCurrencyType::CurrencyType_ETB;
    if (val == utility::conversions::to_string_t(U("RSD")))
        return CurrencyType::eCurrencyType::CurrencyType_RSD;
    if (val == utility::conversions::to_string_t(U("ZAR")))
        return CurrencyType::eCurrencyType::CurrencyType_ZAR;
    if (val == utility::conversions::to_string_t(U("KRW")))
        return CurrencyType::eCurrencyType::CurrencyType_KRW;
    if (val == utility::conversions::to_string_t(U("NAD")))
        return CurrencyType::eCurrencyType::CurrencyType_NAD;
    if (val == utility::conversions::to_string_t(U("TL")))
        return CurrencyType::eCurrencyType::CurrencyType_TL;
    if (val == utility::conversions::to_string_t(U("UE")))
        return CurrencyType::eCurrencyType::CurrencyType_UE;
    return {};
}

EnumUnderlyingType fromEnum(CurrencyType::eCurrencyType e)
{
    switch (e)
    {
    case CurrencyType::eCurrencyType::CurrencyType_RUR:
        return U("RUR");
    case CurrencyType::eCurrencyType::CurrencyType_USD:
        return U("USD");
    case CurrencyType::eCurrencyType::CurrencyType_EUR:
        return U("EUR");
    case CurrencyType::eCurrencyType::CurrencyType_UAH:
        return U("UAH");
    case CurrencyType::eCurrencyType::CurrencyType_AUD:
        return U("AUD");
    case CurrencyType::eCurrencyType::CurrencyType_GBP:
        return U("GBP");
    case CurrencyType::eCurrencyType::CurrencyType_BYR:
        return U("BYR");
    case CurrencyType::eCurrencyType::CurrencyType_BYN:
        return U("BYN");
    case CurrencyType::eCurrencyType::CurrencyType_DKK:
        return U("DKK");
    case CurrencyType::eCurrencyType::CurrencyType_ISK:
        return U("ISK");
    case CurrencyType::eCurrencyType::CurrencyType_KZT:
        return U("KZT");
    case CurrencyType::eCurrencyType::CurrencyType_CAD:
        return U("CAD");
    case CurrencyType::eCurrencyType::CurrencyType_CNY:
        return U("CNY");
    case CurrencyType::eCurrencyType::CurrencyType_NOK:
        return U("NOK");
    case CurrencyType::eCurrencyType::CurrencyType_XDR:
        return U("XDR");
    case CurrencyType::eCurrencyType::CurrencyType_SGD:
        return U("SGD");
    case CurrencyType::eCurrencyType::CurrencyType_TRY:
        return U("TRY");
    case CurrencyType::eCurrencyType::CurrencyType_SEK:
        return U("SEK");
    case CurrencyType::eCurrencyType::CurrencyType_CHF:
        return U("CHF");
    case CurrencyType::eCurrencyType::CurrencyType_JPY:
        return U("JPY");
    case CurrencyType::eCurrencyType::CurrencyType_AZN:
        return U("AZN");
    case CurrencyType::eCurrencyType::CurrencyType_ALL:
        return U("ALL");
    case CurrencyType::eCurrencyType::CurrencyType_DZD:
        return U("DZD");
    case CurrencyType::eCurrencyType::CurrencyType_AOA:
        return U("AOA");
    case CurrencyType::eCurrencyType::CurrencyType_ARS:
        return U("ARS");
    case CurrencyType::eCurrencyType::CurrencyType_AMD:
        return U("AMD");
    case CurrencyType::eCurrencyType::CurrencyType_AFN:
        return U("AFN");
    case CurrencyType::eCurrencyType::CurrencyType_BHD:
        return U("BHD");
    case CurrencyType::eCurrencyType::CurrencyType_BGN:
        return U("BGN");
    case CurrencyType::eCurrencyType::CurrencyType_BOB:
        return U("BOB");
    case CurrencyType::eCurrencyType::CurrencyType_BWP:
        return U("BWP");
    case CurrencyType::eCurrencyType::CurrencyType_BND:
        return U("BND");
    case CurrencyType::eCurrencyType::CurrencyType_BRL:
        return U("BRL");
    case CurrencyType::eCurrencyType::CurrencyType_BIF:
        return U("BIF");
    case CurrencyType::eCurrencyType::CurrencyType_HUF:
        return U("HUF");
    case CurrencyType::eCurrencyType::CurrencyType_VEF:
        return U("VEF");
    case CurrencyType::eCurrencyType::CurrencyType_KPW:
        return U("KPW");
    case CurrencyType::eCurrencyType::CurrencyType_VND:
        return U("VND");
    case CurrencyType::eCurrencyType::CurrencyType_GMD:
        return U("GMD");
    case CurrencyType::eCurrencyType::CurrencyType_GHS:
        return U("GHS");
    case CurrencyType::eCurrencyType::CurrencyType_GNF:
        return U("GNF");
    case CurrencyType::eCurrencyType::CurrencyType_HKD:
        return U("HKD");
    case CurrencyType::eCurrencyType::CurrencyType_GEL:
        return U("GEL");
    case CurrencyType::eCurrencyType::CurrencyType_AED:
        return U("AED");
    case CurrencyType::eCurrencyType::CurrencyType_EGP:
        return U("EGP");
    case CurrencyType::eCurrencyType::CurrencyType_ZMK:
        return U("ZMK");
    case CurrencyType::eCurrencyType::CurrencyType_ILS:
        return U("ILS");
    case CurrencyType::eCurrencyType::CurrencyType_INR:
        return U("INR");
    case CurrencyType::eCurrencyType::CurrencyType_IDR:
        return U("IDR");
    case CurrencyType::eCurrencyType::CurrencyType_JOD:
        return U("JOD");
    case CurrencyType::eCurrencyType::CurrencyType_IQD:
        return U("IQD");
    case CurrencyType::eCurrencyType::CurrencyType_IRR:
        return U("IRR");
    case CurrencyType::eCurrencyType::CurrencyType_YER:
        return U("YER");
    case CurrencyType::eCurrencyType::CurrencyType_QAR:
        return U("QAR");
    case CurrencyType::eCurrencyType::CurrencyType_KES:
        return U("KES");
    case CurrencyType::eCurrencyType::CurrencyType_KGS:
        return U("KGS");
    case CurrencyType::eCurrencyType::CurrencyType_COP:
        return U("COP");
    case CurrencyType::eCurrencyType::CurrencyType_CDF:
        return U("CDF");
    case CurrencyType::eCurrencyType::CurrencyType_CRC:
        return U("CRC");
    case CurrencyType::eCurrencyType::CurrencyType_KWD:
        return U("KWD");
    case CurrencyType::eCurrencyType::CurrencyType_CUP:
        return U("CUP");
    case CurrencyType::eCurrencyType::CurrencyType_LAK:
        return U("LAK");
    case CurrencyType::eCurrencyType::CurrencyType_LVL:
        return U("LVL");
    case CurrencyType::eCurrencyType::CurrencyType_SLL:
        return U("SLL");
    case CurrencyType::eCurrencyType::CurrencyType_LBP:
        return U("LBP");
    case CurrencyType::eCurrencyType::CurrencyType_LYD:
        return U("LYD");
    case CurrencyType::eCurrencyType::CurrencyType_SZL:
        return U("SZL");
    case CurrencyType::eCurrencyType::CurrencyType_LTL:
        return U("LTL");
    case CurrencyType::eCurrencyType::CurrencyType_MUR:
        return U("MUR");
    case CurrencyType::eCurrencyType::CurrencyType_MRO:
        return U("MRO");
    case CurrencyType::eCurrencyType::CurrencyType_MKD:
        return U("MKD");
    case CurrencyType::eCurrencyType::CurrencyType_MWK:
        return U("MWK");
    case CurrencyType::eCurrencyType::CurrencyType_MGA:
        return U("MGA");
    case CurrencyType::eCurrencyType::CurrencyType_MYR:
        return U("MYR");
    case CurrencyType::eCurrencyType::CurrencyType_MAD:
        return U("MAD");
    case CurrencyType::eCurrencyType::CurrencyType_MXN:
        return U("MXN");
    case CurrencyType::eCurrencyType::CurrencyType_MZN:
        return U("MZN");
    case CurrencyType::eCurrencyType::CurrencyType_MDL:
        return U("MDL");
    case CurrencyType::eCurrencyType::CurrencyType_MNT:
        return U("MNT");
    case CurrencyType::eCurrencyType::CurrencyType_NPR:
        return U("NPR");
    case CurrencyType::eCurrencyType::CurrencyType_NGN:
        return U("NGN");
    case CurrencyType::eCurrencyType::CurrencyType_NIO:
        return U("NIO");
    case CurrencyType::eCurrencyType::CurrencyType_NZD:
        return U("NZD");
    case CurrencyType::eCurrencyType::CurrencyType_OMR:
        return U("OMR");
    case CurrencyType::eCurrencyType::CurrencyType_PKR:
        return U("PKR");
    case CurrencyType::eCurrencyType::CurrencyType_PYG:
        return U("PYG");
    case CurrencyType::eCurrencyType::CurrencyType_PEN:
        return U("PEN");
    case CurrencyType::eCurrencyType::CurrencyType_PLN:
        return U("PLN");
    case CurrencyType::eCurrencyType::CurrencyType_KHR:
        return U("KHR");
    case CurrencyType::eCurrencyType::CurrencyType_SAR:
        return U("SAR");
    case CurrencyType::eCurrencyType::CurrencyType_RON:
        return U("RON");
    case CurrencyType::eCurrencyType::CurrencyType_SCR:
        return U("SCR");
    case CurrencyType::eCurrencyType::CurrencyType_SYP:
        return U("SYP");
    case CurrencyType::eCurrencyType::CurrencyType_SKK:
        return U("SKK");
    case CurrencyType::eCurrencyType::CurrencyType_SOS:
        return U("SOS");
    case CurrencyType::eCurrencyType::CurrencyType_SDG:
        return U("SDG");
    case CurrencyType::eCurrencyType::CurrencyType_SRD:
        return U("SRD");
    case CurrencyType::eCurrencyType::CurrencyType_TJS:
        return U("TJS");
    case CurrencyType::eCurrencyType::CurrencyType_THB:
        return U("THB");
    case CurrencyType::eCurrencyType::CurrencyType_TWD:
        return U("TWD");
    case CurrencyType::eCurrencyType::CurrencyType_BDT:
        return U("BDT");
    case CurrencyType::eCurrencyType::CurrencyType_TZS:
        return U("TZS");
    case CurrencyType::eCurrencyType::CurrencyType_TND:
        return U("TND");
    case CurrencyType::eCurrencyType::CurrencyType_TMM:
        return U("TMM");
    case CurrencyType::eCurrencyType::CurrencyType_UGX:
        return U("UGX");
    case CurrencyType::eCurrencyType::CurrencyType_UZS:
        return U("UZS");
    case CurrencyType::eCurrencyType::CurrencyType_UYU:
        return U("UYU");
    case CurrencyType::eCurrencyType::CurrencyType_PHP:
        return U("PHP");
    case CurrencyType::eCurrencyType::CurrencyType_DJF:
        return U("DJF");
    case CurrencyType::eCurrencyType::CurrencyType_XAF:
        return U("XAF");
    case CurrencyType::eCurrencyType::CurrencyType_XOF:
        return U("XOF");
    case CurrencyType::eCurrencyType::CurrencyType_HRK:
        return U("HRK");
    case CurrencyType::eCurrencyType::CurrencyType_CZK:
        return U("CZK");
    case CurrencyType::eCurrencyType::CurrencyType_CLP:
        return U("CLP");
    case CurrencyType::eCurrencyType::CurrencyType_LKR:
        return U("LKR");
    case CurrencyType::eCurrencyType::CurrencyType_EEK:
        return U("EEK");
    case CurrencyType::eCurrencyType::CurrencyType_ETB:
        return U("ETB");
    case CurrencyType::eCurrencyType::CurrencyType_RSD:
        return U("RSD");
    case CurrencyType::eCurrencyType::CurrencyType_ZAR:
        return U("ZAR");
    case CurrencyType::eCurrencyType::CurrencyType_KRW:
        return U("KRW");
    case CurrencyType::eCurrencyType::CurrencyType_NAD:
        return U("NAD");
    case CurrencyType::eCurrencyType::CurrencyType_TL:
        return U("TL");
    case CurrencyType::eCurrencyType::CurrencyType_UE:
        return U("UE");
    default:
        break;
    }
    return {};
}
}

CurrencyType::CurrencyType()
{
}

CurrencyType::~CurrencyType()
{
}

void CurrencyType::validate()
{
    // TODO: implement validation
}

web::json::value CurrencyType::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool CurrencyType::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void CurrencyType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool CurrencyType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }
    {
        EnumUnderlyingType e;
        ok = ModelBase::fromHttpContent(multipart->getContent(namePrefix), e);
        if (ok)
        {
            auto v = toEnum(e);
            setValue(v);
        }
    }
    return ok;
}

CurrencyType::eCurrencyType CurrencyType::getValue() const
{
   return m_value;
}

void CurrencyType::setValue(CurrencyType::eCurrencyType const value)
{
   m_value = value;
}


}
}
}
}


