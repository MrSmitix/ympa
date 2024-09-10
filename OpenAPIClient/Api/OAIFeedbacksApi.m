#import "OAIFeedbacksApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIApiClientDataErrorResponse.h"
#import "OAIApiForbiddenErrorResponse.h"
#import "OAIApiLimitErrorResponse.h"
#import "OAIApiNotFoundErrorResponse.h"
#import "OAIApiServerErrorResponse.h"
#import "OAIApiUnauthorizedErrorResponse.h"
#import "OAIGetFeedbackListResponse.h"


@interface OAIFeedbacksApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIFeedbacksApi

NSString* kOAIFeedbacksApiErrorDomain = @"OAIFeedbacksApiErrorDomain";
NSInteger kOAIFeedbacksApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    return [self initWithApiClient:[OAIApiClient sharedClient]];
}


-(instancetype) initWithApiClient:(OAIApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _mutableDefaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.mutableDefaultHeaders[key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.mutableDefaultHeaders setValue:value forKey:key];
}

-(NSDictionary *)defaultHeaders {
    return self.mutableDefaultHeaders;
}

#pragma mark - Api Methods

///
/// Новые и обновленные отзывы о магазине
/// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-| 
///  @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
///
///  @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
///
///  @param limit Количество значений на одной странице.  (optional)
///
///  @param fromDate Начальная дата обновления отзывов.  Если параметр указан, возвращаются отзывы, которые были написаны или обновлены с этой даты.  Формат даты: `ГГГГ-ММ-ДД`.  (optional)
///
///  @returns OAIGetFeedbackListResponse*
///
-(NSURLSessionTask*) getFeedbackAndCommentUpdatesWithCampaignId: (NSNumber*) campaignId
    pageToken: (NSString*) pageToken
    limit: (NSNumber*) limit
    fromDate: (NSDate*) fromDate
    completionHandler: (void (^)(OAIGetFeedbackListResponse* output, NSError* error)) handler {
    // verify the required parameter 'campaignId' is set
    if (campaignId == nil) {
        NSParameterAssert(campaignId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"campaignId"] };
            NSError* error = [NSError errorWithDomain:kOAIFeedbacksApiErrorDomain code:kOAIFeedbacksApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/campaigns/{campaignId}/feedback/updates"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (campaignId != nil) {
        pathParams[@"campaignId"] = campaignId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (pageToken != nil) {
        queryParams[@"page_token"] = pageToken;
    }
    if (limit != nil) {
        queryParams[@"limit"] = limit;
    }
    if (fromDate != nil) {
        queryParams[@"from_date"] = fromDate;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"OAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIGetFeedbackListResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIGetFeedbackListResponse*)data, error);
                                }
                            }];
}



@end
