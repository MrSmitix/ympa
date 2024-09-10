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
 * OfferMappingInfoDTO.h
 *
 * Информация о карточке товара.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OfferMappingInfoDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OfferMappingInfoDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/OfferMappingDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class OfferMappingDTO;


/// <summary>
/// Информация о карточке товара.
/// </summary>
class  OfferMappingInfoDTO
    : public ModelBase
{
public:
    OfferMappingInfoDTO();
    virtual ~OfferMappingInfoDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// OfferMappingInfoDTO members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<OfferMappingDTO> getMapping() const;
    bool mappingIsSet() const;
    void unsetMapping();

    void setMapping(const std::shared_ptr<OfferMappingDTO>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<OfferMappingDTO> getAwaitingModerationMapping() const;
    bool awaitingModerationMappingIsSet() const;
    void unsetAwaitingModerationMapping();

    void setAwaitingModerationMapping(const std::shared_ptr<OfferMappingDTO>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<OfferMappingDTO> getRejectedMapping() const;
    bool rejectedMappingIsSet() const;
    void unsetRejectedMapping();

    void setRejectedMapping(const std::shared_ptr<OfferMappingDTO>& value);


protected:
    std::shared_ptr<OfferMappingDTO> m_Mapping;
    bool m_MappingIsSet;
    std::shared_ptr<OfferMappingDTO> m_AwaitingModerationMapping;
    bool m_AwaitingModerationMappingIsSet;
    std::shared_ptr<OfferMappingDTO> m_RejectedMapping;
    bool m_RejectedMappingIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OfferMappingInfoDTO_H_ */
