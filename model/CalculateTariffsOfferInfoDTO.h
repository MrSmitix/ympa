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
 * CalculateTariffsOfferInfoDTO.h
 *
 * Стоимость услуг.
 */

#ifndef CalculateTariffsOfferInfoDTO_H_
#define CalculateTariffsOfferInfoDTO_H_



#include "CalculateTariffsOfferDTO.h"
#include "CalculatedTariffDTO.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Стоимость услуг.
/// </summary>
class  CalculateTariffsOfferInfoDTO 
{
public:
    CalculateTariffsOfferInfoDTO() = default;
    explicit CalculateTariffsOfferInfoDTO(boost::property_tree::ptree const& pt);
    virtual ~CalculateTariffsOfferInfoDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// CalculateTariffsOfferInfoDTO members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CalculateTariffsOfferDTO> getOffer() const;
    void setOffer(std::shared_ptr<CalculateTariffsOfferDTO> value);

    /// <summary>
    /// Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
    /// </summary>
    std::vector<std::shared_ptr<CalculatedTariffDTO>> getTariffs() const;
    void setTariffs(std::vector<std::shared_ptr<CalculatedTariffDTO>> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::shared_ptr<CalculateTariffsOfferDTO> m_Offer;
    std::vector<std::shared_ptr<CalculatedTariffDTO>> m_Tariffs;
};

std::vector<CalculateTariffsOfferInfoDTO> createCalculateTariffsOfferInfoDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* CalculateTariffsOfferInfoDTO_H_ */
