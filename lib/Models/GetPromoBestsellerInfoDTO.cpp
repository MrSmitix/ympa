

#include "GetPromoBestsellerInfoDTO.h"

using namespace Tiny;

GetPromoBestsellerInfoDTO::GetPromoBestsellerInfoDTO()
{
	bestseller = bool(false);
	entryDeadline = std::string();
}

GetPromoBestsellerInfoDTO::GetPromoBestsellerInfoDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetPromoBestsellerInfoDTO::~GetPromoBestsellerInfoDTO()
{

}

void
GetPromoBestsellerInfoDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *bestsellerKey = "bestseller";

    if(object.has_key(bestsellerKey))
    {
        bourne::json value = object[bestsellerKey];



        jsonToValue(&bestseller, value, "bool");


    }

    const char *entryDeadlineKey = "entryDeadline";

    if(object.has_key(entryDeadlineKey))
    {
        bourne::json value = object[entryDeadlineKey];



        jsonToValue(&entryDeadline, value, "std::string");


    }


}

bourne::json
GetPromoBestsellerInfoDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["bestseller"] = isBestseller();






    object["entryDeadline"] = getEntryDeadline();



    return object;

}

bool
GetPromoBestsellerInfoDTO::isBestseller()
{
	return bestseller;
}

void
GetPromoBestsellerInfoDTO::setBestseller(bool  bestseller)
{
	this->bestseller = bestseller;
}

std::string
GetPromoBestsellerInfoDTO::getEntryDeadline()
{
	return entryDeadline;
}

void
GetPromoBestsellerInfoDTO::setEntryDeadline(std::string  entryDeadline)
{
	this->entryDeadline = entryDeadline;
}



