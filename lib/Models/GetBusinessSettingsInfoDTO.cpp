

#include "GetBusinessSettingsInfoDTO.h"

using namespace Tiny;

GetBusinessSettingsInfoDTO::GetBusinessSettingsInfoDTO()
{
	info = BusinessDTO();
	settings = BusinessSettingsDTO();
}

GetBusinessSettingsInfoDTO::GetBusinessSettingsInfoDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetBusinessSettingsInfoDTO::~GetBusinessSettingsInfoDTO()
{

}

void
GetBusinessSettingsInfoDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *infoKey = "info";

    if(object.has_key(infoKey))
    {
        bourne::json value = object[infoKey];




        BusinessDTO* obj = &info;
		obj->fromJson(value.dump());

    }

    const char *settingsKey = "settings";

    if(object.has_key(settingsKey))
    {
        bourne::json value = object[settingsKey];




        BusinessSettingsDTO* obj = &settings;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetBusinessSettingsInfoDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["info"] = getInfo().toJson();






	object["settings"] = getSettings().toJson();


    return object;

}

BusinessDTO
GetBusinessSettingsInfoDTO::getInfo()
{
	return info;
}

void
GetBusinessSettingsInfoDTO::setInfo(BusinessDTO  info)
{
	this->info = info;
}

BusinessSettingsDTO
GetBusinessSettingsInfoDTO::getSettings()
{
	return settings;
}

void
GetBusinessSettingsInfoDTO::setSettings(BusinessSettingsDTO  settings)
{
	this->settings = settings;
}



