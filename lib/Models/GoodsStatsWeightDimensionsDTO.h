
/*
 * GoodsStatsWeightDimensionsDTO.h
 *
 * Информация о весе и габаритах товара.  Если товар уже привязан к карточке (&#x60;marketSku&#x60;), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
 */

#ifndef TINY_CPP_CLIENT_GoodsStatsWeightDimensionsDTO_H_
#define TINY_CPP_CLIENT_GoodsStatsWeightDimensionsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о весе и габаритах товара.  Если товар уже привязан к карточке (`marketSku`), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
 *
 *  \ingroup Models
 *
 */

class GoodsStatsWeightDimensionsDTO{
public:

    /*! \brief Constructor.
	 */
    GoodsStatsWeightDimensionsDTO();
    GoodsStatsWeightDimensionsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GoodsStatsWeightDimensionsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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


    private:
    long length{};
    long width{};
    long height{};
    long weight{};
};
}

#endif /* TINY_CPP_CLIENT_GoodsStatsWeightDimensionsDTO_H_ */
