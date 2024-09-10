

#include "CampaignSettingsScheduleSourceType.h"

using namespace Tiny;

CampaignSettingsScheduleSourceType::CampaignSettingsScheduleSourceType()
{
}

CampaignSettingsScheduleSourceType::CampaignSettingsScheduleSourceType(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignSettingsScheduleSourceType::~CampaignSettingsScheduleSourceType()
{

}

void
CampaignSettingsScheduleSourceType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CampaignSettingsScheduleSourceType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



