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
 * QualityRatingAffectedOrderDTO.h
 *
 * Информация о заказе, который повлиял на индекс качества.
 */

#ifndef QualityRatingAffectedOrderDTO_H_
#define QualityRatingAffectedOrderDTO_H_



#include <string>
#include "AffectedOrderQualityRatingComponentType.h"
#include <vector>
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Информация о заказе, который повлиял на индекс качества.
/// </summary>
class  QualityRatingAffectedOrderDTO 
{
public:
    QualityRatingAffectedOrderDTO() = default;
    explicit QualityRatingAffectedOrderDTO(boost::property_tree::ptree const& pt);
    virtual ~QualityRatingAffectedOrderDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// QualityRatingAffectedOrderDTO members

    /// <summary>
    /// Идентификатор заказа.
    /// </summary>
    int64_t getOrderId() const;
    void setOrderId(int64_t value);

    /// <summary>
    /// Описание проблемы.
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AffectedOrderQualityRatingComponentType> getComponentType() const;
    void setComponentType(std::shared_ptr<AffectedOrderQualityRatingComponentType> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    int64_t m_OrderId = 0L;
    std::string m_Description = "";
    std::shared_ptr<AffectedOrderQualityRatingComponentType> m_ComponentType = std::make_shared<AffectedOrderQualityRatingComponentType>();
};

std::vector<QualityRatingAffectedOrderDTO> createQualityRatingAffectedOrderDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* QualityRatingAffectedOrderDTO_H_ */
