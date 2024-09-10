

#include "FeedIndexLogsErrorDTO.h"

using namespace Tiny;

FeedIndexLogsErrorDTO::FeedIndexLogsErrorDTO()
{
	httpStatusCode = int(0);
	type = FeedIndexLogsErrorType();
	description = std::string();
}

FeedIndexLogsErrorDTO::FeedIndexLogsErrorDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedIndexLogsErrorDTO::~FeedIndexLogsErrorDTO()
{

}

void
FeedIndexLogsErrorDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *httpStatusCodeKey = "httpStatusCode";

    if(object.has_key(httpStatusCodeKey))
    {
        bourne::json value = object[httpStatusCodeKey];



        jsonToValue(&httpStatusCode, value, "int");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        FeedIndexLogsErrorType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }


}

bourne::json
FeedIndexLogsErrorDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["httpStatusCode"] = getHttpStatusCode();







	object["type"] = getType().toJson();





    object["description"] = getDescription();



    return object;

}

int
FeedIndexLogsErrorDTO::getHttpStatusCode()
{
	return httpStatusCode;
}

void
FeedIndexLogsErrorDTO::setHttpStatusCode(int  httpStatusCode)
{
	this->httpStatusCode = httpStatusCode;
}

FeedIndexLogsErrorType
FeedIndexLogsErrorDTO::getType()
{
	return type;
}

void
FeedIndexLogsErrorDTO::setType(FeedIndexLogsErrorType  type)
{
	this->type = type;
}

std::string
FeedIndexLogsErrorDTO::getDescription()
{
	return description;
}

void
FeedIndexLogsErrorDTO::setDescription(std::string  description)
{
	this->description = description;
}



