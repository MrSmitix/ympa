#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "DbsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


DbsManager::DbsManager()
{

}

DbsManager::~DbsManager()
{

}

static gboolean __DbsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __DbsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__DbsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool acceptOrderCancellationProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool acceptOrderCancellationHelper(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<AcceptOrderCancellationRequest> acceptOrderCancellationRequest, 
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

	if (isprimitive("AcceptOrderCancellationRequest")) {
		node = converttoJson(&acceptOrderCancellationRequest, "AcceptOrderCancellationRequest", "");
	}
	
	char *jsonStr =  acceptOrderCancellationRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/orders/{orderId}/cancellation/accept");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = acceptOrderCancellationProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), acceptOrderCancellationProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::acceptOrderCancellationAsync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<AcceptOrderCancellationRequest> acceptOrderCancellationRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return acceptOrderCancellationHelper(accessToken,
	campaignId, orderId, acceptOrderCancellationRequest, 
	handler, userData, true);
}

bool DbsManager::acceptOrderCancellationSync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<AcceptOrderCancellationRequest> acceptOrderCancellationRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return acceptOrderCancellationHelper(accessToken,
	campaignId, orderId, acceptOrderCancellationRequest, 
	handler, userData, false);
}

static bool addHiddenOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool addHiddenOffersHelper(char * accessToken,
	long long campaignId, std::shared_ptr<AddHiddenOffersRequest> addHiddenOffersRequest, 
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

	if (isprimitive("AddHiddenOffersRequest")) {
		node = converttoJson(&addHiddenOffersRequest, "AddHiddenOffersRequest", "");
	}
	
	char *jsonStr =  addHiddenOffersRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/hidden-offers");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = addHiddenOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), addHiddenOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::addHiddenOffersAsync(char * accessToken,
	long long campaignId, std::shared_ptr<AddHiddenOffersRequest> addHiddenOffersRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return addHiddenOffersHelper(accessToken,
	campaignId, addHiddenOffersRequest, 
	handler, userData, true);
}

bool DbsManager::addHiddenOffersSync(char * accessToken,
	long long campaignId, std::shared_ptr<AddHiddenOffersRequest> addHiddenOffersRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return addHiddenOffersHelper(accessToken,
	campaignId, addHiddenOffersRequest, 
	handler, userData, false);
}

static bool addOffersToArchiveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AddOffersToArchiveResponse, Error, void* )
	= reinterpret_cast<void(*)(AddOffersToArchiveResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AddOffersToArchiveResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AddOffersToArchiveResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AddOffersToArchiveResponse", "AddOffersToArchiveResponse");
			json_node_free(pJson);

			if ("AddOffersToArchiveResponse" == "std::string") {
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

static bool addOffersToArchiveHelper(char * accessToken,
	long long businessId, std::shared_ptr<AddOffersToArchiveRequest> addOffersToArchiveRequest, 
	void(* handler)(AddOffersToArchiveResponse, Error, void* )
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

	if (isprimitive("AddOffersToArchiveRequest")) {
		node = converttoJson(&addOffersToArchiveRequest, "AddOffersToArchiveRequest", "");
	}
	
	char *jsonStr =  addOffersToArchiveRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/offer-mappings/archive");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = addOffersToArchiveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), addOffersToArchiveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::addOffersToArchiveAsync(char * accessToken,
	long long businessId, std::shared_ptr<AddOffersToArchiveRequest> addOffersToArchiveRequest, 
	void(* handler)(AddOffersToArchiveResponse, Error, void* )
	, void* userData)
{
	return addOffersToArchiveHelper(accessToken,
	businessId, addOffersToArchiveRequest, 
	handler, userData, true);
}

bool DbsManager::addOffersToArchiveSync(char * accessToken,
	long long businessId, std::shared_ptr<AddOffersToArchiveRequest> addOffersToArchiveRequest, 
	void(* handler)(AddOffersToArchiveResponse, Error, void* )
	, void* userData)
{
	return addOffersToArchiveHelper(accessToken,
	businessId, addOffersToArchiveRequest, 
	handler, userData, false);
}

static bool calculateTariffsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CalculateTariffsResponse, Error, void* )
	= reinterpret_cast<void(*)(CalculateTariffsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CalculateTariffsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CalculateTariffsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CalculateTariffsResponse", "CalculateTariffsResponse");
			json_node_free(pJson);

			if ("CalculateTariffsResponse" == "std::string") {
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

static bool calculateTariffsHelper(char * accessToken,
	std::shared_ptr<CalculateTariffsRequest> calculateTariffsRequest, 
	void(* handler)(CalculateTariffsResponse, Error, void* )
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

	if (isprimitive("CalculateTariffsRequest")) {
		node = converttoJson(&calculateTariffsRequest, "CalculateTariffsRequest", "");
	}
	
	char *jsonStr =  calculateTariffsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/tariffs/calculate");
	int pos;


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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = calculateTariffsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), calculateTariffsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::calculateTariffsAsync(char * accessToken,
	std::shared_ptr<CalculateTariffsRequest> calculateTariffsRequest, 
	void(* handler)(CalculateTariffsResponse, Error, void* )
	, void* userData)
{
	return calculateTariffsHelper(accessToken,
	calculateTariffsRequest, 
	handler, userData, true);
}

bool DbsManager::calculateTariffsSync(char * accessToken,
	std::shared_ptr<CalculateTariffsRequest> calculateTariffsRequest, 
	void(* handler)(CalculateTariffsResponse, Error, void* )
	, void* userData)
{
	return calculateTariffsHelper(accessToken,
	calculateTariffsRequest, 
	handler, userData, false);
}

static bool confirmBusinessPricesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool confirmBusinessPricesHelper(char * accessToken,
	long long businessId, std::shared_ptr<ConfirmPricesRequest> confirmPricesRequest, 
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

	if (isprimitive("ConfirmPricesRequest")) {
		node = converttoJson(&confirmPricesRequest, "ConfirmPricesRequest", "");
	}
	
	char *jsonStr =  confirmPricesRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/price-quarantine/confirm");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = confirmBusinessPricesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), confirmBusinessPricesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::confirmBusinessPricesAsync(char * accessToken,
	long long businessId, std::shared_ptr<ConfirmPricesRequest> confirmPricesRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return confirmBusinessPricesHelper(accessToken,
	businessId, confirmPricesRequest, 
	handler, userData, true);
}

bool DbsManager::confirmBusinessPricesSync(char * accessToken,
	long long businessId, std::shared_ptr<ConfirmPricesRequest> confirmPricesRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return confirmBusinessPricesHelper(accessToken,
	businessId, confirmPricesRequest, 
	handler, userData, false);
}

static bool confirmCampaignPricesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool confirmCampaignPricesHelper(char * accessToken,
	long long campaignId, std::shared_ptr<ConfirmPricesRequest> confirmPricesRequest, 
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

	if (isprimitive("ConfirmPricesRequest")) {
		node = converttoJson(&confirmPricesRequest, "ConfirmPricesRequest", "");
	}
	
	char *jsonStr =  confirmPricesRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/price-quarantine/confirm");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = confirmCampaignPricesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), confirmCampaignPricesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::confirmCampaignPricesAsync(char * accessToken,
	long long campaignId, std::shared_ptr<ConfirmPricesRequest> confirmPricesRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return confirmCampaignPricesHelper(accessToken,
	campaignId, confirmPricesRequest, 
	handler, userData, true);
}

bool DbsManager::confirmCampaignPricesSync(char * accessToken,
	long long campaignId, std::shared_ptr<ConfirmPricesRequest> confirmPricesRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return confirmCampaignPricesHelper(accessToken,
	campaignId, confirmPricesRequest, 
	handler, userData, false);
}

static bool createChatProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CreateChatResponse, Error, void* )
	= reinterpret_cast<void(*)(CreateChatResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CreateChatResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CreateChatResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CreateChatResponse", "CreateChatResponse");
			json_node_free(pJson);

			if ("CreateChatResponse" == "std::string") {
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

static bool createChatHelper(char * accessToken,
	long long businessId, std::shared_ptr<CreateChatRequest> createChatRequest, 
	void(* handler)(CreateChatResponse, Error, void* )
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

	if (isprimitive("CreateChatRequest")) {
		node = converttoJson(&createChatRequest, "CreateChatRequest", "");
	}
	
	char *jsonStr =  createChatRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/chats/new");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createChatProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createChatProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::createChatAsync(char * accessToken,
	long long businessId, std::shared_ptr<CreateChatRequest> createChatRequest, 
	void(* handler)(CreateChatResponse, Error, void* )
	, void* userData)
{
	return createChatHelper(accessToken,
	businessId, createChatRequest, 
	handler, userData, true);
}

bool DbsManager::createChatSync(char * accessToken,
	long long businessId, std::shared_ptr<CreateChatRequest> createChatRequest, 
	void(* handler)(CreateChatResponse, Error, void* )
	, void* userData)
{
	return createChatHelper(accessToken,
	businessId, createChatRequest, 
	handler, userData, false);
}

static bool createOutletProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CreateOutletResponse, Error, void* )
	= reinterpret_cast<void(*)(CreateOutletResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CreateOutletResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CreateOutletResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CreateOutletResponse", "CreateOutletResponse");
			json_node_free(pJson);

			if ("CreateOutletResponse" == "std::string") {
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

static bool createOutletHelper(char * accessToken,
	long long campaignId, std::shared_ptr<ChangeOutletRequest> changeOutletRequest, 
	void(* handler)(CreateOutletResponse, Error, void* )
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

	if (isprimitive("ChangeOutletRequest")) {
		node = converttoJson(&changeOutletRequest, "ChangeOutletRequest", "");
	}
	
	char *jsonStr =  changeOutletRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/outlets");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createOutletProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createOutletProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::createOutletAsync(char * accessToken,
	long long campaignId, std::shared_ptr<ChangeOutletRequest> changeOutletRequest, 
	void(* handler)(CreateOutletResponse, Error, void* )
	, void* userData)
{
	return createOutletHelper(accessToken,
	campaignId, changeOutletRequest, 
	handler, userData, true);
}

bool DbsManager::createOutletSync(char * accessToken,
	long long campaignId, std::shared_ptr<ChangeOutletRequest> changeOutletRequest, 
	void(* handler)(CreateOutletResponse, Error, void* )
	, void* userData)
{
	return createOutletHelper(accessToken,
	campaignId, changeOutletRequest, 
	handler, userData, false);
}

static bool deleteCampaignOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DeleteCampaignOffersResponse, Error, void* )
	= reinterpret_cast<void(*)(DeleteCampaignOffersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DeleteCampaignOffersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DeleteCampaignOffersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DeleteCampaignOffersResponse", "DeleteCampaignOffersResponse");
			json_node_free(pJson);

			if ("DeleteCampaignOffersResponse" == "std::string") {
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

static bool deleteCampaignOffersHelper(char * accessToken,
	long long campaignId, std::shared_ptr<DeleteCampaignOffersRequest> deleteCampaignOffersRequest, 
	void(* handler)(DeleteCampaignOffersResponse, Error, void* )
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

	if (isprimitive("DeleteCampaignOffersRequest")) {
		node = converttoJson(&deleteCampaignOffersRequest, "DeleteCampaignOffersRequest", "");
	}
	
	char *jsonStr =  deleteCampaignOffersRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/offers/delete");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteCampaignOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteCampaignOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::deleteCampaignOffersAsync(char * accessToken,
	long long campaignId, std::shared_ptr<DeleteCampaignOffersRequest> deleteCampaignOffersRequest, 
	void(* handler)(DeleteCampaignOffersResponse, Error, void* )
	, void* userData)
{
	return deleteCampaignOffersHelper(accessToken,
	campaignId, deleteCampaignOffersRequest, 
	handler, userData, true);
}

bool DbsManager::deleteCampaignOffersSync(char * accessToken,
	long long campaignId, std::shared_ptr<DeleteCampaignOffersRequest> deleteCampaignOffersRequest, 
	void(* handler)(DeleteCampaignOffersResponse, Error, void* )
	, void* userData)
{
	return deleteCampaignOffersHelper(accessToken,
	campaignId, deleteCampaignOffersRequest, 
	handler, userData, false);
}

static bool deleteGoodsFeedbackCommentProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool deleteGoodsFeedbackCommentHelper(char * accessToken,
	long long businessId, std::shared_ptr<DeleteGoodsFeedbackCommentRequest> deleteGoodsFeedbackCommentRequest, 
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

	if (isprimitive("DeleteGoodsFeedbackCommentRequest")) {
		node = converttoJson(&deleteGoodsFeedbackCommentRequest, "DeleteGoodsFeedbackCommentRequest", "");
	}
	
	char *jsonStr =  deleteGoodsFeedbackCommentRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/goods-feedback/comments/delete");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteGoodsFeedbackCommentProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteGoodsFeedbackCommentProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::deleteGoodsFeedbackCommentAsync(char * accessToken,
	long long businessId, std::shared_ptr<DeleteGoodsFeedbackCommentRequest> deleteGoodsFeedbackCommentRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return deleteGoodsFeedbackCommentHelper(accessToken,
	businessId, deleteGoodsFeedbackCommentRequest, 
	handler, userData, true);
}

bool DbsManager::deleteGoodsFeedbackCommentSync(char * accessToken,
	long long businessId, std::shared_ptr<DeleteGoodsFeedbackCommentRequest> deleteGoodsFeedbackCommentRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return deleteGoodsFeedbackCommentHelper(accessToken,
	businessId, deleteGoodsFeedbackCommentRequest, 
	handler, userData, false);
}

static bool deleteHiddenOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool deleteHiddenOffersHelper(char * accessToken,
	long long campaignId, std::shared_ptr<DeleteHiddenOffersRequest> deleteHiddenOffersRequest, 
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

	if (isprimitive("DeleteHiddenOffersRequest")) {
		node = converttoJson(&deleteHiddenOffersRequest, "DeleteHiddenOffersRequest", "");
	}
	
	char *jsonStr =  deleteHiddenOffersRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/hidden-offers/delete");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteHiddenOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteHiddenOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::deleteHiddenOffersAsync(char * accessToken,
	long long campaignId, std::shared_ptr<DeleteHiddenOffersRequest> deleteHiddenOffersRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return deleteHiddenOffersHelper(accessToken,
	campaignId, deleteHiddenOffersRequest, 
	handler, userData, true);
}

bool DbsManager::deleteHiddenOffersSync(char * accessToken,
	long long campaignId, std::shared_ptr<DeleteHiddenOffersRequest> deleteHiddenOffersRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return deleteHiddenOffersHelper(accessToken,
	campaignId, deleteHiddenOffersRequest, 
	handler, userData, false);
}

static bool deleteOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DeleteOffersResponse, Error, void* )
	= reinterpret_cast<void(*)(DeleteOffersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DeleteOffersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DeleteOffersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DeleteOffersResponse", "DeleteOffersResponse");
			json_node_free(pJson);

			if ("DeleteOffersResponse" == "std::string") {
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

static bool deleteOffersHelper(char * accessToken,
	long long businessId, std::shared_ptr<DeleteOffersRequest> deleteOffersRequest, 
	void(* handler)(DeleteOffersResponse, Error, void* )
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

	if (isprimitive("DeleteOffersRequest")) {
		node = converttoJson(&deleteOffersRequest, "DeleteOffersRequest", "");
	}
	
	char *jsonStr =  deleteOffersRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/offer-mappings/delete");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::deleteOffersAsync(char * accessToken,
	long long businessId, std::shared_ptr<DeleteOffersRequest> deleteOffersRequest, 
	void(* handler)(DeleteOffersResponse, Error, void* )
	, void* userData)
{
	return deleteOffersHelper(accessToken,
	businessId, deleteOffersRequest, 
	handler, userData, true);
}

bool DbsManager::deleteOffersSync(char * accessToken,
	long long businessId, std::shared_ptr<DeleteOffersRequest> deleteOffersRequest, 
	void(* handler)(DeleteOffersResponse, Error, void* )
	, void* userData)
{
	return deleteOffersHelper(accessToken,
	businessId, deleteOffersRequest, 
	handler, userData, false);
}

static bool deleteOffersFromArchiveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DeleteOffersFromArchiveResponse, Error, void* )
	= reinterpret_cast<void(*)(DeleteOffersFromArchiveResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DeleteOffersFromArchiveResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DeleteOffersFromArchiveResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DeleteOffersFromArchiveResponse", "DeleteOffersFromArchiveResponse");
			json_node_free(pJson);

			if ("DeleteOffersFromArchiveResponse" == "std::string") {
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

static bool deleteOffersFromArchiveHelper(char * accessToken,
	long long businessId, std::shared_ptr<DeleteOffersFromArchiveRequest> deleteOffersFromArchiveRequest, 
	void(* handler)(DeleteOffersFromArchiveResponse, Error, void* )
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

	if (isprimitive("DeleteOffersFromArchiveRequest")) {
		node = converttoJson(&deleteOffersFromArchiveRequest, "DeleteOffersFromArchiveRequest", "");
	}
	
	char *jsonStr =  deleteOffersFromArchiveRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/offer-mappings/unarchive");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteOffersFromArchiveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteOffersFromArchiveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::deleteOffersFromArchiveAsync(char * accessToken,
	long long businessId, std::shared_ptr<DeleteOffersFromArchiveRequest> deleteOffersFromArchiveRequest, 
	void(* handler)(DeleteOffersFromArchiveResponse, Error, void* )
	, void* userData)
{
	return deleteOffersFromArchiveHelper(accessToken,
	businessId, deleteOffersFromArchiveRequest, 
	handler, userData, true);
}

bool DbsManager::deleteOffersFromArchiveSync(char * accessToken,
	long long businessId, std::shared_ptr<DeleteOffersFromArchiveRequest> deleteOffersFromArchiveRequest, 
	void(* handler)(DeleteOffersFromArchiveResponse, Error, void* )
	, void* userData)
{
	return deleteOffersFromArchiveHelper(accessToken,
	businessId, deleteOffersFromArchiveRequest, 
	handler, userData, false);
}

static bool deleteOutletProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool deleteOutletHelper(char * accessToken,
	long long campaignId, long long outletId, 
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

	string url("/campaigns/{campaignId}/outlets/{outletId}");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_outletId("{");
	s_outletId.append("outletId");
	s_outletId.append("}");
	pos = url.find(s_outletId);
	url.erase(pos, s_outletId.length());
	url.insert(pos, stringify(&outletId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("DELETE");

	if(strcmp("PUT", "DELETE") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteOutletProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteOutletProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::deleteOutletAsync(char * accessToken,
	long long campaignId, long long outletId, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return deleteOutletHelper(accessToken,
	campaignId, outletId, 
	handler, userData, true);
}

bool DbsManager::deleteOutletSync(char * accessToken,
	long long campaignId, long long outletId, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return deleteOutletHelper(accessToken,
	campaignId, outletId, 
	handler, userData, false);
}

static bool deleteOutletLicensesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool deleteOutletLicensesHelper(char * accessToken,
	long long campaignId, Set<long long> ids, 
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
	
	for (Set
	<long long>::iterator queryIter = ids.begin(); queryIter != ids.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "long long");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("ids", itemAt));
	}
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/campaigns/{campaignId}/outlets/licenses");
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
	string myhttpmethod("DELETE");

	if(strcmp("PUT", "DELETE") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteOutletLicensesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteOutletLicensesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::deleteOutletLicensesAsync(char * accessToken,
	long long campaignId, Set<long long> ids, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return deleteOutletLicensesHelper(accessToken,
	campaignId, ids, 
	handler, userData, true);
}

bool DbsManager::deleteOutletLicensesSync(char * accessToken,
	long long campaignId, Set<long long> ids, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return deleteOutletLicensesHelper(accessToken,
	campaignId, ids, 
	handler, userData, false);
}

static bool deletePromoOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DeletePromoOffersResponse, Error, void* )
	= reinterpret_cast<void(*)(DeletePromoOffersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DeletePromoOffersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DeletePromoOffersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DeletePromoOffersResponse", "DeletePromoOffersResponse");
			json_node_free(pJson);

			if ("DeletePromoOffersResponse" == "std::string") {
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

static bool deletePromoOffersHelper(char * accessToken,
	long long businessId, std::shared_ptr<DeletePromoOffersRequest> deletePromoOffersRequest, 
	void(* handler)(DeletePromoOffersResponse, Error, void* )
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

	if (isprimitive("DeletePromoOffersRequest")) {
		node = converttoJson(&deletePromoOffersRequest, "DeletePromoOffersRequest", "");
	}
	
	char *jsonStr =  deletePromoOffersRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/promos/offers/delete");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deletePromoOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deletePromoOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::deletePromoOffersAsync(char * accessToken,
	long long businessId, std::shared_ptr<DeletePromoOffersRequest> deletePromoOffersRequest, 
	void(* handler)(DeletePromoOffersResponse, Error, void* )
	, void* userData)
{
	return deletePromoOffersHelper(accessToken,
	businessId, deletePromoOffersRequest, 
	handler, userData, true);
}

bool DbsManager::deletePromoOffersSync(char * accessToken,
	long long businessId, std::shared_ptr<DeletePromoOffersRequest> deletePromoOffersRequest, 
	void(* handler)(DeletePromoOffersResponse, Error, void* )
	, void* userData)
{
	return deletePromoOffersHelper(accessToken,
	businessId, deletePromoOffersRequest, 
	handler, userData, false);
}

static bool generateBoostConsolidatedReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateBoostConsolidatedReportHelper(char * accessToken,
	std::shared_ptr<GenerateBoostConsolidatedRequest> generateBoostConsolidatedRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateBoostConsolidatedRequest")) {
		node = converttoJson(&generateBoostConsolidatedRequest, "GenerateBoostConsolidatedRequest", "");
	}
	
	char *jsonStr =  generateBoostConsolidatedRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/boost-consolidated/generate");
	int pos;


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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateBoostConsolidatedReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateBoostConsolidatedReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::generateBoostConsolidatedReportAsync(char * accessToken,
	std::shared_ptr<GenerateBoostConsolidatedRequest> generateBoostConsolidatedRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateBoostConsolidatedReportHelper(accessToken,
	generateBoostConsolidatedRequest, format, 
	handler, userData, true);
}

bool DbsManager::generateBoostConsolidatedReportSync(char * accessToken,
	std::shared_ptr<GenerateBoostConsolidatedRequest> generateBoostConsolidatedRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateBoostConsolidatedReportHelper(accessToken,
	generateBoostConsolidatedRequest, format, 
	handler, userData, false);
}

static bool generateCompetitorsPositionReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateCompetitorsPositionReportHelper(char * accessToken,
	std::shared_ptr<GenerateCompetitorsPositionReportRequest> generateCompetitorsPositionReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateCompetitorsPositionReportRequest")) {
		node = converttoJson(&generateCompetitorsPositionReportRequest, "GenerateCompetitorsPositionReportRequest", "");
	}
	
	char *jsonStr =  generateCompetitorsPositionReportRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/competitors-position/generate");
	int pos;


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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateCompetitorsPositionReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateCompetitorsPositionReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::generateCompetitorsPositionReportAsync(char * accessToken,
	std::shared_ptr<GenerateCompetitorsPositionReportRequest> generateCompetitorsPositionReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateCompetitorsPositionReportHelper(accessToken,
	generateCompetitorsPositionReportRequest, format, 
	handler, userData, true);
}

bool DbsManager::generateCompetitorsPositionReportSync(char * accessToken,
	std::shared_ptr<GenerateCompetitorsPositionReportRequest> generateCompetitorsPositionReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateCompetitorsPositionReportHelper(accessToken,
	generateCompetitorsPositionReportRequest, format, 
	handler, userData, false);
}

static bool generateGoodsFeedbackReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateGoodsFeedbackReportHelper(char * accessToken,
	std::shared_ptr<GenerateGoodsFeedbackRequest> generateGoodsFeedbackRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateGoodsFeedbackRequest")) {
		node = converttoJson(&generateGoodsFeedbackRequest, "GenerateGoodsFeedbackRequest", "");
	}
	
	char *jsonStr =  generateGoodsFeedbackRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/goods-feedback/generate");
	int pos;


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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateGoodsFeedbackReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateGoodsFeedbackReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::generateGoodsFeedbackReportAsync(char * accessToken,
	std::shared_ptr<GenerateGoodsFeedbackRequest> generateGoodsFeedbackRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateGoodsFeedbackReportHelper(accessToken,
	generateGoodsFeedbackRequest, format, 
	handler, userData, true);
}

bool DbsManager::generateGoodsFeedbackReportSync(char * accessToken,
	std::shared_ptr<GenerateGoodsFeedbackRequest> generateGoodsFeedbackRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateGoodsFeedbackReportHelper(accessToken,
	generateGoodsFeedbackRequest, format, 
	handler, userData, false);
}

static bool generateMassOrderLabelsReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateMassOrderLabelsReportHelper(char * accessToken,
	std::shared_ptr<GenerateMassOrderLabelsRequest> generateMassOrderLabelsRequest, PageFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "PageFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateMassOrderLabelsRequest")) {
		node = converttoJson(&generateMassOrderLabelsRequest, "GenerateMassOrderLabelsRequest", "");
	}
	
	char *jsonStr =  generateMassOrderLabelsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/documents/labels/generate");
	int pos;


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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateMassOrderLabelsReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateMassOrderLabelsReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::generateMassOrderLabelsReportAsync(char * accessToken,
	std::shared_ptr<GenerateMassOrderLabelsRequest> generateMassOrderLabelsRequest, PageFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateMassOrderLabelsReportHelper(accessToken,
	generateMassOrderLabelsRequest, format, 
	handler, userData, true);
}

bool DbsManager::generateMassOrderLabelsReportSync(char * accessToken,
	std::shared_ptr<GenerateMassOrderLabelsRequest> generateMassOrderLabelsRequest, PageFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateMassOrderLabelsReportHelper(accessToken,
	generateMassOrderLabelsRequest, format, 
	handler, userData, false);
}

static bool generateOrderLabelProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::string, Error, void* )
	= reinterpret_cast<void(*)(std::string, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	std::string out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("std::string")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "std::string", "std::string");
			json_node_free(pJson);

			if ("std::string" == "std::string") {
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

static bool generateOrderLabelHelper(char * accessToken,
	long long campaignId, long long orderId, long long shipmentId, long long boxId, PageFormatType format, 
	void(* handler)(std::string, Error, void* )
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
	

	itemAtq = stringify(&format, "PageFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));
	string s_shipmentId("{");
	s_shipmentId.append("shipmentId");
	s_shipmentId.append("}");
	pos = url.find(s_shipmentId);
	url.erase(pos, s_shipmentId.length());
	url.insert(pos, stringify(&shipmentId, "long long"));
	string s_boxId("{");
	s_boxId.append("boxId");
	s_boxId.append("}");
	pos = url.find(s_boxId);
	url.erase(pos, s_boxId.length());
	url.insert(pos, stringify(&boxId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateOrderLabelProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateOrderLabelProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::generateOrderLabelAsync(char * accessToken,
	long long campaignId, long long orderId, long long shipmentId, long long boxId, PageFormatType format, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return generateOrderLabelHelper(accessToken,
	campaignId, orderId, shipmentId, boxId, format, 
	handler, userData, true);
}

bool DbsManager::generateOrderLabelSync(char * accessToken,
	long long campaignId, long long orderId, long long shipmentId, long long boxId, PageFormatType format, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return generateOrderLabelHelper(accessToken,
	campaignId, orderId, shipmentId, boxId, format, 
	handler, userData, false);
}

static bool generateOrderLabelsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::string, Error, void* )
	= reinterpret_cast<void(*)(std::string, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	std::string out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("std::string")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "std::string", "std::string");
			json_node_free(pJson);

			if ("std::string" == "std::string") {
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

static bool generateOrderLabelsHelper(char * accessToken,
	long long campaignId, long long orderId, PageFormatType format, 
	void(* handler)(std::string, Error, void* )
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
	

	itemAtq = stringify(&format, "PageFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/campaigns/{campaignId}/orders/{orderId}/delivery/labels");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateOrderLabelsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateOrderLabelsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::generateOrderLabelsAsync(char * accessToken,
	long long campaignId, long long orderId, PageFormatType format, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return generateOrderLabelsHelper(accessToken,
	campaignId, orderId, format, 
	handler, userData, true);
}

bool DbsManager::generateOrderLabelsSync(char * accessToken,
	long long campaignId, long long orderId, PageFormatType format, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return generateOrderLabelsHelper(accessToken,
	campaignId, orderId, format, 
	handler, userData, false);
}

static bool generatePricesReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generatePricesReportHelper(char * accessToken,
	std::shared_ptr<GeneratePricesReportRequest> generatePricesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GeneratePricesReportRequest")) {
		node = converttoJson(&generatePricesReportRequest, "GeneratePricesReportRequest", "");
	}
	
	char *jsonStr =  generatePricesReportRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/prices/generate");
	int pos;


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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generatePricesReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generatePricesReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::generatePricesReportAsync(char * accessToken,
	std::shared_ptr<GeneratePricesReportRequest> generatePricesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generatePricesReportHelper(accessToken,
	generatePricesReportRequest, format, 
	handler, userData, true);
}

bool DbsManager::generatePricesReportSync(char * accessToken,
	std::shared_ptr<GeneratePricesReportRequest> generatePricesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generatePricesReportHelper(accessToken,
	generatePricesReportRequest, format, 
	handler, userData, false);
}

static bool generateShelfsStatisticsReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateShelfsStatisticsReportHelper(char * accessToken,
	std::shared_ptr<GenerateShelfsStatisticsRequest> generateShelfsStatisticsRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateShelfsStatisticsRequest")) {
		node = converttoJson(&generateShelfsStatisticsRequest, "GenerateShelfsStatisticsRequest", "");
	}
	
	char *jsonStr =  generateShelfsStatisticsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/shelf-statistics/generate");
	int pos;


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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateShelfsStatisticsReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateShelfsStatisticsReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::generateShelfsStatisticsReportAsync(char * accessToken,
	std::shared_ptr<GenerateShelfsStatisticsRequest> generateShelfsStatisticsRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateShelfsStatisticsReportHelper(accessToken,
	generateShelfsStatisticsRequest, format, 
	handler, userData, true);
}

bool DbsManager::generateShelfsStatisticsReportSync(char * accessToken,
	std::shared_ptr<GenerateShelfsStatisticsRequest> generateShelfsStatisticsRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateShelfsStatisticsReportHelper(accessToken,
	generateShelfsStatisticsRequest, format, 
	handler, userData, false);
}

static bool generateShowsSalesReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateShowsSalesReportHelper(char * accessToken,
	std::shared_ptr<GenerateShowsSalesReportRequest> generateShowsSalesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateShowsSalesReportRequest")) {
		node = converttoJson(&generateShowsSalesReportRequest, "GenerateShowsSalesReportRequest", "");
	}
	
	char *jsonStr =  generateShowsSalesReportRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/shows-sales/generate");
	int pos;


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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateShowsSalesReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateShowsSalesReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::generateShowsSalesReportAsync(char * accessToken,
	std::shared_ptr<GenerateShowsSalesReportRequest> generateShowsSalesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateShowsSalesReportHelper(accessToken,
	generateShowsSalesReportRequest, format, 
	handler, userData, true);
}

bool DbsManager::generateShowsSalesReportSync(char * accessToken,
	std::shared_ptr<GenerateShowsSalesReportRequest> generateShowsSalesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateShowsSalesReportHelper(accessToken,
	generateShowsSalesReportRequest, format, 
	handler, userData, false);
}

static bool generateStocksOnWarehousesReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateStocksOnWarehousesReportHelper(char * accessToken,
	std::shared_ptr<GenerateStocksOnWarehousesReportRequest> generateStocksOnWarehousesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateStocksOnWarehousesReportRequest")) {
		node = converttoJson(&generateStocksOnWarehousesReportRequest, "GenerateStocksOnWarehousesReportRequest", "");
	}
	
	char *jsonStr =  generateStocksOnWarehousesReportRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/stocks-on-warehouses/generate");
	int pos;


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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateStocksOnWarehousesReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateStocksOnWarehousesReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::generateStocksOnWarehousesReportAsync(char * accessToken,
	std::shared_ptr<GenerateStocksOnWarehousesReportRequest> generateStocksOnWarehousesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateStocksOnWarehousesReportHelper(accessToken,
	generateStocksOnWarehousesReportRequest, format, 
	handler, userData, true);
}

bool DbsManager::generateStocksOnWarehousesReportSync(char * accessToken,
	std::shared_ptr<GenerateStocksOnWarehousesReportRequest> generateStocksOnWarehousesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateStocksOnWarehousesReportHelper(accessToken,
	generateStocksOnWarehousesReportRequest, format, 
	handler, userData, false);
}

static bool generateUnitedMarketplaceServicesReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateUnitedMarketplaceServicesReportHelper(char * accessToken,
	std::shared_ptr<GenerateUnitedMarketplaceServicesReportRequest> generateUnitedMarketplaceServicesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateUnitedMarketplaceServicesReportRequest")) {
		node = converttoJson(&generateUnitedMarketplaceServicesReportRequest, "GenerateUnitedMarketplaceServicesReportRequest", "");
	}
	
	char *jsonStr =  generateUnitedMarketplaceServicesReportRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/united-marketplace-services/generate");
	int pos;


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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateUnitedMarketplaceServicesReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateUnitedMarketplaceServicesReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::generateUnitedMarketplaceServicesReportAsync(char * accessToken,
	std::shared_ptr<GenerateUnitedMarketplaceServicesReportRequest> generateUnitedMarketplaceServicesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateUnitedMarketplaceServicesReportHelper(accessToken,
	generateUnitedMarketplaceServicesReportRequest, format, 
	handler, userData, true);
}

bool DbsManager::generateUnitedMarketplaceServicesReportSync(char * accessToken,
	std::shared_ptr<GenerateUnitedMarketplaceServicesReportRequest> generateUnitedMarketplaceServicesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateUnitedMarketplaceServicesReportHelper(accessToken,
	generateUnitedMarketplaceServicesReportRequest, format, 
	handler, userData, false);
}

static bool generateUnitedNettingReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateUnitedNettingReportHelper(char * accessToken,
	std::shared_ptr<GenerateUnitedNettingReportRequest> generateUnitedNettingReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateUnitedNettingReportRequest")) {
		node = converttoJson(&generateUnitedNettingReportRequest, "GenerateUnitedNettingReportRequest", "");
	}
	
	char *jsonStr =  generateUnitedNettingReportRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/united-netting/generate");
	int pos;


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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateUnitedNettingReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateUnitedNettingReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::generateUnitedNettingReportAsync(char * accessToken,
	std::shared_ptr<GenerateUnitedNettingReportRequest> generateUnitedNettingReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateUnitedNettingReportHelper(accessToken,
	generateUnitedNettingReportRequest, format, 
	handler, userData, true);
}

bool DbsManager::generateUnitedNettingReportSync(char * accessToken,
	std::shared_ptr<GenerateUnitedNettingReportRequest> generateUnitedNettingReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateUnitedNettingReportHelper(accessToken,
	generateUnitedNettingReportRequest, format, 
	handler, userData, false);
}

static bool generateUnitedOrdersReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateUnitedOrdersReportHelper(char * accessToken,
	std::shared_ptr<GenerateUnitedOrdersRequest> generateUnitedOrdersRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateUnitedOrdersRequest")) {
		node = converttoJson(&generateUnitedOrdersRequest, "GenerateUnitedOrdersRequest", "");
	}
	
	char *jsonStr =  generateUnitedOrdersRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/united-orders/generate");
	int pos;


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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateUnitedOrdersReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateUnitedOrdersReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::generateUnitedOrdersReportAsync(char * accessToken,
	std::shared_ptr<GenerateUnitedOrdersRequest> generateUnitedOrdersRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateUnitedOrdersReportHelper(accessToken,
	generateUnitedOrdersRequest, format, 
	handler, userData, true);
}

bool DbsManager::generateUnitedOrdersReportSync(char * accessToken,
	std::shared_ptr<GenerateUnitedOrdersRequest> generateUnitedOrdersRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateUnitedOrdersReportHelper(accessToken,
	generateUnitedOrdersRequest, format, 
	handler, userData, false);
}

static bool getAllOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetAllOffersResponse, Error, void* )
	= reinterpret_cast<void(*)(GetAllOffersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetAllOffersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetAllOffersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetAllOffersResponse", "GetAllOffersResponse");
			json_node_free(pJson);

			if ("GetAllOffersResponse" == "std::string") {
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

static bool getAllOffersHelper(char * accessToken,
	long long campaignId, long long feedId, int chunk, 
	void(* handler)(GetAllOffersResponse, Error, void* )
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
	

	itemAtq = stringify(&feedId, "long long");
	queryParams.insert(pair<string, string>("feedId", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("feedId");
	}


	itemAtq = stringify(&chunk, "int");
	queryParams.insert(pair<string, string>("chunk", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("chunk");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/campaigns/{campaignId}/offers/all");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getAllOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getAllOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getAllOffersAsync(char * accessToken,
	long long campaignId, long long feedId, int chunk, 
	void(* handler)(GetAllOffersResponse, Error, void* )
	, void* userData)
{
	return getAllOffersHelper(accessToken,
	campaignId, feedId, chunk, 
	handler, userData, true);
}

bool DbsManager::getAllOffersSync(char * accessToken,
	long long campaignId, long long feedId, int chunk, 
	void(* handler)(GetAllOffersResponse, Error, void* )
	, void* userData)
{
	return getAllOffersHelper(accessToken,
	campaignId, feedId, chunk, 
	handler, userData, false);
}

static bool getBidsInfoForBusinessProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetBidsInfoResponse, Error, void* )
	= reinterpret_cast<void(*)(GetBidsInfoResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetBidsInfoResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetBidsInfoResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetBidsInfoResponse", "GetBidsInfoResponse");
			json_node_free(pJson);

			if ("GetBidsInfoResponse" == "std::string") {
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

static bool getBidsInfoForBusinessHelper(char * accessToken,
	long long businessId, std::string pageToken, int limit, std::shared_ptr<GetBidsInfoRequest> getBidsInfoRequest, 
	void(* handler)(GetBidsInfoResponse, Error, void* )
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

	if (isprimitive("GetBidsInfoRequest")) {
		node = converttoJson(&getBidsInfoRequest, "GetBidsInfoRequest", "");
	}
	
	char *jsonStr =  getBidsInfoRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/bids/info");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getBidsInfoForBusinessProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getBidsInfoForBusinessProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getBidsInfoForBusinessAsync(char * accessToken,
	long long businessId, std::string pageToken, int limit, std::shared_ptr<GetBidsInfoRequest> getBidsInfoRequest, 
	void(* handler)(GetBidsInfoResponse, Error, void* )
	, void* userData)
{
	return getBidsInfoForBusinessHelper(accessToken,
	businessId, pageToken, limit, getBidsInfoRequest, 
	handler, userData, true);
}

bool DbsManager::getBidsInfoForBusinessSync(char * accessToken,
	long long businessId, std::string pageToken, int limit, std::shared_ptr<GetBidsInfoRequest> getBidsInfoRequest, 
	void(* handler)(GetBidsInfoResponse, Error, void* )
	, void* userData)
{
	return getBidsInfoForBusinessHelper(accessToken,
	businessId, pageToken, limit, getBidsInfoRequest, 
	handler, userData, false);
}

static bool getBidsRecommendationsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetBidsRecommendationsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetBidsRecommendationsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetBidsRecommendationsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetBidsRecommendationsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetBidsRecommendationsResponse", "GetBidsRecommendationsResponse");
			json_node_free(pJson);

			if ("GetBidsRecommendationsResponse" == "std::string") {
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

static bool getBidsRecommendationsHelper(char * accessToken,
	long long businessId, std::shared_ptr<GetBidsRecommendationsRequest> getBidsRecommendationsRequest, 
	void(* handler)(GetBidsRecommendationsResponse, Error, void* )
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

	if (isprimitive("GetBidsRecommendationsRequest")) {
		node = converttoJson(&getBidsRecommendationsRequest, "GetBidsRecommendationsRequest", "");
	}
	
	char *jsonStr =  getBidsRecommendationsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/bids/recommendations");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getBidsRecommendationsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getBidsRecommendationsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getBidsRecommendationsAsync(char * accessToken,
	long long businessId, std::shared_ptr<GetBidsRecommendationsRequest> getBidsRecommendationsRequest, 
	void(* handler)(GetBidsRecommendationsResponse, Error, void* )
	, void* userData)
{
	return getBidsRecommendationsHelper(accessToken,
	businessId, getBidsRecommendationsRequest, 
	handler, userData, true);
}

bool DbsManager::getBidsRecommendationsSync(char * accessToken,
	long long businessId, std::shared_ptr<GetBidsRecommendationsRequest> getBidsRecommendationsRequest, 
	void(* handler)(GetBidsRecommendationsResponse, Error, void* )
	, void* userData)
{
	return getBidsRecommendationsHelper(accessToken,
	businessId, getBidsRecommendationsRequest, 
	handler, userData, false);
}

static bool getBusinessQuarantineOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetQuarantineOffersResponse, Error, void* )
	= reinterpret_cast<void(*)(GetQuarantineOffersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetQuarantineOffersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetQuarantineOffersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetQuarantineOffersResponse", "GetQuarantineOffersResponse");
			json_node_free(pJson);

			if ("GetQuarantineOffersResponse" == "std::string") {
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

static bool getBusinessQuarantineOffersHelper(char * accessToken,
	long long businessId, std::shared_ptr<GetQuarantineOffersRequest> getQuarantineOffersRequest, std::string pageToken, int limit, 
	void(* handler)(GetQuarantineOffersResponse, Error, void* )
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

	if (isprimitive("GetQuarantineOffersRequest")) {
		node = converttoJson(&getQuarantineOffersRequest, "GetQuarantineOffersRequest", "");
	}
	
	char *jsonStr =  getQuarantineOffersRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/price-quarantine");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getBusinessQuarantineOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getBusinessQuarantineOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getBusinessQuarantineOffersAsync(char * accessToken,
	long long businessId, std::shared_ptr<GetQuarantineOffersRequest> getQuarantineOffersRequest, std::string pageToken, int limit, 
	void(* handler)(GetQuarantineOffersResponse, Error, void* )
	, void* userData)
{
	return getBusinessQuarantineOffersHelper(accessToken,
	businessId, getQuarantineOffersRequest, pageToken, limit, 
	handler, userData, true);
}

bool DbsManager::getBusinessQuarantineOffersSync(char * accessToken,
	long long businessId, std::shared_ptr<GetQuarantineOffersRequest> getQuarantineOffersRequest, std::string pageToken, int limit, 
	void(* handler)(GetQuarantineOffersResponse, Error, void* )
	, void* userData)
{
	return getBusinessQuarantineOffersHelper(accessToken,
	businessId, getQuarantineOffersRequest, pageToken, limit, 
	handler, userData, false);
}

static bool getBusinessSettingsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetBusinessSettingsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetBusinessSettingsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetBusinessSettingsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetBusinessSettingsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetBusinessSettingsResponse", "GetBusinessSettingsResponse");
			json_node_free(pJson);

			if ("GetBusinessSettingsResponse" == "std::string") {
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

static bool getBusinessSettingsHelper(char * accessToken,
	long long businessId, 
	void(* handler)(GetBusinessSettingsResponse, Error, void* )
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

	string url("/businesses/{businessId}/settings");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getBusinessSettingsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getBusinessSettingsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getBusinessSettingsAsync(char * accessToken,
	long long businessId, 
	void(* handler)(GetBusinessSettingsResponse, Error, void* )
	, void* userData)
{
	return getBusinessSettingsHelper(accessToken,
	businessId, 
	handler, userData, true);
}

bool DbsManager::getBusinessSettingsSync(char * accessToken,
	long long businessId, 
	void(* handler)(GetBusinessSettingsResponse, Error, void* )
	, void* userData)
{
	return getBusinessSettingsHelper(accessToken,
	businessId, 
	handler, userData, false);
}

static bool getCampaignProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetCampaignResponse, Error, void* )
	= reinterpret_cast<void(*)(GetCampaignResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetCampaignResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetCampaignResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetCampaignResponse", "GetCampaignResponse");
			json_node_free(pJson);

			if ("GetCampaignResponse" == "std::string") {
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

static bool getCampaignHelper(char * accessToken,
	long long campaignId, 
	void(* handler)(GetCampaignResponse, Error, void* )
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

	string url("/campaigns/{campaignId}");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getCampaignProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getCampaignProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getCampaignAsync(char * accessToken,
	long long campaignId, 
	void(* handler)(GetCampaignResponse, Error, void* )
	, void* userData)
{
	return getCampaignHelper(accessToken,
	campaignId, 
	handler, userData, true);
}

bool DbsManager::getCampaignSync(char * accessToken,
	long long campaignId, 
	void(* handler)(GetCampaignResponse, Error, void* )
	, void* userData)
{
	return getCampaignHelper(accessToken,
	campaignId, 
	handler, userData, false);
}

static bool getCampaignLoginsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetCampaignLoginsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetCampaignLoginsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetCampaignLoginsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetCampaignLoginsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetCampaignLoginsResponse", "GetCampaignLoginsResponse");
			json_node_free(pJson);

			if ("GetCampaignLoginsResponse" == "std::string") {
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

static bool getCampaignLoginsHelper(char * accessToken,
	long long campaignId, 
	void(* handler)(GetCampaignLoginsResponse, Error, void* )
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

	string url("/campaigns/{campaignId}/logins");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getCampaignLoginsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getCampaignLoginsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getCampaignLoginsAsync(char * accessToken,
	long long campaignId, 
	void(* handler)(GetCampaignLoginsResponse, Error, void* )
	, void* userData)
{
	return getCampaignLoginsHelper(accessToken,
	campaignId, 
	handler, userData, true);
}

bool DbsManager::getCampaignLoginsSync(char * accessToken,
	long long campaignId, 
	void(* handler)(GetCampaignLoginsResponse, Error, void* )
	, void* userData)
{
	return getCampaignLoginsHelper(accessToken,
	campaignId, 
	handler, userData, false);
}

static bool getCampaignOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetCampaignOffersResponse, Error, void* )
	= reinterpret_cast<void(*)(GetCampaignOffersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetCampaignOffersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetCampaignOffersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetCampaignOffersResponse", "GetCampaignOffersResponse");
			json_node_free(pJson);

			if ("GetCampaignOffersResponse" == "std::string") {
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

static bool getCampaignOffersHelper(char * accessToken,
	long long campaignId, std::shared_ptr<GetCampaignOffersRequest> getCampaignOffersRequest, std::string pageToken, int limit, 
	void(* handler)(GetCampaignOffersResponse, Error, void* )
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

	if (isprimitive("GetCampaignOffersRequest")) {
		node = converttoJson(&getCampaignOffersRequest, "GetCampaignOffersRequest", "");
	}
	
	char *jsonStr =  getCampaignOffersRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/offers");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getCampaignOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getCampaignOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getCampaignOffersAsync(char * accessToken,
	long long campaignId, std::shared_ptr<GetCampaignOffersRequest> getCampaignOffersRequest, std::string pageToken, int limit, 
	void(* handler)(GetCampaignOffersResponse, Error, void* )
	, void* userData)
{
	return getCampaignOffersHelper(accessToken,
	campaignId, getCampaignOffersRequest, pageToken, limit, 
	handler, userData, true);
}

bool DbsManager::getCampaignOffersSync(char * accessToken,
	long long campaignId, std::shared_ptr<GetCampaignOffersRequest> getCampaignOffersRequest, std::string pageToken, int limit, 
	void(* handler)(GetCampaignOffersResponse, Error, void* )
	, void* userData)
{
	return getCampaignOffersHelper(accessToken,
	campaignId, getCampaignOffersRequest, pageToken, limit, 
	handler, userData, false);
}

static bool getCampaignQuarantineOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetQuarantineOffersResponse, Error, void* )
	= reinterpret_cast<void(*)(GetQuarantineOffersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetQuarantineOffersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetQuarantineOffersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetQuarantineOffersResponse", "GetQuarantineOffersResponse");
			json_node_free(pJson);

			if ("GetQuarantineOffersResponse" == "std::string") {
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

static bool getCampaignQuarantineOffersHelper(char * accessToken,
	long long campaignId, std::shared_ptr<GetQuarantineOffersRequest> getQuarantineOffersRequest, std::string pageToken, int limit, 
	void(* handler)(GetQuarantineOffersResponse, Error, void* )
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

	if (isprimitive("GetQuarantineOffersRequest")) {
		node = converttoJson(&getQuarantineOffersRequest, "GetQuarantineOffersRequest", "");
	}
	
	char *jsonStr =  getQuarantineOffersRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/price-quarantine");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getCampaignQuarantineOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getCampaignQuarantineOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getCampaignQuarantineOffersAsync(char * accessToken,
	long long campaignId, std::shared_ptr<GetQuarantineOffersRequest> getQuarantineOffersRequest, std::string pageToken, int limit, 
	void(* handler)(GetQuarantineOffersResponse, Error, void* )
	, void* userData)
{
	return getCampaignQuarantineOffersHelper(accessToken,
	campaignId, getQuarantineOffersRequest, pageToken, limit, 
	handler, userData, true);
}

bool DbsManager::getCampaignQuarantineOffersSync(char * accessToken,
	long long campaignId, std::shared_ptr<GetQuarantineOffersRequest> getQuarantineOffersRequest, std::string pageToken, int limit, 
	void(* handler)(GetQuarantineOffersResponse, Error, void* )
	, void* userData)
{
	return getCampaignQuarantineOffersHelper(accessToken,
	campaignId, getQuarantineOffersRequest, pageToken, limit, 
	handler, userData, false);
}

static bool getCampaignRegionProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetCampaignRegionResponse, Error, void* )
	= reinterpret_cast<void(*)(GetCampaignRegionResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetCampaignRegionResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetCampaignRegionResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetCampaignRegionResponse", "GetCampaignRegionResponse");
			json_node_free(pJson);

			if ("GetCampaignRegionResponse" == "std::string") {
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

static bool getCampaignRegionHelper(char * accessToken,
	long long campaignId, 
	void(* handler)(GetCampaignRegionResponse, Error, void* )
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

	string url("/campaigns/{campaignId}/region");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getCampaignRegionProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getCampaignRegionProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getCampaignRegionAsync(char * accessToken,
	long long campaignId, 
	void(* handler)(GetCampaignRegionResponse, Error, void* )
	, void* userData)
{
	return getCampaignRegionHelper(accessToken,
	campaignId, 
	handler, userData, true);
}

bool DbsManager::getCampaignRegionSync(char * accessToken,
	long long campaignId, 
	void(* handler)(GetCampaignRegionResponse, Error, void* )
	, void* userData)
{
	return getCampaignRegionHelper(accessToken,
	campaignId, 
	handler, userData, false);
}

static bool getCampaignSettingsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetCampaignSettingsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetCampaignSettingsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetCampaignSettingsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetCampaignSettingsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetCampaignSettingsResponse", "GetCampaignSettingsResponse");
			json_node_free(pJson);

			if ("GetCampaignSettingsResponse" == "std::string") {
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

static bool getCampaignSettingsHelper(char * accessToken,
	long long campaignId, 
	void(* handler)(GetCampaignSettingsResponse, Error, void* )
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

	string url("/campaigns/{campaignId}/settings");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getCampaignSettingsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getCampaignSettingsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getCampaignSettingsAsync(char * accessToken,
	long long campaignId, 
	void(* handler)(GetCampaignSettingsResponse, Error, void* )
	, void* userData)
{
	return getCampaignSettingsHelper(accessToken,
	campaignId, 
	handler, userData, true);
}

bool DbsManager::getCampaignSettingsSync(char * accessToken,
	long long campaignId, 
	void(* handler)(GetCampaignSettingsResponse, Error, void* )
	, void* userData)
{
	return getCampaignSettingsHelper(accessToken,
	campaignId, 
	handler, userData, false);
}

static bool getCampaignsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetCampaignsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetCampaignsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetCampaignsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetCampaignsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetCampaignsResponse", "GetCampaignsResponse");
			json_node_free(pJson);

			if ("GetCampaignsResponse" == "std::string") {
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

static bool getCampaignsHelper(char * accessToken,
	int page, int pageSize, 
	void(* handler)(GetCampaignsResponse, Error, void* )
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
	

	itemAtq = stringify(&page, "int");
	queryParams.insert(pair<string, string>("page", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page");
	}


	itemAtq = stringify(&pageSize, "int");
	queryParams.insert(pair<string, string>("pageSize", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("pageSize");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/campaigns");
	int pos;


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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getCampaignsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getCampaignsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getCampaignsAsync(char * accessToken,
	int page, int pageSize, 
	void(* handler)(GetCampaignsResponse, Error, void* )
	, void* userData)
{
	return getCampaignsHelper(accessToken,
	page, pageSize, 
	handler, userData, true);
}

bool DbsManager::getCampaignsSync(char * accessToken,
	int page, int pageSize, 
	void(* handler)(GetCampaignsResponse, Error, void* )
	, void* userData)
{
	return getCampaignsHelper(accessToken,
	page, pageSize, 
	handler, userData, false);
}

static bool getCampaignsByLoginProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetCampaignsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetCampaignsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetCampaignsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetCampaignsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetCampaignsResponse", "GetCampaignsResponse");
			json_node_free(pJson);

			if ("GetCampaignsResponse" == "std::string") {
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

static bool getCampaignsByLoginHelper(char * accessToken,
	std::string login, int page, int pageSize, 
	void(* handler)(GetCampaignsResponse, Error, void* )
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
	

	itemAtq = stringify(&page, "int");
	queryParams.insert(pair<string, string>("page", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page");
	}


	itemAtq = stringify(&pageSize, "int");
	queryParams.insert(pair<string, string>("pageSize", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("pageSize");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/campaigns/by_login/{login}");
	int pos;

	string s_login("{");
	s_login.append("login");
	s_login.append("}");
	pos = url.find(s_login);
	url.erase(pos, s_login.length());
	url.insert(pos, stringify(&login, "std::string"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getCampaignsByLoginProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getCampaignsByLoginProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getCampaignsByLoginAsync(char * accessToken,
	std::string login, int page, int pageSize, 
	void(* handler)(GetCampaignsResponse, Error, void* )
	, void* userData)
{
	return getCampaignsByLoginHelper(accessToken,
	login, page, pageSize, 
	handler, userData, true);
}

bool DbsManager::getCampaignsByLoginSync(char * accessToken,
	std::string login, int page, int pageSize, 
	void(* handler)(GetCampaignsResponse, Error, void* )
	, void* userData)
{
	return getCampaignsByLoginHelper(accessToken,
	login, page, pageSize, 
	handler, userData, false);
}

static bool getCategoriesMaxSaleQuantumProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetCategoriesMaxSaleQuantumResponse, Error, void* )
	= reinterpret_cast<void(*)(GetCategoriesMaxSaleQuantumResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetCategoriesMaxSaleQuantumResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetCategoriesMaxSaleQuantumResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetCategoriesMaxSaleQuantumResponse", "GetCategoriesMaxSaleQuantumResponse");
			json_node_free(pJson);

			if ("GetCategoriesMaxSaleQuantumResponse" == "std::string") {
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

static bool getCategoriesMaxSaleQuantumHelper(char * accessToken,
	std::shared_ptr<GetCategoriesMaxSaleQuantumRequest> getCategoriesMaxSaleQuantumRequest, 
	void(* handler)(GetCategoriesMaxSaleQuantumResponse, Error, void* )
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

	if (isprimitive("GetCategoriesMaxSaleQuantumRequest")) {
		node = converttoJson(&getCategoriesMaxSaleQuantumRequest, "GetCategoriesMaxSaleQuantumRequest", "");
	}
	
	char *jsonStr =  getCategoriesMaxSaleQuantumRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/categories/max-sale-quantum");
	int pos;


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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getCategoriesMaxSaleQuantumProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getCategoriesMaxSaleQuantumProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getCategoriesMaxSaleQuantumAsync(char * accessToken,
	std::shared_ptr<GetCategoriesMaxSaleQuantumRequest> getCategoriesMaxSaleQuantumRequest, 
	void(* handler)(GetCategoriesMaxSaleQuantumResponse, Error, void* )
	, void* userData)
{
	return getCategoriesMaxSaleQuantumHelper(accessToken,
	getCategoriesMaxSaleQuantumRequest, 
	handler, userData, true);
}

bool DbsManager::getCategoriesMaxSaleQuantumSync(char * accessToken,
	std::shared_ptr<GetCategoriesMaxSaleQuantumRequest> getCategoriesMaxSaleQuantumRequest, 
	void(* handler)(GetCategoriesMaxSaleQuantumResponse, Error, void* )
	, void* userData)
{
	return getCategoriesMaxSaleQuantumHelper(accessToken,
	getCategoriesMaxSaleQuantumRequest, 
	handler, userData, false);
}

static bool getCategoriesTreeProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetCategoriesResponse, Error, void* )
	= reinterpret_cast<void(*)(GetCategoriesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetCategoriesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetCategoriesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetCategoriesResponse", "GetCategoriesResponse");
			json_node_free(pJson);

			if ("GetCategoriesResponse" == "std::string") {
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

static bool getCategoriesTreeHelper(char * accessToken,
	std::shared_ptr<GetCategoriesRequest> getCategoriesRequest, 
	void(* handler)(GetCategoriesResponse, Error, void* )
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

	if (isprimitive("GetCategoriesRequest")) {
		node = converttoJson(&getCategoriesRequest, "GetCategoriesRequest", "");
	}
	
	char *jsonStr =  getCategoriesRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/categories/tree");
	int pos;


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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getCategoriesTreeProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getCategoriesTreeProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getCategoriesTreeAsync(char * accessToken,
	std::shared_ptr<GetCategoriesRequest> getCategoriesRequest, 
	void(* handler)(GetCategoriesResponse, Error, void* )
	, void* userData)
{
	return getCategoriesTreeHelper(accessToken,
	getCategoriesRequest, 
	handler, userData, true);
}

bool DbsManager::getCategoriesTreeSync(char * accessToken,
	std::shared_ptr<GetCategoriesRequest> getCategoriesRequest, 
	void(* handler)(GetCategoriesResponse, Error, void* )
	, void* userData)
{
	return getCategoriesTreeHelper(accessToken,
	getCategoriesRequest, 
	handler, userData, false);
}

static bool getCategoryContentParametersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetCategoryContentParametersResponse, Error, void* )
	= reinterpret_cast<void(*)(GetCategoryContentParametersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetCategoryContentParametersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetCategoryContentParametersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetCategoryContentParametersResponse", "GetCategoryContentParametersResponse");
			json_node_free(pJson);

			if ("GetCategoryContentParametersResponse" == "std::string") {
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

static bool getCategoryContentParametersHelper(char * accessToken,
	long long categoryId, 
	void(* handler)(GetCategoryContentParametersResponse, Error, void* )
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

	string url("/category/{categoryId}/parameters");
	int pos;

	string s_categoryId("{");
	s_categoryId.append("categoryId");
	s_categoryId.append("}");
	pos = url.find(s_categoryId);
	url.erase(pos, s_categoryId.length());
	url.insert(pos, stringify(&categoryId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getCategoryContentParametersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getCategoryContentParametersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getCategoryContentParametersAsync(char * accessToken,
	long long categoryId, 
	void(* handler)(GetCategoryContentParametersResponse, Error, void* )
	, void* userData)
{
	return getCategoryContentParametersHelper(accessToken,
	categoryId, 
	handler, userData, true);
}

bool DbsManager::getCategoryContentParametersSync(char * accessToken,
	long long categoryId, 
	void(* handler)(GetCategoryContentParametersResponse, Error, void* )
	, void* userData)
{
	return getCategoryContentParametersHelper(accessToken,
	categoryId, 
	handler, userData, false);
}

static bool getChatHistoryProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetChatHistoryResponse, Error, void* )
	= reinterpret_cast<void(*)(GetChatHistoryResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetChatHistoryResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetChatHistoryResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetChatHistoryResponse", "GetChatHistoryResponse");
			json_node_free(pJson);

			if ("GetChatHistoryResponse" == "std::string") {
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

static bool getChatHistoryHelper(char * accessToken,
	long long businessId, long long chatId, std::shared_ptr<GetChatHistoryRequest> getChatHistoryRequest, std::string pageToken, int limit, 
	void(* handler)(GetChatHistoryResponse, Error, void* )
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
	

	itemAtq = stringify(&chatId, "long long");
	queryParams.insert(pair<string, string>("chatId", itemAtq));


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

	if (isprimitive("GetChatHistoryRequest")) {
		node = converttoJson(&getChatHistoryRequest, "GetChatHistoryRequest", "");
	}
	
	char *jsonStr =  getChatHistoryRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/chats/history");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getChatHistoryProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getChatHistoryProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getChatHistoryAsync(char * accessToken,
	long long businessId, long long chatId, std::shared_ptr<GetChatHistoryRequest> getChatHistoryRequest, std::string pageToken, int limit, 
	void(* handler)(GetChatHistoryResponse, Error, void* )
	, void* userData)
{
	return getChatHistoryHelper(accessToken,
	businessId, chatId, getChatHistoryRequest, pageToken, limit, 
	handler, userData, true);
}

bool DbsManager::getChatHistorySync(char * accessToken,
	long long businessId, long long chatId, std::shared_ptr<GetChatHistoryRequest> getChatHistoryRequest, std::string pageToken, int limit, 
	void(* handler)(GetChatHistoryResponse, Error, void* )
	, void* userData)
{
	return getChatHistoryHelper(accessToken,
	businessId, chatId, getChatHistoryRequest, pageToken, limit, 
	handler, userData, false);
}

static bool getChatsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetChatsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetChatsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetChatsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetChatsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetChatsResponse", "GetChatsResponse");
			json_node_free(pJson);

			if ("GetChatsResponse" == "std::string") {
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

static bool getChatsHelper(char * accessToken,
	long long businessId, std::shared_ptr<GetChatsRequest> getChatsRequest, std::string pageToken, int limit, 
	void(* handler)(GetChatsResponse, Error, void* )
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

	if (isprimitive("GetChatsRequest")) {
		node = converttoJson(&getChatsRequest, "GetChatsRequest", "");
	}
	
	char *jsonStr =  getChatsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/chats");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getChatsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getChatsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getChatsAsync(char * accessToken,
	long long businessId, std::shared_ptr<GetChatsRequest> getChatsRequest, std::string pageToken, int limit, 
	void(* handler)(GetChatsResponse, Error, void* )
	, void* userData)
{
	return getChatsHelper(accessToken,
	businessId, getChatsRequest, pageToken, limit, 
	handler, userData, true);
}

bool DbsManager::getChatsSync(char * accessToken,
	long long businessId, std::shared_ptr<GetChatsRequest> getChatsRequest, std::string pageToken, int limit, 
	void(* handler)(GetChatsResponse, Error, void* )
	, void* userData)
{
	return getChatsHelper(accessToken,
	businessId, getChatsRequest, pageToken, limit, 
	handler, userData, false);
}

static bool getDeliveryServicesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetDeliveryServicesResponse, Error, void* )
	= reinterpret_cast<void(*)(GetDeliveryServicesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetDeliveryServicesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetDeliveryServicesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetDeliveryServicesResponse", "GetDeliveryServicesResponse");
			json_node_free(pJson);

			if ("GetDeliveryServicesResponse" == "std::string") {
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

static bool getDeliveryServicesHelper(char * accessToken,
	
	void(* handler)(GetDeliveryServicesResponse, Error, void* )
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

	string url("/delivery/services");
	int pos;


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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getDeliveryServicesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getDeliveryServicesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getDeliveryServicesAsync(char * accessToken,
	
	void(* handler)(GetDeliveryServicesResponse, Error, void* )
	, void* userData)
{
	return getDeliveryServicesHelper(accessToken,
	
	handler, userData, true);
}

bool DbsManager::getDeliveryServicesSync(char * accessToken,
	
	void(* handler)(GetDeliveryServicesResponse, Error, void* )
	, void* userData)
{
	return getDeliveryServicesHelper(accessToken,
	
	handler, userData, false);
}

static bool getFeedProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetFeedResponse, Error, void* )
	= reinterpret_cast<void(*)(GetFeedResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetFeedResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetFeedResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetFeedResponse", "GetFeedResponse");
			json_node_free(pJson);

			if ("GetFeedResponse" == "std::string") {
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

static bool getFeedHelper(char * accessToken,
	long long campaignId, long long feedId, 
	void(* handler)(GetFeedResponse, Error, void* )
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

	string url("/campaigns/{campaignId}/feeds/{feedId}");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_feedId("{");
	s_feedId.append("feedId");
	s_feedId.append("}");
	pos = url.find(s_feedId);
	url.erase(pos, s_feedId.length());
	url.insert(pos, stringify(&feedId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getFeedProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getFeedProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getFeedAsync(char * accessToken,
	long long campaignId, long long feedId, 
	void(* handler)(GetFeedResponse, Error, void* )
	, void* userData)
{
	return getFeedHelper(accessToken,
	campaignId, feedId, 
	handler, userData, true);
}

bool DbsManager::getFeedSync(char * accessToken,
	long long campaignId, long long feedId, 
	void(* handler)(GetFeedResponse, Error, void* )
	, void* userData)
{
	return getFeedHelper(accessToken,
	campaignId, feedId, 
	handler, userData, false);
}

static bool getFeedIndexLogsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetFeedIndexLogsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetFeedIndexLogsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetFeedIndexLogsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetFeedIndexLogsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetFeedIndexLogsResponse", "GetFeedIndexLogsResponse");
			json_node_free(pJson);

			if ("GetFeedIndexLogsResponse" == "std::string") {
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

static bool getFeedIndexLogsHelper(char * accessToken,
	long long campaignId, long long feedId, int limit, std::string publishedTimeFrom, std::string publishedTimeTo, FeedIndexLogsStatusType status, 
	void(* handler)(GetFeedIndexLogsResponse, Error, void* )
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
	

	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}


	itemAtq = stringify(&publishedTimeFrom, "std::string");
	queryParams.insert(pair<string, string>("published_time_from", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("published_time_from");
	}


	itemAtq = stringify(&publishedTimeTo, "std::string");
	queryParams.insert(pair<string, string>("published_time_to", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("published_time_to");
	}


	itemAtq = stringify(&status, "FeedIndexLogsStatusType");
	queryParams.insert(pair<string, string>("status", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("status");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/campaigns/{campaignId}/feeds/{feedId}/index-logs");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_feedId("{");
	s_feedId.append("feedId");
	s_feedId.append("}");
	pos = url.find(s_feedId);
	url.erase(pos, s_feedId.length());
	url.insert(pos, stringify(&feedId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getFeedIndexLogsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getFeedIndexLogsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getFeedIndexLogsAsync(char * accessToken,
	long long campaignId, long long feedId, int limit, std::string publishedTimeFrom, std::string publishedTimeTo, FeedIndexLogsStatusType status, 
	void(* handler)(GetFeedIndexLogsResponse, Error, void* )
	, void* userData)
{
	return getFeedIndexLogsHelper(accessToken,
	campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status, 
	handler, userData, true);
}

bool DbsManager::getFeedIndexLogsSync(char * accessToken,
	long long campaignId, long long feedId, int limit, std::string publishedTimeFrom, std::string publishedTimeTo, FeedIndexLogsStatusType status, 
	void(* handler)(GetFeedIndexLogsResponse, Error, void* )
	, void* userData)
{
	return getFeedIndexLogsHelper(accessToken,
	campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status, 
	handler, userData, false);
}

static bool getFeedbackAndCommentUpdatesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetFeedbackListResponse, Error, void* )
	= reinterpret_cast<void(*)(GetFeedbackListResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetFeedbackListResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetFeedbackListResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetFeedbackListResponse", "GetFeedbackListResponse");
			json_node_free(pJson);

			if ("GetFeedbackListResponse" == "std::string") {
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

static bool getFeedbackAndCommentUpdatesHelper(char * accessToken,
	long long campaignId, std::string pageToken, int limit, Date fromDate, 
	void(* handler)(GetFeedbackListResponse, Error, void* )
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


	itemAtq = stringify(&fromDate, "Date");
	queryParams.insert(pair<string, string>("from_date", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("from_date");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/campaigns/{campaignId}/feedback/updates");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getFeedbackAndCommentUpdatesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getFeedbackAndCommentUpdatesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getFeedbackAndCommentUpdatesAsync(char * accessToken,
	long long campaignId, std::string pageToken, int limit, Date fromDate, 
	void(* handler)(GetFeedbackListResponse, Error, void* )
	, void* userData)
{
	return getFeedbackAndCommentUpdatesHelper(accessToken,
	campaignId, pageToken, limit, fromDate, 
	handler, userData, true);
}

bool DbsManager::getFeedbackAndCommentUpdatesSync(char * accessToken,
	long long campaignId, std::string pageToken, int limit, Date fromDate, 
	void(* handler)(GetFeedbackListResponse, Error, void* )
	, void* userData)
{
	return getFeedbackAndCommentUpdatesHelper(accessToken,
	campaignId, pageToken, limit, fromDate, 
	handler, userData, false);
}

static bool getFeedsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetFeedsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetFeedsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetFeedsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetFeedsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetFeedsResponse", "GetFeedsResponse");
			json_node_free(pJson);

			if ("GetFeedsResponse" == "std::string") {
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

static bool getFeedsHelper(char * accessToken,
	long long campaignId, 
	void(* handler)(GetFeedsResponse, Error, void* )
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

	string url("/campaigns/{campaignId}/feeds");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getFeedsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getFeedsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getFeedsAsync(char * accessToken,
	long long campaignId, 
	void(* handler)(GetFeedsResponse, Error, void* )
	, void* userData)
{
	return getFeedsHelper(accessToken,
	campaignId, 
	handler, userData, true);
}

bool DbsManager::getFeedsSync(char * accessToken,
	long long campaignId, 
	void(* handler)(GetFeedsResponse, Error, void* )
	, void* userData)
{
	return getFeedsHelper(accessToken,
	campaignId, 
	handler, userData, false);
}

static bool getGoodsFeedbackCommentsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetGoodsFeedbackCommentsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetGoodsFeedbackCommentsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetGoodsFeedbackCommentsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetGoodsFeedbackCommentsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetGoodsFeedbackCommentsResponse", "GetGoodsFeedbackCommentsResponse");
			json_node_free(pJson);

			if ("GetGoodsFeedbackCommentsResponse" == "std::string") {
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

static bool getGoodsFeedbackCommentsHelper(char * accessToken,
	long long businessId, std::shared_ptr<GetGoodsFeedbackCommentsRequest> getGoodsFeedbackCommentsRequest, std::string pageToken, int limit, 
	void(* handler)(GetGoodsFeedbackCommentsResponse, Error, void* )
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

	if (isprimitive("GetGoodsFeedbackCommentsRequest")) {
		node = converttoJson(&getGoodsFeedbackCommentsRequest, "GetGoodsFeedbackCommentsRequest", "");
	}
	
	char *jsonStr =  getGoodsFeedbackCommentsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/goods-feedback/comments");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getGoodsFeedbackCommentsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getGoodsFeedbackCommentsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getGoodsFeedbackCommentsAsync(char * accessToken,
	long long businessId, std::shared_ptr<GetGoodsFeedbackCommentsRequest> getGoodsFeedbackCommentsRequest, std::string pageToken, int limit, 
	void(* handler)(GetGoodsFeedbackCommentsResponse, Error, void* )
	, void* userData)
{
	return getGoodsFeedbackCommentsHelper(accessToken,
	businessId, getGoodsFeedbackCommentsRequest, pageToken, limit, 
	handler, userData, true);
}

bool DbsManager::getGoodsFeedbackCommentsSync(char * accessToken,
	long long businessId, std::shared_ptr<GetGoodsFeedbackCommentsRequest> getGoodsFeedbackCommentsRequest, std::string pageToken, int limit, 
	void(* handler)(GetGoodsFeedbackCommentsResponse, Error, void* )
	, void* userData)
{
	return getGoodsFeedbackCommentsHelper(accessToken,
	businessId, getGoodsFeedbackCommentsRequest, pageToken, limit, 
	handler, userData, false);
}

static bool getGoodsFeedbacksProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetGoodsFeedbackResponse, Error, void* )
	= reinterpret_cast<void(*)(GetGoodsFeedbackResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetGoodsFeedbackResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetGoodsFeedbackResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetGoodsFeedbackResponse", "GetGoodsFeedbackResponse");
			json_node_free(pJson);

			if ("GetGoodsFeedbackResponse" == "std::string") {
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

static bool getGoodsFeedbacksHelper(char * accessToken,
	long long businessId, std::string pageToken, int limit, std::shared_ptr<GetGoodsFeedbackRequest> getGoodsFeedbackRequest, 
	void(* handler)(GetGoodsFeedbackResponse, Error, void* )
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

	if (isprimitive("GetGoodsFeedbackRequest")) {
		node = converttoJson(&getGoodsFeedbackRequest, "GetGoodsFeedbackRequest", "");
	}
	
	char *jsonStr =  getGoodsFeedbackRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/goods-feedback");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getGoodsFeedbacksProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getGoodsFeedbacksProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getGoodsFeedbacksAsync(char * accessToken,
	long long businessId, std::string pageToken, int limit, std::shared_ptr<GetGoodsFeedbackRequest> getGoodsFeedbackRequest, 
	void(* handler)(GetGoodsFeedbackResponse, Error, void* )
	, void* userData)
{
	return getGoodsFeedbacksHelper(accessToken,
	businessId, pageToken, limit, getGoodsFeedbackRequest, 
	handler, userData, true);
}

bool DbsManager::getGoodsFeedbacksSync(char * accessToken,
	long long businessId, std::string pageToken, int limit, std::shared_ptr<GetGoodsFeedbackRequest> getGoodsFeedbackRequest, 
	void(* handler)(GetGoodsFeedbackResponse, Error, void* )
	, void* userData)
{
	return getGoodsFeedbacksHelper(accessToken,
	businessId, pageToken, limit, getGoodsFeedbackRequest, 
	handler, userData, false);
}

static bool getGoodsStatsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetGoodsStatsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetGoodsStatsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetGoodsStatsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetGoodsStatsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetGoodsStatsResponse", "GetGoodsStatsResponse");
			json_node_free(pJson);

			if ("GetGoodsStatsResponse" == "std::string") {
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

static bool getGoodsStatsHelper(char * accessToken,
	long long campaignId, std::shared_ptr<GetGoodsStatsRequest> getGoodsStatsRequest, 
	void(* handler)(GetGoodsStatsResponse, Error, void* )
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

	if (isprimitive("GetGoodsStatsRequest")) {
		node = converttoJson(&getGoodsStatsRequest, "GetGoodsStatsRequest", "");
	}
	
	char *jsonStr =  getGoodsStatsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/stats/skus");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getGoodsStatsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getGoodsStatsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getGoodsStatsAsync(char * accessToken,
	long long campaignId, std::shared_ptr<GetGoodsStatsRequest> getGoodsStatsRequest, 
	void(* handler)(GetGoodsStatsResponse, Error, void* )
	, void* userData)
{
	return getGoodsStatsHelper(accessToken,
	campaignId, getGoodsStatsRequest, 
	handler, userData, true);
}

bool DbsManager::getGoodsStatsSync(char * accessToken,
	long long campaignId, std::shared_ptr<GetGoodsStatsRequest> getGoodsStatsRequest, 
	void(* handler)(GetGoodsStatsResponse, Error, void* )
	, void* userData)
{
	return getGoodsStatsHelper(accessToken,
	campaignId, getGoodsStatsRequest, 
	handler, userData, false);
}

static bool getHiddenOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetHiddenOffersResponse, Error, void* )
	= reinterpret_cast<void(*)(GetHiddenOffersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetHiddenOffersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetHiddenOffersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetHiddenOffersResponse", "GetHiddenOffersResponse");
			json_node_free(pJson);

			if ("GetHiddenOffersResponse" == "std::string") {
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

static bool getHiddenOffersHelper(char * accessToken,
	long long campaignId, std::list<std::string> offerId, std::string pageToken, int limit, int offset, int page, int pageSize, 
	void(* handler)(GetHiddenOffersResponse, Error, void* )
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


	itemAtq = stringify(&offset, "int");
	queryParams.insert(pair<string, string>("offset", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("offset");
	}


	itemAtq = stringify(&page, "int");
	queryParams.insert(pair<string, string>("page", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page");
	}


	itemAtq = stringify(&pageSize, "int");
	queryParams.insert(pair<string, string>("pageSize", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("pageSize");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/campaigns/{campaignId}/hidden-offers");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getHiddenOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getHiddenOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getHiddenOffersAsync(char * accessToken,
	long long campaignId, std::list<std::string> offerId, std::string pageToken, int limit, int offset, int page, int pageSize, 
	void(* handler)(GetHiddenOffersResponse, Error, void* )
	, void* userData)
{
	return getHiddenOffersHelper(accessToken,
	campaignId, offerId, pageToken, limit, offset, page, pageSize, 
	handler, userData, true);
}

bool DbsManager::getHiddenOffersSync(char * accessToken,
	long long campaignId, std::list<std::string> offerId, std::string pageToken, int limit, int offset, int page, int pageSize, 
	void(* handler)(GetHiddenOffersResponse, Error, void* )
	, void* userData)
{
	return getHiddenOffersHelper(accessToken,
	campaignId, offerId, pageToken, limit, offset, page, pageSize, 
	handler, userData, false);
}

static bool getModelProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetModelsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetModelsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetModelsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetModelsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetModelsResponse", "GetModelsResponse");
			json_node_free(pJson);

			if ("GetModelsResponse" == "std::string") {
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

static bool getModelHelper(char * accessToken,
	long long modelId, long long regionId, CurrencyType currency, 
	void(* handler)(GetModelsResponse, Error, void* )
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
	

	itemAtq = stringify(&regionId, "long long");
	queryParams.insert(pair<string, string>("regionId", itemAtq));


	itemAtq = stringify(&currency, "CurrencyType");
	queryParams.insert(pair<string, string>("currency", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("currency");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/models/{modelId}");
	int pos;

	string s_modelId("{");
	s_modelId.append("modelId");
	s_modelId.append("}");
	pos = url.find(s_modelId);
	url.erase(pos, s_modelId.length());
	url.insert(pos, stringify(&modelId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getModelProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getModelProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getModelAsync(char * accessToken,
	long long modelId, long long regionId, CurrencyType currency, 
	void(* handler)(GetModelsResponse, Error, void* )
	, void* userData)
{
	return getModelHelper(accessToken,
	modelId, regionId, currency, 
	handler, userData, true);
}

bool DbsManager::getModelSync(char * accessToken,
	long long modelId, long long regionId, CurrencyType currency, 
	void(* handler)(GetModelsResponse, Error, void* )
	, void* userData)
{
	return getModelHelper(accessToken,
	modelId, regionId, currency, 
	handler, userData, false);
}

static bool getModelOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetModelsOffersResponse, Error, void* )
	= reinterpret_cast<void(*)(GetModelsOffersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetModelsOffersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetModelsOffersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetModelsOffersResponse", "GetModelsOffersResponse");
			json_node_free(pJson);

			if ("GetModelsOffersResponse" == "std::string") {
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

static bool getModelOffersHelper(char * accessToken,
	long long modelId, long long regionId, CurrencyType currency, SortOrderType orderByPrice, int count, int page, 
	void(* handler)(GetModelsOffersResponse, Error, void* )
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
	

	itemAtq = stringify(&regionId, "long long");
	queryParams.insert(pair<string, string>("regionId", itemAtq));


	itemAtq = stringify(&currency, "CurrencyType");
	queryParams.insert(pair<string, string>("currency", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("currency");
	}


	itemAtq = stringify(&orderByPrice, "SortOrderType");
	queryParams.insert(pair<string, string>("orderByPrice", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("orderByPrice");
	}


	itemAtq = stringify(&count, "int");
	queryParams.insert(pair<string, string>("count", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("count");
	}


	itemAtq = stringify(&page, "int");
	queryParams.insert(pair<string, string>("page", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/models/{modelId}/offers");
	int pos;

	string s_modelId("{");
	s_modelId.append("modelId");
	s_modelId.append("}");
	pos = url.find(s_modelId);
	url.erase(pos, s_modelId.length());
	url.insert(pos, stringify(&modelId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getModelOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getModelOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getModelOffersAsync(char * accessToken,
	long long modelId, long long regionId, CurrencyType currency, SortOrderType orderByPrice, int count, int page, 
	void(* handler)(GetModelsOffersResponse, Error, void* )
	, void* userData)
{
	return getModelOffersHelper(accessToken,
	modelId, regionId, currency, orderByPrice, count, page, 
	handler, userData, true);
}

bool DbsManager::getModelOffersSync(char * accessToken,
	long long modelId, long long regionId, CurrencyType currency, SortOrderType orderByPrice, int count, int page, 
	void(* handler)(GetModelsOffersResponse, Error, void* )
	, void* userData)
{
	return getModelOffersHelper(accessToken,
	modelId, regionId, currency, orderByPrice, count, page, 
	handler, userData, false);
}

static bool getModelsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetModelsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetModelsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetModelsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetModelsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetModelsResponse", "GetModelsResponse");
			json_node_free(pJson);

			if ("GetModelsResponse" == "std::string") {
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

static bool getModelsHelper(char * accessToken,
	long long regionId, std::shared_ptr<GetModelsRequest> getModelsRequest, CurrencyType currency, 
	void(* handler)(GetModelsResponse, Error, void* )
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
	

	itemAtq = stringify(&regionId, "long long");
	queryParams.insert(pair<string, string>("regionId", itemAtq));


	itemAtq = stringify(&currency, "CurrencyType");
	queryParams.insert(pair<string, string>("currency", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("currency");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GetModelsRequest")) {
		node = converttoJson(&getModelsRequest, "GetModelsRequest", "");
	}
	
	char *jsonStr =  getModelsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/models");
	int pos;


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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getModelsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getModelsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getModelsAsync(char * accessToken,
	long long regionId, std::shared_ptr<GetModelsRequest> getModelsRequest, CurrencyType currency, 
	void(* handler)(GetModelsResponse, Error, void* )
	, void* userData)
{
	return getModelsHelper(accessToken,
	regionId, getModelsRequest, currency, 
	handler, userData, true);
}

bool DbsManager::getModelsSync(char * accessToken,
	long long regionId, std::shared_ptr<GetModelsRequest> getModelsRequest, CurrencyType currency, 
	void(* handler)(GetModelsResponse, Error, void* )
	, void* userData)
{
	return getModelsHelper(accessToken,
	regionId, getModelsRequest, currency, 
	handler, userData, false);
}

static bool getModelsOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetModelsOffersResponse, Error, void* )
	= reinterpret_cast<void(*)(GetModelsOffersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetModelsOffersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetModelsOffersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetModelsOffersResponse", "GetModelsOffersResponse");
			json_node_free(pJson);

			if ("GetModelsOffersResponse" == "std::string") {
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

static bool getModelsOffersHelper(char * accessToken,
	long long regionId, std::shared_ptr<GetModelsRequest> getModelsRequest, CurrencyType currency, SortOrderType orderByPrice, 
	void(* handler)(GetModelsOffersResponse, Error, void* )
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
	

	itemAtq = stringify(&regionId, "long long");
	queryParams.insert(pair<string, string>("regionId", itemAtq));


	itemAtq = stringify(&currency, "CurrencyType");
	queryParams.insert(pair<string, string>("currency", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("currency");
	}


	itemAtq = stringify(&orderByPrice, "SortOrderType");
	queryParams.insert(pair<string, string>("orderByPrice", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("orderByPrice");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GetModelsRequest")) {
		node = converttoJson(&getModelsRequest, "GetModelsRequest", "");
	}
	
	char *jsonStr =  getModelsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/models/offers");
	int pos;


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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getModelsOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getModelsOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getModelsOffersAsync(char * accessToken,
	long long regionId, std::shared_ptr<GetModelsRequest> getModelsRequest, CurrencyType currency, SortOrderType orderByPrice, 
	void(* handler)(GetModelsOffersResponse, Error, void* )
	, void* userData)
{
	return getModelsOffersHelper(accessToken,
	regionId, getModelsRequest, currency, orderByPrice, 
	handler, userData, true);
}

bool DbsManager::getModelsOffersSync(char * accessToken,
	long long regionId, std::shared_ptr<GetModelsRequest> getModelsRequest, CurrencyType currency, SortOrderType orderByPrice, 
	void(* handler)(GetModelsOffersResponse, Error, void* )
	, void* userData)
{
	return getModelsOffersHelper(accessToken,
	regionId, getModelsRequest, currency, orderByPrice, 
	handler, userData, false);
}

static bool getOfferCardsContentStatusProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetOfferCardsContentStatusResponse, Error, void* )
	= reinterpret_cast<void(*)(GetOfferCardsContentStatusResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetOfferCardsContentStatusResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetOfferCardsContentStatusResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetOfferCardsContentStatusResponse", "GetOfferCardsContentStatusResponse");
			json_node_free(pJson);

			if ("GetOfferCardsContentStatusResponse" == "std::string") {
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

static bool getOfferCardsContentStatusHelper(char * accessToken,
	long long businessId, std::string pageToken, int limit, std::shared_ptr<GetOfferCardsContentStatusRequest> getOfferCardsContentStatusRequest, 
	void(* handler)(GetOfferCardsContentStatusResponse, Error, void* )
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

	if (isprimitive("GetOfferCardsContentStatusRequest")) {
		node = converttoJson(&getOfferCardsContentStatusRequest, "GetOfferCardsContentStatusRequest", "");
	}
	
	char *jsonStr =  getOfferCardsContentStatusRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/offer-cards");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOfferCardsContentStatusProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOfferCardsContentStatusProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getOfferCardsContentStatusAsync(char * accessToken,
	long long businessId, std::string pageToken, int limit, std::shared_ptr<GetOfferCardsContentStatusRequest> getOfferCardsContentStatusRequest, 
	void(* handler)(GetOfferCardsContentStatusResponse, Error, void* )
	, void* userData)
{
	return getOfferCardsContentStatusHelper(accessToken,
	businessId, pageToken, limit, getOfferCardsContentStatusRequest, 
	handler, userData, true);
}

bool DbsManager::getOfferCardsContentStatusSync(char * accessToken,
	long long businessId, std::string pageToken, int limit, std::shared_ptr<GetOfferCardsContentStatusRequest> getOfferCardsContentStatusRequest, 
	void(* handler)(GetOfferCardsContentStatusResponse, Error, void* )
	, void* userData)
{
	return getOfferCardsContentStatusHelper(accessToken,
	businessId, pageToken, limit, getOfferCardsContentStatusRequest, 
	handler, userData, false);
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOfferMappingEntriesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getOfferMappingEntriesAsync(char * accessToken,
	long long campaignId, std::list<std::string> offerId, std::list<std::string> shopSku, OfferMappingKindType mappingKind, std::list<OfferProcessingStatusType> status, std::list<OfferAvailabilityStatusType> availability, std::list<int> categoryId, std::list<std::string> vendor, std::string pageToken, int limit, 
	void(* handler)(GetOfferMappingEntriesResponse, Error, void* )
	, void* userData)
{
	return getOfferMappingEntriesHelper(accessToken,
	campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit, 
	handler, userData, true);
}

bool DbsManager::getOfferMappingEntriesSync(char * accessToken,
	long long campaignId, std::list<std::string> offerId, std::list<std::string> shopSku, OfferMappingKindType mappingKind, std::list<OfferProcessingStatusType> status, std::list<OfferAvailabilityStatusType> availability, std::list<int> categoryId, std::list<std::string> vendor, std::string pageToken, int limit, 
	void(* handler)(GetOfferMappingEntriesResponse, Error, void* )
	, void* userData)
{
	return getOfferMappingEntriesHelper(accessToken,
	campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit, 
	handler, userData, false);
}

static bool getOfferMappingsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetOfferMappingsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetOfferMappingsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetOfferMappingsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetOfferMappingsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetOfferMappingsResponse", "GetOfferMappingsResponse");
			json_node_free(pJson);

			if ("GetOfferMappingsResponse" == "std::string") {
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

static bool getOfferMappingsHelper(char * accessToken,
	long long businessId, std::string pageToken, int limit, std::shared_ptr<GetOfferMappingsRequest> getOfferMappingsRequest, 
	void(* handler)(GetOfferMappingsResponse, Error, void* )
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

	if (isprimitive("GetOfferMappingsRequest")) {
		node = converttoJson(&getOfferMappingsRequest, "GetOfferMappingsRequest", "");
	}
	
	char *jsonStr =  getOfferMappingsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/offer-mappings");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOfferMappingsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOfferMappingsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getOfferMappingsAsync(char * accessToken,
	long long businessId, std::string pageToken, int limit, std::shared_ptr<GetOfferMappingsRequest> getOfferMappingsRequest, 
	void(* handler)(GetOfferMappingsResponse, Error, void* )
	, void* userData)
{
	return getOfferMappingsHelper(accessToken,
	businessId, pageToken, limit, getOfferMappingsRequest, 
	handler, userData, true);
}

bool DbsManager::getOfferMappingsSync(char * accessToken,
	long long businessId, std::string pageToken, int limit, std::shared_ptr<GetOfferMappingsRequest> getOfferMappingsRequest, 
	void(* handler)(GetOfferMappingsResponse, Error, void* )
	, void* userData)
{
	return getOfferMappingsHelper(accessToken,
	businessId, pageToken, limit, getOfferMappingsRequest, 
	handler, userData, false);
}

static bool getOfferRecommendationsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetOfferRecommendationsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetOfferRecommendationsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetOfferRecommendationsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetOfferRecommendationsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetOfferRecommendationsResponse", "GetOfferRecommendationsResponse");
			json_node_free(pJson);

			if ("GetOfferRecommendationsResponse" == "std::string") {
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

static bool getOfferRecommendationsHelper(char * accessToken,
	long long businessId, std::shared_ptr<GetOfferRecommendationsRequest> getOfferRecommendationsRequest, std::string pageToken, int limit, 
	void(* handler)(GetOfferRecommendationsResponse, Error, void* )
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

	if (isprimitive("GetOfferRecommendationsRequest")) {
		node = converttoJson(&getOfferRecommendationsRequest, "GetOfferRecommendationsRequest", "");
	}
	
	char *jsonStr =  getOfferRecommendationsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/offers/recommendations");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOfferRecommendationsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOfferRecommendationsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getOfferRecommendationsAsync(char * accessToken,
	long long businessId, std::shared_ptr<GetOfferRecommendationsRequest> getOfferRecommendationsRequest, std::string pageToken, int limit, 
	void(* handler)(GetOfferRecommendationsResponse, Error, void* )
	, void* userData)
{
	return getOfferRecommendationsHelper(accessToken,
	businessId, getOfferRecommendationsRequest, pageToken, limit, 
	handler, userData, true);
}

bool DbsManager::getOfferRecommendationsSync(char * accessToken,
	long long businessId, std::shared_ptr<GetOfferRecommendationsRequest> getOfferRecommendationsRequest, std::string pageToken, int limit, 
	void(* handler)(GetOfferRecommendationsResponse, Error, void* )
	, void* userData)
{
	return getOfferRecommendationsHelper(accessToken,
	businessId, getOfferRecommendationsRequest, pageToken, limit, 
	handler, userData, false);
}

static bool getOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetOffersResponse, Error, void* )
	= reinterpret_cast<void(*)(GetOffersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetOffersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetOffersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetOffersResponse", "GetOffersResponse");
			json_node_free(pJson);

			if ("GetOffersResponse" == "std::string") {
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

static bool getOffersHelper(char * accessToken,
	long long campaignId, std::string query, long long feedId, std::string shopCategoryId, CurrencyType currency, bool matched, int page, int pageSize, 
	void(* handler)(GetOffersResponse, Error, void* )
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
	

	itemAtq = stringify(&query, "std::string");
	queryParams.insert(pair<string, string>("query", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("query");
	}


	itemAtq = stringify(&feedId, "long long");
	queryParams.insert(pair<string, string>("feedId", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("feedId");
	}


	itemAtq = stringify(&shopCategoryId, "std::string");
	queryParams.insert(pair<string, string>("shopCategoryId", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("shopCategoryId");
	}


	itemAtq = stringify(&currency, "CurrencyType");
	queryParams.insert(pair<string, string>("currency", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("currency");
	}


	itemAtq = stringify(&matched, "bool");
	queryParams.insert(pair<string, string>("matched", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("matched");
	}


	itemAtq = stringify(&page, "int");
	queryParams.insert(pair<string, string>("page", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page");
	}


	itemAtq = stringify(&pageSize, "int");
	queryParams.insert(pair<string, string>("pageSize", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("pageSize");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/campaigns/{campaignId}/offers");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getOffersAsync(char * accessToken,
	long long campaignId, std::string query, long long feedId, std::string shopCategoryId, CurrencyType currency, bool matched, int page, int pageSize, 
	void(* handler)(GetOffersResponse, Error, void* )
	, void* userData)
{
	return getOffersHelper(accessToken,
	campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize, 
	handler, userData, true);
}

bool DbsManager::getOffersSync(char * accessToken,
	long long campaignId, std::string query, long long feedId, std::string shopCategoryId, CurrencyType currency, bool matched, int page, int pageSize, 
	void(* handler)(GetOffersResponse, Error, void* )
	, void* userData)
{
	return getOffersHelper(accessToken,
	campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize, 
	handler, userData, false);
}

static bool getOrderProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetOrderResponse, Error, void* )
	= reinterpret_cast<void(*)(GetOrderResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetOrderResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetOrderResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetOrderResponse", "GetOrderResponse");
			json_node_free(pJson);

			if ("GetOrderResponse" == "std::string") {
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

static bool getOrderHelper(char * accessToken,
	long long campaignId, long long orderId, 
	void(* handler)(GetOrderResponse, Error, void* )
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

	string url("/campaigns/{campaignId}/orders/{orderId}");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOrderProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOrderProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getOrderAsync(char * accessToken,
	long long campaignId, long long orderId, 
	void(* handler)(GetOrderResponse, Error, void* )
	, void* userData)
{
	return getOrderHelper(accessToken,
	campaignId, orderId, 
	handler, userData, true);
}

bool DbsManager::getOrderSync(char * accessToken,
	long long campaignId, long long orderId, 
	void(* handler)(GetOrderResponse, Error, void* )
	, void* userData)
{
	return getOrderHelper(accessToken,
	campaignId, orderId, 
	handler, userData, false);
}

static bool getOrderBusinessBuyerInfoProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetBusinessBuyerInfoResponse, Error, void* )
	= reinterpret_cast<void(*)(GetBusinessBuyerInfoResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetBusinessBuyerInfoResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetBusinessBuyerInfoResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetBusinessBuyerInfoResponse", "GetBusinessBuyerInfoResponse");
			json_node_free(pJson);

			if ("GetBusinessBuyerInfoResponse" == "std::string") {
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

static bool getOrderBusinessBuyerInfoHelper(char * accessToken,
	long long campaignId, long long orderId, 
	void(* handler)(GetBusinessBuyerInfoResponse, Error, void* )
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

	string url("/campaigns/{campaignId}/orders/{orderId}/business-buyer");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOrderBusinessBuyerInfoProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOrderBusinessBuyerInfoProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getOrderBusinessBuyerInfoAsync(char * accessToken,
	long long campaignId, long long orderId, 
	void(* handler)(GetBusinessBuyerInfoResponse, Error, void* )
	, void* userData)
{
	return getOrderBusinessBuyerInfoHelper(accessToken,
	campaignId, orderId, 
	handler, userData, true);
}

bool DbsManager::getOrderBusinessBuyerInfoSync(char * accessToken,
	long long campaignId, long long orderId, 
	void(* handler)(GetBusinessBuyerInfoResponse, Error, void* )
	, void* userData)
{
	return getOrderBusinessBuyerInfoHelper(accessToken,
	campaignId, orderId, 
	handler, userData, false);
}

static bool getOrderBusinessDocumentsInfoProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetBusinessDocumentsInfoResponse, Error, void* )
	= reinterpret_cast<void(*)(GetBusinessDocumentsInfoResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetBusinessDocumentsInfoResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetBusinessDocumentsInfoResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetBusinessDocumentsInfoResponse", "GetBusinessDocumentsInfoResponse");
			json_node_free(pJson);

			if ("GetBusinessDocumentsInfoResponse" == "std::string") {
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

static bool getOrderBusinessDocumentsInfoHelper(char * accessToken,
	long long campaignId, long long orderId, 
	void(* handler)(GetBusinessDocumentsInfoResponse, Error, void* )
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

	string url("/campaigns/{campaignId}/orders/{orderId}/documents");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOrderBusinessDocumentsInfoProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOrderBusinessDocumentsInfoProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getOrderBusinessDocumentsInfoAsync(char * accessToken,
	long long campaignId, long long orderId, 
	void(* handler)(GetBusinessDocumentsInfoResponse, Error, void* )
	, void* userData)
{
	return getOrderBusinessDocumentsInfoHelper(accessToken,
	campaignId, orderId, 
	handler, userData, true);
}

bool DbsManager::getOrderBusinessDocumentsInfoSync(char * accessToken,
	long long campaignId, long long orderId, 
	void(* handler)(GetBusinessDocumentsInfoResponse, Error, void* )
	, void* userData)
{
	return getOrderBusinessDocumentsInfoHelper(accessToken,
	campaignId, orderId, 
	handler, userData, false);
}

static bool getOrderBuyerInfoProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetOrderBuyerInfoResponse, Error, void* )
	= reinterpret_cast<void(*)(GetOrderBuyerInfoResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetOrderBuyerInfoResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetOrderBuyerInfoResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetOrderBuyerInfoResponse", "GetOrderBuyerInfoResponse");
			json_node_free(pJson);

			if ("GetOrderBuyerInfoResponse" == "std::string") {
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

static bool getOrderBuyerInfoHelper(char * accessToken,
	long long campaignId, long long orderId, 
	void(* handler)(GetOrderBuyerInfoResponse, Error, void* )
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

	string url("/campaigns/{campaignId}/orders/{orderId}/buyer");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOrderBuyerInfoProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOrderBuyerInfoProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getOrderBuyerInfoAsync(char * accessToken,
	long long campaignId, long long orderId, 
	void(* handler)(GetOrderBuyerInfoResponse, Error, void* )
	, void* userData)
{
	return getOrderBuyerInfoHelper(accessToken,
	campaignId, orderId, 
	handler, userData, true);
}

bool DbsManager::getOrderBuyerInfoSync(char * accessToken,
	long long campaignId, long long orderId, 
	void(* handler)(GetOrderBuyerInfoResponse, Error, void* )
	, void* userData)
{
	return getOrderBuyerInfoHelper(accessToken,
	campaignId, orderId, 
	handler, userData, false);
}

static bool getOrderLabelsDataProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetOrderLabelsDataResponse, Error, void* )
	= reinterpret_cast<void(*)(GetOrderLabelsDataResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetOrderLabelsDataResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetOrderLabelsDataResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetOrderLabelsDataResponse", "GetOrderLabelsDataResponse");
			json_node_free(pJson);

			if ("GetOrderLabelsDataResponse" == "std::string") {
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

static bool getOrderLabelsDataHelper(char * accessToken,
	long long campaignId, long long orderId, 
	void(* handler)(GetOrderLabelsDataResponse, Error, void* )
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

	string url("/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOrderLabelsDataProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOrderLabelsDataProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getOrderLabelsDataAsync(char * accessToken,
	long long campaignId, long long orderId, 
	void(* handler)(GetOrderLabelsDataResponse, Error, void* )
	, void* userData)
{
	return getOrderLabelsDataHelper(accessToken,
	campaignId, orderId, 
	handler, userData, true);
}

bool DbsManager::getOrderLabelsDataSync(char * accessToken,
	long long campaignId, long long orderId, 
	void(* handler)(GetOrderLabelsDataResponse, Error, void* )
	, void* userData)
{
	return getOrderLabelsDataHelper(accessToken,
	campaignId, orderId, 
	handler, userData, false);
}

static bool getOrdersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetOrdersResponse, Error, void* )
	= reinterpret_cast<void(*)(GetOrdersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetOrdersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetOrdersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetOrdersResponse", "GetOrdersResponse");
			json_node_free(pJson);

			if ("GetOrdersResponse" == "std::string") {
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

static bool getOrdersHelper(char * accessToken,
	long long campaignId, std::list<long long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, Date fromDate, Date toDate, Date supplierShipmentDateFrom, Date supplierShipmentDateTo, std::string updatedAtFrom, std::string updatedAtTo, OrderDeliveryDispatchType dispatchType, bool fake, bool hasCis, bool onlyWaitingForCancellationApprove, bool onlyEstimatedDelivery, OrderBuyerType buyerType, int page, int pageSize, std::string pageToken, int limit, 
	void(* handler)(GetOrdersResponse, Error, void* )
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
	<long long>::iterator queryIter = orderIds.begin(); queryIter != orderIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "long long");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("orderIds", itemAt));
	}
	
	for (Set
	<OrderStatusType>::iterator queryIter = status.begin(); queryIter != status.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "OrderStatusType");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("status", itemAt));
	}
	
	for (Set
	<OrderSubstatusType>::iterator queryIter = substatus.begin(); queryIter != substatus.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "OrderSubstatusType");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("substatus", itemAt));
	}
	

	itemAtq = stringify(&fromDate, "Date");
	queryParams.insert(pair<string, string>("fromDate", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("fromDate");
	}


	itemAtq = stringify(&toDate, "Date");
	queryParams.insert(pair<string, string>("toDate", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("toDate");
	}


	itemAtq = stringify(&supplierShipmentDateFrom, "Date");
	queryParams.insert(pair<string, string>("supplierShipmentDateFrom", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("supplierShipmentDateFrom");
	}


	itemAtq = stringify(&supplierShipmentDateTo, "Date");
	queryParams.insert(pair<string, string>("supplierShipmentDateTo", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("supplierShipmentDateTo");
	}


	itemAtq = stringify(&updatedAtFrom, "std::string");
	queryParams.insert(pair<string, string>("updatedAtFrom", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("updatedAtFrom");
	}


	itemAtq = stringify(&updatedAtTo, "std::string");
	queryParams.insert(pair<string, string>("updatedAtTo", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("updatedAtTo");
	}


	itemAtq = stringify(&dispatchType, "OrderDeliveryDispatchType");
	queryParams.insert(pair<string, string>("dispatchType", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("dispatchType");
	}


	itemAtq = stringify(&fake, "bool");
	queryParams.insert(pair<string, string>("fake", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("fake");
	}


	itemAtq = stringify(&hasCis, "bool");
	queryParams.insert(pair<string, string>("hasCis", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("hasCis");
	}


	itemAtq = stringify(&onlyWaitingForCancellationApprove, "bool");
	queryParams.insert(pair<string, string>("onlyWaitingForCancellationApprove", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("onlyWaitingForCancellationApprove");
	}


	itemAtq = stringify(&onlyEstimatedDelivery, "bool");
	queryParams.insert(pair<string, string>("onlyEstimatedDelivery", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("onlyEstimatedDelivery");
	}


	itemAtq = stringify(&buyerType, "OrderBuyerType");
	queryParams.insert(pair<string, string>("buyerType", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("buyerType");
	}


	itemAtq = stringify(&page, "int");
	queryParams.insert(pair<string, string>("page", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page");
	}


	itemAtq = stringify(&pageSize, "int");
	queryParams.insert(pair<string, string>("pageSize", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("pageSize");
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

	string url("/campaigns/{campaignId}/orders");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOrdersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOrdersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getOrdersAsync(char * accessToken,
	long long campaignId, std::list<long long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, Date fromDate, Date toDate, Date supplierShipmentDateFrom, Date supplierShipmentDateTo, std::string updatedAtFrom, std::string updatedAtTo, OrderDeliveryDispatchType dispatchType, bool fake, bool hasCis, bool onlyWaitingForCancellationApprove, bool onlyEstimatedDelivery, OrderBuyerType buyerType, int page, int pageSize, std::string pageToken, int limit, 
	void(* handler)(GetOrdersResponse, Error, void* )
	, void* userData)
{
	return getOrdersHelper(accessToken,
	campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit, 
	handler, userData, true);
}

bool DbsManager::getOrdersSync(char * accessToken,
	long long campaignId, std::list<long long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, Date fromDate, Date toDate, Date supplierShipmentDateFrom, Date supplierShipmentDateTo, std::string updatedAtFrom, std::string updatedAtTo, OrderDeliveryDispatchType dispatchType, bool fake, bool hasCis, bool onlyWaitingForCancellationApprove, bool onlyEstimatedDelivery, OrderBuyerType buyerType, int page, int pageSize, std::string pageToken, int limit, 
	void(* handler)(GetOrdersResponse, Error, void* )
	, void* userData)
{
	return getOrdersHelper(accessToken,
	campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit, 
	handler, userData, false);
}

static bool getOrdersStatsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetOrdersStatsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetOrdersStatsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetOrdersStatsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetOrdersStatsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetOrdersStatsResponse", "GetOrdersStatsResponse");
			json_node_free(pJson);

			if ("GetOrdersStatsResponse" == "std::string") {
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

static bool getOrdersStatsHelper(char * accessToken,
	long long campaignId, std::string pageToken, int limit, std::shared_ptr<GetOrdersStatsRequest> getOrdersStatsRequest, 
	void(* handler)(GetOrdersStatsResponse, Error, void* )
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

	if (isprimitive("GetOrdersStatsRequest")) {
		node = converttoJson(&getOrdersStatsRequest, "GetOrdersStatsRequest", "");
	}
	
	char *jsonStr =  getOrdersStatsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/stats/orders");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOrdersStatsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOrdersStatsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getOrdersStatsAsync(char * accessToken,
	long long campaignId, std::string pageToken, int limit, std::shared_ptr<GetOrdersStatsRequest> getOrdersStatsRequest, 
	void(* handler)(GetOrdersStatsResponse, Error, void* )
	, void* userData)
{
	return getOrdersStatsHelper(accessToken,
	campaignId, pageToken, limit, getOrdersStatsRequest, 
	handler, userData, true);
}

bool DbsManager::getOrdersStatsSync(char * accessToken,
	long long campaignId, std::string pageToken, int limit, std::shared_ptr<GetOrdersStatsRequest> getOrdersStatsRequest, 
	void(* handler)(GetOrdersStatsResponse, Error, void* )
	, void* userData)
{
	return getOrdersStatsHelper(accessToken,
	campaignId, pageToken, limit, getOrdersStatsRequest, 
	handler, userData, false);
}

static bool getOutletProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetOutletResponse, Error, void* )
	= reinterpret_cast<void(*)(GetOutletResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetOutletResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetOutletResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetOutletResponse", "GetOutletResponse");
			json_node_free(pJson);

			if ("GetOutletResponse" == "std::string") {
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

static bool getOutletHelper(char * accessToken,
	long long campaignId, long long outletId, 
	void(* handler)(GetOutletResponse, Error, void* )
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

	string url("/campaigns/{campaignId}/outlets/{outletId}");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_outletId("{");
	s_outletId.append("outletId");
	s_outletId.append("}");
	pos = url.find(s_outletId);
	url.erase(pos, s_outletId.length());
	url.insert(pos, stringify(&outletId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOutletProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOutletProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getOutletAsync(char * accessToken,
	long long campaignId, long long outletId, 
	void(* handler)(GetOutletResponse, Error, void* )
	, void* userData)
{
	return getOutletHelper(accessToken,
	campaignId, outletId, 
	handler, userData, true);
}

bool DbsManager::getOutletSync(char * accessToken,
	long long campaignId, long long outletId, 
	void(* handler)(GetOutletResponse, Error, void* )
	, void* userData)
{
	return getOutletHelper(accessToken,
	campaignId, outletId, 
	handler, userData, false);
}

static bool getOutletLicensesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetOutletLicensesResponse, Error, void* )
	= reinterpret_cast<void(*)(GetOutletLicensesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetOutletLicensesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetOutletLicensesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetOutletLicensesResponse", "GetOutletLicensesResponse");
			json_node_free(pJson);

			if ("GetOutletLicensesResponse" == "std::string") {
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

static bool getOutletLicensesHelper(char * accessToken,
	long long campaignId, Set<long long> outletIds, Set<long long> ids, 
	void(* handler)(GetOutletLicensesResponse, Error, void* )
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
	
	for (Set
	<long long>::iterator queryIter = outletIds.begin(); queryIter != outletIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "long long");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("outletIds", itemAt));
	}
	
	for (Set
	<long long>::iterator queryIter = ids.begin(); queryIter != ids.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "long long");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("ids", itemAt));
	}
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/campaigns/{campaignId}/outlets/licenses");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOutletLicensesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOutletLicensesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getOutletLicensesAsync(char * accessToken,
	long long campaignId, Set<long long> outletIds, Set<long long> ids, 
	void(* handler)(GetOutletLicensesResponse, Error, void* )
	, void* userData)
{
	return getOutletLicensesHelper(accessToken,
	campaignId, outletIds, ids, 
	handler, userData, true);
}

bool DbsManager::getOutletLicensesSync(char * accessToken,
	long long campaignId, Set<long long> outletIds, Set<long long> ids, 
	void(* handler)(GetOutletLicensesResponse, Error, void* )
	, void* userData)
{
	return getOutletLicensesHelper(accessToken,
	campaignId, outletIds, ids, 
	handler, userData, false);
}

static bool getOutletsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetOutletsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetOutletsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetOutletsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetOutletsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetOutletsResponse", "GetOutletsResponse");
			json_node_free(pJson);

			if ("GetOutletsResponse" == "std::string") {
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

static bool getOutletsHelper(char * accessToken,
	long long campaignId, std::string pageToken, long long regionId, std::string shopOutletCode, long long regionId2, 
	void(* handler)(GetOutletsResponse, Error, void* )
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
	

	itemAtq = stringify(&pageToken, "std::string");
	queryParams.insert(pair<string, string>("page_token", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page_token");
	}


	itemAtq = stringify(&regionId, "long long");
	queryParams.insert(pair<string, string>("region_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("region_id");
	}


	itemAtq = stringify(&shopOutletCode, "std::string");
	queryParams.insert(pair<string, string>("shop_outlet_code", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("shop_outlet_code");
	}


	itemAtq = stringify(&regionId2, "long long");
	queryParams.insert(pair<string, string>("regionId", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("regionId");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/campaigns/{campaignId}/outlets");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOutletsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOutletsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getOutletsAsync(char * accessToken,
	long long campaignId, std::string pageToken, long long regionId, std::string shopOutletCode, long long regionId2, 
	void(* handler)(GetOutletsResponse, Error, void* )
	, void* userData)
{
	return getOutletsHelper(accessToken,
	campaignId, pageToken, regionId, shopOutletCode, regionId2, 
	handler, userData, true);
}

bool DbsManager::getOutletsSync(char * accessToken,
	long long campaignId, std::string pageToken, long long regionId, std::string shopOutletCode, long long regionId2, 
	void(* handler)(GetOutletsResponse, Error, void* )
	, void* userData)
{
	return getOutletsHelper(accessToken,
	campaignId, pageToken, regionId, shopOutletCode, regionId2, 
	handler, userData, false);
}

static bool getPricesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetPricesResponse, Error, void* )
	= reinterpret_cast<void(*)(GetPricesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetPricesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetPricesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetPricesResponse", "GetPricesResponse");
			json_node_free(pJson);

			if ("GetPricesResponse" == "std::string") {
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

static bool getPricesHelper(char * accessToken,
	long long campaignId, std::string pageToken, int limit, bool archived, 
	void(* handler)(GetPricesResponse, Error, void* )
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


	itemAtq = stringify(&archived, "bool");
	queryParams.insert(pair<string, string>("archived", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("archived");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/campaigns/{campaignId}/offer-prices");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getPricesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getPricesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getPricesAsync(char * accessToken,
	long long campaignId, std::string pageToken, int limit, bool archived, 
	void(* handler)(GetPricesResponse, Error, void* )
	, void* userData)
{
	return getPricesHelper(accessToken,
	campaignId, pageToken, limit, archived, 
	handler, userData, true);
}

bool DbsManager::getPricesSync(char * accessToken,
	long long campaignId, std::string pageToken, int limit, bool archived, 
	void(* handler)(GetPricesResponse, Error, void* )
	, void* userData)
{
	return getPricesHelper(accessToken,
	campaignId, pageToken, limit, archived, 
	handler, userData, false);
}

static bool getPricesByOfferIdsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetPricesByOfferIdsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetPricesByOfferIdsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetPricesByOfferIdsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetPricesByOfferIdsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetPricesByOfferIdsResponse", "GetPricesByOfferIdsResponse");
			json_node_free(pJson);

			if ("GetPricesByOfferIdsResponse" == "std::string") {
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

static bool getPricesByOfferIdsHelper(char * accessToken,
	long long campaignId, std::string pageToken, int limit, std::shared_ptr<GetPricesByOfferIdsRequest> getPricesByOfferIdsRequest, 
	void(* handler)(GetPricesByOfferIdsResponse, Error, void* )
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

	if (isprimitive("GetPricesByOfferIdsRequest")) {
		node = converttoJson(&getPricesByOfferIdsRequest, "GetPricesByOfferIdsRequest", "");
	}
	
	char *jsonStr =  getPricesByOfferIdsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/offer-prices");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getPricesByOfferIdsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getPricesByOfferIdsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getPricesByOfferIdsAsync(char * accessToken,
	long long campaignId, std::string pageToken, int limit, std::shared_ptr<GetPricesByOfferIdsRequest> getPricesByOfferIdsRequest, 
	void(* handler)(GetPricesByOfferIdsResponse, Error, void* )
	, void* userData)
{
	return getPricesByOfferIdsHelper(accessToken,
	campaignId, pageToken, limit, getPricesByOfferIdsRequest, 
	handler, userData, true);
}

bool DbsManager::getPricesByOfferIdsSync(char * accessToken,
	long long campaignId, std::string pageToken, int limit, std::shared_ptr<GetPricesByOfferIdsRequest> getPricesByOfferIdsRequest, 
	void(* handler)(GetPricesByOfferIdsResponse, Error, void* )
	, void* userData)
{
	return getPricesByOfferIdsHelper(accessToken,
	campaignId, pageToken, limit, getPricesByOfferIdsRequest, 
	handler, userData, false);
}

static bool getPromoOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetPromoOffersResponse, Error, void* )
	= reinterpret_cast<void(*)(GetPromoOffersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetPromoOffersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetPromoOffersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetPromoOffersResponse", "GetPromoOffersResponse");
			json_node_free(pJson);

			if ("GetPromoOffersResponse" == "std::string") {
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

static bool getPromoOffersHelper(char * accessToken,
	long long businessId, std::shared_ptr<GetPromoOffersRequest> getPromoOffersRequest, std::string pageToken, int limit, 
	void(* handler)(GetPromoOffersResponse, Error, void* )
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

	if (isprimitive("GetPromoOffersRequest")) {
		node = converttoJson(&getPromoOffersRequest, "GetPromoOffersRequest", "");
	}
	
	char *jsonStr =  getPromoOffersRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/promos/offers");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getPromoOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getPromoOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getPromoOffersAsync(char * accessToken,
	long long businessId, std::shared_ptr<GetPromoOffersRequest> getPromoOffersRequest, std::string pageToken, int limit, 
	void(* handler)(GetPromoOffersResponse, Error, void* )
	, void* userData)
{
	return getPromoOffersHelper(accessToken,
	businessId, getPromoOffersRequest, pageToken, limit, 
	handler, userData, true);
}

bool DbsManager::getPromoOffersSync(char * accessToken,
	long long businessId, std::shared_ptr<GetPromoOffersRequest> getPromoOffersRequest, std::string pageToken, int limit, 
	void(* handler)(GetPromoOffersResponse, Error, void* )
	, void* userData)
{
	return getPromoOffersHelper(accessToken,
	businessId, getPromoOffersRequest, pageToken, limit, 
	handler, userData, false);
}

static bool getPromosProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetPromosResponse, Error, void* )
	= reinterpret_cast<void(*)(GetPromosResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetPromosResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetPromosResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetPromosResponse", "GetPromosResponse");
			json_node_free(pJson);

			if ("GetPromosResponse" == "std::string") {
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

static bool getPromosHelper(char * accessToken,
	long long businessId, std::shared_ptr<GetPromosRequest> getPromosRequest, 
	void(* handler)(GetPromosResponse, Error, void* )
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

	if (isprimitive("GetPromosRequest")) {
		node = converttoJson(&getPromosRequest, "GetPromosRequest", "");
	}
	
	char *jsonStr =  getPromosRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/promos");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getPromosProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getPromosProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getPromosAsync(char * accessToken,
	long long businessId, std::shared_ptr<GetPromosRequest> getPromosRequest, 
	void(* handler)(GetPromosResponse, Error, void* )
	, void* userData)
{
	return getPromosHelper(accessToken,
	businessId, getPromosRequest, 
	handler, userData, true);
}

bool DbsManager::getPromosSync(char * accessToken,
	long long businessId, std::shared_ptr<GetPromosRequest> getPromosRequest, 
	void(* handler)(GetPromosResponse, Error, void* )
	, void* userData)
{
	return getPromosHelper(accessToken,
	businessId, getPromosRequest, 
	handler, userData, false);
}

static bool getQualityRatingDetailsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetQualityRatingDetailsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetQualityRatingDetailsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetQualityRatingDetailsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetQualityRatingDetailsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetQualityRatingDetailsResponse", "GetQualityRatingDetailsResponse");
			json_node_free(pJson);

			if ("GetQualityRatingDetailsResponse" == "std::string") {
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

static bool getQualityRatingDetailsHelper(char * accessToken,
	long long campaignId, 
	void(* handler)(GetQualityRatingDetailsResponse, Error, void* )
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

	string url("/campaigns/{campaignId}/ratings/quality/details");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getQualityRatingDetailsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getQualityRatingDetailsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getQualityRatingDetailsAsync(char * accessToken,
	long long campaignId, 
	void(* handler)(GetQualityRatingDetailsResponse, Error, void* )
	, void* userData)
{
	return getQualityRatingDetailsHelper(accessToken,
	campaignId, 
	handler, userData, true);
}

bool DbsManager::getQualityRatingDetailsSync(char * accessToken,
	long long campaignId, 
	void(* handler)(GetQualityRatingDetailsResponse, Error, void* )
	, void* userData)
{
	return getQualityRatingDetailsHelper(accessToken,
	campaignId, 
	handler, userData, false);
}

static bool getQualityRatingsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetQualityRatingResponse, Error, void* )
	= reinterpret_cast<void(*)(GetQualityRatingResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetQualityRatingResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetQualityRatingResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetQualityRatingResponse", "GetQualityRatingResponse");
			json_node_free(pJson);

			if ("GetQualityRatingResponse" == "std::string") {
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

static bool getQualityRatingsHelper(char * accessToken,
	long long businessId, std::shared_ptr<GetQualityRatingRequest> getQualityRatingRequest, 
	void(* handler)(GetQualityRatingResponse, Error, void* )
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

	if (isprimitive("GetQualityRatingRequest")) {
		node = converttoJson(&getQualityRatingRequest, "GetQualityRatingRequest", "");
	}
	
	char *jsonStr =  getQualityRatingRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/ratings/quality");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getQualityRatingsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getQualityRatingsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getQualityRatingsAsync(char * accessToken,
	long long businessId, std::shared_ptr<GetQualityRatingRequest> getQualityRatingRequest, 
	void(* handler)(GetQualityRatingResponse, Error, void* )
	, void* userData)
{
	return getQualityRatingsHelper(accessToken,
	businessId, getQualityRatingRequest, 
	handler, userData, true);
}

bool DbsManager::getQualityRatingsSync(char * accessToken,
	long long businessId, std::shared_ptr<GetQualityRatingRequest> getQualityRatingRequest, 
	void(* handler)(GetQualityRatingResponse, Error, void* )
	, void* userData)
{
	return getQualityRatingsHelper(accessToken,
	businessId, getQualityRatingRequest, 
	handler, userData, false);
}

static bool getReportInfoProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetReportInfoResponse, Error, void* )
	= reinterpret_cast<void(*)(GetReportInfoResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetReportInfoResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetReportInfoResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetReportInfoResponse", "GetReportInfoResponse");
			json_node_free(pJson);

			if ("GetReportInfoResponse" == "std::string") {
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

static bool getReportInfoHelper(char * accessToken,
	std::string reportId, 
	void(* handler)(GetReportInfoResponse, Error, void* )
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

	string url("/reports/info/{reportId}");
	int pos;

	string s_reportId("{");
	s_reportId.append("reportId");
	s_reportId.append("}");
	pos = url.find(s_reportId);
	url.erase(pos, s_reportId.length());
	url.insert(pos, stringify(&reportId, "std::string"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getReportInfoProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getReportInfoProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getReportInfoAsync(char * accessToken,
	std::string reportId, 
	void(* handler)(GetReportInfoResponse, Error, void* )
	, void* userData)
{
	return getReportInfoHelper(accessToken,
	reportId, 
	handler, userData, true);
}

bool DbsManager::getReportInfoSync(char * accessToken,
	std::string reportId, 
	void(* handler)(GetReportInfoResponse, Error, void* )
	, void* userData)
{
	return getReportInfoHelper(accessToken,
	reportId, 
	handler, userData, false);
}

static bool getReturnProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetReturnResponse, Error, void* )
	= reinterpret_cast<void(*)(GetReturnResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetReturnResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetReturnResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetReturnResponse", "GetReturnResponse");
			json_node_free(pJson);

			if ("GetReturnResponse" == "std::string") {
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

static bool getReturnHelper(char * accessToken,
	long long campaignId, long long orderId, long long returnId, 
	void(* handler)(GetReturnResponse, Error, void* )
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

	string url("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));
	string s_returnId("{");
	s_returnId.append("returnId");
	s_returnId.append("}");
	pos = url.find(s_returnId);
	url.erase(pos, s_returnId.length());
	url.insert(pos, stringify(&returnId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getReturnProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getReturnProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getReturnAsync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, 
	void(* handler)(GetReturnResponse, Error, void* )
	, void* userData)
{
	return getReturnHelper(accessToken,
	campaignId, orderId, returnId, 
	handler, userData, true);
}

bool DbsManager::getReturnSync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, 
	void(* handler)(GetReturnResponse, Error, void* )
	, void* userData)
{
	return getReturnHelper(accessToken,
	campaignId, orderId, returnId, 
	handler, userData, false);
}

static bool getReturnApplicationProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::string, Error, void* )
	= reinterpret_cast<void(*)(std::string, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	std::string out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("std::string")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "std::string", "std::string");
			json_node_free(pJson);

			if ("std::string" == "std::string") {
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

static bool getReturnApplicationHelper(char * accessToken,
	long long campaignId, long long orderId, long long returnId, 
	void(* handler)(std::string, Error, void* )
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

	string url("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));
	string s_returnId("{");
	s_returnId.append("returnId");
	s_returnId.append("}");
	pos = url.find(s_returnId);
	url.erase(pos, s_returnId.length());
	url.insert(pos, stringify(&returnId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getReturnApplicationProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getReturnApplicationProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getReturnApplicationAsync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getReturnApplicationHelper(accessToken,
	campaignId, orderId, returnId, 
	handler, userData, true);
}

bool DbsManager::getReturnApplicationSync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getReturnApplicationHelper(accessToken,
	campaignId, orderId, returnId, 
	handler, userData, false);
}

static bool getReturnPhotoProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::string, Error, void* )
	= reinterpret_cast<void(*)(std::string, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	std::string out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("std::string")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "std::string", "std::string");
			json_node_free(pJson);

			if ("std::string" == "std::string") {
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

static bool getReturnPhotoHelper(char * accessToken,
	long long campaignId, long long orderId, long long returnId, long long itemId, std::string imageHash, 
	void(* handler)(std::string, Error, void* )
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

	string url("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));
	string s_returnId("{");
	s_returnId.append("returnId");
	s_returnId.append("}");
	pos = url.find(s_returnId);
	url.erase(pos, s_returnId.length());
	url.insert(pos, stringify(&returnId, "long long"));
	string s_itemId("{");
	s_itemId.append("itemId");
	s_itemId.append("}");
	pos = url.find(s_itemId);
	url.erase(pos, s_itemId.length());
	url.insert(pos, stringify(&itemId, "long long"));
	string s_imageHash("{");
	s_imageHash.append("imageHash");
	s_imageHash.append("}");
	pos = url.find(s_imageHash);
	url.erase(pos, s_imageHash.length());
	url.insert(pos, stringify(&imageHash, "std::string"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getReturnPhotoProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getReturnPhotoProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getReturnPhotoAsync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, long long itemId, std::string imageHash, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getReturnPhotoHelper(accessToken,
	campaignId, orderId, returnId, itemId, imageHash, 
	handler, userData, true);
}

bool DbsManager::getReturnPhotoSync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, long long itemId, std::string imageHash, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getReturnPhotoHelper(accessToken,
	campaignId, orderId, returnId, itemId, imageHash, 
	handler, userData, false);
}

static bool getReturnsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetReturnsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetReturnsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetReturnsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetReturnsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetReturnsResponse", "GetReturnsResponse");
			json_node_free(pJson);

			if ("GetReturnsResponse" == "std::string") {
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

static bool getReturnsHelper(char * accessToken,
	long long campaignId, std::string pageToken, int limit, std::list<long long> orderIds, std::list<RefundStatusType> statuses, ReturnType type, Date fromDate, Date toDate, Date fromDate2, Date toDate2, 
	void(* handler)(GetReturnsResponse, Error, void* )
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

	for (std::list
	<long long>::iterator queryIter = orderIds.begin(); queryIter != orderIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "long long");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("orderIds", itemAt));
	}
	
	for (std::list
	<RefundStatusType>::iterator queryIter = statuses.begin(); queryIter != statuses.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "RefundStatusType");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("statuses", itemAt));
	}
	

	itemAtq = stringify(&type, "ReturnType");
	queryParams.insert(pair<string, string>("type", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("type");
	}


	itemAtq = stringify(&fromDate, "Date");
	queryParams.insert(pair<string, string>("fromDate", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("fromDate");
	}


	itemAtq = stringify(&toDate, "Date");
	queryParams.insert(pair<string, string>("toDate", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("toDate");
	}


	itemAtq = stringify(&fromDate2, "Date");
	queryParams.insert(pair<string, string>("from_date", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("from_date");
	}


	itemAtq = stringify(&toDate2, "Date");
	queryParams.insert(pair<string, string>("to_date", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("to_date");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/campaigns/{campaignId}/returns");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getReturnsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getReturnsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getReturnsAsync(char * accessToken,
	long long campaignId, std::string pageToken, int limit, std::list<long long> orderIds, std::list<RefundStatusType> statuses, ReturnType type, Date fromDate, Date toDate, Date fromDate2, Date toDate2, 
	void(* handler)(GetReturnsResponse, Error, void* )
	, void* userData)
{
	return getReturnsHelper(accessToken,
	campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2, 
	handler, userData, true);
}

bool DbsManager::getReturnsSync(char * accessToken,
	long long campaignId, std::string pageToken, int limit, std::list<long long> orderIds, std::list<RefundStatusType> statuses, ReturnType type, Date fromDate, Date toDate, Date fromDate2, Date toDate2, 
	void(* handler)(GetReturnsResponse, Error, void* )
	, void* userData)
{
	return getReturnsHelper(accessToken,
	campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2, 
	handler, userData, false);
}

static bool getStocksProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetWarehouseStocksResponse, Error, void* )
	= reinterpret_cast<void(*)(GetWarehouseStocksResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetWarehouseStocksResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetWarehouseStocksResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetWarehouseStocksResponse", "GetWarehouseStocksResponse");
			json_node_free(pJson);

			if ("GetWarehouseStocksResponse" == "std::string") {
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

static bool getStocksHelper(char * accessToken,
	long long campaignId, std::string pageToken, int limit, std::shared_ptr<GetWarehouseStocksRequest> getWarehouseStocksRequest, 
	void(* handler)(GetWarehouseStocksResponse, Error, void* )
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

	if (isprimitive("GetWarehouseStocksRequest")) {
		node = converttoJson(&getWarehouseStocksRequest, "GetWarehouseStocksRequest", "");
	}
	
	char *jsonStr =  getWarehouseStocksRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/offers/stocks");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getStocksProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getStocksProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getStocksAsync(char * accessToken,
	long long campaignId, std::string pageToken, int limit, std::shared_ptr<GetWarehouseStocksRequest> getWarehouseStocksRequest, 
	void(* handler)(GetWarehouseStocksResponse, Error, void* )
	, void* userData)
{
	return getStocksHelper(accessToken,
	campaignId, pageToken, limit, getWarehouseStocksRequest, 
	handler, userData, true);
}

bool DbsManager::getStocksSync(char * accessToken,
	long long campaignId, std::string pageToken, int limit, std::shared_ptr<GetWarehouseStocksRequest> getWarehouseStocksRequest, 
	void(* handler)(GetWarehouseStocksResponse, Error, void* )
	, void* userData)
{
	return getStocksHelper(accessToken,
	campaignId, pageToken, limit, getWarehouseStocksRequest, 
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getSuggestedOfferMappingEntriesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getSuggestedOfferMappingEntriesAsync(char * accessToken,
	long long campaignId, std::shared_ptr<GetSuggestedOfferMappingEntriesRequest> getSuggestedOfferMappingEntriesRequest, 
	void(* handler)(GetSuggestedOfferMappingEntriesResponse, Error, void* )
	, void* userData)
{
	return getSuggestedOfferMappingEntriesHelper(accessToken,
	campaignId, getSuggestedOfferMappingEntriesRequest, 
	handler, userData, true);
}

bool DbsManager::getSuggestedOfferMappingEntriesSync(char * accessToken,
	long long campaignId, std::shared_ptr<GetSuggestedOfferMappingEntriesRequest> getSuggestedOfferMappingEntriesRequest, 
	void(* handler)(GetSuggestedOfferMappingEntriesResponse, Error, void* )
	, void* userData)
{
	return getSuggestedOfferMappingEntriesHelper(accessToken,
	campaignId, getSuggestedOfferMappingEntriesRequest, 
	handler, userData, false);
}

static bool getSuggestedOfferMappingsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetSuggestedOfferMappingsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetSuggestedOfferMappingsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetSuggestedOfferMappingsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetSuggestedOfferMappingsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetSuggestedOfferMappingsResponse", "GetSuggestedOfferMappingsResponse");
			json_node_free(pJson);

			if ("GetSuggestedOfferMappingsResponse" == "std::string") {
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

static bool getSuggestedOfferMappingsHelper(char * accessToken,
	long long businessId, std::shared_ptr<GetSuggestedOfferMappingsRequest> getSuggestedOfferMappingsRequest, 
	void(* handler)(GetSuggestedOfferMappingsResponse, Error, void* )
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

	if (isprimitive("GetSuggestedOfferMappingsRequest")) {
		node = converttoJson(&getSuggestedOfferMappingsRequest, "GetSuggestedOfferMappingsRequest", "");
	}
	
	char *jsonStr =  getSuggestedOfferMappingsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/offer-mappings/suggestions");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getSuggestedOfferMappingsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getSuggestedOfferMappingsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getSuggestedOfferMappingsAsync(char * accessToken,
	long long businessId, std::shared_ptr<GetSuggestedOfferMappingsRequest> getSuggestedOfferMappingsRequest, 
	void(* handler)(GetSuggestedOfferMappingsResponse, Error, void* )
	, void* userData)
{
	return getSuggestedOfferMappingsHelper(accessToken,
	businessId, getSuggestedOfferMappingsRequest, 
	handler, userData, true);
}

bool DbsManager::getSuggestedOfferMappingsSync(char * accessToken,
	long long businessId, std::shared_ptr<GetSuggestedOfferMappingsRequest> getSuggestedOfferMappingsRequest, 
	void(* handler)(GetSuggestedOfferMappingsResponse, Error, void* )
	, void* userData)
{
	return getSuggestedOfferMappingsHelper(accessToken,
	businessId, getSuggestedOfferMappingsRequest, 
	handler, userData, false);
}

static bool getSuggestedPricesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(SuggestPricesResponse, Error, void* )
	= reinterpret_cast<void(*)(SuggestPricesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	SuggestPricesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("SuggestPricesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "SuggestPricesResponse", "SuggestPricesResponse");
			json_node_free(pJson);

			if ("SuggestPricesResponse" == "std::string") {
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

static bool getSuggestedPricesHelper(char * accessToken,
	long long campaignId, std::shared_ptr<SuggestPricesRequest> suggestPricesRequest, 
	void(* handler)(SuggestPricesResponse, Error, void* )
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

	if (isprimitive("SuggestPricesRequest")) {
		node = converttoJson(&suggestPricesRequest, "SuggestPricesRequest", "");
	}
	
	char *jsonStr =  suggestPricesRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/offer-prices/suggestions");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getSuggestedPricesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getSuggestedPricesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getSuggestedPricesAsync(char * accessToken,
	long long campaignId, std::shared_ptr<SuggestPricesRequest> suggestPricesRequest, 
	void(* handler)(SuggestPricesResponse, Error, void* )
	, void* userData)
{
	return getSuggestedPricesHelper(accessToken,
	campaignId, suggestPricesRequest, 
	handler, userData, true);
}

bool DbsManager::getSuggestedPricesSync(char * accessToken,
	long long campaignId, std::shared_ptr<SuggestPricesRequest> suggestPricesRequest, 
	void(* handler)(SuggestPricesResponse, Error, void* )
	, void* userData)
{
	return getSuggestedPricesHelper(accessToken,
	campaignId, suggestPricesRequest, 
	handler, userData, false);
}

static bool getWarehousesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetWarehousesResponse, Error, void* )
	= reinterpret_cast<void(*)(GetWarehousesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetWarehousesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetWarehousesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetWarehousesResponse", "GetWarehousesResponse");
			json_node_free(pJson);

			if ("GetWarehousesResponse" == "std::string") {
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

static bool getWarehousesHelper(char * accessToken,
	long long businessId, 
	void(* handler)(GetWarehousesResponse, Error, void* )
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

	string url("/businesses/{businessId}/warehouses");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getWarehousesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getWarehousesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::getWarehousesAsync(char * accessToken,
	long long businessId, 
	void(* handler)(GetWarehousesResponse, Error, void* )
	, void* userData)
{
	return getWarehousesHelper(accessToken,
	businessId, 
	handler, userData, true);
}

bool DbsManager::getWarehousesSync(char * accessToken,
	long long businessId, 
	void(* handler)(GetWarehousesResponse, Error, void* )
	, void* userData)
{
	return getWarehousesHelper(accessToken,
	businessId, 
	handler, userData, false);
}

static bool provideOrderDigitalCodesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool provideOrderDigitalCodesHelper(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<ProvideOrderDigitalCodesRequest> provideOrderDigitalCodesRequest, 
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

	if (isprimitive("ProvideOrderDigitalCodesRequest")) {
		node = converttoJson(&provideOrderDigitalCodesRequest, "ProvideOrderDigitalCodesRequest", "");
	}
	
	char *jsonStr =  provideOrderDigitalCodesRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = provideOrderDigitalCodesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), provideOrderDigitalCodesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::provideOrderDigitalCodesAsync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<ProvideOrderDigitalCodesRequest> provideOrderDigitalCodesRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return provideOrderDigitalCodesHelper(accessToken,
	campaignId, orderId, provideOrderDigitalCodesRequest, 
	handler, userData, true);
}

bool DbsManager::provideOrderDigitalCodesSync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<ProvideOrderDigitalCodesRequest> provideOrderDigitalCodesRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return provideOrderDigitalCodesHelper(accessToken,
	campaignId, orderId, provideOrderDigitalCodesRequest, 
	handler, userData, false);
}

static bool provideOrderItemIdentifiersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProvideOrderItemIdentifiersResponse, Error, void* )
	= reinterpret_cast<void(*)(ProvideOrderItemIdentifiersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProvideOrderItemIdentifiersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProvideOrderItemIdentifiersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProvideOrderItemIdentifiersResponse", "ProvideOrderItemIdentifiersResponse");
			json_node_free(pJson);

			if ("ProvideOrderItemIdentifiersResponse" == "std::string") {
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

static bool provideOrderItemIdentifiersHelper(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<ProvideOrderItemIdentifiersRequest> provideOrderItemIdentifiersRequest, 
	void(* handler)(ProvideOrderItemIdentifiersResponse, Error, void* )
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

	if (isprimitive("ProvideOrderItemIdentifiersRequest")) {
		node = converttoJson(&provideOrderItemIdentifiersRequest, "ProvideOrderItemIdentifiersRequest", "");
	}
	
	char *jsonStr =  provideOrderItemIdentifiersRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/orders/{orderId}/identifiers");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = provideOrderItemIdentifiersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), provideOrderItemIdentifiersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::provideOrderItemIdentifiersAsync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<ProvideOrderItemIdentifiersRequest> provideOrderItemIdentifiersRequest, 
	void(* handler)(ProvideOrderItemIdentifiersResponse, Error, void* )
	, void* userData)
{
	return provideOrderItemIdentifiersHelper(accessToken,
	campaignId, orderId, provideOrderItemIdentifiersRequest, 
	handler, userData, true);
}

bool DbsManager::provideOrderItemIdentifiersSync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<ProvideOrderItemIdentifiersRequest> provideOrderItemIdentifiersRequest, 
	void(* handler)(ProvideOrderItemIdentifiersResponse, Error, void* )
	, void* userData)
{
	return provideOrderItemIdentifiersHelper(accessToken,
	campaignId, orderId, provideOrderItemIdentifiersRequest, 
	handler, userData, false);
}

static bool putBidsForBusinessProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool putBidsForBusinessHelper(char * accessToken,
	long long businessId, std::shared_ptr<PutSkuBidsRequest> putSkuBidsRequest, 
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

	if (isprimitive("PutSkuBidsRequest")) {
		node = converttoJson(&putSkuBidsRequest, "PutSkuBidsRequest", "");
	}
	
	char *jsonStr =  putSkuBidsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/bids");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = putBidsForBusinessProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), putBidsForBusinessProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::putBidsForBusinessAsync(char * accessToken,
	long long businessId, std::shared_ptr<PutSkuBidsRequest> putSkuBidsRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return putBidsForBusinessHelper(accessToken,
	businessId, putSkuBidsRequest, 
	handler, userData, true);
}

bool DbsManager::putBidsForBusinessSync(char * accessToken,
	long long businessId, std::shared_ptr<PutSkuBidsRequest> putSkuBidsRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return putBidsForBusinessHelper(accessToken,
	businessId, putSkuBidsRequest, 
	handler, userData, false);
}

static bool putBidsForCampaignProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool putBidsForCampaignHelper(char * accessToken,
	long long campaignId, std::shared_ptr<PutSkuBidsRequest> putSkuBidsRequest, 
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

	if (isprimitive("PutSkuBidsRequest")) {
		node = converttoJson(&putSkuBidsRequest, "PutSkuBidsRequest", "");
	}
	
	char *jsonStr =  putSkuBidsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/bids");
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
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = putBidsForCampaignProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), putBidsForCampaignProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::putBidsForCampaignAsync(char * accessToken,
	long long campaignId, std::shared_ptr<PutSkuBidsRequest> putSkuBidsRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return putBidsForCampaignHelper(accessToken,
	campaignId, putSkuBidsRequest, 
	handler, userData, true);
}

bool DbsManager::putBidsForCampaignSync(char * accessToken,
	long long campaignId, std::shared_ptr<PutSkuBidsRequest> putSkuBidsRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return putBidsForCampaignHelper(accessToken,
	campaignId, putSkuBidsRequest, 
	handler, userData, false);
}

static bool refreshFeedProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool refreshFeedHelper(char * accessToken,
	long long campaignId, long long feedId, 
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

	string url("/campaigns/{campaignId}/feeds/{feedId}/refresh");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_feedId("{");
	s_feedId.append("feedId");
	s_feedId.append("}");
	pos = url.find(s_feedId);
	url.erase(pos, s_feedId.length());
	url.insert(pos, stringify(&feedId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = refreshFeedProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), refreshFeedProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::refreshFeedAsync(char * accessToken,
	long long campaignId, long long feedId, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return refreshFeedHelper(accessToken,
	campaignId, feedId, 
	handler, userData, true);
}

bool DbsManager::refreshFeedSync(char * accessToken,
	long long campaignId, long long feedId, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return refreshFeedHelper(accessToken,
	campaignId, feedId, 
	handler, userData, false);
}

static bool searchModelsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(SearchModelsResponse, Error, void* )
	= reinterpret_cast<void(*)(SearchModelsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	SearchModelsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("SearchModelsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "SearchModelsResponse", "SearchModelsResponse");
			json_node_free(pJson);

			if ("SearchModelsResponse" == "std::string") {
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

static bool searchModelsHelper(char * accessToken,
	std::string query, long long regionId, CurrencyType currency, int page, int pageSize, 
	void(* handler)(SearchModelsResponse, Error, void* )
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
	

	itemAtq = stringify(&query, "std::string");
	queryParams.insert(pair<string, string>("query", itemAtq));


	itemAtq = stringify(&regionId, "long long");
	queryParams.insert(pair<string, string>("regionId", itemAtq));


	itemAtq = stringify(&currency, "CurrencyType");
	queryParams.insert(pair<string, string>("currency", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("currency");
	}


	itemAtq = stringify(&page, "int");
	queryParams.insert(pair<string, string>("page", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page");
	}


	itemAtq = stringify(&pageSize, "int");
	queryParams.insert(pair<string, string>("pageSize", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("pageSize");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/models");
	int pos;


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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = searchModelsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), searchModelsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::searchModelsAsync(char * accessToken,
	std::string query, long long regionId, CurrencyType currency, int page, int pageSize, 
	void(* handler)(SearchModelsResponse, Error, void* )
	, void* userData)
{
	return searchModelsHelper(accessToken,
	query, regionId, currency, page, pageSize, 
	handler, userData, true);
}

bool DbsManager::searchModelsSync(char * accessToken,
	std::string query, long long regionId, CurrencyType currency, int page, int pageSize, 
	void(* handler)(SearchModelsResponse, Error, void* )
	, void* userData)
{
	return searchModelsHelper(accessToken,
	query, regionId, currency, page, pageSize, 
	handler, userData, false);
}

static bool searchRegionChildrenProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetRegionWithChildrenResponse, Error, void* )
	= reinterpret_cast<void(*)(GetRegionWithChildrenResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetRegionWithChildrenResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetRegionWithChildrenResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetRegionWithChildrenResponse", "GetRegionWithChildrenResponse");
			json_node_free(pJson);

			if ("GetRegionWithChildrenResponse" == "std::string") {
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

static bool searchRegionChildrenHelper(char * accessToken,
	long long regionId, int page, int pageSize, 
	void(* handler)(GetRegionWithChildrenResponse, Error, void* )
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
	

	itemAtq = stringify(&page, "int");
	queryParams.insert(pair<string, string>("page", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page");
	}


	itemAtq = stringify(&pageSize, "int");
	queryParams.insert(pair<string, string>("pageSize", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("pageSize");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/regions/{regionId}/children");
	int pos;

	string s_regionId("{");
	s_regionId.append("regionId");
	s_regionId.append("}");
	pos = url.find(s_regionId);
	url.erase(pos, s_regionId.length());
	url.insert(pos, stringify(&regionId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = searchRegionChildrenProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), searchRegionChildrenProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::searchRegionChildrenAsync(char * accessToken,
	long long regionId, int page, int pageSize, 
	void(* handler)(GetRegionWithChildrenResponse, Error, void* )
	, void* userData)
{
	return searchRegionChildrenHelper(accessToken,
	regionId, page, pageSize, 
	handler, userData, true);
}

bool DbsManager::searchRegionChildrenSync(char * accessToken,
	long long regionId, int page, int pageSize, 
	void(* handler)(GetRegionWithChildrenResponse, Error, void* )
	, void* userData)
{
	return searchRegionChildrenHelper(accessToken,
	regionId, page, pageSize, 
	handler, userData, false);
}

static bool searchRegionsByIdProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetRegionsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetRegionsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetRegionsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetRegionsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetRegionsResponse", "GetRegionsResponse");
			json_node_free(pJson);

			if ("GetRegionsResponse" == "std::string") {
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

static bool searchRegionsByIdHelper(char * accessToken,
	long long regionId, 
	void(* handler)(GetRegionsResponse, Error, void* )
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

	string url("/regions/{regionId}");
	int pos;

	string s_regionId("{");
	s_regionId.append("regionId");
	s_regionId.append("}");
	pos = url.find(s_regionId);
	url.erase(pos, s_regionId.length());
	url.insert(pos, stringify(&regionId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = searchRegionsByIdProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), searchRegionsByIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::searchRegionsByIdAsync(char * accessToken,
	long long regionId, 
	void(* handler)(GetRegionsResponse, Error, void* )
	, void* userData)
{
	return searchRegionsByIdHelper(accessToken,
	regionId, 
	handler, userData, true);
}

bool DbsManager::searchRegionsByIdSync(char * accessToken,
	long long regionId, 
	void(* handler)(GetRegionsResponse, Error, void* )
	, void* userData)
{
	return searchRegionsByIdHelper(accessToken,
	regionId, 
	handler, userData, false);
}

static bool searchRegionsByNameProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetRegionsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetRegionsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetRegionsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetRegionsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetRegionsResponse", "GetRegionsResponse");
			json_node_free(pJson);

			if ("GetRegionsResponse" == "std::string") {
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

static bool searchRegionsByNameHelper(char * accessToken,
	std::string name, std::string pageToken, int limit, 
	void(* handler)(GetRegionsResponse, Error, void* )
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
	

	itemAtq = stringify(&name, "std::string");
	queryParams.insert(pair<string, string>("name", itemAtq));


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

	string url("/regions");
	int pos;


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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = searchRegionsByNameProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), searchRegionsByNameProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::searchRegionsByNameAsync(char * accessToken,
	std::string name, std::string pageToken, int limit, 
	void(* handler)(GetRegionsResponse, Error, void* )
	, void* userData)
{
	return searchRegionsByNameHelper(accessToken,
	name, pageToken, limit, 
	handler, userData, true);
}

bool DbsManager::searchRegionsByNameSync(char * accessToken,
	std::string name, std::string pageToken, int limit, 
	void(* handler)(GetRegionsResponse, Error, void* )
	, void* userData)
{
	return searchRegionsByNameHelper(accessToken,
	name, pageToken, limit, 
	handler, userData, false);
}

static bool sendFileToChatProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool sendFileToChatHelper(char * accessToken,
	long long businessId, long long chatId, std::string file, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: multipart/form-data");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&chatId, "long long");
	queryParams.insert(pair<string, string>("chatId", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/businesses/{businessId}/chats/file/send");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = sendFileToChatProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), sendFileToChatProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::sendFileToChatAsync(char * accessToken,
	long long businessId, long long chatId, std::string file, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return sendFileToChatHelper(accessToken,
	businessId, chatId, file, 
	handler, userData, true);
}

bool DbsManager::sendFileToChatSync(char * accessToken,
	long long businessId, long long chatId, std::string file, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return sendFileToChatHelper(accessToken,
	businessId, chatId, file, 
	handler, userData, false);
}

static bool sendMessageToChatProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool sendMessageToChatHelper(char * accessToken,
	long long businessId, long long chatId, std::shared_ptr<SendMessageToChatRequest> sendMessageToChatRequest, 
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
	

	itemAtq = stringify(&chatId, "long long");
	queryParams.insert(pair<string, string>("chatId", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("SendMessageToChatRequest")) {
		node = converttoJson(&sendMessageToChatRequest, "SendMessageToChatRequest", "");
	}
	
	char *jsonStr =  sendMessageToChatRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/chats/message");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = sendMessageToChatProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), sendMessageToChatProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::sendMessageToChatAsync(char * accessToken,
	long long businessId, long long chatId, std::shared_ptr<SendMessageToChatRequest> sendMessageToChatRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return sendMessageToChatHelper(accessToken,
	businessId, chatId, sendMessageToChatRequest, 
	handler, userData, true);
}

bool DbsManager::sendMessageToChatSync(char * accessToken,
	long long businessId, long long chatId, std::shared_ptr<SendMessageToChatRequest> sendMessageToChatRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return sendMessageToChatHelper(accessToken,
	businessId, chatId, sendMessageToChatRequest, 
	handler, userData, false);
}

static bool setFeedParamsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool setFeedParamsHelper(char * accessToken,
	long long campaignId, long long feedId, std::shared_ptr<SetFeedParamsRequest> setFeedParamsRequest, 
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

	if (isprimitive("SetFeedParamsRequest")) {
		node = converttoJson(&setFeedParamsRequest, "SetFeedParamsRequest", "");
	}
	
	char *jsonStr =  setFeedParamsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/feeds/{feedId}/params");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_feedId("{");
	s_feedId.append("feedId");
	s_feedId.append("}");
	pos = url.find(s_feedId);
	url.erase(pos, s_feedId.length());
	url.insert(pos, stringify(&feedId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = setFeedParamsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), setFeedParamsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::setFeedParamsAsync(char * accessToken,
	long long campaignId, long long feedId, std::shared_ptr<SetFeedParamsRequest> setFeedParamsRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return setFeedParamsHelper(accessToken,
	campaignId, feedId, setFeedParamsRequest, 
	handler, userData, true);
}

bool DbsManager::setFeedParamsSync(char * accessToken,
	long long campaignId, long long feedId, std::shared_ptr<SetFeedParamsRequest> setFeedParamsRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return setFeedParamsHelper(accessToken,
	campaignId, feedId, setFeedParamsRequest, 
	handler, userData, false);
}

static bool setOrderBoxLayoutProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(SetOrderBoxLayoutResponse, Error, void* )
	= reinterpret_cast<void(*)(SetOrderBoxLayoutResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	SetOrderBoxLayoutResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("SetOrderBoxLayoutResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "SetOrderBoxLayoutResponse", "SetOrderBoxLayoutResponse");
			json_node_free(pJson);

			if ("SetOrderBoxLayoutResponse" == "std::string") {
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

static bool setOrderBoxLayoutHelper(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<SetOrderBoxLayoutRequest> setOrderBoxLayoutRequest, 
	void(* handler)(SetOrderBoxLayoutResponse, Error, void* )
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

	if (isprimitive("SetOrderBoxLayoutRequest")) {
		node = converttoJson(&setOrderBoxLayoutRequest, "SetOrderBoxLayoutRequest", "");
	}
	
	char *jsonStr =  setOrderBoxLayoutRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/orders/{orderId}/boxes");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = setOrderBoxLayoutProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), setOrderBoxLayoutProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::setOrderBoxLayoutAsync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<SetOrderBoxLayoutRequest> setOrderBoxLayoutRequest, 
	void(* handler)(SetOrderBoxLayoutResponse, Error, void* )
	, void* userData)
{
	return setOrderBoxLayoutHelper(accessToken,
	campaignId, orderId, setOrderBoxLayoutRequest, 
	handler, userData, true);
}

bool DbsManager::setOrderBoxLayoutSync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<SetOrderBoxLayoutRequest> setOrderBoxLayoutRequest, 
	void(* handler)(SetOrderBoxLayoutResponse, Error, void* )
	, void* userData)
{
	return setOrderBoxLayoutHelper(accessToken,
	campaignId, orderId, setOrderBoxLayoutRequest, 
	handler, userData, false);
}

static bool setOrderDeliveryDateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool setOrderDeliveryDateHelper(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<SetOrderDeliveryDateRequest> setOrderDeliveryDateRequest, 
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

	if (isprimitive("SetOrderDeliveryDateRequest")) {
		node = converttoJson(&setOrderDeliveryDateRequest, "SetOrderDeliveryDateRequest", "");
	}
	
	char *jsonStr =  setOrderDeliveryDateRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/orders/{orderId}/delivery/date");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = setOrderDeliveryDateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), setOrderDeliveryDateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::setOrderDeliveryDateAsync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<SetOrderDeliveryDateRequest> setOrderDeliveryDateRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return setOrderDeliveryDateHelper(accessToken,
	campaignId, orderId, setOrderDeliveryDateRequest, 
	handler, userData, true);
}

bool DbsManager::setOrderDeliveryDateSync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<SetOrderDeliveryDateRequest> setOrderDeliveryDateRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return setOrderDeliveryDateHelper(accessToken,
	campaignId, orderId, setOrderDeliveryDateRequest, 
	handler, userData, false);
}

static bool setOrderDeliveryTrackCodeProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool setOrderDeliveryTrackCodeHelper(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<SetOrderDeliveryTrackCodeRequest> setOrderDeliveryTrackCodeRequest, 
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

	if (isprimitive("SetOrderDeliveryTrackCodeRequest")) {
		node = converttoJson(&setOrderDeliveryTrackCodeRequest, "SetOrderDeliveryTrackCodeRequest", "");
	}
	
	char *jsonStr =  setOrderDeliveryTrackCodeRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/orders/{orderId}/delivery/track");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = setOrderDeliveryTrackCodeProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), setOrderDeliveryTrackCodeProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::setOrderDeliveryTrackCodeAsync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<SetOrderDeliveryTrackCodeRequest> setOrderDeliveryTrackCodeRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return setOrderDeliveryTrackCodeHelper(accessToken,
	campaignId, orderId, setOrderDeliveryTrackCodeRequest, 
	handler, userData, true);
}

bool DbsManager::setOrderDeliveryTrackCodeSync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<SetOrderDeliveryTrackCodeRequest> setOrderDeliveryTrackCodeRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return setOrderDeliveryTrackCodeHelper(accessToken,
	campaignId, orderId, setOrderDeliveryTrackCodeRequest, 
	handler, userData, false);
}

static bool setOrderShipmentBoxesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(SetOrderShipmentBoxesResponse, Error, void* )
	= reinterpret_cast<void(*)(SetOrderShipmentBoxesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	SetOrderShipmentBoxesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("SetOrderShipmentBoxesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "SetOrderShipmentBoxesResponse", "SetOrderShipmentBoxesResponse");
			json_node_free(pJson);

			if ("SetOrderShipmentBoxesResponse" == "std::string") {
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

static bool setOrderShipmentBoxesHelper(char * accessToken,
	long long campaignId, long long orderId, long long shipmentId, std::shared_ptr<SetOrderShipmentBoxesRequest> setOrderShipmentBoxesRequest, 
	void(* handler)(SetOrderShipmentBoxesResponse, Error, void* )
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

	if (isprimitive("SetOrderShipmentBoxesRequest")) {
		node = converttoJson(&setOrderShipmentBoxesRequest, "SetOrderShipmentBoxesRequest", "");
	}
	
	char *jsonStr =  setOrderShipmentBoxesRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));
	string s_shipmentId("{");
	s_shipmentId.append("shipmentId");
	s_shipmentId.append("}");
	pos = url.find(s_shipmentId);
	url.erase(pos, s_shipmentId.length());
	url.insert(pos, stringify(&shipmentId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = setOrderShipmentBoxesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), setOrderShipmentBoxesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::setOrderShipmentBoxesAsync(char * accessToken,
	long long campaignId, long long orderId, long long shipmentId, std::shared_ptr<SetOrderShipmentBoxesRequest> setOrderShipmentBoxesRequest, 
	void(* handler)(SetOrderShipmentBoxesResponse, Error, void* )
	, void* userData)
{
	return setOrderShipmentBoxesHelper(accessToken,
	campaignId, orderId, shipmentId, setOrderShipmentBoxesRequest, 
	handler, userData, true);
}

bool DbsManager::setOrderShipmentBoxesSync(char * accessToken,
	long long campaignId, long long orderId, long long shipmentId, std::shared_ptr<SetOrderShipmentBoxesRequest> setOrderShipmentBoxesRequest, 
	void(* handler)(SetOrderShipmentBoxesResponse, Error, void* )
	, void* userData)
{
	return setOrderShipmentBoxesHelper(accessToken,
	campaignId, orderId, shipmentId, setOrderShipmentBoxesRequest, 
	handler, userData, false);
}

static bool setReturnDecisionProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool setReturnDecisionHelper(char * accessToken,
	long long campaignId, long long orderId, long long returnId, std::shared_ptr<SetReturnDecisionRequest> setReturnDecisionRequest, 
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

	if (isprimitive("SetReturnDecisionRequest")) {
		node = converttoJson(&setReturnDecisionRequest, "SetReturnDecisionRequest", "");
	}
	
	char *jsonStr =  setReturnDecisionRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));
	string s_returnId("{");
	s_returnId.append("returnId");
	s_returnId.append("}");
	pos = url.find(s_returnId);
	url.erase(pos, s_returnId.length());
	url.insert(pos, stringify(&returnId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = setReturnDecisionProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), setReturnDecisionProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::setReturnDecisionAsync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, std::shared_ptr<SetReturnDecisionRequest> setReturnDecisionRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return setReturnDecisionHelper(accessToken,
	campaignId, orderId, returnId, setReturnDecisionRequest, 
	handler, userData, true);
}

bool DbsManager::setReturnDecisionSync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, std::shared_ptr<SetReturnDecisionRequest> setReturnDecisionRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return setReturnDecisionHelper(accessToken,
	campaignId, orderId, returnId, setReturnDecisionRequest, 
	handler, userData, false);
}

static bool skipGoodsFeedbacksReactionProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool skipGoodsFeedbacksReactionHelper(char * accessToken,
	long long businessId, std::shared_ptr<SkipGoodsFeedbackReactionRequest> skipGoodsFeedbackReactionRequest, 
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

	if (isprimitive("SkipGoodsFeedbackReactionRequest")) {
		node = converttoJson(&skipGoodsFeedbackReactionRequest, "SkipGoodsFeedbackReactionRequest", "");
	}
	
	char *jsonStr =  skipGoodsFeedbackReactionRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/goods-feedback/skip-reaction");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = skipGoodsFeedbacksReactionProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), skipGoodsFeedbacksReactionProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::skipGoodsFeedbacksReactionAsync(char * accessToken,
	long long businessId, std::shared_ptr<SkipGoodsFeedbackReactionRequest> skipGoodsFeedbackReactionRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return skipGoodsFeedbacksReactionHelper(accessToken,
	businessId, skipGoodsFeedbackReactionRequest, 
	handler, userData, true);
}

bool DbsManager::skipGoodsFeedbacksReactionSync(char * accessToken,
	long long businessId, std::shared_ptr<SkipGoodsFeedbackReactionRequest> skipGoodsFeedbackReactionRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return skipGoodsFeedbacksReactionHelper(accessToken,
	businessId, skipGoodsFeedbackReactionRequest, 
	handler, userData, false);
}

static bool submitReturnDecisionProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool submitReturnDecisionHelper(char * accessToken,
	long long campaignId, long long orderId, long long returnId, 
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

	string url("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));
	string s_returnId("{");
	s_returnId.append("returnId");
	s_returnId.append("}");
	pos = url.find(s_returnId);
	url.erase(pos, s_returnId.length());
	url.insert(pos, stringify(&returnId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = submitReturnDecisionProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), submitReturnDecisionProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::submitReturnDecisionAsync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return submitReturnDecisionHelper(accessToken,
	campaignId, orderId, returnId, 
	handler, userData, true);
}

bool DbsManager::submitReturnDecisionSync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return submitReturnDecisionHelper(accessToken,
	campaignId, orderId, returnId, 
	handler, userData, false);
}

static bool updateBusinessPricesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool updateBusinessPricesHelper(char * accessToken,
	long long businessId, std::shared_ptr<UpdateBusinessPricesRequest> updateBusinessPricesRequest, 
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

	if (isprimitive("UpdateBusinessPricesRequest")) {
		node = converttoJson(&updateBusinessPricesRequest, "UpdateBusinessPricesRequest", "");
	}
	
	char *jsonStr =  updateBusinessPricesRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/offer-prices/updates");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateBusinessPricesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateBusinessPricesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::updateBusinessPricesAsync(char * accessToken,
	long long businessId, std::shared_ptr<UpdateBusinessPricesRequest> updateBusinessPricesRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return updateBusinessPricesHelper(accessToken,
	businessId, updateBusinessPricesRequest, 
	handler, userData, true);
}

bool DbsManager::updateBusinessPricesSync(char * accessToken,
	long long businessId, std::shared_ptr<UpdateBusinessPricesRequest> updateBusinessPricesRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return updateBusinessPricesHelper(accessToken,
	businessId, updateBusinessPricesRequest, 
	handler, userData, false);
}

static bool updateCampaignOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool updateCampaignOffersHelper(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateCampaignOffersRequest> updateCampaignOffersRequest, 
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

	if (isprimitive("UpdateCampaignOffersRequest")) {
		node = converttoJson(&updateCampaignOffersRequest, "UpdateCampaignOffersRequest", "");
	}
	
	char *jsonStr =  updateCampaignOffersRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/offers/update");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateCampaignOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateCampaignOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::updateCampaignOffersAsync(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateCampaignOffersRequest> updateCampaignOffersRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return updateCampaignOffersHelper(accessToken,
	campaignId, updateCampaignOffersRequest, 
	handler, userData, true);
}

bool DbsManager::updateCampaignOffersSync(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateCampaignOffersRequest> updateCampaignOffersRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return updateCampaignOffersHelper(accessToken,
	campaignId, updateCampaignOffersRequest, 
	handler, userData, false);
}

static bool updateGoodsFeedbackCommentProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UpdateGoodsFeedbackCommentResponse, Error, void* )
	= reinterpret_cast<void(*)(UpdateGoodsFeedbackCommentResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UpdateGoodsFeedbackCommentResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UpdateGoodsFeedbackCommentResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UpdateGoodsFeedbackCommentResponse", "UpdateGoodsFeedbackCommentResponse");
			json_node_free(pJson);

			if ("UpdateGoodsFeedbackCommentResponse" == "std::string") {
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

static bool updateGoodsFeedbackCommentHelper(char * accessToken,
	long long businessId, std::shared_ptr<UpdateGoodsFeedbackCommentRequest> updateGoodsFeedbackCommentRequest, 
	void(* handler)(UpdateGoodsFeedbackCommentResponse, Error, void* )
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

	if (isprimitive("UpdateGoodsFeedbackCommentRequest")) {
		node = converttoJson(&updateGoodsFeedbackCommentRequest, "UpdateGoodsFeedbackCommentRequest", "");
	}
	
	char *jsonStr =  updateGoodsFeedbackCommentRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/goods-feedback/comments/update");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateGoodsFeedbackCommentProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateGoodsFeedbackCommentProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::updateGoodsFeedbackCommentAsync(char * accessToken,
	long long businessId, std::shared_ptr<UpdateGoodsFeedbackCommentRequest> updateGoodsFeedbackCommentRequest, 
	void(* handler)(UpdateGoodsFeedbackCommentResponse, Error, void* )
	, void* userData)
{
	return updateGoodsFeedbackCommentHelper(accessToken,
	businessId, updateGoodsFeedbackCommentRequest, 
	handler, userData, true);
}

bool DbsManager::updateGoodsFeedbackCommentSync(char * accessToken,
	long long businessId, std::shared_ptr<UpdateGoodsFeedbackCommentRequest> updateGoodsFeedbackCommentRequest, 
	void(* handler)(UpdateGoodsFeedbackCommentResponse, Error, void* )
	, void* userData)
{
	return updateGoodsFeedbackCommentHelper(accessToken,
	businessId, updateGoodsFeedbackCommentRequest, 
	handler, userData, false);
}

static bool updateOfferContentProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UpdateOfferContentResponse, Error, void* )
	= reinterpret_cast<void(*)(UpdateOfferContentResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UpdateOfferContentResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UpdateOfferContentResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UpdateOfferContentResponse", "UpdateOfferContentResponse");
			json_node_free(pJson);

			if ("UpdateOfferContentResponse" == "std::string") {
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

static bool updateOfferContentHelper(char * accessToken,
	long long businessId, std::shared_ptr<UpdateOfferContentRequest> updateOfferContentRequest, 
	void(* handler)(UpdateOfferContentResponse, Error, void* )
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

	if (isprimitive("UpdateOfferContentRequest")) {
		node = converttoJson(&updateOfferContentRequest, "UpdateOfferContentRequest", "");
	}
	
	char *jsonStr =  updateOfferContentRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/offer-cards/update");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateOfferContentProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateOfferContentProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::updateOfferContentAsync(char * accessToken,
	long long businessId, std::shared_ptr<UpdateOfferContentRequest> updateOfferContentRequest, 
	void(* handler)(UpdateOfferContentResponse, Error, void* )
	, void* userData)
{
	return updateOfferContentHelper(accessToken,
	businessId, updateOfferContentRequest, 
	handler, userData, true);
}

bool DbsManager::updateOfferContentSync(char * accessToken,
	long long businessId, std::shared_ptr<UpdateOfferContentRequest> updateOfferContentRequest, 
	void(* handler)(UpdateOfferContentResponse, Error, void* )
	, void* userData)
{
	return updateOfferContentHelper(accessToken,
	businessId, updateOfferContentRequest, 
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateOfferMappingEntriesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::updateOfferMappingEntriesAsync(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateOfferMappingEntryRequest> updateOfferMappingEntryRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return updateOfferMappingEntriesHelper(accessToken,
	campaignId, updateOfferMappingEntryRequest, 
	handler, userData, true);
}

bool DbsManager::updateOfferMappingEntriesSync(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateOfferMappingEntryRequest> updateOfferMappingEntryRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return updateOfferMappingEntriesHelper(accessToken,
	campaignId, updateOfferMappingEntryRequest, 
	handler, userData, false);
}

static bool updateOfferMappingsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UpdateOfferMappingsResponse, Error, void* )
	= reinterpret_cast<void(*)(UpdateOfferMappingsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UpdateOfferMappingsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UpdateOfferMappingsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UpdateOfferMappingsResponse", "UpdateOfferMappingsResponse");
			json_node_free(pJson);

			if ("UpdateOfferMappingsResponse" == "std::string") {
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

static bool updateOfferMappingsHelper(char * accessToken,
	long long businessId, std::shared_ptr<UpdateOfferMappingsRequest> updateOfferMappingsRequest, 
	void(* handler)(UpdateOfferMappingsResponse, Error, void* )
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

	if (isprimitive("UpdateOfferMappingsRequest")) {
		node = converttoJson(&updateOfferMappingsRequest, "UpdateOfferMappingsRequest", "");
	}
	
	char *jsonStr =  updateOfferMappingsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/offer-mappings/update");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateOfferMappingsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateOfferMappingsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::updateOfferMappingsAsync(char * accessToken,
	long long businessId, std::shared_ptr<UpdateOfferMappingsRequest> updateOfferMappingsRequest, 
	void(* handler)(UpdateOfferMappingsResponse, Error, void* )
	, void* userData)
{
	return updateOfferMappingsHelper(accessToken,
	businessId, updateOfferMappingsRequest, 
	handler, userData, true);
}

bool DbsManager::updateOfferMappingsSync(char * accessToken,
	long long businessId, std::shared_ptr<UpdateOfferMappingsRequest> updateOfferMappingsRequest, 
	void(* handler)(UpdateOfferMappingsResponse, Error, void* )
	, void* userData)
{
	return updateOfferMappingsHelper(accessToken,
	businessId, updateOfferMappingsRequest, 
	handler, userData, false);
}

static bool updateOrderItemsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	
	void(* handler)(Error, void* ) = reinterpret_cast<void(*)(Error, void* )> (voidHandler);
	JsonNode* pJson;
	char * data = p_chunk.memory;

	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));


		handler(error, userData);
		return true;



	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		handler(error, userData);
		return false;
	}
}

static bool updateOrderItemsHelper(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<UpdateOrderItemRequest> updateOrderItemRequest, 
	
	void(* handler)(Error, void* ) , void* userData, bool isAsync)
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

	if (isprimitive("UpdateOrderItemRequest")) {
		node = converttoJson(&updateOrderItemRequest, "UpdateOrderItemRequest", "");
	}
	
	char *jsonStr =  updateOrderItemRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/orders/{orderId}/items");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateOrderItemsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateOrderItemsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::updateOrderItemsAsync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<UpdateOrderItemRequest> updateOrderItemRequest, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return updateOrderItemsHelper(accessToken,
	campaignId, orderId, updateOrderItemRequest, 
	handler, userData, true);
}

bool DbsManager::updateOrderItemsSync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<UpdateOrderItemRequest> updateOrderItemRequest, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return updateOrderItemsHelper(accessToken,
	campaignId, orderId, updateOrderItemRequest, 
	handler, userData, false);
}

static bool updateOrderStatusProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UpdateOrderStatusResponse, Error, void* )
	= reinterpret_cast<void(*)(UpdateOrderStatusResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UpdateOrderStatusResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UpdateOrderStatusResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UpdateOrderStatusResponse", "UpdateOrderStatusResponse");
			json_node_free(pJson);

			if ("UpdateOrderStatusResponse" == "std::string") {
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

static bool updateOrderStatusHelper(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<UpdateOrderStatusRequest> updateOrderStatusRequest, 
	void(* handler)(UpdateOrderStatusResponse, Error, void* )
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

	if (isprimitive("UpdateOrderStatusRequest")) {
		node = converttoJson(&updateOrderStatusRequest, "UpdateOrderStatusRequest", "");
	}
	
	char *jsonStr =  updateOrderStatusRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/orders/{orderId}/status");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateOrderStatusProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateOrderStatusProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::updateOrderStatusAsync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<UpdateOrderStatusRequest> updateOrderStatusRequest, 
	void(* handler)(UpdateOrderStatusResponse, Error, void* )
	, void* userData)
{
	return updateOrderStatusHelper(accessToken,
	campaignId, orderId, updateOrderStatusRequest, 
	handler, userData, true);
}

bool DbsManager::updateOrderStatusSync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<UpdateOrderStatusRequest> updateOrderStatusRequest, 
	void(* handler)(UpdateOrderStatusResponse, Error, void* )
	, void* userData)
{
	return updateOrderStatusHelper(accessToken,
	campaignId, orderId, updateOrderStatusRequest, 
	handler, userData, false);
}

static bool updateOrderStatusesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UpdateOrderStatusesResponse, Error, void* )
	= reinterpret_cast<void(*)(UpdateOrderStatusesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UpdateOrderStatusesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UpdateOrderStatusesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UpdateOrderStatusesResponse", "UpdateOrderStatusesResponse");
			json_node_free(pJson);

			if ("UpdateOrderStatusesResponse" == "std::string") {
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

static bool updateOrderStatusesHelper(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateOrderStatusesRequest> updateOrderStatusesRequest, 
	void(* handler)(UpdateOrderStatusesResponse, Error, void* )
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

	if (isprimitive("UpdateOrderStatusesRequest")) {
		node = converttoJson(&updateOrderStatusesRequest, "UpdateOrderStatusesRequest", "");
	}
	
	char *jsonStr =  updateOrderStatusesRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/orders/status-update");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateOrderStatusesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateOrderStatusesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::updateOrderStatusesAsync(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateOrderStatusesRequest> updateOrderStatusesRequest, 
	void(* handler)(UpdateOrderStatusesResponse, Error, void* )
	, void* userData)
{
	return updateOrderStatusesHelper(accessToken,
	campaignId, updateOrderStatusesRequest, 
	handler, userData, true);
}

bool DbsManager::updateOrderStatusesSync(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateOrderStatusesRequest> updateOrderStatusesRequest, 
	void(* handler)(UpdateOrderStatusesResponse, Error, void* )
	, void* userData)
{
	return updateOrderStatusesHelper(accessToken,
	campaignId, updateOrderStatusesRequest, 
	handler, userData, false);
}

static bool updateOrderStorageLimitProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool updateOrderStorageLimitHelper(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<UpdateOrderStorageLimitRequest> updateOrderStorageLimitRequest, 
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

	if (isprimitive("UpdateOrderStorageLimitRequest")) {
		node = converttoJson(&updateOrderStorageLimitRequest, "UpdateOrderStorageLimitRequest", "");
	}
	
	char *jsonStr =  updateOrderStorageLimitRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateOrderStorageLimitProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateOrderStorageLimitProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::updateOrderStorageLimitAsync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<UpdateOrderStorageLimitRequest> updateOrderStorageLimitRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return updateOrderStorageLimitHelper(accessToken,
	campaignId, orderId, updateOrderStorageLimitRequest, 
	handler, userData, true);
}

bool DbsManager::updateOrderStorageLimitSync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<UpdateOrderStorageLimitRequest> updateOrderStorageLimitRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return updateOrderStorageLimitHelper(accessToken,
	campaignId, orderId, updateOrderStorageLimitRequest, 
	handler, userData, false);
}

static bool updateOutletProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool updateOutletHelper(char * accessToken,
	long long campaignId, long long outletId, std::shared_ptr<ChangeOutletRequest> changeOutletRequest, 
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

	if (isprimitive("ChangeOutletRequest")) {
		node = converttoJson(&changeOutletRequest, "ChangeOutletRequest", "");
	}
	
	char *jsonStr =  changeOutletRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/outlets/{outletId}");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_outletId("{");
	s_outletId.append("outletId");
	s_outletId.append("}");
	pos = url.find(s_outletId);
	url.erase(pos, s_outletId.length());
	url.insert(pos, stringify(&outletId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateOutletProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateOutletProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::updateOutletAsync(char * accessToken,
	long long campaignId, long long outletId, std::shared_ptr<ChangeOutletRequest> changeOutletRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return updateOutletHelper(accessToken,
	campaignId, outletId, changeOutletRequest, 
	handler, userData, true);
}

bool DbsManager::updateOutletSync(char * accessToken,
	long long campaignId, long long outletId, std::shared_ptr<ChangeOutletRequest> changeOutletRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return updateOutletHelper(accessToken,
	campaignId, outletId, changeOutletRequest, 
	handler, userData, false);
}

static bool updateOutletLicensesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool updateOutletLicensesHelper(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateOutletLicenseRequest> updateOutletLicenseRequest, 
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

	if (isprimitive("UpdateOutletLicenseRequest")) {
		node = converttoJson(&updateOutletLicenseRequest, "UpdateOutletLicenseRequest", "");
	}
	
	char *jsonStr =  updateOutletLicenseRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/outlets/licenses");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateOutletLicensesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateOutletLicensesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::updateOutletLicensesAsync(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateOutletLicenseRequest> updateOutletLicenseRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return updateOutletLicensesHelper(accessToken,
	campaignId, updateOutletLicenseRequest, 
	handler, userData, true);
}

bool DbsManager::updateOutletLicensesSync(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateOutletLicenseRequest> updateOutletLicenseRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return updateOutletLicensesHelper(accessToken,
	campaignId, updateOutletLicenseRequest, 
	handler, userData, false);
}

static bool updatePricesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool updatePricesHelper(char * accessToken,
	long long campaignId, std::shared_ptr<UpdatePricesRequest> updatePricesRequest, 
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

	if (isprimitive("UpdatePricesRequest")) {
		node = converttoJson(&updatePricesRequest, "UpdatePricesRequest", "");
	}
	
	char *jsonStr =  updatePricesRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/offer-prices/updates");
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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updatePricesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updatePricesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::updatePricesAsync(char * accessToken,
	long long campaignId, std::shared_ptr<UpdatePricesRequest> updatePricesRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return updatePricesHelper(accessToken,
	campaignId, updatePricesRequest, 
	handler, userData, true);
}

bool DbsManager::updatePricesSync(char * accessToken,
	long long campaignId, std::shared_ptr<UpdatePricesRequest> updatePricesRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return updatePricesHelper(accessToken,
	campaignId, updatePricesRequest, 
	handler, userData, false);
}

static bool updatePromoOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UpdatePromoOffersResponse, Error, void* )
	= reinterpret_cast<void(*)(UpdatePromoOffersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UpdatePromoOffersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UpdatePromoOffersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UpdatePromoOffersResponse", "UpdatePromoOffersResponse");
			json_node_free(pJson);

			if ("UpdatePromoOffersResponse" == "std::string") {
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

static bool updatePromoOffersHelper(char * accessToken,
	long long businessId, std::shared_ptr<UpdatePromoOffersRequest> updatePromoOffersRequest, 
	void(* handler)(UpdatePromoOffersResponse, Error, void* )
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

	if (isprimitive("UpdatePromoOffersRequest")) {
		node = converttoJson(&updatePromoOffersRequest, "UpdatePromoOffersRequest", "");
	}
	
	char *jsonStr =  updatePromoOffersRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/promos/offers/update");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updatePromoOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updatePromoOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::updatePromoOffersAsync(char * accessToken,
	long long businessId, std::shared_ptr<UpdatePromoOffersRequest> updatePromoOffersRequest, 
	void(* handler)(UpdatePromoOffersResponse, Error, void* )
	, void* userData)
{
	return updatePromoOffersHelper(accessToken,
	businessId, updatePromoOffersRequest, 
	handler, userData, true);
}

bool DbsManager::updatePromoOffersSync(char * accessToken,
	long long businessId, std::shared_ptr<UpdatePromoOffersRequest> updatePromoOffersRequest, 
	void(* handler)(UpdatePromoOffersResponse, Error, void* )
	, void* userData)
{
	return updatePromoOffersHelper(accessToken,
	businessId, updatePromoOffersRequest, 
	handler, userData, false);
}

static bool updateStocksProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool updateStocksHelper(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateStocksRequest> updateStocksRequest, 
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

	if (isprimitive("UpdateStocksRequest")) {
		node = converttoJson(&updateStocksRequest, "UpdateStocksRequest", "");
	}
	
	char *jsonStr =  updateStocksRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/offers/stocks");
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
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateStocksProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DbsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateStocksProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DbsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DbsManager::updateStocksAsync(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateStocksRequest> updateStocksRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return updateStocksHelper(accessToken,
	campaignId, updateStocksRequest, 
	handler, userData, true);
}

bool DbsManager::updateStocksSync(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateStocksRequest> updateStocksRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return updateStocksHelper(accessToken,
	campaignId, updateStocksRequest, 
	handler, userData, false);
}

