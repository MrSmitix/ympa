#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ReturnInstanceDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ReturnInstanceDTO::ReturnInstanceDTO()
{
	//__init();
}

ReturnInstanceDTO::~ReturnInstanceDTO()
{
	//__cleanup();
}

void
ReturnInstanceDTO::__init()
{
	//stockType = new ReturnInstanceStockType();
	//status = new ReturnInstanceStatusType();
	//cis = std::string();
	//imei = std::string();
}

void
ReturnInstanceDTO::__cleanup()
{
	//if(stockType != NULL) {
	//
	//delete stockType;
	//stockType = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(cis != NULL) {
	//
	//delete cis;
	//cis = NULL;
	//}
	//if(imei != NULL) {
	//
	//delete imei;
	//imei = NULL;
	//}
	//
}

void
ReturnInstanceDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *stockTypeKey = "stockType";
	node = json_object_get_member(pJsonObject, stockTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ReturnInstanceStockType")) {
			jsonToValue(&stockType, node, "ReturnInstanceStockType", "ReturnInstanceStockType");
		} else {
			
			ReturnInstanceStockType* obj = static_cast<ReturnInstanceStockType*> (&stockType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("ReturnInstanceStatusType")) {
			jsonToValue(&status, node, "ReturnInstanceStatusType", "ReturnInstanceStatusType");
		} else {
			
			ReturnInstanceStatusType* obj = static_cast<ReturnInstanceStatusType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cisKey = "cis";
	node = json_object_get_member(pJsonObject, cisKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&cis, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *imeiKey = "imei";
	node = json_object_get_member(pJsonObject, imeiKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&imei, node, "std::string", "");
		} else {
			
		}
	}
}

ReturnInstanceDTO::ReturnInstanceDTO(char* json)
{
	this->fromJson(json);
}

char*
ReturnInstanceDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ReturnInstanceStockType")) {
		ReturnInstanceStockType obj = getStockType();
		node = converttoJson(&obj, "ReturnInstanceStockType", "");
	}
	else {
		
		ReturnInstanceStockType obj = static_cast<ReturnInstanceStockType> (getStockType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *stockTypeKey = "stockType";
	json_object_set_member(pJsonObject, stockTypeKey, node);
	if (isprimitive("ReturnInstanceStatusType")) {
		ReturnInstanceStatusType obj = getStatus();
		node = converttoJson(&obj, "ReturnInstanceStatusType", "");
	}
	else {
		
		ReturnInstanceStatusType obj = static_cast<ReturnInstanceStatusType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCis();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cisKey = "cis";
	json_object_set_member(pJsonObject, cisKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getImei();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *imeiKey = "imei";
	json_object_set_member(pJsonObject, imeiKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ReturnInstanceStockType
ReturnInstanceDTO::getStockType()
{
	return stockType;
}

void
ReturnInstanceDTO::setStockType(ReturnInstanceStockType  stockType)
{
	this->stockType = stockType;
}

ReturnInstanceStatusType
ReturnInstanceDTO::getStatus()
{
	return status;
}

void
ReturnInstanceDTO::setStatus(ReturnInstanceStatusType  status)
{
	this->status = status;
}

std::string
ReturnInstanceDTO::getCis()
{
	return cis;
}

void
ReturnInstanceDTO::setCis(std::string  cis)
{
	this->cis = cis;
}

std::string
ReturnInstanceDTO::getImei()
{
	return imei;
}

void
ReturnInstanceDTO::setImei(std::string  imei)
{
	this->imei = imei;
}


