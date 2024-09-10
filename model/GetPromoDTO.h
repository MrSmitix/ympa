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
 * GetPromoDTO.h
 *
 * Информация об акции.
 */

#ifndef GetPromoDTO_H_
#define GetPromoDTO_H_


#include "PromoPeriodDTO.h"
#include "GetPromoAssortmentInfoDTO.h"
#include "GetPromoMechanicsInfoDTO.h"
#include "GetPromoBestsellerInfoDTO.h"
#include <string>
#include "GetPromoConstraintsDTO.h"
#include "ChannelType.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Информация об акции.
/// </summary>
class  GetPromoDTO
{
public:
    GetPromoDTO();
    virtual ~GetPromoDTO() = default;


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

    bool operator==(const GetPromoDTO& rhs) const;
    bool operator!=(const GetPromoDTO& rhs) const;

    /////////////////////////////////////////////
    /// GetPromoDTO members

    /// <summary>
    /// Идентификатор акции.
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    /// <summary>
    /// Название акции.
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::PromoPeriodDTO getPeriod() const;
    void setPeriod(org::openapitools::server::model::PromoPeriodDTO const& value);
    /// <summary>
    /// Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением &#x60;true&#x60;, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением &#x60;false&#x60;.  Для прошедших акций всегда возвращается со значением &#x60;true&#x60;.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
    /// </summary>
    bool isParticipating() const;
    void setParticipating(bool const value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::GetPromoAssortmentInfoDTO getAssortmentInfo() const;
    void setAssortmentInfo(org::openapitools::server::model::GetPromoAssortmentInfoDTO const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::GetPromoMechanicsInfoDTO getMechanicsInfo() const;
    void setMechanicsInfo(org::openapitools::server::model::GetPromoMechanicsInfoDTO const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::GetPromoBestsellerInfoDTO getBestsellerInfo() const;
    void setBestsellerInfo(org::openapitools::server::model::GetPromoBestsellerInfoDTO const& value);
    /// <summary>
    /// Список каналов продвижения товаров.
    /// </summary>
    std::vector<org::openapitools::server::model::ChannelType> getChannels() const;
    void setChannels(std::vector<org::openapitools::server::model::ChannelType> const& value);
    bool channelsIsSet() const;
    void unsetChannels();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::GetPromoConstraintsDTO getConstraints() const;
    void setConstraints(org::openapitools::server::model::GetPromoConstraintsDTO const& value);
    bool constraintsIsSet() const;
    void unsetConstraints();

    friend  void to_json(nlohmann::json& j, const GetPromoDTO& o);
    friend  void from_json(const nlohmann::json& j, GetPromoDTO& o);
protected:
    std::string m_Id;

    std::string m_Name;

    org::openapitools::server::model::PromoPeriodDTO m_Period;

    bool m_Participating;

    org::openapitools::server::model::GetPromoAssortmentInfoDTO m_AssortmentInfo;

    org::openapitools::server::model::GetPromoMechanicsInfoDTO m_MechanicsInfo;

    org::openapitools::server::model::GetPromoBestsellerInfoDTO m_BestsellerInfo;

    std::vector<org::openapitools::server::model::ChannelType> m_Channels;
    bool m_ChannelsIsSet;
    org::openapitools::server::model::GetPromoConstraintsDTO m_Constraints;
    bool m_ConstraintsIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* GetPromoDTO_H_ */
