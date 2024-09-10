

#include "OrderItemInstanceDTO.h"

using namespace Tiny;

OrderItemInstanceDTO::OrderItemInstanceDTO()
{
	cis = std::string();
	cisFull = std::string();
	uin = std::string();
	rnpt = std::string();
	gtd = std::string();
}

OrderItemInstanceDTO::OrderItemInstanceDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderItemInstanceDTO::~OrderItemInstanceDTO()
{

}

void
OrderItemInstanceDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cisKey = "cis";

    if(object.has_key(cisKey))
    {
        bourne::json value = object[cisKey];



        jsonToValue(&cis, value, "std::string");


    }

    const char *cisFullKey = "cisFull";

    if(object.has_key(cisFullKey))
    {
        bourne::json value = object[cisFullKey];



        jsonToValue(&cisFull, value, "std::string");


    }

    const char *uinKey = "uin";

    if(object.has_key(uinKey))
    {
        bourne::json value = object[uinKey];



        jsonToValue(&uin, value, "std::string");


    }

    const char *rnptKey = "rnpt";

    if(object.has_key(rnptKey))
    {
        bourne::json value = object[rnptKey];



        jsonToValue(&rnpt, value, "std::string");


    }

    const char *gtdKey = "gtd";

    if(object.has_key(gtdKey))
    {
        bourne::json value = object[gtdKey];



        jsonToValue(&gtd, value, "std::string");


    }


}

bourne::json
OrderItemInstanceDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["cis"] = getCis();






    object["cisFull"] = getCisFull();






    object["uin"] = getUin();






    object["rnpt"] = getRnpt();






    object["gtd"] = getGtd();



    return object;

}

std::string
OrderItemInstanceDTO::getCis()
{
	return cis;
}

void
OrderItemInstanceDTO::setCis(std::string  cis)
{
	this->cis = cis;
}

std::string
OrderItemInstanceDTO::getCisFull()
{
	return cisFull;
}

void
OrderItemInstanceDTO::setCisFull(std::string  cisFull)
{
	this->cisFull = cisFull;
}

std::string
OrderItemInstanceDTO::getUin()
{
	return uin;
}

void
OrderItemInstanceDTO::setUin(std::string  uin)
{
	this->uin = uin;
}

std::string
OrderItemInstanceDTO::getRnpt()
{
	return rnpt;
}

void
OrderItemInstanceDTO::setRnpt(std::string  rnpt)
{
	this->rnpt = rnpt;
}

std::string
OrderItemInstanceDTO::getGtd()
{
	return gtd;
}

void
OrderItemInstanceDTO::setGtd(std::string  gtd)
{
	this->gtd = gtd;
}



