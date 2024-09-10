

#include "ShipmentInfoDTO.h"

using namespace Tiny;

ShipmentInfoDTO::ShipmentInfoDTO()
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
	status = ShipmentStatusType();
	statusDescription = std::string();
	statusUpdateTime = std::string();
}

ShipmentInfoDTO::ShipmentInfoDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ShipmentInfoDTO::~ShipmentInfoDTO()
{

}

void
ShipmentInfoDTO::fromJson(std::string jsonObj)
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

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        ShipmentStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *statusDescriptionKey = "statusDescription";

    if(object.has_key(statusDescriptionKey))
    {
        bourne::json value = object[statusDescriptionKey];



        jsonToValue(&statusDescription, value, "std::string");


    }

    const char *statusUpdateTimeKey = "statusUpdateTime";

    if(object.has_key(statusUpdateTimeKey))
    {
        bourne::json value = object[statusUpdateTimeKey];



        jsonToValue(&statusUpdateTime, value, "std::string");


    }


}

bourne::json
ShipmentInfoDTO::toJson()
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







	object["status"] = getStatus().toJson();





    object["statusDescription"] = getStatusDescription();






    object["statusUpdateTime"] = getStatusUpdateTime();



    return object;

}

long
ShipmentInfoDTO::getId()
{
	return id;
}

void
ShipmentInfoDTO::setId(long  id)
{
	this->id = id;
}

std::string
ShipmentInfoDTO::getPlanIntervalFrom()
{
	return planIntervalFrom;
}

void
ShipmentInfoDTO::setPlanIntervalFrom(std::string  planIntervalFrom)
{
	this->planIntervalFrom = planIntervalFrom;
}

std::string
ShipmentInfoDTO::getPlanIntervalTo()
{
	return planIntervalTo;
}

void
ShipmentInfoDTO::setPlanIntervalTo(std::string  planIntervalTo)
{
	this->planIntervalTo = planIntervalTo;
}

ShipmentType
ShipmentInfoDTO::getShipmentType()
{
	return shipmentType;
}

void
ShipmentInfoDTO::setShipmentType(ShipmentType  shipmentType)
{
	this->shipmentType = shipmentType;
}

PartnerShipmentWarehouseDTO
ShipmentInfoDTO::getWarehouse()
{
	return warehouse;
}

void
ShipmentInfoDTO::setWarehouse(PartnerShipmentWarehouseDTO  warehouse)
{
	this->warehouse = warehouse;
}

PartnerShipmentWarehouseDTO
ShipmentInfoDTO::getWarehouseTo()
{
	return warehouseTo;
}

void
ShipmentInfoDTO::setWarehouseTo(PartnerShipmentWarehouseDTO  warehouseTo)
{
	this->warehouseTo = warehouseTo;
}

std::string
ShipmentInfoDTO::getExternalId()
{
	return externalId;
}

void
ShipmentInfoDTO::setExternalId(std::string  externalId)
{
	this->externalId = externalId;
}

DeliveryServiceDTO
ShipmentInfoDTO::getDeliveryService()
{
	return deliveryService;
}

void
ShipmentInfoDTO::setDeliveryService(DeliveryServiceDTO  deliveryService)
{
	this->deliveryService = deliveryService;
}

PalletsCountDTO
ShipmentInfoDTO::getPalletsCount()
{
	return palletsCount;
}

void
ShipmentInfoDTO::setPalletsCount(PalletsCountDTO  palletsCount)
{
	this->palletsCount = palletsCount;
}

Set<long>
ShipmentInfoDTO::getOrderIds()
{
	return orderIds;
}

void
ShipmentInfoDTO::setOrderIds(Set <long> orderIds)
{
	this->orderIds = orderIds;
}

int
ShipmentInfoDTO::getDraftCount()
{
	return draftCount;
}

void
ShipmentInfoDTO::setDraftCount(int  draftCount)
{
	this->draftCount = draftCount;
}

int
ShipmentInfoDTO::getPlannedCount()
{
	return plannedCount;
}

void
ShipmentInfoDTO::setPlannedCount(int  plannedCount)
{
	this->plannedCount = plannedCount;
}

int
ShipmentInfoDTO::getFactCount()
{
	return factCount;
}

void
ShipmentInfoDTO::setFactCount(int  factCount)
{
	this->factCount = factCount;
}

ShipmentStatusType
ShipmentInfoDTO::getStatus()
{
	return status;
}

void
ShipmentInfoDTO::setStatus(ShipmentStatusType  status)
{
	this->status = status;
}

std::string
ShipmentInfoDTO::getStatusDescription()
{
	return statusDescription;
}

void
ShipmentInfoDTO::setStatusDescription(std::string  statusDescription)
{
	this->statusDescription = statusDescription;
}

std::string
ShipmentInfoDTO::getStatusUpdateTime()
{
	return statusUpdateTime;
}

void
ShipmentInfoDTO::setStatusUpdateTime(std::string  statusUpdateTime)
{
	this->statusUpdateTime = statusUpdateTime;
}



