#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GoodsFeedbackDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GoodsFeedbackDTO::GoodsFeedbackDTO()
{
	//__init();
}

GoodsFeedbackDTO::~GoodsFeedbackDTO()
{
	//__cleanup();
}

void
GoodsFeedbackDTO::__init()
{
	//feedbackId = long(0);
	//createdAt = null;
	//needReaction = bool(false);
	//identifiers = new GoodsFeedbackIdentifiersDTO();
	//author = std::string();
	//description = new GoodsFeedbackDescriptionDTO();
	//media = new GoodsFeedbackMediaDTO();
	//statistics = new GoodsFeedbackStatisticsDTO();
}

void
GoodsFeedbackDTO::__cleanup()
{
	//if(feedbackId != NULL) {
	//
	//delete feedbackId;
	//feedbackId = NULL;
	//}
	//if(createdAt != NULL) {
	//
	//delete createdAt;
	//createdAt = NULL;
	//}
	//if(needReaction != NULL) {
	//
	//delete needReaction;
	//needReaction = NULL;
	//}
	//if(identifiers != NULL) {
	//
	//delete identifiers;
	//identifiers = NULL;
	//}
	//if(author != NULL) {
	//
	//delete author;
	//author = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(media != NULL) {
	//
	//delete media;
	//media = NULL;
	//}
	//if(statistics != NULL) {
	//
	//delete statistics;
	//statistics = NULL;
	//}
	//
}

void
GoodsFeedbackDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *feedbackIdKey = "feedbackId";
	node = json_object_get_member(pJsonObject, feedbackIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&feedbackId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *createdAtKey = "createdAt";
	node = json_object_get_member(pJsonObject, createdAtKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&createdAt, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *needReactionKey = "needReaction";
	node = json_object_get_member(pJsonObject, needReactionKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&needReaction, node, "bool", "");
		} else {
			
		}
	}
	const gchar *identifiersKey = "identifiers";
	node = json_object_get_member(pJsonObject, identifiersKey);
	if (node !=NULL) {
	

		if (isprimitive("GoodsFeedbackIdentifiersDTO")) {
			jsonToValue(&identifiers, node, "GoodsFeedbackIdentifiersDTO", "GoodsFeedbackIdentifiersDTO");
		} else {
			
			GoodsFeedbackIdentifiersDTO* obj = static_cast<GoodsFeedbackIdentifiersDTO*> (&identifiers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authorKey = "author";
	node = json_object_get_member(pJsonObject, authorKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&author, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("GoodsFeedbackDescriptionDTO")) {
			jsonToValue(&description, node, "GoodsFeedbackDescriptionDTO", "GoodsFeedbackDescriptionDTO");
		} else {
			
			GoodsFeedbackDescriptionDTO* obj = static_cast<GoodsFeedbackDescriptionDTO*> (&description);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *mediaKey = "media";
	node = json_object_get_member(pJsonObject, mediaKey);
	if (node !=NULL) {
	

		if (isprimitive("GoodsFeedbackMediaDTO")) {
			jsonToValue(&media, node, "GoodsFeedbackMediaDTO", "GoodsFeedbackMediaDTO");
		} else {
			
			GoodsFeedbackMediaDTO* obj = static_cast<GoodsFeedbackMediaDTO*> (&media);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *statisticsKey = "statistics";
	node = json_object_get_member(pJsonObject, statisticsKey);
	if (node !=NULL) {
	

		if (isprimitive("GoodsFeedbackStatisticsDTO")) {
			jsonToValue(&statistics, node, "GoodsFeedbackStatisticsDTO", "GoodsFeedbackStatisticsDTO");
		} else {
			
			GoodsFeedbackStatisticsDTO* obj = static_cast<GoodsFeedbackStatisticsDTO*> (&statistics);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GoodsFeedbackDTO::GoodsFeedbackDTO(char* json)
{
	this->fromJson(json);
}

char*
GoodsFeedbackDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getFeedbackId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *feedbackIdKey = "feedbackId";
	json_object_set_member(pJsonObject, feedbackIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCreatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *createdAtKey = "createdAt";
	json_object_set_member(pJsonObject, createdAtKey, node);
	if (isprimitive("bool")) {
		bool obj = getNeedReaction();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *needReactionKey = "needReaction";
	json_object_set_member(pJsonObject, needReactionKey, node);
	if (isprimitive("GoodsFeedbackIdentifiersDTO")) {
		GoodsFeedbackIdentifiersDTO obj = getIdentifiers();
		node = converttoJson(&obj, "GoodsFeedbackIdentifiersDTO", "");
	}
	else {
		
		GoodsFeedbackIdentifiersDTO obj = static_cast<GoodsFeedbackIdentifiersDTO> (getIdentifiers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *identifiersKey = "identifiers";
	json_object_set_member(pJsonObject, identifiersKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAuthor();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *authorKey = "author";
	json_object_set_member(pJsonObject, authorKey, node);
	if (isprimitive("GoodsFeedbackDescriptionDTO")) {
		GoodsFeedbackDescriptionDTO obj = getDescription();
		node = converttoJson(&obj, "GoodsFeedbackDescriptionDTO", "");
	}
	else {
		
		GoodsFeedbackDescriptionDTO obj = static_cast<GoodsFeedbackDescriptionDTO> (getDescription());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("GoodsFeedbackMediaDTO")) {
		GoodsFeedbackMediaDTO obj = getMedia();
		node = converttoJson(&obj, "GoodsFeedbackMediaDTO", "");
	}
	else {
		
		GoodsFeedbackMediaDTO obj = static_cast<GoodsFeedbackMediaDTO> (getMedia());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mediaKey = "media";
	json_object_set_member(pJsonObject, mediaKey, node);
	if (isprimitive("GoodsFeedbackStatisticsDTO")) {
		GoodsFeedbackStatisticsDTO obj = getStatistics();
		node = converttoJson(&obj, "GoodsFeedbackStatisticsDTO", "");
	}
	else {
		
		GoodsFeedbackStatisticsDTO obj = static_cast<GoodsFeedbackStatisticsDTO> (getStatistics());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statisticsKey = "statistics";
	json_object_set_member(pJsonObject, statisticsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GoodsFeedbackDTO::getFeedbackId()
{
	return feedbackId;
}

void
GoodsFeedbackDTO::setFeedbackId(long long  feedbackId)
{
	this->feedbackId = feedbackId;
}

std::string
GoodsFeedbackDTO::getCreatedAt()
{
	return createdAt;
}

void
GoodsFeedbackDTO::setCreatedAt(std::string  createdAt)
{
	this->createdAt = createdAt;
}

bool
GoodsFeedbackDTO::getNeedReaction()
{
	return needReaction;
}

void
GoodsFeedbackDTO::setNeedReaction(bool  needReaction)
{
	this->needReaction = needReaction;
}

GoodsFeedbackIdentifiersDTO
GoodsFeedbackDTO::getIdentifiers()
{
	return identifiers;
}

void
GoodsFeedbackDTO::setIdentifiers(GoodsFeedbackIdentifiersDTO  identifiers)
{
	this->identifiers = identifiers;
}

std::string
GoodsFeedbackDTO::getAuthor()
{
	return author;
}

void
GoodsFeedbackDTO::setAuthor(std::string  author)
{
	this->author = author;
}

GoodsFeedbackDescriptionDTO
GoodsFeedbackDTO::getDescription()
{
	return description;
}

void
GoodsFeedbackDTO::setDescription(GoodsFeedbackDescriptionDTO  description)
{
	this->description = description;
}

GoodsFeedbackMediaDTO
GoodsFeedbackDTO::getMedia()
{
	return media;
}

void
GoodsFeedbackDTO::setMedia(GoodsFeedbackMediaDTO  media)
{
	this->media = media;
}

GoodsFeedbackStatisticsDTO
GoodsFeedbackDTO::getStatistics()
{
	return statistics;
}

void
GoodsFeedbackDTO::setStatistics(GoodsFeedbackStatisticsDTO  statistics)
{
	this->statistics = statistics;
}


