

#include "ShipmentDTO.h"

using namespace Tiny;

ShipmentDTO::ShipmentDTO()
{
	id = long(0);
	planIntervalFrom = std::string();
	planIntervalTo = std::string();
	shipmentType = ShipmentType();
	warehouse = PartnerShipmentWarehouseDTO();
	warehouseTo = PartnerShipmentWarehouseDTO();
	externalId = std::string();
	deliveryService = DeliveryServiceDTO();
	palletsCount = PalletsCountDTO();
	orderIds = std::list<long>();
	draftCount = int(0);
	plannedCount = int(0);
	factCount = int(0);
	currentStatus = ShipmentStatusChangeDTO();
	availableActions = std::list<ShipmentActionType>();
}

ShipmentDTO::ShipmentDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ShipmentDTO::~ShipmentDTO()
{

}

void
ShipmentDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *planIntervalFromKey = "planIntervalFrom";

    if(object.has_key(planIntervalFromKey))
    {
        bourne::json value = object[planIntervalFromKey];



        jsonToValue(&planIntervalFrom, value, "std::string");


    }

    const char *planIntervalToKey = "planIntervalTo";

    if(object.has_key(planIntervalToKey))
    {
        bourne::json value = object[planIntervalToKey];



        jsonToValue(&planIntervalTo, value, "std::string");


    }

    const char *shipmentTypeKey = "shipmentType";

    if(object.has_key(shipmentTypeKey))
    {
        bourne::json value = object[shipmentTypeKey];




        ShipmentType* obj = &shipmentType;
		obj->fromJson(value.dump());

    }

    const char *warehouseKey = "warehouse";

    if(object.has_key(warehouseKey))
    {
        bourne::json value = object[warehouseKey];




        PartnerShipmentWarehouseDTO* obj = &warehouse;
		obj->fromJson(value.dump());

    }

    const char *warehouseToKey = "warehouseTo";

    if(object.has_key(warehouseToKey))
    {
        bourne::json value = object[warehouseToKey];




        PartnerShipmentWarehouseDTO* obj = &warehouseTo;
		obj->fromJson(value.dump());

    }

    const char *externalIdKey = "externalId";

    if(object.has_key(externalIdKey))
    {
        bourne::json value = object[externalIdKey];



        jsonToValue(&externalId, value, "std::string");


    }

    const char *deliveryServiceKey = "deliveryService";

    if(object.has_key(deliveryServiceKey))
    {
        bourne::json value = object[deliveryServiceKey];




        DeliveryServiceDTO* obj = &deliveryService;
		obj->fromJson(value.dump());

    }

    const char *palletsCountKey = "palletsCount";

    if(object.has_key(palletsCountKey))
    {
        bourne::json value = object[palletsCountKey];




        PalletsCountDTO* obj = &palletsCount;
		obj->fromJson(value.dump());

    }

    const char *orderIdsKey = "orderIds";

    if(object.has_key(orderIdsKey))
    {
        bourne::json value = object[orderIdsKey];


        std::list<long> orderIds_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            orderIds_list.push_back(element);
        }
        orderIds = orderIds_list;


    }

    const char *draftCountKey = "draftCount";

    if(object.has_key(draftCountKey))
    {
        bourne::json value = object[draftCountKey];



        jsonToValue(&draftCount, value, "int");


    }

    const char *plannedCountKey = "plannedCount";

    if(object.has_key(plannedCountKey))
    {
        bourne::json value = object[plannedCountKey];



        jsonToValue(&plannedCount, value, "int");


    }

    const char *factCountKey = "factCount";

    if(object.has_key(factCountKey))
    {
        bourne::json value = object[factCountKey];



        jsonToValue(&factCount, value, "int");


    }

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
ShipmentDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["planIntervalFrom"] = getPlanIntervalFrom();






    object["planIntervalTo"] = getPlanIntervalTo();







	object["shipmentType"] = getShipmentType().toJson();






	object["warehouse"] = getWarehouse().toJson();






	object["warehouseTo"] = getWarehouseTo().toJson();





    object["externalId"] = getExternalId();







	object["deliveryService"] = getDeliveryService().toJson();






	object["palletsCount"] = getPalletsCount().toJson();




    std::list<long> orderIds_list = getOrderIds();
    bourne::json orderIds_arr = bourne::json::array();

    for(auto& var : orderIds_list)
    {
        orderIds_arr.append(var);
    }
    object["orderIds"] = orderIds_arr;









    object["draftCount"] = getDraftCount();






    object["plannedCount"] = getPlannedCount();






    object["factCount"] = getFactCount();







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

long
ShipmentDTO::getId()
{
	return id;
}

void
ShipmentDTO::setId(long  id)
{
	this->id = id;
}

std::string
ShipmentDTO::getPlanIntervalFrom()
{
	return planIntervalFrom;
}

void
ShipmentDTO::setPlanIntervalFrom(std::string  planIntervalFrom)
{
	this->planIntervalFrom = planIntervalFrom;
}

std::string
ShipmentDTO::getPlanIntervalTo()
{
	return planIntervalTo;
}

void
ShipmentDTO::setPlanIntervalTo(std::string  planIntervalTo)
{
	this->planIntervalTo = planIntervalTo;
}

ShipmentType
ShipmentDTO::getShipmentType()
{
	return shipmentType;
}

void
ShipmentDTO::setShipmentType(ShipmentType  shipmentType)
{
	this->shipmentType = shipmentType;
}

PartnerShipmentWarehouseDTO
ShipmentDTO::getWarehouse()
{
	return warehouse;
}

void
ShipmentDTO::setWarehouse(PartnerShipmentWarehouseDTO  warehouse)
{
	this->warehouse = warehouse;
}

PartnerShipmentWarehouseDTO
ShipmentDTO::getWarehouseTo()
{
	return warehouseTo;
}

void
ShipmentDTO::setWarehouseTo(PartnerShipmentWarehouseDTO  warehouseTo)
{
	this->warehouseTo = warehouseTo;
}

std::string
ShipmentDTO::getExternalId()
{
	return externalId;
}

void
ShipmentDTO::setExternalId(std::string  externalId)
{
	this->externalId = externalId;
}

DeliveryServiceDTO
ShipmentDTO::getDeliveryService()
{
	return deliveryService;
}

void
ShipmentDTO::setDeliveryService(DeliveryServiceDTO  deliveryService)
{
	this->deliveryService = deliveryService;
}

PalletsCountDTO
ShipmentDTO::getPalletsCount()
{
	return palletsCount;
}

void
ShipmentDTO::setPalletsCount(PalletsCountDTO  palletsCount)
{
	this->palletsCount = palletsCount;
}

Set<long>
ShipmentDTO::getOrderIds()
{
	return orderIds;
}

void
ShipmentDTO::setOrderIds(Set <long> orderIds)
{
	this->orderIds = orderIds;
}

int
ShipmentDTO::getDraftCount()
{
	return draftCount;
}

void
ShipmentDTO::setDraftCount(int  draftCount)
{
	this->draftCount = draftCount;
}

int
ShipmentDTO::getPlannedCount()
{
	return plannedCount;
}

void
ShipmentDTO::setPlannedCount(int  plannedCount)
{
	this->plannedCount = plannedCount;
}

int
ShipmentDTO::getFactCount()
{
	return factCount;
}

void
ShipmentDTO::setFactCount(int  factCount)
{
	this->factCount = factCount;
}

ShipmentStatusChangeDTO
ShipmentDTO::getCurrentStatus()
{
	return currentStatus;
}

void
ShipmentDTO::setCurrentStatus(ShipmentStatusChangeDTO  currentStatus)
{
	this->currentStatus = currentStatus;
}

Set<ShipmentActionType>
ShipmentDTO::getAvailableActions()
{
	return availableActions;
}

void
ShipmentDTO::setAvailableActions(Set <ShipmentActionType> availableActions)
{
	this->availableActions = availableActions;
}



