

#include "BaseShipmentDTO.h"

using namespace Tiny;

BaseShipmentDTO::BaseShipmentDTO()
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
}

BaseShipmentDTO::BaseShipmentDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

BaseShipmentDTO::~BaseShipmentDTO()
{

}

void
BaseShipmentDTO::fromJson(std::string jsonObj)
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


}

bourne::json
BaseShipmentDTO::toJson()
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



    return object;

}

long
BaseShipmentDTO::getId()
{
	return id;
}

void
BaseShipmentDTO::setId(long  id)
{
	this->id = id;
}

std::string
BaseShipmentDTO::getPlanIntervalFrom()
{
	return planIntervalFrom;
}

void
BaseShipmentDTO::setPlanIntervalFrom(std::string  planIntervalFrom)
{
	this->planIntervalFrom = planIntervalFrom;
}

std::string
BaseShipmentDTO::getPlanIntervalTo()
{
	return planIntervalTo;
}

void
BaseShipmentDTO::setPlanIntervalTo(std::string  planIntervalTo)
{
	this->planIntervalTo = planIntervalTo;
}

ShipmentType
BaseShipmentDTO::getShipmentType()
{
	return shipmentType;
}

void
BaseShipmentDTO::setShipmentType(ShipmentType  shipmentType)
{
	this->shipmentType = shipmentType;
}

PartnerShipmentWarehouseDTO
BaseShipmentDTO::getWarehouse()
{
	return warehouse;
}

void
BaseShipmentDTO::setWarehouse(PartnerShipmentWarehouseDTO  warehouse)
{
	this->warehouse = warehouse;
}

PartnerShipmentWarehouseDTO
BaseShipmentDTO::getWarehouseTo()
{
	return warehouseTo;
}

void
BaseShipmentDTO::setWarehouseTo(PartnerShipmentWarehouseDTO  warehouseTo)
{
	this->warehouseTo = warehouseTo;
}

std::string
BaseShipmentDTO::getExternalId()
{
	return externalId;
}

void
BaseShipmentDTO::setExternalId(std::string  externalId)
{
	this->externalId = externalId;
}

DeliveryServiceDTO
BaseShipmentDTO::getDeliveryService()
{
	return deliveryService;
}

void
BaseShipmentDTO::setDeliveryService(DeliveryServiceDTO  deliveryService)
{
	this->deliveryService = deliveryService;
}

PalletsCountDTO
BaseShipmentDTO::getPalletsCount()
{
	return palletsCount;
}

void
BaseShipmentDTO::setPalletsCount(PalletsCountDTO  palletsCount)
{
	this->palletsCount = palletsCount;
}

Set<long>
BaseShipmentDTO::getOrderIds()
{
	return orderIds;
}

void
BaseShipmentDTO::setOrderIds(Set <long> orderIds)
{
	this->orderIds = orderIds;
}

int
BaseShipmentDTO::getDraftCount()
{
	return draftCount;
}

void
BaseShipmentDTO::setDraftCount(int  draftCount)
{
	this->draftCount = draftCount;
}

int
BaseShipmentDTO::getPlannedCount()
{
	return plannedCount;
}

void
BaseShipmentDTO::setPlannedCount(int  plannedCount)
{
	this->plannedCount = plannedCount;
}

int
BaseShipmentDTO::getFactCount()
{
	return factCount;
}

void
BaseShipmentDTO::setFactCount(int  factCount)
{
	this->factCount = factCount;
}



