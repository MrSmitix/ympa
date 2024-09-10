#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FullOutletLicenseDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FullOutletLicenseDTO::FullOutletLicenseDTO()
{
	//__init();
}

FullOutletLicenseDTO::~FullOutletLicenseDTO()
{
	//__cleanup();
}

void
FullOutletLicenseDTO::__init()
{
	//id = long(0);
	//outletId = long(0);
	//licenseType = new LicenseType();
	//number = std::string();
	//dateOfIssue = null;
	//dateOfExpiry = null;
	//checkStatus = new LicenseCheckStatusType();
	//checkComment = std::string();
}

void
FullOutletLicenseDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(outletId != NULL) {
	//
	//delete outletId;
	//outletId = NULL;
	//}
	//if(licenseType != NULL) {
	//
	//delete licenseType;
	//licenseType = NULL;
	//}
	//if(number != NULL) {
	//
	//delete number;
	//number = NULL;
	//}
	//if(dateOfIssue != NULL) {
	//
	//delete dateOfIssue;
	//dateOfIssue = NULL;
	//}
	//if(dateOfExpiry != NULL) {
	//
	//delete dateOfExpiry;
	//dateOfExpiry = NULL;
	//}
	//if(checkStatus != NULL) {
	//
	//delete checkStatus;
	//checkStatus = NULL;
	//}
	//if(checkComment != NULL) {
	//
	//delete checkComment;
	//checkComment = NULL;
	//}
	//
}

void
FullOutletLicenseDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *outletIdKey = "outletId";
	node = json_object_get_member(pJsonObject, outletIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&outletId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *licenseTypeKey = "licenseType";
	node = json_object_get_member(pJsonObject, licenseTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("LicenseType")) {
			jsonToValue(&licenseType, node, "LicenseType", "LicenseType");
		} else {
			
			LicenseType* obj = static_cast<LicenseType*> (&licenseType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *numberKey = "number";
	node = json_object_get_member(pJsonObject, numberKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&number, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dateOfIssueKey = "dateOfIssue";
	node = json_object_get_member(pJsonObject, dateOfIssueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&dateOfIssue, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dateOfExpiryKey = "dateOfExpiry";
	node = json_object_get_member(pJsonObject, dateOfExpiryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&dateOfExpiry, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *checkStatusKey = "checkStatus";
	node = json_object_get_member(pJsonObject, checkStatusKey);
	if (node !=NULL) {
	

		if (isprimitive("LicenseCheckStatusType")) {
			jsonToValue(&checkStatus, node, "LicenseCheckStatusType", "LicenseCheckStatusType");
		} else {
			
			LicenseCheckStatusType* obj = static_cast<LicenseCheckStatusType*> (&checkStatus);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *checkCommentKey = "checkComment";
	node = json_object_get_member(pJsonObject, checkCommentKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&checkComment, node, "std::string", "");
		} else {
			
		}
	}
}

FullOutletLicenseDTO::FullOutletLicenseDTO(char* json)
{
	this->fromJson(json);
}

char*
FullOutletLicenseDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("long long")) {
		long long obj = getOutletId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *outletIdKey = "outletId";
	json_object_set_member(pJsonObject, outletIdKey, node);
	if (isprimitive("LicenseType")) {
		LicenseType obj = getLicenseType();
		node = converttoJson(&obj, "LicenseType", "");
	}
	else {
		
		LicenseType obj = static_cast<LicenseType> (getLicenseType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *licenseTypeKey = "licenseType";
	json_object_set_member(pJsonObject, licenseTypeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getNumber();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *numberKey = "number";
	json_object_set_member(pJsonObject, numberKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDateOfIssue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dateOfIssueKey = "dateOfIssue";
	json_object_set_member(pJsonObject, dateOfIssueKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDateOfExpiry();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dateOfExpiryKey = "dateOfExpiry";
	json_object_set_member(pJsonObject, dateOfExpiryKey, node);
	if (isprimitive("LicenseCheckStatusType")) {
		LicenseCheckStatusType obj = getCheckStatus();
		node = converttoJson(&obj, "LicenseCheckStatusType", "");
	}
	else {
		
		LicenseCheckStatusType obj = static_cast<LicenseCheckStatusType> (getCheckStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *checkStatusKey = "checkStatus";
	json_object_set_member(pJsonObject, checkStatusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCheckComment();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *checkCommentKey = "checkComment";
	json_object_set_member(pJsonObject, checkCommentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
FullOutletLicenseDTO::getId()
{
	return id;
}

void
FullOutletLicenseDTO::setId(long long  id)
{
	this->id = id;
}

long long
FullOutletLicenseDTO::getOutletId()
{
	return outletId;
}

void
FullOutletLicenseDTO::setOutletId(long long  outletId)
{
	this->outletId = outletId;
}

LicenseType
FullOutletLicenseDTO::getLicenseType()
{
	return licenseType;
}

void
FullOutletLicenseDTO::setLicenseType(LicenseType  licenseType)
{
	this->licenseType = licenseType;
}

std::string
FullOutletLicenseDTO::getNumber()
{
	return number;
}

void
FullOutletLicenseDTO::setNumber(std::string  number)
{
	this->number = number;
}

std::string
FullOutletLicenseDTO::getDateOfIssue()
{
	return dateOfIssue;
}

void
FullOutletLicenseDTO::setDateOfIssue(std::string  dateOfIssue)
{
	this->dateOfIssue = dateOfIssue;
}

std::string
FullOutletLicenseDTO::getDateOfExpiry()
{
	return dateOfExpiry;
}

void
FullOutletLicenseDTO::setDateOfExpiry(std::string  dateOfExpiry)
{
	this->dateOfExpiry = dateOfExpiry;
}

LicenseCheckStatusType
FullOutletLicenseDTO::getCheckStatus()
{
	return checkStatus;
}

void
FullOutletLicenseDTO::setCheckStatus(LicenseCheckStatusType  checkStatus)
{
	this->checkStatus = checkStatus;
}

std::string
FullOutletLicenseDTO::getCheckComment()
{
	return checkComment;
}

void
FullOutletLicenseDTO::setCheckComment(std::string  checkComment)
{
	this->checkComment = checkComment;
}


