#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ReturnDecisionDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ReturnDecisionDTO::ReturnDecisionDTO()
{
	//__init();
}

ReturnDecisionDTO::~ReturnDecisionDTO()
{
	//__cleanup();
}

void
ReturnDecisionDTO::__init()
{
	//returnItemId = long(0);
	//count = int(0);
	//comment = std::string();
	//reasonType = new ReturnDecisionReasonType();
	//subreasonType = new ReturnDecisionSubreasonType();
	//decisionType = new ReturnDecisionType();
	//refundAmount = long(0);
	//partnerCompensation = long(0);
	//new std::list()std::list> images;
}

void
ReturnDecisionDTO::__cleanup()
{
	//if(returnItemId != NULL) {
	//
	//delete returnItemId;
	//returnItemId = NULL;
	//}
	//if(count != NULL) {
	//
	//delete count;
	//count = NULL;
	//}
	//if(comment != NULL) {
	//
	//delete comment;
	//comment = NULL;
	//}
	//if(reasonType != NULL) {
	//
	//delete reasonType;
	//reasonType = NULL;
	//}
	//if(subreasonType != NULL) {
	//
	//delete subreasonType;
	//subreasonType = NULL;
	//}
	//if(decisionType != NULL) {
	//
	//delete decisionType;
	//decisionType = NULL;
	//}
	//if(refundAmount != NULL) {
	//
	//delete refundAmount;
	//refundAmount = NULL;
	//}
	//if(partnerCompensation != NULL) {
	//
	//delete partnerCompensation;
	//partnerCompensation = NULL;
	//}
	//if(images != NULL) {
	//images.RemoveAll(true);
	//delete images;
	//images = NULL;
	//}
	//
}

void
ReturnDecisionDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *returnItemIdKey = "returnItemId";
	node = json_object_get_member(pJsonObject, returnItemIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&returnItemId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *countKey = "count";
	node = json_object_get_member(pJsonObject, countKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&count, node, "int", "");
		} else {
			
		}
	}
	const gchar *commentKey = "comment";
	node = json_object_get_member(pJsonObject, commentKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&comment, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *reasonTypeKey = "reasonType";
	node = json_object_get_member(pJsonObject, reasonTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ReturnDecisionReasonType")) {
			jsonToValue(&reasonType, node, "ReturnDecisionReasonType", "ReturnDecisionReasonType");
		} else {
			
			ReturnDecisionReasonType* obj = static_cast<ReturnDecisionReasonType*> (&reasonType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *subreasonTypeKey = "subreasonType";
	node = json_object_get_member(pJsonObject, subreasonTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ReturnDecisionSubreasonType")) {
			jsonToValue(&subreasonType, node, "ReturnDecisionSubreasonType", "ReturnDecisionSubreasonType");
		} else {
			
			ReturnDecisionSubreasonType* obj = static_cast<ReturnDecisionSubreasonType*> (&subreasonType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *decisionTypeKey = "decisionType";
	node = json_object_get_member(pJsonObject, decisionTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ReturnDecisionType")) {
			jsonToValue(&decisionType, node, "ReturnDecisionType", "ReturnDecisionType");
		} else {
			
			ReturnDecisionType* obj = static_cast<ReturnDecisionType*> (&decisionType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *refundAmountKey = "refundAmount";
	node = json_object_get_member(pJsonObject, refundAmountKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&refundAmount, node, "long long", "");
		} else {
			
		}
	}
	const gchar *partnerCompensationKey = "partnerCompensation";
	node = json_object_get_member(pJsonObject, partnerCompensationKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&partnerCompensation, node, "long long", "");
		} else {
			
		}
	}
	const gchar *imagesKey = "images";
	node = json_object_get_member(pJsonObject, imagesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			images = new_list;
		}
		
	}
}

ReturnDecisionDTO::ReturnDecisionDTO(char* json)
{
	this->fromJson(json);
}

char*
ReturnDecisionDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getReturnItemId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *returnItemIdKey = "returnItemId";
	json_object_set_member(pJsonObject, returnItemIdKey, node);
	if (isprimitive("int")) {
		int obj = getCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *countKey = "count";
	json_object_set_member(pJsonObject, countKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getComment();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *commentKey = "comment";
	json_object_set_member(pJsonObject, commentKey, node);
	if (isprimitive("ReturnDecisionReasonType")) {
		ReturnDecisionReasonType obj = getReasonType();
		node = converttoJson(&obj, "ReturnDecisionReasonType", "");
	}
	else {
		
		ReturnDecisionReasonType obj = static_cast<ReturnDecisionReasonType> (getReasonType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *reasonTypeKey = "reasonType";
	json_object_set_member(pJsonObject, reasonTypeKey, node);
	if (isprimitive("ReturnDecisionSubreasonType")) {
		ReturnDecisionSubreasonType obj = getSubreasonType();
		node = converttoJson(&obj, "ReturnDecisionSubreasonType", "");
	}
	else {
		
		ReturnDecisionSubreasonType obj = static_cast<ReturnDecisionSubreasonType> (getSubreasonType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *subreasonTypeKey = "subreasonType";
	json_object_set_member(pJsonObject, subreasonTypeKey, node);
	if (isprimitive("ReturnDecisionType")) {
		ReturnDecisionType obj = getDecisionType();
		node = converttoJson(&obj, "ReturnDecisionType", "");
	}
	else {
		
		ReturnDecisionType obj = static_cast<ReturnDecisionType> (getDecisionType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *decisionTypeKey = "decisionType";
	json_object_set_member(pJsonObject, decisionTypeKey, node);
	if (isprimitive("long long")) {
		long long obj = getRefundAmount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *refundAmountKey = "refundAmount";
	json_object_set_member(pJsonObject, refundAmountKey, node);
	if (isprimitive("long long")) {
		long long obj = getPartnerCompensation();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *partnerCompensationKey = "partnerCompensation";
	json_object_set_member(pJsonObject, partnerCompensationKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getImages());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getImages());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *imagesKey = "images";
	json_object_set_member(pJsonObject, imagesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
ReturnDecisionDTO::getReturnItemId()
{
	return returnItemId;
}

void
ReturnDecisionDTO::setReturnItemId(long long  returnItemId)
{
	this->returnItemId = returnItemId;
}

int
ReturnDecisionDTO::getCount()
{
	return count;
}

void
ReturnDecisionDTO::setCount(int  count)
{
	this->count = count;
}

std::string
ReturnDecisionDTO::getComment()
{
	return comment;
}

void
ReturnDecisionDTO::setComment(std::string  comment)
{
	this->comment = comment;
}

ReturnDecisionReasonType
ReturnDecisionDTO::getReasonType()
{
	return reasonType;
}

void
ReturnDecisionDTO::setReasonType(ReturnDecisionReasonType  reasonType)
{
	this->reasonType = reasonType;
}

ReturnDecisionSubreasonType
ReturnDecisionDTO::getSubreasonType()
{
	return subreasonType;
}

void
ReturnDecisionDTO::setSubreasonType(ReturnDecisionSubreasonType  subreasonType)
{
	this->subreasonType = subreasonType;
}

ReturnDecisionType
ReturnDecisionDTO::getDecisionType()
{
	return decisionType;
}

void
ReturnDecisionDTO::setDecisionType(ReturnDecisionType  decisionType)
{
	this->decisionType = decisionType;
}

long long
ReturnDecisionDTO::getRefundAmount()
{
	return refundAmount;
}

void
ReturnDecisionDTO::setRefundAmount(long long  refundAmount)
{
	this->refundAmount = refundAmount;
}

long long
ReturnDecisionDTO::getPartnerCompensation()
{
	return partnerCompensation;
}

void
ReturnDecisionDTO::setPartnerCompensation(long long  partnerCompensation)
{
	this->partnerCompensation = partnerCompensation;
}

std::list<std::string>
ReturnDecisionDTO::getImages()
{
	return images;
}

void
ReturnDecisionDTO::setImages(std::list <std::string> images)
{
	this->images = images;
}


