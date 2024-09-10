/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * GpsDTO.h
 *
 * GPS-координаты широты и долготы. 
 */

#ifndef GpsDTO_H_
#define GpsDTO_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// GPS-координаты широты и долготы. 
/// </summary>
class  GpsDTO
{
public:
    GpsDTO();
    virtual ~GpsDTO() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const GpsDTO& rhs) const;
    bool operator!=(const GpsDTO& rhs) const;

    /////////////////////////////////////////////
    /// GpsDTO members

    /// <summary>
    /// Широта.
    /// </summary>
    double getLatitude() const;
    void setLatitude(double const value);
    /// <summary>
    /// Долгота.
    /// </summary>
    double getLongitude() const;
    void setLongitude(double const value);

    friend  void to_json(nlohmann::json& j, const GpsDTO& o);
    friend  void from_json(const nlohmann::json& j, GpsDTO& o);
protected:
    double m_Latitude;

    double m_Longitude;

    
};

} // namespace org::openapitools::server::model

#endif /* GpsDTO_H_ */
