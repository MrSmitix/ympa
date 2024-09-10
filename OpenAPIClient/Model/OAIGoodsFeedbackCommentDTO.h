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


#import "OAIGoodsFeedbackCommentAuthorDTO.h"
#import "OAIGoodsFeedbackCommentStatusType.h"
@protocol OAIGoodsFeedbackCommentAuthorDTO;
@class OAIGoodsFeedbackCommentAuthorDTO;
@protocol OAIGoodsFeedbackCommentStatusType;
@class OAIGoodsFeedbackCommentStatusType;



@protocol OAIGoodsFeedbackCommentDTO
@end

@interface OAIGoodsFeedbackCommentDTO : OAIObject

/* Идентификатор комментария к отзыву.  
 */
@property(nonatomic) NSNumber* _id;
/* Текст комментария. 
 */
@property(nonatomic) NSString* text;
/* Может ли продавец изменять комментарий или удалять его. [optional]
 */
@property(nonatomic) NSNumber* canModify;
/* Идентификатор комментария к отзыву.  [optional]
 */
@property(nonatomic) NSNumber* parentId;

@property(nonatomic) OAIGoodsFeedbackCommentAuthorDTO* author;

@property(nonatomic) OAIGoodsFeedbackCommentStatusType* status;

@end
