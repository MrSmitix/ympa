

#include "TurnoverDTO.h"

using namespace Tiny;

TurnoverDTO::TurnoverDTO()
{
	turnover = TurnoverType();
	turnoverDays = float(0);
}

TurnoverDTO::TurnoverDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

TurnoverDTO::~TurnoverDTO()
{

}

void
TurnoverDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *turnoverKey = "turnover";

    if(object.has_key(turnoverKey))
    {
        bourne::json value = object[turnoverKey];




        TurnoverType* obj = &turnover;
		obj->fromJson(value.dump());

    }

    const char *turnoverDaysKey = "turnoverDays";

    if(object.has_key(turnoverDaysKey))
    {
        bourne::json value = object[turnoverDaysKey];



        jsonToValue(&turnoverDays, value, "double");


    }


}

bourne::json
TurnoverDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["turnover"] = getTurnover().toJson();





    object["turnoverDays"] = getTurnoverDays();



    return object;

}

TurnoverType
TurnoverDTO::getTurnover()
{
	return turnover;
}

void
TurnoverDTO::setTurnover(TurnoverType  turnover)
{
	this->turnover = turnover;
}

double
TurnoverDTO::getTurnoverDays()
{
	return turnoverDays;
}

void
TurnoverDTO::setTurnoverDays(double  turnoverDays)
{
	this->turnoverDays = turnoverDays;
}



