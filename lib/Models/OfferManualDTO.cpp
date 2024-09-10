

#include "OfferManualDTO.h"

using namespace Tiny;

OfferManualDTO::OfferManualDTO()
{
	url = std::string();
	title = std::string();
}

OfferManualDTO::OfferManualDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferManualDTO::~OfferManualDTO()
{

}

void
OfferManualDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }


}

bourne::json
OfferManualDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["url"] = getUrl();






    object["title"] = getTitle();



    return object;

}

std::string
OfferManualDTO::getUrl()
{
	return url;
}

void
OfferManualDTO::setUrl(std::string  url)
{
	this->url = url;
}

std::string
OfferManualDTO::getTitle()
{
	return title;
}

void
OfferManualDTO::setTitle(std::string  title)
{
	this->title = title;
}



