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
 * OrderDeliveryAddressDTO.h
 *
 * Адрес доставки.  Указывается, если &#x60;type&#x3D;DELIVERY&#x60;, &#x60;type&#x3D;POST&#x60; или &#x60;type&#x3D;PICKUP&#x60; (адрес пункта выдачи). 
 */

#ifndef OrderDeliveryAddressDTO_H_
#define OrderDeliveryAddressDTO_H_



#include "GpsDTO.h"
#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Адрес доставки.  Указывается, если &#x60;type&#x3D;DELIVERY&#x60;, &#x60;type&#x3D;POST&#x60; или &#x60;type&#x3D;PICKUP&#x60; (адрес пункта выдачи). 
/// </summary>
class  OrderDeliveryAddressDTO 
{
public:
    OrderDeliveryAddressDTO() = default;
    explicit OrderDeliveryAddressDTO(boost::property_tree::ptree const& pt);
    virtual ~OrderDeliveryAddressDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// OrderDeliveryAddressDTO members

    /// <summary>
    /// Страна.  Обязательный параметр. 
    /// </summary>
    std::string getCountry() const;
    void setCountry(std::string value);

    /// <summary>
    /// Почтовый индекс.  Указывается, если выбрана доставка почтой (&#x60;delivery type&#x3D;POST&#x60;). 
    /// </summary>
    std::string getPostcode() const;
    void setPostcode(std::string value);

    /// <summary>
    /// Город или населенный пункт.  Обязательный параметр. 
    /// </summary>
    std::string getCity() const;
    void setCity(std::string value);

    /// <summary>
    /// Район.
    /// </summary>
    std::string getDistrict() const;
    void setDistrict(std::string value);

    /// <summary>
    /// Станция метро.
    /// </summary>
    std::string getSubway() const;
    void setSubway(std::string value);

    /// <summary>
    /// Улица.  Обязательный параметр. 
    /// </summary>
    std::string getStreet() const;
    void setStreet(std::string value);

    /// <summary>
    /// Дом или владение.  Обязательный параметр. 
    /// </summary>
    std::string getHouse() const;
    void setHouse(std::string value);

    /// <summary>
    /// Корпус или строение.
    /// </summary>
    std::string getBlock() const;
    void setBlock(std::string value);

    /// <summary>
    /// Подъезд.
    /// </summary>
    std::string getEntrance() const;
    void setEntrance(std::string value);

    /// <summary>
    /// Код домофона.
    /// </summary>
    std::string getEntryphone() const;
    void setEntryphone(std::string value);

    /// <summary>
    /// Этаж.
    /// </summary>
    std::string getFloor() const;
    void setFloor(std::string value);

    /// <summary>
    /// Квартира или офис.
    /// </summary>
    std::string getApartment() const;
    void setApartment(std::string value);

    /// <summary>
    /// Телефон получателя заказа.  Обязательный параметр. 
    /// </summary>
    std::string getPhone() const;
    void setPhone(std::string value);

    /// <summary>
    /// Фамилия, имя и отчество получателя заказа.  Обязательный параметр. 
    /// </summary>
    std::string getRecipient() const;
    void setRecipient(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<GpsDTO> getGps() const;
    void setGps(std::shared_ptr<GpsDTO> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::string m_Country = "";
    std::string m_Postcode = "";
    std::string m_City = "";
    std::string m_District = "";
    std::string m_Subway = "";
    std::string m_Street = "";
    std::string m_House = "";
    std::string m_Block = "";
    std::string m_Entrance = "";
    std::string m_Entryphone = "";
    std::string m_Floor = "";
    std::string m_Apartment = "";
    std::string m_Phone = "";
    std::string m_Recipient = "";
    std::shared_ptr<GpsDTO> m_Gps;
};

std::vector<OrderDeliveryAddressDTO> createOrderDeliveryAddressDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* OrderDeliveryAddressDTO_H_ */
