

#include "BriefOrderItemDTO.h"

using namespace Tiny;

BriefOrderItemDTO::BriefOrderItemDTO()
{
	id = long(0);
	vat = OrderVatType();
	count = int(0);
	price = float(0);
	offerName = std::string();
	offerId = std::string();
	instances = std::list<OrderItemInstanceDTO>();
}

BriefOrderItemDTO::BriefOrderItemDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

BriefOrderItemDTO::~BriefOrderItemDTO()
{

}

void
BriefOrderItemDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *vatKey = "vat";

    if(object.has_key(vatKey))
    {
        bourne::json value = object[vatKey];




        OrderVatType* obj = &vat;
		obj->fromJson(value.dump());

    }

    const char *countKey = "count";

    if(object.has_key(countKey))
    {
        bourne::json value = object[countKey];



        jsonToValue(&count, value, "int");


    }

    const char *priceKey = "price";

    if(object.has_key(priceKey))
    {
        bourne::json value = object[priceKey];



        jsonToValue(&price, value, "long");


    }

    const char *offerNameKey = "offerName";

    if(object.has_key(offerNameKey))
    {
        bourne::json value = object[offerNameKey];



        jsonToValue(&offerName, value, "std::string");


    }

    const char *offerIdKey = "offerId";

    if(object.has_key(offerIdKey))
    {
        bourne::json value = object[offerIdKey];



        jsonToValue(&offerId, value, "std::string");


    }

    const char *instancesKey = "instances";

    if(object.has_key(instancesKey))
    {
        bourne::json value = object[instancesKey];


        std::list<OrderItemInstanceDTO> instances_list;
        OrderItemInstanceDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            instances_list.push_back(element);
        }
        instances = instances_list;


    }


}

bourne::json
BriefOrderItemDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["vat"] = getVat().toJson();





    object["count"] = getCount();






    object["price"] = getPrice();






    object["offerName"] = getOfferName();






    object["offerId"] = getOfferId();





    std::list<OrderItemInstanceDTO> instances_list = getInstances();
    bourne::json instances_arr = bourne::json::array();

    for(auto& var : instances_list)
    {
        OrderItemInstanceDTO obj = var;
        instances_arr.append(obj.toJson());
    }
    object["instances"] = instances_arr;




    return object;

}

long
BriefOrderItemDTO::getId()
{
	return id;
}

void
BriefOrderItemDTO::setId(long  id)
{
	this->id = id;
}

OrderVatType
BriefOrderItemDTO::getVat()
{
	return vat;
}

void
BriefOrderItemDTO::setVat(OrderVatType  vat)
{
	this->vat = vat;
}

int
BriefOrderItemDTO::getCount()
{
	return count;
}

void
BriefOrderItemDTO::setCount(int  count)
{
	this->count = count;
}

long
BriefOrderItemDTO::getPrice()
{
	return price;
}

void
BriefOrderItemDTO::setPrice(long  price)
{
	this->price = price;
}

std::string
BriefOrderItemDTO::getOfferName()
{
	return offerName;
}

void
BriefOrderItemDTO::setOfferName(std::string  offerName)
{
	this->offerName = offerName;
}

std::string
BriefOrderItemDTO::getOfferId()
{
	return offerId;
}

void
BriefOrderItemDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

std::list<OrderItemInstanceDTO>
BriefOrderItemDTO::getInstances()
{
	return instances;
}

void
BriefOrderItemDTO::setInstances(std::list <OrderItemInstanceDTO> instances)
{
	this->instances = instances;
}



