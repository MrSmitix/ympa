

#include "OrderDTO.h"

using namespace Tiny;

OrderDTO::OrderDTO()
{
	id = long(0);
	status = OrderStatusType();
	substatus = OrderSubstatusType();
	creationDate = std::string();
	updatedAt = std::string();
	currency = CurrencyType();
	itemsTotal = float(0);
	deliveryTotal = float(0);
	buyerItemsTotal = float(0);
	buyerTotal = float(0);
	buyerItemsTotalBeforeDiscount = float(0);
	buyerTotalBeforeDiscount = float(0);
	paymentType = OrderPaymentType();
	paymentMethod = OrderPaymentMethodType();
	fake = bool(false);
	items = std::list<OrderItemDTO>();
	subsidies = std::list<OrderSubsidyDTO>();
	delivery = OrderDeliveryDTO();
	buyer = OrderBuyerDTO();
	notes = std::string();
	taxSystem = OrderTaxSystemType();
	cancelRequested = bool(false);
	expiryDate = std::string();
}

OrderDTO::OrderDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderDTO::~OrderDTO()
{

}

void
OrderDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        OrderStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *substatusKey = "substatus";

    if(object.has_key(substatusKey))
    {
        bourne::json value = object[substatusKey];




        OrderSubstatusType* obj = &substatus;
		obj->fromJson(value.dump());

    }

    const char *creationDateKey = "creationDate";

    if(object.has_key(creationDateKey))
    {
        bourne::json value = object[creationDateKey];



        jsonToValue(&creationDate, value, "std::string");


    }

    const char *updatedAtKey = "updatedAt";

    if(object.has_key(updatedAtKey))
    {
        bourne::json value = object[updatedAtKey];



        jsonToValue(&updatedAt, value, "std::string");


    }

    const char *currencyKey = "currency";

    if(object.has_key(currencyKey))
    {
        bourne::json value = object[currencyKey];




        CurrencyType* obj = &currency;
		obj->fromJson(value.dump());

    }

    const char *itemsTotalKey = "itemsTotal";

    if(object.has_key(itemsTotalKey))
    {
        bourne::json value = object[itemsTotalKey];



        jsonToValue(&itemsTotal, value, "long");


    }

    const char *deliveryTotalKey = "deliveryTotal";

    if(object.has_key(deliveryTotalKey))
    {
        bourne::json value = object[deliveryTotalKey];



        jsonToValue(&deliveryTotal, value, "long");


    }

    const char *buyerItemsTotalKey = "buyerItemsTotal";

    if(object.has_key(buyerItemsTotalKey))
    {
        bourne::json value = object[buyerItemsTotalKey];



        jsonToValue(&buyerItemsTotal, value, "long");


    }

    const char *buyerTotalKey = "buyerTotal";

    if(object.has_key(buyerTotalKey))
    {
        bourne::json value = object[buyerTotalKey];



        jsonToValue(&buyerTotal, value, "long");


    }

    const char *buyerItemsTotalBeforeDiscountKey = "buyerItemsTotalBeforeDiscount";

    if(object.has_key(buyerItemsTotalBeforeDiscountKey))
    {
        bourne::json value = object[buyerItemsTotalBeforeDiscountKey];



        jsonToValue(&buyerItemsTotalBeforeDiscount, value, "long");


    }

    const char *buyerTotalBeforeDiscountKey = "buyerTotalBeforeDiscount";

    if(object.has_key(buyerTotalBeforeDiscountKey))
    {
        bourne::json value = object[buyerTotalBeforeDiscountKey];



        jsonToValue(&buyerTotalBeforeDiscount, value, "long");


    }

    const char *paymentTypeKey = "paymentType";

    if(object.has_key(paymentTypeKey))
    {
        bourne::json value = object[paymentTypeKey];




        OrderPaymentType* obj = &paymentType;
		obj->fromJson(value.dump());

    }

    const char *paymentMethodKey = "paymentMethod";

    if(object.has_key(paymentMethodKey))
    {
        bourne::json value = object[paymentMethodKey];




        OrderPaymentMethodType* obj = &paymentMethod;
		obj->fromJson(value.dump());

    }

    const char *fakeKey = "fake";

    if(object.has_key(fakeKey))
    {
        bourne::json value = object[fakeKey];



        jsonToValue(&fake, value, "bool");


    }

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<OrderItemDTO> items_list;
        OrderItemDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }

    const char *subsidiesKey = "subsidies";

    if(object.has_key(subsidiesKey))
    {
        bourne::json value = object[subsidiesKey];


        std::list<OrderSubsidyDTO> subsidies_list;
        OrderSubsidyDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            subsidies_list.push_back(element);
        }
        subsidies = subsidies_list;


    }

    const char *deliveryKey = "delivery";

    if(object.has_key(deliveryKey))
    {
        bourne::json value = object[deliveryKey];




        OrderDeliveryDTO* obj = &delivery;
		obj->fromJson(value.dump());

    }

    const char *buyerKey = "buyer";

    if(object.has_key(buyerKey))
    {
        bourne::json value = object[buyerKey];




        OrderBuyerDTO* obj = &buyer;
		obj->fromJson(value.dump());

    }

    const char *notesKey = "notes";

    if(object.has_key(notesKey))
    {
        bourne::json value = object[notesKey];



        jsonToValue(&notes, value, "std::string");


    }

    const char *taxSystemKey = "taxSystem";

    if(object.has_key(taxSystemKey))
    {
        bourne::json value = object[taxSystemKey];




        OrderTaxSystemType* obj = &taxSystem;
		obj->fromJson(value.dump());

    }

    const char *cancelRequestedKey = "cancelRequested";

    if(object.has_key(cancelRequestedKey))
    {
        bourne::json value = object[cancelRequestedKey];



        jsonToValue(&cancelRequested, value, "bool");


    }

    const char *expiryDateKey = "expiryDate";

    if(object.has_key(expiryDateKey))
    {
        bourne::json value = object[expiryDateKey];



        jsonToValue(&expiryDate, value, "std::string");


    }


}

bourne::json
OrderDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["status"] = getStatus().toJson();






	object["substatus"] = getSubstatus().toJson();





    object["creationDate"] = getCreationDate();






    object["updatedAt"] = getUpdatedAt();







	object["currency"] = getCurrency().toJson();





    object["itemsTotal"] = getItemsTotal();






    object["deliveryTotal"] = getDeliveryTotal();






    object["buyerItemsTotal"] = getBuyerItemsTotal();






    object["buyerTotal"] = getBuyerTotal();






    object["buyerItemsTotalBeforeDiscount"] = getBuyerItemsTotalBeforeDiscount();






    object["buyerTotalBeforeDiscount"] = getBuyerTotalBeforeDiscount();







	object["paymentType"] = getPaymentType().toJson();






	object["paymentMethod"] = getPaymentMethod().toJson();





    object["fake"] = isFake();





    std::list<OrderItemDTO> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        OrderItemDTO obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;






    std::list<OrderSubsidyDTO> subsidies_list = getSubsidies();
    bourne::json subsidies_arr = bourne::json::array();

    for(auto& var : subsidies_list)
    {
        OrderSubsidyDTO obj = var;
        subsidies_arr.append(obj.toJson());
    }
    object["subsidies"] = subsidies_arr;








	object["delivery"] = getDelivery().toJson();






	object["buyer"] = getBuyer().toJson();





    object["notes"] = getNotes();







	object["taxSystem"] = getTaxSystem().toJson();





    object["cancelRequested"] = isCancelRequested();






    object["expiryDate"] = getExpiryDate();



    return object;

}

long
OrderDTO::getId()
{
	return id;
}

void
OrderDTO::setId(long  id)
{
	this->id = id;
}

OrderStatusType
OrderDTO::getStatus()
{
	return status;
}

void
OrderDTO::setStatus(OrderStatusType  status)
{
	this->status = status;
}

OrderSubstatusType
OrderDTO::getSubstatus()
{
	return substatus;
}

void
OrderDTO::setSubstatus(OrderSubstatusType  substatus)
{
	this->substatus = substatus;
}

std::string
OrderDTO::getCreationDate()
{
	return creationDate;
}

void
OrderDTO::setCreationDate(std::string  creationDate)
{
	this->creationDate = creationDate;
}

std::string
OrderDTO::getUpdatedAt()
{
	return updatedAt;
}

void
OrderDTO::setUpdatedAt(std::string  updatedAt)
{
	this->updatedAt = updatedAt;
}

CurrencyType
OrderDTO::getCurrency()
{
	return currency;
}

void
OrderDTO::setCurrency(CurrencyType  currency)
{
	this->currency = currency;
}

long
OrderDTO::getItemsTotal()
{
	return itemsTotal;
}

void
OrderDTO::setItemsTotal(long  itemsTotal)
{
	this->itemsTotal = itemsTotal;
}

long
OrderDTO::getDeliveryTotal()
{
	return deliveryTotal;
}

void
OrderDTO::setDeliveryTotal(long  deliveryTotal)
{
	this->deliveryTotal = deliveryTotal;
}

long
OrderDTO::getBuyerItemsTotal()
{
	return buyerItemsTotal;
}

void
OrderDTO::setBuyerItemsTotal(long  buyerItemsTotal)
{
	this->buyerItemsTotal = buyerItemsTotal;
}

long
OrderDTO::getBuyerTotal()
{
	return buyerTotal;
}

void
OrderDTO::setBuyerTotal(long  buyerTotal)
{
	this->buyerTotal = buyerTotal;
}

long
OrderDTO::getBuyerItemsTotalBeforeDiscount()
{
	return buyerItemsTotalBeforeDiscount;
}

void
OrderDTO::setBuyerItemsTotalBeforeDiscount(long  buyerItemsTotalBeforeDiscount)
{
	this->buyerItemsTotalBeforeDiscount = buyerItemsTotalBeforeDiscount;
}

long
OrderDTO::getBuyerTotalBeforeDiscount()
{
	return buyerTotalBeforeDiscount;
}

void
OrderDTO::setBuyerTotalBeforeDiscount(long  buyerTotalBeforeDiscount)
{
	this->buyerTotalBeforeDiscount = buyerTotalBeforeDiscount;
}

OrderPaymentType
OrderDTO::getPaymentType()
{
	return paymentType;
}

void
OrderDTO::setPaymentType(OrderPaymentType  paymentType)
{
	this->paymentType = paymentType;
}

OrderPaymentMethodType
OrderDTO::getPaymentMethod()
{
	return paymentMethod;
}

void
OrderDTO::setPaymentMethod(OrderPaymentMethodType  paymentMethod)
{
	this->paymentMethod = paymentMethod;
}

bool
OrderDTO::isFake()
{
	return fake;
}

void
OrderDTO::setFake(bool  fake)
{
	this->fake = fake;
}

std::list<OrderItemDTO>
OrderDTO::getItems()
{
	return items;
}

void
OrderDTO::setItems(std::list <OrderItemDTO> items)
{
	this->items = items;
}

std::list<OrderSubsidyDTO>
OrderDTO::getSubsidies()
{
	return subsidies;
}

void
OrderDTO::setSubsidies(std::list <OrderSubsidyDTO> subsidies)
{
	this->subsidies = subsidies;
}

OrderDeliveryDTO
OrderDTO::getDelivery()
{
	return delivery;
}

void
OrderDTO::setDelivery(OrderDeliveryDTO  delivery)
{
	this->delivery = delivery;
}

OrderBuyerDTO
OrderDTO::getBuyer()
{
	return buyer;
}

void
OrderDTO::setBuyer(OrderBuyerDTO  buyer)
{
	this->buyer = buyer;
}

std::string
OrderDTO::getNotes()
{
	return notes;
}

void
OrderDTO::setNotes(std::string  notes)
{
	this->notes = notes;
}

OrderTaxSystemType
OrderDTO::getTaxSystem()
{
	return taxSystem;
}

void
OrderDTO::setTaxSystem(OrderTaxSystemType  taxSystem)
{
	this->taxSystem = taxSystem;
}

bool
OrderDTO::isCancelRequested()
{
	return cancelRequested;
}

void
OrderDTO::setCancelRequested(bool  cancelRequested)
{
	this->cancelRequested = cancelRequested;
}

std::string
OrderDTO::getExpiryDate()
{
	return expiryDate;
}

void
OrderDTO::setExpiryDate(std::string  expiryDate)
{
	this->expiryDate = expiryDate;
}



