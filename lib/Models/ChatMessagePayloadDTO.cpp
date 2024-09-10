

#include "ChatMessagePayloadDTO.h"

using namespace Tiny;

ChatMessagePayloadDTO::ChatMessagePayloadDTO()
{
	name = std::string();
	url = std::string();
	size = int(0);
}

ChatMessagePayloadDTO::ChatMessagePayloadDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatMessagePayloadDTO::~ChatMessagePayloadDTO()
{

}

void
ChatMessagePayloadDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }

    const char *sizeKey = "size";

    if(object.has_key(sizeKey))
    {
        bourne::json value = object[sizeKey];



        jsonToValue(&size, value, "int");


    }


}

bourne::json
ChatMessagePayloadDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();






    object["size"] = getSize();



    return object;

}

std::string
ChatMessagePayloadDTO::getName()
{
	return name;
}

void
ChatMessagePayloadDTO::setName(std::string  name)
{
	this->name = name;
}

std::string
ChatMessagePayloadDTO::getUrl()
{
	return url;
}

void
ChatMessagePayloadDTO::setUrl(std::string  url)
{
	this->url = url;
}

int
ChatMessagePayloadDTO::getSize()
{
	return size;
}

void
ChatMessagePayloadDTO::setSize(int  size)
{
	this->size = size;
}



