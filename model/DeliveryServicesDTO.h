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
 * DeliveryServicesDTO.h
 *
 * Информация о службах доставки.
 */

#ifndef DeliveryServicesDTO_H_
#define DeliveryServicesDTO_H_



#include "DeliveryServiceInfoDTO.h"
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
/// Информация о службах доставки.
/// </summary>
class  DeliveryServicesDTO 
{
public:
    DeliveryServicesDTO() = default;
    explicit DeliveryServicesDTO(boost::property_tree::ptree const& pt);
    virtual ~DeliveryServicesDTO() = default;

    DeliveryServicesDTO(const DeliveryServicesDTO& other) = default; // copy constructor
    DeliveryServicesDTO(DeliveryServicesDTO&& other) noexcept = default; // move constructor

    DeliveryServicesDTO& operator=(const DeliveryServicesDTO& other) = default; // copy assignment
    DeliveryServicesDTO& operator=(DeliveryServicesDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// DeliveryServicesDTO members

    /// <summary>
    /// Информация о службе доставки.
    /// </summary>
    std::vector<DeliveryServiceInfoDTO> getDeliveryService() const;
    void setDeliveryService(std::vector<DeliveryServiceInfoDTO> value);

protected:
    std::vector<DeliveryServiceInfoDTO> m_DeliveryService;
};

std::vector<DeliveryServicesDTO> createDeliveryServicesDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<DeliveryServicesDTO>(const DeliveryServicesDTO& val) {
    return val.toPropertyTree();
}

template<>
inline DeliveryServicesDTO fromPt<DeliveryServicesDTO>(const boost::property_tree::ptree& pt) {
    DeliveryServicesDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* DeliveryServicesDTO_H_ */
