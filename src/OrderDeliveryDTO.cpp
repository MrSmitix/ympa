#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderDeliveryDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderDeliveryDTO::OrderDeliveryDTO()
{
	//__init();
}

OrderDeliveryDTO::~OrderDeliveryDTO()
{
	//__cleanup();
}

void
OrderDeliveryDTO::__init()
{
	//id = std::string();
	//type = new OrderDeliveryType();
	//serviceName = std::string();
	//price = double(0);
	//deliveryPartnerType = new OrderDeliveryPartnerType();
	//courier = new OrderCourierDTO();
	//dates = new OrderDeliveryDatesDTO();
	//region = new RegionDTO();
	//address = new OrderDeliveryAddressDTO();
	//vat = new OrderVatType();
	//deliveryServiceId = long(0);
	//liftType = new OrderLiftType();
	//liftPrice = double(0);
	//outletCode = std::string();
	//outletStorageLimitDate = std::string();
	//dispatchType = new OrderDeliveryDispatchType();
	//new std::list()std::list> tracks;
	//new std::list()std::list> shipments;
	//estimated = bool(false);
	//eacType = new OrderDeliveryEacType();
	//eacCode = std::string();
}

void
OrderDeliveryDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(serviceName != NULL) {
	//
	//delete serviceName;
	//serviceName = NULL;
	//}
	//if(price != NULL) {
	//
	//delete price;
	//price = NULL;
	//}
	//if(deliveryPartnerType != NULL) {
	//
	//delete deliveryPartnerType;
	//deliveryPartnerType = NULL;
	//}
	//if(courier != NULL) {
	//
	//delete courier;
	//courier = NULL;
	//}
	//if(dates != NULL) {
	//
	//delete dates;
	//dates = NULL;
	//}
	//if(region != NULL) {
	//
	//delete region;
	//region = NULL;
	//}
	//if(address != NULL) {
	//
	//delete address;
	//address = NULL;
	//}
	//if(vat != NULL) {
	//
	//delete vat;
	//vat = NULL;
	//}
	//if(deliveryServiceId != NULL) {
	//
	//delete deliveryServiceId;
	//deliveryServiceId = NULL;
	//}
	//if(liftType != NULL) {
	//
	//delete liftType;
	//liftType = NULL;
	//}
	//if(liftPrice != NULL) {
	//
	//delete liftPrice;
	//liftPrice = NULL;
	//}
	//if(outletCode != NULL) {
	//
	//delete outletCode;
	//outletCode = NULL;
	//}
	//if(outletStorageLimitDate != NULL) {
	//
	//delete outletStorageLimitDate;
	//outletStorageLimitDate = NULL;
	//}
	//if(dispatchType != NULL) {
	//
	//delete dispatchType;
	//dispatchType = NULL;
	//}
	//if(tracks != NULL) {
	//tracks.RemoveAll(true);
	//delete tracks;
	//tracks = NULL;
	//}
	//if(shipments != NULL) {
	//shipments.RemoveAll(true);
	//delete shipments;
	//shipments = NULL;
	//}
	//if(estimated != NULL) {
	//
	//delete estimated;
	//estimated = NULL;
	//}
	//if(eacType != NULL) {
	//
	//delete eacType;
	//eacType = NULL;
	//}
	//if(eacCode != NULL) {
	//
	//delete eacCode;
	//eacCode = NULL;
	//}
	//
}

void
OrderDeliveryDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderDeliveryType")) {
			jsonToValue(&type, node, "OrderDeliveryType", "OrderDeliveryType");
		} else {
			
			OrderDeliveryType* obj = static_cast<OrderDeliveryType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *serviceNameKey = "serviceName";
	node = json_object_get_member(pJsonObject, serviceNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&serviceName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *priceKey = "price";
	node = json_object_get_member(pJsonObject, priceKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&price, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&price);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *deliveryPartnerTypeKey = "deliveryPartnerType";
	node = json_object_get_member(pJsonObject, deliveryPartnerTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderDeliveryPartnerType")) {
			jsonToValue(&deliveryPartnerType, node, "OrderDeliveryPartnerType", "OrderDeliveryPartnerType");
		} else {
			
			OrderDeliveryPartnerType* obj = static_cast<OrderDeliveryPartnerType*> (&deliveryPartnerType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *courierKey = "courier";
	node = json_object_get_member(pJsonObject, courierKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderCourierDTO")) {
			jsonToValue(&courier, node, "OrderCourierDTO", "OrderCourierDTO");
		} else {
			
			OrderCourierDTO* obj = static_cast<OrderCourierDTO*> (&courier);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *datesKey = "dates";
	node = json_object_get_member(pJsonObject, datesKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderDeliveryDatesDTO")) {
			jsonToValue(&dates, node, "OrderDeliveryDatesDTO", "OrderDeliveryDatesDTO");
		} else {
			
			OrderDeliveryDatesDTO* obj = static_cast<OrderDeliveryDatesDTO*> (&dates);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *regionKey = "region";
	node = json_object_get_member(pJsonObject, regionKey);
	if (node !=NULL) {
	

		if (isprimitive("RegionDTO")) {
			jsonToValue(&region, node, "RegionDTO", "RegionDTO");
		} else {
			
			RegionDTO* obj = static_cast<RegionDTO*> (&region);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *addressKey = "address";
	node = json_object_get_member(pJsonObject, addressKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderDeliveryAddressDTO")) {
			jsonToValue(&address, node, "OrderDeliveryAddressDTO", "OrderDeliveryAddressDTO");
		} else {
			
			OrderDeliveryAddressDTO* obj = static_cast<OrderDeliveryAddressDTO*> (&address);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *vatKey = "vat";
	node = json_object_get_member(pJsonObject, vatKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderVatType")) {
			jsonToValue(&vat, node, "OrderVatType", "OrderVatType");
		} else {
			
			OrderVatType* obj = static_cast<OrderVatType*> (&vat);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *deliveryServiceIdKey = "deliveryServiceId";
	node = json_object_get_member(pJsonObject, deliveryServiceIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&deliveryServiceId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *liftTypeKey = "liftType";
	node = json_object_get_member(pJsonObject, liftTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderLiftType")) {
			jsonToValue(&liftType, node, "OrderLiftType", "OrderLiftType");
		} else {
			
			OrderLiftType* obj = static_cast<OrderLiftType*> (&liftType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *liftPriceKey = "liftPrice";
	node = json_object_get_member(pJsonObject, liftPriceKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&liftPrice, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&liftPrice);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *outletCodeKey = "outletCode";
	node = json_object_get_member(pJsonObject, outletCodeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&outletCode, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *outletStorageLimitDateKey = "outletStorageLimitDate";
	node = json_object_get_member(pJsonObject, outletStorageLimitDateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&outletStorageLimitDate, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dispatchTypeKey = "dispatchType";
	node = json_object_get_member(pJsonObject, dispatchTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderDeliveryDispatchType")) {
			jsonToValue(&dispatchType, node, "OrderDeliveryDispatchType", "OrderDeliveryDispatchType");
		} else {
			
			OrderDeliveryDispatchType* obj = static_cast<OrderDeliveryDispatchType*> (&dispatchType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tracksKey = "tracks";
	node = json_object_get_member(pJsonObject, tracksKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrderTrackDTO> new_list;
			OrderTrackDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrderTrackDTO")) {
					jsonToValue(&inst, temp_json, "OrderTrackDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			tracks = new_list;
		}
		
	}
	const gchar *shipmentsKey = "shipments";
	node = json_object_get_member(pJsonObject, shipmentsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrderShipmentDTO> new_list;
			OrderShipmentDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrderShipmentDTO")) {
					jsonToValue(&inst, temp_json, "OrderShipmentDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			shipments = new_list;
		}
		
	}
	const gchar *estimatedKey = "estimated";
	node = json_object_get_member(pJsonObject, estimatedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&estimated, node, "bool", "");
		} else {
			
		}
	}
	const gchar *eacTypeKey = "eacType";
	node = json_object_get_member(pJsonObject, eacTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderDeliveryEacType")) {
			jsonToValue(&eacType, node, "OrderDeliveryEacType", "OrderDeliveryEacType");
		} else {
			
			OrderDeliveryEacType* obj = static_cast<OrderDeliveryEacType*> (&eacType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *eacCodeKey = "eacCode";
	node = json_object_get_member(pJsonObject, eacCodeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&eacCode, node, "std::string", "");
		} else {
			
		}
	}
}

OrderDeliveryDTO::OrderDeliveryDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderDeliveryDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("OrderDeliveryType")) {
		OrderDeliveryType obj = getType();
		node = converttoJson(&obj, "OrderDeliveryType", "");
	}
	else {
		
		OrderDeliveryType obj = static_cast<OrderDeliveryType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getServiceName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *serviceNameKey = "serviceName";
	json_object_set_member(pJsonObject, serviceNameKey, node);
	if (isprimitive("long long")) {
		long long obj = getPrice();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getPrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *priceKey = "price";
	json_object_set_member(pJsonObject, priceKey, node);
	if (isprimitive("OrderDeliveryPartnerType")) {
		OrderDeliveryPartnerType obj = getDeliveryPartnerType();
		node = converttoJson(&obj, "OrderDeliveryPartnerType", "");
	}
	else {
		
		OrderDeliveryPartnerType obj = static_cast<OrderDeliveryPartnerType> (getDeliveryPartnerType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *deliveryPartnerTypeKey = "deliveryPartnerType";
	json_object_set_member(pJsonObject, deliveryPartnerTypeKey, node);
	if (isprimitive("OrderCourierDTO")) {
		OrderCourierDTO obj = getCourier();
		node = converttoJson(&obj, "OrderCourierDTO", "");
	}
	else {
		
		OrderCourierDTO obj = static_cast<OrderCourierDTO> (getCourier());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *courierKey = "courier";
	json_object_set_member(pJsonObject, courierKey, node);
	if (isprimitive("OrderDeliveryDatesDTO")) {
		OrderDeliveryDatesDTO obj = getDates();
		node = converttoJson(&obj, "OrderDeliveryDatesDTO", "");
	}
	else {
		
		OrderDeliveryDatesDTO obj = static_cast<OrderDeliveryDatesDTO> (getDates());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *datesKey = "dates";
	json_object_set_member(pJsonObject, datesKey, node);
	if (isprimitive("RegionDTO")) {
		RegionDTO obj = getRegion();
		node = converttoJson(&obj, "RegionDTO", "");
	}
	else {
		
		RegionDTO obj = static_cast<RegionDTO> (getRegion());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *regionKey = "region";
	json_object_set_member(pJsonObject, regionKey, node);
	if (isprimitive("OrderDeliveryAddressDTO")) {
		OrderDeliveryAddressDTO obj = getAddress();
		node = converttoJson(&obj, "OrderDeliveryAddressDTO", "");
	}
	else {
		
		OrderDeliveryAddressDTO obj = static_cast<OrderDeliveryAddressDTO> (getAddress());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *addressKey = "address";
	json_object_set_member(pJsonObject, addressKey, node);
	if (isprimitive("OrderVatType")) {
		OrderVatType obj = getVat();
		node = converttoJson(&obj, "OrderVatType", "");
	}
	else {
		
		OrderVatType obj = static_cast<OrderVatType> (getVat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *vatKey = "vat";
	json_object_set_member(pJsonObject, vatKey, node);
	if (isprimitive("long long")) {
		long long obj = getDeliveryServiceId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *deliveryServiceIdKey = "deliveryServiceId";
	json_object_set_member(pJsonObject, deliveryServiceIdKey, node);
	if (isprimitive("OrderLiftType")) {
		OrderLiftType obj = getLiftType();
		node = converttoJson(&obj, "OrderLiftType", "");
	}
	else {
		
		OrderLiftType obj = static_cast<OrderLiftType> (getLiftType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *liftTypeKey = "liftType";
	json_object_set_member(pJsonObject, liftTypeKey, node);
	if (isprimitive("long long")) {
		long long obj = getLiftPrice();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getLiftPrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *liftPriceKey = "liftPrice";
	json_object_set_member(pJsonObject, liftPriceKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOutletCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *outletCodeKey = "outletCode";
	json_object_set_member(pJsonObject, outletCodeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOutletStorageLimitDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *outletStorageLimitDateKey = "outletStorageLimitDate";
	json_object_set_member(pJsonObject, outletStorageLimitDateKey, node);
	if (isprimitive("OrderDeliveryDispatchType")) {
		OrderDeliveryDispatchType obj = getDispatchType();
		node = converttoJson(&obj, "OrderDeliveryDispatchType", "");
	}
	else {
		
		OrderDeliveryDispatchType obj = static_cast<OrderDeliveryDispatchType> (getDispatchType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dispatchTypeKey = "dispatchType";
	json_object_set_member(pJsonObject, dispatchTypeKey, node);
	if (isprimitive("OrderTrackDTO")) {
		list<OrderTrackDTO> new_list = static_cast<list <OrderTrackDTO> > (getTracks());
		node = converttoJson(&new_list, "OrderTrackDTO", "array");
	} else {
		node = json_node_alloc();
		list<OrderTrackDTO> new_list = static_cast<list <OrderTrackDTO> > (getTracks());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrderTrackDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrderTrackDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *tracksKey = "tracks";
	json_object_set_member(pJsonObject, tracksKey, node);
	if (isprimitive("OrderShipmentDTO")) {
		list<OrderShipmentDTO> new_list = static_cast<list <OrderShipmentDTO> > (getShipments());
		node = converttoJson(&new_list, "OrderShipmentDTO", "array");
	} else {
		node = json_node_alloc();
		list<OrderShipmentDTO> new_list = static_cast<list <OrderShipmentDTO> > (getShipments());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrderShipmentDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrderShipmentDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *shipmentsKey = "shipments";
	json_object_set_member(pJsonObject, shipmentsKey, node);
	if (isprimitive("bool")) {
		bool obj = getEstimated();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *estimatedKey = "estimated";
	json_object_set_member(pJsonObject, estimatedKey, node);
	if (isprimitive("OrderDeliveryEacType")) {
		OrderDeliveryEacType obj = getEacType();
		node = converttoJson(&obj, "OrderDeliveryEacType", "");
	}
	else {
		
		OrderDeliveryEacType obj = static_cast<OrderDeliveryEacType> (getEacType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *eacTypeKey = "eacType";
	json_object_set_member(pJsonObject, eacTypeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEacCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *eacCodeKey = "eacCode";
	json_object_set_member(pJsonObject, eacCodeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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

long long
OrderDeliveryDTO::getPrice()
{
	return price;
}

void
OrderDeliveryDTO::setPrice(long long  price)
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

long long
OrderDeliveryDTO::getDeliveryServiceId()
{
	return deliveryServiceId;
}

void
OrderDeliveryDTO::setDeliveryServiceId(long long  deliveryServiceId)
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

long long
OrderDeliveryDTO::getLiftPrice()
{
	return liftPrice;
}

void
OrderDeliveryDTO::setLiftPrice(long long  liftPrice)
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
OrderDeliveryDTO::getEstimated()
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


