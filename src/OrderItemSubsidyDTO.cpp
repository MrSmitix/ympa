#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderItemSubsidyDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderItemSubsidyDTO::OrderItemSubsidyDTO()
{
	//__init();
}

OrderItemSubsidyDTO::~OrderItemSubsidyDTO()
{
	//__cleanup();
}

void
OrderItemSubsidyDTO::__init()
{
	//type = new OrderItemSubsidyType();
	//amount = double(0);
}

void
OrderItemSubsidyDTO::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(amount != NULL) {
	//
	//delete amount;
	//amount = NULL;
	//}
	//
}

void
OrderItemSubsidyDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderItemSubsidyType")) {
			jsonToValue(&type, node, "OrderItemSubsidyType", "OrderItemSubsidyType");
		} else {
			
			OrderItemSubsidyType* obj = static_cast<OrderItemSubsidyType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *amountKey = "amount";
	node = json_object_get_member(pJsonObject, amountKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&amount, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&amount);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrderItemSubsidyDTO::OrderItemSubsidyDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderItemSubsidyDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OrderItemSubsidyType")) {
		OrderItemSubsidyType obj = getType();
		node = converttoJson(&obj, "OrderItemSubsidyType", "");
	}
	else {
		
		OrderItemSubsidyType obj = static_cast<OrderItemSubsidyType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("long long")) {
		long long obj = getAmount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getAmount());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *amountKey = "amount";
	json_object_set_member(pJsonObject, amountKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

OrderItemSubsidyType
OrderItemSubsidyDTO::getType()
{
	return type;
}

void
OrderItemSubsidyDTO::setType(OrderItemSubsidyType  type)
{
	this->type = type;
}

long long
OrderItemSubsidyDTO::getAmount()
{
	return amount;
}

void
OrderItemSubsidyDTO::setAmount(long long  amount)
{
	this->amount = amount;
}


