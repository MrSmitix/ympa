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
 * SellingProgramType.h
 *
 * Модель размещения:  * &#x60;FBY&#x60; — FBY. * &#x60;FBS&#x60; — FBS. * &#x60;DBS&#x60; — DBS. * &#x60;EXPRESS&#x60; — Экспресс. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_SellingProgramType_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_SellingProgramType_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


class  SellingProgramType
    : public ModelBase
{
public:
    SellingProgramType();
    virtual ~SellingProgramType();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eSellingProgramType
    {
        SellingProgramType_FBY,
        SellingProgramType_FBS,
        SellingProgramType_DBS,
        SellingProgramType_EXPRESS,
    };

    eSellingProgramType getValue() const;
    void setValue(eSellingProgramType const value);

    protected:
        eSellingProgramType m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_SellingProgramType_H_ */
