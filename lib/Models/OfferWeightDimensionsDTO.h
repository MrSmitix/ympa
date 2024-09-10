
/*
 * OfferWeightDimensionsDTO.h
 *
 * Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 
 */

#ifndef TINY_CPP_CLIENT_OfferWeightDimensionsDTO_H_
#define TINY_CPP_CLIENT_OfferWeightDimensionsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 
 *
 *  \ingroup Models
 *
 */

class OfferWeightDimensionsDTO{
public:

    /*! \brief Constructor.
	 */
    OfferWeightDimensionsDTO();
    OfferWeightDimensionsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferWeightDimensionsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Длина упаковки в см. 
	 */
	long getLength();

	/*! \brief Set Длина упаковки в см. 
	 */
	void setLength(long  length);
	/*! \brief Get Ширина упаковки в см. 
	 */
	long getWidth();

	/*! \brief Set Ширина упаковки в см. 
	 */
	void setWidth(long  width);
	/*! \brief Get Высота упаковки в см. 
	 */
	long getHeight();

	/*! \brief Set Высота упаковки в см. 
	 */
	void setHeight(long  height);
	/*! \brief Get Вес товара в кг с учетом упаковки (брутто). 
	 */
	long getWeight();

	/*! \brief Set Вес товара в кг с учетом упаковки (брутто). 
	 */
	void setWeight(long  weight);


    private:
    long length{};
    long width{};
    long height{};
    long weight{};
};
}

#endif /* TINY_CPP_CLIENT_OfferWeightDimensionsDTO_H_ */
