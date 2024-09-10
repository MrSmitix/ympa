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
 * SetOrderDeliveryTrackCodeRequest.h
 *
 * 
 */

#ifndef SetOrderDeliveryTrackCodeRequest_H_
#define SetOrderDeliveryTrackCodeRequest_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  SetOrderDeliveryTrackCodeRequest 
{
public:
    SetOrderDeliveryTrackCodeRequest() = default;
    explicit SetOrderDeliveryTrackCodeRequest(boost::property_tree::ptree const& pt);
    virtual ~SetOrderDeliveryTrackCodeRequest() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// SetOrderDeliveryTrackCodeRequest members

    /// <summary>
    /// Трек‑номер посылки.
    /// </summary>
    std::string getTrackCode() const;
    void setTrackCode(std::string value);

    /// <summary>
    /// Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
    /// </summary>
    int64_t getDeliveryServiceId() const;
    void setDeliveryServiceId(int64_t value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::string m_TrackCode = "";
    int64_t m_DeliveryServiceId = 0L;
};

std::vector<SetOrderDeliveryTrackCodeRequest> createSetOrderDeliveryTrackCodeRequestVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* SetOrderDeliveryTrackCodeRequest_H_ */
