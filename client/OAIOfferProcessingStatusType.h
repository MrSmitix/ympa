/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OAIOfferProcessingStatusType.h
 *
 * Статус публикации товара:  * &#x60;READY&#x60; — товар прошел модерацию. Чтобы разместить его на Маркете, установите для него цену. * &#x60;IN_WORK&#x60; — товар проходит модерацию. Это занимает несколько дней. * &#x60;NEED_CONTENT&#x60; — для товара без SKU на Маркете &#x60;marketSku&#x60; нужно найти карточку самостоятельно (через API или кабинет продавца на Маркете) или создать ее, если товар еще не продается на Маркете. * &#x60;NEED_INFO&#x60; — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. Информация о причинах отклонения возвращается в параметре &#x60;notes&#x60;. * &#x60;REJECTED&#x60; — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * &#x60;SUSPENDED&#x60; — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. 
 */

#ifndef OAIOfferProcessingStatusType_H
#define OAIOfferProcessingStatusType_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIOfferProcessingStatusType : public OAIEnum {
public:
    OAIOfferProcessingStatusType();
    OAIOfferProcessingStatusType(QString json);
    ~OAIOfferProcessingStatusType() override;

    QString asJson() const override;
    QJsonValue asJsonValue() const override;
    void fromJsonValue(QJsonValue json) override;
    void fromJson(QString jsonString) override;

    enum class eOAIOfferProcessingStatusType {
        INVALID_VALUE_OPENAPI_GENERATED = 0,
        UNKNOWN, 
        READY, 
        IN_WORK, 
        NEED_INFO, 
        NEED_MAPPING, 
        NEED_CONTENT, 
        CONTENT_PROCESSING, 
        SUSPENDED, 
        REJECTED, 
        REVIEW, 
        CREATE_ERROR, 
        UPDATE_ERROR
    };
    OAIOfferProcessingStatusType::eOAIOfferProcessingStatusType getValue() const;
    void setValue(const OAIOfferProcessingStatusType::eOAIOfferProcessingStatusType& value);
    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    eOAIOfferProcessingStatusType m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIOfferProcessingStatusType)

#endif // OAIOfferProcessingStatusType_H
