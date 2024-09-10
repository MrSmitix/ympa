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
 * FeedbackGradesDTO.h
 *
 * Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_FeedbackGradesDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_FeedbackGradesDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/FeedbackFactorDTO.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class FeedbackFactorDTO;


/// <summary>
/// Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
/// </summary>
class  FeedbackGradesDTO
    : public ModelBase
{
public:
    FeedbackGradesDTO();
    virtual ~FeedbackGradesDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// FeedbackGradesDTO members

    /// <summary>
    /// Общая оценка, указанная в отзыве: от &#x60;1&#x60; («Ужасный магазин») до &#x60;5&#x60; («Отличный магазин»).
    /// </summary>
    double getAverage() const;
    bool averageIsSet() const;
    void unsetAverage();

    void setAverage(double value);

    /// <summary>
    /// Количество пользователей, считающих отзыв полезным.
    /// </summary>
    int64_t getAgreeCount() const;
    bool agreeCountIsSet() const;
    void unsetAgreeCount();

    void setAgreeCount(int64_t value);

    /// <summary>
    /// Количество пользователей, считающих отзыв бесполезным.
    /// </summary>
    int64_t getRejectCount() const;
    bool rejectCountIsSet() const;
    void unsetRejectCount();

    void setRejectCount(int64_t value);

    /// <summary>
    /// Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор. 
    /// </summary>
    std::vector<std::shared_ptr<FeedbackFactorDTO>>& getFactors();
    bool factorsIsSet() const;
    void unsetFactors();

    void setFactors(const std::vector<std::shared_ptr<FeedbackFactorDTO>>& value);


protected:
    double m_Average;
    bool m_AverageIsSet;
    int64_t m_AgreeCount;
    bool m_AgreeCountIsSet;
    int64_t m_RejectCount;
    bool m_RejectCountIsSet;
    std::vector<std::shared_ptr<FeedbackFactorDTO>> m_Factors;
    bool m_FactorsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_FeedbackGradesDTO_H_ */
