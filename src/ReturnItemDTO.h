/*
 * ReturnItemDTO.h
 *
 * Список товаров в возврате.
 */

#ifndef _ReturnItemDTO_H_
#define _ReturnItemDTO_H_


#include <string>
#include "ReturnDecisionDTO.h"
#include "ReturnInstanceDTO.h"
#include "TrackDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список товаров в возврате.
 *
 *  \ingroup Models
 *
 */

class ReturnItemDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ReturnItemDTO();
	ReturnItemDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ReturnItemDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get SKU на Маркете.
	 */
	long long getMarketSku();

	/*! \brief Set SKU на Маркете.
	 */
	void setMarketSku(long long  marketSku);
	/*! \brief Get Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	std::string getShopSku();

	/*! \brief Set Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	void setShopSku(std::string  shopSku);
	/*! \brief Get Количество единиц товара.
	 */
	long long getCount();

	/*! \brief Set Количество единиц товара.
	 */
	void setCount(long long  count);
	/*! \brief Get Список решений по возврату.
	 */
	std::list<ReturnDecisionDTO> getDecisions();

	/*! \brief Set Список решений по возврату.
	 */
	void setDecisions(std::list <ReturnDecisionDTO> decisions);
	/*! \brief Get Список логистических позиций возврата.
	 */
	std::list<ReturnInstanceDTO> getInstances();

	/*! \brief Set Список логистических позиций возврата.
	 */
	void setInstances(std::list <ReturnInstanceDTO> instances);
	/*! \brief Get Список трек-кодов для почтовых отправлений.
	 */
	std::list<TrackDTO> getTracks();

	/*! \brief Set Список трек-кодов для почтовых отправлений.
	 */
	void setTracks(std::list <TrackDTO> tracks);

private:
	long long marketSku;
	std::string shopSku;
	long long count;
	std::list <ReturnDecisionDTO>decisions;
	std::list <ReturnInstanceDTO>instances;
	std::list <TrackDTO>tracks;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ReturnItemDTO_H_ */
