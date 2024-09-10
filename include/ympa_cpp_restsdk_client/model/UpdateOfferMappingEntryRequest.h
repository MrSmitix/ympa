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
 * UpdateOfferMappingEntryRequest.h
 *
 * Запрос на обновление товаров.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateOfferMappingEntryRequest_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateOfferMappingEntryRequest_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/UpdateOfferMappingEntryDTO.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class UpdateOfferMappingEntryDTO;


/// <summary>
/// Запрос на обновление товаров.
/// </summary>
class  UpdateOfferMappingEntryRequest
    : public ModelBase
{
public:
    UpdateOfferMappingEntryRequest();
    virtual ~UpdateOfferMappingEntryRequest();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// UpdateOfferMappingEntryRequest members

    /// <summary>
    /// Информация о товарах в каталоге.
    /// </summary>
    std::vector<std::shared_ptr<UpdateOfferMappingEntryDTO>>& getOfferMappingEntries();
    bool offerMappingEntriesIsSet() const;
    void unsetOfferMappingEntries();

    void setOfferMappingEntries(const std::vector<std::shared_ptr<UpdateOfferMappingEntryDTO>>& value);


protected:
    std::vector<std::shared_ptr<UpdateOfferMappingEntryDTO>> m_OfferMappingEntries;
    bool m_OfferMappingEntriesIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateOfferMappingEntryRequest_H_ */
