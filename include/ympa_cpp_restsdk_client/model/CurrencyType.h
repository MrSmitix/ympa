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

/*
 * CurrencyType.h
 *
 * Коды валют. Возможные значения: * &#x60;BYR&#x60; — белорусский рубль. * &#x60;KZT&#x60; — казахстанский тенге. * &#x60;RUR&#x60; — российский рубль. * &#x60;UAH&#x60; — украинская гривна. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CurrencyType_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CurrencyType_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


class  CurrencyType
    : public ModelBase
{
public:
    CurrencyType();
    virtual ~CurrencyType();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eCurrencyType
    {
        CurrencyType_RUR,
        CurrencyType_USD,
        CurrencyType_EUR,
        CurrencyType_UAH,
        CurrencyType_AUD,
        CurrencyType_GBP,
        CurrencyType_BYR,
        CurrencyType_BYN,
        CurrencyType_DKK,
        CurrencyType_ISK,
        CurrencyType_KZT,
        CurrencyType_CAD,
        CurrencyType_CNY,
        CurrencyType_NOK,
        CurrencyType_XDR,
        CurrencyType_SGD,
        CurrencyType_TRY,
        CurrencyType_SEK,
        CurrencyType_CHF,
        CurrencyType_JPY,
        CurrencyType_AZN,
        CurrencyType_ALL,
        CurrencyType_DZD,
        CurrencyType_AOA,
        CurrencyType_ARS,
        CurrencyType_AMD,
        CurrencyType_AFN,
        CurrencyType_BHD,
        CurrencyType_BGN,
        CurrencyType_BOB,
        CurrencyType_BWP,
        CurrencyType_BND,
        CurrencyType_BRL,
        CurrencyType_BIF,
        CurrencyType_HUF,
        CurrencyType_VEF,
        CurrencyType_KPW,
        CurrencyType_VND,
        CurrencyType_GMD,
        CurrencyType_GHS,
        CurrencyType_GNF,
        CurrencyType_HKD,
        CurrencyType_GEL,
        CurrencyType_AED,
        CurrencyType_EGP,
        CurrencyType_ZMK,
        CurrencyType_ILS,
        CurrencyType_INR,
        CurrencyType_IDR,
        CurrencyType_JOD,
        CurrencyType_IQD,
        CurrencyType_IRR,
        CurrencyType_YER,
        CurrencyType_QAR,
        CurrencyType_KES,
        CurrencyType_KGS,
        CurrencyType_COP,
        CurrencyType_CDF,
        CurrencyType_CRC,
        CurrencyType_KWD,
        CurrencyType_CUP,
        CurrencyType_LAK,
        CurrencyType_LVL,
        CurrencyType_SLL,
        CurrencyType_LBP,
        CurrencyType_LYD,
        CurrencyType_SZL,
        CurrencyType_LTL,
        CurrencyType_MUR,
        CurrencyType_MRO,
        CurrencyType_MKD,
        CurrencyType_MWK,
        CurrencyType_MGA,
        CurrencyType_MYR,
        CurrencyType_MAD,
        CurrencyType_MXN,
        CurrencyType_MZN,
        CurrencyType_MDL,
        CurrencyType_MNT,
        CurrencyType_NPR,
        CurrencyType_NGN,
        CurrencyType_NIO,
        CurrencyType_NZD,
        CurrencyType_OMR,
        CurrencyType_PKR,
        CurrencyType_PYG,
        CurrencyType_PEN,
        CurrencyType_PLN,
        CurrencyType_KHR,
        CurrencyType_SAR,
        CurrencyType_RON,
        CurrencyType_SCR,
        CurrencyType_SYP,
        CurrencyType_SKK,
        CurrencyType_SOS,
        CurrencyType_SDG,
        CurrencyType_SRD,
        CurrencyType_TJS,
        CurrencyType_THB,
        CurrencyType_TWD,
        CurrencyType_BDT,
        CurrencyType_TZS,
        CurrencyType_TND,
        CurrencyType_TMM,
        CurrencyType_UGX,
        CurrencyType_UZS,
        CurrencyType_UYU,
        CurrencyType_PHP,
        CurrencyType_DJF,
        CurrencyType_XAF,
        CurrencyType_XOF,
        CurrencyType_HRK,
        CurrencyType_CZK,
        CurrencyType_CLP,
        CurrencyType_LKR,
        CurrencyType_EEK,
        CurrencyType_ETB,
        CurrencyType_RSD,
        CurrencyType_ZAR,
        CurrencyType_KRW,
        CurrencyType_NAD,
        CurrencyType_TL,
        CurrencyType_UE,
    };

    eCurrencyType getValue() const;
    void setValue(eCurrencyType const value);

    protected:
        eCurrencyType m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CurrencyType_H_ */
