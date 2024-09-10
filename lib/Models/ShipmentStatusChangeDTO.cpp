

#include "ShipmentStatusChangeDTO.h"

using namespace Tiny;

ShipmentStatusChangeDTO::ShipmentStatusChangeDTO()
{
	status = ShipmentStatusType();
	description = std::string();
	updateTime = std::string();
}

ShipmentStatusChangeDTO::ShipmentStatusChangeDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ShipmentStatusChangeDTO::~ShipmentStatusChangeDTO()
{

}

void
ShipmentStatusChangeDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        ShipmentStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *updateTimeKey = "updateTime";

    if(object.has_key(updateTimeKey))
    {
        bourne::json value = object[updateTimeKey];



        jsonToValue(&updateTime, value, "std::string");


    }


}

bourne::json
ShipmentStatusChangeDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();





    object["description"] = getDescription();






    object["updateTime"] = getUpdateTime();



    return object;

}

ShipmentStatusType
ShipmentStatusChangeDTO::getStatus()
{
	return status;
}

void
ShipmentStatusChangeDTO::setStatus(ShipmentStatusType  status)
{
	this->status = status;
}

std::string
ShipmentStatusChangeDTO::getDescription()
{
	return description;
}

void
ShipmentStatusChangeDTO::setDescription(std::string  description)
{
	this->description = description;
}

std::string
ShipmentStatusChangeDTO::getUpdateTime()
{
	return updateTime;
}

void
ShipmentStatusChangeDTO::setUpdateTime(std::string  updateTime)
{
	this->updateTime = updateTime;
}



