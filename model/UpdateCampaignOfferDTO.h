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
 * UpdateCampaignOfferDTO.h
 *
 * Параметры размещения товара в магазине.
 */

#ifndef UpdateCampaignOfferDTO_H_
#define UpdateCampaignOfferDTO_H_


#include <string>
#include "QuantumDTO.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Параметры размещения товара в магазине.
/// </summary>
class  UpdateCampaignOfferDTO
{
public:
    UpdateCampaignOfferDTO();
    virtual ~UpdateCampaignOfferDTO() = default;


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

    bool operator==(const UpdateCampaignOfferDTO& rhs) const;
    bool operator!=(const UpdateCampaignOfferDTO& rhs) const;

    /////////////////////////////////////////////
    /// UpdateCampaignOfferDTO members

    /// <summary>
    /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    /// </summary>
    std::string getOfferId() const;
    void setOfferId(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::QuantumDTO getQuantum() const;
    void setQuantum(org::openapitools::server::model::QuantumDTO const& value);
    bool quantumIsSet() const;
    void unsetQuantum();
    /// <summary>
    /// Есть ли товар в продаже. 
    /// </summary>
    bool isAvailable() const;
    void setAvailable(bool const value);
    bool availableIsSet() const;
    void unsetAvailable();
    /// <summary>
    /// Ставка НДС, применяемая для товара. Задается цифрой:  * &#x60;2&#x60; — 10%. * &#x60;5&#x60; — 0%. * &#x60;6&#x60; — не облагается НДС. * &#x60;7&#x60; — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете продавца на Маркете. 
    /// </summary>
    int32_t getVat() const;
    void setVat(int32_t const value);
    bool vatIsSet() const;
    void unsetVat();

    friend  void to_json(nlohmann::json& j, const UpdateCampaignOfferDTO& o);
    friend  void from_json(const nlohmann::json& j, UpdateCampaignOfferDTO& o);
protected:
    std::string m_OfferId;

    org::openapitools::server::model::QuantumDTO m_Quantum;
    bool m_QuantumIsSet;
    bool m_Available;
    bool m_AvailableIsSet;
    int32_t m_Vat;
    bool m_VatIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* UpdateCampaignOfferDTO_H_ */
