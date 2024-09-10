

#include "OrderItemDetailDTO.h"

using namespace Tiny;

OrderItemDetailDTO::OrderItemDetailDTO()
{
	itemCount = long(0);
	itemStatus = OrderItemStatusType();
	updateDate = std::string();
}

OrderItemDetailDTO::OrderItemDetailDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderItemDetailDTO::~OrderItemDetailDTO()
{

}

void
OrderItemDetailDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemCountKey = "itemCount";

    if(object.has_key(itemCountKey))
    {
        bourne::json value = object[itemCountKey];



        jsonToValue(&itemCount, value, "long");


    }

    const char *itemStatusKey = "itemStatus";

    if(object.has_key(itemStatusKey))
    {
        bourne::json value = object[itemStatusKey];




        OrderItemStatusType* obj = &itemStatus;
		obj->fromJson(value.dump());

    }

    const char *updateDateKey = "updateDate";

    if(object.has_key(updateDateKey))
    {
        bourne::json value = object[updateDateKey];



        jsonToValue(&updateDate, value, "std::string");


    }


}

bourne::json
OrderItemDetailDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["itemCount"] = getItemCount();







	object["itemStatus"] = getItemStatus().toJson();





    object["updateDate"] = getUpdateDate();



    return object;

}

long
OrderItemDetailDTO::getItemCount()
{
	return itemCount;
}

void
OrderItemDetailDTO::setItemCount(long  itemCount)
{
	this->itemCount = itemCount;
}

OrderItemStatusType
OrderItemDetailDTO::getItemStatus()
{
	return itemStatus;
}

void
OrderItemDetailDTO::setItemStatus(OrderItemStatusType  itemStatus)
{
	this->itemStatus = itemStatus;
}

std::string
OrderItemDetailDTO::getUpdateDate()
{
	return updateDate;
}

void
OrderItemDetailDTO::setUpdateDate(std::string  updateDate)
{
	this->updateDate = updateDate;
}



