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
 * ParcelDTO.h
 *
 * Информация о грузовых местах в заказе.
 */

#ifndef ParcelDTO_H_
#define ParcelDTO_H_



#include "ParcelBoxDTO.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Информация о грузовых местах в заказе.
/// </summary>
class  ParcelDTO 
{
public:
    ParcelDTO() = default;
    explicit ParcelDTO(boost::property_tree::ptree const& pt);
    virtual ~ParcelDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// ParcelDTO members

    /// <summary>
    /// Список грузовых мест. Маркет определяет количество мест по длине этого списка.
    /// </summary>
    std::vector<std::shared_ptr<ParcelBoxDTO>> getBoxes() const;
    void setBoxes(std::vector<std::shared_ptr<ParcelBoxDTO>> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::vector<std::shared_ptr<ParcelBoxDTO>> m_Boxes;
};

std::vector<ParcelDTO> createParcelDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* ParcelDTO_H_ */
