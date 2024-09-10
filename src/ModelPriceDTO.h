/*
 * ModelPriceDTO.h
 *
 * Информация о ценах на модель товара.
 */

#ifndef _ModelPriceDTO_H_
#define _ModelPriceDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о ценах на модель товара.
 *
 *  \ingroup Models
 *
 */

class ModelPriceDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ModelPriceDTO();
	ModelPriceDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ModelPriceDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Средняя цена предложения для модели в регионе.
	 */
	long long getAvg();

	/*! \brief Set Средняя цена предложения для модели в регионе.
	 */
	void setAvg(long long  avg);
	/*! \brief Get Максимальная цена предложения для модели в регионе.
	 */
	long long getMax();

	/*! \brief Set Максимальная цена предложения для модели в регионе.
	 */
	void setMax(long long  max);
	/*! \brief Get Минимальная цена предложения для модели в регионе.
	 */
	long long getMin();

	/*! \brief Set Минимальная цена предложения для модели в регионе.
	 */
	void setMin(long long  min);

private:
	long long avg;
	long long max;
	long long min;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ModelPriceDTO_H_ */
