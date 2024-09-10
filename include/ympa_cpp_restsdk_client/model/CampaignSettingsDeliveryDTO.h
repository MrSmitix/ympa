/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * CampaignSettingsDeliveryDTO.h
 *
 * Информация о доставке в своем регионе магазина.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CampaignSettingsDeliveryDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CampaignSettingsDeliveryDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/CampaignSettingsScheduleDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class CampaignSettingsScheduleDTO;


/// <summary>
/// Информация о доставке в своем регионе магазина.
/// </summary>
class  CampaignSettingsDeliveryDTO
    : public ModelBase
{
public:
    CampaignSettingsDeliveryDTO();
    virtual ~CampaignSettingsDeliveryDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CampaignSettingsDeliveryDTO members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CampaignSettingsScheduleDTO> getSchedule() const;
    bool scheduleIsSet() const;
    void unsetSchedule();

    void setSchedule(const std::shared_ptr<CampaignSettingsScheduleDTO>& value);


protected:
    std::shared_ptr<CampaignSettingsScheduleDTO> m_Schedule;
    bool m_ScheduleIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CampaignSettingsDeliveryDTO_H_ */
