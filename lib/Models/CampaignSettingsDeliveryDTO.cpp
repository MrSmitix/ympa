

#include "CampaignSettingsDeliveryDTO.h"

using namespace Tiny;

CampaignSettingsDeliveryDTO::CampaignSettingsDeliveryDTO()
{
	schedule = CampaignSettingsScheduleDTO();
}

CampaignSettingsDeliveryDTO::CampaignSettingsDeliveryDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignSettingsDeliveryDTO::~CampaignSettingsDeliveryDTO()
{

}

void
CampaignSettingsDeliveryDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *scheduleKey = "schedule";

    if(object.has_key(scheduleKey))
    {
        bourne::json value = object[scheduleKey];




        CampaignSettingsScheduleDTO* obj = &schedule;
		obj->fromJson(value.dump());

    }


}

bourne::json
CampaignSettingsDeliveryDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["schedule"] = getSchedule().toJson();


    return object;

}

CampaignSettingsScheduleDTO
CampaignSettingsDeliveryDTO::getSchedule()
{
	return schedule;
}

void
CampaignSettingsDeliveryDTO::setSchedule(CampaignSettingsScheduleDTO  schedule)
{
	this->schedule = schedule;
}



