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
 * ShipmentBoxesDTO.h
 *
 * В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
 */

#ifndef ShipmentBoxesDTO_H_
#define ShipmentBoxesDTO_H_



#include "ParcelBoxDTO.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
/// </summary>
class  ShipmentBoxesDTO 
{
public:
    ShipmentBoxesDTO() = default;
    explicit ShipmentBoxesDTO(boost::property_tree::ptree const& pt);
    virtual ~ShipmentBoxesDTO() = default;

    ShipmentBoxesDTO(const ShipmentBoxesDTO& other) = default; // copy constructor
    ShipmentBoxesDTO(ShipmentBoxesDTO&& other) noexcept = default; // move constructor

    ShipmentBoxesDTO& operator=(const ShipmentBoxesDTO& other) = default; // copy assignment
    ShipmentBoxesDTO& operator=(ShipmentBoxesDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ShipmentBoxesDTO members

    /// <summary>
    /// Список грузовых мест. Маркет определил количество мест по длине этого списка. 
    /// </summary>
    std::vector<ParcelBoxDTO> getBoxes() const;
    void setBoxes(std::vector<ParcelBoxDTO> value);

protected:
    std::vector<ParcelBoxDTO> m_Boxes;
};

std::vector<ShipmentBoxesDTO> createShipmentBoxesDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ShipmentBoxesDTO>(const ShipmentBoxesDTO& val) {
    return val.toPropertyTree();
}

template<>
inline ShipmentBoxesDTO fromPt<ShipmentBoxesDTO>(const boost::property_tree::ptree& pt) {
    ShipmentBoxesDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ShipmentBoxesDTO_H_ */
