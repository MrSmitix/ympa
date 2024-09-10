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
 * TrackDTO.h
 *
 * Информация о трек-номерах.
 */

#ifndef TrackDTO_H_
#define TrackDTO_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Информация о трек-номерах.
/// </summary>
class  TrackDTO 
{
public:
    TrackDTO() = default;
    explicit TrackDTO(boost::property_tree::ptree const& pt);
    virtual ~TrackDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// TrackDTO members

    /// <summary>
    /// Трек-код почтового отправления.
    /// </summary>
    std::string getTrackCode() const;
    void setTrackCode(std::string value);

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
};

std::vector<TrackDTO> createTrackDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* TrackDTO_H_ */
