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
 * LogisticPointType.h
 *
 * Тип логистической точки:    * &#x60;WAREHOUSE&#x60; — склад.   * &#x60;PICKUP_POINT&#x60; — обычная точка выдачи заказов (ПВЗ).   * &#x60;PICKUP_TERMINAL&#x60; — постамат.   * &#x60;PICKUP_POST_OFFICE&#x60; — отделение почтовой связи (ОПС).   * &#x60;PICKUP_MIXED&#x60; — торговый зал и пункт выдачи заказов.   * &#x60;PICKUP_RETAIL&#x60; — торговый зал. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_LogisticPointType_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_LogisticPointType_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


class  LogisticPointType
    : public ModelBase
{
public:
    LogisticPointType();
    virtual ~LogisticPointType();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eLogisticPointType
    {
        LogisticPointType_WAREHOUSE,
        LogisticPointType_PICKUP_POINT,
        LogisticPointType_PICKUP_TERMINAL,
        LogisticPointType_PICKUP_POST_OFFICE,
        LogisticPointType_PICKUP_MIXED,
        LogisticPointType_PICKUP_RETAIL,
        LogisticPointType_UNKNOWN,
    };

    eLogisticPointType getValue() const;
    void setValue(eLogisticPointType const value);

    protected:
        eLogisticPointType m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_LogisticPointType_H_ */
