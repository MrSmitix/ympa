

#include "ReturnDTO.h"

using namespace Tiny;

ReturnDTO::ReturnDTO()
{
	id = long(0);
	orderId = long(0);
	creationDate = std::string();
	updateDate = std::string();
	refundStatus = RefundStatusType();
	logisticPickupPoint = LogisticPickupPointDTO();
	shipmentRecipientType = RecipientType();
	shipmentStatus = ReturnShipmentStatusType();
	refundAmount = long(0);
	items = std::list<ReturnItemDTO>();
	returnType = ReturnType();
	fastReturn = bool(false);
}

ReturnDTO::ReturnDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ReturnDTO::~ReturnDTO()
{

}

void
ReturnDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *orderIdKey = "orderId";

    if(object.has_key(orderIdKey))
    {
        bourne::json value = object[orderIdKey];



        jsonToValue(&orderId, value, "long");


    }

    const char *creationDateKey = "creationDate";

    if(object.has_key(creationDateKey))
    {
        bourne::json value = object[creationDateKey];



        jsonToValue(&creationDate, value, "std::string");


    }

    const char *updateDateKey = "updateDate";

    if(object.has_key(updateDateKey))
    {
        bourne::json value = object[updateDateKey];



        jsonToValue(&updateDate, value, "std::string");


    }

    const char *refundStatusKey = "refundStatus";

    if(object.has_key(refundStatusKey))
    {
        bourne::json value = object[refundStatusKey];




        RefundStatusType* obj = &refundStatus;
		obj->fromJson(value.dump());

    }

    const char *logisticPickupPointKey = "logisticPickupPoint";

    if(object.has_key(logisticPickupPointKey))
    {
        bourne::json value = object[logisticPickupPointKey];




        LogisticPickupPointDTO* obj = &logisticPickupPoint;
		obj->fromJson(value.dump());

    }

    const char *shipmentRecipientTypeKey = "shipmentRecipientType";

    if(object.has_key(shipmentRecipientTypeKey))
    {
        bourne::json value = object[shipmentRecipientTypeKey];




        RecipientType* obj = &shipmentRecipientType;
		obj->fromJson(value.dump());

    }

    const char *shipmentStatusKey = "shipmentStatus";

    if(object.has_key(shipmentStatusKey))
    {
        bourne::json value = object[shipmentStatusKey];




        ReturnShipmentStatusType* obj = &shipmentStatus;
		obj->fromJson(value.dump());

    }

    const char *refundAmountKey = "refundAmount";

    if(object.has_key(refundAmountKey))
    {
        bourne::json value = object[refundAmountKey];



        jsonToValue(&refundAmount, value, "long");


    }

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<ReturnItemDTO> items_list;
        ReturnItemDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }

    const char *returnTypeKey = "returnType";

    if(object.has_key(returnTypeKey))
    {
        bourne::json value = object[returnTypeKey];




        ReturnType* obj = &returnType;
		obj->fromJson(value.dump());

    }

    const char *fastReturnKey = "fastReturn";

    if(object.has_key(fastReturnKey))
    {
        bourne::json value = object[fastReturnKey];



        jsonToValue(&fastReturn, value, "bool");


    }


}

bourne::json
ReturnDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["orderId"] = getOrderId();






    object["creationDate"] = getCreationDate();






    object["updateDate"] = getUpdateDate();







	object["refundStatus"] = getRefundStatus().toJson();






	object["logisticPickupPoint"] = getLogisticPickupPoint().toJson();






	object["shipmentRecipientType"] = getShipmentRecipientType().toJson();






	object["shipmentStatus"] = getShipmentStatus().toJson();





    object["refundAmount"] = getRefundAmount();





    std::list<ReturnItemDTO> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        ReturnItemDTO obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;








	object["returnType"] = getReturnType().toJson();





    object["fastReturn"] = isFastReturn();



    return object;

}

long
ReturnDTO::getId()
{
	return id;
}

void
ReturnDTO::setId(long  id)
{
	this->id = id;
}

long
ReturnDTO::getOrderId()
{
	return orderId;
}

void
ReturnDTO::setOrderId(long  orderId)
{
	this->orderId = orderId;
}

std::string
ReturnDTO::getCreationDate()
{
	return creationDate;
}

void
ReturnDTO::setCreationDate(std::string  creationDate)
{
	this->creationDate = creationDate;
}

std::string
ReturnDTO::getUpdateDate()
{
	return updateDate;
}

void
ReturnDTO::setUpdateDate(std::string  updateDate)
{
	this->updateDate = updateDate;
}

RefundStatusType
ReturnDTO::getRefundStatus()
{
	return refundStatus;
}

void
ReturnDTO::setRefundStatus(RefundStatusType  refundStatus)
{
	this->refundStatus = refundStatus;
}

LogisticPickupPointDTO
ReturnDTO::getLogisticPickupPoint()
{
	return logisticPickupPoint;
}

void
ReturnDTO::setLogisticPickupPoint(LogisticPickupPointDTO  logisticPickupPoint)
{
	this->logisticPickupPoint = logisticPickupPoint;
}

RecipientType
ReturnDTO::getShipmentRecipientType()
{
	return shipmentRecipientType;
}

void
ReturnDTO::setShipmentRecipientType(RecipientType  shipmentRecipientType)
{
	this->shipmentRecipientType = shipmentRecipientType;
}

ReturnShipmentStatusType
ReturnDTO::getShipmentStatus()
{
	return shipmentStatus;
}

void
ReturnDTO::setShipmentStatus(ReturnShipmentStatusType  shipmentStatus)
{
	this->shipmentStatus = shipmentStatus;
}

long
ReturnDTO::getRefundAmount()
{
	return refundAmount;
}

void
ReturnDTO::setRefundAmount(long  refundAmount)
{
	this->refundAmount = refundAmount;
}

std::list<ReturnItemDTO>
ReturnDTO::getItems()
{
	return items;
}

void
ReturnDTO::setItems(std::list <ReturnItemDTO> items)
{
	this->items = items;
}

ReturnType
ReturnDTO::getReturnType()
{
	return returnType;
}

void
ReturnDTO::setReturnType(ReturnType  returnType)
{
	this->returnType = returnType;
}

bool
ReturnDTO::isFastReturn()
{
	return fastReturn;
}

void
ReturnDTO::setFastReturn(bool  fastReturn)
{
	this->fastReturn = fastReturn;
}



