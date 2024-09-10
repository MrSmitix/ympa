#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "OfferMappingsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


OfferMappingsManager::OfferMappingsManager()
{

}

OfferMappingsManager::~OfferMappingsManager()
{

}

static gboolean __OfferMappingsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __OfferMappingsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__OfferMappingsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool getOfferMappingEntriesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetOfferMappingEntriesResponse, Error, void* )
	= reinterpret_cast<void(*)(GetOfferMappingEntriesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetOfferMappingEntriesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetOfferMappingEntriesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetOfferMappingEntriesResponse", "GetOfferMappingEntriesResponse");
			json_node_free(pJson);

			if ("GetOfferMappingEntriesResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getOfferMappingEntriesHelper(char * accessToken,
	long long campaignId, std::list<std::string> offerId, std::list<std::string> shopSku, OfferMappingKindType mappingKind, std::list<OfferProcessingStatusType> status, std::list<OfferAvailabilityStatusType> availability, std::list<int> categoryId, std::list<std::string> vendor, std::string pageToken, int limit, 
	void(* handler)(GetOfferMappingEntriesResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	for (std::list
	<std::string>::iterator queryIter = offerId.begin(); queryIter != offerId.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("offerId", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = shopSku.begin(); queryIter != shopSku.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("shopSku", itemAt));
	}
	

	itemAtq = stringify(&mappingKind, "OfferMappingKindType");
	queryParams.insert(pair<string, string>("mapping_kind", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("mapping_kind");
	}

	for (std::list
	<OfferProcessingStatusType>::iterator queryIter = status.begin(); queryIter != status.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "OfferProcessingStatusType");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("status", itemAt));
	}
	
	for (std::list
	<OfferAvailabilityStatusType>::iterator queryIter = availability.begin(); queryIter != availability.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "OfferAvailabilityStatusType");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("availability", itemAt));
	}
	
	for (std::list
	<int>::iterator queryIter = categoryId.begin(); queryIter != categoryId.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "int");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("categoryId", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = vendor.begin(); queryIter != vendor.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("vendor", itemAt));
	}
	

	itemAtq = stringify(&pageToken, "std::string");
	queryParams.insert(pair<string, string>("page_token", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page_token");
	}


	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/campaigns/{campaignId}/offer-mapping-entries");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(OfferMappingsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOfferMappingEntriesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (OfferMappingsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOfferMappingEntriesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OfferMappingsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OfferMappingsManager::getOfferMappingEntriesAsync(char * accessToken,
	long long campaignId, std::list<std::string> offerId, std::list<std::string> shopSku, OfferMappingKindType mappingKind, std::list<OfferProcessingStatusType> status, std::list<OfferAvailabilityStatusType> availability, std::list<int> categoryId, std::list<std::string> vendor, std::string pageToken, int limit, 
	void(* handler)(GetOfferMappingEntriesResponse, Error, void* )
	, void* userData)
{
	return getOfferMappingEntriesHelper(accessToken,
	campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit, 
	handler, userData, true);
}

bool OfferMappingsManager::getOfferMappingEntriesSync(char * accessToken,
	long long campaignId, std::list<std::string> offerId, std::list<std::string> shopSku, OfferMappingKindType mappingKind, std::list<OfferProcessingStatusType> status, std::list<OfferAvailabilityStatusType> availability, std::list<int> categoryId, std::list<std::string> vendor, std::string pageToken, int limit, 
	void(* handler)(GetOfferMappingEntriesResponse, Error, void* )
	, void* userData)
{
	return getOfferMappingEntriesHelper(accessToken,
	campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit, 
	handler, userData, false);
}

static bool getSuggestedOfferMappingEntriesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetSuggestedOfferMappingEntriesResponse, Error, void* )
	= reinterpret_cast<void(*)(GetSuggestedOfferMappingEntriesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetSuggestedOfferMappingEntriesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetSuggestedOfferMappingEntriesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetSuggestedOfferMappingEntriesResponse", "GetSuggestedOfferMappingEntriesResponse");
			json_node_free(pJson);

			if ("GetSuggestedOfferMappingEntriesResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getSuggestedOfferMappingEntriesHelper(char * accessToken,
	long long campaignId, std::shared_ptr<GetSuggestedOfferMappingEntriesRequest> getSuggestedOfferMappingEntriesRequest, 
	void(* handler)(GetSuggestedOfferMappingEntriesResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GetSuggestedOfferMappingEntriesRequest")) {
		node = converttoJson(&getSuggestedOfferMappingEntriesRequest, "GetSuggestedOfferMappingEntriesRequest", "");
	}
	
	char *jsonStr =  getSuggestedOfferMappingEntriesRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/offer-mapping-entries/suggestions");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(OfferMappingsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getSuggestedOfferMappingEntriesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (OfferMappingsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getSuggestedOfferMappingEntriesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OfferMappingsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OfferMappingsManager::getSuggestedOfferMappingEntriesAsync(char * accessToken,
	long long campaignId, std::shared_ptr<GetSuggestedOfferMappingEntriesRequest> getSuggestedOfferMappingEntriesRequest, 
	void(* handler)(GetSuggestedOfferMappingEntriesResponse, Error, void* )
	, void* userData)
{
	return getSuggestedOfferMappingEntriesHelper(accessToken,
	campaignId, getSuggestedOfferMappingEntriesRequest, 
	handler, userData, true);
}

bool OfferMappingsManager::getSuggestedOfferMappingEntriesSync(char * accessToken,
	long long campaignId, std::shared_ptr<GetSuggestedOfferMappingEntriesRequest> getSuggestedOfferMappingEntriesRequest, 
	void(* handler)(GetSuggestedOfferMappingEntriesResponse, Error, void* )
	, void* userData)
{
	return getSuggestedOfferMappingEntriesHelper(accessToken,
	campaignId, getSuggestedOfferMappingEntriesRequest, 
	handler, userData, false);
}

static bool updateOfferMappingEntriesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(EmptyApiResponse, Error, void* )
	= reinterpret_cast<void(*)(EmptyApiResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	EmptyApiResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("EmptyApiResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "EmptyApiResponse", "EmptyApiResponse");
			json_node_free(pJson);

			if ("EmptyApiResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool updateOfferMappingEntriesHelper(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateOfferMappingEntryRequest> updateOfferMappingEntryRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("UpdateOfferMappingEntryRequest")) {
		node = converttoJson(&updateOfferMappingEntryRequest, "UpdateOfferMappingEntryRequest", "");
	}
	
	char *jsonStr =  updateOfferMappingEntryRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/offer-mapping-entries/updates");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(OfferMappingsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateOfferMappingEntriesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (OfferMappingsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateOfferMappingEntriesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OfferMappingsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OfferMappingsManager::updateOfferMappingEntriesAsync(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateOfferMappingEntryRequest> updateOfferMappingEntryRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return updateOfferMappingEntriesHelper(accessToken,
	campaignId, updateOfferMappingEntryRequest, 
	handler, userData, true);
}

bool OfferMappingsManager::updateOfferMappingEntriesSync(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateOfferMappingEntryRequest> updateOfferMappingEntryRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return updateOfferMappingEntriesHelper(accessToken,
	campaignId, updateOfferMappingEntryRequest, 
	handler, userData, false);
}

