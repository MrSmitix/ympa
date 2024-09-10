

#include "OrderDeliveryDTO.h"

using namespace Tiny;

OrderDeliveryDTO::OrderDeliveryDTO()
{
	id = std::string();
	type = OrderDeliveryType();
	serviceName = std::string();
	price = float(0);
	deliveryPartnerType = OrderDeliveryPartnerType();
	courier = OrderCourierDTO();
	dates = OrderDeliveryDatesDTO();
	region = RegionDTO();
	address = OrderDeliveryAddressDTO();
	vat = OrderVatType();
	deliveryServiceId = long(0);
	liftType = OrderLiftType();
	liftPrice = float(0);
	outletCode = std::string();
	outletStorageLimitDate = std::string();
	dispatchType = OrderDeliveryDispatchType();
	tracks = std::list<OrderTrackDTO>();
	shipments = std::list<OrderShipmentDTO>();
	estimated = bool(false);
	eacType = OrderDeliveryEacType();
	eacCode = std::string();
}

OrderDeliveryDTO::OrderDeliveryDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderDeliveryDTO::~OrderDeliveryDTO()
{

}

void
OrderDeliveryDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        OrderDeliveryType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *serviceNameKey = "serviceName";

    if(object.has_key(serviceNameKey))
    {
        bourne::json value = object[serviceNameKey];



        jsonToValue(&serviceName, value, "std::string");


    }

    const char *priceKey = "price";

    if(object.has_key(priceKey))
    {
        bourne::json value = object[priceKey];



        jsonToValue(&price, value, "long");


    }

    const char *deliveryPartnerTypeKey = "deliveryPartnerType";

    if(object.has_key(deliveryPartnerTypeKey))
    {
        bourne::json value = object[deliveryPartnerTypeKey];




        OrderDeliveryPartnerType* obj = &deliveryPartnerType;
		obj->fromJson(value.dump());

    }

    const char *courierKey = "courier";

    if(object.has_key(courierKey))
    {
        bourne::json value = object[courierKey];




        OrderCourierDTO* obj = &courier;
		obj->fromJson(value.dump());

    }

    const char *datesKey = "dates";

    if(object.has_key(datesKey))
    {
        bourne::json value = object[datesKey];




        OrderDeliveryDatesDTO* obj = &dates;
		obj->fromJson(value.dump());

    }

    const char *regionKey = "region";

    if(object.has_key(regionKey))
    {
        bourne::json value = object[regionKey];




        RegionDTO* obj = &region;
		obj->fromJson(value.dump());

    }

    const char *addressKey = "address";

    if(object.has_key(addressKey))
    {
        bourne::json value = object[addressKey];




        OrderDeliveryAddressDTO* obj = &address;
		obj->fromJson(value.dump());

    }

    const char *vatKey = "vat";

    if(object.has_key(vatKey))
    {
        bourne::json value = object[vatKey];




        OrderVatType* obj = &vat;
		obj->fromJson(value.dump());

    }

    const char *deliveryServiceIdKey = "deliveryServiceId";

    if(object.has_key(deliveryServiceIdKey))
    {
        bourne::json value = object[deliveryServiceIdKey];



        jsonToValue(&deliveryServiceId, value, "long");


    }

    const char *liftTypeKey = "liftType";

    if(object.has_key(liftTypeKey))
    {
        bourne::json value = object[liftTypeKey];




        OrderLiftType* obj = &liftType;
		obj->fromJson(value.dump());

    }

    const char *liftPriceKey = "liftPrice";

    if(object.has_key(liftPriceKey))
    {
        bourne::json value = object[liftPriceKey];



        jsonToValue(&liftPrice, value, "long");


    }

    const char *outletCodeKey = "outletCode";

    if(object.has_key(outletCodeKey))
    {
        bourne::json value = object[outletCodeKey];



        jsonToValue(&outletCode, value, "std::string");


    }

    const char *outletStorageLimitDateKey = "outletStorageLimitDate";

    if(object.has_key(outletStorageLimitDateKey))
    {
        bourne::json value = object[outletStorageLimitDateKey];



        jsonToValue(&outletStorageLimitDate, value, "std::string");


    }

    const char *dispatchTypeKey = "dispatchType";

    if(object.has_key(dispatchTypeKey))
    {
        bourne::json value = object[dispatchTypeKey];




        OrderDeliveryDispatchType* obj = &dispatchType;
		obj->fromJson(value.dump());

    }

    const char *tracksKey = "tracks";

    if(object.has_key(tracksKey))
    {
        bourne::json value = object[tracksKey];


        std::list<OrderTrackDTO> tracks_list;
        OrderTrackDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            tracks_list.push_back(element);
        }
        tracks = tracks_list;


    }

    const char *shipmentsKey = "shipments";

    if(object.has_key(shipmentsKey))
    {
        bourne::json value = object[shipmentsKey];


        std::list<OrderShipmentDTO> shipments_list;
        OrderShipmentDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            shipments_list.push_back(element);
        }
        shipments = shipments_list;


    }

    const char *estimatedKey = "estimated";

    if(object.has_key(estimatedKey))
    {
        bourne::json value = object[estimatedKey];



        jsonToValue(&estimated, value, "bool");


    }

    const char *eacTypeKey = "eacType";

    if(object.has_key(eacTypeKey))
    {
        bourne::json value = object[eacTypeKey];




        OrderDeliveryEacType* obj = &eacType;
		obj->fromJson(value.dump());

    }

    const char *eacCodeKey = "eacCode";

    if(object.has_key(eacCodeKey))
    {
        bourne::json value = object[eacCodeKey];



        jsonToValue(&eacCode, value, "std::string");


    }


}

bourne::json
OrderDeliveryDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["type"] = getType().toJson();





    object["serviceName"] = getServiceName();






    object["price"] = getPrice();







	object["deliveryPartnerType"] = getDeliveryPartnerType().toJson();






	object["courier"] = getCourier().toJson();






	object["dates"] = getDates().toJson();






	object["region"] = getRegion().toJson();






	object["address"] = getAddress().toJson();






	object["vat"] = getVat().toJson();





    object["deliveryServiceId"] = getDeliveryServiceId();







	object["liftType"] = getLiftType().toJson();





    object["liftPrice"] = getLiftPrice();






    object["outletCode"] = getOutletCode();






    object["outletStorageLimitDate"] = getOutletStorageLimitDate();







	object["dispatchType"] = getDispatchType().toJson();




    std::list<OrderTrackDTO> tracks_list = getTracks();
    bourne::json tracks_arr = bourne::json::array();

    for(auto& var : tracks_list)
    {
        OrderTrackDTO obj = var;
        tracks_arr.append(obj.toJson());
    }
    object["tracks"] = tracks_arr;






    std::list<OrderShipmentDTO> shipments_list = getShipments();
    bourne::json shipments_arr = bourne::json::array();

    for(auto& var : shipments_list)
    {
        OrderShipmentDTO obj = var;
        shipments_arr.append(obj.toJson());
    }
    object["shipments"] = shipments_arr;







    object["estimated"] = isEstimated();







	object["eacType"] = getEacType().toJson();





    object["eacCode"] = getEacCode();



    return object;

}

std::string
OrderDeliveryDTO::getId()
{
	return id;
}

void
OrderDeliveryDTO::setId(std::string  id)
{
	this->id = id;
}

OrderDeliveryType
OrderDeliveryDTO::getType()
{
	return type;
}

void
OrderDeliveryDTO::setType(OrderDeliveryType  type)
{
	this->type = type;
}

std::string
OrderDeliveryDTO::getServiceName()
{
	return serviceName;
}

void
OrderDeliveryDTO::setServiceName(std::string  serviceName)
{
	this->serviceName = serviceName;
}

long
OrderDeliveryDTO::getPrice()
{
	return price;
}

void
OrderDeliveryDTO::setPrice(long  price)
{
	this->price = price;
}

OrderDeliveryPartnerType
OrderDeliveryDTO::getDeliveryPartnerType()
{
	return deliveryPartnerType;
}

void
OrderDeliveryDTO::setDeliveryPartnerType(OrderDeliveryPartnerType  deliveryPartnerType)
{
	this->deliveryPartnerType = deliveryPartnerType;
}

OrderCourierDTO
OrderDeliveryDTO::getCourier()
{
	return courier;
}

void
OrderDeliveryDTO::setCourier(OrderCourierDTO  courier)
{
	this->courier = courier;
}

OrderDeliveryDatesDTO
OrderDeliveryDTO::getDates()
{
	return dates;
}

void
OrderDeliveryDTO::setDates(OrderDeliveryDatesDTO  dates)
{
	this->dates = dates;
}

RegionDTO
OrderDeliveryDTO::getRegion()
{
	return region;
}

void
OrderDeliveryDTO::setRegion(RegionDTO  region)
{
	this->region = region;
}

OrderDeliveryAddressDTO
OrderDeliveryDTO::getAddress()
{
	return address;
}

void
OrderDeliveryDTO::setAddress(OrderDeliveryAddressDTO  address)
{
	this->address = address;
}

OrderVatType
OrderDeliveryDTO::getVat()
{
	return vat;
}

void
OrderDeliveryDTO::setVat(OrderVatType  vat)
{
	this->vat = vat;
}

long
OrderDeliveryDTO::getDeliveryServiceId()
{
	return deliveryServiceId;
}

void
OrderDeliveryDTO::setDeliveryServiceId(long  deliveryServiceId)
{
	this->deliveryServiceId = deliveryServiceId;
}

OrderLiftType
OrderDeliveryDTO::getLiftType()
{
	return liftType;
}

void
OrderDeliveryDTO::setLiftType(OrderLiftType  liftType)
{
	this->liftType = liftType;
}

long
OrderDeliveryDTO::getLiftPrice()
{
	return liftPrice;
}

void
OrderDeliveryDTO::setLiftPrice(long  liftPrice)
{
	this->liftPrice = liftPrice;
}

std::string
OrderDeliveryDTO::getOutletCode()
{
	return outletCode;
}

void
OrderDeliveryDTO::setOutletCode(std::string  outletCode)
{
	this->outletCode = outletCode;
}

std::string
OrderDeliveryDTO::getOutletStorageLimitDate()
{
	return outletStorageLimitDate;
}

void
OrderDeliveryDTO::setOutletStorageLimitDate(std::string  outletStorageLimitDate)
{
	this->outletStorageLimitDate = outletStorageLimitDate;
}

OrderDeliveryDispatchType
OrderDeliveryDTO::getDispatchType()
{
	return dispatchType;
}

void
OrderDeliveryDTO::setDispatchType(OrderDeliveryDispatchType  dispatchType)
{
	this->dispatchType = dispatchType;
}

std::list<OrderTrackDTO>
OrderDeliveryDTO::getTracks()
{
	return tracks;
}

void
OrderDeliveryDTO::setTracks(std::list <OrderTrackDTO> tracks)
{
	this->tracks = tracks;
}

std::list<OrderShipmentDTO>
OrderDeliveryDTO::getShipments()
{
	return shipments;
}

void
OrderDeliveryDTO::setShipments(std::list <OrderShipmentDTO> shipments)
{
	this->shipments = shipments;
}

bool
OrderDeliveryDTO::isEstimated()
{
	return estimated;
}

void
OrderDeliveryDTO::setEstimated(bool  estimated)
{
	this->estimated = estimated;
}

OrderDeliveryEacType
OrderDeliveryDTO::getEacType()
{
	return eacType;
}

void
OrderDeliveryDTO::setEacType(OrderDeliveryEacType  eacType)
{
	this->eacType = eacType;
}

std::string
OrderDeliveryDTO::getEacCode()
{
	return eacCode;
}

void
OrderDeliveryDTO::setEacCode(std::string  eacCode)
{
	this->eacCode = eacCode;
}



