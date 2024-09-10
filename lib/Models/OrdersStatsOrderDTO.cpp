

#include "OrdersStatsOrderDTO.h"

using namespace Tiny;

OrdersStatsOrderDTO::OrdersStatsOrderDTO()
{
	id = long(0);
	creationDate = std::string();
	statusUpdateDate = std::string();
	status = OrderStatsStatusType();
	partnerOrderId = std::string();
	paymentType = OrdersStatsOrderPaymentType();
	fake = bool(false);
	deliveryRegion = OrdersStatsDeliveryRegionDTO();
	items = std::list<OrdersStatsItemDTO>();
	initialItems = std::list<OrdersStatsItemDTO>();
	payments = std::list<OrdersStatsPaymentDTO>();
	commissions = std::list<OrdersStatsCommissionDTO>();
}

OrdersStatsOrderDTO::OrdersStatsOrderDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrdersStatsOrderDTO::~OrdersStatsOrderDTO()
{

}

void
OrdersStatsOrderDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *creationDateKey = "creationDate";

    if(object.has_key(creationDateKey))
    {
        bourne::json value = object[creationDateKey];




        Date* obj = &creationDate;
		obj->fromJson(value.dump());

    }

    const char *statusUpdateDateKey = "statusUpdateDate";

    if(object.has_key(statusUpdateDateKey))
    {
        bourne::json value = object[statusUpdateDateKey];



        jsonToValue(&statusUpdateDate, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        OrderStatsStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *partnerOrderIdKey = "partnerOrderId";

    if(object.has_key(partnerOrderIdKey))
    {
        bourne::json value = object[partnerOrderIdKey];



        jsonToValue(&partnerOrderId, value, "std::string");


    }

    const char *paymentTypeKey = "paymentType";

    if(object.has_key(paymentTypeKey))
    {
        bourne::json value = object[paymentTypeKey];




        OrdersStatsOrderPaymentType* obj = &paymentType;
		obj->fromJson(value.dump());

    }

    const char *fakeKey = "fake";

    if(object.has_key(fakeKey))
    {
        bourne::json value = object[fakeKey];



        jsonToValue(&fake, value, "bool");


    }

    const char *deliveryRegionKey = "deliveryRegion";

    if(object.has_key(deliveryRegionKey))
    {
        bourne::json value = object[deliveryRegionKey];




        OrdersStatsDeliveryRegionDTO* obj = &deliveryRegion;
		obj->fromJson(value.dump());

    }

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<OrdersStatsItemDTO> items_list;
        OrdersStatsItemDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }

    const char *initialItemsKey = "initialItems";

    if(object.has_key(initialItemsKey))
    {
        bourne::json value = object[initialItemsKey];


        std::list<OrdersStatsItemDTO> initialItems_list;
        OrdersStatsItemDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            initialItems_list.push_back(element);
        }
        initialItems = initialItems_list;


    }

    const char *paymentsKey = "payments";

    if(object.has_key(paymentsKey))
    {
        bourne::json value = object[paymentsKey];


        std::list<OrdersStatsPaymentDTO> payments_list;
        OrdersStatsPaymentDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            payments_list.push_back(element);
        }
        payments = payments_list;


    }

    const char *commissionsKey = "commissions";

    if(object.has_key(commissionsKey))
    {
        bourne::json value = object[commissionsKey];


        std::list<OrdersStatsCommissionDTO> commissions_list;
        OrdersStatsCommissionDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            commissions_list.push_back(element);
        }
        commissions = commissions_list;


    }


}

bourne::json
OrdersStatsOrderDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["creationDate"] = getCreationDate().toJson();





    object["statusUpdateDate"] = getStatusUpdateDate();







	object["status"] = getStatus().toJson();





    object["partnerOrderId"] = getPartnerOrderId();







	object["paymentType"] = getPaymentType().toJson();





    object["fake"] = isFake();







	object["deliveryRegion"] = getDeliveryRegion().toJson();




    std::list<OrdersStatsItemDTO> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        OrdersStatsItemDTO obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;






    std::list<OrdersStatsItemDTO> initialItems_list = getInitialItems();
    bourne::json initialItems_arr = bourne::json::array();

    for(auto& var : initialItems_list)
    {
        OrdersStatsItemDTO obj = var;
        initialItems_arr.append(obj.toJson());
    }
    object["initialItems"] = initialItems_arr;






    std::list<OrdersStatsPaymentDTO> payments_list = getPayments();
    bourne::json payments_arr = bourne::json::array();

    for(auto& var : payments_list)
    {
        OrdersStatsPaymentDTO obj = var;
        payments_arr.append(obj.toJson());
    }
    object["payments"] = payments_arr;






    std::list<OrdersStatsCommissionDTO> commissions_list = getCommissions();
    bourne::json commissions_arr = bourne::json::array();

    for(auto& var : commissions_list)
    {
        OrdersStatsCommissionDTO obj = var;
        commissions_arr.append(obj.toJson());
    }
    object["commissions"] = commissions_arr;




    return object;

}

long
OrdersStatsOrderDTO::getId()
{
	return id;
}

void
OrdersStatsOrderDTO::setId(long  id)
{
	this->id = id;
}

Date
OrdersStatsOrderDTO::getCreationDate()
{
	return creationDate;
}

void
OrdersStatsOrderDTO::setCreationDate(Date  creationDate)
{
	this->creationDate = creationDate;
}

std::string
OrdersStatsOrderDTO::getStatusUpdateDate()
{
	return statusUpdateDate;
}

void
OrdersStatsOrderDTO::setStatusUpdateDate(std::string  statusUpdateDate)
{
	this->statusUpdateDate = statusUpdateDate;
}

OrderStatsStatusType
OrdersStatsOrderDTO::getStatus()
{
	return status;
}

void
OrdersStatsOrderDTO::setStatus(OrderStatsStatusType  status)
{
	this->status = status;
}

std::string
OrdersStatsOrderDTO::getPartnerOrderId()
{
	return partnerOrderId;
}

void
OrdersStatsOrderDTO::setPartnerOrderId(std::string  partnerOrderId)
{
	this->partnerOrderId = partnerOrderId;
}

OrdersStatsOrderPaymentType
OrdersStatsOrderDTO::getPaymentType()
{
	return paymentType;
}

void
OrdersStatsOrderDTO::setPaymentType(OrdersStatsOrderPaymentType  paymentType)
{
	this->paymentType = paymentType;
}

bool
OrdersStatsOrderDTO::isFake()
{
	return fake;
}

void
OrdersStatsOrderDTO::setFake(bool  fake)
{
	this->fake = fake;
}

OrdersStatsDeliveryRegionDTO
OrdersStatsOrderDTO::getDeliveryRegion()
{
	return deliveryRegion;
}

void
OrdersStatsOrderDTO::setDeliveryRegion(OrdersStatsDeliveryRegionDTO  deliveryRegion)
{
	this->deliveryRegion = deliveryRegion;
}

std::list<OrdersStatsItemDTO>
OrdersStatsOrderDTO::getItems()
{
	return items;
}

void
OrdersStatsOrderDTO::setItems(std::list <OrdersStatsItemDTO> items)
{
	this->items = items;
}

std::list<OrdersStatsItemDTO>
OrdersStatsOrderDTO::getInitialItems()
{
	return initialItems;
}

void
OrdersStatsOrderDTO::setInitialItems(std::list <OrdersStatsItemDTO> initialItems)
{
	this->initialItems = initialItems;
}

std::list<OrdersStatsPaymentDTO>
OrdersStatsOrderDTO::getPayments()
{
	return payments;
}

void
OrdersStatsOrderDTO::setPayments(std::list <OrdersStatsPaymentDTO> payments)
{
	this->payments = payments;
}

std::list<OrdersStatsCommissionDTO>
OrdersStatsOrderDTO::getCommissions()
{
	return commissions;
}

void
OrdersStatsOrderDTO::setCommissions(std::list <OrdersStatsCommissionDTO> commissions)
{
	this->commissions = commissions;
}



