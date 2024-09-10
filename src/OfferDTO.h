/*
 * OfferDTO.h
 *
 * Предложение.
 */

#ifndef _OfferDTO_H_
#define _OfferDTO_H_


#include <string>
#include "CurrencyType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Предложение.
 *
 *  \ingroup Models
 *
 */

class OfferDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferDTO();
	OfferDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. 
	 */
	long long getPrice();

	/*! \brief Set Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. 
	 */
	void setPrice(long long  price);
	/*! \brief Get Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. 
	 */
	long long getFeedId();

	/*! \brief Set Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. 
	 */
	void setFeedId(long long  feedId);
	/*! \brief Get Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. 
	 */
	std::string getId();

	/*! \brief Set Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. 
	 */
	void setId(std::string  id);
	/*! \brief Get Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. 
	 */
	std::string getShopCategoryId();

	/*! \brief Set Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. 
	 */
	void setShopCategoryId(std::string  shopCategoryId);
	/*! \brief Get Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. 
	 */
	int getMarketCategoryId();

	/*! \brief Set Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. 
	 */
	void setMarketCategoryId(int  marketCategoryId);
	/*! \brief Get Цена предложения без скидки.
	 */
	long long getPreDiscountPrice();

	/*! \brief Set Цена предложения без скидки.
	 */
	void setPreDiscountPrice(long long  preDiscountPrice);
	/*! \brief Get Скидка на предложение в процентах.
	 */
	int getDiscount();

	/*! \brief Set Скидка на предложение в процентах.
	 */
	void setDiscount(int  discount);
	/*! \brief Get Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. 
	 */
	bool getCutPrice();

	/*! \brief Set Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. 
	 */
	void setCutPrice(bool  cutPrice);
	/*! \brief Get URL-адрес предложения на сайте магазина.
	 */
	std::string getUrl();

	/*! \brief Set URL-адрес предложения на сайте магазина.
	 */
	void setUrl(std::string  url);
	/*! \brief Get Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %} 
	 */
	long long getModelId();

	/*! \brief Set Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %} 
	 */
	void setModelId(long long  modelId);
	/*! \brief Get Наименование предложения.
	 */
	std::string getName();

	/*! \brief Set Наименование предложения.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	CurrencyType getCurrency();

	/*! \brief Set 
	 */
	void setCurrency(CurrencyType  currency);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
	 */
	long long getBid();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
	 */
	void setBid(long long  bid);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
	 */
	long long getCbid();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
	 */
	void setCbid(long long  cbid);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. 
	 */
	long long getFee();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. 
	 */
	void setFee(long long  fee);
	/*! \brief Get Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. 
	 */
	bool getBlocked();

	/*! \brief Set Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. 
	 */
	void setBlocked(bool  blocked);

private:
	long long price;
	long long feedId;
	std::string id;
	std::string shopCategoryId;
	int marketCategoryId;
	long long preDiscountPrice;
	int discount;
	bool cutPrice;
	std::string url;
	long long modelId;
	std::string name;
	CurrencyType currency;
	long long bid;
	long long cbid;
	long long fee;
	bool blocked;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferDTO_H_ */
