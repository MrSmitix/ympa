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


#import "OAIChatMessageDTO.h"
#import "OAIForwardScrollingPagerDTO.h"
@protocol OAIChatMessageDTO;
@class OAIChatMessageDTO;
@protocol OAIForwardScrollingPagerDTO;
@class OAIForwardScrollingPagerDTO;



@protocol OAIChatMessagesResultDTO
@end

@interface OAIChatMessagesResultDTO : OAIObject

/* Идентификатор заказа. 
 */
@property(nonatomic) NSNumber* orderId;
/* Информация о сообщениях. 
 */
@property(nonatomic) NSArray<OAIChatMessageDTO>* messages;

@property(nonatomic) OAIForwardScrollingPagerDTO* paging;

@end
