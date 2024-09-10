#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GenerateShipmentListDocumentReportRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GenerateShipmentListDocumentReportRequest::GenerateShipmentListDocumentReportRequest()
{
	//__init();
}

GenerateShipmentListDocumentReportRequest::~GenerateShipmentListDocumentReportRequest()
{
	//__cleanup();
}

void
GenerateShipmentListDocumentReportRequest::__init()
{
	//campaignId = long(0);
	//shipmentId = long(0);
	//new std::list()std::list> orderIds;
}

void
GenerateShipmentListDocumentReportRequest::__cleanup()
{
	//if(campaignId != NULL) {
	//
	//delete campaignId;
	//campaignId = NULL;
	//}
	//if(shipmentId != NULL) {
	//
	//delete shipmentId;
	//shipmentId = NULL;
	//}
	//if(orderIds != NULL) {
	//orderIds.RemoveAll(true);
	//delete orderIds;
	//orderIds = NULL;
	//}
	//
}

void
GenerateShipmentListDocumentReportRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *campaignIdKey = "campaignId";
	node = json_object_get_member(pJsonObject, campaignIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&campaignId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *shipmentIdKey = "shipmentId";
	node = json_object_get_member(pJsonObject, shipmentIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&shipmentId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *orderIdsKey = "orderIds";
	node = json_object_get_member(pJsonObject, orderIdsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<long long> new_list;
			long long inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("long long")) {
					jsonToValue(&inst, temp_json, "long long", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			orderIds = new_list;
		}
		
	}
}

GenerateShipmentListDocumentReportRequest::GenerateShipmentListDocumentReportRequest(char* json)
{
	this->fromJson(json);
}

char*
GenerateShipmentListDocumentReportRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getCampaignId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *campaignIdKey = "campaignId";
	json_object_set_member(pJsonObject, campaignIdKey, node);
	if (isprimitive("long long")) {
		long long obj = getShipmentId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *shipmentIdKey = "shipmentId";
	json_object_set_member(pJsonObject, shipmentIdKey, node);
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getOrderIds());
		node = converttoJson(&new_list, "long long", "array");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getOrderIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *orderIdsKey = "orderIds";
	json_object_set_member(pJsonObject, orderIdsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GenerateShipmentListDocumentReportRequest::getCampaignId()
{
	return campaignId;
}

void
GenerateShipmentListDocumentReportRequest::setCampaignId(long long  campaignId)
{
	this->campaignId = campaignId;
}

long long
GenerateShipmentListDocumentReportRequest::getShipmentId()
{
	return shipmentId;
}

void
GenerateShipmentListDocumentReportRequest::setShipmentId(long long  shipmentId)
{
	this->shipmentId = shipmentId;
}

std::list<long long>
GenerateShipmentListDocumentReportRequest::getOrderIds()
{
	return orderIds;
}

void
GenerateShipmentListDocumentReportRequest::setOrderIds(std::list <long long> orderIds)
{
	this->orderIds = orderIds;
}


