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
 * OrderDeliveryDatesDTO.h
 *
 * Диапазон дат доставки.
 */

#ifndef OrderDeliveryDatesDTO_H_
#define OrderDeliveryDatesDTO_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Диапазон дат доставки.
/// </summary>
class  OrderDeliveryDatesDTO
{
public:
    OrderDeliveryDatesDTO();
    virtual ~OrderDeliveryDatesDTO() = default;


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

    bool operator==(const OrderDeliveryDatesDTO& rhs) const;
    bool operator!=(const OrderDeliveryDatesDTO& rhs) const;

    /////////////////////////////////////////////
    /// OrderDeliveryDatesDTO members

    /// <summary>
    /// Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
    /// </summary>
    std::string getFromDate() const;
    void setFromDate(std::string const& value);
    bool fromDateIsSet() const;
    void unsetFromDate();
    /// <summary>
    /// Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
    /// </summary>
    std::string getToDate() const;
    void setToDate(std::string const& value);
    bool toDateIsSet() const;
    void unsetToDate();
    /// <summary>
    /// Начало интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Минимальное значение: &#x60;00:00&#x60;. 
    /// </summary>
    std::string getFromTime() const;
    void setFromTime(std::string const& value);
    bool fromTimeIsSet() const;
    void unsetFromTime();
    /// <summary>
    /// Конец интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Максимальное значение: &#x60;23:59&#x60;. 
    /// </summary>
    std::string getToTime() const;
    void setToTime(std::string const& value);
    bool toTimeIsSet() const;
    void unsetToTime();
    /// <summary>
    /// Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
    /// </summary>
    std::string getRealDeliveryDate() const;
    void setRealDeliveryDate(std::string const& value);
    bool realDeliveryDateIsSet() const;
    void unsetRealDeliveryDate();

    friend  void to_json(nlohmann::json& j, const OrderDeliveryDatesDTO& o);
    friend  void from_json(const nlohmann::json& j, OrderDeliveryDatesDTO& o);
protected:
    std::string m_FromDate;
    bool m_FromDateIsSet;
    std::string m_ToDate;
    bool m_ToDateIsSet;
    std::string m_FromTime;
    bool m_FromTimeIsSet;
    std::string m_ToTime;
    bool m_ToTimeIsSet;
    std::string m_RealDeliveryDate;
    bool m_RealDeliveryDateIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* OrderDeliveryDatesDTO_H_ */
