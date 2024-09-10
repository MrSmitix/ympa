/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * FeedPublicationPriceAndStockUpdateDTO.h
 *
 * Последнее обновление цен и наличия товаров на Маркете. Если последнее по времени обновление было полным, в параметре выводятся те же данные, что и в параметре &#x60;full&#x60;. Выводится, если параметр &#x60;publication status&#x3D;OK&#x60;. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_FeedPublicationPriceAndStockUpdateDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_FeedPublicationPriceAndStockUpdateDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Последнее обновление цен и наличия товаров на Маркете. Если последнее по времени обновление было полным, в параметре выводятся те же данные, что и в параметре &#x60;full&#x60;. Выводится, если параметр &#x60;publication status&#x3D;OK&#x60;. 
/// </summary>
class  FeedPublicationPriceAndStockUpdateDTO
    : public ModelBase
{
public:
    FeedPublicationPriceAndStockUpdateDTO();
    virtual ~FeedPublicationPriceAndStockUpdateDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// FeedPublicationPriceAndStockUpdateDTO members

    /// <summary>
    /// Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
    /// </summary>
    utility::datetime getFileTime() const;
    bool fileTimeIsSet() const;
    void unsetFileTime();

    void setFileTime(const utility::datetime& value);

    /// <summary>
    /// Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
    /// </summary>
    utility::datetime getPublishedTime() const;
    bool publishedTimeIsSet() const;
    void unsetPublishedTime();

    void setPublishedTime(const utility::datetime& value);


protected:
    utility::datetime m_FileTime;
    bool m_FileTimeIsSet;
    utility::datetime m_PublishedTime;
    bool m_PublishedTimeIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_FeedPublicationPriceAndStockUpdateDTO_H_ */
