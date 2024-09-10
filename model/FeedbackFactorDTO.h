/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * FeedbackFactorDTO.h
 *
 * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор. 
 */

#ifndef FeedbackFactorDTO_H_
#define FeedbackFactorDTO_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор. 
/// </summary>
class  FeedbackFactorDTO 
{
public:
    FeedbackFactorDTO() = default;
    explicit FeedbackFactorDTO(boost::property_tree::ptree const& pt);
    virtual ~FeedbackFactorDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// FeedbackFactorDTO members

    /// <summary>
    /// Идентификатор параметра.
    /// </summary>
    int64_t getId() const;
    void setId(int64_t value);

    /// <summary>
    /// Название параметра. Например, &#x60;Скорость обработки заказа&#x60;.
    /// </summary>
    std::string getTitle() const;
    void setTitle(std::string value);

    /// <summary>
    /// Описание параметра. Например, &#x60;Как быстро с вами связались для подтверждения заказа?&#x60;.
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string value);

    /// <summary>
    /// Оценка по параметру, указанная в отзыве: от &#x60;1&#x60; (низшая оценка) до &#x60;5&#x60; (высшая оценка). 
    /// </summary>
    int32_t getValue() const;
    void setValue(int32_t value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    int64_t m_Id = 0L;
    std::string m_Title = "";
    std::string m_Description = "";
    int32_t m_Value = 0;
};

std::vector<FeedbackFactorDTO> createFeedbackFactorDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* FeedbackFactorDTO_H_ */
