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
 * GetCategoriesMaxSaleQuantumDTO.h
 *
 * Категории и лимит на установку кванта и минимального количества товаров.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_GetCategoriesMaxSaleQuantumDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_GetCategoriesMaxSaleQuantumDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/MaxSaleQuantumDTO.h"
#include <vector>
#include "ympa_cpp_restsdk_client/model/CategoryErrorDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class MaxSaleQuantumDTO;
class CategoryErrorDTO;


/// <summary>
/// Категории и лимит на установку кванта и минимального количества товаров.
/// </summary>
class  GetCategoriesMaxSaleQuantumDTO
    : public ModelBase
{
public:
    GetCategoriesMaxSaleQuantumDTO();
    virtual ~GetCategoriesMaxSaleQuantumDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// GetCategoriesMaxSaleQuantumDTO members

    /// <summary>
    /// Категории и лимит на установку кванта и минимального количества товаров.
    /// </summary>
    std::vector<std::shared_ptr<MaxSaleQuantumDTO>>& getResults();
    bool resultsIsSet() const;
    void unsetResults();

    void setResults(const std::vector<std::shared_ptr<MaxSaleQuantumDTO>>& value);

    /// <summary>
    /// Ошибки, которые появились из-за переданных категорий.
    /// </summary>
    std::vector<std::shared_ptr<CategoryErrorDTO>>& getErrors();
    bool errorsIsSet() const;
    void unsetErrors();

    void setErrors(const std::vector<std::shared_ptr<CategoryErrorDTO>>& value);


protected:
    std::vector<std::shared_ptr<MaxSaleQuantumDTO>> m_Results;
    bool m_ResultsIsSet;
    std::vector<std::shared_ptr<CategoryErrorDTO>> m_Errors;
    bool m_ErrorsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_GetCategoriesMaxSaleQuantumDTO_H_ */
