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
 * GetPromoConstraintsDTO.h
 *
 * Ограничения в акции.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_GetPromoConstraintsDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_GetPromoConstraintsDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Ограничения в акции.
/// </summary>
class  GetPromoConstraintsDTO
    : public ModelBase
{
public:
    GetPromoConstraintsDTO();
    virtual ~GetPromoConstraintsDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// GetPromoConstraintsDTO members

    /// <summary>
    /// Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. 
    /// </summary>
    std::vector<int64_t>& getWarehouseIds();
    bool warehouseIdsIsSet() const;
    void unsetWarehouseIds();

    void setWarehouseIds(std::vector<int64_t> value);


protected:
    std::vector<int64_t> m_WarehouseIds;
    bool m_WarehouseIdsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_GetPromoConstraintsDTO_H_ */
