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
 * AgeDTO.h
 *
 * Возраст в заданных единицах измерения.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_AgeDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_AgeDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/AgeUnitType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Возраст в заданных единицах измерения.
/// </summary>
class  AgeDTO
    : public ModelBase
{
public:
    AgeDTO();
    virtual ~AgeDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// AgeDTO members

    /// <summary>
    /// Значение. 
    /// </summary>
    double getValue() const;
    bool valueIsSet() const;
    void unsetValue();

    void setValue(double value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AgeUnitType> getAgeUnit() const;
    bool ageUnitIsSet() const;
    void unsetAgeUnit();

    void setAgeUnit(const std::shared_ptr<AgeUnitType>& value);


protected:
    double m_Value;
    bool m_ValueIsSet;
    std::shared_ptr<AgeUnitType> m_AgeUnit;
    bool m_AgeUnitIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_AgeDTO_H_ */
