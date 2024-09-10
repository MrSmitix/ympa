
/*
 * QualityRatingComponentDTO.h
 *
 * Составляющая индекса качества.
 */

#ifndef TINY_CPP_CLIENT_QualityRatingComponentDTO_H_
#define TINY_CPP_CLIENT_QualityRatingComponentDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "QualityRatingComponentType.h"

namespace Tiny {


/*! \brief Составляющая индекса качества.
 *
 *  \ingroup Models
 *
 */

class QualityRatingComponentDTO{
public:

    /*! \brief Constructor.
	 */
    QualityRatingComponentDTO();
    QualityRatingComponentDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~QualityRatingComponentDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Значение составляющей в процентах.
	 */
	double getValue();

	/*! \brief Set Значение составляющей в процентах.
	 */
	void setValue(double  value);
	/*! \brief Get 
	 */
	QualityRatingComponentType getComponentType();

	/*! \brief Set 
	 */
	void setComponentType(QualityRatingComponentType  componentType);


    private:
    double value{};
    QualityRatingComponentType componentType;
};
}

#endif /* TINY_CPP_CLIENT_QualityRatingComponentDTO_H_ */
