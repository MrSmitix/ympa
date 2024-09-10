

#include "ParcelBoxLabelDTO.h"

using namespace Tiny;

ParcelBoxLabelDTO::ParcelBoxLabelDTO()
{
	url = std::string();
	supplierName = std::string();
	deliveryServiceName = std::string();
	orderId = long(0);
	orderNum = std::string();
	recipientName = std::string();
	boxId = long(0);
	fulfilmentId = std::string();
	place = std::string();
	weight = std::string();
	deliveryServiceId = std::string();
	deliveryAddress = std::string();
	shipmentDate = std::string();
}

ParcelBoxLabelDTO::ParcelBoxLabelDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ParcelBoxLabelDTO::~ParcelBoxLabelDTO()
{

}

void
ParcelBoxLabelDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }

    const char *supplierNameKey = "supplierName";

    if(object.has_key(supplierNameKey))
    {
        bourne::json value = object[supplierNameKey];



        jsonToValue(&supplierName, value, "std::string");


    }

    const char *deliveryServiceNameKey = "deliveryServiceName";

    if(object.has_key(deliveryServiceNameKey))
    {
        bourne::json value = object[deliveryServiceNameKey];



        jsonToValue(&deliveryServiceName, value, "std::string");


    }

    const char *orderIdKey = "orderId";

    if(object.has_key(orderIdKey))
    {
        bourne::json value = object[orderIdKey];



        jsonToValue(&orderId, value, "long");


    }

    const char *orderNumKey = "orderNum";

    if(object.has_key(orderNumKey))
    {
        bourne::json value = object[orderNumKey];



        jsonToValue(&orderNum, value, "std::string");


    }

    const char *recipientNameKey = "recipientName";

    if(object.has_key(recipientNameKey))
    {
        bourne::json value = object[recipientNameKey];



        jsonToValue(&recipientName, value, "std::string");


    }

    const char *boxIdKey = "boxId";

    if(object.has_key(boxIdKey))
    {
        bourne::json value = object[boxIdKey];



        jsonToValue(&boxId, value, "long");


    }

    const char *fulfilmentIdKey = "fulfilmentId";

    if(object.has_key(fulfilmentIdKey))
    {
        bourne::json value = object[fulfilmentIdKey];



        jsonToValue(&fulfilmentId, value, "std::string");


    }

    const char *placeKey = "place";

    if(object.has_key(placeKey))
    {
        bourne::json value = object[placeKey];



        jsonToValue(&place, value, "std::string");


    }

    const char *weightKey = "weight";

    if(object.has_key(weightKey))
    {
        bourne::json value = object[weightKey];



        jsonToValue(&weight, value, "std::string");


    }

    const char *deliveryServiceIdKey = "deliveryServiceId";

    if(object.has_key(deliveryServiceIdKey))
    {
        bourne::json value = object[deliveryServiceIdKey];



        jsonToValue(&deliveryServiceId, value, "std::string");


    }

    const char *deliveryAddressKey = "deliveryAddress";

    if(object.has_key(deliveryAddressKey))
    {
        bourne::json value = object[deliveryAddressKey];



        jsonToValue(&deliveryAddress, value, "std::string");


    }

    const char *shipmentDateKey = "shipmentDate";

    if(object.has_key(shipmentDateKey))
    {
        bourne::json value = object[shipmentDateKey];



        jsonToValue(&shipmentDate, value, "std::string");


    }


}

bourne::json
ParcelBoxLabelDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["url"] = getUrl();






    object["supplierName"] = getSupplierName();






    object["deliveryServiceName"] = getDeliveryServiceName();






    object["orderId"] = getOrderId();






    object["orderNum"] = getOrderNum();






    object["recipientName"] = getRecipientName();






    object["boxId"] = getBoxId();






    object["fulfilmentId"] = getFulfilmentId();






    object["place"] = getPlace();






    object["weight"] = getWeight();






    object["deliveryServiceId"] = getDeliveryServiceId();






    object["deliveryAddress"] = getDeliveryAddress();






    object["shipmentDate"] = getShipmentDate();



    return object;

}

std::string
ParcelBoxLabelDTO::getUrl()
{
	return url;
}

void
ParcelBoxLabelDTO::setUrl(std::string  url)
{
	this->url = url;
}

std::string
ParcelBoxLabelDTO::getSupplierName()
{
	return supplierName;
}

void
ParcelBoxLabelDTO::setSupplierName(std::string  supplierName)
{
	this->supplierName = supplierName;
}

std::string
ParcelBoxLabelDTO::getDeliveryServiceName()
{
	return deliveryServiceName;
}

void
ParcelBoxLabelDTO::setDeliveryServiceName(std::string  deliveryServiceName)
{
	this->deliveryServiceName = deliveryServiceName;
}

long
ParcelBoxLabelDTO::getOrderId()
{
	return orderId;
}

void
ParcelBoxLabelDTO::setOrderId(long  orderId)
{
	this->orderId = orderId;
}

std::string
ParcelBoxLabelDTO::getOrderNum()
{
	return orderNum;
}

void
ParcelBoxLabelDTO::setOrderNum(std::string  orderNum)
{
	this->orderNum = orderNum;
}

std::string
ParcelBoxLabelDTO::getRecipientName()
{
	return recipientName;
}

void
ParcelBoxLabelDTO::setRecipientName(std::string  recipientName)
{
	this->recipientName = recipientName;
}

long
ParcelBoxLabelDTO::getBoxId()
{
	return boxId;
}

void
ParcelBoxLabelDTO::setBoxId(long  boxId)
{
	this->boxId = boxId;
}

std::string
ParcelBoxLabelDTO::getFulfilmentId()
{
	return fulfilmentId;
}

void
ParcelBoxLabelDTO::setFulfilmentId(std::string  fulfilmentId)
{
	this->fulfilmentId = fulfilmentId;
}

std::string
ParcelBoxLabelDTO::getPlace()
{
	return place;
}

void
ParcelBoxLabelDTO::setPlace(std::string  place)
{
	this->place = place;
}

std::string
ParcelBoxLabelDTO::getWeight()
{
	return weight;
}

void
ParcelBoxLabelDTO::setWeight(std::string  weight)
{
	this->weight = weight;
}

std::string
ParcelBoxLabelDTO::getDeliveryServiceId()
{
	return deliveryServiceId;
}

void
ParcelBoxLabelDTO::setDeliveryServiceId(std::string  deliveryServiceId)
{
	this->deliveryServiceId = deliveryServiceId;
}

std::string
ParcelBoxLabelDTO::getDeliveryAddress()
{
	return deliveryAddress;
}

void
ParcelBoxLabelDTO::setDeliveryAddress(std::string  deliveryAddress)
{
	this->deliveryAddress = deliveryAddress;
}

std::string
ParcelBoxLabelDTO::getShipmentDate()
{
	return shipmentDate;
}

void
ParcelBoxLabelDTO::setShipmentDate(std::string  shipmentDate)
{
	this->shipmentDate = shipmentDate;
}



