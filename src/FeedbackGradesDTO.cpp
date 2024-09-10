#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FeedbackGradesDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FeedbackGradesDTO::FeedbackGradesDTO()
{
	//__init();
}

FeedbackGradesDTO::~FeedbackGradesDTO()
{
	//__cleanup();
}

void
FeedbackGradesDTO::__init()
{
	//average = double(0);
	//agreeCount = long(0);
	//rejectCount = long(0);
	//new std::list()std::list> factors;
}

void
FeedbackGradesDTO::__cleanup()
{
	//if(average != NULL) {
	//
	//delete average;
	//average = NULL;
	//}
	//if(agreeCount != NULL) {
	//
	//delete agreeCount;
	//agreeCount = NULL;
	//}
	//if(rejectCount != NULL) {
	//
	//delete rejectCount;
	//rejectCount = NULL;
	//}
	//if(factors != NULL) {
	//factors.RemoveAll(true);
	//delete factors;
	//factors = NULL;
	//}
	//
}

void
FeedbackGradesDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *averageKey = "average";
	node = json_object_get_member(pJsonObject, averageKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&average, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&average);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *agreeCountKey = "agreeCount";
	node = json_object_get_member(pJsonObject, agreeCountKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&agreeCount, node, "long long", "");
		} else {
			
		}
	}
	const gchar *rejectCountKey = "rejectCount";
	node = json_object_get_member(pJsonObject, rejectCountKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&rejectCount, node, "long long", "");
		} else {
			
		}
	}
	const gchar *factorsKey = "factors";
	node = json_object_get_member(pJsonObject, factorsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<FeedbackFactorDTO> new_list;
			FeedbackFactorDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("FeedbackFactorDTO")) {
					jsonToValue(&inst, temp_json, "FeedbackFactorDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			factors = new_list;
		}
		
	}
}

FeedbackGradesDTO::FeedbackGradesDTO(char* json)
{
	this->fromJson(json);
}

char*
FeedbackGradesDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getAverage();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getAverage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *averageKey = "average";
	json_object_set_member(pJsonObject, averageKey, node);
	if (isprimitive("long long")) {
		long long obj = getAgreeCount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *agreeCountKey = "agreeCount";
	json_object_set_member(pJsonObject, agreeCountKey, node);
	if (isprimitive("long long")) {
		long long obj = getRejectCount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *rejectCountKey = "rejectCount";
	json_object_set_member(pJsonObject, rejectCountKey, node);
	if (isprimitive("FeedbackFactorDTO")) {
		list<FeedbackFactorDTO> new_list = static_cast<list <FeedbackFactorDTO> > (getFactors());
		node = converttoJson(&new_list, "FeedbackFactorDTO", "array");
	} else {
		node = json_node_alloc();
		list<FeedbackFactorDTO> new_list = static_cast<list <FeedbackFactorDTO> > (getFactors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<FeedbackFactorDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			FeedbackFactorDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *factorsKey = "factors";
	json_object_set_member(pJsonObject, factorsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
FeedbackGradesDTO::getAverage()
{
	return average;
}

void
FeedbackGradesDTO::setAverage(long long  average)
{
	this->average = average;
}

long long
FeedbackGradesDTO::getAgreeCount()
{
	return agreeCount;
}

void
FeedbackGradesDTO::setAgreeCount(long long  agreeCount)
{
	this->agreeCount = agreeCount;
}

long long
FeedbackGradesDTO::getRejectCount()
{
	return rejectCount;
}

void
FeedbackGradesDTO::setRejectCount(long long  rejectCount)
{
	this->rejectCount = rejectCount;
}

std::list<FeedbackFactorDTO>
FeedbackGradesDTO::getFactors()
{
	return factors;
}

void
FeedbackGradesDTO::setFactors(std::list <FeedbackFactorDTO> factors)
{
	this->factors = factors;
}


