

#include "GetCampaignSettingsResponse.h"

using namespace Tiny;

GetCampaignSettingsResponse::GetCampaignSettingsResponse()
{
	settings = CampaignSettingsDTO();
}

GetCampaignSettingsResponse::GetCampaignSettingsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetCampaignSettingsResponse::~GetCampaignSettingsResponse()
{

}

void
GetCampaignSettingsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *settingsKey = "settings";

    if(object.has_key(settingsKey))
    {
        bourne::json value = object[settingsKey];




        CampaignSettingsDTO* obj = &settings;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetCampaignSettingsResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["settings"] = getSettings().toJson();


    return object;

}

CampaignSettingsDTO
GetCampaignSettingsResponse::getSettings()
{
	return settings;
}

void
GetCampaignSettingsResponse::setSettings(CampaignSettingsDTO  settings)
{
	this->settings = settings;
}



