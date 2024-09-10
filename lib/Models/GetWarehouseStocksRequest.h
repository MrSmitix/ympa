
/*
 * GetWarehouseStocksRequest.h
 *
 * Фильтры для запроса остатков. 
 */

#ifndef TINY_CPP_CLIENT_GetWarehouseStocksRequest_H_
#define TINY_CPP_CLIENT_GetWarehouseStocksRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Set.h"

namespace Tiny {


/*! \brief Фильтры для запроса остатков. 
 *
 *  \ingroup Models
 *
 */

class GetWarehouseStocksRequest{
public:

    /*! \brief Constructor.
	 */
    GetWarehouseStocksRequest();
    GetWarehouseStocksRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetWarehouseStocksRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`. 
	 */
	bool isWithTurnover();

	/*! \brief Set **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`. 
	 */
	void setWithTurnover(bool  withTurnover);
	/*! \brief Get Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращается информация о товарах, которые не находятся в архиве. 
	 */
	bool isArchived();

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
    bool withTurnover{};
    bool archived{};
    Set<std::string> offerIds;
};
}

#endif /* TINY_CPP_CLIENT_GetWarehouseStocksRequest_H_ */
