#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "QualityRatingDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

QualityRatingDTO::QualityRatingDTO()
{
	//__init();
}

QualityRatingDTO::~QualityRatingDTO()
{
	//__cleanup();
}

void
QualityRatingDTO::__init()
{
	//rating = long(0);
	//calculationDate = null;
	//new std::list()std::list> components;
}

void
QualityRatingDTO::__cleanup()
{
	//if(rating != NULL) {
	//
	//delete rating;
	//rating = NULL;
	//}
	//if(calculationDate != NULL) {
	//
	//delete calculationDate;
	//calculationDate = NULL;
	//}
	//if(components != NULL) {
	//components.RemoveAll(true);
	//delete components;
	//components = NULL;
	//}
	//
}

void
QualityRatingDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ratingKey = "rating";
	node = json_object_get_member(pJsonObject, ratingKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&rating, node, "long long", "");
		} else {
			
		}
	}
	const gchar *calculationDateKey = "calculationDate";
	node = json_object_get_member(pJsonObject, calculationDateKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&calculationDate, node, "Date", "Date");
		} else {
			
		}
	}
	const gchar *componentsKey = "components";
	node = json_object_get_member(pJsonObject, componentsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<QualityRatingComponentDTO> new_list;
			QualityRatingComponentDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("QualityRatingComponentDTO")) {
					jsonToValue(&inst, temp_json, "QualityRatingComponentDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			components = new_list;
		}
		
	}
}

QualityRatingDTO::QualityRatingDTO(char* json)
{
	this->fromJson(json);
}

char*
QualityRatingDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getRating();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *ratingKey = "rating";
	json_object_set_member(pJsonObject, ratingKey, node);
	if (isprimitive("Date")) {
		Date obj = getCalculationDate();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *calculationDateKey = "calculationDate";
	json_object_set_member(pJsonObject, calculationDateKey, node);
	if (isprimitive("QualityRatingComponentDTO")) {
		list<QualityRatingComponentDTO> new_list = static_cast<list <QualityRatingComponentDTO> > (getComponents());
		node = converttoJson(&new_list, "QualityRatingComponentDTO", "array");
	} else {
		node = json_node_alloc();
		list<QualityRatingComponentDTO> new_list = static_cast<list <QualityRatingComponentDTO> > (getComponents());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<QualityRatingComponentDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			QualityRatingComponentDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *componentsKey = "components";
	json_object_set_member(pJsonObject, componentsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
QualityRatingDTO::getRating()
{
	return rating;
}

void
QualityRatingDTO::setRating(long long  rating)
{
	this->rating = rating;
}

Date
QualityRatingDTO::getCalculationDate()
{
	return calculationDate;
}

void
QualityRatingDTO::setCalculationDate(Date  calculationDate)
{
	this->calculationDate = calculationDate;
}

std::list<QualityRatingComponentDTO>
QualityRatingDTO::getComponents()
{
	return components;
}

void
QualityRatingDTO::setComponents(std::list <QualityRatingComponentDTO> components)
{
	this->components = components;
}


