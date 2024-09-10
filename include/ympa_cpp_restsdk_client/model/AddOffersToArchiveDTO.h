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
 * AddOffersToArchiveDTO.h
 *
 * Товары, которые не удалось поместить в архив.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_AddOffersToArchiveDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_AddOffersToArchiveDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include <vector>
#include "ympa_cpp_restsdk_client/model/AddOffersToArchiveErrorDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class AddOffersToArchiveErrorDTO;


/// <summary>
/// Товары, которые не удалось поместить в архив.
/// </summary>
class  AddOffersToArchiveDTO
    : public ModelBase
{
public:
    AddOffersToArchiveDTO();
    virtual ~AddOffersToArchiveDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// AddOffersToArchiveDTO members

    /// <summary>
    /// Список товаров, которые не удалось поместить в архив.
    /// </summary>
    std::vector<std::shared_ptr<AddOffersToArchiveErrorDTO>>& getNotArchivedOffers();
    bool notArchivedOffersIsSet() const;
    void unsetNotArchivedOffers();

    void setNotArchivedOffers(const std::vector<std::shared_ptr<AddOffersToArchiveErrorDTO>>& value);


protected:
    std::vector<std::shared_ptr<AddOffersToArchiveErrorDTO>> m_NotArchivedOffers;
    bool m_NotArchivedOffersIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_AddOffersToArchiveDTO_H_ */
