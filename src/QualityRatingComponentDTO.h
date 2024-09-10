/*
 * QualityRatingComponentDTO.h
 *
 * Составляющая индекса качества.
 */

#ifndef _QualityRatingComponentDTO_H_
#define _QualityRatingComponentDTO_H_


#include <string>
#include "QualityRatingComponentType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Составляющая индекса качества.
 *
 *  \ingroup Models
 *
 */

class QualityRatingComponentDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	QualityRatingComponentDTO();
	QualityRatingComponentDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~QualityRatingComponentDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	double value;
	QualityRatingComponentType componentType;
	void __init();
	void __cleanup();

};
}
}

#endif /* _QualityRatingComponentDTO_H_ */
