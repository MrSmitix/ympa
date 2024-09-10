

#include "FullOutletLicenseDTO.h"

using namespace Tiny;

FullOutletLicenseDTO::FullOutletLicenseDTO()
{
	id = long(0);
	outletId = long(0);
	licenseType = LicenseType();
	number = std::string();
	dateOfIssue = std::string();
	dateOfExpiry = std::string();
	checkStatus = LicenseCheckStatusType();
	checkComment = std::string();
}

FullOutletLicenseDTO::FullOutletLicenseDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FullOutletLicenseDTO::~FullOutletLicenseDTO()
{

}

void
FullOutletLicenseDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *outletIdKey = "outletId";

    if(object.has_key(outletIdKey))
    {
        bourne::json value = object[outletIdKey];



        jsonToValue(&outletId, value, "long");


    }

    const char *licenseTypeKey = "licenseType";

    if(object.has_key(licenseTypeKey))
    {
        bourne::json value = object[licenseTypeKey];




        LicenseType* obj = &licenseType;
		obj->fromJson(value.dump());

    }

    const char *numberKey = "number";

    if(object.has_key(numberKey))
    {
        bourne::json value = object[numberKey];



        jsonToValue(&number, value, "std::string");


    }

    const char *dateOfIssueKey = "dateOfIssue";

    if(object.has_key(dateOfIssueKey))
    {
        bourne::json value = object[dateOfIssueKey];



        jsonToValue(&dateOfIssue, value, "std::string");


    }

    const char *dateOfExpiryKey = "dateOfExpiry";

    if(object.has_key(dateOfExpiryKey))
    {
        bourne::json value = object[dateOfExpiryKey];



        jsonToValue(&dateOfExpiry, value, "std::string");


    }

    const char *checkStatusKey = "checkStatus";

    if(object.has_key(checkStatusKey))
    {
        bourne::json value = object[checkStatusKey];




        LicenseCheckStatusType* obj = &checkStatus;
		obj->fromJson(value.dump());

    }

    const char *checkCommentKey = "checkComment";

    if(object.has_key(checkCommentKey))
    {
        bourne::json value = object[checkCommentKey];



        jsonToValue(&checkComment, value, "std::string");


    }


}

bourne::json
FullOutletLicenseDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["outletId"] = getOutletId();







	object["licenseType"] = getLicenseType().toJson();





    object["number"] = getNumber();






    object["dateOfIssue"] = getDateOfIssue();






    object["dateOfExpiry"] = getDateOfExpiry();







	object["checkStatus"] = getCheckStatus().toJson();





    object["checkComment"] = getCheckComment();



    return object;

}

long
FullOutletLicenseDTO::getId()
{
	return id;
}

void
FullOutletLicenseDTO::setId(long  id)
{
	this->id = id;
}

long
FullOutletLicenseDTO::getOutletId()
{
	return outletId;
}

void
FullOutletLicenseDTO::setOutletId(long  outletId)
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



