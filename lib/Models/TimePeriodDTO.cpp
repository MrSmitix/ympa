

#include "TimePeriodDTO.h"

using namespace Tiny;

TimePeriodDTO::TimePeriodDTO()
{
	timePeriod = int(0);
	timeUnit = TimeUnitType();
	comment = std::string();
}

TimePeriodDTO::TimePeriodDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

TimePeriodDTO::~TimePeriodDTO()
{

}

void
TimePeriodDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *timePeriodKey = "timePeriod";

    if(object.has_key(timePeriodKey))
    {
        bourne::json value = object[timePeriodKey];



        jsonToValue(&timePeriod, value, "int");


    }

    const char *timeUnitKey = "timeUnit";

    if(object.has_key(timeUnitKey))
    {
        bourne::json value = object[timeUnitKey];




        TimeUnitType* obj = &timeUnit;
		obj->fromJson(value.dump());

    }

    const char *commentKey = "comment";

    if(object.has_key(commentKey))
    {
        bourne::json value = object[commentKey];



        jsonToValue(&comment, value, "std::string");


    }


}

bourne::json
TimePeriodDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["timePeriod"] = getTimePeriod();







	object["timeUnit"] = getTimeUnit().toJson();





    object["comment"] = getComment();



    return object;

}

int
TimePeriodDTO::getTimePeriod()
{
	return timePeriod;
}

void
TimePeriodDTO::setTimePeriod(int  timePeriod)
{
	this->timePeriod = timePeriod;
}

TimeUnitType
TimePeriodDTO::getTimeUnit()
{
	return timeUnit;
}

void
TimePeriodDTO::setTimeUnit(TimeUnitType  timeUnit)
{
	this->timeUnit = timeUnit;
}

std::string
TimePeriodDTO::getComment()
{
	return comment;
}

void
TimePeriodDTO::setComment(std::string  comment)
{
	this->comment = comment;
}



