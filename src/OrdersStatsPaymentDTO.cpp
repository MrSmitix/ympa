#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrdersStatsPaymentDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrdersStatsPaymentDTO::OrdersStatsPaymentDTO()
{
	//__init();
}

OrdersStatsPaymentDTO::~OrdersStatsPaymentDTO()
{
	//__cleanup();
}

void
OrdersStatsPaymentDTO::__init()
{
	//id = std::string();
	//date = null;
	//type = new OrdersStatsPaymentType();
	//source = new OrdersStatsPaymentSourceType();
	//total = double(0);
	//paymentOrder = new OrdersStatsPaymentOrderDTO();
}

void
OrdersStatsPaymentDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(date != NULL) {
	//
	//delete date;
	//date = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(source != NULL) {
	//
	//delete source;
	//source = NULL;
	//}
	//if(total != NULL) {
	//
	//delete total;
	//total = NULL;
	//}
	//if(paymentOrder != NULL) {
	//
	//delete paymentOrder;
	//paymentOrder = NULL;
	//}
	//
}

void
OrdersStatsPaymentDTO::fromJson(char* jsonStr)
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
	const gchar *dateKey = "date";
	node = json_object_get_member(pJsonObject, dateKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&date, node, "Date", "Date");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("OrdersStatsPaymentType")) {
			jsonToValue(&type, node, "OrdersStatsPaymentType", "OrdersStatsPaymentType");
		} else {
			
			OrdersStatsPaymentType* obj = static_cast<OrdersStatsPaymentType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *sourceKey = "source";
	node = json_object_get_member(pJsonObject, sourceKey);
	if (node !=NULL) {
	

		if (isprimitive("OrdersStatsPaymentSourceType")) {
			jsonToValue(&source, node, "OrdersStatsPaymentSourceType", "OrdersStatsPaymentSourceType");
		} else {
			
			OrdersStatsPaymentSourceType* obj = static_cast<OrdersStatsPaymentSourceType*> (&source);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *totalKey = "total";
	node = json_object_get_member(pJsonObject, totalKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&total, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&total);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *paymentOrderKey = "paymentOrder";
	node = json_object_get_member(pJsonObject, paymentOrderKey);
	if (node !=NULL) {
	

		if (isprimitive("OrdersStatsPaymentOrderDTO")) {
			jsonToValue(&paymentOrder, node, "OrdersStatsPaymentOrderDTO", "OrdersStatsPaymentOrderDTO");
		} else {
			
			OrdersStatsPaymentOrderDTO* obj = static_cast<OrdersStatsPaymentOrderDTO*> (&paymentOrder);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrdersStatsPaymentDTO::OrdersStatsPaymentDTO(char* json)
{
	this->fromJson(json);
}

char*
OrdersStatsPaymentDTO::toJson()
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
	if (isprimitive("Date")) {
		Date obj = getDate();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *dateKey = "date";
	json_object_set_member(pJsonObject, dateKey, node);
	if (isprimitive("OrdersStatsPaymentType")) {
		OrdersStatsPaymentType obj = getType();
		node = converttoJson(&obj, "OrdersStatsPaymentType", "");
	}
	else {
		
		OrdersStatsPaymentType obj = static_cast<OrdersStatsPaymentType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("OrdersStatsPaymentSourceType")) {
		OrdersStatsPaymentSourceType obj = getSource();
		node = converttoJson(&obj, "OrdersStatsPaymentSourceType", "");
	}
	else {
		
		OrdersStatsPaymentSourceType obj = static_cast<OrdersStatsPaymentSourceType> (getSource());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sourceKey = "source";
	json_object_set_member(pJsonObject, sourceKey, node);
	if (isprimitive("long long")) {
		long long obj = getTotal();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getTotal());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *totalKey = "total";
	json_object_set_member(pJsonObject, totalKey, node);
	if (isprimitive("OrdersStatsPaymentOrderDTO")) {
		OrdersStatsPaymentOrderDTO obj = getPaymentOrder();
		node = converttoJson(&obj, "OrdersStatsPaymentOrderDTO", "");
	}
	else {
		
		OrdersStatsPaymentOrderDTO obj = static_cast<OrdersStatsPaymentOrderDTO> (getPaymentOrder());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *paymentOrderKey = "paymentOrder";
	json_object_set_member(pJsonObject, paymentOrderKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OrdersStatsPaymentDTO::getId()
{
	return id;
}

void
OrdersStatsPaymentDTO::setId(std::string  id)
{
	this->id = id;
}

Date
OrdersStatsPaymentDTO::getDate()
{
	return date;
}

void
OrdersStatsPaymentDTO::setDate(Date  date)
{
	this->date = date;
}

OrdersStatsPaymentType
OrdersStatsPaymentDTO::getType()
{
	return type;
}

void
OrdersStatsPaymentDTO::setType(OrdersStatsPaymentType  type)
{
	this->type = type;
}

OrdersStatsPaymentSourceType
OrdersStatsPaymentDTO::getSource()
{
	return source;
}

void
OrdersStatsPaymentDTO::setSource(OrdersStatsPaymentSourceType  source)
{
	this->source = source;
}

long long
OrdersStatsPaymentDTO::getTotal()
{
	return total;
}

void
OrdersStatsPaymentDTO::setTotal(long long  total)
{
	this->total = total;
}

OrdersStatsPaymentOrderDTO
OrdersStatsPaymentDTO::getPaymentOrder()
{
	return paymentOrder;
}

void
OrdersStatsPaymentDTO::setPaymentOrder(OrdersStatsPaymentOrderDTO  paymentOrder)
{
	this->paymentOrder = paymentOrder;
}


