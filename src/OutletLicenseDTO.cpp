#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OutletLicenseDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OutletLicenseDTO::OutletLicenseDTO()
{
	//__init();
}

OutletLicenseDTO::~OutletLicenseDTO()
{
	//__cleanup();
}

void
OutletLicenseDTO::__init()
{
	//id = long(0);
	//outletId = long(0);
	//licenseType = new LicenseType();
	//number = std::string();
	//dateOfIssue = null;
	//dateOfExpiry = null;
}

void
OutletLicenseDTO::__cleanup()
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
	//
}

void
OutletLicenseDTO::fromJson(char* jsonStr)
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
}

OutletLicenseDTO::OutletLicenseDTO(char* json)
{
	this->fromJson(json);
}

char*
OutletLicenseDTO::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
OutletLicenseDTO::getId()
{
	return id;
}

void
OutletLicenseDTO::setId(long long  id)
{
	this->id = id;
}

long long
OutletLicenseDTO::getOutletId()
{
	return outletId;
}

void
OutletLicenseDTO::setOutletId(long long  outletId)
{
	this->outletId = outletId;
}

LicenseType
OutletLicenseDTO::getLicenseType()
{
	return licenseType;
}

void
OutletLicenseDTO::setLicenseType(LicenseType  licenseType)
{
	this->licenseType = licenseType;
}

std::string
OutletLicenseDTO::getNumber()
{
	return number;
}

void
OutletLicenseDTO::setNumber(std::string  number)
{
	this->number = number;
}

std::string
OutletLicenseDTO::getDateOfIssue()
{
	return dateOfIssue;
}

void
OutletLicenseDTO::setDateOfIssue(std::string  dateOfIssue)
{
	this->dateOfIssue = dateOfIssue;
}

std::string
OutletLicenseDTO::getDateOfExpiry()
{
	return dateOfExpiry;
}

void
OutletLicenseDTO::setDateOfExpiry(std::string  dateOfExpiry)
{
	this->dateOfExpiry = dateOfExpiry;
}


