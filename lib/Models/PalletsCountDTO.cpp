

#include "PalletsCountDTO.h"

using namespace Tiny;

PalletsCountDTO::PalletsCountDTO()
{
	planned = int(0);
	fact = int(0);
}

PalletsCountDTO::PalletsCountDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

PalletsCountDTO::~PalletsCountDTO()
{

}

void
PalletsCountDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *plannedKey = "planned";

    if(object.has_key(plannedKey))
    {
        bourne::json value = object[plannedKey];



        jsonToValue(&planned, value, "int");


    }

    const char *factKey = "fact";

    if(object.has_key(factKey))
    {
        bourne::json value = object[factKey];



        jsonToValue(&fact, value, "int");


    }


}

bourne::json
PalletsCountDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["planned"] = getPlanned();






    object["fact"] = getFact();



    return object;

}

int
PalletsCountDTO::getPlanned()
{
	return planned;
}

void
PalletsCountDTO::setPlanned(int  planned)
{
	this->planned = planned;
}

int
PalletsCountDTO::getFact()
{
	return fact;
}

void
PalletsCountDTO::setFact(int  fact)
{
	this->fact = fact;
}



