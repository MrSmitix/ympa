#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "ReturnsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


ReturnsManager::ReturnsManager()
{

}

ReturnsManager::~ReturnsManager()
{

}

static gboolean __ReturnsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __ReturnsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__ReturnsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
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
		NetClient::easycurl(ReturnsManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (ReturnsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getReturnProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ReturnsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ReturnsManager::getReturnAsync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, 
	void(* handler)(GetReturnResponse, Error, void* )
	, void* userData)
{
	return getReturnHelper(accessToken,
	campaignId, orderId, returnId, 
	handler, userData, true);
}

bool ReturnsManager::getReturnSync(char * accessToken,
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
		NetClient::easycurl(ReturnsManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (ReturnsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getReturnApplicationProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ReturnsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ReturnsManager::getReturnApplicationAsync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getReturnApplicationHelper(accessToken,
	campaignId, orderId, returnId, 
	handler, userData, true);
}

bool ReturnsManager::getReturnApplicationSync(char * accessToken,
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
		NetClient::easycurl(ReturnsManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (ReturnsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getReturnPhotoProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ReturnsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ReturnsManager::getReturnPhotoAsync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, long long itemId, std::string imageHash, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getReturnPhotoHelper(accessToken,
	campaignId, orderId, returnId, itemId, imageHash, 
	handler, userData, true);
}

bool ReturnsManager::getReturnPhotoSync(char * accessToken,
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
		NetClient::easycurl(ReturnsManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (ReturnsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getReturnsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ReturnsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ReturnsManager::getReturnsAsync(char * accessToken,
	long long campaignId, std::string pageToken, int limit, std::list<long long> orderIds, std::list<RefundStatusType> statuses, ReturnType type, Date fromDate, Date toDate, Date fromDate2, Date toDate2, 
	void(* handler)(GetReturnsResponse, Error, void* )
	, void* userData)
{
	return getReturnsHelper(accessToken,
	campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2, 
	handler, userData, true);
}

bool ReturnsManager::getReturnsSync(char * accessToken,
	long long campaignId, std::string pageToken, int limit, std::list<long long> orderIds, std::list<RefundStatusType> statuses, ReturnType type, Date fromDate, Date toDate, Date fromDate2, Date toDate2, 
	void(* handler)(GetReturnsResponse, Error, void* )
	, void* userData)
{
	return getReturnsHelper(accessToken,
	campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2, 
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
		NetClient::easycurl(ReturnsManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (ReturnsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), setReturnDecisionProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ReturnsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ReturnsManager::setReturnDecisionAsync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, std::shared_ptr<SetReturnDecisionRequest> setReturnDecisionRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return setReturnDecisionHelper(accessToken,
	campaignId, orderId, returnId, setReturnDecisionRequest, 
	handler, userData, true);
}

bool ReturnsManager::setReturnDecisionSync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, std::shared_ptr<SetReturnDecisionRequest> setReturnDecisionRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return setReturnDecisionHelper(accessToken,
	campaignId, orderId, returnId, setReturnDecisionRequest, 
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
		NetClient::easycurl(ReturnsManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (ReturnsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), submitReturnDecisionProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ReturnsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ReturnsManager::submitReturnDecisionAsync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return submitReturnDecisionHelper(accessToken,
	campaignId, orderId, returnId, 
	handler, userData, true);
}

bool ReturnsManager::submitReturnDecisionSync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return submitReturnDecisionHelper(accessToken,
	campaignId, orderId, returnId, 
	handler, userData, false);
}

