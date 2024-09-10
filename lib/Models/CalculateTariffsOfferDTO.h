
/*
 * CalculateTariffsOfferDTO.h
 *
 * Параметры товара, для которого нужно рассчитать стоимость услуг.
 */

#ifndef TINY_CPP_CLIENT_CalculateTariffsOfferDTO_H_
#define TINY_CPP_CLIENT_CalculateTariffsOfferDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Параметры товара, для которого нужно рассчитать стоимость услуг.
 *
 *  \ingroup Models
 *
 */

class CalculateTariffsOfferDTO{
public:

    /*! \brief Constructor.
	 */
    CalculateTariffsOfferDTO();
    CalculateTariffsOfferDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CalculateTariffsOfferDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
	 */
	long getCategoryId();

	/*! \brief Set Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
	 */
	void setCategoryId(long  categoryId);
	/*! \brief Get Цена на товар в рублях.
	 */
	long getPrice();

	/*! \brief Set Цена на товар в рублях.
	 */
	void setPrice(long  price);
	/*! \brief Get Длина товара в сантиметрах.
	 */
	long getLength();

	/*! \brief Set Длина товара в сантиметрах.
	 */
	void setLength(long  length);
	/*! \brief Get Ширина товара в сантиметрах.
	 */
	long getWidth();

	/*! \brief Set Ширина товара в сантиметрах.
	 */
	void setWidth(long  width);
	/*! \brief Get Высота товара в сантиметрах.
	 */
	long getHeight();

	/*! \brief Set Высота товара в сантиметрах.
	 */
	void setHeight(long  height);
	/*! \brief Get Вес товара в килограммах.
	 */
	long getWeight();

	/*! \brief Set Вес товара в килограммах.
	 */
	void setWeight(long  weight);
	/*! \brief Get Квант продажи — количество единиц товара в одном товарном предложении.
	 */
	int getQuantity();

	/*! \brief Set Квант продажи — количество единиц товара в одном товарном предложении.
	 */
	void setQuantity(int  quantity);


    private:
    long categoryId{};
    long price{};
    long length{};
    long width{};
    long height{};
    long weight{};
    int quantity{};
};
}

#endif /* TINY_CPP_CLIENT_CalculateTariffsOfferDTO_H_ */
