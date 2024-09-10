#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderSubsidyDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderSubsidyDTO::OrderSubsidyDTO()
{
	//__init();
}

OrderSubsidyDTO::~OrderSubsidyDTO()
{
	//__cleanup();
}

void
OrderSubsidyDTO::__init()
{
	//type = new OrderSubsidyType();
	//amount = double(0);
}

void
OrderSubsidyDTO::__cleanup()
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
OrderSubsidyDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderSubsidyType")) {
			jsonToValue(&type, node, "OrderSubsidyType", "OrderSubsidyType");
		} else {
			
			OrderSubsidyType* obj = static_cast<OrderSubsidyType*> (&type);
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

OrderSubsidyDTO::OrderSubsidyDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderSubsidyDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OrderSubsidyType")) {
		OrderSubsidyType obj = getType();
		node = converttoJson(&obj, "OrderSubsidyType", "");
	}
	else {
		
		OrderSubsidyType obj = static_cast<OrderSubsidyType> (getType());
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

OrderSubsidyType
OrderSubsidyDTO::getType()
{
	return type;
}

void
OrderSubsidyDTO::setType(OrderSubsidyType  type)
{
	this->type = type;
}

long long
OrderSubsidyDTO::getAmount()
{
	return amount;
}

void
OrderSubsidyDTO::setAmount(long long  amount)
{
	this->amount = amount;
}


