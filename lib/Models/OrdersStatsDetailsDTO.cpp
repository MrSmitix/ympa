

#include "OrdersStatsDetailsDTO.h"

using namespace Tiny;

OrdersStatsDetailsDTO::OrdersStatsDetailsDTO()
{
	itemStatus = OrdersStatsItemStatusType();
	itemCount = long(0);
	updateDate = std::string();
	stockType = OrdersStatsStockType();
}

OrdersStatsDetailsDTO::OrdersStatsDetailsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrdersStatsDetailsDTO::~OrdersStatsDetailsDTO()
{

}

void
OrdersStatsDetailsDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemStatusKey = "itemStatus";

    if(object.has_key(itemStatusKey))
    {
        bourne::json value = object[itemStatusKey];




        OrdersStatsItemStatusType* obj = &itemStatus;
		obj->fromJson(value.dump());

    }

    const char *itemCountKey = "itemCount";

    if(object.has_key(itemCountKey))
    {
        bourne::json value = object[itemCountKey];



        jsonToValue(&itemCount, value, "long");


    }

    const char *updateDateKey = "updateDate";

    if(object.has_key(updateDateKey))
    {
        bourne::json value = object[updateDateKey];




        Date* obj = &updateDate;
		obj->fromJson(value.dump());

    }

    const char *stockTypeKey = "stockType";

    if(object.has_key(stockTypeKey))
    {
        bourne::json value = object[stockTypeKey];




        OrdersStatsStockType* obj = &stockType;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrdersStatsDetailsDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["itemStatus"] = getItemStatus().toJson();





    object["itemCount"] = getItemCount();







	object["updateDate"] = getUpdateDate().toJson();






	object["stockType"] = getStockType().toJson();


    return object;

}

OrdersStatsItemStatusType
OrdersStatsDetailsDTO::getItemStatus()
{
	return itemStatus;
}

void
OrdersStatsDetailsDTO::setItemStatus(OrdersStatsItemStatusType  itemStatus)
{
	this->itemStatus = itemStatus;
}

long
OrdersStatsDetailsDTO::getItemCount()
{
	return itemCount;
}

void
OrdersStatsDetailsDTO::setItemCount(long  itemCount)
{
	this->itemCount = itemCount;
}

Date
OrdersStatsDetailsDTO::getUpdateDate()
{
	return updateDate;
}

void
OrdersStatsDetailsDTO::setUpdateDate(Date  updateDate)
{
	this->updateDate = updateDate;
}

OrdersStatsStockType
OrdersStatsDetailsDTO::getStockType()
{
	return stockType;
}

void
OrdersStatsDetailsDTO::setStockType(OrdersStatsStockType  stockType)
{
	this->stockType = stockType;
}



