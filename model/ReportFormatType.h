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
 * ReportFormatType.h
 *
 * Формат отчета:  * &#x60;FILE&#x60; — файл с электронной таблицей. * &#x60;CSV&#x60; — ZIP-архив с CSV-файлами на каждый лист отчета. 
 */

#ifndef ReportFormatType_H_
#define ReportFormatType_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Формат отчета:  * &#x60;FILE&#x60; — файл с электронной таблицей. * &#x60;CSV&#x60; — ZIP-архив с CSV-файлами на каждый лист отчета. 
/// </summary>
class  ReportFormatType
{
public:
    ReportFormatType();
    virtual ~ReportFormatType() = default;

    enum class eReportFormatType {
    // To have a valid default value.
    // Avoiding name clashes with user defined
    // enum values
    INVALID_VALUE_OPENAPI_GENERATED = 0,
    FILE, 
    CSV
    };

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

    bool operator==(const ReportFormatType& rhs) const;
    bool operator!=(const ReportFormatType& rhs) const;

    /////////////////////////////////////////////
    /// ReportFormatType members

    ReportFormatType::eReportFormatType getValue() const;
    void setValue(ReportFormatType::eReportFormatType value);
    
    friend  void to_json(nlohmann::json& j, const ReportFormatType& o);
    friend  void from_json(const nlohmann::json& j, ReportFormatType& o);
protected:
    ReportFormatType::eReportFormatType m_value = ReportFormatType::eReportFormatType::INVALID_VALUE_OPENAPI_GENERATED;
};

} // namespace org::openapitools::server::model

#endif /* ReportFormatType_H_ */
