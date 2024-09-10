#import <Foundation/Foundation.h>
#import "OAIObject.h"

/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#import "OAIFeedDownloadErrorType.h"
@protocol OAIFeedDownloadErrorType;
@class OAIFeedDownloadErrorType;



@protocol OAIFeedDownloadErrorDTO
@end

@interface OAIFeedDownloadErrorDTO : OAIObject

/* HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`.  [optional]
 */
@property(nonatomic) NSNumber* httpStatusCode;

@property(nonatomic) OAIFeedDownloadErrorType* type;
/* Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`.  [optional]
 */
@property(nonatomic) NSString* _description;

@end
