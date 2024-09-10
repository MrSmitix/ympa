

#include "CampaignSettingsTimePeriodDTO.h"

using namespace Tiny;

CampaignSettingsTimePeriodDTO::CampaignSettingsTimePeriodDTO()
{
	fromDate = std::string();
	toDate = std::string();
}

CampaignSettingsTimePeriodDTO::CampaignSettingsTimePeriodDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignSettingsTimePeriodDTO::~CampaignSettingsTimePeriodDTO()
{

}

void
CampaignSettingsTimePeriodDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *fromDateKey = "fromDate";

    if(object.has_key(fromDateKey))
    {
        bourne::json value = object[fromDateKey];



        jsonToValue(&fromDate, value, "std::string");


    }

    const char *toDateKey = "toDate";

    if(object.has_key(toDateKey))
    {
        bourne::json value = object[toDateKey];



        jsonToValue(&toDate, value, "std::string");


    }


}

bourne::json
CampaignSettingsTimePeriodDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["fromDate"] = getFromDate();






    object["toDate"] = getToDate();



    return object;

}

std::string
CampaignSettingsTimePeriodDTO::getFromDate()
{
	return fromDate;
}

void
CampaignSettingsTimePeriodDTO::setFromDate(std::string  fromDate)
{
	this->fromDate = fromDate;
}

std::string
CampaignSettingsTimePeriodDTO::getToDate()
{
	return toDate;
}

void
CampaignSettingsTimePeriodDTO::setToDate(std::string  toDate)
{
	this->toDate = toDate;
}



