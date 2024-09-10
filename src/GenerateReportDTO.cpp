#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GenerateReportDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GenerateReportDTO::GenerateReportDTO()
{
	//__init();
}

GenerateReportDTO::~GenerateReportDTO()
{
	//__cleanup();
}

void
GenerateReportDTO::__init()
{
	//reportId = std::string();
	//estimatedGenerationTime = long(0);
}

void
GenerateReportDTO::__cleanup()
{
	//if(reportId != NULL) {
	//
	//delete reportId;
	//reportId = NULL;
	//}
	//if(estimatedGenerationTime != NULL) {
	//
	//delete estimatedGenerationTime;
	//estimatedGenerationTime = NULL;
	//}
	//
}

void
GenerateReportDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *reportIdKey = "reportId";
	node = json_object_get_member(pJsonObject, reportIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&reportId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *estimatedGenerationTimeKey = "estimatedGenerationTime";
	node = json_object_get_member(pJsonObject, estimatedGenerationTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&estimatedGenerationTime, node, "long long", "");
		} else {
			
		}
	}
}

GenerateReportDTO::GenerateReportDTO(char* json)
{
	this->fromJson(json);
}

char*
GenerateReportDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getReportId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *reportIdKey = "reportId";
	json_object_set_member(pJsonObject, reportIdKey, node);
	if (isprimitive("long long")) {
		long long obj = getEstimatedGenerationTime();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *estimatedGenerationTimeKey = "estimatedGenerationTime";
	json_object_set_member(pJsonObject, estimatedGenerationTimeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
GenerateReportDTO::getReportId()
{
	return reportId;
}

void
GenerateReportDTO::setReportId(std::string  reportId)
{
	this->reportId = reportId;
}

long long
GenerateReportDTO::getEstimatedGenerationTime()
{
	return estimatedGenerationTime;
}

void
GenerateReportDTO::setEstimatedGenerationTime(long long  estimatedGenerationTime)
{
	this->estimatedGenerationTime = estimatedGenerationTime;
}


