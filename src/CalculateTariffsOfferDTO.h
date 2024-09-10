/*
 * CalculateTariffsOfferDTO.h
 *
 * Параметры товара, для которого нужно рассчитать стоимость услуг.
 */

#ifndef _CalculateTariffsOfferDTO_H_
#define _CalculateTariffsOfferDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Параметры товара, для которого нужно рассчитать стоимость услуг.
 *
 *  \ingroup Models
 *
 */

class CalculateTariffsOfferDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	CalculateTariffsOfferDTO();
	CalculateTariffsOfferDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CalculateTariffsOfferDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
	 */
	long long getCategoryId();

	/*! \brief Set Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
	 */
	void setCategoryId(long long  categoryId);
	/*! \brief Get Цена на товар в рублях.
	 */
	long long getPrice();

	/*! \brief Set Цена на товар в рублях.
	 */
	void setPrice(long long  price);
	/*! \brief Get Длина товара в сантиметрах.
	 */
	long long getLength();

	/*! \brief Set Длина товара в сантиметрах.
	 */
	void setLength(long long  length);
	/*! \brief Get Ширина товара в сантиметрах.
	 */
	long long getWidth();

	/*! \brief Set Ширина товара в сантиметрах.
	 */
	void setWidth(long long  width);
	/*! \brief Get Высота товара в сантиметрах.
	 */
	long long getHeight();

	/*! \brief Set Высота товара в сантиметрах.
	 */
	void setHeight(long long  height);
	/*! \brief Get Вес товара в килограммах.
	 */
	long long getWeight();

	/*! \brief Set Вес товара в килограммах.
	 */
	void setWeight(long long  weight);
	/*! \brief Get Квант продажи — количество единиц товара в одном товарном предложении.
	 */
	int getQuantity();

	/*! \brief Set Квант продажи — количество единиц товара в одном товарном предложении.
	 */
	void setQuantity(int  quantity);

private:
	long long categoryId;
	long long price;
	long long length;
	long long width;
	long long height;
	long long weight;
	int quantity;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CalculateTariffsOfferDTO_H_ */
