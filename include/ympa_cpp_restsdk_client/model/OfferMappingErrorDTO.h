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
 * OfferMappingErrorDTO.h
 *
 * Текст ошибки.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OfferMappingErrorDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OfferMappingErrorDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/OfferMappingErrorType.h"
#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Текст ошибки.
/// </summary>
class  OfferMappingErrorDTO
    : public ModelBase
{
public:
    OfferMappingErrorDTO();
    virtual ~OfferMappingErrorDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// OfferMappingErrorDTO members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<OfferMappingErrorType> getType() const;
    bool typeIsSet() const;
    void unsetType();

    void setType(const std::shared_ptr<OfferMappingErrorType>& value);

    /// <summary>
    /// Идентификатор характеристики, с которой связана ошибка.
    /// </summary>
    int64_t getParameterId() const;
    bool parameterIdIsSet() const;
    void unsetParameterId();

    void setParameterId(int64_t value);

    /// <summary>
    /// Текст ошибки.
    /// </summary>
    utility::string_t getMessage() const;
    bool messageIsSet() const;
    void unsetMessage();

    void setMessage(const utility::string_t& value);


protected:
    std::shared_ptr<OfferMappingErrorType> m_Type;
    bool m_TypeIsSet;
    int64_t m_ParameterId;
    bool m_ParameterIdIsSet;
    utility::string_t m_Message;
    bool m_MessageIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OfferMappingErrorDTO_H_ */
