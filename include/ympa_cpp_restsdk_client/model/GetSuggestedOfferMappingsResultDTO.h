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
 * GetSuggestedOfferMappingsResultDTO.h
 *
 * Подобранные карточки на Маркете.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_GetSuggestedOfferMappingsResultDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_GetSuggestedOfferMappingsResultDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/SuggestedOfferMappingDTO.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class SuggestedOfferMappingDTO;


/// <summary>
/// Подобранные карточки на Маркете.
/// </summary>
class  GetSuggestedOfferMappingsResultDTO
    : public ModelBase
{
public:
    GetSuggestedOfferMappingsResultDTO();
    virtual ~GetSuggestedOfferMappingsResultDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// GetSuggestedOfferMappingsResultDTO members

    /// <summary>
    /// Список товаров.
    /// </summary>
    std::vector<std::shared_ptr<SuggestedOfferMappingDTO>>& getOffers();
    bool offersIsSet() const;
    void unsetOffers();

    void setOffers(const std::vector<std::shared_ptr<SuggestedOfferMappingDTO>>& value);


protected:
    std::vector<std::shared_ptr<SuggestedOfferMappingDTO>> m_Offers;
    bool m_OffersIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_GetSuggestedOfferMappingsResultDTO_H_ */
