#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderLabelDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderLabelDTO::OrderLabelDTO()
{
	//__init();
}

OrderLabelDTO::~OrderLabelDTO()
{
	//__cleanup();
}

void
OrderLabelDTO::__init()
{
	//orderId = long(0);
	//placesNumber = int(0);
	//url = std::string();
	//new std::list()std::list> parcelBoxLabels;
}

void
OrderLabelDTO::__cleanup()
{
	//if(orderId != NULL) {
	//
	//delete orderId;
	//orderId = NULL;
	//}
	//if(placesNumber != NULL) {
	//
	//delete placesNumber;
	//placesNumber = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//if(parcelBoxLabels != NULL) {
	//parcelBoxLabels.RemoveAll(true);
	//delete parcelBoxLabels;
	//parcelBoxLabels = NULL;
	//}
	//
}

void
OrderLabelDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *orderIdKey = "orderId";
	node = json_object_get_member(pJsonObject, orderIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&orderId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *placesNumberKey = "placesNumber";
	node = json_object_get_member(pJsonObject, placesNumberKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&placesNumber, node, "int", "");
		} else {
			
		}
	}
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *parcelBoxLabelsKey = "parcelBoxLabels";
	node = json_object_get_member(pJsonObject, parcelBoxLabelsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ParcelBoxLabelDTO> new_list;
			ParcelBoxLabelDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ParcelBoxLabelDTO")) {
					jsonToValue(&inst, temp_json, "ParcelBoxLabelDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			parcelBoxLabels = new_list;
		}
		
	}
}

OrderLabelDTO::OrderLabelDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderLabelDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getOrderId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *orderIdKey = "orderId";
	json_object_set_member(pJsonObject, orderIdKey, node);
	if (isprimitive("int")) {
		int obj = getPlacesNumber();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *placesNumberKey = "placesNumber";
	json_object_set_member(pJsonObject, placesNumberKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	if (isprimitive("ParcelBoxLabelDTO")) {
		list<ParcelBoxLabelDTO> new_list = static_cast<list <ParcelBoxLabelDTO> > (getParcelBoxLabels());
		node = converttoJson(&new_list, "ParcelBoxLabelDTO", "array");
	} else {
		node = json_node_alloc();
		list<ParcelBoxLabelDTO> new_list = static_cast<list <ParcelBoxLabelDTO> > (getParcelBoxLabels());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ParcelBoxLabelDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ParcelBoxLabelDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *parcelBoxLabelsKey = "parcelBoxLabels";
	json_object_set_member(pJsonObject, parcelBoxLabelsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
OrderLabelDTO::getOrderId()
{
	return orderId;
}

void
OrderLabelDTO::setOrderId(long long  orderId)
{
	this->orderId = orderId;
}

int
OrderLabelDTO::getPlacesNumber()
{
	return placesNumber;
}

void
OrderLabelDTO::setPlacesNumber(int  placesNumber)
{
	this->placesNumber = placesNumber;
}

std::string
OrderLabelDTO::getUrl()
{
	return url;
}

void
OrderLabelDTO::setUrl(std::string  url)
{
	this->url = url;
}

std::list<ParcelBoxLabelDTO>
OrderLabelDTO::getParcelBoxLabels()
{
	return parcelBoxLabels;
}

void
OrderLabelDTO::setParcelBoxLabels(std::list <ParcelBoxLabelDTO> parcelBoxLabels)
{
	this->parcelBoxLabels = parcelBoxLabels;
}


