/*
 * OfferWeightDimensionsDTO.h
 *
 * Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 
 */

#ifndef _OfferWeightDimensionsDTO_H_
#define _OfferWeightDimensionsDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 
 *
 *  \ingroup Models
 *
 */

class OfferWeightDimensionsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferWeightDimensionsDTO();
	OfferWeightDimensionsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferWeightDimensionsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Длина упаковки в см. 
	 */
	long long getLength();

	/*! \brief Set Длина упаковки в см. 
	 */
	void setLength(long long  length);
	/*! \brief Get Ширина упаковки в см. 
	 */
	long long getWidth();

	/*! \brief Set Ширина упаковки в см. 
	 */
	void setWidth(long long  width);
	/*! \brief Get Высота упаковки в см. 
	 */
	long long getHeight();

	/*! \brief Set Высота упаковки в см. 
	 */
	void setHeight(long long  height);
	/*! \brief Get Вес товара в кг с учетом упаковки (брутто). 
	 */
	long long getWeight();

	/*! \brief Set Вес товара в кг с учетом упаковки (брутто). 
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

#endif /* _OfferWeightDimensionsDTO_H_ */
