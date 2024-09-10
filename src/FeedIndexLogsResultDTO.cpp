#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FeedIndexLogsResultDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FeedIndexLogsResultDTO::FeedIndexLogsResultDTO()
{
	//__init();
}

FeedIndexLogsResultDTO::~FeedIndexLogsResultDTO()
{
	//__cleanup();
}

void
FeedIndexLogsResultDTO::__init()
{
	//feed = new FeedIndexLogsFeedDTO();
	//new std::list()std::list> indexLogRecords;
	//total = long(0);
}

void
FeedIndexLogsResultDTO::__cleanup()
{
	//if(feed != NULL) {
	//
	//delete feed;
	//feed = NULL;
	//}
	//if(indexLogRecords != NULL) {
	//indexLogRecords.RemoveAll(true);
	//delete indexLogRecords;
	//indexLogRecords = NULL;
	//}
	//if(total != NULL) {
	//
	//delete total;
	//total = NULL;
	//}
	//
}

void
FeedIndexLogsResultDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *feedKey = "feed";
	node = json_object_get_member(pJsonObject, feedKey);
	if (node !=NULL) {
	

		if (isprimitive("FeedIndexLogsFeedDTO")) {
			jsonToValue(&feed, node, "FeedIndexLogsFeedDTO", "FeedIndexLogsFeedDTO");
		} else {
			
			FeedIndexLogsFeedDTO* obj = static_cast<FeedIndexLogsFeedDTO*> (&feed);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *indexLogRecordsKey = "indexLogRecords";
	node = json_object_get_member(pJsonObject, indexLogRecordsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<FeedIndexLogsRecordDTO> new_list;
			FeedIndexLogsRecordDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("FeedIndexLogsRecordDTO")) {
					jsonToValue(&inst, temp_json, "FeedIndexLogsRecordDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			indexLogRecords = new_list;
		}
		
	}
	const gchar *totalKey = "total";
	node = json_object_get_member(pJsonObject, totalKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&total, node, "long long", "");
		} else {
			
		}
	}
}

FeedIndexLogsResultDTO::FeedIndexLogsResultDTO(char* json)
{
	this->fromJson(json);
}

char*
FeedIndexLogsResultDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("FeedIndexLogsFeedDTO")) {
		FeedIndexLogsFeedDTO obj = getFeed();
		node = converttoJson(&obj, "FeedIndexLogsFeedDTO", "");
	}
	else {
		
		FeedIndexLogsFeedDTO obj = static_cast<FeedIndexLogsFeedDTO> (getFeed());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *feedKey = "feed";
	json_object_set_member(pJsonObject, feedKey, node);
	if (isprimitive("FeedIndexLogsRecordDTO")) {
		list<FeedIndexLogsRecordDTO> new_list = static_cast<list <FeedIndexLogsRecordDTO> > (getIndexLogRecords());
		node = converttoJson(&new_list, "FeedIndexLogsRecordDTO", "array");
	} else {
		node = json_node_alloc();
		list<FeedIndexLogsRecordDTO> new_list = static_cast<list <FeedIndexLogsRecordDTO> > (getIndexLogRecords());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<FeedIndexLogsRecordDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			FeedIndexLogsRecordDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *indexLogRecordsKey = "indexLogRecords";
	json_object_set_member(pJsonObject, indexLogRecordsKey, node);
	if (isprimitive("long long")) {
		long long obj = getTotal();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *totalKey = "total";
	json_object_set_member(pJsonObject, totalKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

FeedIndexLogsFeedDTO
FeedIndexLogsResultDTO::getFeed()
{
	return feed;
}

void
FeedIndexLogsResultDTO::setFeed(FeedIndexLogsFeedDTO  feed)
{
	this->feed = feed;
}

std::list<FeedIndexLogsRecordDTO>
FeedIndexLogsResultDTO::getIndexLogRecords()
{
	return indexLogRecords;
}

void
FeedIndexLogsResultDTO::setIndexLogRecords(std::list <FeedIndexLogsRecordDTO> indexLogRecords)
{
	this->indexLogRecords = indexLogRecords;
}

long long
FeedIndexLogsResultDTO::getTotal()
{
	return total;
}

void
FeedIndexLogsResultDTO::setTotal(long long  total)
{
	this->total = total;
}


