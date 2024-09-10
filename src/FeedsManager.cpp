#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "FeedsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


FeedsManager::FeedsManager()
{

}

FeedsManager::~FeedsManager()
{

}

static gboolean __FeedsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __FeedsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__FeedsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
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
		NetClient::easycurl(FeedsManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FeedsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getFeedProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FeedsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FeedsManager::getFeedAsync(char * accessToken,
	long long campaignId, long long feedId, 
	void(* handler)(GetFeedResponse, Error, void* )
	, void* userData)
{
	return getFeedHelper(accessToken,
	campaignId, feedId, 
	handler, userData, true);
}

bool FeedsManager::getFeedSync(char * accessToken,
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
		NetClient::easycurl(FeedsManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FeedsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getFeedIndexLogsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FeedsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FeedsManager::getFeedIndexLogsAsync(char * accessToken,
	long long campaignId, long long feedId, int limit, std::string publishedTimeFrom, std::string publishedTimeTo, FeedIndexLogsStatusType status, 
	void(* handler)(GetFeedIndexLogsResponse, Error, void* )
	, void* userData)
{
	return getFeedIndexLogsHelper(accessToken,
	campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status, 
	handler, userData, true);
}

bool FeedsManager::getFeedIndexLogsSync(char * accessToken,
	long long campaignId, long long feedId, int limit, std::string publishedTimeFrom, std::string publishedTimeTo, FeedIndexLogsStatusType status, 
	void(* handler)(GetFeedIndexLogsResponse, Error, void* )
	, void* userData)
{
	return getFeedIndexLogsHelper(accessToken,
	campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status, 
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
		NetClient::easycurl(FeedsManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FeedsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getFeedsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FeedsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FeedsManager::getFeedsAsync(char * accessToken,
	long long campaignId, 
	void(* handler)(GetFeedsResponse, Error, void* )
	, void* userData)
{
	return getFeedsHelper(accessToken,
	campaignId, 
	handler, userData, true);
}

bool FeedsManager::getFeedsSync(char * accessToken,
	long long campaignId, 
	void(* handler)(GetFeedsResponse, Error, void* )
	, void* userData)
{
	return getFeedsHelper(accessToken,
	campaignId, 
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
		NetClient::easycurl(FeedsManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FeedsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), refreshFeedProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FeedsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FeedsManager::refreshFeedAsync(char * accessToken,
	long long campaignId, long long feedId, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return refreshFeedHelper(accessToken,
	campaignId, feedId, 
	handler, userData, true);
}

bool FeedsManager::refreshFeedSync(char * accessToken,
	long long campaignId, long long feedId, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return refreshFeedHelper(accessToken,
	campaignId, feedId, 
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
		NetClient::easycurl(FeedsManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FeedsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), setFeedParamsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FeedsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FeedsManager::setFeedParamsAsync(char * accessToken,
	long long campaignId, long long feedId, std::shared_ptr<SetFeedParamsRequest> setFeedParamsRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return setFeedParamsHelper(accessToken,
	campaignId, feedId, setFeedParamsRequest, 
	handler, userData, true);
}

bool FeedsManager::setFeedParamsSync(char * accessToken,
	long long campaignId, long long feedId, std::shared_ptr<SetFeedParamsRequest> setFeedParamsRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return setFeedParamsHelper(accessToken,
	campaignId, feedId, setFeedParamsRequest, 
	handler, userData, false);
}

