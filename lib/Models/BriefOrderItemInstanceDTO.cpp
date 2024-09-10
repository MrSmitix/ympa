

#include "BriefOrderItemInstanceDTO.h"

using namespace Tiny;

BriefOrderItemInstanceDTO::BriefOrderItemInstanceDTO()
{
	cis = std::string();
	uin = std::string();
	rnpt = std::string();
	gtd = std::string();
}

BriefOrderItemInstanceDTO::BriefOrderItemInstanceDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

BriefOrderItemInstanceDTO::~BriefOrderItemInstanceDTO()
{

}

void
BriefOrderItemInstanceDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cisKey = "cis";

    if(object.has_key(cisKey))
    {
        bourne::json value = object[cisKey];



        jsonToValue(&cis, value, "std::string");


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
BriefOrderItemInstanceDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["cis"] = getCis();






    object["uin"] = getUin();






    object["rnpt"] = getRnpt();






    object["gtd"] = getGtd();



    return object;

}

std::string
BriefOrderItemInstanceDTO::getCis()
{
	return cis;
}

void
BriefOrderItemInstanceDTO::setCis(std::string  cis)
{
	this->cis = cis;
}

std::string
BriefOrderItemInstanceDTO::getUin()
{
	return uin;
}

void
BriefOrderItemInstanceDTO::setUin(std::string  uin)
{
	this->uin = uin;
}

std::string
BriefOrderItemInstanceDTO::getRnpt()
{
	return rnpt;
}

void
BriefOrderItemInstanceDTO::setRnpt(std::string  rnpt)
{
	this->rnpt = rnpt;
}

std::string
BriefOrderItemInstanceDTO::getGtd()
{
	return gtd;
}

void
BriefOrderItemInstanceDTO::setGtd(std::string  gtd)
{
	this->gtd = gtd;
}



