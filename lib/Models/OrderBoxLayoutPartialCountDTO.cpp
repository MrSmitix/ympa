

#include "OrderBoxLayoutPartialCountDTO.h"

using namespace Tiny;

OrderBoxLayoutPartialCountDTO::OrderBoxLayoutPartialCountDTO()
{
	current = int(0);
	total = int(0);
}

OrderBoxLayoutPartialCountDTO::OrderBoxLayoutPartialCountDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderBoxLayoutPartialCountDTO::~OrderBoxLayoutPartialCountDTO()
{

}

void
OrderBoxLayoutPartialCountDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *currentKey = "current";

    if(object.has_key(currentKey))
    {
        bourne::json value = object[currentKey];



        jsonToValue(&current, value, "int");


    }

    const char *totalKey = "total";

    if(object.has_key(totalKey))
    {
        bourne::json value = object[totalKey];



        jsonToValue(&total, value, "int");


    }


}

bourne::json
OrderBoxLayoutPartialCountDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["current"] = getCurrent();






    object["total"] = getTotal();



    return object;

}

int
OrderBoxLayoutPartialCountDTO::getCurrent()
{
	return current;
}

void
OrderBoxLayoutPartialCountDTO::setCurrent(int  current)
{
	this->current = current;
}

int
OrderBoxLayoutPartialCountDTO::getTotal()
{
	return total;
}

void
OrderBoxLayoutPartialCountDTO::setTotal(int  total)
{
	this->total = total;
}



