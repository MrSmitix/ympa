/*
 * GetWarehouseStocksRequest.h
 *
 * Фильтры для запроса остатков. 
 */

#ifndef _GetWarehouseStocksRequest_H_
#define _GetWarehouseStocksRequest_H_


#include <string>
#include "Set.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Фильтры для запроса остатков. 
 *
 *  \ingroup Models
 *
 */

class GetWarehouseStocksRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GetWarehouseStocksRequest();
	GetWarehouseStocksRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetWarehouseStocksRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`. 
	 */
	bool getWithTurnover();

	/*! \brief Set **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`. 
	 */
	void setWithTurnover(bool  withTurnover);
	/*! \brief Get Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращается информация о товарах, которые не находятся в архиве. 
	 */
	bool getArchived();

	/*! \brief Set Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращается информация о товарах, которые не находятся в архиве. 
	 */
	void setArchived(bool  archived);
	/*! \brief Get Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit` * `archived`  {% endnote %}    
	 */
	Set<std::string> getOfferIds();

	/*! \brief Set Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit` * `archived`  {% endnote %}    
	 */
	void setOfferIds(Set <std::string> offerIds);

private:
	bool withTurnover;
	bool archived;
	Set <std::string>offerIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetWarehouseStocksRequest_H_ */
