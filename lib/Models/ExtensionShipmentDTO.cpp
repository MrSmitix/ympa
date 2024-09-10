

#include "ExtensionShipmentDTO.h"

using namespace Tiny;

ExtensionShipmentDTO::ExtensionShipmentDTO()
{
	currentStatus = ShipmentStatusChangeDTO();
	availableActions = std::list<ShipmentActionType>();
}

ExtensionShipmentDTO::ExtensionShipmentDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ExtensionShipmentDTO::~ExtensionShipmentDTO()
{

}

void
ExtensionShipmentDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *currentStatusKey = "currentStatus";

    if(object.has_key(currentStatusKey))
    {
        bourne::json value = object[currentStatusKey];




        ShipmentStatusChangeDTO* obj = &currentStatus;
		obj->fromJson(value.dump());

    }

    const char *availableActionsKey = "availableActions";

    if(object.has_key(availableActionsKey))
    {
        bourne::json value = object[availableActionsKey];


        std::list<ShipmentActionType> availableActions_list;
        ShipmentActionType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            availableActions_list.push_back(element);
        }
        availableActions = availableActions_list;


    }


}

bourne::json
ExtensionShipmentDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["currentStatus"] = getCurrentStatus().toJson();




    std::list<ShipmentActionType> availableActions_list = getAvailableActions();
    bourne::json availableActions_arr = bourne::json::array();

    for(auto& var : availableActions_list)
    {
        ShipmentActionType obj = var;
        availableActions_arr.append(obj.toJson());
    }
    object["availableActions"] = availableActions_arr;




    return object;

}

ShipmentStatusChangeDTO
ExtensionShipmentDTO::getCurrentStatus()
{
	return currentStatus;
}

void
ExtensionShipmentDTO::setCurrentStatus(ShipmentStatusChangeDTO  currentStatus)
{
	this->currentStatus = currentStatus;
}

Set<ShipmentActionType>
ExtensionShipmentDTO::getAvailableActions()
{
	return availableActions;
}

void
ExtensionShipmentDTO::setAvailableActions(Set <ShipmentActionType> availableActions)
{
	this->availableActions = availableActions;
}



