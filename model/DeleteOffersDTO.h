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
 * DeleteOffersDTO.h
 *
 * Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.
 */

#ifndef DeleteOffersDTO_H_
#define DeleteOffersDTO_H_



#include <string>
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.
/// </summary>
class  DeleteOffersDTO 
{
public:
    DeleteOffersDTO() = default;
    explicit DeleteOffersDTO(boost::property_tree::ptree const& pt);
    virtual ~DeleteOffersDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// DeleteOffersDTO members

    /// <summary>
    /// Список SKU товаров, которые не удалось удалить.
    /// </summary>
    std::vector<std::shared_ptr<std::string>> getNotDeletedOfferIds() const;
    void setNotDeletedOfferIds(std::vector<std::shared_ptr<std::string>> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::vector<std::shared_ptr<std::string>> m_NotDeletedOfferIds;
};

std::vector<DeleteOffersDTO> createDeleteOffersDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* DeleteOffersDTO_H_ */
