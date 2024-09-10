

#include "OutletWorkingScheduleItemDTO.h"

using namespace Tiny;

OutletWorkingScheduleItemDTO::OutletWorkingScheduleItemDTO()
{
	startDay = DayOfWeekType();
	endDay = DayOfWeekType();
	startTime = std::string();
	endTime = std::string();
}

OutletWorkingScheduleItemDTO::OutletWorkingScheduleItemDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OutletWorkingScheduleItemDTO::~OutletWorkingScheduleItemDTO()
{

}

void
OutletWorkingScheduleItemDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *startDayKey = "startDay";

    if(object.has_key(startDayKey))
    {
        bourne::json value = object[startDayKey];




        DayOfWeekType* obj = &startDay;
		obj->fromJson(value.dump());

    }

    const char *endDayKey = "endDay";

    if(object.has_key(endDayKey))
    {
        bourne::json value = object[endDayKey];




        DayOfWeekType* obj = &endDay;
		obj->fromJson(value.dump());

    }

    const char *startTimeKey = "startTime";

    if(object.has_key(startTimeKey))
    {
        bourne::json value = object[startTimeKey];



        jsonToValue(&startTime, value, "std::string");


    }

    const char *endTimeKey = "endTime";

    if(object.has_key(endTimeKey))
    {
        bourne::json value = object[endTimeKey];



        jsonToValue(&endTime, value, "std::string");


    }


}

bourne::json
OutletWorkingScheduleItemDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["startDay"] = getStartDay().toJson();






	object["endDay"] = getEndDay().toJson();





    object["startTime"] = getStartTime();






    object["endTime"] = getEndTime();



    return object;

}

DayOfWeekType
OutletWorkingScheduleItemDTO::getStartDay()
{
	return startDay;
}

void
OutletWorkingScheduleItemDTO::setStartDay(DayOfWeekType  startDay)
{
	this->startDay = startDay;
}

DayOfWeekType
OutletWorkingScheduleItemDTO::getEndDay()
{
	return endDay;
}

void
OutletWorkingScheduleItemDTO::setEndDay(DayOfWeekType  endDay)
{
	this->endDay = endDay;
}

std::string
OutletWorkingScheduleItemDTO::getStartTime()
{
	return startTime;
}

void
OutletWorkingScheduleItemDTO::setStartTime(std::string  startTime)
{
	this->startTime = startTime;
}

std::string
OutletWorkingScheduleItemDTO::getEndTime()
{
	return endTime;
}

void
OutletWorkingScheduleItemDTO::setEndTime(std::string  endTime)
{
	this->endTime = endTime;
}



