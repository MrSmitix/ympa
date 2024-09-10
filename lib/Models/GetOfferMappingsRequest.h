
/*
 * GetOfferMappingsRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetOfferMappingsRequest_H_
#define TINY_CPP_CLIENT_GetOfferMappingsRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OfferCardStatusType.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetOfferMappingsRequest{
public:

    /*! \brief Constructor.
	 */
    GetOfferMappingsRequest();
    GetOfferMappingsRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetOfferMappingsRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    
	 */
	std::list<std::string> getOfferIds();

	/*! \brief Set Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    
	 */
	void setOfferIds(std::list <std::string> offerIds);
	/*! \brief Get Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
	 */
	std::list<OfferCardStatusType> getCardStatuses();

	/*! \brief Set Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
	 */
	void setCardStatuses(std::list <OfferCardStatusType> cardStatuses);
	/*! \brief Get Фильтр по категориям на Маркете.
	 */
	std::list<int> getCategoryIds();

	/*! \brief Set Фильтр по категориям на Маркете.
	 */
	void setCategoryIds(std::list <int> categoryIds);
	/*! \brief Get Фильтр по брендам.
	 */
	std::list<std::string> getVendorNames();

	/*! \brief Set Фильтр по брендам.
	 */
	void setVendorNames(std::list <std::string> vendorNames);
	/*! \brief Get Фильтр по тегам.
	 */
	std::list<std::string> getTags();

	/*! \brief Set Фильтр по тегам.
	 */
	void setTags(std::list <std::string> tags);
	/*! \brief Get Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. 
	 */
	bool isArchived();

	/*! \brief Set Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. 
	 */
	void setArchived(bool  archived);


    private:
    std::list<std::string> offerIds;
    std::list<OfferCardStatusType> cardStatuses;
    std::list<int> categoryIds;
    std::list<std::string> vendorNames;
    std::list<std::string> tags;
    bool archived{};
};
}

#endif /* TINY_CPP_CLIENT_GetOfferMappingsRequest_H_ */
