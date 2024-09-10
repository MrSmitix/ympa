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
 * GetOfferRecommendationsRequest.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_GetOfferRecommendationsRequest_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_GetOfferRecommendationsRequest_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/FieldStateType.h"
#include "ympa_cpp_restsdk_client/model/PriceCompetitivenessType.h"
#include <cpprest/details/basic_types.h>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// 
/// </summary>
class  GetOfferRecommendationsRequest
    : public ModelBase
{
public:
    GetOfferRecommendationsRequest();
    virtual ~GetOfferRecommendationsRequest();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// GetOfferRecommendationsRequest members

    /// <summary>
    /// Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
    /// </summary>
    std::vector<std::shared_ptr<utility::string_t>>& getOfferIds();
    bool offerIdsIsSet() const;
    void unsetOfferIds();

    void setOfferIds(const std::vector<std::shared_ptr<utility::string_t>>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<FieldStateType> getCofinancePriceFilter() const;
    bool cofinancePriceFilterIsSet() const;
    void unsetCofinancePriceFilter();

    void setCofinancePriceFilter(const std::shared_ptr<FieldStateType>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<FieldStateType> getRecommendedCofinancePriceFilter() const;
    bool recommendedCofinancePriceFilterIsSet() const;
    void unsetRecommendedCofinancePriceFilter();

    void setRecommendedCofinancePriceFilter(const std::shared_ptr<FieldStateType>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<PriceCompetitivenessType> getCompetitivenessFilter() const;
    bool competitivenessFilterIsSet() const;
    void unsetCompetitivenessFilter();

    void setCompetitivenessFilter(const std::shared_ptr<PriceCompetitivenessType>& value);


protected:
    std::vector<std::shared_ptr<utility::string_t>> m_OfferIds;
    bool m_OfferIdsIsSet;
    std::shared_ptr<FieldStateType> m_CofinancePriceFilter;
    bool m_CofinancePriceFilterIsSet;
    std::shared_ptr<FieldStateType> m_RecommendedCofinancePriceFilter;
    bool m_RecommendedCofinancePriceFilterIsSet;
    std::shared_ptr<PriceCompetitivenessType> m_CompetitivenessFilter;
    bool m_CompetitivenessFilterIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_GetOfferRecommendationsRequest_H_ */
