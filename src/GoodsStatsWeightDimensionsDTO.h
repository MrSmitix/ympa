/*
 * GoodsStatsWeightDimensionsDTO.h
 *
 * Информация о весе и габаритах товара.  Если товар уже привязан к карточке (&#x60;marketSku&#x60;), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
 */

#ifndef _GoodsStatsWeightDimensionsDTO_H_
#define _GoodsStatsWeightDimensionsDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о весе и габаритах товара.  Если товар уже привязан к карточке (`marketSku`), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
 *
 *  \ingroup Models
 *
 */

class GoodsStatsWeightDimensionsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GoodsStatsWeightDimensionsDTO();
	GoodsStatsWeightDimensionsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GoodsStatsWeightDimensionsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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

private:
	long long length;
	long long width;
	long long height;
	long long weight;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GoodsStatsWeightDimensionsDTO_H_ */
