

#include "OrderItemDTO.h"

using namespace Tiny;

OrderItemDTO::OrderItemDTO()
{
	id = long(0);
	offerId = std::string();
	offerName = std::string();
	price = float(0);
	buyerPrice = float(0);
	buyerPriceBeforeDiscount = float(0);
	priceBeforeDiscount = float(0);
	count = int(0);
	vat = OrderVatType();
	shopSku = std::string();
	subsidy = float(0);
	partnerWarehouseId = std::string();
	promos = std::list<OrderItemPromoDTO>();
	instances = std::list<OrderItemInstanceDTO>();
	details = std::list<OrderItemDetailDTO>();
	subsidies = std::list<OrderItemSubsidyDTO>();
	requiredInstanceTypes = std::list<OrderItemInstanceType>();
}

OrderItemDTO::OrderItemDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderItemDTO::~OrderItemDTO()
{

}

void
OrderItemDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *offerIdKey = "offerId";

    if(object.has_key(offerIdKey))
    {
        bourne::json value = object[offerIdKey];



        jsonToValue(&offerId, value, "std::string");


    }

    const char *offerNameKey = "offerName";

    if(object.has_key(offerNameKey))
    {
        bourne::json value = object[offerNameKey];



        jsonToValue(&offerName, value, "std::string");


    }

    const char *priceKey = "price";

    if(object.has_key(priceKey))
    {
        bourne::json value = object[priceKey];



        jsonToValue(&price, value, "long");


    }

    const char *buyerPriceKey = "buyerPrice";

    if(object.has_key(buyerPriceKey))
    {
        bourne::json value = object[buyerPriceKey];



        jsonToValue(&buyerPrice, value, "long");


    }

    const char *buyerPriceBeforeDiscountKey = "buyerPriceBeforeDiscount";

    if(object.has_key(buyerPriceBeforeDiscountKey))
    {
        bourne::json value = object[buyerPriceBeforeDiscountKey];



        jsonToValue(&buyerPriceBeforeDiscount, value, "long");


    }

    const char *priceBeforeDiscountKey = "priceBeforeDiscount";

    if(object.has_key(priceBeforeDiscountKey))
    {
        bourne::json value = object[priceBeforeDiscountKey];



        jsonToValue(&priceBeforeDiscount, value, "long");


    }

    const char *countKey = "count";

    if(object.has_key(countKey))
    {
        bourne::json value = object[countKey];



        jsonToValue(&count, value, "int");


    }

    const char *vatKey = "vat";

    if(object.has_key(vatKey))
    {
        bourne::json value = object[vatKey];




        OrderVatType* obj = &vat;
		obj->fromJson(value.dump());

    }

    const char *shopSkuKey = "shopSku";

    if(object.has_key(shopSkuKey))
    {
        bourne::json value = object[shopSkuKey];



        jsonToValue(&shopSku, value, "std::string");


    }

    const char *subsidyKey = "subsidy";

    if(object.has_key(subsidyKey))
    {
        bourne::json value = object[subsidyKey];



        jsonToValue(&subsidy, value, "long");


    }

    const char *partnerWarehouseIdKey = "partnerWarehouseId";

    if(object.has_key(partnerWarehouseIdKey))
    {
        bourne::json value = object[partnerWarehouseIdKey];



        jsonToValue(&partnerWarehouseId, value, "std::string");


    }

    const char *promosKey = "promos";

    if(object.has_key(promosKey))
    {
        bourne::json value = object[promosKey];


        std::list<OrderItemPromoDTO> promos_list;
        OrderItemPromoDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            promos_list.push_back(element);
        }
        promos = promos_list;


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

    const char *detailsKey = "details";

    if(object.has_key(detailsKey))
    {
        bourne::json value = object[detailsKey];


        std::list<OrderItemDetailDTO> details_list;
        OrderItemDetailDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            details_list.push_back(element);
        }
        details = details_list;


    }

    const char *subsidiesKey = "subsidies";

    if(object.has_key(subsidiesKey))
    {
        bourne::json value = object[subsidiesKey];


        std::list<OrderItemSubsidyDTO> subsidies_list;
        OrderItemSubsidyDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            subsidies_list.push_back(element);
        }
        subsidies = subsidies_list;


    }

    const char *requiredInstanceTypesKey = "requiredInstanceTypes";

    if(object.has_key(requiredInstanceTypesKey))
    {
        bourne::json value = object[requiredInstanceTypesKey];


        std::list<OrderItemInstanceType> requiredInstanceTypes_list;
        OrderItemInstanceType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            requiredInstanceTypes_list.push_back(element);
        }
        requiredInstanceTypes = requiredInstanceTypes_list;


    }


}

bourne::json
OrderItemDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["offerId"] = getOfferId();






    object["offerName"] = getOfferName();






    object["price"] = getPrice();






    object["buyerPrice"] = getBuyerPrice();






    object["buyerPriceBeforeDiscount"] = getBuyerPriceBeforeDiscount();






    object["priceBeforeDiscount"] = getPriceBeforeDiscount();






    object["count"] = getCount();







	object["vat"] = getVat().toJson();





    object["shopSku"] = getShopSku();






    object["subsidy"] = getSubsidy();






    object["partnerWarehouseId"] = getPartnerWarehouseId();





    std::list<OrderItemPromoDTO> promos_list = getPromos();
    bourne::json promos_arr = bourne::json::array();

    for(auto& var : promos_list)
    {
        OrderItemPromoDTO obj = var;
        promos_arr.append(obj.toJson());
    }
    object["promos"] = promos_arr;






    std::list<OrderItemInstanceDTO> instances_list = getInstances();
    bourne::json instances_arr = bourne::json::array();

    for(auto& var : instances_list)
    {
        OrderItemInstanceDTO obj = var;
        instances_arr.append(obj.toJson());
    }
    object["instances"] = instances_arr;






    std::list<OrderItemDetailDTO> details_list = getDetails();
    bourne::json details_arr = bourne::json::array();

    for(auto& var : details_list)
    {
        OrderItemDetailDTO obj = var;
        details_arr.append(obj.toJson());
    }
    object["details"] = details_arr;






    std::list<OrderItemSubsidyDTO> subsidies_list = getSubsidies();
    bourne::json subsidies_arr = bourne::json::array();

    for(auto& var : subsidies_list)
    {
        OrderItemSubsidyDTO obj = var;
        subsidies_arr.append(obj.toJson());
    }
    object["subsidies"] = subsidies_arr;






    std::list<OrderItemInstanceType> requiredInstanceTypes_list = getRequiredInstanceTypes();
    bourne::json requiredInstanceTypes_arr = bourne::json::array();

    for(auto& var : requiredInstanceTypes_list)
    {
        OrderItemInstanceType obj = var;
        requiredInstanceTypes_arr.append(obj.toJson());
    }
    object["requiredInstanceTypes"] = requiredInstanceTypes_arr;




    return object;

}

long
OrderItemDTO::getId()
{
	return id;
}

void
OrderItemDTO::setId(long  id)
{
	this->id = id;
}

std::string
OrderItemDTO::getOfferId()
{
	return offerId;
}

void
OrderItemDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

std::string
OrderItemDTO::getOfferName()
{
	return offerName;
}

void
OrderItemDTO::setOfferName(std::string  offerName)
{
	this->offerName = offerName;
}

long
OrderItemDTO::getPrice()
{
	return price;
}

void
OrderItemDTO::setPrice(long  price)
{
	this->price = price;
}

long
OrderItemDTO::getBuyerPrice()
{
	return buyerPrice;
}

void
OrderItemDTO::setBuyerPrice(long  buyerPrice)
{
	this->buyerPrice = buyerPrice;
}

long
OrderItemDTO::getBuyerPriceBeforeDiscount()
{
	return buyerPriceBeforeDiscount;
}

void
OrderItemDTO::setBuyerPriceBeforeDiscount(long  buyerPriceBeforeDiscount)
{
	this->buyerPriceBeforeDiscount = buyerPriceBeforeDiscount;
}

long
OrderItemDTO::getPriceBeforeDiscount()
{
	return priceBeforeDiscount;
}

void
OrderItemDTO::setPriceBeforeDiscount(long  priceBeforeDiscount)
{
	this->priceBeforeDiscount = priceBeforeDiscount;
}

int
OrderItemDTO::getCount()
{
	return count;
}

void
OrderItemDTO::setCount(int  count)
{
	this->count = count;
}

OrderVatType
OrderItemDTO::getVat()
{
	return vat;
}

void
OrderItemDTO::setVat(OrderVatType  vat)
{
	this->vat = vat;
}

std::string
OrderItemDTO::getShopSku()
{
	return shopSku;
}

void
OrderItemDTO::setShopSku(std::string  shopSku)
{
	this->shopSku = shopSku;
}

long
OrderItemDTO::getSubsidy()
{
	return subsidy;
}

void
OrderItemDTO::setSubsidy(long  subsidy)
{
	this->subsidy = subsidy;
}

std::string
OrderItemDTO::getPartnerWarehouseId()
{
	return partnerWarehouseId;
}

void
OrderItemDTO::setPartnerWarehouseId(std::string  partnerWarehouseId)
{
	this->partnerWarehouseId = partnerWarehouseId;
}

std::list<OrderItemPromoDTO>
OrderItemDTO::getPromos()
{
	return promos;
}

void
OrderItemDTO::setPromos(std::list <OrderItemPromoDTO> promos)
{
	this->promos = promos;
}

std::list<OrderItemInstanceDTO>
OrderItemDTO::getInstances()
{
	return instances;
}

void
OrderItemDTO::setInstances(std::list <OrderItemInstanceDTO> instances)
{
	this->instances = instances;
}

std::list<OrderItemDetailDTO>
OrderItemDTO::getDetails()
{
	return details;
}

void
OrderItemDTO::setDetails(std::list <OrderItemDetailDTO> details)
{
	this->details = details;
}

std::list<OrderItemSubsidyDTO>
OrderItemDTO::getSubsidies()
{
	return subsidies;
}

void
OrderItemDTO::setSubsidies(std::list <OrderItemSubsidyDTO> subsidies)
{
	this->subsidies = subsidies;
}

std::list<OrderItemInstanceType>
OrderItemDTO::getRequiredInstanceTypes()
{
	return requiredInstanceTypes;
}

void
OrderItemDTO::setRequiredInstanceTypes(std::list <OrderItemInstanceType> requiredInstanceTypes)
{
	this->requiredInstanceTypes = requiredInstanceTypes;
}



