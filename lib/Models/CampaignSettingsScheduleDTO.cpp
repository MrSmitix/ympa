

#include "CampaignSettingsScheduleDTO.h"

using namespace Tiny;

CampaignSettingsScheduleDTO::CampaignSettingsScheduleDTO()
{
	availableOnHolidays = bool(false);
	customHolidays = std::list<std::string>();
	customWorkingDays = std::list<std::string>();
	period = CampaignSettingsTimePeriodDTO();
	totalHolidays = std::list<std::string>();
	weeklyHolidays = std::list<int>();
}

CampaignSettingsScheduleDTO::CampaignSettingsScheduleDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignSettingsScheduleDTO::~CampaignSettingsScheduleDTO()
{

}

void
CampaignSettingsScheduleDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *availableOnHolidaysKey = "availableOnHolidays";

    if(object.has_key(availableOnHolidaysKey))
    {
        bourne::json value = object[availableOnHolidaysKey];



        jsonToValue(&availableOnHolidays, value, "bool");


    }

    const char *customHolidaysKey = "customHolidays";

    if(object.has_key(customHolidaysKey))
    {
        bourne::json value = object[customHolidaysKey];


        std::list<std::string> customHolidays_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            customHolidays_list.push_back(element);
        }
        customHolidays = customHolidays_list;


    }

    const char *customWorkingDaysKey = "customWorkingDays";

    if(object.has_key(customWorkingDaysKey))
    {
        bourne::json value = object[customWorkingDaysKey];


        std::list<std::string> customWorkingDays_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            customWorkingDays_list.push_back(element);
        }
        customWorkingDays = customWorkingDays_list;


    }

    const char *periodKey = "period";

    if(object.has_key(periodKey))
    {
        bourne::json value = object[periodKey];




        CampaignSettingsTimePeriodDTO* obj = &period;
		obj->fromJson(value.dump());

    }

    const char *totalHolidaysKey = "totalHolidays";

    if(object.has_key(totalHolidaysKey))
    {
        bourne::json value = object[totalHolidaysKey];


        std::list<std::string> totalHolidays_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            totalHolidays_list.push_back(element);
        }
        totalHolidays = totalHolidays_list;


    }

    const char *weeklyHolidaysKey = "weeklyHolidays";

    if(object.has_key(weeklyHolidaysKey))
    {
        bourne::json value = object[weeklyHolidaysKey];


        std::list<int> weeklyHolidays_list;
        int element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "int");


            weeklyHolidays_list.push_back(element);
        }
        weeklyHolidays = weeklyHolidays_list;


    }


}

bourne::json
CampaignSettingsScheduleDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["availableOnHolidays"] = isAvailableOnHolidays();





    std::list<std::string> customHolidays_list = getCustomHolidays();
    bourne::json customHolidays_arr = bourne::json::array();

    for(auto& var : customHolidays_list)
    {
        customHolidays_arr.append(var);
    }
    object["customHolidays"] = customHolidays_arr;








    std::list<std::string> customWorkingDays_list = getCustomWorkingDays();
    bourne::json customWorkingDays_arr = bourne::json::array();

    for(auto& var : customWorkingDays_list)
    {
        customWorkingDays_arr.append(var);
    }
    object["customWorkingDays"] = customWorkingDays_arr;










	object["period"] = getPeriod().toJson();




    std::list<std::string> totalHolidays_list = getTotalHolidays();
    bourne::json totalHolidays_arr = bourne::json::array();

    for(auto& var : totalHolidays_list)
    {
        totalHolidays_arr.append(var);
    }
    object["totalHolidays"] = totalHolidays_arr;








    std::list<int> weeklyHolidays_list = getWeeklyHolidays();
    bourne::json weeklyHolidays_arr = bourne::json::array();

    for(auto& var : weeklyHolidays_list)
    {
        weeklyHolidays_arr.append(var);
    }
    object["weeklyHolidays"] = weeklyHolidays_arr;






    return object;

}

bool
CampaignSettingsScheduleDTO::isAvailableOnHolidays()
{
	return availableOnHolidays;
}

void
CampaignSettingsScheduleDTO::setAvailableOnHolidays(bool  availableOnHolidays)
{
	this->availableOnHolidays = availableOnHolidays;
}

std::list<std::string>
CampaignSettingsScheduleDTO::getCustomHolidays()
{
	return customHolidays;
}

void
CampaignSettingsScheduleDTO::setCustomHolidays(std::list <std::string> customHolidays)
{
	this->customHolidays = customHolidays;
}

std::list<std::string>
CampaignSettingsScheduleDTO::getCustomWorkingDays()
{
	return customWorkingDays;
}

void
CampaignSettingsScheduleDTO::setCustomWorkingDays(std::list <std::string> customWorkingDays)
{
	this->customWorkingDays = customWorkingDays;
}

CampaignSettingsTimePeriodDTO
CampaignSettingsScheduleDTO::getPeriod()
{
	return period;
}

void
CampaignSettingsScheduleDTO::setPeriod(CampaignSettingsTimePeriodDTO  period)
{
	this->period = period;
}

std::list<std::string>
CampaignSettingsScheduleDTO::getTotalHolidays()
{
	return totalHolidays;
}

void
CampaignSettingsScheduleDTO::setTotalHolidays(std::list <std::string> totalHolidays)
{
	this->totalHolidays = totalHolidays;
}

std::list<int>
CampaignSettingsScheduleDTO::getWeeklyHolidays()
{
	return weeklyHolidays;
}

void
CampaignSettingsScheduleDTO::setWeeklyHolidays(std::list <int> weeklyHolidays)
{
	this->weeklyHolidays = weeklyHolidays;
}



