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
 * UpdateOrderStorageLimitRequest.h
 *
 * Запрос на обновление срока хранения заказа в ПВЗ.
 */

#ifndef UpdateOrderStorageLimitRequest_H_
#define UpdateOrderStorageLimitRequest_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Запрос на обновление срока хранения заказа в ПВЗ.
/// </summary>
class  UpdateOrderStorageLimitRequest
{
public:
    UpdateOrderStorageLimitRequest();
    virtual ~UpdateOrderStorageLimitRequest() = default;


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

    bool operator==(const UpdateOrderStorageLimitRequest& rhs) const;
    bool operator!=(const UpdateOrderStorageLimitRequest& rhs) const;

    /////////////////////////////////////////////
    /// UpdateOrderStorageLimitRequest members

    /// <summary>
    /// Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
    /// </summary>
    std::string getNewDate() const;
    void setNewDate(std::string const& value);

    friend  void to_json(nlohmann::json& j, const UpdateOrderStorageLimitRequest& o);
    friend  void from_json(const nlohmann::json& j, UpdateOrderStorageLimitRequest& o);
protected:
    std::string m_NewDate;

    
};

} // namespace org::openapitools::server::model

#endif /* UpdateOrderStorageLimitRequest_H_ */
